/**
 */
package fr.imta.semafor.fogAdlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparaison Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getComparaisonOperator()
 * @model
 * @generated
 */
public enum ComparaisonOperator implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(2, "Equal", "Equal"),

	/**
	 * The '<em><b>Lesser Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESSER_OR_EQUAL(3, "LesserOrEqual", "LesserOrEqual"),

	/**
	 * The '<em><b>Greater Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_OR_EQUAL(4, "GreaterOrEqual", "GreaterOrEqual"),

	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(3, "Greater", "Greater"),

	/**
	 * The '<em><b>Lesser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_VALUE
	 * @generated
	 * @ordered
	 */
	LESSER(4, "Lesser", "Lesser");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="Equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 2;

	/**
	 * The '<em><b>Lesser Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_OR_EQUAL
	 * @model name="LesserOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int LESSER_OR_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>Greater Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL
	 * @model name="GreaterOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_OR_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="Greater"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 3;

	/**
	 * The '<em><b>Lesser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER
	 * @model name="Lesser"
	 * @generated
	 * @ordered
	 */
	public static final int LESSER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Comparaison Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparaisonOperator[] VALUES_ARRAY = new ComparaisonOperator[] { EQUAL, LESSER_OR_EQUAL,
			GREATER_OR_EQUAL, GREATER, LESSER, };

	/**
	 * A public read-only list of all the '<em><b>Comparaison Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparaisonOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparaison Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparaisonOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparaisonOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparaison Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparaisonOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparaisonOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparaison Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparaisonOperator get(int value) {
		switch (value) {
		case EQUAL_VALUE:
			return EQUAL;
		case LESSER_OR_EQUAL_VALUE:
			return LESSER_OR_EQUAL;
		case GREATER_OR_EQUAL_VALUE:
			return GREATER_OR_EQUAL;
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
	private ComparaisonOperator(int value, String name, String literal) {
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

} //ComparaisonOperator
