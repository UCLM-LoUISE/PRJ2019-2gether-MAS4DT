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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Goal_Relationship;
import prometheus_metamodel_system_specification.Model;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Rol;
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship_from_and <em>Goal relationship from and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship_to_and <em>Goal relationship to and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getModel <em>Model</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship_from_or <em>Goal relationship from or</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship_to_or <em>Goal relationship to or</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getRol <em>Rol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends EntityImpl implements Goal {
	/**
	 * The cached value of the '{@link #getGoal_relationship_from_and() <em>Goal relationship from and</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship_from_and()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal_Relationship> goal_relationship_from_and;
	/**
	 * The cached value of the '{@link #getGoal_relationship_to_and() <em>Goal relationship to and</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship_to_and()
	 * @generated
	 * @ordered
	 */
	protected Goal_Relationship goal_relationship_to_and;
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
	 * The cached value of the '{@link #getGoal_relationship_from_or() <em>Goal relationship from or</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship_from_or()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal_Relationship> goal_relationship_from_or;
	/**
	 * The cached value of the '{@link #getGoal_relationship_to_or() <em>Goal relationship to or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship_to_or()
	 * @generated
	 * @ordered
	 */
	protected Goal_Relationship goal_relationship_to_or;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol;

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
	public EList<Goal_Relationship> getGoal_relationship_from_and() {
		if (goal_relationship_from_and == null) {
			goal_relationship_from_and = new EObjectWithInverseResolvingEList<Goal_Relationship>(
					Goal_Relationship.class, this,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_AND);
		}
		return goal_relationship_from_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal_Relationship getGoal_relationship_to_and() {
		if (goal_relationship_to_and != null && goal_relationship_to_and.eIsProxy()) {
			InternalEObject oldGoal_relationship_to_and = (InternalEObject) goal_relationship_to_and;
			goal_relationship_to_and = (Goal_Relationship) eResolveProxy(oldGoal_relationship_to_and);
			if (goal_relationship_to_and != oldGoal_relationship_to_and) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND,
							oldGoal_relationship_to_and, goal_relationship_to_and));
			}
		}
		return goal_relationship_to_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Relationship basicGetGoal_relationship_to_and() {
		return goal_relationship_to_and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_relationship_to_and(Goal_Relationship newGoal_relationship_to_and,
			NotificationChain msgs) {
		Goal_Relationship oldGoal_relationship_to_and = goal_relationship_to_and;
		goal_relationship_to_and = newGoal_relationship_to_and;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND,
					oldGoal_relationship_to_and, newGoal_relationship_to_and);
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
	public void setGoal_relationship_to_and(Goal_Relationship newGoal_relationship_to_and) {
		if (newGoal_relationship_to_and != goal_relationship_to_and) {
			NotificationChain msgs = null;
			if (goal_relationship_to_and != null)
				msgs = ((InternalEObject) goal_relationship_to_and).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND,
						Goal_Relationship.class, msgs);
			if (newGoal_relationship_to_and != null)
				msgs = ((InternalEObject) newGoal_relationship_to_and).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND,
						Goal_Relationship.class, msgs);
			msgs = basicSetGoal_relationship_to_and(newGoal_relationship_to_and, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND,
					newGoal_relationship_to_and, newGoal_relationship_to_and));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		if (eContainerFeatureID() != Prometheus_metamodel_system_specificationPackage.GOAL__MODEL)
			return null;
		return (Model) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModel,
				Prometheus_metamodel_system_specificationPackage.GOAL__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer()
				|| (eContainerFeatureID() != Prometheus_metamodel_system_specificationPackage.GOAL__MODEL
						&& newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.MODEL__GOALS, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__MODEL, newModel, newModel));
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
					Prometheus_metamodel_system_specificationPackage.GOAL__STEP,
					Prometheus_metamodel_system_specificationPackage.STEP__GOAL);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal_Relationship> getGoal_relationship_from_or() {
		if (goal_relationship_from_or == null) {
			goal_relationship_from_or = new EObjectWithInverseResolvingEList<Goal_Relationship>(Goal_Relationship.class,
					this, Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM_OR);
		}
		return goal_relationship_from_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal_Relationship getGoal_relationship_to_or() {
		if (goal_relationship_to_or != null && goal_relationship_to_or.eIsProxy()) {
			InternalEObject oldGoal_relationship_to_or = (InternalEObject) goal_relationship_to_or;
			goal_relationship_to_or = (Goal_Relationship) eResolveProxy(oldGoal_relationship_to_or);
			if (goal_relationship_to_or != oldGoal_relationship_to_or) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR,
							oldGoal_relationship_to_or, goal_relationship_to_or));
			}
		}
		return goal_relationship_to_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Relationship basicGetGoal_relationship_to_or() {
		return goal_relationship_to_or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_relationship_to_or(Goal_Relationship newGoal_relationship_to_or,
			NotificationChain msgs) {
		Goal_Relationship oldGoal_relationship_to_or = goal_relationship_to_or;
		goal_relationship_to_or = newGoal_relationship_to_or;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR,
					oldGoal_relationship_to_or, newGoal_relationship_to_or);
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
	public void setGoal_relationship_to_or(Goal_Relationship newGoal_relationship_to_or) {
		if (newGoal_relationship_to_or != goal_relationship_to_or) {
			NotificationChain msgs = null;
			if (goal_relationship_to_or != null)
				msgs = ((InternalEObject) goal_relationship_to_or).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR,
						Goal_Relationship.class, msgs);
			if (newGoal_relationship_to_or != null)
				msgs = ((InternalEObject) newGoal_relationship_to_or).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR,
						Goal_Relationship.class, msgs);
			msgs = basicSetGoal_relationship_to_or(newGoal_relationship_to_or, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR,
					newGoal_relationship_to_or, newGoal_relationship_to_or));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRol() {
		if (rol == null) {
			rol = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this,
					Prometheus_metamodel_system_specificationPackage.GOAL__ROL,
					Prometheus_metamodel_system_specificationPackage.ROL__GOAL);
		}
		return rol;
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoal_relationship_from_and())
					.basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND:
			if (goal_relationship_to_and != null)
				msgs = ((InternalEObject) goal_relationship_to_and).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_AND,
						Goal_Relationship.class, msgs);
			return basicSetGoal_relationship_to_and((Goal_Relationship) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModel((Model) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStep()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoal_relationship_from_or())
					.basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR:
			if (goal_relationship_to_or != null)
				msgs = ((InternalEObject) goal_relationship_to_or).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO_OR,
						Goal_Relationship.class, msgs);
			return basicSetGoal_relationship_to_or((Goal_Relationship) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__ROL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRol()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND:
			return ((InternalEList<?>) getGoal_relationship_from_and()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND:
			return basicSetGoal_relationship_to_and(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return basicSetModel(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR:
			return ((InternalEList<?>) getGoal_relationship_from_or()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR:
			return basicSetGoal_relationship_to_or(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__ROL:
			return ((InternalEList<?>) getRol()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return eInternalContainer().eInverseRemove(this,
					Prometheus_metamodel_system_specificationPackage.MODEL__GOALS, Model.class, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND:
			return getGoal_relationship_from_and();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND:
			if (resolve)
				return getGoal_relationship_to_and();
			return basicGetGoal_relationship_to_and();
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return getModel();
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return getStep();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR:
			return getGoal_relationship_from_or();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR:
			if (resolve)
				return getGoal_relationship_to_or();
			return basicGetGoal_relationship_to_or();
		case Prometheus_metamodel_system_specificationPackage.GOAL__ROL:
			return getRol();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND:
			getGoal_relationship_from_and().clear();
			getGoal_relationship_from_and().addAll((Collection<? extends Goal_Relationship>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND:
			setGoal_relationship_to_and((Goal_Relationship) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			setModel((Model) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR:
			getGoal_relationship_from_or().clear();
			getGoal_relationship_from_or().addAll((Collection<? extends Goal_Relationship>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR:
			setGoal_relationship_to_or((Goal_Relationship) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__ROL:
			getRol().clear();
			getRol().addAll((Collection<? extends Rol>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND:
			getGoal_relationship_from_and().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND:
			setGoal_relationship_to_and((Goal_Relationship) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			setModel((Model) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			getStep().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR:
			getGoal_relationship_from_or().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR:
			setGoal_relationship_to_or((Goal_Relationship) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__ROL:
			getRol().clear();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_AND:
			return goal_relationship_from_and != null && !goal_relationship_from_and.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_AND:
			return goal_relationship_to_and != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return getModel() != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return step != null && !step.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM_OR:
			return goal_relationship_from_or != null && !goal_relationship_from_or.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO_OR:
			return goal_relationship_to_or != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL__ROL:
			return rol != null && !rol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
