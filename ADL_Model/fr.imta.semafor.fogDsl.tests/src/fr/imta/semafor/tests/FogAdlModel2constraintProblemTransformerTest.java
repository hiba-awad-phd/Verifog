package fr.imta.semafor.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import ConstrainedProblem.ConstrainedObject;
import ConstrainedProblem.ConstrainedObjectSchema;
import ConstrainedProblem.ConstrainedProblemFactory;
import ConstrainedProblem.DirectVariableExpre;
import ConstrainedProblem.Expression;
import ConstrainedProblem.IntValueExpression;
import fr.imta.semafor.fogAdlModel.AttributeExpression;
import fr.imta.semafor.fogAdlModel.ComparaisonOperator;
import fr.imta.semafor.fogAdlModel.Constraint;
import fr.imta.semafor.fogAdlModel.FogAdlModelFactory;
import fr.imta.semafor.fogAdlModel.FogResource;
import fr.imta.semafor.fogAdlModel.IntegerValueExpression;
import fr.imta.semafor.fogAdlModel.ResourceType;
import fr.imta.semafor.fogAdlModel.VirtualNodeSpecification;
import fr.imta.semafor.generator.FogAdlModel2constraintProblemTransformer;
import fr.imta.semafor.services.FogDslGrammarAccess.CpuConstraintElements;
import junit.framework.TestCase;

class FogAdlModel2constraintProblemTransformerTest extends TestCase {
	private static final int maxNbreOfReplicas = 3;
	FogAdlModel2constraintProblemTransformer transformer;
	ArrayList<Integer> possibleVal = new ArrayList<Integer>();
	VirtualNodeSpecification fogResourceSpec;
	private ConstrainedProblem.Constraint replicasConstraint = ConstrainedProblemFactory.eINSTANCE.createConstraint();
	private Constraint cpuCoresConstraint;
	@Before
	protected void setUp() {
		transformer = new FogAdlModel2constraintProblemTransformer(null);
		
		possibleVal.add(1);possibleVal.add(2);possibleVal.add(3);possibleVal.add(4);possibleVal.add(5);
		
		fogResourceSpec = FogAdlModelFactory.eINSTANCE.createVirtualNodeSpecification();
		Constraint replicasCst = FogAdlModelFactory.eINSTANCE.createConstraint();
		AttributeExpression replicaAttribute = FogAdlModelFactory.eINSTANCE.createAttributeExpression();
		replicaAttribute.setAttributeName("replicas");
		IntegerValueExpression nbreOfReplicas = FogAdlModelFactory.eINSTANCE.createIntegerValueExpression();
		nbreOfReplicas.setValue(3);
		replicasCst.getExpression().add(replicaAttribute);
		replicasCst.getExpression().add(nbreOfReplicas);
		
		fogResourceSpec.getConstraints().add(replicasCst);

		createCpuCoresConstraint();
		
		DirectVariableExpre replicasAttributeExpression = ConstrainedProblemFactory.eINSTANCE.createDirectVariableExpre();
		
		IntValueExpression valueExpre = ConstrainedProblemFactory.eINSTANCE.createIntValueExpression();
		valueExpre.setValue(maxNbreOfReplicas);
		replicasConstraint.getExpressions().add(replicasAttributeExpression);
		replicasConstraint.getExpressions().add(valueExpre);
	}

	private void createCpuCoresConstraint() {
		AttributeExpression cpuAttribute = FogAdlModelFactory.eINSTANCE.createAttributeExpression();
		cpuAttribute.setAttributeName("cpuCores");
		IntegerValueExpression nbreOfCpuCores = FogAdlModelFactory.eINSTANCE.createIntegerValueExpression();
		nbreOfCpuCores.setValue(5);

		cpuCoresConstraint = FogAdlModelFactory.eINSTANCE.createConstraint();
		cpuCoresConstraint.getExpression().add(cpuAttribute);
		cpuCoresConstraint.getExpression().add(nbreOfCpuCores);
	}

	@Test
	void testPossibleValuesFromString() {
		this.setUp();
		String range = "0-10";
		Collection<Integer> possibleValues = transformer.possibleValuesFromString(range);
		for(int i=0; i<10 ; i++) {
			assertTrue((int)possibleValues.toArray()[i] == i);
		}
		range = "8-13";
		possibleValues = transformer.possibleValuesFromString(range);
		for(int i=0; i<6 ; i++) {
			assertTrue((int)possibleValues.toArray()[i] == 8 + i);
		}
		assertTrue(possibleValues.size()==6);
	}
	
	@Test
	void testGetOrCreateConstrainedObjectScheam() {
		this.setUp();
		assertTrue(transformer.getObjectSchemas().size()==0);

		for (ResourceType resType : ResourceType.values()) {
			ConstrainedObjectSchema vmSchema = transformer.getOrCreateConstrainedObjectScheam(resType);
			assertTrue(transformer.getObjectSchemas().size()==0);
			assertTrue(vmSchema.getType().equals(resType.toString().toUpperCase()));
		}
		transformer.getOrCreateConstrainedObjectScheam(ResourceType.VIRTUAL_NODE);
	}
	
	@Test
	void testGenerateVariableAndObjectSchema() {
		setUp();
		generateCpuCoresVariableAndObjectSchema();	
		assertTrue(transformer.getObjectSchemas().size()==1);
		assertEquals(transformer.getObjectSchemas().get(0).getType(), "VIRTUALNODE");
		assertEquals(transformer.getObjectSchemas().get(0).getVariables().get(0), transformer.getVariableSchemas().get(0));

		assertTrue(transformer.getVariableSchemas().size()==1);
		assertEquals(transformer.getVariableSchemas().get(0).getName(), "cpuCores");
		assertEquals(transformer.getVariableSchemas().get(0).getPossibleValues(), possibleVal);
		assertEquals(transformer.getVariableSchemas().get(0).getConstrainedobjectschemas().get(0), transformer.getObjectSchemas().get(0));
	}
	
	@Test
	void test2timesGenerateVariableAndObjectSchema() {
		this.setUp();
		assertTrue(transformer.getObjectSchemas().size()==0);
		
		String[] resourceTypes = {"VIRTUALNODE"};
		transformer.generateVariableAndObjectSchema("cpuCores", transformer.possibleValuesFromString("1-5"), resourceTypes);
		transformer.generateVariableAndObjectSchema("memory", transformer.possibleValuesFromString("1-5"), resourceTypes);

		assertEquals(transformer.getVariableSchemas().size(),2);
		assertEquals(transformer.getObjectSchemas().size(),1);
		assertEquals(transformer.getObjectSchemas().get(0).getVariables().size(),2);
	}
	
	@Test
	void test2DifferentGenerateVariableAndObjectSchema() {
		setUp();
		generateCpuCoresVariableAndObjectSchema();
		String[] physicalNodes = {"PHYSICALNODE"};
		transformer.generateVariableAndObjectSchema("memory", transformer.possibleValuesFromString("1-5"), physicalNodes);
		assertEquals(transformer.getObjectSchemas().size(),2);
		assertEquals(transformer.getObjectSchemas().get(0).getVariables().size(),1);
		assertEquals(transformer.getObjectSchemas().get(1).getVariables().size(),1);
	
	}
	
//	@Test
//	void testGenerateTwoVariableAndObjectSchema() {
//		this.setUp();
//		Collection<Integer> possibleValues = transformer.possibleValuesFromString("0-5");
//		String[] resourceTypes = {"VIRTUALNODE", "SERVICE"};
//		transformer.generateVariableAndObjectSchema("replicas", possibleValues, resourceTypes );
//	}
	
	@Test
	void testGetMaxNumberOfinstancesOf() {
		this.setUp();
		
		assertEquals(transformer.getMaxNumberOfinstancesOf(fogResourceSpec), maxNbreOfReplicas);
		fogResourceSpec.getConstraints().get(0).setOperator(ComparaisonOperator.LESSER);
		assertEquals(transformer.getMaxNumberOfinstancesOf(fogResourceSpec), maxNbreOfReplicas - 1);

		((IntegerValueExpression) fogResourceSpec.getConstraints().get(0).getExpression().get(1)).setValue(200);;
		assertEquals(transformer.getMaxNumberOfinstancesOf(fogResourceSpec), 199);
		}

	@Test
	void testDefault_GetMaxNumberOfinstancesOf() {
		this.setUp();

		fogResourceSpec.getConstraints().get(0).setOperator(ComparaisonOperator.GREATER);
		assertEquals(transformer.getMaxNumberOfinstancesOf(fogResourceSpec), 100);

		fogResourceSpec.getConstraints().remove(0);
		assertEquals(transformer.getMaxNumberOfinstancesOf(fogResourceSpec), 100);
	}
	
	@Test
	void testCreateAndAddConstrainedObjectOfType() {
		setUp();
		this.generateCpuCoresVariableAndObjectSchema();
		ConstrainedObject constrainedObject = transformer.generateConstrainedObjectOfType(ResourceType.VIRTUAL_NODE);
		assertEquals(constrainedObject.getSchema().getType(), "VIRTUALNODE");
		assertEquals(constrainedObject.getConstrainedvariables().size(),1);	
	}
	
	@Test 
	void testGenerateConstrainedVariablesAndConstraintsFrom(){
		setUp();
		generateReplicasVariableAndObjectSchema();
		ConstrainedObject constrainedObject = transformer.generateConstrainedObject(fogResourceSpec);
		assertEquals(constrainedObject.getConstrainedvariables().size(),1);
		assertEquals(constrainedObject.getConstrainedvariables().get(0).getSchema().getName(),"replicas");
		assertEquals(constrainedObject.getConstrainedvariables().get(0).getSchema().getPossibleValues().size(), 5);
	}
	
	@Test 
	void testGenerateConstrainedVariablesAndConstraintsFrom2(){
		setUp();
		generateReplicasVariableAndObjectSchema();
		generateCpuCoresVariableAndObjectSchema();
		ConstrainedObject constrainedObjects = transformer.generateConstrainedObject(fogResourceSpec);
		assertEquals(constrainedObjects.getConstrainedvariables().size(),2);
		assertEquals(constrainedObjects.getConstrainedvariables().get(0).getSchema().getName(),"replicas");
		assertEquals(constrainedObjects.getConstrainedvariables().get(1).getSchema().getName(),"cpuCores");
	}
	
	@Test
	void testGetresourceTypeFromResourceClass() {
		setUp();
		
		ResourceType resourceType = transformer.getresourceTypeFromResourceClass(fogResourceSpec.eClass());
		System.out.println(resourceType.getName());
		assertEquals(resourceType.name(), "VIRTUAL_NODE");
	}

	@Test
	void testCreateConstraints() {
		setUp();
		generateReplicasVariableAndObjectSchema();
		ConstrainedObject constrainedObject = transformer.generateConstrainedObject(fogResourceSpec);
		ArrayList<ConstrainedProblem.Constraint> constraints = transformer.createConstraints(constrainedObject, fogResourceSpec);
		assertEquals(constraints.size(),1);
		assertEquals(((DirectVariableExpre)constraints.get(0).getExpressions().get(1)).getConstrainedVariable(), constrainedObject.getConstrainedvariables().get(0));
		assertEquals(((IntValueExpression)constraints.get(0).getExpressions().get(0)).getValue(), 3);
	}

	@Test
	void test2CreateConstraints() {
		setUp();
		generateReplicasVariableAndObjectSchema();
		generateCpuCoresVariableAndObjectSchema();

		fogResourceSpec.getConstraints().add(cpuCoresConstraint);
		ConstrainedObject constrainedObject = transformer.generateConstrainedObject(fogResourceSpec);
		ArrayList<ConstrainedProblem.Constraint> constraints = transformer.createConstraints(constrainedObject, fogResourceSpec);
		assertEquals(constraints.size(),2);
		assertEquals(((DirectVariableExpre)constraints.get(0).getExpressions().get(1)).getConstrainedVariable(), constrainedObject.getConstrainedvariables().get(0));
		assertEquals(((IntValueExpression)constraints.get(0).getExpressions().get(0)).getValue(), 3);
		assertEquals(((DirectVariableExpre)constraints.get(1).getExpressions().get(1)).getConstrainedVariable(), constrainedObject.getConstrainedvariables().get(1));
		assertEquals(((IntValueExpression)constraints.get(1).getExpressions().get(0)).getValue(), 5);	}

	private void generateReplicasVariableAndObjectSchema() {		
		String[] resourceTypes = {"VIRTUALNODE"};
		transformer.generateVariableAndObjectSchema("replicas", transformer.possibleValuesFromString("1-5"), resourceTypes);
	}

	private void generateCpuCoresVariableAndObjectSchema() {
		String[] resourceTypes = {"VIRTUALNODE"};
		transformer.generateVariableAndObjectSchema("cpuCores", transformer.possibleValuesFromString("1-5"), resourceTypes);
	}
}
