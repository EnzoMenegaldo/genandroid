/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.ClassDetail#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link genandroid.ClassDetail#getName <em>Name</em>}</li>
 *   <li>{@link genandroid.ClassDetail#getSecondaryAttributes <em>Secondary Attributes</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getClassDetail()
 * @model
 * @generated
 */
public interface ClassDetail extends EObject {

	/**
	 * Returns the value of the '<em><b>Main Attributes</b></em>' reference list.
	 * The list contents are of type {@link genandroid.DataAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Attributes</em>' reference list.
	 * @see genandroid.GenandroidPackage#getClassDetail_MainAttributes()
	 * @model required="true"
	 * @generated
	 */
	EList<DataAttribute> getMainAttributes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see genandroid.GenandroidPackage#getClassDetail_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genandroid.ClassDetail#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Secondary Attributes</b></em>' reference list.
	 * The list contents are of type {@link genandroid.DataAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Attributes</em>' reference list.
	 * @see genandroid.GenandroidPackage#getClassDetail_SecondaryAttributes()
	 * @model
	 * @generated
	 */
	EList<DataAttribute> getSecondaryAttributes();
} // ClassDetail
