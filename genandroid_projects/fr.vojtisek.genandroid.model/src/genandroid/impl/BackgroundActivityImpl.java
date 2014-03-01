/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.BackgroundActivity;
import genandroid.GenandroidPackage;

import genandroid.ViewActivity;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.BackgroundActivityImpl#getTargetIntent <em>Target Intent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackgroundActivityImpl extends NamedElementImpl implements BackgroundActivity {
	/**
	 * The cached value of the '{@link #getTargetIntent() <em>Target Intent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIntent()
	 * @generated
	 * @ordered
	 */
	protected ViewActivity targetIntent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.BACKGROUND_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity getTargetIntent() {
		if (targetIntent != null && targetIntent.eIsProxy()) {
			InternalEObject oldTargetIntent = (InternalEObject)targetIntent;
			targetIntent = (ViewActivity)eResolveProxy(oldTargetIntent);
			if (targetIntent != oldTargetIntent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.BACKGROUND_ACTIVITY__TARGET_INTENT, oldTargetIntent, targetIntent));
			}
		}
		return targetIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity basicGetTargetIntent() {
		return targetIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIntent(ViewActivity newTargetIntent) {
		ViewActivity oldTargetIntent = targetIntent;
		targetIntent = newTargetIntent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.BACKGROUND_ACTIVITY__TARGET_INTENT, oldTargetIntent, targetIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.BACKGROUND_ACTIVITY__TARGET_INTENT:
				if (resolve) return getTargetIntent();
				return basicGetTargetIntent();
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
			case GenandroidPackage.BACKGROUND_ACTIVITY__TARGET_INTENT:
				setTargetIntent((ViewActivity)newValue);
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
			case GenandroidPackage.BACKGROUND_ACTIVITY__TARGET_INTENT:
				setTargetIntent((ViewActivity)null);
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
			case GenandroidPackage.BACKGROUND_ACTIVITY__TARGET_INTENT:
				return targetIntent != null;
		}
		return super.eIsSet(featureID);
	}

} //BackgroundActivityImpl
