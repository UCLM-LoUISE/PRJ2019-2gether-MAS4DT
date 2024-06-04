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
import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#getData_type <em>Data type</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#getIncluded_fields_aspects <em>Included fields aspects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#isExternal_to_system <em>External to system</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#getExternal_path <em>External path</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#getUsed_when <em>Used when</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.DataImpl#getScenario_data <em>Scenario data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends EntityImpl implements Data {
	/**
	 * The default value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected String data_type = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncluded_fields_aspects() <em>Included fields aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded_fields_aspects()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDED_FIELDS_ASPECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncluded_fields_aspects() <em>Included fields aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded_fields_aspects()
	 * @generated
	 * @ordered
	 */
	protected String included_fields_aspects = INCLUDED_FIELDS_ASPECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

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
	 * The default value of the '{@link #getInitialisation() <em>Initialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisation()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialisation() <em>Initialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisation()
	 * @generated
	 * @ordered
	 */
	protected String initialisation = INITIALISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsed_when() <em>Used when</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed_when()
	 * @generated
	 * @ordered
	 */
	protected static final String USED_WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsed_when() <em>Used when</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed_when()
	 * @generated
	 * @ordered
	 */
	protected String used_when = USED_WHEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenario_data() <em>Scenario data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_data()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario_data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getData_type() {
		return data_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_type(String newData_type) {
		String oldData_type = data_type;
		data_type = newData_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.DATA__DATA_TYPE, oldData_type, data_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncluded_fields_aspects() {
		return included_fields_aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncluded_fields_aspects(String newIncluded_fields_aspects) {
		String oldIncluded_fields_aspects = included_fields_aspects;
		included_fields_aspects = newIncluded_fields_aspects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.DATA__INCLUDED_FIELDS_ASPECTS,
					oldIncluded_fields_aspects, included_fields_aspects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.DATA__PERSISTENT, oldPersistent, persistent));
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
					Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_TO_SYSTEM, oldExternal_to_system,
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
					Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_PATH, oldExternal_path,
					external_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialisation() {
		return initialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialisation(String newInitialisation) {
		String oldInitialisation = initialisation;
		initialisation = newInitialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.DATA__INITIALISATION, oldInitialisation,
					initialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsed_when() {
		return used_when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsed_when(String newUsed_when) {
		String oldUsed_when = used_when;
		used_when = newUsed_when;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.DATA__USED_WHEN, oldUsed_when, used_when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario_data() {
		if (scenario_data == null) {
			scenario_data = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__DATA_SCENARIO);
		}
		return scenario_data;
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
		case Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenario_data()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA:
			return ((InternalEList<?>) getScenario_data()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.DATA__DATA_TYPE:
			return getData_type();
		case Prometheus_metamodel_system_specificationPackage.DATA__INCLUDED_FIELDS_ASPECTS:
			return getIncluded_fields_aspects();
		case Prometheus_metamodel_system_specificationPackage.DATA__PERSISTENT:
			return isPersistent();
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_TO_SYSTEM:
			return isExternal_to_system();
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_PATH:
			return getExternal_path();
		case Prometheus_metamodel_system_specificationPackage.DATA__INITIALISATION:
			return getInitialisation();
		case Prometheus_metamodel_system_specificationPackage.DATA__USED_WHEN:
			return getUsed_when();
		case Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA:
			return getScenario_data();
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
		case Prometheus_metamodel_system_specificationPackage.DATA__DATA_TYPE:
			setData_type((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__INCLUDED_FIELDS_ASPECTS:
			setIncluded_fields_aspects((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__PERSISTENT:
			setPersistent((Boolean) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_TO_SYSTEM:
			setExternal_to_system((Boolean) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_PATH:
			setExternal_path((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__INITIALISATION:
			setInitialisation((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__USED_WHEN:
			setUsed_when((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA:
			getScenario_data().clear();
			getScenario_data().addAll((Collection<? extends Scenario>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.DATA__DATA_TYPE:
			setData_type(DATA_TYPE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__INCLUDED_FIELDS_ASPECTS:
			setIncluded_fields_aspects(INCLUDED_FIELDS_ASPECTS_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__PERSISTENT:
			setPersistent(PERSISTENT_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_TO_SYSTEM:
			setExternal_to_system(EXTERNAL_TO_SYSTEM_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_PATH:
			setExternal_path(EXTERNAL_PATH_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__INITIALISATION:
			setInitialisation(INITIALISATION_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__USED_WHEN:
			setUsed_when(USED_WHEN_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA:
			getScenario_data().clear();
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
		case Prometheus_metamodel_system_specificationPackage.DATA__DATA_TYPE:
			return DATA_TYPE_EDEFAULT == null ? data_type != null : !DATA_TYPE_EDEFAULT.equals(data_type);
		case Prometheus_metamodel_system_specificationPackage.DATA__INCLUDED_FIELDS_ASPECTS:
			return INCLUDED_FIELDS_ASPECTS_EDEFAULT == null ? included_fields_aspects != null
					: !INCLUDED_FIELDS_ASPECTS_EDEFAULT.equals(included_fields_aspects);
		case Prometheus_metamodel_system_specificationPackage.DATA__PERSISTENT:
			return persistent != PERSISTENT_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_TO_SYSTEM:
			return external_to_system != EXTERNAL_TO_SYSTEM_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_PATH:
			return EXTERNAL_PATH_EDEFAULT == null ? external_path != null
					: !EXTERNAL_PATH_EDEFAULT.equals(external_path);
		case Prometheus_metamodel_system_specificationPackage.DATA__INITIALISATION:
			return INITIALISATION_EDEFAULT == null ? initialisation != null
					: !INITIALISATION_EDEFAULT.equals(initialisation);
		case Prometheus_metamodel_system_specificationPackage.DATA__USED_WHEN:
			return USED_WHEN_EDEFAULT == null ? used_when != null : !USED_WHEN_EDEFAULT.equals(used_when);
		case Prometheus_metamodel_system_specificationPackage.DATA__SCENARIO_DATA:
			return scenario_data != null && !scenario_data.isEmpty();
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
		result.append(" (data_type: ");
		result.append(data_type);
		result.append(", included_fields_aspects: ");
		result.append(included_fields_aspects);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(", external_to_system: ");
		result.append(external_to_system);
		result.append(", external_path: ");
		result.append(external_path);
		result.append(", initialisation: ");
		result.append(initialisation);
		result.append(", used_when: ");
		result.append(used_when);
		result.append(')');
		return result.toString();
	}

} //DataImpl
