package com.kubi.spot.business.newCoin.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewCoinActivityEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/spot/business/newCoin/entity/LanguageInfo;", "", "language", "", "picUrl", "webUrl", "appUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "getPicUrl", "getWebUrl", "getAppUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LanguageInfo {

    @Nullable
    private final String appUrl;

    @Nullable
    private final String language;

    @Nullable
    private final String picUrl;

    @Nullable
    private final String webUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageInfo)) {
            return false;
        }
        LanguageInfo languageInfo = (LanguageInfo) other;
        return Intrinsics.areEqual(this.language, languageInfo.language) && Intrinsics.areEqual(this.picUrl, languageInfo.picUrl) && Intrinsics.areEqual(this.webUrl, languageInfo.webUrl) && Intrinsics.areEqual(this.appUrl, languageInfo.appUrl);
    }

    public static /* synthetic */ LanguageInfo copy$default(LanguageInfo languageInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = languageInfo.language;
        }
        if ((i11 & 2) != 0) {
            str2 = languageInfo.picUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = languageInfo.webUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = languageInfo.appUrl;
        }
        return languageInfo.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppUrl() {
        return this.appUrl;
    }

    @NotNull
    public final LanguageInfo copy(@Nullable String language, @Nullable String picUrl, @Nullable String webUrl, @Nullable String appUrl) {
        return new LanguageInfo(language, picUrl, webUrl, appUrl);
    }

    @Nullable
    public final String getAppUrl() {
        return this.appUrl;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        String str = this.language;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.picUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LanguageInfo(language=" + this.language + ", picUrl=" + this.picUrl + ", webUrl=" + this.webUrl + ", appUrl=" + this.appUrl + ')';
    }

    public LanguageInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.language = str;
        this.picUrl = str2;
        this.webUrl = str3;
        this.appUrl = str4;
    }
}
