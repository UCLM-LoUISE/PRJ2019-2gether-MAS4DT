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

import prometheus_metamodel_system_specification.Agent;
import prometheus_metamodel_system_specification.Message;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.MessageImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.MessageImpl#getCarried_information <em>Carried information</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.MessageImpl#getExternal_path <em>External path</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.MessageImpl#isExternal_to_system <em>External to system</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.MessageImpl#getAgent_message <em>Agent message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends EntityImpl implements Message {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarried_information() <em>Carried information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarried_information()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIED_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarried_information() <em>Carried information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarried_information()
	 * @generated
	 * @ordered
	 */
	protected String carried_information = CARRIED_INFORMATION_EDEFAULT;

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
	 * The cached value of the '{@link #getAgent_message() <em>Agent message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent_message()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent_message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.MESSAGE__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarried_information() {
		return carried_information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarried_information(String newCarried_information) {
		String oldCarried_information = carried_information;
		carried_information = newCarried_information;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.MESSAGE__CARRIED_INFORMATION,
					oldCarried_information, carried_information));
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
					Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_PATH, oldExternal_path,
					external_path));
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
					Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_TO_SYSTEM, oldExternal_to_system,
					external_to_system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgent_message() {
		if (agent_message == null) {
			agent_message = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this,
					Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE,
					Prometheus_metamodel_system_specificationPackage.AGENT__MESSAGE_AGENT);
		}
		return agent_message;
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
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAgent_message()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE:
			return ((InternalEList<?>) getAgent_message()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__PURPOSE:
			return getPurpose();
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__CARRIED_INFORMATION:
			return getCarried_information();
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_PATH:
			return getExternal_path();
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_TO_SYSTEM:
			return isExternal_to_system();
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE:
			return getAgent_message();
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
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__PURPOSE:
			setPurpose((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__CARRIED_INFORMATION:
			setCarried_information((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_PATH:
			setExternal_path((String) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_TO_SYSTEM:
			setExternal_to_system((Boolean) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE:
			getAgent_message().clear();
			getAgent_message().addAll((Collection<? extends Agent>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__PURPOSE:
			setPurpose(PURPOSE_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__CARRIED_INFORMATION:
			setCarried_information(CARRIED_INFORMATION_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_PATH:
			setExternal_path(EXTERNAL_PATH_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_TO_SYSTEM:
			setExternal_to_system(EXTERNAL_TO_SYSTEM_EDEFAULT);
			return;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE:
			getAgent_message().clear();
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
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__PURPOSE:
			return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__CARRIED_INFORMATION:
			return CARRIED_INFORMATION_EDEFAULT == null ? carried_information != null
					: !CARRIED_INFORMATION_EDEFAULT.equals(carried_information);
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_PATH:
			return EXTERNAL_PATH_EDEFAULT == null ? external_path != null
					: !EXTERNAL_PATH_EDEFAULT.equals(external_path);
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__EXTERNAL_TO_SYSTEM:
			return external_to_system != EXTERNAL_TO_SYSTEM_EDEFAULT;
		case Prometheus_metamodel_system_specificationPackage.MESSAGE__AGENT_MESSAGE:
			return agent_message != null && !agent_message.isEmpty();
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", carried_information: ");
		result.append(carried_information);
		result.append(", external_path: ");
		result.append(external_path);
		result.append(", external_to_system: ");
		result.append(external_to_system);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
