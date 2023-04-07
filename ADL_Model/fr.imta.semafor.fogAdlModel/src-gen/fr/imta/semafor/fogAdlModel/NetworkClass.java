/**
 */
package fr.imta.semafor.fogAdlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Network Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkClass()
 * @model
 * @generated
 */
public enum NetworkClass implements Enumerator {
	/**
	 * The '<em><b>Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET(1, "Ethernet", "Ethernet"),

	/**
	 * The '<em><b>Wifi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI(2, "Wifi", "Wifi"),

	/**
	 * The '<em><b>Bluetooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH(3, "Bluetooth", "Bluetooth");

	/**
	 * The '<em><b>Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET
	 * @model name="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_VALUE = 1;

	/**
	 * The '<em><b>Wifi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI
	 * @model name="Wifi"
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_VALUE = 2;

	/**
	 * The '<em><b>Bluetooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH
	 * @model name="Bluetooth"
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Network Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NetworkClass[] VALUES_ARRAY = new NetworkClass[] { ETHERNET, WIFI, BLUETOOTH, };

	/**
	 * A public read-only list of all the '<em><b>Network Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NetworkClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Network Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkClass get(int value) {
		switch (value) {
		case ETHERNET_VALUE:
			return ETHERNET;
		case WIFI_VALUE:
			return WIFI;
		case BLUETOOTH_VALUE:
			return BLUETOOTH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NetworkClass(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //NetworkClass
