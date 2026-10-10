package com.kubi.operation.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainCoinLineDataEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/operation/lib/entity/ChartPoint;", "", "time", "", "closePrice", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClosePrice", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/operation/lib/entity/ChartPoint;", "equals", "", "other", "hashCode", "", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChartPoint {

    @Nullable
    private final String closePrice;

    @Nullable
    private final Long time;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartPoint)) {
            return false;
        }
        ChartPoint chartPoint = (ChartPoint) other;
        return Intrinsics.areEqual(this.time, chartPoint.time) && Intrinsics.areEqual(this.closePrice, chartPoint.closePrice);
    }

    public static /* synthetic */ ChartPoint copy$default(ChartPoint chartPoint, Long l11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = chartPoint.time;
        }
        if ((i11 & 2) != 0) {
            str = chartPoint.closePrice;
        }
        return chartPoint.copy(l11, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClosePrice() {
        return this.closePrice;
    }

    @NotNull
    public final ChartPoint copy(@Nullable Long time, @Nullable String closePrice) {
        return new ChartPoint(time, closePrice);
    }

    @Nullable
    public final String getClosePrice() {
        return this.closePrice;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Long l11 = this.time;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.closePrice;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChartPoint(time=" + this.time + ", closePrice=" + this.closePrice + ')';
    }

    public ChartPoint(@Nullable Long l11, @Nullable String str) {
        this.time = l11;
        this.closePrice = str;
    }
}
