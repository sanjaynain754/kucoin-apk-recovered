package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatCouponInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponInfo;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatCouponInfo {

    /* JADX INFO: compiled from: FiatCouponInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Request;", "", "bizType", "", "fiatCurrency", "cryptoCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getFiatCurrency", "getCryptoCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final String bizType;

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String fiatCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.bizType, request.bizType) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.bizType;
            }
            if ((i11 & 2) != 0) {
                str2 = request.fiatCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = request.cryptoCurrency;
            }
            return request.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBizType() {
            return this.bizType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @NotNull
        public final Request copy(@Nullable String bizType, @Nullable String fiatCurrency, @Nullable String cryptoCurrency) {
            return new Request(bizType, fiatCurrency, cryptoCurrency);
        }

        @Nullable
        public final String getBizType() {
            return this.bizType;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        public int hashCode() {
            String str = this.bizType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cryptoCurrency;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(bizType=" + this.bizType + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.bizType = str;
            this.fiatCurrency = str2;
            this.cryptoCurrency = str3;
        }
    }

    /* JADX INFO: compiled from: FiatCouponInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jn\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u0006+"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "", "needShow", "", "expireTime", "", "discountRate", "", "amount", FirebaseAnalytics.Param.CURRENCY, "paymentMethodName", "prizeName", "frequency", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNeedShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDiscountRate", "()Ljava/lang/String;", "getAmount", "getCurrency", "getPaymentMethodName", "getPrizeName", "getFrequency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final String amount;

        @Nullable
        private final String currency;

        @Nullable
        private final String discountRate;

        @Nullable
        private final Long expireTime;

        @Nullable
        private final String frequency;

        @Nullable
        private final Boolean needShow;

        @Nullable
        private final String paymentMethodName;

        @Nullable
        private final String prizeName;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.needShow, response.needShow) && Intrinsics.areEqual(this.expireTime, response.expireTime) && Intrinsics.areEqual(this.discountRate, response.discountRate) && Intrinsics.areEqual(this.amount, response.amount) && Intrinsics.areEqual(this.currency, response.currency) && Intrinsics.areEqual(this.paymentMethodName, response.paymentMethodName) && Intrinsics.areEqual(this.prizeName, response.prizeName) && Intrinsics.areEqual(this.frequency, response.frequency);
        }

        public static /* synthetic */ Response copy$default(Response response, Boolean bool, Long l11, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = response.needShow;
            }
            if ((i11 & 2) != 0) {
                l11 = response.expireTime;
            }
            if ((i11 & 4) != 0) {
                str = response.discountRate;
            }
            if ((i11 & 8) != 0) {
                str2 = response.amount;
            }
            if ((i11 & 16) != 0) {
                str3 = response.currency;
            }
            if ((i11 & 32) != 0) {
                str4 = response.paymentMethodName;
            }
            if ((i11 & 64) != 0) {
                str5 = response.prizeName;
            }
            if ((i11 & 128) != 0) {
                str6 = response.frequency;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str3;
            String str10 = str4;
            return response.copy(bool, l11, str, str2, str9, str10, str7, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getNeedShow() {
            return this.needShow;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDiscountRate() {
            return this.discountRate;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPrizeName() {
            return this.prizeName;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        @NotNull
        public final Response copy(@Nullable Boolean needShow, @Nullable Long expireTime, @Nullable String discountRate, @Nullable String amount, @Nullable String currency, @Nullable String paymentMethodName, @Nullable String prizeName, @Nullable String frequency) {
            return new Response(needShow, expireTime, discountRate, amount, currency, paymentMethodName, prizeName, frequency);
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getDiscountRate() {
            return this.discountRate;
        }

        @Nullable
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        public final String getFrequency() {
            return this.frequency;
        }

        @Nullable
        public final Boolean getNeedShow() {
            return this.needShow;
        }

        @Nullable
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        public final String getPrizeName() {
            return this.prizeName;
        }

        public int hashCode() {
            Boolean bool = this.needShow;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l11 = this.expireTime;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.discountRate;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.amount;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currency;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.paymentMethodName;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.prizeName;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.frequency;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(needShow=" + this.needShow + ", expireTime=" + this.expireTime + ", discountRate=" + this.discountRate + ", amount=" + this.amount + ", currency=" + this.currency + ", paymentMethodName=" + this.paymentMethodName + ", prizeName=" + this.prizeName + ", frequency=" + this.frequency + ')';
        }

        public Response(@Nullable Boolean bool, @Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.needShow = bool;
            this.expireTime = l11;
            this.discountRate = str;
            this.amount = str2;
            this.currency = str3;
            this.paymentMethodName = str4;
            this.prizeName = str5;
            this.frequency = str6;
        }
    }
}
