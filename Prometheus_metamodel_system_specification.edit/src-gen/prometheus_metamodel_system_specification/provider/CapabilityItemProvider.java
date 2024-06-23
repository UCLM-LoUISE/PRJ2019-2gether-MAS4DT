/**
 */
package prometheus_metamodel_system_specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import prometheus_metamodel_system_specification.Capability;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Capability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityItemProvider(AdapterFactory adapterFactory) {
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

			addAgent_capabilityPropertyDescriptor(object);
			addData_capabilityPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
			addDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Agent capability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgent_capabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capability_agent_capability_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capability_agent_capability_feature",
								"_UI_Capability_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.CAPABILITY__AGENT_CAPABILITY, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data capability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_capabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capability_data_capability_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capability_data_capability_feature",
								"_UI_Capability_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.CAPABILITY__DATA_CAPABILITY, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capability_action_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capability_action_feature",
								"_UI_Capability_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.CAPABILITY__ACTION, true, false, true,
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
						getResourceLocator(), getString("_UI_Capability_message_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capability_message_feature",
								"_UI_Capability_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.CAPABILITY__MESSAGE, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Capability_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Capability_data_feature",
								"_UI_Capability_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.CAPABILITY__DATA, true, false, true,
						null, null, null));
	}

	/**
	 * This returns Capability.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Capability"));
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
		String label = ((Capability) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Capability_type")
				: getString("_UI_Capability_type") + " " + label;
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
