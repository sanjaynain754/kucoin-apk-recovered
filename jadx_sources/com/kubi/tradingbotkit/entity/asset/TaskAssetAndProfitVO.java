package com.kubi.tradingbotkit.entity.asset;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AssetsTotalEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\t¨\u0006)"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/asset/TaskAssetAndProfitVO;", "", "<init>", "()V", "runningAmount", "", "getRunningAmount", "()Ljava/lang/String;", "setRunningAmount", "(Ljava/lang/String;)V", "symbol", "getSymbol", "setSymbol", "symbolName", "getSymbolName", "setSymbolName", "taskId", "", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "todayProfit", "getTodayProfit", "setTodayProfit", "totalProfit", "getTotalProfit", "setTotalProfit", "isNewAipVersion", "", "()Ljava/lang/Boolean;", "setNewAipVersion", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "newAipVersionTip", "getNewAipVersionTip", "setNewAipVersionTip", "totalCost", "getTotalCost", "setTotalCost", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TaskAssetAndProfitVO {

    @Nullable
    private Boolean isNewAipVersion;

    @Nullable
    private String newAipVersionTip;

    @Nullable
    private String runningAmount;

    @Nullable
    private String symbol;

    @Nullable
    private String symbolName;

    @Nullable
    private Long taskId;

    @Nullable
    private String todayProfit;

    @Nullable
    private String totalCost;

    @Nullable
    private String totalProfit;

    @Nullable
    public final String getNewAipVersionTip() {
        return this.newAipVersionTip;
    }

    @Nullable
    public final String getRunningAmount() {
        return this.runningAmount;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getTodayProfit() {
        return this.todayProfit;
    }

    @Nullable
    public final String getTotalCost() {
        return this.totalCost;
    }

    @Nullable
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    @Nullable
    /* JADX INFO: renamed from: isNewAipVersion, reason: from getter */
    public final Boolean getIsNewAipVersion() {
        return this.isNewAipVersion;
    }

    public final void setNewAipVersion(@Nullable Boolean bool) {
        this.isNewAipVersion = bool;
    }

    public final void setNewAipVersionTip(@Nullable String str) {
        this.newAipVersionTip = str;
    }

    public final void setRunningAmount(@Nullable String str) {
        this.runningAmount = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setSymbolName(@Nullable String str) {
        this.symbolName = str;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    public final void setTodayProfit(@Nullable String str) {
        this.todayProfit = str;
    }

    public final void setTotalCost(@Nullable String str) {
        this.totalCost = str;
    }

    public final void setTotalProfit(@Nullable String str) {
        this.totalProfit = str;
    }
}
