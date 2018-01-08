/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute List View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.AttributeListViewActivity#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link genandroid.AttributeListViewActivity#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getAttributeListViewActivity()
 * @model
 * @generated
 */
public interface AttributeListViewActivity extends ListViewActivity {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(DataAttribute)
	 * @see genandroid.GenandroidPackage#getAttributeListViewActivity_Attribute()
	 * @model required="true"
	 * @generated
	 */
	DataAttribute getAttribute();

	/**
	 * Sets the value of the '{@link genandroid.AttributeListViewActivity#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(DataAttribute value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DataClass)
	 * @see genandroid.GenandroidPackage#getAttributeListViewActivity_From()
	 * @model required="true"
	 * @generated
	 */
	DataClass getFrom();

	/**
	 * Sets the value of the '{@link genandroid.AttributeListViewActivity#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DataClass value);

} // AttributeListViewActivity
