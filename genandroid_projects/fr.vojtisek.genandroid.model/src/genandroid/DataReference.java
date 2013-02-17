/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genandroid.DataReference#getStorage <em>Storage</em>}</li>
 *   <li>{@link genandroid.DataReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link genandroid.DataReference#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link genandroid.DataReference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genandroid.GenandroidPackage#getDataReference()
 * @model
 * @generated
 */
public interface DataReference extends StructuralFeature {
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
	 * @see genandroid.GenandroidPackage#getDataReference_Storage()
	 * @model default="0" required="true"
	 * @generated
	 */
	storageKind getStorage();

	/**
	 * Sets the value of the '{@link genandroid.DataReference#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see genandroid.storageKind
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(storageKind value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see genandroid.GenandroidPackage#getDataReference_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link genandroid.DataReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link genandroid.DataAssociation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(DataAssociation)
	 * @see genandroid.GenandroidPackage#getDataReference_Opposite()
	 * @see genandroid.DataAssociation#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	DataAssociation getOpposite();

	/**
	 * Sets the value of the '{@link genandroid.DataReference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(DataAssociation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataClass)
	 * @see genandroid.GenandroidPackage#getDataReference_Type()
	 * @model required="true"
	 * @generated
	 */
	DataClass getType();

	/**
	 * Sets the value of the '{@link genandroid.DataReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataClass value);

} // DataReference
