/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.ConnectorType;
import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.NetworkPort;
import fr.imta.semafor.fogAdlModel.Service;
import fr.imta.semafor.fogAdlModel.ServiceType;
import fr.imta.semafor.fogAdlModel.SoftwarePackage;
import fr.imta.semafor.fogAdlModel.VirtualNodeSpecification;

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
 * An implementation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getHostedOn <em>Hosted On</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getNetworkPorts <em>Network Ports</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getIncomingDataflows <em>Incoming Dataflows</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl#getOutcomingDataflows <em>Outcoming Dataflows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeImpl extends FogResourceImpl implements ServiceType {
	/**
	 * The cached value of the '{@link #getHostedOn() <em>Hosted On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualNodeSpecification> hostedOn;

	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwarePackage> implementedBy;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> instances;

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
	 * The cached value of the '{@link #getNetworkPorts() <em>Network Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkPort> networkPorts;

	/**
	 * The cached value of the '{@link #getIncomingDataflows() <em>Incoming Dataflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDataflows()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> incomingDataflows;

	/**
	 * The cached value of the '{@link #getOutcomingDataflows() <em>Outcoming Dataflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomingDataflows()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> outcomingDataflows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.SERVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != FogAdlModelPackage.SERVICE_TYPE__APPLICATION)
			return null;
		return (Application) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newApplication, FogAdlModelPackage.SERVICE_TYPE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.SERVICE_TYPE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this,
						FogAdlModelPackage.APPLICATION__SERVICE_TYPES, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.SERVICE_TYPE__APPLICATION,
					newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualNodeSpecification> getHostedOn() {
		if (hostedOn == null) {
			hostedOn = new EObjectWithInverseResolvingEList.ManyInverse<VirtualNodeSpecification>(
					VirtualNodeSpecification.class, this, FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS);
		}
		return hostedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwarePackage> getImplementedBy() {
		if (implementedBy == null) {
			implementedBy = new EObjectContainmentEList<SoftwarePackage>(SoftwarePackage.class, this,
					FogAdlModelPackage.SERVICE_TYPE__IMPLEMENTED_BY);
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<Service>(Service.class, this,
					FogAdlModelPackage.SERVICE_TYPE__INSTANCES, FogAdlModelPackage.SERVICE__INSTANCE_OF);
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
					FogAdlModelPackage.SERVICE_TYPE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkPort> getNetworkPorts() {
		if (networkPorts == null) {
			networkPorts = new EObjectContainmentEList<NetworkPort>(NetworkPort.class, this,
					FogAdlModelPackage.SERVICE_TYPE__NETWORK_PORTS);
		}
		return networkPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getIncomingDataflows() {
		if (incomingDataflows == null) {
			incomingDataflows = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorType>(ConnectorType.class,
					this, FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS,
					FogAdlModelPackage.CONNECTOR_TYPE__TARGET_SERVICES);
		}
		return incomingDataflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getOutcomingDataflows() {
		if (outcomingDataflows == null) {
			outcomingDataflows = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorType>(ConnectorType.class,
					this, FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS,
					FogAdlModelPackage.CONNECTOR_TYPE__SOURCE_SERVICES);
		}
		return outcomingDataflows;
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetApplication((Application) otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHostedOn()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstances()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingDataflows()).basicAdd(otherEnd,
					msgs);
		case FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutcomingDataflows()).basicAdd(otherEnd,
					msgs);
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			return basicSetApplication(null, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON:
			return ((InternalEList<?>) getHostedOn()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__IMPLEMENTED_BY:
			return ((InternalEList<?>) getImplementedBy()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__NETWORK_PORTS:
			return ((InternalEList<?>) getNetworkPorts()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS:
			return ((InternalEList<?>) getIncomingDataflows()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS:
			return ((InternalEList<?>) getOutcomingDataflows()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.APPLICATION__SERVICE_TYPES,
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			return getApplication();
		case FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON:
			return getHostedOn();
		case FogAdlModelPackage.SERVICE_TYPE__IMPLEMENTED_BY:
			return getImplementedBy();
		case FogAdlModelPackage.SERVICE_TYPE__INSTANCES:
			return getInstances();
		case FogAdlModelPackage.SERVICE_TYPE__CONSTRAINTS:
			return getConstraints();
		case FogAdlModelPackage.SERVICE_TYPE__NETWORK_PORTS:
			return getNetworkPorts();
		case FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS:
			return getIncomingDataflows();
		case FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS:
			return getOutcomingDataflows();
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			setApplication((Application) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON:
			getHostedOn().clear();
			getHostedOn().addAll((Collection<? extends VirtualNodeSpecification>) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__IMPLEMENTED_BY:
			getImplementedBy().clear();
			getImplementedBy().addAll((Collection<? extends SoftwarePackage>) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Service>) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends Constraint>) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__NETWORK_PORTS:
			getNetworkPorts().clear();
			getNetworkPorts().addAll((Collection<? extends NetworkPort>) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS:
			getIncomingDataflows().clear();
			getIncomingDataflows().addAll((Collection<? extends ConnectorType>) newValue);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS:
			getOutcomingDataflows().clear();
			getOutcomingDataflows().addAll((Collection<? extends ConnectorType>) newValue);
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			setApplication((Application) null);
			return;
		case FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON:
			getHostedOn().clear();
			return;
		case FogAdlModelPackage.SERVICE_TYPE__IMPLEMENTED_BY:
			getImplementedBy().clear();
			return;
		case FogAdlModelPackage.SERVICE_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case FogAdlModelPackage.SERVICE_TYPE__CONSTRAINTS:
			getConstraints().clear();
			return;
		case FogAdlModelPackage.SERVICE_TYPE__NETWORK_PORTS:
			getNetworkPorts().clear();
			return;
		case FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS:
			getIncomingDataflows().clear();
			return;
		case FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS:
			getOutcomingDataflows().clear();
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
		case FogAdlModelPackage.SERVICE_TYPE__APPLICATION:
			return getApplication() != null;
		case FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON:
			return hostedOn != null && !hostedOn.isEmpty();
		case FogAdlModelPackage.SERVICE_TYPE__IMPLEMENTED_BY:
			return implementedBy != null && !implementedBy.isEmpty();
		case FogAdlModelPackage.SERVICE_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case FogAdlModelPackage.SERVICE_TYPE__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case FogAdlModelPackage.SERVICE_TYPE__NETWORK_PORTS:
			return networkPorts != null && !networkPorts.isEmpty();
		case FogAdlModelPackage.SERVICE_TYPE__INCOMING_DATAFLOWS:
			return incomingDataflows != null && !incomingDataflows.isEmpty();
		case FogAdlModelPackage.SERVICE_TYPE__OUTCOMING_DATAFLOWS:
			return outcomingDataflows != null && !outcomingDataflows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceTypeImpl
