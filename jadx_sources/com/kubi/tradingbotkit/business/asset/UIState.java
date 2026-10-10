package com.kubi.tradingbotkit.business.asset;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.tradingbotkit.model.assets.AssetsOverviewModel;
import com.kubi.tradingbotkit.model.assets.AssetsTotalModel;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsContract$UIState, reason: from toString */
/* JADX INFO: compiled from: BotAssetsContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J_\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017¨\u0006-"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UIState;", "Lcom/kubi/mvi/state/IState;", "showList", "", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "diffList", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;", "uiHideNumberFlag", "", "overviewModel", "Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", FirebaseAnalytics.Param.CURRENCY, "", "totalModel", "Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;", "showExpendView", "<init>", "(Ljava/util/List;Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;ZLcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;Ljava/lang/String;Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;Z)V", "getShowList", "()Ljava/util/List;", "getDiffList", "()Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;", "getUiHideNumberFlag", "()Z", "getOverviewModel", "()Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", "getCurrency", "()Ljava/lang/String;", "getTotalModel", "()Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;", "getShowExpendView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final String currency;

    @Nullable
    private final DiffList diffList;

    @Nullable
    private final AssetsOverviewModel overviewModel;
    private final boolean showExpendView;

    @Nullable
    private final List<BotAssetsTotalItemModel> showList;

    @Nullable
    private final AssetsTotalModel totalModel;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, null, false, null, null, null, false, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.showList, uIState.showList) && Intrinsics.areEqual(this.diffList, uIState.diffList) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.overviewModel, uIState.overviewModel) && Intrinsics.areEqual(this.currency, uIState.currency) && Intrinsics.areEqual(this.totalModel, uIState.totalModel) && this.showExpendView == uIState.showExpendView;
    }

    public UIState(@Nullable List<BotAssetsTotalItemModel> list, @Nullable DiffList diffList, boolean z11, @Nullable AssetsOverviewModel assetsOverviewModel, @Nullable String str, @Nullable AssetsTotalModel assetsTotalModel, boolean z12) {
        this.showList = list;
        this.diffList = diffList;
        this.uiHideNumberFlag = z11;
        this.overviewModel = assetsOverviewModel;
        this.currency = str;
        this.totalModel = assetsTotalModel;
        this.showExpendView = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, DiffList diffList, boolean z11, AssetsOverviewModel assetsOverviewModel, String str, AssetsTotalModel assetsTotalModel, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.showList;
        }
        if ((i11 & 2) != 0) {
            diffList = uIState.diffList;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 8) != 0) {
            assetsOverviewModel = uIState.overviewModel;
        }
        if ((i11 & 16) != 0) {
            str = uIState.currency;
        }
        if ((i11 & 32) != 0) {
            assetsTotalModel = uIState.totalModel;
        }
        if ((i11 & 64) != 0) {
            z12 = uIState.showExpendView;
        }
        AssetsTotalModel assetsTotalModel2 = assetsTotalModel;
        boolean z13 = z12;
        String str2 = str;
        boolean z14 = z11;
        return uIState.copy(list, diffList, z14, assetsOverviewModel, str2, assetsTotalModel2, z13);
    }

    @NotNull
    public final UIState copy(@Nullable List<BotAssetsTotalItemModel> list, @Nullable DiffList diffList, boolean z11, @Nullable AssetsOverviewModel assetsOverviewModel, @Nullable String str, @Nullable AssetsTotalModel assetsTotalModel, boolean z12) {
        return new UIState(list, diffList, z11, assetsOverviewModel, str, assetsTotalModel, z12);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final DiffList getDiffList() {
        return this.diffList;
    }

    @Nullable
    public final AssetsOverviewModel getOverviewModel() {
        return this.overviewModel;
    }

    public final boolean getShowExpendView() {
        return this.showExpendView;
    }

    @Nullable
    public final List<BotAssetsTotalItemModel> getShowList() {
        return this.showList;
    }

    @Nullable
    public final AssetsTotalModel getTotalModel() {
        return this.totalModel;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        List<BotAssetsTotalItemModel> list = this.showList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        DiffList diffList = this.diffList;
        int iHashCode2 = (((iHashCode + (diffList == null ? 0 : diffList.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31;
        AssetsOverviewModel assetsOverviewModel = this.overviewModel;
        int iHashCode3 = (iHashCode2 + (assetsOverviewModel == null ? 0 : assetsOverviewModel.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AssetsTotalModel assetsTotalModel = this.totalModel;
        return ((iHashCode4 + (assetsTotalModel != null ? assetsTotalModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.showExpendView);
    }

    @NotNull
    public String toString() {
        return "UIState(showList=" + this.showList + ", diffList=" + this.diffList + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", overviewModel=" + this.overviewModel + ", currency=" + this.currency + ", totalModel=" + this.totalModel + ", showExpendView=" + this.showExpendView + ')';
    }

    public /* synthetic */ UIState(List list, DiffList diffList, boolean z11, AssetsOverviewModel assetsOverviewModel, String str, AssetsTotalModel assetsTotalModel, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : diffList, (i11 & 4) != 0 ? IAssetsCenterService.f16464a.get().mo15359y() : z11, (i11 & 8) != 0 ? null : assetsOverviewModel, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : assetsTotalModel, (i11 & 64) != 0 ? true : z12);
    }
}
