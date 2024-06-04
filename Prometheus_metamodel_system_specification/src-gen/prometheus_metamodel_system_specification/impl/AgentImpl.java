/**
 */
package prometheus_metamodel_system_specification.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import prometheus_metamodel_system_specification.Agent;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getMinimum_cardinality <em>Minimum cardinality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getMaximum_cardinality <em>Maximum cardinality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getDemise <em>Demise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends EntityImpl implements Agent {
	/**
	 * The default value of the '{@link #getMinimum_cardinality() <em>Minimum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimum_cardinality() <em>Minimum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected int minimum_cardinality = MINIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_cardinality() <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximum_cardinality() <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected int maximum_cardinality = MAXIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetime()
	 * @generated
	 * @ordered
	 */
	protected String lifetime = LIFETIME_EDEFAULT;

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
	 * The default value of the '{@link #getDemise() <em>Demise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemise()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemise() <em>Demise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemise()
	 * @generated
	 * @ordered
	 */
	protected String demise = DEMISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimum_cardinality() {
		return minimum_cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum_cardinality(int newMinimum_cardinality) {
		int oldMinimum_cardinality = minimum_cardinality;
		minimum_cardinality = newMinimum_cardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.AGENT__MINIMUM_CARDINALITY, oldMinimum_cardinality,
					minimum_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximum_cardinality() {
		return maximum_cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum_cardinality(int newMaximum_cardinality) {
		int oldMaximum_cardinality = maximum_cardinality;
		maximum_cardinality = newMaximum_cardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.AGENT__MAXIMUM_CARDINALITY, oldMaximum_cardinality,
					maximum_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLifetime() {
		return lifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifetime(String newLifetime) {
		String oldLifetime = lifetime;
		lifetime = newLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.AGENT__LIFETIME, oldLifetime, lifetime));
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
					Prometheus_metamodel_system_specificationPackage.AGENT__INITIALISATION, oldInitialisation,
					initialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDemise() {
		return demise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDemise(String newDemise) {
		String oldDemise = demise;
		demise = newDemise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.AGENT__DEMISE, oldDemise, demise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.AGENT__MINIMUM_CARDINALITY:
			return getMinimum_cardinality();
		case Prometheus_metamodel_system_specificationPackage.AGENT__MAXIMUM_CARDINALITY:
			return getMaximum_cardinality();
		case Prometheus_metamodel_system_specificationPackage.AGENT__LIFETIME:
			return getLifetime();
		case Prometheus_metamodel_system_specificationPackage.AGENT__INITIALISATION:
			return getInitialisation();
		case Prometheus_metamodel_system_specificationPackage.AGENT__DEMISE:
			return getDemise();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Prometheus_metamodel_system_specificationPackage.AGENT__MINIMUM_CARDINALITY:
			setMinimum_cardinality((Integer) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__MAXIMUM_CARDINALITY:
			setMaximum_cardinality((Integer) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__LIFETIME:
			setLifetime((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__INITIALISATION:
			setInitialisation((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__DEMISE:
			setDemise((String) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__MINIMUM_CARDINALITY:
			setMinimum_cardinality(MINIMUM_CARDINALITY_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__MAXIMUM_CARDINALITY:
			setMaximum_cardinality(MAXIMUM_CARDINALITY_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__LIFETIME:
			setLifetime(LIFETIME_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__INITIALISATION:
			setInitialisation(INITIALISATION_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__DEMISE:
			setDemise(DEMISE_EDEFAULT);
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__MINIMUM_CARDINALITY:
			return minimum_cardinality != MINIMUM_CARDINALITY_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.AGENT__MAXIMUM_CARDINALITY:
			return maximum_cardinality != MAXIMUM_CARDINALITY_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.AGENT__LIFETIME:
			return LIFETIME_EDEFAULT == null ? lifetime != null : !LIFETIME_EDEFAULT.equals(lifetime);
		case Prometheus_metamodel_system_specificationPackage.AGENT__INITIALISATION:
			return INITIALISATION_EDEFAULT == null ? initialisation != null
					: !INITIALISATION_EDEFAULT.equals(initialisation);
		case Prometheus_metamodel_system_specificationPackage.AGENT__DEMISE:
			return DEMISE_EDEFAULT == null ? demise != null : !DEMISE_EDEFAULT.equals(demise);
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
		result.append(" (minimum_cardinality: ");
		result.append(minimum_cardinality);
		result.append(", maximum_cardinality: ");
		result.append(maximum_cardinality);
		result.append(", lifetime: ");
		result.append(lifetime);
		result.append(", initialisation: ");
		result.append(initialisation);
		result.append(", demise: ");
		result.append(demise);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
