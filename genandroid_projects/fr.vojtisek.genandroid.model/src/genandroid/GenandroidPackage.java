/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see genandroid.GenandroidFactory
 * @model kind="package"
 * @generated
 */
public interface GenandroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genandroid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genandroid/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genandroid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenandroidPackage eINSTANCE = genandroid.impl.GenandroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link genandroid.impl.AndroidProjectImpl <em>Android Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.AndroidProjectImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getAndroidProject()
	 * @generated
	 */
	int ANDROID_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>View Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__VIEW_ACTIVITIES = 2;

	/**
	 * The feature id for the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__PACKAGE_PREFIX = 3;

	/**
	 * The number of structural features of the '<em>Android Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link genandroid.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.DataModelImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Root Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__ROOT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Data Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Data References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Data Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link genandroid.impl.ViewActivityImpl <em>View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.ViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getViewActivity()
	 * @generated
	 */
	int VIEW_ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ACTIVITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genandroid.impl.EditViewActivityImpl <em>Edit View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.EditViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getEditViewActivity()
	 * @generated
	 */
	int EDIT_VIEW_ACTIVITY = 3;

	/**
	 * The number of structural features of the '<em>Edit View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_VIEW_ACTIVITY_FEATURE_COUNT = VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genandroid.impl.ListViewActivityImpl <em>List View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.ListViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getListViewActivity()
	 * @generated
	 */
	int LIST_VIEW_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY_FEATURE_COUNT = VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genandroid.impl.ClassListViewActivityImpl <em>Class List View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.ClassListViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getClassListViewActivity()
	 * @generated
	 */
	int CLASS_LIST_VIEW_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION;

	/**
	 * The feature id for the '<em><b>Listed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class List View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY_FEATURE_COUNT = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genandroid.impl.DataClassImpl <em>Data Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.DataClassImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getDataClass()
	 * @generated
	 */
	int DATA_CLASS = 5;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__STORAGE = 1;

	/**
	 * The number of structural features of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link genandroid.impl.ReferenceListViewActivityImpl <em>Reference List View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.ReferenceListViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getReferenceListViewActivity()
	 * @generated
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = CLASS_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION;

	/**
	 * The feature id for the '<em><b>Listed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__LISTED_ELEMENT = CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE = CLASS_LIST_VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__FROM = CLASS_LIST_VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference List View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY_FEATURE_COUNT = CLASS_LIST_VIEW_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genandroid.impl.ClassDetailImpl <em>Class Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.ClassDetailImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getClassDetail()
	 * @generated
	 */
	int CLASS_DETAIL = 7;

	/**
	 * The number of structural features of the '<em>Class Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DETAIL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genandroid.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.DataAttributeImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getDataAttribute()
	 * @generated
	 */
	int DATA_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__STORAGE = 1;

	/**
	 * The number of structural features of the '<em>Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link genandroid.impl.DataReferenceImpl <em>Data Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.DataReferenceImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getDataReference()
	 * @generated
	 */
	int DATA_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__EREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__STORAGE = 1;

	/**
	 * The number of structural features of the '<em>Data Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link genandroid.impl.AttributeListViewActivityImpl <em>Attribute List View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.AttributeListViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getAttributeListViewActivity()
	 * @generated
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY = 11;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__ATTRIBUTE = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__FROM = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute List View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY_FEATURE_COUNT = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genandroid.storageKind <em>storage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.storageKind
	 * @see genandroid.impl.GenandroidPackageImpl#getstorageKind()
	 * @generated
	 */
	int STORAGE_KIND = 12;


	/**
	 * Returns the meta object for class '{@link genandroid.AndroidProject <em>Android Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Android Project</em>'.
	 * @see genandroid.AndroidProject
	 * @generated
	 */
	EClass getAndroidProject();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.AndroidProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genandroid.AndroidProject#getName()
	 * @see #getAndroidProject()
	 * @generated
	 */
	EAttribute getAndroidProject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link genandroid.AndroidProject#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Model</em>'.
	 * @see genandroid.AndroidProject#getDataModel()
	 * @see #getAndroidProject()
	 * @generated
	 */
	EReference getAndroidProject_DataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.AndroidProject#getViewActivities <em>View Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Activities</em>'.
	 * @see genandroid.AndroidProject#getViewActivities()
	 * @see #getAndroidProject()
	 * @generated
	 */
	EReference getAndroidProject_ViewActivities();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.AndroidProject#getPackagePrefix <em>Package Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Prefix</em>'.
	 * @see genandroid.AndroidProject#getPackagePrefix()
	 * @see #getAndroidProject()
	 * @generated
	 */
	EAttribute getAndroidProject_PackagePrefix();

	/**
	 * Returns the meta object for class '{@link genandroid.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see genandroid.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the reference '{@link genandroid.DataModel#getRootClass <em>Root Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Class</em>'.
	 * @see genandroid.DataModel#getRootClass()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_RootClass();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.DataModel#getDataClasses <em>Data Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Classes</em>'.
	 * @see genandroid.DataModel#getDataClasses()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.DataModel#getDataReferences <em>Data References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data References</em>'.
	 * @see genandroid.DataModel#getDataReferences()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.DataModel#getDataAttributes <em>Data Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Attributes</em>'.
	 * @see genandroid.DataModel#getDataAttributes()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataAttributes();

	/**
	 * Returns the meta object for class '{@link genandroid.ViewActivity <em>View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Activity</em>'.
	 * @see genandroid.ViewActivity
	 * @generated
	 */
	EClass getViewActivity();

	/**
	 * Returns the meta object for class '{@link genandroid.EditViewActivity <em>Edit View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit View Activity</em>'.
	 * @see genandroid.EditViewActivity
	 * @generated
	 */
	EClass getEditViewActivity();

	/**
	 * Returns the meta object for class '{@link genandroid.ClassListViewActivity <em>Class List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class List View Activity</em>'.
	 * @see genandroid.ClassListViewActivity
	 * @generated
	 */
	EClass getClassListViewActivity();

	/**
	 * Returns the meta object for the reference '{@link genandroid.ClassListViewActivity#getListedElement <em>Listed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listed Element</em>'.
	 * @see genandroid.ClassListViewActivity#getListedElement()
	 * @see #getClassListViewActivity()
	 * @generated
	 */
	EReference getClassListViewActivity_ListedElement();

	/**
	 * Returns the meta object for class '{@link genandroid.DataClass <em>Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Class</em>'.
	 * @see genandroid.DataClass
	 * @generated
	 */
	EClass getDataClass();

	/**
	 * Returns the meta object for the reference '{@link genandroid.DataClass#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see genandroid.DataClass#getEClass()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_EClass();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.DataClass#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see genandroid.DataClass#getStorage()
	 * @see #getDataClass()
	 * @generated
	 */
	EAttribute getDataClass_Storage();

	/**
	 * Returns the meta object for class '{@link genandroid.ReferenceListViewActivity <em>Reference List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference List View Activity</em>'.
	 * @see genandroid.ReferenceListViewActivity
	 * @generated
	 */
	EClass getReferenceListViewActivity();

	/**
	 * Returns the meta object for the reference '{@link genandroid.ReferenceListViewActivity#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see genandroid.ReferenceListViewActivity#getReference()
	 * @see #getReferenceListViewActivity()
	 * @generated
	 */
	EReference getReferenceListViewActivity_Reference();

	/**
	 * Returns the meta object for the reference '{@link genandroid.ReferenceListViewActivity#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see genandroid.ReferenceListViewActivity#getFrom()
	 * @see #getReferenceListViewActivity()
	 * @generated
	 */
	EReference getReferenceListViewActivity_From();

	/**
	 * Returns the meta object for class '{@link genandroid.ClassDetail <em>Class Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Detail</em>'.
	 * @see genandroid.ClassDetail
	 * @generated
	 */
	EClass getClassDetail();

	/**
	 * Returns the meta object for class '{@link genandroid.DataAttribute <em>Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Attribute</em>'.
	 * @see genandroid.DataAttribute
	 * @generated
	 */
	EClass getDataAttribute();

	/**
	 * Returns the meta object for the reference '{@link genandroid.DataAttribute#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see genandroid.DataAttribute#getEAttribute()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EReference getDataAttribute_EAttribute();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.DataAttribute#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see genandroid.DataAttribute#getStorage()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EAttribute getDataAttribute_Storage();

	/**
	 * Returns the meta object for class '{@link genandroid.DataReference <em>Data Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Reference</em>'.
	 * @see genandroid.DataReference
	 * @generated
	 */
	EClass getDataReference();

	/**
	 * Returns the meta object for the reference '{@link genandroid.DataReference#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see genandroid.DataReference#getEReference()
	 * @see #getDataReference()
	 * @generated
	 */
	EReference getDataReference_EReference();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.DataReference#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see genandroid.DataReference#getStorage()
	 * @see #getDataReference()
	 * @generated
	 */
	EAttribute getDataReference_Storage();

	/**
	 * Returns the meta object for class '{@link genandroid.ListViewActivity <em>List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List View Activity</em>'.
	 * @see genandroid.ListViewActivity
	 * @generated
	 */
	EClass getListViewActivity();

	/**
	 * Returns the meta object for the reference '{@link genandroid.ListViewActivity#getSelectItemAction <em>Select Item Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Item Action</em>'.
	 * @see genandroid.ListViewActivity#getSelectItemAction()
	 * @see #getListViewActivity()
	 * @generated
	 */
	EReference getListViewActivity_SelectItemAction();

	/**
	 * Returns the meta object for class '{@link genandroid.AttributeListViewActivity <em>Attribute List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute List View Activity</em>'.
	 * @see genandroid.AttributeListViewActivity
	 * @generated
	 */
	EClass getAttributeListViewActivity();

	/**
	 * Returns the meta object for the reference '{@link genandroid.AttributeListViewActivity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see genandroid.AttributeListViewActivity#getAttribute()
	 * @see #getAttributeListViewActivity()
	 * @generated
	 */
	EReference getAttributeListViewActivity_Attribute();

	/**
	 * Returns the meta object for the reference '{@link genandroid.AttributeListViewActivity#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see genandroid.AttributeListViewActivity#getFrom()
	 * @see #getAttributeListViewActivity()
	 * @generated
	 */
	EReference getAttributeListViewActivity_From();

	/**
	 * Returns the meta object for enum '{@link genandroid.storageKind <em>storage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>storage Kind</em>'.
	 * @see genandroid.storageKind
	 * @generated
	 */
	EEnum getstorageKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenandroidFactory getGenandroidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link genandroid.impl.AndroidProjectImpl <em>Android Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.AndroidProjectImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getAndroidProject()
		 * @generated
		 */
		EClass ANDROID_PROJECT = eINSTANCE.getAndroidProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_PROJECT__NAME = eINSTANCE.getAndroidProject_Name();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDROID_PROJECT__DATA_MODEL = eINSTANCE.getAndroidProject_DataModel();

		/**
		 * The meta object literal for the '<em><b>View Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDROID_PROJECT__VIEW_ACTIVITIES = eINSTANCE.getAndroidProject_ViewActivities();

		/**
		 * The meta object literal for the '<em><b>Package Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_PROJECT__PACKAGE_PREFIX = eINSTANCE.getAndroidProject_PackagePrefix();

		/**
		 * The meta object literal for the '{@link genandroid.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.DataModelImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Root Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__ROOT_CLASS = eINSTANCE.getDataModel_RootClass();

		/**
		 * The meta object literal for the '<em><b>Data Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_CLASSES = eINSTANCE.getDataModel_DataClasses();

		/**
		 * The meta object literal for the '<em><b>Data References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_REFERENCES = eINSTANCE.getDataModel_DataReferences();

		/**
		 * The meta object literal for the '<em><b>Data Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_ATTRIBUTES = eINSTANCE.getDataModel_DataAttributes();

		/**
		 * The meta object literal for the '{@link genandroid.impl.ViewActivityImpl <em>View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.ViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getViewActivity()
		 * @generated
		 */
		EClass VIEW_ACTIVITY = eINSTANCE.getViewActivity();

		/**
		 * The meta object literal for the '{@link genandroid.impl.EditViewActivityImpl <em>Edit View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.EditViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getEditViewActivity()
		 * @generated
		 */
		EClass EDIT_VIEW_ACTIVITY = eINSTANCE.getEditViewActivity();

		/**
		 * The meta object literal for the '{@link genandroid.impl.ClassListViewActivityImpl <em>Class List View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.ClassListViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getClassListViewActivity()
		 * @generated
		 */
		EClass CLASS_LIST_VIEW_ACTIVITY = eINSTANCE.getClassListViewActivity();

		/**
		 * The meta object literal for the '<em><b>Listed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT = eINSTANCE.getClassListViewActivity_ListedElement();

		/**
		 * The meta object literal for the '{@link genandroid.impl.DataClassImpl <em>Data Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.DataClassImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getDataClass()
		 * @generated
		 */
		EClass DATA_CLASS = eINSTANCE.getDataClass();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__ECLASS = eINSTANCE.getDataClass_EClass();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CLASS__STORAGE = eINSTANCE.getDataClass_Storage();

		/**
		 * The meta object literal for the '{@link genandroid.impl.ReferenceListViewActivityImpl <em>Reference List View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.ReferenceListViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getReferenceListViewActivity()
		 * @generated
		 */
		EClass REFERENCE_LIST_VIEW_ACTIVITY = eINSTANCE.getReferenceListViewActivity();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LIST_VIEW_ACTIVITY__REFERENCE = eINSTANCE.getReferenceListViewActivity_Reference();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LIST_VIEW_ACTIVITY__FROM = eINSTANCE.getReferenceListViewActivity_From();

		/**
		 * The meta object literal for the '{@link genandroid.impl.ClassDetailImpl <em>Class Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.ClassDetailImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getClassDetail()
		 * @generated
		 */
		EClass CLASS_DETAIL = eINSTANCE.getClassDetail();

		/**
		 * The meta object literal for the '{@link genandroid.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.DataAttributeImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getDataAttribute()
		 * @generated
		 */
		EClass DATA_ATTRIBUTE = eINSTANCE.getDataAttribute();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ATTRIBUTE__EATTRIBUTE = eINSTANCE.getDataAttribute_EAttribute();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ATTRIBUTE__STORAGE = eINSTANCE.getDataAttribute_Storage();

		/**
		 * The meta object literal for the '{@link genandroid.impl.DataReferenceImpl <em>Data Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.DataReferenceImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getDataReference()
		 * @generated
		 */
		EClass DATA_REFERENCE = eINSTANCE.getDataReference();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REFERENCE__EREFERENCE = eINSTANCE.getDataReference_EReference();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_REFERENCE__STORAGE = eINSTANCE.getDataReference_Storage();

		/**
		 * The meta object literal for the '{@link genandroid.impl.ListViewActivityImpl <em>List View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.ListViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getListViewActivity()
		 * @generated
		 */
		EClass LIST_VIEW_ACTIVITY = eINSTANCE.getListViewActivity();

		/**
		 * The meta object literal for the '<em><b>Select Item Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = eINSTANCE.getListViewActivity_SelectItemAction();

		/**
		 * The meta object literal for the '{@link genandroid.impl.AttributeListViewActivityImpl <em>Attribute List View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.AttributeListViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getAttributeListViewActivity()
		 * @generated
		 */
		EClass ATTRIBUTE_LIST_VIEW_ACTIVITY = eINSTANCE.getAttributeListViewActivity();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LIST_VIEW_ACTIVITY__ATTRIBUTE = eINSTANCE.getAttributeListViewActivity_Attribute();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LIST_VIEW_ACTIVITY__FROM = eINSTANCE.getAttributeListViewActivity_From();

		/**
		 * The meta object literal for the '{@link genandroid.storageKind <em>storage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.storageKind
		 * @see genandroid.impl.GenandroidPackageImpl#getstorageKind()
		 * @generated
		 */
		EEnum STORAGE_KIND = eINSTANCE.getstorageKind();

	}

} //GenandroidPackage
