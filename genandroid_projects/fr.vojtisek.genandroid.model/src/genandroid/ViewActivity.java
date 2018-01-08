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
 * </p>
 * <ul>
 *   <li>{@link genandroid.ViewActivity#getAccessibleViews <em>Accessible Views</em>}</li>
 *   <li>{@link genandroid.ViewActivity#getTriggerableBackgroundActivities <em>Triggerable Background Activities</em>}</li>
 *   <li>{@link genandroid.ViewActivity#isHasSupportForParentActivity <em>Has Support For Parent Activity</em>}</li>
 *   <li>{@link genandroid.ViewActivity#getDefaultParentActivity <em>Default Parent Activity</em>}</li>
 * </ul>
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

	/**
	 * Returns the value of the '<em><b>Has Support For Parent Activity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Support For Parent Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Support For Parent Activity</em>' attribute.
	 * @see #setHasSupportForParentActivity(boolean)
	 * @see genandroid.GenandroidPackage#getViewActivity_HasSupportForParentActivity()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasSupportForParentActivity();

	/**
	 * Sets the value of the '{@link genandroid.ViewActivity#isHasSupportForParentActivity <em>Has Support For Parent Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Support For Parent Activity</em>' attribute.
	 * @see #isHasSupportForParentActivity()
	 * @generated
	 */
	void setHasSupportForParentActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Parent Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Parent Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Parent Activity</em>' reference.
	 * @see #setDefaultParentActivity(ViewActivity)
	 * @see genandroid.GenandroidPackage#getViewActivity_DefaultParentActivity()
	 * @model
	 * @generated
	 */
	ViewActivity getDefaultParentActivity();

	/**
	 * Sets the value of the '{@link genandroid.ViewActivity#getDefaultParentActivity <em>Default Parent Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Parent Activity</em>' reference.
	 * @see #getDefaultParentActivity()
	 * @generated
	 */
	void setDefaultParentActivity(ViewActivity value);
} // ViewActivity
