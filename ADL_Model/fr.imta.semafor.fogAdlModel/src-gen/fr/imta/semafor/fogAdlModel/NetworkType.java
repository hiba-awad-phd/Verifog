/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkType#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkType#getDownloadlinks <em>Downloadlinks</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkType#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkType#getUploadLink <em>Upload Link</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkType()
 * @model
 * @generated
 */
public interface NetworkType extends FogResource {
	/**
	 * Returns the value of the '<em><b>Fogsystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogSystem#getNetworktypes <em>Networktypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogsystem</em>' container reference.
	 * @see #setFogsystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkType_Fogsystem()
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getNetworktypes
	 * @model opposite="networktypes" transient="false"
	 * @generated
	 */
	FogSystem getFogsystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkType#getFogsystem <em>Fogsystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogsystem</em>' container reference.
	 * @see #getFogsystem()
	 * @generated
	 */
	void setFogsystem(FogSystem value);

	/**
	 * Returns the value of the '<em><b>Downloadlinks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLinkType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNetwork <em>Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downloadlinks</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkType_Downloadlinks()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNetwork
	 * @model opposite="targetNetwork" containment="true"
	 * @generated
	 */
	EList<NetworkLinkType> getDownloadlinks();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkType_Instances()
	 * @model
	 * @generated
	 */
	EList<Network> getInstances();

	/**
	 * Returns the value of the '<em><b>Upload Link</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLinkType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNetworks <em>Source Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Link</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkType_UploadLink()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNetworks
	 * @model opposite="sourceNetworks" containment="true"
	 * @generated
	 */
	EList<NetworkLinkType> getUploadLink();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // NetworkType
