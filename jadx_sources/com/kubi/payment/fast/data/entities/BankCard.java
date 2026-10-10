package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.entity.FastQuoteModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BankCard.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard;", "", "<init>", "()V", "BuyRequest", "BuyRequestExtension", "BuyResponse", "BuyResponseExtension", "SaveCvvRequest", "DeleteRequest", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BankCard {

    /* JADX INFO: compiled from: BankCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00062"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequest;", "", "quoteId", "", "channelType", "fiatCurrency", "fiatAmount", "cryptoCurrency", "cryptoQuantity", "ext", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;", "payToken", "googlePaymentData", "Lcom/kubi/payment/fast/data/entities/GooglePaymentData;", "clientFrom", "rewardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/GooglePaymentData;Ljava/lang/String;Ljava/lang/String;)V", "getQuoteId", "()Ljava/lang/String;", "getChannelType", "getFiatCurrency", "getFiatAmount", "getCryptoCurrency", "getCryptoQuantity", "getExt", "()Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;", "getPayToken", "getGooglePaymentData", "()Lcom/kubi/payment/fast/data/entities/GooglePaymentData;", "getClientFrom", "getRewardId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BuyRequest {

        @Nullable
        private final String channelType;

        @Nullable
        private final String clientFrom;

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String cryptoQuantity;

        @Nullable
        private final BuyRequestExtension ext;

        @Nullable
        private final String fiatAmount;

        @Nullable
        private final String fiatCurrency;

        @SerializedName("googlePayExt")
        @Nullable
        private final GooglePaymentData googlePaymentData;

        @SerializedName("payToken")
        @Nullable
        private final String payToken;

        @Nullable
        private final String quoteId;

        @Nullable
        private final String rewardId;

        public BuyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable BuyRequestExtension buyRequestExtension, @Nullable String str7, @Nullable GooglePaymentData googlePaymentData, @Nullable String str8, @Nullable String str9) {
            this.quoteId = str;
            this.channelType = str2;
            this.fiatCurrency = str3;
            this.fiatAmount = str4;
            this.cryptoCurrency = str5;
            this.cryptoQuantity = str6;
            this.ext = buyRequestExtension;
            this.payToken = str7;
            this.googlePaymentData = googlePaymentData;
            this.clientFrom = str8;
            this.rewardId = str9;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyRequest)) {
                return false;
            }
            BuyRequest buyRequest = (BuyRequest) other;
            return Intrinsics.areEqual(this.quoteId, buyRequest.quoteId) && Intrinsics.areEqual(this.channelType, buyRequest.channelType) && Intrinsics.areEqual(this.fiatCurrency, buyRequest.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, buyRequest.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, buyRequest.cryptoCurrency) && Intrinsics.areEqual(this.cryptoQuantity, buyRequest.cryptoQuantity) && Intrinsics.areEqual(this.ext, buyRequest.ext) && Intrinsics.areEqual(this.payToken, buyRequest.payToken) && Intrinsics.areEqual(this.googlePaymentData, buyRequest.googlePaymentData) && Intrinsics.areEqual(this.clientFrom, buyRequest.clientFrom) && Intrinsics.areEqual(this.rewardId, buyRequest.rewardId);
        }

        public static /* synthetic */ BuyRequest copy$default(BuyRequest buyRequest, String str, String str2, String str3, String str4, String str5, String str6, BuyRequestExtension buyRequestExtension, String str7, GooglePaymentData googlePaymentData, String str8, String str9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buyRequest.quoteId;
            }
            if ((i11 & 2) != 0) {
                str2 = buyRequest.channelType;
            }
            if ((i11 & 4) != 0) {
                str3 = buyRequest.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = buyRequest.fiatAmount;
            }
            if ((i11 & 16) != 0) {
                str5 = buyRequest.cryptoCurrency;
            }
            if ((i11 & 32) != 0) {
                str6 = buyRequest.cryptoQuantity;
            }
            if ((i11 & 64) != 0) {
                buyRequestExtension = buyRequest.ext;
            }
            if ((i11 & 128) != 0) {
                str7 = buyRequest.payToken;
            }
            if ((i11 & 256) != 0) {
                googlePaymentData = buyRequest.googlePaymentData;
            }
            if ((i11 & 512) != 0) {
                str8 = buyRequest.clientFrom;
            }
            if ((i11 & 1024) != 0) {
                str9 = buyRequest.rewardId;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str7;
            GooglePaymentData googlePaymentData2 = googlePaymentData;
            String str13 = str6;
            BuyRequestExtension buyRequestExtension2 = buyRequestExtension;
            String str14 = str5;
            String str15 = str3;
            return buyRequest.copy(str, str2, str15, str4, str14, str13, buyRequestExtension2, str12, googlePaymentData2, str10, str11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getClientFrom() {
            return this.clientFrom;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelType() {
            return this.channelType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCryptoQuantity() {
            return this.cryptoQuantity;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final BuyRequestExtension getExt() {
            return this.ext;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPayToken() {
            return this.payToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final GooglePaymentData getGooglePaymentData() {
            return this.googlePaymentData;
        }

        @NotNull
        public final BuyRequest copy(@Nullable String quoteId, @Nullable String channelType, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String cryptoCurrency, @Nullable String cryptoQuantity, @Nullable BuyRequestExtension ext, @Nullable String payToken, @Nullable GooglePaymentData googlePaymentData, @Nullable String clientFrom, @Nullable String rewardId) {
            return new BuyRequest(quoteId, channelType, fiatCurrency, fiatAmount, cryptoCurrency, cryptoQuantity, ext, payToken, googlePaymentData, clientFrom, rewardId);
        }

        @Nullable
        public final String getChannelType() {
            return this.channelType;
        }

        @Nullable
        public final String getClientFrom() {
            return this.clientFrom;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getCryptoQuantity() {
            return this.cryptoQuantity;
        }

        @Nullable
        public final BuyRequestExtension getExt() {
            return this.ext;
        }

        @Nullable
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final GooglePaymentData getGooglePaymentData() {
            return this.googlePaymentData;
        }

        @Nullable
        public final String getPayToken() {
            return this.payToken;
        }

        @Nullable
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        public final String getRewardId() {
            return this.rewardId;
        }

        public int hashCode() {
            String str = this.quoteId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fiatAmount;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoCurrency;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cryptoQuantity;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            BuyRequestExtension buyRequestExtension = this.ext;
            int iHashCode7 = (iHashCode6 + (buyRequestExtension == null ? 0 : buyRequestExtension.hashCode())) * 31;
            String str7 = this.payToken;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            GooglePaymentData googlePaymentData = this.googlePaymentData;
            int iHashCode9 = (iHashCode8 + (googlePaymentData == null ? 0 : googlePaymentData.hashCode())) * 31;
            String str8 = this.clientFrom;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.rewardId;
            return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BuyRequest(quoteId=" + this.quoteId + ", channelType=" + this.channelType + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoQuantity=" + this.cryptoQuantity + ", ext=" + this.ext + ", payToken=" + this.payToken + ", googlePaymentData=" + this.googlePaymentData + ", clientFrom=" + this.clientFrom + ", rewardId=" + this.rewardId + ')';
        }

        public /* synthetic */ BuyRequest(String str, String str2, String str3, String str4, String str5, String str6, BuyRequestExtension buyRequestExtension, String str7, GooglePaymentData googlePaymentData, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, str3, str4, str5, str6, buyRequestExtension, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : googlePaymentData, (i11 & 512) != 0 ? "ANDROID" : str8, (i11 & 1024) != 0 ? null : str9);
        }
    }

    /* JADX INFO: compiled from: BankCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard$BuyRequestExtension;", "", "cardId", "", "riskSessionId", "forterMobileUID", "deviceBrand", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getRiskSessionId", "getForterMobileUID", "getDeviceBrand", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BuyRequestExtension {

        @SerializedName("CHECKOUT_CARD_ID")
        @Nullable
        private final String cardId;

        @SerializedName("deviceBrand")
        @NotNull
        private final String deviceBrand;

        @SerializedName("forterMobileUID")
        @NotNull
        private final String forterMobileUID;

        @SerializedName("SESSION_ID")
        @Nullable
        private final String riskSessionId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyRequestExtension)) {
                return false;
            }
            BuyRequestExtension buyRequestExtension = (BuyRequestExtension) other;
            return Intrinsics.areEqual(this.cardId, buyRequestExtension.cardId) && Intrinsics.areEqual(this.riskSessionId, buyRequestExtension.riskSessionId) && Intrinsics.areEqual(this.forterMobileUID, buyRequestExtension.forterMobileUID) && Intrinsics.areEqual(this.deviceBrand, buyRequestExtension.deviceBrand);
        }

        public BuyRequestExtension(@Nullable String str, @Nullable String str2, @NotNull String forterMobileUID, @NotNull String deviceBrand) {
            Intrinsics.checkNotNullParameter(forterMobileUID, "forterMobileUID");
            Intrinsics.checkNotNullParameter(deviceBrand, "deviceBrand");
            this.cardId = str;
            this.riskSessionId = str2;
            this.forterMobileUID = forterMobileUID;
            this.deviceBrand = deviceBrand;
        }

        public static /* synthetic */ BuyRequestExtension copy$default(BuyRequestExtension buyRequestExtension, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buyRequestExtension.cardId;
            }
            if ((i11 & 2) != 0) {
                str2 = buyRequestExtension.riskSessionId;
            }
            if ((i11 & 4) != 0) {
                str3 = buyRequestExtension.forterMobileUID;
            }
            if ((i11 & 8) != 0) {
                str4 = buyRequestExtension.deviceBrand;
            }
            return buyRequestExtension.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRiskSessionId() {
            return this.riskSessionId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getForterMobileUID() {
            return this.forterMobileUID;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDeviceBrand() {
            return this.deviceBrand;
        }

        @NotNull
        public final BuyRequestExtension copy(@Nullable String cardId, @Nullable String riskSessionId, @NotNull String forterMobileUID, @NotNull String deviceBrand) {
            Intrinsics.checkNotNullParameter(forterMobileUID, "forterMobileUID");
            Intrinsics.checkNotNullParameter(deviceBrand, "deviceBrand");
            return new BuyRequestExtension(cardId, riskSessionId, forterMobileUID, deviceBrand);
        }

        @Nullable
        public final String getCardId() {
            return this.cardId;
        }

        @NotNull
        public final String getDeviceBrand() {
            return this.deviceBrand;
        }

        @NotNull
        public final String getForterMobileUID() {
            return this.forterMobileUID;
        }

        @Nullable
        public final String getRiskSessionId() {
            return this.riskSessionId;
        }

        public int hashCode() {
            String str = this.cardId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riskSessionId;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.forterMobileUID.hashCode()) * 31) + this.deviceBrand.hashCode();
        }

        @NotNull
        public String toString() {
            return "BuyRequestExtension(cardId=" + this.cardId + ", riskSessionId=" + this.riskSessionId + ", forterMobileUID=" + this.forterMobileUID + ", deviceBrand=" + this.deviceBrand + ')';
        }
    }

    /* JADX INFO: compiled from: BankCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;", "", "orderId", "", "redirectUrl", "redirectUrlType", "ext", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;)V", "getOrderId", "()Ljava/lang/String;", "getRedirectUrl", "getRedirectUrlType", "getExt", "()Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class BuyResponse {

        @Nullable
        private final BuyResponseExtension ext;

        @Nullable
        private final String orderId;

        @Nullable
        private final String redirectUrl;

        @Nullable
        private final String redirectUrlType;

        @Nullable
        public final BuyResponseExtension getExt() {
            return this.ext;
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @Nullable
        public final String getRedirectUrlType() {
            return this.redirectUrlType;
        }

        public BuyResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BuyResponseExtension buyResponseExtension) {
            this.orderId = str;
            this.redirectUrl = str2;
            this.redirectUrlType = str3;
            this.ext = buyResponseExtension;
        }
    }

    /* JADX INFO: compiled from: BankCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponseExtension;", "", "redirectUrlData", "", "delayTimeSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectUrlData", "()Ljava/lang/String;", "getDelayTimeSeconds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BuyResponseExtension {

        @NotNull
        public static final String TYPE_COLLECT_INFO = "REDIRECT_COLLECT_INFO_URL";

        @SerializedName("delayTimeSeconds")
        @Nullable
        private final String delayTimeSeconds;

        @SerializedName("redirectUrlData")
        @Nullable
        private final String redirectUrlData;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyResponseExtension)) {
                return false;
            }
            BuyResponseExtension buyResponseExtension = (BuyResponseExtension) other;
            return Intrinsics.areEqual(this.redirectUrlData, buyResponseExtension.redirectUrlData) && Intrinsics.areEqual(this.delayTimeSeconds, buyResponseExtension.delayTimeSeconds);
        }

        public static /* synthetic */ BuyResponseExtension copy$default(BuyResponseExtension buyResponseExtension, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buyResponseExtension.redirectUrlData;
            }
            if ((i11 & 2) != 0) {
                str2 = buyResponseExtension.delayTimeSeconds;
            }
            return buyResponseExtension.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRedirectUrlData() {
            return this.redirectUrlData;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDelayTimeSeconds() {
            return this.delayTimeSeconds;
        }

        @NotNull
        public final BuyResponseExtension copy(@Nullable String redirectUrlData, @Nullable String delayTimeSeconds) {
            return new BuyResponseExtension(redirectUrlData, delayTimeSeconds);
        }

        @Nullable
        public final String getDelayTimeSeconds() {
            return this.delayTimeSeconds;
        }

        @Nullable
        public final String getRedirectUrlData() {
            return this.redirectUrlData;
        }

        public int hashCode() {
            String str = this.redirectUrlData;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.delayTimeSeconds;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BuyResponseExtension(redirectUrlData=" + this.redirectUrlData + ", delayTimeSeconds=" + this.delayTimeSeconds + ')';
        }

        public BuyResponseExtension(@Nullable String str, @Nullable String str2) {
            this.redirectUrlData = str;
            this.delayTimeSeconds = str2;
        }
    }

    /* JADX INFO: compiled from: BankCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard$DeleteRequest;", "", "cardId", "", "channelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getChannelType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DeleteRequest {

        @SerializedName("cardId")
        @Nullable
        private final String cardId;

        @SerializedName("channelType")
        @Nullable
        private final String channelType;

        public DeleteRequest(@Nullable String str, @Nullable String str2) {
            this.cardId = str;
            this.channelType = str2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteRequest)) {
                return false;
            }
            DeleteRequest deleteRequest = (DeleteRequest) other;
            return Intrinsics.areEqual(this.cardId, deleteRequest.cardId) && Intrinsics.areEqual(this.channelType, deleteRequest.channelType);
        }

        public static /* synthetic */ DeleteRequest copy$default(DeleteRequest deleteRequest, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = deleteRequest.cardId;
            }
            if ((i11 & 2) != 0) {
                str2 = deleteRequest.channelType;
            }
            return deleteRequest.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelType() {
            return this.channelType;
        }

        @NotNull
        public final DeleteRequest copy(@Nullable String cardId, @Nullable String channelType) {
            return new DeleteRequest(cardId, channelType);
        }

        @Nullable
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        public final String getChannelType() {
            return this.channelType;
        }

        public int hashCode() {
            String str = this.cardId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DeleteRequest(cardId=" + this.cardId + ", channelType=" + this.channelType + ')';
        }

        public /* synthetic */ DeleteRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? FastQuoteModel.PAY_BANK_CARD : str2);
        }
    }

    /* JADX INFO: compiled from: BankCard.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BankCard$SaveCvvRequest;", "", "cardToken", "", "cvv", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardToken", "()Ljava/lang/String;", "getCvv", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SaveCvvRequest {

        @SerializedName("cardToken")
        @Nullable
        private final String cardToken;

        @SerializedName("cvv")
        @Nullable
        private final String cvv;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveCvvRequest)) {
                return false;
            }
            SaveCvvRequest saveCvvRequest = (SaveCvvRequest) other;
            return Intrinsics.areEqual(this.cardToken, saveCvvRequest.cardToken) && Intrinsics.areEqual(this.cvv, saveCvvRequest.cvv);
        }

        public static /* synthetic */ SaveCvvRequest copy$default(SaveCvvRequest saveCvvRequest, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = saveCvvRequest.cardToken;
            }
            if ((i11 & 2) != 0) {
                str2 = saveCvvRequest.cvv;
            }
            return saveCvvRequest.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardToken() {
            return this.cardToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCvv() {
            return this.cvv;
        }

        @NotNull
        public final SaveCvvRequest copy(@Nullable String cardToken, @Nullable String cvv) {
            return new SaveCvvRequest(cardToken, cvv);
        }

        @Nullable
        public final String getCardToken() {
            return this.cardToken;
        }

        @Nullable
        public final String getCvv() {
            return this.cvv;
        }

        public int hashCode() {
            String str = this.cardToken;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cvv;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SaveCvvRequest(cardToken=" + this.cardToken + ", cvv=" + this.cvv + ')';
        }

        public SaveCvvRequest(@Nullable String str, @Nullable String str2) {
            this.cardToken = str;
            this.cvv = str2;
        }
    }
}
