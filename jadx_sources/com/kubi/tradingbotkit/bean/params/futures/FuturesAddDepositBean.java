package com.kubi.tradingbotkit.bean.params.futures;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FuturesAddDepositBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/futures/FuturesAddDepositBean;", "", "<init>", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "taskId", "", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesAddDepositBean {

    @Nullable
    private String amount;

    @Nullable
    private Long taskId;

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    public final void setAmount(@Nullable String str) {
        this.amount = str;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }
}
