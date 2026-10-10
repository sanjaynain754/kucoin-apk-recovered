package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PTradingPairInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo;", "", "<init>", "()V", "Request", "Response", "Info", "TradeTypeEnum", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PTradingPairInfo {

    /* JADX INFO: compiled from: P2PTradingPairInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00061"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Info;", "", "fiatCurrency", "", "fiatMinAmount", "fiatMaxAmount", "fiatPrecision", "", "cryptoCurrency", "cryptoMinAmount", "cryptoMaxAmount", "cryptoPrecision", "expressGuideVideoUrl", FirebaseAnalytics.Param.PRICE, "hedgeMidCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getFiatMinAmount", "getFiatMaxAmount", "getFiatPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCryptoCurrency", "getCryptoMinAmount", "getCryptoMaxAmount", "getCryptoPrecision", "getExpressGuideVideoUrl", "getPrice", "getHedgeMidCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Info;", "equals", "", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Info {

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String cryptoMaxAmount;

        @Nullable
        private final String cryptoMinAmount;

        @Nullable
        private final Integer cryptoPrecision;

        @Nullable
        private final String expressGuideVideoUrl;

        @Nullable
        private final String fiatCurrency;

        @Nullable
        private final String fiatMaxAmount;

        @Nullable
        private final String fiatMinAmount;

        @Nullable
        private final Integer fiatPrecision;

        @Nullable
        private final String hedgeMidCurrency;

        @Nullable
        private final String price;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.fiatCurrency, info.fiatCurrency) && Intrinsics.areEqual(this.fiatMinAmount, info.fiatMinAmount) && Intrinsics.areEqual(this.fiatMaxAmount, info.fiatMaxAmount) && Intrinsics.areEqual(this.fiatPrecision, info.fiatPrecision) && Intrinsics.areEqual(this.cryptoCurrency, info.cryptoCurrency) && Intrinsics.areEqual(this.cryptoMinAmount, info.cryptoMinAmount) && Intrinsics.areEqual(this.cryptoMaxAmount, info.cryptoMaxAmount) && Intrinsics.areEqual(this.cryptoPrecision, info.cryptoPrecision) && Intrinsics.areEqual(this.expressGuideVideoUrl, info.expressGuideVideoUrl) && Intrinsics.areEqual(this.price, info.price) && Intrinsics.areEqual(this.hedgeMidCurrency, info.hedgeMidCurrency);
        }

        public static /* synthetic */ Info copy$default(Info info, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, String str7, String str8, String str9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = info.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = info.fiatMinAmount;
            }
            if ((i11 & 4) != 0) {
                str3 = info.fiatMaxAmount;
            }
            if ((i11 & 8) != 0) {
                num = info.fiatPrecision;
            }
            if ((i11 & 16) != 0) {
                str4 = info.cryptoCurrency;
            }
            if ((i11 & 32) != 0) {
                str5 = info.cryptoMinAmount;
            }
            if ((i11 & 64) != 0) {
                str6 = info.cryptoMaxAmount;
            }
            if ((i11 & 128) != 0) {
                num2 = info.cryptoPrecision;
            }
            if ((i11 & 256) != 0) {
                str7 = info.expressGuideVideoUrl;
            }
            if ((i11 & 512) != 0) {
                str8 = info.price;
            }
            if ((i11 & 1024) != 0) {
                str9 = info.hedgeMidCurrency;
            }
            String str10 = str8;
            String str11 = str9;
            Integer num3 = num2;
            String str12 = str7;
            String str13 = str5;
            String str14 = str6;
            String str15 = str4;
            String str16 = str3;
            return info.copy(str, str2, str16, num, str15, str13, str14, num3, str12, str10, str11);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getHedgeMidCurrency() {
            return this.hedgeMidCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatMinAmount() {
            return this.fiatMinAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatMaxAmount() {
            return this.fiatMaxAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getFiatPrecision() {
            return this.fiatPrecision;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCryptoMinAmount() {
            return this.cryptoMinAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCryptoMaxAmount() {
            return this.cryptoMaxAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Integer getCryptoPrecision() {
            return this.cryptoPrecision;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getExpressGuideVideoUrl() {
            return this.expressGuideVideoUrl;
        }

        @NotNull
        public final Info copy(@Nullable String fiatCurrency, @Nullable String fiatMinAmount, @Nullable String fiatMaxAmount, @Nullable Integer fiatPrecision, @Nullable String cryptoCurrency, @Nullable String cryptoMinAmount, @Nullable String cryptoMaxAmount, @Nullable Integer cryptoPrecision, @Nullable String expressGuideVideoUrl, @Nullable String price, @Nullable String hedgeMidCurrency) {
            return new Info(fiatCurrency, fiatMinAmount, fiatMaxAmount, fiatPrecision, cryptoCurrency, cryptoMinAmount, cryptoMaxAmount, cryptoPrecision, expressGuideVideoUrl, price, hedgeMidCurrency);
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getCryptoMaxAmount() {
            return this.cryptoMaxAmount;
        }

        @Nullable
        public final String getCryptoMinAmount() {
            return this.cryptoMinAmount;
        }

        @Nullable
        public final Integer getCryptoPrecision() {
            return this.cryptoPrecision;
        }

        @Nullable
        public final String getExpressGuideVideoUrl() {
            return this.expressGuideVideoUrl;
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
        public final Integer getFiatPrecision() {
            return this.fiatPrecision;
        }

        @Nullable
        public final String getHedgeMidCurrency() {
            return this.hedgeMidCurrency;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        public int hashCode() {
            String str = this.fiatCurrency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatMinAmount;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatMaxAmount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.fiatPrecision;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cryptoMinAmount;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cryptoMaxAmount;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num2 = this.cryptoPrecision;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str7 = this.expressGuideVideoUrl;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.price;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.hedgeMidCurrency;
            return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Info(fiatCurrency=" + this.fiatCurrency + ", fiatMinAmount=" + this.fiatMinAmount + ", fiatMaxAmount=" + this.fiatMaxAmount + ", fiatPrecision=" + this.fiatPrecision + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoMinAmount=" + this.cryptoMinAmount + ", cryptoMaxAmount=" + this.cryptoMaxAmount + ", cryptoPrecision=" + this.cryptoPrecision + ", expressGuideVideoUrl=" + this.expressGuideVideoUrl + ", price=" + this.price + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ')';
        }

        public Info(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
            this.fiatCurrency = str;
            this.fiatMinAmount = str2;
            this.fiatMaxAmount = str3;
            this.fiatPrecision = num;
            this.cryptoCurrency = str4;
            this.cryptoMinAmount = str5;
            this.cryptoMaxAmount = str6;
            this.cryptoPrecision = num2;
            this.expressGuideVideoUrl = str7;
            this.price = str8;
            this.hedgeMidCurrency = str9;
        }
    }

    /* JADX INFO: compiled from: P2PTradingPairInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Request;", "", "fiatCurrency", "", "cryptoCurrency", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getTradeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String cryptoCurrency;

        @NotNull
        private final String fiatCurrency;

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
            return Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.tradeType, request.tradeType);
        }

        public Request(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.fiatCurrency = fiatCurrency;
            this.cryptoCurrency = cryptoCurrency;
            this.tradeType = tradeType;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = request.cryptoCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = request.tradeType;
            }
            return request.copy(str, str2, str3);
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
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        public final Request copy(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            return new Request(fiatCurrency, cryptoCurrency, tradeType);
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
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            return (((this.fiatCurrency.hashCode() * 31) + this.cryptoCurrency.hashCode()) * 31) + this.tradeType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", tradeType=" + this.tradeType + ')';
        }
    }

    /* JADX INFO: compiled from: P2PTradingPairInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Response;", "", "info", "Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Info;", "<init>", "(Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Info;)V", "getInfo", "()Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$Info;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final Info info;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.info, ((Response) other).info);
        }

        public static /* synthetic */ Response copy$default(Response response, Info info, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                info = response.info;
            }
            return response.copy(info);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Info getInfo() {
            return this.info;
        }

        @NotNull
        public final Response copy(@Nullable Info info) {
            return new Response(info);
        }

        @Nullable
        public final Info getInfo() {
            return this.info;
        }

        public int hashCode() {
            Info info = this.info;
            if (info == null) {
                return 0;
            }
            return info.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(info=" + this.info + ')';
        }

        public Response(@Nullable Info info) {
            this.info = info;
        }
    }

    /* JADX INFO: compiled from: P2PTradingPairInfo.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PTradingPairInfo$TradeTypeEnum;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "BUY", "SELL", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum TradeTypeEnum {
        BUY("BUY"),
        SELL("SELL");


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f39705c = EnumEntriesKt.enumEntries(m48470a());

        @NotNull
        private final String type;

        @NotNull
        public static EnumEntries<TradeTypeEnum> getEntries() {
            return f39705c;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        TradeTypeEnum(String str) {
            this.type = str;
        }
    }
}
