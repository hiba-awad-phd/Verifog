/**
 */
package fr.imta.semafor.fogAdlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.IntegerValueExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getIntegerValueExpression()
 * @model
 * @generated
 */
public interface IntegerValueExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getIntegerValueExpression_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.IntegerValueExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerValueExpression
