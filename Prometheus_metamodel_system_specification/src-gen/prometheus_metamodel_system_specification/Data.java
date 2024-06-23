/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getData_type <em>Data type</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getIncluded_fields_aspects <em>Included fields aspects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#isExternal_to_system <em>External to system</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getExternal_path <em>External path</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getUsed_when <em>Used when</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getScenario_data <em>Scenario data</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getAgent_data <em>Agent data</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getRol_data <em>Rol data</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getMessage <em>Message</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getCapability_data <em>Capability data</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Data#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData()
 * @model
 * @generated
 */
public interface Data extends Entity {
	/**
	 * Returns the value of the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data type</em>' attribute.
	 * @see #setData_type(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Data_type()
	 * @model
	 * @generated
	 */
	String getData_type();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#getData_type <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data type</em>' attribute.
	 * @see #getData_type()
	 * @generated
	 */
	void setData_type(String value);

	/**
	 * Returns the value of the '<em><b>Included fields aspects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included fields aspects</em>' attribute.
	 * @see #setIncluded_fields_aspects(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Included_fields_aspects()
	 * @model
	 * @generated
	 */
	String getIncluded_fields_aspects();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#getIncluded_fields_aspects <em>Included fields aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included fields aspects</em>' attribute.
	 * @see #getIncluded_fields_aspects()
	 * @generated
	 */
	void setIncluded_fields_aspects(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External to system</em>' attribute.
	 * @see #setExternal_to_system(boolean)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_External_to_system()
	 * @model
	 * @generated
	 */
	boolean isExternal_to_system();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#isExternal_to_system <em>External to system</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External to system</em>' attribute.
	 * @see #isExternal_to_system()
	 * @generated
	 */
	void setExternal_to_system(boolean value);

	/**
	 * Returns the value of the '<em><b>External path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External path</em>' attribute.
	 * @see #setExternal_path(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_External_path()
	 * @model
	 * @generated
	 */
	String getExternal_path();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#getExternal_path <em>External path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External path</em>' attribute.
	 * @see #getExternal_path()
	 * @generated
	 */
	void setExternal_path(String value);

	/**
	 * Returns the value of the '<em><b>Initialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialisation</em>' attribute.
	 * @see #setInitialisation(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Initialisation()
	 * @model
	 * @generated
	 */
	String getInitialisation();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#getInitialisation <em>Initialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialisation</em>' attribute.
	 * @see #getInitialisation()
	 * @generated
	 */
	void setInitialisation(String value);

	/**
	 * Returns the value of the '<em><b>Used when</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used when</em>' attribute.
	 * @see #setUsed_when(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Used_when()
	 * @model
	 * @generated
	 */
	String getUsed_when();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Data#getUsed_when <em>Used when</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used when</em>' attribute.
	 * @see #getUsed_when()
	 * @generated
	 */
	void setUsed_when(String value);

	/**
	 * Returns the value of the '<em><b>Scenario data</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Scenario#getData_scenario <em>Data scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario data</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Scenario_data()
	 * @see prometheus_metamodel_system_specification.Scenario#getData_scenario
	 * @model opposite="data_scenario"
	 * @generated
	 */
	EList<Scenario> getScenario_data();

	/**
	 * Returns the value of the '<em><b>Agent data</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Agent}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Agent#getData_agent <em>Data agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent data</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Agent_data()
	 * @see prometheus_metamodel_system_specification.Agent#getData_agent
	 * @model opposite="data_agent"
	 * @generated
	 */
	EList<Agent> getAgent_data();

	/**
	 * Returns the value of the '<em><b>Rol data</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Rol}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Rol#getData_rol <em>Data rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol data</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Rol_data()
	 * @see prometheus_metamodel_system_specification.Rol#getData_rol
	 * @model opposite="data_rol"
	 * @generated
	 */
	EList<Rol> getRol_data();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Message()
	 * @model
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Capability data</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Capability}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Capability#getData_capability <em>Data capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability data</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Capability_data()
	 * @see prometheus_metamodel_system_specification.Capability#getData_capability
	 * @model opposite="data_capability"
	 * @generated
	 */
	EList<Capability> getCapability_data();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getData_Capability()
	 * @model
	 * @generated
	 */
	EList<Capability> getCapability();

} // Data
