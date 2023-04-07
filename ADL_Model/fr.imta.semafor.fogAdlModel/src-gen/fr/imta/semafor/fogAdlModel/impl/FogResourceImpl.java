/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Attribute;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogResource;

import fr.imta.semafor.fogAdlModel.Tag;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogResourceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogResourceImpl#getImportedNamespace1 <em>Imported Namespace1</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogResourceImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogResourceImpl extends MinimalEObjectImpl.Container implements FogResource {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The default value of the '{@link #getImportedNamespace1() <em>Imported Namespace1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace1()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_NAMESPACE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportedNamespace1() <em>Imported Namespace1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace1()
	 * @generated
	 * @ordered
	 */
	protected String importedNamespace1 = IMPORTED_NAMESPACE1_EDEFAULT;

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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.FOG_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, FogAdlModelPackage.FOG_RESOURCE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportedNamespace1() {
		return importedNamespace1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedNamespace1(String newImportedNamespace1) {
		String oldImportedNamespace1 = importedNamespace1;
		importedNamespace1 = newImportedNamespace1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.FOG_RESOURCE__IMPORTED_NAMESPACE1,
					oldImportedNamespace1, importedNamespace1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.FOG_RESOURCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this,
					FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES, FogAdlModelPackage.ATTRIBUTE__FOGRESOURCE);
		}
		return attributes;
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
		case FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributes()).basicAdd(otherEnd, msgs);
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
		case FogAdlModelPackage.FOG_RESOURCE__TAGS:
			return ((InternalEList<?>) getTags()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.FOG_RESOURCE__TAGS:
			return getTags();
		case FogAdlModelPackage.FOG_RESOURCE__IMPORTED_NAMESPACE1:
			return getImportedNamespace1();
		case FogAdlModelPackage.FOG_RESOURCE__NAME:
			return getName();
		case FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES:
			return getAttributes();
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
		case FogAdlModelPackage.FOG_RESOURCE__TAGS:
			getTags().clear();
			getTags().addAll((Collection<? extends Tag>) newValue);
			return;
		case FogAdlModelPackage.FOG_RESOURCE__IMPORTED_NAMESPACE1:
			setImportedNamespace1((String) newValue);
			return;
		case FogAdlModelPackage.FOG_RESOURCE__NAME:
			setName((String) newValue);
			return;
		case FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case FogAdlModelPackage.FOG_RESOURCE__TAGS:
			getTags().clear();
			return;
		case FogAdlModelPackage.FOG_RESOURCE__IMPORTED_NAMESPACE1:
			setImportedNamespace1(IMPORTED_NAMESPACE1_EDEFAULT);
			return;
		case FogAdlModelPackage.FOG_RESOURCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES:
			getAttributes().clear();
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
		case FogAdlModelPackage.FOG_RESOURCE__TAGS:
			return tags != null && !tags.isEmpty();
		case FogAdlModelPackage.FOG_RESOURCE__IMPORTED_NAMESPACE1:
			return IMPORTED_NAMESPACE1_EDEFAULT == null ? importedNamespace1 != null
					: !IMPORTED_NAMESPACE1_EDEFAULT.equals(importedNamespace1);
		case FogAdlModelPackage.FOG_RESOURCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FogAdlModelPackage.FOG_RESOURCE__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
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
		result.append(" (importedNamespace1: ");
		result.append(importedNamespace1);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FogResourceImpl
