/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_and <em>Goal from and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_and <em>Goal to and</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_or <em>Goal from or</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_or <em>Goal to or</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship()
 * @model
 * @generated
 */
public interface Goal_Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal from and</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_and <em>Goal relationship from and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal from and</em>' reference.
	 * @see #setGoal_from_and(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal_from_and()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_and
	 * @model opposite="goal_relationship_from_and"
	 * @generated
	 */
	Goal getGoal_from_and();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_and <em>Goal from and</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal from and</em>' reference.
	 * @see #getGoal_from_and()
	 * @generated
	 */
	void setGoal_from_and(Goal value);

	/**
	 * Returns the value of the '<em><b>Goal to and</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_and <em>Goal relationship to and</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal to and</em>' reference.
	 * @see #setGoal_to_and(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal_to_and()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_and
	 * @model opposite="goal_relationship_to_and"
	 * @generated
	 */
	Goal getGoal_to_and();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_and <em>Goal to and</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal to and</em>' reference.
	 * @see #getGoal_to_and()
	 * @generated
	 */
	void setGoal_to_and(Goal value);

	/**
	 * Returns the value of the '<em><b>Goal from or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_or <em>Goal relationship from or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal from or</em>' reference.
	 * @see #setGoal_from_or(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal_from_or()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_from_or
	 * @model opposite="goal_relationship_from_or"
	 * @generated
	 */
	Goal getGoal_from_or();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from_or <em>Goal from or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal from or</em>' reference.
	 * @see #getGoal_from_or()
	 * @generated
	 */
	void setGoal_from_or(Goal value);

	/**
	 * Returns the value of the '<em><b>Goal to or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_or <em>Goal relationship to or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal to or</em>' reference.
	 * @see #setGoal_to_or(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal_to_or()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_to_or
	 * @model opposite="goal_relationship_to_or"
	 * @generated
	 */
	Goal getGoal_to_or();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to_or <em>Goal to or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal to or</em>' reference.
	 * @see #getGoal_to_or()
	 * @generated
	 */
	void setGoal_to_or(Goal value);

} // Goal_Relationship
