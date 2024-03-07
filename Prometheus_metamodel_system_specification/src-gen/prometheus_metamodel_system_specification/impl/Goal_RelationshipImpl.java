/**
 */
package prometheus_metamodel_system_specification.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getType_of_relationship <em>Type of relationship</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal_from <em>Goal from</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal_to <em>Goal to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Goal_RelationshipImpl extends MinimalEObjectImpl.Container implements Goal_Relationship {
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
	 * The cached value of the '{@link #getGoal_from() <em>Goal from</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_from()
	 * @generated
	 * @ordered
	 */
	protected Goal goal_from;

	/**
	 * The cached value of the '{@link #getGoal_to() <em>Goal to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_to()
	 * @generated
	 * @ordered
	 */
	protected Goal goal_to;

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
	public Goal getGoal_from() {
		if (goal_from != null && goal_from.eIsProxy()) {
			InternalEObject oldGoal_from = (InternalEObject) goal_from;
			goal_from = (Goal) eResolveProxy(oldGoal_from);
			if (goal_from != oldGoal_from) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM, oldGoal_from,
							goal_from));
			}
		}
		return goal_from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal_from() {
		return goal_from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_from(Goal newGoal_from, NotificationChain msgs) {
		Goal oldGoal_from = goal_from;
		goal_from = newGoal_from;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM, oldGoal_from,
					newGoal_from);
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
	public void setGoal_from(Goal newGoal_from) {
		if (newGoal_from != goal_from) {
			NotificationChain msgs = null;
			if (goal_from != null)
				msgs = ((InternalEObject) goal_from).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM, Goal.class,
						msgs);
			if (newGoal_from != null)
				msgs = ((InternalEObject) newGoal_from).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM, Goal.class,
						msgs);
			msgs = basicSetGoal_from(newGoal_from, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM, newGoal_from,
					newGoal_from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal getGoal_to() {
		if (goal_to != null && goal_to.eIsProxy()) {
			InternalEObject oldGoal_to = (InternalEObject) goal_to;
			goal_to = (Goal) eResolveProxy(oldGoal_to);
			if (goal_to != oldGoal_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO, oldGoal_to,
							goal_to));
			}
		}
		return goal_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal_to() {
		return goal_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_to(Goal newGoal_to, NotificationChain msgs) {
		Goal oldGoal_to = goal_to;
		goal_to = newGoal_to;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO, oldGoal_to,
					newGoal_to);
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
	public void setGoal_to(Goal newGoal_to) {
		if (newGoal_to != goal_to) {
			NotificationChain msgs = null;
			if (goal_to != null)
				msgs = ((InternalEObject) goal_to).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO, Goal.class, msgs);
			if (newGoal_to != null)
				msgs = ((InternalEObject) newGoal_to).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO, Goal.class, msgs);
			msgs = basicSetGoal_to(newGoal_to, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO, newGoal_to,
					newGoal_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM:
			if (goal_from != null)
				msgs = ((InternalEObject) goal_from).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM, Goal.class,
						msgs);
			return basicSetGoal_from((Goal) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO:
			if (goal_to != null)
				msgs = ((InternalEObject) goal_to).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO, Goal.class, msgs);
			return basicSetGoal_to((Goal) otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM:
			return basicSetGoal_from(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO:
			return basicSetGoal_to(null, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			return getType_of_relationship();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM:
			if (resolve)
				return getGoal_from();
			return basicGetGoal_from();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO:
			if (resolve)
				return getGoal_to();
			return basicGetGoal_to();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			setType_of_relationship((Enum_Type_of_Relationship) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM:
			setGoal_from((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO:
			setGoal_to((Goal) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			setType_of_relationship(TYPE_OF_RELATIONSHIP_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM:
			setGoal_from((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO:
			setGoal_to((Goal) null);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__TYPE_OF_RELATIONSHIP:
			return type_of_relationship != TYPE_OF_RELATIONSHIP_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM:
			return goal_from != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO:
			return goal_to != null;
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
