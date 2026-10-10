package com.kubi.p110rn.core.pageopen;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.performance.pageopen.ElapsedRealtimePageOpenClock;
import com.kubi.sdk.performance.pageopen.PageOpenClock;
import com.kubi.sdk.performance.pageopen.PageOpenPhaseTimings;
import com.kubi.sdk.performance.pageopen.PageOpenResult;
import com.kubi.sdk.performance.pageopen.PageOpenStageRecord;
import com.kubi.sdk.performance.pageopen.PageOpenTrace;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0003=>?B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\tH\u0016J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016JO\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0002\u0010\"J/\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010$JG\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0002\u0010'J \u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u000eH\u0016J \u0010-\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J&\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016J$\u00102\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\f\u00103\u001a\b\u0012\u0004\u0012\u00020100J6\u00104\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u001e\u00103\u001a\u001a\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001100\u0012\u0004\u0012\u00020105J \u00107\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0016\u00108\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u00109\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\tJ\u0018\u0010:\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u001e\u0010;\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010<\u001a\u0002012\u0006\u0010&\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryAccess;", "clock", "Lcom/kubi/sdk/performance/pageopen/PageOpenClock;", "<init>", "(Lcom/kubi/sdk/performance/pageopen/PageOpenClock;)V", "containerOwners", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "traces", "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$RegisteredTrace;", "completedExternalTraceIds", "Ljava/util/LinkedHashSet;", "", "completedLock", "register", "", "rootTag", "ownerToken", "trace", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;", "find", "remove", "expected", "finishContainerEntry", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "cacheHit", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "externalStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Z", "recordDataReady", "(ILjava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;Ljava/lang/Boolean;)Z", "completeContainerEntry", "registered", "(ILcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$RegisteredTrace;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Z", "finishAndRemove", "isContainerActive", "unregisterContainer", "tryMarkExternalCompleted", "pageTraceId", "armTimeoutAfterBind", "attachTerminalListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "attachVisibleFrameScheduler", "scheduler", "attachTimeoutScheduler", "Lkotlin/Function2;", "", "isTimeoutTargetActive", "recordRenderReady", "recordVisibleFrame", "recordFirstFrameAndDrainPending", "timeout", "notifyTerminal", "RegisteredTrace", "PendingFinish", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKrnPageOpenRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KrnPageOpenRegistry.kt\ncom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,672:1\n1#2:673\n*E\n"})
public final class KrnPageOpenRegistryStore implements KrnPageOpenRegistryAccess {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_COMPLETED_TRACE_IDS = 512;

    @Deprecated
    @NotNull
    public static final String TAG = "KrnPageOpenRegistry";

    @NotNull
    private final PageOpenClock clock;

    @NotNull
    private final LinkedHashSet<String> completedExternalTraceIds;

    @NotNull
    private final Object completedLock;

    @NotNull
    private final ConcurrentHashMap<Integer, Object> containerOwners;

    @NotNull
    private final ConcurrentHashMap<Integer, C23335b> traces;

    /* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$Companion;", "", "<init>", "()V", "TAG", "", "MAX_COMPLETED_TRACE_IDS", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.pageopen.KrnPageOpenRegistryStore$a, reason: from toString */
    /* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J@\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$PendingFinish;", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "cacheHit", "", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "externalStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "<init>", "(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)V", "getResult", "()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "getCacheHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhaseTimings", "()Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "getExternalStages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$PendingFinish;", "equals", "other", "hashCode", "", "toString", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PendingFinish {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final PageOpenResult result;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Boolean cacheHit;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final PageOpenPhaseTimings phaseTimings;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final List<PageOpenStageRecord> externalStages;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingFinish)) {
                return false;
            }
            PendingFinish pendingFinish = (PendingFinish) other;
            return this.result == pendingFinish.result && Intrinsics.areEqual(this.cacheHit, pendingFinish.cacheHit) && Intrinsics.areEqual(this.phaseTimings, pendingFinish.phaseTimings) && Intrinsics.areEqual(this.externalStages, pendingFinish.externalStages);
        }

        public PendingFinish(@NotNull PageOpenResult result, @Nullable Boolean bool, @Nullable PageOpenPhaseTimings pageOpenPhaseTimings, @NotNull List<PageOpenStageRecord> externalStages) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(externalStages, "externalStages");
            this.result = result;
            this.cacheHit = bool;
            this.phaseTimings = pageOpenPhaseTimings;
            this.externalStages = externalStages;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getCacheHit() {
            return this.cacheHit;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<PageOpenStageRecord> m55817b() {
            return this.externalStages;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final PageOpenPhaseTimings getPhaseTimings() {
            return this.phaseTimings;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final PageOpenResult getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            Boolean bool = this.cacheHit;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            PageOpenPhaseTimings pageOpenPhaseTimings = this.phaseTimings;
            return ((iHashCode2 + (pageOpenPhaseTimings != null ? pageOpenPhaseTimings.hashCode() : 0)) * 31) + this.externalStages.hashCode();
        }

        @NotNull
        public String toString() {
            return "PendingFinish(result=" + this.result + ", cacheHit=" + this.cacheHit + ", phaseTimings=" + this.phaseTimings + ", externalStages=" + this.externalStages + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.pageopen.KrnPageOpenRegistryStore$b */
    /* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR4\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010&\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$RegisteredTrace;", "", "ownerToken", "trace", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;", "<init>", "(Ljava/lang/Object;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;)V", "getOwnerToken", "()Ljava/lang/Object;", "getTrace", "()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;", "firstFrameGate", "Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;", "getFirstFrameGate", "()Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;", "firstFrameRecorded", "", "getFirstFrameRecorded", "()Z", "setFirstFrameRecorded", "(Z)V", "visibleFrameScheduler", "Lkotlin/Function0;", "", "getVisibleFrameScheduler", "()Lkotlin/jvm/functions/Function0;", "setVisibleFrameScheduler", "(Lkotlin/jvm/functions/Function0;)V", "timeoutScheduler", "Lkotlin/Function2;", "", "getTimeoutScheduler", "()Lkotlin/jvm/functions/Function2;", "setTimeoutScheduler", "(Lkotlin/jvm/functions/Function2;)V", "terminalListener", "getTerminalListener", "setTerminalListener", "timeoutArmed", "getTimeoutArmed", "setTimeoutArmed", "pendingFinish", "Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$PendingFinish;", "getPendingFinish", "()Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$PendingFinish;", "setPendingFinish", "(Lcom/kubi/rn/core/pageopen/KrnPageOpenRegistryStore$PendingFinish;)V", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23335b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Object f45698a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final PageOpenTrace f45699b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final PageOpenFirstFrameGate f45700c;

        /* JADX INFO: renamed from: d */
        public boolean f45701d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public Function0<Unit> f45702e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public Function2<? super Long, ? super Function0<Boolean>, Unit> f45703f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Function0<Unit> f45704g;

        /* JADX INFO: renamed from: h */
        public boolean f45705h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public PendingFinish f45706i;

        public C23335b(@NotNull Object ownerToken, @NotNull PageOpenTrace trace) {
            Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
            Intrinsics.checkNotNullParameter(trace, "trace");
            this.f45698a = ownerToken;
            this.f45699b = trace;
            this.f45700c = new PageOpenFirstFrameGate();
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PageOpenFirstFrameGate getF45700c() {
            return this.f45700c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF45701d() {
            return this.f45701d;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Object getF45698a() {
            return this.f45698a;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final PendingFinish getF45706i() {
            return this.f45706i;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final Function0<Unit> m55824e() {
            return this.f45704g;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getF45705h() {
            return this.f45705h;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final Function2<Long, Function0<Boolean>, Unit> m55826g() {
            return this.f45703f;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final PageOpenTrace getF45699b() {
            return this.f45699b;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final Function0<Unit> m55828i() {
            return this.f45702e;
        }

        /* JADX INFO: renamed from: j */
        public final void m55829j(boolean z11) {
            this.f45701d = z11;
        }

        /* JADX INFO: renamed from: k */
        public final void m55830k(@Nullable PendingFinish pendingFinish) {
            this.f45706i = pendingFinish;
        }

        /* JADX INFO: renamed from: l */
        public final void m55831l(@Nullable Function0<Unit> function0) {
            this.f45704g = function0;
        }

        /* JADX INFO: renamed from: m */
        public final void m55832m(boolean z11) {
            this.f45705h = z11;
        }

        /* JADX INFO: renamed from: n */
        public final void m55833n(@Nullable Function2<? super Long, ? super Function0<Boolean>, Unit> function2) {
            this.f45703f = function2;
        }

        /* JADX INFO: renamed from: o */
        public final void m55834o(@Nullable Function0<Unit> function0) {
            this.f45702e = function0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KrnPageOpenRegistryStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTimeoutTargetActive(int i11, Object obj, C23335b c23335b) {
        boolean z11;
        synchronized (c23335b) {
            z11 = this.traces.get(Integer.valueOf(i11)) == c23335b && c23335b.getF45698a() == obj && c23335b.getF45705h() && !c23335b.getF45699b().m57376l();
        }
        return z11;
    }

    private final void notifyTerminal(C23335b c23335b) {
        Unit unit;
        Function0<Unit> function0M55824e;
        Object objM103844constructorimpl;
        synchronized (c23335b) {
            unit = null;
            c23335b.m55834o(null);
            c23335b.m55833n(null);
            function0M55824e = c23335b.m55824e();
            c23335b.m55831l(null);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (function0M55824e != null) {
                function0M55824e.invoke();
                unit = Unit.INSTANCE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n(TAG, "PageOpen terminal listener failed");
        }
    }

    /* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FirstFrameGateAction.values().length];
            try {
                iArr[FirstFrameGateAction.REQUEST_VISIBLE_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirstFrameGateAction.RECORD_FIRST_FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KrnPageOpenRegistryStore(@NotNull PageOpenClock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
        this.containerOwners = new ConcurrentHashMap<>();
        this.traces = new ConcurrentHashMap<>();
        this.completedExternalTraceIds = new LinkedHashSet<>();
        this.completedLock = new Object();
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean armTimeoutAfterBind(final int rootTag, @NotNull final Object ownerToken, @NotNull PageOpenTrace expected) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        final C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken || c23335b.getF45699b() != expected || !expected.m57375k()) {
            return false;
        }
        synchronized (c23335b) {
            if (c23335b.getF45705h()) {
                return true;
            }
            Function2<Long, Function0<Boolean>, Unit> function2M55826g = c23335b.m55826g();
            if (function2M55826g == null) {
                return false;
            }
            c23335b.m55832m(true);
            long jCoerceAtLeast = RangesKt.coerceAtLeast(expected.getF47204a().getTimeoutMs() - (this.clock.mo57396a() - expected.getF47204a().getStartedAtMs()), 0L);
            Unit unit = Unit.INSTANCE;
            function2M55826g.invoke(Long.valueOf(jCoerceAtLeast), new Function0() { // from class: com.kubi.rn.core.pageopen.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.f45708b.isTimeoutTargetActive(rootTag, ownerToken, c23335b));
                }
            });
            return true;
        }
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean attachTerminalListener(int rootTag, @NotNull Object ownerToken, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        boolean z11 = false;
        if (c23335b == null) {
            return false;
        }
        synchronized (c23335b) {
            if (this.traces.get(Integer.valueOf(rootTag)) == c23335b && c23335b.getF45698a() == ownerToken && !c23335b.getF45699b().m57376l()) {
                c23335b.m55831l(listener);
                z11 = true;
            }
        }
        return z11;
    }

    public final boolean attachTimeoutScheduler(final int rootTag, @NotNull final Object ownerToken, @NotNull Function2<? super Long, ? super Function0<Boolean>, Unit> scheduler) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        final C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken) {
            return false;
        }
        synchronized (c23335b) {
            try {
                if (this.traces.get(Integer.valueOf(rootTag)) == c23335b && c23335b.getF45698a() == ownerToken && !c23335b.getF45699b().m57376l()) {
                    c23335b.m55833n(scheduler);
                    if (!c23335b.getF45699b().m57375k() || c23335b.getF45705h()) {
                        lValueOf = null;
                    } else {
                        c23335b.m55832m(true);
                        lValueOf = Long.valueOf(RangesKt.coerceAtLeast(c23335b.getF45699b().getF47204a().getTimeoutMs() - (this.clock.mo57396a() - c23335b.getF45699b().getF47204a().getStartedAtMs()), 0L));
                    }
                    Unit unit = Unit.INSTANCE;
                    if (lValueOf != null) {
                        scheduler.invoke(Long.valueOf(lValueOf.longValue()), new Function0() { // from class: com.kubi.rn.core.pageopen.c
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(this.f45712b.isTimeoutTargetActive(rootTag, ownerToken, c23335b));
                            }
                        });
                    }
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean attachVisibleFrameScheduler(int rootTag, @NotNull Object ownerToken, @NotNull Function0<Unit> scheduler) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken) {
            return false;
        }
        synchronized (c23335b) {
            c23335b.m55834o(scheduler);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    @Nullable
    public PageOpenTrace find(int rootTag, @NotNull Object ownerToken) {
        C23335b c23335b;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        if (rootTag <= 0 || (c23335b = this.traces.get(Integer.valueOf(rootTag))) == null) {
            return null;
        }
        PageOpenTrace f45699b = c23335b.getF45699b();
        if (c23335b.getF45698a() == ownerToken) {
            return f45699b;
        }
        return null;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean finishAndRemove(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenResult result) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(result, "result");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken || !this.traces.remove(Integer.valueOf(rootTag), c23335b)) {
            return false;
        }
        boolean zM57369h = PageOpenTrace.m57369h(c23335b.getF45699b(), result, null, null, null, 14, null);
        notifyTerminal(c23335b);
        return zM57369h;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean finishContainerEntry(int i11, @NotNull Object ownerToken, @NotNull PageOpenTrace expected, @NotNull PageOpenResult result, @Nullable Boolean bool, @Nullable PageOpenPhaseTimings pageOpenPhaseTimings, @NotNull List<PageOpenStageRecord> externalStages) {
        boolean z11;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(externalStages, "externalStages");
        C23335b c23335b = this.traces.get(Integer.valueOf(i11));
        boolean z12 = false;
        if (c23335b == null || c23335b.getF45698a() != ownerToken || c23335b.getF45699b() != expected) {
            return false;
        }
        if (result == PageOpenResult.SUCCESS) {
            Boolean boolValueOf = null;
            if ((pageOpenPhaseTimings != null ? pageOpenPhaseTimings.getDataPhaseMs() : null) != null) {
                z11 = false;
            } else {
                if ((pageOpenPhaseTimings != null ? pageOpenPhaseTimings.getRenderPhaseMs() : null) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            synchronized (c23335b) {
                try {
                    if (!c23335b.getF45701d() || (z11 && !c23335b.getF45699b().m57374j())) {
                        if (c23335b.getF45706i() == null) {
                            c23335b.m55830k(new PendingFinish(result, bool, pageOpenPhaseTimings, externalStages));
                            z12 = true;
                        }
                        boolValueOf = Boolean.valueOf(z12);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return completeContainerEntry(i11, c23335b, result, bool, pageOpenPhaseTimings, externalStages);
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean isContainerActive(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        return rootTag > 0 && this.containerOwners.get(Integer.valueOf(rootTag)) == ownerToken;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean recordDataReady(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected, @Nullable Boolean cacheHit) {
        PendingFinish pendingFinish;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken || c23335b.getF45699b() != expected || !expected.m57380p(cacheHit)) {
            return false;
        }
        synchronized (c23335b) {
            pendingFinish = null;
            if (c23335b.getF45701d()) {
                PendingFinish f45706i = c23335b.getF45706i();
                c23335b.m55830k(null);
                pendingFinish = f45706i;
            }
        }
        if (pendingFinish == null) {
            return true;
        }
        completeContainerEntry(rootTag, c23335b, pendingFinish.getResult(), pendingFinish.getCacheHit(), pendingFinish.getPhaseTimings(), pendingFinish.m55817b());
        return true;
    }

    public final boolean recordRenderReady(int rootTag, @NotNull Object ownerToken) {
        Function0<Unit> function0M55828i;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken) {
            return false;
        }
        synchronized (c23335b) {
            function0M55828i = WhenMappings.$EnumSwitchMapping$0[c23335b.getF45700c().onRenderReady().ordinal()] == 1 ? c23335b.m55828i() : null;
        }
        if (function0M55828i != null) {
            function0M55828i.invoke();
        }
        return false;
    }

    public final boolean recordVisibleFrame(int rootTag, @NotNull Object ownerToken) {
        boolean z11;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken) {
            return false;
        }
        synchronized (c23335b) {
            if (WhenMappings.$EnumSwitchMapping$0[c23335b.getF45700c().onVisibleFrame().ordinal()] == 2) {
                z11 = true;
                c23335b.m55829j(true);
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return recordFirstFrameAndDrainPending(rootTag, c23335b);
        }
        return false;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean register(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace trace) {
        PageOpenTrace f45699b;
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(trace, "trace");
        if (rootTag <= 0) {
            return false;
        }
        this.containerOwners.put(Integer.valueOf(rootTag), ownerToken);
        C23335b c23335bPut = this.traces.put(Integer.valueOf(rootTag), new C23335b(ownerToken, trace));
        if ((c23335bPut != null ? c23335bPut.getF45699b() : null) == trace) {
            return true;
        }
        if (c23335bPut != null && (f45699b = c23335bPut.getF45699b()) != null) {
            PageOpenTrace.m57369h(f45699b, PageOpenResult.ABORT, null, null, null, 14, null);
        }
        if (c23335bPut == null) {
            return true;
        }
        notifyTerminal(c23335bPut);
        return true;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean remove(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken || c23335b.getF45699b() != expected) {
            return false;
        }
        boolean zRemove = this.traces.remove(Integer.valueOf(rootTag), c23335b);
        if (zRemove) {
            notifyTerminal(c23335b);
        }
        return zRemove;
    }

    public final boolean timeout(int rootTag, @NotNull Object ownerToken, @NotNull PageOpenTrace expected) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        Intrinsics.checkNotNullParameter(expected, "expected");
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken || c23335b.getF45699b() != expected) {
            return false;
        }
        synchronized (c23335b) {
            c23335b.m55830k(null);
            Unit unit = Unit.INSTANCE;
        }
        if (!expected.m57375k()) {
            return remove(rootTag, ownerToken, expected);
        }
        boolean zM57369h = PageOpenTrace.m57369h(expected, PageOpenResult.TIMEOUT, null, null, null, 14, null);
        if (zM57369h) {
            remove(rootTag, ownerToken, expected);
        }
        return zM57369h;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean tryMarkExternalCompleted(@NotNull String pageTraceId) {
        boolean z11;
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        synchronized (this.completedLock) {
            if (this.completedExternalTraceIds.add(pageTraceId)) {
                while (this.completedExternalTraceIds.size() > 512) {
                    Iterator<String> it = this.completedExternalTraceIds.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                }
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenRegistryAccess
    public boolean unregisterContainer(int rootTag, @NotNull Object ownerToken) {
        Intrinsics.checkNotNullParameter(ownerToken, "ownerToken");
        if (!this.containerOwners.remove(Integer.valueOf(rootTag), ownerToken)) {
            return false;
        }
        C23335b c23335b = this.traces.get(Integer.valueOf(rootTag));
        if (c23335b == null || c23335b.getF45698a() != ownerToken || !this.traces.remove(Integer.valueOf(rootTag), c23335b)) {
            return true;
        }
        PageOpenTrace.m57369h(c23335b.getF45699b(), PageOpenResult.ABORT, null, null, null, 14, null);
        notifyTerminal(c23335b);
        return true;
    }

    private final boolean completeContainerEntry(int i11, C23335b c23335b, PageOpenResult pageOpenResult, Boolean bool, PageOpenPhaseTimings pageOpenPhaseTimings, List<PageOpenStageRecord> list) {
        boolean zM57372g = c23335b.getF45699b().m57372g(pageOpenResult, bool, pageOpenPhaseTimings, list);
        if (zM57372g) {
            this.traces.remove(Integer.valueOf(i11), c23335b);
            notifyTerminal(c23335b);
        }
        return zM57372g;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    private final boolean recordFirstFrameAndDrainPending(int i11, C23335b c23335b) throws Throwable {
        Throwable th2;
        Long dataPhaseMs;
        boolean z11;
        Long renderPhaseMs;
        PageOpenPhaseTimings phaseTimings;
        boolean zM57379o = c23335b.getF45699b().m57379o();
        if (zM57379o) {
            synchronized (c23335b) {
                try {
                    PendingFinish f45706i = c23335b.getF45706i();
                    if (f45706i != null) {
                        try {
                            PageOpenPhaseTimings phaseTimings2 = f45706i.getPhaseTimings();
                            if (phaseTimings2 != null) {
                                dataPhaseMs = phaseTimings2.getDataPhaseMs();
                            } else {
                                dataPhaseMs = null;
                            }
                            if (dataPhaseMs != null) {
                                if (f45706i == null && (phaseTimings = f45706i.getPhaseTimings()) != null) {
                                    renderPhaseMs = phaseTimings.getRenderPhaseMs();
                                } else {
                                    renderPhaseMs = null;
                                }
                                if (renderPhaseMs == null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                            if (f45706i == null && (!z11 || c23335b.getF45699b().m57374j())) {
                                c23335b.m55830k(null);
                            } else {
                                f45706i = null;
                            }
                            Unit unit = Unit.INSTANCE;
                            if (f45706i != null) {
                                completeContainerEntry(i11, c23335b, f45706i.getResult(), f45706i.getCacheHit(), f45706i.getPhaseTimings(), f45706i.m55817b());
                                return zM57379o;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        dataPhaseMs = null;
                        if (dataPhaseMs != null) {
                            if (f45706i == null) {
                                renderPhaseMs = null;
                            } else {
                                renderPhaseMs = null;
                            }
                            if (renderPhaseMs == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        if (f45706i == null) {
                            f45706i = null;
                        } else {
                            f45706i = null;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        if (f45706i != null) {
                            completeContainerEntry(i11, c23335b, f45706i.getResult(), f45706i.getCacheHit(), f45706i.getPhaseTimings(), f45706i.m55817b());
                            return zM57379o;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        }
        return zM57379o;
    }

    public /* synthetic */ KrnPageOpenRegistryStore(PageOpenClock pageOpenClock, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ElapsedRealtimePageOpenClock.f47223a : pageOpenClock);
    }
}
