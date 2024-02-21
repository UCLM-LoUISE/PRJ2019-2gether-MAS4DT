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

import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Goal_Relationship;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship <em>Goal relationship</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends EntityImpl implements Goal {
	/**
	 * The cached value of the '{@link #getGoal_relationship() <em>Goal relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship()
	 * @generated
	 * @ordered
	 */
	protected Goal_Relationship goal_relationship;

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
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal_Relationship getGoal_relationship() {
		if (goal_relationship != null && goal_relationship.eIsProxy()) {
			InternalEObject oldGoal_relationship = (InternalEObject) goal_relationship;
			goal_relationship = (Goal_Relationship) eResolveProxy(oldGoal_relationship);
			if (goal_relationship != oldGoal_relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP,
							oldGoal_relationship, goal_relationship));
			}
		}
		return goal_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Relationship basicGetGoal_relationship() {
		return goal_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_relationship(Goal_Relationship newGoal_relationship, NotificationChain msgs) {
		Goal_Relationship oldGoal_relationship = goal_relationship;
		goal_relationship = newGoal_relationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP, oldGoal_relationship,
					newGoal_relationship);
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
	public void setGoal_relationship(Goal_Relationship newGoal_relationship) {
		if (newGoal_relationship != goal_relationship) {
			NotificationChain msgs = null;
			if (goal_relationship != null)
				msgs = ((InternalEObject) goal_relationship).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL,
						Goal_Relationship.class, msgs);
			if (newGoal_relationship != null)
				msgs = ((InternalEObject) newGoal_relationship).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL,
						Goal_Relationship.class, msgs);
			msgs = basicSetGoal_relationship(newGoal_relationship, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP, newGoal_relationship,
					newGoal_relationship));
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
					Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__GOAL);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP:
			if (goal_relationship != null)
				msgs = ((InternalEObject) goal_relationship).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL,
						Goal_Relationship.class, msgs);
			return basicSetGoal_relationship((Goal_Relationship) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP:
			return basicSetGoal_relationship(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP:
			if (resolve)
				return getGoal_relationship();
			return basicGetGoal_relationship();
		case Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP:
			setGoal_relationship((Goal_Relationship) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP:
			setGoal_relationship((Goal_Relationship) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO:
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP:
			return goal_relationship != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
