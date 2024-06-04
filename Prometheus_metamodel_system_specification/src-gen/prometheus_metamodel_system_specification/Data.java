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

} // Data
