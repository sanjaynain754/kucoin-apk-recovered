package com.kubi.profit.loss.analysis.lib;

import androidx.annotation.Keep;
import com.kubi.resources.widget.chart.data.DataPoint;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Label;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JT\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/DataPointState;", "", "pointList", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "pointValueRange", "", "rangeValueEntity", "Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "labelList", "Lcom/kubi/resources/widget/chart/data/Label;", "maxMinEquals", "", "<init>", "(Ljava/util/List;Ljava/lang/Double;Lcom/kubi/profit/loss/analysis/lib/ValueEntity;Ljava/util/List;Z)V", "getPointList", "()Ljava/util/List;", "getPointValueRange", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRangeValueEntity", "()Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "getLabelList", "getMaxMinEquals", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Double;Lcom/kubi/profit/loss/analysis/lib/ValueEntity;Ljava/util/List;Z)Lcom/kubi/profit/loss/analysis/lib/DataPointState;", "equals", "other", "hashCode", "", "toString", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DataPointState {

    @Nullable
    private final List<Label> labelList;
    private final boolean maxMinEquals;

    @Nullable
    private final List<DataPoint> pointList;

    @Nullable
    private final Double pointValueRange;

    @Nullable
    private final ValueEntity rangeValueEntity;

    public DataPointState() {
        this(null, null, null, null, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataPointState copy$default(DataPointState dataPointState, List list, Double d11, ValueEntity valueEntity, List list2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = dataPointState.pointList;
        }
        if ((i11 & 2) != 0) {
            d11 = dataPointState.pointValueRange;
        }
        if ((i11 & 4) != 0) {
            valueEntity = dataPointState.rangeValueEntity;
        }
        if ((i11 & 8) != 0) {
            list2 = dataPointState.labelList;
        }
        if ((i11 & 16) != 0) {
            z11 = dataPointState.maxMinEquals;
        }
        boolean z12 = z11;
        ValueEntity valueEntity2 = valueEntity;
        return dataPointState.copy(list, d11, valueEntity2, list2, z12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPointState)) {
            return false;
        }
        DataPointState dataPointState = (DataPointState) other;
        return Intrinsics.areEqual(this.pointList, dataPointState.pointList) && Intrinsics.areEqual((Object) this.pointValueRange, (Object) dataPointState.pointValueRange) && Intrinsics.areEqual(this.rangeValueEntity, dataPointState.rangeValueEntity) && Intrinsics.areEqual(this.labelList, dataPointState.labelList) && this.maxMinEquals == dataPointState.maxMinEquals;
    }

    public DataPointState(@Nullable List<DataPoint> list, @Nullable Double d11, @Nullable ValueEntity valueEntity, @Nullable List<Label> list2, boolean z11) {
        this.pointList = list;
        this.pointValueRange = d11;
        this.rangeValueEntity = valueEntity;
        this.labelList = list2;
        this.maxMinEquals = z11;
    }

    @Nullable
    public final List<DataPoint> component1() {
        return this.pointList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPointValueRange() {
        return this.pointValueRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ValueEntity getRangeValueEntity() {
        return this.rangeValueEntity;
    }

    @Nullable
    public final List<Label> component4() {
        return this.labelList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMaxMinEquals() {
        return this.maxMinEquals;
    }

    @NotNull
    public final DataPointState copy(@Nullable List<DataPoint> pointList, @Nullable Double pointValueRange, @Nullable ValueEntity rangeValueEntity, @Nullable List<Label> labelList, boolean maxMinEquals) {
        return new DataPointState(pointList, pointValueRange, rangeValueEntity, labelList, maxMinEquals);
    }

    @Nullable
    public final List<Label> getLabelList() {
        return this.labelList;
    }

    public final boolean getMaxMinEquals() {
        return this.maxMinEquals;
    }

    @Nullable
    public final List<DataPoint> getPointList() {
        return this.pointList;
    }

    @Nullable
    public final Double getPointValueRange() {
        return this.pointValueRange;
    }

    @Nullable
    public final ValueEntity getRangeValueEntity() {
        return this.rangeValueEntity;
    }

    public int hashCode() {
        List<DataPoint> list = this.pointList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Double d11 = this.pointValueRange;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        ValueEntity valueEntity = this.rangeValueEntity;
        int iHashCode3 = (iHashCode2 + (valueEntity == null ? 0 : valueEntity.hashCode())) * 31;
        List<Label> list2 = this.labelList;
        return ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.maxMinEquals);
    }

    @NotNull
    public String toString() {
        return "DataPointState(pointList=" + this.pointList + ", pointValueRange=" + this.pointValueRange + ", rangeValueEntity=" + this.rangeValueEntity + ", labelList=" + this.labelList + ", maxMinEquals=" + this.maxMinEquals + ')';
    }

    public /* synthetic */ DataPointState(List list, Double d11, ValueEntity valueEntity, List list2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : d11, (i11 & 4) != 0 ? null : valueEntity, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? false : z11);
    }
}
