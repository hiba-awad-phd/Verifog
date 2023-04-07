/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceSpecification#getApplication <em>Application</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceSpecification#getHostedOn <em>Hosted On</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceSpecification#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.ServiceSpecification#getOpenPortsort <em>Open Portsort</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceSpecification()
 * @model
 * @generated
 */
public interface ServiceSpecification extends FogResource {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Application#getServiceSpecifications <em>Service Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceSpecification_Application()
	 * @see fr.imta.semafor.fogAdlModel.Application#getServiceSpecifications
	 * @model opposite="serviceSpecifications" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.ServiceSpecification#getApplication <em>Application</em>}' container reference.
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
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceSpecification_HostedOn()
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHosts
	 * @model opposite="hosts"
	 * @generated
	 */
	EList<VirtualNodeSpecification> getHostedOn();

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Executable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceSpecification_ImplementedBy()
	 * @model
	 * @generated
	 */
	EList<Executable> getImplementedBy();

	/**
	 * Returns the value of the '<em><b>Open Portsort</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Portsort</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getServiceSpecification_OpenPortsort()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkPort> getOpenPortsort();

} // ServiceSpecification
