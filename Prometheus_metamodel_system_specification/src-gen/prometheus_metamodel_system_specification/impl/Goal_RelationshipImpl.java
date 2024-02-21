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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Enum_Type_of_Relationship;
import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Goal_Relationship;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getSubgoals <em>Subgoals</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getType_of_relationship <em>Type of relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Goal_RelationshipImpl extends MinimalEObjectImpl.Container implements Goal_Relationship {
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
	 * The cached value of the '{@link #getSubgoals() <em>Subgoals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> subgoals;

	/**
	 * The default value of the '{@link #getType_of_relationship() <em>Type of relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_of_relationship()
	 * @generated
	 * @ordered
	 */
	protected static final Enum_Type_of_Relationship TYPE_OF_RELATIONSHIP_EDEFAULT = Enum_Type_of_Relationship.AND;

	/**
	 * The cached value of the '{@link #getType_of_relationship() <em>Type of relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_of_relationship()
	 * @generated
	 * @ordered
	 */
	protected Enum_Type_of_Relationship type_of_relationship = TYPE_OF_RELATIONSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Goal_RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.GOAL_RELATIONSHIP;
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
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL, oldGoal, goal));
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
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL, oldGoal, newGoal);
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
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP, Goal.class, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject) newGoal).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP, Goal.class, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getSubgoals() {
		if (subgoals == null) {
			subgoals = new EObjectContainmentEList<Goal>(Goal.class, this,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__SUBGOALS);
		}
		return subgoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enum_Type_of_Relationship getType_of_relationship() {
		return type_of_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_of_relationship(Enum_Type_of_Relationship newType_of_relationship) {
		Enum_Type_of_Relationship oldType_of_relationship = type_of_relationship;
		type_of_relationship = newType_of_relationship == null ? TYPE_OF_RELATIONSHIP_EDEFAULT
				: newType_of_relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP,
					oldType_of_relationship, type_of_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL:
			if (goal != null)
				msgs = ((InternalEObject) goal).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP, Goal.class, msgs);
			return basicSetGoal((Goal) otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL:
			return basicSetGoal(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__SUBGOALS:
			return ((InternalEList<?>) getSubgoals()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL:
			if (resolve)
				return getGoal();
			return basicGetGoal();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__SUBGOALS:
			return getSubgoals();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			return getType_of_relationship();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL:
			setGoal((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__SUBGOALS:
			getSubgoals().clear();
			getSubgoals().addAll((Collection<? extends Goal>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			setType_of_relationship((Enum_Type_of_Relationship) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL:
			setGoal((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__SUBGOALS:
			getSubgoals().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			setType_of_relationship(TYPE_OF_RELATIONSHIP_EDEFAULT);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL:
			return goal != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__SUBGOALS:
			return subgoals != null && !subgoals.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			return type_of_relationship != TYPE_OF_RELATIONSHIP_EDEFAULT;
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
		result.append(" (type_of_relationship: ");
		result.append(type_of_relationship);
		result.append(')');
		return result.toString();
	}

} //Goal_RelationshipImpl
