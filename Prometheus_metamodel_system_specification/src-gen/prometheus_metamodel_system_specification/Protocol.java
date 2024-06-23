/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Protocol#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends Entity {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference list.
	 * The list contents are of type {@link prometheus_metamodel_system_specification.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference list.
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getProtocol_Agent()
	 * @model
	 * @generated
	 */
	EList<Agent> getAgent();

} // Protocol
