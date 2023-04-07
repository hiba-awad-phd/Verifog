/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Application#getFogSystem <em>Fog System</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Application#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Application#getServices <em>Services</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Application#getConnectortypes <em>Connectortypes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Application#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Application#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends FogResource {
	/**
	 * Returns the value of the '<em><b>Fog System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogSystem#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fog System</em>' reference.
	 * @see #setFogSystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication_FogSystem()
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getApplications
	 * @model opposite="applications"
	 * @generated
	 */
	FogSystem getFogSystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Application#getFogSystem <em>Fog System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fog System</em>' reference.
	 * @see #getFogSystem()
	 * @generated
	 */
	void setFogSystem(FogSystem value);

	/**
	 * Returns the value of the '<em><b>Service Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ServiceType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ServiceType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Types</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication_ServiceTypes()
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<ServiceType> getServiceTypes();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Service}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Service#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication_Services()
	 * @see fr.imta.semafor.fogAdlModel.Service#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Connectortypes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectortypes</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication_Connectortypes()
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<ConnectorType> getConnectortypes();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Connector}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Connector#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication_Connectors()
	 * @see fr.imta.semafor.fogAdlModel.Connector#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getApplication_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Application
