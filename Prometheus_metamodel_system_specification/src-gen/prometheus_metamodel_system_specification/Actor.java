/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Actor#getAction <em>Action</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Actor#getPercept <em>Percept</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Actor#getPhysical_object <em>Physical object</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Actor#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Entity {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getActor_Action()
	 * @model
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Percept</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Percept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percept</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getActor_Percept()
	 * @model
	 * @generated
	 */
	EList<Percept> getPercept();

	/**
	 * Returns the value of the '<em><b>Physical object</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Physical_Object}.
	 * It is bidirectional and its opposite is '{@link prometheus_metamodel_system_specification.Physical_Object#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical object</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getActor_Physical_object()
	 * @see prometheus_metamodel_system_specification.Physical_Object#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	EList<Physical_Object> getPhysical_object();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getActor_Scenario()
	 * @model
	 * @generated
	 */
	EList<Scenario> getScenario();

} // Actor
