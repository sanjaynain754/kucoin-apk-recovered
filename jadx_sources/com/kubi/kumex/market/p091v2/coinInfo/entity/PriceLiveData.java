package com.kubi.kumex.market.p091v2.coinInfo.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u000200J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000200HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000200R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006<"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/PriceLiveData;", "Landroid/os/Parcelable;", "close", "", "closeTime", "", "high", "highTime", "low", "lowTime", "priceAvg24h", "priceChange24h", "priceChange7d", "priceChangeRate24h", "priceChangeRate7d", "volume24h", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClose", "()Ljava/lang/String;", "getCloseTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHigh", "getHighTime", "getLow", "getLowTime", "getPriceAvg24h", "getPriceChange24h", "getPriceChange7d", "getPriceChangeRate24h", "getPriceChangeRate7d", "getVolume24h", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/market/v2/coinInfo/entity/PriceLiveData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PriceLiveData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PriceLiveData> CREATOR = new C16401a();

    @Nullable
    private final String close;

    @Nullable
    private final Long closeTime;

    @Nullable
    private final String high;

    @Nullable
    private final Long highTime;

    @Nullable
    private final String low;

    @Nullable
    private final Long lowTime;

    @Nullable
    private final String priceAvg24h;

    @Nullable
    private final String priceChange24h;

    @Nullable
    private final String priceChange7d;

    @Nullable
    private final String priceChangeRate24h;

    @Nullable
    private final String priceChangeRate7d;

    @Nullable
    private final String volume24h;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.entity.PriceLiveData$a */
    /* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16401a implements Parcelable.Creator<PriceLiveData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PriceLiveData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceLiveData(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PriceLiveData[] newArray(int i11) {
            return new PriceLiveData[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceLiveData)) {
            return false;
        }
        PriceLiveData priceLiveData = (PriceLiveData) other;
        return Intrinsics.areEqual(this.close, priceLiveData.close) && Intrinsics.areEqual(this.closeTime, priceLiveData.closeTime) && Intrinsics.areEqual(this.high, priceLiveData.high) && Intrinsics.areEqual(this.highTime, priceLiveData.highTime) && Intrinsics.areEqual(this.low, priceLiveData.low) && Intrinsics.areEqual(this.lowTime, priceLiveData.lowTime) && Intrinsics.areEqual(this.priceAvg24h, priceLiveData.priceAvg24h) && Intrinsics.areEqual(this.priceChange24h, priceLiveData.priceChange24h) && Intrinsics.areEqual(this.priceChange7d, priceLiveData.priceChange7d) && Intrinsics.areEqual(this.priceChangeRate24h, priceLiveData.priceChangeRate24h) && Intrinsics.areEqual(this.priceChangeRate7d, priceLiveData.priceChangeRate7d) && Intrinsics.areEqual(this.volume24h, priceLiveData.volume24h);
    }

    public static /* synthetic */ PriceLiveData copy$default(PriceLiveData priceLiveData, String str, Long l11, String str2, Long l12, String str3, Long l13, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = priceLiveData.close;
        }
        if ((i11 & 2) != 0) {
            l11 = priceLiveData.closeTime;
        }
        if ((i11 & 4) != 0) {
            str2 = priceLiveData.high;
        }
        if ((i11 & 8) != 0) {
            l12 = priceLiveData.highTime;
        }
        if ((i11 & 16) != 0) {
            str3 = priceLiveData.low;
        }
        if ((i11 & 32) != 0) {
            l13 = priceLiveData.lowTime;
        }
        if ((i11 & 64) != 0) {
            str4 = priceLiveData.priceAvg24h;
        }
        if ((i11 & 128) != 0) {
            str5 = priceLiveData.priceChange24h;
        }
        if ((i11 & 256) != 0) {
            str6 = priceLiveData.priceChange7d;
        }
        if ((i11 & 512) != 0) {
            str7 = priceLiveData.priceChangeRate24h;
        }
        if ((i11 & 1024) != 0) {
            str8 = priceLiveData.priceChangeRate7d;
        }
        if ((i11 & 2048) != 0) {
            str9 = priceLiveData.volume24h;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        String str16 = str3;
        Long l14 = l13;
        return priceLiveData.copy(str, l11, str2, l12, str16, l14, str14, str15, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClose() {
        return this.close;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPriceChangeRate24h() {
        return this.priceChangeRate24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPriceChangeRate7d() {
        return this.priceChangeRate7d;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getVolume24h() {
        return this.volume24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCloseTime() {
        return this.closeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHigh() {
        return this.high;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getHighTime() {
        return this.highTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLow() {
        return this.low;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getLowTime() {
        return this.lowTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPriceAvg24h() {
        return this.priceAvg24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPriceChange24h() {
        return this.priceChange24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPriceChange7d() {
        return this.priceChange7d;
    }

    @NotNull
    public final PriceLiveData copy(@Nullable String close, @Nullable Long closeTime, @Nullable String high, @Nullable Long highTime, @Nullable String low, @Nullable Long lowTime, @Nullable String priceAvg24h, @Nullable String priceChange24h, @Nullable String priceChange7d, @Nullable String priceChangeRate24h, @Nullable String priceChangeRate7d, @Nullable String volume24h) {
        return new PriceLiveData(close, closeTime, high, highTime, low, lowTime, priceAvg24h, priceChange24h, priceChange7d, priceChangeRate24h, priceChangeRate7d, volume24h);
    }

    @Nullable
    public final String getClose() {
        return this.close;
    }

    @Nullable
    public final Long getCloseTime() {
        return this.closeTime;
    }

    @Nullable
    public final String getHigh() {
        return this.high;
    }

    @Nullable
    public final Long getHighTime() {
        return this.highTime;
    }

    @Nullable
    public final String getLow() {
        return this.low;
    }

    @Nullable
    public final Long getLowTime() {
        return this.lowTime;
    }

    @Nullable
    public final String getPriceAvg24h() {
        return this.priceAvg24h;
    }

    @Nullable
    public final String getPriceChange24h() {
        return this.priceChange24h;
    }

    @Nullable
    public final String getPriceChange7d() {
        return this.priceChange7d;
    }

    @Nullable
    public final String getPriceChangeRate24h() {
        return this.priceChangeRate24h;
    }

    @Nullable
    public final String getPriceChangeRate7d() {
        return this.priceChangeRate7d;
    }

    @Nullable
    public final String getVolume24h() {
        return this.volume24h;
    }

    public int hashCode() {
        String str = this.close;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.closeTime;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.high;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.highTime;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.low;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l13 = this.lowTime;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.priceAvg24h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceChange24h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.priceChange7d;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.priceChangeRate24h;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.priceChangeRate7d;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.volume24h;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceLiveData(close=" + this.close + ", closeTime=" + this.closeTime + ", high=" + this.high + ", highTime=" + this.highTime + ", low=" + this.low + ", lowTime=" + this.lowTime + ", priceAvg24h=" + this.priceAvg24h + ", priceChange24h=" + this.priceChange24h + ", priceChange7d=" + this.priceChange7d + ", priceChangeRate24h=" + this.priceChangeRate24h + ", priceChangeRate7d=" + this.priceChangeRate7d + ", volume24h=" + this.volume24h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.close);
        Long l11 = this.closeTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.high);
        Long l12 = this.highTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.low);
        Long l13 = this.lowTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.priceAvg24h);
        dest.writeString(this.priceChange24h);
        dest.writeString(this.priceChange7d);
        dest.writeString(this.priceChangeRate24h);
        dest.writeString(this.priceChangeRate7d);
        dest.writeString(this.volume24h);
    }

    public PriceLiveData(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable Long l12, @Nullable String str3, @Nullable Long l13, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.close = str;
        this.closeTime = l11;
        this.high = str2;
        this.highTime = l12;
        this.low = str3;
        this.lowTime = l13;
        this.priceAvg24h = str4;
        this.priceChange24h = str5;
        this.priceChange7d = str6;
        this.priceChangeRate24h = str7;
        this.priceChangeRate7d = str8;
        this.volume24h = str9;
    }
}
