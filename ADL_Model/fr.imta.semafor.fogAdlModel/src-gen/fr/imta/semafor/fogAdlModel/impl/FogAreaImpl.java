/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogArea;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogAreaImpl#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogAreaImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogAreaImpl extends FogResourceImpl implements FogArea {
	/**
	 * The cached value of the '{@link #getFogsystem() <em>Fogsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogsystem()
	 * @generated
	 * @ordered
	 */
	protected FogSystem fogsystem;
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.FOG_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem getFogsystem() {
		if (fogsystem != null && fogsystem.eIsProxy()) {
			InternalEObject oldFogsystem = (InternalEObject) fogsystem;
			fogsystem = (FogSystem) eResolveProxy(oldFogsystem);
			if (fogsystem != oldFogsystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FogAdlModelPackage.FOG_AREA__FOGSYSTEM,
							oldFogsystem, fogsystem));
			}
		}
		return fogsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem basicGetFogsystem() {
		return fogsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFogsystem(FogSystem newFogsystem) {
		FogSystem oldFogsystem = fogsystem;
		fogsystem = newFogsystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FogAdlModelPackage.FOG_AREA__FOGSYSTEM, oldFogsystem,
					fogsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, FogAdlModelPackage.FOG_AREA__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FogAdlModelPackage.FOG_AREA__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.FOG_AREA__FOGSYSTEM:
			if (resolve)
				return getFogsystem();
			return basicGetFogsystem();
		case FogAdlModelPackage.FOG_AREA__NODES:
			return getNodes();
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
		case FogAdlModelPackage.FOG_AREA__FOGSYSTEM:
			setFogsystem((FogSystem) newValue);
			return;
		case FogAdlModelPackage.FOG_AREA__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
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
		case FogAdlModelPackage.FOG_AREA__FOGSYSTEM:
			setFogsystem((FogSystem) null);
			return;
		case FogAdlModelPackage.FOG_AREA__NODES:
			getNodes().clear();
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
		case FogAdlModelPackage.FOG_AREA__FOGSYSTEM:
			return fogsystem != null;
		case FogAdlModelPackage.FOG_AREA__NODES:
			return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FogAreaImpl
