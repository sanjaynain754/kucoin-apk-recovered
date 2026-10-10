package com.sumsub.sns.internal.core.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.BaseActivity;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.widget.AbstractC28250a;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0006\u0010$\u001a\u00020\fJ\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006/"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/common/SNSSession;", "Landroid/os/Parcelable;", "sessionId", "", "url", "locale", "Ljava/util/Locale;", "isDebug", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "versionName", "versionCode", "", BaseActivity.THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;II)V", "getSessionId", "()Ljava/lang/String;", "getUrl", "getLocale", "()Ljava/util/Locale;", "()Z", "getPackageName", "getVersionName", "getVersionCode", "()I", "getTheme", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SNSSession implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SNSSession> CREATOR = new C28411O0();
    private final boolean isDebug;

    @NotNull
    private final Locale locale;

    @NotNull
    private final String packageName;

    @NotNull
    private final String sessionId;
    private final int theme;

    @NotNull
    private final String url;
    private final int versionCode;

    @NotNull
    private final String versionName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSSession)) {
            return false;
        }
        SNSSession sNSSession = (SNSSession) other;
        return Intrinsics.areEqual(this.sessionId, sNSSession.sessionId) && Intrinsics.areEqual(this.url, sNSSession.url) && Intrinsics.areEqual(this.locale, sNSSession.locale) && this.isDebug == sNSSession.isDebug && Intrinsics.areEqual(this.packageName, sNSSession.packageName) && Intrinsics.areEqual(this.versionName, sNSSession.versionName) && this.versionCode == sNSSession.versionCode && this.theme == sNSSession.theme;
    }

    public static /* synthetic */ SNSSession copy$default(SNSSession sNSSession, String str, String str2, Locale locale, boolean z11, String str3, String str4, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sNSSession.sessionId;
        }
        if ((i13 & 2) != 0) {
            str2 = sNSSession.url;
        }
        if ((i13 & 4) != 0) {
            locale = sNSSession.locale;
        }
        if ((i13 & 8) != 0) {
            z11 = sNSSession.isDebug;
        }
        if ((i13 & 16) != 0) {
            str3 = sNSSession.packageName;
        }
        if ((i13 & 32) != 0) {
            str4 = sNSSession.versionName;
        }
        if ((i13 & 64) != 0) {
            i11 = sNSSession.versionCode;
        }
        if ((i13 & 128) != 0) {
            i12 = sNSSession.theme;
        }
        int i14 = i11;
        int i15 = i12;
        String str5 = str3;
        String str6 = str4;
        return sNSSession.copy(str, str2, locale, z11, str5, str6, i14, i15);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTheme() {
        return this.theme;
    }

    @NotNull
    public final SNSSession copy(@NotNull String sessionId, @NotNull String url, @NotNull Locale locale, boolean isDebug, @NotNull String packageName, @NotNull String versionName, int versionCode, int theme) {
        return new SNSSession(sessionId, url, locale, isDebug, packageName, versionName, versionCode, theme);
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return Integer.hashCode(this.theme) + AbstractC28250a.m69223a(this.versionCode, AbstractC27897U.m68983a(this.versionName, AbstractC27897U.m68983a(this.packageName, AbstractC27920h.m69001a(this.isDebug, (this.locale.hashCode() + AbstractC27897U.m68983a(this.url, this.sessionId.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    @NotNull
    public String toString() {
        return "SNSSession(sessionId=" + this.sessionId + ", url=" + this.url + ", locale=" + this.locale + ", isDebug=" + this.isDebug + ", packageName=" + this.packageName + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.writeString(this.sessionId);
        dest.writeString(this.url);
        dest.writeSerializable(this.locale);
        dest.writeInt(this.isDebug ? 1 : 0);
        dest.writeString(this.packageName);
        dest.writeString(this.versionName);
        dest.writeInt(this.versionCode);
        dest.writeInt(this.theme);
    }

    public SNSSession(@NotNull String str, @NotNull String str2, @NotNull Locale locale, boolean z11, @NotNull String str3, @NotNull String str4, int i11, int i12) {
        this.sessionId = str;
        this.url = str2;
        this.locale = locale;
        this.isDebug = z11;
        this.packageName = str3;
        this.versionName = str4;
        this.versionCode = i11;
        this.theme = i12;
    }
}
