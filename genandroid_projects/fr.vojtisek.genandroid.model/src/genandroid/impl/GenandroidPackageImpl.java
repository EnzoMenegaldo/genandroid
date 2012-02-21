/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.AndroidProject;
import genandroid.AttributeListViewActivity;
import genandroid.ClassDetail;
import genandroid.ClassListViewActivity;
import genandroid.DataAttribute;
import genandroid.DataClass;
import genandroid.DataModel;
import genandroid.DataReference;
import genandroid.EditViewActivity;
import genandroid.GenandroidFactory;
import genandroid.GenandroidPackage;
import genandroid.ListViewActivity;
import genandroid.ReferenceListViewActivity;
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
	private EClass editViewActivityEClass = null;

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
	public EAttribute getAndroidProject_Name() {
		return (EAttribute)androidProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndroidProject_DataModel() {
		return (EReference)androidProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndroidProject_ViewActivities() {
		return (EReference)androidProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidProject_PackagePrefix() {
		return (EAttribute)androidProjectEClass.getEStructuralFeatures().get(3);
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
	public EReference getDataModel_RootClass() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataClasses() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataReferences() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_DataAttributes() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(3);
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
	public EClass getEditViewActivity() {
		return editViewActivityEClass;
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
	public EClass getDataClass() {
		return dataClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataClass_EClass() {
		return (EReference)dataClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataClass_Storage() {
		return (EAttribute)dataClassEClass.getEStructuralFeatures().get(1);
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
	public EClass getDataAttribute() {
		return dataAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAttribute_EAttribute() {
		return (EReference)dataAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAttribute_Storage() {
		return (EAttribute)dataAttributeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDataReference_EReference() {
		return (EReference)dataReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataReference_Storage() {
		return (EAttribute)dataReferenceEClass.getEStructuralFeatures().get(1);
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
		createEAttribute(androidProjectEClass, ANDROID_PROJECT__NAME);
		createEReference(androidProjectEClass, ANDROID_PROJECT__DATA_MODEL);
		createEReference(androidProjectEClass, ANDROID_PROJECT__VIEW_ACTIVITIES);
		createEAttribute(androidProjectEClass, ANDROID_PROJECT__PACKAGE_PREFIX);

		dataModelEClass = createEClass(DATA_MODEL);
		createEReference(dataModelEClass, DATA_MODEL__ROOT_CLASS);
		createEReference(dataModelEClass, DATA_MODEL__DATA_CLASSES);
		createEReference(dataModelEClass, DATA_MODEL__DATA_REFERENCES);
		createEReference(dataModelEClass, DATA_MODEL__DATA_ATTRIBUTES);

		viewActivityEClass = createEClass(VIEW_ACTIVITY);

		editViewActivityEClass = createEClass(EDIT_VIEW_ACTIVITY);

		classListViewActivityEClass = createEClass(CLASS_LIST_VIEW_ACTIVITY);
		createEReference(classListViewActivityEClass, CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT);

		dataClassEClass = createEClass(DATA_CLASS);
		createEReference(dataClassEClass, DATA_CLASS__ECLASS);
		createEAttribute(dataClassEClass, DATA_CLASS__STORAGE);

		referenceListViewActivityEClass = createEClass(REFERENCE_LIST_VIEW_ACTIVITY);
		createEReference(referenceListViewActivityEClass, REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE);
		createEReference(referenceListViewActivityEClass, REFERENCE_LIST_VIEW_ACTIVITY__FROM);

		classDetailEClass = createEClass(CLASS_DETAIL);

		dataAttributeEClass = createEClass(DATA_ATTRIBUTE);
		createEReference(dataAttributeEClass, DATA_ATTRIBUTE__EATTRIBUTE);
		createEAttribute(dataAttributeEClass, DATA_ATTRIBUTE__STORAGE);

		dataReferenceEClass = createEClass(DATA_REFERENCE);
		createEReference(dataReferenceEClass, DATA_REFERENCE__EREFERENCE);
		createEAttribute(dataReferenceEClass, DATA_REFERENCE__STORAGE);

		listViewActivityEClass = createEClass(LIST_VIEW_ACTIVITY);
		createEReference(listViewActivityEClass, LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION);

		attributeListViewActivityEClass = createEClass(ATTRIBUTE_LIST_VIEW_ACTIVITY);
		createEReference(attributeListViewActivityEClass, ATTRIBUTE_LIST_VIEW_ACTIVITY__ATTRIBUTE);
		createEReference(attributeListViewActivityEClass, ATTRIBUTE_LIST_VIEW_ACTIVITY__FROM);

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
		editViewActivityEClass.getESuperTypes().add(this.getViewActivity());
		classListViewActivityEClass.getESuperTypes().add(this.getListViewActivity());
		referenceListViewActivityEClass.getESuperTypes().add(this.getClassListViewActivity());
		listViewActivityEClass.getESuperTypes().add(this.getViewActivity());
		attributeListViewActivityEClass.getESuperTypes().add(this.getListViewActivity());

		// Initialize classes and features; add operations and parameters
		initEClass(androidProjectEClass, AndroidProject.class, "AndroidProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAndroidProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndroidProject_DataModel(), this.getDataModel(), null, "dataModel", null, 1, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndroidProject_ViewActivities(), this.getViewActivity(), null, "viewActivities", null, 0, -1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidProject_PackagePrefix(), theEcorePackage.getEString(), "packagePrefix", null, 1, 1, AndroidProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataModel_RootClass(), theEcorePackage.getEClass(), null, "rootClass", null, 0, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_DataClasses(), this.getDataClass(), null, "dataClasses", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_DataReferences(), this.getDataReference(), null, "dataReferences", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_DataAttributes(), this.getDataAttribute(), null, "dataAttributes", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewActivityEClass, ViewActivity.class, "ViewActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(editViewActivityEClass, EditViewActivity.class, "EditViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classListViewActivityEClass, ClassListViewActivity.class, "ClassListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassListViewActivity_ListedElement(), this.getDataClass(), null, "listedElement", null, 1, 1, ClassListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataClassEClass, DataClass.class, "DataClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataClass_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 1, 1, DataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataClass_Storage(), this.getstorageKind(), "storage", "0", 1, 1, DataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceListViewActivityEClass, ReferenceListViewActivity.class, "ReferenceListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceListViewActivity_Reference(), this.getDataReference(), null, "reference", null, 1, 1, ReferenceListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceListViewActivity_From(), this.getDataClass(), null, "from", null, 1, 1, ReferenceListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDetailEClass, ClassDetail.class, "ClassDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAttributeEClass, DataAttribute.class, "DataAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAttribute_EAttribute(), theEcorePackage.getEAttribute(), null, "eAttribute", null, 1, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAttribute_Storage(), this.getstorageKind(), "storage", "0", 1, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataReferenceEClass, DataReference.class, "DataReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataReference_EReference(), theEcorePackage.getEReference(), null, "eReference", null, 1, 1, DataReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataReference_Storage(), this.getstorageKind(), "storage", "0", 1, 1, DataReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listViewActivityEClass, ListViewActivity.class, "ListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListViewActivity_SelectItemAction(), this.getViewActivity(), null, "selectItemAction", null, 0, 1, ListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeListViewActivityEClass, AttributeListViewActivity.class, "AttributeListViewActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeListViewActivity_Attribute(), this.getDataAttribute(), null, "attribute", null, 1, 1, AttributeListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeListViewActivity_From(), this.getDataClass(), null, "from", null, 1, 1, AttributeListViewActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(storageKindEEnum, storageKind.class, "storageKind");
		addEEnumLiteral(storageKindEEnum, storageKind.SQ_LITE);
		addEEnumLiteral(storageKindEEnum, storageKind.XML);
		addEEnumLiteral(storageKindEEnum, storageKind.ZIPPED_XML);

		// Create resource
		createResource(eNS_URI);
	}

} //GenandroidPackageImpl
