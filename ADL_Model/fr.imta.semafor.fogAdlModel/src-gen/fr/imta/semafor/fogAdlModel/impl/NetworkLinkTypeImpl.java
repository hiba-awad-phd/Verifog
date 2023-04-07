/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.NetworkLink;
import fr.imta.semafor.fogAdlModel.NetworkLinkType;
import fr.imta.semafor.fogAdlModel.NetworkType;
import fr.imta.semafor.fogAdlModel.NodeType;

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
 * An implementation of the model object '<em><b>Network Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl#getTargetNetwork <em>Target Network</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl#getSourceNetworks <em>Source Networks</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkLinkTypeImpl extends FogResourceImpl implements NetworkLinkType {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLink> instances;

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
	protected NetworkLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NETWORK_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType getTargetNetwork() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK)
			return null;
		return (NetworkType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNetwork(NetworkType newTargetNetwork, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTargetNetwork,
				FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNetwork(NetworkType newTargetNetwork) {
		if (newTargetNetwork != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK
						&& newTargetNetwork != null)) {
			if (EcoreUtil.isAncestor(this, newTargetNetwork))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetNetwork != null)
				msgs = ((InternalEObject) newTargetNetwork).eInverseAdd(this,
						FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS, NetworkType.class, msgs);
			msgs = basicSetTargetNetwork(newTargetNetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK,
					newTargetNetwork, newTargetNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getSourceNode() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE)
			return null;
		return (NodeType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceNode(NodeType newSourceNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSourceNode, FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceNode(NodeType newSourceNode) {
		if (newSourceNode != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE
						&& newSourceNode != null)) {
			if (EcoreUtil.isAncestor(this, newSourceNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceNode != null)
				msgs = ((InternalEObject) newSourceNode).eInverseAdd(this, FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK,
						NodeType.class, msgs);
			msgs = basicSetSourceNode(newSourceNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE,
					newSourceNode, newSourceNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getTargetNode() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE)
			return null;
		return (NodeType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNode(NodeType newTargetNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTargetNode, FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNode(NodeType newTargetNode) {
		if (newTargetNode != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE
						&& newTargetNode != null)) {
			if (EcoreUtil.isAncestor(this, newTargetNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetNode != null)
				msgs = ((InternalEObject) newTargetNode).eInverseAdd(this, FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK,
						NodeType.class, msgs);
			msgs = basicSetTargetNode(newTargetNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE,
					newTargetNode, newTargetNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLink> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<NetworkLink>(NetworkLink.class, this,
					FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES, FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType getSourceNetworks() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS)
			return null;
		return (NetworkType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceNetworks(NetworkType newSourceNetworks, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSourceNetworks,
				FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceNetworks(NetworkType newSourceNetworks) {
		if (newSourceNetworks != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS
						&& newSourceNetworks != null)) {
			if (EcoreUtil.isAncestor(this, newSourceNetworks))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceNetworks != null)
				msgs = ((InternalEObject) newSourceNetworks).eInverseAdd(this,
						FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK, NetworkType.class, msgs);
			msgs = basicSetSourceNetworks(newSourceNetworks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS,
					newSourceNetworks, newSourceNetworks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.NETWORK_LINK_TYPE__CONSTRAINTS);
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTargetNetwork((NetworkType) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSourceNode((NodeType) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTargetNode((NodeType) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstances()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSourceNetworks((NetworkType) otherEnd, msgs);
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			return basicSetTargetNetwork(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			return basicSetSourceNode(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			return basicSetTargetNode(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			return basicSetSourceNetworks(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.NETWORK_TYPE__DOWNLOADLINKS,
					NetworkType.class, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.NODE_TYPE__DOWNLOAD_LINK,
					NodeType.class, msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.NODE_TYPE__UPLOAD_LINK, NodeType.class,
					msgs);
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.NETWORK_TYPE__UPLOAD_LINK,
					NetworkType.class, msgs);
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			return getTargetNetwork();
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			return getSourceNode();
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			return getTargetNode();
		case FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES:
			return getInstances();
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			return getSourceNetworks();
		case FogAdlModelPackage.NETWORK_LINK_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			setTargetNetwork((NetworkType) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			setSourceNode((NodeType) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			setTargetNode((NodeType) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends NetworkLink>) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			setSourceNetworks((NetworkType) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			setTargetNetwork((NetworkType) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			setSourceNode((NodeType) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			setTargetNode((NodeType) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			setSourceNetworks((NetworkType) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__CONSTRAINTS:
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
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NETWORK:
			return getTargetNetwork() != null;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NODE:
			return getSourceNode() != null;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__TARGET_NODE:
			return getTargetNode() != null;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case FogAdlModelPackage.NETWORK_LINK_TYPE__SOURCE_NETWORKS:
			return getSourceNetworks() != null;
		case FogAdlModelPackage.NETWORK_LINK_TYPE__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkLinkTypeImpl
