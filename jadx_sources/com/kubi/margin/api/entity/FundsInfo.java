package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import gf.C37886j;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FundsInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\u0006\u0010$\u001a\u00020\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003Ju\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010/\u001a\u000200J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000200HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000200R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006<"}, m90084d2 = {"Lcom/kubi/margin/api/entity/FundsInfo;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "currencyFullName", "availableBalance", "Ljava/math/BigDecimal;", "holdBalance", "liability", "maxOutSize", "totalBalance", "totalBalanceBtc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "()V", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "getCurrencyFullName", "getAvailableBalance", "()Ljava/math/BigDecimal;", "getHoldBalance", "getLiability", "getMaxOutSize", "getTotalBalance", "getTotalBalanceBtc", "getNetBalanceStr", "getAvailableBalanceStr", "getAvailableBalancePriceStr", "getHoldBalanceStr", "getHoldBalancePriceStr", "getTotalBalanceStr", "getTotalBalancePriceStr", "getLiabilityStr", "getLiabilityPriceStr", "getMaxOutSizeStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FundsInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FundsInfo> CREATOR = new C17480a();

    @Nullable
    private final BigDecimal availableBalance;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyFullName;

    @Nullable
    private final String currencyName;

    @Nullable
    private final BigDecimal holdBalance;

    @Nullable
    private final BigDecimal liability;

    @Nullable
    private final BigDecimal maxOutSize;

    @Nullable
    private final BigDecimal totalBalance;

    @Nullable
    private final BigDecimal totalBalanceBtc;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.FundsInfo$a */
    /* JADX INFO: compiled from: FundsInfo.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17480a implements Parcelable.Creator<FundsInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FundsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FundsInfo(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FundsInfo[] newArray(int i11) {
            return new FundsInfo[i11];
        }
    }

    public FundsInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6) {
        this.currency = str;
        this.currencyName = str2;
        this.currencyFullName = str3;
        this.availableBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.liability = bigDecimal3;
        this.maxOutSize = bigDecimal4;
        this.totalBalance = bigDecimal5;
        this.totalBalanceBtc = bigDecimal6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundsInfo)) {
            return false;
        }
        FundsInfo fundsInfo = (FundsInfo) other;
        return Intrinsics.areEqual(this.currency, fundsInfo.currency) && Intrinsics.areEqual(this.currencyName, fundsInfo.currencyName) && Intrinsics.areEqual(this.currencyFullName, fundsInfo.currencyFullName) && Intrinsics.areEqual(this.availableBalance, fundsInfo.availableBalance) && Intrinsics.areEqual(this.holdBalance, fundsInfo.holdBalance) && Intrinsics.areEqual(this.liability, fundsInfo.liability) && Intrinsics.areEqual(this.maxOutSize, fundsInfo.maxOutSize) && Intrinsics.areEqual(this.totalBalance, fundsInfo.totalBalance) && Intrinsics.areEqual(this.totalBalanceBtc, fundsInfo.totalBalanceBtc);
    }

    public static /* synthetic */ FundsInfo copy$default(FundsInfo fundsInfo, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fundsInfo.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = fundsInfo.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = fundsInfo.currencyFullName;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = fundsInfo.availableBalance;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = fundsInfo.holdBalance;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = fundsInfo.liability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = fundsInfo.maxOutSize;
        }
        if ((i11 & 128) != 0) {
            bigDecimal5 = fundsInfo.totalBalance;
        }
        if ((i11 & 256) != 0) {
            bigDecimal6 = fundsInfo.totalBalanceBtc;
        }
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal3;
        BigDecimal bigDecimal10 = bigDecimal4;
        BigDecimal bigDecimal11 = bigDecimal2;
        String str4 = str3;
        return fundsInfo.copy(str, str2, str4, bigDecimal, bigDecimal11, bigDecimal9, bigDecimal10, bigDecimal7, bigDecimal8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getMaxOutSize() {
        return this.maxOutSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTotalBalanceBtc() {
        return this.totalBalanceBtc;
    }

    @NotNull
    public final FundsInfo copy(@Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable BigDecimal availableBalance, @Nullable BigDecimal holdBalance, @Nullable BigDecimal liability, @Nullable BigDecimal maxOutSize, @Nullable BigDecimal totalBalance, @Nullable BigDecimal totalBalanceBtc) {
        return new FundsInfo(currency, currencyName, currencyFullName, availableBalance, holdBalance, liability, maxOutSize, totalBalance, totalBalanceBtc);
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    public final String getAvailableBalancePriceStr() {
        BigDecimal bigDecimal = this.availableBalance;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getAvailableBalanceStr() {
        BigDecimal bigDecimal = this.availableBalance;
        return C27041f.m66668h(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @NotNull
    public final String getHoldBalancePriceStr() {
        BigDecimal bigDecimal = this.holdBalance;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getHoldBalanceStr() {
        BigDecimal bigDecimal = this.holdBalance;
        return C27041f.m66668h(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null);
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @NotNull
    public final String getLiabilityPriceStr() {
        BigDecimal bigDecimal = this.liability;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getLiabilityStr() {
        BigDecimal bigDecimal = this.liability;
        return C27041f.m66668h(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null);
    }

    @Nullable
    public final BigDecimal getMaxOutSize() {
        return this.maxOutSize;
    }

    @NotNull
    public final String getMaxOutSizeStr() {
        BigDecimal bigDecimal = this.maxOutSize;
        return C27041f.m66668h(bigDecimal != null ? C37886j.m85578b(bigDecimal, this.currency, null, false, false, false, 2, null, 0, 222, null) : null);
    }

    @Nullable
    public final String getNetBalanceStr() {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal = this.totalBalance;
        if (bigDecimal == null || (bigDecimalSubtract = bigDecimal.subtract(C41014a.m89922G(this.liability, null, 1, null))) == null) {
            return null;
        }
        return C37885i.m85563b(bigDecimalSubtract, this.currency, 0, 2, null);
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTotalBalanceBtc() {
        return this.totalBalanceBtc;
    }

    @NotNull
    public final String getTotalBalancePriceStr() {
        BigDecimal bigDecimal = this.totalBalance;
        return C41014a.m89950x(C41014a.m89939m(C27039d.m66646f(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null), this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getTotalBalanceStr() {
        BigDecimal bigDecimal = this.totalBalance;
        return C27041f.m66668h(bigDecimal != null ? C37885i.m85563b(bigDecimal, this.currency, 0, 2, null) : null);
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyFullName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.availableBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.liability;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.maxOutSize;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalBalance;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalBalanceBtc;
        return iHashCode8 + (bigDecimal6 != null ? bigDecimal6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FundsInfo(currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", availableBalance=" + this.availableBalance + ", holdBalance=" + this.holdBalance + ", liability=" + this.liability + ", maxOutSize=" + this.maxOutSize + ", totalBalance=" + this.totalBalance + ", totalBalanceBtc=" + this.totalBalanceBtc + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeString(this.currencyFullName);
        dest.writeSerializable(this.availableBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.liability);
        dest.writeSerializable(this.maxOutSize);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.totalBalanceBtc);
    }

    public FundsInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
