package fr.imta.semafor.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.Openable;
import org.eclipse.jdt.internal.core.PackageFragmentRoot;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
//import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.semafor.fogAdlModel.FogResource;
import fr.imta.semafor.fogAdlModel.*;

public class InspectionHandler extends AbstractHandler implements IHandler {

	@Inject
	private IGenerator generator;

	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IResource file = getIResource(event);
		IFolder srcFolder = getSourceFolder(file);
		ResourceSet rs = createResourceSet(srcFolder);

		// Some queries

//        printAllFogResources(rs);
//        
//        printVNodeTypeTags(rs);               
//        
//        printSecurityTags(rs);
//        
		System.out.println("The virtualNode specifications and their tags in the current Fog system are :");
		for (VirtualNodeSpecification e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				VirtualNodeSpecification.class)) {

			System.out.print(e.getName() + ": ");

			for (Tag t : e.getTags()) {
				System.out.print(t.getKey() + ": " + t.getValue() + ", ");
			}
			System.out.println();
			//

			// security
			getriskscore(e.getName(), rs);
			getResourceSecurityTags(e);
		}

		for (FogResource e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				FogResource.class)) {
			getResourceSecurityTags(e);
		}
		// energy

		Boolean v;
		v = isGreen(rs);
		System.out.println("Is my system green? " + v);

		// security

		Boolean vv;
		for (Network L : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()), Network.class)) {
			vv = isSecured(L);
			System.out.println("Is " + L.getName() + " secured?" + vv);
		}
		// energy
		for (FogResource e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				FogResource.class)) {

			SourceType(e, rs);

		}
		// parking
		System.out.println("The reliability of the system is " + Reliability(rs) + " %");
		System.out.println("The latency of the system is " + Latency(rs) + " s");
		//
		for (Attribute att : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				Attribute.class)) {

			System.out.println("from attribute loop " + att.getInstanceOf().getName());
		}
		int diff = 0, s = 0, sum = 0;

		for (Attribute att : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				Attribute.class)) {

			System.out.println("the " + att.getInstanceOf().getName() + " of the node " + att.getFogresource().getName()
					+ " is: " + att.getValue());
			if (att.getInstanceOf().getName().contains("energy_consumption"))
				sum += Integer.parseInt(att.getValue());

			if (att.getInstanceOf().getName().contains("green_consumption"))
				s += Integer.parseInt(att.getValue());

		}
		diff = 2000 - sum;
		if (diff > 0)
			System.out.println(
					"the total energy consumption is " + sum + "you still have " + diff + " to attend the threshold");
		else
			System.out.println(
					"the total energy consumption is " + sum + " ! you are proceeding the threshold by " + diff);
		// conf
		System.out.println("the total green energy consumption is " + s);
		// security timeleft
		System.out.println("The next available node is " + AvailableNode(rs));

		return null;
	}

	private void printSecurityTags(ResourceSet rs) {
		for (FogResource e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				FogResource.class)) {
			getResourceSecurityTags(e);
		}
	}

	private void printVNodeTypeTags(ResourceSet rs) {
		System.out.println("The virtualNode specifications and their tags in the current Fog system are :");
		for (VirtualNodeSpecification e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				VirtualNodeSpecification.class)) {
			System.out.print(e.getName() + ": ");
			for (Tag t : e.getTags()) {
				System.out.print(t.getKey() + ": " + t.getValue() + ", ");
			}
			System.out.println();
		}
	}

	private void printAllFogResources(ResourceSet rs) {
		System.out.println("The Fog resources in the current Fog system are :");
		for (FogResource e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				FogResource.class)) {
			System.out.println(e.getName());
		}
	}

	private void printConsideredFileURIs(ResourceSet rs) {
		for (Resource r : rs.getResources()) {
			System.out.println(r.getURI().toString());
		}
	}

	ResourceSet createResourceSet(IFolder srcFolder) {
		ResourceSet rs = new ResourceSetImpl();
		for (IResource f : allFilesOf(srcFolder)) {
			URI uri = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
			rs.getResource(uri, true);
		}
		printConsideredFileURIs(rs);
		return rs;
	}

	IFolder getSourceFolder(IResource file) {
		IProject project = file.getProject();
		IFolder srcFolder = project.getFolder("src");
		return srcFolder;
	}

	IResource getIResource(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		Object firstElement = structuredSelection.getFirstElement();
		IResource file = null;
		Openable folder = null;
		if (firstElement instanceof IResource) {
			file = (IResource) firstElement;
		} else {
			if (firstElement instanceof org.eclipse.jdt.internal.core.PackageFragmentRoot) {
				folder = (org.eclipse.jdt.internal.core.PackageFragmentRoot) firstElement;
			}
			if (firstElement instanceof org.eclipse.jdt.internal.core.PackageFragment) {
				folder = (org.eclipse.jdt.internal.core.PackageFragment) firstElement;
			}
			try {
				if (folder == null)
					return null;
				file = folder.getCorrespondingResource();
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return file;
	}

	private void getResourceSecurityTags(FogResource fResource) {
		for (Tag t : fResource.getTags()) {
			String nom = fResource.getName();

			if (t.getKey() == "securityLocation") {
				System.out.println("The node " + nom + "is in" + t.getValue() + "security area");
			}
		}
	}

	private ArrayList<IResource> allFilesOf(IResource srcFolder) {
		ArrayList<IResource> result = new ArrayList<IResource>();

		try {
			if (srcFolder instanceof IContainer) {
				for (IResource r : ((IContainer) srcFolder).members()) {
					if (r instanceof IFile) {
						result.add(r);
					} else {
						result.addAll((Collection<? extends IResource>) allFilesOf(r));
					}
				}
			} else {
				result.add(srcFolder);
			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	// security
	private void getriskscore(String Node, ResourceSet rs) {
		double riskscore = 55;
		double impact = 1;
		for (FogResource fR : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				FogResource.class)) {

			if (fR.getName() == Node) {
				for (Tag t : fR.getTags()) {
					// System.out.println(t.getKey() +" "+ t.getValue());
					if (t.getKey().contains("impact")) {
						// if(t.getValue()=="A")
						// System.out.println("impact=100" );
						switch (t.getValue()) {
						case "A":
							impact = 100;
							break;
						case "B":
							impact = 50;
							break;
						case "C":
							impact = 20;
							break;

						}

						double proba = getproba(Node, rs);
						riskscore = impact * proba;

						Node = fR.getName();

					}

				}
				System.out.println("The risk score of " + Node + " is : " + riskscore);
			}
		}

	}

	private double getproba(String fName, ResourceSet rs) {

		double proba = 0;

		for (FogResource e : IterableExtensions.filter(IteratorExtensions.toIterable(rs.getAllContents()),
				FogResource.class)) {
			if (e.getName() == fName) {
				for (Tag t : e.getTags()) {
					if (t.getKey().contains("securityLocation")) {

						switch (t.getValue()) {
						case "veryHigh":
							proba = 0;
							break;
						case "High":
							proba = 0.25;
							break;
						case "moderate":
							proba = 0.5;
							break;
						case "low":
							proba = 0.75;
							break;
						case "verylow":
							proba = 1;
							break;

						}
						// System.out.println(proba);
					}

				}
			}

		}

		return proba;
	}

	public boolean isSecured(Network L) {
		boolean bool = false;
		for (NetworkLink lt : L.getUploadlinks())
			for (Tag t : lt.getTags()) {
				if (t.getKey() == "encryption" && t.getValue() == "obligated") {
					bool = true;
				} else {
					bool = false;

				}
			}
		{

		}
		return bool;

	}

	public String AvailableNode(ResourceSet s) {
		String avn = null;

		HashMap<String, String> EnTime = new HashMap<String, String>();

		for (Attribute att : IterableExtensions.filter(IteratorExtensions.toIterable(s.getAllContents()),
				Attribute.class)) {

			if (att.getInstanceOf().getName().contains("timeleft"))
				EnTime.put(att.getFogresource().getName(), att.getValue());
		}
		String min = Collections.min(EnTime.values());
		for (Entry<String, String> entry : EnTime.entrySet()) {

			// if give value is equal to value from entry
			// print the corresponding key
			if (entry.getValue() == min) {
				System.out.println("The timeleft is " + min + " for " + entry.getKey());
				avn = entry.getKey();
				break;
			}
		}

		return avn;
	}

	// energy
	public boolean isGreen(ResourceSet rset) {
		int green = 0;
		for (FogResource e : IterableExtensions.filter(IteratorExtensions.toIterable(rset.getAllContents()),
				FogResource.class)) {
			for (Tag tg : e.getTags()) {
				if (tg.getKey().contains("greenEnergy")) {
					switch (tg.getValue()) {
					case "null":
						if (green != 0) {
							green = green - 1;
						}

						break;

					case "low":
						if (green != 0) {
							green = green - 1;
						}
						break;

					case "High":
						green = green + 1;
						break;

					case "veryHigh":
						green = green + 1;
						break;

					case "moderate":
						green = green + 1;
						break;
					}
				}
			}
		}

		if (green <= 5)
			return false;
		else
			return true;
	}

	public void SourceType(FogResource e, ResourceSet set) {
		String s;
		for (FogResource fn : IterableExtensions.filter(IteratorExtensions.toIterable(set.getAllContents()),
				FogResource.class)) {
			if (fn.getName() == e.getName()) {
				for (Tag tag : fn.getTags()) {
					if (tag.getKey().contains("SourceEnergy")) {
						s = tag.getValue();
						System.out.println("The source energy type of the node " + e.getName() + " is " + s);
					}
				}
			}
		}

	}

	// parking
	public float getreliable(FogResource e, ResourceSet s) {
		float reliable = 0;
		for (FogResource fn : IterableExtensions.filter(IteratorExtensions.toIterable(s.getAllContents()),
				FogResource.class)) {
			if (fn.getName() == e.getName()) {
				for (Tag tag : fn.getTags()) {
					if (tag.getKey().contains("detection_quality")) {
						switch (tag.getValue()) {
						case "veryhigh":
							reliable = 98;
							break;
						case "high":
							reliable = 70;
							break;

						case "moderate":
							reliable = 50;
							break;
						case "low":
							reliable = 30;
							break;
						case "verylow":
							reliable = 10;
							break;
						}
					}
				}
			}

		}
		return reliable;
	}

	public float Reliability(ResourceSet st) {
		float re = 0;
		float sum = 0;

		for (FogResource fn : IterableExtensions.filter(IteratorExtensions.toIterable(st.getAllContents()),
				FogResource.class)) {

			sum += getreliable(fn, st);

		}
		re = sum / 7;

		return re;
	}

	// 0.702
	public double enhancementT(ResourceSet st) {
		double enhanceT = 0.0f;
		double t = 0;
		HashMap<String, Double> EnTime = new HashMap<String, Double>();
		for (FogResource fn : IterableExtensions.filter(IteratorExtensions.toIterable(st.getAllContents()),
				FogResource.class)) {
			for (Tag tag : fn.getTags()) {
				if (tag.getKey().contains("detection_quality")) {
					switch (tag.getValue()) {
					case "veryhigh":
						EnTime.put(fn.getName(), (double) 0);

						break;
					case "high":
						EnTime.put(fn.getName(), (double) 0);
						break;

					case "moderate":
						EnTime.put(fn.getName(), (double) 0);
						break;
					case "low":
						EnTime.put(fn.getName(), 0.702);

						break;
					case "verylow":
						EnTime.put(fn.getName(), 0.702);
						break;
					}
				}
			}

			for (double f : EnTime.values()) {
				enhanceT += f;
			}

		}
		return enhanceT;
	}

	public double Latency(ResourceSet st) {
		double latency = 0;
		double T, d;

		T = enhancementT(st);
		d = 0.00787;
		latency = T + d;

		return latency;
	}

}