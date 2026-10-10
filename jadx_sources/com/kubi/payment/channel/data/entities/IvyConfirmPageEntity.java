package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IvyConfirmPageEntity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity;", "", "<init>", "()V", "Request", "Response", "PayWith", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IvyConfirmPageEntity {

    /* JADX INFO: compiled from: IvyConfirmPageEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$PayWith;", "", "payWithName", "", "<init>", "(Ljava/lang/String;)V", "getPayWithName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PayWith {

        @Nullable
        private final String payWithName;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayWith) && Intrinsics.areEqual(this.payWithName, ((PayWith) other).payWithName);
        }

        public static /* synthetic */ PayWith copy$default(PayWith payWith, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = payWith.payWithName;
            }
            return payWith.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayWithName() {
            return this.payWithName;
        }

        @NotNull
        public final PayWith copy(@Nullable String payWithName) {
            return new PayWith(payWithName);
        }

        @Nullable
        public final String getPayWithName() {
            return this.payWithName;
        }

        public int hashCode() {
            String str = this.payWithName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "PayWith(payWithName=" + this.payWithName + ')';
        }

        public PayWith(@Nullable String str) {
            this.payWithName = str;
        }
    }

    /* JADX INFO: compiled from: IvyConfirmPageEntity.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;", "", "channelId", "", "paymentMethodCode", "fiatCurrency", "fiatAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getPaymentMethodCode", "getFiatCurrency", "getFiatAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String channelId;

        @NotNull
        private final String fiatAmount;

        @NotNull
        private final String fiatCurrency;

        @NotNull
        private final String paymentMethodCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, request.fiatAmount);
        }

        public Request(@NotNull String channelId, @NotNull String paymentMethodCode, @NotNull String fiatCurrency, @NotNull String fiatAmount) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            this.channelId = channelId;
            this.paymentMethodCode = paymentMethodCode;
            this.fiatCurrency = fiatCurrency;
            this.fiatAmount = fiatAmount;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.channelId;
            }
            if ((i11 & 2) != 0) {
                str2 = request.paymentMethodCode;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.fiatAmount;
            }
            return request.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
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
        public final Request copy(@NotNull String channelId, @NotNull String paymentMethodCode, @NotNull String fiatCurrency, @NotNull String fiatAmount) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            return new Request(channelId, paymentMethodCode, fiatCurrency, fiatAmount);
        }

        @NotNull
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @NotNull
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            return (((((this.channelId.hashCode() * 31) + this.paymentMethodCode.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31) + this.fiatAmount.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(channelId=" + this.channelId + ", paymentMethodCode=" + this.paymentMethodCode + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ')';
        }
    }

    /* JADX INFO: compiled from: IvyConfirmPageEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;", "", "payinCurrency", "", "payinAmount", "depositCurrency", "depositAmount", "feeCurrency", "feeAmount", "payWith", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$PayWith;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$PayWith;)V", "getPayinCurrency", "()Ljava/lang/String;", "getPayinAmount", "getDepositCurrency", "getDepositAmount", "getFeeCurrency", "getFeeAmount", "getPayWith", "()Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$PayWith;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final String depositAmount;

        @Nullable
        private final String depositCurrency;

        @Nullable
        private final String feeAmount;

        @Nullable
        private final String feeCurrency;

        @Nullable
        private final PayWith payWith;

        @Nullable
        private final String payinAmount;

        @Nullable
        private final String payinCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.payinCurrency, response.payinCurrency) && Intrinsics.areEqual(this.payinAmount, response.payinAmount) && Intrinsics.areEqual(this.depositCurrency, response.depositCurrency) && Intrinsics.areEqual(this.depositAmount, response.depositAmount) && Intrinsics.areEqual(this.feeCurrency, response.feeCurrency) && Intrinsics.areEqual(this.feeAmount, response.feeAmount) && Intrinsics.areEqual(this.payWith, response.payWith);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, PayWith payWith, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.payinCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = response.payinAmount;
            }
            if ((i11 & 4) != 0) {
                str3 = response.depositCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = response.depositAmount;
            }
            if ((i11 & 16) != 0) {
                str5 = response.feeCurrency;
            }
            if ((i11 & 32) != 0) {
                str6 = response.feeAmount;
            }
            if ((i11 & 64) != 0) {
                payWith = response.payWith;
            }
            String str7 = str6;
            PayWith payWith2 = payWith;
            String str8 = str5;
            String str9 = str3;
            return response.copy(str, str2, str9, str4, str8, str7, payWith2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayinCurrency() {
            return this.payinCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPayinAmount() {
            return this.payinAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDepositCurrency() {
            return this.depositCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDepositAmount() {
            return this.depositAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final PayWith getPayWith() {
            return this.payWith;
        }

        @NotNull
        public final Response copy(@Nullable String payinCurrency, @Nullable String payinAmount, @Nullable String depositCurrency, @Nullable String depositAmount, @Nullable String feeCurrency, @Nullable String feeAmount, @Nullable PayWith payWith) {
            return new Response(payinCurrency, payinAmount, depositCurrency, depositAmount, feeCurrency, feeAmount, payWith);
        }

        @Nullable
        public final String getDepositAmount() {
            return this.depositAmount;
        }

        @Nullable
        public final String getDepositCurrency() {
            return this.depositCurrency;
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
        public final PayWith getPayWith() {
            return this.payWith;
        }

        @Nullable
        public final String getPayinAmount() {
            return this.payinAmount;
        }

        @Nullable
        public final String getPayinCurrency() {
            return this.payinCurrency;
        }

        public int hashCode() {
            String str = this.payinCurrency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.payinAmount;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.depositCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.depositAmount;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.feeCurrency;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.feeAmount;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PayWith payWith = this.payWith;
            return iHashCode6 + (payWith != null ? payWith.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(payinCurrency=" + this.payinCurrency + ", payinAmount=" + this.payinAmount + ", depositCurrency=" + this.depositCurrency + ", depositAmount=" + this.depositAmount + ", feeCurrency=" + this.feeCurrency + ", feeAmount=" + this.feeAmount + ", payWith=" + this.payWith + ')';
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable PayWith payWith) {
            this.payinCurrency = str;
            this.payinAmount = str2;
            this.depositCurrency = str3;
            this.depositAmount = str4;
            this.feeCurrency = str5;
            this.feeAmount = str6;
            this.payWith = payWith;
        }
    }
}
