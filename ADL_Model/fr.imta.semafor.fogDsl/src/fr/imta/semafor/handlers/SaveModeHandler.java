package fr.imta.semafor.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

public class SaveModeHandler extends AbstractHandler implements IHandler {

	public void save() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("myModel", new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();


	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		InspectionHandler inspect = new InspectionHandler();
        IResource file = inspect.getIResource(event);
        IFolder srcFolder = inspect.getSourceFolder(file);
        ResourceSet rs = inspect.createResourceSet(srcFolder);
        Resource resource = rs.createResource(URI
                .createURI("myModel.fog"));
        System.out.println("adding to model");
        for(Resource r: rs.getResources()) {       	
        	try
        		{resource.getContents().addAll(r.getContents());
        		}
        	catch (Exception e) {
        		System.out.println("unrecognized " + r.getURI());
        		continue;
        	}	
        }
        System.out.println("elements added to model. See By yourself : ");
        for(EObject elem : resource.getContents())
        	System.out.println(elem.toString());
        
        System.out.println("saving the model");
        String filePath = new File("").getAbsolutePath();
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("model has been saved to " + filePath + "/myModel.fog");

        return null;
	}
}
