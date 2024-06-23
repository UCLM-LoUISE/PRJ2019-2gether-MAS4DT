/**
 */
package prometheus_metamodel_system_specification;

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
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationFactory
 * @model kind="package"
 * @generated
 */
public interface Prometheus_metamodel_system_specificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prometheus_metamodel_system_specification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/prometheus_metamodel_system_specification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prometheus_metamodel_system_specification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Prometheus_metamodel_system_specificationPackage eINSTANCE = prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.ModelImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Percepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PERCEPTS = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTEXTS = 2;

	/**
	 * The feature id for the '<em><b>Physical objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PHYSICAL_OBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Logical objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LOGICAL_OBJECTS = 4;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GOALS = 5;

	/**
	 * The feature id for the '<em><b>Goal relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GOAL_RELATIONSHIPS = 6;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTORS = 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROLES = 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATA = 9;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCENARIOS = 10;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__AGENTS = 11;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MESSAGES = 12;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROTOCOLS = 13;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CAPABILITIES = 14;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.EntityImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.ContextImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SCENARIO = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.GoalImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Goal relationship from and</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_RELATIONSHIP_FROM_AND = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal relationship to and</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_RELATIONSHIP_TO_AND = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MODEL = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__STEP = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Goal relationship from or</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_RELATIONSHIP_FROM_OR = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Goal relationship to or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_RELATIONSHIP_TO_OR = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ROL = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scenario goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SCENARIO_GOALS = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.ActionImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DURATION = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FAILURE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partial change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARTIAL_CHANGE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Side effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SIDE_EFFECTS = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STEP = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTOR = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Physical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PHYSICAL_OBJECT = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ROL = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scenario action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SCENARIO_ACTION = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Agent action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AGENT_ACTION = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.PerceptImpl <em>Percept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.PerceptImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getPercept()
	 * @generated
	 */
	int PERCEPT = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Information carried</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__INFORMATION_CARRIED = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Knowledge updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__KNOWLEDGE_UPDATED = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__SOURCE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__PROCESSING = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expected frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__EXPECTED_FREQUENCY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__EXTERNAL_TO_SYSTEM = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__EXTERNAL_PATH = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__STEP = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__ROL = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__SCENARIO = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scenario percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__SCENARIO_PERCEPT = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Agent percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__AGENT_PERCEPT = ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__CAPABILITY = ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Percept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Percept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl <em>Goal Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getGoal_Relationship()
	 * @generated
	 */
	int GOAL_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Goal from and</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__GOAL_FROM_AND = 0;

	/**
	 * The feature id for the '<em><b>Goal to and</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__GOAL_TO_AND = 1;

	/**
	 * The feature id for the '<em><b>Goal from or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__GOAL_FROM_OR = 2;

	/**
	 * The feature id for the '<em><b>Goal to or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__GOAL_TO_OR = 3;

	/**
	 * The number of structural features of the '<em>Goal Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Goal Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl <em>Physical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.Physical_ObjectImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getPhysical_Object()
	 * @generated
	 */
	int PHYSICAL_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__SCENARIO = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical object shadow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical object twin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Physical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__PHYSICAL_OBJECT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__PERCEPT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__ACTOR = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Physical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Physical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.Logical_ObjectImpl <em>Logical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.Logical_ObjectImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getLogical_Object()
	 * @generated
	 */
	int LOGICAL_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Physical object shadow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical object twin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.ScenarioImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Physical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PHYSICAL_OBJECT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTEXT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEPS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TRIGGER = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VARIATION = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEP = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Goals scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__GOALS_SCENARIO = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRIORITY = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Percept scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PERCEPT_SCENARIO = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Model scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MODEL_SCENARIO = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Action scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ACTION_SCENARIO = ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Data scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DATA_SCENARIO = ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rol scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ROL_SCENARIO = ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.CapabilityImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agent capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__AGENT_CAPABILITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DATA_CAPABILITY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ACTION = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MESSAGE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DATA = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.AttributeImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 3;

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
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.StepImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE_STEP = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__GOAL = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PERCEPT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTION = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SCENARIO = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.ActorImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTION = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERCEPT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PHYSICAL_OBJECT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SCENARIO = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.RolImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__DATA_ROL = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__PERCEPT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ACTION = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__GOAL = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scenario rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__SCENARIO_ROL = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.DataImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getData()
	 * @generated
	 */
	int DATA = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Included fields aspects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INCLUDED_FIELDS_ASPECTS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PERSISTENT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EXTERNAL_TO_SYSTEM = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EXTERNAL_PATH = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INITIALISATION = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Used when</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__USED_WHEN = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scenario data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SCENARIO_DATA = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Agent data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AGENT_DATA = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rol data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ROL_DATA = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MESSAGE = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Capability data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CAPABILITY_DATA = ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CAPABILITY = ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.AgentImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Minimum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MINIMUM_CARDINALITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MAXIMUM_CARDINALITY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LIFETIME = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INITIALISATION = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Demise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DEMISE = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DATA_AGENT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ROL = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PROTOCOL = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MESSAGE_AGENT = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Action agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACTION_AGENT = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MODEL = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Percept agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PERCEPT_AGENT = ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Capability agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CAPABILITY_AGENT = ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.MessageImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PURPOSE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Carried information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CARRIED_INFORMATION = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTERNAL_PATH = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTERNAL_TO_SYSTEM = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agent message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__AGENT_MESSAGE = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CAPABILITY = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.ProtocolImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__AGENT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Types <em>Enum Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Types
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Types()
	 * @generated
	 */
	int ENUM_TYPES = 19;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Visibility <em>Enum Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Visibility
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Visibility()
	 * @generated
	 */
	int ENUM_VISIBILITY = 20;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Type_Step <em>Enum Type Step</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Type_Step
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Type_Step()
	 * @generated
	 */
	int ENUM_TYPE_STEP = 21;

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see prometheus_metamodel_system_specification.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getPercepts <em>Percepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percepts</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getPercepts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Percepts();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getActions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getContexts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getPhysical_objects <em>Physical objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical objects</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getPhysical_objects()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Physical_objects();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getLogical_objects <em>Logical objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical objects</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getLogical_objects()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Logical_objects();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getGoals()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getGoal_relationships <em>Goal relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal relationships</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getGoal_relationships()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Goal_relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getActors()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getRoles()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getData()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getScenarios()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Scenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getAgents()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getMessages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getProtocols()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getCapabilities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Capabilities();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see prometheus_metamodel_system_specification.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Context#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Context#getScenario()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Scenario();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see prometheus_metamodel_system_specification.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_and <em>Goal relationship from and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal relationship from and</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_and()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal_relationship_from_and();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_and <em>Goal relationship to and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal relationship to and</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_and()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal_relationship_to_and();

	/**
	 * Returns the meta object for the container reference '{@link prometheus_metamodel_system_specification.Goal#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getModel()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Model();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Goal#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getStep()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Step();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_or <em>Goal relationship from or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal relationship from or</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_or()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal_relationship_from_or();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_or <em>Goal relationship to or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal relationship to or</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_or()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal_relationship_to_or();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Goal#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getRol()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Rol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Goal#getScenario_goals <em>Scenario goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario goals</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getScenario_goals()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Scenario_goals();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Action#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getDuration()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Duration();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Action#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getFailure()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Failure();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Action#getPartial_change <em>Partial change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial change</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getPartial_change()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Partial_change();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Action#getSide_effects <em>Side effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side effects</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getSide_effects()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Side_effects();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getStep()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Step();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getActor()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actor();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getPhysical_object()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Physical_object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getRol()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Rol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getScenario_action <em>Scenario action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario action</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getScenario_action()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Scenario_action();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getAgent_action <em>Agent action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent action</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getAgent_action()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Agent_action();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Percept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Percept
	 * @generated
	 */
	EClass getPercept();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#getInformation_carried <em>Information carried</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information carried</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getInformation_carried()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_Information_carried();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#getKnowledge_updated <em>Knowledge updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knowledge updated</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getKnowledge_updated()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_Knowledge_updated();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getSource()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_Source();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getProcessing()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_Processing();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#getExpected_frequency <em>Expected frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected frequency</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getExpected_frequency()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_Expected_frequency();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#isExternal_to_system <em>External to system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External to system</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#isExternal_to_system()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_External_to_system();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Percept#getExternal_path <em>External path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External path</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getExternal_path()
	 * @see #getPercept()
	 * @generated
	 */
	EAttribute getPercept_External_path();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getStep()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Step();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getRol()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Rol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getScenario()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getScenario_percept <em>Scenario percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario percept</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getScenario_percept()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Scenario_percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getAgent_percept <em>Agent percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent percept</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getAgent_percept()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Agent_percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getCapability()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Capability();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Goal_Relationship <em>Goal Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Relationship</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship
	 * @generated
	 */
	EClass getGoal_Relationship();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_and <em>Goal from and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal from and</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_and()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EReference getGoal_Relationship_Goal_from_and();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_and <em>Goal to and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal to and</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_and()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EReference getGoal_Relationship_Goal_to_and();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_or <em>Goal from or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal from or</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_or()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EReference getGoal_Relationship_Goal_from_or();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_or <em>Goal to or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal to or</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_or()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EReference getGoal_Relationship_Goal_to_or();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Physical_Object <em>Physical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Object</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object
	 * @generated
	 */
	EClass getPhysical_Object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getScenario()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getPhysical_object()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Physical_object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object_shadow <em>Logical object shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical object shadow</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getLogical_object_shadow()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Logical_object_shadow();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object_twin <em>Logical object twin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical object twin</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getLogical_object_twin()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Logical_object_twin();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getPercept()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getActor()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Actor();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Logical_Object <em>Logical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Object</em>'.
	 * @see prometheus_metamodel_system_specification.Logical_Object
	 * @generated
	 */
	EClass getLogical_Object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_shadow <em>Physical object shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object shadow</em>'.
	 * @see prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_shadow()
	 * @see #getLogical_Object()
	 * @generated
	 */
	EReference getLogical_Object_Physical_object_shadow();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_twin <em>Physical object twin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object twin</em>'.
	 * @see prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_twin()
	 * @see #getLogical_Object()
	 * @generated
	 */
	EReference getLogical_Object_Physical_object_twin();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getPhysical_object()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Physical_object();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Scenario#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getContext()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Scenario#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getSteps()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Steps();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Scenario#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getTrigger()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Scenario#getVariation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variation</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getVariation()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Variation();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Scenario#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getPriority()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Priority();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getStep()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Step();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getScenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getPercept_scenario <em>Percept scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getPercept_scenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Percept_scenario();

	/**
	 * Returns the meta object for the container reference '{@link prometheus_metamodel_system_specification.Scenario#getModel_scenario <em>Model scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getModel_scenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Model_scenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getAction_scenario <em>Action scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getAction_scenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Action_scenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getRol_scenario <em>Rol scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getRol_scenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Rol_scenario();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see prometheus_metamodel_system_specification.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Capability#getAgent_capability <em>Agent capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent capability</em>'.
	 * @see prometheus_metamodel_system_specification.Capability#getAgent_capability()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Agent_capability();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Capability#getData_capability <em>Data capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data capability</em>'.
	 * @see prometheus_metamodel_system_specification.Capability#getData_capability()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Data_capability();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Capability#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Capability#getAction()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Action();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Capability#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see prometheus_metamodel_system_specification.Capability#getMessage()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Message();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Capability#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see prometheus_metamodel_system_specification.Capability#getData()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Data();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getData_scenario <em>Data scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getData_scenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Data_scenario();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getGoals_scenario <em>Goals scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getGoals_scenario()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Goals_scenario();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see prometheus_metamodel_system_specification.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Entity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see prometheus_metamodel_system_specification.Entity#getAttribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see prometheus_metamodel_system_specification.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prometheus_metamodel_system_specification.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see prometheus_metamodel_system_specification.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see prometheus_metamodel_system_specification.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prometheus_metamodel_system_specification.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see prometheus_metamodel_system_specification.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see prometheus_metamodel_system_specification.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see prometheus_metamodel_system_specification.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see prometheus_metamodel_system_specification.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Step#getType_step <em>Type step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type step</em>'.
	 * @see prometheus_metamodel_system_specification.Step#getType_step()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Type_step();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Step#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal</em>'.
	 * @see prometheus_metamodel_system_specification.Step#getGoal()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Goal();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Step#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Step#getPercept()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Step#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Step#getAction()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Action();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Step#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Step#getScenario()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Scenario();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see prometheus_metamodel_system_specification.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Actor#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Actor#getAction()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Action();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Actor#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Actor#getPercept()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Actor#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object</em>'.
	 * @see prometheus_metamodel_system_specification.Actor#getPhysical_object()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Physical_object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Actor#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Actor#getScenario()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Scenario();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see prometheus_metamodel_system_specification.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Rol#getData_rol <em>Data rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data rol</em>'.
	 * @see prometheus_metamodel_system_specification.Rol#getData_rol()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Data_rol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Rol#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Rol#getPercept()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Rol#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Rol#getAction()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Action();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Rol#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal</em>'.
	 * @see prometheus_metamodel_system_specification.Rol#getGoal()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Goal();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Rol#getScenario_rol <em>Scenario rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario rol</em>'.
	 * @see prometheus_metamodel_system_specification.Rol#getScenario_rol()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Scenario_rol();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see prometheus_metamodel_system_specification.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getData_type()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Data_type();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#getIncluded_fields_aspects <em>Included fields aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Included fields aspects</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getIncluded_fields_aspects()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Included_fields_aspects();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see prometheus_metamodel_system_specification.Data#isPersistent()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#isExternal_to_system <em>External to system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External to system</em>'.
	 * @see prometheus_metamodel_system_specification.Data#isExternal_to_system()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_External_to_system();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#getExternal_path <em>External path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External path</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getExternal_path()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_External_path();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#getInitialisation <em>Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialisation</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getInitialisation()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Initialisation();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Data#getUsed_when <em>Used when</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used when</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getUsed_when()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Used_when();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Data#getScenario_data <em>Scenario data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario data</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getScenario_data()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Scenario_data();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Data#getAgent_data <em>Agent data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent data</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getAgent_data()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Agent_data();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Data#getRol_data <em>Rol data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol data</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getRol_data()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Rol_data();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Data#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getMessage()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Message();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Data#getCapability_data <em>Capability data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability data</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getCapability_data()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Capability_data();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Data#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability</em>'.
	 * @see prometheus_metamodel_system_specification.Data#getCapability()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Capability();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see prometheus_metamodel_system_specification.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Agent#getMinimum_cardinality <em>Minimum cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum cardinality</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getMinimum_cardinality()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Minimum_cardinality();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Agent#getMaximum_cardinality <em>Maximum cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum cardinality</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getMaximum_cardinality()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Maximum_cardinality();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Agent#getLifetime <em>Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifetime</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getLifetime()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Lifetime();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Agent#getInitialisation <em>Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialisation</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getInitialisation()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Initialisation();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Agent#getDemise <em>Demise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demise</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getDemise()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Demise();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getData_agent <em>Data agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data agent</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getData_agent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Data_agent();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rol</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getRol()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Rol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protocol</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getProtocol()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Protocol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getMessage_agent <em>Message agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message agent</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getMessage_agent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Message_agent();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getAction_agent <em>Action agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action agent</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getAction_agent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Action_agent();

	/**
	 * Returns the meta object for the container reference '{@link prometheus_metamodel_system_specification.Agent#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getModel()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Model();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getPercept_agent <em>Percept agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept agent</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getPercept_agent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Percept_agent();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Agent#getCapability_agent <em>Capability agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability agent</em>'.
	 * @see prometheus_metamodel_system_specification.Agent#getCapability_agent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Capability_agent();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see prometheus_metamodel_system_specification.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Message#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see prometheus_metamodel_system_specification.Message#getPurpose()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Message#getCarried_information <em>Carried information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carried information</em>'.
	 * @see prometheus_metamodel_system_specification.Message#getCarried_information()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Carried_information();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Message#getExternal_path <em>External path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External path</em>'.
	 * @see prometheus_metamodel_system_specification.Message#getExternal_path()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_External_path();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Message#isExternal_to_system <em>External to system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External to system</em>'.
	 * @see prometheus_metamodel_system_specification.Message#isExternal_to_system()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_External_to_system();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Message#getAgent_message <em>Agent message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent message</em>'.
	 * @see prometheus_metamodel_system_specification.Message#getAgent_message()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Agent_message();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Message#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability</em>'.
	 * @see prometheus_metamodel_system_specification.Message#getCapability()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Capability();

	/**
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see prometheus_metamodel_system_specification.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Protocol#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent</em>'.
	 * @see prometheus_metamodel_system_specification.Protocol#getAgent()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Agent();

	/**
	 * Returns the meta object for enum '{@link prometheus_metamodel_system_specification.Enum_Types <em>Enum Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Types</em>'.
	 * @see prometheus_metamodel_system_specification.Enum_Types
	 * @generated
	 */
	EEnum getEnum_Types();

	/**
	 * Returns the meta object for enum '{@link prometheus_metamodel_system_specification.Enum_Visibility <em>Enum Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Visibility</em>'.
	 * @see prometheus_metamodel_system_specification.Enum_Visibility
	 * @generated
	 */
	EEnum getEnum_Visibility();

	/**
	 * Returns the meta object for enum '{@link prometheus_metamodel_system_specification.Enum_Type_Step <em>Enum Type Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type Step</em>'.
	 * @see prometheus_metamodel_system_specification.Enum_Type_Step
	 * @generated
	 */
	EEnum getEnum_Type_Step();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Prometheus_metamodel_system_specificationFactory getPrometheus_metamodel_system_specificationFactory();

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
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ModelImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Percepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PERCEPTS = eINSTANCE.getModel_Percepts();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTIONS = eINSTANCE.getModel_Actions();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTEXTS = eINSTANCE.getModel_Contexts();

		/**
		 * The meta object literal for the '<em><b>Physical objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PHYSICAL_OBJECTS = eINSTANCE.getModel_Physical_objects();

		/**
		 * The meta object literal for the '<em><b>Logical objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LOGICAL_OBJECTS = eINSTANCE.getModel_Logical_objects();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GOALS = eINSTANCE.getModel_Goals();

		/**
		 * The meta object literal for the '<em><b>Goal relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GOAL_RELATIONSHIPS = eINSTANCE.getModel_Goal_relationships();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTORS = eINSTANCE.getModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROLES = eINSTANCE.getModel_Roles();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATA = eINSTANCE.getModel_Data();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCENARIOS = eINSTANCE.getModel_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__AGENTS = eINSTANCE.getModel_Agents();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MESSAGES = eINSTANCE.getModel_Messages();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROTOCOLS = eINSTANCE.getModel_Protocols();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CAPABILITIES = eINSTANCE.getModel_Capabilities();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ContextImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__SCENARIO = eINSTANCE.getContext_Scenario();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.GoalImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Goal relationship from and</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_RELATIONSHIP_FROM_AND = eINSTANCE.getGoal_Goal_relationship_from_and();

		/**
		 * The meta object literal for the '<em><b>Goal relationship to and</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_RELATIONSHIP_TO_AND = eINSTANCE.getGoal_Goal_relationship_to_and();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__MODEL = eINSTANCE.getGoal_Model();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__STEP = eINSTANCE.getGoal_Step();

		/**
		 * The meta object literal for the '<em><b>Goal relationship from or</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_RELATIONSHIP_FROM_OR = eINSTANCE.getGoal_Goal_relationship_from_or();

		/**
		 * The meta object literal for the '<em><b>Goal relationship to or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_RELATIONSHIP_TO_OR = eINSTANCE.getGoal_Goal_relationship_to_or();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ROL = eINSTANCE.getGoal_Rol();

		/**
		 * The meta object literal for the '<em><b>Scenario goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SCENARIO_GOALS = eINSTANCE.getGoal_Scenario_goals();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ActionImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DURATION = eINSTANCE.getAction_Duration();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FAILURE = eINSTANCE.getAction_Failure();

		/**
		 * The meta object literal for the '<em><b>Partial change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PARTIAL_CHANGE = eINSTANCE.getAction_Partial_change();

		/**
		 * The meta object literal for the '<em><b>Side effects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__SIDE_EFFECTS = eINSTANCE.getAction_Side_effects();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STEP = eINSTANCE.getAction_Step();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTOR = eINSTANCE.getAction_Actor();

		/**
		 * The meta object literal for the '<em><b>Physical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PHYSICAL_OBJECT = eINSTANCE.getAction_Physical_object();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ROL = eINSTANCE.getAction_Rol();

		/**
		 * The meta object literal for the '<em><b>Scenario action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SCENARIO_ACTION = eINSTANCE.getAction_Scenario_action();

		/**
		 * The meta object literal for the '<em><b>Agent action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__AGENT_ACTION = eINSTANCE.getAction_Agent_action();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.PerceptImpl <em>Percept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.PerceptImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getPercept()
		 * @generated
		 */
		EClass PERCEPT = eINSTANCE.getPercept();

		/**
		 * The meta object literal for the '<em><b>Information carried</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__INFORMATION_CARRIED = eINSTANCE.getPercept_Information_carried();

		/**
		 * The meta object literal for the '<em><b>Knowledge updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__KNOWLEDGE_UPDATED = eINSTANCE.getPercept_Knowledge_updated();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__SOURCE = eINSTANCE.getPercept_Source();

		/**
		 * The meta object literal for the '<em><b>Processing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__PROCESSING = eINSTANCE.getPercept_Processing();

		/**
		 * The meta object literal for the '<em><b>Expected frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__EXPECTED_FREQUENCY = eINSTANCE.getPercept_Expected_frequency();

		/**
		 * The meta object literal for the '<em><b>External to system</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__EXTERNAL_TO_SYSTEM = eINSTANCE.getPercept_External_to_system();

		/**
		 * The meta object literal for the '<em><b>External path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCEPT__EXTERNAL_PATH = eINSTANCE.getPercept_External_path();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__STEP = eINSTANCE.getPercept_Step();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__ROL = eINSTANCE.getPercept_Rol();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__SCENARIO = eINSTANCE.getPercept_Scenario();

		/**
		 * The meta object literal for the '<em><b>Scenario percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__SCENARIO_PERCEPT = eINSTANCE.getPercept_Scenario_percept();

		/**
		 * The meta object literal for the '<em><b>Agent percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__AGENT_PERCEPT = eINSTANCE.getPercept_Agent_percept();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__CAPABILITY = eINSTANCE.getPercept_Capability();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl <em>Goal Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getGoal_Relationship()
		 * @generated
		 */
		EClass GOAL_RELATIONSHIP = eINSTANCE.getGoal_Relationship();

		/**
		 * The meta object literal for the '<em><b>Goal from and</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_RELATIONSHIP__GOAL_FROM_AND = eINSTANCE.getGoal_Relationship_Goal_from_and();

		/**
		 * The meta object literal for the '<em><b>Goal to and</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_RELATIONSHIP__GOAL_TO_AND = eINSTANCE.getGoal_Relationship_Goal_to_and();

		/**
		 * The meta object literal for the '<em><b>Goal from or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_RELATIONSHIP__GOAL_FROM_OR = eINSTANCE.getGoal_Relationship_Goal_from_or();

		/**
		 * The meta object literal for the '<em><b>Goal to or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_RELATIONSHIP__GOAL_TO_OR = eINSTANCE.getGoal_Relationship_Goal_to_or();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl <em>Physical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.Physical_ObjectImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getPhysical_Object()
		 * @generated
		 */
		EClass PHYSICAL_OBJECT = eINSTANCE.getPhysical_Object();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__SCENARIO = eINSTANCE.getPhysical_Object_Scenario();

		/**
		 * The meta object literal for the '<em><b>Physical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__PHYSICAL_OBJECT = eINSTANCE.getPhysical_Object_Physical_object();

		/**
		 * The meta object literal for the '<em><b>Logical object shadow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW = eINSTANCE.getPhysical_Object_Logical_object_shadow();

		/**
		 * The meta object literal for the '<em><b>Logical object twin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN = eINSTANCE.getPhysical_Object_Logical_object_twin();

		/**
		 * The meta object literal for the '<em><b>Percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__PERCEPT = eINSTANCE.getPhysical_Object_Percept();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__ACTOR = eINSTANCE.getPhysical_Object_Actor();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.Logical_ObjectImpl <em>Logical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.Logical_ObjectImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getLogical_Object()
		 * @generated
		 */
		EClass LOGICAL_OBJECT = eINSTANCE.getLogical_Object();

		/**
		 * The meta object literal for the '<em><b>Physical object shadow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW = eINSTANCE.getLogical_Object_Physical_object_shadow();

		/**
		 * The meta object literal for the '<em><b>Physical object twin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN = eINSTANCE.getLogical_Object_Physical_object_twin();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ScenarioImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Physical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PHYSICAL_OBJECT = eINSTANCE.getScenario_Physical_object();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONTEXT = eINSTANCE.getScenario_Context();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TRIGGER = eINSTANCE.getScenario_Trigger();

		/**
		 * The meta object literal for the '<em><b>Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__VARIATION = eINSTANCE.getScenario_Variation();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__PRIORITY = eINSTANCE.getScenario_Priority();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STEP = eINSTANCE.getScenario_Step();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCENARIO = eINSTANCE.getScenario_Scenario();

		/**
		 * The meta object literal for the '<em><b>Percept scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PERCEPT_SCENARIO = eINSTANCE.getScenario_Percept_scenario();

		/**
		 * The meta object literal for the '<em><b>Model scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__MODEL_SCENARIO = eINSTANCE.getScenario_Model_scenario();

		/**
		 * The meta object literal for the '<em><b>Action scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ACTION_SCENARIO = eINSTANCE.getScenario_Action_scenario();

		/**
		 * The meta object literal for the '<em><b>Rol scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ROL_SCENARIO = eINSTANCE.getScenario_Rol_scenario();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.CapabilityImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Agent capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__AGENT_CAPABILITY = eINSTANCE.getCapability_Agent_capability();

		/**
		 * The meta object literal for the '<em><b>Data capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__DATA_CAPABILITY = eINSTANCE.getCapability_Data_capability();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__ACTION = eINSTANCE.getCapability_Action();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__MESSAGE = eINSTANCE.getCapability_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__DATA = eINSTANCE.getCapability_Data();

		/**
		 * The meta object literal for the '<em><b>Data scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__DATA_SCENARIO = eINSTANCE.getScenario_Data_scenario();

		/**
		 * The meta object literal for the '<em><b>Goals scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__GOALS_SCENARIO = eINSTANCE.getScenario_Goals_scenario();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.EntityImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTE = eINSTANCE.getEntity_Attribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.AttributeImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.StepImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Type step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TYPE_STEP = eINSTANCE.getStep_Type_step();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__GOAL = eINSTANCE.getStep_Goal();

		/**
		 * The meta object literal for the '<em><b>Percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PERCEPT = eINSTANCE.getStep_Percept();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ACTION = eINSTANCE.getStep_Action();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SCENARIO = eINSTANCE.getStep_Scenario();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ActorImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTION = eINSTANCE.getActor_Action();

		/**
		 * The meta object literal for the '<em><b>Percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PERCEPT = eINSTANCE.getActor_Percept();

		/**
		 * The meta object literal for the '<em><b>Physical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PHYSICAL_OBJECT = eINSTANCE.getActor_Physical_object();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SCENARIO = eINSTANCE.getActor_Scenario();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.RolImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Data rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__DATA_ROL = eINSTANCE.getRol_Data_rol();

		/**
		 * The meta object literal for the '<em><b>Percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__PERCEPT = eINSTANCE.getRol_Percept();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ACTION = eINSTANCE.getRol_Action();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__GOAL = eINSTANCE.getRol_Goal();

		/**
		 * The meta object literal for the '<em><b>Scenario rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__SCENARIO_ROL = eINSTANCE.getRol_Scenario_rol();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.DataImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATA_TYPE = eINSTANCE.getData_Data_type();

		/**
		 * The meta object literal for the '<em><b>Included fields aspects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__INCLUDED_FIELDS_ASPECTS = eINSTANCE.getData_Included_fields_aspects();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PERSISTENT = eINSTANCE.getData_Persistent();

		/**
		 * The meta object literal for the '<em><b>External to system</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__EXTERNAL_TO_SYSTEM = eINSTANCE.getData_External_to_system();

		/**
		 * The meta object literal for the '<em><b>External path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__EXTERNAL_PATH = eINSTANCE.getData_External_path();

		/**
		 * The meta object literal for the '<em><b>Initialisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__INITIALISATION = eINSTANCE.getData_Initialisation();

		/**
		 * The meta object literal for the '<em><b>Used when</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__USED_WHEN = eINSTANCE.getData_Used_when();

		/**
		 * The meta object literal for the '<em><b>Scenario data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SCENARIO_DATA = eINSTANCE.getData_Scenario_data();

		/**
		 * The meta object literal for the '<em><b>Agent data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__AGENT_DATA = eINSTANCE.getData_Agent_data();

		/**
		 * The meta object literal for the '<em><b>Rol data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ROL_DATA = eINSTANCE.getData_Rol_data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__MESSAGE = eINSTANCE.getData_Message();

		/**
		 * The meta object literal for the '<em><b>Capability data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__CAPABILITY_DATA = eINSTANCE.getData_Capability_data();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__CAPABILITY = eINSTANCE.getData_Capability();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.AgentImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Minimum cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__MINIMUM_CARDINALITY = eINSTANCE.getAgent_Minimum_cardinality();

		/**
		 * The meta object literal for the '<em><b>Maximum cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__MAXIMUM_CARDINALITY = eINSTANCE.getAgent_Maximum_cardinality();

		/**
		 * The meta object literal for the '<em><b>Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__LIFETIME = eINSTANCE.getAgent_Lifetime();

		/**
		 * The meta object literal for the '<em><b>Initialisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__INITIALISATION = eINSTANCE.getAgent_Initialisation();

		/**
		 * The meta object literal for the '<em><b>Demise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__DEMISE = eINSTANCE.getAgent_Demise();

		/**
		 * The meta object literal for the '<em><b>Data agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__DATA_AGENT = eINSTANCE.getAgent_Data_agent();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ROL = eINSTANCE.getAgent_Rol();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PROTOCOL = eINSTANCE.getAgent_Protocol();

		/**
		 * The meta object literal for the '<em><b>Message agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__MESSAGE_AGENT = eINSTANCE.getAgent_Message_agent();

		/**
		 * The meta object literal for the '<em><b>Action agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ACTION_AGENT = eINSTANCE.getAgent_Action_agent();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__MODEL = eINSTANCE.getAgent_Model();

		/**
		 * The meta object literal for the '<em><b>Percept agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PERCEPT_AGENT = eINSTANCE.getAgent_Percept_agent();

		/**
		 * The meta object literal for the '<em><b>Capability agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__CAPABILITY_AGENT = eINSTANCE.getAgent_Capability_agent();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.MessageImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__PURPOSE = eINSTANCE.getMessage_Purpose();

		/**
		 * The meta object literal for the '<em><b>Carried information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CARRIED_INFORMATION = eINSTANCE.getMessage_Carried_information();

		/**
		 * The meta object literal for the '<em><b>External path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__EXTERNAL_PATH = eINSTANCE.getMessage_External_path();

		/**
		 * The meta object literal for the '<em><b>External to system</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__EXTERNAL_TO_SYSTEM = eINSTANCE.getMessage_External_to_system();

		/**
		 * The meta object literal for the '<em><b>Agent message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__AGENT_MESSAGE = eINSTANCE.getMessage_Agent_message();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__CAPABILITY = eINSTANCE.getMessage_Capability();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ProtocolImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__AGENT = eINSTANCE.getProtocol_Agent();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.Enum_Types <em>Enum Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.Enum_Types
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Types()
		 * @generated
		 */
		EEnum ENUM_TYPES = eINSTANCE.getEnum_Types();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.Enum_Visibility <em>Enum Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.Enum_Visibility
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Visibility()
		 * @generated
		 */
		EEnum ENUM_VISIBILITY = eINSTANCE.getEnum_Visibility();

		/**
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.Enum_Type_Step <em>Enum Type Step</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.Enum_Type_Step
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Type_Step()
		 * @generated
		 */
		EEnum ENUM_TYPE_STEP = eINSTANCE.getEnum_Type_Step();

	}

} //Prometheus_metamodel_system_specificationPackage
