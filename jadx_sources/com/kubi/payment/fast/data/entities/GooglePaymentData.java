package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GooglePaymentData.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/GooglePaymentData;", "", "base64Token", "", "address1", "address2", "address3", "administrativeArea", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "locality", "name", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "sortingCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBase64Token", "()Ljava/lang/String;", "getAddress1", "getAddress2", "getAddress3", "getAdministrativeArea", "getCountryCode", "getLocality", "getName", "getPostalCode", "getSortingCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GooglePaymentData {

    @SerializedName("address1")
    @Nullable
    private final String address1;

    @SerializedName("address2")
    @Nullable
    private final String address2;

    @SerializedName("address3")
    @Nullable
    private final String address3;

    @SerializedName("administrativeArea")
    @Nullable
    private final String administrativeArea;

    @Nullable
    private final transient String base64Token;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    @Nullable
    private final String countryCode;

    @SerializedName("locality")
    @Nullable
    private final String locality;

    @SerializedName("name")
    @Nullable
    private final String name;

    @SerializedName(HintConstants.AUTOFILL_HINT_POSTAL_CODE)
    @Nullable
    private final String postalCode;

    @SerializedName("sortingCode")
    @Nullable
    private final String sortingCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePaymentData)) {
            return false;
        }
        GooglePaymentData googlePaymentData = (GooglePaymentData) other;
        return Intrinsics.areEqual(this.base64Token, googlePaymentData.base64Token) && Intrinsics.areEqual(this.address1, googlePaymentData.address1) && Intrinsics.areEqual(this.address2, googlePaymentData.address2) && Intrinsics.areEqual(this.address3, googlePaymentData.address3) && Intrinsics.areEqual(this.administrativeArea, googlePaymentData.administrativeArea) && Intrinsics.areEqual(this.countryCode, googlePaymentData.countryCode) && Intrinsics.areEqual(this.locality, googlePaymentData.locality) && Intrinsics.areEqual(this.name, googlePaymentData.name) && Intrinsics.areEqual(this.postalCode, googlePaymentData.postalCode) && Intrinsics.areEqual(this.sortingCode, googlePaymentData.sortingCode);
    }

    public static /* synthetic */ GooglePaymentData copy$default(GooglePaymentData googlePaymentData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePaymentData.base64Token;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePaymentData.address1;
        }
        if ((i11 & 4) != 0) {
            str3 = googlePaymentData.address2;
        }
        if ((i11 & 8) != 0) {
            str4 = googlePaymentData.address3;
        }
        if ((i11 & 16) != 0) {
            str5 = googlePaymentData.administrativeArea;
        }
        if ((i11 & 32) != 0) {
            str6 = googlePaymentData.countryCode;
        }
        if ((i11 & 64) != 0) {
            str7 = googlePaymentData.locality;
        }
        if ((i11 & 128) != 0) {
            str8 = googlePaymentData.name;
        }
        if ((i11 & 256) != 0) {
            str9 = googlePaymentData.postalCode;
        }
        if ((i11 & 512) != 0) {
            str10 = googlePaymentData.sortingCode;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return googlePaymentData.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase64Token() {
        return this.base64Token;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSortingCode() {
        return this.sortingCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddress3() {
        return this.address3;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final GooglePaymentData copy(@Nullable String base64Token, @Nullable String address1, @Nullable String address2, @Nullable String address3, @Nullable String administrativeArea, @Nullable String countryCode, @Nullable String locality, @Nullable String name, @Nullable String postalCode, @Nullable String sortingCode) {
        return new GooglePaymentData(base64Token, address1, address2, address3, administrativeArea, countryCode, locality, name, postalCode, sortingCode);
    }

    @Nullable
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    public final String getAddress3() {
        return this.address3;
    }

    @Nullable
    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    @Nullable
    public final String getBase64Token() {
        return this.base64Token;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getLocality() {
        return this.locality;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public final String getSortingCode() {
        return this.sortingCode;
    }

    public int hashCode() {
        String str = this.base64Token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address3;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.administrativeArea;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.locality;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.name;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sortingCode;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GooglePaymentData(base64Token=" + this.base64Token + ", address1=" + this.address1 + ", address2=" + this.address2 + ", address3=" + this.address3 + ", administrativeArea=" + this.administrativeArea + ", countryCode=" + this.countryCode + ", locality=" + this.locality + ", name=" + this.name + ", postalCode=" + this.postalCode + ", sortingCode=" + this.sortingCode + ')';
    }

    public GooglePaymentData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.base64Token = str;
        this.address1 = str2;
        this.address2 = str3;
        this.address3 = str4;
        this.administrativeArea = str5;
        this.countryCode = str6;
        this.locality = str7;
        this.name = str8;
        this.postalCode = str9;
        this.sortingCode = str10;
    }
}
