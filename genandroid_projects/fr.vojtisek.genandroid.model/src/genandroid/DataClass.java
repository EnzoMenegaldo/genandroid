/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.DataClass#getEClass <em>EClass</em>}</li>
 *   <li>{@link genandroid.DataClass#getStorage <em>Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getDataClass()
 * @model
 * @generated
 */
public interface DataClass extends EObject {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see genandroid.GenandroidPackage#getDataClass_EClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link genandroid.DataClass#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

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
	 * @see genandroid.GenandroidPackage#getDataClass_Storage()
	 * @model default="0" required="true"
	 * @generated
	 */
	storageKind getStorage();

	/**
	 * Sets the value of the '{@link genandroid.DataClass#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(storageKind value);

} // DataClass
