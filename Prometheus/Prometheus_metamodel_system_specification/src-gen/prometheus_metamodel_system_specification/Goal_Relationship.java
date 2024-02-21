/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getSubgoals <em>Subgoals</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getType_of_relationship <em>Type of relationship</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship()
 * @model
 * @generated
 */
public interface Goal_Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship <em>Goal relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship
	 * @model opposite="goal_relationship" required="true"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Subgoals</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgoals</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Subgoals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal> getSubgoals();

	/**
	 * Returns the value of the '<em><b>Type of relationship</b></em>' attribute.
	 * The literals are from the enumeration {@link prometheus_metamodel_system_specification.Enum_Type_of_Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type of relationship</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Type_of_Relationship
	 * @see #setType_of_relationship(Enum_Type_of_Relationship)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Type_of_relationship()
	 * @model dataType="prometheus_metamodel_system_specification.Enum_Type_of_Relationship"
	 * @generated
	 */
	Enum_Type_of_Relationship getType_of_relationship();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getType_of_relationship <em>Type of relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type of relationship</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Type_of_Relationship
	 * @see #getType_of_relationship()
	 * @generated
	 */
	void setType_of_relationship(Enum_Type_of_Relationship value);

} // Goal_Relationship
