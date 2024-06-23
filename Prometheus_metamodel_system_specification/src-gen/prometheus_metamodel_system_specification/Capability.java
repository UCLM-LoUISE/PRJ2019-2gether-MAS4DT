/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Capability#getAgent_capability <em>Agent capability</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Capability#getData_capability <em>Data capability</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Capability#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Capability#getMessage <em>Message</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Capability#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends Entity {
	/**
	 * Returns the value of the '<em><b>Agent capability</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Agent}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Agent#getCapability_agent <em>Capability agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent capability</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getCapability_Agent_capability()
	 * @see prometheus_metamodel_system_specification.Agent#getCapability_agent
	 * @model opposite="capability_agent"
	 * @generated
	 */
	EList<Agent> getAgent_capability();

	/**
	 * Returns the value of the '<em><b>Data capability</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Data}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Data#getCapability_data <em>Capability data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data capability</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getCapability_Data_capability()
	 * @see prometheus_metamodel_system_specification.Data#getCapability_data
	 * @model opposite="capability_data"
	 * @generated
	 */
	EList<Data> getData_capability();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getCapability_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Capability#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getCapability_Message()
	 * @model
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getCapability_Data()
	 * @model
	 * @generated
	 */
	EList<Data> getData();

} // Capability
