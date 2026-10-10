package com.kubi.payment.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TermInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/data/entities/TermInfo;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TermInfo {

    /* JADX INFO: compiled from: TermInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/data/entities/TermInfo$Request;", "", "paymentMethodCode", "", "channelId", "businessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getBusinessType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("businessType")
        @NotNull
        private final String businessType;

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

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
            return Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.businessType, request.businessType);
        }

        public Request(@Nullable String str, @Nullable String str2, @NotNull String businessType) {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            this.paymentMethodCode = str;
            this.channelId = str2;
            this.businessType = businessType;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = request.channelId;
            }
            if ((i11 & 4) != 0) {
                str3 = request.businessType;
            }
            return request.copy(str, str2, str3);
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

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBusinessType() {
            return this.businessType;
        }

        @NotNull
        public final Request copy(@Nullable String paymentMethodCode, @Nullable String channelId, @NotNull String businessType) {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            return new Request(paymentMethodCode, channelId, businessType);
        }

        @NotNull
        public final String getBusinessType() {
            return this.businessType;
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public int hashCode() {
            String str = this.paymentMethodCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelId;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.businessType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", businessType=" + this.businessType + ')';
        }
    }

    /* JADX INFO: compiled from: TermInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/data/entities/TermInfo$Response;", "", "termsContent", "", "termsUrl", "privacyUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTermsContent", "()Ljava/lang/String;", "getTermsUrl", "getPrivacyUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("privacyUrl")
        @NotNull
        private final String privacyUrl;

        @SerializedName("termsContent")
        @Nullable
        private final String termsContent;

        @SerializedName("termsUrl")
        @Nullable
        private final String termsUrl;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.termsContent, response.termsContent) && Intrinsics.areEqual(this.termsUrl, response.termsUrl) && Intrinsics.areEqual(this.privacyUrl, response.privacyUrl);
        }

        public Response(@Nullable String str, @Nullable String str2, @NotNull String privacyUrl) {
            Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
            this.termsContent = str;
            this.termsUrl = str2;
            this.privacyUrl = privacyUrl;
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.termsContent;
            }
            if ((i11 & 2) != 0) {
                str2 = response.termsUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = response.privacyUrl;
            }
            return response.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTermsContent() {
            return this.termsContent;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTermsUrl() {
            return this.termsUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPrivacyUrl() {
            return this.privacyUrl;
        }

        @NotNull
        public final Response copy(@Nullable String termsContent, @Nullable String termsUrl, @NotNull String privacyUrl) {
            Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
            return new Response(termsContent, termsUrl, privacyUrl);
        }

        @NotNull
        public final String getPrivacyUrl() {
            return this.privacyUrl;
        }

        @Nullable
        public final String getTermsContent() {
            return this.termsContent;
        }

        @Nullable
        public final String getTermsUrl() {
            return this.termsUrl;
        }

        public int hashCode() {
            String str = this.termsContent;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.termsUrl;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.privacyUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(termsContent=" + this.termsContent + ", termsUrl=" + this.termsUrl + ", privacyUrl=" + this.privacyUrl + ')';
        }
    }
}
