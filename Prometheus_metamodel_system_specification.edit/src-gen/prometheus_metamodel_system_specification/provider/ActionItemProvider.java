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

import prometheus_metamodel_system_specification.Action;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Action} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionItemProvider(AdapterFactory adapterFactory) {
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

			addParametersPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addFailurePropertyDescriptor(object);
			addPartial_changePropertyDescriptor(object);
			addSide_effectsPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
			addActorPropertyDescriptor(object);
			addPhysical_objectPropertyDescriptor(object);
			addRolPropertyDescriptor(object);
			addScenario_actionPropertyDescriptor(object);
			addAgent_actionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_parameters_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_parameters_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__PARAMETERS, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_duration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_duration_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__DURATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_failure_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_failure_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__FAILURE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Partial change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartial_changePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_partial_change_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_partial_change_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__PARTIAL_CHANGE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Side effects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSide_effectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_side_effects_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_side_effects_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__SIDE_EFFECTS, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_step_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_step_feature", "_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__STEP, true, false, true, null,
						null, null));
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
						getResourceLocator(), getString("_UI_Action_actor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_actor_feature", "_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__ACTOR, true, false, true,
						null, null, null));
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
						getResourceLocator(), getString("_UI_Action_physical_object_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_physical_object_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__PHYSICAL_OBJECT, true, false,
						true, null, null, null));
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
						getResourceLocator(), getString("_UI_Action_rol_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_rol_feature", "_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__ROL, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Scenario action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenario_actionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_scenario_action_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_scenario_action_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__SCENARIO_ACTION, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Agent action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgent_actionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Action_agent_action_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Action_agent_action_feature",
								"_UI_Action_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.ACTION__AGENT_ACTION, true, false,
						true, null, null, null));
	}

	/**
	 * This returns Action.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Action"));
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
		String label = ((Action) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Action_type")
				: getString("_UI_Action_type") + " " + label;
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

		switch (notification.getFeatureID(Action.class)) {
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARAMETERS:
		case Prometheus_metamodel_system_specificationPackage.ACTION__DURATION:
		case Prometheus_metamodel_system_specificationPackage.ACTION__FAILURE:
		case Prometheus_metamodel_system_specificationPackage.ACTION__PARTIAL_CHANGE:
		case Prometheus_metamodel_system_specificationPackage.ACTION__SIDE_EFFECTS:
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
