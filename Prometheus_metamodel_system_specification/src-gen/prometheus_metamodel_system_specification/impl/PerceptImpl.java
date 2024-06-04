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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Functionality;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Rol;
import prometheus_metamodel_system_specification.Scenario;
import prometheus_metamodel_system_specification.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getInformation_carried <em>Information carried</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getKnowledge_updated <em>Knowledge updated</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getSource <em>Source</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getProcessing <em>Processing</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getExpected_frequency <em>Expected frequency</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#isExternal_to_system <em>External to system</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getExternal_path <em>External path</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.PerceptImpl#getScenario_percept <em>Scenario percept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerceptImpl extends EntityImpl implements Percept {
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
	 * The default value of the '{@link #getInformation_carried() <em>Information carried</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation_carried()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_CARRIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation_carried() <em>Information carried</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation_carried()
	 * @generated
	 * @ordered
	 */
	protected String information_carried = INFORMATION_CARRIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKnowledge_updated() <em>Knowledge updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledge_updated()
	 * @generated
	 * @ordered
	 */
	protected static final String KNOWLEDGE_UPDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKnowledge_updated() <em>Knowledge updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledge_updated()
	 * @generated
	 * @ordered
	 */
	protected String knowledge_updated = KNOWLEDGE_UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessing() <em>Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessing() <em>Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected String processing = PROCESSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpected_frequency() <em>Expected frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected_frequency()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpected_frequency() <em>Expected frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected_frequency()
	 * @generated
	 * @ordered
	 */
	protected String expected_frequency = EXPECTED_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal_to_system() <em>External to system</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal_to_system()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_TO_SYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal_to_system() <em>External to system</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal_to_system()
	 * @generated
	 * @ordered
	 */
	protected boolean external_to_system = EXTERNAL_TO_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternal_path() <em>External path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_path()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternal_path() <em>External path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_path()
	 * @generated
	 * @ordered
	 */
	protected String external_path = EXTERNAL_PATH_EDEFAULT;

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
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol;

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
	 * The cached value of the '{@link #getScenario_percept() <em>Scenario percept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_percept()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario_percept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT;
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
					Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY,
					Prometheus_metamodel_system_specificationPackage.FUNCTIONALITY__PERCEPT);
		}
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInformation_carried() {
		return information_carried;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformation_carried(String newInformation_carried) {
		String oldInformation_carried = information_carried;
		information_carried = newInformation_carried;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__INFORMATION_CARRIED,
					oldInformation_carried, information_carried));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKnowledge_updated() {
		return knowledge_updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKnowledge_updated(String newKnowledge_updated) {
		String oldKnowledge_updated = knowledge_updated;
		knowledge_updated = newKnowledge_updated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__KNOWLEDGE_UPDATED, oldKnowledge_updated,
					knowledge_updated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessing() {
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessing(String newProcessing) {
		String oldProcessing = processing;
		processing = newProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__PROCESSING, oldProcessing, processing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpected_frequency() {
		return expected_frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpected_frequency(String newExpected_frequency) {
		String oldExpected_frequency = expected_frequency;
		expected_frequency = newExpected_frequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__EXPECTED_FREQUENCY, oldExpected_frequency,
					expected_frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal_to_system() {
		return external_to_system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal_to_system(boolean newExternal_to_system) {
		boolean oldExternal_to_system = external_to_system;
		external_to_system = newExternal_to_system;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_TO_SYSTEM, oldExternal_to_system,
					external_to_system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternal_path() {
		return external_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal_path(String newExternal_path) {
		String oldExternal_path = external_path;
		external_path = newExternal_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_PATH, oldExternal_path,
					external_path));
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
					Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP,
					Prometheus_metamodel_system_specificationPackage.STEP__PERCEPT);
		}
		return step;
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
					Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL,
					Prometheus_metamodel_system_specificationPackage.ROL__PERCEPT);
		}
		return rol;
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
					Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario_percept() {
		if (scenario_percept == null) {
			scenario_percept = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PERCEPT_SCENARIO);
		}
		return scenario_percept;
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
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunctionality()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStep()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRol()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenario_percept()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY:
			return ((InternalEList<?>) getFunctionality()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL:
			return ((InternalEList<?>) getRol()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT:
			return ((InternalEList<?>) getScenario_percept()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY:
			return getFunctionality();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__INFORMATION_CARRIED:
			return getInformation_carried();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__KNOWLEDGE_UPDATED:
			return getKnowledge_updated();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SOURCE:
			return getSource();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__PROCESSING:
			return getProcessing();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXPECTED_FREQUENCY:
			return getExpected_frequency();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_TO_SYSTEM:
			return isExternal_to_system();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_PATH:
			return getExternal_path();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP:
			return getStep();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL:
			return getRol();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO:
			return getScenario();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT:
			return getScenario_percept();
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
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY:
			getFunctionality().clear();
			getFunctionality().addAll((Collection<? extends Functionality>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__INFORMATION_CARRIED:
			setInformation_carried((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__KNOWLEDGE_UPDATED:
			setKnowledge_updated((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SOURCE:
			setSource((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__PROCESSING:
			setProcessing((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXPECTED_FREQUENCY:
			setExpected_frequency((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_TO_SYSTEM:
			setExternal_to_system((Boolean) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_PATH:
			setExternal_path((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL:
			getRol().clear();
			getRol().addAll((Collection<? extends Rol>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT:
			getScenario_percept().clear();
			getScenario_percept().addAll((Collection<? extends Scenario>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY:
			getFunctionality().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__INFORMATION_CARRIED:
			setInformation_carried(INFORMATION_CARRIED_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__KNOWLEDGE_UPDATED:
			setKnowledge_updated(KNOWLEDGE_UPDATED_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__PROCESSING:
			setProcessing(PROCESSING_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXPECTED_FREQUENCY:
			setExpected_frequency(EXPECTED_FREQUENCY_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_TO_SYSTEM:
			setExternal_to_system(EXTERNAL_TO_SYSTEM_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_PATH:
			setExternal_path(EXTERNAL_PATH_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP:
			getStep().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL:
			getRol().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO:
			getScenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT:
			getScenario_percept().clear();
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
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__FUNCTIONALITY:
			return functionality != null && !functionality.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__INFORMATION_CARRIED:
			return INFORMATION_CARRIED_EDEFAULT == null ? information_carried != null
					: !INFORMATION_CARRIED_EDEFAULT.equals(information_carried);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__KNOWLEDGE_UPDATED:
			return KNOWLEDGE_UPDATED_EDEFAULT == null ? knowledge_updated != null
					: !KNOWLEDGE_UPDATED_EDEFAULT.equals(knowledge_updated);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__PROCESSING:
			return PROCESSING_EDEFAULT == null ? processing != null : !PROCESSING_EDEFAULT.equals(processing);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXPECTED_FREQUENCY:
			return EXPECTED_FREQUENCY_EDEFAULT == null ? expected_frequency != null
					: !EXPECTED_FREQUENCY_EDEFAULT.equals(expected_frequency);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_TO_SYSTEM:
			return external_to_system != EXTERNAL_TO_SYSTEM_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_PATH:
			return EXTERNAL_PATH_EDEFAULT == null ? external_path != null
					: !EXTERNAL_PATH_EDEFAULT.equals(external_path);
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__STEP:
			return step != null && !step.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__ROL:
			return rol != null && !rol.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SCENARIO_PERCEPT:
			return scenario_percept != null && !scenario_percept.isEmpty();
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
		result.append(" (information_carried: ");
		result.append(information_carried);
		result.append(", knowledge_updated: ");
		result.append(knowledge_updated);
		result.append(", source: ");
		result.append(source);
		result.append(", processing: ");
		result.append(processing);
		result.append(", expected_frequency: ");
		result.append(expected_frequency);
		result.append(", external_to_system: ");
		result.append(external_to_system);
		result.append(", external_path: ");
		result.append(external_path);
		result.append(')');
		return result.toString();
	}

} //PerceptImpl
