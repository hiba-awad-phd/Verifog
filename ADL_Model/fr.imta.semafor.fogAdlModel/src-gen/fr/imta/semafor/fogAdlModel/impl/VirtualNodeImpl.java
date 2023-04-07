/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.Node;
import fr.imta.semafor.fogAdlModel.VirtualNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeImpl#getHostingNode <em>Hosting Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualNodeImpl extends NodeImpl implements VirtualNode {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.VIRTUAL_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE, oldHostingNode, hostingNode));
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
					FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE, oldHostingNode, newHostingNode);
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
				msgs = ((InternalEObject) hostingNode).eInverseRemove(this,
						FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES, Node.class, msgs);
			if (newHostingNode != null)
				msgs = ((InternalEObject) newHostingNode).eInverseAdd(this,
						FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES, Node.class, msgs);
			msgs = basicSetHostingNode(newHostingNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE,
					newHostingNode, newHostingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE:
			if (hostingNode != null)
				msgs = ((InternalEObject) hostingNode).eInverseRemove(this,
						FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES, Node.class, msgs);
			return basicSetHostingNode((Node) otherEnd, msgs);
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
		case FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE:
			return basicSetHostingNode(null, msgs);
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
		case FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE:
			if (resolve)
				return getHostingNode();
			return basicGetHostingNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE:
			setHostingNode((Node) newValue);
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
		case FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE:
			setHostingNode((Node) null);
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
		case FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE:
			return hostingNode != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualNodeImpl
