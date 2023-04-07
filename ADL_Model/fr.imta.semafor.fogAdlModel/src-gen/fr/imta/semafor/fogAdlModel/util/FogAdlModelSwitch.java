/**
 */
package fr.imta.semafor.fogAdlModel.util;

import fr.imta.semafor.fogAdlModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage
 * @generated
 */
public class FogAdlModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FogAdlModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogAdlModelSwitch() {
		if (modelPackage == null) {
			modelPackage = FogAdlModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FogAdlModelPackage.FOG_RESOURCE: {
			FogResource fogResource = (FogResource) theEObject;
			T result = caseFogResource(fogResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NODE_TYPE: {
			NodeType nodeType = (NodeType) theEObject;
			T result = caseNodeType(nodeType);
			if (result == null)
				result = caseFogResource(nodeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.FOG_SYSTEM: {
			FogSystem fogSystem = (FogSystem) theEObject;
			T result = caseFogSystem(fogSystem);
			if (result == null)
				result = caseFogResource(fogSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.TAG: {
			Tag tag = (Tag) theEObject;
			T result = caseTag(tag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.PHYSICAL_NODE_SPECIFICATION: {
			PhysicalNodeSpecification physicalNodeSpecification = (PhysicalNodeSpecification) theEObject;
			T result = casePhysicalNodeSpecification(physicalNodeSpecification);
			if (result == null)
				result = caseNodeType(physicalNodeSpecification);
			if (result == null)
				result = caseFogResource(physicalNodeSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.VIRTUAL_NODE_SPECIFICATION: {
			VirtualNodeSpecification virtualNodeSpecification = (VirtualNodeSpecification) theEObject;
			T result = caseVirtualNodeSpecification(virtualNodeSpecification);
			if (result == null)
				result = caseNodeType(virtualNodeSpecification);
			if (result == null)
				result = caseFogResource(virtualNodeSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.INTEGER_VALUE_EXPRESSION: {
			IntegerValueExpression integerValueExpression = (IntegerValueExpression) theEObject;
			T result = caseIntegerValueExpression(integerValueExpression);
			if (result == null)
				result = caseExpression(integerValueExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.ATTRIBUTE_EXPRESSION: {
			AttributeExpression attributeExpression = (AttributeExpression) theEObject;
			T result = caseAttributeExpression(attributeExpression);
			if (result == null)
				result = caseExpression(attributeExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.CUSTOM_EXPRESSION: {
			CustomExpression customExpression = (CustomExpression) theEObject;
			T result = caseCustomExpression(customExpression);
			if (result == null)
				result = caseExpression(customExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseFogResource(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.VIRTUAL_NODE: {
			VirtualNode virtualNode = (VirtualNode) theEObject;
			T result = caseVirtualNode(virtualNode);
			if (result == null)
				result = caseNode(virtualNode);
			if (result == null)
				result = caseFogResource(virtualNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.PHYSICAL_NODE: {
			PhysicalNode physicalNode = (PhysicalNode) theEObject;
			T result = casePhysicalNode(physicalNode);
			if (result == null)
				result = caseNode(physicalNode);
			if (result == null)
				result = caseFogResource(physicalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NETWORK_TYPE: {
			NetworkType networkType = (NetworkType) theEObject;
			T result = caseNetworkType(networkType);
			if (result == null)
				result = caseFogResource(networkType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NETWORK_LINK_TYPE: {
			NetworkLinkType networkLinkType = (NetworkLinkType) theEObject;
			T result = caseNetworkLinkType(networkLinkType);
			if (result == null)
				result = caseFogResource(networkLinkType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NETWORK_CLASS_EXPRESSION: {
			NetworkClassExpression networkClassExpression = (NetworkClassExpression) theEObject;
			T result = caseNetworkClassExpression(networkClassExpression);
			if (result == null)
				result = caseExpression(networkClassExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NETWORK: {
			Network network = (Network) theEObject;
			T result = caseNetwork(network);
			if (result == null)
				result = caseFogResource(network);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NETWORK_LINK: {
			NetworkLink networkLink = (NetworkLink) theEObject;
			T result = caseNetworkLink(networkLink);
			if (result == null)
				result = caseFogResource(networkLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.APPLICATION: {
			Application application = (Application) theEObject;
			T result = caseApplication(application);
			if (result == null)
				result = caseFogResource(application);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.SERVICE_TYPE: {
			ServiceType serviceType = (ServiceType) theEObject;
			T result = caseServiceType(serviceType);
			if (result == null)
				result = caseFogResource(serviceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.SOFTWARE_PACKAGE: {
			SoftwarePackage softwarePackage = (SoftwarePackage) theEObject;
			T result = caseSoftwarePackage(softwarePackage);
			if (result == null)
				result = caseFogResource(softwarePackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.NETWORK_PORT: {
			NetworkPort networkPort = (NetworkPort) theEObject;
			T result = caseNetworkPort(networkPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.FOG_AREA: {
			FogArea fogArea = (FogArea) theEObject;
			T result = caseFogArea(fogArea);
			if (result == null)
				result = caseFogResource(fogArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseFogResource(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.MULTIPLICITY_EXPRESSION: {
			MultiplicityExpression multiplicityExpression = (MultiplicityExpression) theEObject;
			T result = caseMultiplicityExpression(multiplicityExpression);
			if (result == null)
				result = caseExpression(multiplicityExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseFogResource(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.CONNECTOR_TYPE: {
			ConnectorType connectorType = (ConnectorType) theEObject;
			T result = caseConnectorType(connectorType);
			if (result == null)
				result = caseFogResource(connectorType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.ATTRIBUTE_TYPE: {
			AttributeType attributeType = (AttributeType) theEObject;
			T result = caseAttributeType(attributeType);
			if (result == null)
				result = caseFogResource(attributeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.UNIT_OF_MEASURMENT: {
			UnitOfMeasurment unitOfMeasurment = (UnitOfMeasurment) theEObject;
			T result = caseUnitOfMeasurment(unitOfMeasurment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FogAdlModelPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogResource(FogResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeType(NodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Node Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Node Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalNodeSpecification(PhysicalNodeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeSpecification(VirtualNodeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueExpression(IntegerValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeExpression(AttributeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomExpression(CustomExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNode(VirtualNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalNode(PhysicalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkType(NetworkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLinkType(NetworkLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Class Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkClassExpression(NetworkClassExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLink(NetworkLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwarePackage(SoftwarePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkPort(NetworkPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogArea(FogArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityExpression(MultiplicityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorType(ConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Of Measurment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Of Measurment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitOfMeasurment(UnitOfMeasurment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogSystem(FogSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FogAdlModelSwitch
