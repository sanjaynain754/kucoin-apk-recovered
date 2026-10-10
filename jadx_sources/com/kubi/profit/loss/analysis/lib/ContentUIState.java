package com.kubi.profit.loss.analysis.lib;

import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.profit.loss.analysis.api.Asset;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragmentContract$ContentUIState, reason: from toString */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010+\u001a\u00020\u0011HÆ\u0003Jp\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$ContentUIState;", "Lcom/kubi/mvi/state/IState;", "response", "Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;", "rangeTypeList", "", "Lcom/kubi/profit/loss/analysis/lib/RangeType;", "currentRangeName", "", "currentRange", "dataPointState", "Lcom/kubi/profit/loss/analysis/lib/DataPointState;", "rangeTime", "Lcom/kubi/profit/loss/analysis/lib/RangeTime;", "resultSuccess", "", "asset", "Lcom/kubi/profit/loss/analysis/api/Asset;", "<init>", "(Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/profit/loss/analysis/lib/DataPointState;Lcom/kubi/profit/loss/analysis/lib/RangeTime;Ljava/lang/Boolean;Lcom/kubi/profit/loss/analysis/api/Asset;)V", "getResponse", "()Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;", "getRangeTypeList", "()Ljava/util/List;", "getCurrentRangeName", "()Ljava/lang/String;", "getCurrentRange", "getDataPointState", "()Lcom/kubi/profit/loss/analysis/lib/DataPointState;", "getRangeTime", "()Lcom/kubi/profit/loss/analysis/lib/RangeTime;", "getResultSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAsset", "()Lcom/kubi/profit/loss/analysis/api/Asset;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/profit/loss/analysis/lib/DataPointState;Lcom/kubi/profit/loss/analysis/lib/RangeTime;Ljava/lang/Boolean;Lcom/kubi/profit/loss/analysis/api/Asset;)Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$ContentUIState;", "equals", "other", "", "hashCode", "", "toString", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContentUIState implements InterfaceC19284f {

    @NotNull
    private final Asset asset;

    @NotNull
    private final String currentRange;

    @Nullable
    private final String currentRangeName;

    @Nullable
    private final DataPointState dataPointState;

    @Nullable
    private final RangeTime rangeTime;

    @Nullable
    private final List<RangeType> rangeTypeList;

    @Nullable
    private final ProfitLossAnalysisApiResponse response;

    @Nullable
    private final Boolean resultSuccess;

    public ContentUIState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentUIState copy$default(ContentUIState contentUIState, ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse, List list, String str, String str2, DataPointState dataPointState, RangeTime rangeTime, Boolean bool, Asset asset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            profitLossAnalysisApiResponse = contentUIState.response;
        }
        if ((i11 & 2) != 0) {
            list = contentUIState.rangeTypeList;
        }
        if ((i11 & 4) != 0) {
            str = contentUIState.currentRangeName;
        }
        if ((i11 & 8) != 0) {
            str2 = contentUIState.currentRange;
        }
        if ((i11 & 16) != 0) {
            dataPointState = contentUIState.dataPointState;
        }
        if ((i11 & 32) != 0) {
            rangeTime = contentUIState.rangeTime;
        }
        if ((i11 & 64) != 0) {
            bool = contentUIState.resultSuccess;
        }
        if ((i11 & 128) != 0) {
            asset = contentUIState.asset;
        }
        Boolean bool2 = bool;
        Asset asset2 = asset;
        DataPointState dataPointState2 = dataPointState;
        RangeTime rangeTime2 = rangeTime;
        return contentUIState.copy(profitLossAnalysisApiResponse, list, str, str2, dataPointState2, rangeTime2, bool2, asset2);
    }

    @NotNull
    public final ContentUIState copy(@Nullable ProfitLossAnalysisApiResponse response, @Nullable List<RangeType> rangeTypeList, @Nullable String currentRangeName, @NotNull String currentRange, @Nullable DataPointState dataPointState, @Nullable RangeTime rangeTime, @Nullable Boolean resultSuccess, @NotNull Asset asset) {
        Intrinsics.checkNotNullParameter(currentRange, "currentRange");
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new ContentUIState(response, rangeTypeList, currentRangeName, currentRange, dataPointState, rangeTime, resultSuccess, asset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentUIState)) {
            return false;
        }
        ContentUIState contentUIState = (ContentUIState) other;
        return Intrinsics.areEqual(this.response, contentUIState.response) && Intrinsics.areEqual(this.rangeTypeList, contentUIState.rangeTypeList) && Intrinsics.areEqual(this.currentRangeName, contentUIState.currentRangeName) && Intrinsics.areEqual(this.currentRange, contentUIState.currentRange) && Intrinsics.areEqual(this.dataPointState, contentUIState.dataPointState) && Intrinsics.areEqual(this.rangeTime, contentUIState.rangeTime) && Intrinsics.areEqual(this.resultSuccess, contentUIState.resultSuccess) && Intrinsics.areEqual(this.asset, contentUIState.asset);
    }

    public ContentUIState(@Nullable ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse, @Nullable List<RangeType> list, @Nullable String str, @NotNull String currentRange, @Nullable DataPointState dataPointState, @Nullable RangeTime rangeTime, @Nullable Boolean bool, @NotNull Asset asset) {
        Intrinsics.checkNotNullParameter(currentRange, "currentRange");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.response = profitLossAnalysisApiResponse;
        this.rangeTypeList = list;
        this.currentRangeName = str;
        this.currentRange = currentRange;
        this.dataPointState = dataPointState;
        this.rangeTime = rangeTime;
        this.resultSuccess = bool;
        this.asset = asset;
    }

    @NotNull
    public final String getCurrentRange() {
        return this.currentRange;
    }

    @Nullable
    public final DataPointState getDataPointState() {
        return this.dataPointState;
    }

    @Nullable
    public final List<RangeType> getRangeTypeList() {
        return this.rangeTypeList;
    }

    @Nullable
    public final Boolean getResultSuccess() {
        return this.resultSuccess;
    }

    public int hashCode() {
        ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse = this.response;
        int iHashCode = (profitLossAnalysisApiResponse == null ? 0 : profitLossAnalysisApiResponse.hashCode()) * 31;
        List<RangeType> list = this.rangeTypeList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.currentRangeName;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.currentRange.hashCode()) * 31;
        DataPointState dataPointState = this.dataPointState;
        int iHashCode4 = (iHashCode3 + (dataPointState == null ? 0 : dataPointState.hashCode())) * 31;
        RangeTime rangeTime = this.rangeTime;
        int iHashCode5 = (iHashCode4 + (rangeTime == null ? 0 : rangeTime.hashCode())) * 31;
        Boolean bool = this.resultSuccess;
        return ((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + this.asset.hashCode();
    }

    @NotNull
    public String toString() {
        return "ContentUIState(response=" + this.response + ", rangeTypeList=" + this.rangeTypeList + ", currentRangeName=" + this.currentRangeName + ", currentRange=" + this.currentRange + ", dataPointState=" + this.dataPointState + ", rangeTime=" + this.rangeTime + ", resultSuccess=" + this.resultSuccess + ", asset=" + this.asset + ')';
    }

    public /* synthetic */ ContentUIState(ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse, List list, String str, String str2, DataPointState dataPointState, RangeTime rangeTime, Boolean bool, Asset asset, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : profitLossAnalysisApiResponse, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? "LAST_1_DAY" : str2, (i11 & 16) != 0 ? null : dataPointState, (i11 & 32) != 0 ? null : rangeTime, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? new Asset(null, null, 3, null) : asset);
    }
}
