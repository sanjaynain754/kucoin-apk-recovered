package com.kubi.payment.channel.withdraw.common.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawConfirmExtraParams.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/common/confirm/WithdrawConfirmExtraParams;", "Landroid/os/Parcelable;", "paymentMethodCode", "", "channelId", "accountId", "amount", "fiatCurrency", "paymentMethodName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getAccountId", "getAmount", "getFiatCurrency", "getPaymentMethodName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawConfirmExtraParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawConfirmExtraParams> CREATOR = new C20393a();

    @NotNull
    private final String accountId;

    @NotNull
    private final String amount;

    @NotNull
    private final String channelId;

    @NotNull
    private final String fiatCurrency;

    @NotNull
    private final String paymentMethodCode;

    @Nullable
    private final String paymentMethodName;

    /* JADX INFO: renamed from: com.kubi.payment.channel.withdraw.common.confirm.WithdrawConfirmExtraParams$a */
    /* JADX INFO: compiled from: WithdrawConfirmExtraParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20393a implements Parcelable.Creator<WithdrawConfirmExtraParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WithdrawConfirmExtraParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawConfirmExtraParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WithdrawConfirmExtraParams[] newArray(int i11) {
            return new WithdrawConfirmExtraParams[i11];
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
        if (!(other instanceof WithdrawConfirmExtraParams)) {
            return false;
        }
        WithdrawConfirmExtraParams withdrawConfirmExtraParams = (WithdrawConfirmExtraParams) other;
        return Intrinsics.areEqual(this.paymentMethodCode, withdrawConfirmExtraParams.paymentMethodCode) && Intrinsics.areEqual(this.channelId, withdrawConfirmExtraParams.channelId) && Intrinsics.areEqual(this.accountId, withdrawConfirmExtraParams.accountId) && Intrinsics.areEqual(this.amount, withdrawConfirmExtraParams.amount) && Intrinsics.areEqual(this.fiatCurrency, withdrawConfirmExtraParams.fiatCurrency) && Intrinsics.areEqual(this.paymentMethodName, withdrawConfirmExtraParams.paymentMethodName);
    }

    public WithdrawConfirmExtraParams(@NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String accountId, @NotNull String amount, @NotNull String fiatCurrency, @Nullable String str) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.paymentMethodCode = paymentMethodCode;
        this.channelId = channelId;
        this.accountId = accountId;
        this.amount = amount;
        this.fiatCurrency = fiatCurrency;
        this.paymentMethodName = str;
    }

    public static /* synthetic */ WithdrawConfirmExtraParams copy$default(WithdrawConfirmExtraParams withdrawConfirmExtraParams, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawConfirmExtraParams.paymentMethodCode;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawConfirmExtraParams.channelId;
        }
        if ((i11 & 4) != 0) {
            str3 = withdrawConfirmExtraParams.accountId;
        }
        if ((i11 & 8) != 0) {
            str4 = withdrawConfirmExtraParams.amount;
        }
        if ((i11 & 16) != 0) {
            str5 = withdrawConfirmExtraParams.fiatCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = withdrawConfirmExtraParams.paymentMethodName;
        }
        String str7 = str5;
        String str8 = str6;
        return withdrawConfirmExtraParams.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @NotNull
    public final WithdrawConfirmExtraParams copy(@NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String accountId, @NotNull String amount, @NotNull String fiatCurrency, @Nullable String paymentMethodName) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        return new WithdrawConfirmExtraParams(paymentMethodCode, channelId, accountId, amount, fiatCurrency, paymentMethodName);
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.paymentMethodCode.hashCode() * 31) + this.channelId.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31;
        String str = this.paymentMethodName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "WithdrawConfirmExtraParams(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", accountId=" + this.accountId + ", amount=" + this.amount + ", fiatCurrency=" + this.fiatCurrency + ", paymentMethodName=" + this.paymentMethodName + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.channelId);
        dest.writeString(this.accountId);
        dest.writeString(this.amount);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.paymentMethodName);
    }
}
