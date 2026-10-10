package com.kubi.payment.fast.common.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConfirmExtraParams.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u000208HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000208R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006C"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "Landroid/os/Parcelable;", "tradeType", "", "paymentType", "paymentMethodCode", "fiatCurrency", "fiatAmount", "cryptoCurrency", "cryptoAmount", "cardId", "adId", "paymentMethodName", "payTypeCode", "isRecurringMode", "", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;)V", "getTradeType", "()Ljava/lang/String;", "getPaymentType", "getPaymentMethodCode", "getFiatCurrency", "setFiatCurrency", "(Ljava/lang/String;)V", "getFiatAmount", "getCryptoCurrency", "getCryptoAmount", "getCardId", "setCardId", "getAdId", "setAdId", "getPaymentMethodName", "setPaymentMethodName", "getPayTypeCode", "setPayTypeCode", "()Z", "getRecurringFrequency", "()Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ConfirmExtraParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConfirmExtraParams> CREATOR = new C20476a();

    @Nullable
    private String adId;

    @Nullable
    private String cardId;

    @Nullable
    private final String cryptoAmount;

    @NotNull
    private final String cryptoCurrency;

    @Nullable
    private final String fiatAmount;

    @NotNull
    private String fiatCurrency;
    private final boolean isRecurringMode;

    @Nullable
    private String payTypeCode;

    @NotNull
    private final String paymentMethodCode;

    @Nullable
    private String paymentMethodName;

    @NotNull
    private final String paymentType;

    @Nullable
    private final RecurringFrequency recurringFrequency;

    @NotNull
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.ConfirmExtraParams$a */
    /* JADX INFO: compiled from: ConfirmExtraParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20476a implements Parcelable.Creator<ConfirmExtraParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConfirmExtraParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmExtraParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (RecurringFrequency) (parcel.readInt() == 0 ? null : RecurringFrequency.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConfirmExtraParams[] newArray(int i11) {
            return new ConfirmExtraParams[i11];
        }
    }

    public ConfirmExtraParams(@NotNull String tradeType, @NotNull String paymentType, @NotNull String paymentMethodCode, @NotNull String fiatCurrency, @Nullable String str, @NotNull String cryptoCurrency, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z11, @Nullable RecurringFrequency recurringFrequency) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        this.tradeType = tradeType;
        this.paymentType = paymentType;
        this.paymentMethodCode = paymentMethodCode;
        this.fiatCurrency = fiatCurrency;
        this.fiatAmount = str;
        this.cryptoCurrency = cryptoCurrency;
        this.cryptoAmount = str2;
        this.cardId = str3;
        this.adId = str4;
        this.paymentMethodName = str5;
        this.payTypeCode = str6;
        this.isRecurringMode = z11;
        this.recurringFrequency = recurringFrequency;
    }

    public static /* synthetic */ ConfirmExtraParams copy$default(ConfirmExtraParams confirmExtraParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z11, RecurringFrequency recurringFrequency, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmExtraParams.tradeType;
        }
        return confirmExtraParams.copy(str, (i11 & 2) != 0 ? confirmExtraParams.paymentType : str2, (i11 & 4) != 0 ? confirmExtraParams.paymentMethodCode : str3, (i11 & 8) != 0 ? confirmExtraParams.fiatCurrency : str4, (i11 & 16) != 0 ? confirmExtraParams.fiatAmount : str5, (i11 & 32) != 0 ? confirmExtraParams.cryptoCurrency : str6, (i11 & 64) != 0 ? confirmExtraParams.cryptoAmount : str7, (i11 & 128) != 0 ? confirmExtraParams.cardId : str8, (i11 & 256) != 0 ? confirmExtraParams.adId : str9, (i11 & 512) != 0 ? confirmExtraParams.paymentMethodName : str10, (i11 & 1024) != 0 ? confirmExtraParams.payTypeCode : str11, (i11 & 2048) != 0 ? confirmExtraParams.isRecurringMode : z11, (i11 & 4096) != 0 ? confirmExtraParams.recurringFrequency : recurringFrequency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmExtraParams)) {
            return false;
        }
        ConfirmExtraParams confirmExtraParams = (ConfirmExtraParams) other;
        return Intrinsics.areEqual(this.tradeType, confirmExtraParams.tradeType) && Intrinsics.areEqual(this.paymentType, confirmExtraParams.paymentType) && Intrinsics.areEqual(this.paymentMethodCode, confirmExtraParams.paymentMethodCode) && Intrinsics.areEqual(this.fiatCurrency, confirmExtraParams.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, confirmExtraParams.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, confirmExtraParams.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, confirmExtraParams.cryptoAmount) && Intrinsics.areEqual(this.cardId, confirmExtraParams.cardId) && Intrinsics.areEqual(this.adId, confirmExtraParams.adId) && Intrinsics.areEqual(this.paymentMethodName, confirmExtraParams.paymentMethodName) && Intrinsics.areEqual(this.payTypeCode, confirmExtraParams.payTypeCode) && this.isRecurringMode == confirmExtraParams.isRecurringMode && Intrinsics.areEqual(this.recurringFrequency, confirmExtraParams.recurringFrequency);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsRecurringMode() {
        return this.isRecurringMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final RecurringFrequency getRecurringFrequency() {
        return this.recurringFrequency;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @NotNull
    public final ConfirmExtraParams copy(@NotNull String tradeType, @NotNull String paymentType, @NotNull String paymentMethodCode, @NotNull String fiatCurrency, @Nullable String fiatAmount, @NotNull String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String cardId, @Nullable String adId, @Nullable String paymentMethodName, @Nullable String payTypeCode, boolean isRecurringMode, @Nullable RecurringFrequency recurringFrequency) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        return new ConfirmExtraParams(tradeType, paymentType, paymentMethodCode, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, cardId, adId, paymentMethodName, payTypeCode, isRecurringMode, recurringFrequency);
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @NotNull
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    @NotNull
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @NotNull
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @NotNull
    public final String getPaymentType() {
        return this.paymentType;
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
        int iHashCode = ((((((this.tradeType.hashCode() * 31) + this.paymentType.hashCode()) * 31) + this.paymentMethodCode.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31;
        String str = this.fiatAmount;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cryptoCurrency.hashCode()) * 31;
        String str2 = this.cryptoAmount;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethodName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payTypeCode;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.isRecurringMode)) * 31;
        RecurringFrequency recurringFrequency = this.recurringFrequency;
        return iHashCode7 + (recurringFrequency != null ? recurringFrequency.hashCode() : 0);
    }

    public final boolean isRecurringMode() {
        return this.isRecurringMode;
    }

    public final void setAdId(@Nullable String str) {
        this.adId = str;
    }

    public final void setCardId(@Nullable String str) {
        this.cardId = str;
    }

    public final void setFiatCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fiatCurrency = str;
    }

    public final void setPayTypeCode(@Nullable String str) {
        this.payTypeCode = str;
    }

    public final void setPaymentMethodName(@Nullable String str) {
        this.paymentMethodName = str;
    }

    @NotNull
    public String toString() {
        return "ConfirmExtraParams(tradeType=" + this.tradeType + ", paymentType=" + this.paymentType + ", paymentMethodCode=" + this.paymentMethodCode + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", cardId=" + this.cardId + ", adId=" + this.adId + ", paymentMethodName=" + this.paymentMethodName + ", payTypeCode=" + this.payTypeCode + ", isRecurringMode=" + this.isRecurringMode + ", recurringFrequency=" + this.recurringFrequency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.paymentType);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.fiatAmount);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.cryptoAmount);
        dest.writeString(this.cardId);
        dest.writeString(this.adId);
        dest.writeString(this.paymentMethodName);
        dest.writeString(this.payTypeCode);
        dest.writeInt(this.isRecurringMode ? 1 : 0);
        RecurringFrequency recurringFrequency = this.recurringFrequency;
        if (recurringFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recurringFrequency.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ ConfirmExtraParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z11, RecurringFrequency recurringFrequency, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5, str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? null : recurringFrequency);
    }
}
