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
 *   <li>{@link prometheus_metamodel_system_specification.Logical_Object#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Logical_Object#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getLogical_Object()
 * @model
 * @generated
 */
public interface Logical_Object extends Entity {
	/**
	 * Returns the value of the '<em><b>Physical object</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getLogical_Object_Physical_object()
	 * @model required="true"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object();

	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Functionality}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Functionality#getLogical_object <em>Logical object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getLogical_Object_Functionality()
	 * @see prometheus_metamodel_system_specification.Functionality#getLogical_object
	 * @model opposite="logical_object" required="true"
	 * @generated
	 */
	EList<Functionality> getFunctionality();

} // Logical_Object
