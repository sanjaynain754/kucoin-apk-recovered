package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatInfoEntity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/FiatInfoEntity;", "", "<init>", "()V", "Request", "Response", "FiatInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatInfoEntity {

    /* JADX INFO: compiled from: FiatInfoEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "name", "iconUrl", "availableBalance", "totalBalance", "isEnable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "getName", "getIconUrl", "getAvailableBalance", "getTotalBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FiatInfo {

        @Nullable
        private final String availableBalance;

        @Nullable
        private final String currency;

        @Nullable
        private final String currencyName;

        @Nullable
        private final String iconUrl;

        @Nullable
        private final Boolean isEnable;

        @Nullable
        private final String name;

        @Nullable
        private final String totalBalance;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiatInfo)) {
                return false;
            }
            FiatInfo fiatInfo = (FiatInfo) other;
            return Intrinsics.areEqual(this.currency, fiatInfo.currency) && Intrinsics.areEqual(this.currencyName, fiatInfo.currencyName) && Intrinsics.areEqual(this.name, fiatInfo.name) && Intrinsics.areEqual(this.iconUrl, fiatInfo.iconUrl) && Intrinsics.areEqual(this.availableBalance, fiatInfo.availableBalance) && Intrinsics.areEqual(this.totalBalance, fiatInfo.totalBalance) && Intrinsics.areEqual(this.isEnable, fiatInfo.isEnable);
        }

        public static /* synthetic */ FiatInfo copy$default(FiatInfo fiatInfo, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fiatInfo.currency;
            }
            if ((i11 & 2) != 0) {
                str2 = fiatInfo.currencyName;
            }
            if ((i11 & 4) != 0) {
                str3 = fiatInfo.name;
            }
            if ((i11 & 8) != 0) {
                str4 = fiatInfo.iconUrl;
            }
            if ((i11 & 16) != 0) {
                str5 = fiatInfo.availableBalance;
            }
            if ((i11 & 32) != 0) {
                str6 = fiatInfo.totalBalance;
            }
            if ((i11 & 64) != 0) {
                bool = fiatInfo.isEnable;
            }
            String str7 = str6;
            Boolean bool2 = bool;
            String str8 = str5;
            String str9 = str3;
            return fiatInfo.copy(str, str2, str9, str4, str8, str7, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCurrencyName() {
            return this.currencyName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAvailableBalance() {
            return this.availableBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTotalBalance() {
            return this.totalBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getIsEnable() {
            return this.isEnable;
        }

        @NotNull
        public final FiatInfo copy(@Nullable String currency, @Nullable String currencyName, @Nullable String name, @Nullable String iconUrl, @Nullable String availableBalance, @Nullable String totalBalance, @Nullable Boolean isEnable) {
            return new FiatInfo(currency, currencyName, name, iconUrl, availableBalance, totalBalance, isEnable);
        }

        @Nullable
        public final String getAvailableBalance() {
            return this.availableBalance;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getCurrencyName() {
            return this.currencyName;
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
        public final String getTotalBalance() {
            return this.totalBalance;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.currencyName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.name;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.iconUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.availableBalance;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.totalBalance;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.isEnable;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isEnable() {
            return this.isEnable;
        }

        @NotNull
        public String toString() {
            return "FiatInfo(currency=" + this.currency + ", currencyName=" + this.currencyName + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", availableBalance=" + this.availableBalance + ", totalBalance=" + this.totalBalance + ", isEnable=" + this.isEnable + ')';
        }

        public FiatInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
            this.currency = str;
            this.currencyName = str2;
            this.name = str3;
            this.iconUrl = str4;
            this.availableBalance = str5;
            this.totalBalance = str6;
            this.isEnable = bool;
        }
    }

    /* JADX INFO: compiled from: FiatInfoEntity.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;", "", "tradeType", "", "<init>", "(Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final String tradeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && Intrinsics.areEqual(this.tradeType, ((Request) other).tradeType);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.tradeType;
            }
            return request.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        public final Request copy(@Nullable String tradeType) {
            return new Request(tradeType);
        }

        @Nullable
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            String str = this.tradeType;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(tradeType=" + this.tradeType + ')';
        }

        public Request(@Nullable String str) {
            this.tradeType = str;
        }
    }

    /* JADX INFO: compiled from: FiatInfoEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;", "", "currencyList", "", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "<init>", "(Ljava/util/List;)V", "getCurrencyList", "()Ljava/util/List;", "setCurrencyList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private List<FiatInfo> currencyList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.currencyList, ((Response) other).currencyList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = response.currencyList;
            }
            return response.copy(list);
        }

        @Nullable
        public final List<FiatInfo> component1() {
            return this.currencyList;
        }

        @NotNull
        public final Response copy(@Nullable List<FiatInfo> currencyList) {
            return new Response(currencyList);
        }

        @Nullable
        public final List<FiatInfo> getCurrencyList() {
            return this.currencyList;
        }

        public int hashCode() {
            List<FiatInfo> list = this.currencyList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final void setCurrencyList(@Nullable List<FiatInfo> list) {
            this.currencyList = list;
        }

        @NotNull
        public String toString() {
            return "Response(currencyList=" + this.currencyList + ')';
        }

        public Response(@Nullable List<FiatInfo> list) {
            this.currencyList = list;
        }
    }
}
