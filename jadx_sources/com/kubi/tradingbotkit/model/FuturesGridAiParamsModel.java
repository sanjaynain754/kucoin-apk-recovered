package com.kubi.tradingbotkit.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FuturesGridAiParamsModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001c\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\t¨\u00064"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/FuturesGridAiParamsModel;", "", "<init>", "()V", "diff", "Ljava/math/BigDecimal;", "getDiff", "()Ljava/math/BigDecimal;", "setDiff", "(Ljava/math/BigDecimal;)V", "direction", "", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "feeRatio", "getFeeRatio", "setFeeRatio", "gridNum", "getGridNum", "setGridNum", "gridProfitLowerRatio", "getGridProfitLowerRatio", "setGridProfitLowerRatio", "gridProfitUpperRatio", "getGridProfitUpperRatio", "setGridProfitUpperRatio", "isNotice", "", "()Ljava/lang/Boolean;", "setNotice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "leverage", "getLeverage", "setLeverage", "lowerLimit", "getLowerLimit", "setLowerLimit", "minAmount", "getMinAmount", "setMinAmount", "multiplier", "getMultiplier", "setMultiplier", "realMinAmount", "getRealMinAmount", "setRealMinAmount", "upperLimit", "getUpperLimit", "setUpperLimit", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesGridAiParamsModel {

    @Nullable
    private BigDecimal diff;

    @Nullable
    private String direction;

    @Nullable
    private BigDecimal feeRatio;

    @Nullable
    private BigDecimal gridNum;

    @Nullable
    private BigDecimal gridProfitLowerRatio;

    @Nullable
    private BigDecimal gridProfitUpperRatio;

    @Nullable
    private Boolean isNotice;

    @Nullable
    private BigDecimal leverage;

    @Nullable
    private BigDecimal lowerLimit;

    @Nullable
    private BigDecimal minAmount;

    @Nullable
    private BigDecimal multiplier;

    @Nullable
    private BigDecimal realMinAmount;

    @Nullable
    private BigDecimal upperLimit;

    @Nullable
    public final BigDecimal getDiff() {
        return this.diff;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final BigDecimal getFeeRatio() {
        return this.feeRatio;
    }

    @Nullable
    public final BigDecimal getGridNum() {
        return this.gridNum;
    }

    @Nullable
    public final BigDecimal getGridProfitLowerRatio() {
        return this.gridProfitLowerRatio;
    }

    @Nullable
    public final BigDecimal getGridProfitUpperRatio() {
        return this.gridProfitUpperRatio;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    @Nullable
    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    public final BigDecimal getRealMinAmount() {
        return this.realMinAmount;
    }

    @Nullable
    public final BigDecimal getUpperLimit() {
        return this.upperLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: isNotice, reason: from getter */
    public final Boolean getIsNotice() {
        return this.isNotice;
    }

    public final void setDiff(@Nullable BigDecimal bigDecimal) {
        this.diff = bigDecimal;
    }

    public final void setDirection(@Nullable String str) {
        this.direction = str;
    }

    public final void setFeeRatio(@Nullable BigDecimal bigDecimal) {
        this.feeRatio = bigDecimal;
    }

    public final void setGridNum(@Nullable BigDecimal bigDecimal) {
        this.gridNum = bigDecimal;
    }

    public final void setGridProfitLowerRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitLowerRatio = bigDecimal;
    }

    public final void setGridProfitUpperRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitUpperRatio = bigDecimal;
    }

    public final void setLeverage(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    public final void setLowerLimit(@Nullable BigDecimal bigDecimal) {
        this.lowerLimit = bigDecimal;
    }

    public final void setMinAmount(@Nullable BigDecimal bigDecimal) {
        this.minAmount = bigDecimal;
    }

    public final void setMultiplier(@Nullable BigDecimal bigDecimal) {
        this.multiplier = bigDecimal;
    }

    public final void setNotice(@Nullable Boolean bool) {
        this.isNotice = bool;
    }

    public final void setRealMinAmount(@Nullable BigDecimal bigDecimal) {
        this.realMinAmount = bigDecimal;
    }

    public final void setUpperLimit(@Nullable BigDecimal bigDecimal) {
        this.upperLimit = bigDecimal;
    }
}
