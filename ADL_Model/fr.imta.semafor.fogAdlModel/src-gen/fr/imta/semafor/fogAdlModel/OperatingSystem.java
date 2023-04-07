/**
 */
package fr.imta.semafor.fogAdlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operating System</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getOperatingSystem()
 * @model
 * @generated
 */
public enum OperatingSystem implements Enumerator {
	/**
	 * The '<em><b>Linux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(0, "Linux", "Linux"),

	/**
	 * The '<em><b>Mac OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_OS_VALUE
	 * @generated
	 * @ordered
	 */
	MAC_OS(1, "MacOS", "MacOS"),

	/**
	 * The '<em><b>Windows</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS(2, "Windows", "Windows"),

	/**
	 * The '<em><b>Android</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDROID_VALUE
	 * @generated
	 * @ordered
	 */
	ANDROID(3, "Android", "Android"),

	/**
	 * The '<em><b>IOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOS_VALUE
	 * @generated
	 * @ordered
	 */
	IOS(4, "IOS", "IOS");

	/**
	 * The '<em><b>Linux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model name="Linux"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 0;

	/**
	 * The '<em><b>Mac OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_OS
	 * @model name="MacOS"
	 * @generated
	 * @ordered
	 */
	public static final int MAC_OS_VALUE = 1;

	/**
	 * The '<em><b>Windows</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS
	 * @model name="Windows"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VALUE = 2;

	/**
	 * The '<em><b>Android</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDROID
	 * @model name="Android"
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_VALUE = 3;

	/**
	 * The '<em><b>IOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IOS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Operating System</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperatingSystem[] VALUES_ARRAY = new OperatingSystem[] { LINUX, MAC_OS, WINDOWS, ANDROID,
			IOS, };

	/**
	 * A public read-only list of all the '<em><b>Operating System</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperatingSystem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingSystem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingSystem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingSystem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingSystem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingSystem get(int value) {
		switch (value) {
		case LINUX_VALUE:
			return LINUX;
		case MAC_OS_VALUE:
			return MAC_OS;
		case WINDOWS_VALUE:
			return WINDOWS;
		case ANDROID_VALUE:
			return ANDROID;
		case IOS_VALUE:
			return IOS;
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
	private OperatingSystem(int value, String name, String literal) {
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

} //OperatingSystem
