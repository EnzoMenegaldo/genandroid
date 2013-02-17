/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.DataAssociation;
import genandroid.DataClassifier;
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
 *   <li>{@link genandroid.impl.DataModelImpl#getDataClasses <em>Data Classes</em>}</li>
 *   <li>{@link genandroid.impl.DataModelImpl#getDataAssociations <em>Data Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataModelImpl extends NamedElementImpl implements DataModel {
	/**
	 * The cached value of the '{@link #getDataClasses() <em>Data Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<DataClassifier> dataClasses;

	/**
	 * The cached value of the '{@link #getDataAssociations() <em>Data Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAssociation> dataAssociations;

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
	public EList<DataClassifier> getDataClasses() {
		if (dataClasses == null) {
			dataClasses = new EObjectContainmentEList<DataClassifier>(DataClassifier.class, this, GenandroidPackage.DATA_MODEL__DATA_CLASSES);
		}
		return dataClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAssociation> getDataAssociations() {
		if (dataAssociations == null) {
			dataAssociations = new EObjectContainmentEList<DataAssociation>(DataAssociation.class, this, GenandroidPackage.DATA_MODEL__DATA_ASSOCIATIONS);
		}
		return dataAssociations;
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
			case GenandroidPackage.DATA_MODEL__DATA_ASSOCIATIONS:
				return ((InternalEList<?>)getDataAssociations()).basicRemove(otherEnd, msgs);
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
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return getDataClasses();
			case GenandroidPackage.DATA_MODEL__DATA_ASSOCIATIONS:
				return getDataAssociations();
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
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				getDataClasses().clear();
				getDataClasses().addAll((Collection<? extends DataClassifier>)newValue);
				return;
			case GenandroidPackage.DATA_MODEL__DATA_ASSOCIATIONS:
				getDataAssociations().clear();
				getDataAssociations().addAll((Collection<? extends DataAssociation>)newValue);
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
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				getDataClasses().clear();
				return;
			case GenandroidPackage.DATA_MODEL__DATA_ASSOCIATIONS:
				getDataAssociations().clear();
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
			case GenandroidPackage.DATA_MODEL__DATA_CLASSES:
				return dataClasses != null && !dataClasses.isEmpty();
			case GenandroidPackage.DATA_MODEL__DATA_ASSOCIATIONS:
				return dataAssociations != null && !dataAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataModelImpl
