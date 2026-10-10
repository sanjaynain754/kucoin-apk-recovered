package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawalAmountEntity;", "Landroid/os/Parcelable;", "amount", "", "fee", "receivedAmount", "beforeDiscountFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getFee", "getReceivedAmount", "getBeforeDiscountFee", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawalAmountEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawalAmountEntity> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String beforeDiscountFee;

    @Nullable
    private final String fee;

    @Nullable
    private final String receivedAmount;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawalAmountEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawalAmountEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawalAmountEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawalAmountEntity[] newArray(int i11) {
            return new WithdrawalAmountEntity[i11];
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
        if (!(other instanceof WithdrawalAmountEntity)) {
            return false;
        }
        WithdrawalAmountEntity withdrawalAmountEntity = (WithdrawalAmountEntity) other;
        return Intrinsics.areEqual(this.amount, withdrawalAmountEntity.amount) && Intrinsics.areEqual(this.fee, withdrawalAmountEntity.fee) && Intrinsics.areEqual(this.receivedAmount, withdrawalAmountEntity.receivedAmount) && Intrinsics.areEqual(this.beforeDiscountFee, withdrawalAmountEntity.beforeDiscountFee);
    }

    public static /* synthetic */ WithdrawalAmountEntity copy$default(WithdrawalAmountEntity withdrawalAmountEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawalAmountEntity.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawalAmountEntity.fee;
        }
        if ((i11 & 4) != 0) {
            str3 = withdrawalAmountEntity.receivedAmount;
        }
        if ((i11 & 8) != 0) {
            str4 = withdrawalAmountEntity.beforeDiscountFee;
        }
        return withdrawalAmountEntity.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReceivedAmount() {
        return this.receivedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBeforeDiscountFee() {
        return this.beforeDiscountFee;
    }

    @NotNull
    public final WithdrawalAmountEntity copy(@Nullable String amount, @Nullable String fee, @Nullable String receivedAmount, @Nullable String beforeDiscountFee) {
        return new WithdrawalAmountEntity(amount, fee, receivedAmount, beforeDiscountFee);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBeforeDiscountFee() {
        return this.beforeDiscountFee;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final String getReceivedAmount() {
        return this.receivedAmount;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fee;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receivedAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.beforeDiscountFee;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawalAmountEntity(amount=" + this.amount + ", fee=" + this.fee + ", receivedAmount=" + this.receivedAmount + ", beforeDiscountFee=" + this.beforeDiscountFee + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.fee);
        dest.writeString(this.receivedAmount);
        dest.writeString(this.beforeDiscountFee);
    }

    public WithdrawalAmountEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.amount = str;
        this.fee = str2;
        this.receivedAmount = str3;
        this.beforeDiscountFee = str4;
    }
}
