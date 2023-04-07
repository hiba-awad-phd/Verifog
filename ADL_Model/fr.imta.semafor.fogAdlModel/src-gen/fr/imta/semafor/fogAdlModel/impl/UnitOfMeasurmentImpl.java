/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.UnitOfMeasurment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Of Measurment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl#getConversionToMainUnit <em>Conversion To Main Unit</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl#getFogsystem <em>Fogsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitOfMeasurmentImpl extends MinimalEObjectImpl.Container implements UnitOfMeasurment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConversionToMainUnit() <em>Conversion To Main Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionToMainUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERSION_TO_MAIN_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversionToMainUnit() <em>Conversion To Main Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionToMainUnit()
	 * @generated
	 * @ordered
	 */
	protected String conversionToMainUnit = CONVERSION_TO_MAIN_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitOfMeasurmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.UNIT_OF_MEASURMENT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.UNIT_OF_MEASURMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConversionToMainUnit() {
		return conversionToMainUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionToMainUnit(String newConversionToMainUnit) {
		String oldConversionToMainUnit = conversionToMainUnit;
		conversionToMainUnit = newConversionToMainUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FogAdlModelPackage.UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT, oldConversionToMainUnit,
					conversionToMainUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogsystem() {
		if (eContainerFeatureID() != FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM)
			return null;
		return (FogSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogsystem(FogSystem newFogsystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFogsystem, FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogsystem(FogSystem newFogsystem) {
		if (newFogsystem != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM
						&& newFogsystem != null)) {
			if (EcoreUtil.isAncestor(this, newFogsystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFogsystem != null)
				msgs = ((InternalEObject) newFogsystem).eInverseAdd(this,
						FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT, FogSystem.class, msgs);
			msgs = basicSetFogsystem(newFogsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM,
					newFogsystem, newFogsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFogsystem((FogSystem) otherEnd, msgs);
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
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			return basicSetFogsystem(null, msgs);
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
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT,
					FogSystem.class, msgs);
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
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__NAME:
			return getName();
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT:
			return getConversionToMainUnit();
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			return getFogsystem();
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
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__NAME:
			setName((String) newValue);
			return;
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT:
			setConversionToMainUnit((String) newValue);
			return;
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			setFogsystem((FogSystem) newValue);
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
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT:
			setConversionToMainUnit(CONVERSION_TO_MAIN_UNIT_EDEFAULT);
			return;
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			setFogsystem((FogSystem) null);
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
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT:
			return CONVERSION_TO_MAIN_UNIT_EDEFAULT == null ? conversionToMainUnit != null
					: !CONVERSION_TO_MAIN_UNIT_EDEFAULT.equals(conversionToMainUnit);
		case FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM:
			return getFogsystem() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", conversionToMainUnit: ");
		result.append(conversionToMainUnit);
		result.append(')');
		return result.toString();
	}

} //UnitOfMeasurmentImpl
