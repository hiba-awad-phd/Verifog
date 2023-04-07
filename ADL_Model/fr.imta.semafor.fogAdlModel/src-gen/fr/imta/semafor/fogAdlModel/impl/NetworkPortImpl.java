/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.NetworkPort;
import fr.imta.semafor.fogAdlModel.TransportProtocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl#getHostPort <em>Host Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkPortImpl extends MinimalEObjectImpl.Container implements NetworkPort {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final TransportProtocol PROTOCOL_EDEFAULT = TransportProtocol.TCP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected TransportProtocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected String portName = PORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected int hostPort = HOST_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.NETWORK_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(TransportProtocol newProtocol) {
		TransportProtocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_PORT__PROTOCOL,
					oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_PORT__PORT_NUMBER,
					oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortName(String newPortName) {
		String oldPortName = portName;
		portName = newPortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_PORT__PORT_NAME,
					oldPortName, portName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHostPort() {
		return hostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPort(int newHostPort) {
		int oldHostPort = hostPort;
		hostPort = newHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.NETWORK_PORT__HOST_PORT,
					oldHostPort, hostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.NETWORK_PORT__PROTOCOL:
			return getProtocol();
		case FogAdlModelPackage.NETWORK_PORT__PORT_NUMBER:
			return getPortNumber();
		case FogAdlModelPackage.NETWORK_PORT__PORT_NAME:
			return getPortName();
		case FogAdlModelPackage.NETWORK_PORT__HOST_PORT:
			return getHostPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FogAdlModelPackage.NETWORK_PORT__PROTOCOL:
			setProtocol((TransportProtocol) newValue);
			return;
		case FogAdlModelPackage.NETWORK_PORT__PORT_NUMBER:
			setPortNumber((Integer) newValue);
			return;
		case FogAdlModelPackage.NETWORK_PORT__PORT_NAME:
			setPortName((String) newValue);
			return;
		case FogAdlModelPackage.NETWORK_PORT__HOST_PORT:
			setHostPort((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FogAdlModelPackage.NETWORK_PORT__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case FogAdlModelPackage.NETWORK_PORT__PORT_NUMBER:
			setPortNumber(PORT_NUMBER_EDEFAULT);
			return;
		case FogAdlModelPackage.NETWORK_PORT__PORT_NAME:
			setPortName(PORT_NAME_EDEFAULT);
			return;
		case FogAdlModelPackage.NETWORK_PORT__HOST_PORT:
			setHostPort(HOST_PORT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FogAdlModelPackage.NETWORK_PORT__PROTOCOL:
			return protocol != PROTOCOL_EDEFAULT;
		case FogAdlModelPackage.NETWORK_PORT__PORT_NUMBER:
			return portNumber != PORT_NUMBER_EDEFAULT;
		case FogAdlModelPackage.NETWORK_PORT__PORT_NAME:
			return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
		case FogAdlModelPackage.NETWORK_PORT__HOST_PORT:
			return hostPort != HOST_PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", portNumber: ");
		result.append(portNumber);
		result.append(", portName: ");
		result.append(portName);
		result.append(", hostPort: ");
		result.append(hostPort);
		result.append(')');
		return result.toString();
	}

} //NetworkPortImpl
