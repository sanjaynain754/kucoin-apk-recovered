package com.kubi.kucoin.manager;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotMarketPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, m90084d2 = {"Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", "", JPushConstants.Operation.KEY_SEQUENCE, "", "type", "", "symbol", "side", FirebaseAnalytics.Param.PRICE, "size", "tradeId", "takerOrderId", "makerOrderId", "time", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getSequence", "()J", "getType", "()Ljava/lang/String;", "getSymbol", "getSide", "getPrice", "getSize", "getTradeId", "getTakerOrderId", "getMakerOrderId", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotMatchPushEntity {

    @NotNull
    private final String makerOrderId;

    @NotNull
    private final String price;
    private final long sequence;

    @NotNull
    private final String side;

    @NotNull
    private final String size;

    @NotNull
    private final String symbol;

    @NotNull
    private final String takerOrderId;
    private final long time;

    @NotNull
    private final String tradeId;

    @NotNull
    private final String type;

    public SpotMatchPushEntity() {
        this(0L, null, null, null, null, null, null, null, null, 0L, 1023, null);
    }

    @NotNull
    public final SpotMatchPushEntity copy(long sequence, @NotNull String type, @NotNull String symbol, @NotNull String side, @NotNull String price, @NotNull String size, @NotNull String tradeId, @NotNull String takerOrderId, @NotNull String makerOrderId, long time) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(tradeId, "tradeId");
        Intrinsics.checkNotNullParameter(takerOrderId, "takerOrderId");
        Intrinsics.checkNotNullParameter(makerOrderId, "makerOrderId");
        return new SpotMatchPushEntity(sequence, type, symbol, side, price, size, tradeId, takerOrderId, makerOrderId, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotMatchPushEntity)) {
            return false;
        }
        SpotMatchPushEntity spotMatchPushEntity = (SpotMatchPushEntity) other;
        return this.sequence == spotMatchPushEntity.sequence && Intrinsics.areEqual(this.type, spotMatchPushEntity.type) && Intrinsics.areEqual(this.symbol, spotMatchPushEntity.symbol) && Intrinsics.areEqual(this.side, spotMatchPushEntity.side) && Intrinsics.areEqual(this.price, spotMatchPushEntity.price) && Intrinsics.areEqual(this.size, spotMatchPushEntity.size) && Intrinsics.areEqual(this.tradeId, spotMatchPushEntity.tradeId) && Intrinsics.areEqual(this.takerOrderId, spotMatchPushEntity.takerOrderId) && Intrinsics.areEqual(this.makerOrderId, spotMatchPushEntity.makerOrderId) && this.time == spotMatchPushEntity.time;
    }

    public SpotMatchPushEntity(long j11, @NotNull String type, @NotNull String symbol, @NotNull String side, @NotNull String price, @NotNull String size, @NotNull String tradeId, @NotNull String takerOrderId, @NotNull String makerOrderId, long j12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(tradeId, "tradeId");
        Intrinsics.checkNotNullParameter(takerOrderId, "takerOrderId");
        Intrinsics.checkNotNullParameter(makerOrderId, "makerOrderId");
        this.sequence = j11;
        this.type = type;
        this.symbol = symbol;
        this.side = side;
        this.price = price;
        this.size = size;
        this.tradeId = tradeId;
        this.takerOrderId = takerOrderId;
        this.makerOrderId = makerOrderId;
        this.time = j12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @NotNull
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @NotNull
    public final String getPrice() {
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
    public final String getSize() {
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
        return (((((((((((((((((Long.hashCode(this.sequence) * 31) + this.type.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31) + this.price.hashCode()) * 31) + this.size.hashCode()) * 31) + this.tradeId.hashCode()) * 31) + this.takerOrderId.hashCode()) * 31) + this.makerOrderId.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "SpotMatchPushEntity(sequence=" + this.sequence + ", type=" + this.type + ", symbol=" + this.symbol + ", side=" + this.side + ", price=" + this.price + ", size=" + this.size + ", tradeId=" + this.tradeId + ", takerOrderId=" + this.takerOrderId + ", makerOrderId=" + this.makerOrderId + ", time=" + this.time + ')';
    }

    public /* synthetic */ SpotMatchPushEntity(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? "" : str6, (i11 & 128) != 0 ? "" : str7, (i11 & 256) == 0 ? str8 : "", (i11 & 512) != 0 ? 0L : j12);
    }
}
