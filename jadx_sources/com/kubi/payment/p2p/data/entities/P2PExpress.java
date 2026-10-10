package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PExpress.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PExpress;", "", "<init>", "()V", "HedgeRequest", "HedgeResponse", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PExpress {

    /* JADX INFO: compiled from: P2PExpress.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeRequest;", "", "orderId", "", "quoteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getQuoteId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HedgeRequest {

        @SerializedName("orderId")
        @Nullable
        private final String orderId;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        public HedgeRequest(@Nullable String str, @Nullable String str2) {
            this.orderId = str;
            this.quoteId = str2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HedgeRequest)) {
                return false;
            }
            HedgeRequest hedgeRequest = (HedgeRequest) other;
            return Intrinsics.areEqual(this.orderId, hedgeRequest.orderId) && Intrinsics.areEqual(this.quoteId, hedgeRequest.quoteId);
        }

        public static /* synthetic */ HedgeRequest copy$default(HedgeRequest hedgeRequest, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hedgeRequest.orderId;
            }
            if ((i11 & 2) != 0) {
                str2 = hedgeRequest.quoteId;
            }
            return hedgeRequest.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @NotNull
        public final HedgeRequest copy(@Nullable String orderId, @Nullable String quoteId) {
            return new HedgeRequest(orderId, quoteId);
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final String getQuoteId() {
            return this.quoteId;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.quoteId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HedgeRequest(orderId=" + this.orderId + ", quoteId=" + this.quoteId + ')';
        }

        public /* synthetic */ HedgeRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: P2PExpress.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "", "quoteId", "", FirebaseAnalytics.Param.PRICE, "hedgeMidCurrency", "hedgeMidAmount", "toAmount", "toCurrency", "expireTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getQuoteId", "()Ljava/lang/String;", "getPrice", "getHedgeMidCurrency", "getHedgeMidAmount", "getToAmount", "getToCurrency", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HedgeResponse {

        @SerializedName("expireTime")
        @Nullable
        private final Long expireTime;

        @SerializedName("hedgeMidAmount")
        @Nullable
        private final String hedgeMidAmount;

        @SerializedName("hedgeMidCurrency")
        @Nullable
        private final String hedgeMidCurrency;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final String price;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        @SerializedName("toAmount")
        @Nullable
        private final String toAmount;

        @SerializedName("toCurrency")
        @Nullable
        private final String toCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HedgeResponse)) {
                return false;
            }
            HedgeResponse hedgeResponse = (HedgeResponse) other;
            return Intrinsics.areEqual(this.quoteId, hedgeResponse.quoteId) && Intrinsics.areEqual(this.price, hedgeResponse.price) && Intrinsics.areEqual(this.hedgeMidCurrency, hedgeResponse.hedgeMidCurrency) && Intrinsics.areEqual(this.hedgeMidAmount, hedgeResponse.hedgeMidAmount) && Intrinsics.areEqual(this.toAmount, hedgeResponse.toAmount) && Intrinsics.areEqual(this.toCurrency, hedgeResponse.toCurrency) && Intrinsics.areEqual(this.expireTime, hedgeResponse.expireTime);
        }

        public static /* synthetic */ HedgeResponse copy$default(HedgeResponse hedgeResponse, String str, String str2, String str3, String str4, String str5, String str6, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hedgeResponse.quoteId;
            }
            if ((i11 & 2) != 0) {
                str2 = hedgeResponse.price;
            }
            if ((i11 & 4) != 0) {
                str3 = hedgeResponse.hedgeMidCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = hedgeResponse.hedgeMidAmount;
            }
            if ((i11 & 16) != 0) {
                str5 = hedgeResponse.toAmount;
            }
            if ((i11 & 32) != 0) {
                str6 = hedgeResponse.toCurrency;
            }
            if ((i11 & 64) != 0) {
                l11 = hedgeResponse.expireTime;
            }
            String str7 = str6;
            Long l12 = l11;
            String str8 = str5;
            String str9 = str3;
            return hedgeResponse.copy(str, str2, str9, str4, str8, str7, l12);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHedgeMidCurrency() {
            return this.hedgeMidCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getHedgeMidAmount() {
            return this.hedgeMidAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getToAmount() {
            return this.toAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getToCurrency() {
            return this.toCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @NotNull
        public final HedgeResponse copy(@Nullable String quoteId, @Nullable String price, @Nullable String hedgeMidCurrency, @Nullable String hedgeMidAmount, @Nullable String toAmount, @Nullable String toCurrency, @Nullable Long expireTime) {
            return new HedgeResponse(quoteId, price, hedgeMidCurrency, hedgeMidAmount, toAmount, toCurrency, expireTime);
        }

        @Nullable
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        public final String getHedgeMidAmount() {
            return this.hedgeMidAmount;
        }

        @Nullable
        public final String getHedgeMidCurrency() {
            return this.hedgeMidCurrency;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        public final String getToAmount() {
            return this.toAmount;
        }

        @Nullable
        public final String getToCurrency() {
            return this.toCurrency;
        }

        public int hashCode() {
            String str = this.quoteId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.price;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.hedgeMidCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.hedgeMidAmount;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.toAmount;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.toCurrency;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.expireTime;
            return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HedgeResponse(quoteId=" + this.quoteId + ", price=" + this.price + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ", hedgeMidAmount=" + this.hedgeMidAmount + ", toAmount=" + this.toAmount + ", toCurrency=" + this.toCurrency + ", expireTime=" + this.expireTime + ')';
        }

        public HedgeResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l11) {
            this.quoteId = str;
            this.price = str2;
            this.hedgeMidCurrency = str3;
            this.hedgeMidAmount = str4;
            this.toAmount = str5;
            this.toCurrency = str6;
            this.expireTime = l11;
        }
    }
}
