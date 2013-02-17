/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.util;

import genandroid.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see genandroid.GenandroidPackage
 * @generated
 */
public class GenandroidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenandroidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenandroidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenandroidPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenandroidSwitch<Adapter> modelSwitch =
		new GenandroidSwitch<Adapter>() {
			@Override
			public Adapter caseAndroidProject(AndroidProject object) {
				return createAndroidProjectAdapter();
			}
			@Override
			public Adapter caseDataModel(DataModel object) {
				return createDataModelAdapter();
			}
			@Override
			public Adapter caseViewActivity(ViewActivity object) {
				return createViewActivityAdapter();
			}
			@Override
			public Adapter caseEditableElementViewActivity(EditableElementViewActivity object) {
				return createEditableElementViewActivityAdapter();
			}
			@Override
			public Adapter caseClassListViewActivity(ClassListViewActivity object) {
				return createClassListViewActivityAdapter();
			}
			@Override
			public Adapter caseDataClass(DataClass object) {
				return createDataClassAdapter();
			}
			@Override
			public Adapter caseReferenceListViewActivity(ReferenceListViewActivity object) {
				return createReferenceListViewActivityAdapter();
			}
			@Override
			public Adapter caseClassDetail(ClassDetail object) {
				return createClassDetailAdapter();
			}
			@Override
			public Adapter caseDataAttribute(DataAttribute object) {
				return createDataAttributeAdapter();
			}
			@Override
			public Adapter caseDataReference(DataReference object) {
				return createDataReferenceAdapter();
			}
			@Override
			public Adapter caseListViewActivity(ListViewActivity object) {
				return createListViewActivityAdapter();
			}
			@Override
			public Adapter caseAttributeListViewActivity(AttributeListViewActivity object) {
				return createAttributeListViewActivityAdapter();
			}
			@Override
			public Adapter caseElementViewActivity(ElementViewActivity object) {
				return createElementViewActivityAdapter();
			}
			@Override
			public Adapter casePreferenceViewActivity(PreferenceViewActivity object) {
				return createPreferenceViewActivityAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseCustomViewActivity(CustomViewActivity object) {
				return createCustomViewActivityAdapter();
			}
			@Override
			public Adapter caseDataClassifier(DataClassifier object) {
				return createDataClassifierAdapter();
			}
			@Override
			public Adapter caseNativeDataClass(NativeDataClass object) {
				return createNativeDataClassAdapter();
			}
			@Override
			public Adapter caseDataAssociation(DataAssociation object) {
				return createDataAssociationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link genandroid.AndroidProject <em>Android Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.AndroidProject
	 * @generated
	 */
	public Adapter createAndroidProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.DataModel
	 * @generated
	 */
	public Adapter createDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.ViewActivity <em>View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.ViewActivity
	 * @generated
	 */
	public Adapter createViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.EditableElementViewActivity <em>Editable Element View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.EditableElementViewActivity
	 * @generated
	 */
	public Adapter createEditableElementViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.ClassListViewActivity <em>Class List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.ClassListViewActivity
	 * @generated
	 */
	public Adapter createClassListViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.DataClass <em>Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.DataClass
	 * @generated
	 */
	public Adapter createDataClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.ReferenceListViewActivity <em>Reference List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.ReferenceListViewActivity
	 * @generated
	 */
	public Adapter createReferenceListViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.ClassDetail <em>Class Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.ClassDetail
	 * @generated
	 */
	public Adapter createClassDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.DataAttribute <em>Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.DataAttribute
	 * @generated
	 */
	public Adapter createDataAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.DataReference <em>Data Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.DataReference
	 * @generated
	 */
	public Adapter createDataReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.ListViewActivity <em>List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.ListViewActivity
	 * @generated
	 */
	public Adapter createListViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.AttributeListViewActivity <em>Attribute List View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.AttributeListViewActivity
	 * @generated
	 */
	public Adapter createAttributeListViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.ElementViewActivity <em>Element View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.ElementViewActivity
	 * @generated
	 */
	public Adapter createElementViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.PreferenceViewActivity <em>Preference View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.PreferenceViewActivity
	 * @generated
	 */
	public Adapter createPreferenceViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.CustomViewActivity <em>Custom View Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.CustomViewActivity
	 * @generated
	 */
	public Adapter createCustomViewActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.DataClassifier <em>Data Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.DataClassifier
	 * @generated
	 */
	public Adapter createDataClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.NativeDataClass <em>Native Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.NativeDataClass
	 * @generated
	 */
	public Adapter createNativeDataClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genandroid.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genandroid.DataAssociation
	 * @generated
	 */
	public Adapter createDataAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenandroidAdapterFactory
