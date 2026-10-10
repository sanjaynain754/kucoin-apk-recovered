package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSymbolsCoinModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\bP\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0002\u0010&J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u001aHÆ\u0003J\t\u0010W\u001a\u00020\u001aHÆ\u0003J\t\u0010X\u001a\u00020\u001aHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003JÝ\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u0003HÆ\u0001J\u0013\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020nHÖ\u0001J\t\u0010o\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\u001b\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010(R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010(R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010(R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010(R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0011\u0010\u001c\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010(¨\u0006p"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotSymbolInfo;", "", "code", "", FirebaseAnalytics.Param.CURRENCY, "baseCurrency", "quoteCurrency", "mark", "board", "weight", "enableTrading", "isEnableAuctionTrade", "display", "market", "context", "feeCode", "makerFeeRate", "takerFeeRate", "quoteIncrement", "quoteMinSize", "quoteMaxSize", "baseIncrement", "baseMinSize", "baseMaxSize", "priceIncrement", "pricePrecision", "", "basePrecision", "quotePrecision", "symbolName", "baseCurrencyName", "quoteCurrencyName", "isMarginEnabled", "isIsolatedMarginEnabled", "enableAuctionTrading", "isBotEnabled", "disabledTipInfo", "priceProtectionRate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "getBaseCurrencyName", "getBaseIncrement", "getBaseMaxSize", "getBaseMinSize", "getBasePrecision", "()J", "getBoard", "getCode", "getContext", "getCurrency", "getDisabledTipInfo", "getDisplay", "getEnableAuctionTrading", "getEnableTrading", "getFeeCode", "getMakerFeeRate", "getMark", "getMarket", "getPriceIncrement", "getPricePrecision", "getPriceProtectionRate", "getQuoteCurrency", "getQuoteCurrencyName", "getQuoteIncrement", "getQuoteMaxSize", "getQuoteMinSize", "getQuotePrecision", "getSymbolName", "getTakerFeeRate", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSymbolsCoinSpotSymbolInfo {

    @NotNull
    private final String baseCurrency;

    @NotNull
    private final String baseCurrencyName;

    @NotNull
    private final String baseIncrement;

    @NotNull
    private final String baseMaxSize;

    @NotNull
    private final String baseMinSize;
    private final long basePrecision;

    @NotNull
    private final String board;

    @NotNull
    private final String code;

    @NotNull
    private final String context;

    @NotNull
    private final String currency;

    @NotNull
    private final String disabledTipInfo;

    @NotNull
    private final String display;

    @NotNull
    private final String enableAuctionTrading;

    @NotNull
    private final String enableTrading;

    @NotNull
    private final String feeCode;

    @NotNull
    private final String isBotEnabled;

    @NotNull
    private final String isEnableAuctionTrade;

    @NotNull
    private final String isIsolatedMarginEnabled;

    @NotNull
    private final String isMarginEnabled;

    @NotNull
    private final String makerFeeRate;

    @NotNull
    private final String mark;

    @NotNull
    private final String market;

    @NotNull
    private final String priceIncrement;
    private final long pricePrecision;

    @NotNull
    private final String priceProtectionRate;

    @NotNull
    private final String quoteCurrency;

    @NotNull
    private final String quoteCurrencyName;

    @NotNull
    private final String quoteIncrement;

    @NotNull
    private final String quoteMaxSize;

    @NotNull
    private final String quoteMinSize;
    private final long quotePrecision;

    @NotNull
    private final String symbolName;

    @NotNull
    private final String takerFeeRate;

    @NotNull
    private final String weight;

    public KCJSApiSymbolsCoinSpotSymbolInfo(@NotNull String code, @NotNull String currency, @NotNull String baseCurrency, @NotNull String quoteCurrency, @NotNull String mark, @NotNull String board, @NotNull String weight, @NotNull String enableTrading, @NotNull String isEnableAuctionTrade, @NotNull String display, @NotNull String market, @NotNull String context, @NotNull String feeCode, @NotNull String makerFeeRate, @NotNull String takerFeeRate, @NotNull String quoteIncrement, @NotNull String quoteMinSize, @NotNull String quoteMaxSize, @NotNull String baseIncrement, @NotNull String baseMinSize, @NotNull String baseMaxSize, @NotNull String priceIncrement, long j11, long j12, long j13, @NotNull String symbolName, @NotNull String baseCurrencyName, @NotNull String quoteCurrencyName, @NotNull String isMarginEnabled, @NotNull String isIsolatedMarginEnabled, @NotNull String enableAuctionTrading, @NotNull String isBotEnabled, @NotNull String disabledTipInfo, @NotNull String priceProtectionRate) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(enableTrading, "enableTrading");
        Intrinsics.checkNotNullParameter(isEnableAuctionTrade, "isEnableAuctionTrade");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(feeCode, "feeCode");
        Intrinsics.checkNotNullParameter(makerFeeRate, "makerFeeRate");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(quoteIncrement, "quoteIncrement");
        Intrinsics.checkNotNullParameter(quoteMinSize, "quoteMinSize");
        Intrinsics.checkNotNullParameter(quoteMaxSize, "quoteMaxSize");
        Intrinsics.checkNotNullParameter(baseIncrement, "baseIncrement");
        Intrinsics.checkNotNullParameter(baseMinSize, "baseMinSize");
        Intrinsics.checkNotNullParameter(baseMaxSize, "baseMaxSize");
        Intrinsics.checkNotNullParameter(priceIncrement, "priceIncrement");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        Intrinsics.checkNotNullParameter(isMarginEnabled, "isMarginEnabled");
        Intrinsics.checkNotNullParameter(isIsolatedMarginEnabled, "isIsolatedMarginEnabled");
        Intrinsics.checkNotNullParameter(enableAuctionTrading, "enableAuctionTrading");
        Intrinsics.checkNotNullParameter(isBotEnabled, "isBotEnabled");
        Intrinsics.checkNotNullParameter(disabledTipInfo, "disabledTipInfo");
        Intrinsics.checkNotNullParameter(priceProtectionRate, "priceProtectionRate");
        this.code = code;
        this.currency = currency;
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.mark = mark;
        this.board = board;
        this.weight = weight;
        this.enableTrading = enableTrading;
        this.isEnableAuctionTrade = isEnableAuctionTrade;
        this.display = display;
        this.market = market;
        this.context = context;
        this.feeCode = feeCode;
        this.makerFeeRate = makerFeeRate;
        this.takerFeeRate = takerFeeRate;
        this.quoteIncrement = quoteIncrement;
        this.quoteMinSize = quoteMinSize;
        this.quoteMaxSize = quoteMaxSize;
        this.baseIncrement = baseIncrement;
        this.baseMinSize = baseMinSize;
        this.baseMaxSize = baseMaxSize;
        this.priceIncrement = priceIncrement;
        this.pricePrecision = j11;
        this.basePrecision = j12;
        this.quotePrecision = j13;
        this.symbolName = symbolName;
        this.baseCurrencyName = baseCurrencyName;
        this.quoteCurrencyName = quoteCurrencyName;
        this.isMarginEnabled = isMarginEnabled;
        this.isIsolatedMarginEnabled = isIsolatedMarginEnabled;
        this.enableAuctionTrading = enableAuctionTrading;
        this.isBotEnabled = isBotEnabled;
        this.disabledTipInfo = disabledTipInfo;
        this.priceProtectionRate = priceProtectionRate;
    }

    public static /* synthetic */ KCJSApiSymbolsCoinSpotSymbolInfo copy$default(KCJSApiSymbolsCoinSpotSymbolInfo kCJSApiSymbolsCoinSpotSymbolInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, long j11, long j12, long j13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, int i11, int i12, Object obj) {
        String str32;
        String str33;
        String str34 = (i11 & 1) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.code : str;
        String str35 = (i11 & 2) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.currency : str2;
        String str36 = (i11 & 4) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.baseCurrency : str3;
        String str37 = (i11 & 8) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.quoteCurrency : str4;
        String str38 = (i11 & 16) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.mark : str5;
        String str39 = (i11 & 32) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.board : str6;
        String str40 = (i11 & 64) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.weight : str7;
        String str41 = (i11 & 128) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.enableTrading : str8;
        String str42 = (i11 & 256) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.isEnableAuctionTrade : str9;
        String str43 = (i11 & 512) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.display : str10;
        String str44 = (i11 & 1024) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.market : str11;
        String str45 = (i11 & 2048) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.context : str12;
        String str46 = (i11 & 4096) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.feeCode : str13;
        String str47 = (i11 & 8192) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.makerFeeRate : str14;
        String str48 = str34;
        String str49 = (i11 & 16384) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.takerFeeRate : str15;
        String str50 = (i11 & 32768) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.quoteIncrement : str16;
        String str51 = (i11 & 65536) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.quoteMinSize : str17;
        String str52 = (i11 & 131072) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.quoteMaxSize : str18;
        String str53 = (i11 & 262144) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.baseIncrement : str19;
        String str54 = (i11 & 524288) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.baseMinSize : str20;
        String str55 = (i11 & 1048576) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.baseMaxSize : str21;
        String str56 = (i11 & 2097152) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.priceIncrement : str22;
        String str57 = str49;
        long j14 = (i11 & 4194304) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.pricePrecision : j11;
        long j15 = (i11 & 8388608) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.basePrecision : j12;
        long j16 = (i11 & 16777216) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.quotePrecision : j13;
        String str58 = (i11 & 33554432) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.symbolName : str23;
        String str59 = (i11 & 67108864) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.baseCurrencyName : str24;
        String str60 = str58;
        String str61 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.quoteCurrencyName : str25;
        String str62 = (i11 & 268435456) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.isMarginEnabled : str26;
        String str63 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.isIsolatedMarginEnabled : str27;
        String str64 = (i11 & 1073741824) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.enableAuctionTrading : str28;
        String str65 = (i11 & Integer.MIN_VALUE) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.isBotEnabled : str29;
        String str66 = (i12 & 1) != 0 ? kCJSApiSymbolsCoinSpotSymbolInfo.disabledTipInfo : str30;
        if ((i12 & 2) != 0) {
            str33 = str66;
            str32 = kCJSApiSymbolsCoinSpotSymbolInfo.priceProtectionRate;
        } else {
            str32 = str31;
            str33 = str66;
        }
        return kCJSApiSymbolsCoinSpotSymbolInfo.copy(str48, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str57, str50, str51, str52, str53, str54, str55, str56, j14, j15, j16, str60, str59, str61, str62, str63, str64, str65, str33, str32);
    }

    @NotNull
    public final KCJSApiSymbolsCoinSpotSymbolInfo copy(@NotNull String code, @NotNull String currency, @NotNull String baseCurrency, @NotNull String quoteCurrency, @NotNull String mark, @NotNull String board, @NotNull String weight, @NotNull String enableTrading, @NotNull String isEnableAuctionTrade, @NotNull String display, @NotNull String market, @NotNull String context, @NotNull String feeCode, @NotNull String makerFeeRate, @NotNull String takerFeeRate, @NotNull String quoteIncrement, @NotNull String quoteMinSize, @NotNull String quoteMaxSize, @NotNull String baseIncrement, @NotNull String baseMinSize, @NotNull String baseMaxSize, @NotNull String priceIncrement, long pricePrecision, long basePrecision, long quotePrecision, @NotNull String symbolName, @NotNull String baseCurrencyName, @NotNull String quoteCurrencyName, @NotNull String isMarginEnabled, @NotNull String isIsolatedMarginEnabled, @NotNull String enableAuctionTrading, @NotNull String isBotEnabled, @NotNull String disabledTipInfo, @NotNull String priceProtectionRate) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(enableTrading, "enableTrading");
        Intrinsics.checkNotNullParameter(isEnableAuctionTrade, "isEnableAuctionTrade");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(feeCode, "feeCode");
        Intrinsics.checkNotNullParameter(makerFeeRate, "makerFeeRate");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(quoteIncrement, "quoteIncrement");
        Intrinsics.checkNotNullParameter(quoteMinSize, "quoteMinSize");
        Intrinsics.checkNotNullParameter(quoteMaxSize, "quoteMaxSize");
        Intrinsics.checkNotNullParameter(baseIncrement, "baseIncrement");
        Intrinsics.checkNotNullParameter(baseMinSize, "baseMinSize");
        Intrinsics.checkNotNullParameter(baseMaxSize, "baseMaxSize");
        Intrinsics.checkNotNullParameter(priceIncrement, "priceIncrement");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        Intrinsics.checkNotNullParameter(isMarginEnabled, "isMarginEnabled");
        Intrinsics.checkNotNullParameter(isIsolatedMarginEnabled, "isIsolatedMarginEnabled");
        Intrinsics.checkNotNullParameter(enableAuctionTrading, "enableAuctionTrading");
        Intrinsics.checkNotNullParameter(isBotEnabled, "isBotEnabled");
        Intrinsics.checkNotNullParameter(disabledTipInfo, "disabledTipInfo");
        Intrinsics.checkNotNullParameter(priceProtectionRate, "priceProtectionRate");
        return new KCJSApiSymbolsCoinSpotSymbolInfo(code, currency, baseCurrency, quoteCurrency, mark, board, weight, enableTrading, isEnableAuctionTrade, display, market, context, feeCode, makerFeeRate, takerFeeRate, quoteIncrement, quoteMinSize, quoteMaxSize, baseIncrement, baseMinSize, baseMaxSize, priceIncrement, pricePrecision, basePrecision, quotePrecision, symbolName, baseCurrencyName, quoteCurrencyName, isMarginEnabled, isIsolatedMarginEnabled, enableAuctionTrading, isBotEnabled, disabledTipInfo, priceProtectionRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSymbolsCoinSpotSymbolInfo)) {
            return false;
        }
        KCJSApiSymbolsCoinSpotSymbolInfo kCJSApiSymbolsCoinSpotSymbolInfo = (KCJSApiSymbolsCoinSpotSymbolInfo) other;
        return Intrinsics.areEqual(this.code, kCJSApiSymbolsCoinSpotSymbolInfo.code) && Intrinsics.areEqual(this.currency, kCJSApiSymbolsCoinSpotSymbolInfo.currency) && Intrinsics.areEqual(this.baseCurrency, kCJSApiSymbolsCoinSpotSymbolInfo.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, kCJSApiSymbolsCoinSpotSymbolInfo.quoteCurrency) && Intrinsics.areEqual(this.mark, kCJSApiSymbolsCoinSpotSymbolInfo.mark) && Intrinsics.areEqual(this.board, kCJSApiSymbolsCoinSpotSymbolInfo.board) && Intrinsics.areEqual(this.weight, kCJSApiSymbolsCoinSpotSymbolInfo.weight) && Intrinsics.areEqual(this.enableTrading, kCJSApiSymbolsCoinSpotSymbolInfo.enableTrading) && Intrinsics.areEqual(this.isEnableAuctionTrade, kCJSApiSymbolsCoinSpotSymbolInfo.isEnableAuctionTrade) && Intrinsics.areEqual(this.display, kCJSApiSymbolsCoinSpotSymbolInfo.display) && Intrinsics.areEqual(this.market, kCJSApiSymbolsCoinSpotSymbolInfo.market) && Intrinsics.areEqual(this.context, kCJSApiSymbolsCoinSpotSymbolInfo.context) && Intrinsics.areEqual(this.feeCode, kCJSApiSymbolsCoinSpotSymbolInfo.feeCode) && Intrinsics.areEqual(this.makerFeeRate, kCJSApiSymbolsCoinSpotSymbolInfo.makerFeeRate) && Intrinsics.areEqual(this.takerFeeRate, kCJSApiSymbolsCoinSpotSymbolInfo.takerFeeRate) && Intrinsics.areEqual(this.quoteIncrement, kCJSApiSymbolsCoinSpotSymbolInfo.quoteIncrement) && Intrinsics.areEqual(this.quoteMinSize, kCJSApiSymbolsCoinSpotSymbolInfo.quoteMinSize) && Intrinsics.areEqual(this.quoteMaxSize, kCJSApiSymbolsCoinSpotSymbolInfo.quoteMaxSize) && Intrinsics.areEqual(this.baseIncrement, kCJSApiSymbolsCoinSpotSymbolInfo.baseIncrement) && Intrinsics.areEqual(this.baseMinSize, kCJSApiSymbolsCoinSpotSymbolInfo.baseMinSize) && Intrinsics.areEqual(this.baseMaxSize, kCJSApiSymbolsCoinSpotSymbolInfo.baseMaxSize) && Intrinsics.areEqual(this.priceIncrement, kCJSApiSymbolsCoinSpotSymbolInfo.priceIncrement) && this.pricePrecision == kCJSApiSymbolsCoinSpotSymbolInfo.pricePrecision && this.basePrecision == kCJSApiSymbolsCoinSpotSymbolInfo.basePrecision && this.quotePrecision == kCJSApiSymbolsCoinSpotSymbolInfo.quotePrecision && Intrinsics.areEqual(this.symbolName, kCJSApiSymbolsCoinSpotSymbolInfo.symbolName) && Intrinsics.areEqual(this.baseCurrencyName, kCJSApiSymbolsCoinSpotSymbolInfo.baseCurrencyName) && Intrinsics.areEqual(this.quoteCurrencyName, kCJSApiSymbolsCoinSpotSymbolInfo.quoteCurrencyName) && Intrinsics.areEqual(this.isMarginEnabled, kCJSApiSymbolsCoinSpotSymbolInfo.isMarginEnabled) && Intrinsics.areEqual(this.isIsolatedMarginEnabled, kCJSApiSymbolsCoinSpotSymbolInfo.isIsolatedMarginEnabled) && Intrinsics.areEqual(this.enableAuctionTrading, kCJSApiSymbolsCoinSpotSymbolInfo.enableAuctionTrading) && Intrinsics.areEqual(this.isBotEnabled, kCJSApiSymbolsCoinSpotSymbolInfo.isBotEnabled) && Intrinsics.areEqual(this.disabledTipInfo, kCJSApiSymbolsCoinSpotSymbolInfo.disabledTipInfo) && Intrinsics.areEqual(this.priceProtectionRate, kCJSApiSymbolsCoinSpotSymbolInfo.priceProtectionRate);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFeeCode() {
        return this.feeCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getQuoteIncrement() {
        return this.quoteIncrement;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getQuoteMinSize() {
        return this.quoteMinSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getBaseIncrement() {
        return this.baseIncrement;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBaseMinSize() {
        return this.baseMinSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBaseMaxSize() {
        return this.baseMaxSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPriceIncrement() {
        return this.priceIncrement;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getPricePrecision() {
        return this.pricePrecision;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final long getBasePrecision() {
        return this.basePrecision;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final long getQuotePrecision() {
        return this.quotePrecision;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getIsIsolatedMarginEnabled() {
        return this.isIsolatedMarginEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getEnableAuctionTrading() {
        return this.enableAuctionTrading;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getIsBotEnabled() {
        return this.isBotEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getDisabledTipInfo() {
        return this.disabledTipInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getPriceProtectionRate() {
        return this.priceProtectionRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMark() {
        return this.mark;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBoard() {
        return this.board;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEnableTrading() {
        return this.enableTrading;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIsEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    @NotNull
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @NotNull
    public final String getBaseIncrement() {
        return this.baseIncrement;
    }

    @NotNull
    public final String getBaseMaxSize() {
        return this.baseMaxSize;
    }

    @NotNull
    public final String getBaseMinSize() {
        return this.baseMinSize;
    }

    public final long getBasePrecision() {
        return this.basePrecision;
    }

    @NotNull
    public final String getBoard() {
        return this.board;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDisabledTipInfo() {
        return this.disabledTipInfo;
    }

    @NotNull
    public final String getDisplay() {
        return this.display;
    }

    @NotNull
    public final String getEnableAuctionTrading() {
        return this.enableAuctionTrading;
    }

    @NotNull
    public final String getEnableTrading() {
        return this.enableTrading;
    }

    @NotNull
    public final String getFeeCode() {
        return this.feeCode;
    }

    @NotNull
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @NotNull
    public final String getMark() {
        return this.mark;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    @NotNull
    public final String getPriceIncrement() {
        return this.priceIncrement;
    }

    public final long getPricePrecision() {
        return this.pricePrecision;
    }

    @NotNull
    public final String getPriceProtectionRate() {
        return this.priceProtectionRate;
    }

    @NotNull
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @NotNull
    public final String getQuoteIncrement() {
        return this.quoteIncrement;
    }

    @NotNull
    public final String getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    @NotNull
    public final String getQuoteMinSize() {
        return this.quoteMinSize;
    }

    public final long getQuotePrecision() {
        return this.quotePrecision;
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
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.code.hashCode() * 31) + this.currency.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.mark.hashCode()) * 31) + this.board.hashCode()) * 31) + this.weight.hashCode()) * 31) + this.enableTrading.hashCode()) * 31) + this.isEnableAuctionTrade.hashCode()) * 31) + this.display.hashCode()) * 31) + this.market.hashCode()) * 31) + this.context.hashCode()) * 31) + this.feeCode.hashCode()) * 31) + this.makerFeeRate.hashCode()) * 31) + this.takerFeeRate.hashCode()) * 31) + this.quoteIncrement.hashCode()) * 31) + this.quoteMinSize.hashCode()) * 31) + this.quoteMaxSize.hashCode()) * 31) + this.baseIncrement.hashCode()) * 31) + this.baseMinSize.hashCode()) * 31) + this.baseMaxSize.hashCode()) * 31) + this.priceIncrement.hashCode()) * 31) + Long.hashCode(this.pricePrecision)) * 31) + Long.hashCode(this.basePrecision)) * 31) + Long.hashCode(this.quotePrecision)) * 31) + this.symbolName.hashCode()) * 31) + this.baseCurrencyName.hashCode()) * 31) + this.quoteCurrencyName.hashCode()) * 31) + this.isMarginEnabled.hashCode()) * 31) + this.isIsolatedMarginEnabled.hashCode()) * 31) + this.enableAuctionTrading.hashCode()) * 31) + this.isBotEnabled.hashCode()) * 31) + this.disabledTipInfo.hashCode()) * 31) + this.priceProtectionRate.hashCode();
    }

    @NotNull
    public final String isBotEnabled() {
        return this.isBotEnabled;
    }

    @NotNull
    public final String isEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    @NotNull
    public final String isIsolatedMarginEnabled() {
        return this.isIsolatedMarginEnabled;
    }

    @NotNull
    public final String isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    public String toString() {
        return "KCJSApiSymbolsCoinSpotSymbolInfo(code=" + this.code + ", currency=" + this.currency + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", mark=" + this.mark + ", board=" + this.board + ", weight=" + this.weight + ", enableTrading=" + this.enableTrading + ", isEnableAuctionTrade=" + this.isEnableAuctionTrade + ", display=" + this.display + ", market=" + this.market + ", context=" + this.context + ", feeCode=" + this.feeCode + ", makerFeeRate=" + this.makerFeeRate + ", takerFeeRate=" + this.takerFeeRate + ", quoteIncrement=" + this.quoteIncrement + ", quoteMinSize=" + this.quoteMinSize + ", quoteMaxSize=" + this.quoteMaxSize + ", baseIncrement=" + this.baseIncrement + ", baseMinSize=" + this.baseMinSize + ", baseMaxSize=" + this.baseMaxSize + ", priceIncrement=" + this.priceIncrement + ", pricePrecision=" + this.pricePrecision + ", basePrecision=" + this.basePrecision + ", quotePrecision=" + this.quotePrecision + ", symbolName=" + this.symbolName + ", baseCurrencyName=" + this.baseCurrencyName + ", quoteCurrencyName=" + this.quoteCurrencyName + ", isMarginEnabled=" + this.isMarginEnabled + ", isIsolatedMarginEnabled=" + this.isIsolatedMarginEnabled + ", enableAuctionTrading=" + this.enableAuctionTrading + ", isBotEnabled=" + this.isBotEnabled + ", disabledTipInfo=" + this.disabledTipInfo + ", priceProtectionRate=" + this.priceProtectionRate + ')';
    }
}
