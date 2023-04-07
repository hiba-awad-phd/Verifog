/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.CPUArchitecture;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.HealthStatus;
import fr.imta.semafor.fogAdlModel.NetworkLink;
import fr.imta.semafor.fogAdlModel.Node;
import fr.imta.semafor.fogAdlModel.NodeType;
import fr.imta.semafor.fogAdlModel.OperatingSystem;

import fr.imta.semafor.fogAdlModel.Service;
import fr.imta.semafor.fogAdlModel.VirtualNode;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getCpuArchitecture <em>Cpu Architecture</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getRuntimes <em>Runtimes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getHealthStatus <em>Health Status</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getHostedVirtualNodes <em>Hosted Virtual Nodes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getCPUCores <em>CPU Cores</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getDiskStorage <em>Disk Storage</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getReferenceToVirtualNodeType <em>Reference To Virtual Node Type</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getUploadLink <em>Upload Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getDownloadLink <em>Download Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl#getHostedServices <em>Hosted Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends FogResourceImpl implements Node {
	/**
	 * The cached value of the '{@link #getIsInstanceOf() <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected NodeType isInstanceOf;

	/**
	 * The default value of the '{@link #getCpuArchitecture() <em>Cpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final CPUArchitecture CPU_ARCHITECTURE_EDEFAULT = CPUArchitecture.INTEL;

	/**
	 * The cached value of the '{@link #getCpuArchitecture() <em>Cpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuArchitecture()
	 * @generated
	 * @ordered
	 */
	protected CPUArchitecture cpuArchitecture = CPU_ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final OperatingSystem OPERATING_SYSTEM_EDEFAULT = OperatingSystem.LINUX;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem operatingSystem = OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimes() <em>Runtimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimes()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RUNTIMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimes() <em>Runtimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimes()
	 * @generated
	 * @ordered
	 */
	protected byte[] runtimes = RUNTIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthStatus() <em>Health Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatus()
	 * @generated
	 * @ordered
	 */
	protected static final HealthStatus HEALTH_STATUS_EDEFAULT = HealthStatus.UP;

	/**
	 * The cached value of the '{@link #getHealthStatus() <em>Health Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatus()
	 * @generated
	 * @ordered
	 */
	protected HealthStatus healthStatus = HEALTH_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostedVirtualNodes() <em>Hosted Virtual Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedVirtualNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualNode> hostedVirtualNodes;

	/**
	 * The default value of the '{@link #getCPUCores() <em>CPU Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCPUCores() <em>CPU Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUCores()
	 * @generated
	 * @ordered
	 */
	protected int cpuCores = CPU_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskStorage() <em>Disk Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiskStorage() <em>Disk Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskStorage()
	 * @generated
	 * @ordered
	 */
	protected int diskStorage = DISK_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceToVirtualNodeType() <em>Reference To Virtual Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceToVirtualNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_TO_VIRTUAL_NODE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceToVirtualNodeType() <em>Reference To Virtual Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceToVirtualNodeType()
	 * @generated
	 * @ordered
	 */
	protected String referenceToVirtualNodeType = REFERENCE_TO_VIRTUAL_NODE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUploadLink() <em>Upload Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadLink()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLink> uploadLink;

	/**
	 * The cached value of the '{@link #getDownloadLink() <em>Download Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadLink()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkLink> downloadLink;

	/**
	 * The cached value of the '{@link #getHostedServices() <em>Hosted Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> hostedServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getIsInstanceOf() {
		if (isInstanceOf != null && isInstanceOf.eIsProxy()) {
			InternalEObject oldIsInstanceOf = (InternalEObject) isInstanceOf;
			isInstanceOf = (NodeType) eResolveProxy(oldIsInstanceOf);
			if (isInstanceOf != oldIsInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.NODE__IS_INSTANCE_OF,
							oldIsInstanceOf, isInstanceOf));
			}
		}
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType basicGetIsInstanceOf() {
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInstanceOf(NodeType newIsInstanceOf) {
		NodeType oldIsInstanceOf = isInstanceOf;
		isInstanceOf = newIsInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__IS_INSTANCE_OF,
					oldIsInstanceOf, isInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUArchitecture getCpuArchitecture() {
		return cpuArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuArchitecture(CPUArchitecture newCpuArchitecture) {
		CPUArchitecture oldCpuArchitecture = cpuArchitecture;
		cpuArchitecture = newCpuArchitecture == null ? CPU_ARCHITECTURE_EDEFAULT : newCpuArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__CPU_ARCHITECTURE,
					oldCpuArchitecture, cpuArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSystem(OperatingSystem newOperatingSystem) {
		OperatingSystem oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem == null ? OPERATING_SYSTEM_EDEFAULT : newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__OPERATING_SYSTEM,
					oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getRuntimes() {
		return runtimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimes(byte[] newRuntimes) {
		byte[] oldRuntimes = runtimes;
		runtimes = newRuntimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__RUNTIMES, oldRuntimes,
					runtimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatus getHealthStatus() {
		return healthStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthStatus(HealthStatus newHealthStatus) {
		HealthStatus oldHealthStatus = healthStatus;
		healthStatus = newHealthStatus == null ? HEALTH_STATUS_EDEFAULT : newHealthStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__HEALTH_STATUS,
					oldHealthStatus, healthStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualNode> getHostedVirtualNodes() {
		if (hostedVirtualNodes == null) {
			hostedVirtualNodes = new EObjectWithInverseResolvingEList<VirtualNode>(VirtualNode.class, this,
					FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES, FogAdlModelPackage.VIRTUAL_NODE__HOSTING_NODE);
		}
		return hostedVirtualNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCPUCores() {
		return cpuCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPUCores(int newCPUCores) {
		int oldCPUCores = cpuCores;
		cpuCores = newCPUCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__CPU_CORES, oldCPUCores,
					cpuCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiskStorage() {
		return diskStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskStorage(int newDiskStorage) {
		int oldDiskStorage = diskStorage;
		diskStorage = newDiskStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NODE__DISK_STORAGE, oldDiskStorage,
					diskStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceToVirtualNodeType() {
		return referenceToVirtualNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceToVirtualNodeType(String newReferenceToVirtualNodeType) {
		String oldReferenceToVirtualNodeType = referenceToVirtualNodeType;
		referenceToVirtualNodeType = newReferenceToVirtualNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE, oldReferenceToVirtualNodeType,
					referenceToVirtualNodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLink> getUploadLink() {
		if (uploadLink == null) {
			uploadLink = new EObjectContainmentWithInverseEList<NetworkLink>(NetworkLink.class, this,
					FogAdlModelPackage.NODE__UPLOAD_LINK, FogAdlModelPackage.NETWORK_LINK__SOURCE_NODE);
		}
		return uploadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkLink> getDownloadLink() {
		if (downloadLink == null) {
			downloadLink = new EObjectContainmentWithInverseEList<NetworkLink>(NetworkLink.class, this,
					FogAdlModelPackage.NODE__DOWNLOAD_LINK, FogAdlModelPackage.NETWORK_LINK__TARGET_NODE);
		}
		return downloadLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getHostedServices() {
		if (hostedServices == null) {
			hostedServices = new EObjectWithInverseResolvingEList<Service>(Service.class, this,
					FogAdlModelPackage.NODE__HOSTED_SERVICES, FogAdlModelPackage.SERVICE__HOSTING_NODE);
		}
		return hostedServices;
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
		case FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHostedVirtualNodes()).basicAdd(otherEnd,
					msgs);
		case FogAdlModelPackage.NODE__UPLOAD_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUploadLink()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.NODE__DOWNLOAD_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDownloadLink()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.NODE__HOSTED_SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHostedServices()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES:
			return ((InternalEList<?>) getHostedVirtualNodes()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NODE__UPLOAD_LINK:
			return ((InternalEList<?>) getUploadLink()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NODE__DOWNLOAD_LINK:
			return ((InternalEList<?>) getDownloadLink()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.NODE__HOSTED_SERVICES:
			return ((InternalEList<?>) getHostedServices()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.NODE__IS_INSTANCE_OF:
			if (resolve)
				return getIsInstanceOf();
			return basicGetIsInstanceOf();
		case FogAdlModelPackage.NODE__CPU_ARCHITECTURE:
			return getCpuArchitecture();
		case FogAdlModelPackage.NODE__OPERATING_SYSTEM:
			return getOperatingSystem();
		case FogAdlModelPackage.NODE__RUNTIMES:
			return getRuntimes();
		case FogAdlModelPackage.NODE__HEALTH_STATUS:
			return getHealthStatus();
		case FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES:
			return getHostedVirtualNodes();
		case FogAdlModelPackage.NODE__CPU_CORES:
			return getCPUCores();
		case FogAdlModelPackage.NODE__MEMORY:
			return getMemory();
		case FogAdlModelPackage.NODE__DISK_STORAGE:
			return getDiskStorage();
		case FogAdlModelPackage.NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE:
			return getReferenceToVirtualNodeType();
		case FogAdlModelPackage.NODE__UPLOAD_LINK:
			return getUploadLink();
		case FogAdlModelPackage.NODE__DOWNLOAD_LINK:
			return getDownloadLink();
		case FogAdlModelPackage.NODE__HOSTED_SERVICES:
			return getHostedServices();
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
		case FogAdlModelPackage.NODE__IS_INSTANCE_OF:
			setIsInstanceOf((NodeType) newValue);
			return;
		case FogAdlModelPackage.NODE__CPU_ARCHITECTURE:
			setCpuArchitecture((CPUArchitecture) newValue);
			return;
		case FogAdlModelPackage.NODE__OPERATING_SYSTEM:
			setOperatingSystem((OperatingSystem) newValue);
			return;
		case FogAdlModelPackage.NODE__RUNTIMES:
			setRuntimes((byte[]) newValue);
			return;
		case FogAdlModelPackage.NODE__HEALTH_STATUS:
			setHealthStatus((HealthStatus) newValue);
			return;
		case FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES:
			getHostedVirtualNodes().clear();
			getHostedVirtualNodes().addAll((Collection<? extends VirtualNode>) newValue);
			return;
		case FogAdlModelPackage.NODE__CPU_CORES:
			setCPUCores((Integer) newValue);
			return;
		case FogAdlModelPackage.NODE__MEMORY:
			setMemory((Integer) newValue);
			return;
		case FogAdlModelPackage.NODE__DISK_STORAGE:
			setDiskStorage((Integer) newValue);
			return;
		case FogAdlModelPackage.NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE:
			setReferenceToVirtualNodeType((String) newValue);
			return;
		case FogAdlModelPackage.NODE__UPLOAD_LINK:
			getUploadLink().clear();
			getUploadLink().addAll((Collection<? extends NetworkLink>) newValue);
			return;
		case FogAdlModelPackage.NODE__DOWNLOAD_LINK:
			getDownloadLink().clear();
			getDownloadLink().addAll((Collection<? extends NetworkLink>) newValue);
			return;
		case FogAdlModelPackage.NODE__HOSTED_SERVICES:
			getHostedServices().clear();
			getHostedServices().addAll((Collection<? extends Service>) newValue);
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
		case FogAdlModelPackage.NODE__IS_INSTANCE_OF:
			setIsInstanceOf((NodeType) null);
			return;
		case FogAdlModelPackage.NODE__CPU_ARCHITECTURE:
			setCpuArchitecture(CPU_ARCHITECTURE_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__OPERATING_SYSTEM:
			setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__RUNTIMES:
			setRuntimes(RUNTIMES_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__HEALTH_STATUS:
			setHealthStatus(HEALTH_STATUS_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES:
			getHostedVirtualNodes().clear();
			return;
		case FogAdlModelPackage.NODE__CPU_CORES:
			setCPUCores(CPU_CORES_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__MEMORY:
			setMemory(MEMORY_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__DISK_STORAGE:
			setDiskStorage(DISK_STORAGE_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE:
			setReferenceToVirtualNodeType(REFERENCE_TO_VIRTUAL_NODE_TYPE_EDEFAULT);
			return;
		case FogAdlModelPackage.NODE__UPLOAD_LINK:
			getUploadLink().clear();
			return;
		case FogAdlModelPackage.NODE__DOWNLOAD_LINK:
			getDownloadLink().clear();
			return;
		case FogAdlModelPackage.NODE__HOSTED_SERVICES:
			getHostedServices().clear();
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
		case FogAdlModelPackage.NODE__IS_INSTANCE_OF:
			return isInstanceOf != null;
		case FogAdlModelPackage.NODE__CPU_ARCHITECTURE:
			return cpuArchitecture != CPU_ARCHITECTURE_EDEFAULT;
		case FogAdlModelPackage.NODE__OPERATING_SYSTEM:
			return operatingSystem != OPERATING_SYSTEM_EDEFAULT;
		case FogAdlModelPackage.NODE__RUNTIMES:
			return RUNTIMES_EDEFAULT == null ? runtimes != null : !RUNTIMES_EDEFAULT.equals(runtimes);
		case FogAdlModelPackage.NODE__HEALTH_STATUS:
			return healthStatus != HEALTH_STATUS_EDEFAULT;
		case FogAdlModelPackage.NODE__HOSTED_VIRTUAL_NODES:
			return hostedVirtualNodes != null && !hostedVirtualNodes.isEmpty();
		case FogAdlModelPackage.NODE__CPU_CORES:
			return cpuCores != CPU_CORES_EDEFAULT;
		case FogAdlModelPackage.NODE__MEMORY:
			return memory != MEMORY_EDEFAULT;
		case FogAdlModelPackage.NODE__DISK_STORAGE:
			return diskStorage != DISK_STORAGE_EDEFAULT;
		case FogAdlModelPackage.NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE:
			return REFERENCE_TO_VIRTUAL_NODE_TYPE_EDEFAULT == null ? referenceToVirtualNodeType != null
					: !REFERENCE_TO_VIRTUAL_NODE_TYPE_EDEFAULT.equals(referenceToVirtualNodeType);
		case FogAdlModelPackage.NODE__UPLOAD_LINK:
			return uploadLink != null && !uploadLink.isEmpty();
		case FogAdlModelPackage.NODE__DOWNLOAD_LINK:
			return downloadLink != null && !downloadLink.isEmpty();
		case FogAdlModelPackage.NODE__HOSTED_SERVICES:
			return hostedServices != null && !hostedServices.isEmpty();
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
		result.append(" (cpuArchitecture: ");
		result.append(cpuArchitecture);
		result.append(", OperatingSystem: ");
		result.append(operatingSystem);
		result.append(", runtimes: ");
		result.append(runtimes);
		result.append(", healthStatus: ");
		result.append(healthStatus);
		result.append(", CPUCores: ");
		result.append(cpuCores);
		result.append(", memory: ");
		result.append(memory);
		result.append(", diskStorage: ");
		result.append(diskStorage);
		result.append(", referenceToVirtualNodeType: ");
		result.append(referenceToVirtualNodeType);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
