package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Constants;
import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellPaymentMethod.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPaymentMethod;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellPaymentMethod {

    /* JADX INFO: compiled from: SellPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Request;", "", "fiatCurrency", "", "cryptoCurrency", "amount", "quoteType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getAmount", "getQuoteType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

        @SerializedName("quoteType")
        @Nullable
        private final String quoteType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.amount, request.amount) && Intrinsics.areEqual(this.quoteType, request.quoteType);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                str2 = request.cryptoCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = request.amount;
            }
            if ((i11 & 8) != 0) {
                str4 = request.quoteType;
            }
            return request.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getQuoteType() {
            return this.quoteType;
        }

        @NotNull
        public final Request copy(@Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String amount, @Nullable String quoteType) {
            return new Request(fiatCurrency, cryptoCurrency, amount, quoteType);
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
        public final String getQuoteType() {
            return this.quoteType;
        }

        public int hashCode() {
            String str = this.fiatCurrency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cryptoCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.amount;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.quoteType;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", amount=" + this.amount + ", quoteType=" + this.quoteType + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.fiatCurrency = str;
            this.cryptoCurrency = str2;
            this.amount = str3;
            this.quoteType = str4;
        }
    }

    /* JADX INFO: compiled from: SellPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JP\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "", "categoryTitle", "", "canEdit", "", "maxCardCount", "", "hasP2PGuide", "paymentMethods", "", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getCategoryTitle", "()Ljava/lang/String;", "getCanEdit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxCardCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasP2PGuide", "getPaymentMethods", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response;", "equals", "other", "hashCode", "toString", "PaymentMethod", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("hasBankCard")
        @Nullable
        private final Boolean canEdit;

        @SerializedName("paymentTypeTitle")
        @Nullable
        private final String categoryTitle;

        @SerializedName("showP2PGuide")
        @Nullable
        private final Boolean hasP2PGuide;

        @SerializedName("maxCard")
        @Nullable
        private final Integer maxCardCount;

        @SerializedName("payments")
        @Nullable
        private final List<PaymentMethod> paymentMethods;

        /* JADX INFO: compiled from: SellPaymentMethod.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002FGB·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010=\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003JÚ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0011\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006H"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "", "paymentMethodCode", "", "channelId", "fiatCurrency", "cryptoCurrency", "fiatMinAmount", "fiatMaxAmount", "cryptoMinAmount", "cryptoMaxAmount", "iconUrl", "paymentMethodName", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "cryptoUnitPrice", "fiatUnitPrice", "tag", Constants.ENABLE_DISABLE, "", "cardInfo", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;", "p2pInfo", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getFiatCurrency", "getCryptoCurrency", "getFiatMinAmount", "getFiatMaxAmount", "getCryptoMinAmount", "getCryptoMaxAmount", "getIconUrl", "getPaymentMethodName", "getDescription", "getCryptoUnitPrice", "getFiatUnitPrice", "getTag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCardInfo", "()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;", "getP2pInfo", "()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;)Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "equals", "other", "hashCode", "", "toString", "CardInfo", "P2PInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class PaymentMethod {

            @SerializedName("cardInfo")
            @Nullable
            private final CardInfo cardInfo;

            @SerializedName("channelId")
            @Nullable
            private final String channelId;

            @SerializedName("cryptoCurrency")
            @Nullable
            private final String cryptoCurrency;

            @SerializedName("cryptoMaxAmount")
            @Nullable
            private final String cryptoMaxAmount;

            @SerializedName("cryptoMinAmount")
            @Nullable
            private final String cryptoMinAmount;

            @SerializedName("priceToFiat")
            @Nullable
            private final String cryptoUnitPrice;

            @SerializedName(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION)
            @Nullable
            private final String description;

            @SerializedName("fiatCurrency")
            @Nullable
            private final String fiatCurrency;

            @SerializedName("fiatMaxAmount")
            @Nullable
            private final String fiatMaxAmount;

            @SerializedName("fiatMinAmount")
            @Nullable
            private final String fiatMinAmount;

            @SerializedName("priceToCrypto")
            @Nullable
            private final String fiatUnitPrice;

            @SerializedName("iconUrl")
            @Nullable
            private final String iconUrl;

            @SerializedName(Constants.ENABLE_DISABLE)
            @Nullable
            private final Boolean isEnabled;

            @SerializedName("p2pInfo")
            @Nullable
            private final P2PInfo p2pInfo;

            @SerializedName("paymentMethodCode")
            @Nullable
            private final String paymentMethodCode;

            @SerializedName("name")
            @Nullable
            private final String paymentMethodName;

            @SerializedName("tag")
            @Nullable
            private final String tag;

            /* JADX INFO: compiled from: SellPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;", "", "cardId", "", "hasExpired", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getCardId", "()Ljava/lang/String;", "getHasExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$CardInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class CardInfo {

                @SerializedName("cardId")
                @Nullable
                private final String cardId;

                @SerializedName("hasExpired")
                @Nullable
                private final Boolean hasExpired;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CardInfo)) {
                        return false;
                    }
                    CardInfo cardInfo = (CardInfo) other;
                    return Intrinsics.areEqual(this.cardId, cardInfo.cardId) && Intrinsics.areEqual(this.hasExpired, cardInfo.hasExpired);
                }

                public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = cardInfo.cardId;
                    }
                    if ((i11 & 2) != 0) {
                        bool = cardInfo.hasExpired;
                    }
                    return cardInfo.copy(str, bool);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getCardId() {
                    return this.cardId;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Boolean getHasExpired() {
                    return this.hasExpired;
                }

                @NotNull
                public final CardInfo copy(@Nullable String cardId, @Nullable Boolean hasExpired) {
                    return new CardInfo(cardId, hasExpired);
                }

                @Nullable
                public final String getCardId() {
                    return this.cardId;
                }

                @Nullable
                public final Boolean getHasExpired() {
                    return this.hasExpired;
                }

                public int hashCode() {
                    String str = this.cardId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.hasExpired;
                    return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "CardInfo(cardId=" + this.cardId + ", hasExpired=" + this.hasExpired + ')';
                }

                public CardInfo(@Nullable String str, @Nullable Boolean bool) {
                    this.cardId = str;
                    this.hasExpired = bool;
                }
            }

            /* JADX INFO: compiled from: SellPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;", "", "adId", "", "payTypeCode", "userPayTypeBind", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAdId", "()Ljava/lang/String;", "getPayTypeCode", "getUserPayTypeBind", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod$P2PInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class P2PInfo {

                @SerializedName("adId")
                @Nullable
                private final String adId;

                @Nullable
                private final String payTypeCode;

                @Nullable
                private final Boolean userPayTypeBind;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof P2PInfo)) {
                        return false;
                    }
                    P2PInfo p2PInfo = (P2PInfo) other;
                    return Intrinsics.areEqual(this.adId, p2PInfo.adId) && Intrinsics.areEqual(this.payTypeCode, p2PInfo.payTypeCode) && Intrinsics.areEqual(this.userPayTypeBind, p2PInfo.userPayTypeBind);
                }

                public static /* synthetic */ P2PInfo copy$default(P2PInfo p2PInfo, String str, String str2, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = p2PInfo.adId;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = p2PInfo.payTypeCode;
                    }
                    if ((i11 & 4) != 0) {
                        bool = p2PInfo.userPayTypeBind;
                    }
                    return p2PInfo.copy(str, str2, bool);
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

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Boolean getUserPayTypeBind() {
                    return this.userPayTypeBind;
                }

                @NotNull
                public final P2PInfo copy(@Nullable String adId, @Nullable String payTypeCode, @Nullable Boolean userPayTypeBind) {
                    return new P2PInfo(adId, payTypeCode, userPayTypeBind);
                }

                @Nullable
                public final String getAdId() {
                    return this.adId;
                }

                @Nullable
                public final String getPayTypeCode() {
                    return this.payTypeCode;
                }

                @Nullable
                public final Boolean getUserPayTypeBind() {
                    return this.userPayTypeBind;
                }

                public int hashCode() {
                    String str = this.adId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.payTypeCode;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Boolean bool = this.userPayTypeBind;
                    return iHashCode2 + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "P2PInfo(adId=" + this.adId + ", payTypeCode=" + this.payTypeCode + ", userPayTypeBind=" + this.userPayTypeBind + ')';
                }

                public P2PInfo(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
                    this.adId = str;
                    this.payTypeCode = str2;
                    this.userPayTypeBind = bool;
                }
            }

            public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Boolean bool, @Nullable CardInfo cardInfo, @Nullable P2PInfo p2PInfo) {
                this.paymentMethodCode = str;
                this.channelId = str2;
                this.fiatCurrency = str3;
                this.cryptoCurrency = str4;
                this.fiatMinAmount = str5;
                this.fiatMaxAmount = str6;
                this.cryptoMinAmount = str7;
                this.cryptoMaxAmount = str8;
                this.iconUrl = str9;
                this.paymentMethodName = str10;
                this.description = str11;
                this.cryptoUnitPrice = str12;
                this.fiatUnitPrice = str13;
                this.tag = str14;
                this.isEnabled = bool;
                this.cardInfo = cardInfo;
                this.p2pInfo = p2PInfo;
            }

            public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, CardInfo cardInfo, P2PInfo p2PInfo, int i11, Object obj) {
                P2PInfo p2PInfo2;
                CardInfo cardInfo2;
                String str15 = (i11 & 1) != 0 ? paymentMethod.paymentMethodCode : str;
                String str16 = (i11 & 2) != 0 ? paymentMethod.channelId : str2;
                String str17 = (i11 & 4) != 0 ? paymentMethod.fiatCurrency : str3;
                String str18 = (i11 & 8) != 0 ? paymentMethod.cryptoCurrency : str4;
                String str19 = (i11 & 16) != 0 ? paymentMethod.fiatMinAmount : str5;
                String str20 = (i11 & 32) != 0 ? paymentMethod.fiatMaxAmount : str6;
                String str21 = (i11 & 64) != 0 ? paymentMethod.cryptoMinAmount : str7;
                String str22 = (i11 & 128) != 0 ? paymentMethod.cryptoMaxAmount : str8;
                String str23 = (i11 & 256) != 0 ? paymentMethod.iconUrl : str9;
                String str24 = (i11 & 512) != 0 ? paymentMethod.paymentMethodName : str10;
                String str25 = (i11 & 1024) != 0 ? paymentMethod.description : str11;
                String str26 = (i11 & 2048) != 0 ? paymentMethod.cryptoUnitPrice : str12;
                String str27 = (i11 & 4096) != 0 ? paymentMethod.fiatUnitPrice : str13;
                String str28 = (i11 & 8192) != 0 ? paymentMethod.tag : str14;
                String str29 = str15;
                Boolean bool2 = (i11 & 16384) != 0 ? paymentMethod.isEnabled : bool;
                CardInfo cardInfo3 = (i11 & 32768) != 0 ? paymentMethod.cardInfo : cardInfo;
                if ((i11 & 65536) != 0) {
                    cardInfo2 = cardInfo3;
                    p2PInfo2 = paymentMethod.p2pInfo;
                } else {
                    p2PInfo2 = p2PInfo;
                    cardInfo2 = cardInfo3;
                }
                return paymentMethod.copy(str29, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, bool2, cardInfo2, p2PInfo2);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentMethod)) {
                    return false;
                }
                PaymentMethod paymentMethod = (PaymentMethod) other;
                return Intrinsics.areEqual(this.paymentMethodCode, paymentMethod.paymentMethodCode) && Intrinsics.areEqual(this.channelId, paymentMethod.channelId) && Intrinsics.areEqual(this.fiatCurrency, paymentMethod.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, paymentMethod.cryptoCurrency) && Intrinsics.areEqual(this.fiatMinAmount, paymentMethod.fiatMinAmount) && Intrinsics.areEqual(this.fiatMaxAmount, paymentMethod.fiatMaxAmount) && Intrinsics.areEqual(this.cryptoMinAmount, paymentMethod.cryptoMinAmount) && Intrinsics.areEqual(this.cryptoMaxAmount, paymentMethod.cryptoMaxAmount) && Intrinsics.areEqual(this.iconUrl, paymentMethod.iconUrl) && Intrinsics.areEqual(this.paymentMethodName, paymentMethod.paymentMethodName) && Intrinsics.areEqual(this.description, paymentMethod.description) && Intrinsics.areEqual(this.cryptoUnitPrice, paymentMethod.cryptoUnitPrice) && Intrinsics.areEqual(this.fiatUnitPrice, paymentMethod.fiatUnitPrice) && Intrinsics.areEqual(this.tag, paymentMethod.tag) && Intrinsics.areEqual(this.isEnabled, paymentMethod.isEnabled) && Intrinsics.areEqual(this.cardInfo, paymentMethod.cardInfo) && Intrinsics.areEqual(this.p2pInfo, paymentMethod.p2pInfo);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPaymentMethodCode() {
                return this.paymentMethodCode;
            }

            @Nullable
            /* JADX INFO: renamed from: component10, reason: from getter */
            public final String getPaymentMethodName() {
                return this.paymentMethodName;
            }

            @Nullable
            /* JADX INFO: renamed from: component11, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @Nullable
            /* JADX INFO: renamed from: component12, reason: from getter */
            public final String getCryptoUnitPrice() {
                return this.cryptoUnitPrice;
            }

            @Nullable
            /* JADX INFO: renamed from: component13, reason: from getter */
            public final String getFiatUnitPrice() {
                return this.fiatUnitPrice;
            }

            @Nullable
            /* JADX INFO: renamed from: component14, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            @Nullable
            /* JADX INFO: renamed from: component15, reason: from getter */
            public final Boolean getIsEnabled() {
                return this.isEnabled;
            }

            @Nullable
            /* JADX INFO: renamed from: component16, reason: from getter */
            public final CardInfo getCardInfo() {
                return this.cardInfo;
            }

            @Nullable
            /* JADX INFO: renamed from: component17, reason: from getter */
            public final P2PInfo getP2pInfo() {
                return this.p2pInfo;
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
            public final String getFiatMinAmount() {
                return this.fiatMinAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getFiatMaxAmount() {
                return this.fiatMaxAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getCryptoMinAmount() {
                return this.cryptoMinAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getCryptoMaxAmount() {
                return this.cryptoMaxAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component9, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            @NotNull
            public final PaymentMethod copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String fiatMinAmount, @Nullable String fiatMaxAmount, @Nullable String cryptoMinAmount, @Nullable String cryptoMaxAmount, @Nullable String iconUrl, @Nullable String paymentMethodName, @Nullable String description, @Nullable String cryptoUnitPrice, @Nullable String fiatUnitPrice, @Nullable String tag, @Nullable Boolean isEnabled, @Nullable CardInfo cardInfo, @Nullable P2PInfo p2pInfo) {
                return new PaymentMethod(paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, fiatMinAmount, fiatMaxAmount, cryptoMinAmount, cryptoMaxAmount, iconUrl, paymentMethodName, description, cryptoUnitPrice, fiatUnitPrice, tag, isEnabled, cardInfo, p2pInfo);
            }

            @Nullable
            public final CardInfo getCardInfo() {
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
            public final String getCryptoMaxAmount() {
                return this.cryptoMaxAmount;
            }

            @Nullable
            public final String getCryptoMinAmount() {
                return this.cryptoMinAmount;
            }

            @Nullable
            public final String getCryptoUnitPrice() {
                return this.cryptoUnitPrice;
            }

            @Nullable
            public final String getDescription() {
                return this.description;
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
            public final String getFiatUnitPrice() {
                return this.fiatUnitPrice;
            }

            @Nullable
            public final String getIconUrl() {
                return this.iconUrl;
            }

            @Nullable
            public final P2PInfo getP2pInfo() {
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
            public final String getTag() {
                return this.tag;
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
                String str5 = this.fiatMinAmount;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.fiatMaxAmount;
                int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.cryptoMinAmount;
                int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.cryptoMaxAmount;
                int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.iconUrl;
                int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.paymentMethodName;
                int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.description;
                int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.cryptoUnitPrice;
                int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.fiatUnitPrice;
                int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.tag;
                int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
                Boolean bool = this.isEnabled;
                int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
                CardInfo cardInfo = this.cardInfo;
                int iHashCode16 = (iHashCode15 + (cardInfo == null ? 0 : cardInfo.hashCode())) * 31;
                P2PInfo p2PInfo = this.p2pInfo;
                return iHashCode16 + (p2PInfo != null ? p2PInfo.hashCode() : 0);
            }

            @Nullable
            public final Boolean isEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                return "PaymentMethod(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", fiatMinAmount=" + this.fiatMinAmount + ", fiatMaxAmount=" + this.fiatMaxAmount + ", cryptoMinAmount=" + this.cryptoMinAmount + ", cryptoMaxAmount=" + this.cryptoMaxAmount + ", iconUrl=" + this.iconUrl + ", paymentMethodName=" + this.paymentMethodName + ", description=" + this.description + ", cryptoUnitPrice=" + this.cryptoUnitPrice + ", fiatUnitPrice=" + this.fiatUnitPrice + ", tag=" + this.tag + ", isEnabled=" + this.isEnabled + ", cardInfo=" + this.cardInfo + ", p2pInfo=" + this.p2pInfo + ')';
            }

            public /* synthetic */ PaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, CardInfo cardInfo, P2PInfo p2PInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, (i11 & 8192) != 0 ? null : str14, bool, (32768 & i11) != 0 ? null : cardInfo, (i11 & 65536) != 0 ? null : p2PInfo);
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.categoryTitle, response.categoryTitle) && Intrinsics.areEqual(this.canEdit, response.canEdit) && Intrinsics.areEqual(this.maxCardCount, response.maxCardCount) && Intrinsics.areEqual(this.hasP2PGuide, response.hasP2PGuide) && Intrinsics.areEqual(this.paymentMethods, response.paymentMethods);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, String str, Boolean bool, Integer num, Boolean bool2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.categoryTitle;
            }
            if ((i11 & 2) != 0) {
                bool = response.canEdit;
            }
            if ((i11 & 4) != 0) {
                num = response.maxCardCount;
            }
            if ((i11 & 8) != 0) {
                bool2 = response.hasP2PGuide;
            }
            if ((i11 & 16) != 0) {
                list = response.paymentMethods;
            }
            List list2 = list;
            Integer num2 = num;
            return response.copy(str, bool, num2, bool2, list2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCategoryTitle() {
            return this.categoryTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getCanEdit() {
            return this.canEdit;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getMaxCardCount() {
            return this.maxCardCount;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getHasP2PGuide() {
            return this.hasP2PGuide;
        }

        @Nullable
        public final List<PaymentMethod> component5() {
            return this.paymentMethods;
        }

        @NotNull
        public final Response copy(@Nullable String categoryTitle, @Nullable Boolean canEdit, @Nullable Integer maxCardCount, @Nullable Boolean hasP2PGuide, @Nullable List<PaymentMethod> paymentMethods) {
            return new Response(categoryTitle, canEdit, maxCardCount, hasP2PGuide, paymentMethods);
        }

        @Nullable
        public final Boolean getCanEdit() {
            return this.canEdit;
        }

        @Nullable
        public final String getCategoryTitle() {
            return this.categoryTitle;
        }

        @Nullable
        public final Boolean getHasP2PGuide() {
            return this.hasP2PGuide;
        }

        @Nullable
        public final Integer getMaxCardCount() {
            return this.maxCardCount;
        }

        @Nullable
        public final List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public int hashCode() {
            String str = this.categoryTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.canEdit;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.maxCardCount;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool2 = this.hasP2PGuide;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List<PaymentMethod> list = this.paymentMethods;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(categoryTitle=" + this.categoryTitle + ", canEdit=" + this.canEdit + ", maxCardCount=" + this.maxCardCount + ", hasP2PGuide=" + this.hasP2PGuide + ", paymentMethods=" + this.paymentMethods + ')';
        }

        public Response(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable List<PaymentMethod> list) {
            this.categoryTitle = str;
            this.canEdit = bool;
            this.maxCardCount = num;
            this.hasP2PGuide = bool2;
            this.paymentMethods = list;
        }
    }
}
