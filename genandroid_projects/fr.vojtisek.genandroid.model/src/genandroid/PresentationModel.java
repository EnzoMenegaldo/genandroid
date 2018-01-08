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
 * A representation of the model object '<em><b>Presentation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.PresentationModel#getViewActivities <em>View Activities</em>}</li>
 *   <li>{@link genandroid.PresentationModel#getPreferenceView <em>Preference View</em>}</li>
 *   <li>{@link genandroid.PresentationModel#getClassDetails <em>Class Details</em>}</li>
 *   <li>{@link genandroid.PresentationModel#getWelcomeView <em>Welcome View</em>}</li>
 *   <li>{@link genandroid.PresentationModel#getBackgroundActivities <em>Background Activities</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getPresentationModel()
 * @model
 * @generated
 */
public interface PresentationModel extends EObject {
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
	 * @see genandroid.GenandroidPackage#getPresentationModel_ViewActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewActivity> getViewActivities();

	/**
	 * Returns the value of the '<em><b>Preference View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference View</em>' reference.
	 * @see #setPreferenceView(PreferenceViewActivity)
	 * @see genandroid.GenandroidPackage#getPresentationModel_PreferenceView()
	 * @model
	 * @generated
	 */
	PreferenceViewActivity getPreferenceView();

	/**
	 * Sets the value of the '{@link genandroid.PresentationModel#getPreferenceView <em>Preference View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference View</em>' reference.
	 * @see #getPreferenceView()
	 * @generated
	 */
	void setPreferenceView(PreferenceViewActivity value);

	/**
	 * Returns the value of the '<em><b>Class Details</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.ClassDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Details</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Details</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getPresentationModel_ClassDetails()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDetail> getClassDetails();

	/**
	 * Returns the value of the '<em><b>Welcome View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome View</em>' reference.
	 * @see #setWelcomeView(ViewActivity)
	 * @see genandroid.GenandroidPackage#getPresentationModel_WelcomeView()
	 * @model required="true"
	 * @generated
	 */
	ViewActivity getWelcomeView();

	/**
	 * Sets the value of the '{@link genandroid.PresentationModel#getWelcomeView <em>Welcome View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome View</em>' reference.
	 * @see #getWelcomeView()
	 * @generated
	 */
	void setWelcomeView(ViewActivity value);

	/**
	 * Returns the value of the '<em><b>Background Activities</b></em>' containment reference list.
	 * The list contents are of type {@link genandroid.BackgroundActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Activities</em>' containment reference list.
	 * @see genandroid.GenandroidPackage#getPresentationModel_BackgroundActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<BackgroundActivity> getBackgroundActivities();

} // PresentationModel
