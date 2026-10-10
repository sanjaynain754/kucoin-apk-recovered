package com.kubi.sdk.lib.kunlun.sdk.config;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KunlunRemoteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/config/KunlunRemoteConfig;", "", "collectTimeInterval", "", "isKunlunOpen", "", "expiredTimeInterval", "reportTimeInterval", "sizeLimit", "maxLabelCount", "(IZIIII)V", "getCollectTimeInterval", "()I", "getExpiredTimeInterval", "()Z", "getMaxLabelCount", "getReportTimeInterval", "getSizeLimit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KunlunRemoteConfig {
    private final int collectTimeInterval;
    private final int expiredTimeInterval;
    private final boolean isKunlunOpen;
    private final int maxLabelCount;
    private final int reportTimeInterval;
    private final int sizeLimit;

    public KunlunRemoteConfig() {
        this(0, false, 0, 0, 0, 0, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KunlunRemoteConfig)) {
            return false;
        }
        KunlunRemoteConfig kunlunRemoteConfig = (KunlunRemoteConfig) other;
        return this.collectTimeInterval == kunlunRemoteConfig.collectTimeInterval && this.isKunlunOpen == kunlunRemoteConfig.isKunlunOpen && this.expiredTimeInterval == kunlunRemoteConfig.expiredTimeInterval && this.reportTimeInterval == kunlunRemoteConfig.reportTimeInterval && this.sizeLimit == kunlunRemoteConfig.sizeLimit && this.maxLabelCount == kunlunRemoteConfig.maxLabelCount;
    }

    public KunlunRemoteConfig(int i11, boolean z11, int i12, int i13, int i14, int i15) {
        this.collectTimeInterval = i11;
        this.isKunlunOpen = z11;
        this.expiredTimeInterval = i12;
        this.reportTimeInterval = i13;
        this.sizeLimit = i14;
        this.maxLabelCount = i15;
    }

    public static /* synthetic */ KunlunRemoteConfig copy$default(KunlunRemoteConfig kunlunRemoteConfig, int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = kunlunRemoteConfig.collectTimeInterval;
        }
        if ((i16 & 2) != 0) {
            z11 = kunlunRemoteConfig.isKunlunOpen;
        }
        if ((i16 & 4) != 0) {
            i12 = kunlunRemoteConfig.expiredTimeInterval;
        }
        if ((i16 & 8) != 0) {
            i13 = kunlunRemoteConfig.reportTimeInterval;
        }
        if ((i16 & 16) != 0) {
            i14 = kunlunRemoteConfig.sizeLimit;
        }
        if ((i16 & 32) != 0) {
            i15 = kunlunRemoteConfig.maxLabelCount;
        }
        int i17 = i14;
        int i18 = i15;
        return kunlunRemoteConfig.copy(i11, z11, i12, i13, i17, i18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCollectTimeInterval() {
        return this.collectTimeInterval;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsKunlunOpen() {
        return this.isKunlunOpen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getExpiredTimeInterval() {
        return this.expiredTimeInterval;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getReportTimeInterval() {
        return this.reportTimeInterval;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSizeLimit() {
        return this.sizeLimit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMaxLabelCount() {
        return this.maxLabelCount;
    }

    @NotNull
    public final KunlunRemoteConfig copy(int collectTimeInterval, boolean isKunlunOpen, int expiredTimeInterval, int reportTimeInterval, int sizeLimit, int maxLabelCount) {
        return new KunlunRemoteConfig(collectTimeInterval, isKunlunOpen, expiredTimeInterval, reportTimeInterval, sizeLimit, maxLabelCount);
    }

    public final int getCollectTimeInterval() {
        return this.collectTimeInterval;
    }

    public final int getExpiredTimeInterval() {
        return this.expiredTimeInterval;
    }

    public final int getMaxLabelCount() {
        return this.maxLabelCount;
    }

    public final int getReportTimeInterval() {
        return this.reportTimeInterval;
    }

    public final int getSizeLimit() {
        return this.sizeLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.collectTimeInterval) * 31;
        boolean z11 = this.isKunlunOpen;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((((((((iHashCode + r11) * 31) + Integer.hashCode(this.expiredTimeInterval)) * 31) + Integer.hashCode(this.reportTimeInterval)) * 31) + Integer.hashCode(this.sizeLimit)) * 31) + Integer.hashCode(this.maxLabelCount);
    }

    public final boolean isKunlunOpen() {
        return this.isKunlunOpen;
    }

    @NotNull
    public String toString() {
        return "KunlunRemoteConfig(collectTimeInterval=" + this.collectTimeInterval + ", isKunlunOpen=" + this.isKunlunOpen + ", expiredTimeInterval=" + this.expiredTimeInterval + ", reportTimeInterval=" + this.reportTimeInterval + ", sizeLimit=" + this.sizeLimit + ", maxLabelCount=" + this.maxLabelCount + ')';
    }

    public /* synthetic */ KunlunRemoteConfig(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 30 : i11, (i16 & 2) != 0 ? true : z11, (i16 & 4) != 0 ? 48 : i12, (i16 & 8) != 0 ? 5000 : i13, (i16 & 16) != 0 ? 50 : i14, (i16 & 32) != 0 ? 1000 : i15);
    }
}
