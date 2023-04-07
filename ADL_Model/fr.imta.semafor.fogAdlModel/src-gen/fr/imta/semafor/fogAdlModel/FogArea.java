/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogArea#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogArea#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogArea()
 * @model
 * @generated
 */
public interface FogArea extends FogResource {
	/**
	 * Returns the value of the '<em><b>Fogsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogsystem</em>' reference.
	 * @see #setFogsystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogArea_Fogsystem()
	 * @model required="true"
	 * @generated
	 */
	FogSystem getFogsystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.FogArea#getFogsystem <em>Fogsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogsystem</em>' reference.
	 * @see #getFogsystem()
	 * @generated
	 */
	void setFogsystem(FogSystem value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogArea_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // FogArea
