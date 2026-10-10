package com.kubi.sdk.performance.pageopen;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.performance.pageopen.d, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PageOpenModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\u0094\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006@"}, m90084d2 = {"Lcom/kubi/sdk/performance/pageopen/PageOpenReport;", "", "pageTraceId", "", "pageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "source", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "ttidMs", "", "durationMs", "dataPhaseMs", "renderPhaseMs", "cacheHit", "", "stages", "", "Lcom/kubi/sdk/performance/pageopen/PageOpenStageRecord;", "sampled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Z)V", "getPageTraceId", "()Ljava/lang/String;", "getPageId", "getOpenMode", "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "getSource", "getResult", "()Lcom/kubi/sdk/performance/pageopen/PageOpenResult;", "getTtidMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDurationMs", "()J", "getDataPhaseMs", "getRenderPhaseMs", "getCacheHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStages", "()Ljava/util/List;", "getSampled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenResult;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Z)Lcom/kubi/sdk/performance/pageopen/PageOpenReport;", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PageOpenReport {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String pageTraceId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String pageId;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final PageOpenMode openMode;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String source;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final PageOpenResult result;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final Long ttidMs;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final long durationMs;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final Long dataPhaseMs;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final Long renderPhaseMs;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final Boolean cacheHit;

    /* JADX INFO: renamed from: k, reason: from toString */
    @NotNull
    public final List<PageOpenStageRecord> stages;

    /* JADX INFO: renamed from: l, reason: from toString */
    public final boolean sampled;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageOpenReport)) {
            return false;
        }
        PageOpenReport pageOpenReport = (PageOpenReport) other;
        return Intrinsics.areEqual(this.pageTraceId, pageOpenReport.pageTraceId) && Intrinsics.areEqual(this.pageId, pageOpenReport.pageId) && this.openMode == pageOpenReport.openMode && Intrinsics.areEqual(this.source, pageOpenReport.source) && this.result == pageOpenReport.result && Intrinsics.areEqual(this.ttidMs, pageOpenReport.ttidMs) && this.durationMs == pageOpenReport.durationMs && Intrinsics.areEqual(this.dataPhaseMs, pageOpenReport.dataPhaseMs) && Intrinsics.areEqual(this.renderPhaseMs, pageOpenReport.renderPhaseMs) && Intrinsics.areEqual(this.cacheHit, pageOpenReport.cacheHit) && Intrinsics.areEqual(this.stages, pageOpenReport.stages) && this.sampled == pageOpenReport.sampled;
    }

    public PageOpenReport(@NotNull String pageTraceId, @NotNull String pageId, @NotNull PageOpenMode openMode, @NotNull String source, @NotNull PageOpenResult result, @Nullable Long l11, long j11, @Nullable Long l12, @Nullable Long l13, @Nullable Boolean bool, @NotNull List<PageOpenStageRecord> stages, boolean z11) {
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(stages, "stages");
        this.pageTraceId = pageTraceId;
        this.pageId = pageId;
        this.openMode = openMode;
        this.source = source;
        this.result = result;
        this.ttidMs = l11;
        this.durationMs = j11;
        this.dataPhaseMs = l12;
        this.renderPhaseMs = l13;
        this.cacheHit = bool;
        this.stages = stages;
        this.sampled = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCacheHit() {
        return this.cacheHit;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDataPhaseMs() {
        return this.dataPhaseMs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final PageOpenMode getOpenMode() {
        return this.openMode;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getRenderPhaseMs() {
        return this.renderPhaseMs;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final PageOpenResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.pageTraceId.hashCode() * 31) + this.pageId.hashCode()) * 31) + this.openMode.hashCode()) * 31) + this.source.hashCode()) * 31) + this.result.hashCode()) * 31;
        Long l11 = this.ttidMs;
        int iHashCode2 = (((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Long.hashCode(this.durationMs)) * 31;
        Long l12 = this.dataPhaseMs;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.renderPhaseMs;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.cacheHit;
        return ((((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + this.stages.hashCode()) * 31) + Boolean.hashCode(this.sampled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSampled() {
        return this.sampled;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<PageOpenStageRecord> m57409k() {
        return this.stages;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getTtidMs() {
        return this.ttidMs;
    }

    @NotNull
    public String toString() {
        return "PageOpenReport(pageTraceId=" + this.pageTraceId + ", pageId=" + this.pageId + ", openMode=" + this.openMode + ", source=" + this.source + ", result=" + this.result + ", ttidMs=" + this.ttidMs + ", durationMs=" + this.durationMs + ", dataPhaseMs=" + this.dataPhaseMs + ", renderPhaseMs=" + this.renderPhaseMs + ", cacheHit=" + this.cacheHit + ", stages=" + this.stages + ", sampled=" + this.sampled + ')';
    }
}
