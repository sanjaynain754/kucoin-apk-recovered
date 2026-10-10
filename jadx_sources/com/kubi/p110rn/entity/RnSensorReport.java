package com.kubi.p110rn.entity;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnSensorReport.kt */
/* JADX INFO: loaded from: classes39.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b=\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\u008b\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\u0013\u0010C\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\nHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001d\"\u0004\b*\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%¨\u0006G"}, m90084d2 = {"Lcom/kubi/rn/entity/RnSensorReport;", "", Constants.BIZ, "", "finishedTime", "", "isFirstEnter", "", "version", "code", "", "hitEngineCache", "downgradeMode", "isRemote", "whiteStatus", "subPath", "siteType", "appMode", "pageMount", "<init>", "(Ljava/lang/String;JZLjava/lang/String;IZIZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBiz", "()Ljava/lang/String;", "setBiz", "(Ljava/lang/String;)V", "getFinishedTime", "()J", "setFinishedTime", "(J)V", "()Z", "setFirstEnter", "(Z)V", "getVersion", "setVersion", "getCode", "()I", "setCode", "(I)V", "getHitEngineCache", "setHitEngineCache", "getDowngradeMode", "setDowngradeMode", "setRemote", "getWhiteStatus", "setWhiteStatus", "getSubPath", "setSubPath", "getSiteType", "setSiteType", "getAppMode", "setAppMode", "getPageMount", "setPageMount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RnSensorReport {

    @NotNull
    private String appMode;

    @NotNull
    private String biz;
    private int code;
    private int downgradeMode;
    private long finishedTime;
    private boolean hitEngineCache;
    private boolean isFirstEnter;
    private boolean isRemote;
    private int pageMount;

    @NotNull
    private String siteType;

    @NotNull
    private String subPath;

    @NotNull
    private String version;
    private int whiteStatus;

    public RnSensorReport() {
        this(null, 0L, false, null, 0, false, 0, false, 0, null, null, null, 0, 8191, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RnSensorReport)) {
            return false;
        }
        RnSensorReport rnSensorReport = (RnSensorReport) other;
        return Intrinsics.areEqual(this.biz, rnSensorReport.biz) && this.finishedTime == rnSensorReport.finishedTime && this.isFirstEnter == rnSensorReport.isFirstEnter && Intrinsics.areEqual(this.version, rnSensorReport.version) && this.code == rnSensorReport.code && this.hitEngineCache == rnSensorReport.hitEngineCache && this.downgradeMode == rnSensorReport.downgradeMode && this.isRemote == rnSensorReport.isRemote && this.whiteStatus == rnSensorReport.whiteStatus && Intrinsics.areEqual(this.subPath, rnSensorReport.subPath) && Intrinsics.areEqual(this.siteType, rnSensorReport.siteType) && Intrinsics.areEqual(this.appMode, rnSensorReport.appMode) && this.pageMount == rnSensorReport.pageMount;
    }

    public RnSensorReport(@NotNull String biz, long j11, boolean z11, @NotNull String version, int i11, boolean z12, int i12, boolean z13, int i13, @NotNull String subPath, @NotNull String siteType, @NotNull String appMode, int i14) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(subPath, "subPath");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        this.biz = biz;
        this.finishedTime = j11;
        this.isFirstEnter = z11;
        this.version = version;
        this.code = i11;
        this.hitEngineCache = z12;
        this.downgradeMode = i12;
        this.isRemote = z13;
        this.whiteStatus = i13;
        this.subPath = subPath;
        this.siteType = siteType;
        this.appMode = appMode;
        this.pageMount = i14;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubPath() {
        return this.subPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getPageMount() {
        return this.pageMount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFinishedTime() {
        return this.finishedTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFirstEnter() {
        return this.isFirstEnter;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHitEngineCache() {
        return this.hitEngineCache;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDowngradeMode() {
        return this.downgradeMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsRemote() {
        return this.isRemote;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWhiteStatus() {
        return this.whiteStatus;
    }

    @NotNull
    public final RnSensorReport copy(@NotNull String biz, long finishedTime, boolean isFirstEnter, @NotNull String version, int code, boolean hitEngineCache, int downgradeMode, boolean isRemote, int whiteStatus, @NotNull String subPath, @NotNull String siteType, @NotNull String appMode, int pageMount) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(subPath, "subPath");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        return new RnSensorReport(biz, finishedTime, isFirstEnter, version, code, hitEngineCache, downgradeMode, isRemote, whiteStatus, subPath, siteType, appMode, pageMount);
    }

    @NotNull
    public final String getAppMode() {
        return this.appMode;
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getDowngradeMode() {
        return this.downgradeMode;
    }

    public final long getFinishedTime() {
        return this.finishedTime;
    }

    public final boolean getHitEngineCache() {
        return this.hitEngineCache;
    }

    public final int getPageMount() {
        return this.pageMount;
    }

    @NotNull
    public final String getSiteType() {
        return this.siteType;
    }

    @NotNull
    public final String getSubPath() {
        return this.subPath;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final int getWhiteStatus() {
        return this.whiteStatus;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.biz.hashCode() * 31) + Long.hashCode(this.finishedTime)) * 31) + Boolean.hashCode(this.isFirstEnter)) * 31) + this.version.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + Boolean.hashCode(this.hitEngineCache)) * 31) + Integer.hashCode(this.downgradeMode)) * 31) + Boolean.hashCode(this.isRemote)) * 31) + Integer.hashCode(this.whiteStatus)) * 31) + this.subPath.hashCode()) * 31) + this.siteType.hashCode()) * 31) + this.appMode.hashCode()) * 31) + Integer.hashCode(this.pageMount);
    }

    public final boolean isFirstEnter() {
        return this.isFirstEnter;
    }

    public final boolean isRemote() {
        return this.isRemote;
    }

    public final void setAppMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appMode = str;
    }

    public final void setBiz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.biz = str;
    }

    public final void setCode(int i11) {
        this.code = i11;
    }

    public final void setDowngradeMode(int i11) {
        this.downgradeMode = i11;
    }

    public final void setFinishedTime(long j11) {
        this.finishedTime = j11;
    }

    public final void setFirstEnter(boolean z11) {
        this.isFirstEnter = z11;
    }

    public final void setHitEngineCache(boolean z11) {
        this.hitEngineCache = z11;
    }

    public final void setPageMount(int i11) {
        this.pageMount = i11;
    }

    public final void setRemote(boolean z11) {
        this.isRemote = z11;
    }

    public final void setSiteType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.siteType = str;
    }

    public final void setSubPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subPath = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    public final void setWhiteStatus(int i11) {
        this.whiteStatus = i11;
    }

    @NotNull
    public String toString() {
        return "RnSensorReport(biz=" + this.biz + ", finishedTime=" + this.finishedTime + ", isFirstEnter=" + this.isFirstEnter + ", version=" + this.version + ", code=" + this.code + ", hitEngineCache=" + this.hitEngineCache + ", downgradeMode=" + this.downgradeMode + ", isRemote=" + this.isRemote + ", whiteStatus=" + this.whiteStatus + ", subPath=" + this.subPath + ", siteType=" + this.siteType + ", appMode=" + this.appMode + ", pageMount=" + this.pageMount + ')';
    }

    public /* synthetic */ RnSensorReport(String str, long j11, boolean z11, String str2, int i11, boolean z12, int i12, boolean z13, int i13, String str3, String str4, String str5, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? 0L : j11, (i15 & 4) != 0 ? false : z11, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? 0 : i11, (i15 & 32) != 0 ? false : z12, (i15 & 64) != 0 ? 0 : i12, (i15 & 128) != 0 ? false : z13, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) == 0 ? str3 : "", (i15 & 1024) != 0 ? SiteType.INSTANCE.getCurrentSiteType() : str4, (i15 & 2048) != 0 ? AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType() : str5, (i15 & 4096) != 0 ? 0 : i14);
    }
}
