package com.kubi.margin.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003Jm\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018¨\u0006A"}, m90084d2 = {"Lcom/kubi/margin/entity/WsRecentDealEntity;", "", JPushConstants.Operation.KEY_SEQUENCE, "", "symbol", "", "side", "size", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "takerOrderId", "time", "type", "makerOrderId", "tradeId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSequence", "()J", "setSequence", "(J)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getSide", "setSide", "getSize", "()Ljava/math/BigDecimal;", "setSize", "(Ljava/math/BigDecimal;)V", "getPrice", "setPrice", "getTakerOrderId", "setTakerOrderId", "getTime", "setTime", "getType", "setType", "getMakerOrderId", "setMakerOrderId", "getTradeId", "setTradeId", "convertToEntity", "Lcom/kubi/margin/entity/MarketRecentEntity;", "convertToOrderCenter", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "orderBookCenterEntity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsRecentDealEntity {

    @NotNull
    private String makerOrderId;

    @NotNull
    private BigDecimal price;
    private long sequence;

    @NotNull
    private String side;

    @NotNull
    private BigDecimal size;

    @NotNull
    private String symbol;

    @NotNull
    private String takerOrderId;
    private long time;

    @NotNull
    private String tradeId;

    @NotNull
    private String type;

    public WsRecentDealEntity(long j11, @NotNull String symbol, @NotNull String side, @NotNull BigDecimal size, @NotNull BigDecimal price, @NotNull String takerOrderId, long j12, @NotNull String type, @NotNull String makerOrderId, @NotNull String tradeId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(takerOrderId, "takerOrderId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(makerOrderId, "makerOrderId");
        Intrinsics.checkNotNullParameter(tradeId, "tradeId");
        this.sequence = j11;
        this.symbol = symbol;
        this.side = side;
        this.size = size;
        this.price = price;
        this.takerOrderId = takerOrderId;
        this.time = j12;
        this.type = type;
        this.makerOrderId = makerOrderId;
        this.tradeId = tradeId;
    }

    public static /* synthetic */ WsRecentDealEntity copy$default(WsRecentDealEntity wsRecentDealEntity, long j11, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, long j12, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = wsRecentDealEntity.sequence;
        }
        return wsRecentDealEntity.copy(j11, (i11 & 2) != 0 ? wsRecentDealEntity.symbol : str, (i11 & 4) != 0 ? wsRecentDealEntity.side : str2, (i11 & 8) != 0 ? wsRecentDealEntity.size : bigDecimal, (i11 & 16) != 0 ? wsRecentDealEntity.price : bigDecimal2, (i11 & 32) != 0 ? wsRecentDealEntity.takerOrderId : str3, (i11 & 64) != 0 ? wsRecentDealEntity.time : j12, (i11 & 128) != 0 ? wsRecentDealEntity.type : str4, (i11 & 256) != 0 ? wsRecentDealEntity.makerOrderId : str5, (i11 & 512) != 0 ? wsRecentDealEntity.tradeId : str6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsRecentDealEntity)) {
            return false;
        }
        WsRecentDealEntity wsRecentDealEntity = (WsRecentDealEntity) other;
        return this.sequence == wsRecentDealEntity.sequence && Intrinsics.areEqual(this.symbol, wsRecentDealEntity.symbol) && Intrinsics.areEqual(this.side, wsRecentDealEntity.side) && Intrinsics.areEqual(this.size, wsRecentDealEntity.size) && Intrinsics.areEqual(this.price, wsRecentDealEntity.price) && Intrinsics.areEqual(this.takerOrderId, wsRecentDealEntity.takerOrderId) && this.time == wsRecentDealEntity.time && Intrinsics.areEqual(this.type, wsRecentDealEntity.type) && Intrinsics.areEqual(this.makerOrderId, wsRecentDealEntity.makerOrderId) && Intrinsics.areEqual(this.tradeId, wsRecentDealEntity.tradeId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @NotNull
    public final MarketRecentEntity convertToEntity() {
        return new MarketRecentEntity(Long.valueOf(this.sequence), Long.valueOf(this.time / ((long) 1000000)), this.size, this.price, this.side);
    }

    @NotNull
    public final OrderBookCenterEntity convertToOrderCenter(@NotNull OrderBookCenterEntity orderBookCenterEntity) {
        Intrinsics.checkNotNullParameter(orderBookCenterEntity, "orderBookCenterEntity");
        orderBookCenterEntity.setPrice(C27039d.m66647g(this.price));
        orderBookCenterEntity.setSequence(this.sequence);
        orderBookCenterEntity.setSize(C27039d.m66647g(this.size));
        return orderBookCenterEntity;
    }

    @NotNull
    public final WsRecentDealEntity copy(long sequence, @NotNull String symbol, @NotNull String side, @NotNull BigDecimal size, @NotNull BigDecimal price, @NotNull String takerOrderId, long time, @NotNull String type, @NotNull String makerOrderId, @NotNull String tradeId) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(takerOrderId, "takerOrderId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(makerOrderId, "makerOrderId");
        Intrinsics.checkNotNullParameter(tradeId, "tradeId");
        return new WsRecentDealEntity(sequence, symbol, side, size, price, takerOrderId, time, type, makerOrderId, tradeId);
    }

    @NotNull
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @NotNull
    public final BigDecimal getPrice() {
        return this.price;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final BigDecimal getSize() {
        return this.size;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTradeId() {
        return this.tradeId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.sequence) * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31) + this.size.hashCode()) * 31) + this.price.hashCode()) * 31) + this.takerOrderId.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + this.type.hashCode()) * 31) + this.makerOrderId.hashCode()) * 31) + this.tradeId.hashCode();
    }

    public final void setMakerOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.makerOrderId = str;
    }

    public final void setPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.price = bigDecimal;
    }

    public final void setSequence(long j11) {
        this.sequence = j11;
    }

    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.side = str;
    }

    public final void setSize(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.size = bigDecimal;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    public final void setTakerOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.takerOrderId = str;
    }

    public final void setTime(long j11) {
        this.time = j11;
    }

    public final void setTradeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tradeId = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "WsRecentDealEntity(sequence=" + this.sequence + ", symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", price=" + this.price + ", takerOrderId=" + this.takerOrderId + ", time=" + this.time + ", type=" + this.type + ", makerOrderId=" + this.makerOrderId + ", tradeId=" + this.tradeId + ')';
    }

    public /* synthetic */ WsRecentDealEntity(long j11, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, long j12, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, str, str2, bigDecimal, bigDecimal2, str3, j12, str4, str5, str6);
    }
}
