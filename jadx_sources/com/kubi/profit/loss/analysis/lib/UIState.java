package com.kubi.profit.loss.analysis.lib;

import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.profit.loss.analysis.api.Asset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragmentContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\tHÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$UIState;", "Lcom/kubi/mvi/state/IState;", "showContent", "", "showGuide", "dayValueEntity", "Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "needShowChartLayout", "asset", "Lcom/kubi/profit/loss/analysis/api/Asset;", "<init>", "(Ljava/lang/Boolean;ZLcom/kubi/profit/loss/analysis/lib/ValueEntity;Ljava/lang/Boolean;Lcom/kubi/profit/loss/analysis/api/Asset;)V", "getShowContent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowGuide", "()Z", "getDayValueEntity", "()Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "getNeedShowChartLayout", "getAsset", "()Lcom/kubi/profit/loss/analysis/api/Asset;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;ZLcom/kubi/profit/loss/analysis/lib/ValueEntity;Ljava/lang/Boolean;Lcom/kubi/profit/loss/analysis/api/Asset;)Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$UIState;", "equals", "other", "", "hashCode", "", "toString", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final Asset asset;

    @Nullable
    private final ValueEntity dayValueEntity;

    @Nullable
    private final Boolean needShowChartLayout;

    @Nullable
    private final Boolean showContent;
    private final boolean showGuide;

    public UIState() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, Boolean bool, boolean z11, ValueEntity valueEntity, Boolean bool2, Asset asset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = uIState.showContent;
        }
        if ((i11 & 2) != 0) {
            z11 = uIState.showGuide;
        }
        if ((i11 & 4) != 0) {
            valueEntity = uIState.dayValueEntity;
        }
        if ((i11 & 8) != 0) {
            bool2 = uIState.needShowChartLayout;
        }
        if ((i11 & 16) != 0) {
            asset = uIState.asset;
        }
        Asset asset2 = asset;
        ValueEntity valueEntity2 = valueEntity;
        return uIState.copy(bool, z11, valueEntity2, bool2, asset2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.showContent, uIState.showContent) && this.showGuide == uIState.showGuide && Intrinsics.areEqual(this.dayValueEntity, uIState.dayValueEntity) && Intrinsics.areEqual(this.needShowChartLayout, uIState.needShowChartLayout) && Intrinsics.areEqual(this.asset, uIState.asset);
    }

    public UIState(@Nullable Boolean bool, boolean z11, @Nullable ValueEntity valueEntity, @Nullable Boolean bool2, @NotNull Asset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.showContent = bool;
        this.showGuide = z11;
        this.dayValueEntity = valueEntity;
        this.needShowChartLayout = bool2;
        this.asset = asset;
    }

    @NotNull
    public final UIState copy(@Nullable Boolean showContent, boolean showGuide, @Nullable ValueEntity dayValueEntity, @Nullable Boolean needShowChartLayout, @NotNull Asset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new UIState(showContent, showGuide, dayValueEntity, needShowChartLayout, asset);
    }

    @Nullable
    public final ValueEntity getDayValueEntity() {
        return this.dayValueEntity;
    }

    @Nullable
    public final Boolean getNeedShowChartLayout() {
        return this.needShowChartLayout;
    }

    @Nullable
    public final Boolean getShowContent() {
        return this.showContent;
    }

    public int hashCode() {
        Boolean bool = this.showContent;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.showGuide)) * 31;
        ValueEntity valueEntity = this.dayValueEntity;
        int iHashCode2 = (iHashCode + (valueEntity == null ? 0 : valueEntity.hashCode())) * 31;
        Boolean bool2 = this.needShowChartLayout;
        return ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.asset.hashCode();
    }

    @NotNull
    public String toString() {
        return "UIState(showContent=" + this.showContent + ", showGuide=" + this.showGuide + ", dayValueEntity=" + this.dayValueEntity + ", needShowChartLayout=" + this.needShowChartLayout + ", asset=" + this.asset + ')';
    }

    public /* synthetic */ UIState(Boolean bool, boolean z11, ValueEntity valueEntity, Boolean bool2, Asset asset, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : valueEntity, (i11 & 8) != 0 ? null : bool2, (i11 & 16) != 0 ? new Asset(null, null, 3, null) : asset);
    }
}
