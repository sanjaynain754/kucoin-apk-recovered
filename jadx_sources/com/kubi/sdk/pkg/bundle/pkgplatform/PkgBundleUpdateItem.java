package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nMeta;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PkgPlatformApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0093\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00065"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;", "", Constants.BIZ, "", "version", "buildNo", "", "url", "packageHash", "packageSize", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "leadUpgrade", "", "basicDeps", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;", "subPackages", "i18n", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;)V", "getBasicDeps", "()Ljava/util/List;", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()J", "getI18n", "()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;", "getLeadUpgrade", "()Z", "getPackageHash", "getPackageSize", "getSdkVersion", "getSubPackages", "getUrl", "getVersion", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class PkgBundleUpdateItem {

    @Nullable
    private final List<PkgBasicDep> basicDeps;

    @Nullable
    private final String biz;
    private final long buildNo;

    @Nullable
    private final RnI18nMeta i18n;
    private final boolean leadUpgrade;

    @Nullable
    private final String packageHash;
    private final long packageSize;

    @Nullable
    private final String sdkVersion;

    @Nullable
    private final List<PkgBasicDep> subPackages;

    @Nullable
    private final String url;

    @Nullable
    private final String version;

    public PkgBundleUpdateItem(@Nullable String str, @Nullable String str2, long j11, @Nullable String str3, @Nullable String str4, long j12, @Nullable String str5, boolean z11, @Nullable List<PkgBasicDep> list, @Nullable List<PkgBasicDep> list2, @Nullable RnI18nMeta rnI18nMeta) {
        this.biz = str;
        this.version = str2;
        this.buildNo = j11;
        this.url = str3;
        this.packageHash = str4;
        this.packageSize = j12;
        this.sdkVersion = str5;
        this.leadUpgrade = z11;
        this.basicDeps = list;
        this.subPackages = list2;
        this.i18n = rnI18nMeta;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PkgBundleUpdateItem)) {
            return false;
        }
        PkgBundleUpdateItem pkgBundleUpdateItem = (PkgBundleUpdateItem) other;
        return Intrinsics.areEqual(this.biz, pkgBundleUpdateItem.biz) && Intrinsics.areEqual(this.version, pkgBundleUpdateItem.version) && this.buildNo == pkgBundleUpdateItem.buildNo && Intrinsics.areEqual(this.url, pkgBundleUpdateItem.url) && Intrinsics.areEqual(this.packageHash, pkgBundleUpdateItem.packageHash) && this.packageSize == pkgBundleUpdateItem.packageSize && Intrinsics.areEqual(this.sdkVersion, pkgBundleUpdateItem.sdkVersion) && this.leadUpgrade == pkgBundleUpdateItem.leadUpgrade && Intrinsics.areEqual(this.basicDeps, pkgBundleUpdateItem.basicDeps) && Intrinsics.areEqual(this.subPackages, pkgBundleUpdateItem.subPackages) && Intrinsics.areEqual(this.i18n, pkgBundleUpdateItem.i18n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PkgBundleUpdateItem copy$default(PkgBundleUpdateItem pkgBundleUpdateItem, String str, String str2, long j11, String str3, String str4, long j12, String str5, boolean z11, List list, List list2, RnI18nMeta rnI18nMeta, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pkgBundleUpdateItem.biz;
        }
        return pkgBundleUpdateItem.copy(str, (i11 & 2) != 0 ? pkgBundleUpdateItem.version : str2, (i11 & 4) != 0 ? pkgBundleUpdateItem.buildNo : j11, (i11 & 8) != 0 ? pkgBundleUpdateItem.url : str3, (i11 & 16) != 0 ? pkgBundleUpdateItem.packageHash : str4, (i11 & 32) != 0 ? pkgBundleUpdateItem.packageSize : j12, (i11 & 64) != 0 ? pkgBundleUpdateItem.sdkVersion : str5, (i11 & 128) != 0 ? pkgBundleUpdateItem.leadUpgrade : z11, (i11 & 256) != 0 ? pkgBundleUpdateItem.basicDeps : list, (i11 & 512) != 0 ? pkgBundleUpdateItem.subPackages : list2, (i11 & 1024) != 0 ? pkgBundleUpdateItem.i18n : rnI18nMeta);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final List<PkgBasicDep> component10() {
        return this.subPackages;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final RnI18nMeta getI18n() {
        return this.i18n;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBuildNo() {
        return this.buildNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPackageHash() {
        return this.packageHash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPackageSize() {
        return this.packageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getLeadUpgrade() {
        return this.leadUpgrade;
    }

    @Nullable
    public final List<PkgBasicDep> component9() {
        return this.basicDeps;
    }

    @NotNull
    public final PkgBundleUpdateItem copy(@Nullable String biz, @Nullable String version, long buildNo, @Nullable String url, @Nullable String packageHash, long packageSize, @Nullable String sdkVersion, boolean leadUpgrade, @Nullable List<PkgBasicDep> basicDeps, @Nullable List<PkgBasicDep> subPackages, @Nullable RnI18nMeta i18n) {
        return new PkgBundleUpdateItem(biz, version, buildNo, url, packageHash, packageSize, sdkVersion, leadUpgrade, basicDeps, subPackages, i18n);
    }

    @Nullable
    public final List<PkgBasicDep> getBasicDeps() {
        return this.basicDeps;
    }

    @Nullable
    public final String getBiz() {
        return this.biz;
    }

    public final long getBuildNo() {
        return this.buildNo;
    }

    @Nullable
    public final RnI18nMeta getI18n() {
        return this.i18n;
    }

    public final boolean getLeadUpgrade() {
        return this.leadUpgrade;
    }

    @Nullable
    public final String getPackageHash() {
        return this.packageHash;
    }

    public final long getPackageSize() {
        return this.packageSize;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final List<PkgBasicDep> getSubPackages() {
        return this.subPackages;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v32 */
    public int hashCode() {
        String str = this.biz;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.version;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.buildNo)) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageHash;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.packageSize)) * 31;
        String str5 = this.sdkVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z11 = this.leadUpgrade;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode5 + r11) * 31;
        List<PkgBasicDep> list = this.basicDeps;
        int iHashCode6 = (i11 + (list == null ? 0 : list.hashCode())) * 31;
        List<PkgBasicDep> list2 = this.subPackages;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        RnI18nMeta rnI18nMeta = this.i18n;
        return iHashCode7 + (rnI18nMeta != null ? rnI18nMeta.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PkgBundleUpdateItem(biz=" + this.biz + ", version=" + this.version + ", buildNo=" + this.buildNo + ", url=" + this.url + ", packageHash=" + this.packageHash + ", packageSize=" + this.packageSize + ", sdkVersion=" + this.sdkVersion + ", leadUpgrade=" + this.leadUpgrade + ", basicDeps=" + this.basicDeps + ", subPackages=" + this.subPackages + ", i18n=" + this.i18n + ')';
    }

    public /* synthetic */ PkgBundleUpdateItem(String str, String str2, long j11, String str3, String str4, long j12, String str5, boolean z11, List list, List list2, RnI18nMeta rnI18nMeta, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? 0L : j11, str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? 0L : j12, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : list2, (i11 & 1024) != 0 ? null : rnI18nMeta);
    }
}
