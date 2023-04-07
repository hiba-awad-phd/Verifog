/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkPort#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkPort#getPortName <em>Port Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkPort#getHostPort <em>Host Port</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkPort()
 * @model
 * @generated
 */
public interface NetworkPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.TransportProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.TransportProtocol
	 * @see #setProtocol(TransportProtocol)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkPort_Protocol()
	 * @model
	 * @generated
	 */
	TransportProtocol getProtocol();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.TransportProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(TransportProtocol value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkPort_PortNumber()
	 * @model
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

	/**
	 * Returns the value of the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Name</em>' attribute.
	 * @see #setPortName(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkPort_PortName()
	 * @model
	 * @generated
	 */
	String getPortName();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getPortName <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Name</em>' attribute.
	 * @see #getPortName()
	 * @generated
	 */
	void setPortName(String value);

	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkPort_HostPort()
	 * @model
	 * @generated
	 */
	int getHostPort();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(int value);

} // NetworkPort
