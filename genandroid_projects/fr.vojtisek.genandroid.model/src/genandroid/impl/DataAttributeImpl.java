/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.DataAttribute;
import genandroid.GenandroidPackage;
import genandroid.NativeDataClass;
import genandroid.storageKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.DataAttributeImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link genandroid.impl.DataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link genandroid.impl.DataAttributeImpl#isSimpleXmlType <em>Simple Xml Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAttributeImpl extends StructuralFeatureImpl implements DataAttribute {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NativeDataClass type;

	/**
	 * The default value of the '{@link #isSimpleXmlType() <em>Simple Xml Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimpleXmlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMPLE_XML_TYPE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSimpleXmlType() <em>Simple Xml Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimpleXmlType()
	 * @generated
	 * @ordered
	 */
	protected boolean simpleXmlType = SIMPLE_XML_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.DATA_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_ATTRIBUTE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeDataClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (NativeDataClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.DATA_ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeDataClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NativeDataClass newType) {
		NativeDataClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimpleXmlType() {
		return simpleXmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleXmlType(boolean newSimpleXmlType) {
		boolean oldSimpleXmlType = simpleXmlType;
		simpleXmlType = newSimpleXmlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_ATTRIBUTE__SIMPLE_XML_TYPE, oldSimpleXmlType, simpleXmlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.DATA_ATTRIBUTE__STORAGE:
				return getStorage();
			case GenandroidPackage.DATA_ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case GenandroidPackage.DATA_ATTRIBUTE__SIMPLE_XML_TYPE:
				return isSimpleXmlType();
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
			case GenandroidPackage.DATA_ATTRIBUTE__STORAGE:
				setStorage((storageKind)newValue);
				return;
			case GenandroidPackage.DATA_ATTRIBUTE__TYPE:
				setType((NativeDataClass)newValue);
				return;
			case GenandroidPackage.DATA_ATTRIBUTE__SIMPLE_XML_TYPE:
				setSimpleXmlType((Boolean)newValue);
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
			case GenandroidPackage.DATA_ATTRIBUTE__STORAGE:
				setStorage(STORAGE_EDEFAULT);
				return;
			case GenandroidPackage.DATA_ATTRIBUTE__TYPE:
				setType((NativeDataClass)null);
				return;
			case GenandroidPackage.DATA_ATTRIBUTE__SIMPLE_XML_TYPE:
				setSimpleXmlType(SIMPLE_XML_TYPE_EDEFAULT);
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
			case GenandroidPackage.DATA_ATTRIBUTE__STORAGE:
				return storage != STORAGE_EDEFAULT;
			case GenandroidPackage.DATA_ATTRIBUTE__TYPE:
				return type != null;
			case GenandroidPackage.DATA_ATTRIBUTE__SIMPLE_XML_TYPE:
				return simpleXmlType != SIMPLE_XML_TYPE_EDEFAULT;
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
		result.append(", simpleXmlType: ");
		result.append(simpleXmlType);
		result.append(')');
		return result.toString();
	}

} //DataAttributeImpl
