package com.kubi.payment.kucoinpay.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrCode.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/data/entities/QrCode;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QrCode {

    /* JADX INFO: compiled from: QrCode.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;", "", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("content")
        @Nullable
        private final String content;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && Intrinsics.areEqual(this.content, ((Request) other).content);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.content;
            }
            return request.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final Request copy(@Nullable String content) {
            return new Request(content);
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            String str = this.content;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(content=" + this.content + ')';
        }

        public Request(@Nullable String str) {
            this.content = str;
        }
    }

    /* JADX INFO: compiled from: QrCode.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;", "", "appPayUrl", "", "rnJumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppPayUrl", "()Ljava/lang/String;", "getRnJumpUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("appPayUrl")
        @Nullable
        private final String appPayUrl;

        @SerializedName("rnJumpUrl")
        @Nullable
        private final String rnJumpUrl;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.appPayUrl, response.appPayUrl) && Intrinsics.areEqual(this.rnJumpUrl, response.rnJumpUrl);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.appPayUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = response.rnJumpUrl;
            }
            return response.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAppPayUrl() {
            return this.appPayUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRnJumpUrl() {
            return this.rnJumpUrl;
        }

        @NotNull
        public final Response copy(@Nullable String appPayUrl, @Nullable String rnJumpUrl) {
            return new Response(appPayUrl, rnJumpUrl);
        }

        @Nullable
        public final String getAppPayUrl() {
            return this.appPayUrl;
        }

        @Nullable
        public final String getRnJumpUrl() {
            return this.rnJumpUrl;
        }

        public int hashCode() {
            String str = this.appPayUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rnJumpUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(appPayUrl=" + this.appPayUrl + ", rnJumpUrl=" + this.rnJumpUrl + ')';
        }

        public Response(@Nullable String str, @Nullable String str2) {
            this.appPayUrl = str;
            this.rnJumpUrl = str2;
        }
    }
}
