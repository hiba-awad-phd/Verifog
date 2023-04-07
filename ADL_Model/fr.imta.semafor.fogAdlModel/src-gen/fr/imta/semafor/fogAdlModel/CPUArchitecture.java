/**
 */
package fr.imta.semafor.fogAdlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPU Architecture</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getCPUArchitecture()
 * @model
 * @generated
 */
public enum CPUArchitecture implements Enumerator {
	/**
	 * The '<em><b>Intel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEL(0, "Intel", "Intel"),

	/**
	 * The '<em><b>ARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM_VALUE
	 * @generated
	 * @ordered
	 */
	ARM(1, "ARM", "ARM");

	/**
	 * The '<em><b>Intel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEL
	 * @model name="Intel"
	 * @generated
	 * @ordered
	 */
	public static final int INTEL_VALUE = 0;

	/**
	 * The '<em><b>ARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARM_VALUE = 1;

	/**
	 * An array of all the '<em><b>CPU Architecture</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPUArchitecture[] VALUES_ARRAY = new CPUArchitecture[] { INTEL, ARM, };

	/**
	 * A public read-only list of all the '<em><b>CPU Architecture</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPUArchitecture> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPU Architecture</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPUArchitecture get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPUArchitecture result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPU Architecture</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPUArchitecture getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPUArchitecture result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPU Architecture</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPUArchitecture get(int value) {
		switch (value) {
		case INTEL_VALUE:
			return INTEL;
		case ARM_VALUE:
			return ARM;
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
	private CPUArchitecture(int value, String name, String literal) {
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

} //CPUArchitecture
