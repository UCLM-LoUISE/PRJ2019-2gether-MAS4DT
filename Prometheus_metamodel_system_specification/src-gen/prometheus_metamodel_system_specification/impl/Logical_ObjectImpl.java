/**
 */
package prometheus_metamodel_system_specification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import prometheus_metamodel_system_specification.Logical_Object;
import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Logical_ObjectImpl#getPhysical_object_shadow <em>Physical object shadow</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.impl.Logical_ObjectImpl#getPhysical_object_twin <em>Physical object twin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Logical_ObjectImpl extends EntityImpl implements Logical_Object {
	/**
	 * The cached value of the '{@link #getPhysical_object_shadow() <em>Physical object shadow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_object_shadow()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_object_shadow;

	/**
	 * The cached value of the '{@link #getPhysical_object_twin() <em>Physical object twin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical_object_twin()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Object> physical_object_twin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Logical_ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prometheus_metamodel_system_specificationPackage.Literals.LOGICAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_object_shadow() {
		if (physical_object_shadow == null) {
			physical_object_shadow = new EObjectWithInverseResolvingEList.ManyInverse<Physical_Object>(
					Physical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW);
		}
		return physical_object_shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Object> getPhysical_object_twin() {
		if (physical_object_twin == null) {
			physical_object_twin = new EObjectWithInverseResolvingEList.ManyInverse<Physical_Object>(
					Physical_Object.class, this,
					Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN,
					Prometheus_metamodel_system_specificationPackage.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN);
		}
		return physical_object_twin;
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
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical_object_shadow()).basicAdd(otherEnd,
					msgs);
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical_object_twin()).basicAdd(otherEnd,
					msgs);
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
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW:
			return ((InternalEList<?>) getPhysical_object_shadow()).basicRemove(otherEnd, msgs);
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN:
			return ((InternalEList<?>) getPhysical_object_twin()).basicRemove(otherEnd, msgs);
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
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW:
			return getPhysical_object_shadow();
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN:
			return getPhysical_object_twin();
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
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW:
			getPhysical_object_shadow().clear();
			getPhysical_object_shadow().addAll((Collection<? extends Physical_Object>) newValue);
			return;
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN:
			getPhysical_object_twin().clear();
			getPhysical_object_twin().addAll((Collection<? extends Physical_Object>) newValue);
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
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW:
			getPhysical_object_shadow().clear();
			return;
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN:
			getPhysical_object_twin().clear();
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
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_SHADOW:
			return physical_object_shadow != null && !physical_object_shadow.isEmpty();
		case Prometheus_metamodel_system_specificationPackage.LOGICAL_OBJECT__PHYSICAL_OBJECT_TWIN:
			return physical_object_twin != null && !physical_object_twin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Logical_ObjectImpl
