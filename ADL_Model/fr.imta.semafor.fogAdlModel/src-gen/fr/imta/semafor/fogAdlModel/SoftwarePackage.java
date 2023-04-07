/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.SoftwarePackage#getInstallStartScript <em>Install Start Script</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.SoftwarePackage#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getSoftwarePackage()
 * @model
 * @generated
 */
public interface SoftwarePackage extends FogResource {
	/**
	 * Returns the value of the '<em><b>Install Start Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Start Script</em>' attribute.
	 * @see #setInstallStartScript(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getSoftwarePackage_InstallStartScript()
	 * @model
	 * @generated
	 */
	String getInstallStartScript();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.SoftwarePackage#getInstallStartScript <em>Install Start Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Start Script</em>' attribute.
	 * @see #getInstallStartScript()
	 * @generated
	 */
	void setInstallStartScript(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Constraint}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Constraint#getConstrainedPackage <em>Constrained Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getSoftwarePackage_Constraints()
	 * @see fr.imta.semafor.fogAdlModel.Constraint#getConstrainedPackage
	 * @model opposite="constrainedPackage" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // SoftwarePackage
