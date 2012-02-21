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
 * A representation of the model object '<em><b>Android Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.AndroidProject#getName <em>Name</em>}</li>
 *   <li>{@link genandroid.AndroidProject#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link genandroid.AndroidProject#getViewActivities <em>View Activities</em>}</li>
 *   <li>{@link genandroid.AndroidProject#getPackagePrefix <em>Package Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getAndroidProject()
 * @model
 * @generated
 */
public interface AndroidProject extends EObject {
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
	 * @see genandroid.GenandroidPackage#getAndroidProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genandroid.AndroidProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model</em>' containment reference.
	 * @see #setDataModel(DataModel)
	 * @see genandroid.GenandroidPackage#getAndroidProject_DataModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataModel getDataModel();

	/**
	 * Sets the value of the '{@link genandroid.AndroidProject#getDataModel <em>Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Model</em>' containment reference.
	 * @see #getDataModel()
	 * @generated
	 */
	void setDataModel(DataModel value);

	/**
	 * Returns the value of the '<em><b>View Activities</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.ViewActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Activities</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getAndroidProject_ViewActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewActivity> getViewActivities();

	/**
	 * Returns the value of the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Prefix</em>' attribute.
	 * @see #setPackagePrefix(String)
	 * @see genandroid.GenandroidPackage#getAndroidProject_PackagePrefix()
	 * @model required="true"
	 * @generated
	 */
	String getPackagePrefix();

	/**
	 * Sets the value of the '{@link genandroid.AndroidProject#getPackagePrefix <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Prefix</em>' attribute.
	 * @see #getPackagePrefix()
	 * @generated
	 */
	void setPackagePrefix(String value);

} // AndroidProject
