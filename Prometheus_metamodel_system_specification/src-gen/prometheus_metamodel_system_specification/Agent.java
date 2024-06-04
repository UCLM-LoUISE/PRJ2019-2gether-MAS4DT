/**
 */
package prometheus_metamodel_system_specification;

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

} // Agent
