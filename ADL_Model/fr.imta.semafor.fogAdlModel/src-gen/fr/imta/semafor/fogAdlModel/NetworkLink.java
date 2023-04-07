/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNetwork <em>Target Network</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceIpAddress <em>Source Ip Address</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetIpAddress <em>Target Ip Address</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getBitrate <em>Bitrate</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNetworks <em>Source Networks</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink()
 * @model
 * @generated
 */
public interface NetworkLink extends FogResource {
	/**
	 * Returns the value of the '<em><b>Target Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Network#getDownloadLinks <em>Download Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Network</em>' reference.
	 * @see #setTargetNetwork(Network)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_TargetNetwork()
	 * @see fr.imta.semafor.fogAdlModel.Network#getDownloadLinks
	 * @model opposite="downloadLinks"
	 * @generated
	 */
	Network getTargetNetwork();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNetwork <em>Target Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Network</em>' reference.
	 * @see #getTargetNetwork()
	 * @generated
	 */
	void setTargetNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Node#getUploadLink <em>Upload Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' container reference.
	 * @see #setSourceNode(Node)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_SourceNode()
	 * @see fr.imta.semafor.fogAdlModel.Node#getUploadLink
	 * @model opposite="uploadLink" transient="false"
	 * @generated
	 */
	Node getSourceNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNode <em>Source Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' container reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(Node value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Node#getDownloadLink <em>Download Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' container reference.
	 * @see #setTargetNode(Node)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_TargetNode()
	 * @see fr.imta.semafor.fogAdlModel.Node#getDownloadLink
	 * @model opposite="downloadLink" transient="false"
	 * @generated
	 */
	Node getTargetNode();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNode <em>Target Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' container reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(Node value);

	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(NetworkLinkType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_IsInstanceOf()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	NetworkLinkType getIsInstanceOf();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(NetworkLinkType value);

	/**
	 * Returns the value of the '<em><b>Source Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ip Address</em>' attribute.
	 * @see #setSourceIpAddress(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_SourceIpAddress()
	 * @model
	 * @generated
	 */
	String getSourceIpAddress();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceIpAddress <em>Source Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ip Address</em>' attribute.
	 * @see #getSourceIpAddress()
	 * @generated
	 */
	void setSourceIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Target Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ip Address</em>' attribute.
	 * @see #setTargetIpAddress(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_TargetIpAddress()
	 * @model
	 * @generated
	 */
	String getTargetIpAddress();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetIpAddress <em>Target Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ip Address</em>' attribute.
	 * @see #getTargetIpAddress()
	 * @generated
	 */
	void setTargetIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Bitrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bitrate</em>' attribute.
	 * @see #setBitrate(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_Bitrate()
	 * @model
	 * @generated
	 */
	int getBitrate();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getBitrate <em>Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bitrate</em>' attribute.
	 * @see #getBitrate()
	 * @generated
	 */
	void setBitrate(int value);

	/**
	 * Returns the value of the '<em><b>Source Networks</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Network}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Network#getUploadlinks <em>Uploadlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Networks</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkLink_SourceNetworks()
	 * @see fr.imta.semafor.fogAdlModel.Network#getUploadlinks
	 * @model opposite="uploadlinks"
	 * @generated
	 */
	EList<Network> getSourceNetworks();

} // NetworkLink
