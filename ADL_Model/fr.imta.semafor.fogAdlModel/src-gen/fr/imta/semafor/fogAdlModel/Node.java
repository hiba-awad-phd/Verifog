/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getCpuArchitecture <em>Cpu Architecture</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getRuntimes <em>Runtimes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getHealthStatus <em>Health Status</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getHostedVirtualNodes <em>Hosted Virtual Nodes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getCPUCores <em>CPU Cores</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getMemory <em>Memory</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getDiskStorage <em>Disk Storage</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getReferenceToVirtualNodeType <em>Reference To Virtual Node Type</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getUploadLink <em>Upload Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getDownloadLink <em>Download Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Node#getHostedServices <em>Hosted Services</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends FogResource {
	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(NodeType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_IsInstanceOf()
	 * @model
	 * @generated
	 */
	NodeType getIsInstanceOf();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(NodeType value);

	/**
	 * Returns the value of the '<em><b>Cpu Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.CPUArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Architecture</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.CPUArchitecture
	 * @see #setCpuArchitecture(CPUArchitecture)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_CpuArchitecture()
	 * @model
	 * @generated
	 */
	CPUArchitecture getCpuArchitecture();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getCpuArchitecture <em>Cpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Architecture</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.CPUArchitecture
	 * @see #getCpuArchitecture()
	 * @generated
	 */
	void setCpuArchitecture(CPUArchitecture value);

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.OperatingSystem
	 * @see #setOperatingSystem(OperatingSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_OperatingSystem()
	 * @model
	 * @generated
	 */
	OperatingSystem getOperatingSystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.OperatingSystem
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OperatingSystem value);

	/**
	 * Returns the value of the '<em><b>Runtimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtimes</em>' attribute.
	 * @see #setRuntimes(byte[])
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_Runtimes()
	 * @model
	 * @generated
	 */
	byte[] getRuntimes();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getRuntimes <em>Runtimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtimes</em>' attribute.
	 * @see #getRuntimes()
	 * @generated
	 */
	void setRuntimes(byte[] value);

	/**
	 * Returns the value of the '<em><b>Health Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.HealthStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Status</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.HealthStatus
	 * @see #setHealthStatus(HealthStatus)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_HealthStatus()
	 * @model
	 * @generated
	 */
	HealthStatus getHealthStatus();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getHealthStatus <em>Health Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Status</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.HealthStatus
	 * @see #getHealthStatus()
	 * @generated
	 */
	void setHealthStatus(HealthStatus value);

	/**
	 * Returns the value of the '<em><b>Hosted Virtual Nodes</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.VirtualNode}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.VirtualNode#getHostingNode <em>Hosting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Virtual Nodes</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_HostedVirtualNodes()
	 * @see fr.imta.semafor.fogAdlModel.VirtualNode#getHostingNode
	 * @model opposite="hostingNode"
	 * @generated
	 */
	EList<VirtualNode> getHostedVirtualNodes();

	/**
	 * Returns the value of the '<em><b>CPU Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU Cores</em>' attribute.
	 * @see #setCPUCores(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_CPUCores()
	 * @model
	 * @generated
	 */
	int getCPUCores();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getCPUCores <em>CPU Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Cores</em>' attribute.
	 * @see #getCPUCores()
	 * @generated
	 */
	void setCPUCores(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_Memory()
	 * @model
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

	/**
	 * Returns the value of the '<em><b>Disk Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Storage</em>' attribute.
	 * @see #setDiskStorage(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_DiskStorage()
	 * @model
	 * @generated
	 */
	int getDiskStorage();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getDiskStorage <em>Disk Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Storage</em>' attribute.
	 * @see #getDiskStorage()
	 * @generated
	 */
	void setDiskStorage(int value);

	/**
	 * Returns the value of the '<em><b>Reference To Virtual Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To Virtual Node Type</em>' attribute.
	 * @see #setReferenceToVirtualNodeType(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_ReferenceToVirtualNodeType()
	 * @model
	 * @generated
	 */
	String getReferenceToVirtualNodeType();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Node#getReferenceToVirtualNodeType <em>Reference To Virtual Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference To Virtual Node Type</em>' attribute.
	 * @see #getReferenceToVirtualNodeType()
	 * @generated
	 */
	void setReferenceToVirtualNodeType(String value);

	/**
	 * Returns the value of the '<em><b>Upload Link</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLink}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Link</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_UploadLink()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNode
	 * @model opposite="sourceNode" containment="true"
	 * @generated
	 */
	EList<NetworkLink> getUploadLink();

	/**
	 * Returns the value of the '<em><b>Download Link</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLink}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Link</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_DownloadLink()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNode
	 * @model opposite="targetNode" containment="true"
	 * @generated
	 */
	EList<NetworkLink> getDownloadLink();

	/**
	 * Returns the value of the '<em><b>Hosted Services</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Service}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Service#getHostingNode <em>Hosting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Services</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNode_HostedServices()
	 * @see fr.imta.semafor.fogAdlModel.Service#getHostingNode
	 * @model opposite="hostingNode"
	 * @generated
	 */
	EList<Service> getHostedServices();

} // Node
