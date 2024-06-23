/**
 */
package prometheus_metamodel_system_specification.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal_from_and <em>Goal from and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal_to_and <em>Goal to and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal_from_or <em>Goal from or</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Goal_RelationshipImpl#getGoal_to_or <em>Goal to or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Goal_RelationshipImpl extends MinimalEObjectImpl.Container implements Goal_Relationship {
	/**
	 * The cached value of the '{@link #getGoal_from_and() <em>Goal from and</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_from_and()
	 * @generated
	 * @ordered
	 */
	protected Goal goal_from_and;

	/**
	 * The cached value of the '{@link #getGoal_to_and() <em>Goal to and</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_to_and()
	 * @generated
	 * @ordered
	 */
	protected Goal goal_to_and;

	/**
	 * The cached value of the '{@link #getGoal_from_or() <em>Goal from or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_from_or()
	 * @generated
	 * @ordered
	 */
	protected Goal goal_from_or;

	/**
	 * The cached value of the '{@link #getGoal_to_or() <em>Goal to or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_to_or()
	 * @generated
	 * @ordered
	 */
	protected Goal goal_to_or;

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
	public Goal getGoal_from_and() {
		if (goal_from_and != null && goal_from_and.eIsProxy()) {
			InternalEObject oldGoal_from_and = (InternalEObject) goal_from_and;
			goal_from_and = (Goal) eResolveProxy(oldGoal_from_and);
			if (goal_from_and != oldGoal_from_and) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND,
							oldGoal_from_and, goal_from_and));
			}
		}
		return goal_from_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal_from_and() {
		return goal_from_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_from_and(Goal newGoal_from_and, NotificationChain msgs) {
		Goal oldGoal_from_and = goal_from_and;
		goal_from_and = newGoal_from_and;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND, oldGoal_from_and,
					newGoal_from_and);
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
	public void setGoal_from_and(Goal newGoal_from_and) {
		if (newGoal_from_and != goal_from_and) {
			NotificationChain msgs = null;
			if (goal_from_and != null)
				msgs = ((InternalEObject) goal_from_and).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND, Goal.class,
						msgs);
			if (newGoal_from_and != null)
				msgs = ((InternalEObject) newGoal_from_and).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND, Goal.class,
						msgs);
			msgs = basicSetGoal_from_and(newGoal_from_and, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND, newGoal_from_and,
					newGoal_from_and));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal getGoal_to_and() {
		if (goal_to_and != null && goal_to_and.eIsProxy()) {
			InternalEObject oldGoal_to_and = (InternalEObject) goal_to_and;
			goal_to_and = (Goal) eResolveProxy(oldGoal_to_and);
			if (goal_to_and != oldGoal_to_and) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND,
							oldGoal_to_and, goal_to_and));
			}
		}
		return goal_to_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal_to_and() {
		return goal_to_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_to_and(Goal newGoal_to_and, NotificationChain msgs) {
		Goal oldGoal_to_and = goal_to_and;
		goal_to_and = newGoal_to_and;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND, oldGoal_to_and,
					newGoal_to_and);
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
	public void setGoal_to_and(Goal newGoal_to_and) {
		if (newGoal_to_and != goal_to_and) {
			NotificationChain msgs = null;
			if (goal_to_and != null)
				msgs = ((InternalEObject) goal_to_and).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND, Goal.class,
						msgs);
			if (newGoal_to_and != null)
				msgs = ((InternalEObject) newGoal_to_and).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND, Goal.class,
						msgs);
			msgs = basicSetGoal_to_and(newGoal_to_and, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND, newGoal_to_and,
					newGoal_to_and));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal getGoal_from_or() {
		if (goal_from_or != null && goal_from_or.eIsProxy()) {
			InternalEObject oldGoal_from_or = (InternalEObject) goal_from_or;
			goal_from_or = (Goal) eResolveProxy(oldGoal_from_or);
			if (goal_from_or != oldGoal_from_or) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR,
							oldGoal_from_or, goal_from_or));
			}
		}
		return goal_from_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal_from_or() {
		return goal_from_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_from_or(Goal newGoal_from_or, NotificationChain msgs) {
		Goal oldGoal_from_or = goal_from_or;
		goal_from_or = newGoal_from_or;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR, oldGoal_from_or,
					newGoal_from_or);
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
	public void setGoal_from_or(Goal newGoal_from_or) {
		if (newGoal_from_or != goal_from_or) {
			NotificationChain msgs = null;
			if (goal_from_or != null)
				msgs = ((InternalEObject) goal_from_or).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR, Goal.class,
						msgs);
			if (newGoal_from_or != null)
				msgs = ((InternalEObject) newGoal_from_or).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR, Goal.class,
						msgs);
			msgs = basicSetGoal_from_or(newGoal_from_or, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR, newGoal_from_or,
					newGoal_from_or));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal getGoal_to_or() {
		if (goal_to_or != null && goal_to_or.eIsProxy()) {
			InternalEObject oldGoal_to_or = (InternalEObject) goal_to_or;
			goal_to_or = (Goal) eResolveProxy(oldGoal_to_or);
			if (goal_to_or != oldGoal_to_or) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR,
							oldGoal_to_or, goal_to_or));
			}
		}
		return goal_to_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal_to_or() {
		return goal_to_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_to_or(Goal newGoal_to_or, NotificationChain msgs) {
		Goal oldGoal_to_or = goal_to_or;
		goal_to_or = newGoal_to_or;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR, oldGoal_to_or,
					newGoal_to_or);
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
	public void setGoal_to_or(Goal newGoal_to_or) {
		if (newGoal_to_or != goal_to_or) {
			NotificationChain msgs = null;
			if (goal_to_or != null)
				msgs = ((InternalEObject) goal_to_or).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR, Goal.class,
						msgs);
			if (newGoal_to_or != null)
				msgs = ((InternalEObject) newGoal_to_or).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR, Goal.class,
						msgs);
			msgs = basicSetGoal_to_or(newGoal_to_or, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR, newGoal_to_or,
					newGoal_to_or));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND:
			if (goal_from_and != null)
				msgs = ((InternalEObject) goal_from_and).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND, Goal.class,
						msgs);
			return basicSetGoal_from_and((Goal) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND:
			if (goal_to_and != null)
				msgs = ((InternalEObject) goal_to_and).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND, Goal.class,
						msgs);
			return basicSetGoal_to_and((Goal) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR:
			if (goal_from_or != null)
				msgs = ((InternalEObject) goal_from_or).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR, Goal.class,
						msgs);
			return basicSetGoal_from_or((Goal) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR:
			if (goal_to_or != null)
				msgs = ((InternalEObject) goal_to_or).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR, Goal.class,
						msgs);
			return basicSetGoal_to_or((Goal) otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND:
			return basicSetGoal_from_and(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND:
			return basicSetGoal_to_and(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR:
			return basicSetGoal_from_or(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR:
			return basicSetGoal_to_or(null, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND:
			if (resolve)
				return getGoal_from_and();
			return basicGetGoal_from_and();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND:
			if (resolve)
				return getGoal_to_and();
			return basicGetGoal_to_and();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR:
			if (resolve)
				return getGoal_from_or();
			return basicGetGoal_from_or();
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR:
			if (resolve)
				return getGoal_to_or();
			return basicGetGoal_to_or();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND:
			setGoal_from_and((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND:
			setGoal_to_and((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR:
			setGoal_from_or((Goal) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR:
			setGoal_to_or((Goal) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND:
			setGoal_from_and((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND:
			setGoal_to_and((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR:
			setGoal_from_or((Goal) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR:
			setGoal_to_or((Goal) null);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND:
			return goal_from_and != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND:
			return goal_to_and != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR:
			return goal_from_or != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR:
			return goal_to_or != null;
		}
		return super.eIsSet(featureID);
	}

} //Goal_RelationshipImpl
