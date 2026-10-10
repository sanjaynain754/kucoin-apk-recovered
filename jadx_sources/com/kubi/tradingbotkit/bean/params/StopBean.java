package com.kubi.tradingbotkit.bean.params;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: StopBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/StopBean;", "", "<init>", "()V", "buyBase", "", "getBuyBase", "()Ljava/lang/Boolean;", "setBuyBase", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "sellAllBase", "getSellAllBase", "setSellAllBase", "taskId", "", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StopBean {

    @Nullable
    private Boolean buyBase;

    @Nullable
    private Boolean sellAllBase;

    @Nullable
    private Long taskId;

    @Nullable
    public final Boolean getBuyBase() {
        return this.buyBase;
    }

    @Nullable
    public final Boolean getSellAllBase() {
        return this.sellAllBase;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    public final void setBuyBase(@Nullable Boolean bool) {
        this.buyBase = bool;
    }

    public final void setSellAllBase(@Nullable Boolean bool) {
        this.sellAllBase = bool;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    public StopBean() {
        Boolean bool = Boolean.FALSE;
        this.buyBase = bool;
        this.sellAllBase = bool;
        this.taskId = 0L;
    }
}
