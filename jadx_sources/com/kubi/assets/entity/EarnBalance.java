package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001b\u001a\u00020\tJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/entity/EarnBalance;", "Landroid/os/Parcelable;", "polTotalIncome", "Ljava/math/BigDecimal;", "polTotalAmount", "totalIncome", "totalValue", "yesterdayIncome", "valuableCurrency", "", "execute", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPolTotalIncome", "()Ljava/math/BigDecimal;", "getPolTotalAmount", "getTotalIncome", "getTotalValue", "getYesterdayIncome", "getValuableCurrency", "()Ljava/lang/String;", "setValuableCurrency", "(Ljava/lang/String;)V", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBalancePriceStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/EarnBalance;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EarnBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EarnBalance> CREATOR = new Creator();

    @Nullable
    private final Boolean execute;

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

    /* JADX INFO: compiled from: AssetsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EarnBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnBalance createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EarnBalance(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnBalance[] newArray(int i11) {
            return new EarnBalance[i11];
        }
    }

    public EarnBalance(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str, @Nullable Boolean bool) {
        this.polTotalIncome = bigDecimal;
        this.polTotalAmount = bigDecimal2;
        this.totalIncome = bigDecimal3;
        this.totalValue = bigDecimal4;
        this.yesterdayIncome = bigDecimal5;
        this.valuableCurrency = str;
        this.execute = bool;
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
        return Intrinsics.areEqual(this.polTotalIncome, earnBalance.polTotalIncome) && Intrinsics.areEqual(this.polTotalAmount, earnBalance.polTotalAmount) && Intrinsics.areEqual(this.totalIncome, earnBalance.totalIncome) && Intrinsics.areEqual(this.totalValue, earnBalance.totalValue) && Intrinsics.areEqual(this.yesterdayIncome, earnBalance.yesterdayIncome) && Intrinsics.areEqual(this.valuableCurrency, earnBalance.valuableCurrency) && Intrinsics.areEqual(this.execute, earnBalance.execute);
    }

    public static /* synthetic */ EarnBalance copy$default(EarnBalance earnBalance, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, Boolean bool, int i11, Object obj) {
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
        if ((i11 & 64) != 0) {
            bool = earnBalance.execute;
        }
        String str2 = str;
        Boolean bool2 = bool;
        BigDecimal bigDecimal6 = bigDecimal5;
        BigDecimal bigDecimal7 = bigDecimal3;
        return earnBalance.copy(bigDecimal, bigDecimal2, bigDecimal7, bigDecimal4, bigDecimal6, str2, bool2);
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

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final EarnBalance copy(@Nullable BigDecimal polTotalIncome, @Nullable BigDecimal polTotalAmount, @Nullable BigDecimal totalIncome, @Nullable BigDecimal totalValue, @Nullable BigDecimal yesterdayIncome, @Nullable String valuableCurrency, @Nullable Boolean execute) {
        return new EarnBalance(polTotalIncome, polTotalAmount, totalIncome, totalValue, yesterdayIncome, valuableCurrency, execute);
    }

    @NotNull
    public final String getBalancePriceStr() {
        BigDecimal bigDecimal = this.totalValue;
        return C27041f.m66669i(bigDecimal != null ? C41014a.m89950x(C41014a.m89940n(bigDecimal, this.valuableCurrency), null, null, 0, false, true, false, true, 47, null) : null, "--");
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
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
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.execute;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setValuableCurrency(@Nullable String str) {
        this.valuableCurrency = str;
    }

    @NotNull
    public String toString() {
        return "EarnBalance(polTotalIncome=" + this.polTotalIncome + ", polTotalAmount=" + this.polTotalAmount + ", totalIncome=" + this.totalIncome + ", totalValue=" + this.totalValue + ", yesterdayIncome=" + this.yesterdayIncome + ", valuableCurrency=" + this.valuableCurrency + ", execute=" + this.execute + ')';
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
        Boolean bool = this.execute;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ EarnBalance(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str, (i11 & 64) != 0 ? Boolean.TRUE : bool);
    }
}
