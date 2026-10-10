package com.kubi.tradingbotkit.model;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FuturesGridSymbolInfoModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001c\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001c\u00101\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001c\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001c\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001c\u0010:\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001c\u0010=\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001c\u0010@\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000fR\u001c\u0010C\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u000fR\u001c\u0010F\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001c\u0010I\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010\u000fR\u001c\u0010L\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR\u001c\u0010O\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\t¨\u0006R"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/FuturesGridSymbolInfoModel;", "", "<init>", "()V", "amplitudeRatio", "Ljava/math/BigDecimal;", "getAmplitudeRatio", "()Ljava/math/BigDecimal;", "setAmplitudeRatio", "(Ljava/math/BigDecimal;)V", TtmlNode.RUBY_BASE, "", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "changePrice", "getChangePrice", "setChangePrice", "changeRate", "getChangeRate", "setChangeRate", "createdAt", "getCreatedAt", "setCreatedAt", "imgUrl", "getImgUrl", "setImgUrl", "isNotice", "", "()Ljava/lang/Boolean;", "setNotice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lastTradedPrice", "getLastTradedPrice", "setLastTradedPrice", "maxRiskLimit", "getMaxRiskLimit", "setMaxRiskLimit", "minAmount", "getMinAmount", "setMinAmount", "multiplier", "getMultiplier", "setMultiplier", "order", "getOrder", "setOrder", "partition", "getPartition", "setPartition", "precision", "getPrecision", "setPrecision", "profitPrecision", "getProfitPrecision", "setProfitPrecision", "quote", "getQuote", "setQuote", "symbolCode", "getSymbolCode", "setSymbolCode", "symbolName", "getSymbolName", "setSymbolName", "tag", "getTag", "setTag", "defaultLeverage", "getDefaultLeverage", "setDefaultLeverage", "defaultDirection", "getDefaultDirection", "setDefaultDirection", "multipleBoundary", "getMultipleBoundary", "setMultipleBoundary", "gridProfitRatio", "getGridProfitRatio", "setGridProfitRatio", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesGridSymbolInfoModel {

    @Nullable
    private BigDecimal amplitudeRatio;

    @Nullable
    private String base;

    @Nullable
    private BigDecimal changePrice;

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private BigDecimal createdAt;

    @Nullable
    private String defaultDirection;

    @Nullable
    private BigDecimal defaultLeverage;

    @Nullable
    private BigDecimal gridProfitRatio;

    @Nullable
    private String imgUrl;

    @Nullable
    private Boolean isNotice;

    @Nullable
    private BigDecimal lastTradedPrice;

    @Nullable
    private BigDecimal maxRiskLimit;

    @Nullable
    private BigDecimal minAmount;

    @Nullable
    private BigDecimal multipleBoundary;

    @Nullable
    private BigDecimal multiplier;

    @Nullable
    private BigDecimal order;

    @Nullable
    private String partition;

    @Nullable
    private BigDecimal precision;

    @Nullable
    private BigDecimal profitPrecision;

    @Nullable
    private String quote;

    @Nullable
    private String symbolCode;

    @Nullable
    private String symbolName;

    @Nullable
    private String tag;

    @Nullable
    public final BigDecimal getAmplitudeRatio() {
        return this.amplitudeRatio;
    }

    @Nullable
    public final String getBase() {
        return this.base;
    }

    @Nullable
    public final BigDecimal getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final BigDecimal getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDefaultDirection() {
        return this.defaultDirection;
    }

    @Nullable
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final BigDecimal getGridProfitRatio() {
        return this.gridProfitRatio;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final BigDecimal getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    public final BigDecimal getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @Nullable
    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final BigDecimal getMultipleBoundary() {
        return this.multipleBoundary;
    }

    @Nullable
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    @Nullable
    public final BigDecimal getOrder() {
        return this.order;
    }

    @Nullable
    public final String getPartition() {
        return this.partition;
    }

    @Nullable
    public final BigDecimal getPrecision() {
        return this.precision;
    }

    @Nullable
    public final BigDecimal getProfitPrecision() {
        return this.profitPrecision;
    }

    @Nullable
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: isNotice, reason: from getter */
    public final Boolean getIsNotice() {
        return this.isNotice;
    }

    public final void setAmplitudeRatio(@Nullable BigDecimal bigDecimal) {
        this.amplitudeRatio = bigDecimal;
    }

    public final void setBase(@Nullable String str) {
        this.base = str;
    }

    public final void setChangePrice(@Nullable BigDecimal bigDecimal) {
        this.changePrice = bigDecimal;
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setCreatedAt(@Nullable BigDecimal bigDecimal) {
        this.createdAt = bigDecimal;
    }

    public final void setDefaultDirection(@Nullable String str) {
        this.defaultDirection = str;
    }

    public final void setDefaultLeverage(@Nullable BigDecimal bigDecimal) {
        this.defaultLeverage = bigDecimal;
    }

    public final void setGridProfitRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitRatio = bigDecimal;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setLastTradedPrice(@Nullable BigDecimal bigDecimal) {
        this.lastTradedPrice = bigDecimal;
    }

    public final void setMaxRiskLimit(@Nullable BigDecimal bigDecimal) {
        this.maxRiskLimit = bigDecimal;
    }

    public final void setMinAmount(@Nullable BigDecimal bigDecimal) {
        this.minAmount = bigDecimal;
    }

    public final void setMultipleBoundary(@Nullable BigDecimal bigDecimal) {
        this.multipleBoundary = bigDecimal;
    }

    public final void setMultiplier(@Nullable BigDecimal bigDecimal) {
        this.multiplier = bigDecimal;
    }

    public final void setNotice(@Nullable Boolean bool) {
        this.isNotice = bool;
    }

    public final void setOrder(@Nullable BigDecimal bigDecimal) {
        this.order = bigDecimal;
    }

    public final void setPartition(@Nullable String str) {
        this.partition = str;
    }

    public final void setPrecision(@Nullable BigDecimal bigDecimal) {
        this.precision = bigDecimal;
    }

    public final void setProfitPrecision(@Nullable BigDecimal bigDecimal) {
        this.profitPrecision = bigDecimal;
    }

    public final void setQuote(@Nullable String str) {
        this.quote = str;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setSymbolName(@Nullable String str) {
        this.symbolName = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }
}
