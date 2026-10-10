package com.kubi.sdk.pkg.bundle.i18n;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.i18n.b, reason: from toString */
/* JADX INFO: compiled from: RnI18nModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/b;", "", "", "siteType", "lang", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class RnI18nLocaleContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String siteType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String lang;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RnI18nLocaleContext)) {
            return false;
        }
        RnI18nLocaleContext rnI18nLocaleContext = (RnI18nLocaleContext) other;
        return Intrinsics.areEqual(this.siteType, rnI18nLocaleContext.siteType) && Intrinsics.areEqual(this.lang, rnI18nLocaleContext.lang);
    }

    public RnI18nLocaleContext(@NotNull String siteType, @NotNull String lang) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        this.siteType = siteType;
        this.lang = lang;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    public int hashCode() {
        return (this.siteType.hashCode() * 31) + this.lang.hashCode();
    }

    @NotNull
    public String toString() {
        return "RnI18nLocaleContext(siteType=" + this.siteType + ", lang=" + this.lang + ')';
    }
}
