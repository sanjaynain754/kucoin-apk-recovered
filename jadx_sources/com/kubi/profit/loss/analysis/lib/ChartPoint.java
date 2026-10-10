package com.kubi.profit.loss.analysis.lib;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/ChartPoint;", "", "time", "", "total", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/Long;Ljava/math/BigDecimal;)V", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotal", "()Ljava/math/BigDecimal;", "setTotal", "(Ljava/math/BigDecimal;)V", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/math/BigDecimal;)Lcom/kubi/profit/loss/analysis/lib/ChartPoint;", "equals", "", "other", "hashCode", "", "toString", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChartPoint {

    @Nullable
    private final Long time;

    @Nullable
    private BigDecimal total;

    /* JADX WARN: Multi-variable type inference failed */
    public ChartPoint() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartPoint)) {
            return false;
        }
        ChartPoint chartPoint = (ChartPoint) other;
        return Intrinsics.areEqual(this.time, chartPoint.time) && Intrinsics.areEqual(this.total, chartPoint.total);
    }

    public ChartPoint(@Nullable Long l11, @Nullable BigDecimal bigDecimal) {
        this.time = l11;
        this.total = bigDecimal;
    }

    public static /* synthetic */ ChartPoint copy$default(ChartPoint chartPoint, Long l11, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = chartPoint.time;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = chartPoint.total;
        }
        return chartPoint.copy(l11, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotal() {
        return this.total;
    }

    @NotNull
    public final ChartPoint copy(@Nullable Long time, @Nullable BigDecimal total) {
        return new ChartPoint(time, total);
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final BigDecimal getTotal() {
        return this.total;
    }

    public int hashCode() {
        Long l11 = this.time;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        BigDecimal bigDecimal = this.total;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public final void setTotal(@Nullable BigDecimal bigDecimal) {
        this.total = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "ChartPoint(time=" + this.time + ", total=" + this.total + ')';
    }

    public /* synthetic */ ChartPoint(Long l11, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal);
    }
}
