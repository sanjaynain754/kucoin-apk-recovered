package com.kubi.tradingbotkit.model.assets;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AssetsOverviewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", "", "<init>", "()V", "todayRunningProfit", "", "getTodayRunningProfit", "()Ljava/lang/String;", "setTodayRunningProfit", "(Ljava/lang/String;)V", "todayRunningProfitShow", "getTodayRunningProfitShow", "setTodayRunningProfitShow", "totalRunningAmount", "getTotalRunningAmount", "setTotalRunningAmount", "totalRunningAmountShow", "getTotalRunningAmountShow", "setTotalRunningAmountShow", "totalRunningProfit", "getTotalRunningProfit", "setTotalRunningProfit", "totalRunningProfitShow", "getTotalRunningProfitShow", "setTotalRunningProfitShow", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetsOverviewModel {

    @Nullable
    private String todayRunningProfit;

    @Nullable
    private String todayRunningProfitShow;

    @Nullable
    private String totalRunningAmount;

    @Nullable
    private String totalRunningAmountShow;

    @Nullable
    private String totalRunningProfit;

    @Nullable
    private String totalRunningProfitShow;

    @Nullable
    public final String getTodayRunningProfit() {
        return this.todayRunningProfit;
    }

    @Nullable
    public final String getTodayRunningProfitShow() {
        return this.todayRunningProfitShow;
    }

    @Nullable
    public final String getTotalRunningAmount() {
        return this.totalRunningAmount;
    }

    @Nullable
    public final String getTotalRunningAmountShow() {
        return this.totalRunningAmountShow;
    }

    @Nullable
    public final String getTotalRunningProfit() {
        return this.totalRunningProfit;
    }

    @Nullable
    public final String getTotalRunningProfitShow() {
        return this.totalRunningProfitShow;
    }

    public final void setTodayRunningProfit(@Nullable String str) {
        this.todayRunningProfit = str;
    }

    public final void setTodayRunningProfitShow(@Nullable String str) {
        this.todayRunningProfitShow = str;
    }

    public final void setTotalRunningAmount(@Nullable String str) {
        this.totalRunningAmount = str;
    }

    public final void setTotalRunningAmountShow(@Nullable String str) {
        this.totalRunningAmountShow = str;
    }

    public final void setTotalRunningProfit(@Nullable String str) {
        this.totalRunningProfit = str;
    }

    public final void setTotalRunningProfitShow(@Nullable String str) {
        this.totalRunningProfitShow = str;
    }
}
