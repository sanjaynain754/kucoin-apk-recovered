package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatCouponDiscountInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatCouponDiscountInfo {

    /* JADX INFO: compiled from: FiatCouponDiscountInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Request;", "", "bizType", "", "side", "fiatCurrency", "cryptoCurrency", "paymentMethodCode", "cardId", "rewardId", "fiatAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getSide", "getFiatCurrency", "getCryptoCurrency", "getPaymentMethodCode", "getCardId", "getRewardId", "getFiatAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final String bizType;

        @Nullable
        private final String cardId;

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String fiatAmount;

        @Nullable
        private final String fiatCurrency;

        @Nullable
        private final String paymentMethodCode;

        @Nullable
        private final String rewardId;

        @Nullable
        private final String side;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.bizType, request.bizType) && Intrinsics.areEqual(this.side, request.side) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.cardId, request.cardId) && Intrinsics.areEqual(this.rewardId, request.rewardId) && Intrinsics.areEqual(this.fiatAmount, request.fiatAmount);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.bizType;
            }
            if ((i11 & 2) != 0) {
                str2 = request.side;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.paymentMethodCode;
            }
            if ((i11 & 32) != 0) {
                str6 = request.cardId;
            }
            if ((i11 & 64) != 0) {
                str7 = request.rewardId;
            }
            if ((i11 & 128) != 0) {
                str8 = request.fiatAmount;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            return request.copy(str, str2, str3, str4, str11, str12, str9, str10);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBizType() {
            return this.bizType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
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
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @NotNull
        public final Request copy(@Nullable String bizType, @Nullable String side, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String paymentMethodCode, @Nullable String cardId, @Nullable String rewardId, @Nullable String fiatAmount) {
            return new Request(bizType, side, fiatCurrency, cryptoCurrency, paymentMethodCode, cardId, rewardId, fiatAmount);
        }

        @Nullable
        public final String getBizType() {
            return this.bizType;
        }

        @Nullable
        public final String getCardId() {
            return this.cardId;
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
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        public final String getRewardId() {
            return this.rewardId;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        public int hashCode() {
            String str = this.bizType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.paymentMethodCode;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cardId;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.rewardId;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.fiatAmount;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(bizType=" + this.bizType + ", side=" + this.side + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", paymentMethodCode=" + this.paymentMethodCode + ", cardId=" + this.cardId + ", rewardId=" + this.rewardId + ", fiatAmount=" + this.fiatAmount + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.bizType = str;
            this.side = str2;
            this.fiatCurrency = str3;
            this.cryptoCurrency = str4;
            this.paymentMethodCode = str5;
            this.cardId = str6;
            this.rewardId = str7;
            this.fiatAmount = str8;
        }
    }

    /* JADX INFO: compiled from: FiatCouponDiscountInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;", "", "fiatAmount", "", "fiatCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFiatAmount", "()Ljava/lang/String;", "getFiatCurrency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final String fiatAmount;

        @Nullable
        private final String fiatCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.fiatAmount, response.fiatAmount) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.fiatAmount;
            }
            if ((i11 & 2) != 0) {
                str2 = response.fiatCurrency;
            }
            return response.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        public final Response copy(@Nullable String fiatAmount, @Nullable String fiatCurrency) {
            return new Response(fiatAmount, fiatCurrency);
        }

        @Nullable
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        public int hashCode() {
            String str = this.fiatAmount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(fiatAmount=" + this.fiatAmount + ", fiatCurrency=" + this.fiatCurrency + ')';
        }

        public Response(@Nullable String str, @Nullable String str2) {
            this.fiatAmount = str;
            this.fiatCurrency = str2;
        }
    }
}
