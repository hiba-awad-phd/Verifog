/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogArea;
import fr.imta.semafor.fogAdlModel.PhysicalNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.PhysicalNodeImpl#getFogarea <em>Fogarea</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalNodeImpl extends NodeImpl implements PhysicalNode {
	/**
	 * The cached value of the '{@link #getFogarea() <em>Fogarea</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogarea()
	 * @generated
	 * @ordered
	 */
	protected FogArea fogarea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.PHYSICAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogArea getFogarea() {
		if (fogarea != null && fogarea.eIsProxy()) {
			InternalEObject oldFogarea = (InternalEObject) fogarea;
			fogarea = (FogArea) eResolveProxy(oldFogarea);
			if (fogarea != oldFogarea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.PHYSICAL_NODE__FOGAREA,
							oldFogarea, fogarea));
			}
		}
		return fogarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogArea basicGetFogarea() {
		return fogarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogarea(FogArea newFogarea) {
		FogArea oldFogarea = fogarea;
		fogarea = newFogarea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.PHYSICAL_NODE__FOGAREA, oldFogarea,
					fogarea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FogAdlModelPackage.PHYSICAL_NODE__FOGAREA:
			if (resolve)
				return getFogarea();
			return basicGetFogarea();
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
		case FogAdlModelPackage.PHYSICAL_NODE__FOGAREA:
			setFogarea((FogArea) newValue);
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
		case FogAdlModelPackage.PHYSICAL_NODE__FOGAREA:
			setFogarea((FogArea) null);
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
		case FogAdlModelPackage.PHYSICAL_NODE__FOGAREA:
			return fogarea != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalNodeImpl
