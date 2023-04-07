/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.SoftwarePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.SoftwarePackageImpl#getInstallStartScript <em>Install Start Script</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.SoftwarePackageImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwarePackageImpl extends FogResourceImpl implements SoftwarePackage {
	/**
	 * The default value of the '{@link #getInstallStartScript() <em>Install Start Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallStartScript()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_START_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallStartScript() <em>Install Start Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallStartScript()
	 * @generated
	 * @ordered
	 */
	protected String installStartScript = INSTALL_START_SCRIPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwarePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.SOFTWARE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallStartScript() {
		return installStartScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallStartScript(String newInstallStartScript) {
		String oldInstallStartScript = installStartScript;
		installStartScript = newInstallStartScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.SOFTWARE_PACKAGE__INSTALL_START_SCRIPT, oldInstallStartScript,
					installStartScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this,
					FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS,
					FogAdlModelPackage.CONSTRAINT__CONSTRAINED_PACKAGE);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.SOFTWARE_PACKAGE__INSTALL_START_SCRIPT:
			return getInstallStartScript();
		case FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS:
			return getConstraints();
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
		case FogAdlModelPackage.SOFTWARE_PACKAGE__INSTALL_START_SCRIPT:
			setInstallStartScript((String) newValue);
			return;
		case FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends Constraint>) newValue);
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
		case FogAdlModelPackage.SOFTWARE_PACKAGE__INSTALL_START_SCRIPT:
			setInstallStartScript(INSTALL_START_SCRIPT_EDEFAULT);
			return;
		case FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS:
			getConstraints().clear();
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
		case FogAdlModelPackage.SOFTWARE_PACKAGE__INSTALL_START_SCRIPT:
			return INSTALL_START_SCRIPT_EDEFAULT == null ? installStartScript != null
					: !INSTALL_START_SCRIPT_EDEFAULT.equals(installStartScript);
		case FogAdlModelPackage.SOFTWARE_PACKAGE__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
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
		result.append(" (installStartScript: ");
		result.append(installStartScript);
		result.append(')');
		return result.toString();
	}

} //SoftwarePackageImpl
