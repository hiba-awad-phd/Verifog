/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Node Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageName <em>Image Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageRegistry <em>Image Registry</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHosts <em>Hosts</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHostingNode <em>Hosting Node</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNodeSpecification()
 * @model
 * @generated
 */
public interface VirtualNodeSpecification extends NodeType {

	/**
	 * Returns the value of the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Name</em>' attribute.
	 * @see #setImageName(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNodeSpecification_ImageName()
	 * @model
	 * @generated
	 */
	String getImageName();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageName <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Name</em>' attribute.
	 * @see #getImageName()
	 * @generated
	 */
	void setImageName(String value);

	/**
	 * Returns the value of the '<em><b>Image Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Registry</em>' attribute.
	 * @see #setImageRegistry(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNodeSpecification_ImageRegistry()
	 * @model
	 * @generated
	 */
	String getImageRegistry();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageRegistry <em>Image Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Registry</em>' attribute.
	 * @see #getImageRegistry()
	 * @generated
	 */
	void setImageRegistry(String value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNodeSpecification_Replicas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getReplicas();

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ServiceType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.ServiceType#getHostedOn <em>Hosted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNodeSpecification_Hosts()
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getHostedOn
	 * @model opposite="hostedOn"
	 * @generated
	 */
	EList<ServiceType> getHosts();

	/**
	 * Returns the value of the '<em><b>Hosting Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosting Node</em>' containment reference.
	 * @see #setHostingNode(NodeType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNodeSpecification_HostingNode()
	 * @model containment="true"
	 * @generated
	 */
	NodeType getHostingNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHostingNode <em>Hosting Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosting Node</em>' containment reference.
	 * @see #getHostingNode()
	 * @generated
	 */
	void setHostingNode(NodeType value);
} // VirtualNodeSpecification
