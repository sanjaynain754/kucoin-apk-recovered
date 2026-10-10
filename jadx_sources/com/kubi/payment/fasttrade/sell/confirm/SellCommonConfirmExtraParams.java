package com.kubi.payment.fasttrade.sell.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellCommonConfirmExtraParams.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jy\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0018R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0018R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018¨\u00067"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "Landroid/os/Parcelable;", "paymentMethodName", "", "paymentMethodCode", "channelId", "fiatCurrency", "cryptoCurrency", "cryptoAmount", "cardId", "adId", "payTypeCode", "p2pBusinessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodName", "()Ljava/lang/String;", "getPaymentMethodCode", "getChannelId", "getFiatCurrency", "getCryptoCurrency", "getCryptoAmount", "getCardId", "setCardId", "(Ljava/lang/String;)V", "getAdId", "setAdId", "getPayTypeCode", "setPayTypeCode", "getP2pBusinessType", "setP2pBusinessType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SellCommonConfirmExtraParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SellCommonConfirmExtraParams> CREATOR = new C20599a();

    @SerializedName("adId")
    @Nullable
    private String adId;

    @SerializedName("cardId")
    @Nullable
    private String cardId;

    @SerializedName("channelId")
    @NotNull
    private final String channelId;

    @SerializedName("cryptoAmount")
    @Nullable
    private final String cryptoAmount;

    @SerializedName("cryptoCurrency")
    @NotNull
    private final String cryptoCurrency;

    @SerializedName("fiatCurrency")
    @NotNull
    private final String fiatCurrency;

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

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams$a */
    /* JADX INFO: compiled from: SellCommonConfirmExtraParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20599a implements Parcelable.Creator<SellCommonConfirmExtraParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SellCommonConfirmExtraParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SellCommonConfirmExtraParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SellCommonConfirmExtraParams[] newArray(int i11) {
            return new SellCommonConfirmExtraParams[i11];
        }
    }

    public SellCommonConfirmExtraParams(@Nullable String str, @NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String fiatCurrency, @NotNull String cryptoCurrency, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        this.paymentMethodName = str;
        this.paymentMethodCode = paymentMethodCode;
        this.channelId = channelId;
        this.fiatCurrency = fiatCurrency;
        this.cryptoCurrency = cryptoCurrency;
        this.cryptoAmount = str2;
        this.cardId = str3;
        this.adId = str4;
        this.payTypeCode = str5;
        this.p2pBusinessType = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellCommonConfirmExtraParams)) {
            return false;
        }
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams = (SellCommonConfirmExtraParams) other;
        return Intrinsics.areEqual(this.paymentMethodName, sellCommonConfirmExtraParams.paymentMethodName) && Intrinsics.areEqual(this.paymentMethodCode, sellCommonConfirmExtraParams.paymentMethodCode) && Intrinsics.areEqual(this.channelId, sellCommonConfirmExtraParams.channelId) && Intrinsics.areEqual(this.fiatCurrency, sellCommonConfirmExtraParams.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, sellCommonConfirmExtraParams.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, sellCommonConfirmExtraParams.cryptoAmount) && Intrinsics.areEqual(this.cardId, sellCommonConfirmExtraParams.cardId) && Intrinsics.areEqual(this.adId, sellCommonConfirmExtraParams.adId) && Intrinsics.areEqual(this.payTypeCode, sellCommonConfirmExtraParams.payTypeCode) && Intrinsics.areEqual(this.p2pBusinessType, sellCommonConfirmExtraParams.p2pBusinessType);
    }

    public static /* synthetic */ SellCommonConfirmExtraParams copy$default(SellCommonConfirmExtraParams sellCommonConfirmExtraParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sellCommonConfirmExtraParams.paymentMethodName;
        }
        if ((i11 & 2) != 0) {
            str2 = sellCommonConfirmExtraParams.paymentMethodCode;
        }
        if ((i11 & 4) != 0) {
            str3 = sellCommonConfirmExtraParams.channelId;
        }
        if ((i11 & 8) != 0) {
            str4 = sellCommonConfirmExtraParams.fiatCurrency;
        }
        if ((i11 & 16) != 0) {
            str5 = sellCommonConfirmExtraParams.cryptoCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = sellCommonConfirmExtraParams.cryptoAmount;
        }
        if ((i11 & 64) != 0) {
            str7 = sellCommonConfirmExtraParams.cardId;
        }
        if ((i11 & 128) != 0) {
            str8 = sellCommonConfirmExtraParams.adId;
        }
        if ((i11 & 256) != 0) {
            str9 = sellCommonConfirmExtraParams.payTypeCode;
        }
        if ((i11 & 512) != 0) {
            str10 = sellCommonConfirmExtraParams.p2pBusinessType;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return sellCommonConfirmExtraParams.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
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

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @NotNull
    public final SellCommonConfirmExtraParams copy(@Nullable String paymentMethodName, @NotNull String paymentMethodCode, @NotNull String channelId, @NotNull String fiatCurrency, @NotNull String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String cardId, @Nullable String adId, @Nullable String payTypeCode, @Nullable String p2pBusinessType) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        return new SellCommonConfirmExtraParams(paymentMethodName, paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, cryptoAmount, cardId, adId, payTypeCode, p2pBusinessType);
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

    @Nullable
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    @NotNull
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @NotNull
    public final String getFiatCurrency() {
        return this.fiatCurrency;
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

    public int hashCode() {
        String str = this.paymentMethodName;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.paymentMethodCode.hashCode()) * 31) + this.channelId.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31) + this.cryptoCurrency.hashCode()) * 31;
        String str2 = this.cryptoAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payTypeCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p2pBusinessType;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAdId(@Nullable String str) {
        this.adId = str;
    }

    public final void setCardId(@Nullable String str) {
        this.cardId = str;
    }

    public final void setP2pBusinessType(@Nullable String str) {
        this.p2pBusinessType = str;
    }

    public final void setPayTypeCode(@Nullable String str) {
        this.payTypeCode = str;
    }

    @NotNull
    public String toString() {
        return "SellCommonConfirmExtraParams(paymentMethodName=" + this.paymentMethodName + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", cardId=" + this.cardId + ", adId=" + this.adId + ", payTypeCode=" + this.payTypeCode + ", p2pBusinessType=" + this.p2pBusinessType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodName);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.channelId);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.cryptoAmount);
        dest.writeString(this.cardId);
        dest.writeString(this.adId);
        dest.writeString(this.payTypeCode);
        dest.writeString(this.p2pBusinessType);
    }

    public /* synthetic */ SellCommonConfirmExtraParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10);
    }
}
