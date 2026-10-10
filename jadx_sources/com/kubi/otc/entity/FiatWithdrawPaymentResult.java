package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/entity/FiatWithdrawPaymentResult;", "Landroid/os/Parcelable;", "payoutTrxnId", "", FirebaseAnalytics.Param.CURRENCY, "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayoutTrxnId", "()Ljava/lang/String;", "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "getAmount", "setAmount", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatWithdrawPaymentResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatWithdrawPaymentResult> CREATOR = new Creator();

    @Nullable
    private String amount;

    @Nullable
    private String currency;

    @Nullable
    private final String payoutTrxnId;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatWithdrawPaymentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawPaymentResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatWithdrawPaymentResult(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawPaymentResult[] newArray(int i11) {
            return new FiatWithdrawPaymentResult[i11];
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
        if (!(other instanceof FiatWithdrawPaymentResult)) {
            return false;
        }
        FiatWithdrawPaymentResult fiatWithdrawPaymentResult = (FiatWithdrawPaymentResult) other;
        return Intrinsics.areEqual(this.payoutTrxnId, fiatWithdrawPaymentResult.payoutTrxnId) && Intrinsics.areEqual(this.currency, fiatWithdrawPaymentResult.currency) && Intrinsics.areEqual(this.amount, fiatWithdrawPaymentResult.amount);
    }

    public static /* synthetic */ FiatWithdrawPaymentResult copy$default(FiatWithdrawPaymentResult fiatWithdrawPaymentResult, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatWithdrawPaymentResult.payoutTrxnId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatWithdrawPaymentResult.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatWithdrawPaymentResult.amount;
        }
        return fiatWithdrawPaymentResult.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayoutTrxnId() {
        return this.payoutTrxnId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final FiatWithdrawPaymentResult copy(@Nullable String payoutTrxnId, @Nullable String currency, @Nullable String amount) {
        return new FiatWithdrawPaymentResult(payoutTrxnId, currency, amount);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getPayoutTrxnId() {
        return this.payoutTrxnId;
    }

    public int hashCode() {
        String str = this.payoutTrxnId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAmount(@Nullable String str) {
        this.amount = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    @NotNull
    public String toString() {
        return "FiatWithdrawPaymentResult(payoutTrxnId=" + this.payoutTrxnId + ", currency=" + this.currency + ", amount=" + this.amount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.payoutTrxnId);
        dest.writeString(this.currency);
        dest.writeString(this.amount);
    }

    public FiatWithdrawPaymentResult(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.payoutTrxnId = str;
        this.currency = str2;
        this.amount = str3;
    }
}
