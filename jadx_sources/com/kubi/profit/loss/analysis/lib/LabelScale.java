package com.kubi.profit.loss.analysis.lib;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/LabelScale;", "", "min", "", "middle", "max", "<init>", "(DDD)V", "getMin", "()D", "getMiddle", "getMax", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LabelScale {
    private final double max;
    private final double middle;
    private final double min;

    public LabelScale() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelScale)) {
            return false;
        }
        LabelScale labelScale = (LabelScale) other;
        return Double.compare(this.min, labelScale.min) == 0 && Double.compare(this.middle, labelScale.middle) == 0 && Double.compare(this.max, labelScale.max) == 0;
    }

    public LabelScale(double d11, double d12, double d13) {
        this.min = d11;
        this.middle = d12;
        this.max = d13;
    }

    public static /* synthetic */ LabelScale copy$default(LabelScale labelScale, double d11, double d12, double d13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = labelScale.min;
        }
        double d14 = d11;
        if ((i11 & 2) != 0) {
            d12 = labelScale.middle;
        }
        double d15 = d12;
        if ((i11 & 4) != 0) {
            d13 = labelScale.max;
        }
        return labelScale.copy(d14, d15, d13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getMiddle() {
        return this.middle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    @NotNull
    public final LabelScale copy(double min, double middle, double max) {
        return new LabelScale(min, middle, max);
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMiddle() {
        return this.middle;
    }

    public final double getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((Double.hashCode(this.min) * 31) + Double.hashCode(this.middle)) * 31) + Double.hashCode(this.max);
    }

    @NotNull
    public String toString() {
        return "LabelScale(min=" + this.min + ", middle=" + this.middle + ", max=" + this.max + ')';
    }

    public /* synthetic */ LabelScale(double d11, double d12, double d13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.1d : d11, (i11 & 2) != 0 ? 0.1d : d12, (i11 & 4) != 0 ? 0.1d : d13);
    }
}
