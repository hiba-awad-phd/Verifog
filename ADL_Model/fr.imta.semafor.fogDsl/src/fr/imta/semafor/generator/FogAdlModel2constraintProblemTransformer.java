/*
 * 
 *@Author: Abdelghani Alidra
 *  @email: alidrandco@yahoo.fr
 *  
 *  This class generated the intermediary representation of the constrained problem which serves and facilitates the generation of the Choco code
 */

package fr.imta.semafor.generator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import fr.imta.semafor.fogAdlModel.*;

import ConstrainedProblem.*;
import ConstrainedProblem.Constraint;
import ConstrainedProblem.Expression;
import ConstrainedProblem.impl.ConstrainedObjectSchemaImpl;
import ConstrainedProblem.impl.IntValueExpressionImpl;
import ConstrainedProblem.impl.SchemaImpl;

public class FogAdlModel2constraintProblemTransformer {
	private static final int defaultMaxNbreOfResourcesByType = 100;

	private ArrayList<ConstrainedObjectSchema> objectSchemas = new ArrayList<ConstrainedObjectSchema>();
	
	private Resource resource;
	private Problem reconfigurationProblem;

	ArrayList<Schema> variableSchemas = new ArrayList<Schema>();

	private String[][][] universalAttributes = {
			//first column is the attribute name
			//second column is the attribute possible values
			//third column is FogResources that use the attribute
			
			{{"replicas"}, {"0-100"}, {"VIRTUALNODE", "SERVICE"}},
			{{"hosts"}, {"0-100"}, {"VIRTUALNODE", "PHYSICALNODE"}},
			{{"connected"}, {"0-100"}, {"NETWORK"}},
	};

	private HashMap<String, ResourceType> resourceClassToResourceType = new HashMap<String, ResourceType>();
	

	public FogAdlModel2constraintProblemTransformer(Resource resource) {
		resourceClassToResourceType.put(VirtualNodeSpecification.class.getSimpleName(), ResourceType.VIRTUAL_NODE);
		resourceClassToResourceType.put(VirtualNode.class.getSimpleName(), ResourceType.VIRTUAL_NODE);
		resourceClassToResourceType.put(PhysicalNodeSpecification.class.getSimpleName(), ResourceType.PHYSICAL_NODE);
		resourceClassToResourceType.put(PhysicalNode.class.getSimpleName(), ResourceType.PHYSICAL_NODE);
		resourceClassToResourceType.put(NetworkType.class.getSimpleName(), ResourceType.NETWORK);
		resourceClassToResourceType.put(Network.class.getSimpleName(), ResourceType.NETWORK);
		resourceClassToResourceType.put(NetworkLink.class.getSimpleName(), ResourceType.NETWORK_LINK);
		resourceClassToResourceType.put(NetworkLinkType.class.getSimpleName(), ResourceType.NETWORK_LINK);
		resourceClassToResourceType.put(Service.class.getSimpleName(), ResourceType.SERVICE);
		resourceClassToResourceType.put(ServiceType.class.getSimpleName(), ResourceType.SERVICE);
		resourceClassToResourceType.put(Application.class.getSimpleName(), ResourceType.APPLICATION);
		this.resource = resource;
		reconfigurationProblem = ConstrainedProblemFactory.eINSTANCE.createProblem();
	}

	public Problem generateConstrainedProblem() {
		//This is the entrypoint of the constrained problem generation
		
		generateUniversalVariablesSchemas();
		for (AttributeType attType : IterableExtensions.filter(IteratorExtensions.toIterable(resource.getAllContents()), AttributeType.class)) {
			generateVariableAndObjectSchemasFor(attType);
		}
		
		//Create the instances for each ConstainedObject Schemas
	
		for (FogResource fogResourceSpec : IterableExtensions.filter(IteratorExtensions.toIterable(resource.getAllContents()), FogResource.class)) {
			ArrayList<ConstrainedObject> constrainedObjects = new ArrayList<ConstrainedObject>();
			int maxNbreOfInstances = getMaxNumberOfinstancesOf(fogResourceSpec);
			ArrayList<Constraint> constraints = new ArrayList<Constraint>();
			for(int i = 1; i <= maxNbreOfInstances; i++) {
				ConstrainedObject constrainedObject = generateConstrainedObject(fogResourceSpec);
				constrainedObjects.add(constrainedObject);
				constraints.addAll(createConstraints(constrainedObject, fogResourceSpec));
			}
			
			//ArrayList<ConstrainedObject> constrainedObjects = generateConstrainedVariablesAndConstraintsFrom(fogResourceSpec);
		}
		
		return reconfigurationProblem;
	}
	

	public ArrayList<Constraint> createConstraints(ConstrainedObject constrainedObject, FogResource fogResourceSpec) {
		ArrayList<Constraint> constraints = new ArrayList<Constraint>();
		for(fr.imta.semafor.fogAdlModel.Constraint cstr : getConstraints(fogResourceSpec)) {
			
			Constraint constraint = ConstrainedProblemFactory.eINSTANCE.createConstraint();

			IntValueExpression leftHandExp = ConstrainedProblemFactory.eINSTANCE.createIntValueExpression();
			leftHandExp.setValue(((IntegerValueExpression)cstr.getExpression().get(1)).getValue());
			constraint.setComparaisonOperator(cstr.getOperator().toString());
			
			constraint.getExpressions().add(leftHandExp);
			
			DirectVariableExpre rightHandExp = ConstrainedProblemFactory.eINSTANCE.createDirectVariableExpre();
			ConstrainedVariable aVariable;
			aVariable=lookup_in_(((AttributeExpression)cstr.getExpression().get(0)).getAttributeName(), constrainedObject, fogResourceSpec);
			rightHandExp.setConstrainedVariable(aVariable);
			constraint.getExpressions().add(rightHandExp);
			constraints.add(constraint);
		}
		return constraints;
	}

	private ConstrainedVariable lookup_in_(String attributeName, ConstrainedObject constrainedObject, FogResource fogResourceSpec) {
		for(ConstrainedVariable var: constrainedObject.getConstrainedvariables()) {
			if(var.getSchema().getName().equals(attributeName)) {
				return var;
			}
		}
		System.out.println("Fatal: unknown attribute " + attributeName + " from resource " + fogResourceSpec.getName());
		return null;
	}

	public ConstrainedObject generateConstrainedObject(FogResource fogResourceSpec) {
		ConstrainedObject constrainedObject = generateConstrainedObjectOfType(getresourceTypeFromResourceClass(fogResourceSpec.eClass()));
		if(constrainedObject==null) {
			System.out.println("Warning : getresourceTypeFromResourceClass() retruned null for resource type " + fogResourceSpec.eClass().getName());
		}
		return constrainedObject;
	}

	public ResourceType getresourceTypeFromResourceClass(EClass eClass) {
		try{
			return resourceClassToResourceType.get(eClass.getName());
		}catch (Exception e) {		//the eClass is not a "manageable" ForgResource.
			return null;
		}
	}

public ConstrainedObject generateConstrainedObjectOfType(ResourceType nodeType) {
	//Answers a single schema which has the type passed in parameter and inherits all the attributes (created in this method) from the schema of the same type
		if(nodeType==null) {
			return null;
		}
		ConstrainedObject constrainedObject = ConstrainedProblemFactory.eINSTANCE.createConstrainedObject();
		ConstrainedObjectSchema objectSchema = this.getOrCreateConstrainedObjectScheam(nodeType);
		constrainedObject.setSchema(objectSchema);
		for(Schema attributeSchema : objectSchema.getVariables()) {
			ConstrainedVariable constrainedVariable = ConstrainedProblemFactory.eINSTANCE.createConstrainedVariable();
			constrainedVariable.setSchema(attributeSchema);
			constrainedObject.getConstrainedvariables().add(constrainedVariable);
		}
		return constrainedObject;
	}

//	private void generateVariablesFor(FogResource fogResource) {
//		switch(fogResource.getClass()) {
//		case VirtualNodeSpecification :
//			
//		}
//		constrainedVariables.add(null);
//	}

	public int getMaxNumberOfinstancesOf(FogResource fogResourceSpec) {
		for(fr.imta.semafor.fogAdlModel.Constraint cstr: getConstraints(fogResourceSpec)) {
			AttributeExpression attribute = (AttributeExpression) cstr.getExpression().get(0);
			if (attribute.getAttributeName().equals("replicas")) {
				if(cstr.getOperator().equals(ComparaisonOperator.EQUAL) ||
						cstr.getOperator().equals(ComparaisonOperator.LESSER_OR_EQUAL))
					return ((IntegerValueExpression)cstr.getExpression().get(1)).getValue();
				if(cstr.getOperator().equals(ComparaisonOperator.LESSER))
						return ((IntegerValueExpression)cstr.getExpression().get(1)).getValue() - 1;
			}
		}
		return defaultMaxNbreOfResourcesByType;
	}

	private fr.imta.semafor.fogAdlModel.Constraint[] getConstraints(FogResource fogResourceSpec) {
		try {
			EStructuralFeature constrainsFeature = fogResourceSpec.eClass().getEStructuralFeature("constraints");
			return (fr.imta.semafor.fogAdlModel.Constraint[]) ((Collection) fogResourceSpec.eGet(constrainsFeature)).toArray();
		}catch(Exception e){	// The FogResource Does not have a constraints property
			return (fr.imta.semafor.fogAdlModel.Constraint[]) new ArrayList().toArray();
		}
}

	private void generateVariableAndObjectSchemasFor(AttributeType attType) {
		generateVariableAndObjectSchema(attType.getName(), getPossibleValuesOf(attType), attType.getResourcesAsStrings());
	}

	public ConstrainedObjectSchema getOrCreateConstrainedObjectScheam(ResourceType resourceType) {
		// This method returns the object schema of type resourceType from ObjectSchemas field if already existing.
		// If no such ObjectSchema already exist in objectsSchema a new objectSchema is created and returned
		// the new created object is not added in objectSchemas
		
		for(ConstrainedObjectSchema oSchema : objectSchemas )
			if(oSchema.getType().equals(resourceType.toString().toUpperCase())) {
				return oSchema;
			}
		ConstrainedObjectSchema oSchema = ConstrainedProblemFactory.eINSTANCE.createConstrainedObjectSchema();
		oSchema.setType(resourceType.toString().toUpperCase());
		return oSchema;
	}

	private void generateUniversalVariablesSchemas() {
		// This method generates the standard variable schemas and adds them to the corresponding objectSchemas
		
		for(String[][] aUniversalAttributeType : universalAttributes ) {
			generateVariableAndObjectSchema(aUniversalAttributeType[0][0], possibleValuesFromString(aUniversalAttributeType[1][0]), aUniversalAttributeType[2]); 
		}
	}

	public Collection<Integer> possibleValuesFromString(String string) {
		int minVal = Integer.parseInt(string.split("-")[0]);
		int maxVal = Integer.parseInt(string.split("-")[1]);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=minVal; i<=maxVal; i++) {
			result.add(i);
		}
		return result;
	}

	public void generateVariableAndObjectSchema(String variableName, Collection<Integer> possibleValues, String[] objectSchemaNames) {
		//creates and adds the ConstrainedVariable to the current instance
		//creates or updates the ConstrainedObjects which contains the ConstrainedVariable and add them to the current instance
		
		Schema varSchema =  ConstrainedProblemFactory.eINSTANCE.createSchema();
		varSchema.setName(variableName);
		varSchema.getPossibleValues().addAll(possibleValues);
		variableSchemas.add(varSchema);
		for(String resourceTypeName : objectSchemaNames) {
			ConstrainedObjectSchema oSchema = getOrCreateConstrainedObjectScheam(resourceFromString(resourceTypeName));
			oSchema.getVariables().add(varSchema);
			//if not already in problem schemas, add it
			if(!objectSchemas.contains(oSchema))
					objectSchemas.add(oSchema);
		}
	}

	private ResourceType resourceFromString(String resourceTypeName) {
		switch (resourceTypeName) {
		case "VIRTUALNODE":
			return ResourceType.VIRTUAL_NODE;
		case "PHYSICALNODE":
			return ResourceType.PHYSICAL_NODE;	
		case "SERVICE":
			return ResourceType.SERVICE;
		case "NETWORK":
			return ResourceType.NETWORK;
		case "APPLICATION":
			return ResourceType.APPLICATION;
		case "NETWORKLINK":
			return ResourceType.NETWORK_LINK;
		default: 
			System.out.println("unknown resource type "+resourceTypeName);
			return null;
		}
	}

	private Collection<Integer> getPossibleValuesOf(AttributeType attType) {
		//if(attType.getValueType()==String.valueOf(0)) {
			return new ArrayList<Integer>();
		//
	}

	public static Problem generateSampleConstrainedProblem() {
		Problem sampleProblem;
		sampleProblem = ConstrainedProblemFactory.eINSTANCE.createProblem();
		
		Schema schema = ConstrainedProblemFactory.eINSTANCE.createSchema();
		schema.setName("cpuCores");
		schema.getPossibleValues().add(1);
		schema.getPossibleValues().add(2);

		ConstrainedVariable var = ConstrainedProblemFactory.eINSTANCE.createConstrainedVariable();
		var.setHint(2);		
		var.setSchema(schema);
		
		ConstrainedObjectSchema oSchema = ConstrainedProblemFactory.eINSTANCE.createConstrainedObjectSchema();
		oSchema.setType("VM");
		oSchema.setName("VM1");
		oSchema.getVariables().add(schema);	

		ConstrainedObject cst = ConstrainedProblemFactory.eINSTANCE.createConstrainedObject();
		cst.setSchema(oSchema);
		cst.getConstrainedvariables().add(var);
		var.setConstrainedobject(cst);

		DirectVariableExpre leftExp = ConstrainedProblemFactory.eINSTANCE.createDirectVariableExpre();
		leftExp.setConstrainedVariable(var);
		IntValueExpression value = ConstrainedProblemFactory.eINSTANCE.createIntValueExpression();
		value.setValue(3);
		Constraint constraint = ConstrainedProblemFactory.eINSTANCE.createConstraint();
		constraint.getExpressions().add(leftExp);
		constraint.getExpressions().add(value);
		constraint.setComparaisonOperator("greater");

		
		sampleProblem.getConstrainedobjects().add(cst);
		sampleProblem.getConstraints().add(constraint);
		
		return sampleProblem;

	}

	public ArrayList<ConstrainedObjectSchema> getObjectSchemas() {
		// TODO Auto-generated method stub
		return objectSchemas;
	}

	public ArrayList<Schema> getVariableSchemas() {
		// TODO Auto-generated method stub
		return variableSchemas;
	}

}
