package com.kubi.flutter.widget.kline;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineOrderEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016Jz\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016¨\u0006,"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", "", "userId", "", "symbol", "side", "timeType", "tradeType", "date", "", "latestDealPrice", "latestDealSize", "orderTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getUserId", "()Ljava/lang/String;", "getSymbol", "getSide", "getTimeType", "getTradeType", "getDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLatestDealPrice", "getLatestDealSize", "getOrderTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", "equals", "", "other", "hashCode", "", "toString", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineOrderEntity {

    @Nullable
    private final Long date;

    @Nullable
    private final String latestDealPrice;

    @Nullable
    private final String latestDealSize;

    @Nullable
    private final Long orderTime;

    @Nullable
    private final String side;

    @Nullable
    private final String symbol;

    @Nullable
    private final String timeType;

    @Nullable
    private final String tradeType;

    @Nullable
    private final String userId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlineOrderEntity)) {
            return false;
        }
        KlineOrderEntity klineOrderEntity = (KlineOrderEntity) other;
        return Intrinsics.areEqual(this.userId, klineOrderEntity.userId) && Intrinsics.areEqual(this.symbol, klineOrderEntity.symbol) && Intrinsics.areEqual(this.side, klineOrderEntity.side) && Intrinsics.areEqual(this.timeType, klineOrderEntity.timeType) && Intrinsics.areEqual(this.tradeType, klineOrderEntity.tradeType) && Intrinsics.areEqual(this.date, klineOrderEntity.date) && Intrinsics.areEqual(this.latestDealPrice, klineOrderEntity.latestDealPrice) && Intrinsics.areEqual(this.latestDealSize, klineOrderEntity.latestDealSize) && Intrinsics.areEqual(this.orderTime, klineOrderEntity.orderTime);
    }

    public static /* synthetic */ KlineOrderEntity copy$default(KlineOrderEntity klineOrderEntity, String str, String str2, String str3, String str4, String str5, Long l11, String str6, String str7, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = klineOrderEntity.userId;
        }
        if ((i11 & 2) != 0) {
            str2 = klineOrderEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = klineOrderEntity.side;
        }
        if ((i11 & 8) != 0) {
            str4 = klineOrderEntity.timeType;
        }
        if ((i11 & 16) != 0) {
            str5 = klineOrderEntity.tradeType;
        }
        if ((i11 & 32) != 0) {
            l11 = klineOrderEntity.date;
        }
        if ((i11 & 64) != 0) {
            str6 = klineOrderEntity.latestDealPrice;
        }
        if ((i11 & 128) != 0) {
            str7 = klineOrderEntity.latestDealSize;
        }
        if ((i11 & 256) != 0) {
            l12 = klineOrderEntity.orderTime;
        }
        String str8 = str7;
        Long l13 = l12;
        Long l14 = l11;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return klineOrderEntity.copy(str, str2, str11, str4, str10, l14, str9, str8, l13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeType() {
        return this.timeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLatestDealPrice() {
        return this.latestDealPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLatestDealSize() {
        return this.latestDealSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @NotNull
    public final KlineOrderEntity copy(@Nullable String userId, @Nullable String symbol, @Nullable String side, @Nullable String timeType, @Nullable String tradeType, @Nullable Long date, @Nullable String latestDealPrice, @Nullable String latestDealSize, @Nullable Long orderTime) {
        return new KlineOrderEntity(userId, symbol, side, timeType, tradeType, date, latestDealPrice, latestDealSize, orderTime);
    }

    @Nullable
    public final Long getDate() {
        return this.date;
    }

    @Nullable
    public final String getLatestDealPrice() {
        return this.latestDealPrice;
    }

    @Nullable
    public final String getLatestDealSize() {
        return this.latestDealSize;
    }

    @Nullable
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTimeType() {
        return this.timeType;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timeType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tradeType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.date;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str6 = this.latestDealPrice;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.latestDealSize;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l12 = this.orderTime;
        return iHashCode8 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KlineOrderEntity(userId=" + this.userId + ", symbol=" + this.symbol + ", side=" + this.side + ", timeType=" + this.timeType + ", tradeType=" + this.tradeType + ", date=" + this.date + ", latestDealPrice=" + this.latestDealPrice + ", latestDealSize=" + this.latestDealSize + ", orderTime=" + this.orderTime + ')';
    }

    public KlineOrderEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l11, @Nullable String str6, @Nullable String str7, @Nullable Long l12) {
        this.userId = str;
        this.symbol = str2;
        this.side = str3;
        this.timeType = str4;
        this.tradeType = str5;
        this.date = l11;
        this.latestDealPrice = str6;
        this.latestDealSize = str7;
        this.orderTime = l12;
    }
}
