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
import p402kf.C41014a;
import p406ko.C41086j;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoanBean.kt */
/* JADX INFO: loaded from: classes26.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010#\u001a\u0004\u0018\u00010\u0003J\b\u0010$\u001a\u0004\u0018\u00010\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009e\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00102J\u0006\u00103\u001a\u000204J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000204HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000204R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017¨\u0006@"}, m90084d2 = {"Lcom/kubi/loan/entity/LeverBorrowPayed;", "Landroid/os/Parcelable;", "loanId", "", FirebaseAnalytics.Param.CURRENCY, "interestTotal", "Ljava/math/BigDecimal;", "period", "principalTotal", "rate", "repaySize", "repayTime", "", "symbol", "maturityTime", "repayFinishAt", "interestBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;)V", "getLoanId", "()Ljava/lang/String;", "getCurrency", "getInterestTotal", "()Ljava/math/BigDecimal;", "getPeriod", "getPrincipalTotal", "getRate", "getRepaySize", "getRepayTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSymbol", "getMaturityTime", "getRepayFinishAt", "getInterestBalance", "getPrincipalInterest", "getPrincipalInterestIsolate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;)Lcom/kubi/loan/entity/LeverBorrowPayed;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverBorrowPayed implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverBorrowPayed> CREATOR = new C17433a();

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal interestBalance;

    @Nullable
    private final BigDecimal interestTotal;

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
    private final Long repayFinishAt;

    @Nullable
    private final BigDecimal repaySize;

    @Nullable
    private final Long repayTime;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.loan.entity.LeverBorrowPayed$a */
    /* JADX INFO: compiled from: LoanBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17433a implements Parcelable.Creator<LeverBorrowPayed> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverBorrowPayed createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LeverBorrowPayed(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverBorrowPayed[] newArray(int i11) {
            return new LeverBorrowPayed[i11];
        }
    }

    public static /* synthetic */ LeverBorrowPayed copy$default(LeverBorrowPayed leverBorrowPayed, String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l11, String str4, Long l12, Long l13, BigDecimal bigDecimal5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leverBorrowPayed.loanId;
        }
        if ((i11 & 2) != 0) {
            str2 = leverBorrowPayed.currency;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = leverBorrowPayed.interestTotal;
        }
        if ((i11 & 8) != 0) {
            str3 = leverBorrowPayed.period;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = leverBorrowPayed.principalTotal;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = leverBorrowPayed.rate;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = leverBorrowPayed.repaySize;
        }
        if ((i11 & 128) != 0) {
            l11 = leverBorrowPayed.repayTime;
        }
        if ((i11 & 256) != 0) {
            str4 = leverBorrowPayed.symbol;
        }
        if ((i11 & 512) != 0) {
            l12 = leverBorrowPayed.maturityTime;
        }
        if ((i11 & 1024) != 0) {
            l13 = leverBorrowPayed.repayFinishAt;
        }
        if ((i11 & 2048) != 0) {
            bigDecimal5 = leverBorrowPayed.interestBalance;
        }
        Long l14 = l13;
        BigDecimal bigDecimal6 = bigDecimal5;
        String str5 = str4;
        Long l15 = l12;
        BigDecimal bigDecimal7 = bigDecimal4;
        Long l16 = l11;
        BigDecimal bigDecimal8 = bigDecimal2;
        BigDecimal bigDecimal9 = bigDecimal3;
        return leverBorrowPayed.copy(str, str2, bigDecimal, str3, bigDecimal8, bigDecimal9, bigDecimal7, l16, str5, l15, l14, bigDecimal6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverBorrowPayed)) {
            return false;
        }
        LeverBorrowPayed leverBorrowPayed = (LeverBorrowPayed) other;
        return Intrinsics.areEqual(this.loanId, leverBorrowPayed.loanId) && Intrinsics.areEqual(this.currency, leverBorrowPayed.currency) && Intrinsics.areEqual(this.interestTotal, leverBorrowPayed.interestTotal) && Intrinsics.areEqual(this.period, leverBorrowPayed.period) && Intrinsics.areEqual(this.principalTotal, leverBorrowPayed.principalTotal) && Intrinsics.areEqual(this.rate, leverBorrowPayed.rate) && Intrinsics.areEqual(this.repaySize, leverBorrowPayed.repaySize) && Intrinsics.areEqual(this.repayTime, leverBorrowPayed.repayTime) && Intrinsics.areEqual(this.symbol, leverBorrowPayed.symbol) && Intrinsics.areEqual(this.maturityTime, leverBorrowPayed.maturityTime) && Intrinsics.areEqual(this.repayFinishAt, leverBorrowPayed.repayFinishAt) && Intrinsics.areEqual(this.interestBalance, leverBorrowPayed.interestBalance);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLoanId() {
        return this.loanId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getMaturityTime() {
        return this.maturityTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getRepayFinishAt() {
        return this.repayFinishAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getInterestBalance() {
        return this.interestBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getInterestTotal() {
        return this.interestTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrincipalTotal() {
        return this.principalTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getRepaySize() {
        return this.repaySize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getRepayTime() {
        return this.repayTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final LeverBorrowPayed copy(@Nullable String loanId, @Nullable String currency, @Nullable BigDecimal interestTotal, @Nullable String period, @Nullable BigDecimal principalTotal, @Nullable BigDecimal rate, @Nullable BigDecimal repaySize, @Nullable Long repayTime, @Nullable String symbol, @Nullable Long maturityTime, @Nullable Long repayFinishAt, @Nullable BigDecimal interestBalance) {
        return new LeverBorrowPayed(loanId, currency, interestTotal, period, principalTotal, rate, repaySize, repayTime, symbol, maturityTime, repayFinishAt, interestBalance);
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
    public final BigDecimal getInterestTotal() {
        return this.interestTotal;
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
    public final String getPrincipalInterest() {
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimal = this.principalTotal;
        if (bigDecimal == null || (bigDecimalAdd = bigDecimal.add(this.interestTotal)) == null) {
            return null;
        }
        LeverCoinConfig leverCoinConfigM37796b = IPlatformService.m37796b((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class), C27041f.m66668h(this.currency), false, 2, null);
        return C42180b.m92640e(bigDecimalAdd, null, leverCoinConfigM37796b != null ? leverCoinConfigM37796b.getPrecision() : 8, false, false, false, 0, null, 125, null);
    }

    @Nullable
    public final String getPrincipalInterestIsolate() {
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimal = this.principalTotal;
        if (bigDecimal == null || (bigDecimalAdd = bigDecimal.add(C41014a.m89922G(this.interestBalance, null, 1, null))) == null) {
            return null;
        }
        LeverCoinConfig leverCoinConfigM37796b = IPlatformService.m37796b((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class), C27041f.m66668h(this.currency), false, 2, null);
        return C42180b.m92640e(bigDecimalAdd, null, leverCoinConfigM37796b != null ? leverCoinConfigM37796b.getPrecision() : 8, false, false, false, 0, null, 125, null);
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
    public final Long getRepayFinishAt() {
        return this.repayFinishAt;
    }

    @Nullable
    public final BigDecimal getRepaySize() {
        return this.repaySize;
    }

    @Nullable
    public final Long getRepayTime() {
        return this.repayTime;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.loanId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.interestTotal;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.period;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.principalTotal;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.rate;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.repaySize;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Long l11 = this.repayTime;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.symbol;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.maturityTime;
        int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.repayFinishAt;
        int iHashCode11 = (iHashCode10 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.interestBalance;
        return iHashCode11 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeverBorrowPayed(loanId=" + this.loanId + ", currency=" + this.currency + ", interestTotal=" + this.interestTotal + ", period=" + this.period + ", principalTotal=" + this.principalTotal + ", rate=" + this.rate + ", repaySize=" + this.repaySize + ", repayTime=" + this.repayTime + ", symbol=" + this.symbol + ", maturityTime=" + this.maturityTime + ", repayFinishAt=" + this.repayFinishAt + ", interestBalance=" + this.interestBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.loanId);
        dest.writeString(this.currency);
        dest.writeSerializable(this.interestTotal);
        dest.writeString(this.period);
        dest.writeSerializable(this.principalTotal);
        dest.writeSerializable(this.rate);
        dest.writeSerializable(this.repaySize);
        Long l11 = this.repayTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.symbol);
        Long l12 = this.maturityTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Long l13 = this.repayFinishAt;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeSerializable(this.interestBalance);
    }

    public LeverBorrowPayed(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Long l11, @Nullable String str4, @Nullable Long l12, @Nullable Long l13, @Nullable BigDecimal bigDecimal5) {
        this.loanId = str;
        this.currency = str2;
        this.interestTotal = bigDecimal;
        this.period = str3;
        this.principalTotal = bigDecimal2;
        this.rate = bigDecimal3;
        this.repaySize = bigDecimal4;
        this.repayTime = l11;
        this.symbol = str4;
        this.maturityTime = l12;
        this.repayFinishAt = l13;
        this.interestBalance = bigDecimal5;
    }
}
