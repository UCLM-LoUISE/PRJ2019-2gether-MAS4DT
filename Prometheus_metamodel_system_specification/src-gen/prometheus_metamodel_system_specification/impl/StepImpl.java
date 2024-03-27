/**
 */
package prometheus_metamodel_system_specification.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Enum_Type_Step;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
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
	public Goal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject) goal;
			goal = (Goal) eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.STEP__GOAL, oldGoal, goal));
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
					Prometheus_metamodel_system_specificationPackage.STEP__GOAL, oldGoal, newGoal);
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
					Prometheus_metamodel_system_specificationPackage.STEP__GOAL, newGoal, newGoal));
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
							Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT, oldPercept, percept));
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
					Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT, oldPercept, newPercept);
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
					Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT, newPercept, newPercept));
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
							Prometheus_metamodel_system_specificationPackage.STEP__ACTION, oldAction, action));
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
					Prometheus_metamodel_system_specificationPackage.STEP__ACTION, oldAction, newAction);
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
					Prometheus_metamodel_system_specificationPackage.STEP__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			if (goal != null)
				msgs = ((InternalEObject) goal).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__STEP, Goal.class, msgs);
			return basicSetGoal((Goal) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			if (percept != null)
				msgs = ((InternalEObject) percept).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP, Percept.class, msgs);
			return basicSetPercept((Percept) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.ACTION__STEP, Action.class, msgs);
			return basicSetAction((Action) otherEnd, msgs);
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
			return basicSetGoal(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			return basicSetPercept(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			return basicSetAction(null, msgs);
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
			if (resolve)
				return getGoal();
			return basicGetGoal();
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			if (resolve)
				return getPercept();
			return basicGetPercept();
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.STEP__TYPE_STEP:
			setType_step((Enum_Type_Step) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__GOAL:
			setGoal((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			setPercept((Percept) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			setAction((Action) newValue);
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
			setGoal((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			setPercept((Percept) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			setAction((Action) null);
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
			return goal != null;
		case Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT:
			return percept != null;
		case Prometheus_metamodel_system_specificationPackage.STEP__ACTION:
			return action != null;
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
