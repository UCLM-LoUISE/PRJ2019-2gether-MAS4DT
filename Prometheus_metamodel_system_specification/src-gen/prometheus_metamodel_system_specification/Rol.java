/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Rol#getData_rol <em>Data rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Rol#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Rol#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Rol#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Rol#getScenario_rol <em>Scenario rol</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRol()
 * @model
 * @generated
 */
public interface Rol extends Entity {
	/**
	 * Returns the value of the '<em><b>Data rol</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Data}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Data#getRol_data <em>Rol data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data rol</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRol_Data_rol()
	 * @see prometheus_metamodel_system_specification.Data#getRol_data
	 * @model opposite="rol_data"
	 * @generated
	 */
	EList<Data> getData_rol();

	/**
	 * Returns the value of the '<em><b>Percept</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Percept#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRol_Percept()
	 * @see prometheus_metamodel_system_specification.Percept#getRol
	 * @model opposite="rol"
	 * @generated
	 */
	EList<Percept> getPercept();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Action#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRol_Action()
	 * @see prometheus_metamodel_system_specification.Action#getRol
	 * @model opposite="rol"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRol_Goal()
	 * @see prometheus_metamodel_system_specification.Goal#getRol
	 * @model opposite="rol"
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Scenario rol</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getRol_scenario <em>Rol scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario rol</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getRol_Scenario_rol()
	 * @see prometheus_metamodel_system_specification.Scenario#getRol_scenario
	 * @model opposite="rol_scenario"
	 * @generated
	 */
	EList<Scenario> getScenario_rol();

} // Rol
