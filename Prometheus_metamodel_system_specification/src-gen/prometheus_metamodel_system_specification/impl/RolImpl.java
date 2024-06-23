/**
 */
package prometheus_metamodel_system_specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Rol;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.RolImpl#getData_rol <em>Data rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.RolImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.RolImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.RolImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.RolImpl#getScenario_rol <em>Scenario rol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolImpl extends EntityImpl implements Rol {
	/**
	 * The cached value of the '{@link #getData_rol() <em>Data rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_rol()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data_rol;

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
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

	/**
	 * The cached value of the '{@link #getScenario_rol() <em>Scenario rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_rol()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario_rol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.ROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData_rol() {
		if (data_rol == null) {
			data_rol = new EObjectWithInverseResolvingEList.ManyInverse<Data>(Data.class, this,
					Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL,
					Prometheus_metamodel_system_specificationPackage.DATA__ROL_DATA);
		}
		return data_rol;
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
					Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL);
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
					Prometheus_metamodel_system_specificationPackage.ROL__ACTION,
					Prometheus_metamodel_system_specificationPackage.ACTION__ROL);
		}
		return action;
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
					Prometheus_metamodel_system_specificationPackage.ROL__GOAL,
					Prometheus_metamodel_system_specificationPackage.GOAL__ROL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario_rol() {
		if (scenario_rol == null) {
			scenario_rol = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__ROL_SCENARIO);
		}
		return scenario_rol;
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
		case Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData_rol()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPercept()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__GOAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoal()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenario_rol()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL:
			return ((InternalEList<?>) getData_rol()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT:
			return ((InternalEList<?>) getPercept()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__GOAL:
			return ((InternalEList<?>) getGoal()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL:
			return ((InternalEList<?>) getScenario_rol()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL:
			return getData_rol();
		case Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT:
			return getPercept();
		case Prometheus_metamodel_system_specificationPackage.ROL__ACTION:
			return getAction();
		case Prometheus_metamodel_system_specificationPackage.ROL__GOAL:
			return getGoal();
		case Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL:
			return getScenario_rol();
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
		case Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL:
			getData_rol().clear();
			getData_rol().addAll((Collection<? extends Data>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__GOAL:
			getGoal().clear();
			getGoal().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL:
			getScenario_rol().clear();
			getScenario_rol().addAll((Collection<? extends Scenario>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL:
			getData_rol().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT:
			getPercept().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__ACTION:
			getAction().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__GOAL:
			getGoal().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL:
			getScenario_rol().clear();
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
		case Prometheus_metamodel_system_specificationPackage.ROL__DATA_ROL:
			return data_rol != null && !data_rol.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT:
			return percept != null && !percept.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ROL__ACTION:
			return action != null && !action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ROL__GOAL:
			return goal != null && !goal.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ROL__SCENARIO_ROL:
			return scenario_rol != null && !scenario_rol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RolImpl
