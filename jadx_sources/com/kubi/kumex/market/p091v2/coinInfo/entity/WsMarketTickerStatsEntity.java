package com.kubi.kumex.market.p091v2.coinInfo.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b;\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jæ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020BHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020BR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019¨\u0006N"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/WsMarketTickerStatsEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "high", "highTime", "", "highestPrice24h", "low", "lowTime", "lowestPrice24h", FirebaseAnalytics.Param.PRICE, "priceAvg24h", "priceChange24h", "priceChange7d", "priceChangeRate1h", "priceChangeRate24h", "priceChangeRate7d", "symbol", "timestamp", "volume24h", "volumeValue24h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getHigh", "getHighTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHighestPrice24h", "getLow", "getLowTime", "getLowestPrice24h", "getPrice", "getPriceAvg24h", "getPriceChange24h", "getPriceChange7d", "getPriceChangeRate1h", "getPriceChangeRate24h", "getPriceChangeRate7d", "getSymbol", "getTimestamp", "getVolume24h", "getVolumeValue24h", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/market/v2/coinInfo/entity/WsMarketTickerStatsEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsMarketTickerStatsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsMarketTickerStatsEntity> CREATOR = new C16403a();

    @Nullable
    private final String currency;

    @Nullable
    private final String high;

    @Nullable
    private final Long highTime;

    @Nullable
    private final String highestPrice24h;

    @Nullable
    private final String low;

    @Nullable
    private final Long lowTime;

    @Nullable
    private final String lowestPrice24h;

    @Nullable
    private final String price;

    @Nullable
    private final String priceAvg24h;

    @Nullable
    private final String priceChange24h;

    @Nullable
    private final String priceChange7d;

    @Nullable
    private final String priceChangeRate1h;

    @Nullable
    private final String priceChangeRate24h;

    @Nullable
    private final String priceChangeRate7d;

    @Nullable
    private final String symbol;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final String volume24h;

    @Nullable
    private final String volumeValue24h;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.entity.WsMarketTickerStatsEntity$a */
    /* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16403a implements Parcelable.Creator<WsMarketTickerStatsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WsMarketTickerStatsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WsMarketTickerStatsEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WsMarketTickerStatsEntity[] newArray(int i11) {
            return new WsMarketTickerStatsEntity[i11];
        }
    }

    public static /* synthetic */ WsMarketTickerStatsEntity copy$default(WsMarketTickerStatsEntity wsMarketTickerStatsEntity, String str, String str2, Long l11, String str3, String str4, Long l12, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Long l13, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? wsMarketTickerStatsEntity.currency : str;
        String str19 = (i11 & 2) != 0 ? wsMarketTickerStatsEntity.high : str2;
        Long l14 = (i11 & 4) != 0 ? wsMarketTickerStatsEntity.highTime : l11;
        String str20 = (i11 & 8) != 0 ? wsMarketTickerStatsEntity.highestPrice24h : str3;
        String str21 = (i11 & 16) != 0 ? wsMarketTickerStatsEntity.low : str4;
        Long l15 = (i11 & 32) != 0 ? wsMarketTickerStatsEntity.lowTime : l12;
        String str22 = (i11 & 64) != 0 ? wsMarketTickerStatsEntity.lowestPrice24h : str5;
        String str23 = (i11 & 128) != 0 ? wsMarketTickerStatsEntity.price : str6;
        String str24 = (i11 & 256) != 0 ? wsMarketTickerStatsEntity.priceAvg24h : str7;
        String str25 = (i11 & 512) != 0 ? wsMarketTickerStatsEntity.priceChange24h : str8;
        String str26 = (i11 & 1024) != 0 ? wsMarketTickerStatsEntity.priceChange7d : str9;
        String str27 = (i11 & 2048) != 0 ? wsMarketTickerStatsEntity.priceChangeRate1h : str10;
        String str28 = (i11 & 4096) != 0 ? wsMarketTickerStatsEntity.priceChangeRate24h : str11;
        String str29 = (i11 & 8192) != 0 ? wsMarketTickerStatsEntity.priceChangeRate7d : str12;
        String str30 = str18;
        String str31 = (i11 & 16384) != 0 ? wsMarketTickerStatsEntity.symbol : str13;
        Long l16 = (i11 & 32768) != 0 ? wsMarketTickerStatsEntity.timestamp : l13;
        String str32 = (i11 & 65536) != 0 ? wsMarketTickerStatsEntity.volume24h : str14;
        if ((i11 & 131072) != 0) {
            str17 = str32;
            str16 = wsMarketTickerStatsEntity.volumeValue24h;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return wsMarketTickerStatsEntity.copy(str30, str19, l14, str20, str21, l15, str22, str23, str24, str25, str26, str27, str28, str29, str31, l16, str17, str16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsMarketTickerStatsEntity)) {
            return false;
        }
        WsMarketTickerStatsEntity wsMarketTickerStatsEntity = (WsMarketTickerStatsEntity) other;
        return Intrinsics.areEqual(this.currency, wsMarketTickerStatsEntity.currency) && Intrinsics.areEqual(this.high, wsMarketTickerStatsEntity.high) && Intrinsics.areEqual(this.highTime, wsMarketTickerStatsEntity.highTime) && Intrinsics.areEqual(this.highestPrice24h, wsMarketTickerStatsEntity.highestPrice24h) && Intrinsics.areEqual(this.low, wsMarketTickerStatsEntity.low) && Intrinsics.areEqual(this.lowTime, wsMarketTickerStatsEntity.lowTime) && Intrinsics.areEqual(this.lowestPrice24h, wsMarketTickerStatsEntity.lowestPrice24h) && Intrinsics.areEqual(this.price, wsMarketTickerStatsEntity.price) && Intrinsics.areEqual(this.priceAvg24h, wsMarketTickerStatsEntity.priceAvg24h) && Intrinsics.areEqual(this.priceChange24h, wsMarketTickerStatsEntity.priceChange24h) && Intrinsics.areEqual(this.priceChange7d, wsMarketTickerStatsEntity.priceChange7d) && Intrinsics.areEqual(this.priceChangeRate1h, wsMarketTickerStatsEntity.priceChangeRate1h) && Intrinsics.areEqual(this.priceChangeRate24h, wsMarketTickerStatsEntity.priceChangeRate24h) && Intrinsics.areEqual(this.priceChangeRate7d, wsMarketTickerStatsEntity.priceChangeRate7d) && Intrinsics.areEqual(this.symbol, wsMarketTickerStatsEntity.symbol) && Intrinsics.areEqual(this.timestamp, wsMarketTickerStatsEntity.timestamp) && Intrinsics.areEqual(this.volume24h, wsMarketTickerStatsEntity.volume24h) && Intrinsics.areEqual(this.volumeValue24h, wsMarketTickerStatsEntity.volumeValue24h);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPriceChange24h() {
        return this.priceChange24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPriceChange7d() {
        return this.priceChange7d;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPriceChangeRate1h() {
        return this.priceChangeRate1h;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPriceChangeRate24h() {
        return this.priceChangeRate24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPriceChangeRate7d() {
        return this.priceChangeRate7d;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVolume24h() {
        return this.volume24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getVolumeValue24h() {
        return this.volumeValue24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHigh() {
        return this.high;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getHighTime() {
        return this.highTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHighestPrice24h() {
        return this.highestPrice24h;
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
    public final String getLowestPrice24h() {
        return this.lowestPrice24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPriceAvg24h() {
        return this.priceAvg24h;
    }

    @NotNull
    public final WsMarketTickerStatsEntity copy(@Nullable String currency, @Nullable String high, @Nullable Long highTime, @Nullable String highestPrice24h, @Nullable String low, @Nullable Long lowTime, @Nullable String lowestPrice24h, @Nullable String price, @Nullable String priceAvg24h, @Nullable String priceChange24h, @Nullable String priceChange7d, @Nullable String priceChangeRate1h, @Nullable String priceChangeRate24h, @Nullable String priceChangeRate7d, @Nullable String symbol, @Nullable Long timestamp, @Nullable String volume24h, @Nullable String volumeValue24h) {
        return new WsMarketTickerStatsEntity(currency, high, highTime, highestPrice24h, low, lowTime, lowestPrice24h, price, priceAvg24h, priceChange24h, priceChange7d, priceChangeRate1h, priceChangeRate24h, priceChangeRate7d, symbol, timestamp, volume24h, volumeValue24h);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
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
    public final String getHighestPrice24h() {
        return this.highestPrice24h;
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
    public final String getLowestPrice24h() {
        return this.lowestPrice24h;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
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
    public final String getPriceChangeRate1h() {
        return this.priceChangeRate1h;
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
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getVolume24h() {
        return this.volume24h;
    }

    @Nullable
    public final String getVolumeValue24h() {
        return this.volumeValue24h;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.high;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.highTime;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.highestPrice24h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.low;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.lowTime;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str5 = this.lowestPrice24h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.price;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.priceAvg24h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.priceChange24h;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.priceChange7d;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.priceChangeRate1h;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.priceChangeRate24h;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.priceChangeRate7d;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.symbol;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l13 = this.timestamp;
        int iHashCode16 = (iHashCode15 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str14 = this.volume24h;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.volumeValue24h;
        return iHashCode17 + (str15 != null ? str15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsMarketTickerStatsEntity(currency=" + this.currency + ", high=" + this.high + ", highTime=" + this.highTime + ", highestPrice24h=" + this.highestPrice24h + ", low=" + this.low + ", lowTime=" + this.lowTime + ", lowestPrice24h=" + this.lowestPrice24h + ", price=" + this.price + ", priceAvg24h=" + this.priceAvg24h + ", priceChange24h=" + this.priceChange24h + ", priceChange7d=" + this.priceChange7d + ", priceChangeRate1h=" + this.priceChangeRate1h + ", priceChangeRate24h=" + this.priceChangeRate24h + ", priceChangeRate7d=" + this.priceChangeRate7d + ", symbol=" + this.symbol + ", timestamp=" + this.timestamp + ", volume24h=" + this.volume24h + ", volumeValue24h=" + this.volumeValue24h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.high);
        Long l11 = this.highTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.highestPrice24h);
        dest.writeString(this.low);
        Long l12 = this.lowTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.lowestPrice24h);
        dest.writeString(this.price);
        dest.writeString(this.priceAvg24h);
        dest.writeString(this.priceChange24h);
        dest.writeString(this.priceChange7d);
        dest.writeString(this.priceChangeRate1h);
        dest.writeString(this.priceChangeRate24h);
        dest.writeString(this.priceChangeRate7d);
        dest.writeString(this.symbol);
        Long l13 = this.timestamp;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.volume24h);
        dest.writeString(this.volumeValue24h);
    }

    public WsMarketTickerStatsEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable Long l12, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l13, @Nullable String str14, @Nullable String str15) {
        this.currency = str;
        this.high = str2;
        this.highTime = l11;
        this.highestPrice24h = str3;
        this.low = str4;
        this.lowTime = l12;
        this.lowestPrice24h = str5;
        this.price = str6;
        this.priceAvg24h = str7;
        this.priceChange24h = str8;
        this.priceChange7d = str9;
        this.priceChangeRate1h = str10;
        this.priceChangeRate24h = str11;
        this.priceChangeRate7d = str12;
        this.symbol = str13;
        this.timestamp = l13;
        this.volume24h = str14;
        this.volumeValue24h = str15;
    }
}
