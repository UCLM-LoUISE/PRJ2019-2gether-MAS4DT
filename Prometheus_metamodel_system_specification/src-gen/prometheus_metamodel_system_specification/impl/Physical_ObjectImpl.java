/**
 */
package prometheus_metamodel_system_specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prometheus_metamodel_system_specification.Logical_Object;
import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl#getLogical_object_shadow <em>Logical object shadow</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl#getLogical_object_twin <em>Logical object twin</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Physical_ObjectImpl#getPercept <em>Percept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Physical_ObjectImpl extends EntityImpl implements Physical_Object {
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
	 * The cached value of the '{@link #getPhysical_object() <em>Physical object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_object()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_object;

	/**
	 * The cached value of the '{@link #getLogical_object_shadow() <em>Logical object shadow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_object_shadow()
	 * @generated
	 * @ordered
	 */
	protected EList<Logical_Object> logical_object_shadow;

	/**
	 * The cached value of the '{@link #getLogical_object_twin() <em>Logical object twin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogical_object_twin()
	 * @generated
	 * @ordered
	 */
	protected EList<Logical_Object> logical_object_twin;

	/**
	 * The cached value of the '{@link #getPercept() <em>Percept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercept()
	 * @generated
	 * @ordered
	 */
	protected EList<Percept> percept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Physical_ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO,
					Prometheus_metamodel_system_specificationPackage.SCENARIO__PHYSICAL_OBJECT);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_object() {
		if (physical_object == null) {
			physical_object = new EObjectContainmentEList<Physical_Object>(Physical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PHYSICAL_OBJECT);
		}
		return physical_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Logical_Object> getLogical_object_shadow() {
		if (logical_object_shadow == null) {
			logical_object_shadow = new EObjectWithInverseResolvingEList.ManyInverse<Logical_Object>(
					Logical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW,
					Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW);
		}
		return logical_object_shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Logical_Object> getLogical_object_twin() {
		if (logical_object_twin == null) {
			logical_object_twin = new EObjectWithInverseResolvingEList.ManyInverse<Logical_Object>(Logical_Object.class,
					this, Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN,
					Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN);
		}
		return logical_object_twin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Percept> getPercept() {
		if (percept == null) {
			percept = new EObjectWithInverseResolvingEList.ManyInverse<Percept>(Percept.class, this,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT,
					Prometheus_metamodel_system_specificationPackage.PERCEPT__PHYSICAL_OBJECT);
		}
		return percept;
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
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getScenario()).basicAdd(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLogical_object_shadow()).basicAdd(otherEnd,
					msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLogical_object_twin()).basicAdd(otherEnd,
					msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPercept()).basicAdd(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PHYSICAL_OBJECT:
			return ((InternalEList<?>) getPhysical_object()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW:
			return ((InternalEList<?>) getLogical_object_shadow()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN:
			return ((InternalEList<?>) getLogical_object_twin()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT:
			return ((InternalEList<?>) getPercept()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO:
			return getScenario();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PHYSICAL_OBJECT:
			return getPhysical_object();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW:
			return getLogical_object_shadow();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN:
			return getLogical_object_twin();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT:
			return getPercept();
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
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			getPhysical_object().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW:
			getLogical_object_shadow().clear();
			getLogical_object_shadow().addAll((Collection<? extends Logical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN:
			getLogical_object_twin().clear();
			getLogical_object_twin().addAll((Collection<? extends Logical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT:
			getPercept().clear();
			getPercept().addAll((Collection<? extends Percept>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO:
			getScenario().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PHYSICAL_OBJECT:
			getPhysical_object().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW:
			getLogical_object_shadow().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN:
			getLogical_object_twin().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT:
			getPercept().clear();
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
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PHYSICAL_OBJECT:
			return physical_object != null && !physical_object.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW:
			return logical_object_shadow != null && !logical_object_shadow.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN:
			return logical_object_twin != null && !logical_object_twin.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__PERCEPT:
			return percept != null && !percept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Physical_ObjectImpl
