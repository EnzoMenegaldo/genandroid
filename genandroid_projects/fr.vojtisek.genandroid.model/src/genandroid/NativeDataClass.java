/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.NativeDataClass#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link genandroid.NativeDataClass#getDatabaseType <em>Database Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getNativeDataClass()
 * @model
 * @generated
 */
public interface NativeDataClass extends DataClassifier {
	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see genandroid.GenandroidPackage#getNativeDataClass_InstanceClassName()
	 * @model
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link genandroid.NativeDataClass#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see #setDatabaseType(String)
	 * @see genandroid.GenandroidPackage#getNativeDataClass_DatabaseType()
	 * @model
	 * @generated
	 */
	String getDatabaseType();

	/**
	 * Sets the value of the '{@link genandroid.NativeDataClass#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(String value);

} // NativeDataClass
