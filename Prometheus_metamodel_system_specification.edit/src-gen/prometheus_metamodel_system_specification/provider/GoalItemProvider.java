/**
 */
package prometheus_metamodel_system_specification.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import prometheus_metamodel_system_specification.Goal;
import prometheus_metamodel_system_specification.Prometheus_metamodel_system_specificationPackage;

/**
 * This is the item provider adapter for a {@link prometheus_metamodel_system_specification.Goal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalItemProvider(AdapterFactory adapterFactory) {
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

			addGoal_relationship_from_andPropertyDescriptor(object);
			addGoal_relationship_to_andPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
			addGoal_relationship_from_orPropertyDescriptor(object);
			addGoal_relationship_to_orPropertyDescriptor(object);
			addRolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Goal relationship from and feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoal_relationship_from_andPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Goal_goal_relationship_from_and_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_goal_relationship_from_and_feature",
								"_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__GOAL_RELATIONSHIP_FROM_AND,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Goal relationship to and feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoal_relationship_to_andPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Goal_goal_relationship_to_and_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_goal_relationship_to_and_feature",
								"_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__GOAL_RELATIONSHIP_TO_AND, true,
						false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Goal_model_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_model_feature", "_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__MODEL, true, false, true, null,
						null, null));
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
						getResourceLocator(), getString("_UI_Goal_step_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_step_feature", "_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__STEP, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Goal relationship from or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoal_relationship_from_orPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Goal_goal_relationship_from_or_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_goal_relationship_from_or_feature",
								"_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__GOAL_RELATIONSHIP_FROM_OR, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Goal relationship to or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoal_relationship_to_orPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Goal_goal_relationship_to_or_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_goal_relationship_to_or_feature",
								"_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__GOAL_RELATIONSHIP_TO_OR, true,
						false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Goal_rol_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Goal_rol_feature", "_UI_Goal_type"),
						Prometheus_metamodel_system_specificationPackage.Literals.GOAL__ROL, true, false, true, null,
						null, null));
	}

	/**
	 * This returns Goal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Goal"));
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
		String label = ((Goal) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Goal_type")
				: getString("_UI_Goal_type") + " " + label;
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
