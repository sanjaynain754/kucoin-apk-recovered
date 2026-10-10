package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayRequest;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", AppsFlyerProperties.CURRENCY_CODE, "amount", "merchantId", "merchantName", "supportedNetworkStrings", "", "recurringRequest", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayRecurringRequest;", "rsaPublicKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayRecurringRequest;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCountryCode", "getCurrencyCode", "getMerchantId", "getMerchantName", "getRecurringRequest", "()Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayRecurringRequest;", "getRsaPublicKey", "getSupportedNetworkStrings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeApplePayRequest {

    @NotNull
    private final String amount;

    @NotNull
    private final String countryCode;

    @NotNull
    private final String currencyCode;

    @NotNull
    private final String merchantId;

    @NotNull
    private final String merchantName;

    @Nullable
    private final KCJSApiPaymentFastTradeApplePayRecurringRequest recurringRequest;

    @Nullable
    private final String rsaPublicKey;

    @Nullable
    private final List<String> supportedNetworkStrings;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeApplePayRequest)) {
            return false;
        }
        KCJSApiPaymentFastTradeApplePayRequest kCJSApiPaymentFastTradeApplePayRequest = (KCJSApiPaymentFastTradeApplePayRequest) other;
        return Intrinsics.areEqual(this.countryCode, kCJSApiPaymentFastTradeApplePayRequest.countryCode) && Intrinsics.areEqual(this.currencyCode, kCJSApiPaymentFastTradeApplePayRequest.currencyCode) && Intrinsics.areEqual(this.amount, kCJSApiPaymentFastTradeApplePayRequest.amount) && Intrinsics.areEqual(this.merchantId, kCJSApiPaymentFastTradeApplePayRequest.merchantId) && Intrinsics.areEqual(this.merchantName, kCJSApiPaymentFastTradeApplePayRequest.merchantName) && Intrinsics.areEqual(this.supportedNetworkStrings, kCJSApiPaymentFastTradeApplePayRequest.supportedNetworkStrings) && Intrinsics.areEqual(this.recurringRequest, kCJSApiPaymentFastTradeApplePayRequest.recurringRequest) && Intrinsics.areEqual(this.rsaPublicKey, kCJSApiPaymentFastTradeApplePayRequest.rsaPublicKey);
    }

    public KCJSApiPaymentFastTradeApplePayRequest(@NotNull String countryCode, @NotNull String currencyCode, @NotNull String amount, @NotNull String merchantId, @NotNull String merchantName, @Nullable List<String> list, @Nullable KCJSApiPaymentFastTradeApplePayRecurringRequest kCJSApiPaymentFastTradeApplePayRecurringRequest, @Nullable String str) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.amount = amount;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.supportedNetworkStrings = list;
        this.recurringRequest = kCJSApiPaymentFastTradeApplePayRecurringRequest;
        this.rsaPublicKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiPaymentFastTradeApplePayRequest copy$default(KCJSApiPaymentFastTradeApplePayRequest kCJSApiPaymentFastTradeApplePayRequest, String str, String str2, String str3, String str4, String str5, List list, KCJSApiPaymentFastTradeApplePayRecurringRequest kCJSApiPaymentFastTradeApplePayRecurringRequest, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeApplePayRequest.countryCode;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentFastTradeApplePayRequest.currencyCode;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiPaymentFastTradeApplePayRequest.amount;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiPaymentFastTradeApplePayRequest.merchantId;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiPaymentFastTradeApplePayRequest.merchantName;
        }
        if ((i11 & 32) != 0) {
            list = kCJSApiPaymentFastTradeApplePayRequest.supportedNetworkStrings;
        }
        if ((i11 & 64) != 0) {
            kCJSApiPaymentFastTradeApplePayRecurringRequest = kCJSApiPaymentFastTradeApplePayRequest.recurringRequest;
        }
        if ((i11 & 128) != 0) {
            str6 = kCJSApiPaymentFastTradeApplePayRequest.rsaPublicKey;
        }
        KCJSApiPaymentFastTradeApplePayRecurringRequest kCJSApiPaymentFastTradeApplePayRecurringRequest2 = kCJSApiPaymentFastTradeApplePayRecurringRequest;
        String str7 = str6;
        String str8 = str5;
        List list2 = list;
        return kCJSApiPaymentFastTradeApplePayRequest.copy(str, str2, str3, str4, str8, list2, kCJSApiPaymentFastTradeApplePayRecurringRequest2, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final List<String> component6() {
        return this.supportedNetworkStrings;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final KCJSApiPaymentFastTradeApplePayRecurringRequest getRecurringRequest() {
        return this.recurringRequest;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRsaPublicKey() {
        return this.rsaPublicKey;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayRequest copy(@NotNull String countryCode, @NotNull String currencyCode, @NotNull String amount, @NotNull String merchantId, @NotNull String merchantName, @Nullable List<String> supportedNetworkStrings, @Nullable KCJSApiPaymentFastTradeApplePayRecurringRequest recurringRequest, @Nullable String rsaPublicKey) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        return new KCJSApiPaymentFastTradeApplePayRequest(countryCode, currencyCode, amount, merchantId, merchantName, supportedNetworkStrings, recurringRequest, rsaPublicKey);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final KCJSApiPaymentFastTradeApplePayRecurringRequest getRecurringRequest() {
        return this.recurringRequest;
    }

    @Nullable
    public final String getRsaPublicKey() {
        return this.rsaPublicKey;
    }

    @Nullable
    public final List<String> getSupportedNetworkStrings() {
        return this.supportedNetworkStrings;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.countryCode.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.merchantId.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        List<String> list = this.supportedNetworkStrings;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        KCJSApiPaymentFastTradeApplePayRecurringRequest kCJSApiPaymentFastTradeApplePayRecurringRequest = this.recurringRequest;
        int iHashCode3 = (iHashCode2 + (kCJSApiPaymentFastTradeApplePayRecurringRequest == null ? 0 : kCJSApiPaymentFastTradeApplePayRecurringRequest.hashCode())) * 31;
        String str = this.rsaPublicKey;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeApplePayRequest(countryCode=" + this.countryCode + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", merchantId=" + this.merchantId + ", merchantName=" + this.merchantName + ", supportedNetworkStrings=" + this.supportedNetworkStrings + ", recurringRequest=" + this.recurringRequest + ", rsaPublicKey=" + this.rsaPublicKey + ')';
    }
}
