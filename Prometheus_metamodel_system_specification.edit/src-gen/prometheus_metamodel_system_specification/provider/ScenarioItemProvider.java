/**
 */
package prometheus_metamodel_system_specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationFactory;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;
import prometheus_metamodel_system_specification.Scenario;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addPhysical_objectPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addTriggerPropertyDescriptor(object);
			addVariationPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
			addScenarioPropertyDescriptor(object);
			addGoals_scenarioPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addPercept_scenarioPropertyDescriptor(object);
			addModel_scenarioPropertyDescriptor(object);
			addAction_scenarioPropertyDescriptor(object);
			addData_scenarioPropertyDescriptor(object);
			addRol_scenarioPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_Scenario_physical_object_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_physical_object_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__PHYSICAL_OBJECT, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_context_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_context_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__CONTEXT, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_trigger_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_trigger_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__TRIGGER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Variation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_variation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_variation_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__VARIATION, true, false,
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
						getResourceLocator(), getString("_UI_Scenario_step_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_step_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__STEP, true, false, true,
						null, null, null));
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
						getResourceLocator(), getString("_UI_Scenario_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__SCENARIO, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Goals scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoals_scenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_goals_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_goals_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__GOALS_SCENARIO, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_priority_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_priority_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__PRIORITY, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Percept scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercept_scenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_percept_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_percept_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__PERCEPT_SCENARIO, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Model scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModel_scenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_model_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_model_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__MODEL_SCENARIO, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Action scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAction_scenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_action_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_action_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__ACTION_SCENARIO, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_scenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_data_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_data_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__DATA_SCENARIO, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rol scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRol_scenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Scenario_rol_scenario_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Scenario_rol_scenario_feature",
								"_UI_Scenario_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__ROL_SCENARIO, true, false,
						true, null, null, null));
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
			childrenFeatures.add(Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__STEPS);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
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
		String label = ((Scenario) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Scenario_type")
				: getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__TRIGGER:
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__VARIATION:
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__PRIORITY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Prometheus_metamodel_system_specificationPackage.SCENARIO__STEPS:
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
				.add(createChildParameter(Prometheus_metamodel_system_specificationPackage.Literals.SCENARIO__STEPS,
						Prometheus_metamodel_system_specificationFactory.eINSTANCE.createStep()));
	}

}
