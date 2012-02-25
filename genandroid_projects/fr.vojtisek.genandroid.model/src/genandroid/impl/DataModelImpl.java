/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.DataAttribute;
import genandroid.DataClass;
import genandroid.DataModel;
import genandroid.DataReference;
import genandroid.GenandroidPackage;

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
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.DataModelImpl#getRootClass <em>Root Class</em>}</li>
 *   <li>{@link genandroid.impl.DataModelImpl#getDataClasses <em>Data Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataModelImpl extends EObjectImpl implements DataModel {
	/**
	 * The cached value of the '{@link #getRootClass() <em>Root Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootClass()
	 * @generated
	 * @ordered
	 */
	protected EClass rootClass;

	/**
	 * The cached value of the '{@link #getDataClasses() <em>Data Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<DataClass> dataClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootClass() {
		if (rootClass != null && rootClass.eIsProxy()) {
			InternalEObject oldRootClass = (InternalEObject)rootClass;
			rootClass = (EClass)eResolveProxy(oldRootClass);
			if (rootClass != oldRootClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.DATA_MODEL__ROOT_CLASS, oldRootClass, rootClass));
			}
		}
		return rootClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootClass() {
		return rootClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootClass(EClass newRootClass) {
		EClass oldRootClass = rootClass;
		rootClass = newRootClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.DATA_MODEL__ROOT_CLASS, oldRootClass, rootClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataClass> getDataClasses() {
		if (dataClasses == null) {
			dataClasses = new EObjectContainmentEList<DataClass>(DataClass.class, this, GenandroidPackage.DATA_MODEL__DATA_CLASSES);
		}
		return dataClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return ((InternalEList<?>)getDataClasses()).basicRemove(otherEnd, msgs);
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				if (resolve) return getRootClass();
				return basicGetRootClass();
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return getDataClasses();
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				setRootClass((EClass)newValue);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				getDataClasses().clear();
				getDataClasses().addAll((Collection<? extends DataClass>)newValue);
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				setRootClass((EClass)null);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				getDataClasses().clear();
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				return rootClass != null;
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return dataClasses != null && !dataClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl
