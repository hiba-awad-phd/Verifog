/**
 */
package fr.imta.semafor.fogAdlModel.util;

import fr.imta.semafor.fogAdlModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage
 * @generated
 */
public class FogAdlModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FogAdlModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogAdlModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FogAdlModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogAdlModelSwitch<Adapter> modelSwitch = new FogAdlModelSwitch<Adapter>() {
		@Override
		public Adapter caseFogResource(FogResource object) {
			return createFogResourceAdapter();
		}

		@Override
		public Adapter caseNodeType(NodeType object) {
			return createNodeTypeAdapter();
		}

		@Override
		public Adapter caseFogSystem(FogSystem object) {
			return createFogSystemAdapter();
		}

		@Override
		public Adapter caseTag(Tag object) {
			return createTagAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter casePhysicalNodeSpecification(PhysicalNodeSpecification object) {
			return createPhysicalNodeSpecificationAdapter();
		}

		@Override
		public Adapter caseVirtualNodeSpecification(VirtualNodeSpecification object) {
			return createVirtualNodeSpecificationAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseIntegerValueExpression(IntegerValueExpression object) {
			return createIntegerValueExpressionAdapter();
		}

		@Override
		public Adapter caseAttributeExpression(AttributeExpression object) {
			return createAttributeExpressionAdapter();
		}

		@Override
		public Adapter caseCustomExpression(CustomExpression object) {
			return createCustomExpressionAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseVirtualNode(VirtualNode object) {
			return createVirtualNodeAdapter();
		}

		@Override
		public Adapter casePhysicalNode(PhysicalNode object) {
			return createPhysicalNodeAdapter();
		}

		@Override
		public Adapter caseNetworkType(NetworkType object) {
			return createNetworkTypeAdapter();
		}

		@Override
		public Adapter caseNetworkLinkType(NetworkLinkType object) {
			return createNetworkLinkTypeAdapter();
		}

		@Override
		public Adapter caseNetworkClassExpression(NetworkClassExpression object) {
			return createNetworkClassExpressionAdapter();
		}

		@Override
		public Adapter caseNetwork(Network object) {
			return createNetworkAdapter();
		}

		@Override
		public Adapter caseNetworkLink(NetworkLink object) {
			return createNetworkLinkAdapter();
		}

		@Override
		public Adapter caseApplication(Application object) {
			return createApplicationAdapter();
		}

		@Override
		public Adapter caseServiceType(ServiceType object) {
			return createServiceTypeAdapter();
		}

		@Override
		public Adapter caseSoftwarePackage(SoftwarePackage object) {
			return createSoftwarePackageAdapter();
		}

		@Override
		public Adapter caseNetworkPort(NetworkPort object) {
			return createNetworkPortAdapter();
		}

		@Override
		public Adapter caseFogArea(FogArea object) {
			return createFogAreaAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseMultiplicityExpression(MultiplicityExpression object) {
			return createMultiplicityExpressionAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseConnectorType(ConnectorType object) {
			return createConnectorTypeAdapter();
		}

		@Override
		public Adapter caseAttributeType(AttributeType object) {
			return createAttributeTypeAdapter();
		}

		@Override
		public Adapter caseUnitOfMeasurment(UnitOfMeasurment object) {
			return createUnitOfMeasurmentAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.FogResource <em>Fog Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.FogResource
	 * @generated
	 */
	public Adapter createFogResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.PhysicalNodeSpecification <em>Physical Node Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.PhysicalNodeSpecification
	 * @generated
	 */
	public Adapter createPhysicalNodeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.VirtualNodeSpecification <em>Virtual Node Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNodeSpecification
	 * @generated
	 */
	public Adapter createVirtualNodeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.IntegerValueExpression <em>Integer Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.IntegerValueExpression
	 * @generated
	 */
	public Adapter createIntegerValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.AttributeExpression <em>Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.AttributeExpression
	 * @generated
	 */
	public Adapter createAttributeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.CustomExpression <em>Custom Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.CustomExpression
	 * @generated
	 */
	public Adapter createCustomExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.VirtualNode <em>Virtual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.VirtualNode
	 * @generated
	 */
	public Adapter createVirtualNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.PhysicalNode <em>Physical Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.PhysicalNode
	 * @generated
	 */
	public Adapter createPhysicalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.NetworkType
	 * @generated
	 */
	public Adapter createNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.NetworkLinkType <em>Network Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLinkType
	 * @generated
	 */
	public Adapter createNetworkLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.NetworkClassExpression <em>Network Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.NetworkClassExpression
	 * @generated
	 */
	public Adapter createNetworkClassExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.NetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.NetworkLink
	 * @generated
	 */
	public Adapter createNetworkLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.SoftwarePackage <em>Software Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.SoftwarePackage
	 * @generated
	 */
	public Adapter createSoftwarePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.NetworkPort <em>Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.NetworkPort
	 * @generated
	 */
	public Adapter createNetworkPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.FogArea <em>Fog Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.FogArea
	 * @generated
	 */
	public Adapter createFogAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.MultiplicityExpression <em>Multiplicity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.MultiplicityExpression
	 * @generated
	 */
	public Adapter createMultiplicityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.UnitOfMeasurment <em>Unit Of Measurment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.UnitOfMeasurment
	 * @generated
	 */
	public Adapter createUnitOfMeasurmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.FogSystem <em>Fog System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.FogSystem
	 * @generated
	 */
	public Adapter createFogSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.imta.semafor.fogAdlModel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.imta.semafor.fogAdlModel.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FogAdlModelAdapterFactory
