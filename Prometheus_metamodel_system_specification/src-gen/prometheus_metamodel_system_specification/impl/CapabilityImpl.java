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
import prometheus_metamodel_system_specification.Capability;
import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Message;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.CapabilityImpl#getAgent_capability <em>Agent capability</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.CapabilityImpl#getData_capability <em>Data capability</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.CapabilityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.CapabilityImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.CapabilityImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends EntityImpl implements Capability {
	/**
	 * The cached value of the '{@link #getAgent_capability() <em>Agent capability</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent_capability()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent_capability;

	/**
	 * The cached value of the '{@link #getData_capability() <em>Data capability</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_capability()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data_capability;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgent_capability() {
		if (agent_capability == null) {
			agent_capability = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this,
					Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY,
					Prometheus_metamodel_system_specificationPackage.AGENT__CAPABILITY_AGENT);
		}
		return agent_capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData_capability() {
		if (data_capability == null) {
			data_capability = new EObjectWithInverseResolvingEList.ManyInverse<Data>(Data.class, this,
					Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY,
					Prometheus_metamodel_system_specificationPackage.DATA__CAPABILITY_DATA);
		}
		return data_capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Action) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prometheus_metamodel_system_specificationPackage.CAPABILITY__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prometheus_metamodel_system_specificationPackage.CAPABILITY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectResolvingEList<Message>(Message.class, this,
					Prometheus_metamodel_system_specificationPackage.CAPABILITY__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this,
					Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA);
		}
		return data;
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
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAgent_capability()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData_capability()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY:
			return ((InternalEList<?>) getAgent_capability()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY:
			return ((InternalEList<?>) getData_capability()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY:
			return getAgent_capability();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY:
			return getData_capability();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__MESSAGE:
			return getMessage();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA:
			return getData();
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
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY:
			getAgent_capability().clear();
			getAgent_capability().addAll((Collection<? extends Agent>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY:
			getData_capability().clear();
			getData_capability().addAll((Collection<? extends Data>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__ACTION:
			setAction((Action) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY:
			getAgent_capability().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY:
			getData_capability().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__ACTION:
			setAction((Action) null);
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__MESSAGE:
			getMessage().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA:
			getData().clear();
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
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__AGENT_CAPABILITY:
			return agent_capability != null && !agent_capability.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA_CAPABILITY:
			return data_capability != null && !data_capability.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__ACTION:
			return action != null;
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__MESSAGE:
			return message != null && !message.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.CAPABILITY__DATA:
			return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
