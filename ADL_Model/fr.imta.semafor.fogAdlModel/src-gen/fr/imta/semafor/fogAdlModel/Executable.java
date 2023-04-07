/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Executable#getExecutionRequirements <em>Execution Requirements</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Executable#getInstallStartCommand <em>Install Start Command</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Executable#getReferenceToExecutionEnvironment <em>Reference To Execution Environment</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getExecutable()
 * @model
 * @generated
 */
public interface Executable extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Requirements</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getExecutable_ExecutionRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeType> getExecutionRequirements();

	/**
	 * Returns the value of the '<em><b>Install Start Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Start Command</em>' attribute.
	 * @see #setInstallStartCommand(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getExecutable_InstallStartCommand()
	 * @model
	 * @generated
	 */
	String getInstallStartCommand();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Executable#getInstallStartCommand <em>Install Start Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Start Command</em>' attribute.
	 * @see #getInstallStartCommand()
	 * @generated
	 */
	void setInstallStartCommand(String value);

	/**
	 * Returns the value of the '<em><b>Reference To Execution Environment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To Execution Environment</em>' attribute list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getExecutable_ReferenceToExecutionEnvironment()
	 * @model
	 * @generated
	 */
	EList<String> getReferenceToExecutionEnvironment();

} // Executable
