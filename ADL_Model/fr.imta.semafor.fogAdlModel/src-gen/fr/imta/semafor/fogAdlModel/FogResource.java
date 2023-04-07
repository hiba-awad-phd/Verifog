/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogResource#getTags <em>Tags</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogResource#getImportedNamespace1 <em>Imported Namespace1</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogResource#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.FogResource#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogResource()
 * @model
 * @generated
 */
public interface FogResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogResource_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace1</em>' attribute.
	 * @see #setImportedNamespace1(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogResource_ImportedNamespace1()
	 * @model
	 * @generated
	 */
	String getImportedNamespace1();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.FogResource#getImportedNamespace1 <em>Imported Namespace1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace1</em>' attribute.
	 * @see #getImportedNamespace1()
	 * @generated
	 */
	void setImportedNamespace1(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.FogResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Attribute}.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.Attribute#getFogresource <em>Fogresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getFogResource_Attributes()
	 * @see fr.imta.semafor.fogAdlModel.Attribute#getFogresource
	 * @model opposite="fogresource" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // FogResource
