package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsTickerEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u0086\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u000209HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000209R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006E"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/WsTickerEntity;", "Landroid/os/Parcelable;", "symbol", "", "tradeId", "side", "bestAskPrice", "Ljava/math/BigDecimal;", "bestAskSize", "bestBidPrice", "bestBidSize", FirebaseAnalytics.Param.PRICE, "size", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getTradeId", "setTradeId", "getSide", "setSide", "getBestAskPrice", "()Ljava/math/BigDecimal;", "setBestAskPrice", "(Ljava/math/BigDecimal;)V", "getBestAskSize", "setBestAskSize", "getBestBidPrice", "setBestBidPrice", "getBestBidSize", "setBestBidSize", "getPrice", "setPrice", "getSize", "setSize", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;)Lcom/kubi/kumex/data/market/model/WsTickerEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsTickerEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsTickerEntity> CREATOR = new C15792a();

    @Nullable
    private BigDecimal bestAskPrice;

    @Nullable
    private BigDecimal bestAskSize;

    @Nullable
    private BigDecimal bestBidPrice;

    @Nullable
    private BigDecimal bestBidSize;

    @Nullable
    private BigDecimal price;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String symbol;

    @SerializedName("ts")
    @Nullable
    private Long timestamp;

    @Nullable
    private String tradeId;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.WsTickerEntity$a */
    /* JADX INFO: compiled from: WsTickerEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15792a implements Parcelable.Creator<WsTickerEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WsTickerEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WsTickerEntity(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WsTickerEntity[] newArray(int i11) {
            return new WsTickerEntity[i11];
        }
    }

    public WsTickerEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsTickerEntity)) {
            return false;
        }
        WsTickerEntity wsTickerEntity = (WsTickerEntity) other;
        return Intrinsics.areEqual(this.symbol, wsTickerEntity.symbol) && Intrinsics.areEqual(this.tradeId, wsTickerEntity.tradeId) && Intrinsics.areEqual(this.side, wsTickerEntity.side) && Intrinsics.areEqual(this.bestAskPrice, wsTickerEntity.bestAskPrice) && Intrinsics.areEqual(this.bestAskSize, wsTickerEntity.bestAskSize) && Intrinsics.areEqual(this.bestBidPrice, wsTickerEntity.bestBidPrice) && Intrinsics.areEqual(this.bestBidSize, wsTickerEntity.bestBidSize) && Intrinsics.areEqual(this.price, wsTickerEntity.price) && Intrinsics.areEqual(this.size, wsTickerEntity.size) && Intrinsics.areEqual(this.timestamp, wsTickerEntity.timestamp);
    }

    public WsTickerEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable Long l11) {
        this.symbol = str;
        this.tradeId = str2;
        this.side = str3;
        this.bestAskPrice = bigDecimal;
        this.bestAskSize = bigDecimal2;
        this.bestBidPrice = bigDecimal3;
        this.bestBidSize = bigDecimal4;
        this.price = bigDecimal5;
        this.size = bigDecimal6;
        this.timestamp = l11;
    }

    public static /* synthetic */ WsTickerEntity copy$default(WsTickerEntity wsTickerEntity, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsTickerEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = wsTickerEntity.tradeId;
        }
        if ((i11 & 4) != 0) {
            str3 = wsTickerEntity.side;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = wsTickerEntity.bestAskPrice;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = wsTickerEntity.bestAskSize;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = wsTickerEntity.bestBidPrice;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = wsTickerEntity.bestBidSize;
        }
        if ((i11 & 128) != 0) {
            bigDecimal5 = wsTickerEntity.price;
        }
        if ((i11 & 256) != 0) {
            bigDecimal6 = wsTickerEntity.size;
        }
        if ((i11 & 512) != 0) {
            l11 = wsTickerEntity.timestamp;
        }
        BigDecimal bigDecimal7 = bigDecimal6;
        Long l12 = l11;
        BigDecimal bigDecimal8 = bigDecimal4;
        BigDecimal bigDecimal9 = bigDecimal5;
        BigDecimal bigDecimal10 = bigDecimal2;
        BigDecimal bigDecimal11 = bigDecimal3;
        return wsTickerEntity.copy(str, str2, str3, bigDecimal, bigDecimal10, bigDecimal11, bigDecimal8, bigDecimal9, bigDecimal7, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getBestAskSize() {
        return this.bestAskSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getBestBidSize() {
        return this.bestBidSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @NotNull
    public final WsTickerEntity copy(@Nullable String symbol, @Nullable String tradeId, @Nullable String side, @Nullable BigDecimal bestAskPrice, @Nullable BigDecimal bestAskSize, @Nullable BigDecimal bestBidPrice, @Nullable BigDecimal bestBidSize, @Nullable BigDecimal price, @Nullable BigDecimal size, @Nullable Long timestamp) {
        return new WsTickerEntity(symbol, tradeId, side, bestAskPrice, bestAskSize, bestBidPrice, bestBidSize, price, size, timestamp);
    }

    @Nullable
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    public final BigDecimal getBestAskSize() {
        return this.bestAskSize;
    }

    @Nullable
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    public final BigDecimal getBestBidSize() {
        return this.bestBidSize;
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
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tradeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.bestAskPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bestAskSize;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.bestBidPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.bestBidSize;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.price;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.size;
        int iHashCode9 = (iHashCode8 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        Long l11 = this.timestamp;
        return iHashCode9 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setBestAskPrice(@Nullable BigDecimal bigDecimal) {
        this.bestAskPrice = bigDecimal;
    }

    public final void setBestAskSize(@Nullable BigDecimal bigDecimal) {
        this.bestAskSize = bigDecimal;
    }

    public final void setBestBidPrice(@Nullable BigDecimal bigDecimal) {
        this.bestBidPrice = bigDecimal;
    }

    public final void setBestBidSize(@Nullable BigDecimal bigDecimal) {
        this.bestBidSize = bigDecimal;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    public final void setTradeId(@Nullable String str) {
        this.tradeId = str;
    }

    @NotNull
    public String toString() {
        return "WsTickerEntity(symbol=" + this.symbol + ", tradeId=" + this.tradeId + ", side=" + this.side + ", bestAskPrice=" + this.bestAskPrice + ", bestAskSize=" + this.bestAskSize + ", bestBidPrice=" + this.bestBidPrice + ", bestBidSize=" + this.bestBidSize + ", price=" + this.price + ", size=" + this.size + ", timestamp=" + this.timestamp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.tradeId);
        dest.writeString(this.side);
        dest.writeSerializable(this.bestAskPrice);
        dest.writeSerializable(this.bestAskSize);
        dest.writeSerializable(this.bestBidPrice);
        dest.writeSerializable(this.bestBidSize);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.size);
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ WsTickerEntity(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : bigDecimal2, (i11 & 32) != 0 ? null : bigDecimal3, (i11 & 64) != 0 ? null : bigDecimal4, (i11 & 128) != 0 ? null : bigDecimal5, (i11 & 256) != 0 ? null : bigDecimal6, (i11 & 512) != 0 ? null : l11);
    }
}
