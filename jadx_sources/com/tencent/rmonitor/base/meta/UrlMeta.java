package com.tencent.rmonitor.base.meta;

import com.tencent.bugly.proguard.C33597d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/UrlMeta;", "", "rmonitorDomain", "", "authorizationUrl", "attaUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttaUrl", "()Ljava/lang/String;", "setAttaUrl", "(Ljava/lang/String;)V", "getAuthorizationUrl", "setAuthorizationUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class UrlMeta {

    @NotNull
    private String attaUrl;

    @NotNull
    private String authorizationUrl;

    @JvmField
    @NotNull
    public String rmonitorDomain;

    public UrlMeta() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlMeta)) {
            return false;
        }
        UrlMeta urlMeta = (UrlMeta) other;
        return Intrinsics.areEqual(this.rmonitorDomain, urlMeta.rmonitorDomain) && Intrinsics.areEqual(this.authorizationUrl, urlMeta.authorizationUrl) && Intrinsics.areEqual(this.attaUrl, urlMeta.attaUrl);
    }

    public UrlMeta(@NotNull String rmonitorDomain, @NotNull String authorizationUrl, @NotNull String attaUrl) {
        Intrinsics.checkNotNullParameter(rmonitorDomain, "rmonitorDomain");
        Intrinsics.checkNotNullParameter(authorizationUrl, "authorizationUrl");
        Intrinsics.checkNotNullParameter(attaUrl, "attaUrl");
        this.rmonitorDomain = rmonitorDomain;
        this.authorizationUrl = authorizationUrl;
        this.attaUrl = attaUrl;
    }

    public static /* synthetic */ UrlMeta copy$default(UrlMeta urlMeta, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = urlMeta.rmonitorDomain;
        }
        if ((i11 & 2) != 0) {
            str2 = urlMeta.authorizationUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = urlMeta.attaUrl;
        }
        return urlMeta.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRmonitorDomain() {
        return this.rmonitorDomain;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAttaUrl() {
        return this.attaUrl;
    }

    @NotNull
    public final UrlMeta copy(@NotNull String rmonitorDomain, @NotNull String authorizationUrl, @NotNull String attaUrl) {
        Intrinsics.checkNotNullParameter(rmonitorDomain, "rmonitorDomain");
        Intrinsics.checkNotNullParameter(authorizationUrl, "authorizationUrl");
        Intrinsics.checkNotNullParameter(attaUrl, "attaUrl");
        return new UrlMeta(rmonitorDomain, authorizationUrl, attaUrl);
    }

    @NotNull
    public final String getAttaUrl() {
        return this.attaUrl;
    }

    @NotNull
    public final String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public int hashCode() {
        return this.attaUrl.hashCode() + ((this.authorizationUrl.hashCode() + (this.rmonitorDomain.hashCode() * 31)) * 31);
    }

    public final void setAttaUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attaUrl = str;
    }

    public final void setAuthorizationUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authorizationUrl = str;
    }

    @NotNull
    public String toString() {
        return "UrlMeta(rmonitorDomain=" + this.rmonitorDomain + ", authorizationUrl=" + this.authorizationUrl + ", attaUrl=" + this.attaUrl + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UrlMeta(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            str = C33597d2.m72768b();
            Intrinsics.checkNotNullExpressionValue(str, "getDomain()");
        }
        str2 = (i11 & 2) != 0 ? "" : str2;
        if ((i11 & 4) != 0) {
            str3 = C33597d2.m72766a();
            Intrinsics.checkNotNullExpressionValue(str3, "getAttaUrl()");
        }
        this(str, str2, str3);
    }
}
