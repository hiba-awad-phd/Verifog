/**
 */
package fr.imta.semafor.fogAdlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getMultiplicityOperator()
 * @model
 * @generated
 */
public enum MultiplicityOperator implements Enumerator {
	/**
	 * The '<em><b>All Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OF(0, "AllOf", "AllOf"),

	/**
	 * The '<em><b>Any Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OF(1, "AnyOf", "AnyOf"),

	/**
	 * The '<em><b>Exclusively One Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVELY_ONE_OF_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUSIVELY_ONE_OF(2, "ExclusivelyOneOf", "ExclusivelyOneOf");

	/**
	 * The '<em><b>All Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF
	 * @model name="AllOf"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OF_VALUE = 0;

	/**
	 * The '<em><b>Any Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF
	 * @model name="AnyOf"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OF_VALUE = 1;

	/**
	 * The '<em><b>Exclusively One Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVELY_ONE_OF
	 * @model name="ExclusivelyOneOf"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUSIVELY_ONE_OF_VALUE = 2;

	/**
	 * An array of all the '<em><b>Multiplicity Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultiplicityOperator[] VALUES_ARRAY = new MultiplicityOperator[] { ALL_OF, ANY_OF,
			EXCLUSIVELY_ONE_OF, };

	/**
	 * A public read-only list of all the '<em><b>Multiplicity Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultiplicityOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicity Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiplicityOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiplicityOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityOperator get(int value) {
		switch (value) {
		case ALL_OF_VALUE:
			return ALL_OF;
		case ANY_OF_VALUE:
			return ANY_OF;
		case EXCLUSIVELY_ONE_OF_VALUE:
			return EXCLUSIVELY_ONE_OF;
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
	private MultiplicityOperator(int value, String name, String literal) {
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

} //MultiplicityOperator
