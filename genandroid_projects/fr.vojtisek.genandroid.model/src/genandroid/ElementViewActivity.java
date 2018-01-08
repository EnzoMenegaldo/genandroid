/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.ElementViewActivity#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getElementViewActivity()
 * @model
 * @generated
 */
public interface ElementViewActivity extends ViewActivity {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(DataClass)
	 * @see genandroid.GenandroidPackage#getElementViewActivity_Element()
	 * @model required="true"
	 * @generated
	 */
	DataClass getElement();

	/**
	 * Sets the value of the '{@link genandroid.ElementViewActivity#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(DataClass value);

} // ElementViewActivity
