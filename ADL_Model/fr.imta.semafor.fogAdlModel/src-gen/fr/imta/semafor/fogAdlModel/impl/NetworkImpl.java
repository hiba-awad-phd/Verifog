/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.Network;
import fr.imta.semafor.fogAdlModel.NetworkLink;
import fr.imta.semafor.fogAdlModel.NetworkType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkImpl#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkImpl#getDownloadLinks <em>Download Links</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkImpl#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkImpl#getUploadlinks <em>Uploadlinks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends FogResourceImpl implements Network {
	/**
	 * The cached value of the '{@link #getDownloadLinks() <em>Download Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLink> downloadLinks;

	/**
	 * The cached value of the '{@link #getIsInstanceOf() <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected NetworkType isInstanceOf;

	/**
	 * The cached value of the '{@link #getUploadlinks() <em>Uploadlinks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLink> uploadlinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogsystem() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK__FOGSYSTEM)
			return null;
		return (FogSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogsystem(FogSystem newFogsystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFogsystem, FogAdlModelPackage.NETWORK__FOGSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogsystem(FogSystem newFogsystem) {
		if (newFogsystem != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK__FOGSYSTEM && newFogsystem != null)) {
			if (EcoreUtil.isAncestor(this, newFogsystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFogsystem != null)
				msgs = ((InternalEObject) newFogsystem).eInverseAdd(this, FogAdlModelPackage.FOG_SYSTEM__NETWORKS,
						FogSystem.class, msgs);
			msgs = basicSetFogsystem(newFogsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK__FOGSYSTEM, newFogsystem,
					newFogsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLink> getDownloadLinks() {
		if (downloadLinks == null) {
			downloadLinks = new EObjectWithInverseResolvingEList<NetworkLink>(NetworkLink.class, this,
					FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS, FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK);
		}
		return downloadLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType getIsInstanceOf() {
		if (isInstanceOf != null && isInstanceOf.eIsProxy()) {
			InternalEObject oldIsInstanceOf = (InternalEObject) isInstanceOf;
			isInstanceOf = (NetworkType) eResolveProxy(oldIsInstanceOf);
			if (isInstanceOf != oldIsInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FogAdlModelPackage.NETWORK__IS_INSTANCE_OF, oldIsInstanceOf, isInstanceOf));
			}
		}
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType basicGetIsInstanceOf() {
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInstanceOf(NetworkType newIsInstanceOf) {
		NetworkType oldIsInstanceOf = isInstanceOf;
		isInstanceOf = newIsInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK__IS_INSTANCE_OF,
					oldIsInstanceOf, isInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLink> getUploadlinks() {
		if (uploadlinks == null) {
			uploadlinks = new EObjectWithInverseResolvingEList.ManyInverse<NetworkLink>(NetworkLink.class, this,
					FogAdlModelPackage.NETWORK__UPLOADLINKS, FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS);
		}
		return uploadlinks;
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFogsystem((FogSystem) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDownloadLinks()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK__UPLOADLINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUploadlinks()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			return basicSetFogsystem(null, msgs);
		case FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS:
			return ((InternalEList<?>) getDownloadLinks()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK__UPLOADLINKS:
			return ((InternalEList<?>) getUploadlinks()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__NETWORKS, FogSystem.class,
					msgs);
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			return getFogsystem();
		case FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS:
			return getDownloadLinks();
		case FogAdlModelPackage.NETWORK__IS_INSTANCE_OF:
			if (resolve)
				return getIsInstanceOf();
			return basicGetIsInstanceOf();
		case FogAdlModelPackage.NETWORK__UPLOADLINKS:
			return getUploadlinks();
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			setFogsystem((FogSystem) newValue);
			return;
		case FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS:
			getDownloadLinks().clear();
			getDownloadLinks().addAll((Collection<? extends NetworkLink>) newValue);
			return;
		case FogAdlModelPackage.NETWORK__IS_INSTANCE_OF:
			setIsInstanceOf((NetworkType) newValue);
			return;
		case FogAdlModelPackage.NETWORK__UPLOADLINKS:
			getUploadlinks().clear();
			getUploadlinks().addAll((Collection<? extends NetworkLink>) newValue);
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			setFogsystem((FogSystem) null);
			return;
		case FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS:
			getDownloadLinks().clear();
			return;
		case FogAdlModelPackage.NETWORK__IS_INSTANCE_OF:
			setIsInstanceOf((NetworkType) null);
			return;
		case FogAdlModelPackage.NETWORK__UPLOADLINKS:
			getUploadlinks().clear();
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
		case FogAdlModelPackage.NETWORK__FOGSYSTEM:
			return getFogsystem() != null;
		case FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS:
			return downloadLinks != null && !downloadLinks.isEmpty();
		case FogAdlModelPackage.NETWORK__IS_INSTANCE_OF:
			return isInstanceOf != null;
		case FogAdlModelPackage.NETWORK__UPLOADLINKS:
			return uploadlinks != null && !uploadlinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkImpl
