/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.DataAttribute#getEAttribute <em>EAttribute</em>}</li>
 *   <li>{@link genandroid.DataAttribute#getStorage <em>Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getDataAttribute()
 * @model
 * @generated
 */
public interface DataAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see #setEAttribute(EAttribute)
	 * @see genandroid.GenandroidPackage#getDataAttribute_EAttribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link genandroid.DataAttribute#getEAttribute <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 * @generated
	 */
	void setEAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link genandroid.storageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #setStorage(storageKind)
	 * @see genandroid.GenandroidPackage#getDataAttribute_Storage()
	 * @model default="0" required="true"
	 * @generated
	 */
	storageKind getStorage();

	/**
	 * Sets the value of the '{@link genandroid.DataAttribute#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(storageKind value);

} // DataAttribute
