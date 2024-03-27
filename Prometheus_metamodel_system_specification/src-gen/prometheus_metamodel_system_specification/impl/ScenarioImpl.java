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
import prometheus_metamodel_system_specification.Enum_Type_Step;
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
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getType_step <em>Type step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getContext <em>Context</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getVariation <em>Variation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends EntityImpl implements Scenario {
	/**
	 * The default value of the '{@link #getType_step() <em>Type step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_step()
	 * @generated
	 * @ordered
	 */
	protected static final Enum_Type_Step TYPE_STEP_EDEFAULT = Enum_Type_Step.ACTION;

	/**
	 * The cached value of the '{@link #getType_step() <em>Type step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_step()
	 * @generated
	 * @ordered
	 */
	protected Enum_Type_Step type_step = TYPE_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal;

	/**
	 * The cached value of the '{@link #getPercept() <em>Percept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercept()
	 * @generated
	 * @ordered
	 */
	protected Percept percept;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

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
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

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
	public Enum_Type_Step getType_step() {
		return type_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_step(Enum_Type_Step newType_step) {
		Enum_Type_Step oldType_step = type_step;
		type_step = newType_step == null ? TYPE_STEP_EDEFAULT : newType_step;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP, oldType_step, type_step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject) goal;
			goal = (Goal) eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		Goal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL, oldGoal, newGoal);
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
	public void setGoal(Goal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject) goal).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__STEP, Goal.class, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject) newGoal).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__STEP, Goal.class, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Percept getPercept() {
		if (percept != null && percept.eIsProxy()) {
			InternalEObject oldPercept = (InternalEObject) percept;
			percept = (Percept) eResolveProxy(oldPercept);
			if (percept != oldPercept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT, oldPercept, percept));
			}
		}
		return percept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Percept basicGetPercept() {
		return percept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercept(Percept newPercept, NotificationChain msgs) {
		Percept oldPercept = percept;
		percept = newPercept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT, oldPercept, newPercept);
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
	public void setPercept(Percept newPercept) {
		if (newPercept != percept) {
			NotificationChain msgs = null;
			if (percept != null)
				msgs = ((InternalEObject) percept).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP, Percept.class, msgs);
			if (newPercept != null)
				msgs = ((InternalEObject) newPercept).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP, Percept.class, msgs);
			msgs = basicSetPercept(newPercept, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT, newPercept, newPercept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Action) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION, oldAction, newAction);
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
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.ACTION__STEP, Action.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject) newAction).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.ACTION__STEP, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION, newAction, newAction));
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
	@Override
	public Scenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject) scenario;
			scenario = (Scenario) eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO, oldScenario,
							scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScenario(Scenario newScenario) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO, oldScenario, scenario));
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
			if (goal != null)
				msgs = ((InternalEObject) goal).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__STEP, Goal.class, msgs);
			return basicSetGoal((Goal) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			if (percept != null)
				msgs = ((InternalEObject) percept).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP, Percept.class, msgs);
			return basicSetPercept((Percept) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.ACTION__STEP, Action.class, msgs);
			return basicSetAction((Action) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical_object()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.CONTEXT__SCENARIO, Context.class, msgs);
			return basicSetContext((Context) otherEnd, msgs);
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
			return basicSetGoal(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			return basicSetPercept(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			return basicSetAction(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return ((InternalEList<?>) getPhysical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			return basicSetContext(null, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP:
			return getType_step();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			if (resolve)
				return getGoal();
			return basicGetGoal();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			if (resolve)
				return getPercept();
			return basicGetPercept();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			if (resolve)
				return getScenario();
			return basicGetScenario();
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP:
			setType_step((Enum_Type_Step) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			setGoal((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			setPercept((Percept) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			setAction((Action) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			setContext((Context) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			setScenario((Scenario) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP:
			setType_step(TYPE_STEP_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			setGoal((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			setPercept((Percept) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			setAction((Action) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			setContext((Context) null);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			setScenario((Scenario) null);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP:
			return type_step != TYPE_STEP_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
			return goal != null;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
			return percept != null;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
			return action != null;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			return context != null;
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			return scenario != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
			case Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP:
				return Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP;
			case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL:
				return Prometheus_metamodel_system_specificationPackage.STEP__GOAL;
			case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT:
				return Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT;
			case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION:
				return Prometheus_metamodel_system_specificationPackage.STEP__ACTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
			case Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP:
				return Prometheus_metamodel_system_specificationPackage.SCENARIO__TYPE_STEP;
			case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
				return Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL;
			case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
				return Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT;
			case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
				return Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (type_step: ");
		result.append(type_step);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", variation: ");
		result.append(variation);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
