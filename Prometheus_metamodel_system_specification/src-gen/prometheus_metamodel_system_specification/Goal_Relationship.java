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
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getType_of_relationship <em>Type of relationship</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from <em>Goal from</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to <em>Goal to</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship()
 * @model
 * @generated
 */
public interface Goal_Relationship extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Goal from</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_from <em>Goal relationship from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal from</em>' reference.
	 * @see #setGoal_from(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal_from()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_from
	 * @model opposite="goal_relationship_from"
	 * @generated
	 */
	Goal getGoal_from();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_from <em>Goal from</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal from</em>' reference.
	 * @see #getGoal_from()
	 * @generated
	 */
	void setGoal_from(Goal value);

	/**
	 * Returns the value of the '<em><b>Goal to</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship_to <em>Goal relationship to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal to</em>' reference.
	 * @see #setGoal_to(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Relationship_Goal_to()
	 * @see prometheus_metamodel_system_specification.Goal#getGoal_relationship_to
	 * @model opposite="goal_relationship_to"
	 * @generated
	 */
	Goal getGoal_to();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal_to <em>Goal to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal to</em>' reference.
	 * @see #getGoal_to()
	 * @generated
	 */
	void setGoal_to(Goal value);

} // Goal_Relationship
