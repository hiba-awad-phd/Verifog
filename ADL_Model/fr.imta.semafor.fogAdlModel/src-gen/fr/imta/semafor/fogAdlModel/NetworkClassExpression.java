/**
 */
package fr.imta.semafor.fogAdlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Class Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.NetworkClassExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkClassExpression()
 * @model
 * @generated
 */
public interface NetworkClassExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.NetworkClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.NetworkClass
	 * @see #setValue(NetworkClass)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getNetworkClassExpression_Value()
	 * @model
	 * @generated
	 */
	NetworkClass getValue();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.NetworkClassExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.NetworkClass
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NetworkClass value);

} // NetworkClassExpression
