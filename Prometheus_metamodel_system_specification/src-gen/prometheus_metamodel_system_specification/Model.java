/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getPercepts <em>Percepts</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getActions <em>Actions</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getContexts <em>Contexts</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getPhysical_objects <em>Physical objects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getLogical_objects <em>Logical objects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getGoals <em>Goals</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getGoal_relationships <em>Goal relationships</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getActors <em>Actors</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getRoles <em>Roles</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getData <em>Data</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getAgents <em>Agents</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getMessages <em>Messages</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Percepts</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percepts</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Percepts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Percept> getPercepts();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Contexts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Physical objects</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical objects</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Physical_objects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_objects();

	/**
	 * Returns the value of the '<em><b>Logical objects</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Logical_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical objects</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Logical_objects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Logical_Object> getLogical_objects();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Goals()
	 * @see prometheus_metamodel_system_specification.Goal#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Goal relationships</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal_Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationships</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Goal_relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal_Relationship> getGoal_relationships();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Rol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rol> getRoles();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getModel_scenario <em>Model scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Scenarios()
	 * @see prometheus_metamodel_system_specification.Scenario#getModel_scenario
	 * @model opposite="model_scenario" containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Agent}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Agent#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Agents()
	 * @see prometheus_metamodel_system_specification.Agent#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Protocols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Protocol> getProtocols();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

} // Model
