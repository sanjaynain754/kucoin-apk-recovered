package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.C5522b;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p357j3.C40258g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.facebook.appevents.codeless.b */
/* JADX INFO: compiled from: CodelessManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u0006-"}, m90084d2 = {"Lcom/facebook/appevents/codeless/b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/app/Activity;)V", "k", "j", "f", "e", "", "g", "()Ljava/lang/String;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "appIndexingEnabled", "n", "(Z)V", "applicationId", "c", "(Ljava/lang/String;)V", "i", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "b", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "viewIndexingTrigger", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Lcom/facebook/appevents/codeless/ViewIndexer;", "d", "Lcom/facebook/appevents/codeless/ViewIndexer;", "viewIndexer", "Ljava/lang/String;", "deviceSessionID", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCodelessEnabled", "isAppIndexingEnabled", "Z", "isCheckingSession", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5522b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static SensorManager sensorManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static ViewIndexer viewIndexer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static String deviceSessionID;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static volatile boolean isCheckingSession;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5522b f7783a = new C5522b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final void m8055d(String str) {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(C5501a.m7799m());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((attributionIdentifiers != null ? attributionIdentifiers.m9905h() : null) != null) {
                jSONArray.put(attributionIdentifiers.m9905h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(C40258g.m88611f() ? "1" : "0");
            Locale localeM10091z = C5760c.m10091z();
            jSONArray.put(localeM10091z.getLanguage() + '_' + localeM10091z.getCountry());
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "extInfoArray.toString()");
            bundle.putString("device_session_id", m8058g());
            bundle.putString("extinfo", string);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean z11 = true;
            String str3 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
            JSONObject graphObject = companion.newPostRequestWithBundle(null, str3, bundle, null).m7656l().getGraphObject();
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (graphObject == null || !graphObject.optBoolean("is_app_indexing_enabled", false)) {
                z11 = false;
            }
            atomicBoolean.set(z11);
            if (atomicBoolean.get()) {
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.m8039i();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m8056e() {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m8057f() {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m8058g() {
        if (C42757a.m93689d(C5522b.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m8059h() {
        if (C42757a.m93689d(C5522b.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m8060j(@NotNull Activity activity) {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CodelessMatcher.INSTANCE.getInstance().m8015f(activity);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m8061k(@NotNull Activity activity) {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (isCodelessEnabled.get()) {
                CodelessMatcher.INSTANCE.getInstance().m8017h(activity);
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.m8041m();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(viewIndexingTrigger);
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m8062l(@NotNull Activity activity) {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (isCodelessEnabled.get()) {
                CodelessMatcher.INSTANCE.getInstance().m8014e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strM7800n = C5501a.m7800n();
                final FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(strM7800n);
                if ((fetchedAppSettingsM9975f != null && fetchedAppSettingsM9975f.getCodelessEventsEnabled()) || f7783a.m8066i()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    ViewIndexer viewIndexer2 = new ViewIndexer(activity);
                    viewIndexer = viewIndexer2;
                    ViewIndexingTrigger viewIndexingTrigger2 = viewIndexingTrigger;
                    viewIndexingTrigger2.setOnShakeListener(new ViewIndexingTrigger.InterfaceC5520a() { // from class: c3.b
                        @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.InterfaceC5520a
                        public final void onShake() {
                            C5522b.m8063m(fetchedAppSettingsM9975f, strM7800n);
                        }
                    });
                    sensorManager2.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                    if (fetchedAppSettingsM9975f != null && fetchedAppSettingsM9975f.getCodelessEventsEnabled()) {
                        viewIndexer2.m8039i();
                    }
                }
                C5522b c5522b = f7783a;
                if (!c5522b.m8066i() || isAppIndexingEnabled.get()) {
                    return;
                }
                c5522b.m8065c(strM7800n);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8063m(FetchedAppSettings fetchedAppSettings, String appId) {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z11 = fetchedAppSettings != null && fetchedAppSettings.getCodelessEventsEnabled();
            boolean zM7805s = C5501a.m7805s();
            if (z11 && zM7805s) {
                f7783a.m8065c(appId);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m8064n(boolean appIndexingEnabled) {
        if (C42757a.m93689d(C5522b.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5522b.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8065c(final String applicationId) {
        if (!C42757a.m93689d(this)) {
            try {
                if (isCheckingSession) {
                    return;
                }
                isCheckingSession = true;
                C5501a.m7806t().execute(new Runnable() { // from class: c3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5522b.m8055d(applicationId);
                    }
                });
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8066i() {
        C42757a.m93689d(this);
        return false;
    }
}
