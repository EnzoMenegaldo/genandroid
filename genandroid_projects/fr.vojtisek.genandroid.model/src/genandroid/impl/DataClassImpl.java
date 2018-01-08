/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.DataAttribute;
import genandroid.DataClass;
import genandroid.DataReference;
import genandroid.GenandroidPackage;
import genandroid.storageKind;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.DataClassImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link genandroid.impl.DataClassImpl#getDataReferences <em>Data References</em>}</li>
 *   <li>{@link genandroid.impl.DataClassImpl#getDataAttributes <em>Data Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataClassImpl extends DataClassifierImpl implements DataClass {
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
	 * The cached value of the '{@link #getDataReferences() <em>Data References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DataReference> dataReferences;

	/**
	 * The cached value of the '{@link #getDataAttributes() <em>Data Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAttribute> dataAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.DATA_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_CLASS__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataReference> getDataReferences() {
		if (dataReferences == null) {
			dataReferences = new EObjectContainmentEList<DataReference>(DataReference.class, this, GenandroidPackage.DATA_CLASS__DATA_REFERENCES);
		}
		return dataReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAttribute> getDataAttributes() {
		if (dataAttributes == null) {
			dataAttributes = new EObjectContainmentEList<DataAttribute>(DataAttribute.class, this, GenandroidPackage.DATA_CLASS__DATA_ATTRIBUTES);
		}
		return dataAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenandroidPackage.DATA_CLASS__DATA_REFERENCES:
				return ((InternalEList<?>)getDataReferences()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.DATA_CLASS__DATA_ATTRIBUTES:
				return ((InternalEList<?>)getDataAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.DATA_CLASS__STORAGE:
				return getStorage();
			case GenandroidPackage.DATA_CLASS__DATA_REFERENCES:
				return getDataReferences();
			case GenandroidPackage.DATA_CLASS__DATA_ATTRIBUTES:
				return getDataAttributes();
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
			case GenandroidPackage.DATA_CLASS__STORAGE:
				setStorage((storageKind)newValue);
				return;
			case GenandroidPackage.DATA_CLASS__DATA_REFERENCES:
				getDataReferences().clear();
				getDataReferences().addAll((Collection<? extends DataReference>)newValue);
				return;
			case GenandroidPackage.DATA_CLASS__DATA_ATTRIBUTES:
				getDataAttributes().clear();
				getDataAttributes().addAll((Collection<? extends DataAttribute>)newValue);
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
			case GenandroidPackage.DATA_CLASS__STORAGE:
				setStorage(STORAGE_EDEFAULT);
				return;
			case GenandroidPackage.DATA_CLASS__DATA_REFERENCES:
				getDataReferences().clear();
				return;
			case GenandroidPackage.DATA_CLASS__DATA_ATTRIBUTES:
				getDataAttributes().clear();
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
			case GenandroidPackage.DATA_CLASS__STORAGE:
				return storage != STORAGE_EDEFAULT;
			case GenandroidPackage.DATA_CLASS__DATA_REFERENCES:
				return dataReferences != null && !dataReferences.isEmpty();
			case GenandroidPackage.DATA_CLASS__DATA_ATTRIBUTES:
				return dataAttributes != null && !dataAttributes.isEmpty();
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

} //DataClassImpl
