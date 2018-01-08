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
 * </p>
 * <ul>
 *   <li>{@link genandroid.DataModel#getDataClasses <em>Data Classes</em>}</li>
 *   <li>{@link genandroid.DataModel#getDataAssociations <em>Data Associations</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Classes</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.DataClassifier}.
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
	EList<DataClassifier> getDataClasses();

	/**
	 * Returns the value of the '<em><b>Data Associations</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.DataAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Associations</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getDataModel_DataAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAssociation> getDataAssociations();

} // DataModel
