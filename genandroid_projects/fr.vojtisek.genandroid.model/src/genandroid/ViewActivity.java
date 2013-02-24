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
 * A representation of the model object '<em><b>View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.ViewActivity#getName <em>Name</em>}</li>
 *   <li>{@link genandroid.ViewActivity#getAccessibleViews <em>Accessible Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getViewActivity()
 * @model abstract="true"
 * @generated
 */
public interface ViewActivity extends EObject {

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
	 * @see genandroid.GenandroidPackage#getViewActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genandroid.ViewActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Accessible Views</b></em>' reference list.
	 * The list contents are of type {@link genandroid.ViewActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessible Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Views</em>' reference list.
	 * @see genandroid.GenandroidPackage#getViewActivity_AccessibleViews()
	 * @model
	 * @generated
	 */
	EList<ViewActivity> getAccessibleViews();
} // ViewActivity
