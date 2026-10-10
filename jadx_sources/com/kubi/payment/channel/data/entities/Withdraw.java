package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Withdraw.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/Withdraw;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Withdraw {

    /* JADX INFO: compiled from: Withdraw.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0003Jy\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR(\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/Withdraw$Request;", "", "amount", "", "paymentMethodCode", "channelId", "fiatCurrency", "paymentMethodName", "accountId", "source", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAmount", "()Ljava/lang/String;", "getPaymentMethodCode", "getChannelId", "getFiatCurrency", "getPaymentMethodName", "getAccountId", "getSource", "getExtra", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("payoutAccountId")
        @Nullable
        private final String accountId;

        @SerializedName("amount")
        @Nullable
        private final String amount;

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

        @SerializedName(JAnalysisConstants.ACCOUNT_EXTRA_ATTR)
        @Nullable
        private final Map<String, Object> extra;

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private final String fiatCurrency;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("paymentName")
        @Nullable
        private final String paymentMethodName;

        @Nullable
        private final String source;

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Map<String, ? extends Object> map) {
            this.amount = str;
            this.paymentMethodCode = str2;
            this.channelId = str3;
            this.fiatCurrency = str4;
            this.paymentMethodName = str5;
            this.accountId = str6;
            this.source = str7;
            this.extra = map;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.amount, request.amount) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.paymentMethodName, request.paymentMethodName) && Intrinsics.areEqual(this.accountId, request.accountId) && Intrinsics.areEqual(this.source, request.source) && Intrinsics.areEqual(this.extra, request.extra);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.amount;
            }
            if ((i11 & 2) != 0) {
                str2 = request.paymentMethodCode;
            }
            if ((i11 & 4) != 0) {
                str3 = request.channelId;
            }
            if ((i11 & 8) != 0) {
                str4 = request.fiatCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.paymentMethodName;
            }
            if ((i11 & 32) != 0) {
                str6 = request.accountId;
            }
            if ((i11 & 64) != 0) {
                str7 = request.source;
            }
            if ((i11 & 128) != 0) {
                map = request.extra;
            }
            String str8 = str7;
            Map map2 = map;
            String str9 = str5;
            String str10 = str6;
            return request.copy(str, str2, str3, str4, str9, str10, str8, map2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @Nullable
        public final Map<String, Object> component8() {
            return this.extra;
        }

        @NotNull
        public final Request copy(@Nullable String amount, @Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String fiatCurrency, @Nullable String paymentMethodName, @Nullable String accountId, @Nullable String source, @Nullable Map<String, ? extends Object> extra) {
            return new Request(amount, paymentMethodCode, channelId, fiatCurrency, paymentMethodName, accountId, source, extra);
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
        public final Map<String, Object> getExtra() {
            return this.extra;
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

        @Nullable
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            String str = this.amount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.paymentMethodCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.channelId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fiatCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.paymentMethodName;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.accountId;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.source;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Map<String, Object> map = this.extra;
            return iHashCode7 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(amount=" + this.amount + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", paymentMethodName=" + this.paymentMethodName + ", accountId=" + this.accountId + ", source=" + this.source + ", extra=" + this.extra + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? "android" : str7, (i11 & 128) != 0 ? null : map);
        }
    }

    /* JADX INFO: compiled from: Withdraw.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/Withdraw$Response;", "", "orderId", "", "fiatCurrency", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getFiatCurrency", "setFiatCurrency", "(Ljava/lang/String;)V", "getAmount", "setAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("amount")
        @Nullable
        private String amount;

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private String fiatCurrency;

        @SerializedName("payoutTrxnId")
        @Nullable
        private final String orderId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.orderId, response.orderId) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.amount, response.amount);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.orderId;
            }
            if ((i11 & 2) != 0) {
                str2 = response.fiatCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = response.amount;
            }
            return response.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final Response copy(@Nullable String orderId, @Nullable String fiatCurrency, @Nullable String amount) {
            return new Response(orderId, fiatCurrency, amount);
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.amount;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAmount(@Nullable String str) {
            this.amount = str;
        }

        public final void setFiatCurrency(@Nullable String str) {
            this.fiatCurrency = str;
        }

        @NotNull
        public String toString() {
            return "Response(orderId=" + this.orderId + ", fiatCurrency=" + this.fiatCurrency + ", amount=" + this.amount + ')';
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.orderId = str;
            this.fiatCurrency = str2;
            this.amount = str3;
        }
    }
}
