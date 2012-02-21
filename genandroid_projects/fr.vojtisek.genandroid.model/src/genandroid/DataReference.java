/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.DataReference#getEReference <em>EReference</em>}</li>
 *   <li>{@link genandroid.DataReference#getStorage <em>Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getDataReference()
 * @model
 * @generated
 */
public interface DataReference extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see genandroid.GenandroidPackage#getDataReference_EReference()
	 * @model required="true"
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link genandroid.DataReference#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

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
	 * @see genandroid.GenandroidPackage#getDataReference_Storage()
	 * @model default="0" required="true"
	 * @generated
	 */
	storageKind getStorage();

	/**
	 * Sets the value of the '{@link genandroid.DataReference#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(storageKind value);

} // DataReference
