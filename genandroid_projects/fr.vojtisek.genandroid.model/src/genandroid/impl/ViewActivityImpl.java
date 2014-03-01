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

import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link genandroid.impl.ViewActivityImpl#isHasSupportForParentActivity <em>Has Support For Parent Activity</em>}</li>
 *   <li>{@link genandroid.impl.ViewActivityImpl#getDefaultParentActivity <em>Default Parent Activity</em>}</li>
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
	 * The default value of the '{@link #isHasSupportForParentActivity() <em>Has Support For Parent Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSupportForParentActivity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SUPPORT_FOR_PARENT_ACTIVITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSupportForParentActivity() <em>Has Support For Parent Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSupportForParentActivity()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSupportForParentActivity = HAS_SUPPORT_FOR_PARENT_ACTIVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultParentActivity() <em>Default Parent Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultParentActivity()
	 * @generated
	 * @ordered
	 */
	protected ViewActivity defaultParentActivity;

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
	public boolean isHasSupportForParentActivity() {
		return hasSupportForParentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSupportForParentActivity(boolean newHasSupportForParentActivity) {
		boolean oldHasSupportForParentActivity = hasSupportForParentActivity;
		hasSupportForParentActivity = newHasSupportForParentActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.VIEW_ACTIVITY__HAS_SUPPORT_FOR_PARENT_ACTIVITY, oldHasSupportForParentActivity, hasSupportForParentActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity getDefaultParentActivity() {
		if (defaultParentActivity != null && defaultParentActivity.eIsProxy()) {
			InternalEObject oldDefaultParentActivity = (InternalEObject)defaultParentActivity;
			defaultParentActivity = (ViewActivity)eResolveProxy(oldDefaultParentActivity);
			if (defaultParentActivity != oldDefaultParentActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.VIEW_ACTIVITY__DEFAULT_PARENT_ACTIVITY, oldDefaultParentActivity, defaultParentActivity));
			}
		}
		return defaultParentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity basicGetDefaultParentActivity() {
		return defaultParentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultParentActivity(ViewActivity newDefaultParentActivity) {
		ViewActivity oldDefaultParentActivity = defaultParentActivity;
		defaultParentActivity = newDefaultParentActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.VIEW_ACTIVITY__DEFAULT_PARENT_ACTIVITY, oldDefaultParentActivity, defaultParentActivity));
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
			case GenandroidPackage.VIEW_ACTIVITY__HAS_SUPPORT_FOR_PARENT_ACTIVITY:
				return isHasSupportForParentActivity();
			case GenandroidPackage.VIEW_ACTIVITY__DEFAULT_PARENT_ACTIVITY:
				if (resolve) return getDefaultParentActivity();
				return basicGetDefaultParentActivity();
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
			case GenandroidPackage.VIEW_ACTIVITY__HAS_SUPPORT_FOR_PARENT_ACTIVITY:
				setHasSupportForParentActivity((Boolean)newValue);
				return;
			case GenandroidPackage.VIEW_ACTIVITY__DEFAULT_PARENT_ACTIVITY:
				setDefaultParentActivity((ViewActivity)newValue);
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
			case GenandroidPackage.VIEW_ACTIVITY__HAS_SUPPORT_FOR_PARENT_ACTIVITY:
				setHasSupportForParentActivity(HAS_SUPPORT_FOR_PARENT_ACTIVITY_EDEFAULT);
				return;
			case GenandroidPackage.VIEW_ACTIVITY__DEFAULT_PARENT_ACTIVITY:
				setDefaultParentActivity((ViewActivity)null);
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
			case GenandroidPackage.VIEW_ACTIVITY__HAS_SUPPORT_FOR_PARENT_ACTIVITY:
				return hasSupportForParentActivity != HAS_SUPPORT_FOR_PARENT_ACTIVITY_EDEFAULT;
			case GenandroidPackage.VIEW_ACTIVITY__DEFAULT_PARENT_ACTIVITY:
				return defaultParentActivity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hasSupportForParentActivity: ");
		result.append(hasSupportForParentActivity);
		result.append(')');
		return result.toString();
	}

} //ViewActivityImpl
