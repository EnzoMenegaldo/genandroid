/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.provider;


import genandroid.AndroidProject;
import genandroid.GenandroidFactory;
import genandroid.GenandroidPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link genandroid.AndroidProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidProjectItemProvider
	extends ItemProviderAdapter
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
	public AndroidProjectItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPackagePrefixPropertyDescriptor(object);
			addWelcomeViewPropertyDescriptor(object);
			addFileHeaderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AndroidProject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AndroidProject_name_feature", "_UI_AndroidProject_type"),
				 GenandroidPackage.Literals.ANDROID_PROJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AndroidProject_packagePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AndroidProject_packagePrefix_feature", "_UI_AndroidProject_type"),
				 GenandroidPackage.Literals.ANDROID_PROJECT__PACKAGE_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Welcome View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWelcomeViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AndroidProject_welcomeView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AndroidProject_welcomeView_feature", "_UI_AndroidProject_type"),
				 GenandroidPackage.Literals.ANDROID_PROJECT__WELCOME_VIEW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AndroidProject_fileHeader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AndroidProject_fileHeader_feature", "_UI_AndroidProject_type"),
				 GenandroidPackage.Literals.ANDROID_PROJECT__FILE_HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GenandroidPackage.Literals.ANDROID_PROJECT__DATA_MODEL);
			childrenFeatures.add(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES);
			childrenFeatures.add(GenandroidPackage.Literals.ANDROID_PROJECT__CLASS_DETAILS);
			childrenFeatures.add(GenandroidPackage.Literals.ANDROID_PROJECT__PREFERENCE_VIEW);
			childrenFeatures.add(GenandroidPackage.Literals.ANDROID_PROJECT__BACKGROUND_ACTIVITIES);
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
	 * This returns AndroidProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AndroidProject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AndroidProject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AndroidProject_type") :
			getString("_UI_AndroidProject_type") + " " + label;
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

		switch (notification.getFeatureID(AndroidProject.class)) {
			case GenandroidPackage.ANDROID_PROJECT__NAME:
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
			case GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES:
			case GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS:
			case GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW:
			case GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES:
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
				(GenandroidPackage.Literals.ANDROID_PROJECT__DATA_MODEL,
				 GenandroidFactory.eINSTANCE.createDataModel()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createElementViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createEditableElementViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createListViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createClassListViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createReferenceListViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createAttributeListViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createPreferenceViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createCustomViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__CLASS_DETAILS,
				 GenandroidFactory.eINSTANCE.createClassDetail()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__PREFERENCE_VIEW,
				 GenandroidFactory.eINSTANCE.createPreferenceViewActivity()));

		newChildDescriptors.add
			(createChildParameter
				(GenandroidPackage.Literals.ANDROID_PROJECT__BACKGROUND_ACTIVITIES,
				 GenandroidFactory.eINSTANCE.createBackgroundActivity()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GenandroidPackage.Literals.ANDROID_PROJECT__VIEW_ACTIVITIES ||
			childFeature == GenandroidPackage.Literals.ANDROID_PROJECT__PREFERENCE_VIEW;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GenandroidEditPlugin.INSTANCE;
	}

}
