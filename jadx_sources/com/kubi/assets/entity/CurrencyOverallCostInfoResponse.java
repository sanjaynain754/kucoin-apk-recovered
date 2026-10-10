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
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/entity/CurrencyOverallCostInfoResponse;", "Landroid/os/Parcelable;", "costUsdt", "Ljava/math/BigDecimal;", "lastPrice", "profitLossRate", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCostUsdt", "()Ljava/math/BigDecimal;", "getLastPrice", "getProfitLossRate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyOverallCostInfoResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyOverallCostInfoResponse> CREATOR = new Creator();

    @Nullable
    private final BigDecimal costUsdt;

    @Nullable
    private final BigDecimal lastPrice;

    @Nullable
    private final BigDecimal profitLossRate;

    /* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrencyOverallCostInfoResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyOverallCostInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyOverallCostInfoResponse((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyOverallCostInfoResponse[] newArray(int i11) {
            return new CurrencyOverallCostInfoResponse[i11];
        }
    }

    public CurrencyOverallCostInfoResponse() {
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
        if (!(other instanceof CurrencyOverallCostInfoResponse)) {
            return false;
        }
        CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse = (CurrencyOverallCostInfoResponse) other;
        return Intrinsics.areEqual(this.costUsdt, currencyOverallCostInfoResponse.costUsdt) && Intrinsics.areEqual(this.lastPrice, currencyOverallCostInfoResponse.lastPrice) && Intrinsics.areEqual(this.profitLossRate, currencyOverallCostInfoResponse.profitLossRate);
    }

    public CurrencyOverallCostInfoResponse(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.costUsdt = bigDecimal;
        this.lastPrice = bigDecimal2;
        this.profitLossRate = bigDecimal3;
    }

    public static /* synthetic */ CurrencyOverallCostInfoResponse copy$default(CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = currencyOverallCostInfoResponse.costUsdt;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = currencyOverallCostInfoResponse.lastPrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = currencyOverallCostInfoResponse.profitLossRate;
        }
        return currencyOverallCostInfoResponse.copy(bigDecimal, bigDecimal2, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getCostUsdt() {
        return this.costUsdt;
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
    public final CurrencyOverallCostInfoResponse copy(@Nullable BigDecimal costUsdt, @Nullable BigDecimal lastPrice, @Nullable BigDecimal profitLossRate) {
        return new CurrencyOverallCostInfoResponse(costUsdt, lastPrice, profitLossRate);
    }

    @Nullable
    public final BigDecimal getCostUsdt() {
        return this.costUsdt;
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
        BigDecimal bigDecimal = this.costUsdt;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.lastPrice;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.profitLossRate;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrencyOverallCostInfoResponse(costUsdt=" + this.costUsdt + ", lastPrice=" + this.lastPrice + ", profitLossRate=" + this.profitLossRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.costUsdt);
        dest.writeSerializable(this.lastPrice);
        dest.writeSerializable(this.profitLossRate);
    }

    public /* synthetic */ CurrencyOverallCostInfoResponse(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3);
    }
}
