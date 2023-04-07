/**
 */
package fr.imta.semafor.fogAdlModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelFactory
 * @model kind="package"
 * @generated
 */
public interface FogAdlModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fogAdlModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fogAdlModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fogAdlModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FogAdlModelPackage eINSTANCE = fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.FogResourceImpl <em>Fog Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.FogResourceImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getFogResource()
	 * @generated
	 */
	int FOG_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_RESOURCE__TAGS = 0;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_RESOURCE__IMPORTED_NAMESPACE1 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_RESOURCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_RESOURCE__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Fog Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fog Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__FOGSYSTEM = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__INSTANCES = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__DOWNLOAD_LINK = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__UPLOAD_LINK = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hosted Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__HOSTED_NODE = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.PhysicalNodeSpecificationImpl <em>Physical Node Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.PhysicalNodeSpecificationImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getPhysicalNodeSpecification()
	 * @generated
	 */
	int PHYSICAL_NODE_SPECIFICATION = 5;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl <em>Fog System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.FogSystemImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getFogSystem()
	 * @generated
	 */
	int FOG_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Physicalnodespecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__PHYSICALNODESPECIFICATION = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networktypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__NETWORKTYPES = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__NETWORKS = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__APPLICATIONS = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fogareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__FOGAREAS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attributetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__ATTRIBUTETYPES = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unitsofmeasurment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM__UNITSOFMEASURMENT = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fog System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Fog System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SYSTEM_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.TagImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ConstraintImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Constrained Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINED_PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__TAGS = NODE_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__IMPORTED_NAMESPACE1 = NODE_TYPE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__NAME = NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__ATTRIBUTES = NODE_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__FOGSYSTEM = NODE_TYPE__FOGSYSTEM;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__CONSTRAINTS = NODE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__INSTANCES = NODE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__DOWNLOAD_LINK = NODE_TYPE__DOWNLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__UPLOAD_LINK = NODE_TYPE__UPLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Hosted Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION__HOSTED_NODE = NODE_TYPE__HOSTED_NODE;

	/**
	 * The number of structural features of the '<em>Physical Node Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Node Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_SPECIFICATION_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl <em>Virtual Node Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getVirtualNodeSpecification()
	 * @generated
	 */
	int VIRTUAL_NODE_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__TAGS = NODE_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__IMPORTED_NAMESPACE1 = NODE_TYPE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__NAME = NODE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__ATTRIBUTES = NODE_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__FOGSYSTEM = NODE_TYPE__FOGSYSTEM;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__CONSTRAINTS = NODE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__INSTANCES = NODE_TYPE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__DOWNLOAD_LINK = NODE_TYPE__DOWNLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__UPLOAD_LINK = NODE_TYPE__UPLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Hosted Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__HOSTED_NODE = NODE_TYPE__HOSTED_NODE;

	/**
	 * The feature id for the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__REPLICAS = NODE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__HOSTS = NODE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hosting Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE = NODE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Virtual Node Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Virtual Node Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_SPECIFICATION_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ExpressionImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.IntegerValueExpressionImpl <em>Integer Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.IntegerValueExpressionImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getIntegerValueExpression()
	 * @generated
	 */
	int INTEGER_VALUE_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.AttributeExpressionImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getAttributeExpression()
	 * @generated
	 */
	int ATTRIBUTE_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__ATTRIBUTE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__ATTRIBUTE_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.CustomExpressionImpl <em>Custom Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.CustomExpressionImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getCustomExpression()
	 * @generated
	 */
	int CUSTOM_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NodeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 11;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_INSTANCE_OF = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CPU_ARCHITECTURE = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OPERATING_SYSTEM = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Runtimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RUNTIMES = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Health Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HEALTH_STATUS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hosted Virtual Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HOSTED_VIRTUAL_NODES = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CPU Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CPU_CORES = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MEMORY = FOG_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disk Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DISK_STORAGE = FOG_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reference To Virtual Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE = FOG_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UPLOAD_LINK = FOG_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOWNLOAD_LINK = FOG_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Hosted Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HOSTED_SERVICES = FOG_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeImpl <em>Virtual Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.VirtualNodeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getVirtualNode()
	 * @generated
	 */
	int VIRTUAL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__TAGS = NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__IMPORTED_NAMESPACE1 = NODE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__ATTRIBUTES = NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__IS_INSTANCE_OF = NODE__IS_INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Cpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__CPU_ARCHITECTURE = NODE__CPU_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__OPERATING_SYSTEM = NODE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Runtimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__RUNTIMES = NODE__RUNTIMES;

	/**
	 * The feature id for the '<em><b>Health Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__HEALTH_STATUS = NODE__HEALTH_STATUS;

	/**
	 * The feature id for the '<em><b>Hosted Virtual Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__HOSTED_VIRTUAL_NODES = NODE__HOSTED_VIRTUAL_NODES;

	/**
	 * The feature id for the '<em><b>CPU Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__CPU_CORES = NODE__CPU_CORES;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Disk Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__DISK_STORAGE = NODE__DISK_STORAGE;

	/**
	 * The feature id for the '<em><b>Reference To Virtual Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE = NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__UPLOAD_LINK = NODE__UPLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__DOWNLOAD_LINK = NODE__DOWNLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Hosted Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__HOSTED_SERVICES = NODE__HOSTED_SERVICES;

	/**
	 * The feature id for the '<em><b>Hosting Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE__HOSTING_NODE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.PhysicalNodeImpl <em>Physical Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.PhysicalNodeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getPhysicalNode()
	 * @generated
	 */
	int PHYSICAL_NODE = 13;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__TAGS = NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__IMPORTED_NAMESPACE1 = NODE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__ATTRIBUTES = NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__IS_INSTANCE_OF = NODE__IS_INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Cpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CPU_ARCHITECTURE = NODE__CPU_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__OPERATING_SYSTEM = NODE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Runtimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__RUNTIMES = NODE__RUNTIMES;

	/**
	 * The feature id for the '<em><b>Health Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__HEALTH_STATUS = NODE__HEALTH_STATUS;

	/**
	 * The feature id for the '<em><b>Hosted Virtual Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__HOSTED_VIRTUAL_NODES = NODE__HOSTED_VIRTUAL_NODES;

	/**
	 * The feature id for the '<em><b>CPU Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__CPU_CORES = NODE__CPU_CORES;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Disk Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__DISK_STORAGE = NODE__DISK_STORAGE;

	/**
	 * The feature id for the '<em><b>Reference To Virtual Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE = NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__UPLOAD_LINK = NODE__UPLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Download Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__DOWNLOAD_LINK = NODE__DOWNLOAD_LINK;

	/**
	 * The feature id for the '<em><b>Hosted Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__HOSTED_SERVICES = NODE__HOSTED_SERVICES;

	/**
	 * The feature id for the '<em><b>Fogarea</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE__FOGAREA = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__FOGSYSTEM = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Downloadlinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__DOWNLOADLINKS = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__INSTANCES = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upload Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__UPLOAD_LINK = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl <em>Network Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkLinkType()
	 * @generated
	 */
	int NETWORK_LINK_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Target Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TARGET_NETWORK = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__SOURCE_NODE = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TARGET_NODE = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__INSTANCES = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Networks</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__SOURCE_NETWORKS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Network Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Network Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkClassExpressionImpl <em>Network Class Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NetworkClassExpressionImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkClassExpression()
	 * @generated
	 */
	int NETWORK_CLASS_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CLASS_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Class Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CLASS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network Class Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CLASS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NetworkImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 17;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__FOGSYSTEM = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Download Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DOWNLOAD_LINKS = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IS_INSTANCE_OF = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uploadlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__UPLOADLINKS = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl <em>Network Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkLink()
	 * @generated
	 */
	int NETWORK_LINK = 18;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Target Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TARGET_NETWORK = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__SOURCE_NODE = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TARGET_NODE = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__IS_INSTANCE_OF = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__SOURCE_IP_ADDRESS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TARGET_IP_ADDRESS = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bitrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__BITRATE = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__SOURCE_NETWORKS = FOG_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Network Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Network Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ApplicationImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 19;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fog System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__FOG_SYSTEM = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SERVICE_TYPES = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SERVICES = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connectortypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONNECTORTYPES = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONNECTORS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__APPLICATION = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hosted On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__HOSTED_ON = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__IMPLEMENTED_BY = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__INSTANCES = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Network Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NETWORK_PORTS = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Incoming Dataflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__INCOMING_DATAFLOWS = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Outcoming Dataflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__OUTCOMING_DATAFLOWS = FOG_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.SoftwarePackageImpl <em>Software Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.SoftwarePackageImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getSoftwarePackage()
	 * @generated
	 */
	int SOFTWARE_PACKAGE = 21;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Install Start Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE__INSTALL_START_SCRIPT = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Software Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PACKAGE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl <em>Network Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkPort()
	 * @generated
	 */
	int NETWORK_PORT = 22;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PORT__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PORT__PORT_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PORT__PORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PORT__HOST_PORT = 3;

	/**
	 * The number of structural features of the '<em>Network Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.FogAreaImpl <em>Fog Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAreaImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getFogArea()
	 * @generated
	 */
	int FOG_AREA = 23;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA__FOGSYSTEM = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA__NODES = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fog Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fog Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_AREA_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ServiceImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INSTANCE_OF = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hosting Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HOSTING_NODE = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Networkports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NETWORKPORTS = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__APPLICATION = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Dataflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INCOMING_DATAFLOWS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outcoming Dataflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTCOMING_DATAFLOWS = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.MultiplicityExpressionImpl <em>Multiplicity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.MultiplicityExpressionImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getMultiplicityExpression()
	 * @generated
	 */
	int MULTIPLICITY_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Multiplicity Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ConnectorImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 26;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Target Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_SERVICES = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_SERVICES = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INSTANCE_OF = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__APPLICATION = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Target Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__TARGET_SERVICES = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__SOURCE_SERVICES = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__APPLICATION = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__INSTANCES = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CONSTRAINTS = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__TAGS = FOG_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Imported Namespace1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__IMPORTED_NAMESPACE1 = FOG_RESOURCE__IMPORTED_NAMESPACE1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NAME = FOG_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__ATTRIBUTES = FOG_RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Unitofmeasurment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__UNITOFMEASURMENT = FOG_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__VALUE_TYPE = FOG_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__INSTANCES = FOG_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__FOGSYSTEM = FOG_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__RESOURCES = FOG_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__DEFAULT_VALUE = FOG_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = FOG_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = FOG_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl <em>Unit Of Measurment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getUnitOfMeasurment()
	 * @generated
	 */
	int UNIT_OF_MEASURMENT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conversion To Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Fogsystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURMENT__FOGSYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Unit Of Measurment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Of Measurment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.impl.AttributeImpl
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unitofmeasurment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNITOFMEASURMENT = 1;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INSTANCE_OF = 2;

	/**
	 * The feature id for the '<em><b>Fogresource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FOGRESOURCE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.ComparaisonOperator <em>Comparaison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.ComparaisonOperator
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getComparaisonOperator()
	 * @generated
	 */
	int COMPARAISON_OPERATOR = 31;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.CPUArchitecture <em>CPU Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.CPUArchitecture
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getCPUArchitecture()
	 * @generated
	 */
	int CPU_ARCHITECTURE = 32;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.OperatingSystem <em>Operating System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.OperatingSystem
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 33;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.HealthStatus <em>Health Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.HealthStatus
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getHealthStatus()
	 * @generated
	 */
	int HEALTH_STATUS = 34;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.NetworkClass <em>Network Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.NetworkClass
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkClass()
	 * @generated
	 */
	int NETWORK_CLASS = 35;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.TransportProtocol <em>Transport Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.TransportProtocol
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getTransportProtocol()
	 * @generated
	 */
	int TRANSPORT_PROTOCOL = 36;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.MultiplicityOperator <em>Multiplicity Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityOperator
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getMultiplicityOperator()
	 * @generated
	 */
	int MULTIPLICITY_OPERATOR = 37;

	/**
	 * The meta object id for the '{@link fr.imta.semafor.fogAdlModel.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.imta.semafor.fogAdlModel.ResourceType
	 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 38;

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.FogResource <em>Fog Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Resource</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogResource
	 * @generated
	 */
	EClass getFogResource();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogResource#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogResource#getTags()
	 * @see #getFogResource()
	 * @generated
	 */
	EReference getFogResource_Tags();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.FogResource#getImportedNamespace1 <em>Imported Namespace1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace1</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogResource#getImportedNamespace1()
	 * @see #getFogResource()
	 * @generated
	 */
	EAttribute getFogResource_ImportedNamespace1();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.FogResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogResource#getName()
	 * @see #getFogResource()
	 * @generated
	 */
	EAttribute getFogResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogResource#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogResource#getAttributes()
	 * @see #getFogResource()
	 * @generated
	 */
	EReference getFogResource_Attributes();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NodeType#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fogsystem</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getFogsystem()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Fogsystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NodeType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getConstraints()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.NodeType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getInstances()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NodeType#getDownloadLink <em>Download Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Download Link</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getDownloadLink()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_DownloadLink();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NodeType#getUploadLink <em>Upload Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upload Link</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getUploadLink()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_UploadLink();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NodeType#getHostedNode <em>Hosted Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosted Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NodeType#getHostedNode()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_HostedNode();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.PhysicalNodeSpecification <em>Physical Node Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Node Specification</em>'.
	 * @see fr.imta.semafor.fogAdlModel.PhysicalNodeSpecification
	 * @generated
	 */
	EClass getPhysicalNodeSpecification();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification <em>Virtual Node Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node Specification</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification
	 * @generated
	 */
	EClass getVirtualNodeSpecification();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageName <em>Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Name</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageName()
	 * @see #getVirtualNodeSpecification()
	 * @generated
	 */
	EAttribute getVirtualNodeSpecification_ImageName();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageRegistry <em>Image Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Registry</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getImageRegistry()
	 * @see #getVirtualNodeSpecification()
	 * @generated
	 */
	EAttribute getVirtualNodeSpecification_ImageRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replicas</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getReplicas()
	 * @see #getVirtualNodeSpecification()
	 * @generated
	 */
	EReference getVirtualNodeSpecification_Replicas();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hosts</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHosts()
	 * @see #getVirtualNodeSpecification()
	 * @generated
	 */
	EReference getVirtualNodeSpecification_Hosts();

	/**
	 * Returns the meta object for the containment reference '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHostingNode <em>Hosting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hosting Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification#getHostingNode()
	 * @see #getVirtualNodeSpecification()
	 * @generated
	 */
	EReference getVirtualNodeSpecification_HostingNode();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.IntegerValueExpression <em>Integer Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.IntegerValueExpression
	 * @generated
	 */
	EClass getIntegerValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.IntegerValueExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.imta.semafor.fogAdlModel.IntegerValueExpression#getValue()
	 * @see #getIntegerValueExpression()
	 * @generated
	 */
	EAttribute getIntegerValueExpression_Value();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.AttributeExpression <em>Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeExpression
	 * @generated
	 */
	EClass getAttributeExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.AttributeExpression#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeExpression#getAttribute()
	 * @see #getAttributeExpression()
	 * @generated
	 */
	EReference getAttributeExpression_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.AttributeExpression#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeExpression#getAttributeName()
	 * @see #getAttributeExpression()
	 * @generated
	 */
	EAttribute getAttributeExpression_AttributeName();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.CustomExpression <em>Custom Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.CustomExpression
	 * @generated
	 */
	EClass getCustomExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.CustomExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.CustomExpression#getExpression()
	 * @see #getCustomExpression()
	 * @generated
	 */
	EAttribute getCustomExpression_Expression();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Node#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getIsInstanceOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IsInstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getCpuArchitecture <em>Cpu Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Architecture</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getCpuArchitecture()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_CpuArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getOperatingSystem()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_OperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getRuntimes <em>Runtimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtimes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getRuntimes()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Runtimes();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getHealthStatus <em>Health Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Status</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getHealthStatus()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_HealthStatus();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Node#getHostedVirtualNodes <em>Hosted Virtual Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hosted Virtual Nodes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getHostedVirtualNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HostedVirtualNodes();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getCPUCores <em>CPU Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU Cores</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getCPUCores()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_CPUCores();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getMemory()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Memory();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getDiskStorage <em>Disk Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Storage</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getDiskStorage()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_DiskStorage();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Node#getReferenceToVirtualNodeType <em>Reference To Virtual Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference To Virtual Node Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getReferenceToVirtualNodeType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ReferenceToVirtualNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Node#getUploadLink <em>Upload Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upload Link</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getUploadLink()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_UploadLink();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Node#getDownloadLink <em>Download Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Download Link</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getDownloadLink()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_DownloadLink();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Node#getHostedServices <em>Hosted Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hosted Services</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Node#getHostedServices()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HostedServices();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.VirtualNode <em>Virtual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNode
	 * @generated
	 */
	EClass getVirtualNode();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.VirtualNode#getHostingNode <em>Hosting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hosting Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNode#getHostingNode()
	 * @see #getVirtualNode()
	 * @generated
	 */
	EReference getVirtualNode_HostingNode();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.PhysicalNode <em>Physical Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.PhysicalNode
	 * @generated
	 */
	EClass getPhysicalNode();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.PhysicalNode#getFogarea <em>Fogarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fogarea</em>'.
	 * @see fr.imta.semafor.fogAdlModel.PhysicalNode#getFogarea()
	 * @see #getPhysicalNode()
	 * @generated
	 */
	EReference getPhysicalNode_Fogarea();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkType#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fogsystem</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getFogsystem()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Fogsystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NetworkType#getDownloadlinks <em>Downloadlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Downloadlinks</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getDownloadlinks()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Downloadlinks();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.NetworkType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getInstances()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NetworkType#getUploadLink <em>Upload Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upload Link</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getUploadLink()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_UploadLink();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NetworkType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType#getConstraints()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Constraints();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType <em>Network Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType
	 * @generated
	 */
	EClass getNetworkLinkType();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNetwork <em>Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target Network</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNetwork()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_TargetNetwork();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNode()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_SourceNode();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getTargetNode()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_TargetNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getInstances()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_Instances();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNetworks <em>Source Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Networks</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getSourceNetworks()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_SourceNetworks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType#getConstraints()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_Constraints();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.NetworkClassExpression <em>Network Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Class Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkClassExpression
	 * @generated
	 */
	EClass getNetworkClassExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkClassExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkClassExpression#getValue()
	 * @see #getNetworkClassExpression()
	 * @generated
	 */
	EAttribute getNetworkClassExpression_Value();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.Network#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fogsystem</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Network#getFogsystem()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Fogsystem();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Network#getDownloadLinks <em>Download Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Download Links</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Network#getDownloadLinks()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_DownloadLinks();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Network#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Network#getIsInstanceOf()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_IsInstanceOf();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Network#getUploadlinks <em>Uploadlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uploadlinks</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Network#getUploadlinks()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Uploadlinks();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.NetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink
	 * @generated
	 */
	EClass getNetworkLink();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNetwork <em>Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Network</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNetwork()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EReference getNetworkLink_TargetNetwork();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNode()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EReference getNetworkLink_SourceNode();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getTargetNode()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EReference getNetworkLink_TargetNode();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getIsInstanceOf()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EReference getNetworkLink_IsInstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceIpAddress <em>Source Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ip Address</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getSourceIpAddress()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EAttribute getNetworkLink_SourceIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getTargetIpAddress <em>Target Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ip Address</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getTargetIpAddress()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EAttribute getNetworkLink_TargetIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getBitrate <em>Bitrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bitrate</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getBitrate()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EAttribute getNetworkLink_Bitrate();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNetworks <em>Source Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Networks</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink#getSourceNetworks()
	 * @see #getNetworkLink()
	 * @generated
	 */
	EReference getNetworkLink_SourceNetworks();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Application#getFogSystem <em>Fog System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fog System</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application#getFogSystem()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_FogSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Application#getServiceTypes <em>Service Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Types</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application#getServiceTypes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ServiceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Application#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application#getServices()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Application#getConnectortypes <em>Connectortypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectortypes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application#getConnectortypes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Connectortypes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Application#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application#getConnectors()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Application#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Application#getConstraints()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Constraints();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.ServiceType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getApplication()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_Application();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getHostedOn <em>Hosted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hosted On</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getHostedOn()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_HostedOn();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented By</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getImplementedBy()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_ImplementedBy();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getInstances()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getConstraints()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getNetworkPorts <em>Network Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Ports</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getNetworkPorts()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_NetworkPorts();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getIncomingDataflows <em>Incoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Dataflows</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getIncomingDataflows()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_IncomingDataflows();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ServiceType#getOutcomingDataflows <em>Outcoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcoming Dataflows</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType#getOutcomingDataflows()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_OutcomingDataflows();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.SoftwarePackage <em>Software Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Package</em>'.
	 * @see fr.imta.semafor.fogAdlModel.SoftwarePackage
	 * @generated
	 */
	EClass getSoftwarePackage();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.SoftwarePackage#getInstallStartScript <em>Install Start Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Start Script</em>'.
	 * @see fr.imta.semafor.fogAdlModel.SoftwarePackage#getInstallStartScript()
	 * @see #getSoftwarePackage()
	 * @generated
	 */
	EAttribute getSoftwarePackage_InstallStartScript();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.SoftwarePackage#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.SoftwarePackage#getConstraints()
	 * @see #getSoftwarePackage()
	 * @generated
	 */
	EReference getSoftwarePackage_Constraints();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.NetworkPort <em>Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Port</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkPort
	 * @generated
	 */
	EClass getNetworkPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkPort#getProtocol()
	 * @see #getNetworkPort()
	 * @generated
	 */
	EAttribute getNetworkPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkPort#getPortNumber()
	 * @see #getNetworkPort()
	 * @generated
	 */
	EAttribute getNetworkPort_PortNumber();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkPort#getPortName()
	 * @see #getNetworkPort()
	 * @generated
	 */
	EAttribute getNetworkPort_PortName();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.NetworkPort#getHostPort <em>Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Port</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkPort#getHostPort()
	 * @see #getNetworkPort()
	 * @generated
	 */
	EAttribute getNetworkPort_HostPort();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.FogArea <em>Fog Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Area</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogArea
	 * @generated
	 */
	EClass getFogArea();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.FogArea#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fogsystem</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogArea#getFogsystem()
	 * @see #getFogArea()
	 * @generated
	 */
	EReference getFogArea_Fogsystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogArea#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogArea#getNodes()
	 * @see #getFogArea()
	 * @generated
	 */
	EReference getFogArea_Nodes();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Service#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service#getInstanceOf()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_InstanceOf();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Service#getHostingNode <em>Hosting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hosting Node</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service#getHostingNode()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_HostingNode();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Service#getNetworkports <em>Networkports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networkports</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service#getNetworkports()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Networkports();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.Service#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service#getApplication()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Application();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Service#getIncomingDataflows <em>Incoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Dataflows</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service#getIncomingDataflows()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IncomingDataflows();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Service#getOutcomingDataflows <em>Outcoming Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcoming Dataflows</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Service#getOutcomingDataflows()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_OutcomingDataflows();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.MultiplicityExpression <em>Multiplicity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityExpression
	 * @generated
	 */
	EClass getMultiplicityExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.MultiplicityExpression#getMultiplicityOperator <em>Multiplicity Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Operator</em>'.
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityExpression#getMultiplicityOperator()
	 * @see #getMultiplicityExpression()
	 * @generated
	 */
	EAttribute getMultiplicityExpression_MultiplicityOperator();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Connector#getTargetServices <em>Target Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Services</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Connector#getTargetServices()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TargetServices();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.Connector#getSourceServices <em>Source Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Services</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Connector#getSourceServices()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourceServices();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Connector#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Connector#getInstanceOf()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_InstanceOf();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.Connector#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Connector#getApplication()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Application();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getTargetServices <em>Target Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Services</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getTargetServices()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_TargetServices();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getSourceServices <em>Source Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Services</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getSourceServices()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_SourceServices();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getApplication()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Application();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getInstances()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.ConnectorType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType#getConstraints()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Constraints();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.AttributeType#getUnitofmeasurment <em>Unitofmeasurment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unitofmeasurment</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getUnitofmeasurment()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_Unitofmeasurment();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.AttributeType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getValueType()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_ValueType();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.AttributeType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getInstances()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_Instances();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.AttributeType#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fogsystem</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getFogsystem()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_Fogsystem();

	/**
	 * Returns the meta object for the attribute list '{@link fr.imta.semafor.fogAdlModel.AttributeType#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resources</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getResources()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Resources();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.AttributeType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType#getDefaultValue()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_DefaultValue();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment <em>Unit Of Measurment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Measurment</em>'.
	 * @see fr.imta.semafor.fogAdlModel.UnitOfMeasurment
	 * @generated
	 */
	EClass getUnitOfMeasurment();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getName()
	 * @see #getUnitOfMeasurment()
	 * @generated
	 */
	EAttribute getUnitOfMeasurment_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getConversionToMainUnit <em>Conversion To Main Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion To Main Unit</em>'.
	 * @see fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getConversionToMainUnit()
	 * @see #getUnitOfMeasurment()
	 * @generated
	 */
	EAttribute getUnitOfMeasurment_ConversionToMainUnit();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getFogsystem <em>Fogsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fogsystem</em>'.
	 * @see fr.imta.semafor.fogAdlModel.UnitOfMeasurment#getFogsystem()
	 * @see #getUnitOfMeasurment()
	 * @generated
	 */
	EReference getUnitOfMeasurment_Fogsystem();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Attribute#getUnitofmeasurment <em>Unitofmeasurment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unitofmeasurment</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Attribute#getUnitofmeasurment()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Unitofmeasurment();

	/**
	 * Returns the meta object for the reference '{@link fr.imta.semafor.fogAdlModel.Attribute#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Attribute#getInstanceOf()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InstanceOf();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.Attribute#getFogresource <em>Fogresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fogresource</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Attribute#getFogresource()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Fogresource();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.ComparaisonOperator <em>Comparaison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparaison Operator</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ComparaisonOperator
	 * @generated
	 */
	EEnum getComparaisonOperator();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.CPUArchitecture <em>CPU Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CPU Architecture</em>'.
	 * @see fr.imta.semafor.fogAdlModel.CPUArchitecture
	 * @generated
	 */
	EEnum getCPUArchitecture();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating System</em>'.
	 * @see fr.imta.semafor.fogAdlModel.OperatingSystem
	 * @generated
	 */
	EEnum getOperatingSystem();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.HealthStatus <em>Health Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Health Status</em>'.
	 * @see fr.imta.semafor.fogAdlModel.HealthStatus
	 * @generated
	 */
	EEnum getHealthStatus();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.NetworkClass <em>Network Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Class</em>'.
	 * @see fr.imta.semafor.fogAdlModel.NetworkClass
	 * @generated
	 */
	EEnum getNetworkClass();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.TransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Protocol</em>'.
	 * @see fr.imta.semafor.fogAdlModel.TransportProtocol
	 * @generated
	 */
	EEnum getTransportProtocol();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.MultiplicityOperator <em>Multiplicity Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Operator</em>'.
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityOperator
	 * @generated
	 */
	EEnum getMultiplicityOperator();

	/**
	 * Returns the meta object for enum '{@link fr.imta.semafor.fogAdlModel.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see fr.imta.semafor.fogAdlModel.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.FogSystem <em>Fog System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog System</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem
	 * @generated
	 */
	EClass getFogSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getPhysicalnodespecification <em>Physicalnodespecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physicalnodespecification</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getPhysicalnodespecification()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Physicalnodespecification();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getNetworktypes <em>Networktypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networktypes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getNetworktypes()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Networktypes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getNetworks()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Networks();

	/**
	 * Returns the meta object for the reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getApplications()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getFogareas <em>Fogareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fogareas</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getFogareas()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Fogareas();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getAttributetypes <em>Attributetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributetypes</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getAttributetypes()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Attributetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.FogSystem#getUnitsofmeasurment <em>Unitsofmeasurment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unitsofmeasurment</em>'.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem#getUnitsofmeasurment()
	 * @see #getFogSystem()
	 * @generated
	 */
	EReference getFogSystem_Unitsofmeasurment();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Tag#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Tag#getKey()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Key();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for class '{@link fr.imta.semafor.fogAdlModel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.imta.semafor.fogAdlModel.Constraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Constraint#getOperator()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.imta.semafor.fogAdlModel.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Expression();

	/**
	 * Returns the meta object for the container reference '{@link fr.imta.semafor.fogAdlModel.Constraint#getConstrainedPackage <em>Constrained Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constrained Package</em>'.
	 * @see fr.imta.semafor.fogAdlModel.Constraint#getConstrainedPackage()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainedPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FogAdlModelFactory getFogAdlModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.FogResourceImpl <em>Fog Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.FogResourceImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getFogResource()
		 * @generated
		 */
		EClass FOG_RESOURCE = eINSTANCE.getFogResource();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_RESOURCE__TAGS = eINSTANCE.getFogResource_Tags();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOG_RESOURCE__IMPORTED_NAMESPACE1 = eINSTANCE.getFogResource_ImportedNamespace1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOG_RESOURCE__NAME = eINSTANCE.getFogResource_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_RESOURCE__ATTRIBUTES = eINSTANCE.getFogResource_Attributes();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NodeTypeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Fogsystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__FOGSYSTEM = eINSTANCE.getNodeType_Fogsystem();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__CONSTRAINTS = eINSTANCE.getNodeType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__INSTANCES = eINSTANCE.getNodeType_Instances();

		/**
		 * The meta object literal for the '<em><b>Download Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__DOWNLOAD_LINK = eINSTANCE.getNodeType_DownloadLink();

		/**
		 * The meta object literal for the '<em><b>Upload Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__UPLOAD_LINK = eINSTANCE.getNodeType_UploadLink();

		/**
		 * The meta object literal for the '<em><b>Hosted Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__HOSTED_NODE = eINSTANCE.getNodeType_HostedNode();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.PhysicalNodeSpecificationImpl <em>Physical Node Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.PhysicalNodeSpecificationImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getPhysicalNodeSpecification()
		 * @generated
		 */
		EClass PHYSICAL_NODE_SPECIFICATION = eINSTANCE.getPhysicalNodeSpecification();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl <em>Virtual Node Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.VirtualNodeSpecificationImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getVirtualNodeSpecification()
		 * @generated
		 */
		EClass VIRTUAL_NODE_SPECIFICATION = eINSTANCE.getVirtualNodeSpecification();

		/**
		 * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_NODE_SPECIFICATION__IMAGE_NAME = eINSTANCE.getVirtualNodeSpecification_ImageName();

		/**
		 * The meta object literal for the '<em><b>Image Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_NODE_SPECIFICATION__IMAGE_REGISTRY = eINSTANCE.getVirtualNodeSpecification_ImageRegistry();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_SPECIFICATION__REPLICAS = eINSTANCE.getVirtualNodeSpecification_Replicas();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_SPECIFICATION__HOSTS = eINSTANCE.getVirtualNodeSpecification_Hosts();

		/**
		 * The meta object literal for the '<em><b>Hosting Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_SPECIFICATION__HOSTING_NODE = eINSTANCE.getVirtualNodeSpecification_HostingNode();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ExpressionImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.IntegerValueExpressionImpl <em>Integer Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.IntegerValueExpressionImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getIntegerValueExpression()
		 * @generated
		 */
		EClass INTEGER_VALUE_EXPRESSION = eINSTANCE.getIntegerValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_EXPRESSION__VALUE = eINSTANCE.getIntegerValueExpression_Value();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.AttributeExpressionImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getAttributeExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_EXPRESSION = eINSTANCE.getAttributeExpression();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_EXPRESSION__ATTRIBUTE = eINSTANCE.getAttributeExpression_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_EXPRESSION__ATTRIBUTE_NAME = eINSTANCE.getAttributeExpression_AttributeName();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.CustomExpressionImpl <em>Custom Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.CustomExpressionImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getCustomExpression()
		 * @generated
		 */
		EClass CUSTOM_EXPRESSION = eINSTANCE.getCustomExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_EXPRESSION__EXPRESSION = eINSTANCE.getCustomExpression_Expression();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NodeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IS_INSTANCE_OF = eINSTANCE.getNode_IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Cpu Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CPU_ARCHITECTURE = eINSTANCE.getNode_CpuArchitecture();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__OPERATING_SYSTEM = eINSTANCE.getNode_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Runtimes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__RUNTIMES = eINSTANCE.getNode_Runtimes();

		/**
		 * The meta object literal for the '<em><b>Health Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HEALTH_STATUS = eINSTANCE.getNode_HealthStatus();

		/**
		 * The meta object literal for the '<em><b>Hosted Virtual Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HOSTED_VIRTUAL_NODES = eINSTANCE.getNode_HostedVirtualNodes();

		/**
		 * The meta object literal for the '<em><b>CPU Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CPU_CORES = eINSTANCE.getNode_CPUCores();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MEMORY = eINSTANCE.getNode_Memory();

		/**
		 * The meta object literal for the '<em><b>Disk Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DISK_STORAGE = eINSTANCE.getNode_DiskStorage();

		/**
		 * The meta object literal for the '<em><b>Reference To Virtual Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__REFERENCE_TO_VIRTUAL_NODE_TYPE = eINSTANCE.getNode_ReferenceToVirtualNodeType();

		/**
		 * The meta object literal for the '<em><b>Upload Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__UPLOAD_LINK = eINSTANCE.getNode_UploadLink();

		/**
		 * The meta object literal for the '<em><b>Download Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DOWNLOAD_LINK = eINSTANCE.getNode_DownloadLink();

		/**
		 * The meta object literal for the '<em><b>Hosted Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HOSTED_SERVICES = eINSTANCE.getNode_HostedServices();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.VirtualNodeImpl <em>Virtual Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.VirtualNodeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getVirtualNode()
		 * @generated
		 */
		EClass VIRTUAL_NODE = eINSTANCE.getVirtualNode();

		/**
		 * The meta object literal for the '<em><b>Hosting Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE__HOSTING_NODE = eINSTANCE.getVirtualNode_HostingNode();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.PhysicalNodeImpl <em>Physical Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.PhysicalNodeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getPhysicalNode()
		 * @generated
		 */
		EClass PHYSICAL_NODE = eINSTANCE.getPhysicalNode();

		/**
		 * The meta object literal for the '<em><b>Fogarea</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_NODE__FOGAREA = eINSTANCE.getPhysicalNode_Fogarea();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NetworkTypeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkType()
		 * @generated
		 */
		EClass NETWORK_TYPE = eINSTANCE.getNetworkType();

		/**
		 * The meta object literal for the '<em><b>Fogsystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__FOGSYSTEM = eINSTANCE.getNetworkType_Fogsystem();

		/**
		 * The meta object literal for the '<em><b>Downloadlinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__DOWNLOADLINKS = eINSTANCE.getNetworkType_Downloadlinks();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__INSTANCES = eINSTANCE.getNetworkType_Instances();

		/**
		 * The meta object literal for the '<em><b>Upload Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__UPLOAD_LINK = eINSTANCE.getNetworkType_UploadLink();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__CONSTRAINTS = eINSTANCE.getNetworkType_Constraints();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl <em>Network Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NetworkLinkTypeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkLinkType()
		 * @generated
		 */
		EClass NETWORK_LINK_TYPE = eINSTANCE.getNetworkLinkType();

		/**
		 * The meta object literal for the '<em><b>Target Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__TARGET_NETWORK = eINSTANCE.getNetworkLinkType_TargetNetwork();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__SOURCE_NODE = eINSTANCE.getNetworkLinkType_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__TARGET_NODE = eINSTANCE.getNetworkLinkType_TargetNode();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__INSTANCES = eINSTANCE.getNetworkLinkType_Instances();

		/**
		 * The meta object literal for the '<em><b>Source Networks</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__SOURCE_NETWORKS = eINSTANCE.getNetworkLinkType_SourceNetworks();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__CONSTRAINTS = eINSTANCE.getNetworkLinkType_Constraints();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkClassExpressionImpl <em>Network Class Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NetworkClassExpressionImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkClassExpression()
		 * @generated
		 */
		EClass NETWORK_CLASS_EXPRESSION = eINSTANCE.getNetworkClassExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CLASS_EXPRESSION__VALUE = eINSTANCE.getNetworkClassExpression_Value();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NetworkImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Fogsystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__FOGSYSTEM = eINSTANCE.getNetwork_Fogsystem();

		/**
		 * The meta object literal for the '<em><b>Download Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__DOWNLOAD_LINKS = eINSTANCE.getNetwork_DownloadLinks();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__IS_INSTANCE_OF = eINSTANCE.getNetwork_IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Uploadlinks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__UPLOADLINKS = eINSTANCE.getNetwork_Uploadlinks();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl <em>Network Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NetworkLinkImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkLink()
		 * @generated
		 */
		EClass NETWORK_LINK = eINSTANCE.getNetworkLink();

		/**
		 * The meta object literal for the '<em><b>Target Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK__TARGET_NETWORK = eINSTANCE.getNetworkLink_TargetNetwork();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK__SOURCE_NODE = eINSTANCE.getNetworkLink_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK__TARGET_NODE = eINSTANCE.getNetworkLink_TargetNode();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK__IS_INSTANCE_OF = eINSTANCE.getNetworkLink_IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Source Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK__SOURCE_IP_ADDRESS = eINSTANCE.getNetworkLink_SourceIpAddress();

		/**
		 * The meta object literal for the '<em><b>Target Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK__TARGET_IP_ADDRESS = eINSTANCE.getNetworkLink_TargetIpAddress();

		/**
		 * The meta object literal for the '<em><b>Bitrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK__BITRATE = eINSTANCE.getNetworkLink_Bitrate();

		/**
		 * The meta object literal for the '<em><b>Source Networks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK__SOURCE_NETWORKS = eINSTANCE.getNetworkLink_SourceNetworks();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ApplicationImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Fog System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__FOG_SYSTEM = eINSTANCE.getApplication_FogSystem();

		/**
		 * The meta object literal for the '<em><b>Service Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SERVICE_TYPES = eINSTANCE.getApplication_ServiceTypes();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SERVICES = eINSTANCE.getApplication_Services();

		/**
		 * The meta object literal for the '<em><b>Connectortypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONNECTORTYPES = eINSTANCE.getApplication_Connectortypes();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONNECTORS = eINSTANCE.getApplication_Connectors();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONSTRAINTS = eINSTANCE.getApplication_Constraints();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ServiceTypeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__APPLICATION = eINSTANCE.getServiceType_Application();

		/**
		 * The meta object literal for the '<em><b>Hosted On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__HOSTED_ON = eINSTANCE.getServiceType_HostedOn();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__IMPLEMENTED_BY = eINSTANCE.getServiceType_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__INSTANCES = eINSTANCE.getServiceType_Instances();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__CONSTRAINTS = eINSTANCE.getServiceType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Network Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__NETWORK_PORTS = eINSTANCE.getServiceType_NetworkPorts();

		/**
		 * The meta object literal for the '<em><b>Incoming Dataflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__INCOMING_DATAFLOWS = eINSTANCE.getServiceType_IncomingDataflows();

		/**
		 * The meta object literal for the '<em><b>Outcoming Dataflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__OUTCOMING_DATAFLOWS = eINSTANCE.getServiceType_OutcomingDataflows();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.SoftwarePackageImpl <em>Software Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.SoftwarePackageImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getSoftwarePackage()
		 * @generated
		 */
		EClass SOFTWARE_PACKAGE = eINSTANCE.getSoftwarePackage();

		/**
		 * The meta object literal for the '<em><b>Install Start Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_PACKAGE__INSTALL_START_SCRIPT = eINSTANCE.getSoftwarePackage_InstallStartScript();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PACKAGE__CONSTRAINTS = eINSTANCE.getSoftwarePackage_Constraints();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl <em>Network Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.NetworkPortImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkPort()
		 * @generated
		 */
		EClass NETWORK_PORT = eINSTANCE.getNetworkPort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_PORT__PROTOCOL = eINSTANCE.getNetworkPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_PORT__PORT_NUMBER = eINSTANCE.getNetworkPort_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_PORT__PORT_NAME = eINSTANCE.getNetworkPort_PortName();

		/**
		 * The meta object literal for the '<em><b>Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_PORT__HOST_PORT = eINSTANCE.getNetworkPort_HostPort();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.FogAreaImpl <em>Fog Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAreaImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getFogArea()
		 * @generated
		 */
		EClass FOG_AREA = eINSTANCE.getFogArea();

		/**
		 * The meta object literal for the '<em><b>Fogsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_AREA__FOGSYSTEM = eINSTANCE.getFogArea_Fogsystem();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_AREA__NODES = eINSTANCE.getFogArea_Nodes();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ServiceImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INSTANCE_OF = eINSTANCE.getService_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Hosting Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__HOSTING_NODE = eINSTANCE.getService_HostingNode();

		/**
		 * The meta object literal for the '<em><b>Networkports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__NETWORKPORTS = eINSTANCE.getService_Networkports();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__APPLICATION = eINSTANCE.getService_Application();

		/**
		 * The meta object literal for the '<em><b>Incoming Dataflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INCOMING_DATAFLOWS = eINSTANCE.getService_IncomingDataflows();

		/**
		 * The meta object literal for the '<em><b>Outcoming Dataflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OUTCOMING_DATAFLOWS = eINSTANCE.getService_OutcomingDataflows();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.MultiplicityExpressionImpl <em>Multiplicity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.MultiplicityExpressionImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getMultiplicityExpression()
		 * @generated
		 */
		EClass MULTIPLICITY_EXPRESSION = eINSTANCE.getMultiplicityExpression();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_EXPRESSION__MULTIPLICITY_OPERATOR = eINSTANCE
				.getMultiplicityExpression_MultiplicityOperator();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ConnectorImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Target Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET_SERVICES = eINSTANCE.getConnector_TargetServices();

		/**
		 * The meta object literal for the '<em><b>Source Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE_SERVICES = eINSTANCE.getConnector_SourceServices();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__INSTANCE_OF = eINSTANCE.getConnector_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__APPLICATION = eINSTANCE.getConnector_Application();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ConnectorTypeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getConnectorType()
		 * @generated
		 */
		EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '<em><b>Target Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__TARGET_SERVICES = eINSTANCE.getConnectorType_TargetServices();

		/**
		 * The meta object literal for the '<em><b>Source Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__SOURCE_SERVICES = eINSTANCE.getConnectorType_SourceServices();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__APPLICATION = eINSTANCE.getConnectorType_Application();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__INSTANCES = eINSTANCE.getConnectorType_Instances();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__CONSTRAINTS = eINSTANCE.getConnectorType_Constraints();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.AttributeTypeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Unitofmeasurment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__UNITOFMEASURMENT = eINSTANCE.getAttributeType_Unitofmeasurment();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__VALUE_TYPE = eINSTANCE.getAttributeType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__INSTANCES = eINSTANCE.getAttributeType_Instances();

		/**
		 * The meta object literal for the '<em><b>Fogsystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__FOGSYSTEM = eINSTANCE.getAttributeType_Fogsystem();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__RESOURCES = eINSTANCE.getAttributeType_Resources();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__DEFAULT_VALUE = eINSTANCE.getAttributeType_DefaultValue();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl <em>Unit Of Measurment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.UnitOfMeasurmentImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getUnitOfMeasurment()
		 * @generated
		 */
		EClass UNIT_OF_MEASURMENT = eINSTANCE.getUnitOfMeasurment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURMENT__NAME = eINSTANCE.getUnitOfMeasurment_Name();

		/**
		 * The meta object literal for the '<em><b>Conversion To Main Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURMENT__CONVERSION_TO_MAIN_UNIT = eINSTANCE.getUnitOfMeasurment_ConversionToMainUnit();

		/**
		 * The meta object literal for the '<em><b>Fogsystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_MEASURMENT__FOGSYSTEM = eINSTANCE.getUnitOfMeasurment_Fogsystem();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.AttributeImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Unitofmeasurment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__UNITOFMEASURMENT = eINSTANCE.getAttribute_Unitofmeasurment();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__INSTANCE_OF = eINSTANCE.getAttribute_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Fogresource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__FOGRESOURCE = eINSTANCE.getAttribute_Fogresource();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.ComparaisonOperator <em>Comparaison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.ComparaisonOperator
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getComparaisonOperator()
		 * @generated
		 */
		EEnum COMPARAISON_OPERATOR = eINSTANCE.getComparaisonOperator();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.CPUArchitecture <em>CPU Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.CPUArchitecture
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getCPUArchitecture()
		 * @generated
		 */
		EEnum CPU_ARCHITECTURE = eINSTANCE.getCPUArchitecture();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.OperatingSystem <em>Operating System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.OperatingSystem
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EEnum OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.HealthStatus <em>Health Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.HealthStatus
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getHealthStatus()
		 * @generated
		 */
		EEnum HEALTH_STATUS = eINSTANCE.getHealthStatus();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.NetworkClass <em>Network Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.NetworkClass
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getNetworkClass()
		 * @generated
		 */
		EEnum NETWORK_CLASS = eINSTANCE.getNetworkClass();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.TransportProtocol <em>Transport Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.TransportProtocol
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getTransportProtocol()
		 * @generated
		 */
		EEnum TRANSPORT_PROTOCOL = eINSTANCE.getTransportProtocol();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.MultiplicityOperator <em>Multiplicity Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.MultiplicityOperator
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getMultiplicityOperator()
		 * @generated
		 */
		EEnum MULTIPLICITY_OPERATOR = eINSTANCE.getMultiplicityOperator();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.ResourceType
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.FogSystemImpl <em>Fog System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.FogSystemImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getFogSystem()
		 * @generated
		 */
		EClass FOG_SYSTEM = eINSTANCE.getFogSystem();

		/**
		 * The meta object literal for the '<em><b>Physicalnodespecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__PHYSICALNODESPECIFICATION = eINSTANCE.getFogSystem_Physicalnodespecification();

		/**
		 * The meta object literal for the '<em><b>Networktypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__NETWORKTYPES = eINSTANCE.getFogSystem_Networktypes();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__NETWORKS = eINSTANCE.getFogSystem_Networks();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__APPLICATIONS = eINSTANCE.getFogSystem_Applications();

		/**
		 * The meta object literal for the '<em><b>Fogareas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__FOGAREAS = eINSTANCE.getFogSystem_Fogareas();

		/**
		 * The meta object literal for the '<em><b>Attributetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__ATTRIBUTETYPES = eINSTANCE.getFogSystem_Attributetypes();

		/**
		 * The meta object literal for the '<em><b>Unitsofmeasurment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SYSTEM__UNITSOFMEASURMENT = eINSTANCE.getFogSystem_Unitsofmeasurment();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.TagImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__KEY = eINSTANCE.getTag_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

		/**
		 * The meta object literal for the '{@link fr.imta.semafor.fogAdlModel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.imta.semafor.fogAdlModel.impl.ConstraintImpl
		 * @see fr.imta.semafor.fogAdlModel.impl.FogAdlModelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__OPERATOR = eINSTANCE.getConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Constrained Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINED_PACKAGE = eINSTANCE.getConstraint_ConstrainedPackage();

	}

} //FogAdlModelPackage
