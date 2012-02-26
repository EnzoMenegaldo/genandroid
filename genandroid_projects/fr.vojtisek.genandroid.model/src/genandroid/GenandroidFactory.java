/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genandroid.GenandroidPackage
 * @generated
 */
public interface GenandroidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenandroidFactory eINSTANCE = genandroid.impl.GenandroidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Android Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Android Project</em>'.
	 * @generated
	 */
	AndroidProject createAndroidProject();

	/**
	 * Returns a new object of class '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Model</em>'.
	 * @generated
	 */
	DataModel createDataModel();

	/**
	 * Returns a new object of class '<em>Editable Element View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editable Element View Activity</em>'.
	 * @generated
	 */
	EditableElementViewActivity createEditableElementViewActivity();

	/**
	 * Returns a new object of class '<em>Class List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class List View Activity</em>'.
	 * @generated
	 */
	ClassListViewActivity createClassListViewActivity();

	/**
	 * Returns a new object of class '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Class</em>'.
	 * @generated
	 */
	DataClass createDataClass();

	/**
	 * Returns a new object of class '<em>Reference List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference List View Activity</em>'.
	 * @generated
	 */
	ReferenceListViewActivity createReferenceListViewActivity();

	/**
	 * Returns a new object of class '<em>Class Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Detail</em>'.
	 * @generated
	 */
	ClassDetail createClassDetail();

	/**
	 * Returns a new object of class '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Attribute</em>'.
	 * @generated
	 */
	DataAttribute createDataAttribute();

	/**
	 * Returns a new object of class '<em>Data Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Reference</em>'.
	 * @generated
	 */
	DataReference createDataReference();

	/**
	 * Returns a new object of class '<em>List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List View Activity</em>'.
	 * @generated
	 */
	ListViewActivity createListViewActivity();

	/**
	 * Returns a new object of class '<em>Attribute List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute List View Activity</em>'.
	 * @generated
	 */
	AttributeListViewActivity createAttributeListViewActivity();

	/**
	 * Returns a new object of class '<em>Element View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element View Activity</em>'.
	 * @generated
	 */
	ElementViewActivity createElementViewActivity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenandroidPackage getGenandroidPackage();

} //GenandroidFactory
