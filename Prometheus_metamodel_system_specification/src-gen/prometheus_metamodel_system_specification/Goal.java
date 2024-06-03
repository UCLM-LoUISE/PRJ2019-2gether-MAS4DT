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
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_and <em>Goal relationship from and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_and <em>Goal relationship to and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getModel <em>Model</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_or <em>Goal relationship from or</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_or <em>Goal relationship to or</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getRol <em>Rol</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Entity {
	/**
	 * Returns the value of the '<em><b>Goal relationship from and</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal_Relationship}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_and <em>Goal from and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship from and</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship_from_and()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_and
	 * @model opposite="goal_from_and"
	 * @generated
	 */
	EList<Goal_Relationship> getGoal_relationship_from_and();

	/**
	 * Returns the value of the '<em><b>Goal relationship to and</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_and <em>Goal to and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship to and</em>' reference.
	 * @see #setGoal_relationship_to_and(Goal_Relationship)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship_to_and()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_and
	 * @model opposite="goal_to_and"
	 * @generated
	 */
	Goal_Relationship getGoal_relationship_to_and();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_and <em>Goal relationship to and</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal relationship to and</em>' reference.
	 * @see #getGoal_relationship_to_and()
	 * @generated
	 */
	void setGoal_relationship_to_and(Goal_Relationship value);

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

	/**
	 * Returns the value of the '<em><b>Goal relationship from or</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal_Relationship}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_or <em>Goal from or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship from or</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship_from_or()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_or
	 * @model opposite="goal_from_or"
	 * @generated
	 */
	EList<Goal_Relationship> getGoal_relationship_from_or();

	/**
	 * Returns the value of the '<em><b>Goal relationship to or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_or <em>Goal to or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship to or</em>' reference.
	 * @see #setGoal_relationship_to_or(Goal_Relationship)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship_to_or()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_or
	 * @model opposite="goal_to_or"
	 * @generated
	 */
	Goal_Relationship getGoal_relationship_to_or();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_or <em>Goal relationship to or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal relationship to or</em>' reference.
	 * @see #getGoal_relationship_to_or()
	 * @generated
	 */
	void setGoal_relationship_to_or(Goal_Relationship value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Rol}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Rol#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Rol()
	 * @see prometheus_metamodel_system_specification.Rol#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Rol> getRol();

} // Goal
