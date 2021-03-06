/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simulator.base.Activity;
import simulator.base.BaseFactory;
import simulator.base.BasePackage;

import simulator.distribution.DistributionFactory;

/**
 * This is the item provider adapter for a {@link simulator.base.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
	extends StepItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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

			addRepetitionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Repetitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepetitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_repetitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_repetitions_feature", "_UI_Activity_type"),
				 BasePackage.Literals.ACTIVITY__REPETITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(BasePackage.Literals.ACTIVITY__SERVICE_TIME);
			childrenFeatures.add(BasePackage.Literals.ACTIVITY__FAIL_MODE);
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
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case BasePackage.ACTIVITY__REPETITIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BasePackage.ACTIVITY__SERVICE_TIME:
			case BasePackage.ACTIVITY__FAIL_MODE:
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

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__SERVICE_TIME,
				 DistributionFactory.eINSTANCE.createProbabilityDistributionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__SERVICE_TIME,
				 DistributionFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__SERVICE_TIME,
				 DistributionFactory.eINSTANCE.createPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__SERVICE_TIME,
				 DistributionFactory.eINSTANCE.createUniform()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__SERVICE_TIME,
				 DistributionFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__FAIL_MODE,
				 BaseFactory.eINSTANCE.createFailMode()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__FAIL_MODE,
				 BaseFactory.eINSTANCE.createDiscreteFailMode()));

		newChildDescriptors.add
			(createChildParameter
				(BasePackage.Literals.ACTIVITY__FAIL_MODE,
				 BaseFactory.eINSTANCE.createContinuousFailMode()));
	}

}
