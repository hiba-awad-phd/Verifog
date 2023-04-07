/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.MultiplicityExpression;
import fr.imta.semafor.fogAdlModel.MultiplicityOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.MultiplicityExpressionImpl#getMultiplicityOperator <em>Multiplicity Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityExpressionImpl extends ExpressionImpl implements MultiplicityExpression {
	/**
	 * The default value of the '{@link #getMultiplicityOperator() <em>Multiplicity Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityOperator()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityOperator MULTIPLICITY_OPERATOR_EDEFAULT = MultiplicityOperator.ALL_OF;

	/**
	 * The cached value of the '{@link #getMultiplicityOperator() <em>Multiplicity Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityOperator()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityOperator multiplicityOperator = MULTIPLICITY_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.MULTIPLICITY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityOperator getMultiplicityOperator() {
		return multiplicityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityOperator(MultiplicityOperator newMultiplicityOperator) {
		MultiplicityOperator oldMultiplicityOperator = multiplicityOperator;
		multiplicityOperator = newMultiplicityOperator == null ? MULTIPLICITY_OPERATOR_EDEFAULT
				: newMultiplicityOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR, oldMultiplicityOperator,
					multiplicityOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR:
			return getMultiplicityOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FogAdlModelPackage.MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR:
			setMultiplicityOperator((MultiplicityOperator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FogAdlModelPackage.MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR:
			setMultiplicityOperator(MULTIPLICITY_OPERATOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FogAdlModelPackage.MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR:
			return multiplicityOperator != MULTIPLICITY_OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multiplicityOperator: ");
		result.append(multiplicityOperator);
		result.append(')');
		return result.toString();
	}

} //MultiplicityExpressionImpl
