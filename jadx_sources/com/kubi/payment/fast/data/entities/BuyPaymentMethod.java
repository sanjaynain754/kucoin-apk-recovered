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

/* JADX INFO: compiled from: BuyPaymentMethod.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyPaymentMethod {

    /* JADX INFO: compiled from: BuyPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;", "", "fiatCurrency", "", "cryptoCurrency", "amount", "quoteType", "isRecurring", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getAmount", "getQuoteType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Request;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

        @SerializedName("isRecurring")
        @Nullable
        private final Boolean isRecurring;

        @SerializedName("quoteType")
        @Nullable
        private final String quoteType;

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
            this.fiatCurrency = str;
            this.cryptoCurrency = str2;
            this.amount = str3;
            this.quoteType = str4;
            this.isRecurring = bool;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.amount, request.amount) && Intrinsics.areEqual(this.quoteType, request.quoteType) && Intrinsics.areEqual(this.isRecurring, request.isRecurring);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, Boolean bool, int i11, Object obj) {
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
            if ((i11 & 16) != 0) {
                bool = request.isRecurring;
            }
            Boolean bool2 = bool;
            String str5 = str3;
            return request.copy(str, str2, str5, str4, bool2);
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

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getIsRecurring() {
            return this.isRecurring;
        }

        @NotNull
        public final Request copy(@Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String amount, @Nullable String quoteType, @Nullable Boolean isRecurring) {
            return new Request(fiatCurrency, cryptoCurrency, amount, quoteType, isRecurring);
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
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.isRecurring;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isRecurring() {
            return this.isRecurring;
        }

        @NotNull
        public String toString() {
            return "Request(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", amount=" + this.amount + ", quoteType=" + this.quoteType + ", isRecurring=" + this.isRecurring + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? Boolean.FALSE : bool);
        }
    }

    /* JADX INFO: compiled from: BuyPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JP\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "", "categoryTitle", "", "canEdit", "", "maxCardCount", "", "hasP2PGuide", "paymentMethods", "", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getCategoryTitle", "()Ljava/lang/String;", "getCanEdit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxCardCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasP2PGuide", "getPaymentMethods", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response;", "equals", "other", "hashCode", "toString", "PaymentMethod", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

        /* JADX INFO: compiled from: BuyPaymentMethod.kt */
        @Keep
        @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006Z[\\]^_Bå\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u008a\u0002\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u00112\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0010\u0010/R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006`"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;", "", "paymentMethodCode", "", "channelId", "fiatCurrency", "cryptoCurrency", "fiatMinAmount", "fiatMaxAmount", "cryptoMinAmount", "cryptoMaxAmount", "iconUrl", "paymentMethodName", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "cryptoUnitPrice", "fiatUnitPrice", Constants.ENABLE_DISABLE, "", "tag", "cardInfo", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$CardInfo;", "balanceInfo", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$BalanceInfo;", "p2pInfo", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$P2PInfo;", "walletInfo", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$WalletInfo;", "popularInfo", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$PopularInfo;", "rewardInfo", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$RewardInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$CardInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$BalanceInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$P2PInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$WalletInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$PopularInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$RewardInfo;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getFiatCurrency", "getCryptoCurrency", "getFiatMinAmount", "getFiatMaxAmount", "getCryptoMinAmount", "getCryptoMaxAmount", "getIconUrl", "getPaymentMethodName", "getDescription", "getCryptoUnitPrice", "getFiatUnitPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTag", "getCardInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$CardInfo;", "getBalanceInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$BalanceInfo;", "getP2pInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$P2PInfo;", "getWalletInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$WalletInfo;", "getPopularInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$PopularInfo;", "getRewardInfo", "()Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$RewardInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$CardInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$BalanceInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$P2PInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$WalletInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$PopularInfo;Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$RewardInfo;)Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;", "equals", "other", "hashCode", "", "toString", "CardInfo", "BalanceInfo", "P2PInfo", "WalletInfo", "PopularInfo", "RewardInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class PaymentMethod {

            @SerializedName("balanceInfo")
            @Nullable
            private final BalanceInfo balanceInfo;

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

            @SerializedName("popularInfo")
            @Nullable
            private final PopularInfo popularInfo;

            @SerializedName("rewardInfo")
            @Nullable
            private final RewardInfo rewardInfo;

            @SerializedName("tag")
            @Nullable
            private final String tag;

            @SerializedName("mobileWalletInfo")
            @Nullable
            private final WalletInfo walletInfo;

            /* JADX INFO: compiled from: BuyPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$BalanceInfo;", "", "availableBalance", "", "balanceSufficient", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getAvailableBalance", "()Ljava/lang/String;", "getBalanceSufficient", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$BalanceInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class BalanceInfo {

                @SerializedName("availableBalance")
                @Nullable
                private final String availableBalance;

                @SerializedName("balanceSufficient")
                @Nullable
                private final Boolean balanceSufficient;

                /* JADX WARN: Multi-variable type inference failed */
                public BalanceInfo() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BalanceInfo)) {
                        return false;
                    }
                    BalanceInfo balanceInfo = (BalanceInfo) other;
                    return Intrinsics.areEqual(this.availableBalance, balanceInfo.availableBalance) && Intrinsics.areEqual(this.balanceSufficient, balanceInfo.balanceSufficient);
                }

                public BalanceInfo(@Nullable String str, @Nullable Boolean bool) {
                    this.availableBalance = str;
                    this.balanceSufficient = bool;
                }

                public static /* synthetic */ BalanceInfo copy$default(BalanceInfo balanceInfo, String str, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = balanceInfo.availableBalance;
                    }
                    if ((i11 & 2) != 0) {
                        bool = balanceInfo.balanceSufficient;
                    }
                    return balanceInfo.copy(str, bool);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getAvailableBalance() {
                    return this.availableBalance;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Boolean getBalanceSufficient() {
                    return this.balanceSufficient;
                }

                @NotNull
                public final BalanceInfo copy(@Nullable String availableBalance, @Nullable Boolean balanceSufficient) {
                    return new BalanceInfo(availableBalance, balanceSufficient);
                }

                @Nullable
                public final String getAvailableBalance() {
                    return this.availableBalance;
                }

                @Nullable
                public final Boolean getBalanceSufficient() {
                    return this.balanceSufficient;
                }

                public int hashCode() {
                    String str = this.availableBalance;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.balanceSufficient;
                    return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "BalanceInfo(availableBalance=" + this.availableBalance + ", balanceSufficient=" + this.balanceSufficient + ')';
                }

                public /* synthetic */ BalanceInfo(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
                }
            }

            /* JADX INFO: compiled from: BuyPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$CardInfo;", "", "cardId", "", "cardCurrency", "hasExpired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCardId", "()Ljava/lang/String;", "getCardCurrency", "getHasExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$CardInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class CardInfo {

                @SerializedName("cardCurrency")
                @Nullable
                private final String cardCurrency;

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
                    return Intrinsics.areEqual(this.cardId, cardInfo.cardId) && Intrinsics.areEqual(this.cardCurrency, cardInfo.cardCurrency) && Intrinsics.areEqual(this.hasExpired, cardInfo.hasExpired);
                }

                public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, String str2, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = cardInfo.cardId;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = cardInfo.cardCurrency;
                    }
                    if ((i11 & 4) != 0) {
                        bool = cardInfo.hasExpired;
                    }
                    return cardInfo.copy(str, str2, bool);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getCardId() {
                    return this.cardId;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getCardCurrency() {
                    return this.cardCurrency;
                }

                @Nullable
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Boolean getHasExpired() {
                    return this.hasExpired;
                }

                @NotNull
                public final CardInfo copy(@Nullable String cardId, @Nullable String cardCurrency, @Nullable Boolean hasExpired) {
                    return new CardInfo(cardId, cardCurrency, hasExpired);
                }

                @Nullable
                public final String getCardCurrency() {
                    return this.cardCurrency;
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
                    String str2 = this.cardCurrency;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Boolean bool = this.hasExpired;
                    return iHashCode2 + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "CardInfo(cardId=" + this.cardId + ", cardCurrency=" + this.cardCurrency + ", hasExpired=" + this.hasExpired + ')';
                }

                public CardInfo(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
                    this.cardId = str;
                    this.cardCurrency = str2;
                    this.hasExpired = bool;
                }
            }

            /* JADX INFO: compiled from: BuyPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$P2PInfo;", "", "adId", "", "payTypeCode", "hedgeMidCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "getPayTypeCode", "getHedgeMidCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class P2PInfo {

                @SerializedName("adId")
                @Nullable
                private final String adId;

                @SerializedName("hedgeMidCurrency")
                @Nullable
                private final String hedgeMidCurrency;

                @SerializedName("payTypeCode")
                @Nullable
                private final String payTypeCode;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof P2PInfo)) {
                        return false;
                    }
                    P2PInfo p2PInfo = (P2PInfo) other;
                    return Intrinsics.areEqual(this.adId, p2PInfo.adId) && Intrinsics.areEqual(this.payTypeCode, p2PInfo.payTypeCode) && Intrinsics.areEqual(this.hedgeMidCurrency, p2PInfo.hedgeMidCurrency);
                }

                public static /* synthetic */ P2PInfo copy$default(P2PInfo p2PInfo, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = p2PInfo.adId;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = p2PInfo.payTypeCode;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = p2PInfo.hedgeMidCurrency;
                    }
                    return p2PInfo.copy(str, str2, str3);
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
                public final String getHedgeMidCurrency() {
                    return this.hedgeMidCurrency;
                }

                @NotNull
                public final P2PInfo copy(@Nullable String adId, @Nullable String payTypeCode, @Nullable String hedgeMidCurrency) {
                    return new P2PInfo(adId, payTypeCode, hedgeMidCurrency);
                }

                @Nullable
                public final String getAdId() {
                    return this.adId;
                }

                @Nullable
                public final String getHedgeMidCurrency() {
                    return this.hedgeMidCurrency;
                }

                @Nullable
                public final String getPayTypeCode() {
                    return this.payTypeCode;
                }

                public int hashCode() {
                    String str = this.adId;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.payTypeCode;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.hedgeMidCurrency;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "P2PInfo(adId=" + this.adId + ", payTypeCode=" + this.payTypeCode + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ')';
                }

                public P2PInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                    this.adId = str;
                    this.payTypeCode = str2;
                    this.hedgeMidCurrency = str3;
                }
            }

            /* JADX INFO: compiled from: BuyPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$PopularInfo;", "", "boundChannelAccount", "", "<init>", "(Ljava/lang/Boolean;)V", "getBoundChannelAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$PopularInfo;", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class PopularInfo {

                @SerializedName("boundChannelAccount")
                @Nullable
                private final Boolean boundChannelAccount;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PopularInfo) && Intrinsics.areEqual(this.boundChannelAccount, ((PopularInfo) other).boundChannelAccount);
                }

                public static /* synthetic */ PopularInfo copy$default(PopularInfo popularInfo, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        bool = popularInfo.boundChannelAccount;
                    }
                    return popularInfo.copy(bool);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Boolean getBoundChannelAccount() {
                    return this.boundChannelAccount;
                }

                @NotNull
                public final PopularInfo copy(@Nullable Boolean boundChannelAccount) {
                    return new PopularInfo(boundChannelAccount);
                }

                @Nullable
                public final Boolean getBoundChannelAccount() {
                    return this.boundChannelAccount;
                }

                public int hashCode() {
                    Boolean bool = this.boundChannelAccount;
                    if (bool == null) {
                        return 0;
                    }
                    return bool.hashCode();
                }

                @NotNull
                public String toString() {
                    return "PopularInfo(boundChannelAccount=" + this.boundChannelAccount + ')';
                }

                public PopularInfo(@Nullable Boolean bool) {
                    this.boundChannelAccount = bool;
                }
            }

            /* JADX INFO: compiled from: BuyPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$RewardInfo;", "", "message", "", "fullMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getFullMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class RewardInfo {

                @SerializedName("fullMessage")
                @Nullable
                private final String fullMessage;

                @SerializedName("message")
                @Nullable
                private final String message;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RewardInfo)) {
                        return false;
                    }
                    RewardInfo rewardInfo = (RewardInfo) other;
                    return Intrinsics.areEqual(this.message, rewardInfo.message) && Intrinsics.areEqual(this.fullMessage, rewardInfo.fullMessage);
                }

                public static /* synthetic */ RewardInfo copy$default(RewardInfo rewardInfo, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = rewardInfo.message;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = rewardInfo.fullMessage;
                    }
                    return rewardInfo.copy(str, str2);
                }

                @Nullable
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                @Nullable
                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getFullMessage() {
                    return this.fullMessage;
                }

                @NotNull
                public final RewardInfo copy(@Nullable String message, @Nullable String fullMessage) {
                    return new RewardInfo(message, fullMessage);
                }

                @Nullable
                public final String getFullMessage() {
                    return this.fullMessage;
                }

                @Nullable
                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    String str = this.message;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.fullMessage;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "RewardInfo(message=" + this.message + ", fullMessage=" + this.fullMessage + ')';
                }

                public RewardInfo(@Nullable String str, @Nullable String str2) {
                    this.message = str;
                    this.fullMessage = str2;
                }
            }

            /* JADX INFO: compiled from: BuyPaymentMethod.kt */
            @Keep
            @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod$WalletInfo;", "", "supportedNetworks", "", "", "<init>", "(Ljava/util/List;)V", "getSupportedNetworks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final /* data */ class WalletInfo {

                @SerializedName("supportedNetworks")
                @Nullable
                private final List<String> supportedNetworks;

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof WalletInfo) && Intrinsics.areEqual(this.supportedNetworks, ((WalletInfo) other).supportedNetworks);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ WalletInfo copy$default(WalletInfo walletInfo, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        list = walletInfo.supportedNetworks;
                    }
                    return walletInfo.copy(list);
                }

                @Nullable
                public final List<String> component1() {
                    return this.supportedNetworks;
                }

                @NotNull
                public final WalletInfo copy(@Nullable List<String> supportedNetworks) {
                    return new WalletInfo(supportedNetworks);
                }

                @Nullable
                public final List<String> getSupportedNetworks() {
                    return this.supportedNetworks;
                }

                public int hashCode() {
                    List<String> list = this.supportedNetworks;
                    if (list == null) {
                        return 0;
                    }
                    return list.hashCode();
                }

                @NotNull
                public String toString() {
                    return "WalletInfo(supportedNetworks=" + this.supportedNetworks + ')';
                }

                public WalletInfo(@Nullable List<String> list) {
                    this.supportedNetworks = list;
                }
            }

            public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool, @Nullable String str14, @Nullable CardInfo cardInfo, @Nullable BalanceInfo balanceInfo, @Nullable P2PInfo p2PInfo, @Nullable WalletInfo walletInfo, @Nullable PopularInfo popularInfo, @Nullable RewardInfo rewardInfo) {
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
                this.isEnabled = bool;
                this.tag = str14;
                this.cardInfo = cardInfo;
                this.balanceInfo = balanceInfo;
                this.p2pInfo = p2PInfo;
                this.walletInfo = walletInfo;
                this.popularInfo = popularInfo;
                this.rewardInfo = rewardInfo;
            }

            public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, CardInfo cardInfo, BalanceInfo balanceInfo, P2PInfo p2PInfo, WalletInfo walletInfo, PopularInfo popularInfo, RewardInfo rewardInfo, int i11, Object obj) {
                RewardInfo rewardInfo2;
                PopularInfo popularInfo2;
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
                Boolean bool2 = (i11 & 8192) != 0 ? paymentMethod.isEnabled : bool;
                String str28 = str15;
                String str29 = (i11 & 16384) != 0 ? paymentMethod.tag : str14;
                CardInfo cardInfo2 = (i11 & 32768) != 0 ? paymentMethod.cardInfo : cardInfo;
                BalanceInfo balanceInfo2 = (i11 & 65536) != 0 ? paymentMethod.balanceInfo : balanceInfo;
                P2PInfo p2PInfo2 = (i11 & 131072) != 0 ? paymentMethod.p2pInfo : p2PInfo;
                WalletInfo walletInfo2 = (i11 & 262144) != 0 ? paymentMethod.walletInfo : walletInfo;
                PopularInfo popularInfo3 = (i11 & 524288) != 0 ? paymentMethod.popularInfo : popularInfo;
                if ((i11 & 1048576) != 0) {
                    popularInfo2 = popularInfo3;
                    rewardInfo2 = paymentMethod.rewardInfo;
                } else {
                    rewardInfo2 = rewardInfo;
                    popularInfo2 = popularInfo3;
                }
                return paymentMethod.copy(str28, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, bool2, str29, cardInfo2, balanceInfo2, p2PInfo2, walletInfo2, popularInfo2, rewardInfo2);
            }

            @NotNull
            public final PaymentMethod copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String fiatMinAmount, @Nullable String fiatMaxAmount, @Nullable String cryptoMinAmount, @Nullable String cryptoMaxAmount, @Nullable String iconUrl, @Nullable String paymentMethodName, @Nullable String description, @Nullable String cryptoUnitPrice, @Nullable String fiatUnitPrice, @Nullable Boolean isEnabled, @Nullable String tag, @Nullable CardInfo cardInfo, @Nullable BalanceInfo balanceInfo, @Nullable P2PInfo p2pInfo, @Nullable WalletInfo walletInfo, @Nullable PopularInfo popularInfo, @Nullable RewardInfo rewardInfo) {
                return new PaymentMethod(paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, fiatMinAmount, fiatMaxAmount, cryptoMinAmount, cryptoMaxAmount, iconUrl, paymentMethodName, description, cryptoUnitPrice, fiatUnitPrice, isEnabled, tag, cardInfo, balanceInfo, p2pInfo, walletInfo, popularInfo, rewardInfo);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentMethod)) {
                    return false;
                }
                PaymentMethod paymentMethod = (PaymentMethod) other;
                return Intrinsics.areEqual(this.paymentMethodCode, paymentMethod.paymentMethodCode) && Intrinsics.areEqual(this.channelId, paymentMethod.channelId) && Intrinsics.areEqual(this.fiatCurrency, paymentMethod.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, paymentMethod.cryptoCurrency) && Intrinsics.areEqual(this.fiatMinAmount, paymentMethod.fiatMinAmount) && Intrinsics.areEqual(this.fiatMaxAmount, paymentMethod.fiatMaxAmount) && Intrinsics.areEqual(this.cryptoMinAmount, paymentMethod.cryptoMinAmount) && Intrinsics.areEqual(this.cryptoMaxAmount, paymentMethod.cryptoMaxAmount) && Intrinsics.areEqual(this.iconUrl, paymentMethod.iconUrl) && Intrinsics.areEqual(this.paymentMethodName, paymentMethod.paymentMethodName) && Intrinsics.areEqual(this.description, paymentMethod.description) && Intrinsics.areEqual(this.cryptoUnitPrice, paymentMethod.cryptoUnitPrice) && Intrinsics.areEqual(this.fiatUnitPrice, paymentMethod.fiatUnitPrice) && Intrinsics.areEqual(this.isEnabled, paymentMethod.isEnabled) && Intrinsics.areEqual(this.tag, paymentMethod.tag) && Intrinsics.areEqual(this.cardInfo, paymentMethod.cardInfo) && Intrinsics.areEqual(this.balanceInfo, paymentMethod.balanceInfo) && Intrinsics.areEqual(this.p2pInfo, paymentMethod.p2pInfo) && Intrinsics.areEqual(this.walletInfo, paymentMethod.walletInfo) && Intrinsics.areEqual(this.popularInfo, paymentMethod.popularInfo) && Intrinsics.areEqual(this.rewardInfo, paymentMethod.rewardInfo);
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
            public final Boolean getIsEnabled() {
                return this.isEnabled;
            }

            @Nullable
            /* JADX INFO: renamed from: component15, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            @Nullable
            /* JADX INFO: renamed from: component16, reason: from getter */
            public final CardInfo getCardInfo() {
                return this.cardInfo;
            }

            @Nullable
            /* JADX INFO: renamed from: component17, reason: from getter */
            public final BalanceInfo getBalanceInfo() {
                return this.balanceInfo;
            }

            @Nullable
            /* JADX INFO: renamed from: component18, reason: from getter */
            public final P2PInfo getP2pInfo() {
                return this.p2pInfo;
            }

            @Nullable
            /* JADX INFO: renamed from: component19, reason: from getter */
            public final WalletInfo getWalletInfo() {
                return this.walletInfo;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getChannelId() {
                return this.channelId;
            }

            @Nullable
            /* JADX INFO: renamed from: component20, reason: from getter */
            public final PopularInfo getPopularInfo() {
                return this.popularInfo;
            }

            @Nullable
            /* JADX INFO: renamed from: component21, reason: from getter */
            public final RewardInfo getRewardInfo() {
                return this.rewardInfo;
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

            @Nullable
            public final BalanceInfo getBalanceInfo() {
                return this.balanceInfo;
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
            public final PopularInfo getPopularInfo() {
                return this.popularInfo;
            }

            @Nullable
            public final RewardInfo getRewardInfo() {
                return this.rewardInfo;
            }

            @Nullable
            public final String getTag() {
                return this.tag;
            }

            @Nullable
            public final WalletInfo getWalletInfo() {
                return this.walletInfo;
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
                Boolean bool = this.isEnabled;
                int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str14 = this.tag;
                int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
                CardInfo cardInfo = this.cardInfo;
                int iHashCode16 = (iHashCode15 + (cardInfo == null ? 0 : cardInfo.hashCode())) * 31;
                BalanceInfo balanceInfo = this.balanceInfo;
                int iHashCode17 = (iHashCode16 + (balanceInfo == null ? 0 : balanceInfo.hashCode())) * 31;
                P2PInfo p2PInfo = this.p2pInfo;
                int iHashCode18 = (iHashCode17 + (p2PInfo == null ? 0 : p2PInfo.hashCode())) * 31;
                WalletInfo walletInfo = this.walletInfo;
                int iHashCode19 = (iHashCode18 + (walletInfo == null ? 0 : walletInfo.hashCode())) * 31;
                PopularInfo popularInfo = this.popularInfo;
                int iHashCode20 = (iHashCode19 + (popularInfo == null ? 0 : popularInfo.hashCode())) * 31;
                RewardInfo rewardInfo = this.rewardInfo;
                return iHashCode20 + (rewardInfo != null ? rewardInfo.hashCode() : 0);
            }

            @Nullable
            public final Boolean isEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                return "PaymentMethod(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", fiatMinAmount=" + this.fiatMinAmount + ", fiatMaxAmount=" + this.fiatMaxAmount + ", cryptoMinAmount=" + this.cryptoMinAmount + ", cryptoMaxAmount=" + this.cryptoMaxAmount + ", iconUrl=" + this.iconUrl + ", paymentMethodName=" + this.paymentMethodName + ", description=" + this.description + ", cryptoUnitPrice=" + this.cryptoUnitPrice + ", fiatUnitPrice=" + this.fiatUnitPrice + ", isEnabled=" + this.isEnabled + ", tag=" + this.tag + ", cardInfo=" + this.cardInfo + ", balanceInfo=" + this.balanceInfo + ", p2pInfo=" + this.p2pInfo + ", walletInfo=" + this.walletInfo + ", popularInfo=" + this.popularInfo + ", rewardInfo=" + this.rewardInfo + ')';
            }

            public /* synthetic */ PaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, CardInfo cardInfo, BalanceInfo balanceInfo, P2PInfo p2PInfo, WalletInfo walletInfo, PopularInfo popularInfo, RewardInfo rewardInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool, (i11 & 16384) != 0 ? null : str14, (32768 & i11) != 0 ? null : cardInfo, (65536 & i11) != 0 ? null : balanceInfo, (131072 & i11) != 0 ? null : p2PInfo, (262144 & i11) != 0 ? null : walletInfo, (i11 & 524288) != 0 ? null : popularInfo, rewardInfo);
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
