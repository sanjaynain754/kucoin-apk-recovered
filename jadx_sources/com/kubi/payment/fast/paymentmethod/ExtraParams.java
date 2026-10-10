package com.kubi.payment.fast.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExtraParams.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u00064"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/ExtraParams;", "Landroid/os/Parcelable;", "tradeType", "", "quoteType", "fiatCurrency", "fiatCurrencyIconUrl", "cryptoCurrency", "cryptoCurrencyIconUrl", "inputAmount", "isOneTimePurchaseMode", "", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "paymentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getQuoteType", "getFiatCurrency", "getFiatCurrencyIconUrl", "getCryptoCurrency", "getCryptoCurrencyIconUrl", "getInputAmount", "()Z", "getRecurringFrequency", "()Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "getPaymentType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ExtraParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExtraParams> CREATOR = new C20508a();

    @NotNull
    private final String cryptoCurrency;

    @Nullable
    private final String cryptoCurrencyIconUrl;

    @NotNull
    private final String fiatCurrency;

    @Nullable
    private final String fiatCurrencyIconUrl;

    @NotNull
    private final String inputAmount;
    private final boolean isOneTimePurchaseMode;

    @Nullable
    private final String paymentType;

    @NotNull
    private final String quoteType;

    @Nullable
    private final RecurringFrequency recurringFrequency;

    @NotNull
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.payment.fast.paymentmethod.ExtraParams$a */
    /* JADX INFO: compiled from: ExtraParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20508a implements Parcelable.Creator<ExtraParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExtraParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExtraParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (RecurringFrequency) (parcel.readInt() == 0 ? null : RecurringFrequency.CREATOR.createFromParcel(parcel)), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExtraParams[] newArray(int i11) {
            return new ExtraParams[i11];
        }
    }

    public ExtraParams(@NotNull String tradeType, @NotNull String quoteType, @NotNull String fiatCurrency, @Nullable String str, @NotNull String cryptoCurrency, @Nullable String str2, @NotNull String inputAmount, boolean z11, @Nullable RecurringFrequency recurringFrequency, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        this.tradeType = tradeType;
        this.quoteType = quoteType;
        this.fiatCurrency = fiatCurrency;
        this.fiatCurrencyIconUrl = str;
        this.cryptoCurrency = cryptoCurrency;
        this.cryptoCurrencyIconUrl = str2;
        this.inputAmount = inputAmount;
        this.isOneTimePurchaseMode = z11;
        this.recurringFrequency = recurringFrequency;
        this.paymentType = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraParams)) {
            return false;
        }
        ExtraParams extraParams = (ExtraParams) other;
        return Intrinsics.areEqual(this.tradeType, extraParams.tradeType) && Intrinsics.areEqual(this.quoteType, extraParams.quoteType) && Intrinsics.areEqual(this.fiatCurrency, extraParams.fiatCurrency) && Intrinsics.areEqual(this.fiatCurrencyIconUrl, extraParams.fiatCurrencyIconUrl) && Intrinsics.areEqual(this.cryptoCurrency, extraParams.cryptoCurrency) && Intrinsics.areEqual(this.cryptoCurrencyIconUrl, extraParams.cryptoCurrencyIconUrl) && Intrinsics.areEqual(this.inputAmount, extraParams.inputAmount) && this.isOneTimePurchaseMode == extraParams.isOneTimePurchaseMode && Intrinsics.areEqual(this.recurringFrequency, extraParams.recurringFrequency) && Intrinsics.areEqual(this.paymentType, extraParams.paymentType);
    }

    public static /* synthetic */ ExtraParams copy$default(ExtraParams extraParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, RecurringFrequency recurringFrequency, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = extraParams.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = extraParams.quoteType;
        }
        if ((i11 & 4) != 0) {
            str3 = extraParams.fiatCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = extraParams.fiatCurrencyIconUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = extraParams.cryptoCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = extraParams.cryptoCurrencyIconUrl;
        }
        if ((i11 & 64) != 0) {
            str7 = extraParams.inputAmount;
        }
        if ((i11 & 128) != 0) {
            z11 = extraParams.isOneTimePurchaseMode;
        }
        if ((i11 & 256) != 0) {
            recurringFrequency = extraParams.recurringFrequency;
        }
        if ((i11 & 512) != 0) {
            str8 = extraParams.paymentType;
        }
        RecurringFrequency recurringFrequency2 = recurringFrequency;
        String str9 = str8;
        String str10 = str7;
        boolean z12 = z11;
        String str11 = str5;
        String str12 = str6;
        return extraParams.copy(str, str2, str3, str4, str11, str12, str10, z12, recurringFrequency2, str9);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuoteType() {
        return this.quoteType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatCurrencyIconUrl() {
        return this.fiatCurrencyIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCryptoCurrencyIconUrl() {
        return this.cryptoCurrencyIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInputAmount() {
        return this.inputAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsOneTimePurchaseMode() {
        return this.isOneTimePurchaseMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RecurringFrequency getRecurringFrequency() {
        return this.recurringFrequency;
    }

    @NotNull
    public final ExtraParams copy(@NotNull String tradeType, @NotNull String quoteType, @NotNull String fiatCurrency, @Nullable String fiatCurrencyIconUrl, @NotNull String cryptoCurrency, @Nullable String cryptoCurrencyIconUrl, @NotNull String inputAmount, boolean isOneTimePurchaseMode, @Nullable RecurringFrequency recurringFrequency, @Nullable String paymentType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        return new ExtraParams(tradeType, quoteType, fiatCurrency, fiatCurrencyIconUrl, cryptoCurrency, cryptoCurrencyIconUrl, inputAmount, isOneTimePurchaseMode, recurringFrequency, paymentType);
    }

    @NotNull
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final String getCryptoCurrencyIconUrl() {
        return this.cryptoCurrencyIconUrl;
    }

    @NotNull
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getFiatCurrencyIconUrl() {
        return this.fiatCurrencyIconUrl;
    }

    @NotNull
    public final String getInputAmount() {
        return this.inputAmount;
    }

    @Nullable
    public final String getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    public final String getQuoteType() {
        return this.quoteType;
    }

    @Nullable
    public final RecurringFrequency getRecurringFrequency() {
        return this.recurringFrequency;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        int iHashCode = ((((this.tradeType.hashCode() * 31) + this.quoteType.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31;
        String str = this.fiatCurrencyIconUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cryptoCurrency.hashCode()) * 31;
        String str2 = this.cryptoCurrencyIconUrl;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.inputAmount.hashCode()) * 31) + Boolean.hashCode(this.isOneTimePurchaseMode)) * 31;
        RecurringFrequency recurringFrequency = this.recurringFrequency;
        int iHashCode4 = (iHashCode3 + (recurringFrequency == null ? 0 : recurringFrequency.hashCode())) * 31;
        String str3 = this.paymentType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isOneTimePurchaseMode() {
        return this.isOneTimePurchaseMode;
    }

    @NotNull
    public String toString() {
        return "ExtraParams(tradeType=" + this.tradeType + ", quoteType=" + this.quoteType + ", fiatCurrency=" + this.fiatCurrency + ", fiatCurrencyIconUrl=" + this.fiatCurrencyIconUrl + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoCurrencyIconUrl=" + this.cryptoCurrencyIconUrl + ", inputAmount=" + this.inputAmount + ", isOneTimePurchaseMode=" + this.isOneTimePurchaseMode + ", recurringFrequency=" + this.recurringFrequency + ", paymentType=" + this.paymentType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.quoteType);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.fiatCurrencyIconUrl);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.cryptoCurrencyIconUrl);
        dest.writeString(this.inputAmount);
        dest.writeInt(this.isOneTimePurchaseMode ? 1 : 0);
        RecurringFrequency recurringFrequency = this.recurringFrequency;
        if (recurringFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recurringFrequency.writeToParcel(dest, flags);
        }
        dest.writeString(this.paymentType);
    }

    public /* synthetic */ ExtraParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, RecurringFrequency recurringFrequency, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4, str5, (i11 & 32) != 0 ? null : str6, str7, (i11 & 128) != 0 ? true : z11, (i11 & 256) != 0 ? null : recurringFrequency, (i11 & 512) != 0 ? null : str8);
    }
}
