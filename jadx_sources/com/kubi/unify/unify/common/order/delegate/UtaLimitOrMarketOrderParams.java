package com.kubi.unify.unify.common.order.delegate;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.unify.api.entity.UnifySupportService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaOrderParams.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\bX\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b#\u0010$J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010[\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010c\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010d\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103Jö\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010fJ\u0013\u0010g\u001a\u00020\u00112\b\u0010h\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010i\u001a\u00020jHÖ\u0001J\t\u0010k\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0010\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b;\u00103R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b<\u00103R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b=\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b?\u00103R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0015\u0010 \u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\bC\u00103R\u0015\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\bD\u00103R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\bE\u00103¨\u0006l"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;", "", "tradeType", "", "sizeUnit", AppsFlyerProperties.CHANNEL, "tradeSource", "positionSide", "marginMode", "orderType", "side", "size", "symbol", FirebaseAnalytics.Param.PRICE, "bboSideType", "bboLevel", "isFullPercent", "", "leverage", "tpTriggerPrice", "tpTriggerPriceType", "slTriggerPrice", "slTriggerPriceType", "timeInForce", "postOnly", ViewProps.HIDDEN, "iceberg", "visibleSize", "reduceOnly", "triggerDirection", "triggerPrice", "triggerPriceType", "closeOrder", "fromReduce", "shortcut", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTradeType", "()Ljava/lang/String;", "getSizeUnit", "getChannel", "getTradeSource", "getPositionSide", "getMarginMode", "getOrderType", "getSide", "getSize", "getSymbol", "getPrice", "getBboSideType", "getBboLevel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeverage", "getTpTriggerPrice", "getTpTriggerPriceType", "getSlTriggerPrice", "getSlTriggerPriceType", "getTimeInForce", "getPostOnly", "getHidden", "getIceberg", "getVisibleSize", "getReduceOnly", "getTriggerDirection", "getTriggerPrice", "getTriggerPriceType", "getCloseOrder", "getFromReduce", "getShortcut", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;", "equals", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UtaLimitOrMarketOrderParams {

    @Nullable
    private final String bboLevel;

    @Nullable
    private final String bboSideType;

    @NotNull
    private final String channel;

    @Nullable
    private final Boolean closeOrder;

    @Nullable
    private final Boolean fromReduce;

    @Nullable
    private final Boolean hidden;

    @Nullable
    private final Boolean iceberg;

    @Nullable
    private final Boolean isFullPercent;

    @Nullable
    private final String leverage;

    @NotNull
    private final String marginMode;

    @Nullable
    private final String orderType;

    @NotNull
    private final String positionSide;

    @Nullable
    private final Boolean postOnly;

    @Nullable
    private final String price;

    @Nullable
    private final Boolean reduceOnly;

    @Nullable
    private final Boolean shortcut;

    @Nullable
    private final String side;

    @Nullable
    private final String size;

    @NotNull
    private final String sizeUnit;

    @Nullable
    private final String slTriggerPrice;

    @Nullable
    private final String slTriggerPriceType;

    @Nullable
    private final String symbol;

    @Nullable
    private final String timeInForce;

    @Nullable
    private final String tpTriggerPrice;

    @Nullable
    private final String tpTriggerPriceType;

    @NotNull
    private final String tradeSource;

    @NotNull
    private final String tradeType;

    @Nullable
    private final String triggerDirection;

    @Nullable
    private final String triggerPrice;

    @Nullable
    private final String triggerPriceType;

    @Nullable
    private final String visibleSize;

    public UtaLimitOrMarketOrderParams(@NotNull String tradeType, @NotNull String sizeUnit, @NotNull String channel, @NotNull String tradeSource, @NotNull String positionSide, @NotNull String marginMode, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str14, @Nullable Boolean bool5, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(tradeSource, "tradeSource");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        this.tradeType = tradeType;
        this.sizeUnit = sizeUnit;
        this.channel = channel;
        this.tradeSource = tradeSource;
        this.positionSide = positionSide;
        this.marginMode = marginMode;
        this.orderType = str;
        this.side = str2;
        this.size = str3;
        this.symbol = str4;
        this.price = str5;
        this.bboSideType = str6;
        this.bboLevel = str7;
        this.isFullPercent = bool;
        this.leverage = str8;
        this.tpTriggerPrice = str9;
        this.tpTriggerPriceType = str10;
        this.slTriggerPrice = str11;
        this.slTriggerPriceType = str12;
        this.timeInForce = str13;
        this.postOnly = bool2;
        this.hidden = bool3;
        this.iceberg = bool4;
        this.visibleSize = str14;
        this.reduceOnly = bool5;
        this.triggerDirection = str15;
        this.triggerPrice = str16;
        this.triggerPriceType = str17;
        this.closeOrder = bool6;
        this.fromReduce = bool7;
        this.shortcut = bool8;
    }

    public static /* synthetic */ UtaLimitOrMarketOrderParams copy$default(UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool2, Boolean bool3, Boolean bool4, String str20, Boolean bool5, String str21, String str22, String str23, Boolean bool6, Boolean bool7, Boolean bool8, int i11, Object obj) {
        Boolean bool9;
        Boolean bool10;
        String str24 = (i11 & 1) != 0 ? utaLimitOrMarketOrderParams.tradeType : str;
        String str25 = (i11 & 2) != 0 ? utaLimitOrMarketOrderParams.sizeUnit : str2;
        String str26 = (i11 & 4) != 0 ? utaLimitOrMarketOrderParams.channel : str3;
        String str27 = (i11 & 8) != 0 ? utaLimitOrMarketOrderParams.tradeSource : str4;
        String str28 = (i11 & 16) != 0 ? utaLimitOrMarketOrderParams.positionSide : str5;
        String str29 = (i11 & 32) != 0 ? utaLimitOrMarketOrderParams.marginMode : str6;
        String str30 = (i11 & 64) != 0 ? utaLimitOrMarketOrderParams.orderType : str7;
        String str31 = (i11 & 128) != 0 ? utaLimitOrMarketOrderParams.side : str8;
        String str32 = (i11 & 256) != 0 ? utaLimitOrMarketOrderParams.size : str9;
        String str33 = (i11 & 512) != 0 ? utaLimitOrMarketOrderParams.symbol : str10;
        String str34 = (i11 & 1024) != 0 ? utaLimitOrMarketOrderParams.price : str11;
        String str35 = (i11 & 2048) != 0 ? utaLimitOrMarketOrderParams.bboSideType : str12;
        String str36 = (i11 & 4096) != 0 ? utaLimitOrMarketOrderParams.bboLevel : str13;
        Boolean bool11 = (i11 & 8192) != 0 ? utaLimitOrMarketOrderParams.isFullPercent : bool;
        String str37 = str24;
        String str38 = (i11 & 16384) != 0 ? utaLimitOrMarketOrderParams.leverage : str14;
        String str39 = (i11 & 32768) != 0 ? utaLimitOrMarketOrderParams.tpTriggerPrice : str15;
        String str40 = (i11 & 65536) != 0 ? utaLimitOrMarketOrderParams.tpTriggerPriceType : str16;
        String str41 = (i11 & 131072) != 0 ? utaLimitOrMarketOrderParams.slTriggerPrice : str17;
        String str42 = (i11 & 262144) != 0 ? utaLimitOrMarketOrderParams.slTriggerPriceType : str18;
        String str43 = (i11 & 524288) != 0 ? utaLimitOrMarketOrderParams.timeInForce : str19;
        Boolean bool12 = (i11 & 1048576) != 0 ? utaLimitOrMarketOrderParams.postOnly : bool2;
        Boolean bool13 = (i11 & 2097152) != 0 ? utaLimitOrMarketOrderParams.hidden : bool3;
        Boolean bool14 = (i11 & 4194304) != 0 ? utaLimitOrMarketOrderParams.iceberg : bool4;
        String str44 = (i11 & 8388608) != 0 ? utaLimitOrMarketOrderParams.visibleSize : str20;
        Boolean bool15 = (i11 & 16777216) != 0 ? utaLimitOrMarketOrderParams.reduceOnly : bool5;
        String str45 = (i11 & 33554432) != 0 ? utaLimitOrMarketOrderParams.triggerDirection : str21;
        String str46 = (i11 & 67108864) != 0 ? utaLimitOrMarketOrderParams.triggerPrice : str22;
        String str47 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? utaLimitOrMarketOrderParams.triggerPriceType : str23;
        Boolean bool16 = (i11 & 268435456) != 0 ? utaLimitOrMarketOrderParams.closeOrder : bool6;
        Boolean bool17 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? utaLimitOrMarketOrderParams.fromReduce : bool7;
        if ((i11 & 1073741824) != 0) {
            bool10 = bool17;
            bool9 = utaLimitOrMarketOrderParams.shortcut;
        } else {
            bool9 = bool8;
            bool10 = bool17;
        }
        return utaLimitOrMarketOrderParams.copy(str37, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, bool11, str38, str39, str40, str41, str42, str43, bool12, bool13, bool14, str44, bool15, str45, str46, str47, bool16, bool10, bool9);
    }

    @NotNull
    public final UtaLimitOrMarketOrderParams copy(@NotNull String tradeType, @NotNull String sizeUnit, @NotNull String channel, @NotNull String tradeSource, @NotNull String positionSide, @NotNull String marginMode, @Nullable String orderType, @Nullable String side, @Nullable String size, @Nullable String symbol, @Nullable String price, @Nullable String bboSideType, @Nullable String bboLevel, @Nullable Boolean isFullPercent, @Nullable String leverage, @Nullable String tpTriggerPrice, @Nullable String tpTriggerPriceType, @Nullable String slTriggerPrice, @Nullable String slTriggerPriceType, @Nullable String timeInForce, @Nullable Boolean postOnly, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String visibleSize, @Nullable Boolean reduceOnly, @Nullable String triggerDirection, @Nullable String triggerPrice, @Nullable String triggerPriceType, @Nullable Boolean closeOrder, @Nullable Boolean fromReduce, @Nullable Boolean shortcut) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(tradeSource, "tradeSource");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        return new UtaLimitOrMarketOrderParams(tradeType, sizeUnit, channel, tradeSource, positionSide, marginMode, orderType, side, size, symbol, price, bboSideType, bboLevel, isFullPercent, leverage, tpTriggerPrice, tpTriggerPriceType, slTriggerPrice, slTriggerPriceType, timeInForce, postOnly, hidden, iceberg, visibleSize, reduceOnly, triggerDirection, triggerPrice, triggerPriceType, closeOrder, fromReduce, shortcut);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtaLimitOrMarketOrderParams)) {
            return false;
        }
        UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParams = (UtaLimitOrMarketOrderParams) other;
        return Intrinsics.areEqual(this.tradeType, utaLimitOrMarketOrderParams.tradeType) && Intrinsics.areEqual(this.sizeUnit, utaLimitOrMarketOrderParams.sizeUnit) && Intrinsics.areEqual(this.channel, utaLimitOrMarketOrderParams.channel) && Intrinsics.areEqual(this.tradeSource, utaLimitOrMarketOrderParams.tradeSource) && Intrinsics.areEqual(this.positionSide, utaLimitOrMarketOrderParams.positionSide) && Intrinsics.areEqual(this.marginMode, utaLimitOrMarketOrderParams.marginMode) && Intrinsics.areEqual(this.orderType, utaLimitOrMarketOrderParams.orderType) && Intrinsics.areEqual(this.side, utaLimitOrMarketOrderParams.side) && Intrinsics.areEqual(this.size, utaLimitOrMarketOrderParams.size) && Intrinsics.areEqual(this.symbol, utaLimitOrMarketOrderParams.symbol) && Intrinsics.areEqual(this.price, utaLimitOrMarketOrderParams.price) && Intrinsics.areEqual(this.bboSideType, utaLimitOrMarketOrderParams.bboSideType) && Intrinsics.areEqual(this.bboLevel, utaLimitOrMarketOrderParams.bboLevel) && Intrinsics.areEqual(this.isFullPercent, utaLimitOrMarketOrderParams.isFullPercent) && Intrinsics.areEqual(this.leverage, utaLimitOrMarketOrderParams.leverage) && Intrinsics.areEqual(this.tpTriggerPrice, utaLimitOrMarketOrderParams.tpTriggerPrice) && Intrinsics.areEqual(this.tpTriggerPriceType, utaLimitOrMarketOrderParams.tpTriggerPriceType) && Intrinsics.areEqual(this.slTriggerPrice, utaLimitOrMarketOrderParams.slTriggerPrice) && Intrinsics.areEqual(this.slTriggerPriceType, utaLimitOrMarketOrderParams.slTriggerPriceType) && Intrinsics.areEqual(this.timeInForce, utaLimitOrMarketOrderParams.timeInForce) && Intrinsics.areEqual(this.postOnly, utaLimitOrMarketOrderParams.postOnly) && Intrinsics.areEqual(this.hidden, utaLimitOrMarketOrderParams.hidden) && Intrinsics.areEqual(this.iceberg, utaLimitOrMarketOrderParams.iceberg) && Intrinsics.areEqual(this.visibleSize, utaLimitOrMarketOrderParams.visibleSize) && Intrinsics.areEqual(this.reduceOnly, utaLimitOrMarketOrderParams.reduceOnly) && Intrinsics.areEqual(this.triggerDirection, utaLimitOrMarketOrderParams.triggerDirection) && Intrinsics.areEqual(this.triggerPrice, utaLimitOrMarketOrderParams.triggerPrice) && Intrinsics.areEqual(this.triggerPriceType, utaLimitOrMarketOrderParams.triggerPriceType) && Intrinsics.areEqual(this.closeOrder, utaLimitOrMarketOrderParams.closeOrder) && Intrinsics.areEqual(this.fromReduce, utaLimitOrMarketOrderParams.fromReduce) && Intrinsics.areEqual(this.shortcut, utaLimitOrMarketOrderParams.shortcut);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.tradeType.hashCode() * 31) + this.sizeUnit.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.tradeSource.hashCode()) * 31) + this.positionSide.hashCode()) * 31) + this.marginMode.hashCode()) * 31;
        String str = this.orderType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.side;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.size;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.price;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bboSideType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bboLevel;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isFullPercent;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.leverage;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tpTriggerPrice;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tpTriggerPriceType;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.slTriggerPrice;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.slTriggerPriceType;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.timeInForce;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.postOnly;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hidden;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.iceberg;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str14 = this.visibleSize;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool5 = this.reduceOnly;
        int iHashCode20 = (iHashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str15 = this.triggerDirection;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.triggerPrice;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.triggerPriceType;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool6 = this.closeOrder;
        int iHashCode24 = (iHashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.fromReduce;
        int iHashCode25 = (iHashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.shortcut;
        return iHashCode25 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtaLimitOrMarketOrderParams(tradeType=" + this.tradeType + ", sizeUnit=" + this.sizeUnit + ", channel=" + this.channel + ", tradeSource=" + this.tradeSource + ", positionSide=" + this.positionSide + ", marginMode=" + this.marginMode + ", orderType=" + this.orderType + ", side=" + this.side + ", size=" + this.size + ", symbol=" + this.symbol + ", price=" + this.price + ", bboSideType=" + this.bboSideType + ", bboLevel=" + this.bboLevel + ", isFullPercent=" + this.isFullPercent + ", leverage=" + this.leverage + ", tpTriggerPrice=" + this.tpTriggerPrice + ", tpTriggerPriceType=" + this.tpTriggerPriceType + ", slTriggerPrice=" + this.slTriggerPrice + ", slTriggerPriceType=" + this.slTriggerPriceType + ", timeInForce=" + this.timeInForce + ", postOnly=" + this.postOnly + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", visibleSize=" + this.visibleSize + ", reduceOnly=" + this.reduceOnly + ", triggerDirection=" + this.triggerDirection + ", triggerPrice=" + this.triggerPrice + ", triggerPriceType=" + this.triggerPriceType + ", closeOrder=" + this.closeOrder + ", fromReduce=" + this.fromReduce + ", shortcut=" + this.shortcut + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBboSideType() {
        return this.bboSideType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBboLevel() {
        return this.bboLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsFullPercent() {
        return this.isFullPercent;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Boolean getCloseOrder() {
        return this.closeOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getFromReduce() {
        return this.fromReduce;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getShortcut() {
        return this.shortcut;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTradeSource() {
        return this.tradeSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getBboLevel() {
        return this.bboLevel;
    }

    @Nullable
    public final String getBboSideType() {
        return this.bboSideType;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final Boolean getCloseOrder() {
        return this.closeOrder;
    }

    @Nullable
    public final Boolean getFromReduce() {
        return this.fromReduce;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    @Nullable
    public final Boolean getShortcut() {
        return this.shortcut;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    public final String getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    public final String getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @NotNull
    public final String getTradeSource() {
        return this.tradeSource;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    public final String getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    public final Boolean isFullPercent() {
        return this.isFullPercent;
    }

    public /* synthetic */ UtaLimitOrMarketOrderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool2, Boolean bool3, Boolean bool4, String str20, Boolean bool5, String str21, String str22, String str23, Boolean bool6, Boolean bool7, Boolean bool8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? UnifySupportService.FUTURES.getValue() : str, (i11 & 2) != 0 ? "UNIT" : str2, (i11 & 4) != 0 ? "ANDROID" : str3, (i11 & 8) != 0 ? "0" : str4, (i11 & 16) != 0 ? "BOTH" : str5, (i11 & 32) != 0 ? "CROSS" : str6, str7, str8, str9, str10, str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, bool, str14, str15, str16, str17, str18, str19, bool2, bool3, bool4, str20, bool5, str21, str22, str23, bool6, (536870912 & i11) != 0 ? null : bool7, (i11 & 1073741824) != 0 ? null : bool8);
    }
}
