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
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/OldChartPoint;", "", "time", "", "value", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getTime", "()Ljava/lang/String;", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OldChartPoint {

    @Nullable
    private final String time;

    @Nullable
    private BigDecimal value;

    /* JADX WARN: Multi-variable type inference failed */
    public OldChartPoint() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldChartPoint)) {
            return false;
        }
        OldChartPoint oldChartPoint = (OldChartPoint) other;
        return Intrinsics.areEqual(this.time, oldChartPoint.time) && Intrinsics.areEqual(this.value, oldChartPoint.value);
    }

    public OldChartPoint(@Nullable String str, @Nullable BigDecimal bigDecimal) {
        this.time = str;
        this.value = bigDecimal;
    }

    public static /* synthetic */ OldChartPoint copy$default(OldChartPoint oldChartPoint, String str, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = oldChartPoint.time;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = oldChartPoint.value;
        }
        return oldChartPoint.copy(str, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    @NotNull
    public final OldChartPoint copy(@Nullable String time, @Nullable BigDecimal value) {
        return new OldChartPoint(time, value);
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.time;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.value;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public final void setValue(@Nullable BigDecimal bigDecimal) {
        this.value = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "OldChartPoint(time=" + this.time + ", value=" + this.value + ')';
    }

    public /* synthetic */ OldChartPoint(String str, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal);
    }
}
