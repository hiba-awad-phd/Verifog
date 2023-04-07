/**
 */
package fr.imta.semafor.fogAdlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.VirtualNode#getHostingNode <em>Hosting Node</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNode()
 * @model
 * @generated
 */
public interface VirtualNode extends Node {

	/**
	 * Returns the value of the '<em><b>Hosting Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Node#getHostedVirtualNodes <em>Hosted Virtual Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosting Node</em>' reference.
	 * @see #setHostingNode(Node)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getVirtualNode_HostingNode()
	 * @see fr.imta.semafor.fogAdlModel.Node#getHostedVirtualNodes
	 * @model opposite="hostedVirtualNodes"
	 * @generated
	 */
	Node getHostingNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.VirtualNode#getHostingNode <em>Hosting Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosting Node</em>' reference.
	 * @see #getHostingNode()
	 * @generated
	 */
	void setHostingNode(Node value);
} // VirtualNode
