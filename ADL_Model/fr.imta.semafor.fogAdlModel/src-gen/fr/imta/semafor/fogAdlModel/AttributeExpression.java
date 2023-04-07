/**
 */
package fr.imta.semafor.fogAdlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeExpression#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeExpression#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeExpression()
 * @model
 * @generated
 */
public interface AttributeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeExpression_Attribute()
	 * @model
	 * @generated
	 */
	AttributeType getAttribute();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.AttributeExpression#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeExpression_AttributeName()
	 * @model
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.AttributeExpression#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

} // AttributeExpression
