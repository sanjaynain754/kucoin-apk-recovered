package com.kubi.payment.fast.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyPreviewOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyPreviewOrder {

    /* JADX INFO: compiled from: BuyPreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\r\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00068"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;", "", "paymentMethodCode", "", "channelId", "fiatCurrency", "cryptoCurrency", "fiatAmount", "paymentMethodName", "cardInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$CardInfoRequest;", "p2pInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$P2PInfoRequest;", "isRecurring", "", "recurringFrequency", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;", "rewardId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$CardInfoRequest;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$P2PInfoRequest;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getFiatCurrency", "getCryptoCurrency", "getFiatAmount", "getPaymentMethodName", "getCardInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$CardInfoRequest;", "getP2pInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$P2PInfoRequest;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecurringFrequency", "()Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;", "getRewardId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$CardInfoRequest;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$P2PInfoRequest;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request;", "equals", "other", "hashCode", "", "toString", "CardInfoRequest", "P2PInfoRequest", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("cardInfo")
        @Nullable
        private final CardInfoRequest cardInfo;

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("isRecurring")
        @Nullable
        private final Boolean isRecurring;

        @SerializedName("p2pInfo")
        @Nullable
        private final P2PInfoRequest p2pInfo;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("name")
        @Nullable
        private final String paymentMethodName;

        @SerializedName("recurringInfo")
        @Nullable
        private final PreviewOrder.RecurringInfo.Request recurringFrequency;

        @SerializedName("rewardId")
        @Nullable
        private final String rewardId;

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$CardInfoRequest;", "", "cardId", "", "<init>", "(Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class CardInfoRequest {

            @SerializedName("cardId")
            @Nullable
            private final String cardId;

            /* JADX WARN: Multi-variable type inference failed */
            public CardInfoRequest() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardInfoRequest) && Intrinsics.areEqual(this.cardId, ((CardInfoRequest) other).cardId);
            }

            public CardInfoRequest(@Nullable String str) {
                this.cardId = str;
            }

            public static /* synthetic */ CardInfoRequest copy$default(CardInfoRequest cardInfoRequest, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = cardInfoRequest.cardId;
                }
                return cardInfoRequest.copy(str);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCardId() {
                return this.cardId;
            }

            @NotNull
            public final CardInfoRequest copy(@Nullable String cardId) {
                return new CardInfoRequest(cardId);
            }

            @Nullable
            public final String getCardId() {
                return this.cardId;
            }

            public int hashCode() {
                String str = this.cardId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return "CardInfoRequest(cardId=" + this.cardId + ')';
            }

            public /* synthetic */ CardInfoRequest(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Request$P2PInfoRequest;", "", "adId", "", "payTypeCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "getPayTypeCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class P2PInfoRequest {

            @SerializedName("adId")
            @Nullable
            private final String adId;

            @SerializedName("payTypeCode")
            @Nullable
            private final String payTypeCode;

            /* JADX WARN: Multi-variable type inference failed */
            public P2PInfoRequest() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof P2PInfoRequest)) {
                    return false;
                }
                P2PInfoRequest p2PInfoRequest = (P2PInfoRequest) other;
                return Intrinsics.areEqual(this.adId, p2PInfoRequest.adId) && Intrinsics.areEqual(this.payTypeCode, p2PInfoRequest.payTypeCode);
            }

            public P2PInfoRequest(@Nullable String str, @Nullable String str2) {
                this.adId = str;
                this.payTypeCode = str2;
            }

            public static /* synthetic */ P2PInfoRequest copy$default(P2PInfoRequest p2PInfoRequest, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = p2PInfoRequest.adId;
                }
                if ((i11 & 2) != 0) {
                    str2 = p2PInfoRequest.payTypeCode;
                }
                return p2PInfoRequest.copy(str, str2);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getAdId() {
                return this.adId;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getPayTypeCode() {
                return this.payTypeCode;
            }

            @NotNull
            public final P2PInfoRequest copy(@Nullable String adId, @Nullable String payTypeCode) {
                return new P2PInfoRequest(adId, payTypeCode);
            }

            @Nullable
            public final String getAdId() {
                return this.adId;
            }

            @Nullable
            public final String getPayTypeCode() {
                return this.payTypeCode;
            }

            public int hashCode() {
                String str = this.adId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.payTypeCode;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "P2PInfoRequest(adId=" + this.adId + ", payTypeCode=" + this.payTypeCode + ')';
            }

            public /* synthetic */ P2PInfoRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
            }
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable CardInfoRequest cardInfoRequest, @Nullable P2PInfoRequest p2PInfoRequest, @Nullable Boolean bool, @Nullable PreviewOrder.RecurringInfo.Request request, @Nullable String str7) {
            this.paymentMethodCode = str;
            this.channelId = str2;
            this.fiatCurrency = str3;
            this.cryptoCurrency = str4;
            this.fiatAmount = str5;
            this.paymentMethodName = str6;
            this.cardInfo = cardInfoRequest;
            this.p2pInfo = p2PInfoRequest;
            this.isRecurring = bool;
            this.recurringFrequency = request;
            this.rewardId = str7;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.fiatAmount, request.fiatAmount) && Intrinsics.areEqual(this.paymentMethodName, request.paymentMethodName) && Intrinsics.areEqual(this.cardInfo, request.cardInfo) && Intrinsics.areEqual(this.p2pInfo, request.p2pInfo) && Intrinsics.areEqual(this.isRecurring, request.isRecurring) && Intrinsics.areEqual(this.recurringFrequency, request.recurringFrequency) && Intrinsics.areEqual(this.rewardId, request.rewardId);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, String str6, CardInfoRequest cardInfoRequest, P2PInfoRequest p2PInfoRequest, Boolean bool, PreviewOrder.RecurringInfo.Request request2, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.paymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                str2 = request.channelId;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.fiatAmount;
            }
            if ((i11 & 32) != 0) {
                str6 = request.paymentMethodName;
            }
            if ((i11 & 64) != 0) {
                cardInfoRequest = request.cardInfo;
            }
            if ((i11 & 128) != 0) {
                p2PInfoRequest = request.p2pInfo;
            }
            if ((i11 & 256) != 0) {
                bool = request.isRecurring;
            }
            if ((i11 & 512) != 0) {
                request2 = request.recurringFrequency;
            }
            if ((i11 & 1024) != 0) {
                str7 = request.rewardId;
            }
            PreviewOrder.RecurringInfo.Request request3 = request2;
            String str8 = str7;
            P2PInfoRequest p2PInfoRequest2 = p2PInfoRequest;
            Boolean bool2 = bool;
            String str9 = str6;
            CardInfoRequest cardInfoRequest2 = cardInfoRequest;
            String str10 = str5;
            String str11 = str3;
            return request.copy(str, str2, str11, str4, str10, str9, cardInfoRequest2, p2PInfoRequest2, bool2, request3, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final PreviewOrder.RecurringInfo.Request getRecurringFrequency() {
            return this.recurringFrequency;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
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
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final CardInfoRequest getCardInfo() {
            return this.cardInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final P2PInfoRequest getP2pInfo() {
            return this.p2pInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getIsRecurring() {
            return this.isRecurring;
        }

        @NotNull
        public final Request copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String fiatAmount, @Nullable String paymentMethodName, @Nullable CardInfoRequest cardInfo, @Nullable P2PInfoRequest p2pInfo, @Nullable Boolean isRecurring, @Nullable PreviewOrder.RecurringInfo.Request recurringFrequency, @Nullable String rewardId) {
            return new Request(paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, fiatAmount, paymentMethodName, cardInfo, p2pInfo, isRecurring, recurringFrequency, rewardId);
        }

        @Nullable
        public final CardInfoRequest getCardInfo() {
            return this.cardInfo;
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
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
        public final P2PInfoRequest getP2pInfo() {
            return this.p2pInfo;
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
        public final PreviewOrder.RecurringInfo.Request getRecurringFrequency() {
            return this.recurringFrequency;
        }

        @Nullable
        public final String getRewardId() {
            return this.rewardId;
        }

        public int hashCode() {
            String str = this.paymentMethodCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.channelId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fiatAmount;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.paymentMethodName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CardInfoRequest cardInfoRequest = this.cardInfo;
            int iHashCode7 = (iHashCode6 + (cardInfoRequest == null ? 0 : cardInfoRequest.hashCode())) * 31;
            P2PInfoRequest p2PInfoRequest = this.p2pInfo;
            int iHashCode8 = (iHashCode7 + (p2PInfoRequest == null ? 0 : p2PInfoRequest.hashCode())) * 31;
            Boolean bool = this.isRecurring;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            PreviewOrder.RecurringInfo.Request request = this.recurringFrequency;
            int iHashCode10 = (iHashCode9 + (request == null ? 0 : request.hashCode())) * 31;
            String str7 = this.rewardId;
            return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
        }

        @Nullable
        public final Boolean isRecurring() {
            return this.isRecurring;
        }

        @NotNull
        public String toString() {
            return "Request(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", fiatAmount=" + this.fiatAmount + ", paymentMethodName=" + this.paymentMethodName + ", cardInfo=" + this.cardInfo + ", p2pInfo=" + this.p2pInfo + ", isRecurring=" + this.isRecurring + ", recurringFrequency=" + this.recurringFrequency + ", rewardId=" + this.rewardId + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, String str6, CardInfoRequest cardInfoRequest, P2PInfoRequest p2PInfoRequest, Boolean bool, PreviewOrder.RecurringInfo.Request request, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? null : cardInfoRequest, (i11 & 128) != 0 ? null : p2PInfoRequest, (i11 & 256) != 0 ? Boolean.FALSE : bool, (i11 & 512) != 0 ? null : request, (i11 & 1024) != 0 ? null : str7);
        }
    }

    /* JADX INFO: compiled from: BuyPreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006YZ[\\]^BÑ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001fHÆ\u0003Jì\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00052\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0004\u0010$R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006_"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "", "quoteId", "", "isProtected", "", "fiatCurrency", "fiatAmount", "cryptoCurrency", "cryptoAmount", FirebaseAnalytics.Param.PRICE, "expireTime", "", "paymentMethodName", "feeInfoList", "", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyFeeInfo;", "recurringInfo", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;", "cardInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;", "revolutInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;", "googlePayInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;", "p2pExpressInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyP2PExpressInfo;", "merchantInfo", "Lcom/kubi/payment/fast/data/entities/MerchantInfo;", "floatPriceTip", "rewardInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$RewardInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyP2PExpressInfo;Lcom/kubi/payment/fast/data/entities/MerchantInfo;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$RewardInfo;)V", "getQuoteId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFiatCurrency", "getFiatAmount", "getCryptoCurrency", "getCryptoAmount", "getPrice", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPaymentMethodName", "getFeeInfoList", "()Ljava/util/List;", "getRecurringInfo", "()Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;", "getCardInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;", "getRevolutInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;", "getGooglePayInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;", "getP2pExpressInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyP2PExpressInfo;", "getMerchantInfo", "()Lcom/kubi/payment/fast/data/entities/MerchantInfo;", "getFloatPriceTip", "getRewardInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$RewardInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyP2PExpressInfo;Lcom/kubi/payment/fast/data/entities/MerchantInfo;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$RewardInfo;)Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "equals", "other", "hashCode", "", "toString", "BuyFeeInfo", "BuyCardInfo", "BuyRevolutInfo", "BuyP2PExpressInfo", "BuyGooglePayInfo", "RewardInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("cardInfo")
        @Nullable
        private final BuyCardInfo cardInfo;

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("quoteExpireTime")
        @Nullable
        private final Long expireTime;

        @SerializedName("feeInfo")
        @Nullable
        private final List<BuyFeeInfo> feeInfoList;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("floatPriceTip")
        @Nullable
        private final String floatPriceTip;

        @SerializedName("googlePayInfo")
        @Nullable
        private final BuyGooglePayInfo googlePayInfo;

        @SerializedName("priceLock")
        @Nullable
        private final Boolean isProtected;

        @SerializedName("merchantInfo")
        @Nullable
        private final MerchantInfo merchantInfo;

        @SerializedName("p2pExpressInfo")
        @Nullable
        private final BuyP2PExpressInfo p2pExpressInfo;

        @SerializedName("name")
        @Nullable
        private final String paymentMethodName;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final String price;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        @SerializedName("recurringInfo")
        @Nullable
        private final PreviewOrder.RecurringInfo.Response recurringInfo;

        @SerializedName("revolutInfo")
        @Nullable
        private final BuyRevolutInfo revolutInfo;

        @SerializedName("rewardInfo")
        @Nullable
        private final RewardInfo rewardInfo;

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyCardInfo;", "", "cardToken", "", "<init>", "(Ljava/lang/String;)V", "getCardToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class BuyCardInfo {

            @SerializedName("cardToken")
            @Nullable
            private final String cardToken;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BuyCardInfo) && Intrinsics.areEqual(this.cardToken, ((BuyCardInfo) other).cardToken);
            }

            public static /* synthetic */ BuyCardInfo copy$default(BuyCardInfo buyCardInfo, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = buyCardInfo.cardToken;
                }
                return buyCardInfo.copy(str);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCardToken() {
                return this.cardToken;
            }

            @NotNull
            public final BuyCardInfo copy(@Nullable String cardToken) {
                return new BuyCardInfo(cardToken);
            }

            @Nullable
            public final String getCardToken() {
                return this.cardToken;
            }

            public int hashCode() {
                String str = this.cardToken;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return "BuyCardInfo(cardToken=" + this.cardToken + ')';
            }

            public BuyCardInfo(@Nullable String str) {
                this.cardToken = str;
            }
        }

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyFeeInfo;", "Landroid/os/Parcelable;", "feeCurrency", "", "feeAmount", "originalFeeAmount", "feeMessage", "maxFee", "minFee", "tips", "refundFeeMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeCurrency", "()Ljava/lang/String;", "getFeeAmount", "getOriginalFeeAmount", "getFeeMessage", "getMaxFee", "getMinFee", "getTips", "getRefundFeeMsg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class BuyFeeInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<BuyFeeInfo> CREATOR = new C20500a();

            @SerializedName("feeAmount")
            @Nullable
            private final String feeAmount;

            @SerializedName("feeCurrency")
            @Nullable
            private final String feeCurrency;

            @SerializedName("feeMsg")
            @Nullable
            private final String feeMessage;

            @SerializedName("maxFee")
            @Nullable
            private final String maxFee;

            @SerializedName("minFee")
            @Nullable
            private final String minFee;

            @SerializedName("originalFeeAmount")
            @Nullable
            private final String originalFeeAmount;

            @SerializedName("refundFeeMsg")
            @Nullable
            private final String refundFeeMsg;

            @SerializedName("tips")
            @Nullable
            private final String tips;

            /* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.BuyPreviewOrder$Response$BuyFeeInfo$a */
            /* JADX INFO: compiled from: BuyPreviewOrder.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class C20500a implements Parcelable.Creator<BuyFeeInfo> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final BuyFeeInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BuyFeeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final BuyFeeInfo[] newArray(int i11) {
                    return new BuyFeeInfo[i11];
                }
            }

            public BuyFeeInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
                this.feeCurrency = str;
                this.feeAmount = str2;
                this.originalFeeAmount = str3;
                this.feeMessage = str4;
                this.maxFee = str5;
                this.minFee = str6;
                this.tips = str7;
                this.refundFeeMsg = str8;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BuyFeeInfo)) {
                    return false;
                }
                BuyFeeInfo buyFeeInfo = (BuyFeeInfo) other;
                return Intrinsics.areEqual(this.feeCurrency, buyFeeInfo.feeCurrency) && Intrinsics.areEqual(this.feeAmount, buyFeeInfo.feeAmount) && Intrinsics.areEqual(this.originalFeeAmount, buyFeeInfo.originalFeeAmount) && Intrinsics.areEqual(this.feeMessage, buyFeeInfo.feeMessage) && Intrinsics.areEqual(this.maxFee, buyFeeInfo.maxFee) && Intrinsics.areEqual(this.minFee, buyFeeInfo.minFee) && Intrinsics.areEqual(this.tips, buyFeeInfo.tips) && Intrinsics.areEqual(this.refundFeeMsg, buyFeeInfo.refundFeeMsg);
            }

            public static /* synthetic */ BuyFeeInfo copy$default(BuyFeeInfo buyFeeInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = buyFeeInfo.feeCurrency;
                }
                if ((i11 & 2) != 0) {
                    str2 = buyFeeInfo.feeAmount;
                }
                if ((i11 & 4) != 0) {
                    str3 = buyFeeInfo.originalFeeAmount;
                }
                if ((i11 & 8) != 0) {
                    str4 = buyFeeInfo.feeMessage;
                }
                if ((i11 & 16) != 0) {
                    str5 = buyFeeInfo.maxFee;
                }
                if ((i11 & 32) != 0) {
                    str6 = buyFeeInfo.minFee;
                }
                if ((i11 & 64) != 0) {
                    str7 = buyFeeInfo.tips;
                }
                if ((i11 & 128) != 0) {
                    str8 = buyFeeInfo.refundFeeMsg;
                }
                String str9 = str7;
                String str10 = str8;
                String str11 = str5;
                String str12 = str6;
                return buyFeeInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFeeCurrency() {
                return this.feeCurrency;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getFeeAmount() {
                return this.feeAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getOriginalFeeAmount() {
                return this.originalFeeAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getFeeMessage() {
                return this.feeMessage;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getMaxFee() {
                return this.maxFee;
            }

            @Nullable
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getMinFee() {
                return this.minFee;
            }

            @Nullable
            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getTips() {
                return this.tips;
            }

            @Nullable
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getRefundFeeMsg() {
                return this.refundFeeMsg;
            }

            @NotNull
            public final BuyFeeInfo copy(@Nullable String feeCurrency, @Nullable String feeAmount, @Nullable String originalFeeAmount, @Nullable String feeMessage, @Nullable String maxFee, @Nullable String minFee, @Nullable String tips, @Nullable String refundFeeMsg) {
                return new BuyFeeInfo(feeCurrency, feeAmount, originalFeeAmount, feeMessage, maxFee, minFee, tips, refundFeeMsg);
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
            public final String getFeeMessage() {
                return this.feeMessage;
            }

            @Nullable
            public final String getMaxFee() {
                return this.maxFee;
            }

            @Nullable
            public final String getMinFee() {
                return this.minFee;
            }

            @Nullable
            public final String getOriginalFeeAmount() {
                return this.originalFeeAmount;
            }

            @Nullable
            public final String getRefundFeeMsg() {
                return this.refundFeeMsg;
            }

            @Nullable
            public final String getTips() {
                return this.tips;
            }

            public int hashCode() {
                String str = this.feeCurrency;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.feeAmount;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.originalFeeAmount;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.feeMessage;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.maxFee;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.minFee;
                int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.tips;
                int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.refundFeeMsg;
                return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "BuyFeeInfo(feeCurrency=" + this.feeCurrency + ", feeAmount=" + this.feeAmount + ", originalFeeAmount=" + this.originalFeeAmount + ", feeMessage=" + this.feeMessage + ", maxFee=" + this.maxFee + ", minFee=" + this.minFee + ", tips=" + this.tips + ", refundFeeMsg=" + this.refundFeeMsg + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.feeCurrency);
                dest.writeString(this.feeAmount);
                dest.writeString(this.originalFeeAmount);
                dest.writeString(this.feeMessage);
                dest.writeString(this.maxFee);
                dest.writeString(this.minFee);
                dest.writeString(this.tips);
                dest.writeString(this.refundFeeMsg);
            }

            public /* synthetic */ BuyFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? null : str3, str4, str5, str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8);
            }
        }

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyGooglePayInfo;", "", "merchantId", "", "merchantName", "supportedNetworks", "", "publicKey", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "getMerchantName", "getSupportedNetworks", "()Ljava/util/List;", "getPublicKey", "getCountryCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class BuyGooglePayInfo {

            @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
            @Nullable
            private final String countryCode;

            @SerializedName("merchantId")
            @Nullable
            private final String merchantId;

            @SerializedName("merchantName")
            @Nullable
            private final String merchantName;

            @SerializedName("publicKey")
            @Nullable
            private final String publicKey;

            @SerializedName("supportedNetworks")
            @Nullable
            private final List<String> supportedNetworks;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BuyGooglePayInfo)) {
                    return false;
                }
                BuyGooglePayInfo buyGooglePayInfo = (BuyGooglePayInfo) other;
                return Intrinsics.areEqual(this.merchantId, buyGooglePayInfo.merchantId) && Intrinsics.areEqual(this.merchantName, buyGooglePayInfo.merchantName) && Intrinsics.areEqual(this.supportedNetworks, buyGooglePayInfo.supportedNetworks) && Intrinsics.areEqual(this.publicKey, buyGooglePayInfo.publicKey) && Intrinsics.areEqual(this.countryCode, buyGooglePayInfo.countryCode);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BuyGooglePayInfo copy$default(BuyGooglePayInfo buyGooglePayInfo, String str, String str2, List list, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = buyGooglePayInfo.merchantId;
                }
                if ((i11 & 2) != 0) {
                    str2 = buyGooglePayInfo.merchantName;
                }
                if ((i11 & 4) != 0) {
                    list = buyGooglePayInfo.supportedNetworks;
                }
                if ((i11 & 8) != 0) {
                    str3 = buyGooglePayInfo.publicKey;
                }
                if ((i11 & 16) != 0) {
                    str4 = buyGooglePayInfo.countryCode;
                }
                String str5 = str4;
                List list2 = list;
                return buyGooglePayInfo.copy(str, str2, list2, str3, str5);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMerchantId() {
                return this.merchantId;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getMerchantName() {
                return this.merchantName;
            }

            @Nullable
            public final List<String> component3() {
                return this.supportedNetworks;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getPublicKey() {
                return this.publicKey;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final BuyGooglePayInfo copy(@Nullable String merchantId, @Nullable String merchantName, @Nullable List<String> supportedNetworks, @Nullable String publicKey, @Nullable String countryCode) {
                return new BuyGooglePayInfo(merchantId, merchantName, supportedNetworks, publicKey, countryCode);
            }

            @Nullable
            public final String getCountryCode() {
                return this.countryCode;
            }

            @Nullable
            public final String getMerchantId() {
                return this.merchantId;
            }

            @Nullable
            public final String getMerchantName() {
                return this.merchantName;
            }

            @Nullable
            public final String getPublicKey() {
                return this.publicKey;
            }

            @Nullable
            public final List<String> getSupportedNetworks() {
                return this.supportedNetworks;
            }

            public int hashCode() {
                String str = this.merchantId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.merchantName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<String> list = this.supportedNetworks;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                String str3 = this.publicKey;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.countryCode;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "BuyGooglePayInfo(merchantId=" + this.merchantId + ", merchantName=" + this.merchantName + ", supportedNetworks=" + this.supportedNetworks + ", publicKey=" + this.publicKey + ", countryCode=" + this.countryCode + ')';
            }

            public BuyGooglePayInfo(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4) {
                this.merchantId = str;
                this.merchantName = str2;
                this.supportedNetworks = list;
                this.publicKey = str3;
                this.countryCode = str4;
            }
        }

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyP2PExpressInfo;", "", "p2pPrice", "", "hedgeMidCurrency", "hedgeMidAmount", "hedgePriceFloat", "hedgePrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getP2pPrice", "()Ljava/lang/String;", "getHedgeMidCurrency", "getHedgeMidAmount", "getHedgePriceFloat", "getHedgePrice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class BuyP2PExpressInfo {

            @SerializedName("hedgeMidAmount")
            @Nullable
            private final String hedgeMidAmount;

            @SerializedName("hedgeMidCurrency")
            @Nullable
            private final String hedgeMidCurrency;

            @SerializedName("hedgePrice")
            @Nullable
            private final String hedgePrice;

            @SerializedName("hedgePriceFloat")
            @Nullable
            private final String hedgePriceFloat;

            @SerializedName("p2pPrice")
            @Nullable
            private final String p2pPrice;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BuyP2PExpressInfo)) {
                    return false;
                }
                BuyP2PExpressInfo buyP2PExpressInfo = (BuyP2PExpressInfo) other;
                return Intrinsics.areEqual(this.p2pPrice, buyP2PExpressInfo.p2pPrice) && Intrinsics.areEqual(this.hedgeMidCurrency, buyP2PExpressInfo.hedgeMidCurrency) && Intrinsics.areEqual(this.hedgeMidAmount, buyP2PExpressInfo.hedgeMidAmount) && Intrinsics.areEqual(this.hedgePriceFloat, buyP2PExpressInfo.hedgePriceFloat) && Intrinsics.areEqual(this.hedgePrice, buyP2PExpressInfo.hedgePrice);
            }

            public static /* synthetic */ BuyP2PExpressInfo copy$default(BuyP2PExpressInfo buyP2PExpressInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = buyP2PExpressInfo.p2pPrice;
                }
                if ((i11 & 2) != 0) {
                    str2 = buyP2PExpressInfo.hedgeMidCurrency;
                }
                if ((i11 & 4) != 0) {
                    str3 = buyP2PExpressInfo.hedgeMidAmount;
                }
                if ((i11 & 8) != 0) {
                    str4 = buyP2PExpressInfo.hedgePriceFloat;
                }
                if ((i11 & 16) != 0) {
                    str5 = buyP2PExpressInfo.hedgePrice;
                }
                String str6 = str5;
                String str7 = str3;
                return buyP2PExpressInfo.copy(str, str2, str7, str4, str6);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getP2pPrice() {
                return this.p2pPrice;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getHedgeMidCurrency() {
                return this.hedgeMidCurrency;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getHedgeMidAmount() {
                return this.hedgeMidAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getHedgePriceFloat() {
                return this.hedgePriceFloat;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getHedgePrice() {
                return this.hedgePrice;
            }

            @NotNull
            public final BuyP2PExpressInfo copy(@Nullable String p2pPrice, @Nullable String hedgeMidCurrency, @Nullable String hedgeMidAmount, @Nullable String hedgePriceFloat, @Nullable String hedgePrice) {
                return new BuyP2PExpressInfo(p2pPrice, hedgeMidCurrency, hedgeMidAmount, hedgePriceFloat, hedgePrice);
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
            public final String getHedgePrice() {
                return this.hedgePrice;
            }

            @Nullable
            public final String getHedgePriceFloat() {
                return this.hedgePriceFloat;
            }

            @Nullable
            public final String getP2pPrice() {
                return this.p2pPrice;
            }

            public int hashCode() {
                String str = this.p2pPrice;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.hedgeMidCurrency;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.hedgeMidAmount;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.hedgePriceFloat;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.hedgePrice;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "BuyP2PExpressInfo(p2pPrice=" + this.p2pPrice + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ", hedgeMidAmount=" + this.hedgeMidAmount + ", hedgePriceFloat=" + this.hedgePriceFloat + ", hedgePrice=" + this.hedgePrice + ')';
            }

            public BuyP2PExpressInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                this.p2pPrice = str;
                this.hedgeMidCurrency = str2;
                this.hedgeMidAmount = str3;
                this.hedgePriceFloat = str4;
                this.hedgePrice = str5;
            }
        }

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyRevolutInfo;", "", "merchantPublicKey", "", "<init>", "(Ljava/lang/String;)V", "getMerchantPublicKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class BuyRevolutInfo {

            @SerializedName("merchantPublicKey")
            @Nullable
            private final String merchantPublicKey;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BuyRevolutInfo) && Intrinsics.areEqual(this.merchantPublicKey, ((BuyRevolutInfo) other).merchantPublicKey);
            }

            public static /* synthetic */ BuyRevolutInfo copy$default(BuyRevolutInfo buyRevolutInfo, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = buyRevolutInfo.merchantPublicKey;
                }
                return buyRevolutInfo.copy(str);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMerchantPublicKey() {
                return this.merchantPublicKey;
            }

            @NotNull
            public final BuyRevolutInfo copy(@Nullable String merchantPublicKey) {
                return new BuyRevolutInfo(merchantPublicKey);
            }

            @Nullable
            public final String getMerchantPublicKey() {
                return this.merchantPublicKey;
            }

            public int hashCode() {
                String str = this.merchantPublicKey;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return "BuyRevolutInfo(merchantPublicKey=" + this.merchantPublicKey + ')';
            }

            public BuyRevolutInfo(@Nullable String str) {
                this.merchantPublicKey = str;
            }
        }

        /* JADX INFO: compiled from: BuyPreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$RewardInfo;", "", "fiatAmount", "", "fiatCurrency", "promotionAmount", "promotionCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatAmount", "()Ljava/lang/String;", "getFiatCurrency", "getPromotionAmount", "getPromotionCurrency", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class RewardInfo {

            @Nullable
            private final String fiatAmount;

            @Nullable
            private final String fiatCurrency;

            @Nullable
            private final String promotionAmount;

            @Nullable
            private final String promotionCurrency;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RewardInfo)) {
                    return false;
                }
                RewardInfo rewardInfo = (RewardInfo) other;
                return Intrinsics.areEqual(this.fiatAmount, rewardInfo.fiatAmount) && Intrinsics.areEqual(this.fiatCurrency, rewardInfo.fiatCurrency) && Intrinsics.areEqual(this.promotionAmount, rewardInfo.promotionAmount) && Intrinsics.areEqual(this.promotionCurrency, rewardInfo.promotionCurrency);
            }

            public static /* synthetic */ RewardInfo copy$default(RewardInfo rewardInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = rewardInfo.fiatAmount;
                }
                if ((i11 & 2) != 0) {
                    str2 = rewardInfo.fiatCurrency;
                }
                if ((i11 & 4) != 0) {
                    str3 = rewardInfo.promotionAmount;
                }
                if ((i11 & 8) != 0) {
                    str4 = rewardInfo.promotionCurrency;
                }
                return rewardInfo.copy(str, str2, str3, str4);
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

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getPromotionAmount() {
                return this.promotionAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getPromotionCurrency() {
                return this.promotionCurrency;
            }

            @NotNull
            public final RewardInfo copy(@Nullable String fiatAmount, @Nullable String fiatCurrency, @Nullable String promotionAmount, @Nullable String promotionCurrency) {
                return new RewardInfo(fiatAmount, fiatCurrency, promotionAmount, promotionCurrency);
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
            public final String getPromotionAmount() {
                return this.promotionAmount;
            }

            @Nullable
            public final String getPromotionCurrency() {
                return this.promotionCurrency;
            }

            public int hashCode() {
                String str = this.fiatAmount;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.fiatCurrency;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.promotionAmount;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.promotionCurrency;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "RewardInfo(fiatAmount=" + this.fiatAmount + ", fiatCurrency=" + this.fiatCurrency + ", promotionAmount=" + this.promotionAmount + ", promotionCurrency=" + this.promotionCurrency + ')';
            }

            public RewardInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                this.fiatAmount = str;
                this.fiatCurrency = str2;
                this.promotionAmount = str3;
                this.promotionCurrency = str4;
            }
        }

        public Response(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l11, @Nullable String str7, @Nullable List<BuyFeeInfo> list, @Nullable PreviewOrder.RecurringInfo.Response response, @Nullable BuyCardInfo buyCardInfo, @Nullable BuyRevolutInfo buyRevolutInfo, @Nullable BuyGooglePayInfo buyGooglePayInfo, @Nullable BuyP2PExpressInfo buyP2PExpressInfo, @Nullable MerchantInfo merchantInfo, @Nullable String str8, @Nullable RewardInfo rewardInfo) {
            this.quoteId = str;
            this.isProtected = bool;
            this.fiatCurrency = str2;
            this.fiatAmount = str3;
            this.cryptoCurrency = str4;
            this.cryptoAmount = str5;
            this.price = str6;
            this.expireTime = l11;
            this.paymentMethodName = str7;
            this.feeInfoList = list;
            this.recurringInfo = response;
            this.cardInfo = buyCardInfo;
            this.revolutInfo = buyRevolutInfo;
            this.googlePayInfo = buyGooglePayInfo;
            this.p2pExpressInfo = buyP2PExpressInfo;
            this.merchantInfo = merchantInfo;
            this.floatPriceTip = str8;
            this.rewardInfo = rewardInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, List list, PreviewOrder.RecurringInfo.Response response2, BuyCardInfo buyCardInfo, BuyRevolutInfo buyRevolutInfo, BuyGooglePayInfo buyGooglePayInfo, BuyP2PExpressInfo buyP2PExpressInfo, MerchantInfo merchantInfo, String str8, RewardInfo rewardInfo, int i11, Object obj) {
            RewardInfo rewardInfo2;
            String str9;
            String str10 = (i11 & 1) != 0 ? response.quoteId : str;
            Boolean bool2 = (i11 & 2) != 0 ? response.isProtected : bool;
            String str11 = (i11 & 4) != 0 ? response.fiatCurrency : str2;
            String str12 = (i11 & 8) != 0 ? response.fiatAmount : str3;
            String str13 = (i11 & 16) != 0 ? response.cryptoCurrency : str4;
            String str14 = (i11 & 32) != 0 ? response.cryptoAmount : str5;
            String str15 = (i11 & 64) != 0 ? response.price : str6;
            Long l12 = (i11 & 128) != 0 ? response.expireTime : l11;
            String str16 = (i11 & 256) != 0 ? response.paymentMethodName : str7;
            List list2 = (i11 & 512) != 0 ? response.feeInfoList : list;
            PreviewOrder.RecurringInfo.Response response3 = (i11 & 1024) != 0 ? response.recurringInfo : response2;
            BuyCardInfo buyCardInfo2 = (i11 & 2048) != 0 ? response.cardInfo : buyCardInfo;
            BuyRevolutInfo buyRevolutInfo2 = (i11 & 4096) != 0 ? response.revolutInfo : buyRevolutInfo;
            BuyGooglePayInfo buyGooglePayInfo2 = (i11 & 8192) != 0 ? response.googlePayInfo : buyGooglePayInfo;
            String str17 = str10;
            BuyP2PExpressInfo buyP2PExpressInfo2 = (i11 & 16384) != 0 ? response.p2pExpressInfo : buyP2PExpressInfo;
            MerchantInfo merchantInfo2 = (i11 & 32768) != 0 ? response.merchantInfo : merchantInfo;
            String str18 = (i11 & 65536) != 0 ? response.floatPriceTip : str8;
            if ((i11 & 131072) != 0) {
                str9 = str18;
                rewardInfo2 = response.rewardInfo;
            } else {
                rewardInfo2 = rewardInfo;
                str9 = str18;
            }
            return response.copy(str17, bool2, str11, str12, str13, str14, str15, l12, str16, list2, response3, buyCardInfo2, buyRevolutInfo2, buyGooglePayInfo2, buyP2PExpressInfo2, merchantInfo2, str9, rewardInfo2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.quoteId, response.quoteId) && Intrinsics.areEqual(this.isProtected, response.isProtected) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, response.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, response.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, response.cryptoAmount) && Intrinsics.areEqual(this.price, response.price) && Intrinsics.areEqual(this.expireTime, response.expireTime) && Intrinsics.areEqual(this.paymentMethodName, response.paymentMethodName) && Intrinsics.areEqual(this.feeInfoList, response.feeInfoList) && Intrinsics.areEqual(this.recurringInfo, response.recurringInfo) && Intrinsics.areEqual(this.cardInfo, response.cardInfo) && Intrinsics.areEqual(this.revolutInfo, response.revolutInfo) && Intrinsics.areEqual(this.googlePayInfo, response.googlePayInfo) && Intrinsics.areEqual(this.p2pExpressInfo, response.p2pExpressInfo) && Intrinsics.areEqual(this.merchantInfo, response.merchantInfo) && Intrinsics.areEqual(this.floatPriceTip, response.floatPriceTip) && Intrinsics.areEqual(this.rewardInfo, response.rewardInfo);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        public final List<BuyFeeInfo> component10() {
            return this.feeInfoList;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final PreviewOrder.RecurringInfo.Response getRecurringInfo() {
            return this.recurringInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final BuyCardInfo getCardInfo() {
            return this.cardInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final BuyRevolutInfo getRevolutInfo() {
            return this.revolutInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final BuyGooglePayInfo getGooglePayInfo() {
            return this.googlePayInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final BuyP2PExpressInfo getP2pExpressInfo() {
            return this.p2pExpressInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getFloatPriceTip() {
            return this.floatPriceTip;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final RewardInfo getRewardInfo() {
            return this.rewardInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsProtected() {
            return this.isProtected;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @NotNull
        public final Response copy(@Nullable String quoteId, @Nullable Boolean isProtected, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String price, @Nullable Long expireTime, @Nullable String paymentMethodName, @Nullable List<BuyFeeInfo> feeInfoList, @Nullable PreviewOrder.RecurringInfo.Response recurringInfo, @Nullable BuyCardInfo cardInfo, @Nullable BuyRevolutInfo revolutInfo, @Nullable BuyGooglePayInfo googlePayInfo, @Nullable BuyP2PExpressInfo p2pExpressInfo, @Nullable MerchantInfo merchantInfo, @Nullable String floatPriceTip, @Nullable RewardInfo rewardInfo) {
            return new Response(quoteId, isProtected, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, price, expireTime, paymentMethodName, feeInfoList, recurringInfo, cardInfo, revolutInfo, googlePayInfo, p2pExpressInfo, merchantInfo, floatPriceTip, rewardInfo);
        }

        @Nullable
        public final BuyCardInfo getCardInfo() {
            return this.cardInfo;
        }

        @Nullable
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        public final List<BuyFeeInfo> getFeeInfoList() {
            return this.feeInfoList;
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
        public final String getFloatPriceTip() {
            return this.floatPriceTip;
        }

        @Nullable
        public final BuyGooglePayInfo getGooglePayInfo() {
            return this.googlePayInfo;
        }

        @Nullable
        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        @Nullable
        public final BuyP2PExpressInfo getP2pExpressInfo() {
            return this.p2pExpressInfo;
        }

        @Nullable
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
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
        public final PreviewOrder.RecurringInfo.Response getRecurringInfo() {
            return this.recurringInfo;
        }

        @Nullable
        public final BuyRevolutInfo getRevolutInfo() {
            return this.revolutInfo;
        }

        @Nullable
        public final RewardInfo getRewardInfo() {
            return this.rewardInfo;
        }

        public int hashCode() {
            String str = this.quoteId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isProtected;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatAmount;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoAmount;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.price;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.expireTime;
            int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str7 = this.paymentMethodName;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<BuyFeeInfo> list = this.feeInfoList;
            int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
            PreviewOrder.RecurringInfo.Response response = this.recurringInfo;
            int iHashCode11 = (iHashCode10 + (response == null ? 0 : response.hashCode())) * 31;
            BuyCardInfo buyCardInfo = this.cardInfo;
            int iHashCode12 = (iHashCode11 + (buyCardInfo == null ? 0 : buyCardInfo.hashCode())) * 31;
            BuyRevolutInfo buyRevolutInfo = this.revolutInfo;
            int iHashCode13 = (iHashCode12 + (buyRevolutInfo == null ? 0 : buyRevolutInfo.hashCode())) * 31;
            BuyGooglePayInfo buyGooglePayInfo = this.googlePayInfo;
            int iHashCode14 = (iHashCode13 + (buyGooglePayInfo == null ? 0 : buyGooglePayInfo.hashCode())) * 31;
            BuyP2PExpressInfo buyP2PExpressInfo = this.p2pExpressInfo;
            int iHashCode15 = (iHashCode14 + (buyP2PExpressInfo == null ? 0 : buyP2PExpressInfo.hashCode())) * 31;
            MerchantInfo merchantInfo = this.merchantInfo;
            int iHashCode16 = (iHashCode15 + (merchantInfo == null ? 0 : merchantInfo.hashCode())) * 31;
            String str8 = this.floatPriceTip;
            int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
            RewardInfo rewardInfo = this.rewardInfo;
            return iHashCode17 + (rewardInfo != null ? rewardInfo.hashCode() : 0);
        }

        @Nullable
        public final Boolean isProtected() {
            return this.isProtected;
        }

        @NotNull
        public String toString() {
            return "Response(quoteId=" + this.quoteId + ", isProtected=" + this.isProtected + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", price=" + this.price + ", expireTime=" + this.expireTime + ", paymentMethodName=" + this.paymentMethodName + ", feeInfoList=" + this.feeInfoList + ", recurringInfo=" + this.recurringInfo + ", cardInfo=" + this.cardInfo + ", revolutInfo=" + this.revolutInfo + ", googlePayInfo=" + this.googlePayInfo + ", p2pExpressInfo=" + this.p2pExpressInfo + ", merchantInfo=" + this.merchantInfo + ", floatPriceTip=" + this.floatPriceTip + ", rewardInfo=" + this.rewardInfo + ')';
        }

        public /* synthetic */ Response(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, List list, PreviewOrder.RecurringInfo.Response response, BuyCardInfo buyCardInfo, BuyRevolutInfo buyRevolutInfo, BuyGooglePayInfo buyGooglePayInfo, BuyP2PExpressInfo buyP2PExpressInfo, MerchantInfo merchantInfo, String str8, RewardInfo rewardInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, str2, str3, str4, str5, str6, l11, str7, list, (i11 & 1024) != 0 ? null : response, (i11 & 2048) != 0 ? null : buyCardInfo, (i11 & 4096) != 0 ? null : buyRevolutInfo, (i11 & 8192) != 0 ? null : buyGooglePayInfo, (i11 & 16384) != 0 ? null : buyP2PExpressInfo, (32768 & i11) != 0 ? null : merchantInfo, (65536 & i11) != 0 ? null : str8, (i11 & 131072) != 0 ? null : rewardInfo);
        }
    }
}
