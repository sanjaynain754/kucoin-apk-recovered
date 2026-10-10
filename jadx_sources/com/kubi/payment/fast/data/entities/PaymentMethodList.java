package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import ht.C38346y;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaymentMethodList.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList;", "", "<init>", "()V", "Request", "Response", "PaymentMethod", "BankCardInfo", "DailyLimit", "AdInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentMethodList {

    /* JADX INFO: compiled from: PaymentMethodList.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;", "", "adId", "", "payTypeCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "getPayTypeCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AdInfo {

        @SerializedName("adId")
        @Nullable
        private final String adId;

        @SerializedName("payTypeCode")
        @Nullable
        private final String payTypeCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdInfo)) {
                return false;
            }
            AdInfo adInfo = (AdInfo) other;
            return Intrinsics.areEqual(this.adId, adInfo.adId) && Intrinsics.areEqual(this.payTypeCode, adInfo.payTypeCode);
        }

        public static /* synthetic */ AdInfo copy$default(AdInfo adInfo, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = adInfo.adId;
            }
            if ((i11 & 2) != 0) {
                str2 = adInfo.payTypeCode;
            }
            return adInfo.copy(str, str2);
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
        public final AdInfo copy(@Nullable String adId, @Nullable String payTypeCode) {
            return new AdInfo(adId, payTypeCode);
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
            return "AdInfo(adId=" + this.adId + ", payTypeCode=" + this.payTypeCode + ')';
        }

        public AdInfo(@Nullable String str, @Nullable String str2) {
            this.adId = str;
            this.payTypeCode = str2;
        }
    }

    /* JADX INFO: compiled from: PaymentMethodList.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;", "", "cardId", "", "cardNumber", "cardFiatCurrency", "cardFiatCurrencyIconUrl", "hasExpired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCardId", "()Ljava/lang/String;", "getCardNumber", "getCardFiatCurrency", "getCardFiatCurrencyIconUrl", "getHasExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BankCardInfo {

        @SerializedName("cardCurrency")
        @Nullable
        private final String cardFiatCurrency;

        @SerializedName("cardCurrencyIconUrl")
        @Nullable
        private final String cardFiatCurrencyIconUrl;

        @SerializedName("id")
        @Nullable
        private final String cardId;

        @SerializedName("cardNumber")
        @Nullable
        private final String cardNumber;

        @SerializedName("hasExpired")
        @Nullable
        private final Boolean hasExpired;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankCardInfo)) {
                return false;
            }
            BankCardInfo bankCardInfo = (BankCardInfo) other;
            return Intrinsics.areEqual(this.cardId, bankCardInfo.cardId) && Intrinsics.areEqual(this.cardNumber, bankCardInfo.cardNumber) && Intrinsics.areEqual(this.cardFiatCurrency, bankCardInfo.cardFiatCurrency) && Intrinsics.areEqual(this.cardFiatCurrencyIconUrl, bankCardInfo.cardFiatCurrencyIconUrl) && Intrinsics.areEqual(this.hasExpired, bankCardInfo.hasExpired);
        }

        public static /* synthetic */ BankCardInfo copy$default(BankCardInfo bankCardInfo, String str, String str2, String str3, String str4, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bankCardInfo.cardId;
            }
            if ((i11 & 2) != 0) {
                str2 = bankCardInfo.cardNumber;
            }
            if ((i11 & 4) != 0) {
                str3 = bankCardInfo.cardFiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = bankCardInfo.cardFiatCurrencyIconUrl;
            }
            if ((i11 & 16) != 0) {
                bool = bankCardInfo.hasExpired;
            }
            Boolean bool2 = bool;
            String str5 = str3;
            return bankCardInfo.copy(str, str2, str5, str4, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardNumber() {
            return this.cardNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCardFiatCurrency() {
            return this.cardFiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCardFiatCurrencyIconUrl() {
            return this.cardFiatCurrencyIconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getHasExpired() {
            return this.hasExpired;
        }

        @NotNull
        public final BankCardInfo copy(@Nullable String cardId, @Nullable String cardNumber, @Nullable String cardFiatCurrency, @Nullable String cardFiatCurrencyIconUrl, @Nullable Boolean hasExpired) {
            return new BankCardInfo(cardId, cardNumber, cardFiatCurrency, cardFiatCurrencyIconUrl, hasExpired);
        }

        @Nullable
        public final String getCardFiatCurrency() {
            return this.cardFiatCurrency;
        }

        @Nullable
        public final String getCardFiatCurrencyIconUrl() {
            return this.cardFiatCurrencyIconUrl;
        }

        @Nullable
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        public final String getCardNumber() {
            return this.cardNumber;
        }

        @Nullable
        public final Boolean getHasExpired() {
            return this.hasExpired;
        }

        public int hashCode() {
            String str = this.cardId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cardFiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cardFiatCurrencyIconUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.hasExpired;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BankCardInfo(cardId=" + this.cardId + ", cardNumber=" + this.cardNumber + ", cardFiatCurrency=" + this.cardFiatCurrency + ", cardFiatCurrencyIconUrl=" + this.cardFiatCurrencyIconUrl + ", hasExpired=" + this.hasExpired + ')';
        }

        public BankCardInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
            this.cardId = str;
            this.cardNumber = str2;
            this.cardFiatCurrency = str3;
            this.cardFiatCurrencyIconUrl = str4;
            this.hasExpired = bool;
        }
    }

    /* JADX INFO: compiled from: PaymentMethodList.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;", "", "dayLimitUsd", "", "leftAmountUsd", FirebaseAnalytics.Param.CURRENCY, "dayLimitCurrency", "leftAmountCurrency", "dayLimitWhiteUser", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDayLimitUsd", "()Ljava/lang/String;", "getLeftAmountUsd", "getCurrency", "getDayLimitCurrency", "getLeftAmountCurrency", "getDayLimitWhiteUser", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DailyLimit {

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private final String currency;

        @SerializedName("dayLimitCurrency")
        @Nullable
        private final String dayLimitCurrency;

        @SerializedName("dayLimitUsd")
        @Nullable
        private final String dayLimitUsd;

        @SerializedName("dayLimitWhiteUser")
        @Nullable
        private final Boolean dayLimitWhiteUser;

        @SerializedName("leftAmountCurrency")
        @Nullable
        private final String leftAmountCurrency;

        @SerializedName("leftAmountUsd")
        @Nullable
        private final String leftAmountUsd;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyLimit)) {
                return false;
            }
            DailyLimit dailyLimit = (DailyLimit) other;
            return Intrinsics.areEqual(this.dayLimitUsd, dailyLimit.dayLimitUsd) && Intrinsics.areEqual(this.leftAmountUsd, dailyLimit.leftAmountUsd) && Intrinsics.areEqual(this.currency, dailyLimit.currency) && Intrinsics.areEqual(this.dayLimitCurrency, dailyLimit.dayLimitCurrency) && Intrinsics.areEqual(this.leftAmountCurrency, dailyLimit.leftAmountCurrency) && Intrinsics.areEqual(this.dayLimitWhiteUser, dailyLimit.dayLimitWhiteUser);
        }

        public static /* synthetic */ DailyLimit copy$default(DailyLimit dailyLimit, String str, String str2, String str3, String str4, String str5, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dailyLimit.dayLimitUsd;
            }
            if ((i11 & 2) != 0) {
                str2 = dailyLimit.leftAmountUsd;
            }
            if ((i11 & 4) != 0) {
                str3 = dailyLimit.currency;
            }
            if ((i11 & 8) != 0) {
                str4 = dailyLimit.dayLimitCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = dailyLimit.leftAmountCurrency;
            }
            if ((i11 & 32) != 0) {
                bool = dailyLimit.dayLimitWhiteUser;
            }
            String str6 = str5;
            Boolean bool2 = bool;
            return dailyLimit.copy(str, str2, str3, str4, str6, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDayLimitUsd() {
            return this.dayLimitUsd;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLeftAmountUsd() {
            return this.leftAmountUsd;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDayLimitCurrency() {
            return this.dayLimitCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLeftAmountCurrency() {
            return this.leftAmountCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getDayLimitWhiteUser() {
            return this.dayLimitWhiteUser;
        }

        @NotNull
        public final DailyLimit copy(@Nullable String dayLimitUsd, @Nullable String leftAmountUsd, @Nullable String currency, @Nullable String dayLimitCurrency, @Nullable String leftAmountCurrency, @Nullable Boolean dayLimitWhiteUser) {
            return new DailyLimit(dayLimitUsd, leftAmountUsd, currency, dayLimitCurrency, leftAmountCurrency, dayLimitWhiteUser);
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getDayLimitCurrency() {
            return this.dayLimitCurrency;
        }

        @Nullable
        public final String getDayLimitUsd() {
            return this.dayLimitUsd;
        }

        @Nullable
        public final Boolean getDayLimitWhiteUser() {
            return this.dayLimitWhiteUser;
        }

        @Nullable
        public final String getLeftAmountCurrency() {
            return this.leftAmountCurrency;
        }

        @Nullable
        public final String getLeftAmountUsd() {
            return this.leftAmountUsd;
        }

        public int hashCode() {
            String str = this.dayLimitUsd;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.leftAmountUsd;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dayLimitCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.leftAmountCurrency;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.dayLimitWhiteUser;
            return iHashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DailyLimit(dayLimitUsd=" + this.dayLimitUsd + ", leftAmountUsd=" + this.leftAmountUsd + ", currency=" + this.currency + ", dayLimitCurrency=" + this.dayLimitCurrency + ", leftAmountCurrency=" + this.leftAmountCurrency + ", dayLimitWhiteUser=" + this.dayLimitWhiteUser + ')';
        }

        public DailyLimit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool) {
            this.dayLimitUsd = str;
            this.leftAmountUsd = str2;
            this.currency = str3;
            this.dayLimitCurrency = str4;
            this.leftAmountCurrency = str5;
            this.dayLimitWhiteUser = bool;
        }
    }

    /* JADX INFO: compiled from: PaymentMethodList.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\bB\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!J\u0006\u0010C\u001a\u00020\fJ\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010W\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eHÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J´\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020\f2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u000b\u0010+R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\"\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b\u0019\u0010+\"\u0004\b;\u0010<R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b=\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b\u001f\u0010+\"\u0004\bB\u0010<¨\u0006c"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "", "paymentType", "", "paymentMethodCode", "channelId", "iconUrl", "name", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "tagText", FirebaseAnalytics.Param.PRICE, "isBalanceSufficient", "", "fiatCurrency", "fiatAmount", "fiatMinAmount", "fiatMaxAmount", "cryptoCurrency", "cryptoAmount", "bankCardInfo", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;", "dailyLimit", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;", "adInfo", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;", "isSelected", "enabled", "color", "hedgeMidCurrency", "supportedNetworks", "", "isHidden", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getPaymentType", "()Ljava/lang/String;", "getPaymentMethodCode", "getChannelId", "getIconUrl", "getName", "getDescription", "getTagText", "getPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFiatCurrency", "getFiatAmount", "getFiatMinAmount", "getFiatMaxAmount", "getCryptoCurrency", "getCryptoAmount", "getBankCardInfo", "()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;", "getDailyLimit", "()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;", "setDailyLimit", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;)V", "getAdInfo", "()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;", "setSelected", "(Ljava/lang/Boolean;)V", "getEnabled", "getColor", "getHedgeMidCurrency", "getSupportedNetworks", "()Ljava/util/List;", "setHidden", "limitContented", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PaymentMethod {

        @SerializedName("adInfo")
        @Nullable
        private final AdInfo adInfo;

        @SerializedName("cardInfo")
        @Nullable
        private final BankCardInfo bankCardInfo;

        @Nullable
        private final String channelId;

        @Nullable
        private final String color;

        @SerializedName("cryptoAmount")
        @Nullable
        private final String cryptoAmount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("dailyLimit")
        @Nullable
        private DailyLimit dailyLimit;

        @SerializedName(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION)
        @Nullable
        private final String description;

        @SerializedName(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)
        @Nullable
        private final Boolean enabled;

        @SerializedName("fiatAmount")
        @Nullable
        private final String fiatAmount;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("fiatMaxAmount")
        @Nullable
        private final String fiatMaxAmount;

        @SerializedName("fiatMinAmount")
        @Nullable
        private final String fiatMinAmount;

        @SerializedName("hedgeMidCurrency")
        @Nullable
        private final String hedgeMidCurrency;

        @SerializedName("iconUrl")
        @Nullable
        private final String iconUrl;

        @SerializedName("balanceSufficient")
        @Nullable
        private final Boolean isBalanceSufficient;

        @Nullable
        private transient Boolean isHidden;

        @SerializedName("selected")
        @Nullable
        private Boolean isSelected;

        @SerializedName("name")
        @Nullable
        private final String name;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("paymentType")
        @Nullable
        private final String paymentType;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        @Nullable
        private final String price;

        @SerializedName("supportedNetworks")
        @Nullable
        private final List<String> supportedNetworks;

        @SerializedName("tag")
        @Nullable
        private final String tagText;

        public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable BankCardInfo bankCardInfo, @Nullable DailyLimit dailyLimit, @Nullable AdInfo adInfo, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str15, @Nullable String str16, @Nullable List<String> list, @Nullable Boolean bool4) {
            this.paymentType = str;
            this.paymentMethodCode = str2;
            this.channelId = str3;
            this.iconUrl = str4;
            this.name = str5;
            this.description = str6;
            this.tagText = str7;
            this.price = str8;
            this.isBalanceSufficient = bool;
            this.fiatCurrency = str9;
            this.fiatAmount = str10;
            this.fiatMinAmount = str11;
            this.fiatMaxAmount = str12;
            this.cryptoCurrency = str13;
            this.cryptoAmount = str14;
            this.bankCardInfo = bankCardInfo;
            this.dailyLimit = dailyLimit;
            this.adInfo = adInfo;
            this.isSelected = bool2;
            this.enabled = bool3;
            this.color = str15;
            this.hedgeMidCurrency = str16;
            this.supportedNetworks = list;
            this.isHidden = bool4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, BankCardInfo bankCardInfo, DailyLimit dailyLimit, AdInfo adInfo, Boolean bool2, Boolean bool3, String str15, String str16, List list, Boolean bool4, int i11, Object obj) {
            Boolean bool5;
            List list2;
            String str17 = (i11 & 1) != 0 ? paymentMethod.paymentType : str;
            String str18 = (i11 & 2) != 0 ? paymentMethod.paymentMethodCode : str2;
            String str19 = (i11 & 4) != 0 ? paymentMethod.channelId : str3;
            String str20 = (i11 & 8) != 0 ? paymentMethod.iconUrl : str4;
            String str21 = (i11 & 16) != 0 ? paymentMethod.name : str5;
            String str22 = (i11 & 32) != 0 ? paymentMethod.description : str6;
            String str23 = (i11 & 64) != 0 ? paymentMethod.tagText : str7;
            String str24 = (i11 & 128) != 0 ? paymentMethod.price : str8;
            Boolean bool6 = (i11 & 256) != 0 ? paymentMethod.isBalanceSufficient : bool;
            String str25 = (i11 & 512) != 0 ? paymentMethod.fiatCurrency : str9;
            String str26 = (i11 & 1024) != 0 ? paymentMethod.fiatAmount : str10;
            String str27 = (i11 & 2048) != 0 ? paymentMethod.fiatMinAmount : str11;
            String str28 = (i11 & 4096) != 0 ? paymentMethod.fiatMaxAmount : str12;
            String str29 = (i11 & 8192) != 0 ? paymentMethod.cryptoCurrency : str13;
            String str30 = str17;
            String str31 = (i11 & 16384) != 0 ? paymentMethod.cryptoAmount : str14;
            BankCardInfo bankCardInfo2 = (i11 & 32768) != 0 ? paymentMethod.bankCardInfo : bankCardInfo;
            DailyLimit dailyLimit2 = (i11 & 65536) != 0 ? paymentMethod.dailyLimit : dailyLimit;
            AdInfo adInfo2 = (i11 & 131072) != 0 ? paymentMethod.adInfo : adInfo;
            Boolean bool7 = (i11 & 262144) != 0 ? paymentMethod.isSelected : bool2;
            Boolean bool8 = (i11 & 524288) != 0 ? paymentMethod.enabled : bool3;
            String str32 = (i11 & 1048576) != 0 ? paymentMethod.color : str15;
            String str33 = (i11 & 2097152) != 0 ? paymentMethod.hedgeMidCurrency : str16;
            List list3 = (i11 & 4194304) != 0 ? paymentMethod.supportedNetworks : list;
            if ((i11 & 8388608) != 0) {
                list2 = list3;
                bool5 = paymentMethod.isHidden;
            } else {
                bool5 = bool4;
                list2 = list3;
            }
            return paymentMethod.copy(str30, str18, str19, str20, str21, str22, str23, str24, bool6, str25, str26, str27, str28, str29, str31, bankCardInfo2, dailyLimit2, adInfo2, bool7, bool8, str32, str33, list2, bool5);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return Intrinsics.areEqual(this.paymentType, paymentMethod.paymentType) && Intrinsics.areEqual(this.paymentMethodCode, paymentMethod.paymentMethodCode) && Intrinsics.areEqual(this.channelId, paymentMethod.channelId) && Intrinsics.areEqual(this.iconUrl, paymentMethod.iconUrl) && Intrinsics.areEqual(this.name, paymentMethod.name) && Intrinsics.areEqual(this.description, paymentMethod.description) && Intrinsics.areEqual(this.tagText, paymentMethod.tagText) && Intrinsics.areEqual(this.price, paymentMethod.price) && Intrinsics.areEqual(this.isBalanceSufficient, paymentMethod.isBalanceSufficient) && Intrinsics.areEqual(this.fiatCurrency, paymentMethod.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, paymentMethod.fiatAmount) && Intrinsics.areEqual(this.fiatMinAmount, paymentMethod.fiatMinAmount) && Intrinsics.areEqual(this.fiatMaxAmount, paymentMethod.fiatMaxAmount) && Intrinsics.areEqual(this.cryptoCurrency, paymentMethod.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, paymentMethod.cryptoAmount) && Intrinsics.areEqual(this.bankCardInfo, paymentMethod.bankCardInfo) && Intrinsics.areEqual(this.dailyLimit, paymentMethod.dailyLimit) && Intrinsics.areEqual(this.adInfo, paymentMethod.adInfo) && Intrinsics.areEqual(this.isSelected, paymentMethod.isSelected) && Intrinsics.areEqual(this.enabled, paymentMethod.enabled) && Intrinsics.areEqual(this.color, paymentMethod.color) && Intrinsics.areEqual(this.hedgeMidCurrency, paymentMethod.hedgeMidCurrency) && Intrinsics.areEqual(this.supportedNetworks, paymentMethod.supportedNetworks) && Intrinsics.areEqual(this.isHidden, paymentMethod.isHidden);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getFiatMinAmount() {
            return this.fiatMinAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getFiatMaxAmount() {
            return this.fiatMaxAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final BankCardInfo getBankCardInfo() {
            return this.bankCardInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final DailyLimit getDailyLimit() {
            return this.dailyLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final AdInfo getAdInfo() {
            return this.adInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getHedgeMidCurrency() {
            return this.hedgeMidCurrency;
        }

        @Nullable
        public final List<String> component23() {
            return this.supportedNetworks;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTagText() {
            return this.tagText;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getIsBalanceSufficient() {
            return this.isBalanceSufficient;
        }

        @NotNull
        public final PaymentMethod copy(@Nullable String paymentType, @Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String iconUrl, @Nullable String name, @Nullable String description, @Nullable String tagText, @Nullable String price, @Nullable Boolean isBalanceSufficient, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String fiatMinAmount, @Nullable String fiatMaxAmount, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable BankCardInfo bankCardInfo, @Nullable DailyLimit dailyLimit, @Nullable AdInfo adInfo, @Nullable Boolean isSelected, @Nullable Boolean enabled, @Nullable String color, @Nullable String hedgeMidCurrency, @Nullable List<String> supportedNetworks, @Nullable Boolean isHidden) {
            return new PaymentMethod(paymentType, paymentMethodCode, channelId, iconUrl, name, description, tagText, price, isBalanceSufficient, fiatCurrency, fiatAmount, fiatMinAmount, fiatMaxAmount, cryptoCurrency, cryptoAmount, bankCardInfo, dailyLimit, adInfo, isSelected, enabled, color, hedgeMidCurrency, supportedNetworks, isHidden);
        }

        @Nullable
        public final AdInfo getAdInfo() {
            return this.adInfo;
        }

        @Nullable
        public final BankCardInfo getBankCardInfo() {
            return this.bankCardInfo;
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final String getColor() {
            return this.color;
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
        public final DailyLimit getDailyLimit() {
            return this.dailyLimit;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
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
        public final String getFiatMaxAmount() {
            return this.fiatMaxAmount;
        }

        @Nullable
        public final String getFiatMinAmount() {
            return this.fiatMinAmount;
        }

        @Nullable
        public final String getHedgeMidCurrency() {
            return this.hedgeMidCurrency;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        public final String getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        public final List<String> getSupportedNetworks() {
            return this.supportedNetworks;
        }

        @Nullable
        public final String getTagText() {
            return this.tagText;
        }

        public int hashCode() {
            String str = this.paymentType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.paymentMethodCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.channelId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.iconUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.name;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.description;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.tagText;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.price;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool = this.isBalanceSufficient;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str9 = this.fiatCurrency;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.fiatAmount;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.fiatMinAmount;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.fiatMaxAmount;
            int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.cryptoCurrency;
            int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.cryptoAmount;
            int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
            BankCardInfo bankCardInfo = this.bankCardInfo;
            int iHashCode16 = (iHashCode15 + (bankCardInfo == null ? 0 : bankCardInfo.hashCode())) * 31;
            DailyLimit dailyLimit = this.dailyLimit;
            int iHashCode17 = (iHashCode16 + (dailyLimit == null ? 0 : dailyLimit.hashCode())) * 31;
            AdInfo adInfo = this.adInfo;
            int iHashCode18 = (iHashCode17 + (adInfo == null ? 0 : adInfo.hashCode())) * 31;
            Boolean bool2 = this.isSelected;
            int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.enabled;
            int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str15 = this.color;
            int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.hedgeMidCurrency;
            int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
            List<String> list = this.supportedNetworks;
            int iHashCode23 = (iHashCode22 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool4 = this.isHidden;
            return iHashCode23 + (bool4 != null ? bool4.hashCode() : 0);
        }

        @Nullable
        public final Boolean isBalanceSufficient() {
            return this.isBalanceSufficient;
        }

        @Nullable
        public final Boolean isHidden() {
            return this.isHidden;
        }

        @Nullable
        public final Boolean isSelected() {
            return this.isSelected;
        }

        public final boolean limitContented() {
            return C45148b.m99794d(this.fiatMinAmount).length() <= 0 || C45148b.m99794d(this.fiatMaxAmount).length() <= 0 || C27039d.m66645e(C38346y.m86490A(this.fiatAmount), C38346y.m86490A(this.fiatMinAmount), C38346y.m86490A(this.fiatMaxAmount));
        }

        public final void setDailyLimit(@Nullable DailyLimit dailyLimit) {
            this.dailyLimit = dailyLimit;
        }

        public final void setHidden(@Nullable Boolean bool) {
            this.isHidden = bool;
        }

        public final void setSelected(@Nullable Boolean bool) {
            this.isSelected = bool;
        }

        @NotNull
        public String toString() {
            return "PaymentMethod(paymentType=" + this.paymentType + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", description=" + this.description + ", tagText=" + this.tagText + ", price=" + this.price + ", isBalanceSufficient=" + this.isBalanceSufficient + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", fiatMinAmount=" + this.fiatMinAmount + ", fiatMaxAmount=" + this.fiatMaxAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", bankCardInfo=" + this.bankCardInfo + ", dailyLimit=" + this.dailyLimit + ", adInfo=" + this.adInfo + ", isSelected=" + this.isSelected + ", enabled=" + this.enabled + ", color=" + this.color + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ", supportedNetworks=" + this.supportedNetworks + ", isHidden=" + this.isHidden + ')';
        }

        public /* synthetic */ PaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, BankCardInfo bankCardInfo, DailyLimit dailyLimit, AdInfo adInfo, Boolean bool2, Boolean bool3, String str15, String str16, List list, Boolean bool4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? null : str6, str7, str8, (i11 & 256) != 0 ? null : bool, str9, str10, str11, str12, str13, str14, (32768 & i11) != 0 ? null : bankCardInfo, (65536 & i11) != 0 ? null : dailyLimit, (131072 & i11) != 0 ? null : adInfo, (262144 & i11) != 0 ? Boolean.FALSE : bool2, bool3, str15, str16, (4194304 & i11) != 0 ? null : list, (i11 & 8388608) != 0 ? Boolean.FALSE : bool4);
        }
    }

    /* JADX INFO: compiled from: PaymentMethodList.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;", "", "tradeType", "", "quoteType", "fiatCurrency", "cryptoCurrency", "amount", "isSupportRecurring", "", "paymentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getQuoteType", "getFiatCurrency", "getCryptoCurrency", "getAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Request;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("amount")
        @Nullable
        private final String amount;

        @SerializedName("cryptoCurrency")
        @Nullable
        private final String cryptoCurrency;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("isSupportRecurring")
        @Nullable
        private final Boolean isSupportRecurring;

        @SerializedName("paymentType")
        @Nullable
        private final String paymentType;

        @SerializedName("quoteType")
        @Nullable
        private final String quoteType;

        @SerializedName("tradeType")
        @Nullable
        private final String tradeType;

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6) {
            this.tradeType = str;
            this.quoteType = str2;
            this.fiatCurrency = str3;
            this.cryptoCurrency = str4;
            this.amount = str5;
            this.isSupportRecurring = bool;
            this.paymentType = str6;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.tradeType, request.tradeType) && Intrinsics.areEqual(this.quoteType, request.quoteType) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.amount, request.amount) && Intrinsics.areEqual(this.isSupportRecurring, request.isSupportRecurring) && Intrinsics.areEqual(this.paymentType, request.paymentType);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.tradeType;
            }
            if ((i11 & 2) != 0) {
                str2 = request.quoteType;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.amount;
            }
            if ((i11 & 32) != 0) {
                bool = request.isSupportRecurring;
            }
            if ((i11 & 64) != 0) {
                str6 = request.paymentType;
            }
            Boolean bool2 = bool;
            String str7 = str6;
            String str8 = str5;
            String str9 = str3;
            return request.copy(str, str2, str9, str4, str8, bool2, str7);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getQuoteType() {
            return this.quoteType;
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
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsSupportRecurring() {
            return this.isSupportRecurring;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPaymentType() {
            return this.paymentType;
        }

        @NotNull
        public final Request copy(@Nullable String tradeType, @Nullable String quoteType, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String amount, @Nullable Boolean isSupportRecurring, @Nullable String paymentType) {
            return new Request(tradeType, quoteType, fiatCurrency, cryptoCurrency, amount, isSupportRecurring, paymentType);
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final String getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        public final String getQuoteType() {
            return this.quoteType;
        }

        @Nullable
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            String str = this.tradeType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.quoteType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.amount;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.isSupportRecurring;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str6 = this.paymentType;
            return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        }

        @Nullable
        public final Boolean isSupportRecurring() {
            return this.isSupportRecurring;
        }

        @NotNull
        public String toString() {
            return "Request(tradeType=" + this.tradeType + ", quoteType=" + this.quoteType + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", amount=" + this.amount + ", isSupportRecurring=" + this.isSupportRecurring + ", paymentType=" + this.paymentType + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? Boolean.FALSE : bool, (i11 & 64) != 0 ? null : str6);
        }
    }

    /* JADX INFO: compiled from: PaymentMethodList.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJ\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "", "paymentType", "", "tips", "dailyLimit", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;", "maxBankCardCount", "", "paymentMethods", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "isHidden", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;)V", "getPaymentType", "()Ljava/lang/String;", "getTips", "getDailyLimit", "()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;", "getMaxBankCardCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymentMethods", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "setHidden", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$DailyLimit;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("dailyLimit")
        @Nullable
        private final DailyLimit dailyLimit;

        @Nullable
        private transient Boolean isHidden;

        @SerializedName("maxCard")
        @Nullable
        private final Integer maxBankCardCount;

        @SerializedName("payments")
        @Nullable
        private final List<PaymentMethod> paymentMethods;

        @SerializedName("paymentType")
        @Nullable
        private final String paymentType;

        @SerializedName(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION)
        @Nullable
        private final String tips;

        public Response(@Nullable String str, @Nullable String str2, @Nullable DailyLimit dailyLimit, @Nullable Integer num, @Nullable List<PaymentMethod> list, @Nullable Boolean bool) {
            this.paymentType = str;
            this.tips = str2;
            this.dailyLimit = dailyLimit;
            this.maxBankCardCount = num;
            this.paymentMethods = list;
            this.isHidden = bool;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.paymentType, response.paymentType) && Intrinsics.areEqual(this.tips, response.tips) && Intrinsics.areEqual(this.dailyLimit, response.dailyLimit) && Intrinsics.areEqual(this.maxBankCardCount, response.maxBankCardCount) && Intrinsics.areEqual(this.paymentMethods, response.paymentMethods) && Intrinsics.areEqual(this.isHidden, response.isHidden);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, String str, String str2, DailyLimit dailyLimit, Integer num, List list, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.paymentType;
            }
            if ((i11 & 2) != 0) {
                str2 = response.tips;
            }
            if ((i11 & 4) != 0) {
                dailyLimit = response.dailyLimit;
            }
            if ((i11 & 8) != 0) {
                num = response.maxBankCardCount;
            }
            if ((i11 & 16) != 0) {
                list = response.paymentMethods;
            }
            if ((i11 & 32) != 0) {
                bool = response.isHidden;
            }
            List list2 = list;
            Boolean bool2 = bool;
            return response.copy(str, str2, dailyLimit, num, list2, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTips() {
            return this.tips;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DailyLimit getDailyLimit() {
            return this.dailyLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getMaxBankCardCount() {
            return this.maxBankCardCount;
        }

        @Nullable
        public final List<PaymentMethod> component5() {
            return this.paymentMethods;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final Response copy(@Nullable String paymentType, @Nullable String tips, @Nullable DailyLimit dailyLimit, @Nullable Integer maxBankCardCount, @Nullable List<PaymentMethod> paymentMethods, @Nullable Boolean isHidden) {
            return new Response(paymentType, tips, dailyLimit, maxBankCardCount, paymentMethods, isHidden);
        }

        @Nullable
        public final DailyLimit getDailyLimit() {
            return this.dailyLimit;
        }

        @Nullable
        public final Integer getMaxBankCardCount() {
            return this.maxBankCardCount;
        }

        @Nullable
        public final List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        @Nullable
        public final String getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        public final String getTips() {
            return this.tips;
        }

        public int hashCode() {
            String str = this.paymentType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tips;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DailyLimit dailyLimit = this.dailyLimit;
            int iHashCode3 = (iHashCode2 + (dailyLimit == null ? 0 : dailyLimit.hashCode())) * 31;
            Integer num = this.maxBankCardCount;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            List<PaymentMethod> list = this.paymentMethods;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isHidden;
            return iHashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isHidden() {
            return this.isHidden;
        }

        public final void setHidden(@Nullable Boolean bool) {
            this.isHidden = bool;
        }

        @NotNull
        public String toString() {
            return "Response(paymentType=" + this.paymentType + ", tips=" + this.tips + ", dailyLimit=" + this.dailyLimit + ", maxBankCardCount=" + this.maxBankCardCount + ", paymentMethods=" + this.paymentMethods + ", isHidden=" + this.isHidden + ')';
        }

        public /* synthetic */ Response(String str, String str2, DailyLimit dailyLimit, Integer num, List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : dailyLimit, num, list, (i11 & 32) != 0 ? Boolean.FALSE : bool);
        }
    }
}
