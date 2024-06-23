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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Context;
import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Model;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Rol;
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
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getContext <em>Context</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getVariation <em>Variation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getGoals_scenario <em>Goals scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getPercept_scenario <em>Percept scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getModel_scenario <em>Model scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getAction_scenario <em>Action scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getData_scenario <em>Data scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ScenarioImpl#getRol_scenario <em>Rol scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends EntityImpl implements Scenario {
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
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

	/**
	 * The cached value of the '{@link #getGoals_scenario() <em>Goals scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_scenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals_scenario;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPercept_scenario() <em>Percept scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercept_scenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Percept> percept_scenario;

	/**
	 * The cached value of the '{@link #getAction_scenario() <em>Action scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_scenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action_scenario;

	/**
	 * The cached value of the '{@link #getData_scenario() <em>Data scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_scenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data_scenario;

	/**
	 * The cached value of the '{@link #getRol_scenario() <em>Rol scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol_scenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol_scenario;

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
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY, oldPriority, priority));
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
					Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP,
					Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectResolvingEList<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Percept> getPercept_scenario() {
		if (percept_scenario == null) {
			percept_scenario = new EObjectWithInverseResolvingEList.ManyInverse<Percept>(Percept.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT);
		}
		return percept_scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel_scenario() {
		if (eContainerFeatureID() != Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO)
			return null;
		return (Model) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel_scenario(Model newModel_scenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModel_scenario,
				Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel_scenario(Model newModel_scenario) {
		if (newModel_scenario != eInternalContainer()
				|| (eContainerFeatureID() != Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO
						&& newModel_scenario != null)) {
			if (EcoreUtil.isAncestor(this, newModel_scenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel_scenario != null)
				msgs = ((InternalEObject) newModel_scenario).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS, Model.class, msgs);
			msgs = basicSetModel_scenario(newModel_scenario, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO, newModel_scenario,
					newModel_scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction_scenario() {
		if (action_scenario == null) {
			action_scenario = new EObjectWithInverseResolvingEList.ManyInverse<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO,
					Prometheus_metamodel_system_specificationPackage.ACTION__SCENARIO_ACTION);
		}
		return action_scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRol_scenario() {
		if (rol_scenario == null) {
			rol_scenario = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO,
					Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL);
		}
		return rol_scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData_scenario() {
		if (data_scenario == null) {
			data_scenario = new EObjectWithInverseResolvingEList.ManyInverse<Data>(Data.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO,
					Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA);
		}
		return data_scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getGoals_scenario() {
		if (goals_scenario == null) {
			goals_scenario = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO,
					Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO_GOALS);
		}
		return goals_scenario;
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical_object()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.CONTEXT__SCENARIO, Context.class, msgs);
			return basicSetContext((Context) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStep()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoals_scenario()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPercept_scenario()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModel_scenario((Model) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction_scenario()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData_scenario()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRol_scenario()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return ((InternalEList<?>) getPhysical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			return basicSetContext(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO:
			return ((InternalEList<?>) getGoals_scenario()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO:
			return ((InternalEList<?>) getPercept_scenario()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			return basicSetModel_scenario(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO:
			return ((InternalEList<?>) getAction_scenario()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO:
			return ((InternalEList<?>) getData_scenario()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO:
			return ((InternalEList<?>) getRol_scenario()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			return eInternalContainer().eInverseRemove(this,
					Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIOS, Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			return getSteps();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
			return getTrigger();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
			return getVariation();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP:
			return getStep();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			return getScenario();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO:
			return getGoals_scenario();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			return getPriority();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO:
			return getPercept_scenario();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			return getModel_scenario();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO:
			return getAction_scenario();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO:
			return getData_scenario();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO:
			return getRol_scenario();
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			setContext((Context) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO:
			getGoals_scenario().clear();
			getGoals_scenario().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			setPriority((Integer) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO:
			getPercept_scenario().clear();
			getPercept_scenario().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			setModel_scenario((Model) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO:
			getAction_scenario().clear();
			getAction_scenario().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO:
			getData_scenario().clear();
			getData_scenario().addAll((Collection<? extends Data>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO:
			getRol_scenario().clear();
			getRol_scenario().addAll((Collection<? extends Rol>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			setContext((Context) null);
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP:
			getStep().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			getScenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO:
			getGoals_scenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO:
			getPercept_scenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			setModel_scenario((Model) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO:
			getAction_scenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO:
			getData_scenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO:
			getRol_scenario().clear();
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
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__CONTEXT:
			return context != null;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
			return steps != null && !steps.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
			return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
			return VARIATION_EDEFAULT == null ? variation != null : !VARIATION_EDEFAULT.equals(variation);
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP:
			return step != null && !step.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__GOALS_SCENARIO:
			return goals_scenario != null && !goals_scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO:
			return percept_scenario != null && !percept_scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__MODEL_SCENARIO:
			return getModel_scenario() != null;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ACTION_SCENARIO:
			return action_scenario != null && !action_scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO:
			return data_scenario != null && !data_scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO:
			return rol_scenario != null && !rol_scenario.isEmpty();
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
