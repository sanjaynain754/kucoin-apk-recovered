package com.kubi.sdk.web.tracker.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: WebPerformanceStageModel.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;", "", "viewCreateTime", "", "viewInitTime", "coreInitTime", "firstReqTime", "warmupHit", "", "firstWebViewWarmup", "(JJJJZZ)V", "getCoreInitTime", "()J", "getFirstReqTime", "getFirstWebViewWarmup", "()Z", "getViewCreateTime", "getViewInitTime", "getWarmupHit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class WebPerformanceStageModel {
    private final long coreInitTime;
    private final long firstReqTime;
    private final boolean firstWebViewWarmup;
    private final long viewCreateTime;
    private final long viewInitTime;
    private final boolean warmupHit;

    public WebPerformanceStageModel() {
        this(0L, 0L, 0L, 0L, false, false, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebPerformanceStageModel)) {
            return false;
        }
        WebPerformanceStageModel webPerformanceStageModel = (WebPerformanceStageModel) other;
        return this.viewCreateTime == webPerformanceStageModel.viewCreateTime && this.viewInitTime == webPerformanceStageModel.viewInitTime && this.coreInitTime == webPerformanceStageModel.coreInitTime && this.firstReqTime == webPerformanceStageModel.firstReqTime && this.warmupHit == webPerformanceStageModel.warmupHit && this.firstWebViewWarmup == webPerformanceStageModel.firstWebViewWarmup;
    }

    public WebPerformanceStageModel(long j11, long j12, long j13, long j14, boolean z11, boolean z12) {
        this.viewCreateTime = j11;
        this.viewInitTime = j12;
        this.coreInitTime = j13;
        this.firstReqTime = j14;
        this.warmupHit = z11;
        this.firstWebViewWarmup = z12;
    }

    public static /* synthetic */ WebPerformanceStageModel copy$default(WebPerformanceStageModel webPerformanceStageModel, long j11, long j12, long j13, long j14, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = webPerformanceStageModel.viewCreateTime;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = webPerformanceStageModel.viewInitTime;
        }
        return webPerformanceStageModel.copy(j15, j12, (i11 & 4) != 0 ? webPerformanceStageModel.coreInitTime : j13, (i11 & 8) != 0 ? webPerformanceStageModel.firstReqTime : j14, (i11 & 16) != 0 ? webPerformanceStageModel.warmupHit : z11, (i11 & 32) != 0 ? webPerformanceStageModel.firstWebViewWarmup : z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getViewCreateTime() {
        return this.viewCreateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getViewInitTime() {
        return this.viewInitTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCoreInitTime() {
        return this.coreInitTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getFirstReqTime() {
        return this.firstReqTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWarmupHit() {
        return this.warmupHit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFirstWebViewWarmup() {
        return this.firstWebViewWarmup;
    }

    @NotNull
    public final WebPerformanceStageModel copy(long viewCreateTime, long viewInitTime, long coreInitTime, long firstReqTime, boolean warmupHit, boolean firstWebViewWarmup) {
        return new WebPerformanceStageModel(viewCreateTime, viewInitTime, coreInitTime, firstReqTime, warmupHit, firstWebViewWarmup);
    }

    public final long getCoreInitTime() {
        return this.coreInitTime;
    }

    public final long getFirstReqTime() {
        return this.firstReqTime;
    }

    public final boolean getFirstWebViewWarmup() {
        return this.firstWebViewWarmup;
    }

    public final long getViewCreateTime() {
        return this.viewCreateTime;
    }

    public final long getViewInitTime() {
        return this.viewInitTime;
    }

    public final boolean getWarmupHit() {
        return this.warmupHit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.viewCreateTime) * 31) + Long.hashCode(this.viewInitTime)) * 31) + Long.hashCode(this.coreInitTime)) * 31) + Long.hashCode(this.firstReqTime)) * 31;
        boolean z11 = this.warmupHit;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.firstWebViewWarmup;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "WebPerformanceStageModel(viewCreateTime=" + this.viewCreateTime + ", viewInitTime=" + this.viewInitTime + ", coreInitTime=" + this.coreInitTime + ", firstReqTime=" + this.firstReqTime + ", warmupHit=" + this.warmupHit + ", firstWebViewWarmup=" + this.firstWebViewWarmup + ')';
    }

    public /* synthetic */ WebPerformanceStageModel(long j11, long j12, long j13, long j14, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13, (i11 & 8) != 0 ? 0L : j14, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12);
    }
}
