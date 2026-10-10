package com.revolut.revolutpay.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m90084d2 = {"Lcom/revolut/revolutpay/api/StepTransaction;", "Lcom/revolut/revolutpay/api/CashbackStep;", "minAmount", "Lcom/revolut/revolutpay/api/Money;", "(Lcom/revolut/revolutpay/api/Money;)V", "getMinAmount", "()Lcom/revolut/revolutpay/api/Money;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class StepTransaction implements CashbackStep {

    @NotNull
    public static final Parcelable.Creator<StepTransaction> CREATOR = new C27523a();

    @NotNull
    private final Money minAmount;

    /* JADX INFO: renamed from: com.revolut.revolutpay.api.StepTransaction$a */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class C27523a implements Parcelable.Creator<StepTransaction> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StepTransaction[] newArray(int i11) {
            return new StepTransaction[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StepTransaction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StepTransaction(Money.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StepTransaction) && Intrinsics.areEqual(this.minAmount, ((StepTransaction) other).minAmount);
    }

    public static /* synthetic */ StepTransaction copy$default(StepTransaction stepTransaction, Money money, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            money = stepTransaction.minAmount;
        }
        return stepTransaction.copy(money);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Money getMinAmount() {
        return this.minAmount;
    }

    @NotNull
    public final Money getMinAmount() {
        return this.minAmount;
    }

    public int hashCode() {
        return this.minAmount.hashCode();
    }

    @NotNull
    public String toString() {
        return "StepTransaction(minAmount=" + this.minAmount + ')';
    }

    public StepTransaction(@NotNull Money minAmount) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        this.minAmount = minAmount;
    }

    @NotNull
    public final StepTransaction copy(@NotNull Money minAmount) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        return new StepTransaction(minAmount);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.minAmount.writeToParcel(parcel, flags);
    }
}
