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
 *   <li>{@link genandroid.impl.DataModelImpl#getDataReferences <em>Data References</em>}</li>
 *   <li>{@link genandroid.impl.DataModelImpl#getDataAttributes <em>Data Attributes</em>}</li>
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
	public EList<DataReference> getDataReferences() {
		if (dataReferences == null) {
			dataReferences = new EObjectContainmentEList<DataReference>(DataReference.class, this, GenandroidPackage.DATA_MODEL__DATA_REFERENCES);
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
			dataAttributes = new EObjectContainmentEList<DataAttribute>(DataAttribute.class, this, GenandroidPackage.DATA_MODEL__DATA_ATTRIBUTES);
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
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return ((InternalEList<?>)getDataClasses()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.DATA_MODEL__DATA_REFERENCES:
				return ((InternalEList<?>)getDataReferences()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.DATA_MODEL__DATA_ATTRIBUTES:
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				if (resolve) return getRootClass();
				return basicGetRootClass();
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return getDataClasses();
			case GenandroidPackage.DATA_MODEL__DATA_REFERENCES:
				return getDataReferences();
			case GenandroidPackage.DATA_MODEL__DATA_ATTRIBUTES:
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				setRootClass((EClass)newValue);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				getDataClasses().clear();
				getDataClasses().addAll((Collection<? extends DataClass>)newValue);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_REFERENCES:
				getDataReferences().clear();
				getDataReferences().addAll((Collection<? extends DataReference>)newValue);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_ATTRIBUTES:
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				setRootClass((EClass)null);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				getDataClasses().clear();
				return;
			case GenandroidPackage.DATA_MODEL__DATA_REFERENCES:
				getDataReferences().clear();
				return;
			case GenandroidPackage.DATA_MODEL__DATA_ATTRIBUTES:
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
			case GenandroidPackage.DATA_MODEL__ROOT_CLASS:
				return rootClass != null;
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return dataClasses != null && !dataClasses.isEmpty();
			case GenandroidPackage.DATA_MODEL__DATA_REFERENCES:
				return dataReferences != null && !dataReferences.isEmpty();
			case GenandroidPackage.DATA_MODEL__DATA_ATTRIBUTES:
				return dataAttributes != null && !dataAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl
