/**
 */
package prometheus_metamodel_system_specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Actor;
import prometheus_metamodel_system_specification.Agent;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Rol;
import prometheus_metamodel_system_specification.Scenario;
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getPartial_change <em>Partial change</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getSide_effects <em>Side effects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getScenario_action <em>Scenario action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getAgent_action <em>Agent action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends EntityImpl implements Action {
	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected String failure = FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartial_change() <em>Partial change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartial_change()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTIAL_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartial_change() <em>Partial change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartial_change()
	 * @generated
	 * @ordered
	 */
	protected String partial_change = PARTIAL_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSide_effects() <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_effects()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EFFECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSide_effects() <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_effects()
	 * @generated
	 * @ordered
	 */
	protected String side_effects = SIDE_EFFECTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getPhysical_object() <em>Physical object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_object()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_object;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol;

	/**
	 * The cached value of the '{@link #getScenario_action() <em>Scenario action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_action()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario_action;

	/**
	 * The cached value of the '{@link #getAgent_action() <em>Agent action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent_action()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent_action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailure(String newFailure) {
		String oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartial_change() {
		return partial_change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartial_change(String newPartial_change) {
		String oldPartial_change = partial_change;
		partial_change = newPartial_change;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE, oldPartial_change,
					partial_change));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSide_effects() {
		return side_effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSide_effects(String newSide_effects) {
		String oldSide_effects = side_effects;
		side_effects = newSide_effects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS, oldSide_effects,
					side_effects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectWithInverseResolvingEList.ManyInverse<Step>(Step.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__STEP,
					Prometheus_metamodel_system_specificationPackage.STEP__ACTION);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectResolvingEList<Actor>(Actor.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_object() {
		if (physical_object == null) {
			physical_object = new EObjectResolvingEList<Physical_Object>(Physical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__PHYSICAL_OBJECT);
		}
		return physical_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRol() {
		if (rol == null) {
			rol = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__ROL,
					Prometheus_metamodel_system_specificationPackage.ROL__ACTION);
		}
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario_action() {
		if (scenario_action == null) {
			scenario_action = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO);
		}
		return scenario_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgent_action() {
		if (agent_action == null) {
			agent_action = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION,
					Prometheus_metamodel_system_specificationPackage.AGENT__ACTION_AGENT);
		}
		return agent_action;
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStep()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__ROL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRol()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenario_action()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAgent_action()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__ROL:
			return ((InternalEList<?>) getRol()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION:
			return ((InternalEList<?>) getScenario_action()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION:
			return ((InternalEList<?>) getAgent_action()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			return getParameters();
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			return getDuration();
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			return getFailure();
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			return getPartial_change();
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			return getSide_effects();
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			return getStep();
		case Prometheus_metamodel_system_specificationPackage.ACTION__ACTOR:
			return getActor();
		case Prometheus_metamodel_system_specificationPackage.ACTION__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.ACTION__ROL:
			return getRol();
		case Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION:
			return getScenario_action();
		case Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION:
			return getAgent_action();
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			setParameters((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			setDuration((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			setFailure((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			setPartial_change((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			setSide_effects((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__ACTOR:
			getActor().clear();
			getActor().addAll((Collection<? extends Actor>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__ROL:
			getRol().clear();
			getRol().addAll((Collection<? extends Rol>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION:
			getScenario_action().clear();
			getScenario_action().addAll((Collection<? extends Scenario>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION:
			getAgent_action().clear();
			getAgent_action().addAll((Collection<? extends Agent>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			setParameters(PARAMETERS_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			setFailure(FAILURE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			setPartial_change(PARTIAL_CHANGE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			setSide_effects(SIDE_EFFECTS_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			getStep().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__ACTOR:
			getActor().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__ROL:
			getRol().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION:
			getScenario_action().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION:
			getAgent_action().clear();
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			return FAILURE_EDEFAULT == null ? failure != null : !FAILURE_EDEFAULT.equals(failure);
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			return PARTIAL_CHANGE_EDEFAULT == null ? partial_change != null
					: !PARTIAL_CHANGE_EDEFAULT.equals(partial_change);
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			return SIDE_EFFECTS_EDEFAULT == null ? side_effects != null : !SIDE_EFFECTS_EDEFAULT.equals(side_effects);
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			return step != null && !step.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTION__ACTOR:
			return actor != null && !actor.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTION__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTION__ROL:
			return rol != null && !rol.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION:
			return scenario_action != null && !scenario_action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTION__AGENT_ACTION:
			return agent_action != null && !agent_action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", duration: ");
		result.append(duration);
		result.append(", failure: ");
		result.append(failure);
		result.append(", partial_change: ");
		result.append(partial_change);
		result.append(", side_effects: ");
		result.append(side_effects);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
