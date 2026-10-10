package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TradeBotBaseInfoEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/TradeBotBaseInfoEntity;", "", "<init>", "()V", "defaultInverstGridNumber", "Ljava/math/BigDecimal;", "getDefaultInverstGridNumber", "()Ljava/math/BigDecimal;", "setDefaultInverstGridNumber", "(Ljava/math/BigDecimal;)V", "maxCustomInverstGridNumber", "getMaxCustomInverstGridNumber", "setMaxCustomInverstGridNumber", "minCustomInverstGridNumber", "getMinCustomInverstGridNumber", "setMinCustomInverstGridNumber", "perGridProfitRate", "getPerGridProfitRate", "setPerGridProfitRate", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeBotBaseInfoEntity {

    @Nullable
    private BigDecimal defaultInverstGridNumber;

    @Nullable
    private BigDecimal maxCustomInverstGridNumber;

    @Nullable
    private BigDecimal minCustomInverstGridNumber;

    @Nullable
    private BigDecimal perGridProfitRate;

    @Nullable
    public final BigDecimal getDefaultInverstGridNumber() {
        return this.defaultInverstGridNumber;
    }

    @Nullable
    public final BigDecimal getMaxCustomInverstGridNumber() {
        return this.maxCustomInverstGridNumber;
    }

    @Nullable
    public final BigDecimal getMinCustomInverstGridNumber() {
        return this.minCustomInverstGridNumber;
    }

    @Nullable
    public final BigDecimal getPerGridProfitRate() {
        return this.perGridProfitRate;
    }

    public final void setDefaultInverstGridNumber(@Nullable BigDecimal bigDecimal) {
        this.defaultInverstGridNumber = bigDecimal;
    }

    public final void setMaxCustomInverstGridNumber(@Nullable BigDecimal bigDecimal) {
        this.maxCustomInverstGridNumber = bigDecimal;
    }

    public final void setMinCustomInverstGridNumber(@Nullable BigDecimal bigDecimal) {
        this.minCustomInverstGridNumber = bigDecimal;
    }

    public final void setPerGridProfitRate(@Nullable BigDecimal bigDecimal) {
        this.perGridProfitRate = bigDecimal;
    }
}
