package com.kubi.sdk.performance.pageopen;

import androidx.core.app.FrameMetricsAggregator;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;
import ro.C44128b;

/* JADX INFO: compiled from: PageOpenTrace.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u00045678B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001dJ\u0017\u0010!\u001a\u00020\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0010J;\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0002\u0010-J)\u0010.\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0002\u00102J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u00069"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenTrace;", "", "config", "Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;", "clock", "Lcom/kubi/sdk/performance/pageopen/PageOpenClock;", "reportSink", "Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;", "<init>", "(Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;Lcom/kubi/sdk/performance/pageopen/PageOpenClock;Lcom/kubi/sdk/performance/pageopen/PageOpenReportSink;)V", "getConfig", "()Lcom/kubi/sdk/performance/pageopen/PageOpenTraceConfig;", "lock", "snapshot", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Snapshot;", "isTerminal", "", "()Z", "hasPageBinding", "getHasPageBinding", "hasDataReady", "getHasDataReady", "bindPage", "pageId", "", "routeKey", "matchesBinding", "recordFirstFrame", "beginStage", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageToken;", "name", "endStage", InterfaceC33826o0.f71244p, "reportDataReady", "cacheHit", "(Ljava/lang/Boolean;)Z", "recordRenderComplete", "finish", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "externalStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Z", "isValidPhaseTimings", "totalDurationMs", "", "ttidMs", "(Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;JLjava/lang/Long;)Z", "buildReport", "Lcom/kubi/sdk/performance/pageopen/PageOpenReport;", "Companion", "RunningStage", "TerminalData", "Snapshot", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPageOpenTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageOpenTrace.kt\ncom/kubi/sdk/performance/pageopen/PageOpenTrace\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
public final class PageOpenTrace {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f47203f = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PageOpenTraceConfig f47204a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PageOpenClock f47205b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final PageOpenReportSink f47206c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Object f47207d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public Snapshot f47208e;

    /* JADX INFO: compiled from: PageOpenTrace.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Companion;", "", "<init>", "()V", "TAG", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.PageOpenTrace$a, reason: from toString */
    /* JADX INFO: compiled from: PageOpenTrace.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u0086\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00067"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Snapshot;", "", "boundPageId", "", "boundRouteKey", "firstFrameAtMs", "", "dataReadyAtMs", "cacheHit", "", "runningStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$RunningStage;", "completedStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "terminal", "Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$TerminalData;", "reportEmitted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$TerminalData;Z)V", "getBoundPageId", "()Ljava/lang/String;", "getBoundRouteKey", "getFirstFrameAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDataReadyAtMs", "getCacheHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRunningStages", "()Ljava/util/Map;", "getCompletedStages", "()Ljava/util/List;", "getTerminal", "()Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$TerminalData;", "getReportEmitted", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$TerminalData;Z)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$Snapshot;", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Snapshot {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String boundPageId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String boundRouteKey;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final Long firstFrameAtMs;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final Long dataReadyAtMs;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final Boolean cacheHit;

        /* JADX INFO: renamed from: f, reason: from toString */
        @NotNull
        public final Map<String, Object> runningStages;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final List<PageOpenStageRecord> completedStages;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final TerminalData terminal;

        /* JADX INFO: renamed from: i, reason: from toString */
        public final boolean reportEmitted;

        public Snapshot() {
            this(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Intrinsics.areEqual(this.boundPageId, snapshot.boundPageId) && Intrinsics.areEqual(this.boundRouteKey, snapshot.boundRouteKey) && Intrinsics.areEqual(this.firstFrameAtMs, snapshot.firstFrameAtMs) && Intrinsics.areEqual(this.dataReadyAtMs, snapshot.dataReadyAtMs) && Intrinsics.areEqual(this.cacheHit, snapshot.cacheHit) && Intrinsics.areEqual(this.runningStages, snapshot.runningStages) && Intrinsics.areEqual(this.completedStages, snapshot.completedStages) && Intrinsics.areEqual(this.terminal, snapshot.terminal) && this.reportEmitted == snapshot.reportEmitted;
        }

        public Snapshot(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable Boolean bool, @NotNull Map<String, Object> runningStages, @NotNull List<PageOpenStageRecord> completedStages, @Nullable TerminalData terminalData, boolean z11) {
            Intrinsics.checkNotNullParameter(runningStages, "runningStages");
            Intrinsics.checkNotNullParameter(completedStages, "completedStages");
            this.boundPageId = str;
            this.boundRouteKey = str2;
            this.firstFrameAtMs = l11;
            this.dataReadyAtMs = l12;
            this.cacheHit = bool;
            this.runningStages = runningStages;
            this.completedStages = completedStages;
            this.terminal = terminalData;
            this.reportEmitted = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Snapshot m57381b(Snapshot snapshot, String str, String str2, Long l11, Long l12, Boolean bool, Map map, List list, TerminalData terminalData, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = snapshot.boundPageId;
            }
            if ((i11 & 2) != 0) {
                str2 = snapshot.boundRouteKey;
            }
            if ((i11 & 4) != 0) {
                l11 = snapshot.firstFrameAtMs;
            }
            if ((i11 & 8) != 0) {
                l12 = snapshot.dataReadyAtMs;
            }
            if ((i11 & 16) != 0) {
                bool = snapshot.cacheHit;
            }
            if ((i11 & 32) != 0) {
                map = snapshot.runningStages;
            }
            if ((i11 & 64) != 0) {
                list = snapshot.completedStages;
            }
            if ((i11 & 128) != 0) {
                terminalData = snapshot.terminal;
            }
            if ((i11 & 256) != 0) {
                z11 = snapshot.reportEmitted;
            }
            TerminalData terminalData2 = terminalData;
            boolean z12 = z11;
            Map map2 = map;
            List list2 = list;
            Boolean bool2 = bool;
            Long l13 = l11;
            return snapshot.m57382a(str, str2, l13, l12, bool2, map2, list2, terminalData2, z12);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Snapshot m57382a(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable Boolean bool, @NotNull Map<String, Object> runningStages, @NotNull List<PageOpenStageRecord> completedStages, @Nullable TerminalData terminalData, boolean z11) {
            Intrinsics.checkNotNullParameter(runningStages, "runningStages");
            Intrinsics.checkNotNullParameter(completedStages, "completedStages");
            return new Snapshot(str, str2, l11, l12, bool, runningStages, completedStages, terminalData, z11);
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBoundPageId() {
            return this.boundPageId;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getBoundRouteKey() {
            return this.boundRouteKey;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getCacheHit() {
            return this.cacheHit;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<PageOpenStageRecord> m57386f() {
            return this.completedStages;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Long getDataReadyAtMs() {
            return this.dataReadyAtMs;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final Long getFirstFrameAtMs() {
            return this.firstFrameAtMs;
        }

        public int hashCode() {
            String str = this.boundPageId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.boundRouteKey;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l11 = this.firstFrameAtMs;
            int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.dataReadyAtMs;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Boolean bool = this.cacheHit;
            int iHashCode5 = (((((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + this.runningStages.hashCode()) * 31) + this.completedStages.hashCode()) * 31;
            TerminalData terminalData = this.terminal;
            return ((iHashCode5 + (terminalData != null ? terminalData.hashCode() : 0)) * 31) + Boolean.hashCode(this.reportEmitted);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getReportEmitted() {
            return this.reportEmitted;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final TerminalData getTerminal() {
            return this.terminal;
        }

        @NotNull
        public String toString() {
            return "Snapshot(boundPageId=" + this.boundPageId + ", boundRouteKey=" + this.boundRouteKey + ", firstFrameAtMs=" + this.firstFrameAtMs + ", dataReadyAtMs=" + this.dataReadyAtMs + ", cacheHit=" + this.cacheHit + ", runningStages=" + this.runningStages + ", completedStages=" + this.completedStages + ", terminal=" + this.terminal + ", reportEmitted=" + this.reportEmitted + ')';
        }

        public /* synthetic */ Snapshot(String str, String str2, Long l11, Long l12, Boolean bool, Map map, List list, TerminalData terminalData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? MapsKt.emptyMap() : map, (i11 & 64) != 0 ? CollectionsKt.emptyList() : list, (i11 & 128) != 0 ? null : terminalData, (i11 & 256) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.PageOpenTrace$b, reason: from toString */
    /* JADX INFO: compiled from: PageOpenTrace.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$TerminalData;", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "finishedAtMs", "", "cacheHit", "", "phaseTimings", "Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "externalStages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "<init>", "(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;JLjava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)V", "getResult", "()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "getFinishedAtMs", "()J", "getCacheHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhaseTimings", "()Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;", "getExternalStages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/kubi/sdk/performance/pageopen/PageOpenResult;JLjava/lang/Boolean;Lcom/kubi/sdk/performance/pageopen/PageOpenPhaseTimings;Ljava/util/List;)Lcom/kubi/sdk/performance/pageopen/PageOpenTrace$TerminalData;", "equals", "other", "hashCode", "", "toString", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TerminalData {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final PageOpenResult result;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final long finishedAtMs;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final Boolean cacheHit;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final PageOpenPhaseTimings phaseTimings;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public final List<PageOpenStageRecord> externalStages;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TerminalData)) {
                return false;
            }
            TerminalData terminalData = (TerminalData) other;
            return this.result == terminalData.result && this.finishedAtMs == terminalData.finishedAtMs && Intrinsics.areEqual(this.cacheHit, terminalData.cacheHit) && Intrinsics.areEqual(this.phaseTimings, terminalData.phaseTimings) && Intrinsics.areEqual(this.externalStages, terminalData.externalStages);
        }

        public TerminalData(@NotNull PageOpenResult result, long j11, @Nullable Boolean bool, @Nullable PageOpenPhaseTimings pageOpenPhaseTimings, @NotNull List<PageOpenStageRecord> externalStages) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(externalStages, "externalStages");
            this.result = result;
            this.finishedAtMs = j11;
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
        public final List<PageOpenStageRecord> m57392b() {
            return this.externalStages;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getFinishedAtMs() {
            return this.finishedAtMs;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final PageOpenPhaseTimings getPhaseTimings() {
            return this.phaseTimings;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final PageOpenResult getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = ((this.result.hashCode() * 31) + Long.hashCode(this.finishedAtMs)) * 31;
            Boolean bool = this.cacheHit;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            PageOpenPhaseTimings pageOpenPhaseTimings = this.phaseTimings;
            return ((iHashCode2 + (pageOpenPhaseTimings != null ? pageOpenPhaseTimings.hashCode() : 0)) * 31) + this.externalStages.hashCode();
        }

        @NotNull
        public String toString() {
            return "TerminalData(result=" + this.result + ", finishedAtMs=" + this.finishedAtMs + ", cacheHit=" + this.cacheHit + ", phaseTimings=" + this.phaseTimings + ", externalStages=" + this.externalStages + ')';
        }
    }

    public PageOpenTrace(@NotNull PageOpenTraceConfig config, @NotNull PageOpenClock clock, @NotNull PageOpenReportSink reportSink) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(reportSink, "reportSink");
        this.f47204a = config;
        this.f47205b = clock;
        this.f47206c = reportSink;
        this.f47207d = new Object();
        this.f47208e = new Snapshot(config.getInitialPageId(), null, null, null, null, null, null, null, false, 510, null);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m57377m(PageOpenPhaseTimings pageOpenPhaseTimings, long j11, Long l11) {
        Long dataPhaseMs = pageOpenPhaseTimings != null ? pageOpenPhaseTimings.getDataPhaseMs() : null;
        Long renderPhaseMs = pageOpenPhaseTimings != null ? pageOpenPhaseTimings.getRenderPhaseMs() : null;
        if ((dataPhaseMs == null) != (renderPhaseMs == null)) {
            return false;
        }
        if (dataPhaseMs != null && !PageOpenValidation.f47249a.m57422a(dataPhaseMs.longValue(), j11)) {
            return false;
        }
        if (renderPhaseMs != null && !PageOpenValidation.f47249a.m57422a(renderPhaseMs.longValue(), j11)) {
            return false;
        }
        if (dataPhaseMs == null || renderPhaseMs == null) {
            return true;
        }
        if (l11 == null || PageOpenValidation.f47249a.m57422a(l11.longValue(), j11)) {
            return ((l11 != null ? l11.longValue() : 0L) + dataPhaseMs.longValue()) + renderPhaseMs.longValue() <= j11;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m57367e(PageOpenStageRecord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PageOpenValidation.f47249a.m57425e(it.getName());
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m57368f(long j11, PageOpenStageRecord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PageOpenValidation.f47249a.m57422a(it.getDurationMs(), j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m57369h(PageOpenTrace pageOpenTrace, PageOpenResult pageOpenResult, Boolean bool, PageOpenPhaseTimings pageOpenPhaseTimings, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            pageOpenPhaseTimings = null;
        }
        if ((i11 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return pageOpenTrace.m57372g(pageOpenResult, bool, pageOpenPhaseTimings, list);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57370c(@NotNull String pageId, @NotNull String routeKey) {
        PageOpenReport pageOpenReportM57371d;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        PageOpenValidation pageOpenValidation = PageOpenValidation.f47249a;
        boolean z11 = false;
        if (!pageOpenValidation.m57423c(pageId) || !pageOpenValidation.m57424d(routeKey)) {
            return false;
        }
        synchronized (this.f47207d) {
            try {
                Snapshot snapshot = this.f47208e;
                pageOpenReportM57371d = null;
                if (snapshot.getBoundPageId() == null || Intrinsics.areEqual(snapshot.getBoundPageId(), pageId)) {
                    if (snapshot.getBoundRouteKey() == null || Intrinsics.areEqual(snapshot.getBoundRouteKey(), routeKey)) {
                        Snapshot snapshotM57381b = Snapshot.m57381b(snapshot, pageId, routeKey, null, null, null, null, null, null, false, 508, null);
                        if (snapshotM57381b.getTerminal() == null || snapshotM57381b.getReportEmitted()) {
                            snapshotM57381b = snapshotM57381b;
                        } else {
                            pageOpenReportM57371d = m57371d(snapshotM57381b);
                            if (pageOpenReportM57371d != null) {
                                snapshotM57381b = Snapshot.m57381b(snapshotM57381b, null, null, null, null, null, null, null, null, true, 255, null);
                            }
                        }
                        this.f47208e = snapshotM57381b;
                        z11 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pageOpenReportM57371d != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f47206c.mo57355a(pageOpenReportM57371d);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                C44128b.m97270n("PageOpenTrace", "PageOpen report dispatch failed");
            }
            Result.m103843boximpl(objM103844constructorimpl);
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX INFO: renamed from: d */
    public final PageOpenReport m57371d(Snapshot snapshot) {
        String boundPageId;
        Long lValueOf;
        Long l11;
        PageOpenPhaseTimings phaseTimings;
        Long dataPhaseMs;
        TerminalData terminal = snapshot.getTerminal();
        Long renderPhaseMs = null;
        if (terminal != null && (boundPageId = snapshot.getBoundPageId()) != null) {
            PageOpenValidation pageOpenValidation = PageOpenValidation.f47249a;
            if (!pageOpenValidation.m57423c(boundPageId)) {
                boundPageId = null;
            }
            if (boundPageId != null) {
                final long finishedAtMs = terminal.getFinishedAtMs() - this.f47204a.getStartedAtMs();
                if (!PageOpenValidation.m57421b(pageOpenValidation, finishedAtMs, 0L, 2, null)) {
                    return null;
                }
                Long firstFrameAtMs = snapshot.getFirstFrameAtMs();
                Long lValueOf2 = (firstFrameAtMs == null || snapshot.getDataReadyAtMs() == null) ? null : Long.valueOf(Math.max(firstFrameAtMs.longValue(), snapshot.getDataReadyAtMs().longValue()));
                Long lValueOf3 = (lValueOf2 == null || firstFrameAtMs == null) ? null : Long.valueOf(lValueOf2.longValue() - firstFrameAtMs.longValue());
                Long lValueOf4 = lValueOf2 != null ? Long.valueOf(terminal.getFinishedAtMs() - lValueOf2.longValue()) : null;
                List list = SequencesKt.toList(SequencesKt.take(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(CollectionsKt.plus((Collection) snapshot.m57386f(), (Iterable) terminal.m57392b())), new Function1() { // from class: com.kubi.sdk.performance.pageopen.i
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(PageOpenTrace.m57367e((PageOpenStageRecord) obj));
                    }
                }), new Function1() { // from class: com.kubi.sdk.performance.pageopen.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(PageOpenTrace.m57368f(finishedAtMs, (PageOpenStageRecord) obj));
                    }
                }), 20));
                String pageTraceId = this.f47204a.getPageTraceId();
                PageOpenMode openMode = this.f47204a.getOpenMode();
                String source = this.f47204a.getSource();
                Long l12 = lValueOf4;
                PageOpenResult result = terminal.getResult();
                if (firstFrameAtMs != null) {
                    lValueOf = Long.valueOf(firstFrameAtMs.longValue() - this.f47204a.getStartedAtMs());
                    if (lValueOf.longValue() < 0) {
                        lValueOf = null;
                    }
                } else {
                    lValueOf = null;
                }
                PageOpenResult result2 = terminal.getResult();
                PageOpenResult pageOpenResult = PageOpenResult.SUCCESS;
                if (result2 == pageOpenResult) {
                    PageOpenPhaseTimings phaseTimings2 = terminal.getPhaseTimings();
                    l11 = (phaseTimings2 == null || (dataPhaseMs = phaseTimings2.getDataPhaseMs()) == null) ? lValueOf3 : dataPhaseMs;
                } else {
                    l11 = null;
                }
                return new PageOpenReport(pageTraceId, boundPageId, openMode, source, result, lValueOf, finishedAtMs, l11, (terminal.getResult() == pageOpenResult && ((phaseTimings = terminal.getPhaseTimings()) == null || (renderPhaseMs = phaseTimings.getRenderPhaseMs()) == null)) ? l12 : renderPhaseMs, terminal.getCacheHit(), list, this.f47204a.getSampled());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m57372g(@NotNull PageOpenResult result, @Nullable Boolean bool, @Nullable PageOpenPhaseTimings pageOpenPhaseTimings, @NotNull List<PageOpenStageRecord> externalStages) {
        boolean z11;
        PageOpenReport pageOpenReportM57371d;
        PageOpenResult pageOpenResult;
        PageOpenPhaseTimings pageOpenPhaseTimings2;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(externalStages, "externalStages");
        synchronized (this.f47207d) {
            try {
                Snapshot snapshot = this.f47208e;
                z11 = false;
                pageOpenReportM57371d = null;
                if (snapshot.getTerminal() == null && (result == (pageOpenResult = PageOpenResult.SUCCESS) || PageOpenValidation.f47249a.m57423c(snapshot.getBoundPageId()))) {
                    long jMo57396a = this.f47205b.mo57396a();
                    long startedAtMs = jMo57396a - this.f47204a.getStartedAtMs();
                    if (PageOpenValidation.m57421b(PageOpenValidation.f47249a, startedAtMs, 0L, 2, null) && (result != pageOpenResult || snapshot.getFirstFrameAtMs() != null)) {
                        if (result == pageOpenResult) {
                            Long firstFrameAtMs = snapshot.getFirstFrameAtMs();
                            pageOpenPhaseTimings2 = pageOpenPhaseTimings;
                            if (!m57377m(pageOpenPhaseTimings2, startedAtMs, firstFrameAtMs != null ? Long.valueOf(firstFrameAtMs.longValue() - this.f47204a.getStartedAtMs()) : null)) {
                            }
                        } else {
                            pageOpenPhaseTimings2 = pageOpenPhaseTimings;
                        }
                        Snapshot snapshotM57381b = Snapshot.m57381b(snapshot, null, null, null, null, bool == null ? snapshot.getCacheHit() : bool, MapsKt.emptyMap(), null, new TerminalData(result, jMo57396a, bool == null ? snapshot.getCacheHit() : bool, pageOpenPhaseTimings2, externalStages), false, 335, null);
                        pageOpenReportM57371d = m57371d(snapshotM57381b);
                        if (pageOpenReportM57371d != null) {
                            snapshotM57381b = Snapshot.m57381b(snapshotM57381b, null, null, null, null, null, null, null, null, true, 255, null);
                        }
                        this.f47208e = snapshotM57381b;
                        z11 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pageOpenReportM57371d != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f47206c.mo57355a(pageOpenReportM57371d);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                C44128b.m97270n("PageOpenTrace", "PageOpen report dispatch failed");
            }
            Result.m103843boximpl(objM103844constructorimpl);
        }
        return z11;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final PageOpenTraceConfig getF47204a() {
        return this.f47204a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m57374j() {
        boolean z11;
        synchronized (this.f47207d) {
            z11 = this.f47208e.getDataReadyAtMs() != null;
        }
        return z11;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m57375k() {
        boolean zM57423c;
        synchronized (this.f47207d) {
            zM57423c = PageOpenValidation.f47249a.m57423c(this.f47208e.getBoundPageId());
        }
        return zM57423c;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m57376l() {
        boolean z11;
        synchronized (this.f47207d) {
            z11 = this.f47208e.getTerminal() != null;
        }
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m57378n(@NotNull String pageId, @NotNull String routeKey) {
        boolean z11;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        synchronized (this.f47207d) {
            z11 = Intrinsics.areEqual(this.f47208e.getBoundPageId(), pageId) && Intrinsics.areEqual(this.f47208e.getBoundRouteKey(), routeKey);
        }
        return z11;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m57379o() {
        boolean z11;
        synchronized (this.f47207d) {
            Snapshot snapshot = this.f47208e;
            z11 = false;
            if (snapshot.getTerminal() == null && snapshot.getFirstFrameAtMs() == null) {
                long jMo57396a = this.f47205b.mo57396a();
                if (jMo57396a >= this.f47204a.getStartedAtMs()) {
                    this.f47208e = Snapshot.m57381b(snapshot, null, null, Long.valueOf(jMo57396a), null, null, null, null, null, false, 507, null);
                    z11 = true;
                }
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m57380p(@Nullable Boolean bool) {
        boolean z11;
        synchronized (this.f47207d) {
            Snapshot snapshot = this.f47208e;
            if (snapshot.getTerminal() == null && snapshot.getDataReadyAtMs() == null) {
                this.f47208e = Snapshot.m57381b(snapshot, null, null, null, Long.valueOf(this.f47205b.mo57396a()), bool, null, null, null, false, 487, null);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public /* synthetic */ PageOpenTrace(PageOpenTraceConfig pageOpenTraceConfig, PageOpenClock pageOpenClock, PageOpenReportSink pageOpenReportSink, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pageOpenTraceConfig, (i11 & 2) != 0 ? ElapsedRealtimePageOpenClock.f47223a : pageOpenClock, (i11 & 4) != 0 ? PageOpenReporter.f47194d.getDefault() : pageOpenReportSink);
    }
}
