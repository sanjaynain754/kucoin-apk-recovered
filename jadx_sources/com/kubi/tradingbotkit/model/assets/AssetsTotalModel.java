package com.kubi.tradingbotkit.model.assets;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AssetsTotalModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;", "", "<init>", "()V", "expendList", "", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "getExpendList", "()Ljava/util/List;", "setExpendList", "(Ljava/util/List;)V", "foldList", "getFoldList", "setFoldList", "assetOverViewModel", "Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", "getAssetOverViewModel", "()Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", "setAssetOverViewModel", "(Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;)V", "canExpend", "", "getCanExpend", "()Z", "setCanExpend", "(Z)V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetsTotalModel {

    @Nullable
    private AssetsOverviewModel assetOverViewModel;
    private boolean canExpend = true;

    @Nullable
    private List<BotAssetsTotalItemModel> expendList;

    @Nullable
    private List<BotAssetsTotalItemModel> foldList;

    @Nullable
    public final AssetsOverviewModel getAssetOverViewModel() {
        return this.assetOverViewModel;
    }

    public final boolean getCanExpend() {
        return this.canExpend;
    }

    @Nullable
    public final List<BotAssetsTotalItemModel> getExpendList() {
        return this.expendList;
    }

    @Nullable
    public final List<BotAssetsTotalItemModel> getFoldList() {
        return this.foldList;
    }

    public final void setAssetOverViewModel(@Nullable AssetsOverviewModel assetsOverviewModel) {
        this.assetOverViewModel = assetsOverviewModel;
    }

    public final void setCanExpend(boolean z11) {
        this.canExpend = z11;
    }

    public final void setExpendList(@Nullable List<BotAssetsTotalItemModel> list) {
        this.expendList = list;
    }

    public final void setFoldList(@Nullable List<BotAssetsTotalItemModel> list) {
        this.foldList = list;
    }
}
