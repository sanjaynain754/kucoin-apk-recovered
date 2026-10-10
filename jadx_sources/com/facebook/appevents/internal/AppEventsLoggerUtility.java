package com.facebook.appevents.internal;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility;", "", "<init>", "()V", "Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "activityType", "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "", "limitEventUsage", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;", "", "b", "Ljava/util/Map;", "API_ACTIVITY_TYPE_TO_STRING", "GraphAPIActivityType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AppEventsLoggerUtility {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppEventsLoggerUtility f7952a = new AppEventsLoggerUtility();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = MapsKt.hashMapOf(TuplesKt.m90091to(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.m90091to(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JSONObject m8231a(@NotNull GraphAPIActivityType activityType, @Nullable AttributionIdentifiers attributionIdentifiers, @Nullable String anonymousAppDeviceGUID, boolean limitEventUsage, @NotNull Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(activityType));
        String userID = AppEventsLogger.INSTANCE.getUserID();
        if (userID != null) {
            jSONObject.put("app_user_id", userID);
        }
        C5760c.m10081q0(jSONObject, attributionIdentifiers, anonymousAppDeviceGUID, limitEventUsage, context);
        try {
            C5760c.m10082r0(jSONObject, context);
        } catch (Exception e11) {
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e11.toString());
        }
        JSONObject jSONObjectM10042B = C5760c.m10042B();
        if (jSONObjectM10042B != null) {
            Iterator<String> itKeys = jSONObjectM10042B.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectM10042B.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
