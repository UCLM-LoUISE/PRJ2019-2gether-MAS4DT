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

import prometheus_metamodel_system_specification.Percept;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Percept} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerceptItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerceptItemProvider(AdapterFactory adapterFactory) {
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
			addFunctionalityPropertyDescriptor(object);
			addInformation_carriedPropertyDescriptor(object);
			addKnowledge_updatedPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addProcessingPropertyDescriptor(object);
			addExpected_frequencyPropertyDescriptor(object);
			addExternal_to_systemPropertyDescriptor(object);
			addExternal_pathPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Percept_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_scenario_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__SCENARIO, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Functionality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Percept_functionality_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_functionality_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__FUNCTIONALITY, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Information carried feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInformation_carriedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Percept_information_carried_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_information_carried_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__INFORMATION_CARRIED, true,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Knowledge updated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKnowledge_updatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Percept_knowledge_updated_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_knowledge_updated_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__KNOWLEDGE_UPDATED, true,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Percept_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_source_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__SOURCE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Processing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Percept_processing_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_processing_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__PROCESSING, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expected frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpected_frequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Percept_expected_frequency_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_expected_frequency_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__EXPECTED_FREQUENCY, true,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Percept_external_to_system_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_external_to_system_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__EXTERNAL_TO_SYSTEM, true,
						false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Percept_external_path_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Percept_external_path_feature",
								"_UI_Percept_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.PERCEPT__EXTERNAL_PATH, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Percept.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Percept"));
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
		String label = ((Percept) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Percept_type")
				: getString("_UI_Percept_type") + " " + label;
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

		switch (notification.getFeatureID(Percept.class)) {
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__INFORMATION_CARRIED:
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__KNOWLEDGE_UPDATED:
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__SOURCE:
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__PROCESSING:
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXPECTED_FREQUENCY:
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_TO_SYSTEM:
		case Prometheus_metamodel_system_specificationPackage.PERCEPT__EXTERNAL_PATH:
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
