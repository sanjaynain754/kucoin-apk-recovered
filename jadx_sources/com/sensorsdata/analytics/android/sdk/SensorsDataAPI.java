package com.sensorsdata.analytics.android.sdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.OaidHelper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.encrypt.SensorsDataEncrypt;
import com.sensorsdata.analytics.android.sdk.internal.rpc.SensorsDataContentObserver;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.listener.SAFunctionListener;
import com.sensorsdata.analytics.android.sdk.listener.SAJSListener;
import com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.SAContextManager;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager;
import com.tencent.bugly.proguard.C33820nf;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsDataAPI extends AbstractSensorsDataAPI {
    static String ANDROID_PLUGIN_VERSION = "";
    static final String MIN_PLUGIN_VERSION = "3.4.0";
    static final String VERSION = "5.4.4";
    public static final int VTRACK_SUPPORTED_MIN_API = 16;

    public enum AutoTrackEventType {
        APP_START(1),
        APP_END(2),
        APP_CLICK(4),
        APP_VIEW_SCREEN(8);

        private final int eventValue;

        public static String autoTrackEventName(int i11) {
            if (i11 == 1) {
                return "$AppStart";
            }
            if (i11 == 2) {
                return "$AppEnd";
            }
            if (i11 != 4) {
                return i11 != 8 ? "" : "$AppViewScreen";
            }
            return AopConstants.APP_CLICK_EVENT_NAME;
        }

        public static boolean isAutoTrackType(String str) {
            if (!TextUtils.isEmpty(str)) {
                str.getClass();
                switch (str) {
                    case "$AppViewScreen":
                    case "$AppEnd":
                    case "$AppClick":
                    case "$AppStart":
                        return true;
                }
            }
            return false;
        }

        public int getEventValue() {
            return this.eventValue;
        }

        AutoTrackEventType(int i11) {
            this.eventValue = i11;
        }

        public static AutoTrackEventType autoTrackEventTypeFromEventName(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            str.getClass();
            switch (str) {
                case "$AppViewScreen":
                    return APP_VIEW_SCREEN;
                case "$AppEnd":
                    return APP_END;
                case "$AppClick":
                    return APP_CLICK;
                case "$AppStart":
                    return APP_START;
                default:
                    return null;
            }
        }
    }

    public enum DebugMode {
        DEBUG_OFF(false, false),
        DEBUG_ONLY(true, false),
        DEBUG_AND_TRACK(true, true);

        private final boolean debugMode;
        private final boolean debugWriteData;

        public boolean isDebugMode() {
            return this.debugMode;
        }

        public boolean isDebugWriteData() {
            return this.debugWriteData;
        }

        DebugMode(boolean z11, boolean z12) {
            this.debugMode = z11;
            this.debugWriteData = z12;
        }
    }

    /* JADX INFO: loaded from: classes59.dex */
    public final class NetworkType {
        public static final int TYPE_2G = 1;
        public static final int TYPE_3G = 2;
        public static final int TYPE_4G = 4;
        public static final int TYPE_5G = 16;
        public static final int TYPE_ALL = 255;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_WIFI = 8;

        public NetworkType() {
        }
    }

    public SensorsDataAPI() {
    }

    public static SensorsDataAPI sharedInstance(Context context) {
        if (AbstractSensorsDataAPI.isSDKDisabled()) {
            return new SensorsDataAPIEmptyImplementation();
        }
        if (context == null) {
            return new SensorsDataAPIEmptyImplementation();
        }
        Map<Context, SensorsDataAPI> map = AbstractSensorsDataAPI.sInstanceMap;
        synchronized (map) {
            try {
                SensorsDataAPI sensorsDataAPI = map.get(context.getApplicationContext());
                if (sensorsDataAPI != null) {
                    return sensorsDataAPI;
                }
                SALog.m68589i("SA.SensorsDataAPI", "The static method sharedInstance(context, serverURL, debugMode) should be called before calling sharedInstance()");
                return new SensorsDataAPIEmptyImplementation();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearReferrerWhenAppEnd() {
        this.mClearReferrerWhenAppEnd = true;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void disableAutoTrack(List<AutoTrackEventType> list) {
        ignoreAutoTrackEventType(list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void enableAutoTrack() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AutoTrackEventType.APP_START);
        arrayList.add(AutoTrackEventType.APP_END);
        arrayList.add(AutoTrackEventType.APP_VIEW_SCREEN);
        enableAutoTrack(arrayList);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void ignoreAutoTrackEventType(AutoTrackEventType autoTrackEventType) {
        int i11;
        if (autoTrackEventType == null || (i11 = AbstractSensorsDataAPI.mSAConfigOptions.mAutoTrackEventType) == 0) {
            return;
        }
        int i12 = i11 | autoTrackEventType.eventValue;
        if (i12 == autoTrackEventType.eventValue) {
            AbstractSensorsDataAPI.mSAConfigOptions.setAutoTrackEventType(0);
        } else {
            AbstractSensorsDataAPI.mSAConfigOptions.setAutoTrackEventType(autoTrackEventType.eventValue ^ i12);
        }
        if (AbstractSensorsDataAPI.mSAConfigOptions.mAutoTrackEventType == 0) {
            this.mAutoTrack = false;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void ignoreView(View view) {
        if (view != null) {
            view.setTag(C27650R.id.sensors_analytics_tag_view_ignored, "1");
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isActivityAutoTrackAppClickIgnored(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        List<Integer> list = this.mAutoTrackIgnoredActivities;
        return ((list == null || !list.contains(Integer.valueOf(cls.hashCode()))) && cls.getAnnotation(SensorsDataIgnoreTrackAppViewScreenAndAppClick.class) == null && cls.getAnnotation(SensorsDataIgnoreTrackAppClick.class) == null) ? false : true;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isActivityAutoTrackAppViewScreenIgnored(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        List<Integer> list = this.mAutoTrackIgnoredActivities;
        return ((list == null || !list.contains(Integer.valueOf(cls.hashCode()))) && cls.getAnnotation(SensorsDataIgnoreTrackAppViewScreenAndAppClick.class) == null && cls.getAnnotation(SensorsDataIgnoreTrackAppViewScreen.class) == null) ? false : true;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isAutoTrackEventTypeIgnored(AutoTrackEventType autoTrackEventType) {
        if (autoTrackEventType == null) {
            return false;
        }
        return isAutoTrackEventTypeIgnored(autoTrackEventType.eventValue);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isHeatMapActivity(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        try {
            return this.mHeatMapActivities.size() == 0 || this.mHeatMapActivities.contains(Integer.valueOf(cls.hashCode()));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isVisualizedAutoTrackActivity(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        try {
            return this.mVisualizedAutoTrackActivities.size() == 0 || this.mVisualizedAutoTrackActivities.contains(Integer.valueOf(cls.hashCode()));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void login(String str) {
        login(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void logout() {
        try {
            this.mLoginId = null;
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.7
                /* JADX WARN: Code duplicated, block: B:20:0x0048 A[Catch: all -> 0x003c, Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:18:0x0042, B:20:0x0048, B:21:0x004c, B:23:0x0052), top: B:35:0x0042, outer: #3 }] */
                /* JADX WARN: Code duplicated, block: B:23:0x0052 A[Catch: all -> 0x003c, Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:18:0x0042, B:20:0x0048, B:21:0x004c, B:23:0x0052), top: B:35:0x0042, outer: #3 }] */
                @Override // java.lang.Runnable
                public void run() {
                    List<SAFunctionListener> list;
                    Iterator<SAFunctionListener> it;
                    try {
                        synchronized (SensorsDataAPI.this.mLoginIdLock) {
                            SALog.m68589i("SA.SensorsDataAPI", "logout is called");
                            if (!TextUtils.isEmpty(DbAdapter.getInstance().getLoginId())) {
                                DbAdapter.getInstance().commitLoginId(null);
                                try {
                                    List<SAEventListener> list2 = SensorsDataAPI.this.mEventListenerList;
                                    if (list2 != null) {
                                        Iterator<SAEventListener> it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().logout();
                                        }
                                        try {
                                            list = SensorsDataAPI.this.mFunctionListenerList;
                                            if (list != null) {
                                                it = list.iterator();
                                                while (it.hasNext()) {
                                                    it.next().call("logout", null);
                                                }
                                            }
                                        } catch (Exception e11) {
                                            SALog.printStackTrace(e11);
                                        }
                                        SALog.m68589i("SA.SensorsDataAPI", "Clean loginId");
                                    } else {
                                        list = SensorsDataAPI.this.mFunctionListenerList;
                                        if (list != null) {
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                                it.next().call("logout", null);
                                            }
                                        }
                                        SALog.m68589i("SA.SensorsDataAPI", "Clean loginId");
                                    }
                                } catch (Exception e12) {
                                    SALog.printStackTrace(e12);
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e13) {
                        SALog.printStackTrace(e13);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileAppend(final String str, final String str2) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, jSONArray);
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_APPEND, null, jSONObject, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileIncrement(final Map<String, ? extends Number> map) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.31
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_INCREMENT, null, new JSONObject(map), null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSet(final JSONObject jSONObject) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.27
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET, null, jSONObject, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSetOnce(final JSONObject jSONObject) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.29
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET_ONCE, null, jSONObject, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setGPSLocation(double d11, double d12) {
        setGPSLocation(d11, d12, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setServerUrl(String str) {
        setServerUrl(str, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setViewID(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        view.setTag(C27650R.id.sensors_analytics_tag_view_id, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void showUpWebView(WebView webView, JSONObject jSONObject, boolean z11, boolean z12) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void showUpX5WebView(Object obj, JSONObject jSONObject, boolean z11, boolean z12) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void track(final String str, final JSONObject jSONObject) {
        try {
            final JSONObject dynamicProperty = getDynamicProperty();
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.13
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObjectCheckOrSetChannelCallbackEvent = ChannelUtils.checkOrSetChannelCallbackEvent(AbstractSensorsDataAPI.getConfigOptions().isAutoAddChannelCallbackEvent, str, jSONObject, SensorsDataAPI.this.mContext);
                    SensorsDataAPI sensorsDataAPI = SensorsDataAPI.this;
                    sensorsDataAPI.trackEvent(EventType.TRACK, str, jSONObjectCheckOrSetChannelCallbackEvent, dynamicProperty, sensorsDataAPI.getDistinctId(), SensorsDataAPI.this.getLoginId(), null);
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackAppInstall(JSONObject jSONObject, boolean z11) {
        trackInstallation("$AppInstall", jSONObject, z11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackChannelEvent(String str) {
        trackChannelEvent(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackDeepLinkLaunch(String str) {
        trackDeepLinkLaunch(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackEventFromH5(String str, boolean z11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z11) {
                String strOptString = jSONObject.optString("server_url");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                if (!new ServerUrl(strOptString).check(new ServerUrl(this.mServerUrl))) {
                    return;
                }
            }
            trackEventFromH5(str);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackInstallation(final String str, JSONObject jSONObject, final boolean z11) {
        Exception exc;
        try {
            final JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                try {
                    SensorsDataUtils.mergeJSONObject(jSONObject, jSONObject2);
                } catch (Exception e11) {
                    exc = e11;
                    SALog.printStackTrace(exc);
                }
            }
            addTimeProperty(jSONObject2);
            final String loginId = getLoginId();
            final String distinctId = getDistinctId();
            try {
                transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.10
                    @Override // java.lang.Runnable
                    public void run() {
                        String oaid;
                        String deviceInfo;
                        if (AbstractSensorsDataAPI.mIsMainProcess) {
                            try {
                                if (z11 ? SensorsDataAPI.this.mFirstTrackInstallationWithCallback.get().booleanValue() : SensorsDataAPI.this.mFirstTrackInstallation.get().booleanValue()) {
                                    boolean zIsGetDeviceInfo = false;
                                    try {
                                        if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                                            ChannelUtils.mergeUtmByMetaData(SensorsDataAPI.this.mContext, jSONObject2);
                                        }
                                        if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                                            String androidId = SensorsDataAPI.this.mSAContextManager.getAndroidId();
                                            if (jSONObject2.has("$oaid")) {
                                                oaid = jSONObject2.optString("$oaid");
                                                deviceInfo = ChannelUtils.getDeviceInfo(SensorsDataAPI.this.mContext, androidId, oaid);
                                                SALog.m68589i("SA.SensorsDataAPI", "properties has oaid " + oaid);
                                            } else {
                                                oaid = OaidHelper.getOAID(SensorsDataAPI.this.mContext);
                                                deviceInfo = ChannelUtils.getDeviceInfo(SensorsDataAPI.this.mContext, androidId, oaid);
                                            }
                                            if (jSONObject2.has("$gaid")) {
                                                deviceInfo = String.format("%s##gaid=%s", deviceInfo, jSONObject2.optString("$gaid"));
                                            }
                                            zIsGetDeviceInfo = ChannelUtils.isGetDeviceInfo(SensorsDataAPI.this.mContext, androidId, oaid);
                                            jSONObject2.put("$ios_install_source", deviceInfo);
                                        }
                                        if (jSONObject2.has("$oaid")) {
                                            jSONObject2.remove("$oaid");
                                        }
                                        if (jSONObject2.has("$gaid")) {
                                            jSONObject2.remove("$gaid");
                                        }
                                        boolean z12 = z11;
                                        if (z12) {
                                            jSONObject2.put("$ios_install_disable_callback", z12);
                                        }
                                    } catch (Exception e12) {
                                        SALog.printStackTrace(e12);
                                    }
                                    SensorsDataAPI.this.trackEvent(EventType.TRACK, str, jSONObject2, null, distinctId, loginId, null);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject2.remove("$ios_install_disable_callback");
                                    SensorsDataUtils.mergeJSONObject(jSONObject2, jSONObject3);
                                    jSONObject3.put("$first_visit_time", new Date());
                                    if (AbstractSensorsDataAPI.mSAConfigOptions.mEnableMultipleChannelMatch) {
                                        SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET, null, jSONObject3, null, distinctId, loginId, null);
                                    } else {
                                        SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET_ONCE, null, jSONObject3, null, distinctId, loginId, null);
                                    }
                                    if (z11) {
                                        SensorsDataAPI.this.mFirstTrackInstallationWithCallback.commit(Boolean.FALSE);
                                    } else {
                                        SensorsDataAPI.this.mFirstTrackInstallation.commit(Boolean.FALSE);
                                    }
                                    ChannelUtils.saveCorrectTrackInstallation(SensorsDataAPI.this.mContext, zIsGetDeviceInfo);
                                }
                                SensorsDataAPI.this.flush();
                            } catch (Exception e13) {
                                SALog.printStackTrace(e13);
                            }
                        }
                    }
                });
            } catch (Exception e12) {
                e = e12;
                exc = e;
                SALog.printStackTrace(exc);
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void trackInternal(String str, JSONObject jSONObject) {
        super.trackInternal(str, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackSignUp(final String str, final JSONObject jSONObject) {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String anonymousId = SensorsDataAPI.this.getAnonymousId();
                        synchronized (SensorsDataAPI.this.mDistinctId) {
                            SensorsDataAPI.this.mDistinctId.commit(str);
                        }
                        SensorsDataAPI.this.trackEvent(EventType.TRACK_SIGNUP, "$SignUp", jSONObject, anonymousId);
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackTimer(String str) {
        trackTimer(str, TimeUnit.MILLISECONDS);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackTimerBegin(String str) {
        trackTimer(str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerEnd(final String str, final JSONObject jSONObject) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.16
            @Override // java.lang.Runnable
            public void run() {
                if (str != null) {
                    synchronized (SensorsDataAPI.this.mTrackTimer) {
                        try {
                            EventTimer eventTimer = SensorsDataAPI.this.mTrackTimer.get(str);
                            if (eventTimer != null) {
                                eventTimer.setEndTime(jElapsedRealtime);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                try {
                    SensorsDataAPI.this.trackEvent(EventType.TRACK, str, ChannelUtils.checkOrSetChannelCallbackEvent(AbstractSensorsDataAPI.getConfigOptions().isAutoAddChannelCallbackEvent, str, jSONObject, SensorsDataAPI.this.mContext), null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerPause(String str) {
        trackTimerState(str, true);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerResume(String str) {
        trackTimerState(str, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackViewAppClick(View view) {
        trackViewAppClick(view, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackViewScreen(final String str, final JSONObject jSONObject) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.18
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(str) && jSONObject == null) {
                        return;
                    }
                    String strOptString = str;
                    JSONObject jSONObject2 = new JSONObject();
                    SensorsDataAPI sensorsDataAPI = SensorsDataAPI.this;
                    sensorsDataAPI.mLastScreenTrackProperties = jSONObject;
                    String str2 = sensorsDataAPI.mLastScreenUrl;
                    if (str2 != null) {
                        jSONObject2.put("$referrer", str2);
                    }
                    SensorsDataAPI sensorsDataAPI2 = SensorsDataAPI.this;
                    sensorsDataAPI2.mReferrerScreenTitle = sensorsDataAPI2.mCurrentScreenTitle;
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        if (jSONObject3.has(AopConstants.TITLE)) {
                            SensorsDataAPI.this.mCurrentScreenTitle = jSONObject.getString(AopConstants.TITLE);
                        } else {
                            SensorsDataAPI.this.mCurrentScreenTitle = null;
                        }
                        if (jSONObject.has("$url")) {
                            strOptString = jSONObject.optString("$url");
                        }
                    }
                    jSONObject2.put("$url", strOptString);
                    SensorsDataAPI.this.mLastScreenUrl = strOptString;
                    JSONObject jSONObject4 = jSONObject;
                    if (jSONObject4 != null) {
                        SensorsDataUtils.mergeJSONObject(jSONObject4, jSONObject2);
                    }
                    SensorsDataAPI.this.trackEvent(EventType.TRACK, "$AppViewScreen", jSONObject2, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    public SensorsDataAPI(Context context, SAConfigOptions sAConfigOptions, DebugMode debugMode) {
        super(context, sAConfigOptions, debugMode);
    }

    public static void disableSDK() {
        SALog.m68589i("SA.SensorsDataAPI", "call static function disableSDK");
        try {
            final SensorsDataAPI sensorsDataAPISharedInstance = sharedInstance();
            if (!(sensorsDataAPISharedInstance instanceof SensorsDataAPIEmptyImplementation) && AbstractSensorsDataAPI.getConfigOptions() != null && !AbstractSensorsDataAPI.getConfigOptions().isDisableSDK) {
                final boolean z11 = !SensorsDataContentObserver.isDisableFromObserver;
                sensorsDataAPISharedInstance.transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (z11) {
                            sensorsDataAPISharedInstance.trackInternal("$AppDataTrackingClose", null);
                        }
                    }
                });
                if (sensorsDataAPISharedInstance.isNetworkRequestEnable()) {
                    sensorsDataAPISharedInstance.enableNetworkRequest(false);
                    AbstractSensorsDataAPI.isChangeEnableNetworkFlag = true;
                } else {
                    AbstractSensorsDataAPI.isChangeEnableNetworkFlag = false;
                }
                sensorsDataAPISharedInstance.unregisterNetworkListener();
                sensorsDataAPISharedInstance.clearTrackTimer();
                DbAdapter.getInstance().commitAppStartTime(0L);
                AbstractSensorsDataAPI.getConfigOptions().disableSDK(true);
                SALog.setDisableSDK(true);
                if (!SensorsDataContentObserver.isDisableFromObserver) {
                    sensorsDataAPISharedInstance.getContext().getContentResolver().notifyChange(DbParams.getInstance().getDisableSDKUri(), null);
                }
                SensorsDataContentObserver.isDisableFromObserver = false;
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void enableSDK() {
        SALog.m68589i("SA.SensorsDataAPI", "call static function enableSDK");
        try {
            SensorsDataAPI sDKInstance = getSDKInstance();
            if (!(sDKInstance instanceof SensorsDataAPIEmptyImplementation) && AbstractSensorsDataAPI.getConfigOptions() != null && AbstractSensorsDataAPI.getConfigOptions().isDisableSDK) {
                AbstractSensorsDataAPI.getConfigOptions().disableSDK(false);
                try {
                    SALog.setDisableSDK(false);
                    sDKInstance.enableLog(SALog.isLogEnabled());
                    SALog.m68589i("SA.SensorsDataAPI", "enableSDK, enable log");
                    if (sDKInstance.mFirstDay.get() == null) {
                        sDKInstance.mFirstDay.commit(TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd"));
                    }
                    sDKInstance.delayInitTask();
                    if (AbstractSensorsDataAPI.isChangeEnableNetworkFlag) {
                        sDKInstance.enableNetworkRequest(true);
                        AbstractSensorsDataAPI.isChangeEnableNetworkFlag = false;
                    }
                    if (sDKInstance.isVisualizedAutoTrackEnabled()) {
                        VisualPropertiesManager.getInstance().requestVisualConfig(sharedInstance().getContext());
                    }
                    sDKInstance.getRemoteManager().pullSDKConfigFromServer();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
                if (!SensorsDataContentObserver.isEnableFromObserver) {
                    sDKInstance.getContext().getContentResolver().notifyChange(DbParams.getInstance().getEnableSDKUri(), null);
                }
                SensorsDataContentObserver.isEnableFromObserver = false;
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    private static SensorsDataAPI getInstance(Context context, DebugMode debugMode, SAConfigOptions sAConfigOptions) {
        SensorsDataAPI sensorsDataAPI;
        if (context == null) {
            return new SensorsDataAPIEmptyImplementation();
        }
        Map<Context, SensorsDataAPI> map = AbstractSensorsDataAPI.sInstanceMap;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                sensorsDataAPI = map.get(applicationContext);
                if (sensorsDataAPI == null) {
                    sensorsDataAPI = new SensorsDataAPI(applicationContext, sAConfigOptions, debugMode);
                    map.put(applicationContext, sensorsDataAPI);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sensorsDataAPI;
    }

    private static SensorsDataAPI getSDKInstance() {
        Map<Context, SensorsDataAPI> map = AbstractSensorsDataAPI.sInstanceMap;
        synchronized (map) {
            try {
                if (map.size() > 0) {
                    Iterator<SensorsDataAPI> it = map.values().iterator();
                    if (it.hasNext()) {
                        return it.next();
                    }
                }
                return new SensorsDataAPIEmptyImplementation();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void startWithConfigOptions(Context context, SAConfigOptions sAConfigOptions) {
        if (context == null || sAConfigOptions == null) {
            throw new NullPointerException("Context、SAConfigOptions 不可以为 null");
        }
        SensorsDataAPI sensorsDataAPI = getInstance(context, DebugMode.DEBUG_OFF, sAConfigOptions);
        if (sensorsDataAPI.mSDKConfigInit) {
            return;
        }
        sensorsDataAPI.applySAConfigOptions();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addHeatMapActivities(List<Class<?>> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                for (Class<?> cls : list) {
                    if (cls != null) {
                        int iHashCode = cls.hashCode();
                        if (this.mHeatMapActivities.contains(Integer.valueOf(iHashCode))) {
                            continue;
                        } else {
                            this.mHeatMapActivities.add(Integer.valueOf(iHashCode));
                        }
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addHeatMapActivity(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            this.mHeatMapActivities.add(Integer.valueOf(cls.hashCode()));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addVisualizedAutoTrackActivities(List<Class<?>> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                for (Class<?> cls : list) {
                    if (cls != null) {
                        int iHashCode = cls.hashCode();
                        if (this.mVisualizedAutoTrackActivities.contains(Integer.valueOf(iHashCode))) {
                            continue;
                        } else {
                            this.mVisualizedAutoTrackActivities.add(Integer.valueOf(iHashCode));
                        }
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addVisualizedAutoTrackActivity(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            this.mVisualizedAutoTrackActivities.add(Integer.valueOf(cls.hashCode()));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearGPSLocation() {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.3
                @Override // java.lang.Runnable
                public void run() {
                    AbstractSensorsDataAPI.mGPSLocation = null;
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearLastScreenUrl() {
        if (this.mClearReferrerWhenAppEnd) {
            this.mLastScreenUrl = null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearSuperProperties() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.26
            @Override // java.lang.Runnable
            public void run() {
                synchronized (SensorsDataAPI.this.mSuperProperties) {
                    SensorsDataAPI.this.mSuperProperties.commit(new JSONObject());
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearTrackTimer() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.17
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (SensorsDataAPI.this.mTrackTimer) {
                        SensorsDataAPI.this.mTrackTimer.clear();
                    }
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void deleteAll() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.23
            @Override // java.lang.Runnable
            public void run() {
                SensorsDataAPI.this.mMessages.deleteAll();
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void disableAutoTrack(AutoTrackEventType autoTrackEventType) {
        ignoreAutoTrackEventType(autoTrackEventType);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableAppHeatMapConfirmDialog(boolean z11) {
        AbstractSensorsDataAPI.mSAConfigOptions.enableHeatMapConfirmDialog(z11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void enableAutoTrackFragment(Class<?> cls) {
        this.mFragmentAPI.enableAutoTrackFragment(cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void enableAutoTrackFragments(List<Class<?>> list) {
        this.mFragmentAPI.enableAutoTrackFragments(list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableDataCollect() {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.22
                @Override // java.lang.Runnable
                public void run() {
                    if (!AbstractSensorsDataAPI.mSAConfigOptions.isDataCollectEnable) {
                        SensorsDataAPI.this.mContext.getContentResolver().notifyChange(DbParams.getInstance().getDataCollectUri(), null);
                    }
                    AbstractSensorsDataAPI.mSAConfigOptions.isDataCollectEnable = true;
                    AbstractSensorsDataAPI.mIsMainProcess = AppInfoUtils.isMainProcess(SensorsDataAPI.this.mContext, null);
                    SensorsDataAPI.this.mSAContextManager.getDeviceInfo();
                    SensorsDataAPI.this.mTrackTaskManager.setDataCollectEnable(true);
                    if (SensorsDataAPI.this.mFirstDay.get() == null) {
                        SensorsDataAPI.this.mFirstDay.commit(TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd"));
                    }
                    try {
                        List<SAFunctionListener> list = SensorsDataAPI.this.mFunctionListenerList;
                        if (list != null) {
                            Iterator<SAFunctionListener> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().call("enableDataCollect", null);
                            }
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            });
            flush();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableDeepLinkInstallSource(boolean z11) {
        this.mEnableDeepLinkInstallSource = z11;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableHeatMap() {
        AbstractSensorsDataAPI.mSAConfigOptions.enableHeatMap(true);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableNetworkRequest(boolean z11) {
        this.mEnableNetworkRequest = z11;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableReactNativeAutoTrack() {
        AbstractSensorsDataAPI.mSAConfigOptions.enableReactNativeAutoTrack(true);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableTrackScreenOrientation(boolean z11) {
        try {
            if (z11) {
                if (this.mOrientationDetector == null) {
                    this.mOrientationDetector = new SensorsDataScreenOrientationDetector(this.mContext, 3);
                }
                this.mOrientationDetector.enable();
            } else {
                SensorsDataScreenOrientationDetector sensorsDataScreenOrientationDetector = this.mOrientationDetector;
                if (sensorsDataScreenOrientationDetector != null) {
                    sensorsDataScreenOrientationDetector.disable();
                    this.mOrientationDetector = null;
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableVisualizedAutoTrack() {
        AbstractSensorsDataAPI.mSAConfigOptions.enableVisualizedAutoTrack(true);
        VisualPropertiesManager.getInstance().requestVisualConfig();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableVisualizedAutoTrackConfirmDialog(boolean z11) {
        AbstractSensorsDataAPI.mSAConfigOptions.enableVisualizedAutoTrackConfirmDialog(z11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void flush() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.21
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mMessages.flush();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void flushScheduled() {
        try {
            this.mMessages.flushScheduled();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getAnonymousId() {
        try {
            synchronized (this.mDistinctId) {
                try {
                    if (!AbstractSensorsDataAPI.mSAConfigOptions.isDataCollectEnable) {
                        return "";
                    }
                    return this.mDistinctId.get();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getCookie(boolean z11) {
        try {
            return z11 ? URLDecoder.decode(this.mCookie, "UTF-8") : this.mCookie;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public int getFlushBulkSize() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mFlushBulkSize;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public int getFlushInterval() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mFlushInterval;
    }

    public int getFlushNetworkPolicy() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mNetworkTypePolicy;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public List<Class> getIgnoredViewTypeList() {
        if (this.mIgnoredViewTypeList == null) {
            this.mIgnoredViewTypeList = new ArrayList();
        }
        return this.mIgnoredViewTypeList;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public JSONObject getLastScreenTrackProperties() {
        return this.mLastScreenTrackProperties;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getLastScreenUrl() {
        return this.mLastScreenUrl;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public long getMaxCacheSize() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mMaxCacheSize;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public JSONObject getPresetProperties() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = this.mSAContextManager.getPresetProperties();
            jSONObject.put("$is_first_day", isFirstDay(System.currentTimeMillis()));
            return jSONObject;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return jSONObject;
        }
    }

    public String getSDKVersion() {
        return "5.4.4";
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getScreenOrientation() {
        try {
            SensorsDataScreenOrientationDetector sensorsDataScreenOrientationDetector = this.mOrientationDetector;
            if (sensorsDataScreenOrientationDetector != null) {
                return sensorsDataScreenOrientationDetector.getOrientation();
            }
            return null;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getServerUrl() {
        return this.mServerUrl;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public int getSessionIntervalTime() {
        return this.mSessionTime;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public JSONObject getSuperProperties() {
        JSONObject jSONObject;
        synchronized (this.mSuperProperties) {
            try {
                try {
                    jSONObject = new JSONObject(this.mSuperProperties.get().toString());
                } catch (JSONException e11) {
                    SALog.printStackTrace(e11);
                    return new JSONObject();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObject;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void ignoreAutoTrackActivities(List<Class<?>> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.mAutoTrackIgnoredActivities == null) {
            this.mAutoTrackIgnoredActivities = new ArrayList();
        }
        for (Class<?> cls : list) {
            if (cls != null) {
                int iHashCode = cls.hashCode();
                if (!this.mAutoTrackIgnoredActivities.contains(Integer.valueOf(iHashCode))) {
                    this.mAutoTrackIgnoredActivities.add(Integer.valueOf(iHashCode));
                }
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void ignoreAutoTrackActivity(Class<?> cls) {
        if (cls == null) {
            return;
        }
        if (this.mAutoTrackIgnoredActivities == null) {
            this.mAutoTrackIgnoredActivities = new ArrayList();
        }
        try {
            int iHashCode = cls.hashCode();
            if (this.mAutoTrackIgnoredActivities.contains(Integer.valueOf(iHashCode))) {
                return;
            }
            this.mAutoTrackIgnoredActivities.add(Integer.valueOf(iHashCode));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void ignoreAutoTrackFragment(Class<?> cls) {
        this.mFragmentAPI.ignoreAutoTrackFragment(cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void ignoreAutoTrackFragments(List<Class<?>> list) {
        this.mFragmentAPI.ignoreAutoTrackFragments(list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void ignoreView(View view, boolean z11) {
        if (view != null) {
            view.setTag(C27650R.id.sensors_analytics_tag_view_ignored, z11 ? "1" : "0");
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void ignoreViewType(Class cls) {
        if (cls == null) {
            return;
        }
        if (this.mIgnoredViewTypeList == null) {
            this.mIgnoredViewTypeList = new ArrayList();
        }
        if (this.mIgnoredViewTypeList.contains(cls)) {
            return;
        }
        this.mIgnoredViewTypeList.add(cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isAutoTrackEventTypeIgnored(int i11) {
        Boolean boolIsAutoTrackEventTypeIgnored;
        BaseSensorsDataSDKRemoteManager baseSensorsDataSDKRemoteManager = this.mRemoteManager;
        if (baseSensorsDataSDKRemoteManager == null || (boolIsAutoTrackEventTypeIgnored = baseSensorsDataSDKRemoteManager.isAutoTrackEventTypeIgnored(i11)) == null) {
            int i12 = AbstractSensorsDataAPI.mSAConfigOptions.mAutoTrackEventType;
            return (i11 | i12) != i12;
        }
        if (boolIsAutoTrackEventTypeIgnored.booleanValue()) {
            SALog.m68589i("SA.SensorsDataAPI", "remote config: " + AutoTrackEventType.autoTrackEventName(i11) + " is ignored by remote config");
        }
        return boolIsAutoTrackEventTypeIgnored.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isDebugMode() {
        return this.mDebugMode.isDebugMode();
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public boolean isFragmentAutoTrackAppViewScreen(Class<?> cls) {
        return this.mFragmentAPI.isFragmentAutoTrackAppViewScreen(cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isHeatMapEnabled() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mHeatMapEnabled;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isNetworkRequestEnable() {
        return this.mEnableNetworkRequest;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isReactNativeAutoTrackEnabled() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mRNAutoTrackEnabled;
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public boolean isTrackFragmentAppViewScreenEnabled() {
        return this.mFragmentAPI.isTrackFragmentAppViewScreenEnabled();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isVisualizedAutoTrackEnabled() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mVisualizedEnabled;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void itemDelete(final String str, final String str2) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.42
            @Override // java.lang.Runnable
            public void run() {
                SensorsDataAPI.this.trackItemEvent(str, str2, EventType.ITEM_DELETE.getEventType(), System.currentTimeMillis(), null);
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void itemSet(final String str, final String str2, final JSONObject jSONObject) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.41
            @Override // java.lang.Runnable
            public void run() {
                SensorsDataAPI.this.trackItemEvent(str, str2, EventType.ITEM_SET.getEventType(), System.currentTimeMillis(), jSONObject);
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void login(final String str, final JSONObject jSONObject) {
        try {
            SADataHelper.assertValue(str);
            synchronized (this.mLoginIdLock) {
                try {
                    if (!str.equals(getAnonymousId())) {
                        this.mLoginId = str;
                        if (SensorsDataContentObserver.isLoginFromObserver) {
                            SensorsDataContentObserver.isLoginFromObserver = false;
                            return;
                        }
                        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.6
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    if (str.equals(DbAdapter.getInstance().getLoginId())) {
                                        return;
                                    }
                                    DbAdapter.getInstance().commitLoginId(str);
                                    SensorsDataAPI sensorsDataAPI = SensorsDataAPI.this;
                                    sensorsDataAPI.trackEvent(EventType.TRACK_SIGNUP, "$SignUp", jSONObject, sensorsDataAPI.getAnonymousId());
                                    try {
                                        List<SAEventListener> list = SensorsDataAPI.this.mEventListenerList;
                                        if (list != null) {
                                            Iterator<SAEventListener> it = list.iterator();
                                            while (it.hasNext()) {
                                                it.next().login();
                                            }
                                        }
                                    } catch (Exception e11) {
                                        SALog.printStackTrace(e11);
                                    }
                                    try {
                                        if (SensorsDataAPI.this.mFunctionListenerList != null) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("distinctId", str);
                                            Iterator<SAFunctionListener> it2 = SensorsDataAPI.this.mFunctionListenerList.iterator();
                                            while (it2.hasNext()) {
                                                it2.next().call(FirebaseAnalytics.Event.LOGIN, jSONObject2);
                                            }
                                        }
                                    } catch (Exception e12) {
                                        SALog.printStackTrace(e12);
                                    }
                                } catch (Exception e13) {
                                    SALog.printStackTrace(e13);
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileAppend(final String str, final Set<String> set) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.34
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, jSONArray);
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_APPEND, null, jSONObject, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileDelete() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.36
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_DELETE, null, null, null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileIncrement(final String str, final Number number) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.32
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_INCREMENT, null, new JSONObject().put(str, number), null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profilePushId(final String str, final String str2) {
        transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.39
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertKey(str);
                    if (TextUtils.isEmpty(str2)) {
                        SALog.m68587d("SA.SensorsDataAPI", "pushId is empty");
                        return;
                    }
                    String str3 = SensorsDataAPI.this.getDistinctId() + str2;
                    SharedPreferences sharedPreferences = SensorsDataUtils.getSharedPreferences(SensorsDataAPI.this.mContext);
                    if (sharedPreferences.getString("distinctId_" + str, "").equals(str3)) {
                        return;
                    }
                    SensorsDataAPI.this.profileSet(str, str2);
                    sharedPreferences.edit().putString("distinctId_" + str, str3).apply();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSet(final String str, final Object obj) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.28
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET, null, new JSONObject().put(str, obj), null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSetOnce(final String str, final Object obj) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.30
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET_ONCE, null, new JSONObject().put(str, obj), null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileUnset(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.35
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.trackEvent(EventType.PROFILE_UNSET, null, new JSONObject().put(str, true), null);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileUnsetPushId(final String str) {
        transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.40
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertKey(str);
                    String distinctId = SensorsDataAPI.this.getDistinctId();
                    SharedPreferences sharedPreferences = SensorsDataUtils.getSharedPreferences(SensorsDataAPI.this.mContext);
                    String str2 = "distinctId_" + str;
                    if (sharedPreferences.getString(str2, "").startsWith(distinctId)) {
                        SensorsDataAPI.this.profileUnset(str);
                        sharedPreferences.edit().remove(str2).apply();
                    }
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void registerDynamicSuperProperties(SensorsDataDynamicSuperProperties sensorsDataDynamicSuperProperties) {
        this.mDynamicSuperPropertiesCallBack = sensorsDataDynamicSuperProperties;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void registerSuperProperties(final JSONObject jSONObject) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.24
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 == null) {
                        return;
                    }
                    SADataHelper.assertPropertyTypes(jSONObject2);
                    synchronized (SensorsDataAPI.this.mSuperProperties) {
                        try {
                            SensorsDataAPI.this.mSuperProperties.commit(SensorsDataUtils.mergeSuperJSONObject(jSONObject, SensorsDataAPI.this.mSuperProperties.get()));
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

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void removeTimer(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertKey(str);
                    synchronized (SensorsDataAPI.this.mTrackTimer) {
                        SensorsDataAPI.this.mTrackTimer.remove(str);
                    }
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void resetAnonymousId() {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (SensorsDataAPI.this.mDistinctId) {
                        try {
                            SALog.m68589i("SA.SensorsDataAPI", "resetAnonymousId is called");
                            String androidId = SensorsDataAPI.this.mSAContextManager.getAndroidId();
                            if (TextUtils.equals(androidId, SensorsDataAPI.this.mDistinctId.get())) {
                                SALog.m68589i("SA.SensorsDataAPI", "DistinctId not change");
                                return;
                            }
                            if (!SensorsDataUtils.isValidAndroidId(androidId)) {
                                androidId = UUID.randomUUID().toString();
                            }
                            SensorsDataAPI.this.mDistinctId.commit(androidId);
                            try {
                                List<SAEventListener> list = SensorsDataAPI.this.mEventListenerList;
                                if (list != null) {
                                    Iterator<SAEventListener> it = list.iterator();
                                    while (it.hasNext()) {
                                        it.next().resetAnonymousId();
                                    }
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                            try {
                                if (SensorsDataAPI.this.mFunctionListenerList != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("distinctId", androidId);
                                    Iterator<SAFunctionListener> it2 = SensorsDataAPI.this.mFunctionListenerList.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().call("resetAnonymousId", jSONObject);
                                    }
                                }
                            } catch (Exception e12) {
                                SALog.printStackTrace(e12);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void resumeAutoTrackActivities(List<Class<?>> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.mAutoTrackIgnoredActivities == null) {
            this.mAutoTrackIgnoredActivities = new ArrayList();
        }
        try {
            for (Class<?> cls : list) {
                if (cls != null) {
                    int iHashCode = cls.hashCode();
                    if (this.mAutoTrackIgnoredActivities.contains(Integer.valueOf(iHashCode))) {
                        this.mAutoTrackIgnoredActivities.remove(Integer.valueOf(iHashCode));
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void resumeAutoTrackActivity(Class<?> cls) {
        if (cls == null) {
            return;
        }
        if (this.mAutoTrackIgnoredActivities == null) {
            this.mAutoTrackIgnoredActivities = new ArrayList();
        }
        try {
            int iHashCode = cls.hashCode();
            if (this.mAutoTrackIgnoredActivities.contains(Integer.valueOf(iHashCode))) {
                this.mAutoTrackIgnoredActivities.remove(Integer.valueOf(iHashCode));
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void resumeIgnoredAutoTrackFragment(Class<?> cls) {
        this.mFragmentAPI.resumeIgnoredAutoTrackFragment(cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void resumeIgnoredAutoTrackFragments(List<Class<?>> list) {
        this.mFragmentAPI.resumeIgnoredAutoTrackFragments(list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void resumeTrackScreenOrientation() {
        try {
            SensorsDataScreenOrientationDetector sensorsDataScreenOrientationDetector = this.mOrientationDetector;
            if (sensorsDataScreenOrientationDetector != null) {
                sensorsDataScreenOrientationDetector.enable();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setCookie(String str, boolean z11) {
        try {
            if (z11) {
                this.mCookie = URLEncoder.encode(str, "UTF-8");
            } else {
                this.mCookie = str;
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setDeepLinkCallback(SensorsDataDeepLinkCallback sensorsDataDeepLinkCallback) {
        this.mDeepLinkCallback = sensorsDataDeepLinkCallback;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setFlushBulkSize(int i11) {
        if (i11 < 0) {
            SALog.m68589i("SA.SensorsDataAPI", "The value of flushBulkSize is invalid");
        }
        AbstractSensorsDataAPI.mSAConfigOptions.setFlushBulkSize(i11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setFlushInterval(int i11) {
        AbstractSensorsDataAPI.mSAConfigOptions.setFlushInterval(i11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setFlushNetworkPolicy(int i11) {
        AbstractSensorsDataAPI.mSAConfigOptions.setNetworkTypePolicy(i11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setGPSLocation(final double d11, final double d12, final String str) {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (AbstractSensorsDataAPI.mGPSLocation == null) {
                            AbstractSensorsDataAPI.mGPSLocation = new SensorsDataGPSLocation();
                        }
                        AbstractSensorsDataAPI.mGPSLocation.setLatitude((long) (d11 * Math.pow(10.0d, 6.0d)));
                        AbstractSensorsDataAPI.mGPSLocation.setLongitude((long) (d12 * Math.pow(10.0d, 6.0d)));
                        AbstractSensorsDataAPI.mGPSLocation.setCoordinate(SADataHelper.assertPropertyLength(str));
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setMaxCacheSize(long j11) {
        AbstractSensorsDataAPI.mSAConfigOptions.setMaxCacheSize(j11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setServerUrl(final String str, boolean z11) {
        int iLastIndexOf;
        if (z11) {
            try {
                BaseSensorsDataSDKRemoteManager baseSensorsDataSDKRemoteManager = this.mRemoteManager;
                if (baseSensorsDataSDKRemoteManager != null) {
                    try {
                        baseSensorsDataSDKRemoteManager.requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeWrite, false);
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            } catch (Exception e12) {
                SALog.printStackTrace(e12);
                return;
            }
        }
        if (!TextUtils.equals(str, this.mOriginServerUrl) && isVisualizedAutoTrackEnabled()) {
            try {
                VisualPropertiesManager.getInstance().requestVisualConfig();
            } catch (Exception e13) {
                SALog.printStackTrace(e13);
            }
        }
        this.mOriginServerUrl = str;
        if (TextUtils.isEmpty(str)) {
            this.mServerUrl = str;
            SALog.m68589i("SA.SensorsDataAPI", "Server url is null or empty.");
            return;
        }
        final Uri uri = Uri.parse(str);
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.37
            @Override // java.lang.Runnable
            public void run() {
                String host = uri.getHost();
                if (TextUtils.isEmpty(host) || !host.contains("_")) {
                    return;
                }
                SALog.m68589i("SA.SensorsDataAPI", "Server url " + str + " contains '_' is not recommend，see details: https://en.wikipedia.org/wiki/Hostname");
            }
        });
        if (this.mDebugMode == DebugMode.DEBUG_OFF) {
            this.mServerUrl = str;
            return;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path) || (iLastIndexOf = path.lastIndexOf(47)) == -1) {
            return;
        }
        this.mServerUrl = uri.buildUpon().path(path.substring(0, iLastIndexOf) + "/debug").build().toString();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setTrackEventCallBack(SensorsDataTrackEventCallBack sensorsDataTrackEventCallBack) {
        this.mTrackEventCallBack = sensorsDataTrackEventCallBack;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setViewActivity(View view, Activity activity) {
        if (view == null || activity == null) {
            return;
        }
        try {
            view.setTag(C27650R.id.sensors_analytics_tag_view_activity, activity);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setViewFragmentName(View view, String str) {
        if (view != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                view.setTag(C27650R.id.sensors_analytics_tag_view_fragment_name2, str);
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setViewProperties(View view, JSONObject jSONObject) {
        if (view == null || jSONObject == null) {
            return;
        }
        view.setTag(C27650R.id.sensors_analytics_tag_view_properties, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpWebView(WebView webView, boolean z11) {
        showUpWebView(webView, z11, (JSONObject) null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpX5WebView(Object obj, boolean z11) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void startTrackThread() {
        TrackTaskManagerThread trackTaskManagerThread = this.mTrackTaskManagerThread;
        if (trackTaskManagerThread == null || trackTaskManagerThread.isStopped()) {
            this.mTrackTaskManagerThread = new TrackTaskManagerThread();
            new Thread(this.mTrackTaskManagerThread).start();
            SALog.m68589i("SA.SensorsDataAPI", "Data collection thread has been started");
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void stopTrackScreenOrientation() {
        try {
            SensorsDataScreenOrientationDetector sensorsDataScreenOrientationDetector = this.mOrientationDetector;
            if (sensorsDataScreenOrientationDetector != null) {
                sensorsDataScreenOrientationDetector.disable();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void stopTrackThread() {
        TrackTaskManagerThread trackTaskManagerThread = this.mTrackTaskManagerThread;
        if (trackTaskManagerThread == null || trackTaskManagerThread.isStopped()) {
            return;
        }
        this.mTrackTaskManagerThread.stop();
        SALog.m68589i("SA.SensorsDataAPI", "Data collection thread has been stopped");
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackAppInstall(JSONObject jSONObject) {
        trackAppInstall(jSONObject, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public void trackChannelDebugInstallation() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    SensorsDataAPI sensorsDataAPI = SensorsDataAPI.this;
                    jSONObject.put("$ios_install_source", ChannelUtils.getDeviceInfo(sensorsDataAPI.mContext, sensorsDataAPI.mSAContextManager.getAndroidId(), OaidHelper.getOAID(SensorsDataAPI.this.mContext)));
                    SensorsDataAPI.this.trackEvent(EventType.TRACK, "$ChannelDebugInstall", jSONObject, null);
                    JSONObject jSONObject2 = new JSONObject();
                    SensorsDataUtils.mergeJSONObject(jSONObject, jSONObject2);
                    jSONObject2.put("$first_visit_time", new Date());
                    if (AbstractSensorsDataAPI.mSAConfigOptions.mEnableMultipleChannelMatch) {
                        SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET, null, jSONObject2, null);
                    } else {
                        SensorsDataAPI.this.trackEvent(EventType.PROFILE_SET_ONCE, null, jSONObject2, null);
                    }
                    SensorsDataAPI.this.flush();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackChannelEvent(final String str, JSONObject jSONObject) {
        if (AbstractSensorsDataAPI.getConfigOptions().isAutoAddChannelCallbackEvent) {
            track(str, jSONObject);
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            SensorsDataUtils.mergeJSONObject(jSONObject, jSONObject2);
        }
        addTimeProperty(jSONObject2);
        transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        jSONObject2.put("$is_channel_callback_event", ChannelUtils.isFirstChannelEvent(str));
                        if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                            ChannelUtils.mergeUtmByMetaData(SensorsDataAPI.this.mContext, jSONObject2);
                        }
                        if (!ChannelUtils.hasUtmProperties(jSONObject2)) {
                            if (jSONObject2.has("$oaid")) {
                                String strOptString = jSONObject2.optString("$oaid");
                                JSONObject jSONObject3 = jSONObject2;
                                SensorsDataAPI sensorsDataAPI = SensorsDataAPI.this;
                                jSONObject3.put("$channel_device_info", ChannelUtils.getDeviceInfo(sensorsDataAPI.mContext, sensorsDataAPI.mSAContextManager.getAndroidId(), strOptString));
                                SALog.m68589i("SA.SensorsDataAPI", "properties has oaid " + strOptString);
                            } else {
                                JSONObject jSONObject4 = jSONObject2;
                                SensorsDataAPI sensorsDataAPI2 = SensorsDataAPI.this;
                                jSONObject4.put("$channel_device_info", ChannelUtils.getDeviceInfo(sensorsDataAPI2.mContext, sensorsDataAPI2.mSAContextManager.getAndroidId(), OaidHelper.getOAID(SensorsDataAPI.this.mContext)));
                            }
                        }
                        if (jSONObject2.has("$oaid")) {
                            jSONObject2.remove("$oaid");
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                    SensorsDataAPI.this.trackEvent(EventType.TRACK, str, jSONObject2, null);
                } catch (Exception e12) {
                    SALog.printStackTrace(e12);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackDeepLinkLaunch(String str, final String str2) {
        final JSONObject jSONObject = new JSONObject();
        final boolean zIsDeepLinkInstallSource = isDeepLinkInstallSource();
        try {
            jSONObject.put("$deeplink_url", str);
            jSONObject.put("$time", new Date(System.currentTimeMillis()));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        sharedInstance().transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.43
            @Override // java.lang.Runnable
            public void run() {
                if (zIsDeepLinkInstallSource) {
                    try {
                        JSONObject jSONObject2 = jSONObject;
                        SensorsDataAPI sensorsDataAPI = SensorsDataAPI.this;
                        Context context = sensorsDataAPI.mContext;
                        String androidId = sensorsDataAPI.mSAContextManager.getAndroidId();
                        String oaid = str2;
                        if (oaid == null) {
                            oaid = OaidHelper.getOAID(SensorsDataAPI.this.mContext);
                        }
                        jSONObject2.put("$ios_install_source", ChannelUtils.getDeviceInfo(context, androidId, oaid));
                    } catch (JSONException e12) {
                        SALog.printStackTrace(e12);
                    }
                }
                SensorsDataAPI.this.trackInternal("$AppDeeplinkLaunch", jSONObject);
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.internal.api.IFragmentAPI
    public void trackFragmentAppViewScreen() {
        this.mFragmentAPI.trackFragmentAppViewScreen();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void trackInternal(String str, JSONObject jSONObject, ViewNode viewNode) {
        super.trackInternal(str, jSONObject, viewNode);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackTimer(final String str, final TimeUnit timeUnit) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertKey(str);
                    synchronized (SensorsDataAPI.this.mTrackTimer) {
                        SensorsDataAPI.this.mTrackTimer.put(str, new EventTimer(timeUnit, jElapsedRealtime));
                    }
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackTimerBegin(String str, TimeUnit timeUnit) {
        trackTimer(str, timeUnit);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String trackTimerStart(String str) {
        try {
            String str2 = String.format("%s_%s_%s", str, UUID.randomUUID().toString().replace(C33820nf.f71144W, "_"), "SATimer");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            trackTimerBegin(str2, timeUnit);
            trackTimerBegin(str, timeUnit);
            return str2;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackViewAppClick(View view, JSONObject jSONObject) {
        if (view == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (AopUtil.injectClickInfo(view, jSONObject, true)) {
            trackInternal(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, AopUtil.addViewPathProperties(AopUtil.getActivityFromContext(view.getContext(), view), view, jSONObject));
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackViewScreen(final Activity activity) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.19
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Activity activity2 = activity;
                    if (activity2 == null) {
                        return;
                    }
                    SensorsDataAPI.this.trackViewScreen(SensorsDataUtils.getScreenUrl(activity), AopUtil.buildTitleAndScreenName(activity2));
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void unregisterSuperProperty(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.25
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (SensorsDataAPI.this.mSuperProperties) {
                        JSONObject jSONObject = SensorsDataAPI.this.mSuperProperties.get();
                        jSONObject.remove(str);
                        SensorsDataAPI.this.mSuperProperties.commit(jSONObject);
                    }
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void addEventListener(SAEventListener sAEventListener) {
        super.addEventListener(sAEventListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void addFunctionListener(SAFunctionListener sAFunctionListener) {
        super.addFunctionListener(sAFunctionListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void addSAJSListener(SAJSListener sAJSListener) {
        super.addSAJSListener(sAJSListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void appBecomeActive() {
        super.appBecomeActive();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void appEnterBackground() {
        super.appEnterBackground();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableLog(boolean z11) {
        SALog.setEnableLog(z11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void flushSync() {
        flush();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ DebugMode getDebugMode() {
        return super.getDebugMode();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ SensorsDataDeepLinkCallback getDeepLinkCallback() {
        return super.getDeepLinkCallback();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getDistinctId() {
        try {
            String loginId = getLoginId();
            if (!TextUtils.isEmpty(loginId)) {
                return loginId;
            }
            return getAnonymousId();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getLoginId() {
        if (AppInfoUtils.isTaskExecuteThread()) {
            return DbAdapter.getInstance().getLoginId();
        }
        return this.mLoginId;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ BaseSensorsDataSDKRemoteManager getRemoteManager() {
        return super.getRemoteManager();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ SAContextManager getSAContextManager() {
        return super.getSAContextManager();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ SensorsDataEncrypt getSensorsDataEncrypt() {
        return super.getSensorsDataEncrypt();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void identify(final String str) {
        try {
            SADataHelper.assertValue(str);
            try {
                this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.5
                    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x003f, Exception -> 0x0071, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x002b, B:9:0x002f, B:11:0x0035, B:17:0x0045, B:19:0x004b, B:20:0x005f, B:22:0x0065, B:26:0x0075, B:25:0x0072, B:16:0x0042), top: B:36:0x0005, outer: #0, inners: #1, #2 }] */
                    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[Catch: all -> 0x003f, Exception -> 0x0071, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x002b, B:9:0x002f, B:11:0x0035, B:17:0x0045, B:19:0x004b, B:20:0x005f, B:22:0x0065, B:26:0x0075, B:25:0x0072, B:16:0x0042), top: B:36:0x0005, outer: #0, inners: #1, #2 }] */
                    /* JADX WARN: Code duplicated, block: B:34:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject;
                        Iterator<SAFunctionListener> it;
                        try {
                            synchronized (SensorsDataAPI.this.mDistinctId) {
                                try {
                                    SALog.m68589i("SA.SensorsDataAPI", "identify is called");
                                    if (!str.equals(SensorsDataAPI.this.mDistinctId.get())) {
                                        SensorsDataAPI.this.mDistinctId.commit(str);
                                        List<SAEventListener> list = SensorsDataAPI.this.mEventListenerList;
                                        if (list != null) {
                                            Iterator<SAEventListener> it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                it2.next().identify();
                                            }
                                            try {
                                                if (SensorsDataAPI.this.mFunctionListenerList != null) {
                                                    jSONObject = new JSONObject();
                                                    jSONObject.put("distinctId", str);
                                                    it = SensorsDataAPI.this.mFunctionListenerList.iterator();
                                                    while (it.hasNext()) {
                                                        it.next().call("identify", jSONObject);
                                                    }
                                                }
                                            } catch (Exception e11) {
                                                SALog.printStackTrace(e11);
                                            }
                                        } else if (SensorsDataAPI.this.mFunctionListenerList != null) {
                                            jSONObject = new JSONObject();
                                            jSONObject.put("distinctId", str);
                                            it = SensorsDataAPI.this.mFunctionListenerList.iterator();
                                            while (it.hasNext()) {
                                                it.next().call("identify", jSONObject);
                                            }
                                        }
                                    } else if (SensorsDataAPI.this.mFunctionListenerList != null) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("distinctId", str);
                                        it = SensorsDataAPI.this.mFunctionListenerList.iterator();
                                        while (it.hasNext()) {
                                            it.next().call("identify", jSONObject);
                                        }
                                    }
                                } catch (Exception e12) {
                                    SALog.printStackTrace(e12);
                                }
                                throw th;
                            }
                        } catch (Exception e13) {
                            SALog.printStackTrace(e13);
                        }
                    }
                });
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ boolean isAppHeatMapConfirmDialogEnabled() {
        return super.isAppHeatMapConfirmDialogEnabled();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isAutoTrackEnabled() {
        Boolean boolIsAutoTrackEnabled;
        if (AbstractSensorsDataAPI.isSDKDisabled()) {
            return false;
        }
        BaseSensorsDataSDKRemoteManager baseSensorsDataSDKRemoteManager = this.mRemoteManager;
        if (baseSensorsDataSDKRemoteManager != null && (boolIsAutoTrackEnabled = baseSensorsDataSDKRemoteManager.isAutoTrackEnabled()) != null) {
            return boolIsAutoTrackEnabled.booleanValue();
        }
        return this.mAutoTrack;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ boolean isDeepLinkInstallSource() {
        return super.isDeepLinkInstallSource();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ boolean isDisableDefaultRemoteConfig() {
        return super.isDisableDefaultRemoteConfig();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ boolean isVisualizedAutoTrackConfirmDialogEnabled() {
        return super.isVisualizedAutoTrackConfirmDialogEnabled();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void removeEventListener(SAEventListener sAEventListener) {
        super.removeEventListener(sAEventListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void removeFunctionListener(SAFunctionListener sAFunctionListener) {
        super.removeFunctionListener(sAFunctionListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void setDebugMode(DebugMode debugMode) {
        super.setDebugMode(debugMode);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void setRemoteManager(BaseSensorsDataSDKRemoteManager baseSensorsDataSDKRemoteManager) {
        super.setRemoteManager(baseSensorsDataSDKRemoteManager);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setSessionIntervalTime(int i11) {
        if (DbAdapter.getInstance() == null) {
            SALog.m68589i("SA.SensorsDataAPI", "The static method sharedInstance(context, serverURL, debugMode) should be called before calling sharedInstance()");
            return;
        }
        if (i11 >= 10000 && i11 <= 300000) {
            if (i11 != this.mSessionTime) {
                this.mSessionTime = i11;
                DbAdapter.getInstance().commitSessionIntervalTime(i11);
                return;
            }
            return;
        }
        SALog.m68589i("SA.SensorsDataAPI", "SessionIntervalTime:" + i11 + " is invalid, session interval time is between 10s and 300s.");
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setViewID(Dialog dialog, String str) {
        if (dialog != null) {
            try {
                if (TextUtils.isEmpty(str) || dialog.getWindow() == null) {
                    return;
                }
                dialog.getWindow().getDecorView().setTag(C27650R.id.sensors_analytics_tag_view_id, str);
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpWebView(WebView webView, boolean z11, boolean z12) {
        showUpWebView(webView, null, z11, z12);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpX5WebView(Object obj) {
        showUpX5WebView(obj, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackAppCrash() {
        SensorsDataExceptionHandler.enableAppCrash();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackAppInstall() {
        trackAppInstall(null, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void trackAutoEvent(String str, JSONObject jSONObject) {
        super.trackAutoEvent(str, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackSignUp(final String str) {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.9
                @Override // java.lang.Runnable
                public void run() {
                    String anonymousId = SensorsDataAPI.this.getAnonymousId();
                    synchronized (SensorsDataAPI.this.mDistinctId) {
                        SensorsDataAPI.this.mDistinctId.commit(str);
                    }
                    SensorsDataAPI.this.trackEvent(EventType.TRACK_SIGNUP, "$SignUp", null, anonymousId);
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerEnd(String str) {
        trackTimerEnd(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackViewScreen(final Object obj) {
        Class<?> cls;
        Class<?> cls2;
        if (obj == null) {
            return;
        }
        Class cls3 = null;
        try {
            cls = Class.forName("android.support.v4.app.Fragment");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            cls2 = Class.forName("android.app.Fragment");
        } catch (Exception unused2) {
            cls2 = null;
        }
        try {
            int i11 = Fragment.f2711T;
            cls3 = Fragment.class;
        } catch (Exception unused3) {
        }
        if ((cls == null || !cls.isInstance(obj)) && ((cls2 == null || !cls2.isInstance(obj)) && (cls3 == null || !cls3.isInstance(obj)))) {
            return;
        }
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.20
            @Override // java.lang.Runnable
            public void run() {
                JSONObject trackProperties;
                SensorsDataFragmentTitle sensorsDataFragmentTitle;
                try {
                    JSONObject jSONObject = new JSONObject();
                    String canonicalName = obj.getClass().getCanonicalName();
                    Activity activity = null;
                    String strTitle = (!obj.getClass().isAnnotationPresent(SensorsDataFragmentTitle.class) || (sensorsDataFragmentTitle = (SensorsDataFragmentTitle) obj.getClass().getAnnotation(SensorsDataFragmentTitle.class)) == null) ? null : sensorsDataFragmentTitle.title();
                    try {
                        Method method = obj.getClass().getMethod("getActivity", new Class[0]);
                        if (method != null) {
                            activity = (Activity) method.invoke(obj, new Object[0]);
                        }
                    } catch (Exception unused4) {
                    }
                    if (activity != null) {
                        if (TextUtils.isEmpty(strTitle)) {
                            strTitle = SensorsDataUtils.getActivityTitle(activity);
                        }
                        canonicalName = String.format(Locale.CHINA, "%s|%s", activity.getClass().getCanonicalName(), canonicalName);
                    }
                    if (!TextUtils.isEmpty(strTitle)) {
                        jSONObject.put(AopConstants.TITLE, strTitle);
                    }
                    jSONObject.put(AopConstants.SCREEN_NAME, canonicalName);
                    Object obj2 = obj;
                    if ((obj2 instanceof ScreenAutoTracker) && (trackProperties = ((ScreenAutoTracker) obj2).getTrackProperties()) != null) {
                        SensorsDataUtils.mergeJSONObject(trackProperties, jSONObject);
                    }
                    SensorsDataAPI.this.trackViewScreen(SensorsDataUtils.getScreenUrl(obj), jSONObject);
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void transformTaskQueue(Runnable runnable) {
        super.transformTaskQueue(runnable);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void showUpWebView(WebView webView, boolean z11, JSONObject jSONObject) {
        showUpWebView(webView, jSONObject, z11, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void track(String str) {
        track(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableAutoTrack(List<AutoTrackEventType> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                this.mAutoTrack = true;
                for (AutoTrackEventType autoTrackEventType : list) {
                    SAConfigOptions sAConfigOptions = AbstractSensorsDataAPI.mSAConfigOptions;
                    sAConfigOptions.setAutoTrackEventType(autoTrackEventType.eventValue | sAConfigOptions.mAutoTrackEventType);
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setViewID(Object obj, String str) {
        Class<?> cls;
        Method method;
        Window window;
        if (obj == null) {
            return;
        }
        Class<?> cls2 = null;
        try {
            cls = Class.forName("android.support.v7.app.AlertDialog");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            int i11 = AlertDialog.f1174b;
            cls2 = AlertDialog.class;
        } catch (Exception unused2) {
        }
        if (cls == null) {
            cls = cls2;
        }
        if (cls == null) {
            return;
        }
        try {
            if (!cls.isInstance(obj) || TextUtils.isEmpty(str) || (method = obj.getClass().getMethod("getWindow", new Class[0])) == null || (window = (Window) method.invoke(obj, new Object[0])) == null) {
                return;
            }
            window.getDecorView().setTag(C27650R.id.sensors_analytics_tag_view_id, str);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void ignoreAutoTrackEventType(List<AutoTrackEventType> list) {
        if (list == null || AbstractSensorsDataAPI.mSAConfigOptions.mAutoTrackEventType == 0) {
            return;
        }
        for (AutoTrackEventType autoTrackEventType : list) {
            int i11 = AbstractSensorsDataAPI.mSAConfigOptions.mAutoTrackEventType | autoTrackEventType.eventValue;
            SAConfigOptions sAConfigOptions = AbstractSensorsDataAPI.mSAConfigOptions;
            int i12 = sAConfigOptions.mAutoTrackEventType;
            if (i11 == i12) {
                sAConfigOptions.setAutoTrackEventType(autoTrackEventType.eventValue ^ i12);
            }
        }
        if (AbstractSensorsDataAPI.mSAConfigOptions.mAutoTrackEventType == 0) {
            this.mAutoTrack = false;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackEventFromH5(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.38
            @Override // java.lang.Runnable
            public void run() {
                SensorsDataAPI.this.trackEventH5(str);
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackInstallation(String str, JSONObject jSONObject) {
        trackInstallation(str, jSONObject, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackInstallation(String str) {
        trackInstallation(str, null, false);
    }

    @Deprecated
    public static SensorsDataAPI sharedInstance(Context context, String str, DebugMode debugMode) {
        return getInstance(context, debugMode, new SAConfigOptions(str));
    }

    @Deprecated
    public static SensorsDataAPI sharedInstance(Context context, String str) {
        return getInstance(context, DebugMode.DEBUG_OFF, new SAConfigOptions(str));
    }

    @Deprecated
    public static SensorsDataAPI sharedInstance(Context context, SAConfigOptions sAConfigOptions) {
        if (context != null && sAConfigOptions != null) {
            SensorsDataAPI sensorsDataAPI = getInstance(context, DebugMode.DEBUG_OFF, sAConfigOptions);
            if (!sensorsDataAPI.mSDKConfigInit) {
                sensorsDataAPI.applySAConfigOptions();
            }
            return sensorsDataAPI;
        }
        throw new NullPointerException("Context、SAConfigOptions 不可以为 null");
    }

    public static SensorsDataAPI sharedInstance() {
        if (AbstractSensorsDataAPI.isSDKDisabled()) {
            return new SensorsDataAPIEmptyImplementation();
        }
        return getSDKInstance();
    }
}
