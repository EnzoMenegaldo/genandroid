/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.ClassListViewActivity;
import genandroid.DataClass;
import genandroid.GenandroidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class List View Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.ClassListViewActivityImpl#getListedElement <em>Listed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassListViewActivityImpl extends ListViewActivityImpl implements ClassListViewActivity {
	/**
	 * The cached value of the '{@link #getListedElement() <em>Listed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListedElement()
	 * @generated
	 * @ordered
	 */
	protected DataClass listedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassListViewActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.CLASS_LIST_VIEW_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getListedElement() {
		if (listedElement != null && listedElement.eIsProxy()) {
			InternalEObject oldListedElement = (InternalEObject)listedElement;
			listedElement = (DataClass)eResolveProxy(oldListedElement);
			if (listedElement != oldListedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT, oldListedElement, listedElement));
			}
		}
		return listedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetListedElement() {
		return listedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListedElement(DataClass newListedElement) {
		DataClass oldListedElement = listedElement;
		listedElement = newListedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT, oldListedElement, listedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT:
				if (resolve) return getListedElement();
				return basicGetListedElement();
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
			case GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT:
				setListedElement((DataClass)newValue);
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
			case GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT:
				setListedElement((DataClass)null);
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
			case GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT:
				return listedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassListViewActivityImpl
