/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Network#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Network#getDownloadLinks <em>Download Links</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Network#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Network#getUploadlinks <em>Uploadlinks</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends FogResource {
	/**
	 * Returns the value of the '<em><b>Fogsystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogSystem#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogsystem</em>' container reference.
	 * @see #setFogsystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetwork_Fogsystem()
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getNetworks
	 * @model opposite="networks" transient="false"
	 * @generated
	 */
	FogSystem getFogsystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Network#getFogsystem <em>Fogsystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogsystem</em>' container reference.
	 * @see #getFogsystem()
	 * @generated
	 */
	void setFogsystem(FogSystem value);

	/**
	 * Returns the value of the '<em><b>Download Links</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLink}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNetwork <em>Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Links</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetwork_DownloadLinks()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNetwork
	 * @model opposite="targetNetwork"
	 * @generated
	 */
	EList<NetworkLink> getDownloadLinks();

	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(NetworkType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetwork_IsInstanceOf()
	 * @model
	 * @generated
	 */
	NetworkType getIsInstanceOf();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Network#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(NetworkType value);

	/**
	 * Returns the value of the '<em><b>Uploadlinks</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkLink}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNetworks <em>Source Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploadlinks</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetwork_Uploadlinks()
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNetworks
	 * @model opposite="sourceNetworks"
	 * @generated
	 */
	EList<NetworkLink> getUploadlinks();

} // Network
