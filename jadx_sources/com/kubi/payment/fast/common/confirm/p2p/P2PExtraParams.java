package com.kubi.payment.fast.common.confirm.p2p;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PExtraParams.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;", "Landroid/os/Parcelable;", "tradeType", "", "inputAmount", "quoteType", "fiatCurrency", "cryptoCurrency", "paymentMethodCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getInputAmount", "getQuoteType", "getFiatCurrency", "getCryptoCurrency", "getPaymentMethodCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class P2PExtraParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<P2PExtraParams> CREATOR = new C20488a();

    @NotNull
    private final String cryptoCurrency;

    @NotNull
    private final String fiatCurrency;

    @NotNull
    private final String inputAmount;

    @NotNull
    private final String paymentMethodCode;

    @NotNull
    private final String quoteType;

    @NotNull
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.p2p.P2PExtraParams$a */
    /* JADX INFO: compiled from: P2PExtraParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20488a implements Parcelable.Creator<P2PExtraParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P2PExtraParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new P2PExtraParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final P2PExtraParams[] newArray(int i11) {
            return new P2PExtraParams[i11];
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
        if (!(other instanceof P2PExtraParams)) {
            return false;
        }
        P2PExtraParams p2PExtraParams = (P2PExtraParams) other;
        return Intrinsics.areEqual(this.tradeType, p2PExtraParams.tradeType) && Intrinsics.areEqual(this.inputAmount, p2PExtraParams.inputAmount) && Intrinsics.areEqual(this.quoteType, p2PExtraParams.quoteType) && Intrinsics.areEqual(this.fiatCurrency, p2PExtraParams.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, p2PExtraParams.cryptoCurrency) && Intrinsics.areEqual(this.paymentMethodCode, p2PExtraParams.paymentMethodCode);
    }

    public P2PExtraParams(@NotNull String tradeType, @NotNull String inputAmount, @NotNull String quoteType, @NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        this.tradeType = tradeType;
        this.inputAmount = inputAmount;
        this.quoteType = quoteType;
        this.fiatCurrency = fiatCurrency;
        this.cryptoCurrency = cryptoCurrency;
        this.paymentMethodCode = paymentMethodCode;
    }

    public static /* synthetic */ P2PExtraParams copy$default(P2PExtraParams p2PExtraParams, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = p2PExtraParams.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = p2PExtraParams.inputAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = p2PExtraParams.quoteType;
        }
        if ((i11 & 8) != 0) {
            str4 = p2PExtraParams.fiatCurrency;
        }
        if ((i11 & 16) != 0) {
            str5 = p2PExtraParams.cryptoCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = p2PExtraParams.paymentMethodCode;
        }
        String str7 = str5;
        String str8 = str6;
        return p2PExtraParams.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInputAmount() {
        return this.inputAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuoteType() {
        return this.quoteType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    public final P2PExtraParams copy(@NotNull String tradeType, @NotNull String inputAmount, @NotNull String quoteType, @NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        return new P2PExtraParams(tradeType, inputAmount, quoteType, fiatCurrency, cryptoCurrency, paymentMethodCode);
    }

    @NotNull
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @NotNull
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    public final String getInputAmount() {
        return this.inputAmount;
    }

    @NotNull
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    public final String getQuoteType() {
        return this.quoteType;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        return (((((((((this.tradeType.hashCode() * 31) + this.inputAmount.hashCode()) * 31) + this.quoteType.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31) + this.cryptoCurrency.hashCode()) * 31) + this.paymentMethodCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "P2PExtraParams(tradeType=" + this.tradeType + ", inputAmount=" + this.inputAmount + ", quoteType=" + this.quoteType + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", paymentMethodCode=" + this.paymentMethodCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.inputAmount);
        dest.writeString(this.quoteType);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.paymentMethodCode);
    }
}
