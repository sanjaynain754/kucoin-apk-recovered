package com.kubi.spot.entity.callAuction;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsCallAuctionEstimateInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00066"}, m90084d2 = {"Lcom/kubi/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;", "", "estimatedDealPrice", "Ljava/math/BigDecimal;", "estimatedDealSize", "lowestBuyDeclaredPrice", "highestBuyDeclaredPrice", "lowestSellDeclaredPrice", "highestSellDeclaredPrice", "symbol", "", "timeStamp", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;)V", "getEstimatedDealPrice", "()Ljava/math/BigDecimal;", "setEstimatedDealPrice", "(Ljava/math/BigDecimal;)V", "getEstimatedDealSize", "setEstimatedDealSize", "getLowestBuyDeclaredPrice", "setLowestBuyDeclaredPrice", "getHighestBuyDeclaredPrice", "setHighestBuyDeclaredPrice", "getLowestSellDeclaredPrice", "setLowestSellDeclaredPrice", "getHighestSellDeclaredPrice", "setHighestSellDeclaredPrice", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getTimeStamp", "()Ljava/lang/Long;", "setTimeStamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsCallAuctionEstimateInfoEntity {

    @Nullable
    private BigDecimal estimatedDealPrice;

    @Nullable
    private BigDecimal estimatedDealSize;

    @Nullable
    private BigDecimal highestBuyDeclaredPrice;

    @Nullable
    private BigDecimal highestSellDeclaredPrice;

    @Nullable
    private BigDecimal lowestBuyDeclaredPrice;

    @Nullable
    private BigDecimal lowestSellDeclaredPrice;

    @Nullable
    private String symbol;

    @Nullable
    private Long timeStamp;

    public WsCallAuctionEstimateInfoEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsCallAuctionEstimateInfoEntity)) {
            return false;
        }
        WsCallAuctionEstimateInfoEntity wsCallAuctionEstimateInfoEntity = (WsCallAuctionEstimateInfoEntity) other;
        return Intrinsics.areEqual(this.estimatedDealPrice, wsCallAuctionEstimateInfoEntity.estimatedDealPrice) && Intrinsics.areEqual(this.estimatedDealSize, wsCallAuctionEstimateInfoEntity.estimatedDealSize) && Intrinsics.areEqual(this.lowestBuyDeclaredPrice, wsCallAuctionEstimateInfoEntity.lowestBuyDeclaredPrice) && Intrinsics.areEqual(this.highestBuyDeclaredPrice, wsCallAuctionEstimateInfoEntity.highestBuyDeclaredPrice) && Intrinsics.areEqual(this.lowestSellDeclaredPrice, wsCallAuctionEstimateInfoEntity.lowestSellDeclaredPrice) && Intrinsics.areEqual(this.highestSellDeclaredPrice, wsCallAuctionEstimateInfoEntity.highestSellDeclaredPrice) && Intrinsics.areEqual(this.symbol, wsCallAuctionEstimateInfoEntity.symbol) && Intrinsics.areEqual(this.timeStamp, wsCallAuctionEstimateInfoEntity.timeStamp);
    }

    public WsCallAuctionEstimateInfoEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str, @Nullable Long l11) {
        this.estimatedDealPrice = bigDecimal;
        this.estimatedDealSize = bigDecimal2;
        this.lowestBuyDeclaredPrice = bigDecimal3;
        this.highestBuyDeclaredPrice = bigDecimal4;
        this.lowestSellDeclaredPrice = bigDecimal5;
        this.highestSellDeclaredPrice = bigDecimal6;
        this.symbol = str;
        this.timeStamp = l11;
    }

    public static /* synthetic */ WsCallAuctionEstimateInfoEntity copy$default(WsCallAuctionEstimateInfoEntity wsCallAuctionEstimateInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = wsCallAuctionEstimateInfoEntity.estimatedDealPrice;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = wsCallAuctionEstimateInfoEntity.estimatedDealSize;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = wsCallAuctionEstimateInfoEntity.lowestBuyDeclaredPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = wsCallAuctionEstimateInfoEntity.highestBuyDeclaredPrice;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = wsCallAuctionEstimateInfoEntity.lowestSellDeclaredPrice;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = wsCallAuctionEstimateInfoEntity.highestSellDeclaredPrice;
        }
        if ((i11 & 64) != 0) {
            str = wsCallAuctionEstimateInfoEntity.symbol;
        }
        if ((i11 & 128) != 0) {
            l11 = wsCallAuctionEstimateInfoEntity.timeStamp;
        }
        String str2 = str;
        Long l12 = l11;
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal6;
        return wsCallAuctionEstimateInfoEntity.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal7, bigDecimal8, str2, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getEstimatedDealPrice() {
        return this.estimatedDealPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEstimatedDealSize() {
        return this.estimatedDealSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLowestBuyDeclaredPrice() {
        return this.lowestBuyDeclaredPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHighestBuyDeclaredPrice() {
        return this.highestBuyDeclaredPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLowestSellDeclaredPrice() {
        return this.lowestSellDeclaredPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getHighestSellDeclaredPrice() {
        return this.highestSellDeclaredPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final WsCallAuctionEstimateInfoEntity copy(@Nullable BigDecimal estimatedDealPrice, @Nullable BigDecimal estimatedDealSize, @Nullable BigDecimal lowestBuyDeclaredPrice, @Nullable BigDecimal highestBuyDeclaredPrice, @Nullable BigDecimal lowestSellDeclaredPrice, @Nullable BigDecimal highestSellDeclaredPrice, @Nullable String symbol, @Nullable Long timeStamp) {
        return new WsCallAuctionEstimateInfoEntity(estimatedDealPrice, estimatedDealSize, lowestBuyDeclaredPrice, highestBuyDeclaredPrice, lowestSellDeclaredPrice, highestSellDeclaredPrice, symbol, timeStamp);
    }

    @Nullable
    public final BigDecimal getEstimatedDealPrice() {
        return this.estimatedDealPrice;
    }

    @Nullable
    public final BigDecimal getEstimatedDealSize() {
        return this.estimatedDealSize;
    }

    @Nullable
    public final BigDecimal getHighestBuyDeclaredPrice() {
        return this.highestBuyDeclaredPrice;
    }

    @Nullable
    public final BigDecimal getHighestSellDeclaredPrice() {
        return this.highestSellDeclaredPrice;
    }

    @Nullable
    public final BigDecimal getLowestBuyDeclaredPrice() {
        return this.lowestBuyDeclaredPrice;
    }

    @Nullable
    public final BigDecimal getLowestSellDeclaredPrice() {
        return this.lowestSellDeclaredPrice;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.estimatedDealPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.estimatedDealSize;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.lowestBuyDeclaredPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.highestBuyDeclaredPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.lowestSellDeclaredPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.highestSellDeclaredPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str = this.symbol;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.timeStamp;
        return iHashCode7 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setEstimatedDealPrice(@Nullable BigDecimal bigDecimal) {
        this.estimatedDealPrice = bigDecimal;
    }

    public final void setEstimatedDealSize(@Nullable BigDecimal bigDecimal) {
        this.estimatedDealSize = bigDecimal;
    }

    public final void setHighestBuyDeclaredPrice(@Nullable BigDecimal bigDecimal) {
        this.highestBuyDeclaredPrice = bigDecimal;
    }

    public final void setHighestSellDeclaredPrice(@Nullable BigDecimal bigDecimal) {
        this.highestSellDeclaredPrice = bigDecimal;
    }

    public final void setLowestBuyDeclaredPrice(@Nullable BigDecimal bigDecimal) {
        this.lowestBuyDeclaredPrice = bigDecimal;
    }

    public final void setLowestSellDeclaredPrice(@Nullable BigDecimal bigDecimal) {
        this.lowestSellDeclaredPrice = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTimeStamp(@Nullable Long l11) {
        this.timeStamp = l11;
    }

    @NotNull
    public String toString() {
        return "WsCallAuctionEstimateInfoEntity(estimatedDealPrice=" + this.estimatedDealPrice + ", estimatedDealSize=" + this.estimatedDealSize + ", lowestBuyDeclaredPrice=" + this.lowestBuyDeclaredPrice + ", highestBuyDeclaredPrice=" + this.highestBuyDeclaredPrice + ", lowestSellDeclaredPrice=" + this.lowestSellDeclaredPrice + ", highestSellDeclaredPrice=" + this.highestSellDeclaredPrice + ", symbol=" + this.symbol + ", timeStamp=" + this.timeStamp + ')';
    }

    public /* synthetic */ WsCallAuctionEstimateInfoEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3, (i11 & 8) != 0 ? null : bigDecimal4, (i11 & 16) != 0 ? null : bigDecimal5, (i11 & 32) != 0 ? null : bigDecimal6, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? null : l11);
    }
}
