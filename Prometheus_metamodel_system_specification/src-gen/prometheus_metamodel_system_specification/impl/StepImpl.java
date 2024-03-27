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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Enum_Type_Step;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.StepImpl#getType_step <em>Type step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.StepImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.StepImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.StepImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.StepImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends EntityImpl implements Step {
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
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.STEP;
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
					Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP, oldType_step, type_step));
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
					Prometheus_metamodel_system_specificationPackage.STEP__GOAL,
					Prometheus_metamodel_system_specificationPackage.GOAL__STEP);
		}
		return goal;
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
					Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP);
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
			action = new EObjectWithInverseResolvingEList.ManyInverse<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.STEP__ACTION,
					Prometheus_metamodel_system_specificationPackage.ACTION__STEP);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__STEP);
		}
		return scenario;
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
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoal()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPercept()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenario()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			return ((InternalEList<?>) getGoal()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			return ((InternalEList<?>) getPercept()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP:
			return getType_step();
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			return getGoal();
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			return getPercept();
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			return getAction();
		case Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO:
			return getScenario();
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
		case Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP:
			setType_step((Enum_Type_Step) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			getGoal().clear();
			getGoal().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP:
			setType_step(TYPE_STEP_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			getGoal().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			getPercept().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			getAction().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO:
			getScenario().clear();
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
		case Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP:
			return type_step != TYPE_STEP_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			return goal != null && !goal.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			return percept != null && !percept.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			return action != null && !action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.STEP__SCENARIO:
			return scenario != null && !scenario.isEmpty();
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
		result.append(" (type_step: ");
		result.append(type_step);
		result.append(')');
		return result.toString();
	}

} //StepImpl
