/**
 */
package prometheus_metamodel_system_specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Context;
import prometheus_metamodel_system_specification.Functionality;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Goal_Relationship;
import prometheus_metamodel_system_specification.Logical_Object;
import prometheus_metamodel_system_specification.Model;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getContext <em>Context</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getLogical_object <em>Logical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getGoal_relationships <em>Goal relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getPercept() <em>Percept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercept()
	 * @generated
	 * @ordered
	 */
	protected EList<Percept> percept;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> context;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

	/**
	 * The cached value of the '{@link #getPhysical_object() <em>Physical object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_object()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_object;

	/**
	 * The cached value of the '{@link #getLogical_object() <em>Logical object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_object()
	 * @generated
	 * @ordered
	 */
	protected EList<Logical_Object> logical_object;

	/**
	 * The cached value of the '{@link #getFunctionality() <em>Functionality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionality()
	 * @generated
	 * @ordered
	 */
	protected EList<Functionality> functionality;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getGoal_relationships() <em>Goal relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal_Relationship> goal_relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Percept> getPercept() {
		if (percept == null) {
			percept = new EObjectContainmentEList<Percept>(Percept.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT);
		}
		return percept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<Context>(Context.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_object() {
		if (physical_object == null) {
			physical_object = new EObjectContainmentEList<Physical_Object>(Physical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT);
		}
		return physical_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Logical_Object> getLogical_object() {
		if (logical_object == null) {
			logical_object = new EObjectContainmentEList<Logical_Object>(Logical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT);
		}
		return logical_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Functionality> getFunctionality() {
		if (functionality == null) {
			functionality = new EObjectContainmentEList<Functionality>(Functionality.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY);
		}
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentWithInverseEList<Goal>(Goal.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__GOALS,
					Prometheus_metamodel_system_specificationPackage.GOAL__MODEL);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal_Relationship> getGoal_relationships() {
		if (goal_relationships == null) {
			goal_relationships = new EObjectContainmentEList<Goal_Relationship>(Goal_Relationship.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS);
		}
		return goal_relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoals()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT:
			return ((InternalEList<?>) getPercept()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT:
			return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT:
			return ((InternalEList<?>) getPhysical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT:
			return ((InternalEList<?>) getLogical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY:
			return ((InternalEList<?>) getFunctionality()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return ((InternalEList<?>) getGoals()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			return ((InternalEList<?>) getGoal_relationships()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT:
			return getPercept();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTION:
			return getAction();
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT:
			return getContext();
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO:
			return getScenario();
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT:
			return getLogical_object();
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY:
			return getFunctionality();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return getGoals();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			return getGoal_relationships();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT:
			getContext().clear();
			getContext().addAll((Collection<? extends Context>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT:
			getLogical_object().clear();
			getLogical_object().addAll((Collection<? extends Logical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY:
			getFunctionality().clear();
			getFunctionality().addAll((Collection<? extends Functionality>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			getGoals().clear();
			getGoals().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			getGoal_relationships().clear();
			getGoal_relationships().addAll((Collection<? extends Goal_Relationship>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT:
			getPercept().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTION:
			getAction().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT:
			getContext().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO:
			getScenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT:
			getLogical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY:
			getFunctionality().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			getGoals().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			getGoal_relationships().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT:
			return percept != null && !percept.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTION:
			return action != null && !action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT:
			return context != null && !context.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT:
			return logical_object != null && !logical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY:
			return functionality != null && !functionality.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return goals != null && !goals.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			return goal_relationships != null && !goal_relationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
