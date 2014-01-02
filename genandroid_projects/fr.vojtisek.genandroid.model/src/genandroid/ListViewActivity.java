/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.ListViewActivity#getSelectItemAction <em>Select Item Action</em>}</li>
 *   <li>{@link genandroid.ListViewActivity#isIsFilterable <em>Is Filterable</em>}</li>
 *   <li>{@link genandroid.ListViewActivity#isIsLargeList <em>Is Large List</em>}</li>
 *   <li>{@link genandroid.ListViewActivity#isUseIndexSearch <em>Use Index Search</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getListViewActivity()
 * @model
 * @generated
 */
public interface ListViewActivity extends ViewActivity {
	/**
	 * Returns the value of the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Item Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Item Action</em>' reference.
	 * @see #setSelectItemAction(ViewActivity)
	 * @see genandroid.GenandroidPackage#getListViewActivity_SelectItemAction()
	 * @model
	 * @generated
	 */
	ViewActivity getSelectItemAction();

	/**
	 * Sets the value of the '{@link genandroid.ListViewActivity#getSelectItemAction <em>Select Item Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Item Action</em>' reference.
	 * @see #getSelectItemAction()
	 * @generated
	 */
	void setSelectItemAction(ViewActivity value);

	/**
	 * Returns the value of the '<em><b>Is Filterable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Filterable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Filterable</em>' attribute.
	 * @see #setIsFilterable(boolean)
	 * @see genandroid.GenandroidPackage#getListViewActivity_IsFilterable()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsFilterable();

	/**
	 * Sets the value of the '{@link genandroid.ListViewActivity#isIsFilterable <em>Is Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Filterable</em>' attribute.
	 * @see #isIsFilterable()
	 * @generated
	 */
	void setIsFilterable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Large List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Large List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Large List</em>' attribute.
	 * @see #setIsLargeList(boolean)
	 * @see genandroid.GenandroidPackage#getListViewActivity_IsLargeList()
	 * @model
	 * @generated
	 */
	boolean isIsLargeList();

	/**
	 * Sets the value of the '{@link genandroid.ListViewActivity#isIsLargeList <em>Is Large List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Large List</em>' attribute.
	 * @see #isIsLargeList()
	 * @generated
	 */
	void setIsLargeList(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Index Search</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Index Search</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Index Search</em>' attribute.
	 * @see #setUseIndexSearch(boolean)
	 * @see genandroid.GenandroidPackage#getListViewActivity_UseIndexSearch()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseIndexSearch();

	/**
	 * Sets the value of the '{@link genandroid.ListViewActivity#isUseIndexSearch <em>Use Index Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Index Search</em>' attribute.
	 * @see #isUseIndexSearch()
	 * @generated
	 */
	void setUseIndexSearch(boolean value);

} // ListViewActivity
