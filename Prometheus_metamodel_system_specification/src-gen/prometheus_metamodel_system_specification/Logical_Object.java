/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_shadow <em>Physical object shadow</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object_twin <em>Physical object twin</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getLogical_Object()
 * @model
 * @generated
 */
public interface Logical_Object extends Entity {
	/**
	 * Returns the value of the '<em><b>Physical object shadow</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object_shadow <em>Logical object shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object shadow</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getLogical_Object_Physical_object_shadow()
	 * @see prometheus_metamodel_system_specification.Physical_Object#getLogical_object_shadow
	 * @model opposite="logical_object_shadow"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object_shadow();

	/**
	 * Returns the value of the '<em><b>Physical object twin</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Physical_Object#getLogical_object_twin <em>Logical object twin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object twin</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getLogical_Object_Physical_object_twin()
	 * @see prometheus_metamodel_system_specification.Physical_Object#getLogical_object_twin
	 * @model opposite="logical_object_twin"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object_twin();

} // Logical_Object
