/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FogAdlModelFactoryImpl extends EFactoryImpl implements FogAdlModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FogAdlModelFactory init() {
		try {
			FogAdlModelFactory theFogAdlModelFactory = (FogAdlModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(FogAdlModelPackage.eNS_URI);
			if (theFogAdlModelFactory != null) {
				return theFogAdlModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FogAdlModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogAdlModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FogAdlModelPackage.FOG_RESOURCE:
			return createFogResource();
		case FogAdlModelPackage.NODE_TYPE:
			return createNodeType();
		case FogAdlModelPackage.FOG_SYSTEM:
			return createFogSystem();
		case FogAdlModelPackage.TAG:
			return createTag();
		case FogAdlModelPackage.CONSTRAINT:
			return createConstraint();
		case FogAdlModelPackage.PHYSICAL_NODE_SPECIFICATION:
			return createPhysicalNodeSpecification();
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION:
			return createVirtualNodeSpecification();
		case FogAdlModelPackage.EXPRESSION:
			return createExpression();
		case FogAdlModelPackage.INTEGER_VALUE_EXPRESSION:
			return createIntegerValueExpression();
		case FogAdlModelPackage.ATTRIBUTE_EXPRESSION:
			return createAttributeExpression();
		case FogAdlModelPackage.CUSTOM_EXPRESSION:
			return createCustomExpression();
		case FogAdlModelPackage.NODE:
			return createNode();
		case FogAdlModelPackage.VIRTUAL_NODE:
			return createVirtualNode();
		case FogAdlModelPackage.PHYSICAL_NODE:
			return createPhysicalNode();
		case FogAdlModelPackage.NETWORK_TYPE:
			return createNetworkType();
		case FogAdlModelPackage.NETWORK_LINK_TYPE:
			return createNetworkLinkType();
		case FogAdlModelPackage.NETWORK_CLASS_EXPRESSION:
			return createNetworkClassExpression();
		case FogAdlModelPackage.NETWORK:
			return createNetwork();
		case FogAdlModelPackage.NETWORK_LINK:
			return createNetworkLink();
		case FogAdlModelPackage.APPLICATION:
			return createApplication();
		case FogAdlModelPackage.SERVICE_TYPE:
			return createServiceType();
		case FogAdlModelPackage.SOFTWARE_PACKAGE:
			return createSoftwarePackage();
		case FogAdlModelPackage.NETWORK_PORT:
			return createNetworkPort();
		case FogAdlModelPackage.FOG_AREA:
			return createFogArea();
		case FogAdlModelPackage.SERVICE:
			return createService();
		case FogAdlModelPackage.MULTIPLICITY_EXPRESSION:
			return createMultiplicityExpression();
		case FogAdlModelPackage.CONNECTOR:
			return createConnector();
		case FogAdlModelPackage.CONNECTOR_TYPE:
			return createConnectorType();
		case FogAdlModelPackage.ATTRIBUTE_TYPE:
			return createAttributeType();
		case FogAdlModelPackage.UNIT_OF_MEASURMENT:
			return createUnitOfMeasurment();
		case FogAdlModelPackage.ATTRIBUTE:
			return createAttribute();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FogAdlModelPackage.COMPARAISON_OPERATOR:
			return createComparaisonOperatorFromString(eDataType, initialValue);
		case FogAdlModelPackage.CPU_ARCHITECTURE:
			return createCPUArchitectureFromString(eDataType, initialValue);
		case FogAdlModelPackage.OPERATING_SYSTEM:
			return createOperatingSystemFromString(eDataType, initialValue);
		case FogAdlModelPackage.HEALTH_STATUS:
			return createHealthStatusFromString(eDataType, initialValue);
		case FogAdlModelPackage.NETWORK_CLASS:
			return createNetworkClassFromString(eDataType, initialValue);
		case FogAdlModelPackage.TRANSPORT_PROTOCOL:
			return createTransportProtocolFromString(eDataType, initialValue);
		case FogAdlModelPackage.MULTIPLICITY_OPERATOR:
			return createMultiplicityOperatorFromString(eDataType, initialValue);
		case FogAdlModelPackage.RESOURCE_TYPE:
			return createResourceTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FogAdlModelPackage.COMPARAISON_OPERATOR:
			return convertComparaisonOperatorToString(eDataType, instanceValue);
		case FogAdlModelPackage.CPU_ARCHITECTURE:
			return convertCPUArchitectureToString(eDataType, instanceValue);
		case FogAdlModelPackage.OPERATING_SYSTEM:
			return convertOperatingSystemToString(eDataType, instanceValue);
		case FogAdlModelPackage.HEALTH_STATUS:
			return convertHealthStatusToString(eDataType, instanceValue);
		case FogAdlModelPackage.NETWORK_CLASS:
			return convertNetworkClassToString(eDataType, instanceValue);
		case FogAdlModelPackage.TRANSPORT_PROTOCOL:
			return convertTransportProtocolToString(eDataType, instanceValue);
		case FogAdlModelPackage.MULTIPLICITY_OPERATOR:
			return convertMultiplicityOperatorToString(eDataType, instanceValue);
		case FogAdlModelPackage.RESOURCE_TYPE:
			return convertResourceTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogResource createFogResource() {
		FogResourceImpl fogResource = new FogResourceImpl();
		return fogResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalNodeSpecification createPhysicalNodeSpecification() {
		PhysicalNodeSpecificationImpl physicalNodeSpecification = new PhysicalNodeSpecificationImpl();
		return physicalNodeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeSpecification createVirtualNodeSpecification() {
		VirtualNodeSpecificationImpl virtualNodeSpecification = new VirtualNodeSpecificationImpl();
		return virtualNodeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueExpression createIntegerValueExpression() {
		IntegerValueExpressionImpl integerValueExpression = new IntegerValueExpressionImpl();
		return integerValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeExpression createAttributeExpression() {
		AttributeExpressionImpl attributeExpression = new AttributeExpressionImpl();
		return attributeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomExpression createCustomExpression() {
		CustomExpressionImpl customExpression = new CustomExpressionImpl();
		return customExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNode createVirtualNode() {
		VirtualNodeImpl virtualNode = new VirtualNodeImpl();
		return virtualNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalNode createPhysicalNode() {
		PhysicalNodeImpl physicalNode = new PhysicalNodeImpl();
		return physicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkType() {
		NetworkTypeImpl networkType = new NetworkTypeImpl();
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkType createNetworkLinkType() {
		NetworkLinkTypeImpl networkLinkType = new NetworkLinkTypeImpl();
		return networkLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkClassExpression createNetworkClassExpression() {
		NetworkClassExpressionImpl networkClassExpression = new NetworkClassExpressionImpl();
		return networkClassExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLink createNetworkLink() {
		NetworkLinkImpl networkLink = new NetworkLinkImpl();
		return networkLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarePackage createSoftwarePackage() {
		SoftwarePackageImpl softwarePackage = new SoftwarePackageImpl();
		return softwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkPort createNetworkPort() {
		NetworkPortImpl networkPort = new NetworkPortImpl();
		return networkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogArea createFogArea() {
		FogAreaImpl fogArea = new FogAreaImpl();
		return fogArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityExpression createMultiplicityExpression() {
		MultiplicityExpressionImpl multiplicityExpression = new MultiplicityExpressionImpl();
		return multiplicityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasurment createUnitOfMeasurment() {
		UnitOfMeasurmentImpl unitOfMeasurment = new UnitOfMeasurmentImpl();
		return unitOfMeasurment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparaisonOperator createComparaisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparaisonOperator result = ComparaisonOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparaisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUArchitecture createCPUArchitectureFromString(EDataType eDataType, String initialValue) {
		CPUArchitecture result = CPUArchitecture.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPUArchitectureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystemFromString(EDataType eDataType, String initialValue) {
		OperatingSystem result = OperatingSystem.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatus createHealthStatusFromString(EDataType eDataType, String initialValue) {
		HealthStatus result = HealthStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHealthStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkClass createNetworkClassFromString(EDataType eDataType, String initialValue) {
		NetworkClass result = NetworkClass.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol createTransportProtocolFromString(EDataType eDataType, String initialValue) {
		TransportProtocol result = TransportProtocol.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityOperator createMultiplicityOperatorFromString(EDataType eDataType, String initialValue) {
		MultiplicityOperator result = MultiplicityOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceTypeFromString(EDataType eDataType, String initialValue) {
		ResourceType result = ResourceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogSystem createFogSystem() {
		FogSystemImpl fogSystem = new FogSystemImpl();
		return fogSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogAdlModelPackage getFogAdlModelPackage() {
		return (FogAdlModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FogAdlModelPackage getPackage() {
		return FogAdlModelPackage.eINSTANCE;
	}

} //FogAdlModelFactoryImpl
