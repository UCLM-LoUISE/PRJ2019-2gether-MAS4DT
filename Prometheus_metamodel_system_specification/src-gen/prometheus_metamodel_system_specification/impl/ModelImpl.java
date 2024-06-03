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
import prometheus_metamodel_system_specification.Actor;
import prometheus_metamodel_system_specification.Context;
import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Functionality;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Goal_Relationship;
import prometheus_metamodel_system_specification.Logical_Object;
import prometheus_metamodel_system_specification.Model;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Rol;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getPercepts <em>Percepts</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getPhysical_objects <em>Physical objects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getLogical_objects <em>Logical objects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getGoal_relationships <em>Goal relationships</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getData <em>Data</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ModelImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getPercepts() <em>Percepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Percept> percepts;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * The cached value of the '{@link #getPhysical_objects() <em>Physical objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_objects()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_objects;

	/**
	 * The cached value of the '{@link #getLogical_objects() <em>Logical objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_objects()
	 * @generated
	 * @ordered
	 */
	protected EList<Logical_Object> logical_objects;

	/**
	 * The cached value of the '{@link #getFunctionalities() <em>Functionalities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalities()
	 * @generated
	 * @ordered
	 */
	protected EList<Functionality> functionalities;

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
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> roles;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

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
	public EList<Percept> getPercepts() {
		if (percepts == null) {
			percepts = new EObjectContainmentEList<Percept>(Percept.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPTS);
		}
		return percepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_objects() {
		if (physical_objects == null) {
			physical_objects = new EObjectContainmentEList<Physical_Object>(Physical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECTS);
		}
		return physical_objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Logical_Object> getLogical_objects() {
		if (logical_objects == null) {
			logical_objects = new EObjectContainmentEList<Logical_Object>(Logical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECTS);
		}
		return logical_objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Functionality> getFunctionalities() {
		if (functionalities == null) {
			functionalities = new EObjectContainmentEList<Functionality>(Functionality.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITIES);
		}
		return functionalities;
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
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Rol>(Rol.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS);
		}
		return scenarios;
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
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPTS:
			return ((InternalEList<?>) getPercepts()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXTS:
			return ((InternalEList<?>) getContexts()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECTS:
			return ((InternalEList<?>) getPhysical_objects()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECTS:
			return ((InternalEList<?>) getLogical_objects()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITIES:
			return ((InternalEList<?>) getFunctionalities()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return ((InternalEList<?>) getGoals()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			return ((InternalEList<?>) getGoal_relationships()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTORS:
			return ((InternalEList<?>) getActors()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS:
			return ((InternalEList<?>) getScenarios()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPTS:
			return getPercepts();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTIONS:
			return getActions();
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXTS:
			return getContexts();
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECTS:
			return getPhysical_objects();
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECTS:
			return getLogical_objects();
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITIES:
			return getFunctionalities();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return getGoals();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			return getGoal_relationships();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTORS:
			return getActors();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ROLES:
			return getRoles();
		case Prometheus_metamodel_system_specificationPackage.MODEL__DATA:
			return getData();
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS:
			return getScenarios();
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
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPTS:
			getPercepts().clear();
			getPercepts().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXTS:
			getContexts().clear();
			getContexts().addAll((Collection<? extends Context>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECTS:
			getPhysical_objects().clear();
			getPhysical_objects().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECTS:
			getLogical_objects().clear();
			getLogical_objects().addAll((Collection<? extends Logical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITIES:
			getFunctionalities().clear();
			getFunctionalities().addAll((Collection<? extends Functionality>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			getGoals().clear();
			getGoals().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			getGoal_relationships().clear();
			getGoal_relationships().addAll((Collection<? extends Goal_Relationship>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTORS:
			getActors().clear();
			getActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Rol>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS:
			getScenarios().clear();
			getScenarios().addAll((Collection<? extends Scenario>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPTS:
			getPercepts().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTIONS:
			getActions().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXTS:
			getContexts().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECTS:
			getPhysical_objects().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECTS:
			getLogical_objects().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITIES:
			getFunctionalities().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			getGoals().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			getGoal_relationships().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTORS:
			getActors().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__ROLES:
			getRoles().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__DATA:
			getData().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS:
			getScenarios().clear();
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
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPTS:
			return percepts != null && !percepts.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTIONS:
			return actions != null && !actions.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXTS:
			return contexts != null && !contexts.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECTS:
			return physical_objects != null && !physical_objects.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECTS:
			return logical_objects != null && !logical_objects.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITIES:
			return functionalities != null && !functionalities.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOALS:
			return goals != null && !goals.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIPS:
			return goal_relationships != null && !goal_relationships.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTORS:
			return actors != null && !actors.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__ROLES:
			return roles != null && !roles.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__DATA:
			return data != null && !data.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS:
			return scenarios != null && !scenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
