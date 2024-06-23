/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getContext <em>Context</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getSteps <em>Steps</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getVariation <em>Variation</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getScenario <em>Scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getGoals_scenario <em>Goals scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getPriority <em>Priority</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getPercept_scenario <em>Percept scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getModel_scenario <em>Model scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getAction_scenario <em>Action scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getData_scenario <em>Data scenario</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Scenario#getRol_scenario <em>Rol scenario</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends Entity {
	/**
	 * Returns the value of the '<em><b>Physical object</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Physical_Object#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Physical_object()
	 * @see prometheus_metamodel_system_specification.Physical_Object#getScenario
	 * @model opposite="scenario" required="true"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Context#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Context()
	 * @see prometheus_metamodel_system_specification.Context#getScenario
	 * @model opposite="scenario"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Scenario#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Scenario#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variation</em>' attribute.
	 * @see #setVariation(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Variation()
	 * @model
	 * @generated
	 */
	String getVariation();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Scenario#getVariation <em>Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variation</em>' attribute.
	 * @see #getVariation()
	 * @generated
	 */
	void setVariation(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Scenario#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Step}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Step#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Step()
	 * @see prometheus_metamodel_system_specification.Step#getScenario
	 * @model opposite="scenario"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Scenario()
	 * @model
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Percept scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Percept#getScenario_percept <em>Scenario percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Percept_scenario()
	 * @see prometheus_metamodel_system_specification.Percept#getScenario_percept
	 * @model opposite="scenario_percept"
	 * @generated
	 */
	EList<Percept> getPercept_scenario();

	/**
	 * Returns the value of the '<em><b>Model scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Model#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model scenario</em>' container reference.
	 * @see #setModel_scenario(Model)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Model_scenario()
	 * @see prometheus_metamodel_system_specification.Model#getScenarios
	 * @model opposite="scenarios" required="true" transient="false"
	 * @generated
	 */
	Model getModel_scenario();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Scenario#getModel_scenario <em>Model scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model scenario</em>' container reference.
	 * @see #getModel_scenario()
	 * @generated
	 */
	void setModel_scenario(Model value);

	/**
	 * Returns the value of the '<em><b>Action scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Action#getScenario_action <em>Scenario action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Action_scenario()
	 * @see prometheus_metamodel_system_specification.Action#getScenario_action
	 * @model opposite="scenario_action"
	 * @generated
	 */
	EList<Action> getAction_scenario();

	/**
	 * Returns the value of the '<em><b>Rol scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Rol}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Rol#getScenario_rol <em>Scenario rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Rol_scenario()
	 * @see prometheus_metamodel_system_specification.Rol#getScenario_rol
	 * @model opposite="scenario_rol"
	 * @generated
	 */
	EList<Rol> getRol_scenario();

	/**
	 * Returns the value of the '<em><b>Data scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Data}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Data#getScenario_data <em>Scenario data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Data_scenario()
	 * @see prometheus_metamodel_system_specification.Data#getScenario_data
	 * @model opposite="scenario_data"
	 * @generated
	 */
	EList<Data> getData_scenario();

	/**
	 * Returns the value of the '<em><b>Goals scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Goal}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Goal#getScenario_goals <em>Scenario goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getScenario_Goals_scenario()
	 * @see prometheus_metamodel_system_specification.Goal#getScenario_goals
	 * @model opposite="scenario_goals"
	 * @generated
	 */
	EList<Goal> getGoals_scenario();

} // Scenario
