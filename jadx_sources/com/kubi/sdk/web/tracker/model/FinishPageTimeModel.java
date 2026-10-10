package com.kubi.sdk.web.tracker.model;

import androidx.annotation.Keep;
import com.kubi.sdk.web.scene.SceneType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinishPageTimeModel.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010=\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u0006B"}, m90084d2 = {"Lcom/kubi/sdk/web/tracker/model/FinishPageTimeModel;", "", "fcpTime", "", "onLoadtime", "dclTime", "pageType", "", "ssgDownloadTime", "cacheType", "viewCreateTime", "viewInitTime", "coreInitTime", "firstReqTime", "warmupHit", "", "firstWebViewWarmup", "(JJJLjava/lang/String;JLjava/lang/String;JJJJZZ)V", "getCacheType", "()Ljava/lang/String;", "setCacheType", "(Ljava/lang/String;)V", "getCoreInitTime", "()J", "setCoreInitTime", "(J)V", "getDclTime", "setDclTime", "getFcpTime", "setFcpTime", "getFirstReqTime", "setFirstReqTime", "getFirstWebViewWarmup", "()Z", "setFirstWebViewWarmup", "(Z)V", "getOnLoadtime", "setOnLoadtime", "getPageType", "setPageType", "getSsgDownloadTime", "setSsgDownloadTime", "getViewCreateTime", "setViewCreateTime", "getViewInitTime", "setViewInitTime", "getWarmupHit", "setWarmupHit", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class FinishPageTimeModel {

    @NotNull
    private String cacheType;
    private long coreInitTime;
    private long dclTime;
    private long fcpTime;
    private long firstReqTime;
    private boolean firstWebViewWarmup;
    private long onLoadtime;

    @NotNull
    private String pageType;
    private long ssgDownloadTime;
    private long viewCreateTime;
    private long viewInitTime;
    private boolean warmupHit;

    public FinishPageTimeModel() {
        this(0L, 0L, 0L, null, 0L, null, 0L, 0L, 0L, 0L, false, false, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinishPageTimeModel)) {
            return false;
        }
        FinishPageTimeModel finishPageTimeModel = (FinishPageTimeModel) other;
        return this.fcpTime == finishPageTimeModel.fcpTime && this.onLoadtime == finishPageTimeModel.onLoadtime && this.dclTime == finishPageTimeModel.dclTime && Intrinsics.areEqual(this.pageType, finishPageTimeModel.pageType) && this.ssgDownloadTime == finishPageTimeModel.ssgDownloadTime && Intrinsics.areEqual(this.cacheType, finishPageTimeModel.cacheType) && this.viewCreateTime == finishPageTimeModel.viewCreateTime && this.viewInitTime == finishPageTimeModel.viewInitTime && this.coreInitTime == finishPageTimeModel.coreInitTime && this.firstReqTime == finishPageTimeModel.firstReqTime && this.warmupHit == finishPageTimeModel.warmupHit && this.firstWebViewWarmup == finishPageTimeModel.firstWebViewWarmup;
    }

    public FinishPageTimeModel(long j11, long j12, long j13, @NotNull String pageType, long j14, @NotNull String cacheType, long j15, long j16, long j17, long j18, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(cacheType, "cacheType");
        this.fcpTime = j11;
        this.onLoadtime = j12;
        this.dclTime = j13;
        this.pageType = pageType;
        this.ssgDownloadTime = j14;
        this.cacheType = cacheType;
        this.viewCreateTime = j15;
        this.viewInitTime = j16;
        this.coreInitTime = j17;
        this.firstReqTime = j18;
        this.warmupHit = z11;
        this.firstWebViewWarmup = z12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFcpTime() {
        return this.fcpTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getFirstReqTime() {
        return this.firstReqTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getWarmupHit() {
        return this.warmupHit;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFirstWebViewWarmup() {
        return this.firstWebViewWarmup;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOnLoadtime() {
        return this.onLoadtime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDclTime() {
        return this.dclTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSsgDownloadTime() {
        return this.ssgDownloadTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCacheType() {
        return this.cacheType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getViewCreateTime() {
        return this.viewCreateTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getViewInitTime() {
        return this.viewInitTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCoreInitTime() {
        return this.coreInitTime;
    }

    @NotNull
    public final FinishPageTimeModel copy(long fcpTime, long onLoadtime, long dclTime, @NotNull String pageType, long ssgDownloadTime, @NotNull String cacheType, long viewCreateTime, long viewInitTime, long coreInitTime, long firstReqTime, boolean warmupHit, boolean firstWebViewWarmup) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(cacheType, "cacheType");
        return new FinishPageTimeModel(fcpTime, onLoadtime, dclTime, pageType, ssgDownloadTime, cacheType, viewCreateTime, viewInitTime, coreInitTime, firstReqTime, warmupHit, firstWebViewWarmup);
    }

    @NotNull
    public final String getCacheType() {
        return this.cacheType;
    }

    public final long getCoreInitTime() {
        return this.coreInitTime;
    }

    public final long getDclTime() {
        return this.dclTime;
    }

    public final long getFcpTime() {
        return this.fcpTime;
    }

    public final long getFirstReqTime() {
        return this.firstReqTime;
    }

    public final boolean getFirstWebViewWarmup() {
        return this.firstWebViewWarmup;
    }

    public final long getOnLoadtime() {
        return this.onLoadtime;
    }

    @NotNull
    public final String getPageType() {
        return this.pageType;
    }

    public final long getSsgDownloadTime() {
        return this.ssgDownloadTime;
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
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((Long.hashCode(this.fcpTime) * 31) + Long.hashCode(this.onLoadtime)) * 31) + Long.hashCode(this.dclTime)) * 31) + this.pageType.hashCode()) * 31) + Long.hashCode(this.ssgDownloadTime)) * 31) + this.cacheType.hashCode()) * 31) + Long.hashCode(this.viewCreateTime)) * 31) + Long.hashCode(this.viewInitTime)) * 31) + Long.hashCode(this.coreInitTime)) * 31) + Long.hashCode(this.firstReqTime)) * 31;
        boolean z11 = this.warmupHit;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.firstWebViewWarmup;
        return i11 + (z12 ? 1 : z12);
    }

    public final void setCacheType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cacheType = str;
    }

    public final void setCoreInitTime(long j11) {
        this.coreInitTime = j11;
    }

    public final void setDclTime(long j11) {
        this.dclTime = j11;
    }

    public final void setFcpTime(long j11) {
        this.fcpTime = j11;
    }

    public final void setFirstReqTime(long j11) {
        this.firstReqTime = j11;
    }

    public final void setFirstWebViewWarmup(boolean z11) {
        this.firstWebViewWarmup = z11;
    }

    public final void setOnLoadtime(long j11) {
        this.onLoadtime = j11;
    }

    public final void setPageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageType = str;
    }

    public final void setSsgDownloadTime(long j11) {
        this.ssgDownloadTime = j11;
    }

    public final void setViewCreateTime(long j11) {
        this.viewCreateTime = j11;
    }

    public final void setViewInitTime(long j11) {
        this.viewInitTime = j11;
    }

    public final void setWarmupHit(boolean z11) {
        this.warmupHit = z11;
    }

    @NotNull
    public String toString() {
        return "FinishPageTimeModel(fcpTime=" + this.fcpTime + ", onLoadtime=" + this.onLoadtime + ", dclTime=" + this.dclTime + ", pageType=" + this.pageType + ", ssgDownloadTime=" + this.ssgDownloadTime + ", cacheType=" + this.cacheType + ", viewCreateTime=" + this.viewCreateTime + ", viewInitTime=" + this.viewInitTime + ", coreInitTime=" + this.coreInitTime + ", firstReqTime=" + this.firstReqTime + ", warmupHit=" + this.warmupHit + ", firstWebViewWarmup=" + this.firstWebViewWarmup + ')';
    }

    public /* synthetic */ FinishPageTimeModel(long j11, long j12, long j13, String str, long j14, String str2, long j15, long j16, long j17, long j18, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13, (i11 & 8) != 0 ? "other" : str, (i11 & 16) != 0 ? 0L : j14, (i11 & 32) != 0 ? SceneType.BasicWebApp.toString() : str2, (i11 & 64) != 0 ? 0L : j15, (i11 & 128) != 0 ? 0L : j16, (i11 & 256) != 0 ? 0L : j17, (i11 & 512) != 0 ? 0L : j18, (i11 & 1024) != 0 ? false : z11, (i11 & 2048) != 0 ? false : z12);
    }
}
