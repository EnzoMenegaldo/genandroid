/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genandroid.DataAssociation#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see genandroid.GenandroidPackage#getDataAssociation()
 * @model
 * @generated
 */
public interface DataAssociation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link genandroid.DataReference}.
	 * It is bidirectional and its opposite is '{@link genandroid.DataReference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see genandroid.GenandroidPackage#getDataAssociation_References()
	 * @see genandroid.DataReference#getOpposite
	 * @model opposite="opposite" lower="2" upper="2"
	 * @generated
	 */
	EList<DataReference> getReferences();

} // DataAssociation
