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
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCENARIOS = 3;

	/**
	 * The feature id for the '<em><b>Physical objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PHYSICAL_OBJECTS = 4;

	/**
	 * The feature id for the '<em><b>Logical objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LOGICAL_OBJECTS = 5;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FUNCTIONALITIES = 6;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GOALS = 7;

	/**
	 * The feature id for the '<em><b>Goal relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GOAL_RELATIONSHIPS = 8;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Goal relationship from</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_RELATIONSHIP_FROM = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal relationship to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_RELATIONSHIP_TO = ENTITY_FEATURE_COUNT + 1;

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
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FUNCTIONALITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DURATION = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FAILURE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partial change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARTIAL_CHANGE = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Side effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SIDE_EFFECTS = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STEP = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__FUNCTIONALITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Information carried</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__INFORMATION_CARRIED = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Knowledge updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__KNOWLEDGE_UPDATED = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__SOURCE = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__PROCESSING = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Expected frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__EXPECTED_FREQUENCY = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__EXTERNAL_TO_SYSTEM = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>External path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__EXTERNAL_PATH = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT__STEP = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Percept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>Type of relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Goal from</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__GOAL_FROM = 1;

	/**
	 * The feature id for the '<em><b>Goal to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP__GOAL_TO = 2;

	/**
	 * The number of structural features of the '<em>Goal Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_RELATIONSHIP_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Physical object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__PHYSICAL_OBJECT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__LOGICAL_OBJECT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__FUNCTIONALITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OBJECT__PHYSICAL_OBJECT = ENTITY_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__FUNCTIONALITY = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEPS = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TRIGGER = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VARIATION = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PRIORITY = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEP = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.impl.FunctionalityImpl
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__ATTRIBUTE = ENTITY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__DESCRIPTION = ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Logical object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__LOGICAL_OBJECT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__ACTION = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__PERCEPT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__SCENARIO = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Type_of_Relationship <em>Enum Type of Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Type_of_Relationship
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Type_of_Relationship()
	 * @generated
	 */
	int ENUM_TYPE_OF_RELATIONSHIP = 13;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Types <em>Enum Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Types
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Types()
	 * @generated
	 */
	int ENUM_TYPES = 14;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Visibility <em>Enum Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Visibility
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Visibility()
	 * @generated
	 */
	int ENUM_VISIBILITY = 15;

	/**
	 * The meta object id for the '{@link prometheus_metamodel_system_specification.Enum_Type_Step <em>Enum Type Step</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prometheus_metamodel_system_specification.Enum_Type_Step
	 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Type_Step()
	 * @generated
	 */
	int ENUM_TYPE_STEP = 16;

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
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Model#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalities</em>'.
	 * @see prometheus_metamodel_system_specification.Model#getFunctionalities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Functionalities();

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
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from <em>Goal relationship from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal relationship from</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_from()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal_relationship_from();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to <em>Goal relationship to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal relationship to</em>'.
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_to()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Goal_relationship_to();

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
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Action#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see prometheus_metamodel_system_specification.Action#getFunctionality()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Functionality();

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
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Percept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Percept
	 * @generated
	 */
	EClass getPercept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Percept#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see prometheus_metamodel_system_specification.Percept#getFunctionality()
	 * @see #getPercept()
	 * @generated
	 */
	EReference getPercept_Functionality();

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
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Goal_Relationship <em>Goal Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Relationship</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship
	 * @generated
	 */
	EClass getGoal_Relationship();

	/**
	 * Returns the meta object for the attribute '{@link prometheus_metamodel_system_specification.Goal_Relationship#getType_of_relationship <em>Type of relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type of relationship</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getType_of_relationship()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EAttribute getGoal_Relationship_Type_of_relationship();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from <em>Goal from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal from</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EReference getGoal_Relationship_Goal_from();

	/**
	 * Returns the meta object for the reference '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to <em>Goal to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal to</em>'.
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to()
	 * @see #getGoal_Relationship()
	 * @generated
	 */
	EReference getGoal_Relationship_Goal_to();

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
	 * Returns the meta object for the containment reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical object</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getPhysical_object()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Physical_object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object <em>Logical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical object</em>'.
	 * @see prometheus_metamodel_system_specification.Physical_Object#getLogical_object()
	 * @see #getPhysical_Object()
	 * @generated
	 */
	EReference getPhysical_Object_Logical_object();

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
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical object</em>'.
	 * @see prometheus_metamodel_system_specification.Logical_Object#getPhysical_object()
	 * @see #getLogical_Object()
	 * @generated
	 */
	EReference getLogical_Object_Physical_object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Logical_Object#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see prometheus_metamodel_system_specification.Logical_Object#getFunctionality()
	 * @see #getLogical_Object()
	 * @generated
	 */
	EReference getLogical_Object_Functionality();

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
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Scenario#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionality</em>'.
	 * @see prometheus_metamodel_system_specification.Scenario#getFunctionality()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Functionality();

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
	 * Returns the meta object for the attribute list '{@link prometheus_metamodel_system_specification.Scenario#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Priority</em>'.
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
	 * Returns the meta object for class '{@link prometheus_metamodel_system_specification.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see prometheus_metamodel_system_specification.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Functionality#getLogical_object <em>Logical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical object</em>'.
	 * @see prometheus_metamodel_system_specification.Functionality#getLogical_object()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Logical_object();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Functionality#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see prometheus_metamodel_system_specification.Functionality#getAction()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Action();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Functionality#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Percept</em>'.
	 * @see prometheus_metamodel_system_specification.Functionality#getPercept()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Percept();

	/**
	 * Returns the meta object for the reference list '{@link prometheus_metamodel_system_specification.Functionality#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see prometheus_metamodel_system_specification.Functionality#getScenario()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Scenario();

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
	 * Returns the meta object for enum '{@link prometheus_metamodel_system_specification.Enum_Type_of_Relationship <em>Enum Type of Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type of Relationship</em>'.
	 * @see prometheus_metamodel_system_specification.Enum_Type_of_Relationship
	 * @generated
	 */
	EEnum getEnum_Type_of_Relationship();

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
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCENARIOS = eINSTANCE.getModel_Scenarios();

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
		 * The meta object literal for the '<em><b>Functionalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FUNCTIONALITIES = eINSTANCE.getModel_Functionalities();

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
		 * The meta object literal for the '<em><b>Goal relationship from</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_RELATIONSHIP_FROM = eINSTANCE.getGoal_Goal_relationship_from();

		/**
		 * The meta object literal for the '<em><b>Goal relationship to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_RELATIONSHIP_TO = eINSTANCE.getGoal_Goal_relationship_to();

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
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.ActionImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__FUNCTIONALITY = eINSTANCE.getAction_Functionality();

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
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.PerceptImpl <em>Percept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.PerceptImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getPercept()
		 * @generated
		 */
		EClass PERCEPT = eINSTANCE.getPercept();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCEPT__FUNCTIONALITY = eINSTANCE.getPercept_Functionality();

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
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl <em>Goal Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getGoal_Relationship()
		 * @generated
		 */
		EClass GOAL_RELATIONSHIP = eINSTANCE.getGoal_Relationship();

		/**
		 * The meta object literal for the '<em><b>Type of relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP = eINSTANCE.getGoal_Relationship_Type_of_relationship();

		/**
		 * The meta object literal for the '<em><b>Goal from</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_RELATIONSHIP__GOAL_FROM = eINSTANCE.getGoal_Relationship_Goal_from();

		/**
		 * The meta object literal for the '<em><b>Goal to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_RELATIONSHIP__GOAL_TO = eINSTANCE.getGoal_Relationship_Goal_to();

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
		 * The meta object literal for the '<em><b>Physical object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__PHYSICAL_OBJECT = eINSTANCE.getPhysical_Object_Physical_object();

		/**
		 * The meta object literal for the '<em><b>Logical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_OBJECT__LOGICAL_OBJECT = eINSTANCE.getPhysical_Object_Logical_object();

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
		 * The meta object literal for the '<em><b>Physical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OBJECT__PHYSICAL_OBJECT = eINSTANCE.getLogical_Object_Physical_object();

		/**
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OBJECT__FUNCTIONALITY = eINSTANCE.getLogical_Object_Functionality();

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
		 * The meta object literal for the '<em><b>Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__FUNCTIONALITY = eINSTANCE.getScenario_Functionality();

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
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute list feature.
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
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.impl.FunctionalityImpl
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();

		/**
		 * The meta object literal for the '<em><b>Logical object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__LOGICAL_OBJECT = eINSTANCE.getFunctionality_Logical_object();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__ACTION = eINSTANCE.getFunctionality_Action();

		/**
		 * The meta object literal for the '<em><b>Percept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__PERCEPT = eINSTANCE.getFunctionality_Percept();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__SCENARIO = eINSTANCE.getFunctionality_Scenario();

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
		 * The meta object literal for the '{@link prometheus_metamodel_system_specification.Enum_Type_of_Relationship <em>Enum Type of Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prometheus_metamodel_system_specification.Enum_Type_of_Relationship
		 * @see prometheus_metamodel_system_specification.impl.Prometheus_metamodel_system_specificationPackageImpl#getEnum_Type_of_Relationship()
		 * @generated
		 */
		EEnum ENUM_TYPE_OF_RELATIONSHIP = eINSTANCE.getEnum_Type_of_Relationship();

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
