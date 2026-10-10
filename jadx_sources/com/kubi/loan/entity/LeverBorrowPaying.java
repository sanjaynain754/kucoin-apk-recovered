package com.kubi.loan.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.loan.repo.platform.IPlatformService;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p406ko.C41086j;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoanBean.kt */
/* JADX INFO: loaded from: classes26.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u0004\u0018\u00010\u0005J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000205HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u0006@"}, m90084d2 = {"Lcom/kubi/loan/entity/LeverBorrowPaying;", "Landroid/os/Parcelable;", "createdAt", "", "loanId", "", FirebaseAnalytics.Param.CURRENCY, "interestBalance", "Ljava/math/BigDecimal;", "period", "principalTotal", "rate", "repaySize", "maturityTime", "liabilityBalance", "liability", "", "symbol", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoanId", "()Ljava/lang/String;", "getCurrency", "getInterestBalance", "()Ljava/math/BigDecimal;", "getPeriod", "getPrincipalTotal", "getRate", "getRepaySize", "getMaturityTime", "getLiabilityBalance", "getLiability", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/loan/entity/LeverBorrowPaying;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverBorrowPaying implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverBorrowPaying> CREATOR = new C17434a();

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal interestBalance;

    @Nullable
    private final Boolean liability;

    @Nullable
    private final BigDecimal liabilityBalance;

    @Nullable
    private final String loanId;

    @Nullable
    private final Long maturityTime;

    @Nullable
    private final String period;

    @Nullable
    private final BigDecimal principalTotal;

    @Nullable
    private final BigDecimal rate;

    @Nullable
    private final BigDecimal repaySize;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.loan.entity.LeverBorrowPaying$a */
    /* JADX INFO: compiled from: LoanBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17434a implements Parcelable.Creator<LeverBorrowPaying> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverBorrowPaying createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string3 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LeverBorrowPaying(lValueOf, string, string2, bigDecimal, string3, bigDecimal2, bigDecimal3, bigDecimal4, lValueOf2, bigDecimal5, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverBorrowPaying[] newArray(int i11) {
            return new LeverBorrowPaying[i11];
        }
    }

    public static /* synthetic */ LeverBorrowPaying copy$default(LeverBorrowPaying leverBorrowPaying, Long l11, String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l12, BigDecimal bigDecimal5, Boolean bool, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = leverBorrowPaying.createdAt;
        }
        if ((i11 & 2) != 0) {
            str = leverBorrowPaying.loanId;
        }
        if ((i11 & 4) != 0) {
            str2 = leverBorrowPaying.currency;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = leverBorrowPaying.interestBalance;
        }
        if ((i11 & 16) != 0) {
            str3 = leverBorrowPaying.period;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = leverBorrowPaying.principalTotal;
        }
        if ((i11 & 64) != 0) {
            bigDecimal3 = leverBorrowPaying.rate;
        }
        if ((i11 & 128) != 0) {
            bigDecimal4 = leverBorrowPaying.repaySize;
        }
        if ((i11 & 256) != 0) {
            l12 = leverBorrowPaying.maturityTime;
        }
        if ((i11 & 512) != 0) {
            bigDecimal5 = leverBorrowPaying.liabilityBalance;
        }
        if ((i11 & 1024) != 0) {
            bool = leverBorrowPaying.liability;
        }
        if ((i11 & 2048) != 0) {
            str4 = leverBorrowPaying.symbol;
        }
        Boolean bool2 = bool;
        String str5 = str4;
        Long l13 = l12;
        BigDecimal bigDecimal6 = bigDecimal5;
        BigDecimal bigDecimal7 = bigDecimal3;
        BigDecimal bigDecimal8 = bigDecimal4;
        String str6 = str3;
        BigDecimal bigDecimal9 = bigDecimal2;
        return leverBorrowPaying.copy(l11, str, str2, bigDecimal, str6, bigDecimal9, bigDecimal7, bigDecimal8, l13, bigDecimal6, bool2, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverBorrowPaying)) {
            return false;
        }
        LeverBorrowPaying leverBorrowPaying = (LeverBorrowPaying) other;
        return Intrinsics.areEqual(this.createdAt, leverBorrowPaying.createdAt) && Intrinsics.areEqual(this.loanId, leverBorrowPaying.loanId) && Intrinsics.areEqual(this.currency, leverBorrowPaying.currency) && Intrinsics.areEqual(this.interestBalance, leverBorrowPaying.interestBalance) && Intrinsics.areEqual(this.period, leverBorrowPaying.period) && Intrinsics.areEqual(this.principalTotal, leverBorrowPaying.principalTotal) && Intrinsics.areEqual(this.rate, leverBorrowPaying.rate) && Intrinsics.areEqual(this.repaySize, leverBorrowPaying.repaySize) && Intrinsics.areEqual(this.maturityTime, leverBorrowPaying.maturityTime) && Intrinsics.areEqual(this.liabilityBalance, leverBorrowPaying.liabilityBalance) && Intrinsics.areEqual(this.liability, leverBorrowPaying.liability) && Intrinsics.areEqual(this.symbol, leverBorrowPaying.symbol);
    }

    @Nullable
    /* JADX INFO: renamed from: getLiabilityBalance, reason: collision with other method in class */
    public final BigDecimal m103795getLiabilityBalance() {
        return this.liabilityBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getLiabilityBalance() {
        return this.liabilityBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLoanId() {
        return this.loanId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getInterestBalance() {
        return this.interestBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getPrincipalTotal() {
        return this.principalTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getRepaySize() {
        return this.repaySize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getMaturityTime() {
        return this.maturityTime;
    }

    @NotNull
    public final LeverBorrowPaying copy(@Nullable Long createdAt, @Nullable String loanId, @Nullable String currency, @Nullable BigDecimal interestBalance, @Nullable String period, @Nullable BigDecimal principalTotal, @Nullable BigDecimal rate, @Nullable BigDecimal repaySize, @Nullable Long maturityTime, @Nullable BigDecimal liabilityBalance, @Nullable Boolean liability, @Nullable String symbol) {
        return new LeverBorrowPaying(createdAt, loanId, currency, interestBalance, period, principalTotal, rate, repaySize, maturityTime, liabilityBalance, liability, symbol);
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getInterestBalance() {
        return this.interestBalance;
    }

    @Nullable
    public final Boolean getLiability() {
        return this.liability;
    }

    @Nullable
    public final String getLiabilityBalance() {
        BigDecimal bigDecimal = this.liabilityBalance;
        if (bigDecimal == null) {
            return null;
        }
        LeverCoinConfig leverCoinConfigM37796b = IPlatformService.m37796b((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class), C27041f.m66668h(this.currency), false, 2, null);
        return C42180b.m92640e(bigDecimal, null, leverCoinConfigM37796b != null ? leverCoinConfigM37796b.getPrecision() : 8, false, false, false, 0, null, 125, null);
    }

    @Nullable
    public final String getLoanId() {
        return this.loanId;
    }

    @Nullable
    public final Long getMaturityTime() {
        return this.maturityTime;
    }

    @Nullable
    public final String getPeriod() {
        return this.period;
    }

    @Nullable
    public final BigDecimal getPrincipalTotal() {
        return this.principalTotal;
    }

    @Nullable
    public final BigDecimal getRate() {
        return this.rate;
    }

    @Nullable
    public final BigDecimal getRepaySize() {
        return this.repaySize;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        Long l11 = this.createdAt;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.loanId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.interestBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.period;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.principalTotal;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.rate;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.repaySize;
        int iHashCode8 = (iHashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Long l12 = this.maturityTime;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.liabilityBalance;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Boolean bool = this.liability;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.symbol;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeverBorrowPaying(createdAt=" + this.createdAt + ", loanId=" + this.loanId + ", currency=" + this.currency + ", interestBalance=" + this.interestBalance + ", period=" + this.period + ", principalTotal=" + this.principalTotal + ", rate=" + this.rate + ", repaySize=" + this.repaySize + ", maturityTime=" + this.maturityTime + ", liabilityBalance=" + this.liabilityBalance + ", liability=" + this.liability + ", symbol=" + this.symbol + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.loanId);
        dest.writeString(this.currency);
        dest.writeSerializable(this.interestBalance);
        dest.writeString(this.period);
        dest.writeSerializable(this.principalTotal);
        dest.writeSerializable(this.rate);
        dest.writeSerializable(this.repaySize);
        Long l12 = this.maturityTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeSerializable(this.liabilityBalance);
        Boolean bool = this.liability;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.symbol);
    }

    public LeverBorrowPaying(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Long l12, @Nullable BigDecimal bigDecimal5, @Nullable Boolean bool, @Nullable String str4) {
        this.createdAt = l11;
        this.loanId = str;
        this.currency = str2;
        this.interestBalance = bigDecimal;
        this.period = str3;
        this.principalTotal = bigDecimal2;
        this.rate = bigDecimal3;
        this.repaySize = bigDecimal4;
        this.maturityTime = l12;
        this.liabilityBalance = bigDecimal5;
        this.liability = bool;
        this.symbol = str4;
    }
}
