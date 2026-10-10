package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/MarketInfoEntity;", "", "<init>", "()V", "feeRate", "", "getFeeRate", "()Ljava/lang/Double;", "setFeeRate", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "isNotice", "", "()Ljava/lang/Boolean;", "setNotice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "minimumInvestment", "Ljava/math/BigDecimal;", "getMinimumInvestment", "()Ljava/math/BigDecimal;", "setMinimumInvestment", "(Ljava/math/BigDecimal;)V", "minimumOrderValue", "getMinimumOrderValue", "setMinimumOrderValue", "symbol", "", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketInfoEntity {

    @Nullable
    private Double feeRate = Double.valueOf(0.0d);

    @Nullable
    private Boolean isNotice = Boolean.FALSE;

    @Nullable
    private BigDecimal minimumInvestment;

    @Nullable
    private BigDecimal minimumOrderValue;

    @Nullable
    private String symbol;

    @Nullable
    public final Double getFeeRate() {
        return this.feeRate;
    }

    @Nullable
    public final BigDecimal getMinimumInvestment() {
        return this.minimumInvestment;
    }

    @Nullable
    public final BigDecimal getMinimumOrderValue() {
        return this.minimumOrderValue;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: isNotice, reason: from getter */
    public final Boolean getIsNotice() {
        return this.isNotice;
    }

    public final void setFeeRate(@Nullable Double d11) {
        this.feeRate = d11;
    }

    public final void setMinimumInvestment(@Nullable BigDecimal bigDecimal) {
        this.minimumInvestment = bigDecimal;
    }

    public final void setMinimumOrderValue(@Nullable BigDecimal bigDecimal) {
        this.minimumOrderValue = bigDecimal;
    }

    public final void setNotice(@Nullable Boolean bool) {
        this.isNotice = bool;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public MarketInfoEntity() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.minimumInvestment = bigDecimal;
        this.minimumOrderValue = bigDecimal;
    }
}
