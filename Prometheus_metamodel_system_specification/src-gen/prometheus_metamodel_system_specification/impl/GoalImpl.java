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
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship_from <em>Goal relationship from</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getGoal_relationship_to <em>Goal relationship to</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getModel <em>Model</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.GoalImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends EntityImpl implements Goal {
	/**
	 * The cached value of the '{@link #getGoal_relationship_from() <em>Goal relationship from</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship_from()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal_Relationship> goal_relationship_from;
	/**
	 * The cached value of the '{@link #getGoal_relationship_to() <em>Goal relationship to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal_relationship_to()
	 * @generated
	 * @ordered
	 */
	protected Goal_Relationship goal_relationship_to;

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
	public EList<Goal_Relationship> getGoal_relationship_from() {
		if (goal_relationship_from == null) {
			goal_relationship_from = new EObjectWithInverseResolvingEList<Goal_Relationship>(Goal_Relationship.class,
					this, Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM,
					Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_FROM);
		}
		return goal_relationship_from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal_Relationship getGoal_relationship_to() {
		if (goal_relationship_to != null && goal_relationship_to.eIsProxy()) {
			InternalEObject oldGoal_relationship_to = (InternalEObject) goal_relationship_to;
			goal_relationship_to = (Goal_Relationship) eResolveProxy(oldGoal_relationship_to);
			if (goal_relationship_to != oldGoal_relationship_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO,
							oldGoal_relationship_to, goal_relationship_to));
			}
		}
		return goal_relationship_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Relationship basicGetGoal_relationship_to() {
		return goal_relationship_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal_relationship_to(Goal_Relationship newGoal_relationship_to,
			NotificationChain msgs) {
		Goal_Relationship oldGoal_relationship_to = goal_relationship_to;
		goal_relationship_to = newGoal_relationship_to;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO,
					oldGoal_relationship_to, newGoal_relationship_to);
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
	public void setGoal_relationship_to(Goal_Relationship newGoal_relationship_to) {
		if (newGoal_relationship_to != goal_relationship_to) {
			NotificationChain msgs = null;
			if (goal_relationship_to != null)
				msgs = ((InternalEObject) goal_relationship_to).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO,
						Goal_Relationship.class, msgs);
			if (newGoal_relationship_to != null)
				msgs = ((InternalEObject) newGoal_relationship_to).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO,
						Goal_Relationship.class, msgs);
			msgs = basicSetGoal_relationship_to(newGoal_relationship_to, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO,
					newGoal_relationship_to, newGoal_relationship_to));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGoal_relationship_from()).basicAdd(otherEnd,
					msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO:
			if (goal_relationship_to != null)
				msgs = ((InternalEObject) goal_relationship_to).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.GOAL_RELATIONSHIP__GOAL_TO,
						Goal_Relationship.class, msgs);
			return basicSetGoal_relationship_to((Goal_Relationship) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModel((Model) otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStep()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM:
			return ((InternalEList<?>) getGoal_relationship_from()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO:
			return basicSetGoal_relationship_to(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return basicSetModel(null, msgs);
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM:
			return getGoal_relationship_from();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO:
			if (resolve)
				return getGoal_relationship_to();
			return basicGetGoal_relationship_to();
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return getModel();
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return getStep();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM:
			getGoal_relationship_from().clear();
			getGoal_relationship_from().addAll((Collection<? extends Goal_Relationship>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO:
			setGoal_relationship_to((Goal_Relationship) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			setModel((Model) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM:
			getGoal_relationship_from().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO:
			setGoal_relationship_to((Goal_Relationship) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			setModel((Model) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			getStep().clear();
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
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_FROM:
			return goal_relationship_from != null && !goal_relationship_from.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.GOAL__GOAL_RELATIONSHIP_TO:
			return goal_relationship_to != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL__MODEL:
			return getModel() != null;
		case Prometheus_metamodel_system_specificationPackage.GOAL__STEP:
			return step != null && !step.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
