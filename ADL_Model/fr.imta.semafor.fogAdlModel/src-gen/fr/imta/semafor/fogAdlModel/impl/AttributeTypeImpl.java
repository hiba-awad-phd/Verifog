/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Attribute;
import fr.imta.semafor.fogAdlModel.AttributeType;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.ResourceType;
import fr.imta.semafor.fogAdlModel.UnitOfMeasurment;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl#getUnitofmeasurment <em>Unitofmeasurment</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeImpl extends FogResourceImpl implements AttributeType {
	/**
	 * The cached value of the '{@link #getUnitofmeasurment() <em>Unitofmeasurment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitofmeasurment()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitOfMeasurment> unitofmeasurment;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> instances;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resources;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitOfMeasurment> getUnitofmeasurment() {
		if (unitofmeasurment == null) {
			unitofmeasurment = new EObjectResolvingEList<UnitOfMeasurment>(UnitOfMeasurment.class, this,
					FogAdlModelPackage.ATTRIBUTE_TYPE__UNITOFMEASURMENT);
		}
		return unitofmeasurment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE_TYPE__VALUE_TYPE,
					oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<Attribute>(Attribute.class, this,
					FogAdlModelPackage.ATTRIBUTE_TYPE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogsystem() {
		if (eContainerFeatureID() != FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM)
			return null;
		return (FogSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFogsystem(FogSystem newFogsystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFogsystem, FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogsystem(FogSystem newFogsystem) {
		if (newFogsystem != eInternalContainer()
				|| (eContainerFeatureID() != FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM && newFogsystem != null)) {
			if (EcoreUtil.isAncestor(this, newFogsystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFogsystem != null)
				msgs = ((InternalEObject) newFogsystem).eInverseAdd(this, FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES,
						FogSystem.class, msgs);
			msgs = basicSetFogsystem(newFogsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM,
					newFogsystem, newFogsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getResources() {
		if (resources == null) {
			resources = new EDataTypeUniqueEList<ResourceType>(ResourceType.class, this,
					FogAdlModelPackage.ATTRIBUTE_TYPE__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.ATTRIBUTE_TYPE__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
			return eInternalContainer().eInverseRemove(this, FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES,
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__UNITOFMEASURMENT:
			return getUnitofmeasurment();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__VALUE_TYPE:
			return getValueType();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__INSTANCES:
			return getInstances();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
			return getFogsystem();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__RESOURCES:
			return getResources();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__DEFAULT_VALUE:
			return getDefaultValue();
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__UNITOFMEASURMENT:
			getUnitofmeasurment().clear();
			getUnitofmeasurment().addAll((Collection<? extends UnitOfMeasurment>) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__VALUE_TYPE:
			setValueType((String) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Attribute>) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
			setFogsystem((FogSystem) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends ResourceType>) newValue);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__UNITOFMEASURMENT:
			getUnitofmeasurment().clear();
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__VALUE_TYPE:
			setValueType(VALUE_TYPE_EDEFAULT);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
			setFogsystem((FogSystem) null);
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__RESOURCES:
			getResources().clear();
			return;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
		case FogAdlModelPackage.ATTRIBUTE_TYPE__UNITOFMEASURMENT:
			return unitofmeasurment != null && !unitofmeasurment.isEmpty();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__VALUE_TYPE:
			return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
		case FogAdlModelPackage.ATTRIBUTE_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM:
			return getFogsystem() != null;
		case FogAdlModelPackage.ATTRIBUTE_TYPE__RESOURCES:
			return resources != null && !resources.isEmpty();
		case FogAdlModelPackage.ATTRIBUTE_TYPE__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(" (valueType: ");
		result.append(valueType);
		result.append(", resources: ");
		result.append(resources);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

	@Override
	public String[] getResourcesAsStrings() {
		ArrayList<String> result = new ArrayList<String>();
		for (ResourceType resource : resources) {
			result.add(resource.toString());
		}
		return (String[]) result.toArray();
	}

} //AttributeTypeImpl
