/**
 */
package prometheus_metamodel_system_specification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prometheus_metamodel_system_specification.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Attribute#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link prometheus_metamodel_system_specification.Attribute#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link prometheus_metamodel_system_specification.Enum_Types}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Types
	 * @see #setType(Enum_Types)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	Enum_Types getType();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Types
	 * @see #getType()
	 * @generated
	 */
	void setType(Enum_Types value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link prometheus_metamodel_system_specification.Enum_Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Visibility
	 * @see #setVisibility(Enum_Visibility)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAttribute_Visibility()
	 * @model required="true"
	 * @generated
	 */
	Enum_Visibility getVisibility();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Attribute#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see prometheus_metamodel_system_specification.Enum_Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Enum_Visibility value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage#getAttribute_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link prometheus_metamodel_system_specification.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Attribute
