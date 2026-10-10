package com.facebook.appevents.aam;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.facebook.C5501a;
import com.facebook.appevents.aam.C5505a;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import org.jetbrains.annotations.NotNull;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.aam.a */
/* JADX INFO: compiled from: MetadataIndexer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/appevents/aam/a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "d", "(Landroid/app/Activity;)V", "b", "e", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "c", "Z", "enabled", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5505a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5505a f7700a = new C5505a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5505a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean enabled;

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m7926b() {
        try {
            if (C42757a.m93689d(C5505a.class)) {
                return;
            }
            try {
                C5501a.m7806t().execute(new Runnable() { // from class: b3.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5505a.m7927c();
                    }
                });
            } catch (Exception e11) {
                C5760c.m10063d0(TAG, e11);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5505a.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7927c() {
        if (C42757a.m93689d(C5505a.class)) {
            return;
        }
        try {
            if (AttributionIdentifiers.INSTANCE.isTrackingLimited(C5501a.m7799m())) {
                return;
            }
            f7700a.m7929e();
            enabled = true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5505a.class);
        }
    }

    @JvmStatic
    @UiThread
    /* JADX INFO: renamed from: d */
    public static final void m7928d(@NotNull Activity activity) {
        if (C42757a.m93689d(C5505a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (enabled && !MetadataRule.INSTANCE.getRules().isEmpty()) {
                    MetadataViewObserver.INSTANCE.startTrackingActivity(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5505a.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7929e() {
        String rawAamRules;
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u == null || (rawAamRules = fetchedAppSettingsM9982u.getRawAamRules()) == null) {
                    return;
                }
                MetadataRule.INSTANCE.updateRules(rawAamRules);
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
