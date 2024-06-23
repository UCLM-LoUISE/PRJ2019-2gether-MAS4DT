/**
 */
package ejemplo_metamodelo.impl;

import ejemplo_metamodelo.Ejemplo_metamodeloFactory;
import ejemplo_metamodelo.Ejemplo_metamodeloPackage;
import ejemplo_metamodelo.Entidad;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ejemplo_metamodeloPackageImpl extends EPackageImpl implements Ejemplo_metamodeloPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ejemplo_metamodelo.Ejemplo_metamodeloPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ejemplo_metamodeloPackageImpl() {
		super(eNS_URI, Ejemplo_metamodeloFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Ejemplo_metamodeloPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ejemplo_metamodeloPackage init() {
		if (isInited)
			return (Ejemplo_metamodeloPackage) EPackage.Registry.INSTANCE
					.getEPackage(Ejemplo_metamodeloPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEjemplo_metamodeloPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ejemplo_metamodeloPackageImpl theEjemplo_metamodeloPackage = registeredEjemplo_metamodeloPackage instanceof Ejemplo_metamodeloPackageImpl
				? (Ejemplo_metamodeloPackageImpl) registeredEjemplo_metamodeloPackage
				: new Ejemplo_metamodeloPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEjemplo_metamodeloPackage.createPackageContents();

		// Initialize created meta-data
		theEjemplo_metamodeloPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEjemplo_metamodeloPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ejemplo_metamodeloPackage.eNS_URI, theEjemplo_metamodeloPackage);
		return theEjemplo_metamodeloPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ejemplo_metamodeloFactory getEjemplo_metamodeloFactory() {
		return (Ejemplo_metamodeloFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		entidadEClass = createEClass(ENTIDAD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Ejemplo_metamodeloPackageImpl
