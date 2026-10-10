package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradingPairInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/TradingPairInfo;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingPairInfo {

    /* JADX INFO: compiled from: TradingPairInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Request;", "", "fiatCurrency", "", "cryptoCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @NotNull
        private final String cryptoCurrency;

        @NotNull
        private final String fiatCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency);
        }

        public Request(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            this.fiatCurrency = fiatCurrency;
            this.cryptoCurrency = cryptoCurrency;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = request.cryptoCurrency;
            }
            return request.copy(str, str2);
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
        public final Request copy(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            return new Request(fiatCurrency, cryptoCurrency);
        }

        @NotNull
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @NotNull
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        public int hashCode() {
            return (this.fiatCurrency.hashCode() * 31) + this.cryptoCurrency.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ')';
        }
    }

    /* JADX INFO: compiled from: TradingPairInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\f\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00062"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "", "fiatCurrency", "", "fiatMinAmount", "fiatMaxAmount", "fiatPrecision", "", "cryptoCurrency", "cryptoMinAmount", "cryptoMaxAmount", "cryptoPrecision", "isSupportRecurring", "", "hasRecurringPlan", "recurringId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getFiatMinAmount", "getFiatMaxAmount", "getFiatPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCryptoCurrency", "getCryptoMinAmount", "getCryptoMaxAmount", "getCryptoPrecision", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasRecurringPlan", "getRecurringId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String cryptoMaxAmount;

        @Nullable
        private final String cryptoMinAmount;

        @Nullable
        private final Integer cryptoPrecision;

        @Nullable
        private final String fiatCurrency;

        @SerializedName("fiatMaxAmount")
        @Nullable
        private final String fiatMaxAmount;

        @SerializedName("fiatMinAmount")
        @Nullable
        private final String fiatMinAmount;

        @Nullable
        private final Integer fiatPrecision;

        @Nullable
        private final Boolean hasRecurringPlan;

        @Nullable
        private final Boolean isSupportRecurring;

        @Nullable
        private final String recurringId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.fiatCurrency, response.fiatCurrency) && Intrinsics.areEqual(this.fiatMinAmount, response.fiatMinAmount) && Intrinsics.areEqual(this.fiatMaxAmount, response.fiatMaxAmount) && Intrinsics.areEqual(this.fiatPrecision, response.fiatPrecision) && Intrinsics.areEqual(this.cryptoCurrency, response.cryptoCurrency) && Intrinsics.areEqual(this.cryptoMinAmount, response.cryptoMinAmount) && Intrinsics.areEqual(this.cryptoMaxAmount, response.cryptoMaxAmount) && Intrinsics.areEqual(this.cryptoPrecision, response.cryptoPrecision) && Intrinsics.areEqual(this.isSupportRecurring, response.isSupportRecurring) && Intrinsics.areEqual(this.hasRecurringPlan, response.hasRecurringPlan) && Intrinsics.areEqual(this.recurringId, response.recurringId);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, Boolean bool, Boolean bool2, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = response.fiatMinAmount;
            }
            if ((i11 & 4) != 0) {
                str3 = response.fiatMaxAmount;
            }
            if ((i11 & 8) != 0) {
                num = response.fiatPrecision;
            }
            if ((i11 & 16) != 0) {
                str4 = response.cryptoCurrency;
            }
            if ((i11 & 32) != 0) {
                str5 = response.cryptoMinAmount;
            }
            if ((i11 & 64) != 0) {
                str6 = response.cryptoMaxAmount;
            }
            if ((i11 & 128) != 0) {
                num2 = response.cryptoPrecision;
            }
            if ((i11 & 256) != 0) {
                bool = response.isSupportRecurring;
            }
            if ((i11 & 512) != 0) {
                bool2 = response.hasRecurringPlan;
            }
            if ((i11 & 1024) != 0) {
                str7 = response.recurringId;
            }
            Boolean bool3 = bool2;
            String str8 = str7;
            Integer num3 = num2;
            Boolean bool4 = bool;
            String str9 = str5;
            String str10 = str6;
            String str11 = str4;
            String str12 = str3;
            return response.copy(str, str2, str12, num, str11, str9, str10, num3, bool4, bool3, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Boolean getHasRecurringPlan() {
            return this.hasRecurringPlan;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getRecurringId() {
            return this.recurringId;
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
        public final Boolean getIsSupportRecurring() {
            return this.isSupportRecurring;
        }

        @NotNull
        public final Response copy(@Nullable String fiatCurrency, @Nullable String fiatMinAmount, @Nullable String fiatMaxAmount, @Nullable Integer fiatPrecision, @Nullable String cryptoCurrency, @Nullable String cryptoMinAmount, @Nullable String cryptoMaxAmount, @Nullable Integer cryptoPrecision, @Nullable Boolean isSupportRecurring, @Nullable Boolean hasRecurringPlan, @Nullable String recurringId) {
            return new Response(fiatCurrency, fiatMinAmount, fiatMaxAmount, fiatPrecision, cryptoCurrency, cryptoMinAmount, cryptoMaxAmount, cryptoPrecision, isSupportRecurring, hasRecurringPlan, recurringId);
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
        public final Boolean getHasRecurringPlan() {
            return this.hasRecurringPlan;
        }

        @Nullable
        public final String getRecurringId() {
            return this.recurringId;
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
            Boolean bool = this.isSupportRecurring;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.hasRecurringPlan;
            int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str7 = this.recurringId;
            return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
        }

        @Nullable
        public final Boolean isSupportRecurring() {
            return this.isSupportRecurring;
        }

        @NotNull
        public String toString() {
            return "Response(fiatCurrency=" + this.fiatCurrency + ", fiatMinAmount=" + this.fiatMinAmount + ", fiatMaxAmount=" + this.fiatMaxAmount + ", fiatPrecision=" + this.fiatPrecision + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoMinAmount=" + this.cryptoMinAmount + ", cryptoMaxAmount=" + this.cryptoMaxAmount + ", cryptoPrecision=" + this.cryptoPrecision + ", isSupportRecurring=" + this.isSupportRecurring + ", hasRecurringPlan=" + this.hasRecurringPlan + ", recurringId=" + this.recurringId + ')';
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str7) {
            this.fiatCurrency = str;
            this.fiatMinAmount = str2;
            this.fiatMaxAmount = str3;
            this.fiatPrecision = num;
            this.cryptoCurrency = str4;
            this.cryptoMinAmount = str5;
            this.cryptoMaxAmount = str6;
            this.cryptoPrecision = num2;
            this.isSupportRecurring = bool;
            this.hasRecurringPlan = bool2;
            this.recurringId = str7;
        }
    }
}
