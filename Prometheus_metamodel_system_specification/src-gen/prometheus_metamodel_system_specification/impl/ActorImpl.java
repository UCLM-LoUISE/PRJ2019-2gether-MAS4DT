/**
 */
package prometheus_metamodel_system_specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Actor;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActorImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActorImpl#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActorImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActorImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends EntityImpl implements Actor {
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
	 * The cached value of the '{@link #getPhysical_object() <em>Physical object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_object()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_object;

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
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectResolvingEList<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTOR__ACTION);
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
			percept = new EObjectResolvingEList<Percept>(Percept.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTOR__PERCEPT);
		}
		return percept;
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
					this, Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__ACTOR);
		}
		return physical_object;
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
					Prometheus_metamodel_system_specificationPackage.ACTOR__SCENARIO);
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
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical_object()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT:
			return ((InternalEList<?>) getPhysical_object()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ACTOR__ACTION:
			return getAction();
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PERCEPT:
			return getPercept();
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.ACTOR__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.ACTOR__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTOR__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.ACTOR__ACTION:
			getAction().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PERCEPT:
			getPercept().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTOR__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.ACTOR__ACTION:
			return action != null && !action.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PERCEPT:
			return percept != null && !percept.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTOR__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTOR__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
