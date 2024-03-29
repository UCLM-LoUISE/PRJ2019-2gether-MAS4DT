/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from <em>Goal relationship from</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to <em>Goal relationship to</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getModel <em>Model</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Entity {
	/**
	 * Returns the value of the '<em><b>Goal relationship from</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal_Relationship}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from <em>Goal from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship from</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship_from()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from
	 * @model opposite="goal_from"
	 * @generated
	 */
	EList<Goal_Relationship> getGoal_relationship_from();

	/**
	 * Returns the value of the '<em><b>Goal relationship to</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to <em>Goal to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship to</em>' reference.
	 * @see #setGoal_relationship_to(Goal_Relationship)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship_to()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to
	 * @model opposite="goal_to"
	 * @generated
	 */
	Goal_Relationship getGoal_relationship_to();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to <em>Goal relationship to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal relationship to</em>' reference.
	 * @see #getGoal_relationship_to()
	 * @generated
	 */
	void setGoal_relationship_to(Goal_Relationship value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Model#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Model()
	 * @see prometheus_metamodel_system_specification.Model#getGoals
	 * @model opposite="goals" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Step}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Step#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Step()
	 * @see prometheus_metamodel_system_specification.Step#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Step> getStep();

} // Goal
