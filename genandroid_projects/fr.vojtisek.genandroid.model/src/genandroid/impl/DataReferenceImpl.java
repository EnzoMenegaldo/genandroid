/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.DataReference;
import genandroid.GenandroidPackage;
import genandroid.storageKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.DataReferenceImpl#getEReference <em>EReference</em>}</li>
 *   <li>{@link genandroid.impl.DataReferenceImpl#getStorage <em>Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataReferenceImpl extends EObjectImpl implements DataReference {
	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference eReference;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final storageKind STORAGE_EDEFAULT = storageKind.SQ_LITE;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected storageKind storage = STORAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.DATA_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject)eReference;
			eReference = (EReference)eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.DATA_REFERENCE__EREFERENCE, oldEReference, eReference));
			}
		}
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEReference() {
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference(EReference newEReference) {
		EReference oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_REFERENCE__EREFERENCE, oldEReference, eReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageKind getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(storageKind newStorage) {
		storageKind oldStorage = storage;
		storage = newStorage == null ? STORAGE_EDEFAULT : newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_REFERENCE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.DATA_REFERENCE__EREFERENCE:
				if (resolve) return getEReference();
				return basicGetEReference();
			case GenandroidPackage.DATA_REFERENCE__STORAGE:
				return getStorage();
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
			case GenandroidPackage.DATA_REFERENCE__EREFERENCE:
				setEReference((EReference)newValue);
				return;
			case GenandroidPackage.DATA_REFERENCE__STORAGE:
				setStorage((storageKind)newValue);
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
			case GenandroidPackage.DATA_REFERENCE__EREFERENCE:
				setEReference((EReference)null);
				return;
			case GenandroidPackage.DATA_REFERENCE__STORAGE:
				setStorage(STORAGE_EDEFAULT);
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
			case GenandroidPackage.DATA_REFERENCE__EREFERENCE:
				return eReference != null;
			case GenandroidPackage.DATA_REFERENCE__STORAGE:
				return storage != STORAGE_EDEFAULT;
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
		result.append(" (storage: ");
		result.append(storage);
		result.append(')');
		return result.toString();
	}

} //DataReferenceImpl
