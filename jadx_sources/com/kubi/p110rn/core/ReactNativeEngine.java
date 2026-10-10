package com.kubi.p110rn.core;

import android.app.Application;
import android.os.SystemClock;
import com.blankj.utilcode.util.C5287o0;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.exception.RNException;
import com.kubi.sdk.pkg.util.C23985b;
import java.lang.reflect.Type;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: ReactNativeEngine.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003345B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\rH\u0002J\t\u0010\u0014\u001a\u00020\u0015H\u0082\bJ\r\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0017J\t\u0010\u0018\u001a\u00020\u0015H\u0082\bJ\u0006\u0010\"\u001a\u00020#J\u000e\u0010+\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010,J\u000e\u0010.\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010,J\u0016\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005J\b\u00102\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020'@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00066"}, m90084d2 = {"Lcom/kubi/rn/core/ReactNativeEngine;", "", "<init>", "()V", "TAG", "", "STATE_NONE", "", "STATE_PREPARE", "STATE_SUCCESS", "STATE_FAILED", "STATE_DISABLE", "setting", "Lcom/kubi/rn/core/ReactNativeEngine$RemoteSetting;", "getSetting", "()Lcom/kubi/rn/core/ReactNativeEngine$RemoteSetting;", "setting$delegate", "Lkotlin/Lazy;", "getRemoteConfig", "mState", "isReady", "", "isDisable", "isDisable$BReactNativeLib_googleRelease", "isFailed", "autoStartDownload", "getAutoStartDownload", "()Z", "enableBundleManagerServer", "getEnableBundleManagerServer", "criticalBizList", "", "getCriticalBizList", "()Ljava/util/List;", "prepare", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "value", "Lcom/kubi/rn/core/ReactNativeEngine$EngineInitTimings;", "lastEngineInitTimings", "getLastEngineInitTimings", "()Lcom/kubi/rn/core/ReactNativeEngine$EngineInitTimings;", "initEngine", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "initSo", "isDisableBundle", Constants.BIZ, "entry", "addListeners", "RemoteSetting", "EngineInitTimings", "ReactSoftExceptionListener", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactNativeEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeEngine.kt\ncom/kubi/rn/core/ReactNativeEngine\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n+ 5 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,234:1\n92#1:255\n74#1:256\n35#2,4:235\n39#2:241\n44#3,2:239\n45#4,2:242\n45#4,2:252\n116#5,8:244\n125#5:254\n*S KotlinDebug\n*F\n+ 1 ReactNativeEngine.kt\ncom/kubi/rn/core/ReactNativeEngine\n*L\n165#1:255\n168#1:256\n60#1:235,4\n60#1:241\n60#1:239,2\n116#1:242,2\n146#1:252,2\n139#1:244,8\n139#1:254\n*E\n"})
public final class ReactNativeEngine {
    private static final int STATE_DISABLE = -1;
    private static final int STATE_FAILED = 3;
    private static final int STATE_NONE = 0;
    private static final int STATE_PREPARE = 1;
    private static final int STATE_SUCCESS = 2;

    @NotNull
    private static final String TAG = "ReactNativeEngine";
    private static volatile int mState;

    @NotNull
    public static final ReactNativeEngine INSTANCE = new ReactNativeEngine();

    /* JADX INFO: renamed from: setting$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy setting = LazyKt.lazy(new Function0() { // from class: com.kubi.rn.core.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReactNativeEngine.setting_delegate$lambda$0();
        }
    });

    @NotNull
    private static final InterfaceC44082a mutex = C44087f.m97144b(false, 1, null);

    @NotNull
    private static volatile EngineInitTimings lastEngineInitTimings = new EngineInitTimings(0, 0, 0, 0, 0, 0, 63, null);

    /* JADX INFO: compiled from: ReactNativeEngine.kt */
    /* JADX INFO: loaded from: classes39.dex */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/rn/core/ReactNativeEngine$EngineInitTimings;", "", "mutexWaitDur", "", "awaitReadyDur", "soLoaderDur", "newArchDur", "turboModuleDur", "initTotalDur", "<init>", "(JJJJJJ)V", "getMutexWaitDur", "()J", "getAwaitReadyDur", "getSoLoaderDur", "getNewArchDur", "getTurboModuleDur", "getInitTotalDur", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class EngineInitTimings {
        private final long awaitReadyDur;
        private final long initTotalDur;
        private final long mutexWaitDur;
        private final long newArchDur;
        private final long soLoaderDur;
        private final long turboModuleDur;

        public EngineInitTimings() {
            this(0L, 0L, 0L, 0L, 0L, 0L, 63, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EngineInitTimings)) {
                return false;
            }
            EngineInitTimings engineInitTimings = (EngineInitTimings) other;
            return this.mutexWaitDur == engineInitTimings.mutexWaitDur && this.awaitReadyDur == engineInitTimings.awaitReadyDur && this.soLoaderDur == engineInitTimings.soLoaderDur && this.newArchDur == engineInitTimings.newArchDur && this.turboModuleDur == engineInitTimings.turboModuleDur && this.initTotalDur == engineInitTimings.initTotalDur;
        }

        public EngineInitTimings(long j11, long j12, long j13, long j14, long j15, long j16) {
            this.mutexWaitDur = j11;
            this.awaitReadyDur = j12;
            this.soLoaderDur = j13;
            this.newArchDur = j14;
            this.turboModuleDur = j15;
            this.initTotalDur = j16;
        }

        public static /* synthetic */ EngineInitTimings copy$default(EngineInitTimings engineInitTimings, long j11, long j12, long j13, long j14, long j15, long j16, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = engineInitTimings.mutexWaitDur;
            }
            return engineInitTimings.copy(j11, (i11 & 2) != 0 ? engineInitTimings.awaitReadyDur : j12, (i11 & 4) != 0 ? engineInitTimings.soLoaderDur : j13, (i11 & 8) != 0 ? engineInitTimings.newArchDur : j14, (i11 & 16) != 0 ? engineInitTimings.turboModuleDur : j15, (i11 & 32) != 0 ? engineInitTimings.initTotalDur : j16);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getMutexWaitDur() {
            return this.mutexWaitDur;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getAwaitReadyDur() {
            return this.awaitReadyDur;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getSoLoaderDur() {
            return this.soLoaderDur;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getNewArchDur() {
            return this.newArchDur;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getTurboModuleDur() {
            return this.turboModuleDur;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getInitTotalDur() {
            return this.initTotalDur;
        }

        @NotNull
        public final EngineInitTimings copy(long mutexWaitDur, long awaitReadyDur, long soLoaderDur, long newArchDur, long turboModuleDur, long initTotalDur) {
            return new EngineInitTimings(mutexWaitDur, awaitReadyDur, soLoaderDur, newArchDur, turboModuleDur, initTotalDur);
        }

        public final long getAwaitReadyDur() {
            return this.awaitReadyDur;
        }

        public final long getInitTotalDur() {
            return this.initTotalDur;
        }

        public final long getMutexWaitDur() {
            return this.mutexWaitDur;
        }

        public final long getNewArchDur() {
            return this.newArchDur;
        }

        public final long getSoLoaderDur() {
            return this.soLoaderDur;
        }

        public final long getTurboModuleDur() {
            return this.turboModuleDur;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.mutexWaitDur) * 31) + Long.hashCode(this.awaitReadyDur)) * 31) + Long.hashCode(this.soLoaderDur)) * 31) + Long.hashCode(this.newArchDur)) * 31) + Long.hashCode(this.turboModuleDur)) * 31) + Long.hashCode(this.initTotalDur);
        }

        @NotNull
        public String toString() {
            return "EngineInitTimings(mutexWaitDur=" + this.mutexWaitDur + ", awaitReadyDur=" + this.awaitReadyDur + ", soLoaderDur=" + this.soLoaderDur + ", newArchDur=" + this.newArchDur + ", turboModuleDur=" + this.turboModuleDur + ", initTotalDur=" + this.initTotalDur + ')';
        }

        public /* synthetic */ EngineInitTimings(long j11, long j12, long j13, long j14, long j15, long j16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13, (i11 & 8) != 0 ? 0L : j14, (i11 & 16) != 0 ? 0L : j15, (i11 & 32) != 0 ? 0L : j16);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactNativeEngine$a */
    /* JADX INFO: compiled from: ReactNativeEngine.kt */
    /* JADX INFO: loaded from: classes39.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/core/ReactNativeEngine$ReactSoftExceptionListener;", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "<init>", "()V", "logSoftException", "", "category", "", "cause", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23221a implements ReactSoftExceptionLogger.ReactSoftExceptionListener {
        @Override // com.facebook.react.bridge.ReactSoftExceptionLogger.ReactSoftExceptionListener
        public void logSoftException(@NotNull String category, @NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(cause, "cause");
            C44128b.m97263g(category, cause);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactNativeEngine$b, reason: from toString */
    /* JADX INFO: compiled from: ReactNativeEngine.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/core/ReactNativeEngine$RemoteSetting;", "", "isEnable", "", "disableBundles", "", "", "autoStartDownload", "enableBundleManagerServer", "criticalBizList", "<init>", "(ZLjava/util/List;ZZLjava/util/List;)V", "()Z", "getDisableBundles", "()Ljava/util/List;", "getAutoStartDownload", "getEnableBundleManagerServer", "getCriticalBizList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RemoteSetting {

        /* JADX INFO: renamed from: a, reason: from toString */
        @SerializedName("default")
        public final boolean isEnable;

        /* JADX INFO: renamed from: b, reason: from toString */
        @SerializedName("disable_bundles")
        @NotNull
        public final List<String> disableBundles;

        /* JADX INFO: renamed from: c, reason: from toString */
        @SerializedName("startApplicationDownload")
        public final boolean autoStartDownload;

        /* JADX INFO: renamed from: d, reason: from toString */
        @SerializedName("enableBundleManagerServer")
        public final boolean enableBundleManagerServer;

        /* JADX INFO: renamed from: e, reason: from toString */
        @SerializedName("krnBundleDownloadV2CriticalBizList")
        @NotNull
        public final List<String> criticalBizList;

        public RemoteSetting() {
            this(false, null, false, false, null, 31, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteSetting)) {
                return false;
            }
            RemoteSetting remoteSetting = (RemoteSetting) other;
            return this.isEnable == remoteSetting.isEnable && Intrinsics.areEqual(this.disableBundles, remoteSetting.disableBundles) && this.autoStartDownload == remoteSetting.autoStartDownload && this.enableBundleManagerServer == remoteSetting.enableBundleManagerServer && Intrinsics.areEqual(this.criticalBizList, remoteSetting.criticalBizList);
        }

        public RemoteSetting(boolean z11, @NotNull List<String> disableBundles, boolean z12, boolean z13, @NotNull List<String> criticalBizList) {
            Intrinsics.checkNotNullParameter(disableBundles, "disableBundles");
            Intrinsics.checkNotNullParameter(criticalBizList, "criticalBizList");
            this.isEnable = z11;
            this.disableBundles = disableBundles;
            this.autoStartDownload = z12;
            this.enableBundleManagerServer = z13;
            this.criticalBizList = criticalBizList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAutoStartDownload() {
            return this.autoStartDownload;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<String> m55704b() {
            return this.criticalBizList;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<String> m55705c() {
            return this.disableBundles;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getEnableBundleManagerServer() {
            return this.enableBundleManagerServer;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsEnable() {
            return this.isEnable;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isEnable) * 31) + this.disableBundles.hashCode()) * 31) + Boolean.hashCode(this.autoStartDownload)) * 31) + Boolean.hashCode(this.enableBundleManagerServer)) * 31) + this.criticalBizList.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoteSetting(isEnable=" + this.isEnable + ", disableBundles=" + this.disableBundles + ", autoStartDownload=" + this.autoStartDownload + ", enableBundleManagerServer=" + this.enableBundleManagerServer + ", criticalBizList=" + this.criticalBizList + ')';
        }

        public /* synthetic */ RemoteSetting(boolean z11, List list, boolean z12, boolean z13, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? true : z13, (i11 & 16) != 0 ? CollectionsKt.listOf((Object[]) new String[]{"home", "marketstab", "krnbase", "trade_center", "asset_next", "litehome"}) : list2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactNativeEngine$initEngine$1 */
    /* JADX INFO: compiled from: ReactNativeEngine.kt */
    /* JADX INFO: loaded from: classes39.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactNativeEngine", m90122f = "ReactNativeEngine.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, m90124l = {240, 143, 169}, m90125m = "initEngine", m90126n = {"$this$withLock_u24default$iv", "mutexWaitStart", "$i$f$withLock", "$this$withLock_u24default$iv", "mutexWaitStart", "$i$f$withLock", "$i$a$-withLock$default-ReactNativeEngine$initEngine$2", "mutexWaitDur", "awaitReadyStart", "$this$withLock_u24default$iv", "stageTimings", "mutexWaitStart", "$i$f$withLock", "$i$a$-withLock$default-ReactNativeEngine$initEngine$2", "mutexWaitDur", "awaitReadyStart"}, m90127s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "I$1", "J$1", "J$2", "L$0", "L$1", "J$0", "I$0", "I$1", "J$1", "J$2"})
    public static final class C232231 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C232231(Continuation<? super C232231> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactNativeEngine.this.initEngine(this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.ReactNativeEngine$initSo$2 */
    /* JADX INFO: compiled from: ReactNativeEngine.kt */
    /* JADX INFO: loaded from: classes39.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.ReactNativeEngine$initSo$2", m90122f = "ReactNativeEngine.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nReactNativeEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeEngine.kt\ncom/kubi/rn/core/ReactNativeEngine$initSo$2\n+ 2 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,234:1\n45#2,2:235\n*S KotlinDebug\n*F\n+ 1 ReactNativeEngine.kt\ncom/kubi/rn/core/ReactNativeEngine$initSo$2\n*L\n207#1:235,2\n*E\n"})
    public static final class C232242 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
        int label;

        public C232242(Continuation<? super C232242> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232242(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
            return ((C232242) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    C23985b.f47489a.m57877e("initSo", "thread name:" + Thread.currentThread().getName());
                    ReactNativeEngine.mState = 2;
                    ReactNativeEngine.INSTANCE.addListeners();
                    z11 = true;
                } catch (Throwable th2) {
                    C43846g.m96568c(new RNException(th2, "initSo", false, null, 8, null), null, 2, null);
                    C44128b.m97262f(ReactNativeEngine.TAG, "so加载失败", th2);
                    ReactNativeEngine.mState = 3;
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListeners() {
        ReactSoftExceptionLogger.addListener(new C23221a());
    }

    private final RemoteSetting getRemoteConfig() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<RemoteSetting>() { // from class: com.kubi.rn.core.ReactNativeEngine$getRemoteConfig$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("krn_v2_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        RemoteSetting remoteSetting = (RemoteSetting) objM20457a;
        if (remoteSetting == null) {
            remoteSetting = new RemoteSetting(false, null, false, false, null, 31, null);
        }
        C43840a.m96550d("远程配置 " + remoteSetting.getIsEnable() + ':' + remoteSetting.m55705c(), RNConstantKt.RN_CATEGORY);
        return remoteSetting;
    }

    private final RemoteSetting getSetting() {
        return (RemoteSetting) setting.getValue();
    }

    private final boolean isFailed() {
        return mState == 3;
    }

    private final boolean isReady() {
        return mState == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteSetting setting_delegate$lambda$0() {
        return INSTANCE.getRemoteConfig();
    }

    @NotNull
    public final EngineInitTimings getLastEngineInitTimings() {
        return lastEngineInitTimings;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e0 A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011c A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0126 A[Catch: all -> 0x00e5, TRY_ENTER, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012b A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0133 A[Catch: all -> 0x00e5, TRY_ENTER, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #3 {all -> 0x00e5, blocks: (B:35:0x00ce, B:37:0x00e0, B:42:0x00ed, B:45:0x00f6, B:48:0x00ff, B:49:0x0103, B:51:0x011c, B:54:0x0126, B:56:0x012b, B:59:0x0133, B:62:0x013a), top: B:89:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x0161 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003b, B:66:0x0159, B:68:0x0161, B:72:0x016b, B:77:0x0179), top: B:86:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rg0.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.kubi.rn.core.RNApplicationInitGate] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r1v11, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.kubi.rn.core.ReactNativeEngine$initEngine$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.kubi.rn.core.ReactNativeEngine] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, rg0.a] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final Object initEngine(@NotNull Continuation<? super Integer> continuation) throws Throwable {
        ?? c232231;
        int i11;
        int i12;
        long j11;
        ?? r11;
        long jElapsedRealtime;
        long jElapsedRealtime2;
        Throwable th2;
        long j12;
        ?? r12;
        int i13;
        long j13;
        ?? r13;
        int i14;
        RNApplicationInitGate.InitStageTimings lastInitStageTimings;
        long soLoaderDur;
        long newArchDur;
        long turboModuleDur;
        long j14;
        ?? r14;
        ?? r15;
        ?? r16;
        if (continuation instanceof C232231) {
            C232231 c232232 = (C232231) continuation;
            int i15 = c232232.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c232232.label = i15 - Integer.MIN_VALUE;
                c232231 = c232232;
            } else {
                c232231 = new C232231(continuation);
            }
        } else {
            c232231 = new C232231(continuation);
        }
        Object objInit = c232231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = c232231.label;
        try {
            try {
                try {
                    if (i16 == 0) {
                        i11 = 302;
                        ResultKt.throwOnFailure(objInit);
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        ?? r17 = mutex;
                        c232231.L$0 = r17;
                        c232231.J$0 = jElapsedRealtime3;
                        c232231.I$0 = 0;
                        c232231.label = 1;
                        if (r17.mo91344d(null, c232231) != coroutine_suspended) {
                            i12 = 0;
                            j11 = jElapsedRealtime3;
                            r11 = r17;
                        }
                        return coroutine_suspended;
                    }
                    if (i16 != 1) {
                        if (i16 == 2) {
                            j12 = c232231.J$2;
                            long j15 = c232231.J$1;
                            int i17 = c232231.I$1;
                            i12 = c232231.I$0;
                            j11 = c232231.J$0;
                            i11 = 302;
                            InterfaceC44082a interfaceC44082a = (InterfaceC44082a) c232231.L$0;
                            try {
                                ResultKt.throwOnFailure(objInit);
                                jElapsedRealtime2 = j12;
                                i14 = i17;
                                j13 = j15;
                                r13 = interfaceC44082a;
                                try {
                                    lastInitStageTimings = RNApplicationInitGate.INSTANCE.getLastInitStageTimings();
                                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                                    if (lastInitStageTimings != null) {
                                        soLoaderDur = lastInitStageTimings.getSoLoaderDur();
                                    } else {
                                        soLoaderDur = 0;
                                    }
                                    if (lastInitStageTimings != null) {
                                        newArchDur = lastInitStageTimings.getNewArchDur();
                                    } else {
                                        newArchDur = 0;
                                    }
                                    if (lastInitStageTimings != null) {
                                        turboModuleDur = lastInitStageTimings.getTurboModuleDur();
                                    } else {
                                        turboModuleDur = 0;
                                    }
                                    j14 = j13;
                                    lastEngineInitTimings = new EngineInitTimings(j13, jElapsedRealtime4, soLoaderDur, newArchDur, turboModuleDur, lastInitStageTimings != null ? lastInitStageTimings.getTotalDur() : 0L);
                                    r14 = INSTANCE;
                                    if (r14.isDisable$BReactNativeLib_googleRelease()) {
                                        Integer numBoxInt = Boxing.boxInt(300);
                                        r13.mo91345e(null);
                                        return numBoxInt;
                                    }
                                    if (mState == 3) {
                                        Integer numBoxInt2 = Boxing.boxInt(i11);
                                        r13.mo91345e(null);
                                        return numBoxInt2;
                                    }
                                    if (mState != 2) {
                                        c232231.L$0 = r13;
                                        c232231.L$1 = SpillingKt.nullOutSpilledVariable(lastInitStageTimings);
                                        c232231.J$0 = j11;
                                        c232231.I$0 = i12;
                                        c232231.I$1 = i14;
                                        c232231.J$1 = j14;
                                        c232231.J$2 = jElapsedRealtime2;
                                        c232231.label = 3;
                                        objInit = r14.init(c232231);
                                        if (objInit != coroutine_suspended) {
                                            r15 = r13;
                                        }
                                        return coroutine_suspended;
                                    }
                                    r16 = r13;
                                    Integer numBoxInt3 = Boxing.boxInt(200);
                                    r16.mo91345e(null);
                                    return numBoxInt3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c232231 = r13;
                                    c232231.mo91345e(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                r12 = interfaceC44082a;
                                i13 = 3;
                                jElapsedRealtime = j15;
                                mState = i13;
                                C43846g.m96568c(new RNException(th2, "awaitApplicationInit", false, null, 8, null), null, 2, null);
                                lastEngineInitTimings = new EngineInitTimings(jElapsedRealtime, SystemClock.elapsedRealtime() - j12, 0L, 0L, 0L, 0L, 60, null);
                                Integer numBoxInt4 = Boxing.boxInt(i11);
                                r12.mo91345e(null);
                                return numBoxInt4;
                            }
                        }
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC44082a interfaceC44082a2 = (InterfaceC44082a) c232231.L$0;
                        ResultKt.throwOnFailure(objInit);
                        i11 = 302;
                        r15 = interfaceC44082a2;
                        r16 = r15;
                        if (!((Boolean) objInit).booleanValue()) {
                            Integer numBoxInt5 = Boxing.boxInt(i11);
                            r15.mo91345e(null);
                            return numBoxInt5;
                        }
                        Integer numBoxInt6 = Boxing.boxInt(200);
                        r16.mo91345e(null);
                        return numBoxInt6;
                    }
                    i11 = 302;
                    int i18 = c232231.I$0;
                    long j16 = c232231.J$0;
                    InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) c232231.L$0;
                    ResultKt.throwOnFailure(objInit);
                    i12 = i18;
                    j11 = j16;
                    r11 = interfaceC44082a3;
                    ?? r18 = RNApplicationInitGate.INSTANCE;
                    Application applicationM6331a = C5287o0.m6331a();
                    Intrinsics.checkNotNullExpressionValue(applicationM6331a, "getApp(...)");
                    c232231.L$0 = r11;
                    c232231.J$0 = j11;
                    c232231.I$0 = i12;
                    c232231.I$1 = 0;
                    c232231.J$1 = jElapsedRealtime;
                    c232231.J$2 = jElapsedRealtime2;
                    c232231.label = 2;
                    if (r18.awaitReady(applicationM6331a, "ReactNativeEngine.initEngine", c232231) != coroutine_suspended) {
                        j13 = jElapsedRealtime;
                        r13 = r11;
                        i14 = 0;
                        lastInitStageTimings = RNApplicationInitGate.INSTANCE.getLastInitStageTimings();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (lastInitStageTimings != null) {
                            soLoaderDur = lastInitStageTimings.getSoLoaderDur();
                        } else {
                            soLoaderDur = 0;
                        }
                        if (lastInitStageTimings != null) {
                            newArchDur = lastInitStageTimings.getNewArchDur();
                        } else {
                            newArchDur = 0;
                        }
                        if (lastInitStageTimings != null) {
                            turboModuleDur = lastInitStageTimings.getTurboModuleDur();
                        } else {
                            turboModuleDur = 0;
                        }
                        j14 = j13;
                        lastEngineInitTimings = new EngineInitTimings(j13, jElapsedRealtime5, soLoaderDur, newArchDur, turboModuleDur, lastInitStageTimings != null ? lastInitStageTimings.getTotalDur() : 0L);
                        r14 = INSTANCE;
                        if (r14.isDisable$BReactNativeLib_googleRelease()) {
                            Integer numBoxInt7 = Boxing.boxInt(300);
                            r13.mo91345e(null);
                            return numBoxInt7;
                        }
                        if (mState == 3) {
                            Integer numBoxInt8 = Boxing.boxInt(i11);
                            r13.mo91345e(null);
                            return numBoxInt8;
                        }
                        if (mState != 2) {
                            r16 = r13;
                        } else {
                            c232231.L$0 = r13;
                            c232231.L$1 = SpillingKt.nullOutSpilledVariable(lastInitStageTimings);
                            c232231.J$0 = j11;
                            c232231.I$0 = i12;
                            c232231.I$1 = i14;
                            c232231.J$1 = j14;
                            c232231.J$2 = jElapsedRealtime2;
                            c232231.label = 3;
                            objInit = r14.init(c232231);
                            if (objInit != coroutine_suspended) {
                                r15 = r13;
                                r16 = r15;
                                if (!((Boolean) objInit).booleanValue()) {
                                    Integer numBoxInt9 = Boxing.boxInt(i11);
                                    r15.mo91345e(null);
                                    return numBoxInt9;
                                }
                            }
                        }
                        Integer numBoxInt10 = Boxing.boxInt(200);
                        r16.mo91345e(null);
                        return numBoxInt10;
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th2 = th5;
                    j12 = jElapsedRealtime2;
                    r12 = r11;
                    i13 = 3;
                    mState = i13;
                    C43846g.m96568c(new RNException(th2, "awaitApplicationInit", false, null, 8, null), null, 2, null);
                    lastEngineInitTimings = new EngineInitTimings(jElapsedRealtime, SystemClock.elapsedRealtime() - j12, 0L, 0L, 0L, 0L, 60, null);
                    Integer numBoxInt11 = Boxing.boxInt(i11);
                    r12.mo91345e(null);
                    return numBoxInt11;
                }
                jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
            } catch (Throwable th6) {
                th = th6;
                c232231 = r11;
                c232231.mo91345e(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final boolean isDisableBundle(@NotNull String biz, @NotNull String entry) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return getSetting().m55705c().contains(biz + '-' + entry);
    }

    private ReactNativeEngine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initSo(Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new C232242(null), continuation);
    }

    public final boolean getAutoStartDownload() {
        return getSetting().getAutoStartDownload();
    }

    @NotNull
    public final List<String> getCriticalBizList() {
        return getSetting().m55704b();
    }

    public final boolean getEnableBundleManagerServer() {
        return getSetting().getEnableBundleManagerServer();
    }

    @Nullable
    public final Object init(@NotNull Continuation<? super Boolean> continuation) {
        boolean z11 = false;
        if (isDisable$BReactNativeLib_googleRelease()) {
            mState = -1;
            return Boxing.boxBoolean(false);
        }
        int i11 = mState;
        if (i11 != -1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    mState = 1;
                    return initSo(continuation);
                }
            } else {
                z11 = true;
            }
        }
        return Boxing.boxBoolean(z11);
    }

    public final boolean isDisable$BReactNativeLib_googleRelease() {
        return !getSetting().getIsEnable();
    }

    public final void prepare() {
    }
}
