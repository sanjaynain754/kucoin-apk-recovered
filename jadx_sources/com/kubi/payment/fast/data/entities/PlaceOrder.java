package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlaceOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PlaceOrder;", "", "<init>", "()V", "PlaceOrderRequest", "Zen", "PlaceOrderResponse", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PlaceOrder {

    /* JADX INFO: compiled from: PlaceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0083\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00060"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderRequest;", "", "paymentType", "", "paymentMethodCode", "fiatCurrency", "fiatAmount", "cryptoCurrency", "quoteId", "forterMobileUID", "deviceBrand", "zen", "Lcom/kubi/payment/fast/data/entities/PlaceOrder$Zen;", "source", "rewardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PlaceOrder$Zen;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentType", "()Ljava/lang/String;", "getPaymentMethodCode", "getFiatCurrency", "getFiatAmount", "getCryptoCurrency", "getQuoteId", "getForterMobileUID", "getDeviceBrand", "getZen", "()Lcom/kubi/payment/fast/data/entities/PlaceOrder$Zen;", "getSource", "getRewardId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PlaceOrderRequest {

        @SerializedName("cryptoCurrency")
        @NotNull
        private final String cryptoCurrency;

        @SerializedName("deviceBrand")
        @Nullable
        private final String deviceBrand;

        @SerializedName("fiatAmount")
        @NotNull
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @NotNull
        private final String fiatCurrency;

        @SerializedName("forterMobileUID")
        @Nullable
        private final String forterMobileUID;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("paymentType")
        @Nullable
        private final String paymentType;

        @SerializedName("quoteId")
        @NotNull
        private final String quoteId;

        @SerializedName("rewardId")
        @Nullable
        private final String rewardId;

        @SerializedName("source")
        @NotNull
        private final String source;

        @SerializedName("zenExt")
        @Nullable
        private final Zen zen;

        public PlaceOrderRequest(@Nullable String str, @Nullable String str2, @NotNull String fiatCurrency, @NotNull String fiatAmount, @NotNull String cryptoCurrency, @NotNull String quoteId, @Nullable String str3, @Nullable String str4, @Nullable Zen zen, @NotNull String source, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(quoteId, "quoteId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.paymentType = str;
            this.paymentMethodCode = str2;
            this.fiatCurrency = fiatCurrency;
            this.fiatAmount = fiatAmount;
            this.cryptoCurrency = cryptoCurrency;
            this.quoteId = quoteId;
            this.forterMobileUID = str3;
            this.deviceBrand = str4;
            this.zen = zen;
            this.source = source;
            this.rewardId = str5;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaceOrderRequest)) {
                return false;
            }
            PlaceOrderRequest placeOrderRequest = (PlaceOrderRequest) other;
            return Intrinsics.areEqual(this.paymentType, placeOrderRequest.paymentType) && Intrinsics.areEqual(this.paymentMethodCode, placeOrderRequest.paymentMethodCode) && Intrinsics.areEqual(this.fiatCurrency, placeOrderRequest.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, placeOrderRequest.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, placeOrderRequest.cryptoCurrency) && Intrinsics.areEqual(this.quoteId, placeOrderRequest.quoteId) && Intrinsics.areEqual(this.forterMobileUID, placeOrderRequest.forterMobileUID) && Intrinsics.areEqual(this.deviceBrand, placeOrderRequest.deviceBrand) && Intrinsics.areEqual(this.zen, placeOrderRequest.zen) && Intrinsics.areEqual(this.source, placeOrderRequest.source) && Intrinsics.areEqual(this.rewardId, placeOrderRequest.rewardId);
        }

        public static /* synthetic */ PlaceOrderRequest copy$default(PlaceOrderRequest placeOrderRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Zen zen, String str9, String str10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = placeOrderRequest.paymentType;
            }
            if ((i11 & 2) != 0) {
                str2 = placeOrderRequest.paymentMethodCode;
            }
            if ((i11 & 4) != 0) {
                str3 = placeOrderRequest.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = placeOrderRequest.fiatAmount;
            }
            if ((i11 & 16) != 0) {
                str5 = placeOrderRequest.cryptoCurrency;
            }
            if ((i11 & 32) != 0) {
                str6 = placeOrderRequest.quoteId;
            }
            if ((i11 & 64) != 0) {
                str7 = placeOrderRequest.forterMobileUID;
            }
            if ((i11 & 128) != 0) {
                str8 = placeOrderRequest.deviceBrand;
            }
            if ((i11 & 256) != 0) {
                zen = placeOrderRequest.zen;
            }
            if ((i11 & 512) != 0) {
                str9 = placeOrderRequest.source;
            }
            if ((i11 & 1024) != 0) {
                str10 = placeOrderRequest.rewardId;
            }
            String str11 = str9;
            String str12 = str10;
            String str13 = str8;
            Zen zen2 = zen;
            String str14 = str6;
            String str15 = str7;
            String str16 = str5;
            String str17 = str3;
            return placeOrderRequest.copy(str, str2, str17, str4, str16, str14, str15, str13, zen2, str11, str12);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentType() {
            return this.paymentType;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getForterMobileUID() {
            return this.forterMobileUID;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getDeviceBrand() {
            return this.deviceBrand;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Zen getZen() {
            return this.zen;
        }

        @NotNull
        public final PlaceOrderRequest copy(@Nullable String paymentType, @Nullable String paymentMethodCode, @NotNull String fiatCurrency, @NotNull String fiatAmount, @NotNull String cryptoCurrency, @NotNull String quoteId, @Nullable String forterMobileUID, @Nullable String deviceBrand, @Nullable Zen zen, @NotNull String source, @Nullable String rewardId) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(quoteId, "quoteId");
            Intrinsics.checkNotNullParameter(source, "source");
            return new PlaceOrderRequest(paymentType, paymentMethodCode, fiatCurrency, fiatAmount, cryptoCurrency, quoteId, forterMobileUID, deviceBrand, zen, source, rewardId);
        }

        @NotNull
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getDeviceBrand() {
            return this.deviceBrand;
        }

        @NotNull
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @NotNull
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final String getForterMobileUID() {
            return this.forterMobileUID;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        public final String getPaymentType() {
            return this.paymentType;
        }

        @NotNull
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        public final String getRewardId() {
            return this.rewardId;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        @Nullable
        public final Zen getZen() {
            return this.zen;
        }

        public int hashCode() {
            String str = this.paymentType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.paymentMethodCode;
            int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fiatCurrency.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + this.cryptoCurrency.hashCode()) * 31) + this.quoteId.hashCode()) * 31;
            String str3 = this.forterMobileUID;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deviceBrand;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Zen zen = this.zen;
            int iHashCode5 = (((iHashCode4 + (zen == null ? 0 : zen.hashCode())) * 31) + this.source.hashCode()) * 31;
            String str5 = this.rewardId;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PlaceOrderRequest(paymentType=" + this.paymentType + ", paymentMethodCode=" + this.paymentMethodCode + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", quoteId=" + this.quoteId + ", forterMobileUID=" + this.forterMobileUID + ", deviceBrand=" + this.deviceBrand + ", zen=" + this.zen + ", source=" + this.source + ", rewardId=" + this.rewardId + ')';
        }

        public /* synthetic */ PlaceOrderRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Zen zen, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i11 & 256) != 0 ? null : zen, (i11 & 512) != 0 ? "ANDROID" : str9, (i11 & 1024) != 0 ? null : str10);
        }
    }

    /* JADX INFO: compiled from: PlaceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PlaceOrder$PlaceOrderResponse;", "", "orderId", "", "orderToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getOrderToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PlaceOrderResponse {

        @SerializedName("orderId")
        @Nullable
        private final String orderId;

        @SerializedName("orderToken")
        @Nullable
        private final String orderToken;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaceOrderResponse)) {
                return false;
            }
            PlaceOrderResponse placeOrderResponse = (PlaceOrderResponse) other;
            return Intrinsics.areEqual(this.orderId, placeOrderResponse.orderId) && Intrinsics.areEqual(this.orderToken, placeOrderResponse.orderToken);
        }

        public static /* synthetic */ PlaceOrderResponse copy$default(PlaceOrderResponse placeOrderResponse, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = placeOrderResponse.orderId;
            }
            if ((i11 & 2) != 0) {
                str2 = placeOrderResponse.orderToken;
            }
            return placeOrderResponse.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOrderToken() {
            return this.orderToken;
        }

        @NotNull
        public final PlaceOrderResponse copy(@Nullable String orderId, @Nullable String orderToken) {
            return new PlaceOrderResponse(orderId, orderToken);
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final String getOrderToken() {
            return this.orderToken;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.orderToken;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PlaceOrderResponse(orderId=" + this.orderId + ", orderToken=" + this.orderToken + ')';
        }

        public PlaceOrderResponse(@Nullable String str, @Nullable String str2) {
            this.orderId = str;
            this.orderToken = str2;
        }
    }

    /* JADX INFO: compiled from: PlaceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PlaceOrder$Zen;", "", "verifyCode", "", "<init>", "(Ljava/lang/String;)V", "getVerifyCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Zen {

        @SerializedName("verifyCode")
        @Nullable
        private final String verifyCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Zen) && Intrinsics.areEqual(this.verifyCode, ((Zen) other).verifyCode);
        }

        public static /* synthetic */ Zen copy$default(Zen zen, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = zen.verifyCode;
            }
            return zen.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVerifyCode() {
            return this.verifyCode;
        }

        @NotNull
        public final Zen copy(@Nullable String verifyCode) {
            return new Zen(verifyCode);
        }

        @Nullable
        public final String getVerifyCode() {
            return this.verifyCode;
        }

        public int hashCode() {
            String str = this.verifyCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Zen(verifyCode=" + this.verifyCode + ')';
        }

        public Zen(@Nullable String str) {
            this.verifyCode = str;
        }
    }
}
