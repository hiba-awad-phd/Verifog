/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getPhysicalnodespecification <em>Physicalnodespecification</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getNetworktypes <em>Networktypes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getNetworks <em>Networks</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getApplications <em>Applications</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getFogareas <em>Fogareas</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getAttributetypes <em>Attributetypes</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogSystem#getUnitsofmeasurment <em>Unitsofmeasurment</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem()
 * @model
 * @generated
 */
public interface FogSystem extends FogResource {
	/**
	 * Returns the value of the '<em><b>Physicalnodespecification</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NodeType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NodeType#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalnodespecification</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Physicalnodespecification()
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getFogsystem
	 * @model opposite="fogsystem" containment="true"
	 * @generated
	 */
	EList<NodeType> getPhysicalnodespecification();

	/**
	 * Returns the value of the '<em><b>Networktypes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NetworkType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.NetworkType#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networktypes</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Networktypes()
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getFogsystem
	 * @model opposite="fogsystem" containment="true"
	 * @generated
	 */
	EList<NetworkType> getNetworktypes();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Network}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Network#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Networks()
	 * @see fr.imta.semafor.fogAdlModel.Network#getFogsystem
	 * @model opposite="fogsystem" containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Application}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Application#getFogSystem <em>Fog System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Applications()
	 * @see fr.imta.semafor.fogAdlModel.Application#getFogSystem
	 * @model opposite="fogSystem"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Fogareas</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.FogArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogareas</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Fogareas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FogArea> getFogareas();

	/**
	 * Returns the value of the '<em><b>Attributetypes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.AttributeType}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.AttributeType#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributetypes</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Attributetypes()
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getFogsystem
	 * @model opposite="fogsystem" containment="true"
	 * @generated
	 */
	EList<AttributeType> getAttributetypes();

	/**
	 * Returns the value of the '<em><b>Unitsofmeasurment</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitsofmeasurment</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogSystem_Unitsofmeasurment()
	 * @see fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getFogsystem
	 * @model opposite="fogsystem" containment="true"
	 * @generated
	 */
	EList<UnitOfMeasurment> getUnitsofmeasurment();

} // FogSystem
