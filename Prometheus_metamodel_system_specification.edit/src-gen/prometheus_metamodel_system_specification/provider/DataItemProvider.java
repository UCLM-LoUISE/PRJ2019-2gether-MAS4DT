/**
 */
package prometheus_metamodel_system_specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import prometheus_metamodel_system_specification.Data;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Data} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItemProvider(AdapterFactory adapterFactory) {
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

			addData_typePropertyDescriptor(object);
			addIncluded_fields_aspectsPropertyDescriptor(object);
			addPersistentPropertyDescriptor(object);
			addExternal_to_systemPropertyDescriptor(object);
			addExternal_pathPropertyDescriptor(object);
			addInitialisationPropertyDescriptor(object);
			addUsed_whenPropertyDescriptor(object);
			addScenario_dataPropertyDescriptor(object);
			addAgent_dataPropertyDescriptor(object);
			addRol_dataPropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_data_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_data_type_feature", "_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__DATA_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Included fields aspects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncluded_fields_aspectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_included_fields_aspects_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_included_fields_aspects_feature",
								"_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__INCLUDED_FIELDS_ASPECTS, true,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Persistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_persistent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_persistent_feature", "_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__PERSISTENT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External to system feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternal_to_systemPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_external_to_system_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_external_to_system_feature",
								"_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__EXTERNAL_TO_SYSTEM, true, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternal_pathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_external_path_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_external_path_feature",
								"_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__EXTERNAL_PATH, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initialisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_initialisation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_initialisation_feature",
								"_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__INITIALISATION, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Used when feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsed_whenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_used_when_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_used_when_feature", "_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__USED_WHEN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scenario data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenario_dataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_scenario_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_scenario_data_feature",
								"_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__SCENARIO_DATA, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Agent data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgent_dataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_agent_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_agent_data_feature", "_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__AGENT_DATA, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rol data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRol_dataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_rol_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_rol_data_feature", "_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__ROL_DATA, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Data_message_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Data_message_feature", "_UI_Data_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.DATA__MESSAGE, true, false, true,
						null, null, null));
	}

	/**
	 * This returns Data.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Data"));
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
		String label = ((Data) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Data_type")
				: getString("_UI_Data_type") + " " + label;
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

		switch (notification.getFeatureID(Data.class)) {
		case Prometheus_metamodel_system_specificationPackage.DATA__DATA_TYPE:
		case Prometheus_metamodel_system_specificationPackage.DATA__INCLUDED_FIELDS_ASPECTS:
		case Prometheus_metamodel_system_specificationPackage.DATA__PERSISTENT:
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_TO_SYSTEM:
		case Prometheus_metamodel_system_specificationPackage.DATA__EXTERNAL_PATH:
		case Prometheus_metamodel_system_specificationPackage.DATA__INITIALISATION:
		case Prometheus_metamodel_system_specificationPackage.DATA__USED_WHEN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
