package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PriceEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010(\u001a\u00020\u000bHÆ\u0003JT\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00068"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/PriceEntity;", "Landroid/os/Parcelable;", "symbol", "", "granularity", "", "indexPrice", "Ljava/math/BigDecimal;", "markPrice", "timestamp", "latestTicker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Lcom/kubi/kumex/data/market/model/TickerEntity;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getGranularity", "()Ljava/lang/Long;", "setGranularity", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getIndexPrice", "()Ljava/math/BigDecimal;", "setIndexPrice", "(Ljava/math/BigDecimal;)V", "getMarkPrice", "setMarkPrice", "getTimestamp", "setTimestamp", "getLatestTicker", "()Lcom/kubi/kumex/data/market/model/TickerEntity;", "setLatestTicker", "(Lcom/kubi/kumex/data/market/model/TickerEntity;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Lcom/kubi/kumex/data/market/model/TickerEntity;)Lcom/kubi/kumex/data/market/model/PriceEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PriceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PriceEntity> CREATOR = new C15784a();

    @Nullable
    private Long granularity;

    @Nullable
    private BigDecimal indexPrice;

    @NotNull
    private TickerEntity latestTicker;

    @SerializedName("value")
    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private String symbol;

    @SerializedName("timePoint")
    @Nullable
    private Long timestamp;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.PriceEntity$a */
    /* JADX INFO: compiled from: PriceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15784a implements Parcelable.Creator<PriceEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PriceEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceEntity(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, TickerEntity.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PriceEntity[] newArray(int i11) {
            return new PriceEntity[i11];
        }
    }

    public PriceEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceEntity)) {
            return false;
        }
        PriceEntity priceEntity = (PriceEntity) other;
        return Intrinsics.areEqual(this.symbol, priceEntity.symbol) && Intrinsics.areEqual(this.granularity, priceEntity.granularity) && Intrinsics.areEqual(this.indexPrice, priceEntity.indexPrice) && Intrinsics.areEqual(this.markPrice, priceEntity.markPrice) && Intrinsics.areEqual(this.timestamp, priceEntity.timestamp) && Intrinsics.areEqual(this.latestTicker, priceEntity.latestTicker);
    }

    public PriceEntity(@Nullable String str, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Long l12, @NotNull TickerEntity latestTicker) {
        Intrinsics.checkNotNullParameter(latestTicker, "latestTicker");
        this.symbol = str;
        this.granularity = l11;
        this.indexPrice = bigDecimal;
        this.markPrice = bigDecimal2;
        this.timestamp = l12;
        this.latestTicker = latestTicker;
    }

    public static /* synthetic */ PriceEntity copy$default(PriceEntity priceEntity, String str, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l12, TickerEntity tickerEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = priceEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            l11 = priceEntity.granularity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = priceEntity.indexPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = priceEntity.markPrice;
        }
        if ((i11 & 16) != 0) {
            l12 = priceEntity.timestamp;
        }
        if ((i11 & 32) != 0) {
            tickerEntity = priceEntity.latestTicker;
        }
        Long l13 = l12;
        TickerEntity tickerEntity2 = tickerEntity;
        return priceEntity.copy(str, l11, bigDecimal, bigDecimal2, l13, tickerEntity2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getGranularity() {
        return this.granularity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TickerEntity getLatestTicker() {
        return this.latestTicker;
    }

    @NotNull
    public final PriceEntity copy(@Nullable String symbol, @Nullable Long granularity, @Nullable BigDecimal indexPrice, @Nullable BigDecimal markPrice, @Nullable Long timestamp, @NotNull TickerEntity latestTicker) {
        Intrinsics.checkNotNullParameter(latestTicker, "latestTicker");
        return new PriceEntity(symbol, granularity, indexPrice, markPrice, timestamp, latestTicker);
    }

    @Nullable
    public final Long getGranularity() {
        return this.granularity;
    }

    @Nullable
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @NotNull
    public final TickerEntity getLatestTicker() {
        return this.latestTicker;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.granularity;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.indexPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.markPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l12 = this.timestamp;
        return ((iHashCode4 + (l12 != null ? l12.hashCode() : 0)) * 31) + this.latestTicker.hashCode();
    }

    public final void setGranularity(@Nullable Long l11) {
        this.granularity = l11;
    }

    public final void setIndexPrice(@Nullable BigDecimal bigDecimal) {
        this.indexPrice = bigDecimal;
    }

    public final void setLatestTicker(@NotNull TickerEntity tickerEntity) {
        Intrinsics.checkNotNullParameter(tickerEntity, "<set-?>");
        this.latestTicker = tickerEntity;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    @NotNull
    public String toString() {
        return "PriceEntity(symbol=" + this.symbol + ", granularity=" + this.granularity + ", indexPrice=" + this.indexPrice + ", markPrice=" + this.markPrice + ", timestamp=" + this.timestamp + ", latestTicker=" + this.latestTicker + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        Long l11 = this.granularity;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.indexPrice);
        dest.writeSerializable(this.markPrice);
        Long l12 = this.timestamp;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        this.latestTicker.writeToParcel(dest, flags);
    }

    public /* synthetic */ PriceEntity(String str, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l12, TickerEntity tickerEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) == 0 ? l12 : null, (i11 & 32) != 0 ? new TickerEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null) : tickerEntity);
    }
}
