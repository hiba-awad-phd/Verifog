/**
 */
package fr.imta.semafor.fogAdlModel.impl;

import fr.imta.semafor.fogAdlModel.Application;
import fr.imta.semafor.fogAdlModel.Attribute;
import fr.imta.semafor.fogAdlModel.AttributeExpression;
import fr.imta.semafor.fogAdlModel.AttributeType;
import fr.imta.semafor.fogAdlModel.CPUArchitecture;
import fr.imta.semafor.fogAdlModel.ComparaisonOperator;
import fr.imta.semafor.fogAdlModel.Connector;
import fr.imta.semafor.fogAdlModel.ConnectorType;
import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.CustomExpression;
import fr.imta.semafor.fogAdlModel.Expression;
import fr.imta.semafor.fogAdlModel.FogAdlModelFactory;
import fr.imta.semafor.fogAdlModel.FogAdlModelPackage;
import fr.imta.semafor.fogAdlModel.FogArea;
import fr.imta.semafor.fogAdlModel.FogResource;

import fr.imta.semafor.fogAdlModel.FogSystem;
import fr.imta.semafor.fogAdlModel.HealthStatus;
import fr.imta.semafor.fogAdlModel.IntegerValueExpression;
import fr.imta.semafor.fogAdlModel.MultiplicityExpression;
import fr.imta.semafor.fogAdlModel.MultiplicityOperator;
import fr.imta.semafor.fogAdlModel.Network;
import fr.imta.semafor.fogAdlModel.NetworkClass;
import fr.imta.semafor.fogAdlModel.NetworkClassExpression;
import fr.imta.semafor.fogAdlModel.NetworkLink;
import fr.imta.semafor.fogAdlModel.NetworkLinkType;
import fr.imta.semafor.fogAdlModel.NetworkPort;
import fr.imta.semafor.fogAdlModel.NetworkType;
import fr.imta.semafor.fogAdlModel.Node;
import fr.imta.semafor.fogAdlModel.NodeType;
import fr.imta.semafor.fogAdlModel.OperatingSystem;
import fr.imta.semafor.fogAdlModel.PhysicalNode;
import fr.imta.semafor.fogAdlModel.PhysicalNodeSpecification;
import fr.imta.semafor.fogAdlModel.ResourceType;
import fr.imta.semafor.fogAdlModel.Service;
import fr.imta.semafor.fogAdlModel.ServiceType;
import fr.imta.semafor.fogAdlModel.SoftwarePackage;
import fr.imta.semafor.fogAdlModel.Tag;
import fr.imta.semafor.fogAdlModel.TransportProtocol;
import fr.imta.semafor.fogAdlModel.UnitOfMeasurment;
import fr.imta.semafor.fogAdlModel.VirtualNode;
import fr.imta.semafor.fogAdlModel.VirtualNodeSpecification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FogAdlModelPackageImpl extends EPackageImpl implements FogAdlModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalNodeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkClassExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwarePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOfMeasurmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparaisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cpuArchitectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatingSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum healthStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FogAdlModelPackageImpl() {
		super(eNS_URI, FogAdlModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FogAdlModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FogAdlModelPackage init() {
		if (isInited)
			return (FogAdlModelPackage) EPackage.Registry.INSTANCE.getEPackage(FogAdlModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFogAdlModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FogAdlModelPackageImpl theFogAdlModelPackage = registeredFogAdlModelPackage instanceof FogAdlModelPackageImpl
				? (FogAdlModelPackageImpl) registeredFogAdlModelPackage
				: new FogAdlModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFogAdlModelPackage.createPackageContents();

		// Initialize created meta-data
		theFogAdlModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFogAdlModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FogAdlModelPackage.eNS_URI, theFogAdlModelPackage);
		return theFogAdlModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogResource() {
		return fogResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogResource_Tags() {
		return (EReference) fogResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogResource_ImportedNamespace1() {
		return (EAttribute) fogResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogResource_Name() {
		return (EAttribute) fogResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogResource_Attributes() {
		return (EReference) fogResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType() {
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Fogsystem() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Constraints() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Instances() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_DownloadLink() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_UploadLink() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_HostedNode() {
		return (EReference) nodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalNodeSpecification() {
		return physicalNodeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeSpecification() {
		return virtualNodeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualNodeSpecification_ImageName() {
		return (EAttribute) virtualNodeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualNodeSpecification_ImageRegistry() {
		return (EAttribute) virtualNodeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeSpecification_Replicas() {
		return (EReference) virtualNodeSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeSpecification_Hosts() {
		return (EReference) virtualNodeSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeSpecification_HostingNode() {
		return (EReference) virtualNodeSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueExpression() {
		return integerValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueExpression_Value() {
		return (EAttribute) integerValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeExpression() {
		return attributeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeExpression_Attribute() {
		return (EReference) attributeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeExpression_AttributeName() {
		return (EAttribute) attributeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomExpression() {
		return customExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomExpression_Expression() {
		return (EAttribute) customExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_IsInstanceOf() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_CpuArchitecture() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_OperatingSystem() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Runtimes() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_HealthStatus() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_HostedVirtualNodes() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_CPUCores() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Memory() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_DiskStorage() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_ReferenceToVirtualNodeType() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_UploadLink() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_DownloadLink() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_HostedServices() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNode() {
		return virtualNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNode_HostingNode() {
		return (EReference) virtualNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalNode() {
		return physicalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalNode_Fogarea() {
		return (EReference) physicalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkType() {
		return networkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Fogsystem() {
		return (EReference) networkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Downloadlinks() {
		return (EReference) networkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Instances() {
		return (EReference) networkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_UploadLink() {
		return (EReference) networkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Constraints() {
		return (EReference) networkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLinkType() {
		return networkLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_TargetNetwork() {
		return (EReference) networkLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_SourceNode() {
		return (EReference) networkLinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_TargetNode() {
		return (EReference) networkLinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_Instances() {
		return (EReference) networkLinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_SourceNetworks() {
		return (EReference) networkLinkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_Constraints() {
		return (EReference) networkLinkTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkClassExpression() {
		return networkClassExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkClassExpression_Value() {
		return (EAttribute) networkClassExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Fogsystem() {
		return (EReference) networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_DownloadLinks() {
		return (EReference) networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_IsInstanceOf() {
		return (EReference) networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Uploadlinks() {
		return (EReference) networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLink() {
		return networkLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLink_TargetNetwork() {
		return (EReference) networkLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLink_SourceNode() {
		return (EReference) networkLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLink_TargetNode() {
		return (EReference) networkLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLink_IsInstanceOf() {
		return (EReference) networkLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLink_SourceIpAddress() {
		return (EAttribute) networkLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLink_TargetIpAddress() {
		return (EAttribute) networkLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLink_Bitrate() {
		return (EAttribute) networkLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLink_SourceNetworks() {
		return (EReference) networkLinkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_FogSystem() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ServiceTypes() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Services() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Connectortypes() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Connectors() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Constraints() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Application() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_HostedOn() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_ImplementedBy() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Instances() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Constraints() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_NetworkPorts() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_IncomingDataflows() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_OutcomingDataflows() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwarePackage() {
		return softwarePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwarePackage_InstallStartScript() {
		return (EAttribute) softwarePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwarePackage_Constraints() {
		return (EReference) softwarePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkPort() {
		return networkPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_Protocol() {
		return (EAttribute) networkPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_PortNumber() {
		return (EAttribute) networkPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_PortName() {
		return (EAttribute) networkPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_HostPort() {
		return (EAttribute) networkPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogArea() {
		return fogAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogArea_Fogsystem() {
		return (EReference) fogAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogArea_Nodes() {
		return (EReference) fogAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_InstanceOf() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_HostingNode() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Networkports() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Application() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IncomingDataflows() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_OutcomingDataflows() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityExpression() {
		return multiplicityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityExpression_MultiplicityOperator() {
		return (EAttribute) multiplicityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_TargetServices() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SourceServices() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_InstanceOf() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Application() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_TargetServices() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_SourceServices() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_Application() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_Instances() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_Constraints() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Unitofmeasurment() {
		return (EReference) attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_ValueType() {
		return (EAttribute) attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Instances() {
		return (EReference) attributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Fogsystem() {
		return (EReference) attributeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Resources() {
		return (EAttribute) attributeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_DefaultValue() {
		return (EAttribute) attributeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitOfMeasurment() {
		return unitOfMeasurmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitOfMeasurment_Name() {
		return (EAttribute) unitOfMeasurmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitOfMeasurment_ConversionToMainUnit() {
		return (EAttribute) unitOfMeasurmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitOfMeasurment_Fogsystem() {
		return (EReference) unitOfMeasurmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Unitofmeasurment() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_InstanceOf() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Fogresource() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparaisonOperator() {
		return comparaisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCPUArchitecture() {
		return cpuArchitectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatingSystem() {
		return operatingSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHealthStatus() {
		return healthStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkClass() {
		return networkClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportProtocol() {
		return transportProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicityOperator() {
		return multiplicityOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogSystem() {
		return fogSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Physicalnodespecification() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Networktypes() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Networks() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Applications() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Fogareas() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Attributetypes() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogSystem_Unitsofmeasurment() {
		return (EReference) fogSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Key() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Value() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Operator() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Expression() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedPackage() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogAdlModelFactory getFogAdlModelFactory() {
		return (FogAdlModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		fogResourceEClass = createEClass(FOG_RESOURCE);
		createEReference(fogResourceEClass, FOG_RESOURCE__TAGS);
		createEAttribute(fogResourceEClass, FOG_RESOURCE__IMPORTED_NAMESPACE1);
		createEAttribute(fogResourceEClass, FOG_RESOURCE__NAME);
		createEReference(fogResourceEClass, FOG_RESOURCE__ATTRIBUTES);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEReference(nodeTypeEClass, NODE_TYPE__FOGSYSTEM);
		createEReference(nodeTypeEClass, NODE_TYPE__CONSTRAINTS);
		createEReference(nodeTypeEClass, NODE_TYPE__INSTANCES);
		createEReference(nodeTypeEClass, NODE_TYPE__DOWNLOAD_LINK);
		createEReference(nodeTypeEClass, NODE_TYPE__UPLOAD_LINK);
		createEReference(nodeTypeEClass, NODE_TYPE__HOSTED_NODE);

		fogSystemEClass = createEClass(FOG_SYSTEM);
		createEReference(fogSystemEClass, FOG_SYSTEM__PHYSICALNODESPECIFICATION);
		createEReference(fogSystemEClass, FOG_SYSTEM__NETWORKTYPES);
		createEReference(fogSystemEClass, FOG_SYSTEM__NETWORKS);
		createEReference(fogSystemEClass, FOG_SYSTEM__APPLICATIONS);
		createEReference(fogSystemEClass, FOG_SYSTEM__FOGAREAS);
		createEReference(fogSystemEClass, FOG_SYSTEM__ATTRIBUTETYPES);
		createEReference(fogSystemEClass, FOG_SYSTEM__UNITSOFMEASURMENT);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__KEY);
		createEAttribute(tagEClass, TAG__VALUE);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__OPERATOR);
		createEReference(constraintEClass, CONSTRAINT__EXPRESSION);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_PACKAGE);

		physicalNodeSpecificationEClass = createEClass(PHYSICAL_NODE_SPECIFICATION);

		virtualNodeSpecificationEClass = createEClass(VIRTUAL_NODE_SPECIFICATION);
		createEAttribute(virtualNodeSpecificationEClass, VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME);
		createEAttribute(virtualNodeSpecificationEClass, VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY);
		createEReference(virtualNodeSpecificationEClass, VIRTUAL_NODE_SPECIFICATION__REPLICAS);
		createEReference(virtualNodeSpecificationEClass, VIRTUAL_NODE_SPECIFICATION__HOSTS);
		createEReference(virtualNodeSpecificationEClass, VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE);

		expressionEClass = createEClass(EXPRESSION);

		integerValueExpressionEClass = createEClass(INTEGER_VALUE_EXPRESSION);
		createEAttribute(integerValueExpressionEClass, INTEGER_VALUE_EXPRESSION__VALUE);

		attributeExpressionEClass = createEClass(ATTRIBUTE_EXPRESSION);
		createEReference(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__ATTRIBUTE);
		createEAttribute(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__ATTRIBUTE_NAME);

		customExpressionEClass = createEClass(CUSTOM_EXPRESSION);
		createEAttribute(customExpressionEClass, CUSTOM_EXPRESSION__EXPRESSION);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__IS_INSTANCE_OF);
		createEAttribute(nodeEClass, NODE__CPU_ARCHITECTURE);
		createEAttribute(nodeEClass, NODE__OPERATING_SYSTEM);
		createEAttribute(nodeEClass, NODE__RUNTIMES);
		createEAttribute(nodeEClass, NODE__HEALTH_STATUS);
		createEReference(nodeEClass, NODE__HOSTED_VIRTUAL_NODES);
		createEAttribute(nodeEClass, NODE__CPU_CORES);
		createEAttribute(nodeEClass, NODE__MEMORY);
		createEAttribute(nodeEClass, NODE__DISK_STORAGE);
		createEAttribute(nodeEClass, NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE);
		createEReference(nodeEClass, NODE__UPLOAD_LINK);
		createEReference(nodeEClass, NODE__DOWNLOAD_LINK);
		createEReference(nodeEClass, NODE__HOSTED_SERVICES);

		virtualNodeEClass = createEClass(VIRTUAL_NODE);
		createEReference(virtualNodeEClass, VIRTUAL_NODE__HOSTING_NODE);

		physicalNodeEClass = createEClass(PHYSICAL_NODE);
		createEReference(physicalNodeEClass, PHYSICAL_NODE__FOGAREA);

		networkTypeEClass = createEClass(NETWORK_TYPE);
		createEReference(networkTypeEClass, NETWORK_TYPE__FOGSYSTEM);
		createEReference(networkTypeEClass, NETWORK_TYPE__DOWNLOADLINKS);
		createEReference(networkTypeEClass, NETWORK_TYPE__INSTANCES);
		createEReference(networkTypeEClass, NETWORK_TYPE__UPLOAD_LINK);
		createEReference(networkTypeEClass, NETWORK_TYPE__CONSTRAINTS);

		networkLinkTypeEClass = createEClass(NETWORK_LINK_TYPE);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__TARGET_NETWORK);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__SOURCE_NODE);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__TARGET_NODE);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__INSTANCES);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__SOURCE_NETWORKS);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__CONSTRAINTS);

		networkClassExpressionEClass = createEClass(NETWORK_CLASS_EXPRESSION);
		createEAttribute(networkClassExpressionEClass, NETWORK_CLASS_EXPRESSION__VALUE);

		networkEClass = createEClass(NETWORK);
		createEReference(networkEClass, NETWORK__FOGSYSTEM);
		createEReference(networkEClass, NETWORK__DOWNLOAD_LINKS);
		createEReference(networkEClass, NETWORK__IS_INSTANCE_OF);
		createEReference(networkEClass, NETWORK__UPLOADLINKS);

		networkLinkEClass = createEClass(NETWORK_LINK);
		createEReference(networkLinkEClass, NETWORK_LINK__TARGET_NETWORK);
		createEReference(networkLinkEClass, NETWORK_LINK__SOURCE_NODE);
		createEReference(networkLinkEClass, NETWORK_LINK__TARGET_NODE);
		createEReference(networkLinkEClass, NETWORK_LINK__IS_INSTANCE_OF);
		createEAttribute(networkLinkEClass, NETWORK_LINK__SOURCE_IP_ADDRESS);
		createEAttribute(networkLinkEClass, NETWORK_LINK__TARGET_IP_ADDRESS);
		createEAttribute(networkLinkEClass, NETWORK_LINK__BITRATE);
		createEReference(networkLinkEClass, NETWORK_LINK__SOURCE_NETWORKS);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__FOG_SYSTEM);
		createEReference(applicationEClass, APPLICATION__SERVICE_TYPES);
		createEReference(applicationEClass, APPLICATION__SERVICES);
		createEReference(applicationEClass, APPLICATION__CONNECTORTYPES);
		createEReference(applicationEClass, APPLICATION__CONNECTORS);
		createEReference(applicationEClass, APPLICATION__CONSTRAINTS);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEReference(serviceTypeEClass, SERVICE_TYPE__APPLICATION);
		createEReference(serviceTypeEClass, SERVICE_TYPE__HOSTED_ON);
		createEReference(serviceTypeEClass, SERVICE_TYPE__IMPLEMENTED_BY);
		createEReference(serviceTypeEClass, SERVICE_TYPE__INSTANCES);
		createEReference(serviceTypeEClass, SERVICE_TYPE__CONSTRAINTS);
		createEReference(serviceTypeEClass, SERVICE_TYPE__NETWORK_PORTS);
		createEReference(serviceTypeEClass, SERVICE_TYPE__INCOMING_DATAFLOWS);
		createEReference(serviceTypeEClass, SERVICE_TYPE__OUTCOMING_DATAFLOWS);

		softwarePackageEClass = createEClass(SOFTWARE_PACKAGE);
		createEAttribute(softwarePackageEClass, SOFTWARE_PACKAGE__INSTALL_START_SCRIPT);
		createEReference(softwarePackageEClass, SOFTWARE_PACKAGE__CONSTRAINTS);

		networkPortEClass = createEClass(NETWORK_PORT);
		createEAttribute(networkPortEClass, NETWORK_PORT__PROTOCOL);
		createEAttribute(networkPortEClass, NETWORK_PORT__PORT_NUMBER);
		createEAttribute(networkPortEClass, NETWORK_PORT__PORT_NAME);
		createEAttribute(networkPortEClass, NETWORK_PORT__HOST_PORT);

		fogAreaEClass = createEClass(FOG_AREA);
		createEReference(fogAreaEClass, FOG_AREA__FOGSYSTEM);
		createEReference(fogAreaEClass, FOG_AREA__NODES);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__INSTANCE_OF);
		createEReference(serviceEClass, SERVICE__HOSTING_NODE);
		createEReference(serviceEClass, SERVICE__NETWORKPORTS);
		createEReference(serviceEClass, SERVICE__APPLICATION);
		createEReference(serviceEClass, SERVICE__INCOMING_DATAFLOWS);
		createEReference(serviceEClass, SERVICE__OUTCOMING_DATAFLOWS);

		multiplicityExpressionEClass = createEClass(MULTIPLICITY_EXPRESSION);
		createEAttribute(multiplicityExpressionEClass, MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__TARGET_SERVICES);
		createEReference(connectorEClass, CONNECTOR__SOURCE_SERVICES);
		createEReference(connectorEClass, CONNECTOR__INSTANCE_OF);
		createEReference(connectorEClass, CONNECTOR__APPLICATION);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__TARGET_SERVICES);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__SOURCE_SERVICES);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__APPLICATION);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__INSTANCES);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__CONSTRAINTS);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__UNITOFMEASURMENT);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__VALUE_TYPE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__INSTANCES);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__FOGSYSTEM);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__RESOURCES);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__DEFAULT_VALUE);

		unitOfMeasurmentEClass = createEClass(UNIT_OF_MEASURMENT);
		createEAttribute(unitOfMeasurmentEClass, UNIT_OF_MEASURMENT__NAME);
		createEAttribute(unitOfMeasurmentEClass, UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT);
		createEReference(unitOfMeasurmentEClass, UNIT_OF_MEASURMENT__FOGSYSTEM);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEReference(attributeEClass, ATTRIBUTE__UNITOFMEASURMENT);
		createEReference(attributeEClass, ATTRIBUTE__INSTANCE_OF);
		createEReference(attributeEClass, ATTRIBUTE__FOGRESOURCE);

		// Create enums
		comparaisonOperatorEEnum = createEEnum(COMPARAISON_OPERATOR);
		cpuArchitectureEEnum = createEEnum(CPU_ARCHITECTURE);
		operatingSystemEEnum = createEEnum(OPERATING_SYSTEM);
		healthStatusEEnum = createEEnum(HEALTH_STATUS);
		networkClassEEnum = createEEnum(NETWORK_CLASS);
		transportProtocolEEnum = createEEnum(TRANSPORT_PROTOCOL);
		multiplicityOperatorEEnum = createEEnum(MULTIPLICITY_OPERATOR);
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeTypeEClass.getESuperTypes().add(this.getFogResource());
		fogSystemEClass.getESuperTypes().add(this.getFogResource());
		physicalNodeSpecificationEClass.getESuperTypes().add(this.getNodeType());
		virtualNodeSpecificationEClass.getESuperTypes().add(this.getNodeType());
		integerValueExpressionEClass.getESuperTypes().add(this.getExpression());
		attributeExpressionEClass.getESuperTypes().add(this.getExpression());
		customExpressionEClass.getESuperTypes().add(this.getExpression());
		nodeEClass.getESuperTypes().add(this.getFogResource());
		virtualNodeEClass.getESuperTypes().add(this.getNode());
		physicalNodeEClass.getESuperTypes().add(this.getNode());
		networkTypeEClass.getESuperTypes().add(this.getFogResource());
		networkLinkTypeEClass.getESuperTypes().add(this.getFogResource());
		networkClassExpressionEClass.getESuperTypes().add(this.getExpression());
		networkEClass.getESuperTypes().add(this.getFogResource());
		networkLinkEClass.getESuperTypes().add(this.getFogResource());
		applicationEClass.getESuperTypes().add(this.getFogResource());
		serviceTypeEClass.getESuperTypes().add(this.getFogResource());
		softwarePackageEClass.getESuperTypes().add(this.getFogResource());
		fogAreaEClass.getESuperTypes().add(this.getFogResource());
		serviceEClass.getESuperTypes().add(this.getFogResource());
		multiplicityExpressionEClass.getESuperTypes().add(this.getExpression());
		connectorEClass.getESuperTypes().add(this.getFogResource());
		connectorTypeEClass.getESuperTypes().add(this.getFogResource());
		attributeTypeEClass.getESuperTypes().add(this.getFogResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(fogResourceEClass, FogResource.class, "FogResource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFogResource_Tags(), this.getTag(), null, "tags", null, 0, -1, FogResource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFogResource_ImportedNamespace1(), ecorePackage.getEString(), "importedNamespace1", null, 0, 1,
				FogResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFogResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, FogResource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogResource_Attributes(), this.getAttribute(), this.getAttribute_Fogresource(), "attributes",
				null, 0, -1, FogResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeType_Fogsystem(), this.getFogSystem(), this.getFogSystem_Physicalnodespecification(),
				"fogsystem", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1,
				NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_Instances(), this.getNode(), null, "instances", null, 0, -1, NodeType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_DownloadLink(), this.getNetworkLinkType(), this.getNetworkLinkType_SourceNode(),
				"downloadLink", null, 0, -1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_UploadLink(), this.getNetworkLinkType(), this.getNetworkLinkType_TargetNode(),
				"uploadLink", null, 0, -1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_HostedNode(), this.getVirtualNodeSpecification(), null, "hostedNode", null, 0, -1,
				NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fogSystemEClass, FogSystem.class, "FogSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFogSystem_Physicalnodespecification(), this.getNodeType(), this.getNodeType_Fogsystem(),
				"physicalnodespecification", null, 0, -1, FogSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogSystem_Networktypes(), this.getNetworkType(), this.getNetworkType_Fogsystem(),
				"networktypes", null, 0, -1, FogSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogSystem_Networks(), this.getNetwork(), this.getNetwork_Fogsystem(), "networks", null, 0, -1,
				FogSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogSystem_Applications(), this.getApplication(), this.getApplication_FogSystem(),
				"applications", null, 0, -1, FogSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogSystem_Fogareas(), this.getFogArea(), null, "fogareas", null, 0, -1, FogSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogSystem_Attributetypes(), this.getAttributeType(), this.getAttributeType_Fogsystem(),
				"attributetypes", null, 0, -1, FogSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogSystem_Unitsofmeasurment(), this.getUnitOfMeasurment(),
				this.getUnitOfMeasurment_Fogsystem(), "unitsofmeasurment", null, 0, -1, FogSystem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Key(), ecorePackage.getEString(), "key", null, 0, 1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Value(), ecorePackage.getEString(), "value", null, 0, 1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Operator(), this.getComparaisonOperator(), "operator", null, 0, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Expression(), this.getExpression(), null, "expression", null, 2, 2,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_ConstrainedPackage(), this.getSoftwarePackage(),
				this.getSoftwarePackage_Constraints(), "constrainedPackage", null, 0, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalNodeSpecificationEClass, PhysicalNodeSpecification.class, "PhysicalNodeSpecification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualNodeSpecificationEClass, VirtualNodeSpecification.class, "VirtualNodeSpecification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualNodeSpecification_ImageName(), ecorePackage.getEString(), "imageName", null, 0, 1,
				VirtualNodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualNodeSpecification_ImageRegistry(), ecorePackage.getEString(), "imageRegistry", null, 0,
				1, VirtualNodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNodeSpecification_Replicas(), this.getConstraint(), null, "replicas", null, 0, -1,
				VirtualNodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNodeSpecification_Hosts(), this.getServiceType(), this.getServiceType_HostedOn(),
				"hosts", null, 0, -1, VirtualNodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNodeSpecification_HostingNode(), this.getNodeType(), null, "hostingNode", null, 0, 1,
				VirtualNodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueExpressionEClass, IntegerValueExpression.class, "IntegerValueExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueExpression_Value(), ecorePackage.getEInt(), "value", null, 0, 1,
				IntegerValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeExpressionEClass, AttributeExpression.class, "AttributeExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeExpression_Attribute(), this.getAttributeType(), null, "attribute", null, 0, 1,
				AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeExpression_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1,
				AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customExpressionEClass, CustomExpression.class, "CustomExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1,
				CustomExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_IsInstanceOf(), this.getNodeType(), null, "isInstanceOf", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_CpuArchitecture(), this.getCPUArchitecture(), "cpuArchitecture", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_OperatingSystem(), this.getOperatingSystem(), "OperatingSystem", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Runtimes(), ecorePackage.getEByteArray(), "runtimes", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_HealthStatus(), this.getHealthStatus(), "healthStatus", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_HostedVirtualNodes(), this.getVirtualNode(), this.getVirtualNode_HostingNode(),
				"hostedVirtualNodes", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_CPUCores(), ecorePackage.getEInt(), "CPUCores", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Memory(), ecorePackage.getEInt(), "memory", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_DiskStorage(), ecorePackage.getEInt(), "diskStorage", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ReferenceToVirtualNodeType(), ecorePackage.getEString(), "referenceToVirtualNodeType",
				null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNode_UploadLink(), this.getNetworkLink(), this.getNetworkLink_SourceNode(), "uploadLink",
				null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_DownloadLink(), this.getNetworkLink(), this.getNetworkLink_TargetNode(), "downloadLink",
				null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_HostedServices(), this.getService(), this.getService_HostingNode(), "hostedServices",
				null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualNodeEClass, VirtualNode.class, "VirtualNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualNode_HostingNode(), this.getNode(), this.getNode_HostedVirtualNodes(), "hostingNode",
				null, 0, 1, VirtualNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalNodeEClass, PhysicalNode.class, "PhysicalNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalNode_Fogarea(), this.getFogArea(), null, "fogarea", null, 1, 1, PhysicalNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkTypeEClass, NetworkType.class, "NetworkType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkType_Fogsystem(), this.getFogSystem(), this.getFogSystem_Networktypes(), "fogsystem",
				null, 0, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_Downloadlinks(), this.getNetworkLinkType(),
				this.getNetworkLinkType_TargetNetwork(), "downloadlinks", null, 0, -1, NetworkType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNetworkType_Instances(), this.getNetwork(), null, "instances", null, 0, -1, NetworkType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_UploadLink(), this.getNetworkLinkType(), this.getNetworkLinkType_SourceNetworks(),
				"uploadLink", null, 0, -1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1,
				NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLinkTypeEClass, NetworkLinkType.class, "NetworkLinkType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkLinkType_TargetNetwork(), this.getNetworkType(), this.getNetworkType_Downloadlinks(),
				"targetNetwork", null, 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_SourceNode(), this.getNodeType(), this.getNodeType_DownloadLink(),
				"sourceNode", null, 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_TargetNode(), this.getNodeType(), this.getNodeType_UploadLink(), "targetNode",
				null, 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_Instances(), this.getNetworkLink(), this.getNetworkLink_IsInstanceOf(),
				"instances", null, 0, -1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_SourceNetworks(), this.getNetworkType(), this.getNetworkType_UploadLink(),
				"sourceNetworks", null, 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1,
				NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkClassExpressionEClass, NetworkClassExpression.class, "NetworkClassExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkClassExpression_Value(), this.getNetworkClass(), "value", null, 0, 1,
				NetworkClassExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetwork_Fogsystem(), this.getFogSystem(), this.getFogSystem_Networks(), "fogsystem", null, 0,
				1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_DownloadLinks(), this.getNetworkLink(), this.getNetworkLink_TargetNetwork(),
				"downloadLinks", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_IsInstanceOf(), this.getNetworkType(), null, "isInstanceOf", null, 0, 1,
				Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Uploadlinks(), this.getNetworkLink(), this.getNetworkLink_SourceNetworks(),
				"uploadlinks", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLinkEClass, NetworkLink.class, "NetworkLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkLink_TargetNetwork(), this.getNetwork(), this.getNetwork_DownloadLinks(),
				"targetNetwork", null, 0, 1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLink_SourceNode(), this.getNode(), this.getNode_UploadLink(), "sourceNode", null, 0, 1,
				NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLink_TargetNode(), this.getNode(), this.getNode_DownloadLink(), "targetNode", null, 0,
				1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLink_IsInstanceOf(), this.getNetworkLinkType(), this.getNetworkLinkType_Instances(),
				"isInstanceOf", null, 0, 1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLink_SourceIpAddress(), ecorePackage.getEString(), "sourceIpAddress", null, 0, 1,
				NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLink_TargetIpAddress(), ecorePackage.getEString(), "targetIpAddress", null, 0, 1,
				NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLink_Bitrate(), ecorePackage.getEInt(), "bitrate", null, 0, 1, NetworkLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLink_SourceNetworks(), this.getNetwork(), this.getNetwork_Uploadlinks(),
				"sourceNetworks", null, 0, -1, NetworkLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_FogSystem(), this.getFogSystem(), this.getFogSystem_Applications(), "fogSystem",
				null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ServiceTypes(), this.getServiceType(), this.getServiceType_Application(),
				"serviceTypes", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Services(), this.getService(), this.getService_Application(), "services", null, 0,
				-1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Connectortypes(), this.getConnectorType(), this.getConnectorType_Application(),
				"connectortypes", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Connectors(), this.getConnector(), this.getConnector_Application(), "connectors",
				null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceType_Application(), this.getApplication(), this.getApplication_ServiceTypes(),
				"application", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_HostedOn(), this.getVirtualNodeSpecification(),
				this.getVirtualNodeSpecification_Hosts(), "hostedOn", null, 0, -1, ServiceType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getServiceType_ImplementedBy(), this.getSoftwarePackage(), null, "implementedBy", null, 0, -1,
				ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_Instances(), this.getService(), this.getService_InstanceOf(), "instances", null,
				0, -1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1,
				ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_NetworkPorts(), this.getNetworkPort(), null, "networkPorts", null, 0, -1,
				ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_IncomingDataflows(), this.getConnectorType(),
				this.getConnectorType_TargetServices(), "incomingDataflows", null, 0, -1, ServiceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_OutcomingDataflows(), this.getConnectorType(),
				this.getConnectorType_SourceServices(), "outcomingDataflows", null, 0, -1, ServiceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwarePackageEClass, SoftwarePackage.class, "SoftwarePackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwarePackage_InstallStartScript(), ecorePackage.getEString(), "installStartScript", null,
				0, 1, SoftwarePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwarePackage_Constraints(), this.getConstraint(), this.getConstraint_ConstrainedPackage(),
				"constraints", null, 0, -1, SoftwarePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkPortEClass, NetworkPort.class, "NetworkPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkPort_Protocol(), this.getTransportProtocol(), "protocol", null, 0, 1,
				NetworkPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkPort_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 0, 1, NetworkPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkPort_PortName(), ecorePackage.getEString(), "portName", null, 0, 1, NetworkPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkPort_HostPort(), ecorePackage.getEInt(), "hostPort", null, 0, 1, NetworkPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fogAreaEClass, FogArea.class, "FogArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFogArea_Fogsystem(), this.getFogSystem(), null, "fogsystem", null, 1, 1, FogArea.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFogArea_Nodes(), this.getNode(), null, "nodes", null, 0, -1, FogArea.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_InstanceOf(), this.getServiceType(), this.getServiceType_Instances(), "instanceOf",
				null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_HostingNode(), this.getNode(), this.getNode_HostedServices(), "hostingNode", null, 0,
				1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Networkports(), this.getNetworkPort(), null, "networkports", null, 0, -1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Application(), this.getApplication(), this.getApplication_Services(), "application",
				null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IncomingDataflows(), this.getConnector(), this.getConnector_TargetServices(),
				"incomingDataflows", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_OutcomingDataflows(), this.getConnector(), this.getConnector_SourceServices(),
				"outcomingDataflows", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityExpressionEClass, MultiplicityExpression.class, "MultiplicityExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityExpression_MultiplicityOperator(), this.getMultiplicityOperator(),
				"multiplicityOperator", null, 0, 1, MultiplicityExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_TargetServices(), this.getService(), this.getService_IncomingDataflows(),
				"targetServices", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_SourceServices(), this.getService(), this.getService_OutcomingDataflows(),
				"sourceServices", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_InstanceOf(), this.getConnectorType(), this.getConnectorType_Instances(),
				"instanceOf", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Application(), this.getApplication(), this.getApplication_Connectors(),
				"application", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorType_TargetServices(), this.getServiceType(),
				this.getServiceType_IncomingDataflows(), "targetServices", null, 0, -1, ConnectorType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_SourceServices(), this.getServiceType(),
				this.getServiceType_OutcomingDataflows(), "sourceServices", null, 0, -1, ConnectorType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_Application(), this.getApplication(), this.getApplication_Connectortypes(),
				"application", null, 0, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_Instances(), this.getConnector(), this.getConnector_InstanceOf(), "instances",
				null, 0, -1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1,
				ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeType_Unitofmeasurment(), this.getUnitOfMeasurment(), null, "unitofmeasurment", null,
				0, -1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1,
				AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Instances(), this.getAttribute(), null, "instances", null, 0, -1,
				AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Fogsystem(), this.getFogSystem(), this.getFogSystem_Attributetypes(),
				"fogsystem", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Resources(), this.getResourceType(), "resources", "VirtualNode", 0, -1,
				AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1,
				AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(unitOfMeasurmentEClass, UnitOfMeasurment.class, "UnitOfMeasurment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitOfMeasurment_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				UnitOfMeasurment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitOfMeasurment_ConversionToMainUnit(), ecorePackage.getEString(), "conversionToMainUnit",
				null, 0, 1, UnitOfMeasurment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitOfMeasurment_Fogsystem(), this.getFogSystem(), this.getFogSystem_Unitsofmeasurment(),
				"fogsystem", null, 0, 1, UnitOfMeasurment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Unitofmeasurment(), this.getUnitOfMeasurment(), null, "unitofmeasurment", null, 0,
				1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_InstanceOf(), this.getAttributeType(), null, "instanceOf", null, 0, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Fogresource(), this.getFogResource(), this.getFogResource_Attributes(),
				"fogresource", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparaisonOperatorEEnum, ComparaisonOperator.class, "ComparaisonOperator");
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.EQUAL);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.LESSER_OR_EQUAL);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.GREATER);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.LESSER);

		initEEnum(cpuArchitectureEEnum, CPUArchitecture.class, "CPUArchitecture");
		addEEnumLiteral(cpuArchitectureEEnum, CPUArchitecture.INTEL);
		addEEnumLiteral(cpuArchitectureEEnum, CPUArchitecture.ARM);

		initEEnum(operatingSystemEEnum, OperatingSystem.class, "OperatingSystem");
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.LINUX);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.MAC_OS);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.WINDOWS);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.ANDROID);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.IOS);

		initEEnum(healthStatusEEnum, HealthStatus.class, "HealthStatus");
		addEEnumLiteral(healthStatusEEnum, HealthStatus.UP);
		addEEnumLiteral(healthStatusEEnum, HealthStatus.DOWN);

		initEEnum(networkClassEEnum, NetworkClass.class, "NetworkClass");
		addEEnumLiteral(networkClassEEnum, NetworkClass.ETHERNET);
		addEEnumLiteral(networkClassEEnum, NetworkClass.WIFI);
		addEEnumLiteral(networkClassEEnum, NetworkClass.BLUETOOTH);

		initEEnum(transportProtocolEEnum, TransportProtocol.class, "TransportProtocol");
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.TCP);
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.UDP);

		initEEnum(multiplicityOperatorEEnum, MultiplicityOperator.class, "MultiplicityOperator");
		addEEnumLiteral(multiplicityOperatorEEnum, MultiplicityOperator.ALL_OF);
		addEEnumLiteral(multiplicityOperatorEEnum, MultiplicityOperator.ANY_OF);
		addEEnumLiteral(multiplicityOperatorEEnum, MultiplicityOperator.EXCLUSIVELY_ONE_OF);

		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.VIRTUAL_NODE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PHYSICAL_NODE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NETWORK_LINK);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NETWORK);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SERVICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.APPLICATION);

		// Create resource
		createResource(eNS_URI);
	}

} //FogAdlModelPackageImpl
