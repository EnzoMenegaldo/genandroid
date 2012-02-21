/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.GenandroidPackage;
import genandroid.ListViewActivity;
import genandroid.ViewActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.ListViewActivityImpl#getSelectItemAction <em>Select Item Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListViewActivityImpl extends ViewActivityImpl implements ListViewActivity {
	/**
	 * The cached value of the '{@link #getSelectItemAction() <em>Select Item Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectItemAction()
	 * @generated
	 * @ordered
	 */
	protected ViewActivity selectItemAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.LIST_VIEW_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity getSelectItemAction() {
		if (selectItemAction != null && selectItemAction.eIsProxy()) {
			InternalEObject oldSelectItemAction = (InternalEObject)selectItemAction;
			selectItemAction = (ViewActivity)eResolveProxy(oldSelectItemAction);
			if (selectItemAction != oldSelectItemAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION, oldSelectItemAction, selectItemAction));
			}
		}
		return selectItemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity basicGetSelectItemAction() {
		return selectItemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectItemAction(ViewActivity newSelectItemAction) {
		ViewActivity oldSelectItemAction = selectItemAction;
		selectItemAction = newSelectItemAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION, oldSelectItemAction, selectItemAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION:
				if (resolve) return getSelectItemAction();
				return basicGetSelectItemAction();
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION:
				setSelectItemAction((ViewActivity)newValue);
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION:
				setSelectItemAction((ViewActivity)null);
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION:
				return selectItemAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ListViewActivityImpl
