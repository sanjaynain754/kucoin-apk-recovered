package com.kubi.payment.data.entities;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/data/entities/KycInfo;", "", "<init>", "()V", "Request", "Response", "Internal", "External", "Edd", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycInfo {

    /* JADX INFO: compiled from: KycInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/data/entities/KycInfo$Edd;", "", "needEdd", "", "<init>", "(Ljava/lang/Boolean;)V", "getNeedEdd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/kubi/payment/data/entities/KycInfo$Edd;", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Edd {

        @SerializedName("needEdd")
        @Nullable
        private final Boolean needEdd;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Edd) && Intrinsics.areEqual(this.needEdd, ((Edd) other).needEdd);
        }

        public static /* synthetic */ Edd copy$default(Edd edd, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = edd.needEdd;
            }
            return edd.copy(bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getNeedEdd() {
            return this.needEdd;
        }

        @NotNull
        public final Edd copy(@Nullable Boolean needEdd) {
            return new Edd(needEdd);
        }

        @Nullable
        public final Boolean getNeedEdd() {
            return this.needEdd;
        }

        public int hashCode() {
            Boolean bool = this.needEdd;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @NotNull
        public String toString() {
            return "Edd(needEdd=" + this.needEdd + ')';
        }

        public Edd(@Nullable Boolean bool) {
            this.needEdd = bool;
        }
    }

    /* JADX INFO: compiled from: KycInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/data/entities/KycInfo$External;", "", "isVerified", "", "verifyResult", "", "verifyFailReason", "verifyFailCode", "verifyRedirectUrl", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVerifyResult", "()Ljava/lang/String;", "getVerifyFailReason", "getVerifyFailCode", "getVerifyRedirectUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/data/entities/KycInfo$External;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class External {

        @SerializedName("isVerified")
        @Nullable
        private final Boolean isVerified;

        @SerializedName("verifyFailCode")
        @Nullable
        private final String verifyFailCode;

        @SerializedName("verifyFailReason")
        @Nullable
        private final String verifyFailReason;

        @SerializedName("verifyRedirectUrl")
        @Nullable
        private final String verifyRedirectUrl;

        @SerializedName("verifyResult")
        @Nullable
        private final String verifyResult;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof External)) {
                return false;
            }
            External external = (External) other;
            return Intrinsics.areEqual(this.isVerified, external.isVerified) && Intrinsics.areEqual(this.verifyResult, external.verifyResult) && Intrinsics.areEqual(this.verifyFailReason, external.verifyFailReason) && Intrinsics.areEqual(this.verifyFailCode, external.verifyFailCode) && Intrinsics.areEqual(this.verifyRedirectUrl, external.verifyRedirectUrl);
        }

        public static /* synthetic */ External copy$default(External external, Boolean bool, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = external.isVerified;
            }
            if ((i11 & 2) != 0) {
                str = external.verifyResult;
            }
            if ((i11 & 4) != 0) {
                str2 = external.verifyFailReason;
            }
            if ((i11 & 8) != 0) {
                str3 = external.verifyFailCode;
            }
            if ((i11 & 16) != 0) {
                str4 = external.verifyRedirectUrl;
            }
            String str5 = str4;
            String str6 = str2;
            return external.copy(bool, str, str6, str3, str5);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsVerified() {
            return this.isVerified;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVerifyResult() {
            return this.verifyResult;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVerifyFailReason() {
            return this.verifyFailReason;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVerifyFailCode() {
            return this.verifyFailCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVerifyRedirectUrl() {
            return this.verifyRedirectUrl;
        }

        @NotNull
        public final External copy(@Nullable Boolean isVerified, @Nullable String verifyResult, @Nullable String verifyFailReason, @Nullable String verifyFailCode, @Nullable String verifyRedirectUrl) {
            return new External(isVerified, verifyResult, verifyFailReason, verifyFailCode, verifyRedirectUrl);
        }

        @Nullable
        public final String getVerifyFailCode() {
            return this.verifyFailCode;
        }

        @Nullable
        public final String getVerifyFailReason() {
            return this.verifyFailReason;
        }

        @Nullable
        public final String getVerifyRedirectUrl() {
            return this.verifyRedirectUrl;
        }

        @Nullable
        public final String getVerifyResult() {
            return this.verifyResult;
        }

        public int hashCode() {
            Boolean bool = this.isVerified;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.verifyResult;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.verifyFailReason;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.verifyFailCode;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.verifyRedirectUrl;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Nullable
        public final Boolean isVerified() {
            return this.isVerified;
        }

        @NotNull
        public String toString() {
            return "External(isVerified=" + this.isVerified + ", verifyResult=" + this.verifyResult + ", verifyFailReason=" + this.verifyFailReason + ", verifyFailCode=" + this.verifyFailCode + ", verifyRedirectUrl=" + this.verifyRedirectUrl + ')';
        }

        public External(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.isVerified = bool;
            this.verifyResult = str;
            this.verifyFailReason = str2;
            this.verifyFailCode = str3;
            this.verifyRedirectUrl = str4;
        }
    }

    /* JADX INFO: compiled from: KycInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u009e\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0002\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0013¨\u00064"}, m90084d2 = {"Lcom/kubi/payment/data/entities/KycInfo$Internal;", "", "isVerified", "", "verifyStatus", "", "fullName", "", "email", HintConstants.AUTOFILL_HINT_PHONE, "kycLevel", TtmlNode.TAG_REGION, "birthday", "identityType", "identityNumber", "idExpireDate", "isFullNameEn", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVerifyStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFullName", "()Ljava/lang/String;", "getEmail", "getPhone", "getKycLevel", "getRegion", "getBirthday", "getIdentityType", "getIdentityNumber", "getIdExpireDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/data/entities/KycInfo$Internal;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Internal {

        @SerializedName("birthday")
        @Nullable
        private final String birthday;

        @SerializedName("email")
        @Nullable
        private final String email;

        @SerializedName("fullName")
        @Nullable
        private final String fullName;

        @SerializedName("idExpireDate")
        @Nullable
        private final String idExpireDate;

        @SerializedName("identityNumber")
        @Nullable
        private final String identityNumber;

        @SerializedName("identityType")
        @Nullable
        private final String identityType;

        @SerializedName("isFullNameEn")
        @Nullable
        private final Boolean isFullNameEn;

        @SerializedName("isVerified")
        @Nullable
        private final Boolean isVerified;

        @SerializedName("kycLevel")
        @Nullable
        private final Integer kycLevel;

        @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
        @Nullable
        private final String phone;

        @SerializedName(TtmlNode.TAG_REGION)
        @Nullable
        private final String region;

        @SerializedName("verifyStatus")
        @Nullable
        private final Integer verifyStatus;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return Intrinsics.areEqual(this.isVerified, internal.isVerified) && Intrinsics.areEqual(this.verifyStatus, internal.verifyStatus) && Intrinsics.areEqual(this.fullName, internal.fullName) && Intrinsics.areEqual(this.email, internal.email) && Intrinsics.areEqual(this.phone, internal.phone) && Intrinsics.areEqual(this.kycLevel, internal.kycLevel) && Intrinsics.areEqual(this.region, internal.region) && Intrinsics.areEqual(this.birthday, internal.birthday) && Intrinsics.areEqual(this.identityType, internal.identityType) && Intrinsics.areEqual(this.identityNumber, internal.identityNumber) && Intrinsics.areEqual(this.idExpireDate, internal.idExpireDate) && Intrinsics.areEqual(this.isFullNameEn, internal.isFullNameEn);
        }

        public static /* synthetic */ Internal copy$default(Internal internal, Boolean bool, Integer num, String str, String str2, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = internal.isVerified;
            }
            if ((i11 & 2) != 0) {
                num = internal.verifyStatus;
            }
            if ((i11 & 4) != 0) {
                str = internal.fullName;
            }
            if ((i11 & 8) != 0) {
                str2 = internal.email;
            }
            if ((i11 & 16) != 0) {
                str3 = internal.phone;
            }
            if ((i11 & 32) != 0) {
                num2 = internal.kycLevel;
            }
            if ((i11 & 64) != 0) {
                str4 = internal.region;
            }
            if ((i11 & 128) != 0) {
                str5 = internal.birthday;
            }
            if ((i11 & 256) != 0) {
                str6 = internal.identityType;
            }
            if ((i11 & 512) != 0) {
                str7 = internal.identityNumber;
            }
            if ((i11 & 1024) != 0) {
                str8 = internal.idExpireDate;
            }
            if ((i11 & 2048) != 0) {
                bool2 = internal.isFullNameEn;
            }
            String str9 = str8;
            Boolean bool3 = bool2;
            String str10 = str6;
            String str11 = str7;
            String str12 = str4;
            String str13 = str5;
            String str14 = str3;
            Integer num3 = num2;
            return internal.copy(bool, num, str, str2, str14, num3, str12, str13, str10, str11, str9, bool3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsVerified() {
            return this.isVerified;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getIdentityNumber() {
            return this.identityNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getIdExpireDate() {
            return this.idExpireDate;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Boolean getIsFullNameEn() {
            return this.isFullNameEn;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getVerifyStatus() {
            return this.verifyStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getKycLevel() {
            return this.kycLevel;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBirthday() {
            return this.birthday;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getIdentityType() {
            return this.identityType;
        }

        @NotNull
        public final Internal copy(@Nullable Boolean isVerified, @Nullable Integer verifyStatus, @Nullable String fullName, @Nullable String email, @Nullable String phone, @Nullable Integer kycLevel, @Nullable String region, @Nullable String birthday, @Nullable String identityType, @Nullable String identityNumber, @Nullable String idExpireDate, @Nullable Boolean isFullNameEn) {
            return new Internal(isVerified, verifyStatus, fullName, email, phone, kycLevel, region, birthday, identityType, identityNumber, idExpireDate, isFullNameEn);
        }

        @Nullable
        public final String getBirthday() {
            return this.birthday;
        }

        @Nullable
        public final String getEmail() {
            return this.email;
        }

        @Nullable
        public final String getFullName() {
            return this.fullName;
        }

        @Nullable
        public final String getIdExpireDate() {
            return this.idExpireDate;
        }

        @Nullable
        public final String getIdentityNumber() {
            return this.identityNumber;
        }

        @Nullable
        public final String getIdentityType() {
            return this.identityType;
        }

        @Nullable
        public final Integer getKycLevel() {
            return this.kycLevel;
        }

        @Nullable
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        public final String getRegion() {
            return this.region;
        }

        @Nullable
        public final Integer getVerifyStatus() {
            return this.verifyStatus;
        }

        public int hashCode() {
            Boolean bool = this.isVerified;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.verifyStatus;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.fullName;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.email;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.kycLevel;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.region;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.birthday;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.identityType;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.identityNumber;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.idExpireDate;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool2 = this.isFullNameEn;
            return iHashCode11 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isFullNameEn() {
            return this.isFullNameEn;
        }

        @Nullable
        public final Boolean isVerified() {
            return this.isVerified;
        }

        @NotNull
        public String toString() {
            return "Internal(isVerified=" + this.isVerified + ", verifyStatus=" + this.verifyStatus + ", fullName=" + this.fullName + ", email=" + this.email + ", phone=" + this.phone + ", kycLevel=" + this.kycLevel + ", region=" + this.region + ", birthday=" + this.birthday + ", identityType=" + this.identityType + ", identityNumber=" + this.identityNumber + ", idExpireDate=" + this.idExpireDate + ", isFullNameEn=" + this.isFullNameEn + ')';
        }

        public Internal(@Nullable Boolean bool, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool2) {
            this.isVerified = bool;
            this.verifyStatus = num;
            this.fullName = str;
            this.email = str2;
            this.phone = str3;
            this.kycLevel = num2;
            this.region = str4;
            this.birthday = str5;
            this.identityType = str6;
            this.identityNumber = str7;
            this.idExpireDate = str8;
            this.isFullNameEn = bool2;
        }
    }

    /* JADX INFO: compiled from: KycInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/data/entities/KycInfo$Request;", "", "tradeType", "", "fiatCurrency", "paymentMethodCode", "channelId", "transferChannelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getFiatCurrency", "getPaymentMethodCode", "getChannelId", "getTransferChannelId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

        @SerializedName("transferChannelId")
        @Nullable
        private final String transferChannelId;

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.tradeType = str;
            this.fiatCurrency = str2;
            this.paymentMethodCode = str3;
            this.channelId = str4;
            this.transferChannelId = str5;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.tradeType, request.tradeType) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.channelId, request.channelId) && Intrinsics.areEqual(this.transferChannelId, request.transferChannelId);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
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
            if ((i11 & 16) != 0) {
                str5 = request.transferChannelId;
            }
            String str6 = str5;
            String str7 = str3;
            return request.copy(str, str2, str7, str4, str6);
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

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTransferChannelId() {
            return this.transferChannelId;
        }

        @NotNull
        public final Request copy(@Nullable String tradeType, @Nullable String fiatCurrency, @Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String transferChannelId) {
            return new Request(tradeType, fiatCurrency, paymentMethodCode, channelId, transferChannelId);
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

        @Nullable
        public final String getTransferChannelId() {
            return this.transferChannelId;
        }

        public int hashCode() {
            String str = this.tradeType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fiatCurrency;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.paymentMethodCode;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.channelId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.transferChannelId;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(tradeType=" + this.tradeType + ", fiatCurrency=" + this.fiatCurrency + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", transferChannelId=" + this.transferChannelId + ')';
        }

        public /* synthetic */ Request(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5);
        }
    }

    /* JADX INFO: compiled from: KycInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/data/entities/KycInfo$Response;", "", "internal", "Lcom/kubi/payment/data/entities/KycInfo$Internal;", "external", "Lcom/kubi/payment/data/entities/KycInfo$External;", "edd", "Lcom/kubi/payment/data/entities/KycInfo$Edd;", "<init>", "(Lcom/kubi/payment/data/entities/KycInfo$Internal;Lcom/kubi/payment/data/entities/KycInfo$External;Lcom/kubi/payment/data/entities/KycInfo$Edd;)V", "getInternal", "()Lcom/kubi/payment/data/entities/KycInfo$Internal;", "getExternal", "()Lcom/kubi/payment/data/entities/KycInfo$External;", "getEdd", "()Lcom/kubi/payment/data/entities/KycInfo$Edd;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("edd")
        @Nullable
        private final Edd edd;

        @SerializedName("external")
        @Nullable
        private final External external;

        @SerializedName("internal")
        @Nullable
        private final Internal internal;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.internal, response.internal) && Intrinsics.areEqual(this.external, response.external) && Intrinsics.areEqual(this.edd, response.edd);
        }

        public static /* synthetic */ Response copy$default(Response response, Internal internal, External external, Edd edd, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                internal = response.internal;
            }
            if ((i11 & 2) != 0) {
                external = response.external;
            }
            if ((i11 & 4) != 0) {
                edd = response.edd;
            }
            return response.copy(internal, external, edd);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Internal getInternal() {
            return this.internal;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final External getExternal() {
            return this.external;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Edd getEdd() {
            return this.edd;
        }

        @NotNull
        public final Response copy(@Nullable Internal internal, @Nullable External external, @Nullable Edd edd) {
            return new Response(internal, external, edd);
        }

        @Nullable
        public final Edd getEdd() {
            return this.edd;
        }

        @Nullable
        public final External getExternal() {
            return this.external;
        }

        @Nullable
        public final Internal getInternal() {
            return this.internal;
        }

        public int hashCode() {
            Internal internal = this.internal;
            int iHashCode = (internal == null ? 0 : internal.hashCode()) * 31;
            External external = this.external;
            int iHashCode2 = (iHashCode + (external == null ? 0 : external.hashCode())) * 31;
            Edd edd = this.edd;
            return iHashCode2 + (edd != null ? edd.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(internal=" + this.internal + ", external=" + this.external + ", edd=" + this.edd + ')';
        }

        public Response(@Nullable Internal internal, @Nullable External external, @Nullable Edd edd) {
            this.internal = internal;
            this.external = external;
            this.edd = edd;
        }
    }
}
