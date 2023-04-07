/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.AttributeType;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogArea;
import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.Network;
import fr.imta.semafor.fogAdlModel.NetworkType;
import fr.imta.semafor.fogAdlModel.NodeType;
import fr.imta.semafor.fogAdlModel.UnitOfMeasurment;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getPhysicalnodespecification <em>Physicalnodespecification</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getNetworktypes <em>Networktypes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getFogareas <em>Fogareas</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getAttributetypes <em>Attributetypes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl#getUnitsofmeasurment <em>Unitsofmeasurment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogSystemImpl extends FogResourceImpl implements FogSystem {
	/**
	 * The cached value of the '{@link #getPhysicalnodespecification() <em>Physicalnodespecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalnodespecification()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeType> physicalnodespecification;

	/**
	 * The cached value of the '{@link #getNetworktypes() <em>Networktypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworktypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkType> networktypes;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getFogareas() <em>Fogareas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFogareas()
	 * @generated
	 * @ordered
	 */
	protected EList<FogArea> fogareas;

	/**
	 * The cached value of the '{@link #getAttributetypes() <em>Attributetypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeType> attributetypes;

	/**
	 * The cached value of the '{@link #getUnitsofmeasurment() <em>Unitsofmeasurment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsofmeasurment()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitOfMeasurment> unitsofmeasurment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FogAdlModelPackage.Literals.FOG_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeType> getPhysicalnodespecification() {
		if (physicalnodespecification == null) {
			physicalnodespecification = new EObjectContainmentWithInverseEList<NodeType>(NodeType.class, this,
					FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION, FogAdlModelPackage.NODE_TYPE__FOGSYSTEM);
		}
		return physicalnodespecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkType> getNetworktypes() {
		if (networktypes == null) {
			networktypes = new EObjectContainmentWithInverseEList<NetworkType>(NetworkType.class, this,
					FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES, FogAdlModelPackage.NETWORK_TYPE__FOGSYSTEM);
		}
		return networktypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentWithInverseEList<Network>(Network.class, this,
					FogAdlModelPackage.FOG_SYSTEM__NETWORKS, FogAdlModelPackage.NETWORK__FOGSYSTEM);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectWithInverseResolvingEList<Application>(Application.class, this,
					FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS, FogAdlModelPackage.APPLICATION__FOG_SYSTEM);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FogArea> getFogareas() {
		if (fogareas == null) {
			fogareas = new EObjectContainmentEList<FogArea>(FogArea.class, this,
					FogAdlModelPackage.FOG_SYSTEM__FOGAREAS);
		}
		return fogareas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeType> getAttributetypes() {
		if (attributetypes == null) {
			attributetypes = new EObjectContainmentWithInverseEList<AttributeType>(AttributeType.class, this,
					FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES, FogAdlModelPackage.ATTRIBUTE_TYPE__FOGSYSTEM);
		}
		return attributetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitOfMeasurment> getUnitsofmeasurment() {
		if (unitsofmeasurment == null) {
			unitsofmeasurment = new EObjectContainmentWithInverseEList<UnitOfMeasurment>(UnitOfMeasurment.class, this,
					FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT, FogAdlModelPackage.UNIT_OF_MEASURMENT__FOGSYSTEM);
		}
		return unitsofmeasurment;
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
		case FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysicalnodespecification())
					.basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNetworktypes()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNetworks()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getApplications()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributetypes()).basicAdd(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnitsofmeasurment()).basicAdd(otherEnd,
					msgs);
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
		case FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION:
			return ((InternalEList<?>) getPhysicalnodespecification()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES:
			return ((InternalEList<?>) getNetworktypes()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKS:
			return ((InternalEList<?>) getNetworks()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS:
			return ((InternalEList<?>) getApplications()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__FOGAREAS:
			return ((InternalEList<?>) getFogareas()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES:
			return ((InternalEList<?>) getAttributetypes()).basicRemove(otherEnd, msgs);
		case FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT:
			return ((InternalEList<?>) getUnitsofmeasurment()).basicRemove(otherEnd, msgs);
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
		case FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION:
			return getPhysicalnodespecification();
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES:
			return getNetworktypes();
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKS:
			return getNetworks();
		case FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS:
			return getApplications();
		case FogAdlModelPackage.FOG_SYSTEM__FOGAREAS:
			return getFogareas();
		case FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES:
			return getAttributetypes();
		case FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT:
			return getUnitsofmeasurment();
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
		case FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION:
			getPhysicalnodespecification().clear();
			getPhysicalnodespecification().addAll((Collection<? extends NodeType>) newValue);
			return;
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES:
			getNetworktypes().clear();
			getNetworktypes().addAll((Collection<? extends NetworkType>) newValue);
			return;
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKS:
			getNetworks().clear();
			getNetworks().addAll((Collection<? extends Network>) newValue);
			return;
		case FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS:
			getApplications().clear();
			getApplications().addAll((Collection<? extends Application>) newValue);
			return;
		case FogAdlModelPackage.FOG_SYSTEM__FOGAREAS:
			getFogareas().clear();
			getFogareas().addAll((Collection<? extends FogArea>) newValue);
			return;
		case FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES:
			getAttributetypes().clear();
			getAttributetypes().addAll((Collection<? extends AttributeType>) newValue);
			return;
		case FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT:
			getUnitsofmeasurment().clear();
			getUnitsofmeasurment().addAll((Collection<? extends UnitOfMeasurment>) newValue);
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
		case FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION:
			getPhysicalnodespecification().clear();
			return;
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES:
			getNetworktypes().clear();
			return;
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKS:
			getNetworks().clear();
			return;
		case FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS:
			getApplications().clear();
			return;
		case FogAdlModelPackage.FOG_SYSTEM__FOGAREAS:
			getFogareas().clear();
			return;
		case FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES:
			getAttributetypes().clear();
			return;
		case FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT:
			getUnitsofmeasurment().clear();
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
		case FogAdlModelPackage.FOG_SYSTEM__PHYSICALNODESPECIFICATION:
			return physicalnodespecification != null && !physicalnodespecification.isEmpty();
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKTYPES:
			return networktypes != null && !networktypes.isEmpty();
		case FogAdlModelPackage.FOG_SYSTEM__NETWORKS:
			return networks != null && !networks.isEmpty();
		case FogAdlModelPackage.FOG_SYSTEM__APPLICATIONS:
			return applications != null && !applications.isEmpty();
		case FogAdlModelPackage.FOG_SYSTEM__FOGAREAS:
			return fogareas != null && !fogareas.isEmpty();
		case FogAdlModelPackage.FOG_SYSTEM__ATTRIBUTETYPES:
			return attributetypes != null && !attributetypes.isEmpty();
		case FogAdlModelPackage.FOG_SYSTEM__UNITSOFMEASURMENT:
			return unitsofmeasurment != null && !unitsofmeasurment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FogSystemImpl
