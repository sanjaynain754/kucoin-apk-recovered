package com.kubi.payment.common.data.entities;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Country.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/common/data/entities/Country;", "", "code", "", "countryName", "chineseCountryName", TUIConstants.TUIChat.INPUT_MORE_ICON, "phoneAreaCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCountryName", "getChineseCountryName", "getIcon", "getPhoneAreaCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Country {

    @Nullable
    private final String chineseCountryName;

    @Nullable
    private final String code;

    @Nullable
    private final String countryName;

    @Nullable
    private final String icon;

    @Nullable
    private final String phoneAreaCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.areEqual(this.code, country.code) && Intrinsics.areEqual(this.countryName, country.countryName) && Intrinsics.areEqual(this.chineseCountryName, country.chineseCountryName) && Intrinsics.areEqual(this.icon, country.icon) && Intrinsics.areEqual(this.phoneAreaCode, country.phoneAreaCode);
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = country.code;
        }
        if ((i11 & 2) != 0) {
            str2 = country.countryName;
        }
        if ((i11 & 4) != 0) {
            str3 = country.chineseCountryName;
        }
        if ((i11 & 8) != 0) {
            str4 = country.icon;
        }
        if ((i11 & 16) != 0) {
            str5 = country.phoneAreaCode;
        }
        String str6 = str5;
        String str7 = str3;
        return country.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChineseCountryName() {
        return this.chineseCountryName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPhoneAreaCode() {
        return this.phoneAreaCode;
    }

    @NotNull
    public final Country copy(@Nullable String code, @Nullable String countryName, @Nullable String chineseCountryName, @Nullable String icon, @Nullable String phoneAreaCode) {
        return new Country(code, countryName, chineseCountryName, icon, phoneAreaCode);
    }

    @Nullable
    public final String getChineseCountryName() {
        return this.chineseCountryName;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCountryName() {
        return this.countryName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getPhoneAreaCode() {
        return this.phoneAreaCode;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chineseCountryName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneAreaCode;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Country(code=" + this.code + ", countryName=" + this.countryName + ", chineseCountryName=" + this.chineseCountryName + ", icon=" + this.icon + ", phoneAreaCode=" + this.phoneAreaCode + ')';
    }

    public Country(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.code = str;
        this.countryName = str2;
        this.chineseCountryName = str3;
        this.icon = str4;
        this.phoneAreaCode = str5;
    }
}
