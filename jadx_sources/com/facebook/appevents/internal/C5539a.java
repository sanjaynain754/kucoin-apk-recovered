package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.C5505a;
import com.facebook.appevents.codeless.C5522b;
import com.facebook.appevents.iap.C5537e;
import com.facebook.appevents.internal.C5539a;
import com.facebook.appevents.suggestedevents.C5545a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p357j3.C40258g;
import p357j3.C40259h;
import p357j3.C40260i;
import p357j3.C40263l;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.appevents.internal.a */
/* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001cR\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010>R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010F\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, m90084d2 = {"Lcom/facebook/appevents/internal/a;", "", "<init>", "()V", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "z", "(Landroid/app/Application;Ljava/lang/String;)V", "", "p", "()Z", "Ljava/util/UUID;", "n", "()Ljava/util/UUID;", "Landroid/app/Activity;", "activity", "q", "(Landroid/app/Activity;)V", "w", "m", "()Landroid/app/Activity;", "t", CmcdData.Factory.STREAMING_FORMAT_SS, CmcdData.Factory.STREAM_TYPE_LIVE, "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "c", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "d", "iapExecutor", "Ljava/util/concurrent/ScheduledFuture;", "e", "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", "f", "Ljava/lang/Object;", "currentFutureLock", "Ljava/util/concurrent/atomic/AtomicInteger;", "g", "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Lcom/facebook/appevents/internal/SessionInfo;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/appevents/internal/SessionInfo;", "currentSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", "j", "", "k", "J", "currentActivityAppearTime", "", "I", "activityReferences", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "currActivity", "previousActivityName", "o", "()I", "sessionTimeoutInSeconds", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nActivityLifecycleTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLifecycleTracker.kt\ncom/facebook/appevents/internal/ActivityLifecycleTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
public final class C5539a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5539a f7968a = new C5539a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final ScheduledExecutorService iapExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static volatile ScheduledFuture<?> currentFuture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Object currentFutureLock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger foregroundActivityCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static volatile SessionInfo currentSession;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean tracking;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public static String appId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static long currentActivityAppearTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static int activityReferences;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<Activity> currActivity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public static String previousActivityName;

    /* JADX INFO: renamed from: com.facebook.appevents.internal.a$a */
    /* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m90084d2 = {"com/facebook/appevents/internal/a$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivityCreated");
            C40258g.m88606a();
            C5539a.m8271q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivityDestroyed");
            C5539a.f7968a.m8281s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivityPaused");
            C40258g.m88606a();
            C5539a.f7968a.m8282t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivityResumed");
            C40258g.m88606a();
            C5539a.m8275w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C5539a.activityReferences++;
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, C5539a.TAG, "onActivityStopped");
            AppEventsLogger.INSTANCE.onContextStop();
            C5539a.activityReferences--;
        }
    }

    static {
        String canonicalName = C5539a.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        iapExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: A */
    public static final void m8256A(boolean z11) {
        if (z11) {
            C5522b.m8057f();
        } else {
            C5522b.m8056e();
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: m */
    public static final Activity m8268m() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final UUID m8269n() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p */
    public static final boolean m8270p() {
        return activityReferences == 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m8271q(@Nullable Activity activity) {
        singleThreadExecutor.execute(new Runnable() { // from class: j3.e
            @Override // java.lang.Runnable
            public final void run() {
                C5539a.m8272r();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static final void m8272r() {
        if (currentSession == null) {
            currentSession = SessionInfo.INSTANCE.getStoredSessionInfo();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m8273u(final long j11, final String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j11), null, null, 4, null);
        }
        SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.m8252k(Long.valueOf(j11));
        }
        if (foregroundActivityCount.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: j3.f
                @Override // java.lang.Runnable
                public final void run() {
                    C5539a.m8274v(j11, activityName);
                }
            };
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(runnable, f7968a.m8280o(), TimeUnit.SECONDS);
                Unit unit = Unit.INSTANCE;
            }
        }
        long j12 = currentActivityAppearTime;
        C40259h.m88617i(activityName, j12 > 0 ? (j11 - j12) / ((long) 1000) : 0L);
        SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 != null) {
            sessionInfo2.m8254m();
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m8274v(long j11, String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j11), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            C40263l.m88638e(activityName, currentSession, appId);
            SessionInfo.INSTANCE.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m8275w(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        f7968a.m8279l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        final String strM10083s = C5760c.m10083s(activity);
        C5522b.m8062l(activity);
        C5505a.m7928d(activity);
        C5545a.m8370h(activity);
        String str = previousActivityName;
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "ProxyBillingActivity", false, 2, (Object) null) && !Intrinsics.areEqual(strM10083s, "ProxyBillingActivity")) {
            iapExecutor.execute(new Runnable() { // from class: j3.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5539a.m8276x();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: j3.c
            @Override // java.lang.Runnable
            public final void run() {
                C5539a.m8277y(jCurrentTimeMillis, strM10083s, applicationContext);
            }
        });
        previousActivityName = strM10083s;
    }

    /* JADX INFO: renamed from: y */
    public static final void m8277y(long j11, String activityName, Context appContext) {
        SessionInfo sessionInfo;
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        SessionInfo sessionInfo2 = currentSession;
        Long lM8246e = sessionInfo2 != null ? sessionInfo2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j11), null, null, 4, null);
            String str = appId;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            C40263l.m88637c(activityName, null, str, appContext);
        } else if (lM8246e != null) {
            long jLongValue = j11 - lM8246e.longValue();
            if (jLongValue > f7968a.m8280o() * 1000) {
                C40263l.m88638e(activityName, currentSession, appId);
                String str2 = appId;
                Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                C40263l.m88637c(activityName, null, str2, appContext);
                currentSession = new SessionInfo(Long.valueOf(j11), null, null, 4, null);
            } else if (jLongValue > 1000 && (sessionInfo = currentSession) != null) {
                sessionInfo.m8249h();
            }
        }
        SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.m8252k(Long.valueOf(j11));
        }
        SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 != null) {
            sessionInfo4.m8254m();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final void m8278z(@NotNull Application application, @Nullable String appId2) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.m9936a(FeatureManager.Feature.CodelessEvents, new FeatureManager.InterfaceC5749a() { // from class: j3.a
                @Override // com.facebook.internal.FeatureManager.InterfaceC5749a
                /* JADX INFO: renamed from: a */
                public final void mo81a(boolean z11) {
                    C5539a.m8256A(z11);
                }
            });
            appId = appId2;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8279l() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            try {
                if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                    scheduledFuture.cancel(false);
                }
                currentFuture = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8282t(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m8279l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strM10083s = C5760c.m10083s(activity);
        C5522b.m8061k(activity);
        singleThreadExecutor.execute(new Runnable() { // from class: j3.d
            @Override // java.lang.Runnable
            public final void run() {
                C5539a.m8273u(jCurrentTimeMillis, strM10083s);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static final void m8276x() {
        C5537e.m8221h();
    }

    /* JADX INFO: renamed from: o */
    public final int m8280o() {
        FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
        if (fetchedAppSettingsM9975f == null) {
            return C40260i.m88628a();
        }
        return fetchedAppSettingsM9975f.getSessionTimeoutInSeconds();
    }

    /* JADX INFO: renamed from: s */
    public final void m8281s(Activity activity) {
        C5522b.m8060j(activity);
    }
}
