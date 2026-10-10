package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayRequest;", "", FirebaseAnalytics.Param.PRICE, "", "publicKey", "merchantName", AppsFlyerProperties.CURRENCY_CODE, "allowedCardNetworks", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAllowedCardNetworks", "()Ljava/util/List;", "getCountryCode", "()Ljava/lang/String;", "getCurrencyCode", "getMerchantName", "getPrice", "getPublicKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeGooglePayRequest {

    @Nullable
    private final List<String> allowedCardNetworks;

    @Nullable
    private final String countryCode;

    @NotNull
    private final String currencyCode;

    @NotNull
    private final String merchantName;

    @NotNull
    private final String price;

    @NotNull
    private final String publicKey;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeGooglePayRequest)) {
            return false;
        }
        KCJSApiPaymentFastTradeGooglePayRequest kCJSApiPaymentFastTradeGooglePayRequest = (KCJSApiPaymentFastTradeGooglePayRequest) other;
        return Intrinsics.areEqual(this.price, kCJSApiPaymentFastTradeGooglePayRequest.price) && Intrinsics.areEqual(this.publicKey, kCJSApiPaymentFastTradeGooglePayRequest.publicKey) && Intrinsics.areEqual(this.merchantName, kCJSApiPaymentFastTradeGooglePayRequest.merchantName) && Intrinsics.areEqual(this.currencyCode, kCJSApiPaymentFastTradeGooglePayRequest.currencyCode) && Intrinsics.areEqual(this.allowedCardNetworks, kCJSApiPaymentFastTradeGooglePayRequest.allowedCardNetworks) && Intrinsics.areEqual(this.countryCode, kCJSApiPaymentFastTradeGooglePayRequest.countryCode);
    }

    public KCJSApiPaymentFastTradeGooglePayRequest(@NotNull String price, @NotNull String publicKey, @NotNull String merchantName, @NotNull String currencyCode, @Nullable List<String> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.price = price;
        this.publicKey = publicKey;
        this.merchantName = merchantName;
        this.currencyCode = currencyCode;
        this.allowedCardNetworks = list;
        this.countryCode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiPaymentFastTradeGooglePayRequest copy$default(KCJSApiPaymentFastTradeGooglePayRequest kCJSApiPaymentFastTradeGooglePayRequest, String str, String str2, String str3, String str4, List list, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeGooglePayRequest.price;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentFastTradeGooglePayRequest.publicKey;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiPaymentFastTradeGooglePayRequest.merchantName;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiPaymentFastTradeGooglePayRequest.currencyCode;
        }
        if ((i11 & 16) != 0) {
            list = kCJSApiPaymentFastTradeGooglePayRequest.allowedCardNetworks;
        }
        if ((i11 & 32) != 0) {
            str5 = kCJSApiPaymentFastTradeGooglePayRequest.countryCode;
        }
        List list2 = list;
        String str6 = str5;
        return kCJSApiPaymentFastTradeGooglePayRequest.copy(str, str2, str3, str4, list2, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final List<String> component5() {
        return this.allowedCardNetworks;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeGooglePayRequest copy(@NotNull String price, @NotNull String publicKey, @NotNull String merchantName, @NotNull String currencyCode, @Nullable List<String> allowedCardNetworks, @Nullable String countryCode) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new KCJSApiPaymentFastTradeGooglePayRequest(price, publicKey, merchantName, currencyCode, allowedCardNetworks, countryCode);
    }

    @Nullable
    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int iHashCode = ((((((this.price.hashCode() * 31) + this.publicKey.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + this.currencyCode.hashCode()) * 31;
        List<String> list = this.allowedCardNetworks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.countryCode;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeGooglePayRequest(price=" + this.price + ", publicKey=" + this.publicKey + ", merchantName=" + this.merchantName + ", currencyCode=" + this.currencyCode + ", allowedCardNetworks=" + this.allowedCardNetworks + ", countryCode=" + this.countryCode + ')';
    }
}
