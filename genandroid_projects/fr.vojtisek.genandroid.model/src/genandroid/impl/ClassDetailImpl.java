/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.ClassDetail;
import genandroid.DataAttribute;
import genandroid.GenandroidPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.ClassDetailImpl#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link genandroid.impl.ClassDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link genandroid.impl.ClassDetailImpl#getSecondaryAttributes <em>Secondary Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDetailImpl extends EObjectImpl implements ClassDetail {
	/**
	 * The cached value of the '{@link #getMainAttributes() <em>Main Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAttribute> mainAttributes;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecondaryAttributes() <em>Secondary Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAttribute> secondaryAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.CLASS_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAttribute> getMainAttributes() {
		if (mainAttributes == null) {
			mainAttributes = new EObjectResolvingEList<DataAttribute>(DataAttribute.class, this, GenandroidPackage.CLASS_DETAIL__MAIN_ATTRIBUTES);
		}
		return mainAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.CLASS_DETAIL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAttribute> getSecondaryAttributes() {
		if (secondaryAttributes == null) {
			secondaryAttributes = new EObjectResolvingEList<DataAttribute>(DataAttribute.class, this, GenandroidPackage.CLASS_DETAIL__SECONDARY_ATTRIBUTES);
		}
		return secondaryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.CLASS_DETAIL__MAIN_ATTRIBUTES:
				return getMainAttributes();
			case GenandroidPackage.CLASS_DETAIL__NAME:
				return getName();
			case GenandroidPackage.CLASS_DETAIL__SECONDARY_ATTRIBUTES:
				return getSecondaryAttributes();
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
			case GenandroidPackage.CLASS_DETAIL__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				getMainAttributes().addAll((Collection<? extends DataAttribute>)newValue);
				return;
			case GenandroidPackage.CLASS_DETAIL__NAME:
				setName((String)newValue);
				return;
			case GenandroidPackage.CLASS_DETAIL__SECONDARY_ATTRIBUTES:
				getSecondaryAttributes().clear();
				getSecondaryAttributes().addAll((Collection<? extends DataAttribute>)newValue);
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
			case GenandroidPackage.CLASS_DETAIL__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				return;
			case GenandroidPackage.CLASS_DETAIL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenandroidPackage.CLASS_DETAIL__SECONDARY_ATTRIBUTES:
				getSecondaryAttributes().clear();
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
			case GenandroidPackage.CLASS_DETAIL__MAIN_ATTRIBUTES:
				return mainAttributes != null && !mainAttributes.isEmpty();
			case GenandroidPackage.CLASS_DETAIL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenandroidPackage.CLASS_DETAIL__SECONDARY_ATTRIBUTES:
				return secondaryAttributes != null && !secondaryAttributes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassDetailImpl
