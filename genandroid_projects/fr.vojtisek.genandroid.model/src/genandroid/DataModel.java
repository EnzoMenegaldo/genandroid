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
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.DataModel#getRootClass <em>Root Class</em>}</li>
 *   <li>{@link genandroid.DataModel#getDataClasses <em>Data Classes</em>}</li>
 *   <li>{@link genandroid.DataModel#getDataReferences <em>Data References</em>}</li>
 *   <li>{@link genandroid.DataModel#getDataAttributes <em>Data Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Class</em>' reference.
	 * @see #setRootClass(EClass)
	 * @see genandroid.GenandroidPackage#getDataModel_RootClass()
	 * @model
	 * @generated
	 */
	EClass getRootClass();

	/**
	 * Sets the value of the '{@link genandroid.DataModel#getRootClass <em>Root Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Class</em>' reference.
	 * @see #getRootClass()
	 * @generated
	 */
	void setRootClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Data Classes</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.DataClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Classes</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getDataModel_DataClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataClass> getDataClasses();

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
	 * @see genandroid.GenandroidPackage#getDataModel_DataReferences()
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
	 * @see genandroid.GenandroidPackage#getDataModel_DataAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAttribute> getDataAttributes();

} // DataModel
