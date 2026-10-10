package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExpressBuyPreCheck.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck;", "", "<init>", "()V", "Request", "Response", "AmountInterval", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExpressBuyPreCheck {
    public static final int EXIST_AD = 1;
    public static final int EXIST_AD_ADJUST_AMOUNT = 2;
    public static final int IN_EXIST_AD = 0;

    /* JADX INFO: compiled from: ExpressBuyPreCheck.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$AmountInterval;", "", "minAmount", "", "maxAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMinAmount", "()Ljava/lang/String;", "getMaxAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AmountInterval {

        @Nullable
        private final String maxAmount;

        @Nullable
        private final String minAmount;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AmountInterval)) {
                return false;
            }
            AmountInterval amountInterval = (AmountInterval) other;
            return Intrinsics.areEqual(this.minAmount, amountInterval.minAmount) && Intrinsics.areEqual(this.maxAmount, amountInterval.maxAmount);
        }

        public static /* synthetic */ AmountInterval copy$default(AmountInterval amountInterval, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = amountInterval.minAmount;
            }
            if ((i11 & 2) != 0) {
                str2 = amountInterval.maxAmount;
            }
            return amountInterval.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMinAmount() {
            return this.minAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMaxAmount() {
            return this.maxAmount;
        }

        @NotNull
        public final AmountInterval copy(@Nullable String minAmount, @Nullable String maxAmount) {
            return new AmountInterval(minAmount, maxAmount);
        }

        @Nullable
        public final String getMaxAmount() {
            return this.maxAmount;
        }

        @Nullable
        public final String getMinAmount() {
            return this.minAmount;
        }

        public int hashCode() {
            String str = this.minAmount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.maxAmount;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AmountInterval(minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ')';
        }

        public AmountInterval(@Nullable String str, @Nullable String str2) {
            this.minAmount = str;
            this.maxAmount = str2;
        }
    }

    /* JADX INFO: compiled from: ExpressBuyPreCheck.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Request;", "", "fiatCurrency", "", "cryptoCurrency", "quoteType", "amount", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getQuoteType", "getAmount", "getTradeType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String amount;

        @NotNull
        private final String cryptoCurrency;

        @NotNull
        private final String fiatCurrency;

        @NotNull
        private final String quoteType;

        @NotNull
        private final String tradeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.quoteType, request.quoteType) && Intrinsics.areEqual(this.amount, request.amount) && Intrinsics.areEqual(this.tradeType, request.tradeType);
        }

        public Request(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String quoteType, @NotNull String amount, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.fiatCurrency = fiatCurrency;
            this.cryptoCurrency = cryptoCurrency;
            this.quoteType = quoteType;
            this.amount = amount;
            this.tradeType = tradeType;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = request.cryptoCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = request.quoteType;
            }
            if ((i11 & 8) != 0) {
                str4 = request.amount;
            }
            if ((i11 & 16) != 0) {
                str5 = request.tradeType;
            }
            String str6 = str5;
            String str7 = str3;
            return request.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getQuoteType() {
            return this.quoteType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        public final Request copy(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String quoteType, @NotNull String amount, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            return new Request(fiatCurrency, cryptoCurrency, quoteType, amount, tradeType);
        }

        @NotNull
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @NotNull
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        public final String getQuoteType() {
            return this.quoteType;
        }

        @NotNull
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            return (((((((this.fiatCurrency.hashCode() * 31) + this.cryptoCurrency.hashCode()) * 31) + this.quoteType.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.tradeType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", quoteType=" + this.quoteType + ", amount=" + this.amount + ", tradeType=" + this.tradeType + ')';
        }
    }

    /* JADX INFO: compiled from: ExpressBuyPreCheck.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "", "matchAd", "", FirebaseAnalytics.Param.CURRENCY, "", "quoteType", "amountIntervalList", "", "Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$AmountInterval;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMatchAd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getQuoteType", "getAmountIntervalList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kubi/payment/p2p/data/entities/ExpressBuyPreCheck$Response;", "equals", "", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final List<AmountInterval> amountIntervalList;

        @Nullable
        private final String currency;

        @Nullable
        private final Integer matchAd;

        @Nullable
        private final String quoteType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.matchAd, response.matchAd) && Intrinsics.areEqual(this.currency, response.currency) && Intrinsics.areEqual(this.quoteType, response.quoteType) && Intrinsics.areEqual(this.amountIntervalList, response.amountIntervalList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, Integer num, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = response.matchAd;
            }
            if ((i11 & 2) != 0) {
                str = response.currency;
            }
            if ((i11 & 4) != 0) {
                str2 = response.quoteType;
            }
            if ((i11 & 8) != 0) {
                list = response.amountIntervalList;
            }
            return response.copy(num, str, str2, list);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getMatchAd() {
            return this.matchAd;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getQuoteType() {
            return this.quoteType;
        }

        @Nullable
        public final List<AmountInterval> component4() {
            return this.amountIntervalList;
        }

        @NotNull
        public final Response copy(@Nullable Integer matchAd, @Nullable String currency, @Nullable String quoteType, @Nullable List<AmountInterval> amountIntervalList) {
            return new Response(matchAd, currency, quoteType, amountIntervalList);
        }

        @Nullable
        public final List<AmountInterval> getAmountIntervalList() {
            return this.amountIntervalList;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final Integer getMatchAd() {
            return this.matchAd;
        }

        @Nullable
        public final String getQuoteType() {
            return this.quoteType;
        }

        public int hashCode() {
            Integer num = this.matchAd;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.currency;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.quoteType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<AmountInterval> list = this.amountIntervalList;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(matchAd=" + this.matchAd + ", currency=" + this.currency + ", quoteType=" + this.quoteType + ", amountIntervalList=" + this.amountIntervalList + ')';
        }

        public Response(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable List<AmountInterval> list) {
            this.matchAd = num;
            this.currency = str;
            this.quoteType = str2;
            this.amountIntervalList = list;
        }
    }
}
