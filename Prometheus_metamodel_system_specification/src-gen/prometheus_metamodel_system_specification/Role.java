/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Role#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Role#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Role#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Role#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Entity {
	/**
	 * Returns the value of the '<em><b>Percept</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRole_Percept()
	 * @model
	 * @generated
	 */
	EList<Percept> getPercept();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRole_Action()
	 * @model
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRole_Goal()
	 * @model
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRole_Scenario()
	 * @see prometheus_metamodel_system_specification.Scenario#getRol
	 * @model opposite="rol"
	 * @generated
	 */
	EList<Scenario> getScenario();

} // Role
