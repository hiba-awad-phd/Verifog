/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Of Measurment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getConversionToMainUnit <em>Conversion To Main Unit</em>}</li>
 *   <li>{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getFogsystem <em>Fogsystem</em>}</li>
 * </ul>
 *
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getUnitOfMeasurment()
 * @model
 * @generated
 */
public interface UnitOfMeasurment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getUnitOfMeasurment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conversion To Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion To Main Unit</em>' attribute.
	 * @see #setConversionToMainUnit(String)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getUnitOfMeasurment_ConversionToMainUnit()
	 * @model
	 * @generated
	 */
	String getConversionToMainUnit();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getConversionToMainUnit <em>Conversion To Main Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion To Main Unit</em>' attribute.
	 * @see #getConversionToMainUnit()
	 * @generated
	 */
	void setConversionToMainUnit(String value);

	/**
	 * Returns the value of the '<em><b>Fogsystem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.imta.semafor.fogAdlModel.FogSystem#getUnitsofmeasurment <em>Unitsofmeasurment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fogsystem</em>' container reference.
	 * @see #setFogsystem(FogSystem)
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getUnitOfMeasurment_Fogsystem()
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getUnitsofmeasurment
	 * @model opposite="unitsofmeasurment" transient="false"
	 * @generated
	 */
	FogSystem getFogsystem();

	/**
	 * Sets the value of the '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getFogsystem <em>Fogsystem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fogsystem</em>' container reference.
	 * @see #getFogsystem()
	 * @generated
	 */
	void setFogsystem(FogSystem value);

} // UnitOfMeasurment
