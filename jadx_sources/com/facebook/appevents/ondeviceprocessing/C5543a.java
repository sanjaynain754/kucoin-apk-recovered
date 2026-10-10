package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import com.facebook.C5501a;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.C5543a;
import com.facebook.internal.C5760c;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.a */
/* JADX INFO: compiled from: OnDeviceProcessingManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/appevents/ondeviceprocessing/a;", "", "<init>", "()V", "", "d", "()Z", "", "applicationId", "preferencesName", "", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", "event", "e", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "c", "(Lcom/facebook/appevents/AppEvent;)Z", "", "b", "Ljava/util/Set;", "ALLOWED_IMPLICIT_EVENTS", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5543a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5543a f8021a = new C5543a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> ALLOWED_IMPLICIT_EVENTS = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m8338d() {
        if (C42757a.m93689d(C5543a.class)) {
            return false;
        }
        try {
            return (C5501a.m7810x(C5501a.m7799m()) || C5760c.m10055W() || !RemoteServiceWrapper.m8328b()) ? false : true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5543a.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m8339e(@NotNull final String applicationId, @NotNull final AppEvent event) {
        if (C42757a.m93689d(C5543a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f8021a.m8343c(event)) {
                C5501a.m7806t().execute(new Runnable() { // from class: l3.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5543a.m8340f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5543a.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8340f(String applicationId, AppEvent event) {
        if (C42757a.m93689d(C5543a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            RemoteServiceWrapper.m8329c(applicationId, CollectionsKt.listOf(event));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5543a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m8341g(@Nullable final String applicationId, @Nullable final String preferencesName) {
        if (C42757a.m93689d(C5543a.class)) {
            return;
        }
        try {
            final Context contextM7799m = C5501a.m7799m();
            if (contextM7799m == null || applicationId == null || preferencesName == null) {
                return;
            }
            C5501a.m7806t().execute(new Runnable() { // from class: l3.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5543a.m8342h(contextM7799m, preferencesName, applicationId);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5543a.class);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8342h(Context context, String str, String str2) {
        if (C42757a.m93689d(C5543a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                RemoteServiceWrapper.m8330e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5543a.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8343c(AppEvent event) {
        boolean z11;
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (event.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(event.getName())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (event.isImplicit() && !z11) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
