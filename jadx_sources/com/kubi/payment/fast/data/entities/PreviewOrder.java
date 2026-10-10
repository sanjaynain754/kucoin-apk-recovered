package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.entity.FastFeeModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreviewOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder;", "", "<init>", "()V", "Request", "RecurringInfo", "Response", "P2PExpressInfo", "GooglePayInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreviewOrder {

    /* JADX INFO: compiled from: PreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$GooglePayInfo;", "", "merchantId", "", "merchantName", "supportedNetworks", "", "publicKey", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "getMerchantName", "getSupportedNetworks", "()Ljava/util/List;", "getPublicKey", "getCountryCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GooglePayInfo {

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
            if (!(other instanceof GooglePayInfo)) {
                return false;
            }
            GooglePayInfo googlePayInfo = (GooglePayInfo) other;
            return Intrinsics.areEqual(this.merchantId, googlePayInfo.merchantId) && Intrinsics.areEqual(this.merchantName, googlePayInfo.merchantName) && Intrinsics.areEqual(this.supportedNetworks, googlePayInfo.supportedNetworks) && Intrinsics.areEqual(this.publicKey, googlePayInfo.publicKey) && Intrinsics.areEqual(this.countryCode, googlePayInfo.countryCode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GooglePayInfo copy$default(GooglePayInfo googlePayInfo, String str, String str2, List list, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = googlePayInfo.merchantId;
            }
            if ((i11 & 2) != 0) {
                str2 = googlePayInfo.merchantName;
            }
            if ((i11 & 4) != 0) {
                list = googlePayInfo.supportedNetworks;
            }
            if ((i11 & 8) != 0) {
                str3 = googlePayInfo.publicKey;
            }
            if ((i11 & 16) != 0) {
                str4 = googlePayInfo.countryCode;
            }
            String str5 = str4;
            List list2 = list;
            return googlePayInfo.copy(str, str2, list2, str3, str5);
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
        public final GooglePayInfo copy(@Nullable String merchantId, @Nullable String merchantName, @Nullable List<String> supportedNetworks, @Nullable String publicKey, @Nullable String countryCode) {
            return new GooglePayInfo(merchantId, merchantName, supportedNetworks, publicKey, countryCode);
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
            return "GooglePayInfo(merchantId=" + this.merchantId + ", merchantName=" + this.merchantName + ", supportedNetworks=" + this.supportedNetworks + ", publicKey=" + this.publicKey + ", countryCode=" + this.countryCode + ')';
        }

        public GooglePayInfo(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4) {
            this.merchantId = str;
            this.merchantName = str2;
            this.supportedNetworks = list;
            this.publicKey = str3;
            this.countryCode = str4;
        }
    }

    /* JADX INFO: compiled from: PreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$P2PExpressInfo;", "", "p2pPrice", "", "hedgeMidCurrency", "hedgeMidAmount", "hedgePriceFloat", "hedgePrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getP2pPrice", "()Ljava/lang/String;", "getHedgeMidCurrency", "getHedgeMidAmount", "getHedgePriceFloat", "getHedgePrice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class P2PExpressInfo {

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
            if (!(other instanceof P2PExpressInfo)) {
                return false;
            }
            P2PExpressInfo p2PExpressInfo = (P2PExpressInfo) other;
            return Intrinsics.areEqual(this.p2pPrice, p2PExpressInfo.p2pPrice) && Intrinsics.areEqual(this.hedgeMidCurrency, p2PExpressInfo.hedgeMidCurrency) && Intrinsics.areEqual(this.hedgeMidAmount, p2PExpressInfo.hedgeMidAmount) && Intrinsics.areEqual(this.hedgePriceFloat, p2PExpressInfo.hedgePriceFloat) && Intrinsics.areEqual(this.hedgePrice, p2PExpressInfo.hedgePrice);
        }

        public static /* synthetic */ P2PExpressInfo copy$default(P2PExpressInfo p2PExpressInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = p2PExpressInfo.p2pPrice;
            }
            if ((i11 & 2) != 0) {
                str2 = p2PExpressInfo.hedgeMidCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = p2PExpressInfo.hedgeMidAmount;
            }
            if ((i11 & 8) != 0) {
                str4 = p2PExpressInfo.hedgePriceFloat;
            }
            if ((i11 & 16) != 0) {
                str5 = p2PExpressInfo.hedgePrice;
            }
            String str6 = str5;
            String str7 = str3;
            return p2PExpressInfo.copy(str, str2, str7, str4, str6);
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
        public final P2PExpressInfo copy(@Nullable String p2pPrice, @Nullable String hedgeMidCurrency, @Nullable String hedgeMidAmount, @Nullable String hedgePriceFloat, @Nullable String hedgePrice) {
            return new P2PExpressInfo(p2pPrice, hedgeMidCurrency, hedgeMidAmount, hedgePriceFloat, hedgePrice);
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
            return "P2PExpressInfo(p2pPrice=" + this.p2pPrice + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ", hedgeMidAmount=" + this.hedgeMidAmount + ", hedgePriceFloat=" + this.hedgePriceFloat + ", hedgePrice=" + this.hedgePrice + ')';
        }

        public P2PExpressInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.p2pPrice = str;
            this.hedgeMidCurrency = str2;
            this.hedgeMidAmount = str3;
            this.hedgePriceFloat = str4;
            this.hedgePrice = str5;
        }
    }

    /* JADX INFO: compiled from: PreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RecurringInfo {

        /* JADX INFO: compiled from: PreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;", "", "mode", "", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "dayOfWeek", "dayOfMonth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "getTimeOfDay", "getTimeZone", "getDayOfWeek", "getDayOfMonth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Request {

            @SerializedName("dayOfMonth")
            @Nullable
            private final String dayOfMonth;

            @SerializedName("dayOfWeek")
            @Nullable
            private final String dayOfWeek;

            @SerializedName("frequency")
            @Nullable
            private final String mode;

            @SerializedName("timeOfDay")
            @Nullable
            private final String timeOfDay;

            @SerializedName(RemoteConfigConstants.RequestFieldKey.TIME_ZONE)
            @Nullable
            private final String timeZone;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Request)) {
                    return false;
                }
                Request request = (Request) other;
                return Intrinsics.areEqual(this.mode, request.mode) && Intrinsics.areEqual(this.timeOfDay, request.timeOfDay) && Intrinsics.areEqual(this.timeZone, request.timeZone) && Intrinsics.areEqual(this.dayOfWeek, request.dayOfWeek) && Intrinsics.areEqual(this.dayOfMonth, request.dayOfMonth);
            }

            public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = request.mode;
                }
                if ((i11 & 2) != 0) {
                    str2 = request.timeOfDay;
                }
                if ((i11 & 4) != 0) {
                    str3 = request.timeZone;
                }
                if ((i11 & 8) != 0) {
                    str4 = request.dayOfWeek;
                }
                if ((i11 & 16) != 0) {
                    str5 = request.dayOfMonth;
                }
                String str6 = str5;
                String str7 = str3;
                return request.copy(str, str2, str7, str4, str6);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMode() {
                return this.mode;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTimeOfDay() {
                return this.timeOfDay;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getTimeZone() {
                return this.timeZone;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getDayOfWeek() {
                return this.dayOfWeek;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getDayOfMonth() {
                return this.dayOfMonth;
            }

            @NotNull
            public final Request copy(@Nullable String mode, @Nullable String timeOfDay, @Nullable String timeZone, @Nullable String dayOfWeek, @Nullable String dayOfMonth) {
                return new Request(mode, timeOfDay, timeZone, dayOfWeek, dayOfMonth);
            }

            @Nullable
            public final String getDayOfMonth() {
                return this.dayOfMonth;
            }

            @Nullable
            public final String getDayOfWeek() {
                return this.dayOfWeek;
            }

            @Nullable
            public final String getMode() {
                return this.mode;
            }

            @Nullable
            public final String getTimeOfDay() {
                return this.timeOfDay;
            }

            @Nullable
            public final String getTimeZone() {
                return this.timeZone;
            }

            public int hashCode() {
                String str = this.mode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.timeOfDay;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.timeZone;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.dayOfWeek;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.dayOfMonth;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Request(mode=" + this.mode + ", timeOfDay=" + this.timeOfDay + ", timeZone=" + this.timeZone + ", dayOfWeek=" + this.dayOfWeek + ", dayOfMonth=" + this.dayOfMonth + ')';
            }

            public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                this.mode = str;
                this.timeOfDay = str2;
                this.timeZone = str3;
                this.dayOfWeek = str4;
                this.dayOfMonth = str5;
            }
        }

        /* JADX INFO: compiled from: PreviewOrder.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;", "", "displayRecurringFrequency", "", "fiatCurrency", "fiatAmount", "cryptoCurrency", "cryptoAmount", FirebaseAnalytics.Param.PRICE, "fee", "nextPaymentTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayRecurringFrequency", "()Ljava/lang/String;", "getFiatCurrency", "getFiatAmount", "getCryptoCurrency", "getCryptoAmount", "getPrice", "getFee", "getNextPaymentTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Response {

            @SerializedName("cryptoAmount")
            @Nullable
            private final String cryptoAmount;

            @SerializedName("cryptoCurrency")
            @Nullable
            private final String cryptoCurrency;

            @SerializedName("frequencyDesc")
            @Nullable
            private final String displayRecurringFrequency;

            @SerializedName("fee")
            @Nullable
            private final String fee;

            @SerializedName("fiatAmount")
            @Nullable
            private final String fiatAmount;

            @SerializedName("fiatCurrency")
            @Nullable
            private final String fiatCurrency;

            @SerializedName("nextPaymentDesc")
            @Nullable
            private final String nextPaymentTime;

            @SerializedName(FirebaseAnalytics.Param.PRICE)
            @Nullable
            private final String price;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Response)) {
                    return false;
                }
                Response response = (Response) other;
                return Intrinsics.areEqual(this.displayRecurringFrequency, response.displayRecurringFrequency) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, response.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, response.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, response.cryptoAmount) && Intrinsics.areEqual(this.price, response.price) && Intrinsics.areEqual(this.fee, response.fee) && Intrinsics.areEqual(this.nextPaymentTime, response.nextPaymentTime);
            }

            public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = response.displayRecurringFrequency;
                }
                if ((i11 & 2) != 0) {
                    str2 = response.fiatCurrency;
                }
                if ((i11 & 4) != 0) {
                    str3 = response.fiatAmount;
                }
                if ((i11 & 8) != 0) {
                    str4 = response.cryptoCurrency;
                }
                if ((i11 & 16) != 0) {
                    str5 = response.cryptoAmount;
                }
                if ((i11 & 32) != 0) {
                    str6 = response.price;
                }
                if ((i11 & 64) != 0) {
                    str7 = response.fee;
                }
                if ((i11 & 128) != 0) {
                    str8 = response.nextPaymentTime;
                }
                String str9 = str7;
                String str10 = str8;
                String str11 = str5;
                String str12 = str6;
                return response.copy(str, str2, str3, str4, str11, str12, str9, str10);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDisplayRecurringFrequency() {
                return this.displayRecurringFrequency;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getFiatCurrency() {
                return this.fiatCurrency;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getFiatAmount() {
                return this.fiatAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getCryptoCurrency() {
                return this.cryptoCurrency;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getCryptoAmount() {
                return this.cryptoAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getPrice() {
                return this.price;
            }

            @Nullable
            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getFee() {
                return this.fee;
            }

            @Nullable
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getNextPaymentTime() {
                return this.nextPaymentTime;
            }

            @NotNull
            public final Response copy(@Nullable String displayRecurringFrequency, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String price, @Nullable String fee, @Nullable String nextPaymentTime) {
                return new Response(displayRecurringFrequency, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, price, fee, nextPaymentTime);
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
            public final String getDisplayRecurringFrequency() {
                return this.displayRecurringFrequency;
            }

            @Nullable
            public final String getFee() {
                return this.fee;
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
            public final String getNextPaymentTime() {
                return this.nextPaymentTime;
            }

            @Nullable
            public final String getPrice() {
                return this.price;
            }

            public int hashCode() {
                String str = this.displayRecurringFrequency;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.fiatCurrency;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.fiatAmount;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cryptoCurrency;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.cryptoAmount;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.price;
                int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.fee;
                int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.nextPaymentTime;
                return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Response(displayRecurringFrequency=" + this.displayRecurringFrequency + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", price=" + this.price + ", fee=" + this.fee + ", nextPaymentTime=" + this.nextPaymentTime + ')';
            }

            public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
                this.displayRecurringFrequency = str;
                this.fiatCurrency = str2;
                this.fiatAmount = str3;
                this.cryptoCurrency = str4;
                this.cryptoAmount = str5;
                this.price = str6;
                this.fee = str7;
                this.nextPaymentTime = str8;
            }
        }
    }

    /* JADX INFO: compiled from: PreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0092\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;", "", "tradeType", "", "fiatCurrency", "fiatAmount", "cryptoCurrency", "cryptoAmount", "paymentMethodCode", "cardId", "adId", "paymentMethodName", "isRecurringMode", "", "recurringFrequency", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;)V", "getTradeType", "()Ljava/lang/String;", "getFiatCurrency", "getFiatAmount", "getCryptoCurrency", "getCryptoAmount", "getPaymentMethodCode", "getCardId", "getAdId", "getPaymentMethodName", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecurringFrequency", "()Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Request;)Lcom/kubi/payment/fast/data/entities/PreviewOrder$Request;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("adId")
        @Nullable
        private final String adId;

        @SerializedName("cardId")
        @Nullable
        private final String cardId;

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("recurring")
        @Nullable
        private final Boolean isRecurringMode;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("name")
        @Nullable
        private final String paymentMethodName;

        @SerializedName("recurringInfo")
        @Nullable
        private final RecurringInfo.Request recurringFrequency;

        @SerializedName("tradeType")
        @Nullable
        private final String tradeType;

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable RecurringInfo.Request request) {
            this.tradeType = str;
            this.fiatCurrency = str2;
            this.fiatAmount = str3;
            this.cryptoCurrency = str4;
            this.cryptoAmount = str5;
            this.paymentMethodCode = str6;
            this.cardId = str7;
            this.adId = str8;
            this.paymentMethodName = str9;
            this.isRecurringMode = bool;
            this.recurringFrequency = request;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.tradeType, request.tradeType) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, request.fiatAmount) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, request.cryptoAmount) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.cardId, request.cardId) && Intrinsics.areEqual(this.adId, request.adId) && Intrinsics.areEqual(this.paymentMethodName, request.paymentMethodName) && Intrinsics.areEqual(this.isRecurringMode, request.isRecurringMode) && Intrinsics.areEqual(this.recurringFrequency, request.recurringFrequency);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, RecurringInfo.Request request2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.tradeType;
            }
            if ((i11 & 2) != 0) {
                str2 = request.fiatCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatAmount;
            }
            if ((i11 & 8) != 0) {
                str4 = request.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.cryptoAmount;
            }
            if ((i11 & 32) != 0) {
                str6 = request.paymentMethodCode;
            }
            if ((i11 & 64) != 0) {
                str7 = request.cardId;
            }
            if ((i11 & 128) != 0) {
                str8 = request.adId;
            }
            if ((i11 & 256) != 0) {
                str9 = request.paymentMethodName;
            }
            if ((i11 & 512) != 0) {
                bool = request.isRecurringMode;
            }
            if ((i11 & 1024) != 0) {
                request2 = request.recurringFrequency;
            }
            Boolean bool2 = bool;
            RecurringInfo.Request request3 = request2;
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str5;
            String str15 = str3;
            return request.copy(str, str2, str15, str4, str14, str12, str13, str10, str11, bool2, request3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Boolean getIsRecurringMode() {
            return this.isRecurringMode;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final RecurringInfo.Request getRecurringFrequency() {
            return this.recurringFrequency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAdId() {
            return this.adId;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @NotNull
        public final Request copy(@Nullable String tradeType, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String paymentMethodCode, @Nullable String cardId, @Nullable String adId, @Nullable String paymentMethodName, @Nullable Boolean isRecurringMode, @Nullable RecurringInfo.Request recurringFrequency) {
            return new Request(tradeType, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, paymentMethodCode, cardId, adId, paymentMethodName, isRecurringMode, recurringFrequency);
        }

        @Nullable
        public final String getAdId() {
            return this.adId;
        }

        @Nullable
        public final String getCardId() {
            return this.cardId;
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
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        public final RecurringInfo.Request getRecurringFrequency() {
            return this.recurringFrequency;
        }

        @Nullable
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            String str = this.tradeType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatAmount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoAmount;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.paymentMethodCode;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardId;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.adId;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.paymentMethodName;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool = this.isRecurringMode;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            RecurringInfo.Request request = this.recurringFrequency;
            return iHashCode10 + (request != null ? request.hashCode() : 0);
        }

        @Nullable
        public final Boolean isRecurringMode() {
            return this.isRecurringMode;
        }

        @NotNull
        public String toString() {
            return "Request(tradeType=" + this.tradeType + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", paymentMethodCode=" + this.paymentMethodCode + ", cardId=" + this.cardId + ", adId=" + this.adId + ", paymentMethodName=" + this.paymentMethodName + ", isRecurringMode=" + this.isRecurringMode + ", recurringFrequency=" + this.recurringFrequency + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, RecurringInfo.Request request, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : str5, str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? Boolean.FALSE : bool, (i11 & 1024) != 0 ? null : request);
        }
    }

    /* JADX INFO: compiled from: PreviewOrder.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0001WBÙ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010;\u001a\u00020\u0015J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010L\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003Jþ\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u00152\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020UHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b\u0014\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006X"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "", "quoteId", "", "fiatCurrency", "fiatAmount", "depositCryptoAmount", "cryptoCurrency", "cryptoAmount", "depositFiatAmount", "feeResponse", "Lcom/kubi/otc/entity/FastFeeModel;", "feeCurrency", FirebaseAnalytics.Param.PRICE, "expireTime", "", "priceProtection", "merchantPublicKey", "paymentMethodName", "iconUrl", "isRecurringMode", "", "recurringInfo", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;", "p2PExpressInfo", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$P2PExpressInfo;", "cardToken", "googlePayInfo", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$GooglePayInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FastFeeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;Lcom/kubi/payment/fast/data/entities/PreviewOrder$P2PExpressInfo;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PreviewOrder$GooglePayInfo;)V", "getQuoteId", "()Ljava/lang/String;", "getFiatCurrency", "getFiatAmount", "getDepositCryptoAmount", "getCryptoCurrency", "getCryptoAmount", "getDepositFiatAmount", "getFeeResponse", "()Lcom/kubi/otc/entity/FastFeeModel;", "getFeeCurrency", "getPrice", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPriceProtection", "getMerchantPublicKey", "getPaymentMethodName", "getIconUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecurringInfo", "()Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;", "getP2PExpressInfo", "()Lcom/kubi/payment/fast/data/entities/PreviewOrder$P2PExpressInfo;", "getCardToken", "getGooglePayInfo", "()Lcom/kubi/payment/fast/data/entities/PreviewOrder$GooglePayInfo;", "isProtectedPriceMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FastFeeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/PreviewOrder$RecurringInfo$Response;Lcom/kubi/payment/fast/data/entities/PreviewOrder$P2PExpressInfo;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PreviewOrder$GooglePayInfo;)Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "equals", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @NotNull
        private static final String PROTECT_PRICE_MODE = "protect";

        @SerializedName("cardToken")
        @Nullable
        private final String cardToken;

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("depositCryptoAmount")
        @Nullable
        private final String depositCryptoAmount;

        @SerializedName("depositFiatAmount")
        @Nullable
        private final String depositFiatAmount;

        @SerializedName("quoteExpireTime")
        @Nullable
        private final Long expireTime;

        @SerializedName("feeCurrency")
        @Nullable
        private final String feeCurrency;

        @SerializedName("feeResponse")
        @Nullable
        private final FastFeeModel feeResponse;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("googlePayInfo")
        @Nullable
        private final GooglePayInfo googlePayInfo;

        @SerializedName("iconUrl")
        @Nullable
        private final String iconUrl;

        @SerializedName("recurring")
        @Nullable
        private final Boolean isRecurringMode;

        @SerializedName("platformChannelAccount")
        @Nullable
        private final String merchantPublicKey;

        @SerializedName("p2PExpressInfo")
        @Nullable
        private final P2PExpressInfo p2PExpressInfo;

        @SerializedName("name")
        @Nullable
        private final String paymentMethodName;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final String price;

        @SerializedName("priceProtection")
        @Nullable
        private final String priceProtection;

        @SerializedName("quoteId")
        @Nullable
        private final String quoteId;

        @SerializedName("recurringInfo")
        @Nullable
        private final RecurringInfo.Response recurringInfo;

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable FastFeeModel fastFeeModel, @Nullable String str8, @Nullable String str9, @Nullable Long l11, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool, @Nullable RecurringInfo.Response response, @Nullable P2PExpressInfo p2PExpressInfo, @Nullable String str14, @Nullable GooglePayInfo googlePayInfo) {
            this.quoteId = str;
            this.fiatCurrency = str2;
            this.fiatAmount = str3;
            this.depositCryptoAmount = str4;
            this.cryptoCurrency = str5;
            this.cryptoAmount = str6;
            this.depositFiatAmount = str7;
            this.feeResponse = fastFeeModel;
            this.feeCurrency = str8;
            this.price = str9;
            this.expireTime = l11;
            this.priceProtection = str10;
            this.merchantPublicKey = str11;
            this.paymentMethodName = str12;
            this.iconUrl = str13;
            this.isRecurringMode = bool;
            this.recurringInfo = response;
            this.p2PExpressInfo = p2PExpressInfo;
            this.cardToken = str14;
            this.googlePayInfo = googlePayInfo;
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, String str7, FastFeeModel fastFeeModel, String str8, String str9, Long l11, String str10, String str11, String str12, String str13, Boolean bool, RecurringInfo.Response response2, P2PExpressInfo p2PExpressInfo, String str14, GooglePayInfo googlePayInfo, int i11, Object obj) {
            GooglePayInfo googlePayInfo2;
            String str15;
            String str16 = (i11 & 1) != 0 ? response.quoteId : str;
            String str17 = (i11 & 2) != 0 ? response.fiatCurrency : str2;
            String str18 = (i11 & 4) != 0 ? response.fiatAmount : str3;
            String str19 = (i11 & 8) != 0 ? response.depositCryptoAmount : str4;
            String str20 = (i11 & 16) != 0 ? response.cryptoCurrency : str5;
            String str21 = (i11 & 32) != 0 ? response.cryptoAmount : str6;
            String str22 = (i11 & 64) != 0 ? response.depositFiatAmount : str7;
            FastFeeModel fastFeeModel2 = (i11 & 128) != 0 ? response.feeResponse : fastFeeModel;
            String str23 = (i11 & 256) != 0 ? response.feeCurrency : str8;
            String str24 = (i11 & 512) != 0 ? response.price : str9;
            Long l12 = (i11 & 1024) != 0 ? response.expireTime : l11;
            String str25 = (i11 & 2048) != 0 ? response.priceProtection : str10;
            String str26 = (i11 & 4096) != 0 ? response.merchantPublicKey : str11;
            String str27 = (i11 & 8192) != 0 ? response.paymentMethodName : str12;
            String str28 = str16;
            String str29 = (i11 & 16384) != 0 ? response.iconUrl : str13;
            Boolean bool2 = (i11 & 32768) != 0 ? response.isRecurringMode : bool;
            RecurringInfo.Response response3 = (i11 & 65536) != 0 ? response.recurringInfo : response2;
            P2PExpressInfo p2PExpressInfo2 = (i11 & 131072) != 0 ? response.p2PExpressInfo : p2PExpressInfo;
            String str30 = (i11 & 262144) != 0 ? response.cardToken : str14;
            if ((i11 & 524288) != 0) {
                str15 = str30;
                googlePayInfo2 = response.googlePayInfo;
            } else {
                googlePayInfo2 = googlePayInfo;
                str15 = str30;
            }
            return response.copy(str28, str17, str18, str19, str20, str21, str22, fastFeeModel2, str23, str24, l12, str25, str26, str27, str29, bool2, response3, p2PExpressInfo2, str15, googlePayInfo2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.quoteId, response.quoteId) && Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, response.fiatAmount) && Intrinsics.areEqual(this.depositCryptoAmount, response.depositCryptoAmount) && Intrinsics.areEqual(this.cryptoCurrency, response.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, response.cryptoAmount) && Intrinsics.areEqual(this.depositFiatAmount, response.depositFiatAmount) && Intrinsics.areEqual(this.feeResponse, response.feeResponse) && Intrinsics.areEqual(this.feeCurrency, response.feeCurrency) && Intrinsics.areEqual(this.price, response.price) && Intrinsics.areEqual(this.expireTime, response.expireTime) && Intrinsics.areEqual(this.priceProtection, response.priceProtection) && Intrinsics.areEqual(this.merchantPublicKey, response.merchantPublicKey) && Intrinsics.areEqual(this.paymentMethodName, response.paymentMethodName) && Intrinsics.areEqual(this.iconUrl, response.iconUrl) && Intrinsics.areEqual(this.isRecurringMode, response.isRecurringMode) && Intrinsics.areEqual(this.recurringInfo, response.recurringInfo) && Intrinsics.areEqual(this.p2PExpressInfo, response.p2PExpressInfo) && Intrinsics.areEqual(this.cardToken, response.cardToken) && Intrinsics.areEqual(this.googlePayInfo, response.googlePayInfo);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getPriceProtection() {
            return this.priceProtection;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getMerchantPublicKey() {
            return this.merchantPublicKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Boolean getIsRecurringMode() {
            return this.isRecurringMode;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final RecurringInfo.Response getRecurringInfo() {
            return this.recurringInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final P2PExpressInfo getP2PExpressInfo() {
            return this.p2PExpressInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getCardToken() {
            return this.cardToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final GooglePayInfo getGooglePayInfo() {
            return this.googlePayInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDepositCryptoAmount() {
            return this.depositCryptoAmount;
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
        public final String getDepositFiatAmount() {
            return this.depositFiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final FastFeeModel getFeeResponse() {
            return this.feeResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @NotNull
        public final Response copy(@Nullable String quoteId, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String depositCryptoAmount, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String depositFiatAmount, @Nullable FastFeeModel feeResponse, @Nullable String feeCurrency, @Nullable String price, @Nullable Long expireTime, @Nullable String priceProtection, @Nullable String merchantPublicKey, @Nullable String paymentMethodName, @Nullable String iconUrl, @Nullable Boolean isRecurringMode, @Nullable RecurringInfo.Response recurringInfo, @Nullable P2PExpressInfo p2PExpressInfo, @Nullable String cardToken, @Nullable GooglePayInfo googlePayInfo) {
            return new Response(quoteId, fiatCurrency, fiatAmount, depositCryptoAmount, cryptoCurrency, cryptoAmount, depositFiatAmount, feeResponse, feeCurrency, price, expireTime, priceProtection, merchantPublicKey, paymentMethodName, iconUrl, isRecurringMode, recurringInfo, p2PExpressInfo, cardToken, googlePayInfo);
        }

        @Nullable
        public final String getCardToken() {
            return this.cardToken;
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
        public final String getDepositCryptoAmount() {
            return this.depositCryptoAmount;
        }

        @Nullable
        public final String getDepositFiatAmount() {
            return this.depositFiatAmount;
        }

        @Nullable
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        public final FastFeeModel getFeeResponse() {
            return this.feeResponse;
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
        public final GooglePayInfo getGooglePayInfo() {
            return this.googlePayInfo;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getMerchantPublicKey() {
            return this.merchantPublicKey;
        }

        @Nullable
        public final P2PExpressInfo getP2PExpressInfo() {
            return this.p2PExpressInfo;
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
        public final String getPriceProtection() {
            return this.priceProtection;
        }

        @Nullable
        public final String getQuoteId() {
            return this.quoteId;
        }

        @Nullable
        public final RecurringInfo.Response getRecurringInfo() {
            return this.recurringInfo;
        }

        public int hashCode() {
            String str = this.quoteId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatAmount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.depositCryptoAmount;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoCurrency;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cryptoAmount;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.depositFiatAmount;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            FastFeeModel fastFeeModel = this.feeResponse;
            int iHashCode8 = (iHashCode7 + (fastFeeModel == null ? 0 : fastFeeModel.hashCode())) * 31;
            String str8 = this.feeCurrency;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.price;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l11 = this.expireTime;
            int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str10 = this.priceProtection;
            int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.merchantPublicKey;
            int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.paymentMethodName;
            int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.iconUrl;
            int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Boolean bool = this.isRecurringMode;
            int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
            RecurringInfo.Response response = this.recurringInfo;
            int iHashCode17 = (iHashCode16 + (response == null ? 0 : response.hashCode())) * 31;
            P2PExpressInfo p2PExpressInfo = this.p2PExpressInfo;
            int iHashCode18 = (iHashCode17 + (p2PExpressInfo == null ? 0 : p2PExpressInfo.hashCode())) * 31;
            String str14 = this.cardToken;
            int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
            GooglePayInfo googlePayInfo = this.googlePayInfo;
            return iHashCode19 + (googlePayInfo != null ? googlePayInfo.hashCode() : 0);
        }

        public final boolean isProtectedPriceMode() {
            return Intrinsics.areEqual(this.priceProtection, PROTECT_PRICE_MODE);
        }

        @Nullable
        public final Boolean isRecurringMode() {
            return this.isRecurringMode;
        }

        @NotNull
        public String toString() {
            return "Response(quoteId=" + this.quoteId + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", depositCryptoAmount=" + this.depositCryptoAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", depositFiatAmount=" + this.depositFiatAmount + ", feeResponse=" + this.feeResponse + ", feeCurrency=" + this.feeCurrency + ", price=" + this.price + ", expireTime=" + this.expireTime + ", priceProtection=" + this.priceProtection + ", merchantPublicKey=" + this.merchantPublicKey + ", paymentMethodName=" + this.paymentMethodName + ", iconUrl=" + this.iconUrl + ", isRecurringMode=" + this.isRecurringMode + ", recurringInfo=" + this.recurringInfo + ", p2PExpressInfo=" + this.p2PExpressInfo + ", cardToken=" + this.cardToken + ", googlePayInfo=" + this.googlePayInfo + ')';
        }

        public /* synthetic */ Response(String str, String str2, String str3, String str4, String str5, String str6, String str7, FastFeeModel fastFeeModel, String str8, String str9, Long l11, String str10, String str11, String str12, String str13, Boolean bool, RecurringInfo.Response response, P2PExpressInfo p2PExpressInfo, String str14, GooglePayInfo googlePayInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, fastFeeModel, str8, str9, l11, str10, str11, str12, str13, (i11 & 32768) != 0 ? Boolean.FALSE : bool, (i11 & 65536) != 0 ? null : response, (i11 & 131072) != 0 ? null : p2PExpressInfo, (i11 & 262144) != 0 ? null : str14, (i11 & 524288) != 0 ? null : googlePayInfo);
        }
    }
}
