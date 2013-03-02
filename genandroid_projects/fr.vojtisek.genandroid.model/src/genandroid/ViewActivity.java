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
 * A representation of the model object '<em><b>View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.ViewActivity#getAccessibleViews <em>Accessible Views</em>}</li>
 *   <li>{@link genandroid.ViewActivity#getTriggerableBackgroundActivities <em>Triggerable Background Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getViewActivity()
 * @model abstract="true"
 * @generated
 */
public interface ViewActivity extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Accessible Views</b></em>' reference list.
	 * The list contents are of type {@link genandroid.ViewActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessible Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Views</em>' reference list.
	 * @see genandroid.GenandroidPackage#getViewActivity_AccessibleViews()
	 * @model
	 * @generated
	 */
	EList<ViewActivity> getAccessibleViews();

	/**
	 * Returns the value of the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * The list contents are of type {@link genandroid.BackgroundActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggerable Background Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerable Background Activities</em>' reference list.
	 * @see genandroid.GenandroidPackage#getViewActivity_TriggerableBackgroundActivities()
	 * @model
	 * @generated
	 */
	EList<BackgroundActivity> getTriggerableBackgroundActivities();
} // ViewActivity
