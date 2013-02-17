/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenandroidFactoryImpl extends EFactoryImpl implements GenandroidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenandroidFactory init() {
		try {
			GenandroidFactory theGenandroidFactory = (GenandroidFactory)EPackage.Registry.INSTANCE.getEFactory("http://genandroid/1.0"); 
			if (theGenandroidFactory != null) {
				return theGenandroidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenandroidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenandroidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenandroidPackage.ANDROID_PROJECT: return createAndroidProject();
			case GenandroidPackage.DATA_MODEL: return createDataModel();
			case GenandroidPackage.EDITABLE_ELEMENT_VIEW_ACTIVITY: return createEditableElementViewActivity();
			case GenandroidPackage.CLASS_LIST_VIEW_ACTIVITY: return createClassListViewActivity();
			case GenandroidPackage.DATA_CLASS: return createDataClass();
			case GenandroidPackage.REFERENCE_LIST_VIEW_ACTIVITY: return createReferenceListViewActivity();
			case GenandroidPackage.CLASS_DETAIL: return createClassDetail();
			case GenandroidPackage.DATA_ATTRIBUTE: return createDataAttribute();
			case GenandroidPackage.DATA_REFERENCE: return createDataReference();
			case GenandroidPackage.LIST_VIEW_ACTIVITY: return createListViewActivity();
			case GenandroidPackage.ATTRIBUTE_LIST_VIEW_ACTIVITY: return createAttributeListViewActivity();
			case GenandroidPackage.ELEMENT_VIEW_ACTIVITY: return createElementViewActivity();
			case GenandroidPackage.PREFERENCE_VIEW_ACTIVITY: return createPreferenceViewActivity();
			case GenandroidPackage.NAMED_ELEMENT: return createNamedElement();
			case GenandroidPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case GenandroidPackage.CUSTOM_VIEW_ACTIVITY: return createCustomViewActivity();
			case GenandroidPackage.NATIVE_DATA_CLASS: return createNativeDataClass();
			case GenandroidPackage.DATA_ASSOCIATION: return createDataAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenandroidPackage.STORAGE_KIND:
				return createstorageKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenandroidPackage.STORAGE_KIND:
				return convertstorageKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidProject createAndroidProject() {
		AndroidProjectImpl androidProject = new AndroidProjectImpl();
		return androidProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditableElementViewActivity createEditableElementViewActivity() {
		EditableElementViewActivityImpl editableElementViewActivity = new EditableElementViewActivityImpl();
		return editableElementViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassListViewActivity createClassListViewActivity() {
		ClassListViewActivityImpl classListViewActivity = new ClassListViewActivityImpl();
		return classListViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass createDataClass() {
		DataClassImpl dataClass = new DataClassImpl();
		return dataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceListViewActivity createReferenceListViewActivity() {
		ReferenceListViewActivityImpl referenceListViewActivity = new ReferenceListViewActivityImpl();
		return referenceListViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDetail createClassDetail() {
		ClassDetailImpl classDetail = new ClassDetailImpl();
		return classDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAttribute createDataAttribute() {
		DataAttributeImpl dataAttribute = new DataAttributeImpl();
		return dataAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReference createDataReference() {
		DataReferenceImpl dataReference = new DataReferenceImpl();
		return dataReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListViewActivity createListViewActivity() {
		ListViewActivityImpl listViewActivity = new ListViewActivityImpl();
		return listViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeListViewActivity createAttributeListViewActivity() {
		AttributeListViewActivityImpl attributeListViewActivity = new AttributeListViewActivityImpl();
		return attributeListViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementViewActivity createElementViewActivity() {
		ElementViewActivityImpl elementViewActivity = new ElementViewActivityImpl();
		return elementViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferenceViewActivity createPreferenceViewActivity() {
		PreferenceViewActivityImpl preferenceViewActivity = new PreferenceViewActivityImpl();
		return preferenceViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature createStructuralFeature() {
		StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomViewActivity createCustomViewActivity() {
		CustomViewActivityImpl customViewActivity = new CustomViewActivityImpl();
		return customViewActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeDataClass createNativeDataClass() {
		NativeDataClassImpl nativeDataClass = new NativeDataClassImpl();
		return nativeDataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation createDataAssociation() {
		DataAssociationImpl dataAssociation = new DataAssociationImpl();
		return dataAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageKind createstorageKindFromString(EDataType eDataType, String initialValue) {
		storageKind result = storageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstorageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenandroidPackage getGenandroidPackage() {
		return (GenandroidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenandroidPackage getPackage() {
		return GenandroidPackage.eINSTANCE;
	}

} //GenandroidFactoryImpl
