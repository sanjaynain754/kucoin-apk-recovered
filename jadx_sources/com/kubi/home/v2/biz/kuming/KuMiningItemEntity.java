package com.kubi.home.v2.biz.kuming;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuMiningDataEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006+"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningItemEntity;", "Landroid/os/Parcelable;", "coin", "", "coinIcon", "marketPrice", "Ljava/math/BigDecimal;", "marketPriceDirection", "miningPrice", "miningProfitRate", "priceCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCoin", "()Ljava/lang/String;", "getCoinIcon", "getMarketPrice", "()Ljava/math/BigDecimal;", "getMarketPriceDirection", "getMiningPrice", "getMiningProfitRate", "getPriceCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KuMiningItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KuMiningItemEntity> CREATOR = new C14967a();

    @Nullable
    private final String coin;

    @Nullable
    private final String coinIcon;

    @Nullable
    private final BigDecimal marketPrice;

    @Nullable
    private final BigDecimal marketPriceDirection;

    @Nullable
    private final BigDecimal miningPrice;

    @Nullable
    private final BigDecimal miningProfitRate;

    @Nullable
    private final String priceCurrency;

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.kuming.KuMiningItemEntity$a */
    /* JADX INFO: compiled from: KuMiningDataEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14967a implements Parcelable.Creator<KuMiningItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KuMiningItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KuMiningItemEntity(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KuMiningItemEntity[] newArray(int i11) {
            return new KuMiningItemEntity[i11];
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
        if (!(other instanceof KuMiningItemEntity)) {
            return false;
        }
        KuMiningItemEntity kuMiningItemEntity = (KuMiningItemEntity) other;
        return Intrinsics.areEqual(this.coin, kuMiningItemEntity.coin) && Intrinsics.areEqual(this.coinIcon, kuMiningItemEntity.coinIcon) && Intrinsics.areEqual(this.marketPrice, kuMiningItemEntity.marketPrice) && Intrinsics.areEqual(this.marketPriceDirection, kuMiningItemEntity.marketPriceDirection) && Intrinsics.areEqual(this.miningPrice, kuMiningItemEntity.miningPrice) && Intrinsics.areEqual(this.miningProfitRate, kuMiningItemEntity.miningProfitRate) && Intrinsics.areEqual(this.priceCurrency, kuMiningItemEntity.priceCurrency);
    }

    public static /* synthetic */ KuMiningItemEntity copy$default(KuMiningItemEntity kuMiningItemEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kuMiningItemEntity.coin;
        }
        if ((i11 & 2) != 0) {
            str2 = kuMiningItemEntity.coinIcon;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = kuMiningItemEntity.marketPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = kuMiningItemEntity.marketPriceDirection;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = kuMiningItemEntity.miningPrice;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = kuMiningItemEntity.miningProfitRate;
        }
        if ((i11 & 64) != 0) {
            str3 = kuMiningItemEntity.priceCurrency;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        String str4 = str3;
        BigDecimal bigDecimal6 = bigDecimal3;
        BigDecimal bigDecimal7 = bigDecimal;
        return kuMiningItemEntity.copy(str, str2, bigDecimal7, bigDecimal2, bigDecimal6, bigDecimal5, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoin() {
        return this.coin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMarketPriceDirection() {
        return this.marketPriceDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMiningPrice() {
        return this.miningPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getMiningProfitRate() {
        return this.miningProfitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    @NotNull
    public final KuMiningItemEntity copy(@Nullable String coin, @Nullable String coinIcon, @Nullable BigDecimal marketPrice, @Nullable BigDecimal marketPriceDirection, @Nullable BigDecimal miningPrice, @Nullable BigDecimal miningProfitRate, @Nullable String priceCurrency) {
        return new KuMiningItemEntity(coin, coinIcon, marketPrice, marketPriceDirection, miningPrice, miningProfitRate, priceCurrency);
    }

    @Nullable
    public final String getCoin() {
        return this.coin;
    }

    @Nullable
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    @Nullable
    public final BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final BigDecimal getMarketPriceDirection() {
        return this.marketPriceDirection;
    }

    @Nullable
    public final BigDecimal getMiningPrice() {
        return this.miningPrice;
    }

    @Nullable
    public final BigDecimal getMiningProfitRate() {
        return this.miningProfitRate;
    }

    @Nullable
    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public int hashCode() {
        String str = this.coin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coinIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.marketPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.marketPriceDirection;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.miningPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.miningProfitRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str3 = this.priceCurrency;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KuMiningItemEntity(coin=" + this.coin + ", coinIcon=" + this.coinIcon + ", marketPrice=" + this.marketPrice + ", marketPriceDirection=" + this.marketPriceDirection + ", miningPrice=" + this.miningPrice + ", miningProfitRate=" + this.miningProfitRate + ", priceCurrency=" + this.priceCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.coin);
        dest.writeString(this.coinIcon);
        dest.writeSerializable(this.marketPrice);
        dest.writeSerializable(this.marketPriceDirection);
        dest.writeSerializable(this.miningPrice);
        dest.writeSerializable(this.miningProfitRate);
        dest.writeString(this.priceCurrency);
    }

    public KuMiningItemEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str3) {
        this.coin = str;
        this.coinIcon = str2;
        this.marketPrice = bigDecimal;
        this.marketPriceDirection = bigDecimal2;
        this.miningPrice = bigDecimal3;
        this.miningProfitRate = bigDecimal4;
        this.priceCurrency = str3;
    }
}
