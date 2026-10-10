package com.kubi.spot.business.delegation.assets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006*"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/assets/EarnBalance;", "Landroid/os/Parcelable;", "polTotalIncome", "Ljava/math/BigDecimal;", "polTotalAmount", "totalIncome", "totalValue", "yesterdayIncome", "valuableCurrency", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getPolTotalIncome", "()Ljava/math/BigDecimal;", "getPolTotalAmount", "getTotalIncome", "getTotalValue", "getYesterdayIncome", "getValuableCurrency", "()Ljava/lang/String;", "setValuableCurrency", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EarnBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EarnBalance> CREATOR = new C24808a();

    @Nullable
    private final BigDecimal polTotalAmount;

    @Nullable
    private final BigDecimal polTotalIncome;

    @Nullable
    private final BigDecimal totalIncome;

    @Nullable
    private final BigDecimal totalValue;

    @Nullable
    private String valuableCurrency;

    @Nullable
    private final BigDecimal yesterdayIncome;

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.assets.EarnBalance$a */
    /* JADX INFO: compiled from: AssetsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24808a implements Parcelable.Creator<EarnBalance> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarnBalance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EarnBalance((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EarnBalance[] newArray(int i11) {
            return new EarnBalance[i11];
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
        if (!(other instanceof EarnBalance)) {
            return false;
        }
        EarnBalance earnBalance = (EarnBalance) other;
        return Intrinsics.areEqual(this.polTotalIncome, earnBalance.polTotalIncome) && Intrinsics.areEqual(this.polTotalAmount, earnBalance.polTotalAmount) && Intrinsics.areEqual(this.totalIncome, earnBalance.totalIncome) && Intrinsics.areEqual(this.totalValue, earnBalance.totalValue) && Intrinsics.areEqual(this.yesterdayIncome, earnBalance.yesterdayIncome) && Intrinsics.areEqual(this.valuableCurrency, earnBalance.valuableCurrency);
    }

    public static /* synthetic */ EarnBalance copy$default(EarnBalance earnBalance, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = earnBalance.polTotalIncome;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = earnBalance.polTotalAmount;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = earnBalance.totalIncome;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = earnBalance.totalValue;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = earnBalance.yesterdayIncome;
        }
        if ((i11 & 32) != 0) {
            str = earnBalance.valuableCurrency;
        }
        BigDecimal bigDecimal6 = bigDecimal5;
        String str2 = str;
        return earnBalance.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal6, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getPolTotalIncome() {
        return this.polTotalIncome;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPolTotalAmount() {
        return this.polTotalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTotalIncome() {
        return this.totalIncome;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTotalValue() {
        return this.totalValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getYesterdayIncome() {
        return this.yesterdayIncome;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    @NotNull
    public final EarnBalance copy(@Nullable BigDecimal polTotalIncome, @Nullable BigDecimal polTotalAmount, @Nullable BigDecimal totalIncome, @Nullable BigDecimal totalValue, @Nullable BigDecimal yesterdayIncome, @Nullable String valuableCurrency) {
        return new EarnBalance(polTotalIncome, polTotalAmount, totalIncome, totalValue, yesterdayIncome, valuableCurrency);
    }

    @Nullable
    public final BigDecimal getPolTotalAmount() {
        return this.polTotalAmount;
    }

    @Nullable
    public final BigDecimal getPolTotalIncome() {
        return this.polTotalIncome;
    }

    @Nullable
    public final BigDecimal getTotalIncome() {
        return this.totalIncome;
    }

    @Nullable
    public final BigDecimal getTotalValue() {
        return this.totalValue;
    }

    @Nullable
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    @Nullable
    public final BigDecimal getYesterdayIncome() {
        return this.yesterdayIncome;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.polTotalIncome;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.polTotalAmount;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalIncome;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalValue;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.yesterdayIncome;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str = this.valuableCurrency;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final void setValuableCurrency(@Nullable String str) {
        this.valuableCurrency = str;
    }

    @NotNull
    public String toString() {
        return "EarnBalance(polTotalIncome=" + this.polTotalIncome + ", polTotalAmount=" + this.polTotalAmount + ", totalIncome=" + this.totalIncome + ", totalValue=" + this.totalValue + ", yesterdayIncome=" + this.yesterdayIncome + ", valuableCurrency=" + this.valuableCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.polTotalIncome);
        dest.writeSerializable(this.polTotalAmount);
        dest.writeSerializable(this.totalIncome);
        dest.writeSerializable(this.totalValue);
        dest.writeSerializable(this.yesterdayIncome);
        dest.writeString(this.valuableCurrency);
    }

    public EarnBalance(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str) {
        this.polTotalIncome = bigDecimal;
        this.polTotalAmount = bigDecimal2;
        this.totalIncome = bigDecimal3;
        this.totalValue = bigDecimal4;
        this.yesterdayIncome = bigDecimal5;
        this.valuableCurrency = str;
    }
}
