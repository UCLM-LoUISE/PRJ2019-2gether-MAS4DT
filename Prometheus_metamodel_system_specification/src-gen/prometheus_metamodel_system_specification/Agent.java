/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getMinimum_cardinality <em>Minimum cardinality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getMaximum_cardinality <em>Maximum cardinality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getDemise <em>Demise</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getData_agent <em>Data agent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getRol <em>Rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getMessage_agent <em>Message agent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getAction_agent <em>Action agent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getModel <em>Model</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getPercept_agent <em>Percept agent</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Agent#getCapability_agent <em>Capability agent</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Entity {
	/**
	 * Returns the value of the '<em><b>Minimum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum cardinality</em>' attribute.
	 * @see #setMinimum_cardinality(int)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Minimum_cardinality()
	 * @model
	 * @generated
	 */
	int getMinimum_cardinality();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Agent#getMinimum_cardinality <em>Minimum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum cardinality</em>' attribute.
	 * @see #getMinimum_cardinality()
	 * @generated
	 */
	void setMinimum_cardinality(int value);

	/**
	 * Returns the value of the '<em><b>Maximum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum cardinality</em>' attribute.
	 * @see #setMaximum_cardinality(int)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Maximum_cardinality()
	 * @model
	 * @generated
	 */
	int getMaximum_cardinality();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Agent#getMaximum_cardinality <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum cardinality</em>' attribute.
	 * @see #getMaximum_cardinality()
	 * @generated
	 */
	void setMaximum_cardinality(int value);

	/**
	 * Returns the value of the '<em><b>Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifetime</em>' attribute.
	 * @see #setLifetime(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Lifetime()
	 * @model
	 * @generated
	 */
	String getLifetime();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Agent#getLifetime <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime</em>' attribute.
	 * @see #getLifetime()
	 * @generated
	 */
	void setLifetime(String value);

	/**
	 * Returns the value of the '<em><b>Initialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialisation</em>' attribute.
	 * @see #setInitialisation(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Initialisation()
	 * @model
	 * @generated
	 */
	String getInitialisation();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Agent#getInitialisation <em>Initialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialisation</em>' attribute.
	 * @see #getInitialisation()
	 * @generated
	 */
	void setInitialisation(String value);

	/**
	 * Returns the value of the '<em><b>Demise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demise</em>' attribute.
	 * @see #setDemise(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Demise()
	 * @model
	 * @generated
	 */
	String getDemise();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Agent#getDemise <em>Demise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demise</em>' attribute.
	 * @see #getDemise()
	 * @generated
	 */
	void setDemise(String value);

	/**
	 * Returns the value of the '<em><b>Data agent</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Data}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Data#getAgent_data <em>Agent data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data agent</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Data_agent()
	 * @see prometheus_metamodel_system_specification.Data#getAgent_data
	 * @model opposite="agent_data"
	 * @generated
	 */
	EList<Data> getData_agent();

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Rol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Rol()
	 * @model
	 * @generated
	 */
	EList<Rol> getRol();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Protocol()
	 * @model
	 * @generated
	 */
	EList<Protocol> getProtocol();

	/**
	 * Returns the value of the '<em><b>Message agent</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Message}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Message#getAgent_message <em>Agent message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message agent</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Message_agent()
	 * @see prometheus_metamodel_system_specification.Message#getAgent_message
	 * @model opposite="agent_message"
	 * @generated
	 */
	EList<Message> getMessage_agent();

	/**
	 * Returns the value of the '<em><b>Action agent</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Action#getAgent_action <em>Agent action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action agent</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Action_agent()
	 * @see prometheus_metamodel_system_specification.Action#getAgent_action
	 * @model opposite="agent_action"
	 * @generated
	 */
	EList<Action> getAction_agent();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Model#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Model()
	 * @see prometheus_metamodel_system_specification.Model#getAgents
	 * @model opposite="agents" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Agent#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Percept agent</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Percept#getAgent_percept <em>Agent percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept agent</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Percept_agent()
	 * @see prometheus_metamodel_system_specification.Percept#getAgent_percept
	 * @model opposite="agent_percept"
	 * @generated
	 */
	EList<Percept> getPercept_agent();

	/**
	 * Returns the value of the '<em><b>Capability agent</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Capability}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Capability#getAgent_capability <em>Agent capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability agent</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAgent_Capability_agent()
	 * @see prometheus_metamodel_system_specification.Capability#getAgent_capability
	 * @model opposite="agent_capability"
	 * @generated
	 */
	EList<Capability> getCapability_agent();

} // Agent
