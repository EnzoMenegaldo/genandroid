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
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.ListViewActivityImpl#getSelectItemAction <em>Select Item Action</em>}</li>
 *   <li>{@link genandroid.impl.ListViewActivityImpl#isIsFilterable <em>Is Filterable</em>}</li>
 *   <li>{@link genandroid.impl.ListViewActivityImpl#isIsLargeList <em>Is Large List</em>}</li>
 *   <li>{@link genandroid.impl.ListViewActivityImpl#isUseIndexSearch <em>Use Index Search</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #isIsFilterable() <em>Is Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFilterable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FILTERABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIsFilterable() <em>Is Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFilterable()
	 * @generated
	 * @ordered
	 */
	protected boolean isFilterable = IS_FILTERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLargeList() <em>Is Large List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLargeList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LARGE_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLargeList() <em>Is Large List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLargeList()
	 * @generated
	 * @ordered
	 */
	protected boolean isLargeList = IS_LARGE_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseIndexSearch() <em>Use Index Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseIndexSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_INDEX_SEARCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseIndexSearch() <em>Use Index Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseIndexSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean useIndexSearch = USE_INDEX_SEARCH_EDEFAULT;

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
	public boolean isIsFilterable() {
		return isFilterable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFilterable(boolean newIsFilterable) {
		boolean oldIsFilterable = isFilterable;
		isFilterable = newIsFilterable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.LIST_VIEW_ACTIVITY__IS_FILTERABLE, oldIsFilterable, isFilterable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLargeList() {
		return isLargeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLargeList(boolean newIsLargeList) {
		boolean oldIsLargeList = isLargeList;
		isLargeList = newIsLargeList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.LIST_VIEW_ACTIVITY__IS_LARGE_LIST, oldIsLargeList, isLargeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseIndexSearch() {
		return useIndexSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseIndexSearch(boolean newUseIndexSearch) {
		boolean oldUseIndexSearch = useIndexSearch;
		useIndexSearch = newUseIndexSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH, oldUseIndexSearch, useIndexSearch));
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_FILTERABLE:
				return isIsFilterable();
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_LARGE_LIST:
				return isIsLargeList();
			case GenandroidPackage.LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH:
				return isUseIndexSearch();
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_FILTERABLE:
				setIsFilterable((Boolean)newValue);
				return;
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_LARGE_LIST:
				setIsLargeList((Boolean)newValue);
				return;
			case GenandroidPackage.LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH:
				setUseIndexSearch((Boolean)newValue);
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_FILTERABLE:
				setIsFilterable(IS_FILTERABLE_EDEFAULT);
				return;
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_LARGE_LIST:
				setIsLargeList(IS_LARGE_LIST_EDEFAULT);
				return;
			case GenandroidPackage.LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH:
				setUseIndexSearch(USE_INDEX_SEARCH_EDEFAULT);
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
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_FILTERABLE:
				return isFilterable != IS_FILTERABLE_EDEFAULT;
			case GenandroidPackage.LIST_VIEW_ACTIVITY__IS_LARGE_LIST:
				return isLargeList != IS_LARGE_LIST_EDEFAULT;
			case GenandroidPackage.LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH:
				return useIndexSearch != USE_INDEX_SEARCH_EDEFAULT;
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
		result.append(" (isFilterable: ");
		result.append(isFilterable);
		result.append(", isLargeList: ");
		result.append(isLargeList);
		result.append(", useIndexSearch: ");
		result.append(useIndexSearch);
		result.append(')');
		return result.toString();
	}

} //ListViewActivityImpl
