package com.kubi.payment.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/data/entities/UserInfo;", "", "<init>", "()V", "Request", "Response", "KycInfoResponse", "UserPermissionResponse", "ChannelKycInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserInfo {

    /* JADX INFO: compiled from: UserInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/data/entities/UserInfo$ChannelKycInfo;", "", "verifyStatus", "", "verifyCode", "verifyDesc", "verifyTitle", "verifyButton", "redirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVerifyStatus", "()Ljava/lang/String;", "getVerifyCode", "getVerifyDesc", "getVerifyTitle", "getVerifyButton", "getRedirectUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChannelKycInfo {

        @NotNull
        public static final String TRANSFERO = "TRANSFERO_BASE_KYC";

        @Nullable
        private final String redirectUrl;

        @Nullable
        private final String verifyButton;

        @Nullable
        private final String verifyCode;

        @Nullable
        private final String verifyDesc;

        @Nullable
        private final String verifyStatus;

        @Nullable
        private final String verifyTitle;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelKycInfo)) {
                return false;
            }
            ChannelKycInfo channelKycInfo = (ChannelKycInfo) other;
            return Intrinsics.areEqual(this.verifyStatus, channelKycInfo.verifyStatus) && Intrinsics.areEqual(this.verifyCode, channelKycInfo.verifyCode) && Intrinsics.areEqual(this.verifyDesc, channelKycInfo.verifyDesc) && Intrinsics.areEqual(this.verifyTitle, channelKycInfo.verifyTitle) && Intrinsics.areEqual(this.verifyButton, channelKycInfo.verifyButton) && Intrinsics.areEqual(this.redirectUrl, channelKycInfo.redirectUrl);
        }

        public static /* synthetic */ ChannelKycInfo copy$default(ChannelKycInfo channelKycInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = channelKycInfo.verifyStatus;
            }
            if ((i11 & 2) != 0) {
                str2 = channelKycInfo.verifyCode;
            }
            if ((i11 & 4) != 0) {
                str3 = channelKycInfo.verifyDesc;
            }
            if ((i11 & 8) != 0) {
                str4 = channelKycInfo.verifyTitle;
            }
            if ((i11 & 16) != 0) {
                str5 = channelKycInfo.verifyButton;
            }
            if ((i11 & 32) != 0) {
                str6 = channelKycInfo.redirectUrl;
            }
            String str7 = str5;
            String str8 = str6;
            return channelKycInfo.copy(str, str2, str3, str4, str7, str8);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVerifyStatus() {
            return this.verifyStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVerifyCode() {
            return this.verifyCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVerifyDesc() {
            return this.verifyDesc;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVerifyTitle() {
            return this.verifyTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVerifyButton() {
            return this.verifyButton;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @NotNull
        public final ChannelKycInfo copy(@Nullable String verifyStatus, @Nullable String verifyCode, @Nullable String verifyDesc, @Nullable String verifyTitle, @Nullable String verifyButton, @Nullable String redirectUrl) {
            return new ChannelKycInfo(verifyStatus, verifyCode, verifyDesc, verifyTitle, verifyButton, redirectUrl);
        }

        @Nullable
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @Nullable
        public final String getVerifyButton() {
            return this.verifyButton;
        }

        @Nullable
        public final String getVerifyCode() {
            return this.verifyCode;
        }

        @Nullable
        public final String getVerifyDesc() {
            return this.verifyDesc;
        }

        @Nullable
        public final String getVerifyStatus() {
            return this.verifyStatus;
        }

        @Nullable
        public final String getVerifyTitle() {
            return this.verifyTitle;
        }

        public int hashCode() {
            String str = this.verifyStatus;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.verifyCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.verifyDesc;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.verifyTitle;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifyButton;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.redirectUrl;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ChannelKycInfo(verifyStatus=" + this.verifyStatus + ", verifyCode=" + this.verifyCode + ", verifyDesc=" + this.verifyDesc + ", verifyTitle=" + this.verifyTitle + ", verifyButton=" + this.verifyButton + ", redirectUrl=" + this.redirectUrl + ')';
        }

        public ChannelKycInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.verifyStatus = str;
            this.verifyCode = str2;
            this.verifyDesc = str3;
            this.verifyTitle = str4;
            this.verifyButton = str5;
            this.redirectUrl = str6;
        }
    }

    /* JADX INFO: compiled from: UserInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;", "", "isVerified", "", "isExpired", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class KycInfoResponse {

        @SerializedName("isExpired")
        @Nullable
        private final Boolean isExpired;

        @SerializedName("isVerified")
        @Nullable
        private final Boolean isVerified;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KycInfoResponse)) {
                return false;
            }
            KycInfoResponse kycInfoResponse = (KycInfoResponse) other;
            return Intrinsics.areEqual(this.isVerified, kycInfoResponse.isVerified) && Intrinsics.areEqual(this.isExpired, kycInfoResponse.isExpired);
        }

        public static /* synthetic */ KycInfoResponse copy$default(KycInfoResponse kycInfoResponse, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = kycInfoResponse.isVerified;
            }
            if ((i11 & 2) != 0) {
                bool2 = kycInfoResponse.isExpired;
            }
            return kycInfoResponse.copy(bool, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsVerified() {
            return this.isVerified;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsExpired() {
            return this.isExpired;
        }

        @NotNull
        public final KycInfoResponse copy(@Nullable Boolean isVerified, @Nullable Boolean isExpired) {
            return new KycInfoResponse(isVerified, isExpired);
        }

        public int hashCode() {
            Boolean bool = this.isVerified;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.isExpired;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isExpired() {
            return this.isExpired;
        }

        @Nullable
        public final Boolean isVerified() {
            return this.isVerified;
        }

        @NotNull
        public String toString() {
            return "KycInfoResponse(isVerified=" + this.isVerified + ", isExpired=" + this.isExpired + ')';
        }

        public KycInfoResponse(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.isVerified = bool;
            this.isExpired = bool2;
        }
    }

    /* JADX INFO: compiled from: UserInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/data/entities/UserInfo$Request;", "", "tradeType", "", "fiatCurrency", "paymentMethodCode", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getFiatCurrency", "getPaymentMethodCode", "getChannelId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName("channelId")
        @Nullable
        private final String channelId;

        @SerializedName("fiatCurrency")
        @Nullable
        private final String fiatCurrency;

        @SerializedName("paymentMethodCode")
        @Nullable
        private final String paymentMethodCode;

        @SerializedName("tradeType")
        @Nullable
        private final String tradeType;

        public Request() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.tradeType, request.tradeType) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId);
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.tradeType = str;
            this.fiatCurrency = str2;
            this.paymentMethodCode = str3;
            this.channelId = str4;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.tradeType;
            }
            if ((i11 & 2) != 0) {
                str2 = request.fiatCurrency;
            }
            if ((i11 & 4) != 0) {
                str3 = request.paymentMethodCode;
            }
            if ((i11 & 8) != 0) {
                str4 = request.channelId;
            }
            return request.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getChannelId() {
            return this.channelId;
        }

        @NotNull
        public final Request copy(@Nullable String tradeType, @Nullable String fiatCurrency, @Nullable String paymentMethodCode, @Nullable String channelId) {
            return new Request(tradeType, fiatCurrency, paymentMethodCode, channelId);
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
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
        public final String getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            String str = this.tradeType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.paymentMethodCode;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.channelId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(tradeType=" + this.tradeType + ", fiatCurrency=" + this.fiatCurrency + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: UserInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/data/entities/UserInfo$Response;", "", "kycInfo", "Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;", "permission", "Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;", "userChannelInfo", "", "Lcom/kubi/payment/data/entities/UserInfo$ChannelKycInfo;", "<init>", "(Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;Ljava/util/List;)V", "getKycInfo", "()Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;", "getPermission", "()Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;", "getUserChannelInfo", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("kycInfoResponse")
        @Nullable
        private final KycInfoResponse kycInfo;

        @SerializedName("permissionResponse")
        @Nullable
        private final UserPermissionResponse permission;

        @SerializedName("userChannelInfos")
        @Nullable
        private final List<ChannelKycInfo> userChannelInfo;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.kycInfo, response.kycInfo) && Intrinsics.areEqual(this.permission, response.permission) && Intrinsics.areEqual(this.userChannelInfo, response.userChannelInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, KycInfoResponse kycInfoResponse, UserPermissionResponse userPermissionResponse, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                kycInfoResponse = response.kycInfo;
            }
            if ((i11 & 2) != 0) {
                userPermissionResponse = response.permission;
            }
            if ((i11 & 4) != 0) {
                list = response.userChannelInfo;
            }
            return response.copy(kycInfoResponse, userPermissionResponse, list);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final KycInfoResponse getKycInfo() {
            return this.kycInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final UserPermissionResponse getPermission() {
            return this.permission;
        }

        @Nullable
        public final List<ChannelKycInfo> component3() {
            return this.userChannelInfo;
        }

        @NotNull
        public final Response copy(@Nullable KycInfoResponse kycInfo, @Nullable UserPermissionResponse permission, @Nullable List<ChannelKycInfo> userChannelInfo) {
            return new Response(kycInfo, permission, userChannelInfo);
        }

        @Nullable
        public final KycInfoResponse getKycInfo() {
            return this.kycInfo;
        }

        @Nullable
        public final UserPermissionResponse getPermission() {
            return this.permission;
        }

        @Nullable
        public final List<ChannelKycInfo> getUserChannelInfo() {
            return this.userChannelInfo;
        }

        public int hashCode() {
            KycInfoResponse kycInfoResponse = this.kycInfo;
            int iHashCode = (kycInfoResponse == null ? 0 : kycInfoResponse.hashCode()) * 31;
            UserPermissionResponse userPermissionResponse = this.permission;
            int iHashCode2 = (iHashCode + (userPermissionResponse == null ? 0 : userPermissionResponse.hashCode())) * 31;
            List<ChannelKycInfo> list = this.userChannelInfo;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(kycInfo=" + this.kycInfo + ", permission=" + this.permission + ", userChannelInfo=" + this.userChannelInfo + ')';
        }

        public Response(@Nullable KycInfoResponse kycInfoResponse, @Nullable UserPermissionResponse userPermissionResponse, @Nullable List<ChannelKycInfo> list) {
            this.kycInfo = kycInfoResponse;
            this.permission = userPermissionResponse;
            this.userChannelInfo = list;
        }
    }

    /* JADX INFO: compiled from: UserInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;", "", "canRecharge", "", "canWithdraw", "canBuy", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanRecharge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanWithdraw", "getCanBuy", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UserPermissionResponse {

        @SerializedName("canBuy")
        @Nullable
        private final Boolean canBuy;

        @SerializedName("canRecharge")
        @Nullable
        private final Boolean canRecharge;

        @SerializedName("canWithdraw")
        @Nullable
        private final Boolean canWithdraw;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPermissionResponse)) {
                return false;
            }
            UserPermissionResponse userPermissionResponse = (UserPermissionResponse) other;
            return Intrinsics.areEqual(this.canRecharge, userPermissionResponse.canRecharge) && Intrinsics.areEqual(this.canWithdraw, userPermissionResponse.canWithdraw) && Intrinsics.areEqual(this.canBuy, userPermissionResponse.canBuy);
        }

        public static /* synthetic */ UserPermissionResponse copy$default(UserPermissionResponse userPermissionResponse, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = userPermissionResponse.canRecharge;
            }
            if ((i11 & 2) != 0) {
                bool2 = userPermissionResponse.canWithdraw;
            }
            if ((i11 & 4) != 0) {
                bool3 = userPermissionResponse.canBuy;
            }
            return userPermissionResponse.copy(bool, bool2, bool3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getCanRecharge() {
            return this.canRecharge;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getCanWithdraw() {
            return this.canWithdraw;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getCanBuy() {
            return this.canBuy;
        }

        @NotNull
        public final UserPermissionResponse copy(@Nullable Boolean canRecharge, @Nullable Boolean canWithdraw, @Nullable Boolean canBuy) {
            return new UserPermissionResponse(canRecharge, canWithdraw, canBuy);
        }

        @Nullable
        public final Boolean getCanBuy() {
            return this.canBuy;
        }

        @Nullable
        public final Boolean getCanRecharge() {
            return this.canRecharge;
        }

        @Nullable
        public final Boolean getCanWithdraw() {
            return this.canWithdraw;
        }

        public int hashCode() {
            Boolean bool = this.canRecharge;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.canWithdraw;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.canBuy;
            return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UserPermissionResponse(canRecharge=" + this.canRecharge + ", canWithdraw=" + this.canWithdraw + ", canBuy=" + this.canBuy + ')';
        }

        public UserPermissionResponse(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
            this.canRecharge = bool;
            this.canWithdraw = bool2;
            this.canBuy = bool3;
        }
    }
}
