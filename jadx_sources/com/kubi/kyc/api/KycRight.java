package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0005J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/kyc/api/KycRight;", "Landroid/os/Parcelable;", "canDeposit", "", "contractMargin", "", "maxOTCAmountDaily", "maxOTCSellAmount", "withdrawalAmount", "<init>", "(ZIIII)V", "getCanDeposit", "()Z", "getContractMargin", "()I", "getMaxOTCAmountDaily", "getMaxOTCSellAmount", "getWithdrawalAmount", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycRight implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycRight> CREATOR = new C17094a();
    private final boolean canDeposit;
    private final int contractMargin;
    private final int maxOTCAmountDaily;
    private final int maxOTCSellAmount;
    private final int withdrawalAmount;

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycRight$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17094a implements Parcelable.Creator<KycRight> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycRight createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycRight(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycRight[] newArray(int i11) {
            return new KycRight[i11];
        }
    }

    public KycRight() {
        this(false, 0, 0, 0, 0, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycRight)) {
            return false;
        }
        KycRight kycRight = (KycRight) other;
        return this.canDeposit == kycRight.canDeposit && this.contractMargin == kycRight.contractMargin && this.maxOTCAmountDaily == kycRight.maxOTCAmountDaily && this.maxOTCSellAmount == kycRight.maxOTCSellAmount && this.withdrawalAmount == kycRight.withdrawalAmount;
    }

    public KycRight(boolean z11, int i11, int i12, int i13, int i14) {
        this.canDeposit = z11;
        this.contractMargin = i11;
        this.maxOTCAmountDaily = i12;
        this.maxOTCSellAmount = i13;
        this.withdrawalAmount = i14;
    }

    public static /* synthetic */ KycRight copy$default(KycRight kycRight, boolean z11, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z11 = kycRight.canDeposit;
        }
        if ((i15 & 2) != 0) {
            i11 = kycRight.contractMargin;
        }
        if ((i15 & 4) != 0) {
            i12 = kycRight.maxOTCAmountDaily;
        }
        if ((i15 & 8) != 0) {
            i13 = kycRight.maxOTCSellAmount;
        }
        if ((i15 & 16) != 0) {
            i14 = kycRight.withdrawalAmount;
        }
        int i16 = i14;
        int i17 = i12;
        return kycRight.copy(z11, i11, i17, i13, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCanDeposit() {
        return this.canDeposit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getContractMargin() {
        return this.contractMargin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxOTCAmountDaily() {
        return this.maxOTCAmountDaily;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxOTCSellAmount() {
        return this.maxOTCSellAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    @NotNull
    public final KycRight copy(boolean canDeposit, int contractMargin, int maxOTCAmountDaily, int maxOTCSellAmount, int withdrawalAmount) {
        return new KycRight(canDeposit, contractMargin, maxOTCAmountDaily, maxOTCSellAmount, withdrawalAmount);
    }

    public final boolean getCanDeposit() {
        return this.canDeposit;
    }

    public final int getContractMargin() {
        return this.contractMargin;
    }

    public final int getMaxOTCAmountDaily() {
        return this.maxOTCAmountDaily;
    }

    public final int getMaxOTCSellAmount() {
        return this.maxOTCSellAmount;
    }

    public final int getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.canDeposit) * 31) + Integer.hashCode(this.contractMargin)) * 31) + Integer.hashCode(this.maxOTCAmountDaily)) * 31) + Integer.hashCode(this.maxOTCSellAmount)) * 31) + Integer.hashCode(this.withdrawalAmount);
    }

    @NotNull
    public String toString() {
        return "KycRight(canDeposit=" + this.canDeposit + ", contractMargin=" + this.contractMargin + ", maxOTCAmountDaily=" + this.maxOTCAmountDaily + ", maxOTCSellAmount=" + this.maxOTCSellAmount + ", withdrawalAmount=" + this.withdrawalAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.canDeposit ? 1 : 0);
        dest.writeInt(this.contractMargin);
        dest.writeInt(this.maxOTCAmountDaily);
        dest.writeInt(this.maxOTCSellAmount);
        dest.writeInt(this.withdrawalAmount);
    }

    public /* synthetic */ KycRight(boolean z11, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? false : z11, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14);
    }
}
