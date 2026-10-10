package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreateIvyOrderEntity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CreateIvyOrderEntity {

    /* JADX INFO: compiled from: CreateIvyOrderEntity.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;", "", "channelId", "", "paymentMethodCode", "fiatCurrency", "fiatAmount", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getPaymentMethodCode", "getFiatCurrency", "getFiatAmount", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String channelId;

        @NotNull
        private final String fiatAmount;

        @NotNull
        private final String fiatCurrency;

        @NotNull
        private final String paymentMethodCode;

        @NotNull
        private final String source;

        public Request(@NotNull String channelId, @NotNull String paymentMethodCode, @NotNull String fiatCurrency, @NotNull String fiatAmount, @NotNull String source) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            Intrinsics.checkNotNullParameter(source, "source");
            this.channelId = channelId;
            this.paymentMethodCode = paymentMethodCode;
            this.fiatCurrency = fiatCurrency;
            this.fiatAmount = fiatAmount;
            this.source = source;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, request.fiatAmount) && Intrinsics.areEqual(this.source, request.source);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
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
            if ((i11 & 16) != 0) {
                str5 = request.source;
            }
            String str6 = str5;
            String str7 = str3;
            return request.copy(str, str2, str7, str4, str6);
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
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        public final Request copy(@NotNull String channelId, @NotNull String paymentMethodCode, @NotNull String fiatCurrency, @NotNull String fiatAmount, @NotNull String source) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Request(channelId, paymentMethodCode, fiatCurrency, fiatAmount, source);
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

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return (((((((this.channelId.hashCode() * 31) + this.paymentMethodCode.hashCode()) * 31) + this.fiatCurrency.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(channelId=" + this.channelId + ", paymentMethodCode=" + this.paymentMethodCode + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", source=" + this.source + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID : str5);
        }
    }

    /* JADX INFO: compiled from: CreateIvyOrderEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;", "", "paymentOrderId", "", "redirectUrl", "redirectSameNameTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentOrderId", "()Ljava/lang/String;", "getRedirectUrl", "getRedirectSameNameTip", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final String paymentOrderId;

        @Nullable
        private final String redirectSameNameTip;

        @Nullable
        private final String redirectUrl;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.paymentOrderId, response.paymentOrderId) && Intrinsics.areEqual(this.redirectUrl, response.redirectUrl) && Intrinsics.areEqual(this.redirectSameNameTip, response.redirectSameNameTip);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.paymentOrderId;
            }
            if ((i11 & 2) != 0) {
                str2 = response.redirectUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = response.redirectSameNameTip;
            }
            return response.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentOrderId() {
            return this.paymentOrderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRedirectSameNameTip() {
            return this.redirectSameNameTip;
        }

        @NotNull
        public final Response copy(@Nullable String paymentOrderId, @Nullable String redirectUrl, @Nullable String redirectSameNameTip) {
            return new Response(paymentOrderId, redirectUrl, redirectSameNameTip);
        }

        @Nullable
        public final String getPaymentOrderId() {
            return this.paymentOrderId;
        }

        @Nullable
        public final String getRedirectSameNameTip() {
            return this.redirectSameNameTip;
        }

        @Nullable
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public int hashCode() {
            String str = this.paymentOrderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.redirectUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.redirectSameNameTip;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(paymentOrderId=" + this.paymentOrderId + ", redirectUrl=" + this.redirectUrl + ", redirectSameNameTip=" + this.redirectSameNameTip + ')';
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.paymentOrderId = str;
            this.redirectUrl = str2;
            this.redirectSameNameTip = str3;
        }
    }
}
