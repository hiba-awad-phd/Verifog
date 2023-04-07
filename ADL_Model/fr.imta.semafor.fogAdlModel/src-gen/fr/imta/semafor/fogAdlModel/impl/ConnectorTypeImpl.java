/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.Connector;
import fr.imta.semafor.fogAdlModel.ConnectorType;
import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.ServiceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl#getTargetServices <em>Target Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl#getSourceServices <em>Source Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorTypeImpl extends FogResourceImpl implements ConnectorType {
	/**
	 * The cached value of the '{@link #getTargetServices() <em>Target Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> targetServices;

	/**
	 * The cached value of the '{@link #getSourceServices() <em>Source Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> sourceServices;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> instances;

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
	protected ConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getTargetServices() {
		if (targetServices == null) {
			targetServices = new EObjectWithInverseResolvingEList.ManyInverse<ServiceType>(ServiceType.class, this,
					FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES,
					FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS);
		}
		return targetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getSourceServices() {
		if (sourceServices == null) {
			sourceServices = new EObjectWithInverseResolvingEList.ManyInverse<ServiceType>(ServiceType.class, this,
					FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES,
					FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS);
		}
		return sourceServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION)
			return null;
		return (Application) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newApplication, FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION
						&& newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this,
						FogAdlModelPackage.APPLICATION__CONNECTORTYPES, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION,
					newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this,
					FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES, FogAdlModelPackage.CONNECTOR__INSTANCE_OF);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.CONNECTOR_TYPE__CONSTRAINTS);
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
		case FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetServices()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceServices()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetApplication((Application) otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstances()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES:
			return ((InternalEList<?>) getTargetServices()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES:
			return ((InternalEList<?>) getSourceServices()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			return basicSetApplication(null, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.CONNECTOR_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.APPLICATION__CONNECTORTYPES,
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
		case FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES:
			return getTargetServices();
		case FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES:
			return getSourceServices();
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			return getApplication();
		case FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES:
			return getInstances();
		case FogAdlModelPackage.CONNECTOR_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES:
			getTargetServices().clear();
			getTargetServices().addAll((Collection<? extends ServiceType>) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES:
			getSourceServices().clear();
			getSourceServices().addAll((Collection<? extends ServiceType>) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			setApplication((Application) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Connector>) newValue);
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES:
			getTargetServices().clear();
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES:
			getSourceServices().clear();
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			setApplication((Application) null);
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case FogAdlModelPackage.CONNECTOR_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES:
			return targetServices != null && !targetServices.isEmpty();
		case FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES:
			return sourceServices != null && !sourceServices.isEmpty();
		case FogAdlModelPackage.CONNECTOR_TYPE__APPLICATION:
			return getApplication() != null;
		case FogAdlModelPackage.CONNECTOR_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case FogAdlModelPackage.CONNECTOR_TYPE__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorTypeImpl
