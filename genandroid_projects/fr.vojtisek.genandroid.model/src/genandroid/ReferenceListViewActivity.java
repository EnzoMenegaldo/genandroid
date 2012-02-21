/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference List View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.ReferenceListViewActivity#getReference <em>Reference</em>}</li>
 *   <li>{@link genandroid.ReferenceListViewActivity#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getReferenceListViewActivity()
 * @model
 * @generated
 */
public interface ReferenceListViewActivity extends ClassListViewActivity {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(DataReference)
	 * @see genandroid.GenandroidPackage#getReferenceListViewActivity_Reference()
	 * @model required="true"
	 * @generated
	 */
	DataReference getReference();

	/**
	 * Sets the value of the '{@link genandroid.ReferenceListViewActivity#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(DataReference value);

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
	 * @see genandroid.GenandroidPackage#getReferenceListViewActivity_From()
	 * @model required="true"
	 * @generated
	 */
	DataClass getFrom();

	/**
	 * Sets the value of the '{@link genandroid.ReferenceListViewActivity#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DataClass value);

} // ReferenceListViewActivity
