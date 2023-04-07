/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getHostedOn <em>Hosted On</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getNetworkPorts <em>Network Ports</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getIncomingDataflows <em>Incoming Dataflows</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceType#getOutcomingDataflows <em>Outcoming Dataflows</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType()
 * @model
 * @generated
 */
public interface ServiceType extends FogResource {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Application#getServiceTypes <em>Service Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_Application()
	 * @see fr.imta.semafor.fogAdlModel.Application#getServiceTypes
	 * @model opposite="serviceTypes" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.ServiceType#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Hosted On</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted On</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_HostedOn()
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHosts
	 * @model opposite="hosts"
	 * @generated
	 */
	EList<VirtualNodeSpecification> getHostedOn();

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.SoftwarePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_ImplementedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwarePackage> getImplementedBy();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Service}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Service#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_Instances()
	 * @see fr.imta.semafor.fogAdlModel.Service#getInstanceOf
	 * @model opposite="instanceOf"
	 * @generated
	 */
	EList<Service> getInstances();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Network Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Ports</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_NetworkPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkPort> getNetworkPorts();

	/**
	 * Returns the value of the '<em><b>Incoming Dataflows</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getTargetServices <em>Target Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Dataflows</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_IncomingDataflows()
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getTargetServices
	 * @model opposite="targetServices"
	 * @generated
	 */
	EList<ConnectorType> getIncomingDataflows();

	/**
	 * Returns the value of the '<em><b>Outcoming Dataflows</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getSourceServices <em>Source Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcoming Dataflows</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceType_OutcomingDataflows()
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getSourceServices
	 * @model opposite="sourceServices"
	 * @generated
	 */
	EList<ConnectorType> getOutcomingDataflows();

} // ServiceType
