package com.kubi.sdk.web.tracker.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackHitCachedModel.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/web/tracker/model/TrackHitCachedModel;", "", "requestCount", "", "jsCount", "cssCount", "otherCount", "hitCount", "hitRate", "", "hitIndexHtml", "", "(IIIIILjava/lang/String;Z)V", "getCssCount", "()I", "getHitCount", "getHitIndexHtml", "()Z", "getHitRate", "()Ljava/lang/String;", "getJsCount", "getOtherCount", "getRequestCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class TrackHitCachedModel {
    private final int cssCount;
    private final int hitCount;
    private final boolean hitIndexHtml;

    @NotNull
    private final String hitRate;
    private final int jsCount;
    private final int otherCount;
    private final int requestCount;

    public TrackHitCachedModel() {
        this(0, 0, 0, 0, 0, null, false, 127, null);
    }

    public static /* synthetic */ TrackHitCachedModel copy$default(TrackHitCachedModel trackHitCachedModel, int i11, int i12, int i13, int i14, int i15, String str, boolean z11, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = trackHitCachedModel.requestCount;
        }
        if ((i16 & 2) != 0) {
            i12 = trackHitCachedModel.jsCount;
        }
        if ((i16 & 4) != 0) {
            i13 = trackHitCachedModel.cssCount;
        }
        if ((i16 & 8) != 0) {
            i14 = trackHitCachedModel.otherCount;
        }
        if ((i16 & 16) != 0) {
            i15 = trackHitCachedModel.hitCount;
        }
        if ((i16 & 32) != 0) {
            str = trackHitCachedModel.hitRate;
        }
        if ((i16 & 64) != 0) {
            z11 = trackHitCachedModel.hitIndexHtml;
        }
        String str2 = str;
        boolean z12 = z11;
        int i17 = i15;
        int i18 = i13;
        return trackHitCachedModel.copy(i11, i12, i18, i14, i17, str2, z12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackHitCachedModel)) {
            return false;
        }
        TrackHitCachedModel trackHitCachedModel = (TrackHitCachedModel) other;
        return this.requestCount == trackHitCachedModel.requestCount && this.jsCount == trackHitCachedModel.jsCount && this.cssCount == trackHitCachedModel.cssCount && this.otherCount == trackHitCachedModel.otherCount && this.hitCount == trackHitCachedModel.hitCount && Intrinsics.areEqual(this.hitRate, trackHitCachedModel.hitRate) && this.hitIndexHtml == trackHitCachedModel.hitIndexHtml;
    }

    public TrackHitCachedModel(int i11, int i12, int i13, int i14, int i15, @NotNull String hitRate, boolean z11) {
        Intrinsics.checkNotNullParameter(hitRate, "hitRate");
        this.requestCount = i11;
        this.jsCount = i12;
        this.cssCount = i13;
        this.otherCount = i14;
        this.hitCount = i15;
        this.hitRate = hitRate;
        this.hitIndexHtml = z11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRequestCount() {
        return this.requestCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getJsCount() {
        return this.jsCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCssCount() {
        return this.cssCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOtherCount() {
        return this.otherCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHitCount() {
        return this.hitCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHitRate() {
        return this.hitRate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHitIndexHtml() {
        return this.hitIndexHtml;
    }

    @NotNull
    public final TrackHitCachedModel copy(int requestCount, int jsCount, int cssCount, int otherCount, int hitCount, @NotNull String hitRate, boolean hitIndexHtml) {
        Intrinsics.checkNotNullParameter(hitRate, "hitRate");
        return new TrackHitCachedModel(requestCount, jsCount, cssCount, otherCount, hitCount, hitRate, hitIndexHtml);
    }

    public final int getCssCount() {
        return this.cssCount;
    }

    public final int getHitCount() {
        return this.hitCount;
    }

    public final boolean getHitIndexHtml() {
        return this.hitIndexHtml;
    }

    @NotNull
    public final String getHitRate() {
        return this.hitRate;
    }

    public final int getJsCount() {
        return this.jsCount;
    }

    public final int getOtherCount() {
        return this.otherCount;
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.requestCount) * 31) + Integer.hashCode(this.jsCount)) * 31) + Integer.hashCode(this.cssCount)) * 31) + Integer.hashCode(this.otherCount)) * 31) + Integer.hashCode(this.hitCount)) * 31) + this.hitRate.hashCode()) * 31;
        boolean z11 = this.hitIndexHtml;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    @NotNull
    public String toString() {
        return "TrackHitCachedModel(requestCount=" + this.requestCount + ", jsCount=" + this.jsCount + ", cssCount=" + this.cssCount + ", otherCount=" + this.otherCount + ", hitCount=" + this.hitCount + ", hitRate=" + this.hitRate + ", hitIndexHtml=" + this.hitIndexHtml + ')';
    }

    public /* synthetic */ TrackHitCachedModel(int i11, int i12, int i13, int i14, int i15, String str, boolean z11, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 0 : i15, (i16 & 32) != 0 ? "0%" : str, (i16 & 64) != 0 ? false : z11);
    }
}
