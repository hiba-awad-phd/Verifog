/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Constraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Constraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Constraint#getConstrainedPackage <em>Constrained Package</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.ComparaisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.ComparaisonOperator
	 * @see #setOperator(ComparaisonOperator)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConstraint_Operator()
	 * @model
	 * @generated
	 */
	ComparaisonOperator getOperator();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Constraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see fr.imta.semafor.fogAdlModel.ComparaisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparaisonOperator value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConstraint_Expression()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Constrained Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.SoftwarePackage#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Package</em>' container reference.
	 * @see #setConstrainedPackage(SoftwarePackage)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getConstraint_ConstrainedPackage()
	 * @see fr.imta.semafor.fogAdlModel.SoftwarePackage#getConstraints
	 * @model opposite="constraints" transient="false"
	 * @generated
	 */
	SoftwarePackage getConstrainedPackage();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Constraint#getConstrainedPackage <em>Constrained Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Package</em>' container reference.
	 * @see #getConstrainedPackage()
	 * @generated
	 */
	void setConstrainedPackage(SoftwarePackage value);

} // Constraint
