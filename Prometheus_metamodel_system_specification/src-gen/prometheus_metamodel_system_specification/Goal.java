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
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship <em>Goal relationship</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Goal#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Entity {
	/**
	 * Returns the value of the '<em><b>Goal relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal_Relationship#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal relationship</em>' reference.
	 * @see #setGoal_relationship(Goal_Relationship)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Goal_relationship()
	 * @see prometheus_metamodel_system_specification.Goal_Relationship#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	Goal_Relationship getGoal_relationship();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Goal#getGoal_relationship <em>Goal relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal relationship</em>' reference.
	 * @see #getGoal_relationship()
	 * @generated
	 */
	void setGoal_relationship(Goal_Relationship value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getGoal_Scenario()
	 * @see prometheus_metamodel_system_specification.Scenario#getGoal
	 * @model opposite="goal" required="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

} // Goal
