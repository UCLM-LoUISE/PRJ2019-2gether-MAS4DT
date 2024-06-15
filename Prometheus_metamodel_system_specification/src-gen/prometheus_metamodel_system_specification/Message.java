/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Message#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Message#getCarried_information <em>Carried information</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Message#getExternal_path <em>External path</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Message#isExternal_to_system <em>External to system</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Message#getAgent_message <em>Agent message</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends Entity {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getMessage_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Message#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Carried information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carried information</em>' attribute.
	 * @see #setCarried_information(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getMessage_Carried_information()
	 * @model
	 * @generated
	 */
	String getCarried_information();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Message#getCarried_information <em>Carried information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carried information</em>' attribute.
	 * @see #getCarried_information()
	 * @generated
	 */
	void setCarried_information(String value);

	/**
	 * Returns the value of the '<em><b>External path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External path</em>' attribute.
	 * @see #setExternal_path(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getMessage_External_path()
	 * @model
	 * @generated
	 */
	String getExternal_path();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Message#getExternal_path <em>External path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External path</em>' attribute.
	 * @see #getExternal_path()
	 * @generated
	 */
	void setExternal_path(String value);

	/**
	 * Returns the value of the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External to system</em>' attribute.
	 * @see #setExternal_to_system(boolean)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getMessage_External_to_system()
	 * @model
	 * @generated
	 */
	boolean isExternal_to_system();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Message#isExternal_to_system <em>External to system</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External to system</em>' attribute.
	 * @see #isExternal_to_system()
	 * @generated
	 */
	void setExternal_to_system(boolean value);

	/**
	 * Returns the value of the '<em><b>Agent message</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Agent}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Agent#getMessage_agent <em>Message agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent message</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getMessage_Agent_message()
	 * @see prometheus_metamodel_system_specification.Agent#getMessage_agent
	 * @model opposite="message_agent"
	 * @generated
	 */
	EList<Agent> getAgent_message();

} // Message
