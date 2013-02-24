/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.AndroidProject;
import genandroid.BackgroundActivity;
import genandroid.ClassDetail;
import genandroid.DataModel;
import genandroid.GenandroidPackage;
import genandroid.PreferenceViewActivity;
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
 * An implementation of the model object '<em><b>Android Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getViewActivities <em>View Activities</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getClassDetails <em>Class Details</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getPreferenceView <em>Preference View</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getBackgroundActivities <em>Background Activities</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getWelcomeView <em>Welcome View</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getFileHeader <em>File Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroidProjectImpl extends EObjectImpl implements AndroidProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataModel() <em>Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModel()
	 * @generated
	 * @ordered
	 */
	protected DataModel dataModel;

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
	 * The default value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected String packagePrefix = PACKAGE_PREFIX_EDEFAULT;

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
	 * The cached value of the '{@link #getPreferenceView() <em>Preference View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferenceView()
	 * @generated
	 * @ordered
	 */
	protected PreferenceViewActivity preferenceView;

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
	 * The cached value of the '{@link #getWelcomeView() <em>Welcome View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeView()
	 * @generated
	 * @ordered
	 */
	protected ViewActivity welcomeView;

	/**
	 * The default value of the '{@link #getFileHeader() <em>File Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileHeader() <em>File Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHeader()
	 * @generated
	 * @ordered
	 */
	protected String fileHeader = FILE_HEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndroidProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.ANDROID_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getDataModel() {
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataModel(DataModel newDataModel, NotificationChain msgs) {
		DataModel oldDataModel = dataModel;
		dataModel = newDataModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, oldDataModel, newDataModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataModel(DataModel newDataModel) {
		if (newDataModel != dataModel) {
			NotificationChain msgs = null;
			if (dataModel != null)
				msgs = ((InternalEObject)dataModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, null, msgs);
			if (newDataModel != null)
				msgs = ((InternalEObject)newDataModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, null, msgs);
			msgs = basicSetDataModel(newDataModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, newDataModel, newDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewActivity> getViewActivities() {
		if (viewActivities == null) {
			viewActivities = new EObjectContainmentEList<ViewActivity>(ViewActivity.class, this, GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES);
		}
		return viewActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagePrefix() {
		return packagePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePrefix(String newPackagePrefix) {
		String oldPackagePrefix = packagePrefix;
		packagePrefix = newPackagePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX, oldPackagePrefix, packagePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDetail> getClassDetails() {
		if (classDetails == null) {
			classDetails = new EObjectContainmentEList<ClassDetail>(ClassDetail.class, this, GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS);
		}
		return classDetails;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW, oldPreferenceView, preferenceView));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW, oldPreferenceView, preferenceView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackgroundActivity> getBackgroundActivities() {
		if (backgroundActivities == null) {
			backgroundActivities = new EObjectContainmentEList<BackgroundActivity>(BackgroundActivity.class, this, GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES);
		}
		return backgroundActivities;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenandroidPackage.ANDROID_PROJECT__WELCOME_VIEW, oldWelcomeView, welcomeView));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__WELCOME_VIEW, oldWelcomeView, welcomeView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileHeader() {
		return fileHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileHeader(String newFileHeader) {
		String oldFileHeader = fileHeader;
		fileHeader = newFileHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__FILE_HEADER, oldFileHeader, fileHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				return basicSetDataModel(null, msgs);
			case GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES:
				return ((InternalEList<?>)getViewActivities()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS:
				return ((InternalEList<?>)getClassDetails()).basicRemove(otherEnd, msgs);
			case GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES:
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
			case GenandroidPackage.ANDROID_PROJECT__NAME:
				return getName();
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				return getDataModel();
			case GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES:
				return getViewActivities();
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				return getPackagePrefix();
			case GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS:
				return getClassDetails();
			case GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW:
				if (resolve) return getPreferenceView();
				return basicGetPreferenceView();
			case GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES:
				return getBackgroundActivities();
			case GenandroidPackage.ANDROID_PROJECT__WELCOME_VIEW:
				if (resolve) return getWelcomeView();
				return basicGetWelcomeView();
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				return getFileHeader();
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
			case GenandroidPackage.ANDROID_PROJECT__NAME:
				setName((String)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				setDataModel((DataModel)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES:
				getViewActivities().clear();
				getViewActivities().addAll((Collection<? extends ViewActivity>)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				setPackagePrefix((String)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS:
				getClassDetails().clear();
				getClassDetails().addAll((Collection<? extends ClassDetail>)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW:
				setPreferenceView((PreferenceViewActivity)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES:
				getBackgroundActivities().clear();
				getBackgroundActivities().addAll((Collection<? extends BackgroundActivity>)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__WELCOME_VIEW:
				setWelcomeView((ViewActivity)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				setFileHeader((String)newValue);
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
			case GenandroidPackage.ANDROID_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				setDataModel((DataModel)null);
				return;
			case GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES:
				getViewActivities().clear();
				return;
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				setPackagePrefix(PACKAGE_PREFIX_EDEFAULT);
				return;
			case GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS:
				getClassDetails().clear();
				return;
			case GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW:
				setPreferenceView((PreferenceViewActivity)null);
				return;
			case GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES:
				getBackgroundActivities().clear();
				return;
			case GenandroidPackage.ANDROID_PROJECT__WELCOME_VIEW:
				setWelcomeView((ViewActivity)null);
				return;
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				setFileHeader(FILE_HEADER_EDEFAULT);
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
			case GenandroidPackage.ANDROID_PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				return dataModel != null;
			case GenandroidPackage.ANDROID_PROJECT__VIEW_ACTIVITIES:
				return viewActivities != null && !viewActivities.isEmpty();
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				return PACKAGE_PREFIX_EDEFAULT == null ? packagePrefix != null : !PACKAGE_PREFIX_EDEFAULT.equals(packagePrefix);
			case GenandroidPackage.ANDROID_PROJECT__CLASS_DETAILS:
				return classDetails != null && !classDetails.isEmpty();
			case GenandroidPackage.ANDROID_PROJECT__PREFERENCE_VIEW:
				return preferenceView != null;
			case GenandroidPackage.ANDROID_PROJECT__BACKGROUND_ACTIVITIES:
				return backgroundActivities != null && !backgroundActivities.isEmpty();
			case GenandroidPackage.ANDROID_PROJECT__WELCOME_VIEW:
				return welcomeView != null;
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				return FILE_HEADER_EDEFAULT == null ? fileHeader != null : !FILE_HEADER_EDEFAULT.equals(fileHeader);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", packagePrefix: ");
		result.append(packagePrefix);
		result.append(", fileHeader: ");
		result.append(fileHeader);
		result.append(')');
		return result.toString();
	}

} //AndroidProjectImpl
