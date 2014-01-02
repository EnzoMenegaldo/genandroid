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
	 * The meta object id for the '{@link genandroid.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.NamedElementImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__DATA_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__PACKAGE_PREFIX = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__FILE_HEADER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT__PRESENTATION_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Android Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Data Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_CLASSES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_ASSOCIATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ACTIVITY__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ACTIVITY__ACCESSIBLE_VIEWS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genandroid.impl.ElementViewActivityImpl <em>Element View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.ElementViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getElementViewActivity()
	 * @generated
	 */
	int ELEMENT_VIEW_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VIEW_ACTIVITY__NAME = VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VIEW_ACTIVITY__DOCUMENTATION = VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VIEW_ACTIVITY__ELEMENT = VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VIEW_ACTIVITY_FEATURE_COUNT = VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genandroid.impl.EditableElementViewActivityImpl <em>Editable Element View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.EditableElementViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getEditableElementViewActivity()
	 * @generated
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY__NAME = ELEMENT_VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY__DOCUMENTATION = ELEMENT_VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = ELEMENT_VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = ELEMENT_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY__ELEMENT = ELEMENT_VIEW_ACTIVITY__ELEMENT;

	/**
	 * The number of structural features of the '<em>Editable Element View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLE_ELEMENT_VIEW_ACTIVITY_FEATURE_COUNT = ELEMENT_VIEW_ACTIVITY_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__NAME = VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__DOCUMENTATION = VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__IS_FILTERABLE = VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Large List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__IS_LARGE_LIST = VIEW_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Index Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH = VIEW_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_ACTIVITY_FEATURE_COUNT = VIEW_ACTIVITY_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__NAME = LIST_VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__DOCUMENTATION = LIST_VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION;

	/**
	 * The feature id for the '<em><b>Is Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__IS_FILTERABLE = LIST_VIEW_ACTIVITY__IS_FILTERABLE;

	/**
	 * The feature id for the '<em><b>Is Large List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__IS_LARGE_LIST = LIST_VIEW_ACTIVITY__IS_LARGE_LIST;

	/**
	 * The feature id for the '<em><b>Use Index Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH = LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH;

	/**
	 * The feature id for the '<em><b>Listed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presented Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__PRESENTED_DETAIL = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Custom Row Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY__USE_CUSTOM_ROW_PRESENTATION = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class List View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LIST_VIEW_ACTIVITY_FEATURE_COUNT = LIST_VIEW_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link genandroid.impl.DataClassifierImpl <em>Data Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.DataClassifierImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getDataClassifier()
	 * @generated
	 */
	int DATA_CLASSIFIER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFIER__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Data Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__NAME = DATA_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DOCUMENTATION = DATA_CLASSIFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__STORAGE = DATA_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DATA_REFERENCES = DATA_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DATA_ATTRIBUTES = DATA_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_FEATURE_COUNT = DATA_CLASSIFIER_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__NAME = CLASS_LIST_VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__DOCUMENTATION = CLASS_LIST_VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = CLASS_LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = CLASS_LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = CLASS_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION;

	/**
	 * The feature id for the '<em><b>Is Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__IS_FILTERABLE = CLASS_LIST_VIEW_ACTIVITY__IS_FILTERABLE;

	/**
	 * The feature id for the '<em><b>Is Large List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__IS_LARGE_LIST = CLASS_LIST_VIEW_ACTIVITY__IS_LARGE_LIST;

	/**
	 * The feature id for the '<em><b>Use Index Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH = CLASS_LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH;

	/**
	 * The feature id for the '<em><b>Listed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__LISTED_ELEMENT = CLASS_LIST_VIEW_ACTIVITY__LISTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Presented Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__PRESENTED_DETAIL = CLASS_LIST_VIEW_ACTIVITY__PRESENTED_DETAIL;

	/**
	 * The feature id for the '<em><b>Use Custom Row Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_VIEW_ACTIVITY__USE_CUSTOM_ROW_PRESENTATION = CLASS_LIST_VIEW_ACTIVITY__USE_CUSTOM_ROW_PRESENTATION;

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
	 * The feature id for the '<em><b>Main Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DETAIL__MAIN_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DETAIL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Secondary Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DETAIL__SECONDARY_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Class Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DETAIL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link genandroid.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.StructuralFeatureImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__DERIVED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWERBOUND = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__DOCUMENTATION = STRUCTURAL_FEATURE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__DERIVED = STRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__LOWERBOUND = STRUCTURAL_FEATURE__LOWERBOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__UPPER_BOUND = STRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__STORAGE = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Xml Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__SIMPLE_XML_TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DOCUMENTATION = STRUCTURAL_FEATURE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__DERIVED = STRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__LOWERBOUND = STRUCTURAL_FEATURE__LOWERBOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__UPPER_BOUND = STRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__STORAGE = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__CONTAINMENT = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__OPPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE__TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REFERENCE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__NAME = LIST_VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__DOCUMENTATION = LIST_VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = LIST_VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = LIST_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Select Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION = LIST_VIEW_ACTIVITY__SELECT_ITEM_ACTION;

	/**
	 * The feature id for the '<em><b>Is Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__IS_FILTERABLE = LIST_VIEW_ACTIVITY__IS_FILTERABLE;

	/**
	 * The feature id for the '<em><b>Is Large List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__IS_LARGE_LIST = LIST_VIEW_ACTIVITY__IS_LARGE_LIST;

	/**
	 * The feature id for the '<em><b>Use Index Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH = LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH;

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
	 * The meta object id for the '{@link genandroid.impl.PreferenceViewActivityImpl <em>Preference View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.PreferenceViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getPreferenceViewActivity()
	 * @generated
	 */
	int PREFERENCE_VIEW_ACTIVITY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_VIEW_ACTIVITY__NAME = VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_VIEW_ACTIVITY__DOCUMENTATION = VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Preference View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_VIEW_ACTIVITY_FEATURE_COUNT = VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genandroid.impl.CustomViewActivityImpl <em>Custom View Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.CustomViewActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getCustomViewActivity()
	 * @generated
	 */
	int CUSTOM_VIEW_ACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_ACTIVITY__NAME = VIEW_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_ACTIVITY__DOCUMENTATION = VIEW_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Accessible Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_ACTIVITY__ACCESSIBLE_VIEWS = VIEW_ACTIVITY__ACCESSIBLE_VIEWS;

	/**
	 * The feature id for the '<em><b>Triggerable Background Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Is Orm Lite Base Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY = VIEW_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom View Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_ACTIVITY_FEATURE_COUNT = VIEW_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genandroid.impl.NativeDataClassImpl <em>Native Data Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.NativeDataClassImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getNativeDataClass()
	 * @generated
	 */
	int NATIVE_DATA_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_CLASS__NAME = DATA_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_CLASS__DOCUMENTATION = DATA_CLASSIFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_CLASS__INSTANCE_CLASS_NAME = DATA_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_CLASS__DATABASE_TYPE = DATA_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Native Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_CLASS_FEATURE_COUNT = DATA_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genandroid.impl.DataAssociationImpl <em>Data Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.DataAssociationImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getDataAssociation()
	 * @generated
	 */
	int DATA_ASSOCIATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genandroid.impl.BackgroundActivityImpl <em>Background Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.BackgroundActivityImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getBackgroundActivity()
	 * @generated
	 */
	int BACKGROUND_ACTIVITY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_ACTIVITY__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Background Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genandroid.impl.PresentationModelImpl <em>Presentation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.impl.PresentationModelImpl
	 * @see genandroid.impl.GenandroidPackageImpl#getPresentationModel()
	 * @generated
	 */
	int PRESENTATION_MODEL = 21;

	/**
	 * The feature id for the '<em><b>View Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__VIEW_ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Preference View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__PREFERENCE_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Class Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__CLASS_DETAILS = 2;

	/**
	 * The feature id for the '<em><b>Welcome View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__WELCOME_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Background Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__BACKGROUND_ACTIVITIES = 4;

	/**
	 * The number of structural features of the '<em>Presentation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link genandroid.storageKind <em>storage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genandroid.storageKind
	 * @see genandroid.impl.GenandroidPackageImpl#getstorageKind()
	 * @generated
	 */
	int STORAGE_KIND = 22;


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
	 * Returns the meta object for the attribute '{@link genandroid.AndroidProject#getFileHeader <em>File Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Header</em>'.
	 * @see genandroid.AndroidProject#getFileHeader()
	 * @see #getAndroidProject()
	 * @generated
	 */
	EAttribute getAndroidProject_FileHeader();

	/**
	 * Returns the meta object for the containment reference '{@link genandroid.AndroidProject#getPresentationModel <em>Presentation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Model</em>'.
	 * @see genandroid.AndroidProject#getPresentationModel()
	 * @see #getAndroidProject()
	 * @generated
	 */
	EReference getAndroidProject_PresentationModel();

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
	 * Returns the meta object for the containment reference list '{@link genandroid.DataModel#getDataAssociations <em>Data Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Associations</em>'.
	 * @see genandroid.DataModel#getDataAssociations()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_DataAssociations();

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
	 * Returns the meta object for the reference list '{@link genandroid.ViewActivity#getAccessibleViews <em>Accessible Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Views</em>'.
	 * @see genandroid.ViewActivity#getAccessibleViews()
	 * @see #getViewActivity()
	 * @generated
	 */
	EReference getViewActivity_AccessibleViews();

	/**
	 * Returns the meta object for the reference list '{@link genandroid.ViewActivity#getTriggerableBackgroundActivities <em>Triggerable Background Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggerable Background Activities</em>'.
	 * @see genandroid.ViewActivity#getTriggerableBackgroundActivities()
	 * @see #getViewActivity()
	 * @generated
	 */
	EReference getViewActivity_TriggerableBackgroundActivities();

	/**
	 * Returns the meta object for class '{@link genandroid.EditableElementViewActivity <em>Editable Element View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editable Element View Activity</em>'.
	 * @see genandroid.EditableElementViewActivity
	 * @generated
	 */
	EClass getEditableElementViewActivity();

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
	 * Returns the meta object for the reference '{@link genandroid.ClassListViewActivity#getPresentedDetail <em>Presented Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presented Detail</em>'.
	 * @see genandroid.ClassListViewActivity#getPresentedDetail()
	 * @see #getClassListViewActivity()
	 * @generated
	 */
	EReference getClassListViewActivity_PresentedDetail();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.ClassListViewActivity#isUseCustomRowPresentation <em>Use Custom Row Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Custom Row Presentation</em>'.
	 * @see genandroid.ClassListViewActivity#isUseCustomRowPresentation()
	 * @see #getClassListViewActivity()
	 * @generated
	 */
	EAttribute getClassListViewActivity_UseCustomRowPresentation();

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
	 * Returns the meta object for the containment reference list '{@link genandroid.DataClass#getDataReferences <em>Data References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data References</em>'.
	 * @see genandroid.DataClass#getDataReferences()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_DataReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.DataClass#getDataAttributes <em>Data Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Attributes</em>'.
	 * @see genandroid.DataClass#getDataAttributes()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_DataAttributes();

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
	 * Returns the meta object for the reference list '{@link genandroid.ClassDetail#getMainAttributes <em>Main Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Attributes</em>'.
	 * @see genandroid.ClassDetail#getMainAttributes()
	 * @see #getClassDetail()
	 * @generated
	 */
	EReference getClassDetail_MainAttributes();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.ClassDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genandroid.ClassDetail#getName()
	 * @see #getClassDetail()
	 * @generated
	 */
	EAttribute getClassDetail_Name();

	/**
	 * Returns the meta object for the reference list '{@link genandroid.ClassDetail#getSecondaryAttributes <em>Secondary Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secondary Attributes</em>'.
	 * @see genandroid.ClassDetail#getSecondaryAttributes()
	 * @see #getClassDetail()
	 * @generated
	 */
	EReference getClassDetail_SecondaryAttributes();

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
	 * Returns the meta object for the reference '{@link genandroid.DataAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genandroid.DataAttribute#getType()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EReference getDataAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.DataAttribute#isSimpleXmlType <em>Simple Xml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Xml Type</em>'.
	 * @see genandroid.DataAttribute#isSimpleXmlType()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EAttribute getDataAttribute_SimpleXmlType();

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
	 * Returns the meta object for the attribute '{@link genandroid.DataReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see genandroid.DataReference#isContainment()
	 * @see #getDataReference()
	 * @generated
	 */
	EAttribute getDataReference_Containment();

	/**
	 * Returns the meta object for the reference '{@link genandroid.DataReference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see genandroid.DataReference#getOpposite()
	 * @see #getDataReference()
	 * @generated
	 */
	EReference getDataReference_Opposite();

	/**
	 * Returns the meta object for the reference '{@link genandroid.DataReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genandroid.DataReference#getType()
	 * @see #getDataReference()
	 * @generated
	 */
	EReference getDataReference_Type();

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
	 * Returns the meta object for the attribute '{@link genandroid.ListViewActivity#isIsFilterable <em>Is Filterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Filterable</em>'.
	 * @see genandroid.ListViewActivity#isIsFilterable()
	 * @see #getListViewActivity()
	 * @generated
	 */
	EAttribute getListViewActivity_IsFilterable();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.ListViewActivity#isIsLargeList <em>Is Large List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Large List</em>'.
	 * @see genandroid.ListViewActivity#isIsLargeList()
	 * @see #getListViewActivity()
	 * @generated
	 */
	EAttribute getListViewActivity_IsLargeList();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.ListViewActivity#isUseIndexSearch <em>Use Index Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Index Search</em>'.
	 * @see genandroid.ListViewActivity#isUseIndexSearch()
	 * @see #getListViewActivity()
	 * @generated
	 */
	EAttribute getListViewActivity_UseIndexSearch();

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
	 * Returns the meta object for class '{@link genandroid.ElementViewActivity <em>Element View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element View Activity</em>'.
	 * @see genandroid.ElementViewActivity
	 * @generated
	 */
	EClass getElementViewActivity();

	/**
	 * Returns the meta object for the reference '{@link genandroid.ElementViewActivity#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see genandroid.ElementViewActivity#getElement()
	 * @see #getElementViewActivity()
	 * @generated
	 */
	EReference getElementViewActivity_Element();

	/**
	 * Returns the meta object for class '{@link genandroid.PreferenceViewActivity <em>Preference View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference View Activity</em>'.
	 * @see genandroid.PreferenceViewActivity
	 * @generated
	 */
	EClass getPreferenceViewActivity();

	/**
	 * Returns the meta object for class '{@link genandroid.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see genandroid.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genandroid.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.NamedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see genandroid.NamedElement#getDocumentation()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Documentation();

	/**
	 * Returns the meta object for class '{@link genandroid.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see genandroid.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.StructuralFeature#getLowerbound <em>Lowerbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowerbound</em>'.
	 * @see genandroid.StructuralFeature#getLowerbound()
	 * @see #getStructuralFeature()
	 * @generated
	 */
	EAttribute getStructuralFeature_Lowerbound();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.StructuralFeature#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see genandroid.StructuralFeature#getUpperBound()
	 * @see #getStructuralFeature()
	 * @generated
	 */
	EAttribute getStructuralFeature_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.StructuralFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see genandroid.StructuralFeature#isDerived()
	 * @see #getStructuralFeature()
	 * @generated
	 */
	EAttribute getStructuralFeature_Derived();

	/**
	 * Returns the meta object for class '{@link genandroid.CustomViewActivity <em>Custom View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom View Activity</em>'.
	 * @see genandroid.CustomViewActivity
	 * @generated
	 */
	EClass getCustomViewActivity();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.CustomViewActivity#isIsOrmLiteBaseActivity <em>Is Orm Lite Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Orm Lite Base Activity</em>'.
	 * @see genandroid.CustomViewActivity#isIsOrmLiteBaseActivity()
	 * @see #getCustomViewActivity()
	 * @generated
	 */
	EAttribute getCustomViewActivity_IsOrmLiteBaseActivity();

	/**
	 * Returns the meta object for class '{@link genandroid.DataClassifier <em>Data Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Classifier</em>'.
	 * @see genandroid.DataClassifier
	 * @generated
	 */
	EClass getDataClassifier();

	/**
	 * Returns the meta object for class '{@link genandroid.NativeDataClass <em>Native Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Data Class</em>'.
	 * @see genandroid.NativeDataClass
	 * @generated
	 */
	EClass getNativeDataClass();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.NativeDataClass#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see genandroid.NativeDataClass#getInstanceClassName()
	 * @see #getNativeDataClass()
	 * @generated
	 */
	EAttribute getNativeDataClass_InstanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link genandroid.NativeDataClass#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see genandroid.NativeDataClass#getDatabaseType()
	 * @see #getNativeDataClass()
	 * @generated
	 */
	EAttribute getNativeDataClass_DatabaseType();

	/**
	 * Returns the meta object for class '{@link genandroid.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Association</em>'.
	 * @see genandroid.DataAssociation
	 * @generated
	 */
	EClass getDataAssociation();

	/**
	 * Returns the meta object for the reference list '{@link genandroid.DataAssociation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see genandroid.DataAssociation#getReferences()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_References();

	/**
	 * Returns the meta object for class '{@link genandroid.BackgroundActivity <em>Background Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Activity</em>'.
	 * @see genandroid.BackgroundActivity
	 * @generated
	 */
	EClass getBackgroundActivity();

	/**
	 * Returns the meta object for class '{@link genandroid.PresentationModel <em>Presentation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Model</em>'.
	 * @see genandroid.PresentationModel
	 * @generated
	 */
	EClass getPresentationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.PresentationModel#getViewActivities <em>View Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Activities</em>'.
	 * @see genandroid.PresentationModel#getViewActivities()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_ViewActivities();

	/**
	 * Returns the meta object for the reference '{@link genandroid.PresentationModel#getPreferenceView <em>Preference View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preference View</em>'.
	 * @see genandroid.PresentationModel#getPreferenceView()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_PreferenceView();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.PresentationModel#getClassDetails <em>Class Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Details</em>'.
	 * @see genandroid.PresentationModel#getClassDetails()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_ClassDetails();

	/**
	 * Returns the meta object for the reference '{@link genandroid.PresentationModel#getWelcomeView <em>Welcome View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Welcome View</em>'.
	 * @see genandroid.PresentationModel#getWelcomeView()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_WelcomeView();

	/**
	 * Returns the meta object for the containment reference list '{@link genandroid.PresentationModel#getBackgroundActivities <em>Background Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Background Activities</em>'.
	 * @see genandroid.PresentationModel#getBackgroundActivities()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_BackgroundActivities();

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
		 * The meta object literal for the '<em><b>Data Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDROID_PROJECT__DATA_MODEL = eINSTANCE.getAndroidProject_DataModel();

		/**
		 * The meta object literal for the '<em><b>Package Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_PROJECT__PACKAGE_PREFIX = eINSTANCE.getAndroidProject_PackagePrefix();

		/**
		 * The meta object literal for the '<em><b>File Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_PROJECT__FILE_HEADER = eINSTANCE.getAndroidProject_FileHeader();

		/**
		 * The meta object literal for the '<em><b>Presentation Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDROID_PROJECT__PRESENTATION_MODEL = eINSTANCE.getAndroidProject_PresentationModel();

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
		 * The meta object literal for the '<em><b>Data Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_CLASSES = eINSTANCE.getDataModel_DataClasses();

		/**
		 * The meta object literal for the '<em><b>Data Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA_ASSOCIATIONS = eINSTANCE.getDataModel_DataAssociations();

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
		 * The meta object literal for the '<em><b>Accessible Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ACTIVITY__ACCESSIBLE_VIEWS = eINSTANCE.getViewActivity_AccessibleViews();

		/**
		 * The meta object literal for the '<em><b>Triggerable Background Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ACTIVITY__TRIGGERABLE_BACKGROUND_ACTIVITIES = eINSTANCE.getViewActivity_TriggerableBackgroundActivities();

		/**
		 * The meta object literal for the '{@link genandroid.impl.EditableElementViewActivityImpl <em>Editable Element View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.EditableElementViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getEditableElementViewActivity()
		 * @generated
		 */
		EClass EDITABLE_ELEMENT_VIEW_ACTIVITY = eINSTANCE.getEditableElementViewActivity();

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
		 * The meta object literal for the '<em><b>Presented Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LIST_VIEW_ACTIVITY__PRESENTED_DETAIL = eINSTANCE.getClassListViewActivity_PresentedDetail();

		/**
		 * The meta object literal for the '<em><b>Use Custom Row Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LIST_VIEW_ACTIVITY__USE_CUSTOM_ROW_PRESENTATION = eINSTANCE.getClassListViewActivity_UseCustomRowPresentation();

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
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CLASS__STORAGE = eINSTANCE.getDataClass_Storage();

		/**
		 * The meta object literal for the '<em><b>Data References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__DATA_REFERENCES = eINSTANCE.getDataClass_DataReferences();

		/**
		 * The meta object literal for the '<em><b>Data Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__DATA_ATTRIBUTES = eINSTANCE.getDataClass_DataAttributes();

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
		 * The meta object literal for the '<em><b>Main Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DETAIL__MAIN_ATTRIBUTES = eINSTANCE.getClassDetail_MainAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DETAIL__NAME = eINSTANCE.getClassDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Secondary Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DETAIL__SECONDARY_ATTRIBUTES = eINSTANCE.getClassDetail_SecondaryAttributes();

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
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ATTRIBUTE__STORAGE = eINSTANCE.getDataAttribute_Storage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ATTRIBUTE__TYPE = eINSTANCE.getDataAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Simple Xml Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ATTRIBUTE__SIMPLE_XML_TYPE = eINSTANCE.getDataAttribute_SimpleXmlType();

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
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_REFERENCE__STORAGE = eINSTANCE.getDataReference_Storage();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_REFERENCE__CONTAINMENT = eINSTANCE.getDataReference_Containment();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REFERENCE__OPPOSITE = eINSTANCE.getDataReference_Opposite();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REFERENCE__TYPE = eINSTANCE.getDataReference_Type();

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
		 * The meta object literal for the '<em><b>Is Filterable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW_ACTIVITY__IS_FILTERABLE = eINSTANCE.getListViewActivity_IsFilterable();

		/**
		 * The meta object literal for the '<em><b>Is Large List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW_ACTIVITY__IS_LARGE_LIST = eINSTANCE.getListViewActivity_IsLargeList();

		/**
		 * The meta object literal for the '<em><b>Use Index Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW_ACTIVITY__USE_INDEX_SEARCH = eINSTANCE.getListViewActivity_UseIndexSearch();

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
		 * The meta object literal for the '{@link genandroid.impl.ElementViewActivityImpl <em>Element View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.ElementViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getElementViewActivity()
		 * @generated
		 */
		EClass ELEMENT_VIEW_ACTIVITY = eINSTANCE.getElementViewActivity();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_VIEW_ACTIVITY__ELEMENT = eINSTANCE.getElementViewActivity_Element();

		/**
		 * The meta object literal for the '{@link genandroid.impl.PreferenceViewActivityImpl <em>Preference View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.PreferenceViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getPreferenceViewActivity()
		 * @generated
		 */
		EClass PREFERENCE_VIEW_ACTIVITY = eINSTANCE.getPreferenceViewActivity();

		/**
		 * The meta object literal for the '{@link genandroid.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.NamedElementImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DOCUMENTATION = eINSTANCE.getNamedElement_Documentation();

		/**
		 * The meta object literal for the '{@link genandroid.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.StructuralFeatureImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Lowerbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE__LOWERBOUND = eINSTANCE.getStructuralFeature_Lowerbound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE__UPPER_BOUND = eINSTANCE.getStructuralFeature_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE__DERIVED = eINSTANCE.getStructuralFeature_Derived();

		/**
		 * The meta object literal for the '{@link genandroid.impl.CustomViewActivityImpl <em>Custom View Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.CustomViewActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getCustomViewActivity()
		 * @generated
		 */
		EClass CUSTOM_VIEW_ACTIVITY = eINSTANCE.getCustomViewActivity();

		/**
		 * The meta object literal for the '<em><b>Is Orm Lite Base Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_VIEW_ACTIVITY__IS_ORM_LITE_BASE_ACTIVITY = eINSTANCE.getCustomViewActivity_IsOrmLiteBaseActivity();

		/**
		 * The meta object literal for the '{@link genandroid.impl.DataClassifierImpl <em>Data Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.DataClassifierImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getDataClassifier()
		 * @generated
		 */
		EClass DATA_CLASSIFIER = eINSTANCE.getDataClassifier();

		/**
		 * The meta object literal for the '{@link genandroid.impl.NativeDataClassImpl <em>Native Data Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.NativeDataClassImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getNativeDataClass()
		 * @generated
		 */
		EClass NATIVE_DATA_CLASS = eINSTANCE.getNativeDataClass();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_DATA_CLASS__INSTANCE_CLASS_NAME = eINSTANCE.getNativeDataClass_InstanceClassName();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_DATA_CLASS__DATABASE_TYPE = eINSTANCE.getNativeDataClass_DatabaseType();

		/**
		 * The meta object literal for the '{@link genandroid.impl.DataAssociationImpl <em>Data Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.DataAssociationImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getDataAssociation()
		 * @generated
		 */
		EClass DATA_ASSOCIATION = eINSTANCE.getDataAssociation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__REFERENCES = eINSTANCE.getDataAssociation_References();

		/**
		 * The meta object literal for the '{@link genandroid.impl.BackgroundActivityImpl <em>Background Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.BackgroundActivityImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getBackgroundActivity()
		 * @generated
		 */
		EClass BACKGROUND_ACTIVITY = eINSTANCE.getBackgroundActivity();

		/**
		 * The meta object literal for the '{@link genandroid.impl.PresentationModelImpl <em>Presentation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genandroid.impl.PresentationModelImpl
		 * @see genandroid.impl.GenandroidPackageImpl#getPresentationModel()
		 * @generated
		 */
		EClass PRESENTATION_MODEL = eINSTANCE.getPresentationModel();

		/**
		 * The meta object literal for the '<em><b>View Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__VIEW_ACTIVITIES = eINSTANCE.getPresentationModel_ViewActivities();

		/**
		 * The meta object literal for the '<em><b>Preference View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__PREFERENCE_VIEW = eINSTANCE.getPresentationModel_PreferenceView();

		/**
		 * The meta object literal for the '<em><b>Class Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__CLASS_DETAILS = eINSTANCE.getPresentationModel_ClassDetails();

		/**
		 * The meta object literal for the '<em><b>Welcome View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__WELCOME_VIEW = eINSTANCE.getPresentationModel_WelcomeView();

		/**
		 * The meta object literal for the '<em><b>Background Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__BACKGROUND_ACTIVITIES = eINSTANCE.getPresentationModel_BackgroundActivities();

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
