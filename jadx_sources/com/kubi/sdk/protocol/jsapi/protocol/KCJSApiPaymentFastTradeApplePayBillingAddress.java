package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.kubi.kyc.KycKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeApplePayBillingAddress;", "", KycKey.firstName, "", KycKey.lastName, "address", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "city", "state", "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCountry", "getFirstName", "getLastName", "getPostalCode", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentFastTradeApplePayBillingAddress {

    @NotNull
    private final String address;

    @NotNull
    private final String city;

    @NotNull
    private final String country;

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    private final String postalCode;

    @NotNull
    private final String state;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentFastTradeApplePayBillingAddress)) {
            return false;
        }
        KCJSApiPaymentFastTradeApplePayBillingAddress kCJSApiPaymentFastTradeApplePayBillingAddress = (KCJSApiPaymentFastTradeApplePayBillingAddress) other;
        return Intrinsics.areEqual(this.firstName, kCJSApiPaymentFastTradeApplePayBillingAddress.firstName) && Intrinsics.areEqual(this.lastName, kCJSApiPaymentFastTradeApplePayBillingAddress.lastName) && Intrinsics.areEqual(this.address, kCJSApiPaymentFastTradeApplePayBillingAddress.address) && Intrinsics.areEqual(this.postalCode, kCJSApiPaymentFastTradeApplePayBillingAddress.postalCode) && Intrinsics.areEqual(this.city, kCJSApiPaymentFastTradeApplePayBillingAddress.city) && Intrinsics.areEqual(this.state, kCJSApiPaymentFastTradeApplePayBillingAddress.state) && Intrinsics.areEqual(this.country, kCJSApiPaymentFastTradeApplePayBillingAddress.country);
    }

    public KCJSApiPaymentFastTradeApplePayBillingAddress(@NotNull String firstName, @NotNull String lastName, @NotNull String address, @NotNull String postalCode, @NotNull String city, @NotNull String state, @NotNull String country) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public static /* synthetic */ KCJSApiPaymentFastTradeApplePayBillingAddress copy$default(KCJSApiPaymentFastTradeApplePayBillingAddress kCJSApiPaymentFastTradeApplePayBillingAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentFastTradeApplePayBillingAddress.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentFastTradeApplePayBillingAddress.lastName;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiPaymentFastTradeApplePayBillingAddress.address;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiPaymentFastTradeApplePayBillingAddress.postalCode;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiPaymentFastTradeApplePayBillingAddress.city;
        }
        if ((i11 & 32) != 0) {
            str6 = kCJSApiPaymentFastTradeApplePayBillingAddress.state;
        }
        if ((i11 & 64) != 0) {
            str7 = kCJSApiPaymentFastTradeApplePayBillingAddress.country;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return kCJSApiPaymentFastTradeApplePayBillingAddress.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final KCJSApiPaymentFastTradeApplePayBillingAddress copy(@NotNull String firstName, @NotNull String lastName, @NotNull String address, @NotNull String postalCode, @NotNull String city, @NotNull String state, @NotNull String country) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        return new KCJSApiPaymentFastTradeApplePayBillingAddress(firstName, lastName, address, postalCode, city, state, country);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return (((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.address.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.country.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentFastTradeApplePayBillingAddress(firstName=" + this.firstName + ", lastName=" + this.lastName + ", address=" + this.address + ", postalCode=" + this.postalCode + ", city=" + this.city + ", state=" + this.state + ", country=" + this.country + ')';
    }
}
