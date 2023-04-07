/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Connector#getTargetServices <em>Target Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Connector#getSourceServices <em>Source Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Connector#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Connector#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends FogResource {
	/**
	 * Returns the value of the '<em><b>Target Services</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Service}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Service#getIncomingDataflows <em>Incoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Services</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnector_TargetServices()
	 * @see fr.imta.semafor.fogAdlModel.Service#getIncomingDataflows
	 * @model opposite="incomingDataflows"
	 * @generated
	 */
	EList<Service> getTargetServices();

	/**
	 * Returns the value of the '<em><b>Source Services</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Service}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Service#getOutcomingDataflows <em>Outcoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Services</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnector_SourceServices()
	 * @see fr.imta.semafor.fogAdlModel.Service#getOutcomingDataflows
	 * @model opposite="outcomingDataflows"
	 * @generated
	 */
	EList<Service> getSourceServices();

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(ConnectorType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnector_InstanceOf()
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ConnectorType getInstanceOf();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Connector#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Application#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConnector_Application()
	 * @see fr.imta.semafor.fogAdlModel.Application#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Connector#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Connector
