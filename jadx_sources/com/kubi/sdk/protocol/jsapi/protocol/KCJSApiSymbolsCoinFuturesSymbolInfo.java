package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSymbolsCoinModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0084\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0002\u0010/J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003JÂ\u0003\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0003HÆ\u0001J\u0016\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u008a\u0001\u001a\u00030\u008b\u0001HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010,\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00101R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u00101R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00101R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0011\u0010-\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00101R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00101R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00101R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00101R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00101¨\u0006\u008d\u0001"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesSymbolInfo;", "", "type", "", "isInverse", "symbol", "rootSymbol", "baseCurrency", "displayBaseCurrency", "quoteCurrency", "status", "createdAt", "expireDate", "updatedAt", "fairMethod", "firstOpenDate", "fundingBaseSymbol", "fundingQuoteSymbol", "fundingRateSymbol", "indexSymbol", "initialMargin", "isDeleverage", "isQuanto", "lotSize", "maintainMargin", "makerFeeRate", "makerFixFee", "markMethod", "maxOrderQty", "indexPriceTickSize", "maxPrice", "maxRiskLimit", "minRiskLimit", "riskStep", "settleCurrency", "settleDate", "settlementFee", "takerFeeRate", "takerFixFee", "tickSize", "multiplier", "symbolName", "prepName", "maxLeverage", "iconUrl", "marketStage", "preMarketToPerpDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "getCreatedAt", "getDisplayBaseCurrency", "getExpireDate", "getFairMethod", "getFirstOpenDate", "getFundingBaseSymbol", "getFundingQuoteSymbol", "getFundingRateSymbol", "getIconUrl", "getIndexPriceTickSize", "getIndexSymbol", "getInitialMargin", "getLotSize", "getMaintainMargin", "getMakerFeeRate", "getMakerFixFee", "getMarkMethod", "getMarketStage", "getMaxLeverage", "getMaxOrderQty", "getMaxPrice", "getMaxRiskLimit", "getMinRiskLimit", "getMultiplier", "getPreMarketToPerpDate", "getPrepName", "getQuoteCurrency", "getRiskStep", "getRootSymbol", "getSettleCurrency", "getSettleDate", "getSettlementFee", "getStatus", "getSymbol", "getSymbolName", "getTakerFeeRate", "getTakerFixFee", "getTickSize", "getType", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSymbolsCoinFuturesSymbolInfo {

    @NotNull
    private final String baseCurrency;

    @NotNull
    private final String createdAt;

    @NotNull
    private final String displayBaseCurrency;

    @NotNull
    private final String expireDate;

    @NotNull
    private final String fairMethod;

    @NotNull
    private final String firstOpenDate;

    @NotNull
    private final String fundingBaseSymbol;

    @NotNull
    private final String fundingQuoteSymbol;

    @NotNull
    private final String fundingRateSymbol;

    @NotNull
    private final String iconUrl;

    @NotNull
    private final String indexPriceTickSize;

    @NotNull
    private final String indexSymbol;

    @NotNull
    private final String initialMargin;

    @NotNull
    private final String isDeleverage;

    @NotNull
    private final String isInverse;

    @NotNull
    private final String isQuanto;

    @NotNull
    private final String lotSize;

    @NotNull
    private final String maintainMargin;

    @NotNull
    private final String makerFeeRate;

    @NotNull
    private final String makerFixFee;

    @NotNull
    private final String markMethod;

    @NotNull
    private final String marketStage;

    @NotNull
    private final String maxLeverage;

    @NotNull
    private final String maxOrderQty;

    @NotNull
    private final String maxPrice;

    @NotNull
    private final String maxRiskLimit;

    @NotNull
    private final String minRiskLimit;

    @NotNull
    private final String multiplier;

    @NotNull
    private final String preMarketToPerpDate;

    @NotNull
    private final String prepName;

    @NotNull
    private final String quoteCurrency;

    @NotNull
    private final String riskStep;

    @NotNull
    private final String rootSymbol;

    @NotNull
    private final String settleCurrency;

    @NotNull
    private final String settleDate;

    @NotNull
    private final String settlementFee;

    @NotNull
    private final String status;

    @NotNull
    private final String symbol;

    @NotNull
    private final String symbolName;

    @NotNull
    private final String takerFeeRate;

    @NotNull
    private final String takerFixFee;

    @NotNull
    private final String tickSize;

    @NotNull
    private final String type;

    @NotNull
    private final String updatedAt;

    public KCJSApiSymbolsCoinFuturesSymbolInfo(@NotNull String type, @NotNull String isInverse, @NotNull String symbol, @NotNull String rootSymbol, @NotNull String baseCurrency, @NotNull String displayBaseCurrency, @NotNull String quoteCurrency, @NotNull String status, @NotNull String createdAt, @NotNull String expireDate, @NotNull String updatedAt, @NotNull String fairMethod, @NotNull String firstOpenDate, @NotNull String fundingBaseSymbol, @NotNull String fundingQuoteSymbol, @NotNull String fundingRateSymbol, @NotNull String indexSymbol, @NotNull String initialMargin, @NotNull String isDeleverage, @NotNull String isQuanto, @NotNull String lotSize, @NotNull String maintainMargin, @NotNull String makerFeeRate, @NotNull String makerFixFee, @NotNull String markMethod, @NotNull String maxOrderQty, @NotNull String indexPriceTickSize, @NotNull String maxPrice, @NotNull String maxRiskLimit, @NotNull String minRiskLimit, @NotNull String riskStep, @NotNull String settleCurrency, @NotNull String settleDate, @NotNull String settlementFee, @NotNull String takerFeeRate, @NotNull String takerFixFee, @NotNull String tickSize, @NotNull String multiplier, @NotNull String symbolName, @NotNull String prepName, @NotNull String maxLeverage, @NotNull String iconUrl, @NotNull String marketStage, @NotNull String preMarketToPerpDate) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(isInverse, "isInverse");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(rootSymbol, "rootSymbol");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(displayBaseCurrency, "displayBaseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(fairMethod, "fairMethod");
        Intrinsics.checkNotNullParameter(firstOpenDate, "firstOpenDate");
        Intrinsics.checkNotNullParameter(fundingBaseSymbol, "fundingBaseSymbol");
        Intrinsics.checkNotNullParameter(fundingQuoteSymbol, "fundingQuoteSymbol");
        Intrinsics.checkNotNullParameter(fundingRateSymbol, "fundingRateSymbol");
        Intrinsics.checkNotNullParameter(indexSymbol, "indexSymbol");
        Intrinsics.checkNotNullParameter(initialMargin, "initialMargin");
        Intrinsics.checkNotNullParameter(isDeleverage, "isDeleverage");
        Intrinsics.checkNotNullParameter(isQuanto, "isQuanto");
        Intrinsics.checkNotNullParameter(lotSize, "lotSize");
        Intrinsics.checkNotNullParameter(maintainMargin, "maintainMargin");
        Intrinsics.checkNotNullParameter(makerFeeRate, "makerFeeRate");
        Intrinsics.checkNotNullParameter(makerFixFee, "makerFixFee");
        Intrinsics.checkNotNullParameter(markMethod, "markMethod");
        Intrinsics.checkNotNullParameter(maxOrderQty, "maxOrderQty");
        Intrinsics.checkNotNullParameter(indexPriceTickSize, "indexPriceTickSize");
        Intrinsics.checkNotNullParameter(maxPrice, "maxPrice");
        Intrinsics.checkNotNullParameter(maxRiskLimit, "maxRiskLimit");
        Intrinsics.checkNotNullParameter(minRiskLimit, "minRiskLimit");
        Intrinsics.checkNotNullParameter(riskStep, "riskStep");
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        Intrinsics.checkNotNullParameter(settleDate, "settleDate");
        Intrinsics.checkNotNullParameter(settlementFee, "settlementFee");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(takerFixFee, "takerFixFee");
        Intrinsics.checkNotNullParameter(tickSize, "tickSize");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        Intrinsics.checkNotNullParameter(prepName, "prepName");
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(marketStage, "marketStage");
        Intrinsics.checkNotNullParameter(preMarketToPerpDate, "preMarketToPerpDate");
        this.type = type;
        this.isInverse = isInverse;
        this.symbol = symbol;
        this.rootSymbol = rootSymbol;
        this.baseCurrency = baseCurrency;
        this.displayBaseCurrency = displayBaseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.status = status;
        this.createdAt = createdAt;
        this.expireDate = expireDate;
        this.updatedAt = updatedAt;
        this.fairMethod = fairMethod;
        this.firstOpenDate = firstOpenDate;
        this.fundingBaseSymbol = fundingBaseSymbol;
        this.fundingQuoteSymbol = fundingQuoteSymbol;
        this.fundingRateSymbol = fundingRateSymbol;
        this.indexSymbol = indexSymbol;
        this.initialMargin = initialMargin;
        this.isDeleverage = isDeleverage;
        this.isQuanto = isQuanto;
        this.lotSize = lotSize;
        this.maintainMargin = maintainMargin;
        this.makerFeeRate = makerFeeRate;
        this.makerFixFee = makerFixFee;
        this.markMethod = markMethod;
        this.maxOrderQty = maxOrderQty;
        this.indexPriceTickSize = indexPriceTickSize;
        this.maxPrice = maxPrice;
        this.maxRiskLimit = maxRiskLimit;
        this.minRiskLimit = minRiskLimit;
        this.riskStep = riskStep;
        this.settleCurrency = settleCurrency;
        this.settleDate = settleDate;
        this.settlementFee = settlementFee;
        this.takerFeeRate = takerFeeRate;
        this.takerFixFee = takerFixFee;
        this.tickSize = tickSize;
        this.multiplier = multiplier;
        this.symbolName = symbolName;
        this.prepName = prepName;
        this.maxLeverage = maxLeverage;
        this.iconUrl = iconUrl;
        this.marketStage = marketStage;
        this.preMarketToPerpDate = preMarketToPerpDate;
    }

    @NotNull
    public final KCJSApiSymbolsCoinFuturesSymbolInfo copy(@NotNull String type, @NotNull String isInverse, @NotNull String symbol, @NotNull String rootSymbol, @NotNull String baseCurrency, @NotNull String displayBaseCurrency, @NotNull String quoteCurrency, @NotNull String status, @NotNull String createdAt, @NotNull String expireDate, @NotNull String updatedAt, @NotNull String fairMethod, @NotNull String firstOpenDate, @NotNull String fundingBaseSymbol, @NotNull String fundingQuoteSymbol, @NotNull String fundingRateSymbol, @NotNull String indexSymbol, @NotNull String initialMargin, @NotNull String isDeleverage, @NotNull String isQuanto, @NotNull String lotSize, @NotNull String maintainMargin, @NotNull String makerFeeRate, @NotNull String makerFixFee, @NotNull String markMethod, @NotNull String maxOrderQty, @NotNull String indexPriceTickSize, @NotNull String maxPrice, @NotNull String maxRiskLimit, @NotNull String minRiskLimit, @NotNull String riskStep, @NotNull String settleCurrency, @NotNull String settleDate, @NotNull String settlementFee, @NotNull String takerFeeRate, @NotNull String takerFixFee, @NotNull String tickSize, @NotNull String multiplier, @NotNull String symbolName, @NotNull String prepName, @NotNull String maxLeverage, @NotNull String iconUrl, @NotNull String marketStage, @NotNull String preMarketToPerpDate) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(isInverse, "isInverse");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(rootSymbol, "rootSymbol");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(displayBaseCurrency, "displayBaseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(fairMethod, "fairMethod");
        Intrinsics.checkNotNullParameter(firstOpenDate, "firstOpenDate");
        Intrinsics.checkNotNullParameter(fundingBaseSymbol, "fundingBaseSymbol");
        Intrinsics.checkNotNullParameter(fundingQuoteSymbol, "fundingQuoteSymbol");
        Intrinsics.checkNotNullParameter(fundingRateSymbol, "fundingRateSymbol");
        Intrinsics.checkNotNullParameter(indexSymbol, "indexSymbol");
        Intrinsics.checkNotNullParameter(initialMargin, "initialMargin");
        Intrinsics.checkNotNullParameter(isDeleverage, "isDeleverage");
        Intrinsics.checkNotNullParameter(isQuanto, "isQuanto");
        Intrinsics.checkNotNullParameter(lotSize, "lotSize");
        Intrinsics.checkNotNullParameter(maintainMargin, "maintainMargin");
        Intrinsics.checkNotNullParameter(makerFeeRate, "makerFeeRate");
        Intrinsics.checkNotNullParameter(makerFixFee, "makerFixFee");
        Intrinsics.checkNotNullParameter(markMethod, "markMethod");
        Intrinsics.checkNotNullParameter(maxOrderQty, "maxOrderQty");
        Intrinsics.checkNotNullParameter(indexPriceTickSize, "indexPriceTickSize");
        Intrinsics.checkNotNullParameter(maxPrice, "maxPrice");
        Intrinsics.checkNotNullParameter(maxRiskLimit, "maxRiskLimit");
        Intrinsics.checkNotNullParameter(minRiskLimit, "minRiskLimit");
        Intrinsics.checkNotNullParameter(riskStep, "riskStep");
        Intrinsics.checkNotNullParameter(settleCurrency, "settleCurrency");
        Intrinsics.checkNotNullParameter(settleDate, "settleDate");
        Intrinsics.checkNotNullParameter(settlementFee, "settlementFee");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(takerFixFee, "takerFixFee");
        Intrinsics.checkNotNullParameter(tickSize, "tickSize");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        Intrinsics.checkNotNullParameter(prepName, "prepName");
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(marketStage, "marketStage");
        Intrinsics.checkNotNullParameter(preMarketToPerpDate, "preMarketToPerpDate");
        return new KCJSApiSymbolsCoinFuturesSymbolInfo(type, isInverse, symbol, rootSymbol, baseCurrency, displayBaseCurrency, quoteCurrency, status, createdAt, expireDate, updatedAt, fairMethod, firstOpenDate, fundingBaseSymbol, fundingQuoteSymbol, fundingRateSymbol, indexSymbol, initialMargin, isDeleverage, isQuanto, lotSize, maintainMargin, makerFeeRate, makerFixFee, markMethod, maxOrderQty, indexPriceTickSize, maxPrice, maxRiskLimit, minRiskLimit, riskStep, settleCurrency, settleDate, settlementFee, takerFeeRate, takerFixFee, tickSize, multiplier, symbolName, prepName, maxLeverage, iconUrl, marketStage, preMarketToPerpDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSymbolsCoinFuturesSymbolInfo)) {
            return false;
        }
        KCJSApiSymbolsCoinFuturesSymbolInfo kCJSApiSymbolsCoinFuturesSymbolInfo = (KCJSApiSymbolsCoinFuturesSymbolInfo) other;
        return Intrinsics.areEqual(this.type, kCJSApiSymbolsCoinFuturesSymbolInfo.type) && Intrinsics.areEqual(this.isInverse, kCJSApiSymbolsCoinFuturesSymbolInfo.isInverse) && Intrinsics.areEqual(this.symbol, kCJSApiSymbolsCoinFuturesSymbolInfo.symbol) && Intrinsics.areEqual(this.rootSymbol, kCJSApiSymbolsCoinFuturesSymbolInfo.rootSymbol) && Intrinsics.areEqual(this.baseCurrency, kCJSApiSymbolsCoinFuturesSymbolInfo.baseCurrency) && Intrinsics.areEqual(this.displayBaseCurrency, kCJSApiSymbolsCoinFuturesSymbolInfo.displayBaseCurrency) && Intrinsics.areEqual(this.quoteCurrency, kCJSApiSymbolsCoinFuturesSymbolInfo.quoteCurrency) && Intrinsics.areEqual(this.status, kCJSApiSymbolsCoinFuturesSymbolInfo.status) && Intrinsics.areEqual(this.createdAt, kCJSApiSymbolsCoinFuturesSymbolInfo.createdAt) && Intrinsics.areEqual(this.expireDate, kCJSApiSymbolsCoinFuturesSymbolInfo.expireDate) && Intrinsics.areEqual(this.updatedAt, kCJSApiSymbolsCoinFuturesSymbolInfo.updatedAt) && Intrinsics.areEqual(this.fairMethod, kCJSApiSymbolsCoinFuturesSymbolInfo.fairMethod) && Intrinsics.areEqual(this.firstOpenDate, kCJSApiSymbolsCoinFuturesSymbolInfo.firstOpenDate) && Intrinsics.areEqual(this.fundingBaseSymbol, kCJSApiSymbolsCoinFuturesSymbolInfo.fundingBaseSymbol) && Intrinsics.areEqual(this.fundingQuoteSymbol, kCJSApiSymbolsCoinFuturesSymbolInfo.fundingQuoteSymbol) && Intrinsics.areEqual(this.fundingRateSymbol, kCJSApiSymbolsCoinFuturesSymbolInfo.fundingRateSymbol) && Intrinsics.areEqual(this.indexSymbol, kCJSApiSymbolsCoinFuturesSymbolInfo.indexSymbol) && Intrinsics.areEqual(this.initialMargin, kCJSApiSymbolsCoinFuturesSymbolInfo.initialMargin) && Intrinsics.areEqual(this.isDeleverage, kCJSApiSymbolsCoinFuturesSymbolInfo.isDeleverage) && Intrinsics.areEqual(this.isQuanto, kCJSApiSymbolsCoinFuturesSymbolInfo.isQuanto) && Intrinsics.areEqual(this.lotSize, kCJSApiSymbolsCoinFuturesSymbolInfo.lotSize) && Intrinsics.areEqual(this.maintainMargin, kCJSApiSymbolsCoinFuturesSymbolInfo.maintainMargin) && Intrinsics.areEqual(this.makerFeeRate, kCJSApiSymbolsCoinFuturesSymbolInfo.makerFeeRate) && Intrinsics.areEqual(this.makerFixFee, kCJSApiSymbolsCoinFuturesSymbolInfo.makerFixFee) && Intrinsics.areEqual(this.markMethod, kCJSApiSymbolsCoinFuturesSymbolInfo.markMethod) && Intrinsics.areEqual(this.maxOrderQty, kCJSApiSymbolsCoinFuturesSymbolInfo.maxOrderQty) && Intrinsics.areEqual(this.indexPriceTickSize, kCJSApiSymbolsCoinFuturesSymbolInfo.indexPriceTickSize) && Intrinsics.areEqual(this.maxPrice, kCJSApiSymbolsCoinFuturesSymbolInfo.maxPrice) && Intrinsics.areEqual(this.maxRiskLimit, kCJSApiSymbolsCoinFuturesSymbolInfo.maxRiskLimit) && Intrinsics.areEqual(this.minRiskLimit, kCJSApiSymbolsCoinFuturesSymbolInfo.minRiskLimit) && Intrinsics.areEqual(this.riskStep, kCJSApiSymbolsCoinFuturesSymbolInfo.riskStep) && Intrinsics.areEqual(this.settleCurrency, kCJSApiSymbolsCoinFuturesSymbolInfo.settleCurrency) && Intrinsics.areEqual(this.settleDate, kCJSApiSymbolsCoinFuturesSymbolInfo.settleDate) && Intrinsics.areEqual(this.settlementFee, kCJSApiSymbolsCoinFuturesSymbolInfo.settlementFee) && Intrinsics.areEqual(this.takerFeeRate, kCJSApiSymbolsCoinFuturesSymbolInfo.takerFeeRate) && Intrinsics.areEqual(this.takerFixFee, kCJSApiSymbolsCoinFuturesSymbolInfo.takerFixFee) && Intrinsics.areEqual(this.tickSize, kCJSApiSymbolsCoinFuturesSymbolInfo.tickSize) && Intrinsics.areEqual(this.multiplier, kCJSApiSymbolsCoinFuturesSymbolInfo.multiplier) && Intrinsics.areEqual(this.symbolName, kCJSApiSymbolsCoinFuturesSymbolInfo.symbolName) && Intrinsics.areEqual(this.prepName, kCJSApiSymbolsCoinFuturesSymbolInfo.prepName) && Intrinsics.areEqual(this.maxLeverage, kCJSApiSymbolsCoinFuturesSymbolInfo.maxLeverage) && Intrinsics.areEqual(this.iconUrl, kCJSApiSymbolsCoinFuturesSymbolInfo.iconUrl) && Intrinsics.areEqual(this.marketStage, kCJSApiSymbolsCoinFuturesSymbolInfo.marketStage) && Intrinsics.areEqual(this.preMarketToPerpDate, kCJSApiSymbolsCoinFuturesSymbolInfo.preMarketToPerpDate);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExpireDate() {
        return this.expireDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFairMethod() {
        return this.fairMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFirstOpenDate() {
        return this.firstOpenDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFundingBaseSymbol() {
        return this.fundingBaseSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFundingQuoteSymbol() {
        return this.fundingQuoteSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFundingRateSymbol() {
        return this.fundingRateSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getInitialMargin() {
        return this.initialMargin;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getIsDeleverage() {
        return this.isDeleverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIsInverse() {
        return this.isInverse;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getIsQuanto() {
        return this.isQuanto;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLotSize() {
        return this.lotSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getMaintainMargin() {
        return this.maintainMargin;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMakerFixFee() {
        return this.makerFixFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getMarkMethod() {
        return this.markMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getMaxOrderQty() {
        return this.maxOrderQty;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getIndexPriceTickSize() {
        return this.indexPriceTickSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRiskStep() {
        return this.riskStep;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getSettleDate() {
        return this.settleDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getSettlementFee() {
        return this.settlementFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getTakerFixFee() {
        return this.takerFixFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getTickSize() {
        return this.tickSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    @NotNull
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRootSymbol() {
        return this.rootSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getPrepName() {
        return this.prepName;
    }

    @NotNull
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getMarketStage() {
        return this.marketStage;
    }

    @NotNull
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getPreMarketToPerpDate() {
        return this.preMarketToPerpDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplayBaseCurrency() {
        return this.displayBaseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getDisplayBaseCurrency() {
        return this.displayBaseCurrency;
    }

    @NotNull
    public final String getExpireDate() {
        return this.expireDate;
    }

    @NotNull
    public final String getFairMethod() {
        return this.fairMethod;
    }

    @NotNull
    public final String getFirstOpenDate() {
        return this.firstOpenDate;
    }

    @NotNull
    public final String getFundingBaseSymbol() {
        return this.fundingBaseSymbol;
    }

    @NotNull
    public final String getFundingQuoteSymbol() {
        return this.fundingQuoteSymbol;
    }

    @NotNull
    public final String getFundingRateSymbol() {
        return this.fundingRateSymbol;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getIndexPriceTickSize() {
        return this.indexPriceTickSize;
    }

    @NotNull
    public final String getIndexSymbol() {
        return this.indexSymbol;
    }

    @NotNull
    public final String getInitialMargin() {
        return this.initialMargin;
    }

    @NotNull
    public final String getLotSize() {
        return this.lotSize;
    }

    @NotNull
    public final String getMaintainMargin() {
        return this.maintainMargin;
    }

    @NotNull
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @NotNull
    public final String getMakerFixFee() {
        return this.makerFixFee;
    }

    @NotNull
    public final String getMarkMethod() {
        return this.markMethod;
    }

    @NotNull
    public final String getMarketStage() {
        return this.marketStage;
    }

    @NotNull
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    @NotNull
    public final String getMaxOrderQty() {
        return this.maxOrderQty;
    }

    @NotNull
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @NotNull
    public final String getMaxRiskLimit() {
        return this.maxRiskLimit;
    }

    @NotNull
    public final String getMinRiskLimit() {
        return this.minRiskLimit;
    }

    @NotNull
    public final String getMultiplier() {
        return this.multiplier;
    }

    @NotNull
    public final String getPreMarketToPerpDate() {
        return this.preMarketToPerpDate;
    }

    @NotNull
    public final String getPrepName() {
        return this.prepName;
    }

    @NotNull
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    public final String getRiskStep() {
        return this.riskStep;
    }

    @NotNull
    public final String getRootSymbol() {
        return this.rootSymbol;
    }

    @NotNull
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @NotNull
    public final String getSettleDate() {
        return this.settleDate;
    }

    @NotNull
    public final String getSettlementFee() {
        return this.settlementFee;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getSymbolName() {
        return this.symbolName;
    }

    @NotNull
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @NotNull
    public final String getTakerFixFee() {
        return this.takerFixFee;
    }

    @NotNull
    public final String getTickSize() {
        return this.tickSize;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.type.hashCode() * 31) + this.isInverse.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.rootSymbol.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.displayBaseCurrency.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.status.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.expireDate.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.fairMethod.hashCode()) * 31) + this.firstOpenDate.hashCode()) * 31) + this.fundingBaseSymbol.hashCode()) * 31) + this.fundingQuoteSymbol.hashCode()) * 31) + this.fundingRateSymbol.hashCode()) * 31) + this.indexSymbol.hashCode()) * 31) + this.initialMargin.hashCode()) * 31) + this.isDeleverage.hashCode()) * 31) + this.isQuanto.hashCode()) * 31) + this.lotSize.hashCode()) * 31) + this.maintainMargin.hashCode()) * 31) + this.makerFeeRate.hashCode()) * 31) + this.makerFixFee.hashCode()) * 31) + this.markMethod.hashCode()) * 31) + this.maxOrderQty.hashCode()) * 31) + this.indexPriceTickSize.hashCode()) * 31) + this.maxPrice.hashCode()) * 31) + this.maxRiskLimit.hashCode()) * 31) + this.minRiskLimit.hashCode()) * 31) + this.riskStep.hashCode()) * 31) + this.settleCurrency.hashCode()) * 31) + this.settleDate.hashCode()) * 31) + this.settlementFee.hashCode()) * 31) + this.takerFeeRate.hashCode()) * 31) + this.takerFixFee.hashCode()) * 31) + this.tickSize.hashCode()) * 31) + this.multiplier.hashCode()) * 31) + this.symbolName.hashCode()) * 31) + this.prepName.hashCode()) * 31) + this.maxLeverage.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.marketStage.hashCode()) * 31) + this.preMarketToPerpDate.hashCode();
    }

    @NotNull
    public final String isDeleverage() {
        return this.isDeleverage;
    }

    @NotNull
    public final String isInverse() {
        return this.isInverse;
    }

    @NotNull
    public final String isQuanto() {
        return this.isQuanto;
    }

    @NotNull
    public String toString() {
        return "KCJSApiSymbolsCoinFuturesSymbolInfo(type=" + this.type + ", isInverse=" + this.isInverse + ", symbol=" + this.symbol + ", rootSymbol=" + this.rootSymbol + ", baseCurrency=" + this.baseCurrency + ", displayBaseCurrency=" + this.displayBaseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", status=" + this.status + ", createdAt=" + this.createdAt + ", expireDate=" + this.expireDate + ", updatedAt=" + this.updatedAt + ", fairMethod=" + this.fairMethod + ", firstOpenDate=" + this.firstOpenDate + ", fundingBaseSymbol=" + this.fundingBaseSymbol + ", fundingQuoteSymbol=" + this.fundingQuoteSymbol + ", fundingRateSymbol=" + this.fundingRateSymbol + ", indexSymbol=" + this.indexSymbol + ", initialMargin=" + this.initialMargin + ", isDeleverage=" + this.isDeleverage + ", isQuanto=" + this.isQuanto + ", lotSize=" + this.lotSize + ", maintainMargin=" + this.maintainMargin + ", makerFeeRate=" + this.makerFeeRate + ", makerFixFee=" + this.makerFixFee + ", markMethod=" + this.markMethod + ", maxOrderQty=" + this.maxOrderQty + ", indexPriceTickSize=" + this.indexPriceTickSize + ", maxPrice=" + this.maxPrice + ", maxRiskLimit=" + this.maxRiskLimit + ", minRiskLimit=" + this.minRiskLimit + ", riskStep=" + this.riskStep + ", settleCurrency=" + this.settleCurrency + ", settleDate=" + this.settleDate + ", settlementFee=" + this.settlementFee + ", takerFeeRate=" + this.takerFeeRate + ", takerFixFee=" + this.takerFixFee + ", tickSize=" + this.tickSize + ", multiplier=" + this.multiplier + ", symbolName=" + this.symbolName + ", prepName=" + this.prepName + ", maxLeverage=" + this.maxLeverage + ", iconUrl=" + this.iconUrl + ", marketStage=" + this.marketStage + ", preMarketToPerpDate=" + this.preMarketToPerpDate + ')';
    }
}
