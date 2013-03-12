/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.DataAttribute#getStorage <em>Storage</em>}</li>
 *   <li>{@link genandroid.DataAttribute#getType <em>Type</em>}</li>
 *   <li>{@link genandroid.DataAttribute#isSimpleXmlType <em>Simple Xml Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getDataAttribute()
 * @model
 * @generated
 */
public interface DataAttribute extends StructuralFeature {
	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link genandroid.storageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #setStorage(storageKind)
	 * @see genandroid.GenandroidPackage#getDataAttribute_Storage()
	 * @model default="0" required="true"
	 * @generated
	 */
	storageKind getStorage();

	/**
	 * Sets the value of the '{@link genandroid.DataAttribute#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(storageKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(NativeDataClass)
	 * @see genandroid.GenandroidPackage#getDataAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	NativeDataClass getType();

	/**
	 * Sets the value of the '{@link genandroid.DataAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NativeDataClass value);

	/**
	 * Returns the value of the '<em><b>Simple Xml Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An attribute of simple kind, will be serialized in a simple attribute rather that in dedicated tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Xml Type</em>' attribute.
	 * @see #setSimpleXmlType(boolean)
	 * @see genandroid.GenandroidPackage#getDataAttribute_SimpleXmlType()
	 * @model default=""
	 * @generated
	 */
	boolean isSimpleXmlType();

	/**
	 * Sets the value of the '{@link genandroid.DataAttribute#isSimpleXmlType <em>Simple Xml Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Xml Type</em>' attribute.
	 * @see #isSimpleXmlType()
	 * @generated
	 */
	void setSimpleXmlType(boolean value);

} // DataAttribute
