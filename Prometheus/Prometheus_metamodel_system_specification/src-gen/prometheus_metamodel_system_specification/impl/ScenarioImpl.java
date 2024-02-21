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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Context;
import prometheus_metamodel_system_specification.Functionality;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getContext <em>Context</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getVariation <em>Variation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends EntityImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getPercept() <em>Percept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercept()
	 * @generated
	 * @ordered
	 */
	protected EList<Percept> percept;

	/**
	 * The cached value of the '{@link #getFunctionality() <em>Functionality</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionality()
	 * @generated
	 * @ordered
	 */
	protected EList<Functionality> functionality;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariation() <em>Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariation()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariation() <em>Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariation()
	 * @generated
	 * @ordered
	 */
	protected String variation = VARIATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getGoal() {
		if (goal == null) {
			goal = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL,
					Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_object() {
		if (physical_object == null) {
			physical_object = new EObjectWithInverseResolvingEList.ManyInverse<Physical_Object>(Physical_Object.class,
					this, Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO);
		}
		return physical_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (Context) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT, oldContext, newContext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.CONTEXT__SCENARIO, Context.class, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.CONTEXT__SCENARIO, Context.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectWithInverseResolvingEList.ManyInverse<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION,
					Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Percept> getPercept() {
		if (percept == null) {
			percept = new EObjectWithInverseResolvingEList.ManyInverse<Percept>(Percept.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO);
		}
		return percept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Functionality> getFunctionality() {
		if (functionality == null) {
			functionality = new EObjectWithInverseResolvingEList.ManyInverse<Functionality>(Functionality.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY,
					Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO);
		}
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariation() {
		return variation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariation(String newVariation) {
		String oldVariation = variation;
		variation = newVariation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION, oldVariation, variation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPriority() {
		if (priority == null) {
			priority = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY);
		}
		return priority;
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoal()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical_object()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.CONTEXT__SCENARIO, Context.class, msgs);
			return basicSetContext((Context) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPercept()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunctionality()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			return ((InternalEList<?>) getGoal()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return ((InternalEList<?>) getPhysical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			return basicSetContext(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			return ((InternalEList<?>) getPercept()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY:
			return ((InternalEList<?>) getFunctionality()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			return getGoal();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			return getAction();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			return getPercept();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY:
			return getFunctionality();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			return getSteps();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
			return getTrigger();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
			return getVariation();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			return getPriority();
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			getGoal().clear();
			getGoal().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			setContext((Context) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY:
			getFunctionality().clear();
			getFunctionality().addAll((Collection<? extends Functionality>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
			setTrigger((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
			setVariation((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			getPriority().clear();
			getPriority().addAll((Collection<? extends Integer>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			getGoal().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			setContext((Context) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			getAction().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			getPercept().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY:
			getFunctionality().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			getSteps().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
			setTrigger(TRIGGER_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
			setVariation(VARIATION_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			getPriority().clear();
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			return goal != null && !goal.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			return context != null;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			return action != null && !action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			return percept != null && !percept.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY:
			return functionality != null && !functionality.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			return steps != null && !steps.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
			return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
			return VARIATION_EDEFAULT == null ? variation != null : !VARIATION_EDEFAULT.equals(variation);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			return priority != null && !priority.isEmpty();
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
		result.append(" (trigger: ");
		result.append(trigger);
		result.append(", variation: ");
		result.append(variation);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
