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
 *   <li>{@link genandroid.AndroidProject#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link genandroid.AndroidProject#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link genandroid.AndroidProject#getFileHeader <em>File Header</em>}</li>
 *   <li>{@link genandroid.AndroidProject#getPresentationModel <em>Presentation Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getAndroidProject()
 * @model
 * @generated
 */
public interface AndroidProject extends NamedElement {
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

	/**
	 * Returns the value of the '<em><b>File Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Header</em>' attribute.
	 * @see #setFileHeader(String)
	 * @see genandroid.GenandroidPackage#getAndroidProject_FileHeader()
	 * @model
	 * @generated
	 */
	String getFileHeader();

	/**
	 * Sets the value of the '{@link genandroid.AndroidProject#getFileHeader <em>File Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Header</em>' attribute.
	 * @see #getFileHeader()
	 * @generated
	 */
	void setFileHeader(String value);

	/**
	 * Returns the value of the '<em><b>Presentation Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Model</em>' containment reference.
	 * @see #setPresentationModel(PresentationModel)
	 * @see genandroid.GenandroidPackage#getAndroidProject_PresentationModel()
	 * @model containment="true"
	 * @generated
	 */
	PresentationModel getPresentationModel();

	/**
	 * Sets the value of the '{@link genandroid.AndroidProject#getPresentationModel <em>Presentation Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Model</em>' containment reference.
	 * @see #getPresentationModel()
	 * @generated
	 */
	void setPresentationModel(PresentationModel value);

} // AndroidProject
