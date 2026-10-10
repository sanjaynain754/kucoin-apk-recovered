package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BalanceOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BalanceOrder;", "", "<init>", "()V", "BuyRequest", "SellRequest", "Response", "OrderDetail", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BalanceOrder {

    /* JADX INFO: compiled from: BalanceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BalanceOrder$BuyRequest;", "", "fiatCurrency", "", "fiatAmount", "cryptoCurrency", "quoteId", "clientFrom", "rewardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getFiatAmount", "getCryptoCurrency", "getQuoteId", "getClientFrom", "getRewardId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BuyRequest {

        @SerializedName("clientFrom")
        @Nullable
        private final String clientFrom;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        @Nullable
        private final String rewardId;

        public BuyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.fiatCurrency = str;
            this.fiatAmount = str2;
            this.cryptoCurrency = str3;
            this.quoteId = str4;
            this.clientFrom = str5;
            this.rewardId = str6;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyRequest)) {
                return false;
            }
            BuyRequest buyRequest = (BuyRequest) other;
            return Intrinsics.areEqual(this.fiatCurrency, buyRequest.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, buyRequest.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, buyRequest.cryptoCurrency) && Intrinsics.areEqual(this.quoteId, buyRequest.quoteId) && Intrinsics.areEqual(this.clientFrom, buyRequest.clientFrom) && Intrinsics.areEqual(this.rewardId, buyRequest.rewardId);
        }

        public static /* synthetic */ BuyRequest copy$default(BuyRequest buyRequest, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buyRequest.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = buyRequest.fiatAmount;
            }
            if ((i11 & 4) != 0) {
                str3 = buyRequest.cryptoCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = buyRequest.quoteId;
            }
            if ((i11 & 16) != 0) {
                str5 = buyRequest.clientFrom;
            }
            if ((i11 & 32) != 0) {
                str6 = buyRequest.rewardId;
            }
            String str7 = str5;
            String str8 = str6;
            return buyRequest.copy(str, str2, str3, str4, str7, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getClientFrom() {
            return this.clientFrom;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        @NotNull
        public final BuyRequest copy(@Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String cryptoCurrency, @Nullable String quoteId, @Nullable String clientFrom, @Nullable String rewardId) {
            return new BuyRequest(fiatCurrency, fiatAmount, cryptoCurrency, quoteId, clientFrom, rewardId);
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
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
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
            String str = this.fiatCurrency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatAmount;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cryptoCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.quoteId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientFrom;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.rewardId;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BuyRequest(fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", quoteId=" + this.quoteId + ", clientFrom=" + this.clientFrom + ", rewardId=" + this.rewardId + ')';
        }

        public /* synthetic */ BuyRequest(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? "ANDROID" : str5, (i11 & 32) != 0 ? null : str6);
        }
    }

    /* JADX INFO: compiled from: BalanceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "", "orderId", "", "orderStatus", "", "cryptoAmount", "cryptoCurrency", "errorMessage", "paymentMethodCode", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getOrderStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCryptoAmount", "getCryptoCurrency", "getErrorMessage", "getPaymentMethodCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "equals", "", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OrderDetail {

        @SerializedName("cryptoQuantity")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("displayErrorMsg")
        @Nullable
        private final String errorMessage;

        @SerializedName("orderId")
        @Nullable
        private final String orderId;

        @SerializedName("orderStatus")
        @Nullable
        private final Integer orderStatus;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderDetail)) {
                return false;
            }
            OrderDetail orderDetail = (OrderDetail) other;
            return Intrinsics.areEqual(this.orderId, orderDetail.orderId) && Intrinsics.areEqual(this.orderStatus, orderDetail.orderStatus) && Intrinsics.areEqual(this.cryptoAmount, orderDetail.cryptoAmount) && Intrinsics.areEqual(this.cryptoCurrency, orderDetail.cryptoCurrency) && Intrinsics.areEqual(this.errorMessage, orderDetail.errorMessage) && Intrinsics.areEqual(this.paymentMethodCode, orderDetail.paymentMethodCode);
        }

        public static /* synthetic */ OrderDetail copy$default(OrderDetail orderDetail, String str, Integer num, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = orderDetail.orderId;
            }
            if ((i11 & 2) != 0) {
                num = orderDetail.orderStatus;
            }
            if ((i11 & 4) != 0) {
                str2 = orderDetail.cryptoAmount;
            }
            if ((i11 & 8) != 0) {
                str3 = orderDetail.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str4 = orderDetail.errorMessage;
            }
            if ((i11 & 32) != 0) {
                str5 = orderDetail.paymentMethodCode;
            }
            String str6 = str4;
            String str7 = str5;
            return orderDetail.copy(str, num, str2, str3, str6, str7);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getOrderStatus() {
            return this.orderStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @NotNull
        public final OrderDetail copy(@Nullable String orderId, @Nullable Integer orderStatus, @Nullable String cryptoAmount, @Nullable String cryptoCurrency, @Nullable String errorMessage, @Nullable String paymentMethodCode) {
            return new OrderDetail(orderId, orderStatus, cryptoAmount, cryptoCurrency, errorMessage, paymentMethodCode);
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
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final Integer getOrderStatus() {
            return this.orderStatus;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.orderStatus;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.cryptoAmount;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorMessage;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.paymentMethodCode;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OrderDetail(orderId=" + this.orderId + ", orderStatus=" + this.orderStatus + ", cryptoAmount=" + this.cryptoAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", errorMessage=" + this.errorMessage + ", paymentMethodCode=" + this.paymentMethodCode + ')';
        }

        public OrderDetail(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.orderId = str;
            this.orderStatus = num;
            this.cryptoAmount = str2;
            this.cryptoCurrency = str3;
            this.errorMessage = str4;
            this.paymentMethodCode = str5;
        }
    }

    /* JADX INFO: compiled from: BalanceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BalanceOrder$Response;", "", "orderId", "", "<init>", "(Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("orderId")
        @Nullable
        private final String orderId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.orderId, ((Response) other).orderId);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.orderId;
            }
            return response.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @NotNull
        public final Response copy(@Nullable String orderId) {
            return new Response(orderId);
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            String str = this.orderId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(orderId=" + this.orderId + ')';
        }

        public Response(@Nullable String str) {
            this.orderId = str;
        }
    }

    /* JADX INFO: compiled from: BalanceOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BalanceOrder$SellRequest;", "", "fiatCurrency", "", "cryptoCurrency", "cryptoAmount", "quoteId", "clientFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getCryptoAmount", "getQuoteId", "getClientFrom", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SellRequest {

        @SerializedName("clientFrom")
        @Nullable
        private final String clientFrom;

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        public SellRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.fiatCurrency = str;
            this.cryptoCurrency = str2;
            this.cryptoAmount = str3;
            this.quoteId = str4;
            this.clientFrom = str5;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellRequest)) {
                return false;
            }
            SellRequest sellRequest = (SellRequest) other;
            return Intrinsics.areEqual(this.fiatCurrency, sellRequest.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, sellRequest.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, sellRequest.cryptoAmount) && Intrinsics.areEqual(this.quoteId, sellRequest.quoteId) && Intrinsics.areEqual(this.clientFrom, sellRequest.clientFrom);
        }

        public static /* synthetic */ SellRequest copy$default(SellRequest sellRequest, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sellRequest.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = sellRequest.cryptoCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = sellRequest.cryptoAmount;
            }
            if ((i11 & 8) != 0) {
                str4 = sellRequest.quoteId;
            }
            if ((i11 & 16) != 0) {
                str5 = sellRequest.clientFrom;
            }
            String str6 = str5;
            String str7 = str3;
            return sellRequest.copy(str, str2, str7, str4, str6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getClientFrom() {
            return this.clientFrom;
        }

        @NotNull
        public final SellRequest copy(@Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String quoteId, @Nullable String clientFrom) {
            return new SellRequest(fiatCurrency, cryptoCurrency, cryptoAmount, quoteId, clientFrom);
        }

        @Nullable
        public final String getClientFrom() {
            return this.clientFrom;
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
        public final String getQuoteId() {
            return this.quoteId;
        }

        public int hashCode() {
            String str = this.fiatCurrency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cryptoCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cryptoAmount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.quoteId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientFrom;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SellRequest(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", quoteId=" + this.quoteId + ", clientFrom=" + this.clientFrom + ')';
        }

        public /* synthetic */ SellRequest(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? "ANDROID" : str5);
        }
    }
}
