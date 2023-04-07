/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NodeType#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NodeType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NodeType#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NodeType#getDownloadLink <em>Download Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NodeType#getUploadLink <em>Upload Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NodeType#getHostedNode <em>Hosted Node</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType()
 * @model
 * @generated
 */
public interface NodeType extends FogResource {
	/**
	 * Returns the value of the '<em><b>Fogsystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogSystem#getPhysicalnodespecification <em>Physicalnodespecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogsystem</em>' container reference.
	 * @see #setFogsystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType_Fogsystem()
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getPhysicalnodespecification
	 * @model opposite="physicalnodespecification" transient="false"
	 * @generated
	 */
	FogSystem getFogsystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NodeType#getFogsystem <em>Fogsystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogsystem</em>' container reference.
	 * @see #getFogsystem()
	 * @generated
	 */
	void setFogsystem(FogSystem value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType_Instances()
	 * @model
	 * @generated
	 */
	EList<Node> getInstances();

	/**
	 * Returns the value of the '<em><b>Download Link</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLinkType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Link</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType_DownloadLink()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNode
	 * @model opposite="sourceNode" containment="true"
	 * @generated
	 */
	EList<NetworkLinkType> getDownloadLink();

	/**
	 * Returns the value of the '<em><b>Upload Link</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLinkType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Link</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType_UploadLink()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNode
	 * @model opposite="targetNode" containment="true"
	 * @generated
	 */
	EList<NetworkLinkType> getUploadLink();

	/**
	 * Returns the value of the '<em><b>Hosted Node</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Node</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNodeType_HostedNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualNodeSpecification> getHostedNode();

} // NodeType
