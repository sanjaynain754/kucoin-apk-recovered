package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.internal.C5539a;
import com.facebook.appevents.p060ml.ModelManager;
import com.facebook.appevents.suggestedevents.C5545a;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p461n3.C42718a;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.suggestedevents.a */
/* JADX INFO: compiled from: SuggestedEventsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/appevents/suggestedevents/a;", "", "<init>", "()V", "", "b", "Landroid/app/Activity;", "activity", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/app/Activity;)V", "", "event", "", "f", "(Ljava/lang/String;)Z", "e", "rawSuggestedEventSetting", "g", "(Ljava/lang/String;)V", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "", "c", "Ljava/util/Set;", "productionEvents", "eligibleEvents", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5545a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5545a f8036a = new C5545a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> productionEvents = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> eligibleEvents = new LinkedHashSet();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final synchronized void m8366b() {
        if (C42757a.m93689d(C5545a.class)) {
            return;
        }
        try {
            C5501a.m7806t().execute(new Runnable() { // from class: n3.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5545a.m8367c();
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5545a.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8367c() {
        if (C42757a.m93689d(C5545a.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = enabled;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f8036a.m8371d();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5545a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m8368e(@NotNull String event) {
        if (C42757a.m93689d(C5545a.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return eligibleEvents.contains(event);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5545a.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m8369f(@NotNull String event) {
        if (C42757a.m93689d(C5545a.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return productionEvents.contains(event);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5545a.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m8370h(@NotNull Activity activity) {
        if (C42757a.m93689d(C5545a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (!enabled.get() || !C42718a.m93601f() || (productionEvents.isEmpty() && eligibleEvents.isEmpty())) {
                    ViewObserver.INSTANCE.stopTrackingActivity(activity);
                    return;
                }
                ViewObserver.INSTANCE.startTrackingActivity(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5545a.class);
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: g */
    public final void m8372g(@Nullable String rawSuggestedEventSetting) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(rawSuggestedEventSetting);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Set<String> set = productionEvents;
                    String string = jSONArray.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    Set<String> set2 = eligibleEvents;
                    String string2 = jSONArray2.getString(i12);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8371d() {
        String suggestedEventsSetting;
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u != null && (suggestedEventsSetting = fetchedAppSettingsM9982u.getSuggestedEventsSetting()) != null) {
                    m8372g(suggestedEventsSetting);
                    if (productionEvents.isEmpty() && eligibleEvents.isEmpty()) {
                        return;
                    }
                    File fileM8299l = ModelManager.m8299l(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                    if (fileM8299l != null) {
                        C42718a.m93600d(fileM8299l);
                        Activity activityM8268m = C5539a.m8268m();
                        if (activityM8268m != null) {
                            m8370h(activityM8268m);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
