package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsRecentDealEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001e\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001c\u0010'\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\u001c\u0010*\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010¨\u00060"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/WsRecentDealEntity;", "", "<init>", "()V", JPushConstants.Operation.KEY_SEQUENCE, "", "getSequence", "()Ljava/lang/Long;", "setSequence", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "side", "getSide", "setSide", "size", "", "getSize", "()Ljava/lang/Double;", "setSize", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", FirebaseAnalytics.Param.PRICE, "getPrice", "setPrice", "takerOrderId", "getTakerOrderId", "setTakerOrderId", "time", "getTime", "setTime", "type", "getType", "setType", "makerOrderId", "getMakerOrderId", "setMakerOrderId", "tradeId", "getTradeId", "setTradeId", "convertToOrderCenter", "Lcom/kubi/tradingbotkit/entity/OrderBookCenterEntity;", "orderBookCenterEntity", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WsRecentDealEntity {

    @Nullable
    private String makerOrderId;

    @Nullable
    private Double price;

    @Nullable
    private Long sequence = 0L;

    @Nullable
    private String side;

    @Nullable
    private Double size;

    @Nullable
    private String symbol;

    @Nullable
    private String takerOrderId;

    @Nullable
    private Long time;

    @Nullable
    private String tradeId;

    @Nullable
    private String type;

    @NotNull
    public final OrderBookCenterEntity convertToOrderCenter(@NotNull OrderBookCenterEntity orderBookCenterEntity) {
        Intrinsics.checkNotNullParameter(orderBookCenterEntity, "orderBookCenterEntity");
        Double d11 = this.price;
        orderBookCenterEntity.setPrice(d11 != null ? d11.doubleValue() : 0.0d);
        Long l11 = this.sequence;
        orderBookCenterEntity.setSequence(l11 != null ? l11.longValue() : 0L);
        Double d12 = this.size;
        orderBookCenterEntity.setSize(d12 != null ? d12.doubleValue() : 0.0d);
        return orderBookCenterEntity;
    }

    @Nullable
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final Double getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setMakerOrderId(@Nullable String str) {
        this.makerOrderId = str;
    }

    public final void setPrice(@Nullable Double d11) {
        this.price = d11;
    }

    public final void setSequence(@Nullable Long l11) {
        this.sequence = l11;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable Double d11) {
        this.size = d11;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTakerOrderId(@Nullable String str) {
        this.takerOrderId = str;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    public final void setTradeId(@Nullable String str) {
        this.tradeId = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public WsRecentDealEntity() {
        Double dValueOf = Double.valueOf(0.0d);
        this.size = dValueOf;
        this.price = dValueOf;
        this.time = 0L;
    }
}
