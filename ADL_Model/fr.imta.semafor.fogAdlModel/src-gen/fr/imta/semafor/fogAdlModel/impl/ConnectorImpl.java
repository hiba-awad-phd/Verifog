/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.Connector;
import fr.imta.semafor.fogAdlModel.ConnectorType;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.Service;

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
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorImpl#getTargetServices <em>Target Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorImpl#getSourceServices <em>Source Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends FogResourceImpl implements Connector {
	/**
	 * The cached value of the '{@link #getTargetServices() <em>Target Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> targetServices;

	/**
	 * The cached value of the '{@link #getSourceServices() <em>Source Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> sourceServices;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType instanceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getTargetServices() {
		if (targetServices == null) {
			targetServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this,
					FogAdlModelPackage.CONNECTOR__TARGET_SERVICES, FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS);
		}
		return targetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getSourceServices() {
		if (sourceServices == null) {
			sourceServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this,
					FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES, FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS);
		}
		return sourceServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject) instanceOf;
			instanceOf = (ConnectorType) eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.CONNECTOR__INSTANCE_OF,
							oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceOf(ConnectorType newInstanceOf, NotificationChain msgs) {
		ConnectorType oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.CONNECTOR__INSTANCE_OF, oldInstanceOf, newInstanceOf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(ConnectorType newInstanceOf) {
		if (newInstanceOf != instanceOf) {
			NotificationChain msgs = null;
			if (instanceOf != null)
				msgs = ((InternalEObject) instanceOf).eInverseRemove(this, FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES,
						ConnectorType.class, msgs);
			if (newInstanceOf != null)
				msgs = ((InternalEObject) newInstanceOf).eInverseAdd(this, FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES,
						ConnectorType.class, msgs);
			msgs = basicSetInstanceOf(newInstanceOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.CONNECTOR__INSTANCE_OF,
					newInstanceOf, newInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != FogAdlModelPackage.CONNECTOR__APPLICATION)
			return null;
		return (Application) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newApplication, FogAdlModelPackage.CONNECTOR__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.CONNECTOR__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this, FogAdlModelPackage.APPLICATION__CONNECTORS,
						Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.CONNECTOR__APPLICATION,
					newApplication, newApplication));
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
		case FogAdlModelPackage.CONNECTOR__TARGET_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetServices()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceServices()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR__INSTANCE_OF:
			if (instanceOf != null)
				msgs = ((InternalEObject) instanceOf).eInverseRemove(this, FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES,
						ConnectorType.class, msgs);
			return basicSetInstanceOf((ConnectorType) otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetApplication((Application) otherEnd, msgs);
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
		case FogAdlModelPackage.CONNECTOR__TARGET_SERVICES:
			return ((InternalEList<?>) getTargetServices()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES:
			return ((InternalEList<?>) getSourceServices()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR__INSTANCE_OF:
			return basicSetInstanceOf(null, msgs);
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			return basicSetApplication(null, msgs);
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
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.APPLICATION__CONNECTORS,
					Application.class, msgs);
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
		case FogAdlModelPackage.CONNECTOR__TARGET_SERVICES:
			return getTargetServices();
		case FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES:
			return getSourceServices();
		case FogAdlModelPackage.CONNECTOR__INSTANCE_OF:
			if (resolve)
				return getInstanceOf();
			return basicGetInstanceOf();
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			return getApplication();
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
		case FogAdlModelPackage.CONNECTOR__TARGET_SERVICES:
			getTargetServices().clear();
			getTargetServices().addAll((Collection<? extends Service>) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES:
			getSourceServices().clear();
			getSourceServices().addAll((Collection<? extends Service>) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR__INSTANCE_OF:
			setInstanceOf((ConnectorType) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			setApplication((Application) newValue);
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
		case FogAdlModelPackage.CONNECTOR__TARGET_SERVICES:
			getTargetServices().clear();
			return;
		case FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES:
			getSourceServices().clear();
			return;
		case FogAdlModelPackage.CONNECTOR__INSTANCE_OF:
			setInstanceOf((ConnectorType) null);
			return;
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			setApplication((Application) null);
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
		case FogAdlModelPackage.CONNECTOR__TARGET_SERVICES:
			return targetServices != null && !targetServices.isEmpty();
		case FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES:
			return sourceServices != null && !sourceServices.isEmpty();
		case FogAdlModelPackage.CONNECTOR__INSTANCE_OF:
			return instanceOf != null;
		case FogAdlModelPackage.CONNECTOR__APPLICATION:
			return getApplication() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
