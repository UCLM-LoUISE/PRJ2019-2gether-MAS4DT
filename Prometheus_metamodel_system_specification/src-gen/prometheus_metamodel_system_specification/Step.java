/**
 */
package prometheus_metamodel_system_specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Step#getType_step <em>Type step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Step#getGoal <em>Goal</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Step#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Step#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Entity {
	/**
	 * Returns the value of the '<em><b>Type step</b></em>' attribute.
	 * The literals are from the enumeration {@link prometheus_metamodel_system_specification.Enum_Type_Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type step</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Type_Step
	 * @see #setType_step(Enum_Type_Step)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getStep_Type_step()
	 * @model required="true"
	 * @generated
	 */
	Enum_Type_Step getType_step();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Step#getType_step <em>Type step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type step</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Type_Step
	 * @see #getType_step()
	 * @generated
	 */
	void setType_step(Enum_Type_Step value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getStep_Goal()
	 * @see prometheus_metamodel_system_specification.Goal#getStep
	 * @model opposite="step"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Step#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Percept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Percept#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' reference.
	 * @see #setPercept(Percept)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getStep_Percept()
	 * @see prometheus_metamodel_system_specification.Percept#getStep
	 * @model opposite="step"
	 * @generated
	 */
	Percept getPercept();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Step#getPercept <em>Percept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percept</em>' reference.
	 * @see #getPercept()
	 * @generated
	 */
	void setPercept(Percept value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getStep_Action()
	 * @see prometheus_metamodel_system_specification.Action#getStep
	 * @model opposite="step"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Step#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Step
