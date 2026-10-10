package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankFuturesEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"Jx\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u0003J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006<"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RankFuturesEntity;", "Landroid/os/Parcelable;", "order", "", "crypto", "", "quoteCrypto", "lastPrice", "Ljava/math/BigDecimal;", "last24HourRate", "symbol", "last24HourTradingVolume", "inverseSymbol", "", "openingTime", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;)V", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCrypto", "()Ljava/lang/String;", "getQuoteCrypto", "getLastPrice", "()Ljava/math/BigDecimal;", "getLast24HourRate", "getSymbol", "getLast24HourTradingVolume", "setLast24HourTradingVolume", "(Ljava/math/BigDecimal;)V", "getInverseSymbol", "()Z", "getOpeningTime", "()Ljava/lang/Long;", "setOpeningTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;)Lcom/kubi/quotefacade/entity/RankFuturesEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankFuturesEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RankFuturesEntity> CREATOR = new C21906a();

    @Nullable
    private final String crypto;
    private final boolean inverseSymbol;

    @Nullable
    private final BigDecimal last24HourRate;

    @Nullable
    private BigDecimal last24HourTradingVolume;

    @Nullable
    private final BigDecimal lastPrice;

    @Nullable
    private Long openingTime;

    @Nullable
    private final Integer order;

    @Nullable
    private final String quoteCrypto;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.RankFuturesEntity$a */
    /* JADX INFO: compiled from: RankFuturesEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21906a implements Parcelable.Creator<RankFuturesEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankFuturesEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RankFuturesEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RankFuturesEntity[] newArray(int i11) {
            return new RankFuturesEntity[i11];
        }
    }

    public RankFuturesEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str3, @Nullable BigDecimal bigDecimal3, boolean z11, @Nullable Long l11) {
        this.order = num;
        this.crypto = str;
        this.quoteCrypto = str2;
        this.lastPrice = bigDecimal;
        this.last24HourRate = bigDecimal2;
        this.symbol = str3;
        this.last24HourTradingVolume = bigDecimal3;
        this.inverseSymbol = z11;
        this.openingTime = l11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankFuturesEntity)) {
            return false;
        }
        RankFuturesEntity rankFuturesEntity = (RankFuturesEntity) other;
        return Intrinsics.areEqual(this.order, rankFuturesEntity.order) && Intrinsics.areEqual(this.crypto, rankFuturesEntity.crypto) && Intrinsics.areEqual(this.quoteCrypto, rankFuturesEntity.quoteCrypto) && Intrinsics.areEqual(this.lastPrice, rankFuturesEntity.lastPrice) && Intrinsics.areEqual(this.last24HourRate, rankFuturesEntity.last24HourRate) && Intrinsics.areEqual(this.symbol, rankFuturesEntity.symbol) && Intrinsics.areEqual(this.last24HourTradingVolume, rankFuturesEntity.last24HourTradingVolume) && this.inverseSymbol == rankFuturesEntity.inverseSymbol && Intrinsics.areEqual(this.openingTime, rankFuturesEntity.openingTime);
    }

    public static /* synthetic */ RankFuturesEntity copy$default(RankFuturesEntity rankFuturesEntity, Integer num, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, boolean z11, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = rankFuturesEntity.order;
        }
        if ((i11 & 2) != 0) {
            str = rankFuturesEntity.crypto;
        }
        if ((i11 & 4) != 0) {
            str2 = rankFuturesEntity.quoteCrypto;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = rankFuturesEntity.lastPrice;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = rankFuturesEntity.last24HourRate;
        }
        if ((i11 & 32) != 0) {
            str3 = rankFuturesEntity.symbol;
        }
        if ((i11 & 64) != 0) {
            bigDecimal3 = rankFuturesEntity.last24HourTradingVolume;
        }
        if ((i11 & 128) != 0) {
            z11 = rankFuturesEntity.inverseSymbol;
        }
        if ((i11 & 256) != 0) {
            l11 = rankFuturesEntity.openingTime;
        }
        boolean z12 = z11;
        Long l12 = l11;
        String str4 = str3;
        BigDecimal bigDecimal4 = bigDecimal3;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str5 = str2;
        return rankFuturesEntity.copy(num, str, str5, bigDecimal, bigDecimal5, str4, bigDecimal4, z12, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCrypto() {
        return this.crypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLast24HourRate() {
        return this.last24HourRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLast24HourTradingVolume() {
        return this.last24HourTradingVolume;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getInverseSymbol() {
        return this.inverseSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @NotNull
    public final RankFuturesEntity copy(@Nullable Integer order, @Nullable String crypto, @Nullable String quoteCrypto, @Nullable BigDecimal lastPrice, @Nullable BigDecimal last24HourRate, @Nullable String symbol, @Nullable BigDecimal last24HourTradingVolume, boolean inverseSymbol, @Nullable Long openingTime) {
        return new RankFuturesEntity(order, crypto, quoteCrypto, lastPrice, last24HourRate, symbol, last24HourTradingVolume, inverseSymbol, openingTime);
    }

    @Nullable
    public final String getCrypto() {
        return this.crypto;
    }

    public final boolean getInverseSymbol() {
        return this.inverseSymbol;
    }

    @Nullable
    public final BigDecimal getLast24HourRate() {
        return this.last24HourRate;
    }

    @Nullable
    public final BigDecimal getLast24HourTradingVolume() {
        return this.last24HourTradingVolume;
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        Integer num = this.order;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.crypto;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.quoteCrypto;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.lastPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.last24HourRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.last24HourTradingVolume;
        int iHashCode7 = (((iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + Boolean.hashCode(this.inverseSymbol)) * 31;
        Long l11 = this.openingTime;
        return iHashCode7 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setLast24HourTradingVolume(@Nullable BigDecimal bigDecimal) {
        this.last24HourTradingVolume = bigDecimal;
    }

    public final void setOpeningTime(@Nullable Long l11) {
        this.openingTime = l11;
    }

    @NotNull
    public String toString() {
        return "RankFuturesEntity(order=" + this.order + ", crypto=" + this.crypto + ", quoteCrypto=" + this.quoteCrypto + ", lastPrice=" + this.lastPrice + ", last24HourRate=" + this.last24HourRate + ", symbol=" + this.symbol + ", last24HourTradingVolume=" + this.last24HourTradingVolume + ", inverseSymbol=" + this.inverseSymbol + ", openingTime=" + this.openingTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.order;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.crypto);
        dest.writeString(this.quoteCrypto);
        dest.writeSerializable(this.lastPrice);
        dest.writeSerializable(this.last24HourRate);
        dest.writeString(this.symbol);
        dest.writeSerializable(this.last24HourTradingVolume);
        dest.writeInt(this.inverseSymbol ? 1 : 0);
        Long l11 = this.openingTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ RankFuturesEntity(Integer num, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, boolean z11, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, bigDecimal, bigDecimal2, str3, bigDecimal3, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? 0L : l11);
    }
}
