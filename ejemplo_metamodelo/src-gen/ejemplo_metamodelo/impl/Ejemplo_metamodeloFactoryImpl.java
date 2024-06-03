/**
 */
package ejemplo_metamodelo.impl;

import ejemplo_metamodelo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ejemplo_metamodeloFactoryImpl extends EFactoryImpl implements Ejemplo_metamodeloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ejemplo_metamodeloFactory init() {
		try {
			Ejemplo_metamodeloFactory theEjemplo_metamodeloFactory = (Ejemplo_metamodeloFactory) EPackage.Registry.INSTANCE
					.getEFactory(Ejemplo_metamodeloPackage.eNS_URI);
			if (theEjemplo_metamodeloFactory != null) {
				return theEjemplo_metamodeloFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ejemplo_metamodeloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ejemplo_metamodeloFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Ejemplo_metamodeloPackage.ENTIDAD:
			return createEntidad();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entidad createEntidad() {
		EntidadImpl entidad = new EntidadImpl();
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ejemplo_metamodeloPackage getEjemplo_metamodeloPackage() {
		return (Ejemplo_metamodeloPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ejemplo_metamodeloPackage getPackage() {
		return Ejemplo_metamodeloPackage.eINSTANCE;
	}

} //Ejemplo_metamodeloFactoryImpl
