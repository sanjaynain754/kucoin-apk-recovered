package com.kubi.p110rn.core.turbo;

import androidx.media3.common.C2711C;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b&\u0010'J\b\u0010I\u001a\u00020JH\u0016J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010c\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¦\u0003\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010rHÖ\u0003J\t\u0010s\u001a\u00020tHÖ\u0001J\t\u0010u\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010@\u001a\u0004\bA\u0010?R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010@\u001a\u0004\bB\u0010?R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010)R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010)R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010)R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)¨\u0006v"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/SpotSymbolInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "code", "", FirebaseAnalytics.Param.CURRENCY, "baseCurrency", "quoteCurrency", "mark", "board", "weight", "enableTrading", "isEnableAuctionTrade", "display", "market", "context", "feeCode", "makerFeeRate", "takerFeeRate", "quoteIncrement", "quoteMinSize", "quoteMaxSize", "baseIncrement", "baseMinSize", "baseMaxSize", "priceIncrement", "pricePrecision", "", "basePrecision", "quotePrecision", "symbolName", "baseCurrencyName", "quoteCurrencyName", "isMarginEnabled", "isIsolatedMarginEnabled", "enableAuctionTrading", "isBotEnabled", "disabledTipInfo", "priceProtectionRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCurrency", "getBaseCurrency", "getQuoteCurrency", "getMark", "getBoard", "getWeight", "getEnableTrading", "getDisplay", "getMarket", "getContext", "getFeeCode", "getMakerFeeRate", "getTakerFeeRate", "getQuoteIncrement", "getQuoteMinSize", "getQuoteMaxSize", "getBaseIncrement", "getBaseMinSize", "getBaseMaxSize", "getPriceIncrement", "getPricePrecision", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBasePrecision", "getQuotePrecision", "getSymbolName", "getBaseCurrencyName", "getQuoteCurrencyName", "getEnableAuctionTrading", "getDisabledTipInfo", "getPriceProtectionRate", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/SpotSymbolInfo;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSymbolsCoinTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSymbolsCoinTurboModule.kt\ncom/kubi/rn/core/turbo/SpotSymbolInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final /* data */ class SpotSymbolInfo implements WritableMapSerializable {

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final String baseCurrencyName;

    @Nullable
    private final String baseIncrement;

    @Nullable
    private final String baseMaxSize;

    @Nullable
    private final String baseMinSize;

    @Nullable
    private final Double basePrecision;

    @Nullable
    private final String board;

    @Nullable
    private final String code;

    @Nullable
    private final String context;

    @Nullable
    private final String currency;

    @Nullable
    private final String disabledTipInfo;

    @Nullable
    private final String display;

    @Nullable
    private final String enableAuctionTrading;

    @Nullable
    private final String enableTrading;

    @Nullable
    private final String feeCode;

    @Nullable
    private final String isBotEnabled;

    @Nullable
    private final String isEnableAuctionTrade;

    @Nullable
    private final String isIsolatedMarginEnabled;

    @Nullable
    private final String isMarginEnabled;

    @Nullable
    private final String makerFeeRate;

    @Nullable
    private final String mark;

    @Nullable
    private final String market;

    @Nullable
    private final String priceIncrement;

    @Nullable
    private final Double pricePrecision;

    @Nullable
    private final String priceProtectionRate;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final String quoteCurrencyName;

    @Nullable
    private final String quoteIncrement;

    @Nullable
    private final String quoteMaxSize;

    @Nullable
    private final String quoteMinSize;

    @Nullable
    private final Double quotePrecision;

    @Nullable
    private final String symbolName;

    @Nullable
    private final String takerFeeRate;

    @Nullable
    private final String weight;

    public SpotSymbolInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    public static /* synthetic */ SpotSymbolInfo copy$default(SpotSymbolInfo spotSymbolInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Double d11, Double d12, Double d13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, int i11, int i12, Object obj) {
        String str32;
        String str33;
        String str34 = (i11 & 1) != 0 ? spotSymbolInfo.code : str;
        String str35 = (i11 & 2) != 0 ? spotSymbolInfo.currency : str2;
        String str36 = (i11 & 4) != 0 ? spotSymbolInfo.baseCurrency : str3;
        String str37 = (i11 & 8) != 0 ? spotSymbolInfo.quoteCurrency : str4;
        String str38 = (i11 & 16) != 0 ? spotSymbolInfo.mark : str5;
        String str39 = (i11 & 32) != 0 ? spotSymbolInfo.board : str6;
        String str40 = (i11 & 64) != 0 ? spotSymbolInfo.weight : str7;
        String str41 = (i11 & 128) != 0 ? spotSymbolInfo.enableTrading : str8;
        String str42 = (i11 & 256) != 0 ? spotSymbolInfo.isEnableAuctionTrade : str9;
        String str43 = (i11 & 512) != 0 ? spotSymbolInfo.display : str10;
        String str44 = (i11 & 1024) != 0 ? spotSymbolInfo.market : str11;
        String str45 = (i11 & 2048) != 0 ? spotSymbolInfo.context : str12;
        String str46 = (i11 & 4096) != 0 ? spotSymbolInfo.feeCode : str13;
        String str47 = (i11 & 8192) != 0 ? spotSymbolInfo.makerFeeRate : str14;
        String str48 = str34;
        String str49 = (i11 & 16384) != 0 ? spotSymbolInfo.takerFeeRate : str15;
        String str50 = (i11 & 32768) != 0 ? spotSymbolInfo.quoteIncrement : str16;
        String str51 = (i11 & 65536) != 0 ? spotSymbolInfo.quoteMinSize : str17;
        String str52 = (i11 & 131072) != 0 ? spotSymbolInfo.quoteMaxSize : str18;
        String str53 = (i11 & 262144) != 0 ? spotSymbolInfo.baseIncrement : str19;
        String str54 = (i11 & 524288) != 0 ? spotSymbolInfo.baseMinSize : str20;
        String str55 = (i11 & 1048576) != 0 ? spotSymbolInfo.baseMaxSize : str21;
        String str56 = (i11 & 2097152) != 0 ? spotSymbolInfo.priceIncrement : str22;
        Double d14 = (i11 & 4194304) != 0 ? spotSymbolInfo.pricePrecision : d11;
        Double d15 = (i11 & 8388608) != 0 ? spotSymbolInfo.basePrecision : d12;
        Double d16 = (i11 & 16777216) != 0 ? spotSymbolInfo.quotePrecision : d13;
        String str57 = (i11 & 33554432) != 0 ? spotSymbolInfo.symbolName : str23;
        String str58 = (i11 & 67108864) != 0 ? spotSymbolInfo.baseCurrencyName : str24;
        String str59 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? spotSymbolInfo.quoteCurrencyName : str25;
        String str60 = (i11 & 268435456) != 0 ? spotSymbolInfo.isMarginEnabled : str26;
        String str61 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? spotSymbolInfo.isIsolatedMarginEnabled : str27;
        String str62 = (i11 & 1073741824) != 0 ? spotSymbolInfo.enableAuctionTrading : str28;
        String str63 = (i11 & Integer.MIN_VALUE) != 0 ? spotSymbolInfo.isBotEnabled : str29;
        String str64 = (i12 & 1) != 0 ? spotSymbolInfo.disabledTipInfo : str30;
        if ((i12 & 2) != 0) {
            str33 = str64;
            str32 = spotSymbolInfo.priceProtectionRate;
        } else {
            str32 = str31;
            str33 = str64;
        }
        return spotSymbolInfo.copy(str48, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str49, str50, str51, str52, str53, str54, str55, str56, d14, d15, d16, str57, str58, str59, str60, str61, str62, str63, str33, str32);
    }

    @NotNull
    public final SpotSymbolInfo copy(@Nullable String code, @Nullable String currency, @Nullable String baseCurrency, @Nullable String quoteCurrency, @Nullable String mark, @Nullable String board, @Nullable String weight, @Nullable String enableTrading, @Nullable String isEnableAuctionTrade, @Nullable String display, @Nullable String market, @Nullable String context, @Nullable String feeCode, @Nullable String makerFeeRate, @Nullable String takerFeeRate, @Nullable String quoteIncrement, @Nullable String quoteMinSize, @Nullable String quoteMaxSize, @Nullable String baseIncrement, @Nullable String baseMinSize, @Nullable String baseMaxSize, @Nullable String priceIncrement, @Nullable Double pricePrecision, @Nullable Double basePrecision, @Nullable Double quotePrecision, @Nullable String symbolName, @Nullable String baseCurrencyName, @Nullable String quoteCurrencyName, @Nullable String isMarginEnabled, @Nullable String isIsolatedMarginEnabled, @Nullable String enableAuctionTrading, @Nullable String isBotEnabled, @Nullable String disabledTipInfo, @Nullable String priceProtectionRate) {
        return new SpotSymbolInfo(code, currency, baseCurrency, quoteCurrency, mark, board, weight, enableTrading, isEnableAuctionTrade, display, market, context, feeCode, makerFeeRate, takerFeeRate, quoteIncrement, quoteMinSize, quoteMaxSize, baseIncrement, baseMinSize, baseMaxSize, priceIncrement, pricePrecision, basePrecision, quotePrecision, symbolName, baseCurrencyName, quoteCurrencyName, isMarginEnabled, isIsolatedMarginEnabled, enableAuctionTrading, isBotEnabled, disabledTipInfo, priceProtectionRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotSymbolInfo)) {
            return false;
        }
        SpotSymbolInfo spotSymbolInfo = (SpotSymbolInfo) other;
        return Intrinsics.areEqual(this.code, spotSymbolInfo.code) && Intrinsics.areEqual(this.currency, spotSymbolInfo.currency) && Intrinsics.areEqual(this.baseCurrency, spotSymbolInfo.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, spotSymbolInfo.quoteCurrency) && Intrinsics.areEqual(this.mark, spotSymbolInfo.mark) && Intrinsics.areEqual(this.board, spotSymbolInfo.board) && Intrinsics.areEqual(this.weight, spotSymbolInfo.weight) && Intrinsics.areEqual(this.enableTrading, spotSymbolInfo.enableTrading) && Intrinsics.areEqual(this.isEnableAuctionTrade, spotSymbolInfo.isEnableAuctionTrade) && Intrinsics.areEqual(this.display, spotSymbolInfo.display) && Intrinsics.areEqual(this.market, spotSymbolInfo.market) && Intrinsics.areEqual(this.context, spotSymbolInfo.context) && Intrinsics.areEqual(this.feeCode, spotSymbolInfo.feeCode) && Intrinsics.areEqual(this.makerFeeRate, spotSymbolInfo.makerFeeRate) && Intrinsics.areEqual(this.takerFeeRate, spotSymbolInfo.takerFeeRate) && Intrinsics.areEqual(this.quoteIncrement, spotSymbolInfo.quoteIncrement) && Intrinsics.areEqual(this.quoteMinSize, spotSymbolInfo.quoteMinSize) && Intrinsics.areEqual(this.quoteMaxSize, spotSymbolInfo.quoteMaxSize) && Intrinsics.areEqual(this.baseIncrement, spotSymbolInfo.baseIncrement) && Intrinsics.areEqual(this.baseMinSize, spotSymbolInfo.baseMinSize) && Intrinsics.areEqual(this.baseMaxSize, spotSymbolInfo.baseMaxSize) && Intrinsics.areEqual(this.priceIncrement, spotSymbolInfo.priceIncrement) && Intrinsics.areEqual((Object) this.pricePrecision, (Object) spotSymbolInfo.pricePrecision) && Intrinsics.areEqual((Object) this.basePrecision, (Object) spotSymbolInfo.basePrecision) && Intrinsics.areEqual((Object) this.quotePrecision, (Object) spotSymbolInfo.quotePrecision) && Intrinsics.areEqual(this.symbolName, spotSymbolInfo.symbolName) && Intrinsics.areEqual(this.baseCurrencyName, spotSymbolInfo.baseCurrencyName) && Intrinsics.areEqual(this.quoteCurrencyName, spotSymbolInfo.quoteCurrencyName) && Intrinsics.areEqual(this.isMarginEnabled, spotSymbolInfo.isMarginEnabled) && Intrinsics.areEqual(this.isIsolatedMarginEnabled, spotSymbolInfo.isIsolatedMarginEnabled) && Intrinsics.areEqual(this.enableAuctionTrading, spotSymbolInfo.enableAuctionTrading) && Intrinsics.areEqual(this.isBotEnabled, spotSymbolInfo.isBotEnabled) && Intrinsics.areEqual(this.disabledTipInfo, spotSymbolInfo.disabledTipInfo) && Intrinsics.areEqual(this.priceProtectionRate, spotSymbolInfo.priceProtectionRate);
    }

    public SpotSymbolInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31) {
        this.code = str;
        this.currency = str2;
        this.baseCurrency = str3;
        this.quoteCurrency = str4;
        this.mark = str5;
        this.board = str6;
        this.weight = str7;
        this.enableTrading = str8;
        this.isEnableAuctionTrade = str9;
        this.display = str10;
        this.market = str11;
        this.context = str12;
        this.feeCode = str13;
        this.makerFeeRate = str14;
        this.takerFeeRate = str15;
        this.quoteIncrement = str16;
        this.quoteMinSize = str17;
        this.quoteMaxSize = str18;
        this.baseIncrement = str19;
        this.baseMinSize = str20;
        this.baseMaxSize = str21;
        this.priceIncrement = str22;
        this.pricePrecision = d11;
        this.basePrecision = d12;
        this.quotePrecision = d13;
        this.symbolName = str23;
        this.baseCurrencyName = str24;
        this.quoteCurrencyName = str25;
        this.isMarginEnabled = str26;
        this.isIsolatedMarginEnabled = str27;
        this.enableAuctionTrading = str28;
        this.isBotEnabled = str29;
        this.disabledTipInfo = str30;
        this.priceProtectionRate = str31;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFeeCode() {
        return this.feeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getQuoteIncrement() {
        return this.quoteIncrement;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getQuoteMinSize() {
        return this.quoteMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getBaseIncrement() {
        return this.baseIncrement;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBaseMinSize() {
        return this.baseMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBaseMaxSize() {
        return this.baseMaxSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPriceIncrement() {
        return this.priceIncrement;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Double getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Double getBasePrecision() {
        return this.basePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Double getQuotePrecision() {
        return this.quotePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getIsIsolatedMarginEnabled() {
        return this.isIsolatedMarginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getEnableAuctionTrading() {
        return this.enableAuctionTrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getIsBotEnabled() {
        return this.isBotEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getDisabledTipInfo() {
        return this.disabledTipInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getPriceProtectionRate() {
        return this.priceProtectionRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMark() {
        return this.mark;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBoard() {
        return this.board;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEnableTrading() {
        return this.enableTrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIsEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    public final String getBaseIncrement() {
        return this.baseIncrement;
    }

    @Nullable
    public final String getBaseMaxSize() {
        return this.baseMaxSize;
    }

    @Nullable
    public final String getBaseMinSize() {
        return this.baseMinSize;
    }

    @Nullable
    public final Double getBasePrecision() {
        return this.basePrecision;
    }

    @Nullable
    public final String getBoard() {
        return this.board;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getContext() {
        return this.context;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDisabledTipInfo() {
        return this.disabledTipInfo;
    }

    @Nullable
    public final String getDisplay() {
        return this.display;
    }

    @Nullable
    public final String getEnableAuctionTrading() {
        return this.enableAuctionTrading;
    }

    @Nullable
    public final String getEnableTrading() {
        return this.enableTrading;
    }

    @Nullable
    public final String getFeeCode() {
        return this.feeCode;
    }

    @Nullable
    public final String getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    public final String getMark() {
        return this.mark;
    }

    @Nullable
    public final String getMarket() {
        return this.market;
    }

    @Nullable
    public final String getPriceIncrement() {
        return this.priceIncrement;
    }

    @Nullable
    public final Double getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    public final String getPriceProtectionRate() {
        return this.priceProtectionRate;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    public final String getQuoteIncrement() {
        return this.quoteIncrement;
    }

    @Nullable
    public final String getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    @Nullable
    public final String getQuoteMinSize() {
        return this.quoteMinSize;
    }

    @Nullable
    public final Double getQuotePrecision() {
        return this.quotePrecision;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final String getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baseCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mark;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.board;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.weight;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.enableTrading;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.isEnableAuctionTrade;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.display;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.market;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.context;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.feeCode;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.makerFeeRate;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.takerFeeRate;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.quoteIncrement;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.quoteMinSize;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.quoteMaxSize;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.baseIncrement;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.baseMinSize;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.baseMaxSize;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.priceIncrement;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Double d11 = this.pricePrecision;
        int iHashCode23 = (iHashCode22 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.basePrecision;
        int iHashCode24 = (iHashCode23 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.quotePrecision;
        int iHashCode25 = (iHashCode24 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str23 = this.symbolName;
        int iHashCode26 = (iHashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.baseCurrencyName;
        int iHashCode27 = (iHashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.quoteCurrencyName;
        int iHashCode28 = (iHashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.isMarginEnabled;
        int iHashCode29 = (iHashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.isIsolatedMarginEnabled;
        int iHashCode30 = (iHashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.enableAuctionTrading;
        int iHashCode31 = (iHashCode30 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.isBotEnabled;
        int iHashCode32 = (iHashCode31 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.disabledTipInfo;
        int iHashCode33 = (iHashCode32 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.priceProtectionRate;
        return iHashCode33 + (str31 != null ? str31.hashCode() : 0);
    }

    @Nullable
    public final String isBotEnabled() {
        return this.isBotEnabled;
    }

    @Nullable
    public final String isEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    @Nullable
    public final String isIsolatedMarginEnabled() {
        return this.isIsolatedMarginEnabled;
    }

    @Nullable
    public final String isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    public String toString() {
        return "SpotSymbolInfo(code=" + this.code + ", currency=" + this.currency + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", mark=" + this.mark + ", board=" + this.board + ", weight=" + this.weight + ", enableTrading=" + this.enableTrading + ", isEnableAuctionTrade=" + this.isEnableAuctionTrade + ", display=" + this.display + ", market=" + this.market + ", context=" + this.context + ", feeCode=" + this.feeCode + ", makerFeeRate=" + this.makerFeeRate + ", takerFeeRate=" + this.takerFeeRate + ", quoteIncrement=" + this.quoteIncrement + ", quoteMinSize=" + this.quoteMinSize + ", quoteMaxSize=" + this.quoteMaxSize + ", baseIncrement=" + this.baseIncrement + ", baseMinSize=" + this.baseMinSize + ", baseMaxSize=" + this.baseMaxSize + ", priceIncrement=" + this.priceIncrement + ", pricePrecision=" + this.pricePrecision + ", basePrecision=" + this.basePrecision + ", quotePrecision=" + this.quotePrecision + ", symbolName=" + this.symbolName + ", baseCurrencyName=" + this.baseCurrencyName + ", quoteCurrencyName=" + this.quoteCurrencyName + ", isMarginEnabled=" + this.isMarginEnabled + ", isIsolatedMarginEnabled=" + this.isIsolatedMarginEnabled + ", enableAuctionTrading=" + this.enableAuctionTrading + ", isBotEnabled=" + this.isBotEnabled + ", disabledTipInfo=" + this.disabledTipInfo + ", priceProtectionRate=" + this.priceProtectionRate + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.code;
        if (str != null) {
            writableMapCreateMap.putString("code", str.toString());
        }
        String str2 = this.currency;
        if (str2 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.CURRENCY, str2.toString());
        }
        String str3 = this.baseCurrency;
        if (str3 != null) {
            writableMapCreateMap.putString("baseCurrency", str3.toString());
        }
        String str4 = this.quoteCurrency;
        if (str4 != null) {
            writableMapCreateMap.putString("quoteCurrency", str4.toString());
        }
        String str5 = this.mark;
        if (str5 != null) {
            writableMapCreateMap.putString("mark", str5.toString());
        }
        String str6 = this.board;
        if (str6 != null) {
            writableMapCreateMap.putString("board", str6.toString());
        }
        String str7 = this.weight;
        if (str7 != null) {
            writableMapCreateMap.putString("weight", str7.toString());
        }
        String str8 = this.enableTrading;
        if (str8 != null) {
            writableMapCreateMap.putString("enableTrading", str8.toString());
        }
        String str9 = this.isEnableAuctionTrade;
        if (str9 != null) {
            writableMapCreateMap.putString("isEnableAuctionTrade", str9.toString());
        }
        String str10 = this.display;
        if (str10 != null) {
            writableMapCreateMap.putString("display", str10.toString());
        }
        String str11 = this.market;
        if (str11 != null) {
            writableMapCreateMap.putString("market", str11.toString());
        }
        String str12 = this.context;
        if (str12 != null) {
            writableMapCreateMap.putString("context", str12.toString());
        }
        String str13 = this.feeCode;
        if (str13 != null) {
            writableMapCreateMap.putString("feeCode", str13.toString());
        }
        String str14 = this.makerFeeRate;
        if (str14 != null) {
            writableMapCreateMap.putString("makerFeeRate", str14.toString());
        }
        String str15 = this.takerFeeRate;
        if (str15 != null) {
            writableMapCreateMap.putString("takerFeeRate", str15.toString());
        }
        String str16 = this.quoteIncrement;
        if (str16 != null) {
            writableMapCreateMap.putString("quoteIncrement", str16.toString());
        }
        String str17 = this.quoteMinSize;
        if (str17 != null) {
            writableMapCreateMap.putString("quoteMinSize", str17.toString());
        }
        String str18 = this.quoteMaxSize;
        if (str18 != null) {
            writableMapCreateMap.putString("quoteMaxSize", str18.toString());
        }
        String str19 = this.baseIncrement;
        if (str19 != null) {
            writableMapCreateMap.putString("baseIncrement", str19.toString());
        }
        String str20 = this.baseMinSize;
        if (str20 != null) {
            writableMapCreateMap.putString("baseMinSize", str20.toString());
        }
        String str21 = this.baseMaxSize;
        if (str21 != null) {
            writableMapCreateMap.putString("baseMaxSize", str21.toString());
        }
        String str22 = this.priceIncrement;
        if (str22 != null) {
            writableMapCreateMap.putString("priceIncrement", str22.toString());
        }
        Double d11 = this.pricePrecision;
        if (d11 != null) {
            writableMapCreateMap.putDouble("pricePrecision", d11.doubleValue());
        }
        Double d12 = this.basePrecision;
        if (d12 != null) {
            writableMapCreateMap.putDouble("basePrecision", d12.doubleValue());
        }
        Double d13 = this.quotePrecision;
        if (d13 != null) {
            writableMapCreateMap.putDouble("quotePrecision", d13.doubleValue());
        }
        String str23 = this.symbolName;
        if (str23 != null) {
            writableMapCreateMap.putString("symbolName", str23.toString());
        }
        String str24 = this.baseCurrencyName;
        if (str24 != null) {
            writableMapCreateMap.putString("baseCurrencyName", str24.toString());
        }
        String str25 = this.quoteCurrencyName;
        if (str25 != null) {
            writableMapCreateMap.putString("quoteCurrencyName", str25.toString());
        }
        String str26 = this.isMarginEnabled;
        if (str26 != null) {
            writableMapCreateMap.putString("isMarginEnabled", str26.toString());
        }
        String str27 = this.isIsolatedMarginEnabled;
        if (str27 != null) {
            writableMapCreateMap.putString("isIsolatedMarginEnabled", str27.toString());
        }
        String str28 = this.enableAuctionTrading;
        if (str28 != null) {
            writableMapCreateMap.putString("enableAuctionTrading", str28.toString());
        }
        String str29 = this.isBotEnabled;
        if (str29 != null) {
            writableMapCreateMap.putString("isBotEnabled", str29.toString());
        }
        String str30 = this.disabledTipInfo;
        if (str30 != null) {
            writableMapCreateMap.putString("disabledTipInfo", str30.toString());
        }
        String str31 = this.priceProtectionRate;
        if (str31 != null) {
            writableMapCreateMap.putString("priceProtectionRate", str31.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ SpotSymbolInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Double d11, Double d12, Double d13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16, (i11 & 65536) != 0 ? null : str17, (i11 & 131072) != 0 ? null : str18, (i11 & 262144) != 0 ? null : str19, (i11 & 524288) != 0 ? null : str20, (i11 & 1048576) != 0 ? null : str21, (i11 & 2097152) != 0 ? null : str22, (i11 & 4194304) != 0 ? null : d11, (i11 & 8388608) != 0 ? null : d12, (i11 & 16777216) != 0 ? null : d13, (i11 & 33554432) != 0 ? null : str23, (i11 & 67108864) != 0 ? null : str24, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str25, (i11 & 268435456) != 0 ? null : str26, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str27, (i11 & 1073741824) != 0 ? null : str28, (i11 & Integer.MIN_VALUE) != 0 ? null : str29, (i12 & 1) != 0 ? null : str30, (i12 & 2) != 0 ? null : str31);
    }
}
