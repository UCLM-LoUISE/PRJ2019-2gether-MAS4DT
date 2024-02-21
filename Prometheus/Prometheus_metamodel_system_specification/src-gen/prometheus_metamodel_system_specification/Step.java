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

} // Step
