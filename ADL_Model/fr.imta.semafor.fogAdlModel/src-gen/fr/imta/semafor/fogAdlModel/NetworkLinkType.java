/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNetwork <em>Target Network</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNetworks <em>Source Networks</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType()
 * @model
 * @generated
 */
public interface NetworkLinkType extends FogResource {
	/**
	 * Returns the value of the '<em><b>Target Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkType#getDownloadlinks <em>Downloadlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Network</em>' container reference.
	 * @see #setTargetNetwork(NetworkType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType_TargetNetwork()
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getDownloadlinks
	 * @model opposite="downloadlinks" transient="false"
	 * @generated
	 */
	NetworkType getTargetNetwork();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNetwork <em>Target Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Network</em>' container reference.
	 * @see #getTargetNetwork()
	 * @generated
	 */
	void setTargetNetwork(NetworkType value);

	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NodeType#getDownloadLink <em>Download Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' container reference.
	 * @see #setSourceNode(NodeType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType_SourceNode()
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getDownloadLink
	 * @model opposite="downloadLink" transient="false"
	 * @generated
	 */
	NodeType getSourceNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNode <em>Source Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' container reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(NodeType value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NodeType#getUploadLink <em>Upload Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' container reference.
	 * @see #setTargetNode(NodeType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType_TargetNode()
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getUploadLink
	 * @model opposite="uploadLink" transient="false"
	 * @generated
	 */
	NodeType getTargetNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNode <em>Target Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' container reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(NodeType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLink}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType_Instances()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getIsInstanceOf
	 * @model opposite="isInstanceOf"
	 * @generated
	 */
	EList<NetworkLink> getInstances();

	/**
	 * Returns the value of the '<em><b>Source Networks</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkType#getUploadLink <em>Upload Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Networks</em>' container reference.
	 * @see #setSourceNetworks(NetworkType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType_SourceNetworks()
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getUploadLink
	 * @model opposite="uploadLink" transient="false"
	 * @generated
	 */
	NetworkType getSourceNetworks();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNetworks <em>Source Networks</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Networks</em>' container reference.
	 * @see #getSourceNetworks()
	 * @generated
	 */
	void setSourceNetworks(NetworkType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLinkType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // NetworkLinkType
