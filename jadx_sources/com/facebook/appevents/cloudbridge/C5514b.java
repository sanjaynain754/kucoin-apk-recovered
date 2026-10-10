package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import com.google.firebase.perf.util.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.b */
/* JADX INFO: compiled from: AppEventsCAPIManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R@\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00168A@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/b;", "", "<init>", "()V", "", "b", "Lcom/facebook/GraphResponse;", "response", "d", "(Lcom/facebook/GraphResponse;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "c", "Z", "f", "()Z", "setEnabled$facebook_core_release", "(Z)V", Constants.ENABLE_DISABLE, "", "valuesToSave", "e", "()Ljava/util/Map;", "g", "(Ljava/util/Map;)V", "savedCloudBridgeCredentials", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5514b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5514b f7739a = new C5514b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5514b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isEnabled;

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m8003b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, C5501a.m7800n() + "/cloudbridge_settings", null, HttpMethod.GET, new GraphRequest.InterfaceC5490b() { // from class: com.facebook.appevents.cloudbridge.a
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    C5514b.m8004c(graphResponse);
                }
            }, null, 32, null);
            Logger.Companion companion = Logger.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            companion.log(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.m7657m();
        } catch (JSONException e11) {
            Logger.Companion companion2 = Logger.INSTANCE;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
            String str2 = TAG;
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            companion2.log(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", ExceptionsKt.stackTraceToString(e11));
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Map<String, Object> m8005e() {
        if (C42757a.m93689d(C5514b.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
            if (string != null && !StringsKt.isBlank(string) && string2 != null && !StringsKt.isBlank(string2) && string3 != null && !StringsKt.isBlank(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(settingsAPIFields2.getRawValue(), string2);
                linkedHashMap.put(settingsAPIFields.getRawValue(), string);
                linkedHashMap.put(settingsAPIFields3.getRawValue(), string3);
                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5514b.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8007f() {
        return isEnabled;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8004c(GraphResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f7739a.m8006d(response);
    }

    /* JADX INFO: renamed from: d */
    public final void m8006d(@NotNull GraphResponse response) {
        Object obj;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String() != null) {
            Logger.Companion companion = Logger.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            companion.log(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String().toString(), String.valueOf(response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String().getException()));
            Map<String, Object> mapM8005e = m8005e();
            if (mapM8005e != null) {
                URL url = new URL(String.valueOf(mapM8005e.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests.m7979d(String.valueOf(mapM8005e.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + url.getHost(), String.valueOf(mapM8005e.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                isEnabled = true;
                return;
            }
            return;
        }
        Logger.Companion companion2 = Logger.INSTANCE;
        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
        String TAG2 = TAG;
        Intrinsics.checkNotNull(TAG2, "null cannot be cast to non-null type kotlin.String");
        companion2.log(loggingBehavior2, TAG2, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject graphObject = response.getGraphObject();
        if (graphObject != null) {
            try {
                obj = graphObject.get("data");
            } catch (NullPointerException e11) {
                Logger.Companion companion3 = Logger.INSTANCE;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.APP_EVENTS;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                companion3.log(loggingBehavior3, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", ExceptionsKt.stackTraceToString(e11));
                return;
            } catch (JSONException e12) {
                Logger.Companion companion4 = Logger.INSTANCE;
                LoggingBehavior loggingBehavior4 = LoggingBehavior.APP_EVENTS;
                String TAG4 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                companion4.log(loggingBehavior4, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", ExceptionsKt.stackTraceToString(e12));
                return;
            }
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Map<String, ? extends Object> mapM10076n = C5760c.m10076n(new JSONObject((String) CollectionsKt.firstOrNull((List) C5760c.m10075m((JSONArray) obj))));
        String str2 = (String) mapM10076n.get(SettingsAPIFields.URL.getRawValue());
        String str3 = (String) mapM10076n.get(SettingsAPIFields.DATASETID.getRawValue());
        String str4 = (String) mapM10076n.get(SettingsAPIFields.ACCESSKEY.getRawValue());
        if (str2 != null && str3 != null && str4 != null) {
            try {
                AppEventsConversionsAPITransformerWebRequests.m7979d(str3, str2, str4);
                m8008g(mapM10076n);
                SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
                if (mapM10076n.get(settingsAPIFields.getRawValue()) != null) {
                    Object obj2 = mapM10076n.get(settingsAPIFields.getRawValue());
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                isEnabled = zBooleanValue;
                return;
            } catch (MalformedURLException e13) {
                Logger.Companion companion5 = Logger.INSTANCE;
                LoggingBehavior loggingBehavior5 = LoggingBehavior.APP_EVENTS;
                String TAG5 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
                companion5.log(loggingBehavior5, TAG5, "CloudBridge Settings API response doesn't have valid url\n %s ", ExceptionsKt.stackTraceToString(e13));
                return;
            }
        }
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        companion2.log(loggingBehavior2, TAG2, "CloudBridge Settings API response doesn't have valid data");
    }

    /* JADX INFO: renamed from: g */
    public final void m8008g(@Nullable Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.clear();
                editorEdit.apply();
                return;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            Object obj = map.get(settingsAPIFields.getRawValue());
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            Object obj2 = map.get(settingsAPIFields2.getRawValue());
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            Object obj3 = map.get(settingsAPIFields3.getRawValue());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString(settingsAPIFields.getRawValue(), obj.toString());
                editorEdit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
                editorEdit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
                editorEdit2.apply();
                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
