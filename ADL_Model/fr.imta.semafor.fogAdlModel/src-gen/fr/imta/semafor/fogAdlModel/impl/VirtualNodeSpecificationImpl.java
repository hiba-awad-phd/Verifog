/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.NodeType;
import fr.imta.semafor.fogAdlModel.ServiceType;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Node Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl#getImageName <em>Image Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl#getImageRegistry <em>Image Registry</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl#getHosts <em>Hosts</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl#getHostingNode <em>Hosting Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualNodeSpecificationImpl extends NodeTypeImpl implements VirtualNodeSpecification {
	/**
	 * The default value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected String imageName = IMAGE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getImageRegistry() <em>Image Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_REGISTRY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImageRegistry() <em>Image Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRegistry()
	 * @generated
	 * @ordered
	 */
	protected String imageRegistry = IMAGE_REGISTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> replicas;

	/**
	 * The cached value of the '{@link #getHosts() <em>Hosts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> hosts;

	/**
	 * The cached value of the '{@link #getHostingNode() <em>Hosting Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostingNode()
	 * @generated
	 * @ordered
	 */
	protected NodeType hostingNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.VIRTUAL_NODE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageName(String newImageName) {
		String oldImageName = imageName;
		imageName = newImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME, oldImageName, imageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageRegistry() {
		return imageRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageRegistry(String newImageRegistry) {
		String oldImageRegistry = imageRegistry;
		imageRegistry = newImageRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY, oldImageRegistry, imageRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getReplicas() {
		if (replicas == null) {
			replicas = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__REPLICAS);
		}
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getHosts() {
		if (hosts == null) {
			hosts = new EObjectWithInverseResolvingEList.ManyInverse<ServiceType>(ServiceType.class, this,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS, FogAdlModelPackage.SERVICE_TYPE__HOSTED_ON);
		}
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getHostingNode() {
		return hostingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostingNode(NodeType newHostingNode, NotificationChain msgs) {
		NodeType oldHostingNode = hostingNode;
		hostingNode = newHostingNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE, oldHostingNode, newHostingNode);
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
	public void setHostingNode(NodeType newHostingNode) {
		if (newHostingNode != hostingNode) {
			NotificationChain msgs = null;
			if (hostingNode != null)
				msgs = ((InternalEObject) hostingNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE, null,
						msgs);
			if (newHostingNode != null)
				msgs = ((InternalEObject) newHostingNode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE, null,
						msgs);
			msgs = basicSetHostingNode(newHostingNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE, newHostingNode, newHostingNode));
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
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHosts()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__REPLICAS:
			return ((InternalEList<?>) getReplicas()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS:
			return ((InternalEList<?>) getHosts()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE:
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
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME:
			return getImageName();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY:
			return getImageRegistry();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__REPLICAS:
			return getReplicas();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS:
			return getHosts();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE:
			return getHostingNode();
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
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME:
			setImageName((String) newValue);
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY:
			setImageRegistry((String) newValue);
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__REPLICAS:
			getReplicas().clear();
			getReplicas().addAll((Collection<? extends Constraint>) newValue);
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS:
			getHosts().clear();
			getHosts().addAll((Collection<? extends ServiceType>) newValue);
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE:
			setHostingNode((NodeType) newValue);
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
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME:
			setImageName(IMAGE_NAME_EDEFAULT);
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY:
			setImageRegistry(IMAGE_REGISTRY_EDEFAULT);
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__REPLICAS:
			getReplicas().clear();
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS:
			getHosts().clear();
			return;
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE:
			setHostingNode((NodeType) null);
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
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME:
			return IMAGE_NAME_EDEFAULT == null ? imageName != null : !IMAGE_NAME_EDEFAULT.equals(imageName);
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY:
			return IMAGE_REGISTRY_EDEFAULT == null ? imageRegistry != null
					: !IMAGE_REGISTRY_EDEFAULT.equals(imageRegistry);
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__REPLICAS:
			return replicas != null && !replicas.isEmpty();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTS:
			return hosts != null && !hosts.isEmpty();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE:
			return hostingNode != null;
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
		result.append(" (imageName: ");
		result.append(imageName);
		result.append(", imageRegistry: ");
		result.append(imageRegistry);
		result.append(')');
		return result.toString();
	}

} //VirtualNodeSpecificationImpl
