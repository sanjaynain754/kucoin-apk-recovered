package com.kubi.market.monitor.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FloatingItemMeasureInfo.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/entity/FloatingItemMeasureInfo;", "", "measuredWidth", "", "measuredHeight", "<init>", "(II)V", "getMeasuredWidth", "()I", "getMeasuredHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FloatingItemMeasureInfo {
    private final int measuredHeight;
    private final int measuredWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingItemMeasureInfo() {
        int i11 = 0;
        this(i11, i11, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatingItemMeasureInfo)) {
            return false;
        }
        FloatingItemMeasureInfo floatingItemMeasureInfo = (FloatingItemMeasureInfo) other;
        return this.measuredWidth == floatingItemMeasureInfo.measuredWidth && this.measuredHeight == floatingItemMeasureInfo.measuredHeight;
    }

    public FloatingItemMeasureInfo(int i11, int i12) {
        this.measuredWidth = i11;
        this.measuredHeight = i12;
    }

    public static /* synthetic */ FloatingItemMeasureInfo copy$default(FloatingItemMeasureInfo floatingItemMeasureInfo, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = floatingItemMeasureInfo.measuredWidth;
        }
        if ((i13 & 2) != 0) {
            i12 = floatingItemMeasureInfo.measuredHeight;
        }
        return floatingItemMeasureInfo.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMeasuredWidth() {
        return this.measuredWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMeasuredHeight() {
        return this.measuredHeight;
    }

    @NotNull
    public final FloatingItemMeasureInfo copy(int measuredWidth, int measuredHeight) {
        return new FloatingItemMeasureInfo(measuredWidth, measuredHeight);
    }

    public final int getMeasuredHeight() {
        return this.measuredHeight;
    }

    public final int getMeasuredWidth() {
        return this.measuredWidth;
    }

    public int hashCode() {
        return (Integer.hashCode(this.measuredWidth) * 31) + Integer.hashCode(this.measuredHeight);
    }

    @NotNull
    public String toString() {
        return "FloatingItemMeasureInfo(measuredWidth=" + this.measuredWidth + ", measuredHeight=" + this.measuredHeight + ')';
    }

    public /* synthetic */ FloatingItemMeasureInfo(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
