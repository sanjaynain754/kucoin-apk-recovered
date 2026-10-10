package com.kubi.p110rn.core;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.MimeTypes;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.lang.reflect.Type;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RNApplicationInitGate.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0005J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, m90084d2 = {"Lcom/kubi/rn/core/RNApplicationInitGate;", "", "<init>", "()V", "TAG", "", "REMOTE_CONFIG_KEY", "scope", "Lkotlinx/coroutines/CoroutineScope;", "stateLock", "runtimeInitialized", "", "asyncInitDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlin/Result;", "", "value", "Lcom/kubi/rn/core/RNApplicationInitGate$InitStageTimings;", "lastInitStageTimings", "getLastInitStageTimings", "()Lcom/kubi/rn/core/RNApplicationInitGate$InitStageTimings;", "onApplicationCreate", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "source", "awaitReady", "(Landroid/app/Application;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAsync", "initializeNow", "shouldAsyncInit", "useTurboModulesOnMainThread", "info", "message", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "throwable", "", "now", "", "completedDeferred", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "durationSince", "startAt", "InitStageTimings", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNApplicationInitGate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNApplicationInitGate.kt\ncom/kubi/rn/core/RNApplicationInitGate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,238:1\n1#2:239\n35#3,4:240\n39#3:246\n44#4,2:244\n*S KotlinDebug\n*F\n+ 1 RNApplicationInitGate.kt\ncom/kubi/rn/core/RNApplicationInitGate\n*L\n189#1:240,4\n189#1:246\n189#1:244,2\n*E\n"})
public final class RNApplicationInitGate {

    @NotNull
    private static final String REMOTE_CONFIG_KEY = "kc_rn_new_arch_async_init";

    @NotNull
    private static final String TAG = "RNApplicationInitGate";

    @Nullable
    private static volatile InterfaceC41769w<Result<Unit>> asyncInitDeferred;

    @Nullable
    private static volatile InitStageTimings lastInitStageTimings;
    private static volatile boolean runtimeInitialized;

    @NotNull
    public static final RNApplicationInitGate INSTANCE = new RNApplicationInitGate();

    @NotNull
    private static final InterfaceC41709m0 scope = C41713n0.m91125a(new CoroutineName("rn_application_init").plus(C42911a.m94120b()));

    @NotNull
    private static final Object stateLock = new Object();

    /* JADX INFO: compiled from: RNApplicationInitGate.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/core/RNApplicationInitGate$InitStageTimings;", "", "soLoaderDur", "", "newArchDur", "turboModuleDur", "totalDur", "<init>", "(JJJJ)V", "getSoLoaderDur", "()J", "getNewArchDur", "getTurboModuleDur", "getTotalDur", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class InitStageTimings {
        private final long newArchDur;
        private final long soLoaderDur;
        private final long totalDur;
        private final long turboModuleDur;

        public InitStageTimings() {
            this(0L, 0L, 0L, 0L, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitStageTimings)) {
                return false;
            }
            InitStageTimings initStageTimings = (InitStageTimings) other;
            return this.soLoaderDur == initStageTimings.soLoaderDur && this.newArchDur == initStageTimings.newArchDur && this.turboModuleDur == initStageTimings.turboModuleDur && this.totalDur == initStageTimings.totalDur;
        }

        public InitStageTimings(long j11, long j12, long j13, long j14) {
            this.soLoaderDur = j11;
            this.newArchDur = j12;
            this.turboModuleDur = j13;
            this.totalDur = j14;
        }

        public static /* synthetic */ InitStageTimings copy$default(InitStageTimings initStageTimings, long j11, long j12, long j13, long j14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = initStageTimings.soLoaderDur;
            }
            long j15 = j11;
            if ((i11 & 2) != 0) {
                j12 = initStageTimings.newArchDur;
            }
            long j16 = j12;
            if ((i11 & 4) != 0) {
                j13 = initStageTimings.turboModuleDur;
            }
            return initStageTimings.copy(j15, j16, j13, (i11 & 8) != 0 ? initStageTimings.totalDur : j14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSoLoaderDur() {
            return this.soLoaderDur;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getNewArchDur() {
            return this.newArchDur;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTurboModuleDur() {
            return this.turboModuleDur;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTotalDur() {
            return this.totalDur;
        }

        @NotNull
        public final InitStageTimings copy(long soLoaderDur, long newArchDur, long turboModuleDur, long totalDur) {
            return new InitStageTimings(soLoaderDur, newArchDur, turboModuleDur, totalDur);
        }

        public final long getNewArchDur() {
            return this.newArchDur;
        }

        public final long getSoLoaderDur() {
            return this.soLoaderDur;
        }

        public final long getTotalDur() {
            return this.totalDur;
        }

        public final long getTurboModuleDur() {
            return this.turboModuleDur;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.soLoaderDur) * 31) + Long.hashCode(this.newArchDur)) * 31) + Long.hashCode(this.turboModuleDur)) * 31) + Long.hashCode(this.totalDur);
        }

        @NotNull
        public String toString() {
            return "InitStageTimings(soLoaderDur=" + this.soLoaderDur + ", newArchDur=" + this.newArchDur + ", turboModuleDur=" + this.turboModuleDur + ", totalDur=" + this.totalDur + ')';
        }

        public /* synthetic */ InitStageTimings(long j11, long j12, long j13, long j14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13, (i11 & 8) != 0 ? 0L : j14);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.RNApplicationInitGate$awaitReady$1 */
    /* JADX INFO: compiled from: RNApplicationInitGate.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.RNApplicationInitGate", m90122f = "RNApplicationInitGate.kt", m90123i = {0, 0, 0, 0}, m90124l = {90}, m90125m = "awaitReady", m90126n = {MimeTypes.BASE_TYPE_APPLICATION, "source", "deferred", "startAt"}, m90127s = {"L$0", "L$1", "L$2", "J$0"})
    public static final class C232171 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C232171(Continuation<? super C232171> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RNApplicationInitGate.this.awaitReady(null, null, this);
        }
    }

    private final InterfaceC41769w<Result<Unit>> completedDeferred(Object obj) {
        InterfaceC41769w<Result<Unit>> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        interfaceC41769wM91388c.mo91370n(Result.m103843boximpl(obj));
        return interfaceC41769wM91388c;
    }

    public static /* synthetic */ Object awaitReady$default(RNApplicationInitGate rNApplicationInitGate, Application application, String str, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "unknown";
        }
        return rNApplicationInitGate.awaitReady(application, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error(String message, Throwable throwable) {
        C44128b.m97262f(TAG, message, throwable);
        C43840a.m96548b(message + ", error=" + throwable.getMessage(), TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void info(String message) {
        C44128b.m97266j(TAG, message);
        C43840a.m96550d(message, TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeNow(Application application) {
        long jDurationSince;
        if (runtimeInitialized) {
            info("[initializeNow] runtime already initialized");
            return;
        }
        synchronized (stateLock) {
            if (runtimeInitialized) {
                INSTANCE.info("[initializeNow] runtime already initialized in lock");
                return;
            }
            RNApplicationInitGate rNApplicationInitGate = INSTANCE;
            long jNow = rNApplicationInitGate.now();
            rNApplicationInitGate.info("[initializeNow] init start, thread=" + Thread.currentThread().getName());
            long jNow2 = rNApplicationInitGate.now();
            SoLoader.init(application, OpenSourceMergedSoMapping.INSTANCE);
            long jDurationSince2 = rNApplicationInitGate.durationSince(jNow2);
            rNApplicationInitGate.info("[initializeNow] SoLoader.init finish, cost=" + jDurationSince2 + "ms");
            long jNow3 = rNApplicationInitGate.now();
            DefaultNewArchitectureEntryPoint.load(true, true, false);
            long jDurationSince3 = rNApplicationInitGate.durationSince(jNow3);
            rNApplicationInitGate.info("[initializeNow] DefaultNewArchitectureEntryPoint.load finish, cost=" + jDurationSince3 + "ms");
            try {
                jNow3 = rNApplicationInitGate.now();
                rNApplicationInitGate.useTurboModulesOnMainThread();
                jDurationSince = rNApplicationInitGate.durationSince(jNow3);
                rNApplicationInitGate.info("[initializeNow] ReactNativeFeatureFlags.useTurboModules finish, cost=" + jDurationSince + "ms");
            } catch (Exception e11) {
                RNApplicationInitGate rNApplicationInitGate2 = INSTANCE;
                jDurationSince = rNApplicationInitGate2.durationSince(jNow3);
                rNApplicationInitGate2.error("[initializeNow] ReactNativeFeatureFlags.useTurboModules failed, cost=" + jDurationSince + "ms", e11);
            }
            runtimeInitialized = true;
            RNApplicationInitGate rNApplicationInitGate3 = INSTANCE;
            long jDurationSince4 = rNApplicationInitGate3.durationSince(jNow);
            lastInitStageTimings = new InitStageTimings(jDurationSince2, jDurationSince3, jDurationSince, jDurationSince4);
            rNApplicationInitGate3.info("[initializeNow] init finish, totalCost=" + jDurationSince4 + "ms");
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void onApplicationCreate$default(RNApplicationInitGate rNApplicationInitGate, Application application, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "RNApplication.onCreate";
        }
        rNApplicationInitGate.onApplicationCreate(application, str);
    }

    private final boolean shouldAsyncInit() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<Boolean>() { // from class: com.kubi.rn.core.RNApplicationInitGate$shouldAsyncInit$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a(REMOTE_CONFIG_KEY, type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, true);
        info("[shouldAsyncInit] newArch=true, key=kc_rn_new_arch_async_init, enabled=" + zM66567e);
        return zM66567e;
    }

    private final InterfaceC41769w<Result<Unit>> startAsync(Application application) {
        InterfaceC41769w<Result<Unit>> interfaceC41769w = asyncInitDeferred;
        if (interfaceC41769w != null) {
            return interfaceC41769w;
        }
        synchronized (stateLock) {
            if (runtimeInitialized) {
                RNApplicationInitGate rNApplicationInitGate = INSTANCE;
                Result.Companion companion = Result.INSTANCE;
                return rNApplicationInitGate.completedDeferred(Result.m103844constructorimpl(Unit.INSTANCE));
            }
            InterfaceC41769w<Result<Unit>> interfaceC41769w2 = asyncInitDeferred;
            if (interfaceC41769w2 != null) {
                return interfaceC41769w2;
            }
            InterfaceC41769w<Result<Unit>> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            asyncInitDeferred = interfaceC41769wM91388c;
            INSTANCE.info("[startAsync] launch background init");
            C41696j.m91104d(scope, null, null, new RNApplicationInitGate$startAsync$2$2(interfaceC41769wM91388c, application, null), 3, null);
            return interfaceC41769wM91388c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object awaitReady(@NotNull Application application, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        C232171 c232171;
        String str2;
        long j11;
        if (continuation instanceof C232171) {
            c232171 = (C232171) continuation;
            int i11 = c232171.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c232171.label = i11 - Integer.MIN_VALUE;
            } else {
                c232171 = new C232171(continuation);
            }
        } else {
            c232171 = new C232171(continuation);
        }
        Object objMo91198h = c232171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c232171.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo91198h);
            long jNow = now();
            if (!shouldAsyncInit()) {
                info('[' + str + "] async init disabled, initialize on current thread");
                initializeNow(application);
                info('[' + str + "] sync init finished, cost=" + durationSince(jNow) + "ms");
                return Unit.INSTANCE;
            }
            if (runtimeInitialized) {
                info('[' + str + "] runtime already initialized, cost=0ms");
                return Unit.INSTANCE;
            }
            info('[' + str + "] await async init start");
            InterfaceC41769w<Result<Unit>> interfaceC41769wStartAsync = startAsync(application);
            c232171.L$0 = SpillingKt.nullOutSpilledVariable(application);
            c232171.L$1 = str;
            c232171.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41769wStartAsync);
            c232171.J$0 = jNow;
            c232171.label = 1;
            objMo91198h = interfaceC41769wStartAsync.mo91198h(c232171);
            if (objMo91198h == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            j11 = jNow;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = c232171.J$0;
            str2 = (String) c232171.L$1;
            ResultKt.throwOnFailure(objMo91198h);
        }
        Object value = ((Result) objMo91198h).getValue();
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
        if (thM103847exceptionOrNullimpl != null) {
            RNApplicationInitGate rNApplicationInitGate = INSTANCE;
            rNApplicationInitGate.error('[' + str2 + "] await async init failed, cost=" + rNApplicationInitGate.durationSince(j11) + "ms", thM103847exceptionOrNullimpl);
        } else {
            info('[' + str2 + "] await async init finished, cost=" + durationSince(j11) + "ms");
        }
        ResultKt.throwOnFailure(value);
        return Unit.INSTANCE;
    }

    @Nullable
    public final InitStageTimings getLastInitStageTimings() {
        return lastInitStageTimings;
    }

    public final void onApplicationCreate(@NotNull Application application, @NotNull String source) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(source, "source");
        if (shouldAsyncInit()) {
            info('[' + source + "] async init enabled, start in background");
            startAsync(application);
            return;
        }
        info('[' + source + "] async init disabled, init on current thread");
        initializeNow(application);
    }

    private RNApplicationInitGate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long durationSince(long startAt) {
        return now() - startAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void useTurboModulesOnMainThread() throws Exception {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            ReactNativeFeatureFlags.useTurboModules();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.kubi.rn.core.d
            @Override // java.lang.Runnable
            public final void run() {
                RNApplicationInitGate.useTurboModulesOnMainThread$lambda$5(objectRef, countDownLatch);
            }
        });
        countDownLatch.await();
        Exception exc = (Exception) objectRef.element;
        if (exc == null) {
        } else {
            throw exc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Exception] */
    public static final void useTurboModulesOnMainThread$lambda$5(Ref.ObjectRef objectRef, CountDownLatch countDownLatch) {
        try {
            ReactNativeFeatureFlags.useTurboModules();
        } catch (Exception e11) {
            objectRef.element = e11;
        } finally {
            countDownLatch.countDown();
        }
    }
}
