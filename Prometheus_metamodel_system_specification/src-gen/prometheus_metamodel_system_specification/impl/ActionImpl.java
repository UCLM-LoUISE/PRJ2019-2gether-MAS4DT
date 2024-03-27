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

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Functionality;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getPartial_change <em>Partial change</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getSide_effects <em>Side effects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.ActionImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends EntityImpl implements Action {
	/**
	 * The cached value of the '{@link #getFunctionality() <em>Functionality</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionality()
	 * @generated
	 * @ordered
	 */
	protected EList<Functionality> functionality;

	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected String failure = FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartial_change() <em>Partial change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartial_change()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTIAL_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartial_change() <em>Partial change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartial_change()
	 * @generated
	 * @ordered
	 */
	protected String partial_change = PARTIAL_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSide_effects() <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_effects()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EFFECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSide_effects() <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_effects()
	 * @generated
	 * @ordered
	 */
	protected String side_effects = SIDE_EFFECTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Step step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Functionality> getFunctionality() {
		if (functionality == null) {
			functionality = new EObjectWithInverseResolvingEList.ManyInverse<Functionality>(Functionality.class, this,
					Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY,
					Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__ACTION);
		}
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailure(String newFailure) {
		String oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartial_change() {
		return partial_change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartial_change(String newPartial_change) {
		String oldPartial_change = partial_change;
		partial_change = newPartial_change;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE, oldPartial_change,
					partial_change));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSide_effects() {
		return side_effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSide_effects(String newSide_effects) {
		String oldSide_effects = side_effects;
		side_effects = newSide_effects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS, oldSide_effects,
					side_effects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject) step;
			step = (Step) eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.ACTION__STEP, oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		Step oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__STEP, oldStep, newStep);
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
	public void setStep(Step newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject) step).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.STEP__ACTION, Step.class, msgs);
			if (newStep != null)
				msgs = ((InternalEObject) newStep).eInverseAdd(this,
						Prometheus_metamodel_system_specificationPackage.STEP__ACTION, Step.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.ACTION__STEP, newStep, newStep));
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunctionality()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			if (step != null)
				msgs = ((InternalEObject) step).eInverseRemove(this,
						Prometheus_metamodel_system_specificationPackage.STEP__ACTION, Step.class, msgs);
			return basicSetStep((Step) otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY:
			return ((InternalEList<?>) getFunctionality()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			return basicSetStep(null, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY:
			return getFunctionality();
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			return getParameters();
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			return getDuration();
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			return getFailure();
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			return getPartial_change();
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			return getSide_effects();
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			if (resolve)
				return getStep();
			return basicGetStep();
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY:
			getFunctionality().clear();
			getFunctionality().addAll((Collection<? extends Functionality>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			setParameters((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			setDuration((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			setFailure((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			setPartial_change((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			setSide_effects((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			setStep((Step) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY:
			getFunctionality().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			setParameters(PARAMETERS_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			setFailure(FAILURE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			setPartial_change(PARTIAL_CHANGE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			setSide_effects(SIDE_EFFECTS_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			setStep((Step) null);
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
		case Prometheus_metamodel_system_specificationPackage.ACTION__FUNCTIONALITY:
			return functionality != null && !functionality.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
			return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
			return FAILURE_EDEFAULT == null ? failure != null : !FAILURE_EDEFAULT.equals(failure);
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
			return PARTIAL_CHANGE_EDEFAULT == null ? partial_change != null
					: !PARTIAL_CHANGE_EDEFAULT.equals(partial_change);
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
			return SIDE_EFFECTS_EDEFAULT == null ? side_effects != null : !SIDE_EFFECTS_EDEFAULT.equals(side_effects);
		case Prometheus_metamodel_system_specificationPackage.ACTION__STEP:
			return step != null;
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", duration: ");
		result.append(duration);
		result.append(", failure: ");
		result.append(failure);
		result.append(", partial_change: ");
		result.append(partial_change);
		result.append(", side_effects: ");
		result.append(side_effects);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
