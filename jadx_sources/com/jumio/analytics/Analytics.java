package com.jumio.analytics;

import com.google.firebase.perf.util.Constants;
import com.jumio.analytics.Analytics;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.core.api.BackendManager;
import com.jumio.core.api.calls.AnalyticsCall;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.network.ApiBinding;
import com.jumio.core.network.ApiCall;
import com.jumio.core.util.ConcurrentMutableList;
import com.jumio.core.util.ConcurrentMutableListKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jumio.core.EnumC40670h2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\"\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0018J\u0006\u0010&\u001a\u00020\u0018J\u0006\u0010'\u001a\u00020\u0018J\u0010\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020 J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\u0012\u0010,\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020 H\u0002J\u001e\u0010.\u001a\u00020\u00182\n\u0010/\u001a\u0006\u0012\u0002\b\u0003002\b\u00101\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u00102\u001a\u00020\u00182\n\u0010/\u001a\u0006\u0012\u0002\b\u0003002\b\u00103\u001a\u0004\u0018\u000104H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00140\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u00066"}, m90084d2 = {"Lcom/jumio/analytics/Analytics;", "Lcom/jumio/core/network/ApiBinding;", "backendManager", "Lcom/jumio/core/api/BackendManager;", "analyticsModel", "Lcom/jumio/analytics/AnalyticsModel;", "<init>", "(Lcom/jumio/core/api/BackendManager;Lcom/jumio/analytics/AnalyticsModel;)V", "getBackendManager$jumio_core_release", "()Lcom/jumio/core/api/BackendManager;", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "eventChecker", "Ljava/util/concurrent/ScheduledFuture;", "lock", "", "bindingClasses", "", "Ljava/lang/Class;", "Lcom/jumio/core/network/ApiCall;", "getBindingClasses", "()[Ljava/lang/Class;", "configure", "", "configure$jumio_core_release", "add", "event", "Lcom/jumio/analytics/AnalyticsEvent;", "flush", "start", Constants.ENABLE_DISABLE, "", "time", "", "quota", "", "resume", "pause", InterfaceC33730j9.f70350a, "reporting", "canceled", "cleanup", "ensureEventCheckerRunning", "dispatch", "shutdown", "onResult", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", DbParams.KEY_CHANNEL_RESULT, "onError", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Analytics implements ApiBinding {

    /* JADX INFO: renamed from: g */
    public static Analytics f13402g;

    /* JADX INFO: renamed from: a */
    public final BackendManager f13404a;

    /* JADX INFO: renamed from: b */
    public final AnalyticsModel f13405b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f13406c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f13407d;

    /* JADX INFO: renamed from: e */
    public final Object f13408e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final Object f13401f = new Object();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentMutableList f13403h = ConcurrentMutableListKt.concurrentMutableListOf();

    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/analytics/Analytics$Companion;", "", "<init>", "()V", "instanceLock", "value", "Lcom/jumio/analytics/Analytics;", "instance", "setInstance", "(Lcom/jumio/analytics/Analytics;)V", "buffer", "Lcom/jumio/core/util/ConcurrentMutableList;", "Lcom/jumio/analytics/AnalyticsEvent;", "add", "", "event", "flush", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Analytics.kt\ncom/jumio/analytics/Analytics$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1863#2,2:208\n*S KotlinDebug\n*F\n+ 1 Analytics.kt\ncom/jumio/analytics/Analytics$Companion\n*L\n24#1:208,2\n*E\n"})
    public static final class Companion {
        public final void add(@NotNull AnalyticsEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            synchronized (Analytics.f13401f) {
                try {
                    if (Analytics.f13402g == null) {
                        Log.m14461d("Analytics instance is null -> add to buffer");
                        Analytics.f13403h.add(event);
                    } else {
                        Analytics analytics = Analytics.f13402g;
                        if (analytics != null) {
                            analytics.add(event);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final void access$setInstance(Companion companion, Analytics analytics) {
            companion.getClass();
            synchronized (Analytics.f13401f) {
                try {
                    Analytics.f13402g = analytics;
                    for (AnalyticsEvent analyticsEvent : Analytics.f13403h) {
                        Analytics analytics2 = Analytics.f13402g;
                        if (analytics2 != null) {
                            analytics2.add(analyticsEvent);
                        }
                    }
                    Analytics.f13403h.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void flush() {
            synchronized (Analytics.f13401f) {
                Analytics analytics = Analytics.f13402g;
                if (analytics != null) {
                    analytics.flush();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14419a() {
        if (this.f13405b.f13417e != 0) {
            ScheduledFuture scheduledFuture = this.f13407d;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                ScheduledExecutorService scheduledExecutorService = this.f13406c;
                Runnable runnable = new Runnable() { // from class: d9.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        Analytics.m14418a(this.f79443b);
                    }
                };
                long j11 = this.f13405b.f13417e;
                this.f13407d = scheduledExecutorService.scheduleWithFixedDelay(runnable, j11, j11, TimeUnit.MILLISECONDS);
            }
        }
    }

    public Analytics(@NotNull BackendManager backendManager, @NotNull AnalyticsModel analyticsModel) {
        Intrinsics.checkNotNullParameter(backendManager, "backendManager");
        Intrinsics.checkNotNullParameter(analyticsModel, "analyticsModel");
        this.f13404a = backendManager;
        this.f13405b = analyticsModel;
        this.f13406c = Executors.newScheduledThreadPool(1);
        this.f13408e = new Object();
        backendManager.addBinding(this);
    }

    public static /* synthetic */ void reporting$default(Analytics analytics, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        analytics.reporting(z11);
    }

    public static /* synthetic */ void start$default(Analytics analytics, boolean z11, long j11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        analytics.start(z11, j11, i11);
    }

    public final void add(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m14419a();
        event.setSessionId(this.f13405b.f13415c);
        int f13410b = event.getF13410b();
        if (f13410b == 306 || f13410b == 307 || f13410b == 311 || f13410b == 313 || f13410b == 316) {
            this.f13405b.f13414b.add(event);
            return;
        }
        if (this.f13405b.f13419g) {
            LogUtils.INSTANCE.logAnalytics(event);
            synchronized (this.f13408e) {
                this.f13405b.f13413a.add(event);
            }
            AnalyticsModel analyticsModel = this.f13405b;
            if (analyticsModel.f13416d != 0 && analyticsModel.f13413a.size() >= this.f13405b.f13416d) {
                flush();
            }
            if (event.getF13410b() == 302) {
                Serializable serializable = event.getF13411c().f89978a;
                EnumC40670h2 enumC40670h2 = EnumC40670h2.FINISHED;
                if (Intrinsics.areEqual(serializable, "CREATED")) {
                    return;
                }
                Log.m14479v("Analytics", "-- event was SDKLIFECYCLE -> flush() events");
                flush();
            }
        }
    }

    public final void configure$jumio_core_release() {
        synchronized (f13401f) {
            Companion.access$setInstance(INSTANCE, this);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void flush() {
        AnalyticsModel analyticsModel = this.f13405b;
        if (analyticsModel.f13418f && analyticsModel.f13419g) {
            m14420a(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBackendManager$jumio_core_release, reason: from getter */
    public final BackendManager getF13404a() {
        return this.f13404a;
    }

    @Override // com.jumio.core.network.ApiBinding
    @NotNull
    public Class<? extends ApiCall<?>>[] getBindingClasses() {
        return new Class[]{AnalyticsCall.class};
    }

    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onError(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Throwable error) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (Intrinsics.areEqual(apiCallDataModel.getCall(), AnalyticsCall.class)) {
            synchronized (this.f13408e) {
                ArrayList arrayList = (ArrayList) apiCallDataModel.getData().get("DATA_EVENTS");
                if (arrayList != null) {
                    this.f13405b.f13413a.addAll(0, arrayList);
                }
            }
        }
    }

    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object result) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Intrinsics.areEqual(apiCallDataModel.getCall(), AnalyticsCall.class);
    }

    public final void pause() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2 = this.f13407d;
        if (scheduledFuture2 == null || scheduledFuture2.isCancelled() || (scheduledFuture = this.f13407d) == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    public final void reporting(boolean canceled) {
        this.f13404a.reporting(this.f13405b.f13414b, canceled);
    }

    public final void start(boolean isEnabled, long time, int quota) {
        AnalyticsModel analyticsModel = this.f13405b;
        analyticsModel.f13419g = isEnabled;
        if (analyticsModel.f13418f || !isEnabled) {
            return;
        }
        analyticsModel.f13417e = time;
        analyticsModel.f13416d = quota;
        analyticsModel.f13418f = true;
        Log.m14463d("Analytics", "create new session Id: " + this.f13405b.f13415c);
        Log.m14479v("Analytics", "start with fixed rate at P=" + time + " ms");
        ScheduledFuture scheduledFuture = this.f13407d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        m14419a();
    }

    public final void resume() {
        m14419a();
    }

    public final void stop() {
        pause();
        this.f13405b.f13418f = false;
        synchronized (f13401f) {
            Companion.access$setInstance(INSTANCE, null);
            Unit unit = Unit.INSTANCE;
        }
        m14420a(true);
        this.f13404a.removeBinding(this);
    }

    /* JADX INFO: renamed from: a */
    public static final void m14418a(Analytics analytics) {
        analytics.m14420a(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m14420a(boolean z11) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f13408e) {
            arrayList.addAll(this.f13405b.f13413a);
            this.f13405b.f13413a.clear();
            Unit unit = Unit.INSTANCE;
        }
        if (arrayList.isEmpty()) {
            Log.m14479v("Analytics", "No pending events");
            return;
        }
        try {
            Log.m14479v("Analytics", "EventDispatcher.dispatchEvents()");
            this.f13404a.analytics(arrayList, z11);
        } catch (Exception e11) {
            Log.m14485w("Analytics", "Exception while event dispatch", e11);
            synchronized (this.f13408e) {
                this.f13405b.f13413a.addAll(0, arrayList);
            }
        }
    }
}
