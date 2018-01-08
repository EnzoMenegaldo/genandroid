/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.BackgroundActivity;
import genandroid.ClassDetail;
import genandroid.GenandroidPackage;
import genandroid.PreferenceViewActivity;
import genandroid.PresentationModel;
import genandroid.ViewActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.PresentationModelImpl#getViewActivities <em>View Activities</em>}</li>
 *   <li>{@link genandroid.impl.PresentationModelImpl#getPreferenceView <em>Preference View</em>}</li>
 *   <li>{@link genandroid.impl.PresentationModelImpl#getClassDetails <em>Class Details</em>}</li>
 *   <li>{@link genandroid.impl.PresentationModelImpl#getWelcomeView <em>Welcome View</em>}</li>
 *   <li>{@link genandroid.impl.PresentationModelImpl#getBackgroundActivities <em>Background Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationModelImpl extends EObjectImpl implements PresentationModel {
	/**
	 * The cached value of the '{@link #getViewActivities() <em>View Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewActivity> viewActivities;

	/**
	 * The cached value of the '{@link #getPreferenceView() <em>Preference View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferenceView()
	 * @generated
	 * @ordered
	 */
	protected PreferenceViewActivity preferenceView;

	/**
	 * The cached value of the '{@link #getClassDetails() <em>Class Details</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDetail> classDetails;

	/**
	 * The cached value of the '{@link #getWelcomeView() <em>Welcome View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeView()
	 * @generated
	 * @ordered
	 */
	protected ViewActivity welcomeView;

	/**
	 * The cached value of the '{@link #getBackgroundActivities() <em>Background Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<BackgroundActivity> backgroundActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.PRESENTATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewActivity> getViewActivities() {
		if (viewActivities == null) {
			viewActivities = new EObjectContainmentEList<ViewActivity>(ViewActivity.class, this, GenandroidPackage.PRESENTATION_MODEL__VIEW_ACTIVITIES);
		}
		return viewActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferenceViewActivity getPreferenceView() {
		if (preferenceView != null && preferenceView.eIsProxy()) {
			InternalEObject oldPreferenceView = (InternalEObject)preferenceView;
			preferenceView = (PreferenceViewActivity)eResolveProxy(oldPreferenceView);
			if (preferenceView != oldPreferenceView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.PRESENTATION_MODEL__PREFERENCE_VIEW, oldPreferenceView, preferenceView));
			}
		}
		return preferenceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferenceViewActivity basicGetPreferenceView() {
		return preferenceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferenceView(PreferenceViewActivity newPreferenceView) {
		PreferenceViewActivity oldPreferenceView = preferenceView;
		preferenceView = newPreferenceView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.PRESENTATION_MODEL__PREFERENCE_VIEW, oldPreferenceView, preferenceView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDetail> getClassDetails() {
		if (classDetails == null) {
			classDetails = new EObjectContainmentEList<ClassDetail>(ClassDetail.class, this, GenandroidPackage.PRESENTATION_MODEL__CLASS_DETAILS);
		}
		return classDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity getWelcomeView() {
		if (welcomeView != null && welcomeView.eIsProxy()) {
			InternalEObject oldWelcomeView = (InternalEObject)welcomeView;
			welcomeView = (ViewActivity)eResolveProxy(oldWelcomeView);
			if (welcomeView != oldWelcomeView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.PRESENTATION_MODEL__WELCOME_VIEW, oldWelcomeView, welcomeView));
			}
		}
		return welcomeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewActivity basicGetWelcomeView() {
		return welcomeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeView(ViewActivity newWelcomeView) {
		ViewActivity oldWelcomeView = welcomeView;
		welcomeView = newWelcomeView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.PRESENTATION_MODEL__WELCOME_VIEW, oldWelcomeView, welcomeView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackgroundActivity> getBackgroundActivities() {
		if (backgroundActivities == null) {
			backgroundActivities = new EObjectContainmentEList<BackgroundActivity>(BackgroundActivity.class, this, GenandroidPackage.PRESENTATION_MODEL__BACKGROUND_ACTIVITIES);
		}
		return backgroundActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenandroidPackage.PRESENTATION_MODEL__VIEW_ACTIVITIES:
				return ((InternalEList<?>)getViewActivities()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.PRESENTATION_MODEL__CLASS_DETAILS:
				return ((InternalEList<?>)getClassDetails()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.PRESENTATION_MODEL__BACKGROUND_ACTIVITIES:
				return ((InternalEList<?>)getBackgroundActivities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.PRESENTATION_MODEL__VIEW_ACTIVITIES:
				return getViewActivities();
			case GenandroidPackage.PRESENTATION_MODEL__PREFERENCE_VIEW:
				if (resolve) return getPreferenceView();
				return basicGetPreferenceView();
			case GenandroidPackage.PRESENTATION_MODEL__CLASS_DETAILS:
				return getClassDetails();
			case GenandroidPackage.PRESENTATION_MODEL__WELCOME_VIEW:
				if (resolve) return getWelcomeView();
				return basicGetWelcomeView();
			case GenandroidPackage.PRESENTATION_MODEL__BACKGROUND_ACTIVITIES:
				return getBackgroundActivities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenandroidPackage.PRESENTATION_MODEL__VIEW_ACTIVITIES:
				getViewActivities().clear();
				getViewActivities().addAll((Collection<? extends ViewActivity>)newValue);
				return;
			case GenandroidPackage.PRESENTATION_MODEL__PREFERENCE_VIEW:
				setPreferenceView((PreferenceViewActivity)newValue);
				return;
			case GenandroidPackage.PRESENTATION_MODEL__CLASS_DETAILS:
				getClassDetails().clear();
				getClassDetails().addAll((Collection<? extends ClassDetail>)newValue);
				return;
			case GenandroidPackage.PRESENTATION_MODEL__WELCOME_VIEW:
				setWelcomeView((ViewActivity)newValue);
				return;
			case GenandroidPackage.PRESENTATION_MODEL__BACKGROUND_ACTIVITIES:
				getBackgroundActivities().clear();
				getBackgroundActivities().addAll((Collection<? extends BackgroundActivity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenandroidPackage.PRESENTATION_MODEL__VIEW_ACTIVITIES:
				getViewActivities().clear();
				return;
			case GenandroidPackage.PRESENTATION_MODEL__PREFERENCE_VIEW:
				setPreferenceView((PreferenceViewActivity)null);
				return;
			case GenandroidPackage.PRESENTATION_MODEL__CLASS_DETAILS:
				getClassDetails().clear();
				return;
			case GenandroidPackage.PRESENTATION_MODEL__WELCOME_VIEW:
				setWelcomeView((ViewActivity)null);
				return;
			case GenandroidPackage.PRESENTATION_MODEL__BACKGROUND_ACTIVITIES:
				getBackgroundActivities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenandroidPackage.PRESENTATION_MODEL__VIEW_ACTIVITIES:
				return viewActivities != null && !viewActivities.isEmpty();
			case GenandroidPackage.PRESENTATION_MODEL__PREFERENCE_VIEW:
				return preferenceView != null;
			case GenandroidPackage.PRESENTATION_MODEL__CLASS_DETAILS:
				return classDetails != null && !classDetails.isEmpty();
			case GenandroidPackage.PRESENTATION_MODEL__WELCOME_VIEW:
				return welcomeView != null;
			case GenandroidPackage.PRESENTATION_MODEL__BACKGROUND_ACTIVITIES:
				return backgroundActivities != null && !backgroundActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresentationModelImpl
