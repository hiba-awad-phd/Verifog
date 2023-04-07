/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.NetworkLinkType;
import fr.imta.semafor.fogAdlModel.Node;
import fr.imta.semafor.fogAdlModel.NodeType;

import fr.imta.semafor.fogAdlModel.VirtualNodeSpecification;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl#getDownloadLink <em>Download Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl#getUploadLink <em>Upload Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl#getHostedNode <em>Hosted Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends FogResourceImpl implements NodeType {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> instances;

	/**
	 * The cached value of the '{@link #getDownloadLink() <em>Download Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLink()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLinkType> downloadLink;

	/**
	 * The cached value of the '{@link #getUploadLink() <em>Upload Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadLink()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLinkType> uploadLink;

	/**
	 * The cached value of the '{@link #getHostedNode() <em>Hosted Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualNodeSpecification> hostedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogsystem() {
		if (eContainerFeatureID() != FogAdlModelPackage.NODE_TYPE__FOGSYSTEM)
			return null;
		return (FogSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogsystem(FogSystem newFogsystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFogsystem, FogAdlModelPackage.NODE_TYPE__FOGSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogsystem(FogSystem newFogsystem) {
		if (newFogsystem != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NODE_TYPE__FOGSYSTEM && newFogsystem != null)) {
			if (EcoreUtil.isAncestor(this, newFogsystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFogsystem != null)
				msgs = ((InternalEObject) newFogsystem).eInverseAdd(this,
						FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION, FogSystem.class, msgs);
			msgs = basicSetFogsystem(newFogsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE_TYPE__FOGSYSTEM, newFogsystem,
					newFogsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.NODE_TYPE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<Node>(Node.class, this, FogAdlModelPackage.NODE_TYPE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLinkType> getDownloadLink() {
		if (downloadLink == null) {
			downloadLink = new EObjectContainmentWithInverseEList<NetworkLinkType>(NetworkLinkType.class, this,
					FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK, FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE);
		}
		return downloadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLinkType> getUploadLink() {
		if (uploadLink == null) {
			uploadLink = new EObjectContainmentWithInverseEList<NetworkLinkType>(NetworkLinkType.class, this,
					FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK, FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE);
		}
		return uploadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualNodeSpecification> getHostedNode() {
		if (hostedNode == null) {
			hostedNode = new EObjectContainmentEList<VirtualNodeSpecification>(VirtualNodeSpecification.class, this,
					FogAdlModelPackage.NODE_TYPE__HOSTED_NODE);
		}
		return hostedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFogsystem((FogSystem) otherEnd, msgs);
		case FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDownloadLink()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUploadLink()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			return basicSetFogsystem(null, msgs);
		case FogAdlModelPackage.NODE_TYPE__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK:
			return ((InternalEList<?>) getDownloadLink()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK:
			return ((InternalEList<?>) getUploadLink()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NODE_TYPE__HOSTED_NODE:
			return ((InternalEList<?>) getHostedNode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION,
					FogSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			return getFogsystem();
		case FogAdlModelPackage.NODE_TYPE__CONSTRAINTS:
			return getConstraints();
		case FogAdlModelPackage.NODE_TYPE__INSTANCES:
			return getInstances();
		case FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK:
			return getDownloadLink();
		case FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK:
			return getUploadLink();
		case FogAdlModelPackage.NODE_TYPE__HOSTED_NODE:
			return getHostedNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			setFogsystem((FogSystem) newValue);
			return;
		case FogAdlModelPackage.NODE_TYPE__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends Constraint>) newValue);
			return;
		case FogAdlModelPackage.NODE_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Node>) newValue);
			return;
		case FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK:
			getDownloadLink().clear();
			getDownloadLink().addAll((Collection<? extends NetworkLinkType>) newValue);
			return;
		case FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK:
			getUploadLink().clear();
			getUploadLink().addAll((Collection<? extends NetworkLinkType>) newValue);
			return;
		case FogAdlModelPackage.NODE_TYPE__HOSTED_NODE:
			getHostedNode().clear();
			getHostedNode().addAll((Collection<? extends VirtualNodeSpecification>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			setFogsystem((FogSystem) null);
			return;
		case FogAdlModelPackage.NODE_TYPE__CONSTRAINTS:
			getConstraints().clear();
			return;
		case FogAdlModelPackage.NODE_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK:
			getDownloadLink().clear();
			return;
		case FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK:
			getUploadLink().clear();
			return;
		case FogAdlModelPackage.NODE_TYPE__HOSTED_NODE:
			getHostedNode().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FogAdlModelPackage.NODE_TYPE__FOGSYSTEM:
			return getFogsystem() != null;
		case FogAdlModelPackage.NODE_TYPE__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case FogAdlModelPackage.NODE_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK:
			return downloadLink != null && !downloadLink.isEmpty();
		case FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK:
			return uploadLink != null && !uploadLink.isEmpty();
		case FogAdlModelPackage.NODE_TYPE__HOSTED_NODE:
			return hostedNode != null && !hostedNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeTypeImpl
