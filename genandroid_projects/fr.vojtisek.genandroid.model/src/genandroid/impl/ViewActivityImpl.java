/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.BackgroundActivity;
import genandroid.GenandroidPackage;
import genandroid.PreferenceViewActivity;
import genandroid.ViewActivity;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.ViewActivityImpl#getAccessibleViews <em>Accessible Views</em>}</li>
 *   <li>{@link genandroid.impl.ViewActivityImpl#getTriggerableBackgroundActivities <em>Triggerable Background Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ViewActivityImpl extends NamedElementImpl implements ViewActivity {
	/**
	 * The cached value of the '{@link #getAccessibleViews() <em>Accessible Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleViews()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewActivity> accessibleViews;

	/**
	 * The cached value of the '{@link #getTriggerableBackgroundActivities() <em>Triggerable Background Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerableBackgroundActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<BackgroundActivity> triggerableBackgroundActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.VIEW_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewActivity> getAccessibleViews() {
		if (accessibleViews == null) {
			accessibleViews = new EObjectResolvingEList<ViewActivity>(ViewActivity.class, this, GenandroidPackage.VIEW_ACTIVITY__ACCESSIBLE_VIEWS);
		}
		return accessibleViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackgroundActivity> getTriggerableBackgroundActivities() {
		if (triggerableBackgroundActivities == null) {
			triggerableBackgroundActivities = new EObjectResolvingEList<BackgroundActivity>(BackgroundActivity.class, this, GenandroidPackage.VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES);
		}
		return triggerableBackgroundActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.VIEW_ACTIVITY__ACCESSIBLE_VIEWS:
				return getAccessibleViews();
			case GenandroidPackage.VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES:
				return getTriggerableBackgroundActivities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenandroidPackage.VIEW_ACTIVITY__ACCESSIBLE_VIEWS:
				getAccessibleViews().clear();
				getAccessibleViews().addAll((Collection<? extends ViewActivity>)newValue);
				return;
			case GenandroidPackage.VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES:
				getTriggerableBackgroundActivities().clear();
				getTriggerableBackgroundActivities().addAll((Collection<? extends BackgroundActivity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenandroidPackage.VIEW_ACTIVITY__ACCESSIBLE_VIEWS:
				getAccessibleViews().clear();
				return;
			case GenandroidPackage.VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES:
				getTriggerableBackgroundActivities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenandroidPackage.VIEW_ACTIVITY__ACCESSIBLE_VIEWS:
				return accessibleViews != null && !accessibleViews.isEmpty();
			case GenandroidPackage.VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES:
				return triggerableBackgroundActivities != null && !triggerableBackgroundActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewActivityImpl
