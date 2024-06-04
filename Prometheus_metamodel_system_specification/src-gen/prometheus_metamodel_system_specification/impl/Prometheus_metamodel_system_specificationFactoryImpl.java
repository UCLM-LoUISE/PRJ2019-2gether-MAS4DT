/**
 */
package prometheus_metamodel_system_specification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import prometheus_metamodel_system_specification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Prometheus_metamodel_system_specificationFactoryImpl extends EFactoryImpl
		implements Prometheus_metamodel_system_specificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Prometheus_metamodel_system_specificationFactory init() {
		try {
			Prometheus_metamodel_system_specificationFactory thePrometheus_metamodel_system_specificationFactory = (Prometheus_metamodel_system_specificationFactory) EPackage.Registry.INSTANCE
					.getEFactory(Prometheus_metamodel_system_specificationPackage.eNS_URI);
			if (thePrometheus_metamodel_system_specificationFactory != null) {
				return thePrometheus_metamodel_system_specificationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Prometheus_metamodel_system_specificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prometheus_metamodel_system_specificationFactoryImpl() {
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
		case Prometheus_metamodel_system_specificationPackage.MODEL:
			return createModel();
		case Prometheus_metamodel_system_specificationPackage.CONTEXT:
			return createContext();
		case Prometheus_metamodel_system_specificationPackage.GOAL:
			return createGoal();
		case Prometheus_metamodel_system_specificationPackage.ACTION:
			return createAction();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT:
			return createPercept();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP:
			return createGoal_Relationship();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT:
			return createPhysical_Object();
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT:
			return createLogical_Object();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO:
			return createScenario();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY:
			return createFunctionality();
		case Prometheus_metamodel_system_specificationPackage.ATTRIBUTE:
			return createAttribute();
		case Prometheus_metamodel_system_specificationPackage.STEP:
			return createStep();
		case Prometheus_metamodel_system_specificationPackage.ACTOR:
			return createActor();
		case Prometheus_metamodel_system_specificationPackage.ROL:
			return createRol();
		case Prometheus_metamodel_system_specificationPackage.DATA:
			return createData();
		case Prometheus_metamodel_system_specificationPackage.AGENT:
			return createAgent();
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
		case Prometheus_metamodel_system_specificationPackage.ENUM_TYPES:
			return createEnum_TypesFromString(eDataType, initialValue);
		case Prometheus_metamodel_system_specificationPackage.ENUM_VISIBILITY:
			return createEnum_VisibilityFromString(eDataType, initialValue);
		case Prometheus_metamodel_system_specificationPackage.ENUM_TYPE_STEP:
			return createEnum_Type_StepFromString(eDataType, initialValue);
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
		case Prometheus_metamodel_system_specificationPackage.ENUM_TYPES:
			return convertEnum_TypesToString(eDataType, instanceValue);
		case Prometheus_metamodel_system_specificationPackage.ENUM_VISIBILITY:
			return convertEnum_VisibilityToString(eDataType, instanceValue);
		case Prometheus_metamodel_system_specificationPackage.ENUM_TYPE_STEP:
			return convertEnum_Type_StepToString(eDataType, instanceValue);
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
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Percept createPercept() {
		PerceptImpl percept = new PerceptImpl();
		return percept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal_Relationship createGoal_Relationship() {
		Goal_RelationshipImpl goal_Relationship = new Goal_RelationshipImpl();
		return goal_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Physical_Object createPhysical_Object() {
		Physical_ObjectImpl physical_Object = new Physical_ObjectImpl();
		return physical_Object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Logical_Object createLogical_Object() {
		Logical_ObjectImpl logical_Object = new Logical_ObjectImpl();
		return logical_Object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Functionality createFunctionality() {
		FunctionalityImpl functionality = new FunctionalityImpl();
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enum_Types createEnum_TypesFromString(EDataType eDataType, String initialValue) {
		Enum_Types result = Enum_Types.get(initialValue);
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
	public String convertEnum_TypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enum_Visibility createEnum_VisibilityFromString(EDataType eDataType, String initialValue) {
		Enum_Visibility result = Enum_Visibility.get(initialValue);
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
	public String convertEnum_VisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enum_Type_Step createEnum_Type_StepFromString(EDataType eDataType, String initialValue) {
		Enum_Type_Step result = Enum_Type_Step.get(initialValue);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnum_Type_StepToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prometheus_metamodel_system_specificationPackage getPrometheus_metamodel_system_specificationPackage() {
		return (Prometheus_metamodel_system_specificationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Prometheus_metamodel_system_specificationPackage getPackage() {
		return Prometheus_metamodel_system_specificationPackage.eINSTANCE;
	}

} //Prometheus_metamodel_system_specificationFactoryImpl
