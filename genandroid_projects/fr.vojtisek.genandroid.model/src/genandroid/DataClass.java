/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.DataClass#getStorage <em>Storage</em>}</li>
 *   <li>{@link genandroid.DataClass#getDataReferences <em>Data References</em>}</li>
 *   <li>{@link genandroid.DataClass#getDataAttributes <em>Data Attributes</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getDataClass()
 * @model
 * @generated
 */
public interface DataClass extends DataClassifier {
	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * The default value is <code>"SQLite"</code>.
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
	 * @model default="SQLite" required="true"
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

	/**
	 * Returns the value of the '<em><b>Data References</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.DataReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data References</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getDataClass_DataReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataReference> getDataReferences();

	/**
	 * Returns the value of the '<em><b>Data Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.DataAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Attributes</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getDataClass_DataAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAttribute> getDataAttributes();

} // DataClass
