package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.payment.data.entities.Fee;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreviewWithdrawOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreviewWithdrawOrder {

    /* JADX INFO: compiled from: PreviewWithdrawOrder.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;", "", "paymentMethodCode", "", "channelId", FirebaseAnalytics.Param.CURRENCY, "accountId", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getCurrency", "getAccountId", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("accountId")
        @Nullable
        private final String accountId;

        @SerializedName("amount")
        @Nullable
        private final String amount;

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private final String currency;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.currency, request.currency) && Intrinsics.areEqual(this.accountId, request.accountId) && Intrinsics.areEqual(this.amount, request.amount);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = request.channelId;
            }
            if ((i11 & 4) != 0) {
                str3 = request.currency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.accountId;
            }
            if ((i11 & 16) != 0) {
                str5 = request.amount;
            }
            String str6 = str5;
            String str7 = str3;
            return request.copy(str, str2, str7, str4, str6);
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
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final Request copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String currency, @Nullable String accountId, @Nullable String amount) {
            return new Request(paymentMethodCode, channelId, currency, accountId, amount);
        }

        @Nullable
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            String str = this.paymentMethodCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accountId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.amount;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", currency=" + this.currency + ", accountId=" + this.accountId + ", amount=" + this.amount + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.paymentMethodCode = str;
            this.channelId = str2;
            this.currency = str3;
            this.accountId = str4;
            this.amount = str5;
        }
    }

    /* JADX INFO: compiled from: PreviewWithdrawOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0099\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00063"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "", "paymentMethodCode", "", "channelId", "accountId", "accountName", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "fiatCurrency", "amount", "feeAmount", "feeCurrency", "deductedAmount", "deductedCurrency", "feeResponse", "Lcom/kubi/payment/data/entities/Fee$Response;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/data/entities/Fee$Response;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getAccountId", "getAccountName", "getDescription", "getFiatCurrency", "getAmount", "getFeeAmount", "getFeeCurrency", "getDeductedAmount", "getDeductedCurrency", "getFeeResponse", "()Lcom/kubi/payment/data/entities/Fee$Response;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("accountId")
        @Nullable
        private final String accountId;

        @SerializedName("channelName")
        @Nullable
        private final String accountName;

        @SerializedName("amount")
        @Nullable
        private final String amount;

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

        @SerializedName("deductedAmount")
        @Nullable
        private final String deductedAmount;

        @SerializedName("deductedCurrency")
        @Nullable
        private final String deductedCurrency;

        @SerializedName("accountDesc")
        @Nullable
        private final String description;

        @SerializedName("feeAmount")
        @Nullable
        private final String feeAmount;

        @SerializedName("feeCurrency")
        @Nullable
        private final String feeCurrency;

        @SerializedName("feeResponse")
        @Nullable
        private final Fee.Response feeResponse;

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private final String fiatCurrency;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.paymentMethodCode, response.paymentMethodCode) && Intrinsics.areEqual(this.channelId, response.channelId) && Intrinsics.areEqual(this.accountId, response.accountId) && Intrinsics.areEqual(this.accountName, response.accountName) && Intrinsics.areEqual(this.description, response.description) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.amount, response.amount) && Intrinsics.areEqual(this.feeAmount, response.feeAmount) && Intrinsics.areEqual(this.feeCurrency, response.feeCurrency) && Intrinsics.areEqual(this.deductedAmount, response.deductedAmount) && Intrinsics.areEqual(this.deductedCurrency, response.deductedCurrency) && Intrinsics.areEqual(this.feeResponse, response.feeResponse);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Fee.Response response2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = response.channelId;
            }
            if ((i11 & 4) != 0) {
                str3 = response.accountId;
            }
            if ((i11 & 8) != 0) {
                str4 = response.accountName;
            }
            if ((i11 & 16) != 0) {
                str5 = response.description;
            }
            if ((i11 & 32) != 0) {
                str6 = response.fiatCurrency;
            }
            if ((i11 & 64) != 0) {
                str7 = response.amount;
            }
            if ((i11 & 128) != 0) {
                str8 = response.feeAmount;
            }
            if ((i11 & 256) != 0) {
                str9 = response.feeCurrency;
            }
            if ((i11 & 512) != 0) {
                str10 = response.deductedAmount;
            }
            if ((i11 & 1024) != 0) {
                str11 = response.deductedCurrency;
            }
            if ((i11 & 2048) != 0) {
                response2 = response.feeResponse;
            }
            String str12 = str11;
            Fee.Response response3 = response2;
            String str13 = str9;
            String str14 = str10;
            String str15 = str7;
            String str16 = str8;
            String str17 = str5;
            String str18 = str6;
            return response.copy(str, str2, str3, str4, str17, str18, str15, str16, str13, str14, str12, response3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getDeductedAmount() {
            return this.deductedAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getDeductedCurrency() {
            return this.deductedCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Fee.Response getFeeResponse() {
            return this.feeResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @NotNull
        public final Response copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String accountId, @Nullable String accountName, @Nullable String description, @Nullable String fiatCurrency, @Nullable String amount, @Nullable String feeAmount, @Nullable String feeCurrency, @Nullable String deductedAmount, @Nullable String deductedCurrency, @Nullable Fee.Response feeResponse) {
            return new Response(paymentMethodCode, channelId, accountId, accountName, description, fiatCurrency, amount, feeAmount, feeCurrency, deductedAmount, deductedCurrency, feeResponse);
        }

        @Nullable
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final String getDeductedAmount() {
            return this.deductedAmount;
        }

        @Nullable
        public final String getDeductedCurrency() {
            return this.deductedCurrency;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
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
        public final Fee.Response getFeeResponse() {
            return this.feeResponse;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            String str = this.paymentMethodCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accountName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.description;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.fiatCurrency;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.amount;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.feeAmount;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.feeCurrency;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.deductedAmount;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.deductedCurrency;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Fee.Response response = this.feeResponse;
            return iHashCode11 + (response != null ? response.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", accountId=" + this.accountId + ", accountName=" + this.accountName + ", description=" + this.description + ", fiatCurrency=" + this.fiatCurrency + ", amount=" + this.amount + ", feeAmount=" + this.feeAmount + ", feeCurrency=" + this.feeCurrency + ", deductedAmount=" + this.deductedAmount + ", deductedCurrency=" + this.deductedCurrency + ", feeResponse=" + this.feeResponse + ')';
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Fee.Response response) {
            this.paymentMethodCode = str;
            this.channelId = str2;
            this.accountId = str3;
            this.accountName = str4;
            this.description = str5;
            this.fiatCurrency = str6;
            this.amount = str7;
            this.feeAmount = str8;
            this.feeCurrency = str9;
            this.deductedAmount = str10;
            this.deductedCurrency = str11;
            this.feeResponse = response;
        }
    }
}
