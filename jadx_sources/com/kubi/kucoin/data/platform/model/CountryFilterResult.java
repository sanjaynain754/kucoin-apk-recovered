package com.kubi.kucoin.data.platform.model;

import androidx.annotation.Keep;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.app.country.R$string;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CountryFilterResult.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006$"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/model/CountryFilterResult;", "", "code", "", "mobileCode", TUIThemeManager.LANGUAGE_EN, "cn", "supportVoice", "", "ico", "dismissBreak", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getMobileCode", "getEn", "getCn", "getSupportVoice", "()Z", "getIco", "getDismissBreak", "getDisplayMobileCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CountryFilterResult {

    @Nullable
    private final String cn;

    @NotNull
    private final String code;
    private final boolean dismissBreak;

    @NotNull
    private final String en;

    @Nullable
    private final String ico;

    @NotNull
    private final String mobileCode;
    private final boolean supportVoice;

    public CountryFilterResult() {
        this(null, null, null, null, false, null, false, 127, null);
    }

    public static /* synthetic */ CountryFilterResult copy$default(CountryFilterResult countryFilterResult, String str, String str2, String str3, String str4, boolean z11, String str5, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryFilterResult.code;
        }
        if ((i11 & 2) != 0) {
            str2 = countryFilterResult.mobileCode;
        }
        if ((i11 & 4) != 0) {
            str3 = countryFilterResult.en;
        }
        if ((i11 & 8) != 0) {
            str4 = countryFilterResult.cn;
        }
        if ((i11 & 16) != 0) {
            z11 = countryFilterResult.supportVoice;
        }
        if ((i11 & 32) != 0) {
            str5 = countryFilterResult.ico;
        }
        if ((i11 & 64) != 0) {
            z12 = countryFilterResult.dismissBreak;
        }
        String str6 = str5;
        boolean z13 = z12;
        boolean z14 = z11;
        String str7 = str3;
        return countryFilterResult.copy(str, str2, str7, str4, z14, str6, z13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryFilterResult)) {
            return false;
        }
        CountryFilterResult countryFilterResult = (CountryFilterResult) other;
        return Intrinsics.areEqual(this.code, countryFilterResult.code) && Intrinsics.areEqual(this.mobileCode, countryFilterResult.mobileCode) && Intrinsics.areEqual(this.en, countryFilterResult.en) && Intrinsics.areEqual(this.cn, countryFilterResult.cn) && this.supportVoice == countryFilterResult.supportVoice && Intrinsics.areEqual(this.ico, countryFilterResult.ico) && this.dismissBreak == countryFilterResult.dismissBreak;
    }

    public CountryFilterResult(@NotNull String code, @NotNull String mobileCode, @NotNull String en2, @Nullable String str, boolean z11, @Nullable String str2, boolean z12) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        Intrinsics.checkNotNullParameter(en2, "en");
        this.code = code;
        this.mobileCode = mobileCode;
        this.en = en2;
        this.cn = str;
        this.supportVoice = z11;
        this.ico = str2;
        this.dismissBreak = z12;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobileCode() {
        return this.mobileCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCn() {
        return this.cn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSupportVoice() {
        return this.supportVoice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIco() {
        return this.ico;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDismissBreak() {
        return this.dismissBreak;
    }

    @NotNull
    public final CountryFilterResult copy(@NotNull String code, @NotNull String mobileCode, @NotNull String en2, @Nullable String cn2, boolean supportVoice, @Nullable String ico, boolean dismissBreak) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        Intrinsics.checkNotNullParameter(en2, "en");
        return new CountryFilterResult(code, mobileCode, en2, cn2, supportVoice, ico, dismissBreak);
    }

    @Nullable
    public final String getCn() {
        return this.cn;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final boolean getDismissBreak() {
        return this.dismissBreak;
    }

    @NotNull
    public final String getDisplayMobileCode() {
        if (!Intrinsics.areEqual("+86", this.mobileCode)) {
            return this.mobileCode;
        }
        String string = C5287o0.m6331a().getString(R$string.other);
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    public final String getEn() {
        return this.en;
    }

    @Nullable
    public final String getIco() {
        return this.ico;
    }

    @NotNull
    public final String getMobileCode() {
        return this.mobileCode;
    }

    public final boolean getSupportVoice() {
        return this.supportVoice;
    }

    public int hashCode() {
        int iHashCode = ((((this.code.hashCode() * 31) + this.mobileCode.hashCode()) * 31) + this.en.hashCode()) * 31;
        String str = this.cn;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.supportVoice)) * 31;
        String str2 = this.ico;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.dismissBreak);
    }

    @NotNull
    public String toString() {
        return "CountryFilterResult(code=" + this.code + ", mobileCode=" + this.mobileCode + ", en=" + this.en + ", cn=" + this.cn + ", supportVoice=" + this.supportVoice + ", ico=" + this.ico + ", dismissBreak=" + this.dismissBreak + ')';
    }

    public /* synthetic */ CountryFilterResult(String str, String str2, String str3, String str4, boolean z11, String str5, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? false : z12);
    }
}
