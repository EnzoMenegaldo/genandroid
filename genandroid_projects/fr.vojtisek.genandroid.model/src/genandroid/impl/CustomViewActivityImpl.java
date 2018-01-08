/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.CustomViewActivity;
import genandroid.GenandroidPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom View Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.CustomViewActivityImpl#isIsOrmLiteBaseActivity <em>Is Orm Lite Base Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomViewActivityImpl extends ViewActivityImpl implements CustomViewActivity {
	/**
	 * The default value of the '{@link #isIsOrmLiteBaseActivity() <em>Is Orm Lite Base Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrmLiteBaseActivity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORM_LITE_BASE_ACTIVITY_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIsOrmLiteBaseActivity() <em>Is Orm Lite Base Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrmLiteBaseActivity()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrmLiteBaseActivity = IS_ORM_LITE_BASE_ACTIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomViewActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.CUSTOM_VIEW_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrmLiteBaseActivity() {
		return isOrmLiteBaseActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrmLiteBaseActivity(boolean newIsOrmLiteBaseActivity) {
		boolean oldIsOrmLiteBaseActivity = isOrmLiteBaseActivity;
		isOrmLiteBaseActivity = newIsOrmLiteBaseActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY, oldIsOrmLiteBaseActivity, isOrmLiteBaseActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY:
				return isIsOrmLiteBaseActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenandroidPackage.CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY:
				setIsOrmLiteBaseActivity((Boolean)newValue);
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
			case GenandroidPackage.CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY:
				setIsOrmLiteBaseActivity(IS_ORM_LITE_BASE_ACTIVITY_EDEFAULT);
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
			case GenandroidPackage.CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY:
				return isOrmLiteBaseActivity != IS_ORM_LITE_BASE_ACTIVITY_EDEFAULT;
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
		result.append(" (isOrmLiteBaseActivity: ");
		result.append(isOrmLiteBaseActivity);
		result.append(')');
		return result.toString();
	}

} //CustomViewActivityImpl
