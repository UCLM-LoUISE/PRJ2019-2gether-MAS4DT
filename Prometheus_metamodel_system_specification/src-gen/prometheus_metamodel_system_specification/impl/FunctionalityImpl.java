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
import prometheus_metamodel_system_specification.Functionality;
import prometheus_metamodel_system_specification.Logical_Object;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.FunctionalityImpl#getLogical_object <em>Logical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.FunctionalityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.FunctionalityImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.FunctionalityImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalityImpl extends EntityImpl implements Functionality {
	/**
	 * The cached value of the '{@link #getLogical_object() <em>Logical object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_object()
	 * @generated
	 * @ordered
	 */
	protected EList<Logical_Object> logical_object;

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
	protected FunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Logical_Object> getLogical_object() {
		if (logical_object == null) {
			logical_object = new EObjectWithInverseResolvingEList.ManyInverse<Logical_Object>(Logical_Object.class,
					this, Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT,
					Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__FUNCTIONALITY);
		}
		return logical_object;
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
					Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION,
					Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY);
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
					Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY);
		}
		return percept;
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
					Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__FUNCTIONALITY);
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
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLogical_object()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPercept()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT:
			return ((InternalEList<?>) getLogical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT:
			return ((InternalEList<?>) getPercept()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT:
			return getLogical_object();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION:
			return getAction();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT:
			return getPercept();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT:
			getLogical_object().clear();
			getLogical_object().addAll((Collection<? extends Logical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT:
			getLogical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION:
			getAction().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT:
			getPercept().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__LOGICAL_OBJECT:
			return logical_object != null && !logical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION:
			return action != null && !action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT:
			return percept != null && !percept.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalityImpl
