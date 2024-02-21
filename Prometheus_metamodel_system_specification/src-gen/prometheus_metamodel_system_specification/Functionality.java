/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Functionality#getLogical_object <em>Logical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Functionality#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Functionality#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Functionality#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends Entity {
	/**
	 * Returns the value of the '<em><b>Logical object</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Logical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Logical_Object#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical object</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getFunctionality_Logical_object()
	 * @see prometheus_metamodel_system_specification.Logical_Object#getFunctionality
	 * @model opposite="functionality" required="true"
	 * @generated
	 */
	EList<Logical_Object> getLogical_object();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Action#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getFunctionality_Action()
	 * @see prometheus_metamodel_system_specification.Action#getFunctionality
	 * @model opposite="functionality" required="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Percept</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Percept#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getFunctionality_Percept()
	 * @see prometheus_metamodel_system_specification.Percept#getFunctionality
	 * @model opposite="functionality" required="true"
	 * @generated
	 */
	EList<Percept> getPercept();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getFunctionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getFunctionality_Scenario()
	 * @see prometheus_metamodel_system_specification.Scenario#getFunctionality
	 * @model opposite="functionality" required="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

} // Functionality
