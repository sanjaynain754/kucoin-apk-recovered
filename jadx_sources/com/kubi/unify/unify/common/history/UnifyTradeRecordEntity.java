package com.kubi.unify.unify.common.history;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.unify.unify.mapper.HistoryMapper;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import rh0.C44095a;

/* JADX INFO: compiled from: HistoryEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010:\u001a\u00020;J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0096\u0002\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u0007HÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(¨\u0006Y"}, m90084d2 = {"Lcom/kubi/unify/unify/common/history/UnifyTradeRecordEntity;", "", "orderId", "", "symbol", "orderType", "orderDisplayType", "", "side", "tradeId", "size", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "value", "pnl", "fee", "feeRates", "feeCurrency", "liquidityRole", FirebaseAnalytics.Param.TAX, "taxRates", "taxCurrency", "executionTime", "", "fillType", "liquidationPrice", "marginMode", "fillPnl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "getOrderType", "getOrderDisplayType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSide", "getTradeId", "getSize", "()Ljava/math/BigDecimal;", "getPrice", "getValue", "getPnl", "getFee", "getFeeRates", "getFeeCurrency", "getLiquidityRole", "getTax", "getTaxRates", "getTaxCurrency", "getExecutionTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFillType", "getLiquidationPrice", "getMarginMode", "getFillPnl", "toTradeRecordEntity", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/unify/unify/common/history/UnifyTradeRecordEntity;", "equals", "", "other", "hashCode", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyTradeRecordEntity {

    @Nullable
    private final Long executionTime;

    @Nullable
    private final BigDecimal fee;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final BigDecimal feeRates;

    @Nullable
    private final BigDecimal fillPnl;

    @Nullable
    private final String fillType;

    @Nullable
    private final BigDecimal liquidationPrice;

    @Nullable
    private final String liquidityRole;

    @Nullable
    private final String marginMode;

    @Nullable
    private final Integer orderDisplayType;

    @Nullable
    private final String orderId;

    @Nullable
    private final String orderType;

    @Nullable
    private final BigDecimal pnl;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tax;

    @Nullable
    private final String taxCurrency;

    @Nullable
    private final BigDecimal taxRates;

    @Nullable
    private final String tradeId;

    @Nullable
    private final BigDecimal value;

    public UnifyTradeRecordEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable String str8, @Nullable Long l11, @Nullable String str9, @Nullable BigDecimal bigDecimal9, @Nullable String str10, @Nullable BigDecimal bigDecimal10) {
        this.orderId = str;
        this.symbol = str2;
        this.orderType = str3;
        this.orderDisplayType = num;
        this.side = str4;
        this.tradeId = str5;
        this.size = bigDecimal;
        this.price = bigDecimal2;
        this.value = bigDecimal3;
        this.pnl = bigDecimal4;
        this.fee = bigDecimal5;
        this.feeRates = bigDecimal6;
        this.feeCurrency = str6;
        this.liquidityRole = str7;
        this.tax = bigDecimal7;
        this.taxRates = bigDecimal8;
        this.taxCurrency = str8;
        this.executionTime = l11;
        this.fillType = str9;
        this.liquidationPrice = bigDecimal9;
        this.marginMode = str10;
        this.fillPnl = bigDecimal10;
    }

    public static /* synthetic */ UnifyTradeRecordEntity copy$default(UnifyTradeRecordEntity unifyTradeRecordEntity, String str, String str2, String str3, Integer num, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str6, String str7, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str8, Long l11, String str9, BigDecimal bigDecimal9, String str10, BigDecimal bigDecimal10, int i11, Object obj) {
        BigDecimal bigDecimal11;
        String str11;
        String str12 = (i11 & 1) != 0 ? unifyTradeRecordEntity.orderId : str;
        String str13 = (i11 & 2) != 0 ? unifyTradeRecordEntity.symbol : str2;
        String str14 = (i11 & 4) != 0 ? unifyTradeRecordEntity.orderType : str3;
        Integer num2 = (i11 & 8) != 0 ? unifyTradeRecordEntity.orderDisplayType : num;
        String str15 = (i11 & 16) != 0 ? unifyTradeRecordEntity.side : str4;
        String str16 = (i11 & 32) != 0 ? unifyTradeRecordEntity.tradeId : str5;
        BigDecimal bigDecimal12 = (i11 & 64) != 0 ? unifyTradeRecordEntity.size : bigDecimal;
        BigDecimal bigDecimal13 = (i11 & 128) != 0 ? unifyTradeRecordEntity.price : bigDecimal2;
        BigDecimal bigDecimal14 = (i11 & 256) != 0 ? unifyTradeRecordEntity.value : bigDecimal3;
        BigDecimal bigDecimal15 = (i11 & 512) != 0 ? unifyTradeRecordEntity.pnl : bigDecimal4;
        BigDecimal bigDecimal16 = (i11 & 1024) != 0 ? unifyTradeRecordEntity.fee : bigDecimal5;
        BigDecimal bigDecimal17 = (i11 & 2048) != 0 ? unifyTradeRecordEntity.feeRates : bigDecimal6;
        String str17 = (i11 & 4096) != 0 ? unifyTradeRecordEntity.feeCurrency : str6;
        String str18 = (i11 & 8192) != 0 ? unifyTradeRecordEntity.liquidityRole : str7;
        String str19 = str12;
        BigDecimal bigDecimal18 = (i11 & 16384) != 0 ? unifyTradeRecordEntity.tax : bigDecimal7;
        BigDecimal bigDecimal19 = (i11 & 32768) != 0 ? unifyTradeRecordEntity.taxRates : bigDecimal8;
        String str20 = (i11 & 65536) != 0 ? unifyTradeRecordEntity.taxCurrency : str8;
        Long l12 = (i11 & 131072) != 0 ? unifyTradeRecordEntity.executionTime : l11;
        String str21 = (i11 & 262144) != 0 ? unifyTradeRecordEntity.fillType : str9;
        BigDecimal bigDecimal20 = (i11 & 524288) != 0 ? unifyTradeRecordEntity.liquidationPrice : bigDecimal9;
        String str22 = (i11 & 1048576) != 0 ? unifyTradeRecordEntity.marginMode : str10;
        if ((i11 & 2097152) != 0) {
            str11 = str22;
            bigDecimal11 = unifyTradeRecordEntity.fillPnl;
        } else {
            bigDecimal11 = bigDecimal10;
            str11 = str22;
        }
        return unifyTradeRecordEntity.copy(str19, str13, str14, num2, str15, str16, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, str17, str18, bigDecimal18, bigDecimal19, str20, l12, str21, bigDecimal20, str11, bigDecimal11);
    }

    @NotNull
    public final UnifyTradeRecordEntity copy(@Nullable String orderId, @Nullable String symbol, @Nullable String orderType, @Nullable Integer orderDisplayType, @Nullable String side, @Nullable String tradeId, @Nullable BigDecimal size, @Nullable BigDecimal price, @Nullable BigDecimal value, @Nullable BigDecimal pnl, @Nullable BigDecimal fee, @Nullable BigDecimal feeRates, @Nullable String feeCurrency, @Nullable String liquidityRole, @Nullable BigDecimal tax, @Nullable BigDecimal taxRates, @Nullable String taxCurrency, @Nullable Long executionTime, @Nullable String fillType, @Nullable BigDecimal liquidationPrice, @Nullable String marginMode, @Nullable BigDecimal fillPnl) {
        return new UnifyTradeRecordEntity(orderId, symbol, orderType, orderDisplayType, side, tradeId, size, price, value, pnl, fee, feeRates, feeCurrency, liquidityRole, tax, taxRates, taxCurrency, executionTime, fillType, liquidationPrice, marginMode, fillPnl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyTradeRecordEntity)) {
            return false;
        }
        UnifyTradeRecordEntity unifyTradeRecordEntity = (UnifyTradeRecordEntity) other;
        return Intrinsics.areEqual(this.orderId, unifyTradeRecordEntity.orderId) && Intrinsics.areEqual(this.symbol, unifyTradeRecordEntity.symbol) && Intrinsics.areEqual(this.orderType, unifyTradeRecordEntity.orderType) && Intrinsics.areEqual(this.orderDisplayType, unifyTradeRecordEntity.orderDisplayType) && Intrinsics.areEqual(this.side, unifyTradeRecordEntity.side) && Intrinsics.areEqual(this.tradeId, unifyTradeRecordEntity.tradeId) && Intrinsics.areEqual(this.size, unifyTradeRecordEntity.size) && Intrinsics.areEqual(this.price, unifyTradeRecordEntity.price) && Intrinsics.areEqual(this.value, unifyTradeRecordEntity.value) && Intrinsics.areEqual(this.pnl, unifyTradeRecordEntity.pnl) && Intrinsics.areEqual(this.fee, unifyTradeRecordEntity.fee) && Intrinsics.areEqual(this.feeRates, unifyTradeRecordEntity.feeRates) && Intrinsics.areEqual(this.feeCurrency, unifyTradeRecordEntity.feeCurrency) && Intrinsics.areEqual(this.liquidityRole, unifyTradeRecordEntity.liquidityRole) && Intrinsics.areEqual(this.tax, unifyTradeRecordEntity.tax) && Intrinsics.areEqual(this.taxRates, unifyTradeRecordEntity.taxRates) && Intrinsics.areEqual(this.taxCurrency, unifyTradeRecordEntity.taxCurrency) && Intrinsics.areEqual(this.executionTime, unifyTradeRecordEntity.executionTime) && Intrinsics.areEqual(this.fillType, unifyTradeRecordEntity.fillType) && Intrinsics.areEqual(this.liquidationPrice, unifyTradeRecordEntity.liquidationPrice) && Intrinsics.areEqual(this.marginMode, unifyTradeRecordEntity.marginMode) && Intrinsics.areEqual(this.fillPnl, unifyTradeRecordEntity.fillPnl);
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.orderDisplayType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.side;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tradeId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.size;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.value;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.pnl;
        int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.fee;
        int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.feeRates;
        int iHashCode12 = (iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str6 = this.feeCurrency;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.liquidityRole;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.tax;
        int iHashCode15 = (iHashCode14 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.taxRates;
        int iHashCode16 = (iHashCode15 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str8 = this.taxCurrency;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.executionTime;
        int iHashCode18 = (iHashCode17 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.fillType;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.liquidationPrice;
        int iHashCode20 = (iHashCode19 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str10 = this.marginMode;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.fillPnl;
        return iHashCode21 + (bigDecimal10 != null ? bigDecimal10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyTradeRecordEntity(orderId=" + this.orderId + ", symbol=" + this.symbol + ", orderType=" + this.orderType + ", orderDisplayType=" + this.orderDisplayType + ", side=" + this.side + ", tradeId=" + this.tradeId + ", size=" + this.size + ", price=" + this.price + ", value=" + this.value + ", pnl=" + this.pnl + ", fee=" + this.fee + ", feeRates=" + this.feeRates + ", feeCurrency=" + this.feeCurrency + ", liquidityRole=" + this.liquidityRole + ", tax=" + this.tax + ", taxRates=" + this.taxRates + ", taxCurrency=" + this.taxCurrency + ", executionTime=" + this.executionTime + ", fillType=" + this.fillType + ", liquidationPrice=" + this.liquidationPrice + ", marginMode=" + this.marginMode + ", fillPnl=" + this.fillPnl + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getFeeRates() {
        return this.feeRates;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLiquidityRole() {
        return this.liquidityRole;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getTaxRates() {
        return this.taxRates;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getExecutionTime() {
        return this.executionTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getFillType() {
        return this.fillType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getFillPnl() {
        return this.fillPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    public final Long getExecutionTime() {
        return this.executionTime;
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final BigDecimal getFeeRates() {
        return this.feeRates;
    }

    @Nullable
    public final BigDecimal getFillPnl() {
        return this.fillPnl;
    }

    @Nullable
    public final String getFillType() {
        return this.fillType;
    }

    @Nullable
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final String getLiquidityRole() {
        return this.liquidityRole;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Integer getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final BigDecimal getTaxRates() {
        return this.taxRates;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    public final BigDecimal getValue() {
        return this.value;
    }

    @NotNull
    public final TradeRecordEntity toTradeRecordEntity() {
        return ((HistoryMapper) C44095a.m97166c(HistoryMapper.class)).toTradeRecordEntity(this);
    }

    public /* synthetic */ UnifyTradeRecordEntity(String str, String str2, String str3, Integer num, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str6, String str7, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str8, Long l11, String str9, BigDecimal bigDecimal9, String str10, BigDecimal bigDecimal10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, str4, str5, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, str6, str7, bigDecimal7, bigDecimal8, str8, l11, str9, bigDecimal9, str10, (i11 & 2097152) != 0 ? null : bigDecimal10);
    }
}
