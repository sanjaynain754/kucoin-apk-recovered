package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GuidePayment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/GuidePayment;", "", "<init>", "()V", "Request", "Response", "PaymentMethod", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GuidePayment {

    /* JADX INFO: compiled from: GuidePayment.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/GuidePayment$PaymentMethod;", "", "name", "", "iconUrl", "desc", "paymentMethod", "appRedirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIconUrl", "getDesc", "getPaymentMethod", "getAppRedirectUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PaymentMethod {

        @Nullable
        private final String appRedirectUrl;

        @Nullable
        private final String desc;

        @Nullable
        private final String iconUrl;

        @Nullable
        private final String name;

        @Nullable
        private final String paymentMethod;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return Intrinsics.areEqual(this.name, paymentMethod.name) && Intrinsics.areEqual(this.iconUrl, paymentMethod.iconUrl) && Intrinsics.areEqual(this.desc, paymentMethod.desc) && Intrinsics.areEqual(this.paymentMethod, paymentMethod.paymentMethod) && Intrinsics.areEqual(this.appRedirectUrl, paymentMethod.appRedirectUrl);
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paymentMethod.name;
            }
            if ((i11 & 2) != 0) {
                str2 = paymentMethod.iconUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = paymentMethod.desc;
            }
            if ((i11 & 8) != 0) {
                str4 = paymentMethod.paymentMethod;
            }
            if ((i11 & 16) != 0) {
                str5 = paymentMethod.appRedirectUrl;
            }
            String str6 = str5;
            String str7 = str3;
            return paymentMethod.copy(str, str2, str7, str4, str6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAppRedirectUrl() {
            return this.appRedirectUrl;
        }

        @NotNull
        public final PaymentMethod copy(@Nullable String name, @Nullable String iconUrl, @Nullable String desc, @Nullable String paymentMethod, @Nullable String appRedirectUrl) {
            return new PaymentMethod(name, iconUrl, desc, paymentMethod, appRedirectUrl);
        }

        @Nullable
        public final String getAppRedirectUrl() {
            return this.appRedirectUrl;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.desc;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.paymentMethod;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.appRedirectUrl;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PaymentMethod(name=" + this.name + ", iconUrl=" + this.iconUrl + ", desc=" + this.desc + ", paymentMethod=" + this.paymentMethod + ", appRedirectUrl=" + this.appRedirectUrl + ')';
        }

        public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.name = str;
            this.iconUrl = str2;
            this.desc = str3;
            this.paymentMethod = str4;
            this.appRedirectUrl = str5;
        }
    }

    /* JADX INFO: compiled from: GuidePayment.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;", "", FirebaseAnalytics.Param.CURRENCY, "", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getTradeType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String currency;

        @NotNull
        private final String tradeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.currency, request.currency) && Intrinsics.areEqual(this.tradeType, request.tradeType);
        }

        public Request(@NotNull String currency, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.currency = currency;
            this.tradeType = tradeType;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.currency;
            }
            if ((i11 & 2) != 0) {
                str2 = request.tradeType;
            }
            return request.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        public final Request copy(@NotNull String currency, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            return new Request(currency, tradeType);
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            return (this.currency.hashCode() * 31) + this.tradeType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(currency=" + this.currency + ", tradeType=" + this.tradeType + ')';
        }
    }

    /* JADX INFO: compiled from: GuidePayment.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "", "paymentMethodList", "", "Lcom/kubi/payment/channel/data/entities/GuidePayment$PaymentMethod;", "<init>", "(Ljava/util/List;)V", "getPaymentMethodList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final List<PaymentMethod> paymentMethodList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.paymentMethodList, ((Response) other).paymentMethodList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = response.paymentMethodList;
            }
            return response.copy(list);
        }

        @Nullable
        public final List<PaymentMethod> component1() {
            return this.paymentMethodList;
        }

        @NotNull
        public final Response copy(@Nullable List<PaymentMethod> paymentMethodList) {
            return new Response(paymentMethodList);
        }

        @Nullable
        public final List<PaymentMethod> getPaymentMethodList() {
            return this.paymentMethodList;
        }

        public int hashCode() {
            List<PaymentMethod> list = this.paymentMethodList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(paymentMethodList=" + this.paymentMethodList + ')';
        }

        public Response(@Nullable List<PaymentMethod> list) {
            this.paymentMethodList = list;
        }
    }
}
