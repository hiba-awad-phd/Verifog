/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ConnectorType#getTargetServices <em>Target Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ConnectorType#getSourceServices <em>Source Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ConnectorType#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ConnectorType#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ConnectorType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnectorType()
 * @model
 * @generated
 */
public interface ConnectorType extends FogResource {
	/**
	 * Returns the value of the '<em><b>Target Services</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ServiceType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ServiceType#getIncomingDataflows <em>Incoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Services</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnectorType_TargetServices()
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getIncomingDataflows
	 * @model opposite="incomingDataflows"
	 * @generated
	 */
	EList<ServiceType> getTargetServices();

	/**
	 * Returns the value of the '<em><b>Source Services</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ServiceType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ServiceType#getOutcomingDataflows <em>Outcoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Services</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnectorType_SourceServices()
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getOutcomingDataflows
	 * @model opposite="outcomingDataflows"
	 * @generated
	 */
	EList<ServiceType> getSourceServices();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Application#getConnectortypes <em>Connectortypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnectorType_Application()
	 * @see fr.imta.semafor.fogAdlModel.Application#getConnectortypes
	 * @model opposite="connectortypes" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Connector}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Connector#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnectorType_Instances()
	 * @see fr.imta.semafor.fogAdlModel.Connector#getInstanceOf
	 * @model opposite="instanceOf"
	 * @generated
	 */
	EList<Connector> getInstances();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnectorType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // ConnectorType
