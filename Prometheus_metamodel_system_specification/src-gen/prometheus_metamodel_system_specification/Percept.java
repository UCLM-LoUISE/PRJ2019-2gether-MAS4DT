/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getInformation_carried <em>Information carried</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getKnowledge_updated <em>Knowledge updated</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getSource <em>Source</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getProcessing <em>Processing</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getExpected_frequency <em>Expected frequency</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#isExternal_to_system <em>External to system</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getExternal_path <em>External path</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getStep <em>Step</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getRol <em>Rol</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Percept#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept()
 * @model
 * @generated
 */
public interface Percept extends Entity {
	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Functionality}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Functionality#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Functionality()
	 * @see prometheus_metamodel_system_specification.Functionality#getPercept
	 * @model opposite="percept" required="true"
	 * @generated
	 */
	EList<Functionality> getFunctionality();

	/**
	 * Returns the value of the '<em><b>Information carried</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information carried</em>' attribute.
	 * @see #setInformation_carried(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Information_carried()
	 * @model
	 * @generated
	 */
	String getInformation_carried();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#getInformation_carried <em>Information carried</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information carried</em>' attribute.
	 * @see #getInformation_carried()
	 * @generated
	 */
	void setInformation_carried(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge updated</em>' attribute.
	 * @see #setKnowledge_updated(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Knowledge_updated()
	 * @model
	 * @generated
	 */
	String getKnowledge_updated();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#getKnowledge_updated <em>Knowledge updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge updated</em>' attribute.
	 * @see #getKnowledge_updated()
	 * @generated
	 */
	void setKnowledge_updated(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' attribute.
	 * @see #setProcessing(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Processing()
	 * @model
	 * @generated
	 */
	String getProcessing();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#getProcessing <em>Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing</em>' attribute.
	 * @see #getProcessing()
	 * @generated
	 */
	void setProcessing(String value);

	/**
	 * Returns the value of the '<em><b>Expected frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected frequency</em>' attribute.
	 * @see #setExpected_frequency(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Expected_frequency()
	 * @model
	 * @generated
	 */
	String getExpected_frequency();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#getExpected_frequency <em>Expected frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected frequency</em>' attribute.
	 * @see #getExpected_frequency()
	 * @generated
	 */
	void setExpected_frequency(String value);

	/**
	 * Returns the value of the '<em><b>External to system</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External to system</em>' attribute.
	 * @see #setExternal_to_system(boolean)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_External_to_system()
	 * @model
	 * @generated
	 */
	boolean isExternal_to_system();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#isExternal_to_system <em>External to system</em>}' attribute.
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
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_External_path()
	 * @model
	 * @generated
	 */
	String getExternal_path();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Percept#getExternal_path <em>External path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External path</em>' attribute.
	 * @see #getExternal_path()
	 * @generated
	 */
	void setExternal_path(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Step}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Step#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Step()
	 * @see prometheus_metamodel_system_specification.Step#getPercept
	 * @model opposite="percept"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Rol}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Rol#getPercept <em>Percept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Rol()
	 * @see prometheus_metamodel_system_specification.Rol#getPercept
	 * @model opposite="percept"
	 * @generated
	 */
	EList<Rol> getRol();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getPercept_Scenario()
	 * @model
	 * @generated
	 */
	EList<Scenario> getScenario();

} // Percept
