/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.BackgroundActivity#getTargetIntent <em>Target Intent</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getBackgroundActivity()
 * @model
 * @generated
 */
public interface BackgroundActivity extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Target Intent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Intent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Intent</em>' reference.
	 * @see #setTargetIntent(ViewActivity)
	 * @see genandroid.GenandroidPackage#getBackgroundActivity_TargetIntent()
	 * @model
	 * @generated
	 */
	ViewActivity getTargetIntent();

	/**
	 * Sets the value of the '{@link genandroid.BackgroundActivity#getTargetIntent <em>Target Intent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Intent</em>' reference.
	 * @see #getTargetIntent()
	 * @generated
	 */
	void setTargetIntent(ViewActivity value);

} // BackgroundActivity
