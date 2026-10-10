package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayBillingAddress;", "", "name", "", HintConstants.AUTOFILL_HINT_POSTAL_CODE, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "locality", "administrativeArea", "sortingCode", "address1", "address2", "address3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getAddress3", "getAdministrativeArea", "getCountryCode", "getLocality", "getName", "getPostalCode", "getSortingCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeGooglePayBillingAddress {

    @Nullable
    private final String address1;

    @Nullable
    private final String address2;

    @Nullable
    private final String address3;

    @Nullable
    private final String administrativeArea;

    @Nullable
    private final String countryCode;

    @Nullable
    private final String locality;

    @Nullable
    private final String name;

    @Nullable
    private final String postalCode;

    @Nullable
    private final String sortingCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeGooglePayBillingAddress)) {
            return false;
        }
        KCJSApiPaymentFastTradeGooglePayBillingAddress kCJSApiPaymentFastTradeGooglePayBillingAddress = (KCJSApiPaymentFastTradeGooglePayBillingAddress) other;
        return Intrinsics.areEqual(this.name, kCJSApiPaymentFastTradeGooglePayBillingAddress.name) && Intrinsics.areEqual(this.postalCode, kCJSApiPaymentFastTradeGooglePayBillingAddress.postalCode) && Intrinsics.areEqual(this.countryCode, kCJSApiPaymentFastTradeGooglePayBillingAddress.countryCode) && Intrinsics.areEqual(this.locality, kCJSApiPaymentFastTradeGooglePayBillingAddress.locality) && Intrinsics.areEqual(this.administrativeArea, kCJSApiPaymentFastTradeGooglePayBillingAddress.administrativeArea) && Intrinsics.areEqual(this.sortingCode, kCJSApiPaymentFastTradeGooglePayBillingAddress.sortingCode) && Intrinsics.areEqual(this.address1, kCJSApiPaymentFastTradeGooglePayBillingAddress.address1) && Intrinsics.areEqual(this.address2, kCJSApiPaymentFastTradeGooglePayBillingAddress.address2) && Intrinsics.areEqual(this.address3, kCJSApiPaymentFastTradeGooglePayBillingAddress.address3);
    }

    public static /* synthetic */ KCJSApiPaymentFastTradeGooglePayBillingAddress copy$default(KCJSApiPaymentFastTradeGooglePayBillingAddress kCJSApiPaymentFastTradeGooglePayBillingAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeGooglePayBillingAddress.name;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentFastTradeGooglePayBillingAddress.postalCode;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiPaymentFastTradeGooglePayBillingAddress.countryCode;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiPaymentFastTradeGooglePayBillingAddress.locality;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiPaymentFastTradeGooglePayBillingAddress.administrativeArea;
        }
        if ((i11 & 32) != 0) {
            str6 = kCJSApiPaymentFastTradeGooglePayBillingAddress.sortingCode;
        }
        if ((i11 & 64) != 0) {
            str7 = kCJSApiPaymentFastTradeGooglePayBillingAddress.address1;
        }
        if ((i11 & 128) != 0) {
            str8 = kCJSApiPaymentFastTradeGooglePayBillingAddress.address2;
        }
        if ((i11 & 256) != 0) {
            str9 = kCJSApiPaymentFastTradeGooglePayBillingAddress.address3;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return kCJSApiPaymentFastTradeGooglePayBillingAddress.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSortingCode() {
        return this.sortingCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAddress3() {
        return this.address3;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeGooglePayBillingAddress copy(@Nullable String name, @Nullable String postalCode, @Nullable String countryCode, @Nullable String locality, @Nullable String administrativeArea, @Nullable String sortingCode, @Nullable String address1, @Nullable String address2, @Nullable String address3) {
        return new KCJSApiPaymentFastTradeGooglePayBillingAddress(name, postalCode, countryCode, locality, administrativeArea, sortingCode, address1, address2, address3);
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
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.postalCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locality;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.administrativeArea;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sortingCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address1;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.address2;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.address3;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeGooglePayBillingAddress(name=" + this.name + ", postalCode=" + this.postalCode + ", countryCode=" + this.countryCode + ", locality=" + this.locality + ", administrativeArea=" + this.administrativeArea + ", sortingCode=" + this.sortingCode + ", address1=" + this.address1 + ", address2=" + this.address2 + ", address3=" + this.address3 + ')';
    }

    public KCJSApiPaymentFastTradeGooglePayBillingAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.name = str;
        this.postalCode = str2;
        this.countryCode = str3;
        this.locality = str4;
        this.administrativeArea = str5;
        this.sortingCode = str6;
        this.address1 = str7;
        this.address2 = str8;
        this.address3 = str9;
    }
}
