/**
 */
package prometheus_metamodel_system_specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import prometheus_metamodel_system_specification.Physical_Object;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Physical_Object} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Physical_ObjectItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physical_ObjectItemProvider(AdapterFactory adapterFactory) {
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

			addScenarioPropertyDescriptor(object);
			addLogical_object_shadowPropertyDescriptor(object);
			addLogical_object_twinPropertyDescriptor(object);
			addPhysical_objectPropertyDescriptor(object);
			addPerceptPropertyDescriptor(object);
			addActorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Physical_Object_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Physical_Object_scenario_feature",
								"_UI_Physical_Object_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT__SCENARIO, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Logical object shadow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogical_object_shadowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Physical_Object_logical_object_shadow_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Physical_Object_logical_object_shadow_feature",
						"_UI_Physical_Object_type"),
				Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT__LOGICAL_OBJECT_SHADOW, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Logical object twin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogical_object_twinPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Physical_Object_logical_object_twin_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Physical_Object_logical_object_twin_feature", "_UI_Physical_Object_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT__LOGICAL_OBJECT_TWIN,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Physical object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysical_objectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Physical_Object_physical_object_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Physical_Object_physical_object_feature",
								"_UI_Physical_Object_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT__PHYSICAL_OBJECT,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Percept feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerceptPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Physical_Object_percept_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Physical_Object_percept_feature",
								"_UI_Physical_Object_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT__PERCEPT, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Actor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Physical_Object_actor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Physical_Object_actor_feature",
								"_UI_Physical_Object_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PHYSICAL_OBJECT__ACTOR, true, false,
						true, null, null, null));
	}

	/**
	 * This returns Physical_Object.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Physical_Object"));
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
		String label = ((Physical_Object) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Physical_Object_type")
				: getString("_UI_Physical_Object_type") + " " + label;
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
	}

}
