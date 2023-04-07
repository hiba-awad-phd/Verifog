/**
 */
package fr.imta.semafor.fogAdlModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.PhysicalNode#getFogarea <em>Fogarea</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getPhysicalNode()
 * @model
 * @generated
 */
public interface PhysicalNode extends Node {

	/**
	 * Returns the value of the '<em><b>Fogarea</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogarea</em>' reference.
	 * @see #setFogarea(FogArea)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getPhysicalNode_Fogarea()
	 * @model required="true"
	 * @generated
	 */
	FogArea getFogarea();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.PhysicalNode#getFogarea <em>Fogarea</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogarea</em>' reference.
	 * @see #getFogarea()
	 * @generated
	 */
	void setFogarea(FogArea value);
} // PhysicalNode
