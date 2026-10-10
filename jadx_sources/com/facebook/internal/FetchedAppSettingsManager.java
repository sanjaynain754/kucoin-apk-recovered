package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.view.C1454t;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p189d3.C36604b;
import p333i6.C38449h;
import p357j3.C40259h;
import p357j3.C40260i;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002KLB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e0\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u0004\u0018\u00010(2\b\u0010&\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\u0010+\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J[\u00104\u001a:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060-02\u0018\u000101j\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060-02\u0018\u0001`32\b\u0010+\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J'\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b6\u0010!R\u001c\u0010:\u001a\n 7*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\"\u0010C\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010A0A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0016\u0010H\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010I¨\u0006M"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "<init>", "()V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "applicationId", "Lcom/facebook/internal/FetchedAppSettings;", "f", "(Ljava/lang/String;)Lcom/facebook/internal/FetchedAppSettings;", "Lcom/facebook/internal/FetchedAppSettingsManager$a;", TUIConstants.TUIChat.CALL_BACK, "d", "(Lcom/facebook/internal/FetchedAppSettingsManager$a;)V", "", "", "g", "()Ljava/util/Map;", "forceRequery", "u", "(Ljava/lang/String;Z)Lcom/facebook/internal/FetchedAppSettings;", "Lorg/json/JSONObject;", "settingsJSON", "j", "(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/FetchedAppSettings;", "r", "e", "(Ljava/lang/String;)Lorg/json/JSONObject;", "dialogConfigResponse", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "o", "(Lorg/json/JSONObject;)Ljava/util/Map;", "parameters", "", "n", "(Lorg/json/JSONObject;)Ljava/lang/Long;", "protectedModeSettings", "ruleType", "Lorg/json/JSONArray;", "q", "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;", "originalJSON", "key", "", "k", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;", "getTestValues", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lorg/json/JSONObject;Z)Ljava/util/ArrayList;", "p", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "c", "Ljava/util/List;", "APP_SETTING_FIELDS", "Ljava/util/Map;", "fetchedAppSettings", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "Ljava/util/concurrent/atomic/AtomicReference;", "loadingState", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "fetchedAppSettingsCallbacks", "Z", "printedSDKUpdatedMessage", "Lorg/json/JSONArray;", "unityEventBindings", "FetchAppSettingState", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFetchedAppSettingsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchedAppSettingsManager.kt\ncom/facebook/internal/FetchedAppSettingsManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,564:1\n1#2:565\n*E\n"})
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FetchedAppSettingsManager f9606a = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = FetchedAppSettingsManager.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> APP_SETTING_FIELDS = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')'});

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentLinkedQueue<InterfaceC5752a> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static boolean printedSDKUpdatedMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static JSONArray unityEventBindings;

    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", AppConstants.AB_TEST_SUCCESS, "ERROR", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: com.facebook.internal.FetchedAppSettingsManager$a */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$a;", "", "Lcom/facebook/internal/FetchedAppSettings;", "fetchedAppSettings", "", "b", "(Lcom/facebook/internal/FetchedAppSettings;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5752a {
        /* JADX INFO: renamed from: a */
        void mo72a();

        /* JADX INFO: renamed from: b */
        void mo73b(@Nullable FetchedAppSettings fetchedAppSettings);
    }

    /* JADX INFO: renamed from: n */
    public final Long m9987n(JSONObject parameters) {
        if (parameters != null) {
            try {
                return Long.valueOf(parameters.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, Boolean> m9989p(JSONObject settingsJSON) {
        if (settingsJSON == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!settingsJSON.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(settingsJSON.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e11) {
                C5760c.m10063d0("FacebookSDK", e11);
            }
        }
        if (!settingsJSON.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(settingsJSON.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e12) {
                C5760c.m10063d0("FacebookSDK", e12);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m9991r() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            final FetchedAppSettings fetchedAppSettings2 = fetchedAppSettings.get(C5501a.m7800n());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC5752a> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final InterfaceC5752a interfaceC5752aPoll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: i6.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.m9980s(interfaceC5752aPoll);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC5752a> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final InterfaceC5752a interfaceC5752aPoll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: i6.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.m9981t(interfaceC5752aPoll2, fetchedAppSettings2);
                        }
                    });
                }
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m9974d(@NotNull InterfaceC5752a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchedAppSettingsCallbacks.add(callback);
        m9977h();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final FetchedAppSettings m9975f(@Nullable String applicationId) {
        if (applicationId != null) {
            return fetchedAppSettings.get(applicationId);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final void m9978i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        FetchedAppSettings fetchedAppSettingsM9984j = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!C5760c.m10057Z(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e11) {
                C5760c.m10063d0("FacebookSDK", e11);
                jSONObject = null;
            }
            if (jSONObject != null) {
                fetchedAppSettingsM9984j = f9606a.m9984j(applicationId, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f9606a;
        JSONObject jSONObjectM9983e = fetchedAppSettingsManager.m9983e(applicationId);
        if (jSONObjectM9983e != null) {
            fetchedAppSettingsManager.m9984j(applicationId, jSONObjectM9983e);
            sharedPreferences.edit().putString(settingsKey, jSONObjectM9983e.toString()).apply();
        }
        if (fetchedAppSettingsM9984j != null) {
            String sdkUpdateMessage = fetchedAppSettingsM9984j.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                printedSDKUpdatedMessage = true;
                Log.w(TAG, sdkUpdateMessage);
            }
        }
        C5758a.m10031m(applicationId, true);
        C40259h.m88616h();
        loadingState.set(fetchedAppSettings.containsKey(applicationId) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.m9991r();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ArrayList m9979m(FetchedAppSettingsManager fetchedAppSettingsManager, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return fetchedAppSettingsManager.m9986l(jSONObject, z11);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: u */
    public static final FetchedAppSettings m9982u(@NotNull String applicationId, boolean forceRequery) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!forceRequery) {
            Map<String, FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f9606a;
        FetchedAppSettings fetchedAppSettingsM9984j = fetchedAppSettingsManager.m9984j(applicationId, fetchedAppSettingsManager.m9983e(applicationId));
        if (Intrinsics.areEqual(applicationId, C5501a.m7800n())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.m9991r();
        }
        return fetchedAppSettingsM9984j;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m9983e(String applicationId) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
        graphRequestNewGraphPathRequest.m7648E(true);
        graphRequestNewGraphPathRequest.m7651H(bundle);
        JSONObject jSONObjectM7743d = graphRequestNewGraphPathRequest.m7656l().getJsonObject();
        return jSONObjectM7743d == null ? new JSONObject() : jSONObjectM7743d;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final FetchedAppSettings m9984j(@NotNull String applicationId, @NotNull JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.INSTANCE;
        FacebookRequestErrorClassification facebookRequestErrorClassificationCreateFromJSON = companion.createFromJSON(jSONArrayOptJSONArray);
        if (facebookRequestErrorClassificationCreateFromJSON == null) {
            facebookRequestErrorClassificationCreateFromJSON = companion.getDefaultErrorClassification();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification = facebookRequestErrorClassificationCreateFromJSON;
        int iOptInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z11 = (iOptInt & 8) != 0;
        boolean z12 = (iOptInt & 16) != 0;
        boolean z13 = (iOptInt & 32) != 0;
        boolean z14 = (iOptInt & 256) != 0;
        boolean z15 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        unityEventBindings = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && C38449h.m86714b()) {
            C36604b.m81896c(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = settingsJSON.optJSONObject("app_events_config");
        boolean zOptBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = settingsJSON.optInt("app_events_session_timeout", C40260i.m88628a());
        EnumSet<SmartLoginOption> options = SmartLoginOption.INSTANCE.parseOptions(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> mapM9988o = m9988o(settingsJSON.optJSONObject("android_dialog_configs"));
        String strOptString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        FetchedAppSettings fetchedAppSettings2 = new FetchedAppSettings(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, options, mapM9988o, z11, facebookRequestErrorClassification, strOptString2, strOptString3, z12, z13, jSONArrayOptJSONArray2, strOptString4, z14, z15, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), m9989p(settingsJSON), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_schema"), m9990q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_blocked"), m9985k(jSONObjectOptJSONObject, "fb_currency"), m9985k(jSONObjectOptJSONObject, "_valueToSum"), m9979m(this, jSONObjectOptJSONObject, false, 2, null), m9986l(jSONObjectOptJSONObject, true), m9987n(settingsJSON.optJSONObject("app_events_config")));
        fetchedAppSettings.put(applicationId, fetchedAppSettings2);
        return fetchedAppSettings2;
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m9985k(JSONObject originalJSON, String key) {
        JSONArray jSONArray;
        if (originalJSON != null) {
            try {
                jSONArray = originalJSON.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (Intrinsics.areEqual(jSONObject.getString("key"), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i12);
                    if (Intrinsics.areEqual(jSONObject2.getString("key"), key)) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i13 = 0; i13 < length3; i13++) {
                            arrayList.add(jSONArray3.getJSONObject(i13).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<Pair<String, List<String>>> m9986l(JSONObject originalJSON, boolean getTestValues) {
        JSONArray jSONArray;
        ArrayList<Pair<String, List<String>>> arrayList;
        ArrayList<Pair<String, List<String>>> arrayList2 = null;
        if (originalJSON != null) {
            try {
                jSONArray = originalJSON.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return arrayList2;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<Pair<String, List<String>>> arrayList3 = null;
        int i11 = 0;
        while (i11 < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            String string = jSONObject.getString("key");
            if ((!Intrinsics.areEqual(string, "prod_keys") || !getTestValues) && (!Intrinsics.areEqual(string, "test_keys") || getTestValues)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                int i12 = 0;
                while (i12 < length2) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i12);
                    String string2 = jSONObject2.getString("key");
                    if (Intrinsics.areEqual(string2, "_valueToSum") || Intrinsics.areEqual(string2, "fb_currency")) {
                        arrayList = arrayList2;
                    } else {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("value");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = jSONArray3.length();
                        int i13 = 0;
                        while (i13 < length3) {
                            ArrayList<Pair<String, List<String>>> arrayList5 = arrayList2;
                            try {
                                arrayList4.add(jSONArray3.getJSONObject(i13).getString("value"));
                                i13++;
                                arrayList2 = arrayList5;
                            } catch (Exception unused2) {
                                return arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList3.add(new Pair<>(string2, arrayList4));
                    }
                    i12++;
                    arrayList2 = arrayList;
                }
            }
            i11++;
            arrayList2 = arrayList2;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> m9988o(JSONObject dialogConfigResponse) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (dialogConfigResponse != null && (jSONArrayOptJSONArray = dialogConfigResponse.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                FetchedAppSettings.DialogFeatureConfig.Companion companion = FetchedAppSettings.DialogFeatureConfig.INSTANCE;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                FetchedAppSettings.DialogFeatureConfig dialogConfig = companion.parseDialogConfig(jSONObjectOptJSONObject);
                if (dialogConfig != null) {
                    String dialogName = dialogConfig.getDialogName();
                    Map map2 = (Map) map.get(dialogName);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(dialogName, map2);
                    }
                    map2.put(dialogConfig.getFeatureName(), dialogConfig);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: q */
    public final JSONArray m9990q(JSONObject protectedModeSettings, String ruleType) {
        if (protectedModeSettings != null) {
            return protectedModeSettings.optJSONArray(ruleType);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Map<String, Boolean> m9976g() {
        JSONObject jSONObject;
        Context contextM7799m = C5501a.m7799m();
        String strM7800n = C5501a.m7800n();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM7800n}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        String string = contextM7799m.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
        if (!C5760c.m10057Z(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e11) {
                    C5760c.m10063d0("FacebookSDK", e11);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return f9606a.m9989p(jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m9977h() {
        final Context contextM7799m = C5501a.m7799m();
        final String strM7800n = C5501a.m7800n();
        if (C5760c.m10057Z(strM7800n)) {
            loadingState.set(FetchAppSettingState.ERROR);
            f9606a.m9991r();
            return;
        }
        if (fetchedAppSettings.containsKey(strM7800n)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            f9606a.m9991r();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!C1454t.m2255a(atomicReference, fetchAppSettingState, fetchAppSettingState2) && !C1454t.m2255a(atomicReference, FetchAppSettingState.ERROR, fetchAppSettingState2)) {
            f9606a.m9991r();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM7800n}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        C5501a.m7806t().execute(new Runnable() { // from class: i6.d
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppSettingsManager.m9978i(contextM7799m, str, strM7800n);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static final void m9980s(InterfaceC5752a interfaceC5752a) {
        interfaceC5752a.mo72a();
    }

    /* JADX INFO: renamed from: t */
    public static final void m9981t(InterfaceC5752a interfaceC5752a, FetchedAppSettings fetchedAppSettings2) {
        interfaceC5752a.mo73b(fetchedAppSettings2);
    }
}
