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
import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Agent;
import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Message;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Protocol;
import prometheus_metamodel_system_specification.Rol;

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
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getData_agent <em>Data agent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getMessage_agent <em>Message agent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.AgentImpl#getAction <em>Action</em>}</li>
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
	 * The cached value of the '{@link #getData_agent() <em>Data agent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_agent()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data_agent;

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
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocol;

	/**
	 * The cached value of the '{@link #getMessage_agent() <em>Message agent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage_agent()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message_agent;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

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
	public EList<Data> getData_agent() {
		if (data_agent == null) {
			data_agent = new EObjectWithInverseResolvingEList.ManyInverse<Data>(Data.class, this,
					Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT,
					Prometheus_metamodel_system_specificationPackage.DATA__AGENT_DATA);
		}
		return data_agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRol() {
		if (rol == null) {
			rol = new EObjectResolvingEList<Rol>(Rol.class, this,
					Prometheus_metamodel_system_specificationPackage.AGENT__ROL);
		}
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Protocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectResolvingEList<Protocol>(Protocol.class, this,
					Prometheus_metamodel_system_specificationPackage.AGENT__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessage_agent() {
		if (message_agent == null) {
			message_agent = new EObjectWithInverseResolvingEList.ManyInverse<Message>(Message.class, this,
					Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT,
					Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE);
		}
		return message_agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectResolvingEList<Action>(Action.class, this,
					Prometheus_metamodel_system_specificationPackage.AGENT__ACTION);
		}
		return action;
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData_agent()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMessage_agent()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT:
			return ((InternalEList<?>) getData_agent()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT:
			return ((InternalEList<?>) getMessage_agent()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT:
			return getData_agent();
		case Prometheus_metamodel_system_specificationPackage.AGENT__ROL:
			return getRol();
		case Prometheus_metamodel_system_specificationPackage.AGENT__PROTOCOL:
			return getProtocol();
		case Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT:
			return getMessage_agent();
		case Prometheus_metamodel_system_specificationPackage.AGENT__ACTION:
			return getAction();
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT:
			getData_agent().clear();
			getData_agent().addAll((Collection<? extends Data>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__ROL:
			getRol().clear();
			getRol().addAll((Collection<? extends Rol>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__PROTOCOL:
			getProtocol().clear();
			getProtocol().addAll((Collection<? extends Protocol>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT:
			getMessage_agent().clear();
			getMessage_agent().addAll((Collection<? extends Message>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT:
			getData_agent().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__ROL:
			getRol().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__PROTOCOL:
			getProtocol().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT:
			getMessage_agent().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.AGENT__ACTION:
			getAction().clear();
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
		case Prometheus_metamodel_system_specificationPackage.AGENT__DATA_AGENT:
			return data_agent != null && !data_agent.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.AGENT__ROL:
			return rol != null && !rol.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.AGENT__PROTOCOL:
			return protocol != null && !protocol.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT:
			return message_agent != null && !message_agent.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.AGENT__ACTION:
			return action != null && !action.isEmpty();
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
