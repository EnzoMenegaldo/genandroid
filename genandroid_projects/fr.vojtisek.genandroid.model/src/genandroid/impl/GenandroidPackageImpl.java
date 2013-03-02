/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.AndroidProject;
import genandroid.AttributeListViewActivity;
import genandroid.BackgroundActivity;
import genandroid.ClassDetail;
import genandroid.ClassListViewActivity;
import genandroid.CustomViewActivity;
import genandroid.DataAssociation;
import genandroid.DataAttribute;
import genandroid.DataClass;
import genandroid.DataClassifier;
import genandroid.DataModel;
import genandroid.DataReference;
import genandroid.EditableElementViewActivity;
import genandroid.ElementViewActivity;
import genandroid.GenandroidFactory;
import genandroid.GenandroidPackage;
import genandroid.ListViewActivity;
import genandroid.NamedElement;
import genandroid.NativeDataClass;
import genandroid.PreferenceViewActivity;
import genandroid.PresentationModel;
import genandroid.ReferenceListViewActivity;
import genandroid.StructuralFeature;
import genandroid.ViewActivity;
import genandroid.storageKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenandroidPackageImpl extends EPackageImpl implements GenandroidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass androidProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editableElementViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classListViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceListViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeListViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferenceViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customViewActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeDataClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see genandroid.GenandroidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenandroidPackageImpl() {
		super(eNS_URI, GenandroidFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GenandroidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenandroidPackage init() {
		if (isInited) return (GenandroidPackage)EPackage.Registry.INSTANCE.getEPackage(GenandroidPackage.eNS_URI);

		// Obtain or create and register package
		GenandroidPackageImpl theGenandroidPackage = (GenandroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenandroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenandroidPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGenandroidPackage.createPackageContents();

		// Initialize created meta-data
		theGenandroidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenandroidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenandroidPackage.eNS_URI, theGenandroidPackage);
		return theGenandroidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndroidProject() {
		return androidProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndroidProject_DataModel() {
		return (EReference)androidProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidProject_PackagePrefix() {
		return (EAttribute)androidProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidProject_FileHeader() {
		return (EAttribute)androidProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndroidProject_PresentationModel() {
		return (EReference)androidProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataClasses() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataAssociations() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewActivity() {
		return viewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewActivity_AccessibleViews() {
		return (EReference)viewActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewActivity_TriggerableBackgroundActivities() {
		return (EReference)viewActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditableElementViewActivity() {
		return editableElementViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassListViewActivity() {
		return classListViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassListViewActivity_ListedElement() {
		return (EReference)classListViewActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassListViewActivity_PresentedDetail() {
		return (EReference)classListViewActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataClass() {
		return dataClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataClass_Storage() {
		return (EAttribute)dataClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataClass_DataReferences() {
		return (EReference)dataClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataClass_DataAttributes() {
		return (EReference)dataClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceListViewActivity() {
		return referenceListViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceListViewActivity_Reference() {
		return (EReference)referenceListViewActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceListViewActivity_From() {
		return (EReference)referenceListViewActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDetail() {
		return classDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDetail_MainAttributes() {
		return (EReference)classDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDetail_Name() {
		return (EAttribute)classDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDetail_SecondaryAttributes() {
		return (EReference)classDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAttribute() {
		return dataAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAttribute_Storage() {
		return (EAttribute)dataAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAttribute_Type() {
		return (EReference)dataAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataReference() {
		return dataReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataReference_Storage() {
		return (EAttribute)dataReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataReference_Containment() {
		return (EAttribute)dataReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReference_Opposite() {
		return (EReference)dataReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataReference_Type() {
		return (EReference)dataReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListViewActivity() {
		return listViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListViewActivity_SelectItemAction() {
		return (EReference)listViewActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeListViewActivity() {
		return attributeListViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeListViewActivity_Attribute() {
		return (EReference)attributeListViewActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeListViewActivity_From() {
		return (EReference)attributeListViewActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementViewActivity() {
		return elementViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementViewActivity_Element() {
		return (EReference)elementViewActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferenceViewActivity() {
		return preferenceViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Documentation() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_Lowerbound() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_UpperBound() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_Derived() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomViewActivity() {
		return customViewActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataClassifier() {
		return dataClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeDataClass() {
		return nativeDataClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNativeDataClass_InstanceClassName() {
		return (EAttribute)nativeDataClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAssociation() {
		return dataAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_References() {
		return (EReference)dataAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundActivity() {
		return backgroundActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationModel() {
		return presentationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_ViewActivities() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_PreferenceView() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_ClassDetails() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_WelcomeView() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_BackgroundActivities() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getstorageKind() {
		return storageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenandroidFactory getGenandroidFactory() {
		return (GenandroidFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		androidProjectEClass = createEClass(ANDROID_PROJECT);
		createEReference(androidProjectEClass, ANDROID_PROJECT__DATA_MODEL);
		createEAttribute(androidProjectEClass, ANDROID_PROJECT__PACKAGE_PREFIX);
		createEAttribute(androidProjectEClass, ANDROID_PROJECT__FILE_HEADER);
		createEReference(androidProjectEClass, ANDROID_PROJECT__PRESENTATION_MODEL);

		dataModelEClass = createEClass(DATA_MODEL);
		createEReference(dataModelEClass, DATA_MODEL__DATA_CLASSES);
		createEReference(dataModelEClass, DATA_MODEL__DATA_ASSOCIATIONS);

		viewActivityEClass = createEClass(VIEW_ACTIVITY);
		createEReference(viewActivityEClass, VIEW_ACTIVITY__ACCESSIBLE_VIEWS);
		createEReference(viewActivityEClass, VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES);

		editableElementViewActivityEClass = createEClass(EDITABLE_ELEMENT_VIEW_ACTIVITY);

		classListViewActivityEClass = createEClass(CLASS_LIST_VIEW_ACTIVITY);
		createEReference(classListViewActivityEClass, CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT);
		createEReference(classListViewActivityEClass, CLASS_LIST_VIEW_ACTIVITY__PRESENTED_DETAIL);

		dataClassEClass = createEClass(DATA_CLASS);
		createEAttribute(dataClassEClass, DATA_CLASS__STORAGE);
		createEReference(dataClassEClass, DATA_CLASS__DATA_REFERENCES);
		createEReference(dataClassEClass, DATA_CLASS__DATA_ATTRIBUTES);

		referenceListViewActivityEClass = createEClass(REFERENCE_LIST_VIEW_ACTIVITY);
		createEReference(referenceListViewActivityEClass, REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE);
		createEReference(referenceListViewActivityEClass, REFERENCE_LIST_VIEW_ACTIVITY__FROM);

		classDetailEClass = createEClass(CLASS_DETAIL);
		createEReference(classDetailEClass, CLASS_DETAIL__MAIN_ATTRIBUTES);
		createEAttribute(classDetailEClass, CLASS_DETAIL__NAME);
		createEReference(classDetailEClass, CLASS_DETAIL__SECONDARY_ATTRIBUTES);

		dataAttributeEClass = createEClass(DATA_ATTRIBUTE);
		createEAttribute(dataAttributeEClass, DATA_ATTRIBUTE__STORAGE);
		createEReference(dataAttributeEClass, DATA_ATTRIBUTE__TYPE);

		dataReferenceEClass = createEClass(DATA_REFERENCE);
		createEAttribute(dataReferenceEClass, DATA_REFERENCE__STORAGE);
		createEAttribute(dataReferenceEClass, DATA_REFERENCE__CONTAINMENT);
		createEReference(dataReferenceEClass, DATA_REFERENCE__OPPOSITE);
		createEReference(dataReferenceEClass, DATA_REFERENCE__TYPE);

		listViewActivityEClass = createEClass(LIST_VIEW_ACTIVITY);
		createEReference(listViewActivityEClass, LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION);

		attributeListViewActivityEClass = createEClass(ATTRIBUTE_LIST_VIEW_ACTIVITY);
		createEReference(attributeListViewActivityEClass, ATTRIBUTE_LIST_VIEW_ACTIVITY__ATTRIBUTE);
		createEReference(attributeListViewActivityEClass, ATTRIBUTE_LIST_VIEW_ACTIVITY__FROM);

		elementViewActivityEClass = createEClass(ELEMENT_VIEW_ACTIVITY);
		createEReference(elementViewActivityEClass, ELEMENT_VIEW_ACTIVITY__ELEMENT);

		preferenceViewActivityEClass = createEClass(PREFERENCE_VIEW_ACTIVITY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DOCUMENTATION);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__DERIVED);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__LOWERBOUND);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__UPPER_BOUND);

		customViewActivityEClass = createEClass(CUSTOM_VIEW_ACTIVITY);

		dataClassifierEClass = createEClass(DATA_CLASSIFIER);

		nativeDataClassEClass = createEClass(NATIVE_DATA_CLASS);
		createEAttribute(nativeDataClassEClass, NATIVE_DATA_CLASS__INSTANCE_CLASS_NAME);

		dataAssociationEClass = createEClass(DATA_ASSOCIATION);
		createEReference(dataAssociationEClass, DATA_ASSOCIATION__REFERENCES);

		backgroundActivityEClass = createEClass(BACKGROUND_ACTIVITY);

		presentationModelEClass = createEClass(PRESENTATION_MODEL);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__VIEW_ACTIVITIES);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__PREFERENCE_VIEW);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__CLASS_DETAILS);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__WELCOME_VIEW);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__BACKGROUND_ACTIVITIES);

		// Create enums
		storageKindEEnum = createEEnum(STORAGE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		androidProjectEClass.getESuperTypes().add(this.getNamedElement());
		dataModelEClass.getESuperTypes().add(this.getNamedElement());
		viewActivityEClass.getESuperTypes().add(this.getNamedElement());
		editableElementViewActivityEClass.getESuperTypes().add(this.getElementViewActivity());
		classListViewActivityEClass.getESuperTypes().add(this.getListViewActivity());
		dataClassEClass.getESuperTypes().add(this.getDataClassifier());
		referenceListViewActivityEClass.getESuperTypes().add(this.getClassListViewActivity());
		dataAttributeEClass.getESuperTypes().add(this.getStructuralFeature());
		dataReferenceEClass.getESuperTypes().add(this.getStructuralFeature());
		listViewActivityEClass.getESuperTypes().add(this.getViewActivity());
		attributeListViewActivityEClass.getESuperTypes().add(this.getListViewActivity());
		elementViewActivityEClass.getESuperTypes().add(this.getViewActivity());
		preferenceViewActivityEClass.getESuperTypes().add(this.getViewActivity());
		structuralFeatureEClass.getESuperTypes().add(this.getNamedElement());
		customViewActivityEClass.getESuperTypes().add(this.getViewActivity());
		dataClassifierEClass.getESuperTypes().add(this.getNamedElement());
		nativeDataClassEClass.getESuperTypes().add(this.getDataClassifier());
		dataAssociationEClass.getESuperTypes().add(this.getNamedElement());
		backgroundActivityEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(androidProjectEClass, AndroidProject.class, "AndroidProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndroidProject_DataModel(), this.getDataModel(), null, "dataModel", null, 1, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidProject_PackagePrefix(), theEcorePackage.getEString(), "packagePrefix", null, 1, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidProject_FileHeader(), theEcorePackage.getEString(), "fileHeader", null, 0, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndroidProject_PresentationModel(), this.getPresentationModel(), null, "presentationModel", null, 0, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataModel_DataClasses(), this.getDataClassifier(), null, "dataClasses", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_DataAssociations(), this.getDataAssociation(), null, "dataAssociations", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewActivityEClass, ViewActivity.class, "ViewActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewActivity_AccessibleViews(), this.getViewActivity(), null, "accessibleViews", null, 0, -1, ViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewActivity_TriggerableBackgroundActivities(), this.getBackgroundActivity(), null, "triggerableBackgroundActivities", null, 0, -1, ViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editableElementViewActivityEClass, EditableElementViewActivity.class, "EditableElementViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classListViewActivityEClass, ClassListViewActivity.class, "ClassListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassListViewActivity_ListedElement(), this.getDataClass(), null, "listedElement", null, 1, 1, ClassListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassListViewActivity_PresentedDetail(), this.getClassDetail(), null, "presentedDetail", null, 0, 1, ClassListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataClassEClass, DataClass.class, "DataClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataClass_Storage(), this.getstorageKind(), "storage", "0", 1, 1, DataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataClass_DataReferences(), this.getDataReference(), null, "dataReferences", null, 0, -1, DataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataClass_DataAttributes(), this.getDataAttribute(), null, "dataAttributes", null, 0, -1, DataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceListViewActivityEClass, ReferenceListViewActivity.class, "ReferenceListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceListViewActivity_Reference(), this.getDataReference(), null, "reference", null, 1, 1, ReferenceListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceListViewActivity_From(), this.getDataClass(), null, "from", null, 1, 1, ReferenceListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDetailEClass, ClassDetail.class, "ClassDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDetail_MainAttributes(), this.getDataAttribute(), null, "mainAttributes", null, 1, -1, ClassDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDetail_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ClassDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDetail_SecondaryAttributes(), this.getDataAttribute(), null, "secondaryAttributes", null, 0, -1, ClassDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAttributeEClass, DataAttribute.class, "DataAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAttribute_Storage(), this.getstorageKind(), "storage", "0", 1, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAttribute_Type(), this.getNativeDataClass(), null, "type", null, 1, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataReferenceEClass, DataReference.class, "DataReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataReference_Storage(), this.getstorageKind(), "storage", "0", 1, 1, DataReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataReference_Containment(), theEcorePackage.getEBoolean(), "containment", null, 0, 1, DataReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataReference_Opposite(), this.getDataAssociation(), this.getDataAssociation_References(), "opposite", null, 0, 1, DataReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataReference_Type(), this.getDataClass(), null, "type", null, 1, 1, DataReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listViewActivityEClass, ListViewActivity.class, "ListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListViewActivity_SelectItemAction(), this.getViewActivity(), null, "selectItemAction", null, 0, 1, ListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeListViewActivityEClass, AttributeListViewActivity.class, "AttributeListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeListViewActivity_Attribute(), this.getDataAttribute(), null, "attribute", null, 1, 1, AttributeListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeListViewActivity_From(), this.getDataClass(), null, "from", null, 1, 1, AttributeListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementViewActivityEClass, ElementViewActivity.class, "ElementViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementViewActivity_Element(), this.getDataClass(), null, "element", null, 1, 1, ElementViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preferenceViewActivityEClass, PreferenceViewActivity.class, "PreferenceViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_Derived(), theEcorePackage.getEBoolean(), "derived", null, 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuralFeature_Lowerbound(), theEcorePackage.getEInt(), "lowerbound", null, 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuralFeature_UpperBound(), theEcorePackage.getEInt(), "upperBound", "1", 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customViewActivityEClass, CustomViewActivity.class, "CustomViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataClassifierEClass, DataClassifier.class, "DataClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nativeDataClassEClass, NativeDataClass.class, "NativeDataClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNativeDataClass_InstanceClassName(), theEcorePackage.getEString(), "instanceClassName", null, 0, 1, NativeDataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAssociationEClass, DataAssociation.class, "DataAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAssociation_References(), this.getDataReference(), this.getDataReference_Opposite(), "references", null, 2, 2, DataAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundActivityEClass, BackgroundActivity.class, "BackgroundActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presentationModelEClass, PresentationModel.class, "PresentationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationModel_ViewActivities(), this.getViewActivity(), null, "viewActivities", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationModel_PreferenceView(), this.getPreferenceViewActivity(), null, "preferenceView", null, 0, 1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationModel_ClassDetails(), this.getClassDetail(), null, "classDetails", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationModel_WelcomeView(), this.getViewActivity(), null, "welcomeView", null, 1, 1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationModel_BackgroundActivities(), this.getBackgroundActivity(), null, "backgroundActivities", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(storageKindEEnum, storageKind.class, "storageKind");
		addEEnumLiteral(storageKindEEnum, storageKind.SQ_LITE);
		addEEnumLiteral(storageKindEEnum, storageKind.XML);
		addEEnumLiteral(storageKindEEnum, storageKind.ZIPPED_XML);
		addEEnumLiteral(storageKindEEnum, storageKind.FILE);

		// Create resource
		createResource(eNS_URI);
	}

} //GenandroidPackageImpl
