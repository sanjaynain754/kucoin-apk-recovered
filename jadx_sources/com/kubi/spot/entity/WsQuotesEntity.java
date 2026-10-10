package com.kubi.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsQuotesEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%Jz\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000205HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006A"}, m90084d2 = {"Lcom/kubi/spot/entity/WsQuotesEntity;", "Landroid/os/Parcelable;", "symbol", "", "volume", "Ljava/math/BigDecimal;", "turnover", "lastPrice", "lowPrice", "highPrice", "priceChg", "priceChgPct", "time", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getVolume", "()Ljava/math/BigDecimal;", "setVolume", "(Ljava/math/BigDecimal;)V", "getTurnover", "setTurnover", "getLastPrice", "setLastPrice", "getLowPrice", "setLowPrice", "getHighPrice", "setHighPrice", "getPriceChg", "setPriceChg", "getPriceChgPct", "setPriceChgPct", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;)Lcom/kubi/spot/entity/WsQuotesEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsQuotesEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsQuotesEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal highPrice;

    @Nullable
    private BigDecimal lastPrice;

    @Nullable
    private BigDecimal lowPrice;

    @Nullable
    private BigDecimal priceChg;

    @Nullable
    private BigDecimal priceChgPct;

    @Nullable
    private String symbol;

    @SerializedName("ts")
    @Nullable
    private Long time;

    @Nullable
    private BigDecimal turnover;

    @Nullable
    private BigDecimal volume;

    /* JADX INFO: compiled from: WsQuotesEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WsQuotesEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WsQuotesEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WsQuotesEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WsQuotesEntity[] newArray(int i11) {
            return new WsQuotesEntity[i11];
        }
    }

    public WsQuotesEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsQuotesEntity)) {
            return false;
        }
        WsQuotesEntity wsQuotesEntity = (WsQuotesEntity) other;
        return Intrinsics.areEqual(this.symbol, wsQuotesEntity.symbol) && Intrinsics.areEqual(this.volume, wsQuotesEntity.volume) && Intrinsics.areEqual(this.turnover, wsQuotesEntity.turnover) && Intrinsics.areEqual(this.lastPrice, wsQuotesEntity.lastPrice) && Intrinsics.areEqual(this.lowPrice, wsQuotesEntity.lowPrice) && Intrinsics.areEqual(this.highPrice, wsQuotesEntity.highPrice) && Intrinsics.areEqual(this.priceChg, wsQuotesEntity.priceChg) && Intrinsics.areEqual(this.priceChgPct, wsQuotesEntity.priceChgPct) && Intrinsics.areEqual(this.time, wsQuotesEntity.time);
    }

    public WsQuotesEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable Long l11) {
        this.symbol = str;
        this.volume = bigDecimal;
        this.turnover = bigDecimal2;
        this.lastPrice = bigDecimal3;
        this.lowPrice = bigDecimal4;
        this.highPrice = bigDecimal5;
        this.priceChg = bigDecimal6;
        this.priceChgPct = bigDecimal7;
        this.time = l11;
    }

    public static /* synthetic */ WsQuotesEntity copy$default(WsQuotesEntity wsQuotesEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsQuotesEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = wsQuotesEntity.volume;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = wsQuotesEntity.turnover;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = wsQuotesEntity.lastPrice;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = wsQuotesEntity.lowPrice;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = wsQuotesEntity.highPrice;
        }
        if ((i11 & 64) != 0) {
            bigDecimal6 = wsQuotesEntity.priceChg;
        }
        if ((i11 & 128) != 0) {
            bigDecimal7 = wsQuotesEntity.priceChgPct;
        }
        if ((i11 & 256) != 0) {
            l11 = wsQuotesEntity.time;
        }
        BigDecimal bigDecimal8 = bigDecimal7;
        Long l12 = l11;
        BigDecimal bigDecimal9 = bigDecimal5;
        BigDecimal bigDecimal10 = bigDecimal6;
        BigDecimal bigDecimal11 = bigDecimal4;
        BigDecimal bigDecimal12 = bigDecimal2;
        return wsQuotesEntity.copy(str, bigDecimal, bigDecimal12, bigDecimal3, bigDecimal11, bigDecimal9, bigDecimal10, bigDecimal8, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTurnover() {
        return this.turnover;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLowPrice() {
        return this.lowPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getPriceChg() {
        return this.priceChg;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final WsQuotesEntity copy(@Nullable String symbol, @Nullable BigDecimal volume, @Nullable BigDecimal turnover, @Nullable BigDecimal lastPrice, @Nullable BigDecimal lowPrice, @Nullable BigDecimal highPrice, @Nullable BigDecimal priceChg, @Nullable BigDecimal priceChgPct, @Nullable Long time) {
        return new WsQuotesEntity(symbol, volume, turnover, lastPrice, lowPrice, highPrice, priceChg, priceChgPct, time);
    }

    @Nullable
    public final BigDecimal getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final BigDecimal getLowPrice() {
        return this.lowPrice;
    }

    @Nullable
    public final BigDecimal getPriceChg() {
        return this.priceChg;
    }

    @Nullable
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final BigDecimal getTurnover() {
        return this.turnover;
    }

    @Nullable
    public final BigDecimal getVolume() {
        return this.volume;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.volume;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.turnover;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.lastPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.lowPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.highPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.priceChg;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.priceChgPct;
        int iHashCode8 = (iHashCode7 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        Long l11 = this.time;
        return iHashCode8 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setHighPrice(@Nullable BigDecimal bigDecimal) {
        this.highPrice = bigDecimal;
    }

    public final void setLastPrice(@Nullable BigDecimal bigDecimal) {
        this.lastPrice = bigDecimal;
    }

    public final void setLowPrice(@Nullable BigDecimal bigDecimal) {
        this.lowPrice = bigDecimal;
    }

    public final void setPriceChg(@Nullable BigDecimal bigDecimal) {
        this.priceChg = bigDecimal;
    }

    public final void setPriceChgPct(@Nullable BigDecimal bigDecimal) {
        this.priceChgPct = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    public final void setTurnover(@Nullable BigDecimal bigDecimal) {
        this.turnover = bigDecimal;
    }

    public final void setVolume(@Nullable BigDecimal bigDecimal) {
        this.volume = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "WsQuotesEntity(symbol=" + this.symbol + ", volume=" + this.volume + ", turnover=" + this.turnover + ", lastPrice=" + this.lastPrice + ", lowPrice=" + this.lowPrice + ", highPrice=" + this.highPrice + ", priceChg=" + this.priceChg + ", priceChgPct=" + this.priceChgPct + ", time=" + this.time + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.volume);
        dest.writeSerializable(this.turnover);
        dest.writeSerializable(this.lastPrice);
        dest.writeSerializable(this.lowPrice);
        dest.writeSerializable(this.highPrice);
        dest.writeSerializable(this.priceChg);
        dest.writeSerializable(this.priceChgPct);
        Long l11 = this.time;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ WsQuotesEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5, (i11 & 64) != 0 ? null : bigDecimal6, (i11 & 128) != 0 ? null : bigDecimal7, (i11 & 256) != 0 ? null : l11);
    }
}
