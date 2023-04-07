/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.Network;
import fr.imta.semafor.fogAdlModel.NetworkLinkType;
import fr.imta.semafor.fogAdlModel.NetworkType;

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
 * An implementation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl#getDownloadlinks <em>Downloadlinks</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl#getUploadLink <em>Upload Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkTypeImpl extends FogResourceImpl implements NetworkType {
	/**
	 * The cached value of the '{@link #getDownloadlinks() <em>Downloadlinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLinkType> downloadlinks;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> instances;

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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NETWORK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogsystem() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM)
			return null;
		return (FogSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogsystem(FogSystem newFogsystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFogsystem, FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogsystem(FogSystem newFogsystem) {
		if (newFogsystem != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM && newFogsystem != null)) {
			if (EcoreUtil.isAncestor(this, newFogsystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFogsystem != null)
				msgs = ((InternalEObject) newFogsystem).eInverseAdd(this, FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES,
						FogSystem.class, msgs);
			msgs = basicSetFogsystem(newFogsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM,
					newFogsystem, newFogsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLinkType> getDownloadlinks() {
		if (downloadlinks == null) {
			downloadlinks = new EObjectContainmentWithInverseEList<NetworkLinkType>(NetworkLinkType.class, this,
					FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS,
					FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK);
		}
		return downloadlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<Network>(Network.class, this,
					FogAdlModelPackage.NETWORK_TYPE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLinkType> getUploadLink() {
		if (uploadLink == null) {
			uploadLink = new EObjectContainmentWithInverseEList<NetworkLinkType>(NetworkLinkType.class, this,
					FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK,
					FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS);
		}
		return uploadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.NETWORK_TYPE__CONSTRAINTS);
		}
		return constraints;
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFogsystem((FogSystem) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDownloadlinks()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK:
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			return basicSetFogsystem(null, msgs);
		case FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS:
			return ((InternalEList<?>) getDownloadlinks()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK:
			return ((InternalEList<?>) getUploadLink()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_TYPE__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES,
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			return getFogsystem();
		case FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS:
			return getDownloadlinks();
		case FogAdlModelPackage.NETWORK_TYPE__INSTANCES:
			return getInstances();
		case FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK:
			return getUploadLink();
		case FogAdlModelPackage.NETWORK_TYPE__CONSTRAINTS:
			return getConstraints();
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			setFogsystem((FogSystem) newValue);
			return;
		case FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS:
			getDownloadlinks().clear();
			getDownloadlinks().addAll((Collection<? extends NetworkLinkType>) newValue);
			return;
		case FogAdlModelPackage.NETWORK_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Network>) newValue);
			return;
		case FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK:
			getUploadLink().clear();
			getUploadLink().addAll((Collection<? extends NetworkLinkType>) newValue);
			return;
		case FogAdlModelPackage.NETWORK_TYPE__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends Constraint>) newValue);
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			setFogsystem((FogSystem) null);
			return;
		case FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS:
			getDownloadlinks().clear();
			return;
		case FogAdlModelPackage.NETWORK_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK:
			getUploadLink().clear();
			return;
		case FogAdlModelPackage.NETWORK_TYPE__CONSTRAINTS:
			getConstraints().clear();
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
		case FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM:
			return getFogsystem() != null;
		case FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS:
			return downloadlinks != null && !downloadlinks.isEmpty();
		case FogAdlModelPackage.NETWORK_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK:
			return uploadLink != null && !uploadLink.isEmpty();
		case FogAdlModelPackage.NETWORK_TYPE__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkTypeImpl
