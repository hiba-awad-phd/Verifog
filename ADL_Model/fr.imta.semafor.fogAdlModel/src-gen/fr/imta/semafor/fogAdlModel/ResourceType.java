/**
 */
package fr.imta.semafor.fogAdlModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.imta.semafor.fogAdlModel.FogAdlModelPackage#getResourceType()
 * @model
 * @generated
 */
public enum ResourceType implements Enumerator {
	/**
	 * The '<em><b>Virtual Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_NODE(0, "VirtualNode", "VirtualNode"),

	/**
	 * The '<em><b>Physical Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_NODE(1, "PhysicalNode", "PhysicalNode"),

	/**
	 * The '<em><b>Network Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_LINK(2, "NetworkLink", "NetworkLink"),

	/**
	 * The '<em><b>Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(3, "Network", "Network"),

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(4, "Service", "Service"),

	/**
	 * The '<em><b>Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION(5, "Application", "Application");

	/**
	 * The '<em><b>Virtual Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_NODE
	 * @model name="VirtualNode"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_NODE_VALUE = 0;

	/**
	 * The '<em><b>Physical Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_NODE
	 * @model name="PhysicalNode"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_NODE_VALUE = 1;

	/**
	 * The '<em><b>Network Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_LINK
	 * @model name="NetworkLink"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_LINK_VALUE = 2;

	/**
	 * The '<em><b>Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK
	 * @model name="Network"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 3;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model name="Service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 4;

	/**
	 * The '<em><b>Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION
	 * @model name="Application"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceType[] VALUES_ARRAY = new ResourceType[] { VIRTUAL_NODE, PHYSICAL_NODE, NETWORK_LINK,
			NETWORK, SERVICE, APPLICATION, };

	/**
	 * A public read-only list of all the '<em><b>Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceType get(int value) {
		switch (value) {
		case VIRTUAL_NODE_VALUE:
			return VIRTUAL_NODE;
		case PHYSICAL_NODE_VALUE:
			return PHYSICAL_NODE;
		case NETWORK_LINK_VALUE:
			return NETWORK_LINK;
		case NETWORK_VALUE:
			return NETWORK;
		case SERVICE_VALUE:
			return SERVICE;
		case APPLICATION_VALUE:
			return APPLICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResourceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ResourceType
