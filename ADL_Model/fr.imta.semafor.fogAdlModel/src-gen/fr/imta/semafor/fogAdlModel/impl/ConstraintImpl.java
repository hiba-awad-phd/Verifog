/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.ComparaisonOperator;
import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.Expression;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;

import fr.imta.semafor.fogAdlModel.SoftwarePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConstraintImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConstraintImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.ConstraintImpl#getConstrainedPackage <em>Constrained Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparaisonOperator OPERATOR_EDEFAULT = ComparaisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparaisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparaisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparaisonOperator newOperator) {
		ComparaisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.CONSTRAINT__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<Expression>(Expression.class, this,
					FogAdlModelPackage.CONSTRAINT__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarePackage getConstrainedPackage() {
		if (eContainerFeatureID() != FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE)
			return null;
		return (SoftwarePackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstrainedPackage(SoftwarePackage newConstrainedPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newConstrainedPackage,
				FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedPackage(SoftwarePackage newConstrainedPackage) {
		if (newConstrainedPackage != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE
						&& newConstrainedPackage != null)) {
			if (EcoreUtil.isAncestor(this, newConstrainedPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstrainedPackage != null)
				msgs = ((InternalEObject) newConstrainedPackage).eInverseAdd(this,
						FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS, SoftwarePackage.class, msgs);
			msgs = basicSetConstrainedPackage(newConstrainedPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE,
					newConstrainedPackage, newConstrainedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetConstrainedPackage((SoftwarePackage) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.CONSTRAINT__EXPRESSION:
			return ((InternalEList<?>) getExpression()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			return basicSetConstrainedPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS,
					SoftwarePackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.CONSTRAINT__OPERATOR:
			return getOperator();
		case FogAdlModelPackage.CONSTRAINT__EXPRESSION:
			return getExpression();
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			return getConstrainedPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FogAdlModelPackage.CONSTRAINT__OPERATOR:
			setOperator((ComparaisonOperator) newValue);
			return;
		case FogAdlModelPackage.CONSTRAINT__EXPRESSION:
			getExpression().clear();
			getExpression().addAll((Collection<? extends Expression>) newValue);
			return;
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			setConstrainedPackage((SoftwarePackage) newValue);
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
		case FogAdlModelPackage.CONSTRAINT__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case FogAdlModelPackage.CONSTRAINT__EXPRESSION:
			getExpression().clear();
			return;
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			setConstrainedPackage((SoftwarePackage) null);
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
		case FogAdlModelPackage.CONSTRAINT__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case FogAdlModelPackage.CONSTRAINT__EXPRESSION:
			return expression != null && !expression.isEmpty();
		case FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE:
			return getConstrainedPackage() != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
