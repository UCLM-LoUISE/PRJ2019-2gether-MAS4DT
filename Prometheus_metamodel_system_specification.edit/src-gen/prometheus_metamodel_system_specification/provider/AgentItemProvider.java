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

import prometheus_metamodel_system_specification.Agent;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Agent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentItemProvider(AdapterFactory adapterFactory) {
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

			addMinimum_cardinalityPropertyDescriptor(object);
			addMaximum_cardinalityPropertyDescriptor(object);
			addLifetimePropertyDescriptor(object);
			addInitialisationPropertyDescriptor(object);
			addDemisePropertyDescriptor(object);
			addData_agentPropertyDescriptor(object);
			addRolPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addMessage_agentPropertyDescriptor(object);
			addAction_agentPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addPercept_agentPropertyDescriptor(object);
			addCapability_agentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Minimum cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimum_cardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_minimum_cardinality_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_minimum_cardinality_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__MINIMUM_CARDINALITY, true,
						false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Maximum cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximum_cardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_maximum_cardinality_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_maximum_cardinality_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__MAXIMUM_CARDINALITY, true,
						false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lifetime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifetimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_lifetime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_lifetime_feature", "_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__LIFETIME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Agent_initialisation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_initialisation_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__INITIALISATION, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Demise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDemisePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_demise_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_demise_feature", "_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__DEMISE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data agent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_agentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_data_agent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_data_agent_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__DATA_AGENT, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_rol_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_rol_feature", "_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__ROL, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_protocol_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_protocol_feature", "_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__PROTOCOL, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Message agent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessage_agentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_message_agent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_message_agent_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__MESSAGE_AGENT, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Action agent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAction_agentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_action_agent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_action_agent_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__ACTION_AGENT, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_model_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_model_feature", "_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__MODEL, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Percept agent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercept_agentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_percept_agent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_percept_agent_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__PERCEPT_AGENT, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Capability agent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapability_agentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Agent_capability_agent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Agent_capability_agent_feature",
								"_UI_Agent_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.AGENT__CAPABILITY_AGENT, true, false,
						true, null, null, null));
	}

	/**
	 * This returns Agent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Agent"));
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
		String label = ((Agent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Agent_type")
				: getString("_UI_Agent_type") + " " + label;
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

		switch (notification.getFeatureID(Agent.class)) {
		case Prometheus_metamodel_system_specificationPackage.AGENT__MINIMUM_CARDINALITY:
		case Prometheus_metamodel_system_specificationPackage.AGENT__MAXIMUM_CARDINALITY:
		case Prometheus_metamodel_system_specificationPackage.AGENT__LIFETIME:
		case Prometheus_metamodel_system_specificationPackage.AGENT__INITIALISATION:
		case Prometheus_metamodel_system_specificationPackage.AGENT__DEMISE:
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
