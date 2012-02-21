/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.DataClass;
import genandroid.DataReference;
import genandroid.GenandroidPackage;
import genandroid.ReferenceListViewActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference List View Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.ReferenceListViewActivityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link genandroid.impl.ReferenceListViewActivityImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceListViewActivityImpl extends ClassListViewActivityImpl implements ReferenceListViewActivity {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected DataReference reference;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DataClass from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceListViewActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.REFERENCE_LIST_VIEW_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (DataReference)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReference basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(DataReference newReference) {
		DataReference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DataClass)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DataClass newFrom) {
		DataClass oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
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
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE:
				setReference((DataReference)newValue);
				return;
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__FROM:
				setFrom((DataClass)newValue);
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
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE:
				setReference((DataReference)null);
				return;
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__FROM:
				setFrom((DataClass)null);
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
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE:
				return reference != null;
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceListViewActivityImpl
