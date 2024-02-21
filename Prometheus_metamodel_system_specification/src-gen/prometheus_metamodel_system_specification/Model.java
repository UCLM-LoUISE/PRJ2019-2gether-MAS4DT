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
 *   <li>{@link prometheus_metamodel_system_specification.Model#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getContext <em>Context</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getGoal_relationship <em>Goal relationship</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getLogical_object <em>Logical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Model#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Percept</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Percept()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Percept> getPercept();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Goal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Goal relationship</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal_Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Goal_relationship()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal_Relationship> getGoal_relationship();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Scenario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Physical object</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Physical_object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object();

	/**
	 * Returns the value of the '<em><b>Logical object</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Logical_Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical object</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Logical_object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Logical_Object> getLogical_object();

	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Functionality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getModel_Functionality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Functionality> getFunctionality();

} // Model
