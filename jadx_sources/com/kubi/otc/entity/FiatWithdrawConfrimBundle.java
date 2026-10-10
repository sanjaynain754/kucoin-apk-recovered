package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "amount", "fiatFee", "Lcom/kubi/otc/entity/FiatFee;", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FiatFee;Lcom/kubi/payment/channel/data/entities/PaymentMethod;Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;)V", "getCurrency", "()Ljava/lang/String;", "getAmount", "getFiatFee", "()Lcom/kubi/otc/entity/FiatFee;", "getPaymentMethod", "()Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "getAccount", "()Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatWithdrawConfrimBundle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatWithdrawConfrimBundle> CREATOR = new Creator();

    @Nullable
    private final FiatWithdrawAccountInfo account;

    @Nullable
    private final String amount;

    @Nullable
    private final String currency;

    @Nullable
    private final FiatFee fiatFee;

    @Nullable
    private final PaymentMethod paymentMethod;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatWithdrawConfrimBundle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawConfrimBundle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatWithdrawConfrimBundle(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FiatFee.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FiatWithdrawAccountInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawConfrimBundle[] newArray(int i11) {
            return new FiatWithdrawConfrimBundle[i11];
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
        if (!(other instanceof FiatWithdrawConfrimBundle)) {
            return false;
        }
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundle = (FiatWithdrawConfrimBundle) other;
        return Intrinsics.areEqual(this.currency, fiatWithdrawConfrimBundle.currency) && Intrinsics.areEqual(this.amount, fiatWithdrawConfrimBundle.amount) && Intrinsics.areEqual(this.fiatFee, fiatWithdrawConfrimBundle.fiatFee) && Intrinsics.areEqual(this.paymentMethod, fiatWithdrawConfrimBundle.paymentMethod) && Intrinsics.areEqual(this.account, fiatWithdrawConfrimBundle.account);
    }

    public static /* synthetic */ FiatWithdrawConfrimBundle copy$default(FiatWithdrawConfrimBundle fiatWithdrawConfrimBundle, String str, String str2, FiatFee fiatFee, PaymentMethod paymentMethod, FiatWithdrawAccountInfo fiatWithdrawAccountInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatWithdrawConfrimBundle.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatWithdrawConfrimBundle.amount;
        }
        if ((i11 & 4) != 0) {
            fiatFee = fiatWithdrawConfrimBundle.fiatFee;
        }
        if ((i11 & 8) != 0) {
            paymentMethod = fiatWithdrawConfrimBundle.paymentMethod;
        }
        if ((i11 & 16) != 0) {
            fiatWithdrawAccountInfo = fiatWithdrawConfrimBundle.account;
        }
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo2 = fiatWithdrawAccountInfo;
        FiatFee fiatFee2 = fiatFee;
        return fiatWithdrawConfrimBundle.copy(str, str2, fiatFee2, paymentMethod, fiatWithdrawAccountInfo2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FiatFee getFiatFee() {
        return this.fiatFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FiatWithdrawAccountInfo getAccount() {
        return this.account;
    }

    @NotNull
    public final FiatWithdrawConfrimBundle copy(@Nullable String currency, @Nullable String amount, @Nullable FiatFee fiatFee, @Nullable PaymentMethod paymentMethod, @Nullable FiatWithdrawAccountInfo account) {
        return new FiatWithdrawConfrimBundle(currency, amount, fiatFee, paymentMethod, account);
    }

    @Nullable
    public final FiatWithdrawAccountInfo getAccount() {
        return this.account;
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
    public final FiatFee getFiatFee() {
        return this.fiatFee;
    }

    @Nullable
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FiatFee fiatFee = this.fiatFee;
        int iHashCode3 = (iHashCode2 + (fiatFee == null ? 0 : fiatFee.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode4 = (iHashCode3 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo = this.account;
        return iHashCode4 + (fiatWithdrawAccountInfo != null ? fiatWithdrawAccountInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiatWithdrawConfrimBundle(currency=" + this.currency + ", amount=" + this.amount + ", fiatFee=" + this.fiatFee + ", paymentMethod=" + this.paymentMethod + ", account=" + this.account + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.amount);
        FiatFee fiatFee = this.fiatFee;
        if (fiatFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatFee.writeToParcel(dest, flags);
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethod.writeToParcel(dest, flags);
        }
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo = this.account;
        if (fiatWithdrawAccountInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatWithdrawAccountInfo.writeToParcel(dest, flags);
        }
    }

    public FiatWithdrawConfrimBundle(@Nullable String str, @Nullable String str2, @Nullable FiatFee fiatFee, @Nullable PaymentMethod paymentMethod, @Nullable FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        this.currency = str;
        this.amount = str2;
        this.fiatFee = fiatFee;
        this.paymentMethod = paymentMethod;
        this.account = fiatWithdrawAccountInfo;
    }
}
