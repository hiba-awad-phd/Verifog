/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.Connector;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.NetworkPort;
import fr.imta.semafor.fogAdlModel.Node;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl#getHostingNode <em>Hosting Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl#getNetworkports <em>Networkports</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl#getIncomingDataflows <em>Incoming Dataflows</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl#getOutcomingDataflows <em>Outcoming Dataflows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends FogResourceImpl implements Service {
	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected ServiceType instanceOf;

	/**
	 * The cached value of the '{@link #getHostingNode() <em>Hosting Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostingNode()
	 * @generated
	 * @ordered
	 */
	protected Node hostingNode;

	/**
	 * The cached value of the '{@link #getNetworkports() <em>Networkports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkports()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkPort> networkports;

	/**
	 * The cached value of the '{@link #getIncomingDataflows() <em>Incoming Dataflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDataflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> incomingDataflows;

	/**
	 * The cached value of the '{@link #getOutcomingDataflows() <em>Outcoming Dataflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomingDataflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> outcomingDataflows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject) instanceOf;
			instanceOf = (ServiceType) eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.SERVICE__INSTANCE_OF,
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
	public ServiceType basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceOf(ServiceType newInstanceOf, NotificationChain msgs) {
		ServiceType oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.SERVICE__INSTANCE_OF, oldInstanceOf, newInstanceOf);
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
	public void setInstanceOf(ServiceType newInstanceOf) {
		if (newInstanceOf != instanceOf) {
			NotificationChain msgs = null;
			if (instanceOf != null)
				msgs = ((InternalEObject) instanceOf).eInverseRemove(this, FogAdlModelPackage.SERVICE_TYPE__INSTANCES,
						ServiceType.class, msgs);
			if (newInstanceOf != null)
				msgs = ((InternalEObject) newInstanceOf).eInverseAdd(this, FogAdlModelPackage.SERVICE_TYPE__INSTANCES,
						ServiceType.class, msgs);
			msgs = basicSetInstanceOf(newInstanceOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.SERVICE__INSTANCE_OF,
					newInstanceOf, newInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getHostingNode() {
		if (hostingNode != null && hostingNode.eIsProxy()) {
			InternalEObject oldHostingNode = (InternalEObject) hostingNode;
			hostingNode = (Node) eResolveProxy(oldHostingNode);
			if (hostingNode != oldHostingNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.SERVICE__HOSTING_NODE,
							oldHostingNode, hostingNode));
			}
		}
		return hostingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetHostingNode() {
		return hostingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostingNode(Node newHostingNode, NotificationChain msgs) {
		Node oldHostingNode = hostingNode;
		hostingNode = newHostingNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.SERVICE__HOSTING_NODE, oldHostingNode, newHostingNode);
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
	public void setHostingNode(Node newHostingNode) {
		if (newHostingNode != hostingNode) {
			NotificationChain msgs = null;
			if (hostingNode != null)
				msgs = ((InternalEObject) hostingNode).eInverseRemove(this, FogAdlModelPackage.NODE__HOSTED_SERVICES,
						Node.class, msgs);
			if (newHostingNode != null)
				msgs = ((InternalEObject) newHostingNode).eInverseAdd(this, FogAdlModelPackage.NODE__HOSTED_SERVICES,
						Node.class, msgs);
			msgs = basicSetHostingNode(newHostingNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.SERVICE__HOSTING_NODE,
					newHostingNode, newHostingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkPort> getNetworkports() {
		if (networkports == null) {
			networkports = new EObjectContainmentEList<NetworkPort>(NetworkPort.class, this,
					FogAdlModelPackage.SERVICE__NETWORKPORTS);
		}
		return networkports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != FogAdlModelPackage.SERVICE__APPLICATION)
			return null;
		return (Application) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newApplication, FogAdlModelPackage.SERVICE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.SERVICE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this, FogAdlModelPackage.APPLICATION__SERVICES,
						Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.SERVICE__APPLICATION,
					newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getIncomingDataflows() {
		if (incomingDataflows == null) {
			incomingDataflows = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this,
					FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS, FogAdlModelPackage.CONNECTOR__TARGET_SERVICES);
		}
		return incomingDataflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOutcomingDataflows() {
		if (outcomingDataflows == null) {
			outcomingDataflows = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this,
					FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS, FogAdlModelPackage.CONNECTOR__SOURCE_SERVICES);
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
		case FogAdlModelPackage.SERVICE__INSTANCE_OF:
			if (instanceOf != null)
				msgs = ((InternalEObject) instanceOf).eInverseRemove(this, FogAdlModelPackage.SERVICE_TYPE__INSTANCES,
						ServiceType.class, msgs);
			return basicSetInstanceOf((ServiceType) otherEnd, msgs);
		case FogAdlModelPackage.SERVICE__HOSTING_NODE:
			if (hostingNode != null)
				msgs = ((InternalEObject) hostingNode).eInverseRemove(this, FogAdlModelPackage.NODE__HOSTED_SERVICES,
						Node.class, msgs);
			return basicSetHostingNode((Node) otherEnd, msgs);
		case FogAdlModelPackage.SERVICE__APPLICATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetApplication((Application) otherEnd, msgs);
		case FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingDataflows()).basicAdd(otherEnd,
					msgs);
		case FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS:
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
		case FogAdlModelPackage.SERVICE__INSTANCE_OF:
			return basicSetInstanceOf(null, msgs);
		case FogAdlModelPackage.SERVICE__HOSTING_NODE:
			return basicSetHostingNode(null, msgs);
		case FogAdlModelPackage.SERVICE__NETWORKPORTS:
			return ((InternalEList<?>) getNetworkports()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE__APPLICATION:
			return basicSetApplication(null, msgs);
		case FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS:
			return ((InternalEList<?>) getIncomingDataflows()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS:
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
		case FogAdlModelPackage.SERVICE__APPLICATION:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.APPLICATION__SERVICES,
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
		case FogAdlModelPackage.SERVICE__INSTANCE_OF:
			if (resolve)
				return getInstanceOf();
			return basicGetInstanceOf();
		case FogAdlModelPackage.SERVICE__HOSTING_NODE:
			if (resolve)
				return getHostingNode();
			return basicGetHostingNode();
		case FogAdlModelPackage.SERVICE__NETWORKPORTS:
			return getNetworkports();
		case FogAdlModelPackage.SERVICE__APPLICATION:
			return getApplication();
		case FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS:
			return getIncomingDataflows();
		case FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS:
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
		case FogAdlModelPackage.SERVICE__INSTANCE_OF:
			setInstanceOf((ServiceType) newValue);
			return;
		case FogAdlModelPackage.SERVICE__HOSTING_NODE:
			setHostingNode((Node) newValue);
			return;
		case FogAdlModelPackage.SERVICE__NETWORKPORTS:
			getNetworkports().clear();
			getNetworkports().addAll((Collection<? extends NetworkPort>) newValue);
			return;
		case FogAdlModelPackage.SERVICE__APPLICATION:
			setApplication((Application) newValue);
			return;
		case FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS:
			getIncomingDataflows().clear();
			getIncomingDataflows().addAll((Collection<? extends Connector>) newValue);
			return;
		case FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS:
			getOutcomingDataflows().clear();
			getOutcomingDataflows().addAll((Collection<? extends Connector>) newValue);
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
		case FogAdlModelPackage.SERVICE__INSTANCE_OF:
			setInstanceOf((ServiceType) null);
			return;
		case FogAdlModelPackage.SERVICE__HOSTING_NODE:
			setHostingNode((Node) null);
			return;
		case FogAdlModelPackage.SERVICE__NETWORKPORTS:
			getNetworkports().clear();
			return;
		case FogAdlModelPackage.SERVICE__APPLICATION:
			setApplication((Application) null);
			return;
		case FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS:
			getIncomingDataflows().clear();
			return;
		case FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS:
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
		case FogAdlModelPackage.SERVICE__INSTANCE_OF:
			return instanceOf != null;
		case FogAdlModelPackage.SERVICE__HOSTING_NODE:
			return hostingNode != null;
		case FogAdlModelPackage.SERVICE__NETWORKPORTS:
			return networkports != null && !networkports.isEmpty();
		case FogAdlModelPackage.SERVICE__APPLICATION:
			return getApplication() != null;
		case FogAdlModelPackage.SERVICE__INCOMING_DATAFLOWS:
			return incomingDataflows != null && !incomingDataflows.isEmpty();
		case FogAdlModelPackage.SERVICE__OUTCOMING_DATAFLOWS:
			return outcomingDataflows != null && !outcomingDataflows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
