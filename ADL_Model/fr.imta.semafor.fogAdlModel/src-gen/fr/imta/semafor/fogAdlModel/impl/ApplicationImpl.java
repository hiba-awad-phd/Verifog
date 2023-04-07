/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.Connector;
import fr.imta.semafor.fogAdlModel.ConnectorType;
import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.Service;
import fr.imta.semafor.fogAdlModel.ServiceType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl#getFogSystem <em>Fog System</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl#getConnectortypes <em>Connectortypes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends FogResourceImpl implements Application {
	/**
	 * The cached value of the '{@link #getFogSystem() <em>Fog System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogSystem()
	 * @generated
	 * @ordered
	 */
	protected FogSystem fogSystem;

	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> serviceTypes;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getConnectortypes() <em>Connectortypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectortypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> connectortypes;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

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
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogSystem() {
		if (fogSystem != null && fogSystem.eIsProxy()) {
			InternalEObject oldFogSystem = (InternalEObject) fogSystem;
			fogSystem = (FogSystem) eResolveProxy(oldFogSystem);
			if (fogSystem != oldFogSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FogAdlModelPackage.APPLICATION__FOG_SYSTEM, oldFogSystem, fogSystem));
			}
		}
		return fogSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem basicGetFogSystem() {
		return fogSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogSystem(FogSystem newFogSystem, NotificationChain msgs) {
		FogSystem oldFogSystem = fogSystem;
		fogSystem = newFogSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.APPLICATION__FOG_SYSTEM, oldFogSystem, newFogSystem);
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
	public void setFogSystem(FogSystem newFogSystem) {
		if (newFogSystem != fogSystem) {
			NotificationChain msgs = null;
			if (fogSystem != null)
				msgs = ((InternalEObject) fogSystem).eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS,
						FogSystem.class, msgs);
			if (newFogSystem != null)
				msgs = ((InternalEObject) newFogSystem).eInverseAdd(this, FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS,
						FogSystem.class, msgs);
			msgs = basicSetFogSystem(newFogSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.APPLICATION__FOG_SYSTEM,
					newFogSystem, newFogSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectContainmentWithInverseEList<ServiceType>(ServiceType.class, this,
					FogAdlModelPackage.APPLICATION__SERVICE_TYPES, FogAdlModelPackage.SERVICE_TYPE__APPLICATION);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this,
					FogAdlModelPackage.APPLICATION__SERVICES, FogAdlModelPackage.SERVICE__APPLICATION);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnectortypes() {
		if (connectortypes == null) {
			connectortypes = new EObjectContainmentWithInverseEList<ConnectorType>(ConnectorType.class, this,
					FogAdlModelPackage.APPLICATION__CONNECTORTYPES, FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION);
		}
		return connectortypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this,
					FogAdlModelPackage.APPLICATION__CONNECTORS, FogAdlModelPackage.CONNECTOR__APPLICATION);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.APPLICATION__CONSTRAINTS);
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
		case FogAdlModelPackage.APPLICATION__FOG_SYSTEM:
			if (fogSystem != null)
				msgs = ((InternalEObject) fogSystem).eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS,
						FogSystem.class, msgs);
			return basicSetFogSystem((FogSystem) otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__SERVICE_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getServiceTypes()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getServices()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__CONNECTORTYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectortypes()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__CONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectors()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.APPLICATION__FOG_SYSTEM:
			return basicSetFogSystem(null, msgs);
		case FogAdlModelPackage.APPLICATION__SERVICE_TYPES:
			return ((InternalEList<?>) getServiceTypes()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__CONNECTORTYPES:
			return ((InternalEList<?>) getConnectortypes()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.APPLICATION__CONSTRAINTS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.APPLICATION__FOG_SYSTEM:
			if (resolve)
				return getFogSystem();
			return basicGetFogSystem();
		case FogAdlModelPackage.APPLICATION__SERVICE_TYPES:
			return getServiceTypes();
		case FogAdlModelPackage.APPLICATION__SERVICES:
			return getServices();
		case FogAdlModelPackage.APPLICATION__CONNECTORTYPES:
			return getConnectortypes();
		case FogAdlModelPackage.APPLICATION__CONNECTORS:
			return getConnectors();
		case FogAdlModelPackage.APPLICATION__CONSTRAINTS:
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
		case FogAdlModelPackage.APPLICATION__FOG_SYSTEM:
			setFogSystem((FogSystem) newValue);
			return;
		case FogAdlModelPackage.APPLICATION__SERVICE_TYPES:
			getServiceTypes().clear();
			getServiceTypes().addAll((Collection<? extends ServiceType>) newValue);
			return;
		case FogAdlModelPackage.APPLICATION__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case FogAdlModelPackage.APPLICATION__CONNECTORTYPES:
			getConnectortypes().clear();
			getConnectortypes().addAll((Collection<? extends ConnectorType>) newValue);
			return;
		case FogAdlModelPackage.APPLICATION__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case FogAdlModelPackage.APPLICATION__CONSTRAINTS:
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
		case FogAdlModelPackage.APPLICATION__FOG_SYSTEM:
			setFogSystem((FogSystem) null);
			return;
		case FogAdlModelPackage.APPLICATION__SERVICE_TYPES:
			getServiceTypes().clear();
			return;
		case FogAdlModelPackage.APPLICATION__SERVICES:
			getServices().clear();
			return;
		case FogAdlModelPackage.APPLICATION__CONNECTORTYPES:
			getConnectortypes().clear();
			return;
		case FogAdlModelPackage.APPLICATION__CONNECTORS:
			getConnectors().clear();
			return;
		case FogAdlModelPackage.APPLICATION__CONSTRAINTS:
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
		case FogAdlModelPackage.APPLICATION__FOG_SYSTEM:
			return fogSystem != null;
		case FogAdlModelPackage.APPLICATION__SERVICE_TYPES:
			return serviceTypes != null && !serviceTypes.isEmpty();
		case FogAdlModelPackage.APPLICATION__SERVICES:
			return services != null && !services.isEmpty();
		case FogAdlModelPackage.APPLICATION__CONNECTORTYPES:
			return connectortypes != null && !connectortypes.isEmpty();
		case FogAdlModelPackage.APPLICATION__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case FogAdlModelPackage.APPLICATION__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
