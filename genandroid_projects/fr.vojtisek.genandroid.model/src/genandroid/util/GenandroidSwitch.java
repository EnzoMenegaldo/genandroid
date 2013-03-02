/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.util;

import genandroid.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see genandroid.GenandroidPackage
 * @generated
 */
public class GenandroidSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenandroidPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenandroidSwitch() {
		if (modelPackage == null) {
			modelPackage = GenandroidPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenandroidPackage.ANDROID_PROJECT: {
				AndroidProject androidProject = (AndroidProject)theEObject;
				T result = caseAndroidProject(androidProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.DATA_MODEL: {
				DataModel dataModel = (DataModel)theEObject;
				T result = caseDataModel(dataModel);
				if (result == null) result = caseNamedElement(dataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.VIEW_ACTIVITY: {
				ViewActivity viewActivity = (ViewActivity)theEObject;
				T result = caseViewActivity(viewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.EDITABLE_ELEMENT_VIEW_ACTIVITY: {
				EditableElementViewActivity editableElementViewActivity = (EditableElementViewActivity)theEObject;
				T result = caseEditableElementViewActivity(editableElementViewActivity);
				if (result == null) result = caseElementViewActivity(editableElementViewActivity);
				if (result == null) result = caseViewActivity(editableElementViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY: {
				ClassListViewActivity classListViewActivity = (ClassListViewActivity)theEObject;
				T result = caseClassListViewActivity(classListViewActivity);
				if (result == null) result = caseListViewActivity(classListViewActivity);
				if (result == null) result = caseViewActivity(classListViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.DATA_CLASS: {
				DataClass dataClass = (DataClass)theEObject;
				T result = caseDataClass(dataClass);
				if (result == null) result = caseDataClassifier(dataClass);
				if (result == null) result = caseNamedElement(dataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY: {
				ReferenceListViewActivity referenceListViewActivity = (ReferenceListViewActivity)theEObject;
				T result = caseReferenceListViewActivity(referenceListViewActivity);
				if (result == null) result = caseClassListViewActivity(referenceListViewActivity);
				if (result == null) result = caseListViewActivity(referenceListViewActivity);
				if (result == null) result = caseViewActivity(referenceListViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.CLASS_DETAIL: {
				ClassDetail classDetail = (ClassDetail)theEObject;
				T result = caseClassDetail(classDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.DATA_ATTRIBUTE: {
				DataAttribute dataAttribute = (DataAttribute)theEObject;
				T result = caseDataAttribute(dataAttribute);
				if (result == null) result = caseStructuralFeature(dataAttribute);
				if (result == null) result = caseNamedElement(dataAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.DATA_REFERENCE: {
				DataReference dataReference = (DataReference)theEObject;
				T result = caseDataReference(dataReference);
				if (result == null) result = caseStructuralFeature(dataReference);
				if (result == null) result = caseNamedElement(dataReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.LIST_VIEW_ACTIVITY: {
				ListViewActivity listViewActivity = (ListViewActivity)theEObject;
				T result = caseListViewActivity(listViewActivity);
				if (result == null) result = caseViewActivity(listViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.ATTRIBUTE_LIST_VIEW_ACTIVITY: {
				AttributeListViewActivity attributeListViewActivity = (AttributeListViewActivity)theEObject;
				T result = caseAttributeListViewActivity(attributeListViewActivity);
				if (result == null) result = caseListViewActivity(attributeListViewActivity);
				if (result == null) result = caseViewActivity(attributeListViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.ELEMENT_VIEW_ACTIVITY: {
				ElementViewActivity elementViewActivity = (ElementViewActivity)theEObject;
				T result = caseElementViewActivity(elementViewActivity);
				if (result == null) result = caseViewActivity(elementViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.PREFERENCE_VIEW_ACTIVITY: {
				PreferenceViewActivity preferenceViewActivity = (PreferenceViewActivity)theEObject;
				T result = casePreferenceViewActivity(preferenceViewActivity);
				if (result == null) result = caseViewActivity(preferenceViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseNamedElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.CUSTOM_VIEW_ACTIVITY: {
				CustomViewActivity customViewActivity = (CustomViewActivity)theEObject;
				T result = caseCustomViewActivity(customViewActivity);
				if (result == null) result = caseViewActivity(customViewActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.DATA_CLASSIFIER: {
				DataClassifier dataClassifier = (DataClassifier)theEObject;
				T result = caseDataClassifier(dataClassifier);
				if (result == null) result = caseNamedElement(dataClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.NATIVE_DATA_CLASS: {
				NativeDataClass nativeDataClass = (NativeDataClass)theEObject;
				T result = caseNativeDataClass(nativeDataClass);
				if (result == null) result = caseDataClassifier(nativeDataClass);
				if (result == null) result = caseNamedElement(nativeDataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.DATA_ASSOCIATION: {
				DataAssociation dataAssociation = (DataAssociation)theEObject;
				T result = caseDataAssociation(dataAssociation);
				if (result == null) result = caseNamedElement(dataAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.BACKGROUND_ACTIVITY: {
				BackgroundActivity backgroundActivity = (BackgroundActivity)theEObject;
				T result = caseBackgroundActivity(backgroundActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenandroidPackage.PRESENTATION_MODEL: {
				PresentationModel presentationModel = (PresentationModel)theEObject;
				T result = casePresentationModel(presentationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Android Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Android Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndroidProject(AndroidProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataModel(DataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewActivity(ViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editable Element View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editable Element View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditableElementViewActivity(EditableElementViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class List View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassListViewActivity(ClassListViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataClass(DataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference List View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceListViewActivity(ReferenceListViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDetail(ClassDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAttribute(DataAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataReference(DataReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListViewActivity(ListViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute List View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute List View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeListViewActivity(AttributeListViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementViewActivity(ElementViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preference View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preference View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferenceViewActivity(PreferenceViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom View Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom View Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomViewActivity(CustomViewActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataClassifier(DataClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Data Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeDataClass(NativeDataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAssociation(DataAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundActivity(BackgroundActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationModel(PresentationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenandroidSwitch
