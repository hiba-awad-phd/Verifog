/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Service#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Service#getHostingNode <em>Hosting Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Service#getNetworkports <em>Networkports</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Service#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Service#getIncomingDataflows <em>Incoming Dataflows</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Service#getOutcomingDataflows <em>Outcoming Dataflows</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends FogResource {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ServiceType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(ServiceType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService_InstanceOf()
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ServiceType getInstanceOf();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Service#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Hosting Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Node#getHostedServices <em>Hosted Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosting Node</em>' reference.
	 * @see #setHostingNode(Node)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService_HostingNode()
	 * @see fr.imta.semafor.fogAdlModel.Node#getHostedServices
	 * @model opposite="hostedServices"
	 * @generated
	 */
	Node getHostingNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Service#getHostingNode <em>Hosting Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosting Node</em>' reference.
	 * @see #getHostingNode()
	 * @generated
	 */
	void setHostingNode(Node value);

	/**
	 * Returns the value of the '<em><b>Networkports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkports</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService_Networkports()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkPort> getNetworkports();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Application#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService_Application()
	 * @see fr.imta.semafor.fogAdlModel.Application#getServices
	 * @model opposite="services" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Service#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Incoming Dataflows</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Connector}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Connector#getTargetServices <em>Target Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Dataflows</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService_IncomingDataflows()
	 * @see fr.imta.semafor.fogAdlModel.Connector#getTargetServices
	 * @model opposite="targetServices"
	 * @generated
	 */
	EList<Connector> getIncomingDataflows();

	/**
	 * Returns the value of the '<em><b>Outcoming Dataflows</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Connector}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Connector#getSourceServices <em>Source Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcoming Dataflows</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getService_OutcomingDataflows()
	 * @see fr.imta.semafor.fogAdlModel.Connector#getSourceServices
	 * @model opposite="sourceServices"
	 * @generated
	 */
	EList<Connector> getOutcomingDataflows();

} // Service
