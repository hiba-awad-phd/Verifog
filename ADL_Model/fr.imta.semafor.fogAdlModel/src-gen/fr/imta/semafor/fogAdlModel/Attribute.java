/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Attribute#getUnitofmeasurment <em>Unitofmeasurment</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Attribute#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.Attribute#getFogresource <em>Fogresource</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unitofmeasurment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitofmeasurment</em>' reference.
	 * @see #setUnitofmeasurment(UnitOfMeasurment)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttribute_Unitofmeasurment()
	 * @model
	 * @generated
	 */
	UnitOfMeasurment getUnitofmeasurment();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Attribute#getUnitofmeasurment <em>Unitofmeasurment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitofmeasurment</em>' reference.
	 * @see #getUnitofmeasurment()
	 * @generated
	 */
	void setUnitofmeasurment(UnitOfMeasurment value);

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(AttributeType)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttribute_InstanceOf()
	 * @model
	 * @generated
	 */
	AttributeType getInstanceOf();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Attribute#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Fogresource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogResource#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogresource</em>' container reference.
	 * @see #setFogresource(FogResource)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getAttribute_Fogresource()
	 * @see fr.imta.semafor.fogAdlModel.FogResource#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	FogResource getFogresource();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.Attribute#getFogresource <em>Fogresource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogresource</em>' container reference.
	 * @see #getFogresource()
	 * @generated
	 */
	void setFogresource(FogResource value);

} // Attribute
