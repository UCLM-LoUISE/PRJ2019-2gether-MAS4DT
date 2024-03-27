/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getFunctionality <em>Functionality</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getParameters <em>Parameters</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getDuration <em>Duration</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getFailure <em>Failure</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getPartial_change <em>Partial change</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getSide_effects <em>Side effects</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Action#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Entity {
	/**
	 * Returns the value of the '<em><b>Functionality</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Functionality}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Functionality#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionality</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Functionality()
	 * @see prometheus_metamodel_system_specification.Functionality#getAction
	 * @model opposite="action" required="true"
	 * @generated
	 */
	EList<Functionality> getFunctionality();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Action#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Action#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see #setFailure(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Failure()
	 * @model
	 * @generated
	 */
	String getFailure();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Action#getFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' attribute.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(String value);

	/**
	 * Returns the value of the '<em><b>Partial change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial change</em>' attribute.
	 * @see #setPartial_change(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Partial_change()
	 * @model
	 * @generated
	 */
	String getPartial_change();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Action#getPartial_change <em>Partial change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial change</em>' attribute.
	 * @see #getPartial_change()
	 * @generated
	 */
	void setPartial_change(String value);

	/**
	 * Returns the value of the '<em><b>Side effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side effects</em>' attribute.
	 * @see #setSide_effects(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Side_effects()
	 * @model
	 * @generated
	 */
	String getSide_effects();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Action#getSide_effects <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side effects</em>' attribute.
	 * @see #getSide_effects()
	 * @generated
	 */
	void setSide_effects(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Step#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(Step)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAction_Step()
	 * @see prometheus_metamodel_system_specification.Step#getAction
	 * @model opposite="action"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Action#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

} // Action
