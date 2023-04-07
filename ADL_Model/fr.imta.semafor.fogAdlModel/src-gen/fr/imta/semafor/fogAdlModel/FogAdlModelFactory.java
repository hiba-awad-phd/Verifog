/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage
 * @generated
 */
public interface FogAdlModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FogAdlModelFactory eINSTANCE = fr.imta.semafor.fogAdlModel.impl.FogAdlModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fog Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Resource</em>'.
	 * @generated
	 */
	FogResource createFogResource();

	/**
	 * Returns a new object of class '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Type</em>'.
	 * @generated
	 */
	NodeType createNodeType();

	/**
	 * Returns a new object of class '<em>Physical Node Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Node Specification</em>'.
	 * @generated
	 */
	PhysicalNodeSpecification createPhysicalNodeSpecification();

	/**
	 * Returns a new object of class '<em>Virtual Node Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node Specification</em>'.
	 * @generated
	 */
	VirtualNodeSpecification createVirtualNodeSpecification();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Integer Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Expression</em>'.
	 * @generated
	 */
	IntegerValueExpression createIntegerValueExpression();

	/**
	 * Returns a new object of class '<em>Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Expression</em>'.
	 * @generated
	 */
	AttributeExpression createAttributeExpression();

	/**
	 * Returns a new object of class '<em>Custom Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Expression</em>'.
	 * @generated
	 */
	CustomExpression createCustomExpression();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Virtual Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node</em>'.
	 * @generated
	 */
	VirtualNode createVirtualNode();

	/**
	 * Returns a new object of class '<em>Physical Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Node</em>'.
	 * @generated
	 */
	PhysicalNode createPhysicalNode();

	/**
	 * Returns a new object of class '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Type</em>'.
	 * @generated
	 */
	NetworkType createNetworkType();

	/**
	 * Returns a new object of class '<em>Network Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Link Type</em>'.
	 * @generated
	 */
	NetworkLinkType createNetworkLinkType();

	/**
	 * Returns a new object of class '<em>Network Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Class Expression</em>'.
	 * @generated
	 */
	NetworkClassExpression createNetworkClassExpression();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Network Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Link</em>'.
	 * @generated
	 */
	NetworkLink createNetworkLink();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Type</em>'.
	 * @generated
	 */
	ServiceType createServiceType();

	/**
	 * Returns a new object of class '<em>Software Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Package</em>'.
	 * @generated
	 */
	SoftwarePackage createSoftwarePackage();

	/**
	 * Returns a new object of class '<em>Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Port</em>'.
	 * @generated
	 */
	NetworkPort createNetworkPort();

	/**
	 * Returns a new object of class '<em>Fog Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Area</em>'.
	 * @generated
	 */
	FogArea createFogArea();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Multiplicity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Expression</em>'.
	 * @generated
	 */
	MultiplicityExpression createMultiplicityExpression();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Type</em>'.
	 * @generated
	 */
	ConnectorType createConnectorType();

	/**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
	AttributeType createAttributeType();

	/**
	 * Returns a new object of class '<em>Unit Of Measurment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Of Measurment</em>'.
	 * @generated
	 */
	UnitOfMeasurment createUnitOfMeasurment();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Fog System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog System</em>'.
	 * @generated
	 */
	FogSystem createFogSystem();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FogAdlModelPackage getFogAdlModelPackage();

} //FogAdlModelFactory
