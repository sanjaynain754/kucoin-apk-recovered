package com.kubi.profit.loss.analysis.lib;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;", "", "<init>", "()V", "currentRange", "", "getCurrentRange", "()Ljava/lang/String;", "setCurrentRange", "(Ljava/lang/String;)V", "currentRangeV2", "getCurrentRangeV2", "setCurrentRangeV2", "rangeList", "", "Lcom/kubi/profit/loss/analysis/lib/RangeType;", "getRangeList", "()Ljava/util/List;", "setRangeList", "(Ljava/util/List;)V", "rangeListV2", "getRangeListV2", "setRangeListV2", "trendList", "Lcom/kubi/profit/loss/analysis/lib/ChartPoint;", "getTrendList", "setTrendList", "includeSub", "", "getIncludeSub", "()Ljava/lang/Boolean;", "setIncludeSub", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "assetFlowResponseList", "Lcom/kubi/profit/loss/analysis/lib/FlowPoint;", "getAssetFlowResponseList", "setAssetFlowResponseList", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProfitLossAnalysisApiResponse {

    @Nullable
    private String currentRange;

    @Nullable
    private String currentRangeV2;

    @Nullable
    private Boolean includeSub;

    @Nullable
    private List<RangeType> rangeList = CollectionsKt.emptyList();

    @Nullable
    private List<RangeType> rangeListV2 = CollectionsKt.emptyList();

    @Nullable
    private List<ChartPoint> trendList = CollectionsKt.emptyList();

    @Nullable
    private List<FlowPoint> assetFlowResponseList = CollectionsKt.emptyList();

    @Nullable
    public final List<FlowPoint> getAssetFlowResponseList() {
        return this.assetFlowResponseList;
    }

    @Nullable
    public final String getCurrentRange() {
        return this.currentRange;
    }

    @Nullable
    public final String getCurrentRangeV2() {
        return this.currentRangeV2;
    }

    @Nullable
    public final Boolean getIncludeSub() {
        return this.includeSub;
    }

    @Nullable
    public final List<RangeType> getRangeList() {
        return this.rangeList;
    }

    @Nullable
    public final List<RangeType> getRangeListV2() {
        return this.rangeListV2;
    }

    @Nullable
    public final List<ChartPoint> getTrendList() {
        return this.trendList;
    }

    public final void setAssetFlowResponseList(@Nullable List<FlowPoint> list) {
        this.assetFlowResponseList = list;
    }

    public final void setCurrentRange(@Nullable String str) {
        this.currentRange = str;
    }

    public final void setCurrentRangeV2(@Nullable String str) {
        this.currentRangeV2 = str;
    }

    public final void setIncludeSub(@Nullable Boolean bool) {
        this.includeSub = bool;
    }

    public final void setRangeList(@Nullable List<RangeType> list) {
        this.rangeList = list;
    }

    public final void setRangeListV2(@Nullable List<RangeType> list) {
        this.rangeListV2 = list;
    }

    public final void setTrendList(@Nullable List<ChartPoint> list) {
        this.trendList = list;
    }
}
