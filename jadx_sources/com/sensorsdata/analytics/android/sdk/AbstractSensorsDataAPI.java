package com.sensorsdata.analytics.android.sdk;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.OaidHelper;
import com.sensorsdata.analytics.android.sdk.aop.push.PushLifecycleCallbacks;
import com.sensorsdata.analytics.android.sdk.autotrack.ActivityLifecycleCallbacks;
import com.sensorsdata.analytics.android.sdk.autotrack.ActivityPageLeaveCallbacks;
import com.sensorsdata.analytics.android.sdk.autotrack.FragmentPageLeaveCallbacks;
import com.sensorsdata.analytics.android.sdk.autotrack.FragmentViewScreenCallbacks;
import com.sensorsdata.analytics.android.sdk.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentDistinctId;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstDay;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstStart;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstTrackInstallation;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstTrackInstallationWithCallback;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentSuperProperties;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.encrypt.SensorsDataEncrypt;
import com.sensorsdata.analytics.android.sdk.exceptions.InvalidDataException;
import com.sensorsdata.analytics.android.sdk.internal.api.FragmentAPI;
import com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI;
import com.sensorsdata.analytics.android.sdk.internal.rpc.SensorsDataContentObserver;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.listener.SAFunctionListener;
import com.sensorsdata.analytics.android.sdk.listener.SAJSListener;
import com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager;
import com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManager;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.sensorsdata.analytics.android.sdk.util.SAContextManager;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager;
import com.tencent.bugly.proguard.C33861pe;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractSensorsDataAPI implements ISensorsDataAPI {
    protected static final String TAG = "SA.SensorsDataAPI";
    static final String VERSION = "5.4.4";
    protected static SensorsDataGPSLocation mGPSLocation;
    protected static SAConfigOptions mSAConfigOptions;
    private boolean isTrackEventWithPluginVersion;
    protected boolean mAutoTrack;
    protected List<Integer> mAutoTrackIgnoredActivities;
    protected boolean mClearReferrerWhenAppEnd;
    protected final Context mContext;
    protected String mCookie;
    protected String mCurrentScreenTitle;
    protected SensorsDataAPI.DebugMode mDebugMode;
    protected SensorsDataDeepLinkCallback mDeepLinkCallback;
    protected boolean mDisableDefaultRemoteConfig;
    protected boolean mDisableTrackDeviceId;
    protected final PersistentDistinctId mDistinctId;
    protected SensorsDataDynamicSuperProperties mDynamicSuperPropertiesCallBack;
    boolean mEnableDeepLinkInstallSource;
    protected boolean mEnableNetworkRequest;
    protected List<SAEventListener> mEventListenerList;
    protected final PersistentFirstDay mFirstDay;
    protected final PersistentFirstStart mFirstStart;
    protected final PersistentFirstTrackInstallation mFirstTrackInstallation;
    protected final PersistentFirstTrackInstallationWithCallback mFirstTrackInstallationWithCallback;
    protected IFragmentAPI mFragmentAPI;
    protected List<SAFunctionListener> mFunctionListenerList;
    protected List<Integer> mHeatMapActivities;
    protected List<Class> mIgnoredViewTypeList;
    protected SimpleDateFormat mIsFirstDayDateFormat;
    protected JSONObject mLastScreenTrackProperties;
    protected String mLastScreenUrl;
    protected String mLoginId;
    protected final Object mLoginIdLock;
    protected AnalyticsMessages mMessages;
    protected SensorsDataScreenOrientationDetector mOrientationDetector;
    protected String mOriginServerUrl;
    protected String mReferrerScreenTitle;
    BaseSensorsDataSDKRemoteManager mRemoteManager;
    protected SAContextManager mSAContextManager;
    private CopyOnWriteArrayList<SAJSListener> mSAJSListeners;
    protected boolean mSDKConfigInit;
    SensorsDataEncrypt mSensorsDataEncrypt;
    protected String mServerUrl;
    protected int mSessionTime;
    protected final PersistentSuperProperties mSuperProperties;
    protected SensorsDataTrackEventCallBack mTrackEventCallBack;
    protected TrackTaskManager mTrackTaskManager;
    protected TrackTaskManagerThread mTrackTaskManagerThread;
    protected final Map<String, EventTimer> mTrackTimer;
    protected List<Integer> mVisualizedAutoTrackActivities;
    protected static final Map<Context, SensorsDataAPI> sInstanceMap = new HashMap();
    static boolean mIsMainProcess = false;
    static boolean SHOW_DEBUG_INFO_VIEW = true;
    protected static boolean isChangeEnableNetworkFlag = false;

    public AbstractSensorsDataAPI(Context context, SAConfigOptions sAConfigOptions, SensorsDataAPI.DebugMode debugMode) {
        this.mLoginIdLock = new Object();
        this.mIgnoredViewTypeList = new ArrayList();
        this.mLoginId = null;
        SensorsDataAPI.DebugMode debugMode2 = SensorsDataAPI.DebugMode.DEBUG_OFF;
        this.mDebugMode = debugMode2;
        this.mEnableNetworkRequest = true;
        this.mClearReferrerWhenAppEnd = false;
        this.mDisableDefaultRemoteConfig = false;
        this.mDisableTrackDeviceId = false;
        this.mSessionTime = 30000;
        this.mEnableDeepLinkInstallSource = false;
        this.isTrackEventWithPluginVersion = false;
        this.mContext = context;
        setDebugMode(debugMode);
        String packageName = context.getApplicationContext().getPackageName();
        this.mAutoTrackIgnoredActivities = new ArrayList();
        this.mHeatMapActivities = new ArrayList();
        this.mVisualizedAutoTrackActivities = new ArrayList();
        PersistentLoader.initLoader(context);
        this.mDistinctId = (PersistentDistinctId) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.DISTINCT_ID);
        this.mSuperProperties = (PersistentSuperProperties) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.SUPER_PROPERTIES);
        this.mFirstStart = (PersistentFirstStart) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.FIRST_START);
        this.mFirstTrackInstallation = (PersistentFirstTrackInstallation) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.FIRST_INSTALL);
        this.mFirstTrackInstallationWithCallback = (PersistentFirstTrackInstallationWithCallback) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.FIRST_INSTALL_CALLBACK);
        this.mFirstDay = (PersistentFirstDay) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.FIRST_DAY);
        this.mTrackTimer = new HashMap();
        this.mFragmentAPI = new FragmentAPI();
        try {
            mSAConfigOptions = sAConfigOptions.m103802clone();
            this.mTrackTaskManager = TrackTaskManager.getInstance();
            this.mTrackTaskManagerThread = new TrackTaskManagerThread();
            new Thread(this.mTrackTaskManagerThread, ThreadNameConstants.THREAD_TASK_QUEUE).start();
            SensorsDataExceptionHandler.init();
            initSAConfig(mSAConfigOptions.mServerUrl, packageName);
            this.mSAContextManager = new SAContextManager(context, this.mDisableTrackDeviceId);
            this.mMessages = AnalyticsMessages.getInstance(context, (SensorsDataAPI) this);
            SensorsDataRemoteManager sensorsDataRemoteManager = new SensorsDataRemoteManager((SensorsDataAPI) this);
            this.mRemoteManager = sensorsDataRemoteManager;
            sensorsDataRemoteManager.applySDKConfigFromCache();
            if (isVisualizedAutoTrackEnabled()) {
                VisualPropertiesManager.getInstance().requestVisualConfig(context);
            }
            if (this.mDebugMode != debugMode2 && mIsMainProcess && SHOW_DEBUG_INFO_VIEW && !isSDKDisabled()) {
                showDebugModeWarning();
            }
            registerLifecycleCallbacks();
            registerObserver();
            if (!mSAConfigOptions.isDisableSDK()) {
                delayInitTask();
            }
            if (SALog.isLogEnabled()) {
                SALog.m68589i(TAG, String.format(Locale.CHINA, "Initialized the instance of Sensors Analytics SDK with server url '%s', flush interval %d ms, debugMode: %s", this.mServerUrl, Integer.valueOf(mSAConfigOptions.mFlushInterval), debugMode));
            }
            this.mLoginId = DbAdapter.getInstance().getLoginId();
        } catch (Throwable th2) {
            SALog.m68587d(TAG, th2.getMessage());
        }
    }

    public boolean _trackEventFromH5(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strOptString = new JSONObject(str).optString("server_url");
            if (TextUtils.isEmpty(strOptString) || !new ServerUrl(strOptString).check(new ServerUrl(this.mServerUrl))) {
                return false;
            }
            trackEventFromH5(str);
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return false;
    }

    public JSONObject getDynamicProperty() {
        JSONObject dynamicSuperProperties = null;
        try {
            SensorsDataDynamicSuperProperties sensorsDataDynamicSuperProperties = this.mDynamicSuperPropertiesCallBack;
            if (sensorsDataDynamicSuperProperties == null) {
                return null;
            }
            dynamicSuperProperties = sensorsDataDynamicSuperProperties.getDynamicSuperProperties();
            SADataHelper.assertPropertyTypes(dynamicSuperProperties);
            return dynamicSuperProperties;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return dynamicSuperProperties;
        }
    }

    public void trackAutoEvent(String str, JSONObject jSONObject) {
        trackAutoEvent(str, jSONObject, null);
    }

    public void trackEvent(EventType eventType, String str, JSONObject jSONObject, String str2) {
        trackEvent(eventType, str, jSONObject, null, getDistinctId(), getLoginId(), str2);
    }

    public void trackInternal(String str, JSONObject jSONObject) {
        trackInternal(str, jSONObject, null);
    }

    private void getCarrier(JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(jSONObject.optString("$carrier")) && mSAConfigOptions.isDataCollectEnable) {
                String carrier = SensorsDataUtils.getCarrier(this.mContext);
                if (TextUtils.isEmpty(carrier)) {
                    return;
                }
                jSONObject.put("$carrier", carrier);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static SAConfigOptions getConfigOptions() {
        return mSAConfigOptions;
    }

    private JSONArray getPluginVersion() {
        try {
            if (TextUtils.isEmpty(SensorsDataAPI.ANDROID_PLUGIN_VERSION)) {
                return null;
            }
            SALog.m68589i(TAG, "android plugin version: " + SensorsDataAPI.ANDROID_PLUGIN_VERSION);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("android:" + SensorsDataAPI.ANDROID_PLUGIN_VERSION);
            return jSONArray;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    private boolean isEnterDb(String str, JSONObject jSONObject) {
        boolean zOnTrackEvent = true;
        if (this.mTrackEventCallBack != null) {
            SALog.m68587d(TAG, "SDK have set trackEvent callBack");
            try {
                zOnTrackEvent = this.mTrackEventCallBack.onTrackEvent(str, jSONObject);
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
            if (zOnTrackEvent) {
                try {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            SADataHelper.assertKey(next);
                            Object objOpt = jSONObject.opt(next);
                            if (!(objOpt instanceof CharSequence) && !(objOpt instanceof Number) && !(objOpt instanceof JSONArray) && !(objOpt instanceof Boolean) && !(objOpt instanceof Date)) {
                                String canonicalName = "";
                                String string = objOpt == null ? "" : objOpt.toString();
                                if (objOpt != null) {
                                    canonicalName = objOpt.getClass().getCanonicalName();
                                }
                                SALog.m68587d(TAG, String.format("The property value must be an instance of CharSequence/Number/Boolean/JSONArray/Date. [key='%s', value='%s', class='%s']", next, string, canonicalName));
                                return false;
                            }
                            if ("app_crashed_reason".equals(next)) {
                                if ((objOpt instanceof String) && ((String) objOpt).length() > 16382) {
                                    SALog.m68587d(TAG, "The property value is too long. [key='" + next + "', value='" + objOpt.toString() + "']");
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(((String) objOpt).substring(0, 16382));
                                    sb2.append("$");
                                    objOpt = sb2.toString();
                                }
                            } else if ((objOpt instanceof String) && ((String) objOpt).length() > 8191) {
                                SALog.m68587d(TAG, "The property value is too long. [key='" + next + "', value='" + objOpt.toString() + "']");
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(((String) objOpt).substring(0, 8191));
                                sb3.append("$");
                                objOpt = sb3.toString();
                            }
                            if (objOpt instanceof Date) {
                                jSONObject.put(next, TimeUtils.formatDate((Date) objOpt, Locale.CHINA));
                            } else {
                                jSONObject.put(next, objOpt);
                            }
                        } catch (Exception e12) {
                            SALog.printStackTrace(e12);
                            return false;
                        }
                    }
                } catch (Exception e13) {
                    SALog.printStackTrace(e13);
                }
            }
        }
        return zOnTrackEvent;
    }

    private static boolean isSDKDisableByLocal() {
        SAConfigOptions sAConfigOptions = mSAConfigOptions;
        if (sAConfigOptions != null) {
            return sAConfigOptions.isDisableSDK;
        }
        SALog.m68589i(TAG, "SAConfigOptions is null");
        return true;
    }

    private void registerLifecycleCallbacks() {
        try {
            Application application = (Application) this.mContext.getApplicationContext();
            SensorsDataActivityLifecycleCallbacks sensorsDataActivityLifecycleCallbacks = new SensorsDataActivityLifecycleCallbacks();
            application.registerActivityLifecycleCallbacks(sensorsDataActivityLifecycleCallbacks);
            application.registerActivityLifecycleCallbacks(AppStateManager.getInstance());
            ActivityLifecycleCallbacks activityLifecycleCallbacks = new ActivityLifecycleCallbacks((SensorsDataAPI) this, this.mFirstStart, this.mFirstDay, this.mContext);
            sensorsDataActivityLifecycleCallbacks.addActivityLifecycleCallbacks(activityLifecycleCallbacks);
            SensorsDataExceptionHandler.addExceptionListener(activityLifecycleCallbacks);
            FragmentTrackHelper.addFragmentCallbacks(new FragmentViewScreenCallbacks());
            if (mSAConfigOptions.isTrackPageLeave()) {
                ActivityPageLeaveCallbacks activityPageLeaveCallbacks = new ActivityPageLeaveCallbacks();
                sensorsDataActivityLifecycleCallbacks.addActivityLifecycleCallbacks(activityPageLeaveCallbacks);
                SensorsDataExceptionHandler.addExceptionListener(activityPageLeaveCallbacks);
                FragmentPageLeaveCallbacks fragmentPageLeaveCallbacks = new FragmentPageLeaveCallbacks();
                FragmentTrackHelper.addFragmentCallbacks(fragmentPageLeaveCallbacks);
                SensorsDataExceptionHandler.addExceptionListener(fragmentPageLeaveCallbacks);
            }
            if (mSAConfigOptions.isEnableTrackPush()) {
                sensorsDataActivityLifecycleCallbacks.addActivityLifecycleCallbacks(new PushLifecycleCallbacks());
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void registerObserver() {
        SensorsDataContentObserver sensorsDataContentObserver = new SensorsDataContentObserver();
        ContentResolver contentResolver = this.mContext.getContentResolver();
        contentResolver.registerContentObserver(DbParams.getInstance().getDataCollectUri(), false, sensorsDataContentObserver);
        contentResolver.registerContentObserver(DbParams.getInstance().getSessionTimeUri(), false, sensorsDataContentObserver);
        contentResolver.registerContentObserver(DbParams.getInstance().getLoginIdUri(), false, sensorsDataContentObserver);
        contentResolver.registerContentObserver(DbParams.getInstance().getDisableSDKUri(), false, sensorsDataContentObserver);
        contentResolver.registerContentObserver(DbParams.getInstance().getEnableSDKUri(), false, sensorsDataContentObserver);
    }

    private void showDebugModeWarning() {
        try {
            if (this.mDebugMode != SensorsDataAPI.DebugMode.DEBUG_OFF && !TextUtils.isEmpty(this.mServerUrl)) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.7
                    @Override // java.lang.Runnable
                    public void run() {
                        String str;
                        AbstractSensorsDataAPI abstractSensorsDataAPI = AbstractSensorsDataAPI.this;
                        SensorsDataAPI.DebugMode debugMode = abstractSensorsDataAPI.mDebugMode;
                        if (debugMode == SensorsDataAPI.DebugMode.DEBUG_ONLY) {
                            str = "现在您打开了 SensorsData SDK 的 'DEBUG_ONLY' 模式，此模式下只校验数据但不导入数据，数据出错时会以 Toast 的方式提示开发者，请上线前一定使用 DEBUG_OFF 模式。";
                        } else {
                            str = debugMode == SensorsDataAPI.DebugMode.DEBUG_AND_TRACK ? "现在您打开了神策 SensorsData SDK 的 'DEBUG_AND_TRACK' 模式，此模式下校验数据并且导入数据，数据出错时会以 Toast 的方式提示开发者，请上线前一定使用 DEBUG_OFF 模式。" : null;
                        }
                        CharSequence appName = AppInfoUtils.getAppName(abstractSensorsDataAPI.mContext);
                        if (!TextUtils.isEmpty(appName)) {
                            str = String.format(Locale.CHINA, "%s：%s", appName, str);
                        }
                        Toast.makeText(AbstractSensorsDataAPI.this.mContext, str, 1).show();
                    }
                });
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0200  */
    /* JADX WARN: Code duplicated, block: B:120:0x0209  */
    /* JADX WARN: Code duplicated, block: B:123:0x0222  */
    /* JADX WARN: Code duplicated, block: B:124:0x022f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0233  */
    /* JADX WARN: Code duplicated, block: B:140:0x026d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0276  */
    /* JADX WARN: Code duplicated, block: B:145:0x0289  */
    /* JADX WARN: Code duplicated, block: B:147:0x0295  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:176:0x0329 A[Catch: Exception -> 0x0333, TRY_LEAVE, TryCatch #8 {Exception -> 0x0333, blocks: (B:169:0x0313, B:171:0x0317, B:173:0x031d, B:174:0x0323, B:176:0x0329), top: B:215:0x0313 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0357 A[Catch: Exception -> 0x0364, TRY_LEAVE, TryCatch #7 {Exception -> 0x0364, blocks: (B:180:0x0337, B:182:0x033b, B:184:0x0341, B:185:0x0351, B:187:0x0357), top: B:213:0x0337 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0379  */
    /* JADX WARN: Code duplicated, block: B:196:0x0384  */
    /* JADX WARN: Code duplicated, block: B:205:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x0384, please report this as an issue */
    public void trackEventInternal(EventType eventType, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, String str3, String str4, EventTimer eventTimer) throws JSONException {
        String string;
        String str5;
        String str6;
        String str7;
        String strOptString;
        String str8;
        JSONObject jSONObject3;
        Iterator<SAFunctionListener> it;
        Iterator<SAEventListener> it2;
        JSONArray pluginVersion;
        StackTraceElement[] stackTrace;
        SensorsDataAPI.AutoTrackEventType autoTrackEventTypeAutoTrackEventTypeFromEventName;
        String string2;
        String[] strArrSplit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject4 = new JSONObject();
        long j11 = jCurrentTimeMillis;
        String strOptString2 = null;
        String str9 = "5.4.4";
        if (jSONObject != null) {
            try {
                if (jSONObject.has("$lib_detail")) {
                    string = jSONObject.getString("$lib_detail");
                    try {
                        jSONObject.remove("$lib_detail");
                    } catch (Exception e11) {
                        e = e11;
                        SALog.printStackTrace(e);
                    }
                } else {
                    string = null;
                }
            } catch (Exception e12) {
                e = e12;
                string = null;
            }
            try {
                if ("$AppEnd".equals(str)) {
                    long jOptLong = jSONObject.optLong("event_time");
                    if (jOptLong > 2000) {
                        j11 = jOptLong;
                    }
                    String strOptString3 = jSONObject.optString("$lib_version");
                    strOptString2 = jSONObject.optString("$app_version");
                    if (TextUtils.isEmpty(strOptString3)) {
                        jSONObject.remove("$lib_version");
                    } else {
                        str9 = strOptString3;
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONObject.remove("$app_version");
                    }
                    jSONObject.remove("event_time");
                } else if ("$AppStart".equals(str)) {
                    long jOptLong2 = jSONObject.optLong("event_time");
                    if (jOptLong2 > 0) {
                        j11 = jOptLong2;
                    }
                    jSONObject.remove("event_time");
                }
            } catch (Exception e13) {
                SALog.printStackTrace(e13);
            }
            SensorsDataUtils.mergeJSONObject(jSONObject, jSONObject2);
            if (eventType.isTrack()) {
                str5 = "$AppStart";
                if ("autoTrack".equals(jSONObject.optString("$lib_method"))) {
                    jSONObject4.put("$lib_method", "autoTrack");
                } else {
                    jSONObject4.put("$lib_method", "code");
                    jSONObject2.put("$lib_method", "code");
                }
            } else {
                str5 = "$AppStart";
                jSONObject4.put("$lib_method", "code");
            }
            str6 = strOptString2;
            strOptString2 = string;
        } else {
            str5 = "$AppStart";
            jSONObject4.put("$lib_method", "code");
            if (eventType.isTrack()) {
                jSONObject2.put("$lib_method", "code");
            }
            str6 = null;
        }
        long j12 = j11;
        String str10 = str9;
        if (eventTimer != null) {
            try {
                double d11 = Double.parseDouble(eventTimer.duration());
                if (d11 > 0.0d) {
                    jSONObject2.put("event_duration", d11);
                }
            } catch (Exception e14) {
                SALog.printStackTrace(e14);
            }
        }
        jSONObject4.put("$lib", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jSONObject4.put("$lib_version", str10);
        if (TextUtils.isEmpty(str6)) {
            this.mSAContextManager.addKeyIfExist(jSONObject4, "$app_version");
        } else {
            jSONObject4.put("$app_version", str6);
        }
        JSONObject jSONObject5 = this.mSuperProperties.get();
        if (jSONObject5 != null && jSONObject5.has("$app_version")) {
            jSONObject4.put("$app_version", jSONObject5.get("$app_version"));
        }
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject6.put("_track_id", new SecureRandom().nextInt());
        } catch (Exception unused) {
        }
        jSONObject6.put("time", j12);
        jSONObject6.put("type", eventType.getEventType());
        String anonymousId = getAnonymousId();
        try {
            if (jSONObject2.has("$project")) {
                jSONObject6.put("project", jSONObject2.optString("$project"));
                jSONObject2.remove("$project");
            }
            if (jSONObject2.has("$token")) {
                jSONObject6.put(InterfaceC33826o0.f71244p, jSONObject2.optString("$token"));
                jSONObject2.remove("$token");
            }
            if (jSONObject2.has("$time")) {
                try {
                    Object objOpt = jSONObject2.opt("$time");
                    if ((objOpt instanceof Date) && TimeUtils.isDateValid((Date) objOpt)) {
                        jSONObject6.put("time", ((Date) objOpt).getTime());
                    }
                } catch (Exception e15) {
                    SALog.printStackTrace(e15);
                }
                jSONObject2.remove("$time");
            }
            str7 = str;
            try {
                if ("$PlanPopupDisplay".equals(str7)) {
                    if (jSONObject2.has("$sf_internal_anonymous_id")) {
                        anonymousId = jSONObject2.optString("$sf_internal_anonymous_id");
                        jSONObject2.remove("$sf_internal_anonymous_id");
                    }
                    if (jSONObject2.has("$sf_internal_login_id")) {
                        strOptString = jSONObject2.optString("$sf_internal_login_id");
                        try {
                            jSONObject2.remove("$sf_internal_login_id");
                        } catch (Exception e16) {
                            e = e16;
                            SALog.printStackTrace(e);
                            str8 = strOptString;
                            strOptString = str2;
                        }
                    } else {
                        strOptString = str3;
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        str8 = strOptString;
                        strOptString = anonymousId;
                    } else {
                        str8 = strOptString;
                    }
                } else {
                    strOptString = str2;
                    str8 = str3;
                }
            } catch (Exception e17) {
                e = e17;
                strOptString = str3;
                SALog.printStackTrace(e);
                str8 = strOptString;
                strOptString = str2;
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject6.put("distinct_id", getAnonymousId());
                } else {
                    jSONObject6.put("distinct_id", strOptString);
                }
                if (!TextUtils.isEmpty(str8)) {
                    jSONObject6.put("login_id", str8);
                }
                jSONObject6.put("anonymous_id", anonymousId);
                jSONObject6.put("lib", jSONObject4);
                if (eventType == EventType.TRACK) {
                    jSONObject6.put("event", str7);
                    jSONObject2.put("$is_first_day", isFirstDay(j12));
                } else if (eventType == EventType.TRACK_SIGNUP) {
                    jSONObject6.put("event", str7);
                    jSONObject6.put("original_id", str4);
                }
                if (this.mAutoTrack) {
                    string2 = jSONObject.getString(AopConstants.SCREEN_NAME);
                    if (!TextUtils.isEmpty(string2)) {
                        strArrSplit = string2.split(C33861pe.f71429b);
                        if (strArrSplit.length > 0) {
                            strOptString2 = String.format("%s##%s##%s##%s", strArrSplit[0], "", "", "");
                        }
                    }
                }
                if (TextUtils.isEmpty(strOptString2)) {
                    stackTrace = new Exception().getStackTrace();
                    if (stackTrace.length > 1) {
                        StackTraceElement stackTraceElement = stackTrace[0];
                        strOptString2 = String.format("%s##%s##%s##%s", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                }
                jSONObject4.put("$lib_detail", strOptString2);
                if (jSONObject2.has("$device_id")) {
                    this.mSAContextManager.addKeyIfExist(jSONObject2, "$device_id");
                }
                if (eventType.isTrack()) {
                    if (!isEnterDb(str7, jSONObject2)) {
                        SALog.m68587d(TAG, str7 + " event can not enter database");
                        return;
                    }
                    if (!this.isTrackEventWithPluginVersion) {
                        pluginVersion = getPluginVersion();
                        if (pluginVersion == null) {
                            this.isTrackEventWithPluginVersion = true;
                        } else {
                            try {
                                jSONObject2.put("$lib_plugin_version", pluginVersion);
                                this.isTrackEventWithPluginVersion = true;
                            } catch (Exception e18) {
                                SALog.printStackTrace(e18);
                            }
                        }
                    }
                }
                jSONObject6.put("properties", jSONObject2);
                if (this.mEventListenerList != null) {
                    it2 = this.mEventListenerList.iterator();
                    while (it2.hasNext()) {
                        it2.next().trackEvent(jSONObject6);
                    }
                }
                if (this.mFunctionListenerList != null) {
                    jSONObject3 = new JSONObject();
                    jSONObject3.put("eventJSON", jSONObject6);
                    it = this.mFunctionListenerList.iterator();
                    while (it.hasNext()) {
                        it.next().call("trackEvent", jSONObject3);
                    }
                }
                this.mMessages.enqueueEventMessage(eventType.getEventType(), jSONObject6);
                if (str5.equals(str7)) {
                    this.mSAContextManager.setAppStartSuccess(true);
                }
                if (SALog.isLogEnabled()) {
                    SALog.m68589i(TAG, "track event:\n" + JSONUtils.formatJson(jSONObject6.toString()));
                }
            }
        } catch (Exception e19) {
            e = e19;
            str7 = str;
        }
        if (TextUtils.isEmpty(strOptString)) {
            jSONObject6.put("distinct_id", getAnonymousId());
        } else {
            jSONObject6.put("distinct_id", strOptString);
        }
        if (!TextUtils.isEmpty(str8)) {
            jSONObject6.put("login_id", str8);
        }
        jSONObject6.put("anonymous_id", anonymousId);
        jSONObject6.put("lib", jSONObject4);
        if (eventType == EventType.TRACK) {
            jSONObject6.put("event", str7);
            jSONObject2.put("$is_first_day", isFirstDay(j12));
        } else if (eventType == EventType.TRACK_SIGNUP) {
            jSONObject6.put("event", str7);
            jSONObject6.put("original_id", str4);
        }
        if (this.mAutoTrack && jSONObject != null && SensorsDataAPI.AutoTrackEventType.isAutoTrackType(str7) && (autoTrackEventTypeAutoTrackEventTypeFromEventName = SensorsDataAPI.AutoTrackEventType.autoTrackEventTypeFromEventName(str7)) != null && !isAutoTrackEventTypeIgnored(autoTrackEventTypeAutoTrackEventTypeFromEventName) && jSONObject.has(AopConstants.SCREEN_NAME)) {
            string2 = jSONObject.getString(AopConstants.SCREEN_NAME);
            if (!TextUtils.isEmpty(string2)) {
                strArrSplit = string2.split(C33861pe.f71429b);
                if (strArrSplit.length > 0) {
                    strOptString2 = String.format("%s##%s##%s##%s", strArrSplit[0], "", "", "");
                }
            }
        }
        if (TextUtils.isEmpty(strOptString2)) {
            stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                StackTraceElement stackTraceElement2 = stackTrace[0];
                strOptString2 = String.format("%s##%s##%s##%s", stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), Integer.valueOf(stackTraceElement2.getLineNumber()));
            }
        }
        jSONObject4.put("$lib_detail", strOptString2);
        if (jSONObject2.has("$device_id")) {
            this.mSAContextManager.addKeyIfExist(jSONObject2, "$device_id");
        }
        if (eventType.isTrack()) {
            if (!isEnterDb(str7, jSONObject2)) {
                SALog.m68587d(TAG, str7 + " event can not enter database");
                return;
            }
            if (!this.isTrackEventWithPluginVersion && !jSONObject2.has("$lib_plugin_version")) {
                pluginVersion = getPluginVersion();
                if (pluginVersion == null) {
                    this.isTrackEventWithPluginVersion = true;
                } else {
                    jSONObject2.put("$lib_plugin_version", pluginVersion);
                    this.isTrackEventWithPluginVersion = true;
                }
            }
        }
        jSONObject6.put("properties", jSONObject2);
        try {
            if (this.mEventListenerList != null && eventType.isTrack()) {
                it2 = this.mEventListenerList.iterator();
                while (it2.hasNext()) {
                    it2.next().trackEvent(jSONObject6);
                }
            }
        } catch (Exception e21) {
            SALog.printStackTrace(e21);
        }
        try {
            if (this.mFunctionListenerList != null && eventType.isTrack()) {
                jSONObject3 = new JSONObject();
                jSONObject3.put("eventJSON", jSONObject6);
                it = this.mFunctionListenerList.iterator();
                while (it.hasNext()) {
                    it.next().call("trackEvent", jSONObject3);
                }
            }
        } catch (Exception e22) {
            SALog.printStackTrace(e22);
        }
        this.mMessages.enqueueEventMessage(eventType.getEventType(), jSONObject6);
        if (str5.equals(str7)) {
            this.mSAContextManager.setAppStartSuccess(true);
        }
        if (SALog.isLogEnabled()) {
            SALog.m68589i(TAG, "track event:\n" + JSONUtils.formatJson(jSONObject6.toString()));
        }
    }

    private void transformEventTaskQueue(final EventType eventType, final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final String str2, final String str3, final String str4, final EventTimer eventTimer) {
        try {
            if (!jSONObject2.has("$time") && !"$AppStart".equals(str) && !"$AppEnd".equals(str)) {
                jSONObject2.put("$time", new Date(System.currentTimeMillis()));
            }
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
        this.mTrackTaskManager.transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (eventType.isTrack()) {
                        JSONUtils.mergeDistinctProperty(new JSONObject(AbstractSensorsDataAPI.this.mSAContextManager.getDeviceInfo()), jSONObject2);
                    }
                    if (!"$SignUp".equals(str)) {
                        AbstractSensorsDataAPI.this.trackEventInternal(eventType, str, jSONObject, jSONObject2, str2, str3, str4, eventTimer);
                    } else {
                        AbstractSensorsDataAPI abstractSensorsDataAPI = AbstractSensorsDataAPI.this;
                        abstractSensorsDataAPI.trackEventInternal(eventType, str, jSONObject, jSONObject2, str2, str3, abstractSensorsDataAPI.getAnonymousId(), eventTimer);
                    }
                } catch (Exception e12) {
                    SALog.printStackTrace(e12);
                }
            }
        });
    }

    private void transformH5TaskQueue(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject != null && !jSONObjectOptJSONObject.has("$time")) {
                jSONObjectOptJSONObject.put("$time", System.currentTimeMillis());
            }
            if (SALog.isLogEnabled()) {
                SALog.m68589i(TAG, "track H5, isDataCollectEnable = false, eventInfo = " + JSONUtils.formatJson(str));
            }
            this.mTrackTaskManager.transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AbstractSensorsDataAPI.this.trackEventH5(jSONObject.toString());
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void addEventListener(SAEventListener sAEventListener) {
        try {
            if (this.mEventListenerList == null) {
                this.mEventListenerList = new ArrayList();
            }
            this.mEventListenerList.add(sAEventListener);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void addFunctionListener(SAFunctionListener sAFunctionListener) {
        try {
            if (this.mFunctionListenerList == null) {
                this.mFunctionListenerList = new ArrayList();
            }
            if (sAFunctionListener == null || this.mFunctionListenerList.contains(sAFunctionListener)) {
                return;
            }
            this.mFunctionListenerList.add(sAFunctionListener);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void addSAJSListener(SAJSListener sAJSListener) {
        try {
            if (this.mSAJSListeners == null) {
                this.mSAJSListeners = new CopyOnWriteArrayList<>();
            }
            if (this.mSAJSListeners.contains(sAJSListener)) {
                return;
            }
            this.mSAJSListeners.add(sAJSListener);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void addTimeProperty(JSONObject jSONObject) {
        if (jSONObject.has("$time")) {
            return;
        }
        try {
            jSONObject.put("$time", new Date(System.currentTimeMillis()));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void appBecomeActive() {
        EventTimer value;
        synchronized (this.mTrackTimer) {
            try {
                for (Map.Entry<String, EventTimer> entry : this.mTrackTimer.entrySet()) {
                    if (entry != null && (value = entry.getValue()) != null) {
                        value.setStartTime(SystemClock.elapsedRealtime());
                    }
                }
            } catch (Exception e11) {
                SALog.m68589i(TAG, "appBecomeActive error:" + e11.getMessage());
            }
        }
    }

    public void appEnterBackground() {
        EventTimer value;
        synchronized (this.mTrackTimer) {
            try {
                for (Map.Entry<String, EventTimer> entry : this.mTrackTimer.entrySet()) {
                    if (entry != null && !"$AppEnd".equals(entry.getKey()) && (value = entry.getValue()) != null && !value.isPaused()) {
                        value.setEventAccumulatedDuration(((value.getEventAccumulatedDuration() + SystemClock.elapsedRealtime()) - value.getStartTime()) - ((long) getSessionIntervalTime()));
                        value.setStartTime(SystemClock.elapsedRealtime());
                    }
                }
            } catch (Exception e11) {
                SALog.m68589i(TAG, "appEnterBackground error:" + e11.getMessage());
            }
        }
    }

    public void applySAConfigOptions() {
        if (mSAConfigOptions.mEnableTrackAppCrash) {
            SensorsDataExceptionHandler.enableAppCrash();
        }
        SAConfigOptions sAConfigOptions = mSAConfigOptions;
        if (sAConfigOptions.mAutoTrackEventType != 0) {
            this.mAutoTrack = true;
        }
        if (sAConfigOptions.mInvokeLog) {
            enableLog(sAConfigOptions.mLogEnabled);
        }
        enableTrackScreenOrientation(mSAConfigOptions.mTrackScreenOrientationEnabled);
        if (TextUtils.isEmpty(mSAConfigOptions.mAnonymousId)) {
            return;
        }
        identify(mSAConfigOptions.mAnonymousId);
    }

    public void delayInitTask() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (AbstractSensorsDataAPI.this.isSaveDeepLinkInfo()) {
                        ChannelUtils.loadUtmByLocal(AbstractSensorsDataAPI.this.mContext);
                    } else {
                        ChannelUtils.clearLocalUtm(AbstractSensorsDataAPI.this.mContext);
                    }
                    AbstractSensorsDataAPI.this.registerNetworkListener();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    public void enableAutoTrack(int i11) {
        if (i11 <= 0 || i11 > 15) {
            return;
        }
        try {
            this.mAutoTrack = true;
            SAConfigOptions sAConfigOptions = mSAConfigOptions;
            sAConfigOptions.setAutoTrackEventType(i11 | sAConfigOptions.mAutoTrackEventType);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public SensorsDataAPI.DebugMode getDebugMode() {
        return this.mDebugMode;
    }

    public SensorsDataDeepLinkCallback getDeepLinkCallback() {
        return this.mDeepLinkCallback;
    }

    public BaseSensorsDataSDKRemoteManager getRemoteManager() {
        return this.mRemoteManager;
    }

    public SAContextManager getSAContextManager() {
        return this.mSAContextManager;
    }

    public SensorsDataEncrypt getSensorsDataEncrypt() {
        return this.mSensorsDataEncrypt;
    }

    public void handleJsMessage(WeakReference<View> weakReference, String str) {
        CopyOnWriteArrayList<SAJSListener> copyOnWriteArrayList = this.mSAJSListeners;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (SAJSListener sAJSListener : this.mSAJSListeners) {
            if (sAJSListener != null) {
                try {
                    sAJSListener.onReceiveJSMessage(weakReference, str);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        }
    }

    public void initSAConfig(String str, String str2) {
        Bundle appInfoBundle = AppInfoUtils.getAppInfoBundle(this.mContext);
        if (mSAConfigOptions == null) {
            this.mSDKConfigInit = false;
            mSAConfigOptions = new SAConfigOptions(str);
        } else {
            this.mSDKConfigInit = true;
        }
        SAConfigOptions sAConfigOptions = mSAConfigOptions;
        if (sAConfigOptions.mEnableEncrypt) {
            this.mSensorsDataEncrypt = new SensorsDataEncrypt(this.mContext, sAConfigOptions.mPersistentSecretKey, sAConfigOptions.getEncryptors());
        }
        DbAdapter.getInstance(this.mContext, str2, this.mSensorsDataEncrypt);
        this.mTrackTaskManager.setDataCollectEnable(mSAConfigOptions.isDataCollectEnable);
        SAConfigOptions sAConfigOptions2 = mSAConfigOptions;
        if (sAConfigOptions2.mInvokeLog) {
            enableLog(sAConfigOptions2.mLogEnabled);
        } else {
            enableLog(appInfoBundle.getBoolean("com.sensorsdata.analytics.android.EnableLogging", this.mDebugMode != SensorsDataAPI.DebugMode.DEBUG_OFF));
        }
        SALog.setDisableSDK(mSAConfigOptions.isDisableSDK);
        setServerUrl(str);
        if (mSAConfigOptions.mEnableTrackAppCrash) {
            SensorsDataExceptionHandler.enableAppCrash();
        }
        SAConfigOptions sAConfigOptions3 = mSAConfigOptions;
        if (sAConfigOptions3.mFlushInterval == 0) {
            sAConfigOptions3.setFlushInterval(appInfoBundle.getInt("com.sensorsdata.analytics.android.FlushInterval", 15000));
        }
        SAConfigOptions sAConfigOptions4 = mSAConfigOptions;
        if (sAConfigOptions4.mFlushBulkSize == 0) {
            sAConfigOptions4.setFlushBulkSize(appInfoBundle.getInt("com.sensorsdata.analytics.android.FlushBulkSize", 100));
        }
        SAConfigOptions sAConfigOptions5 = mSAConfigOptions;
        if (sAConfigOptions5.mMaxCacheSize == 0) {
            sAConfigOptions5.setMaxCacheSize(33554432L);
        }
        if (mSAConfigOptions.isSubProcessFlushData && DbAdapter.getInstance().isFirstProcess()) {
            DbAdapter.getInstance().commitFirstProcessState(false);
            DbAdapter.getInstance().commitSubProcessFlushState(false);
        }
        this.mAutoTrack = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.AutoTrack", false);
        int i11 = mSAConfigOptions.mAutoTrackEventType;
        if (i11 != 0) {
            enableAutoTrack(i11);
            this.mAutoTrack = true;
        }
        SAConfigOptions sAConfigOptions6 = mSAConfigOptions;
        if (!sAConfigOptions6.mInvokeHeatMapEnabled) {
            sAConfigOptions6.mHeatMapEnabled = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.HeatMap", false);
        }
        SAConfigOptions sAConfigOptions7 = mSAConfigOptions;
        if (!sAConfigOptions7.mInvokeHeatMapConfirmDialog) {
            sAConfigOptions7.mHeatMapConfirmDialogEnabled = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.EnableHeatMapConfirmDialog", false);
        }
        SAConfigOptions sAConfigOptions8 = mSAConfigOptions;
        if (!sAConfigOptions8.mInvokeVisualizedEnabled) {
            sAConfigOptions8.mVisualizedEnabled = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.VisualizedAutoTrack", false);
        }
        SAConfigOptions sAConfigOptions9 = mSAConfigOptions;
        if (!sAConfigOptions9.mInvokeVisualizedConfirmDialog) {
            sAConfigOptions9.mVisualizedConfirmDialogEnabled = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.EnableVisualizedAutoTrackConfirmDialog", false);
        }
        enableTrackScreenOrientation(mSAConfigOptions.mTrackScreenOrientationEnabled);
        if (!TextUtils.isEmpty(mSAConfigOptions.mAnonymousId)) {
            identify(mSAConfigOptions.mAnonymousId);
        }
        if (mSAConfigOptions.isDisableSDK) {
            this.mEnableNetworkRequest = false;
            isChangeEnableNetworkFlag = true;
        }
        SHOW_DEBUG_INFO_VIEW = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.ShowDebugInfoView", true);
        this.mDisableDefaultRemoteConfig = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.DisableDefaultRemoteConfig", false);
        if (mSAConfigOptions.isDataCollectEnable) {
            mIsMainProcess = AppInfoUtils.isMainProcess(this.mContext, appInfoBundle);
        }
        this.mDisableTrackDeviceId = appInfoBundle.getBoolean("com.sensorsdata.analytics.android.DisableTrackDeviceId", false);
    }

    public boolean isAppHeatMapConfirmDialogEnabled() {
        return mSAConfigOptions.mHeatMapConfirmDialogEnabled;
    }

    public boolean isDeepLinkInstallSource() {
        return this.mEnableDeepLinkInstallSource;
    }

    public boolean isDisableDefaultRemoteConfig() {
        return this.mDisableDefaultRemoteConfig;
    }

    public boolean isFirstDay(long j11) {
        String str = this.mFirstDay.get();
        if (str == null) {
            return true;
        }
        try {
            if (this.mIsFirstDayDateFormat == null) {
                this.mIsFirstDayDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            }
            return str.equals(this.mIsFirstDayDateFormat.format(Long.valueOf(j11)));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return true;
        }
    }

    public boolean isSaveDeepLinkInfo() {
        return mSAConfigOptions.mEnableSaveDeepLinkInfo;
    }

    public boolean isVisualizedAutoTrackConfirmDialogEnabled() {
        return mSAConfigOptions.mVisualizedConfirmDialogEnabled;
    }

    public void registerNetworkListener() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.3
            @Override // java.lang.Runnable
            public void run() {
                NetworkUtils.registerNetworkListener(AbstractSensorsDataAPI.this.mContext);
            }
        });
    }

    public void removeEventListener(SAEventListener sAEventListener) {
        try {
            List<SAEventListener> list = this.mEventListenerList;
            if (list == null || !list.contains(sAEventListener)) {
                return;
            }
            this.mEventListenerList.remove(sAEventListener);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void removeFunctionListener(SAFunctionListener sAFunctionListener) {
        try {
            List<SAFunctionListener> list = this.mFunctionListenerList;
            if (list == null || sAFunctionListener == null) {
                return;
            }
            list.remove(sAFunctionListener);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void setDebugMode(SensorsDataAPI.DebugMode debugMode) {
        this.mDebugMode = debugMode;
        if (debugMode == SensorsDataAPI.DebugMode.DEBUG_OFF) {
            enableLog(false);
            SALog.setDebug(false);
            this.mServerUrl = this.mOriginServerUrl;
        } else {
            enableLog(true);
            SALog.setDebug(true);
            setServerUrl(this.mOriginServerUrl);
        }
    }

    public void setRemoteManager(BaseSensorsDataSDKRemoteManager baseSensorsDataSDKRemoteManager) {
        this.mRemoteManager = baseSensorsDataSDKRemoteManager;
    }

    public void trackAutoEvent(String str, JSONObject jSONObject, ViewNode viewNode) {
        trackInternal(str, SADataHelper.appendLibMethodAutoTrack(jSONObject), viewNode);
    }

    public void trackChannelDebugInstallation() {
        final JSONObject jSONObject = new JSONObject();
        addTimeProperty(jSONObject);
        transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    AbstractSensorsDataAPI abstractSensorsDataAPI = AbstractSensorsDataAPI.this;
                    jSONObject2.put("$ios_install_source", ChannelUtils.getDeviceInfo(abstractSensorsDataAPI.mContext, abstractSensorsDataAPI.mSAContextManager.getAndroidId(), OaidHelper.getOAID(AbstractSensorsDataAPI.this.mContext)));
                    AbstractSensorsDataAPI.this.trackEvent(EventType.TRACK, "$ChannelDebugInstall", jSONObject, null);
                    JSONObject jSONObject3 = new JSONObject();
                    SensorsDataUtils.mergeJSONObject(jSONObject, jSONObject3);
                    jSONObject3.put("$first_visit_time", new Date());
                    if (AbstractSensorsDataAPI.mSAConfigOptions.mEnableMultipleChannelMatch) {
                        AbstractSensorsDataAPI.this.trackEvent(EventType.PROFILE_SET, null, jSONObject3, null);
                    } else {
                        AbstractSensorsDataAPI.this.trackEvent(EventType.PROFILE_SET_ONCE, null, jSONObject3, null);
                    }
                    AbstractSensorsDataAPI.this.flush();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    public void trackEvent(EventType eventType, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, String str3, String str4) {
        EventTimer eventTimer;
        JSONObject jSONObject3;
        Object obj;
        try {
            if (TextUtils.isEmpty(str)) {
                eventTimer = null;
            } else {
                synchronized (this.mTrackTimer) {
                    eventTimer = this.mTrackTimer.get(str);
                    this.mTrackTimer.remove(str);
                }
                if (str.endsWith("_SATimer") && str.length() > 45) {
                    str = str.substring(0, str.length() - 45);
                }
            }
            String str5 = str;
            EventTimer eventTimer2 = eventTimer;
            if (eventType.isTrack()) {
                SADataHelper.assertKey(str5);
                BaseSensorsDataSDKRemoteManager baseSensorsDataSDKRemoteManager = this.mRemoteManager;
                if (baseSensorsDataSDKRemoteManager != null && baseSensorsDataSDKRemoteManager.ignoreEvent(str5)) {
                    return;
                }
            }
            SADataHelper.assertPropertyTypes(jSONObject);
            try {
                if (eventType.isTrack()) {
                    Map<String, Object> deviceInfo = this.mSAContextManager.getDeviceInfo();
                    jSONObject3 = deviceInfo != null ? new JSONObject(deviceInfo) : new JSONObject();
                    getCarrier(jSONObject3);
                    if (!"$AppEnd".equals(str5) && !"$AppDeeplinkLaunch".equals(str5)) {
                        SensorsDataUtils.mergeJSONObject(ChannelUtils.getLatestUtmProperties(), jSONObject3);
                    }
                    mergerDynamicAndSuperProperties(jSONObject3, jSONObject2);
                    if (mSAConfigOptions.mEnableReferrerTitle && (obj = this.mReferrerScreenTitle) != null) {
                        jSONObject3.put("$referrer_title", obj);
                    }
                    Object objNetworkType = NetworkUtils.networkType(this.mContext);
                    jSONObject3.put("$wifi", "WIFI".equals(objNetworkType));
                    jSONObject3.put("$network_type", objNetworkType);
                    try {
                        SensorsDataGPSLocation sensorsDataGPSLocation = mGPSLocation;
                        if (sensorsDataGPSLocation != null) {
                            sensorsDataGPSLocation.toJSON(jSONObject3);
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                    try {
                        String screenOrientation = getScreenOrientation();
                        if (!TextUtils.isEmpty(screenOrientation)) {
                            jSONObject3.put("$screen_orientation", screenOrientation);
                        }
                    } catch (Exception e12) {
                        SALog.printStackTrace(e12);
                    }
                } else if (!eventType.isProfile()) {
                    return;
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObject4 = jSONObject3;
                if (mSAConfigOptions.isDataCollectEnable) {
                    trackEventInternal(eventType, str5, jSONObject, jSONObject4, str2, str3, str4, eventTimer2);
                    return;
                }
                if (SALog.isLogEnabled()) {
                    SALog.m68589i(TAG, "track event, isDataCollectEnable = false, eventName = " + str5 + ",property = " + JSONUtils.formatJson(jSONObject4.toString()));
                }
                transformEventTaskQueue(eventType, str5, jSONObject, jSONObject4, str2, str3, str4, eventTimer2);
            } catch (JSONException unused) {
                throw new InvalidDataException("Unexpected property");
            }
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
    }

    public void trackInternal(final String str, final JSONObject jSONObject, final ViewNode viewNode) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (viewNode != null) {
                        VisualPropertiesManager.getInstance().mergeVisualProperties(VisualPropertiesManager.VisualEventType.APP_CLICK, jSONObject, viewNode);
                    }
                    AbstractSensorsDataAPI.this.trackEvent(EventType.TRACK, str, jSONObject, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void trackItemEvent(String str, String str2, String str3, long j11, JSONObject jSONObject) {
        String str4;
        try {
            SADataHelper.assertKey(str);
            SADataHelper.assertValue(str2);
            SADataHelper.assertPropertyTypes(jSONObject);
            if (!mSAConfigOptions.isDataCollectEnable) {
                transformItemTaskQueue(str, str2, str3, j11, jSONObject);
                return;
            }
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("$project")) {
                        str4 = (String) jSONObject.get("$project");
                        jSONObject.remove("$project");
                    } else {
                        str4 = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                str4 = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("$lib", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            jSONObject2.put("$lib_version", "5.4.4");
            jSONObject2.put("$lib_method", "code");
            this.mSAContextManager.addKeyIfExist(jSONObject2, "$app_version");
            JSONObject jSONObject3 = this.mSuperProperties.get();
            if (jSONObject3 != null && jSONObject3.has("$app_version")) {
                jSONObject2.put("$app_version", jSONObject3.get("$app_version"));
            }
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length > 1) {
                StackTraceElement stackTraceElement = stackTrace[0];
                String str5 = String.format("%s##%s##%s##%s", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()));
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject2.put("$lib_detail", str5);
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("item_type", str);
            jSONObject4.put(FirebaseAnalytics.Param.ITEM_ID, str2);
            jSONObject4.put("type", str3);
            jSONObject4.put("time", j11);
            jSONObject4.put("properties", TimeUtils.formatDate(jSONObject));
            jSONObject4.put("lib", jSONObject2);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject4.put("project", str4);
            }
            this.mMessages.enqueueEventMessage(str3, jSONObject4);
            SALog.m68589i(TAG, "track event:\n" + JSONUtils.formatJson(jSONObject4.toString()));
            return;
        } catch (Exception e12) {
            e = e12;
        }
        SALog.printStackTrace(e);
    }

    public void transformTaskQueue(final Runnable runnable) {
        if (mSAConfigOptions.isDataCollectEnable) {
            this.mTrackTaskManager.addTrackEventTask(runnable);
        } else {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.5
                @Override // java.lang.Runnable
                public void run() {
                    AbstractSensorsDataAPI.this.mTrackTaskManager.transformTaskQueue(runnable);
                }
            });
        }
    }

    public void unregisterNetworkListener() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.4
            @Override // java.lang.Runnable
            public void run() {
                NetworkUtils.unregisterNetworkListener(AbstractSensorsDataAPI.this.mContext);
            }
        });
    }

    public static boolean isSDKDisabled() {
        if (!isSDKDisableByLocal() && !isSDKDisabledByRemote()) {
            return false;
        }
        return true;
    }

    private static boolean isSDKDisabledByRemote() {
        boolean zIsSDKDisabledByRemote = BaseSensorsDataSDKRemoteManager.isSDKDisabledByRemote();
        if (zIsSDKDisabledByRemote) {
            SALog.m68589i(TAG, "remote config: SDK is disabled");
        }
        return zIsSDKDisabledByRemote;
    }

    private void mergerDynamicAndSuperProperties(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject superProperties = getSuperProperties();
        if (jSONObject2 == null) {
            jSONObject2 = getDynamicProperty();
        }
        SensorsDataUtils.mergeJSONObject(SensorsDataUtils.mergeSuperJSONObject(jSONObject2, superProperties), jSONObject);
    }

    private void transformItemTaskQueue(final String str, final String str2, final String str3, final long j11, final JSONObject jSONObject) {
        if (SALog.isLogEnabled()) {
            SALog.m68589i(TAG, "track item, isDataCollectEnable = false, itemType = " + str + ",itemId = " + str2);
        }
        this.mTrackTaskManager.transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractSensorsDataAPI.this.trackItemEvent(str, str2, str3, j11, jSONObject);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0268 A[Catch: all -> 0x025e, Exception -> 0x028b, TryCatch #2 {Exception -> 0x028b, blocks: (B:110:0x0264, B:112:0x0268, B:113:0x0278, B:115:0x027e), top: B:162:0x0264, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x027e A[Catch: all -> 0x025e, Exception -> 0x028b, TRY_LEAVE, TryCatch #2 {Exception -> 0x028b, blocks: (B:110:0x0264, B:112:0x0268, B:113:0x0278, B:115:0x027e), top: B:162:0x0264, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x029a A[Catch: all -> 0x025e, TryCatch #7 {, blocks: (B:94:0x021f, B:96:0x022d, B:98:0x0237, B:99:0x0246, B:101:0x024a, B:102:0x024e, B:104:0x0254, B:110:0x0264, B:112:0x0268, B:113:0x0278, B:115:0x027e, B:119:0x028f, B:121:0x029a, B:118:0x028c, B:109:0x0261, B:122:0x02b9), top: B:172:0x021f, outer: #8, inners: #0, #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x029a, please report this as an issue */
    public void trackEventH5(String str) {
        JSONObject jSONObject;
        Iterator<SAFunctionListener> it;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!mSAConfigOptions.isDataCollectEnable) {
                    transformH5TaskQueue(str);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(str);
                jSONObject2.put("_hybrid_h5", true);
                String string = jSONObject2.getString("type");
                EventType eventTypeValueOf = EventType.valueOf(string.toUpperCase(Locale.getDefault()));
                if (eventTypeValueOf == EventType.TRACK_SIGNUP) {
                    jSONObject2.put("original_id", getAnonymousId());
                } else if (!TextUtils.isEmpty(getLoginId())) {
                    jSONObject2.put("distinct_id", getLoginId());
                } else {
                    jSONObject2.put("distinct_id", getAnonymousId());
                }
                jSONObject2.put("anonymous_id", getAnonymousId());
                long jCurrentTimeMillis = System.currentTimeMillis();
                jSONObject2.put("time", jCurrentTimeMillis);
                try {
                    jSONObject2.put("_track_id", new SecureRandom().nextInt());
                } catch (Exception unused) {
                }
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("properties");
                SADataHelper.assertPropertyTypes(jSONObjectOptJSONObject);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("lib");
                if (jSONObjectOptJSONObject2 != null) {
                    this.mSAContextManager.addKeyIfExist(jSONObjectOptJSONObject2, "$app_version");
                    JSONObject jSONObject3 = this.mSuperProperties.get();
                    if (jSONObject3 != null && jSONObject3.has("$app_version")) {
                        jSONObjectOptJSONObject2.put("$app_version", jSONObject3.get("$app_version"));
                    }
                }
                if (eventTypeValueOf.isTrack()) {
                    Map<String, Object> deviceInfo = this.mSAContextManager.getDeviceInfo();
                    if (deviceInfo != null) {
                        for (Map.Entry<String, Object> entry : deviceInfo.entrySet()) {
                            String key = entry.getKey();
                            if (!TextUtils.isEmpty(key) && !"$lib".equals(key) && !"$lib_version".equals(key)) {
                                jSONObjectOptJSONObject.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    getCarrier(jSONObjectOptJSONObject);
                    String strNetworkType = NetworkUtils.networkType(this.mContext);
                    jSONObjectOptJSONObject.put("$wifi", "WIFI".equals(strNetworkType));
                    jSONObjectOptJSONObject.put("$network_type", strNetworkType);
                    mergerDynamicAndSuperProperties(jSONObjectOptJSONObject, getDynamicProperty());
                    if (eventTypeValueOf.isTrack()) {
                        jSONObjectOptJSONObject.put("$is_first_day", isFirstDay(jCurrentTimeMillis));
                    }
                    SensorsDataUtils.mergeJSONObject(ChannelUtils.getLatestUtmProperties(), jSONObjectOptJSONObject);
                }
                if (jSONObject2.has("_nocache")) {
                    jSONObject2.remove("_nocache");
                }
                if (jSONObject2.has("server_url")) {
                    jSONObject2.remove("server_url");
                }
                if (jSONObject2.has("_flush_time")) {
                    jSONObject2.remove("_flush_time");
                }
                if (jSONObjectOptJSONObject.has("$project")) {
                    jSONObject2.put("project", jSONObjectOptJSONObject.optString("$project"));
                    jSONObjectOptJSONObject.remove("$project");
                }
                if (jSONObjectOptJSONObject.has("$token")) {
                    jSONObject2.put(InterfaceC33826o0.f71244p, jSONObjectOptJSONObject.optString("$token"));
                    jSONObjectOptJSONObject.remove("$token");
                }
                if (jSONObjectOptJSONObject.has("$time")) {
                    try {
                        long j11 = jSONObjectOptJSONObject.getLong("$time");
                        if (TimeUtils.isDateValid(j11)) {
                            jSONObject2.put("time", j11);
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                    jSONObjectOptJSONObject.remove("$time");
                }
                String strOptString = jSONObject2.optString("event");
                if (eventTypeValueOf.isTrack()) {
                    SADataHelper.assertKey(strOptString);
                    if (!isEnterDb(strOptString, jSONObjectOptJSONObject)) {
                        SALog.m68587d(TAG, strOptString + " event can not enter database");
                        return;
                    }
                    if (!this.isTrackEventWithPluginVersion && !jSONObjectOptJSONObject.has("$lib_plugin_version")) {
                        JSONArray pluginVersion = getPluginVersion();
                        if (pluginVersion == null) {
                            this.isTrackEventWithPluginVersion = true;
                        } else {
                            try {
                                jSONObjectOptJSONObject.put("$lib_plugin_version", pluginVersion);
                                this.isTrackEventWithPluginVersion = true;
                            } catch (Exception e12) {
                                SALog.printStackTrace(e12);
                            }
                        }
                    }
                }
                jSONObject2.put("properties", jSONObjectOptJSONObject);
                if (eventTypeValueOf == EventType.TRACK_SIGNUP) {
                    String string2 = jSONObject2.getString("distinct_id");
                    synchronized (this.mLoginIdLock) {
                        if (!string2.equals(DbAdapter.getInstance().getLoginId()) && !string2.equals(getAnonymousId())) {
                            this.mLoginId = string2;
                            DbAdapter.getInstance().commitLoginId(string2);
                            jSONObject2.put("login_id", string2);
                            try {
                                List<SAEventListener> list = this.mEventListenerList;
                                if (list != null) {
                                    Iterator<SAEventListener> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().login();
                                    }
                                    try {
                                        if (this.mFunctionListenerList != null) {
                                            jSONObject = new JSONObject();
                                            jSONObject.put("distinctId", string2);
                                            it = this.mFunctionListenerList.iterator();
                                            while (it.hasNext()) {
                                                it.next().call(FirebaseAnalytics.Event.LOGIN, jSONObject);
                                            }
                                        }
                                    } catch (Exception e13) {
                                        SALog.printStackTrace(e13);
                                    }
                                    this.mMessages.enqueueEventMessage(string, jSONObject2);
                                    if (SALog.isLogEnabled()) {
                                        SALog.m68589i(TAG, "track event:\n" + JSONUtils.formatJson(jSONObject2.toString()));
                                    }
                                } else {
                                    if (this.mFunctionListenerList != null) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("distinctId", string2);
                                        it = this.mFunctionListenerList.iterator();
                                        while (it.hasNext()) {
                                            it.next().call(FirebaseAnalytics.Event.LOGIN, jSONObject);
                                        }
                                    }
                                    this.mMessages.enqueueEventMessage(string, jSONObject2);
                                    if (SALog.isLogEnabled()) {
                                        SALog.m68589i(TAG, "track event:\n" + JSONUtils.formatJson(jSONObject2.toString()));
                                    }
                                }
                            } catch (Exception e14) {
                                SALog.printStackTrace(e14);
                            }
                            throw th;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(getLoginId())) {
                    jSONObject2.put("login_id", getLoginId());
                }
                try {
                    if (this.mEventListenerList != null && eventTypeValueOf.isTrack()) {
                        Iterator<SAEventListener> it3 = this.mEventListenerList.iterator();
                        while (it3.hasNext()) {
                            it3.next().trackEvent(jSONObject2);
                        }
                    }
                } catch (Exception e15) {
                    SALog.printStackTrace(e15);
                }
                try {
                    if (this.mFunctionListenerList != null && eventTypeValueOf.isTrack()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("eventJSON", jSONObject2);
                        Iterator<SAFunctionListener> it4 = this.mFunctionListenerList.iterator();
                        while (it4.hasNext()) {
                            it4.next().call("trackEvent", jSONObject4);
                        }
                    }
                } catch (Exception e16) {
                    SALog.printStackTrace(e16);
                }
                this.mMessages.enqueueEventMessage(string, jSONObject2);
                if (SALog.isLogEnabled()) {
                    SALog.m68589i(TAG, "track event from H5:\n" + JSONUtils.formatJson(jSONObject2.toString()));
                    return;
                }
                return;
                SALog.printStackTrace(e);
            }
        } catch (Exception e17) {
            SALog.printStackTrace(e17);
        }
    }

    public void trackTimerState(final String str, final boolean z11) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertKey(str);
                    synchronized (AbstractSensorsDataAPI.this.mTrackTimer) {
                        try {
                            EventTimer eventTimer = AbstractSensorsDataAPI.this.mTrackTimer.get(str);
                            if (eventTimer != null) {
                                boolean zIsPaused = eventTimer.isPaused();
                                boolean z12 = z11;
                                if (zIsPaused != z12) {
                                    eventTimer.setTimerState(z12, jElapsedRealtime);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    public AbstractSensorsDataAPI() {
        this.mLoginIdLock = new Object();
        this.mIgnoredViewTypeList = new ArrayList();
        this.mLoginId = null;
        this.mDebugMode = SensorsDataAPI.DebugMode.DEBUG_OFF;
        this.mEnableNetworkRequest = true;
        this.mClearReferrerWhenAppEnd = false;
        this.mDisableDefaultRemoteConfig = false;
        this.mDisableTrackDeviceId = false;
        this.mSessionTime = 30000;
        this.mEnableDeepLinkInstallSource = false;
        this.isTrackEventWithPluginVersion = false;
        this.mContext = null;
        this.mMessages = null;
        this.mDistinctId = null;
        this.mSuperProperties = null;
        this.mFirstStart = null;
        this.mFirstDay = null;
        this.mFirstTrackInstallation = null;
        this.mFirstTrackInstallationWithCallback = null;
        this.mTrackTimer = null;
        this.mSensorsDataEncrypt = null;
    }
}
