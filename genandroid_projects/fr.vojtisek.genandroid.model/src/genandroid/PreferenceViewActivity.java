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
 * A representation of the model object '<em><b>Preference View Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.PreferenceViewActivity#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getPreferenceViewActivity()
 * @model
 * @generated
 */
public interface PreferenceViewActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Preferences"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see genandroid.GenandroidPackage#getPreferenceViewActivity_Name()
	 * @model default="Preferences" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genandroid.PreferenceViewActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PreferenceViewActivity
