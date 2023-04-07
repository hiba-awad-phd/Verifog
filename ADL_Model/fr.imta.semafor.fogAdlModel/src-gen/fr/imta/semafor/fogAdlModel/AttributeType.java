/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeType#getUnitofmeasurment <em>Unitofmeasurment</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeType#getInstances <em>Instances</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeType#getFogsystem <em>Fogsystem</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeType#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.AttributeType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType()
 * @model
 * @generated
 */
public interface AttributeType extends FogResource {
	/**
	 * Returns the value of the '<em><b>Unitofmeasurment</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitofmeasurment</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType_Unitofmeasurment()
	 * @model
	 * @generated
	 */
	EList<UnitOfMeasurment> getUnitofmeasurment();

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType_ValueType()
	 * @model
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.AttributeType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType_Instances()
	 * @model
	 * @generated
	 */
	EList<Attribute> getInstances();

	/**
	 * Returns the value of the '<em><b>Fogsystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogSystem#getAttributetypes <em>Attributetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogsystem</em>' container reference.
	 * @see #setFogsystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType_Fogsystem()
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getAttributetypes
	 * @model opposite="attributetypes" transient="false"
	 * @generated
	 */
	FogSystem getFogsystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.AttributeType#getFogsystem <em>Fogsystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogsystem</em>' container reference.
	 * @see #getFogsystem()
	 * @generated
	 */
	void setFogsystem(FogSystem value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute list.
	 * The list contents are of type {@link fr.imta.semafor.fogAdlModel.ResourceType}.
	 * The literals are from the enumeration {@link fr.imta.semafor.fogAdlModel.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute list.
	 * @see fr.imta.semafor.fogAdlModel.ResourceType
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType_Resources()
	 * @model default="VirtualNode"
	 * @generated
	 */
	EList<ResourceType> getResources();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttributeType_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.AttributeType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	String[] getResourcesAsStrings();

} // AttributeType
