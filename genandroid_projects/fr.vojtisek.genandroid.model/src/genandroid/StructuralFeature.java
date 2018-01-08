/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.StructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link genandroid.StructuralFeature#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link genandroid.StructuralFeature#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getStructuralFeature()
 * @model
 * @generated
 */
public interface StructuralFeature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lowerbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowerbound</em>' attribute.
	 * @see #setLowerbound(int)
	 * @see genandroid.GenandroidPackage#getStructuralFeature_Lowerbound()
	 * @model
	 * @generated
	 */
	int getLowerbound();

	/**
	 * Sets the value of the '{@link genandroid.StructuralFeature#getLowerbound <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowerbound</em>' attribute.
	 * @see #getLowerbound()
	 * @generated
	 */
	void setLowerbound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see genandroid.GenandroidPackage#getStructuralFeature_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link genandroid.StructuralFeature#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see genandroid.GenandroidPackage#getStructuralFeature_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link genandroid.StructuralFeature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

} // StructuralFeature
