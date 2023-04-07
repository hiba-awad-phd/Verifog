/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.Network;
import fr.imta.semafor.fogAdlModel.NetworkLink;
import fr.imta.semafor.fogAdlModel.NetworkLinkType;
import fr.imta.semafor.fogAdlModel.Node;
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
 * An implementation of the model object '<em><b>Network Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getTargetNetwork <em>Target Network</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getSourceIpAddress <em>Source Ip Address</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getTargetIpAddress <em>Target Ip Address</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getBitrate <em>Bitrate</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl#getSourceNetworks <em>Source Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkLinkImpl extends FogResourceImpl implements NetworkLink {
	/**
	 * The cached value of the '{@link #getTargetNetwork() <em>Target Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network targetNetwork;

	/**
	 * The cached value of the '{@link #getIsInstanceOf() <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected NetworkLinkType isInstanceOf;

	/**
	 * The default value of the '{@link #getSourceIpAddress() <em>Source Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceIpAddress() <em>Source Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String sourceIpAddress = SOURCE_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetIpAddress() <em>Target Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetIpAddress() <em>Target Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String targetIpAddress = TARGET_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitrate() <em>Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitrate()
	 * @generated
	 * @ordered
	 */
	protected static final int BITRATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitrate() <em>Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitrate()
	 * @generated
	 * @ordered
	 */
	protected int bitrate = BITRATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceNetworks() <em>Source Networks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> sourceNetworks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NETWORK_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getTargetNetwork() {
		if (targetNetwork != null && targetNetwork.eIsProxy()) {
			InternalEObject oldTargetNetwork = (InternalEObject) targetNetwork;
			targetNetwork = (Network) eResolveProxy(oldTargetNetwork);
			if (targetNetwork != oldTargetNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK, oldTargetNetwork, targetNetwork));
			}
		}
		return targetNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetTargetNetwork() {
		return targetNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNetwork(Network newTargetNetwork, NotificationChain msgs) {
		Network oldTargetNetwork = targetNetwork;
		targetNetwork = newTargetNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK, oldTargetNetwork, newTargetNetwork);
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
	public void setTargetNetwork(Network newTargetNetwork) {
		if (newTargetNetwork != targetNetwork) {
			NotificationChain msgs = null;
			if (targetNetwork != null)
				msgs = ((InternalEObject) targetNetwork).eInverseRemove(this,
						FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS, Network.class, msgs);
			if (newTargetNetwork != null)
				msgs = ((InternalEObject) newTargetNetwork).eInverseAdd(this,
						FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS, Network.class, msgs);
			msgs = basicSetTargetNetwork(newTargetNetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK,
					newTargetNetwork, newTargetNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSourceNode() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceNode(Node newSourceNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSourceNode, FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceNode(Node newSourceNode) {
		if (newSourceNode != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE && newSourceNode != null)) {
			if (EcoreUtil.isAncestor(this, newSourceNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceNode != null)
				msgs = ((InternalEObject) newSourceNode).eInverseAdd(this, FogAdlModelPackage.NODE__UPLOAD_LINK,
						Node.class, msgs);
			msgs = basicSetSourceNode(newSourceNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE,
					newSourceNode, newSourceNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTargetNode() {
		if (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK__TARGET_NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNode(Node newTargetNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTargetNode, FogAdlModelPackage.NETWORK_LINK__TARGET_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNode(Node newTargetNode) {
		if (newTargetNode != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.NETWORK_LINK__TARGET_NODE && newTargetNode != null)) {
			if (EcoreUtil.isAncestor(this, newTargetNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetNode != null)
				msgs = ((InternalEObject) newTargetNode).eInverseAdd(this, FogAdlModelPackage.NODE__DOWNLOAD_LINK,
						Node.class, msgs);
			msgs = basicSetTargetNode(newTargetNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__TARGET_NODE,
					newTargetNode, newTargetNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkType getIsInstanceOf() {
		if (isInstanceOf != null && isInstanceOf.eIsProxy()) {
			InternalEObject oldIsInstanceOf = (InternalEObject) isInstanceOf;
			isInstanceOf = (NetworkLinkType) eResolveProxy(oldIsInstanceOf);
			if (isInstanceOf != oldIsInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF, oldIsInstanceOf, isInstanceOf));
			}
		}
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkType basicGetIsInstanceOf() {
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInstanceOf(NetworkLinkType newIsInstanceOf, NotificationChain msgs) {
		NetworkLinkType oldIsInstanceOf = isInstanceOf;
		isInstanceOf = newIsInstanceOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF, oldIsInstanceOf, newIsInstanceOf);
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
	public void setIsInstanceOf(NetworkLinkType newIsInstanceOf) {
		if (newIsInstanceOf != isInstanceOf) {
			NotificationChain msgs = null;
			if (isInstanceOf != null)
				msgs = ((InternalEObject) isInstanceOf).eInverseRemove(this,
						FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES, NetworkLinkType.class, msgs);
			if (newIsInstanceOf != null)
				msgs = ((InternalEObject) newIsInstanceOf).eInverseAdd(this,
						FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES, NetworkLinkType.class, msgs);
			msgs = basicSetIsInstanceOf(newIsInstanceOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF,
					newIsInstanceOf, newIsInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceIpAddress() {
		return sourceIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIpAddress(String newSourceIpAddress) {
		String oldSourceIpAddress = sourceIpAddress;
		sourceIpAddress = newSourceIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__SOURCE_IP_ADDRESS,
					oldSourceIpAddress, sourceIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetIpAddress() {
		return targetIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIpAddress(String newTargetIpAddress) {
		String oldTargetIpAddress = targetIpAddress;
		targetIpAddress = newTargetIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__TARGET_IP_ADDRESS,
					oldTargetIpAddress, targetIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitrate() {
		return bitrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitrate(int newBitrate) {
		int oldBitrate = bitrate;
		bitrate = newBitrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_LINK__BITRATE, oldBitrate,
					bitrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getSourceNetworks() {
		if (sourceNetworks == null) {
			sourceNetworks = new EObjectWithInverseResolvingEList.ManyInverse<Network>(Network.class, this,
					FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS, FogAdlModelPackage.NETWORK__UPLOADLINKS);
		}
		return sourceNetworks;
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
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK:
			if (targetNetwork != null)
				msgs = ((InternalEObject) targetNetwork).eInverseRemove(this,
						FogAdlModelPackage.NETWORK__DOWNLOAD_LINKS, Network.class, msgs);
			return basicSetTargetNetwork((Network) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSourceNode((Node) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTargetNode((Node) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF:
			if (isInstanceOf != null)
				msgs = ((InternalEObject) isInstanceOf).eInverseRemove(this,
						FogAdlModelPackage.NETWORK_LINK_TYPE__INSTANCES, NetworkLinkType.class, msgs);
			return basicSetIsInstanceOf((NetworkLinkType) otherEnd, msgs);
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceNetworks()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK:
			return basicSetTargetNetwork(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			return basicSetSourceNode(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			return basicSetTargetNode(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF:
			return basicSetIsInstanceOf(null, msgs);
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS:
			return ((InternalEList<?>) getSourceNetworks()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.NODE__UPLOAD_LINK, Node.class, msgs);
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.NODE__DOWNLOAD_LINK, Node.class, msgs);
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
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK:
			if (resolve)
				return getTargetNetwork();
			return basicGetTargetNetwork();
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			return getSourceNode();
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			return getTargetNode();
		case FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF:
			if (resolve)
				return getIsInstanceOf();
			return basicGetIsInstanceOf();
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_IP_ADDRESS:
			return getSourceIpAddress();
		case FogAdlModelPackage.NETWORK_LINK__TARGET_IP_ADDRESS:
			return getTargetIpAddress();
		case FogAdlModelPackage.NETWORK_LINK__BITRATE:
			return getBitrate();
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS:
			return getSourceNetworks();
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
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK:
			setTargetNetwork((Network) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			setSourceNode((Node) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			setTargetNode((Node) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF:
			setIsInstanceOf((NetworkLinkType) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_IP_ADDRESS:
			setSourceIpAddress((String) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__TARGET_IP_ADDRESS:
			setTargetIpAddress((String) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__BITRATE:
			setBitrate((Integer) newValue);
			return;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS:
			getSourceNetworks().clear();
			getSourceNetworks().addAll((Collection<? extends Network>) newValue);
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
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK:
			setTargetNetwork((Network) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			setSourceNode((Node) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			setTargetNode((Node) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF:
			setIsInstanceOf((NetworkLinkType) null);
			return;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_IP_ADDRESS:
			setSourceIpAddress(SOURCE_IP_ADDRESS_EDEFAULT);
			return;
		case FogAdlModelPackage.NETWORK_LINK__TARGET_IP_ADDRESS:
			setTargetIpAddress(TARGET_IP_ADDRESS_EDEFAULT);
			return;
		case FogAdlModelPackage.NETWORK_LINK__BITRATE:
			setBitrate(BITRATE_EDEFAULT);
			return;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS:
			getSourceNetworks().clear();
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
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NETWORK:
			return targetNetwork != null;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE:
			return getSourceNode() != null;
		case FogAdlModelPackage.NETWORK_LINK__TARGET_NODE:
			return getTargetNode() != null;
		case FogAdlModelPackage.NETWORK_LINK__IS_INSTANCE_OF:
			return isInstanceOf != null;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_IP_ADDRESS:
			return SOURCE_IP_ADDRESS_EDEFAULT == null ? sourceIpAddress != null
					: !SOURCE_IP_ADDRESS_EDEFAULT.equals(sourceIpAddress);
		case FogAdlModelPackage.NETWORK_LINK__TARGET_IP_ADDRESS:
			return TARGET_IP_ADDRESS_EDEFAULT == null ? targetIpAddress != null
					: !TARGET_IP_ADDRESS_EDEFAULT.equals(targetIpAddress);
		case FogAdlModelPackage.NETWORK_LINK__BITRATE:
			return bitrate != BITRATE_EDEFAULT;
		case FogAdlModelPackage.NETWORK_LINK__SOURCE_NETWORKS:
			return sourceNetworks != null && !sourceNetworks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sourceIpAddress: ");
		result.append(sourceIpAddress);
		result.append(", targetIpAddress: ");
		result.append(targetIpAddress);
		result.append(", bitrate: ");
		result.append(bitrate);
		result.append(')');
		return result.toString();
	}

} //NetworkLinkImpl
