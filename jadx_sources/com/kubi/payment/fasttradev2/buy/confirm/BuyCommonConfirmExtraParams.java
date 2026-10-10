package com.kubi.payment.fasttradev2.buy.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyCommonConfirmExtraParams.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¡\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010;\u001a\u00020<J\u0013\u0010=\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020<HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020<R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u001bR \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u001bR \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010&\"\u0004\b'\u0010(R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u001b¨\u0006G"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "Landroid/os/Parcelable;", "paymentMethodName", "", "paymentMethodCode", "channelId", "fiatCurrency", "fiatCurrencyList", "", "cryptoCurrency", "fiatAmount", "cardId", "adId", "payTypeCode", "isRecurring", "", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "p2pBusinessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;Ljava/lang/String;)V", "getPaymentMethodName", "()Ljava/lang/String;", "getPaymentMethodCode", "getChannelId", "getFiatCurrency", "setFiatCurrency", "(Ljava/lang/String;)V", "getFiatCurrencyList", "()Ljava/util/List;", "getCryptoCurrency", "getFiatAmount", "getCardId", "setCardId", "getAdId", "setAdId", "getPayTypeCode", "setPayTypeCode", "()Z", "setRecurring", "(Z)V", "getRecurringFrequency", "()Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "getP2pBusinessType", "setP2pBusinessType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BuyCommonConfirmExtraParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BuyCommonConfirmExtraParams> CREATOR = new C20717a();

    @SerializedName("adId")
    @Nullable
    private String adId;

    @SerializedName("cardId")
    @Nullable
    private String cardId;

    @SerializedName("channelId")
    @NotNull
    private final String channelId;

    @SerializedName("cryptoCurrency")
    @NotNull
    private final String cryptoCurrency;

    @SerializedName("fiatAmount")
    @Nullable
    private final String fiatAmount;

    @SerializedName("fiatCurrency")
    @NotNull
    private String fiatCurrency;

    @SerializedName("fiatCurrencyList")
    @Nullable
    private final List<String> fiatCurrencyList;

    @SerializedName("isRecurring")
    private boolean isRecurring;

    @SerializedName("p2pBusinessType")
    @Nullable
    private String p2pBusinessType;

    @SerializedName("payTypeCode")
    @Nullable
    private String payTypeCode;

    @SerializedName("paymentMethodCode")
    @NotNull
    private final String paymentMethodCode;

    @SerializedName("paymentMethodName")
    @Nullable
    private final String paymentMethodName;

    @SerializedName(alternate = {"recurringInfo"}, value = "recurringFrequency")
    @Nullable
    private final RecurringFrequency recurringFrequency;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams$a */
    /* JADX INFO: compiled from: BuyCommonConfirmExtraParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20717a implements Parcelable.Creator<BuyCommonConfirmExtraParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BuyCommonConfirmExtraParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyCommonConfirmExtraParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (RecurringFrequency) (parcel.readInt() == 0 ? null : RecurringFrequency.CREATOR.createFromParcel(parcel)), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BuyCommonConfirmExtraParams[] newArray(int i11) {
            return new BuyCommonConfirmExtraParams[i11];
        }
    }

    public BuyCommonConfirmExtraParams(@Nullable String str, @NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String fiatCurrency, @Nullable List<String> list, @NotNull String cryptoCurrency, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z11, @Nullable RecurringFrequency recurringFrequency, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        this.paymentMethodName = str;
        this.paymentMethodCode = paymentMethodCode;
        this.channelId = channelId;
        this.fiatCurrency = fiatCurrency;
        this.fiatCurrencyList = list;
        this.cryptoCurrency = cryptoCurrency;
        this.fiatAmount = str2;
        this.cardId = str3;
        this.adId = str4;
        this.payTypeCode = str5;
        this.isRecurring = z11;
        this.recurringFrequency = recurringFrequency;
        this.p2pBusinessType = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyCommonConfirmExtraParams copy$default(BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, boolean z11, RecurringFrequency recurringFrequency, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buyCommonConfirmExtraParams.paymentMethodName;
        }
        return buyCommonConfirmExtraParams.copy(str, (i11 & 2) != 0 ? buyCommonConfirmExtraParams.paymentMethodCode : str2, (i11 & 4) != 0 ? buyCommonConfirmExtraParams.channelId : str3, (i11 & 8) != 0 ? buyCommonConfirmExtraParams.fiatCurrency : str4, (i11 & 16) != 0 ? buyCommonConfirmExtraParams.fiatCurrencyList : list, (i11 & 32) != 0 ? buyCommonConfirmExtraParams.cryptoCurrency : str5, (i11 & 64) != 0 ? buyCommonConfirmExtraParams.fiatAmount : str6, (i11 & 128) != 0 ? buyCommonConfirmExtraParams.cardId : str7, (i11 & 256) != 0 ? buyCommonConfirmExtraParams.adId : str8, (i11 & 512) != 0 ? buyCommonConfirmExtraParams.payTypeCode : str9, (i11 & 1024) != 0 ? buyCommonConfirmExtraParams.isRecurring : z11, (i11 & 2048) != 0 ? buyCommonConfirmExtraParams.recurringFrequency : recurringFrequency, (i11 & 4096) != 0 ? buyCommonConfirmExtraParams.p2pBusinessType : str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyCommonConfirmExtraParams)) {
            return false;
        }
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = (BuyCommonConfirmExtraParams) other;
        return Intrinsics.areEqual(this.paymentMethodName, buyCommonConfirmExtraParams.paymentMethodName) && Intrinsics.areEqual(this.paymentMethodCode, buyCommonConfirmExtraParams.paymentMethodCode) && Intrinsics.areEqual(this.channelId, buyCommonConfirmExtraParams.channelId) && Intrinsics.areEqual(this.fiatCurrency, buyCommonConfirmExtraParams.fiatCurrency) && Intrinsics.areEqual(this.fiatCurrencyList, buyCommonConfirmExtraParams.fiatCurrencyList) && Intrinsics.areEqual(this.cryptoCurrency, buyCommonConfirmExtraParams.cryptoCurrency) && Intrinsics.areEqual(this.fiatAmount, buyCommonConfirmExtraParams.fiatAmount) && Intrinsics.areEqual(this.cardId, buyCommonConfirmExtraParams.cardId) && Intrinsics.areEqual(this.adId, buyCommonConfirmExtraParams.adId) && Intrinsics.areEqual(this.payTypeCode, buyCommonConfirmExtraParams.payTypeCode) && this.isRecurring == buyCommonConfirmExtraParams.isRecurring && Intrinsics.areEqual(this.recurringFrequency, buyCommonConfirmExtraParams.recurringFrequency) && Intrinsics.areEqual(this.p2pBusinessType, buyCommonConfirmExtraParams.p2pBusinessType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsRecurring() {
        return this.isRecurring;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final RecurringFrequency getRecurringFrequency() {
        return this.recurringFrequency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getP2pBusinessType() {
        return this.p2pBusinessType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final List<String> component5() {
        return this.fiatCurrencyList;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFiatAmount() {
        return this.fiatAmount;
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
    public final BuyCommonConfirmExtraParams copy(@Nullable String paymentMethodName, @NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String fiatCurrency, @Nullable List<String> fiatCurrencyList, @NotNull String cryptoCurrency, @Nullable String fiatAmount, @Nullable String cardId, @Nullable String adId, @Nullable String payTypeCode, boolean isRecurring, @Nullable RecurringFrequency recurringFrequency, @Nullable String p2pBusinessType) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        return new BuyCommonConfirmExtraParams(paymentMethodName, paymentMethodCode, channelId, fiatCurrency, fiatCurrencyList, cryptoCurrency, fiatAmount, cardId, adId, payTypeCode, isRecurring, recurringFrequency, p2pBusinessType);
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
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
    public final List<String> getFiatCurrencyList() {
        return this.fiatCurrencyList;
    }

    @Nullable
    public final String getP2pBusinessType() {
        return this.p2pBusinessType;
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

    @Nullable
    public final RecurringFrequency getRecurringFrequency() {
        return this.recurringFrequency;
    }

    public int hashCode() {
        String str = this.paymentMethodName;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.paymentMethodCode.hashCode()) * 31) + this.channelId.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31;
        List<String> list = this.fiatCurrencyList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.cryptoCurrency.hashCode()) * 31;
        String str2 = this.fiatAmount;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payTypeCode;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.isRecurring)) * 31;
        RecurringFrequency recurringFrequency = this.recurringFrequency;
        int iHashCode7 = (iHashCode6 + (recurringFrequency == null ? 0 : recurringFrequency.hashCode())) * 31;
        String str6 = this.p2pBusinessType;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isRecurring() {
        return this.isRecurring;
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

    public final void setP2pBusinessType(@Nullable String str) {
        this.p2pBusinessType = str;
    }

    public final void setPayTypeCode(@Nullable String str) {
        this.payTypeCode = str;
    }

    public final void setRecurring(boolean z11) {
        this.isRecurring = z11;
    }

    @NotNull
    public String toString() {
        return "BuyCommonConfirmExtraParams(paymentMethodName=" + this.paymentMethodName + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", fiatCurrencyList=" + this.fiatCurrencyList + ", cryptoCurrency=" + this.cryptoCurrency + ", fiatAmount=" + this.fiatAmount + ", cardId=" + this.cardId + ", adId=" + this.adId + ", payTypeCode=" + this.payTypeCode + ", isRecurring=" + this.isRecurring + ", recurringFrequency=" + this.recurringFrequency + ", p2pBusinessType=" + this.p2pBusinessType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodName);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.channelId);
        dest.writeString(this.fiatCurrency);
        dest.writeStringList(this.fiatCurrencyList);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.fiatAmount);
        dest.writeString(this.cardId);
        dest.writeString(this.adId);
        dest.writeString(this.payTypeCode);
        dest.writeInt(this.isRecurring ? 1 : 0);
        RecurringFrequency recurringFrequency = this.recurringFrequency;
        if (recurringFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recurringFrequency.writeToParcel(dest, flags);
        }
        dest.writeString(this.p2pBusinessType);
    }

    public /* synthetic */ BuyCommonConfirmExtraParams(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, boolean z11, RecurringFrequency recurringFrequency, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : list, str5, str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, (i11 & 1024) != 0 ? false : z11, (i11 & 2048) != 0 ? null : recurringFrequency, (i11 & 4096) != 0 ? null : str10);
    }
}
