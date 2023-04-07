/**
 */
package fr.imta.semafor.fogAdlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.MultiplicityExpression#getMultiplicityOperator <em>Multiplicity Operator</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getMultiplicityExpression()
 * @model
 * @generated
 */
public interface MultiplicityExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Multiplicity Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.MultiplicityOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Operator</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityOperator
	 * @see #setMultiplicityOperator(MultiplicityOperator)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getMultiplicityExpression_MultiplicityOperator()
	 * @model
	 * @generated
	 */
	MultiplicityOperator getMultiplicityOperator();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.MultiplicityExpression#getMultiplicityOperator <em>Multiplicity Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Operator</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityOperator
	 * @see #getMultiplicityOperator()
	 * @generated
	 */
	void setMultiplicityOperator(MultiplicityOperator value);

} // MultiplicityExpression
