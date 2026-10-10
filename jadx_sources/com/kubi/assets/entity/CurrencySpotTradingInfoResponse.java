package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/entity/CurrencySpotTradingInfoResponse;", "Landroid/os/Parcelable;", "costPrice", "Ljava/math/BigDecimal;", "lastPrice", "profitLossRate", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCostPrice", "()Ljava/math/BigDecimal;", "getLastPrice", "getProfitLossRate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencySpotTradingInfoResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencySpotTradingInfoResponse> CREATOR = new Creator();

    @Nullable
    private final BigDecimal costPrice;

    @Nullable
    private final BigDecimal lastPrice;

    @Nullable
    private final BigDecimal profitLossRate;

    /* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrencySpotTradingInfoResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencySpotTradingInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencySpotTradingInfoResponse((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencySpotTradingInfoResponse[] newArray(int i11) {
            return new CurrencySpotTradingInfoResponse[i11];
        }
    }

    public CurrencySpotTradingInfoResponse() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencySpotTradingInfoResponse)) {
            return false;
        }
        CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse = (CurrencySpotTradingInfoResponse) other;
        return Intrinsics.areEqual(this.costPrice, currencySpotTradingInfoResponse.costPrice) && Intrinsics.areEqual(this.lastPrice, currencySpotTradingInfoResponse.lastPrice) && Intrinsics.areEqual(this.profitLossRate, currencySpotTradingInfoResponse.profitLossRate);
    }

    public CurrencySpotTradingInfoResponse(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.costPrice = bigDecimal;
        this.lastPrice = bigDecimal2;
        this.profitLossRate = bigDecimal3;
    }

    public static /* synthetic */ CurrencySpotTradingInfoResponse copy$default(CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = currencySpotTradingInfoResponse.costPrice;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = currencySpotTradingInfoResponse.lastPrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = currencySpotTradingInfoResponse.profitLossRate;
        }
        return currencySpotTradingInfoResponse.copy(bigDecimal, bigDecimal2, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getCostPrice() {
        return this.costPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getProfitLossRate() {
        return this.profitLossRate;
    }

    @NotNull
    public final CurrencySpotTradingInfoResponse copy(@Nullable BigDecimal costPrice, @Nullable BigDecimal lastPrice, @Nullable BigDecimal profitLossRate) {
        return new CurrencySpotTradingInfoResponse(costPrice, lastPrice, profitLossRate);
    }

    @Nullable
    public final BigDecimal getCostPrice() {
        return this.costPrice;
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final BigDecimal getProfitLossRate() {
        return this.profitLossRate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.costPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.lastPrice;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.profitLossRate;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrencySpotTradingInfoResponse(costPrice=" + this.costPrice + ", lastPrice=" + this.lastPrice + ", profitLossRate=" + this.profitLossRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.costPrice);
        dest.writeSerializable(this.lastPrice);
        dest.writeSerializable(this.profitLossRate);
    }

    public /* synthetic */ CurrencySpotTradingInfoResponse(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3);
    }
}
