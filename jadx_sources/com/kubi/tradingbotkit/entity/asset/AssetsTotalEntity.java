package com.kubi.tradingbotkit.entity.asset;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AssetsTotalEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/asset/AssetsTotalEntity;", "", "<init>", "()V", "taskAssetAndProfitGroupVOList", "", "Lcom/kubi/tradingbotkit/entity/asset/TaskAssetAndProfitGroupVO;", "getTaskAssetAndProfitGroupVOList", "()Ljava/util/List;", "setTaskAssetAndProfitGroupVOList", "(Ljava/util/List;)V", "todayRunningProfit", "", "getTodayRunningProfit", "()Ljava/lang/String;", "setTodayRunningProfit", "(Ljava/lang/String;)V", "totalRunningAmount", "getTotalRunningAmount", "setTotalRunningAmount", "totalRunningProfit", "getTotalRunningProfit", "setTotalRunningProfit", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetsTotalEntity {

    @Nullable
    private List<TaskAssetAndProfitGroupVO> taskAssetAndProfitGroupVOList;

    @Nullable
    private String todayRunningProfit;

    @Nullable
    private String totalRunningAmount;

    @Nullable
    private String totalRunningProfit;

    @Nullable
    public final List<TaskAssetAndProfitGroupVO> getTaskAssetAndProfitGroupVOList() {
        return this.taskAssetAndProfitGroupVOList;
    }

    @Nullable
    public final String getTodayRunningProfit() {
        return this.todayRunningProfit;
    }

    @Nullable
    public final String getTotalRunningAmount() {
        return this.totalRunningAmount;
    }

    @Nullable
    public final String getTotalRunningProfit() {
        return this.totalRunningProfit;
    }

    public final void setTaskAssetAndProfitGroupVOList(@Nullable List<TaskAssetAndProfitGroupVO> list) {
        this.taskAssetAndProfitGroupVOList = list;
    }

    public final void setTodayRunningProfit(@Nullable String str) {
        this.todayRunningProfit = str;
    }

    public final void setTotalRunningAmount(@Nullable String str) {
        this.totalRunningAmount = str;
    }

    public final void setTotalRunningProfit(@Nullable String str) {
        this.totalRunningProfit = str;
    }
}
