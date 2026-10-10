package com.kubi.payment.fast.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastTradeCryptoCurrency.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTradeCryptoCurrency {

    /* JADX INFO: compiled from: FastTradeCryptoCurrency.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Request;", "", "fiatCurrency", "", "tradeType", "", "needBalance", "", "sceneCode", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getTradeType", "()Ljava/util/List;", "getNeedBalance", "()Z", "getSceneCode", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName(TtmlNode.RUBY_BASE)
        @Nullable
        private final String fiatCurrency;
        private final boolean needBalance;

        @NotNull
        private final String sceneCode;

        @SerializedName("tradeType")
        @Nullable
        private final List<String> tradeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.tradeType, request.tradeType) && this.needBalance == request.needBalance && Intrinsics.areEqual(this.sceneCode, request.sceneCode);
        }

        public Request(@Nullable String str, @Nullable List<String> list, boolean z11, @NotNull String sceneCode) {
            Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
            this.fiatCurrency = str;
            this.tradeType = list;
            this.needBalance = z11;
            this.sceneCode = sceneCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, String str, List list, boolean z11, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.fiatCurrency;
            }
            if ((i11 & 2) != 0) {
                list = request.tradeType;
            }
            if ((i11 & 4) != 0) {
                z11 = request.needBalance;
            }
            if ((i11 & 8) != 0) {
                str2 = request.sceneCode;
            }
            return request.copy(str, list, z11, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final List<String> component2() {
            return this.tradeType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getNeedBalance() {
            return this.needBalance;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSceneCode() {
            return this.sceneCode;
        }

        @NotNull
        public final Request copy(@Nullable String fiatCurrency, @Nullable List<String> tradeType, boolean needBalance, @NotNull String sceneCode) {
            Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
            return new Request(fiatCurrency, tradeType, needBalance, sceneCode);
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        public final boolean getNeedBalance() {
            return this.needBalance;
        }

        @NotNull
        public final String getSceneCode() {
            return this.sceneCode;
        }

        @Nullable
        public final List<String> getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            String str = this.fiatCurrency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.tradeType;
            return ((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.needBalance)) * 31) + this.sceneCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "Request(fiatCurrency=" + this.fiatCurrency + ", tradeType=" + this.tradeType + ", needBalance=" + this.needBalance + ", sceneCode=" + this.sceneCode + ')';
        }
    }

    /* JADX INFO: compiled from: FastTradeCryptoCurrency.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010$\u001a\u00020\nHÆ\u0003Jx\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u000b\u0010\u0017R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00063"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "Landroid/os/Parcelable;", "iconUrl", "", "title", "subTitle", "balance", "conversionBalance", "conversionCurrency", "canIndex", "", "isSupportRecurring", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "getIconUrl", "()Ljava/lang/String;", "getTitle", "getSubTitle", "getBalance", "getConversionBalance", "getConversionCurrency", "getCanIndex", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Response> CREATOR = new C20501a();

        @Nullable
        private final String balance;

        @Nullable
        private final Boolean canIndex;

        @Nullable
        private final String conversionBalance;

        @Nullable
        private final String conversionCurrency;

        @SerializedName(TUIConstants.TUIChat.INPUT_MORE_ICON)
        @Nullable
        private final String iconUrl;
        private transient boolean isSelected;

        @SerializedName("isSupportRecurring")
        @Nullable
        private final Boolean isSupportRecurring;

        @SerializedName("name")
        @Nullable
        private final String subTitle;

        @SerializedName("code")
        @Nullable
        private final String title;

        /* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency$Response$a */
        /* JADX INFO: compiled from: FastTradeCryptoCurrency.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C20501a implements Parcelable.Creator<Response> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Response createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Response(string, string2, string3, string4, string5, string6, boolValueOf, boolValueOf2, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Response[] newArray(int i11) {
                return new Response[i11];
            }
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z11) {
            this.iconUrl = str;
            this.title = str2;
            this.subTitle = str3;
            this.balance = str4;
            this.conversionBalance = str5;
            this.conversionCurrency = str6;
            this.canIndex = bool;
            this.isSupportRecurring = bool2;
            this.isSelected = z11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.iconUrl, response.iconUrl) && Intrinsics.areEqual(this.title, response.title) && Intrinsics.areEqual(this.subTitle, response.subTitle) && Intrinsics.areEqual(this.balance, response.balance) && Intrinsics.areEqual(this.conversionBalance, response.conversionBalance) && Intrinsics.areEqual(this.conversionCurrency, response.conversionCurrency) && Intrinsics.areEqual(this.canIndex, response.canIndex) && Intrinsics.areEqual(this.isSupportRecurring, response.isSupportRecurring) && this.isSelected == response.isSelected;
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.iconUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = response.title;
            }
            if ((i11 & 4) != 0) {
                str3 = response.subTitle;
            }
            if ((i11 & 8) != 0) {
                str4 = response.balance;
            }
            if ((i11 & 16) != 0) {
                str5 = response.conversionBalance;
            }
            if ((i11 & 32) != 0) {
                str6 = response.conversionCurrency;
            }
            if ((i11 & 64) != 0) {
                bool = response.canIndex;
            }
            if ((i11 & 128) != 0) {
                bool2 = response.isSupportRecurring;
            }
            if ((i11 & 256) != 0) {
                z11 = response.isSelected;
            }
            Boolean bool3 = bool2;
            boolean z12 = z11;
            String str7 = str6;
            Boolean bool4 = bool;
            String str8 = str5;
            String str9 = str3;
            return response.copy(str, str2, str9, str4, str8, str7, bool4, bool3, z12);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBalance() {
            return this.balance;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getConversionBalance() {
            return this.conversionBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getConversionCurrency() {
            return this.conversionCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getCanIndex() {
            return this.canIndex;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getIsSupportRecurring() {
            return this.isSupportRecurring;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final Response copy(@Nullable String iconUrl, @Nullable String title, @Nullable String subTitle, @Nullable String balance, @Nullable String conversionBalance, @Nullable String conversionCurrency, @Nullable Boolean canIndex, @Nullable Boolean isSupportRecurring, boolean isSelected) {
            return new Response(iconUrl, title, subTitle, balance, conversionBalance, conversionCurrency, canIndex, isSupportRecurring, isSelected);
        }

        @Nullable
        public final String getBalance() {
            return this.balance;
        }

        @Nullable
        public final Boolean getCanIndex() {
            return this.canIndex;
        }

        @Nullable
        public final String getConversionBalance() {
            return this.conversionBalance;
        }

        @Nullable
        public final String getConversionCurrency() {
            return this.conversionCurrency;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.iconUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subTitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.balance;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.conversionBalance;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.conversionCurrency;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.canIndex;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSupportRecurring;
            return ((iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @Nullable
        public final Boolean isSupportRecurring() {
            return this.isSupportRecurring;
        }

        public final void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            return "Response(iconUrl=" + this.iconUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", balance=" + this.balance + ", conversionBalance=" + this.conversionBalance + ", conversionCurrency=" + this.conversionCurrency + ", canIndex=" + this.canIndex + ", isSupportRecurring=" + this.isSupportRecurring + ", isSelected=" + this.isSelected + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.iconUrl);
            dest.writeString(this.title);
            dest.writeString(this.subTitle);
            dest.writeString(this.balance);
            dest.writeString(this.conversionBalance);
            dest.writeString(this.conversionCurrency);
            Boolean bool = this.canIndex;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.isSupportRecurring;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeInt(this.isSelected ? 1 : 0);
        }

        public /* synthetic */ Response(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, bool, bool2, (i11 & 256) != 0 ? false : z11);
        }
    }
}
