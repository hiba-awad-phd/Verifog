/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Attribute;
import fr.imta.semafor.fogAdlModel.AttributeType;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogResource;
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
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeImpl#getUnitofmeasurment <em>Unitofmeasurment</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeImpl#getFogresource <em>Fogresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitofmeasurment() <em>Unitofmeasurment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitofmeasurment()
	 * @generated
	 * @ordered
	 */
	protected UnitOfMeasurment unitofmeasurment;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected AttributeType instanceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasurment getUnitofmeasurment() {
		if (unitofmeasurment != null && unitofmeasurment.eIsProxy()) {
			InternalEObject oldUnitofmeasurment = (InternalEObject) unitofmeasurment;
			unitofmeasurment = (UnitOfMeasurment) eResolveProxy(oldUnitofmeasurment);
			if (unitofmeasurment != oldUnitofmeasurment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FogAdlModelPackage.ATTRIBUTE__UNITOFMEASURMENT, oldUnitofmeasurment, unitofmeasurment));
			}
		}
		return unitofmeasurment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasurment basicGetUnitofmeasurment() {
		return unitofmeasurment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitofmeasurment(UnitOfMeasurment newUnitofmeasurment) {
		UnitOfMeasurment oldUnitofmeasurment = unitofmeasurment;
		unitofmeasurment = newUnitofmeasurment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE__UNITOFMEASURMENT,
					oldUnitofmeasurment, unitofmeasurment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject) instanceOf;
			instanceOf = (AttributeType) eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.ATTRIBUTE__INSTANCE_OF,
							oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(AttributeType newInstanceOf) {
		AttributeType oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE__INSTANCE_OF,
					oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogResource getFogresource() {
		if (eContainerFeatureID() != FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE)
			return null;
		return (FogResource) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogresource(FogResource newFogresource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFogresource, FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogresource(FogResource newFogresource) {
		if (newFogresource != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE && newFogresource != null)) {
			if (EcoreUtil.isAncestor(this, newFogresource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFogresource != null)
				msgs = ((InternalEObject) newFogresource).eInverseAdd(this, FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES,
						FogResource.class, msgs);
			msgs = basicSetFogresource(newFogresource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE,
					newFogresource, newFogresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFogresource((FogResource) otherEnd, msgs);
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
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			return basicSetFogresource(null, msgs);
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
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES,
					FogResource.class, msgs);
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
		case FogAdlModelPackage.ATTRIBUTE__VALUE:
			return getValue();
		case FogAdlModelPackage.ATTRIBUTE__UNITOFMEASURMENT:
			if (resolve)
				return getUnitofmeasurment();
			return basicGetUnitofmeasurment();
		case FogAdlModelPackage.ATTRIBUTE__INSTANCE_OF:
			if (resolve)
				return getInstanceOf();
			return basicGetInstanceOf();
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			return getFogresource();
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
		case FogAdlModelPackage.ATTRIBUTE__VALUE:
			setValue((String) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE__UNITOFMEASURMENT:
			setUnitofmeasurment((UnitOfMeasurment) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE__INSTANCE_OF:
			setInstanceOf((AttributeType) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			setFogresource((FogResource) newValue);
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
		case FogAdlModelPackage.ATTRIBUTE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case FogAdlModelPackage.ATTRIBUTE__UNITOFMEASURMENT:
			setUnitofmeasurment((UnitOfMeasurment) null);
			return;
		case FogAdlModelPackage.ATTRIBUTE__INSTANCE_OF:
			setInstanceOf((AttributeType) null);
			return;
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			setFogresource((FogResource) null);
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
		case FogAdlModelPackage.ATTRIBUTE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case FogAdlModelPackage.ATTRIBUTE__UNITOFMEASURMENT:
			return unitofmeasurment != null;
		case FogAdlModelPackage.ATTRIBUTE__INSTANCE_OF:
			return instanceOf != null;
		case FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE:
			return getFogresource() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
