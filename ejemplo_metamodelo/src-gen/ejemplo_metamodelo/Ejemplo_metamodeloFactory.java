/**
 */
package ejemplo_metamodelo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ejemplo_metamodelo.Ejemplo_metamodeloPackage
 * @generated
 */
public interface Ejemplo_metamodeloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ejemplo_metamodeloFactory eINSTANCE = ejemplo_metamodelo.impl.Ejemplo_metamodeloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad</em>'.
	 * @generated
	 */
	Entidad createEntidad();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ejemplo_metamodeloPackage getEjemplo_metamodeloPackage();

} //Ejemplo_metamodeloFactory
