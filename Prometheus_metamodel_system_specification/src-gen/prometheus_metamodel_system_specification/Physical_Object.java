/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Physical_Object#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Physical_Object#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object_shadow <em>Logical object shadow</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object_twin <em>Logical object twin</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Physical_Object#getPercept <em>Percept</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPhysical_Object()
 * @model
 * @generated
 */
public interface Physical_Object extends Entity {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPhysical_Object_Scenario()
	 * @see prometheus_metamodel_system_specification.Scenario#getPhysical_object
	 * @model opposite="physical_object" required="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Physical object</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPhysical_Object_Physical_object()
	 * @model containment="true"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object();

	/**
	 * Returns the value of the '<em><b>Logical object shadow</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Logical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_shadow <em>Physical object shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical object shadow</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPhysical_Object_Logical_object_shadow()
	 * @see prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_shadow
	 * @model opposite="physical_object_shadow"
	 * @generated
	 */
	EList<Logical_Object> getLogical_object_shadow();

	/**
	 * Returns the value of the '<em><b>Logical object twin</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Logical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_twin <em>Physical object twin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical object twin</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPhysical_Object_Logical_object_twin()
	 * @see prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_twin
	 * @model opposite="physical_object_twin"
	 * @generated
	 */
	EList<Logical_Object> getLogical_object_twin();

	/**
	 * Returns the value of the '<em><b>Percept</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Percept#getPhysical_object <em>Physical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPhysical_Object_Percept()
	 * @see prometheus_metamodel_system_specification.Percept#getPhysical_object
	 * @model opposite="physical_object"
	 * @generated
	 */
	EList<Percept> getPercept();

} // Physical_Object
