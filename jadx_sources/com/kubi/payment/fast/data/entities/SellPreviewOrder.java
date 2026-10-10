package com.kubi.payment.fast.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellPreviewOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPreviewOrder;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellPreviewOrder {

    /* JADX INFO: compiled from: SellPreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Request;", "", "paymentMethodCode", "", "channelId", "fiatCurrency", "cryptoCurrency", "cryptoAmount", "paymentMethodName", "cardId", "adId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getFiatCurrency", "getCryptoCurrency", "getCryptoAmount", "getPaymentMethodName", "getCardId", "getAdId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("adId")
        @Nullable
        private final String adId;

        @SerializedName("cardId")
        @Nullable
        private final String cardId;

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("name")
        @Nullable
        private final String paymentMethodName;

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.paymentMethodCode = str;
            this.channelId = str2;
            this.fiatCurrency = str3;
            this.cryptoCurrency = str4;
            this.cryptoAmount = str5;
            this.paymentMethodName = str6;
            this.cardId = str7;
            this.adId = str8;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, request.cryptoAmount) && Intrinsics.areEqual(this.paymentMethodName, request.paymentMethodName) && Intrinsics.areEqual(this.cardId, request.cardId) && Intrinsics.areEqual(this.adId, request.adId);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = request.channelId;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.cryptoAmount;
            }
            if ((i11 & 32) != 0) {
                str6 = request.paymentMethodName;
            }
            if ((i11 & 64) != 0) {
                str7 = request.cardId;
            }
            if ((i11 & 128) != 0) {
                str8 = request.adId;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            return request.copy(str, str2, str3, str4, str11, str12, str9, str10);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
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

        @NotNull
        public final Request copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String paymentMethodName, @Nullable String cardId, @Nullable String adId) {
            return new Request(paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, cryptoAmount, paymentMethodName, cardId, adId);
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
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        public int hashCode() {
            String str = this.paymentMethodCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoAmount;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.paymentMethodName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardId;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.adId;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", paymentMethodName=" + this.paymentMethodName + ", cardId=" + this.cardId + ", adId=" + this.adId + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8);
        }
    }

    /* JADX INFO: compiled from: SellPreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002<=B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u009e\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0004\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006>"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "", "quoteId", "", "isProtected", "", "fiatCurrency", "fiatAmount", "cryptoCurrency", "cryptoAmount", FirebaseAnalytics.Param.PRICE, "expireTime", "", "paymentMethodName", "feeInfo", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$FeeInfo;", "taxInfo", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;", "merchantInfo", "Lcom/kubi/payment/fast/data/entities/MerchantInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$FeeInfo;Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;Lcom/kubi/payment/fast/data/entities/MerchantInfo;)V", "getQuoteId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFiatCurrency", "getFiatAmount", "getCryptoCurrency", "getCryptoAmount", "getPrice", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPaymentMethodName", "getFeeInfo", "()Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$FeeInfo;", "getTaxInfo", "()Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;", "getMerchantInfo", "()Lcom/kubi/payment/fast/data/entities/MerchantInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$FeeInfo;Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;Lcom/kubi/payment/fast/data/entities/MerchantInfo;)Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "equals", "other", "hashCode", "", "toString", "FeeInfo", "TaxInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("quoteExpireTime")
        @Nullable
        private final Long expireTime;

        @SerializedName("feeInfo")
        @Nullable
        private final FeeInfo feeInfo;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("priceLock")
        @Nullable
        private final Boolean isProtected;

        @Nullable
        private final MerchantInfo merchantInfo;

        @SerializedName("name")
        @Nullable
        private final String paymentMethodName;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final String price;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        @SerializedName("taxInfo")
        @Nullable
        private final TaxInfo taxInfo;

        /* JADX INFO: compiled from: SellPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$FeeInfo;", "Landroid/os/Parcelable;", "feeCurrency", "", "feeAmount", "feeMessage", "maxFee", "minFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeCurrency", "()Ljava/lang/String;", "getFeeAmount", "getFeeMessage", "getMaxFee", "getMinFee", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class FeeInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FeeInfo> CREATOR = new C20504a();

            @SerializedName("feeAmount")
            @Nullable
            private final String feeAmount;

            @SerializedName("feeCurrency")
            @Nullable
            private final String feeCurrency;

            @SerializedName("feeMsg")
            @Nullable
            private final String feeMessage;

            @Nullable
            private final String maxFee;

            @Nullable
            private final String minFee;

            /* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.SellPreviewOrder$Response$FeeInfo$a */
            /* JADX INFO: compiled from: SellPreviewOrder.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class C20504a implements Parcelable.Creator<FeeInfo> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FeeInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FeeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final FeeInfo[] newArray(int i11) {
                    return new FeeInfo[i11];
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
                if (!(other instanceof FeeInfo)) {
                    return false;
                }
                FeeInfo feeInfo = (FeeInfo) other;
                return Intrinsics.areEqual(this.feeCurrency, feeInfo.feeCurrency) && Intrinsics.areEqual(this.feeAmount, feeInfo.feeAmount) && Intrinsics.areEqual(this.feeMessage, feeInfo.feeMessage) && Intrinsics.areEqual(this.maxFee, feeInfo.maxFee) && Intrinsics.areEqual(this.minFee, feeInfo.minFee);
            }

            public static /* synthetic */ FeeInfo copy$default(FeeInfo feeInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = feeInfo.feeCurrency;
                }
                if ((i11 & 2) != 0) {
                    str2 = feeInfo.feeAmount;
                }
                if ((i11 & 4) != 0) {
                    str3 = feeInfo.feeMessage;
                }
                if ((i11 & 8) != 0) {
                    str4 = feeInfo.maxFee;
                }
                if ((i11 & 16) != 0) {
                    str5 = feeInfo.minFee;
                }
                String str6 = str5;
                String str7 = str3;
                return feeInfo.copy(str, str2, str7, str4, str6);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFeeCurrency() {
                return this.feeCurrency;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getFeeAmount() {
                return this.feeAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getFeeMessage() {
                return this.feeMessage;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getMaxFee() {
                return this.maxFee;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getMinFee() {
                return this.minFee;
            }

            @NotNull
            public final FeeInfo copy(@Nullable String feeCurrency, @Nullable String feeAmount, @Nullable String feeMessage, @Nullable String maxFee, @Nullable String minFee) {
                return new FeeInfo(feeCurrency, feeAmount, feeMessage, maxFee, minFee);
            }

            @Nullable
            public final String getFeeAmount() {
                return this.feeAmount;
            }

            @Nullable
            public final String getFeeCurrency() {
                return this.feeCurrency;
            }

            @Nullable
            public final String getFeeMessage() {
                return this.feeMessage;
            }

            @Nullable
            public final String getMaxFee() {
                return this.maxFee;
            }

            @Nullable
            public final String getMinFee() {
                return this.minFee;
            }

            public int hashCode() {
                String str = this.feeCurrency;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.feeAmount;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.feeMessage;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.maxFee;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.minFee;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "FeeInfo(feeCurrency=" + this.feeCurrency + ", feeAmount=" + this.feeAmount + ", feeMessage=" + this.feeMessage + ", maxFee=" + this.maxFee + ", minFee=" + this.minFee + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.feeCurrency);
                dest.writeString(this.feeAmount);
                dest.writeString(this.feeMessage);
                dest.writeString(this.maxFee);
                dest.writeString(this.minFee);
            }

            public FeeInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                this.feeCurrency = str;
                this.feeAmount = str2;
                this.feeMessage = str3;
                this.maxFee = str4;
                this.minFee = str5;
            }
        }

        /* JADX INFO: compiled from: SellPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;", "", "taxMessage", "", "taxCurrency", "taxRate", "title", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, BridgeParamKeyKt.SHARE_KEY_LINKURL, "needConfirm", "", "appTradeProductUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getTaxMessage", "()Ljava/lang/String;", "getTaxCurrency", "getTaxRate", "getTitle", "getDescription", "getLinkUrl", "getNeedConfirm", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppTradeProductUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class TaxInfo {

            @SerializedName("appTradeProductUrl")
            @Nullable
            private final String appTradeProductUrl;

            @SerializedName("userListRemindDesc")
            @Nullable
            private final String description;

            @SerializedName("userListRemindAppUrl")
            @Nullable
            private final String linkUrl;

            @SerializedName("needConfirm")
            @Nullable
            private final Boolean needConfirm;

            @SerializedName("taxCurrency")
            @Nullable
            private final String taxCurrency;

            @SerializedName("taxMsg")
            @Nullable
            private final String taxMessage;

            @SerializedName("taxRate")
            @Nullable
            private final String taxRate;

            @SerializedName("userListRemindTitle")
            @Nullable
            private final String title;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxInfo)) {
                    return false;
                }
                TaxInfo taxInfo = (TaxInfo) other;
                return Intrinsics.areEqual(this.taxMessage, taxInfo.taxMessage) && Intrinsics.areEqual(this.taxCurrency, taxInfo.taxCurrency) && Intrinsics.areEqual(this.taxRate, taxInfo.taxRate) && Intrinsics.areEqual(this.title, taxInfo.title) && Intrinsics.areEqual(this.description, taxInfo.description) && Intrinsics.areEqual(this.linkUrl, taxInfo.linkUrl) && Intrinsics.areEqual(this.needConfirm, taxInfo.needConfirm) && Intrinsics.areEqual(this.appTradeProductUrl, taxInfo.appTradeProductUrl);
            }

            public static /* synthetic */ TaxInfo copy$default(TaxInfo taxInfo, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = taxInfo.taxMessage;
                }
                if ((i11 & 2) != 0) {
                    str2 = taxInfo.taxCurrency;
                }
                if ((i11 & 4) != 0) {
                    str3 = taxInfo.taxRate;
                }
                if ((i11 & 8) != 0) {
                    str4 = taxInfo.title;
                }
                if ((i11 & 16) != 0) {
                    str5 = taxInfo.description;
                }
                if ((i11 & 32) != 0) {
                    str6 = taxInfo.linkUrl;
                }
                if ((i11 & 64) != 0) {
                    bool = taxInfo.needConfirm;
                }
                if ((i11 & 128) != 0) {
                    str7 = taxInfo.appTradeProductUrl;
                }
                Boolean bool2 = bool;
                String str8 = str7;
                String str9 = str5;
                String str10 = str6;
                return taxInfo.copy(str, str2, str3, str4, str9, str10, bool2, str8);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getTaxMessage() {
                return this.taxMessage;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTaxCurrency() {
                return this.taxCurrency;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getTaxRate() {
                return this.taxRate;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getLinkUrl() {
                return this.linkUrl;
            }

            @Nullable
            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Boolean getNeedConfirm() {
                return this.needConfirm;
            }

            @Nullable
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getAppTradeProductUrl() {
                return this.appTradeProductUrl;
            }

            @NotNull
            public final TaxInfo copy(@Nullable String taxMessage, @Nullable String taxCurrency, @Nullable String taxRate, @Nullable String title, @Nullable String description, @Nullable String linkUrl, @Nullable Boolean needConfirm, @Nullable String appTradeProductUrl) {
                return new TaxInfo(taxMessage, taxCurrency, taxRate, title, description, linkUrl, needConfirm, appTradeProductUrl);
            }

            @Nullable
            public final String getAppTradeProductUrl() {
                return this.appTradeProductUrl;
            }

            @Nullable
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            public final String getLinkUrl() {
                return this.linkUrl;
            }

            @Nullable
            public final Boolean getNeedConfirm() {
                return this.needConfirm;
            }

            @Nullable
            public final String getTaxCurrency() {
                return this.taxCurrency;
            }

            @Nullable
            public final String getTaxMessage() {
                return this.taxMessage;
            }

            @Nullable
            public final String getTaxRate() {
                return this.taxRate;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.taxMessage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.taxCurrency;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.taxRate;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.title;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.description;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.linkUrl;
                int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                Boolean bool = this.needConfirm;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str7 = this.appTradeProductUrl;
                return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TaxInfo(taxMessage=" + this.taxMessage + ", taxCurrency=" + this.taxCurrency + ", taxRate=" + this.taxRate + ", title=" + this.title + ", description=" + this.description + ", linkUrl=" + this.linkUrl + ", needConfirm=" + this.needConfirm + ", appTradeProductUrl=" + this.appTradeProductUrl + ')';
            }

            public TaxInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable String str7) {
                this.taxMessage = str;
                this.taxCurrency = str2;
                this.taxRate = str3;
                this.title = str4;
                this.description = str5;
                this.linkUrl = str6;
                this.needConfirm = bool;
                this.appTradeProductUrl = str7;
            }
        }

        public Response(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l11, @Nullable String str7, @Nullable FeeInfo feeInfo, @Nullable TaxInfo taxInfo, @Nullable MerchantInfo merchantInfo) {
            this.quoteId = str;
            this.isProtected = bool;
            this.fiatCurrency = str2;
            this.fiatAmount = str3;
            this.cryptoCurrency = str4;
            this.cryptoAmount = str5;
            this.price = str6;
            this.expireTime = l11;
            this.paymentMethodName = str7;
            this.feeInfo = feeInfo;
            this.taxInfo = taxInfo;
            this.merchantInfo = merchantInfo;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.quoteId, response.quoteId) && Intrinsics.areEqual(this.isProtected, response.isProtected) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, response.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, response.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, response.cryptoAmount) && Intrinsics.areEqual(this.price, response.price) && Intrinsics.areEqual(this.expireTime, response.expireTime) && Intrinsics.areEqual(this.paymentMethodName, response.paymentMethodName) && Intrinsics.areEqual(this.feeInfo, response.feeInfo) && Intrinsics.areEqual(this.taxInfo, response.taxInfo) && Intrinsics.areEqual(this.merchantInfo, response.merchantInfo);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, FeeInfo feeInfo, TaxInfo taxInfo, MerchantInfo merchantInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.quoteId;
            }
            if ((i11 & 2) != 0) {
                bool = response.isProtected;
            }
            if ((i11 & 4) != 0) {
                str2 = response.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str3 = response.fiatAmount;
            }
            if ((i11 & 16) != 0) {
                str4 = response.cryptoCurrency;
            }
            if ((i11 & 32) != 0) {
                str5 = response.cryptoAmount;
            }
            if ((i11 & 64) != 0) {
                str6 = response.price;
            }
            if ((i11 & 128) != 0) {
                l11 = response.expireTime;
            }
            if ((i11 & 256) != 0) {
                str7 = response.paymentMethodName;
            }
            if ((i11 & 512) != 0) {
                feeInfo = response.feeInfo;
            }
            if ((i11 & 1024) != 0) {
                taxInfo = response.taxInfo;
            }
            if ((i11 & 2048) != 0) {
                merchantInfo = response.merchantInfo;
            }
            TaxInfo taxInfo2 = taxInfo;
            MerchantInfo merchantInfo2 = merchantInfo;
            String str8 = str7;
            FeeInfo feeInfo2 = feeInfo;
            String str9 = str6;
            Long l12 = l11;
            String str10 = str4;
            String str11 = str5;
            return response.copy(str, bool, str2, str3, str10, str11, str9, l12, str8, feeInfo2, taxInfo2, merchantInfo2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final FeeInfo getFeeInfo() {
            return this.feeInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final TaxInfo getTaxInfo() {
            return this.taxInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsProtected() {
            return this.isProtected;
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
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @NotNull
        public final Response copy(@Nullable String quoteId, @Nullable Boolean isProtected, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String price, @Nullable Long expireTime, @Nullable String paymentMethodName, @Nullable FeeInfo feeInfo, @Nullable TaxInfo taxInfo, @Nullable MerchantInfo merchantInfo) {
            return new Response(quoteId, isProtected, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, price, expireTime, paymentMethodName, feeInfo, taxInfo, merchantInfo);
        }

        @Nullable
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        public final FeeInfo getFeeInfo() {
            return this.feeInfo;
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
        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        @Nullable
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        public final TaxInfo getTaxInfo() {
            return this.taxInfo;
        }

        public int hashCode() {
            String str = this.quoteId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isProtected;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatAmount;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoAmount;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.price;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.expireTime;
            int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str7 = this.paymentMethodName;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            FeeInfo feeInfo = this.feeInfo;
            int iHashCode10 = (iHashCode9 + (feeInfo == null ? 0 : feeInfo.hashCode())) * 31;
            TaxInfo taxInfo = this.taxInfo;
            int iHashCode11 = (iHashCode10 + (taxInfo == null ? 0 : taxInfo.hashCode())) * 31;
            MerchantInfo merchantInfo = this.merchantInfo;
            return iHashCode11 + (merchantInfo != null ? merchantInfo.hashCode() : 0);
        }

        @Nullable
        public final Boolean isProtected() {
            return this.isProtected;
        }

        @NotNull
        public String toString() {
            return "Response(quoteId=" + this.quoteId + ", isProtected=" + this.isProtected + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", price=" + this.price + ", expireTime=" + this.expireTime + ", paymentMethodName=" + this.paymentMethodName + ", feeInfo=" + this.feeInfo + ", taxInfo=" + this.taxInfo + ", merchantInfo=" + this.merchantInfo + ')';
        }

        public /* synthetic */ Response(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, FeeInfo feeInfo, TaxInfo taxInfo, MerchantInfo merchantInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, str2, str3, str4, str5, str6, l11, str7, feeInfo, (i11 & 1024) != 0 ? null : taxInfo, (i11 & 2048) != 0 ? null : merchantInfo);
        }
    }
}
