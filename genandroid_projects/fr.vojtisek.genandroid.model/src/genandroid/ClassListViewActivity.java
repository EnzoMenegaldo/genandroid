/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class List View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.ClassListViewActivity#getListedElement <em>Listed Element</em>}</li>
 *   <li>{@link genandroid.ClassListViewActivity#getPresentedDetail <em>Presented Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getClassListViewActivity()
 * @model
 * @generated
 */
public interface ClassListViewActivity extends ListViewActivity {
	/**
	 * Returns the value of the '<em><b>Listed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listed Element</em>' reference.
	 * @see #setListedElement(DataClass)
	 * @see genandroid.GenandroidPackage#getClassListViewActivity_ListedElement()
	 * @model required="true"
	 * @generated
	 */
	DataClass getListedElement();

	/**
	 * Sets the value of the '{@link genandroid.ClassListViewActivity#getListedElement <em>Listed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listed Element</em>' reference.
	 * @see #getListedElement()
	 * @generated
	 */
	void setListedElement(DataClass value);

	/**
	 * Returns the value of the '<em><b>Presented Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presented Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presented Detail</em>' reference.
	 * @see #setPresentedDetail(ClassDetail)
	 * @see genandroid.GenandroidPackage#getClassListViewActivity_PresentedDetail()
	 * @model
	 * @generated
	 */
	ClassDetail getPresentedDetail();

	/**
	 * Sets the value of the '{@link genandroid.ClassListViewActivity#getPresentedDetail <em>Presented Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presented Detail</em>' reference.
	 * @see #getPresentedDetail()
	 * @generated
	 */
	void setPresentedDetail(ClassDetail value);

} // ClassListViewActivity
