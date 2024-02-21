/**
 */
package prometheus_metamodel_system_specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import prometheus_metamodel_system_specification.Model;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationFactory;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__PERCEPT);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__ACTION);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__CONTEXT);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__GOAL);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__GOAL_RELATIONSHIP);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__SCENARIO);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__PHYSICAL_OBJECT);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__LOGICAL_OBJECT);
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__FUNCTIONALITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Model_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
		case Prometheus_metamodel_system_specificationPackage.MODEL__PERCEPT:
		case Prometheus_metamodel_system_specificationPackage.MODEL__ACTION:
		case Prometheus_metamodel_system_specificationPackage.MODEL__CONTEXT:
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL:
		case Prometheus_metamodel_system_specificationPackage.MODEL__GOAL_RELATIONSHIP:
		case Prometheus_metamodel_system_specificationPackage.MODEL__SCENARIO:
		case Prometheus_metamodel_system_specificationPackage.MODEL__PHYSICAL_OBJECT:
		case Prometheus_metamodel_system_specificationPackage.MODEL__LOGICAL_OBJECT:
		case Prometheus_metamodel_system_specificationPackage.MODEL__FUNCTIONALITY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__PERCEPT,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createPercept()));

		newChildDescriptors
				.add(createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__ACTION,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createAction()));

		newChildDescriptors
				.add(createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__CONTEXT,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createContext()));

		newChildDescriptors
				.add(createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__GOAL,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add(
				createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__GOAL_RELATIONSHIP,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createGoal_Relationship()));

		newChildDescriptors
				.add(createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__SCENARIO,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add(
				createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__PHYSICAL_OBJECT,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createPhysical_Object()));

		newChildDescriptors.add(
				createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__LOGICAL_OBJECT,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createLogical_Object()));

		newChildDescriptors.add(
				createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.MODEL__FUNCTIONALITY,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createFunctionality()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Prometheus_metamodel_system_specificationEditPlugin.INSTANCE;
	}

}
