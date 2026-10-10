package com.kubi.sdk.pkg.bundle.i18n;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnI18nModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;", "", Constants.BIZ, "", "entry", "version", "buildNo", "", "i18n", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;)V", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()J", "getEntry", "getI18n", "()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;", "key", "getKey", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class RnI18nBundleMeta {

    @NotNull
    private final String biz;
    private final long buildNo;

    @NotNull
    private final String entry;

    @NotNull
    private final RnI18nMeta i18n;

    @Nullable
    private final String version;

    public RnI18nBundleMeta(@NotNull String biz, @NotNull String entry, @Nullable String str, long j11, @NotNull RnI18nMeta i18n) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(i18n, "i18n");
        this.biz = biz;
        this.entry = entry;
        this.version = str;
        this.buildNo = j11;
        this.i18n = i18n;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RnI18nBundleMeta)) {
            return false;
        }
        RnI18nBundleMeta rnI18nBundleMeta = (RnI18nBundleMeta) other;
        return Intrinsics.areEqual(this.biz, rnI18nBundleMeta.biz) && Intrinsics.areEqual(this.entry, rnI18nBundleMeta.entry) && Intrinsics.areEqual(this.version, rnI18nBundleMeta.version) && this.buildNo == rnI18nBundleMeta.buildNo && Intrinsics.areEqual(this.i18n, rnI18nBundleMeta.i18n);
    }

    public static /* synthetic */ RnI18nBundleMeta copy$default(RnI18nBundleMeta rnI18nBundleMeta, String str, String str2, String str3, long j11, RnI18nMeta rnI18nMeta, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rnI18nBundleMeta.biz;
        }
        if ((i11 & 2) != 0) {
            str2 = rnI18nBundleMeta.entry;
        }
        if ((i11 & 4) != 0) {
            str3 = rnI18nBundleMeta.version;
        }
        if ((i11 & 8) != 0) {
            j11 = rnI18nBundleMeta.buildNo;
        }
        if ((i11 & 16) != 0) {
            rnI18nMeta = rnI18nBundleMeta.i18n;
        }
        RnI18nMeta rnI18nMeta2 = rnI18nMeta;
        String str4 = str3;
        return rnI18nBundleMeta.copy(str, str2, str4, j11, rnI18nMeta2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBuildNo() {
        return this.buildNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RnI18nMeta getI18n() {
        return this.i18n;
    }

    @NotNull
    public final RnI18nBundleMeta copy(@NotNull String biz, @NotNull String entry, @Nullable String version, long buildNo, @NotNull RnI18nMeta i18n) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(i18n, "i18n");
        return new RnI18nBundleMeta(biz, entry, version, buildNo, i18n);
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    public final long getBuildNo() {
        return this.buildNo;
    }

    @NotNull
    public final String getEntry() {
        return this.entry;
    }

    @NotNull
    public final RnI18nMeta getI18n() {
        return this.i18n;
    }

    @NotNull
    public final String getKey() {
        return this.biz + '-' + this.entry;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((this.biz.hashCode() * 31) + this.entry.hashCode()) * 31;
        String str = this.version;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.buildNo)) * 31) + this.i18n.hashCode();
    }

    @NotNull
    public String toString() {
        return "RnI18nBundleMeta(biz=" + this.biz + ", entry=" + this.entry + ", version=" + this.version + ", buildNo=" + this.buildNo + ", i18n=" + this.i18n + ')';
    }

    public /* synthetic */ RnI18nBundleMeta(String str, String str2, String str3, long j11, RnI18nMeta rnI18nMeta, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? 0L : j11, rnI18nMeta);
    }
}
