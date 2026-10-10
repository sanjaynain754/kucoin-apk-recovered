package com.kubi.sdk.pkg.hybird;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HybridPackageInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006."}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/HybridPackageInfo;", "", "name", "", "version", "full", "fullLength", "", "fullSha1", "patch", "patchVersion", "patchLength", "patchSha1", "lowestAppVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getFull", "()Ljava/lang/String;", "getFullLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFullSha1", "getLowestAppVersion", "getName", "getPatch", "getPatchLength", "getPatchSha1", "getPatchVersion", "getVersion", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/hybird/HybridPackageInfo;", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class HybridPackageInfo {

    @Nullable
    private final String full;

    @Nullable
    private final Long fullLength;

    @Nullable
    private final String fullSha1;

    @Nullable
    private final String lowestAppVersion;

    @Nullable
    private final String name;

    @Nullable
    private final String patch;

    @Nullable
    private final Long patchLength;

    @Nullable
    private final String patchSha1;

    @Nullable
    private final String patchVersion;

    @Nullable
    private final String version;

    public HybridPackageInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l12, @Nullable String str7, @Nullable String str8) {
        this.name = str;
        this.version = str2;
        this.full = str3;
        this.fullLength = l11;
        this.fullSha1 = str4;
        this.patch = str5;
        this.patchVersion = str6;
        this.patchLength = l12;
        this.patchSha1 = str7;
        this.lowestAppVersion = str8;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridPackageInfo)) {
            return false;
        }
        HybridPackageInfo hybridPackageInfo = (HybridPackageInfo) other;
        return Intrinsics.areEqual(this.name, hybridPackageInfo.name) && Intrinsics.areEqual(this.version, hybridPackageInfo.version) && Intrinsics.areEqual(this.full, hybridPackageInfo.full) && Intrinsics.areEqual(this.fullLength, hybridPackageInfo.fullLength) && Intrinsics.areEqual(this.fullSha1, hybridPackageInfo.fullSha1) && Intrinsics.areEqual(this.patch, hybridPackageInfo.patch) && Intrinsics.areEqual(this.patchVersion, hybridPackageInfo.patchVersion) && Intrinsics.areEqual(this.patchLength, hybridPackageInfo.patchLength) && Intrinsics.areEqual(this.patchSha1, hybridPackageInfo.patchSha1) && Intrinsics.areEqual(this.lowestAppVersion, hybridPackageInfo.lowestAppVersion);
    }

    public static /* synthetic */ HybridPackageInfo copy$default(HybridPackageInfo hybridPackageInfo, String str, String str2, String str3, Long l11, String str4, String str5, String str6, Long l12, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hybridPackageInfo.name;
        }
        if ((i11 & 2) != 0) {
            str2 = hybridPackageInfo.version;
        }
        if ((i11 & 4) != 0) {
            str3 = hybridPackageInfo.full;
        }
        if ((i11 & 8) != 0) {
            l11 = hybridPackageInfo.fullLength;
        }
        if ((i11 & 16) != 0) {
            str4 = hybridPackageInfo.fullSha1;
        }
        if ((i11 & 32) != 0) {
            str5 = hybridPackageInfo.patch;
        }
        if ((i11 & 64) != 0) {
            str6 = hybridPackageInfo.patchVersion;
        }
        if ((i11 & 128) != 0) {
            l12 = hybridPackageInfo.patchLength;
        }
        if ((i11 & 256) != 0) {
            str7 = hybridPackageInfo.patchSha1;
        }
        if ((i11 & 512) != 0) {
            str8 = hybridPackageInfo.lowestAppVersion;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        Long l13 = l12;
        String str12 = str4;
        String str13 = str5;
        return hybridPackageInfo.copy(str, str2, str3, l11, str12, str13, str11, l13, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLowestAppVersion() {
        return this.lowestAppVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFull() {
        return this.full;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getFullLength() {
        return this.fullLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFullSha1() {
        return this.fullSha1;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPatch() {
        return this.patch;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPatchVersion() {
        return this.patchVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getPatchLength() {
        return this.patchLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPatchSha1() {
        return this.patchSha1;
    }

    @NotNull
    public final HybridPackageInfo copy(@Nullable String name, @Nullable String version, @Nullable String full, @Nullable Long fullLength, @Nullable String fullSha1, @Nullable String patch, @Nullable String patchVersion, @Nullable Long patchLength, @Nullable String patchSha1, @Nullable String lowestAppVersion) {
        return new HybridPackageInfo(name, version, full, fullLength, fullSha1, patch, patchVersion, patchLength, patchSha1, lowestAppVersion);
    }

    @Nullable
    public final String getFull() {
        return this.full;
    }

    @Nullable
    public final Long getFullLength() {
        return this.fullLength;
    }

    @Nullable
    public final String getFullSha1() {
        return this.fullSha1;
    }

    @Nullable
    public final String getLowestAppVersion() {
        return this.lowestAppVersion;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPatch() {
        return this.patch;
    }

    @Nullable
    public final Long getPatchLength() {
        return this.patchLength;
    }

    @Nullable
    public final String getPatchSha1() {
        return this.patchSha1;
    }

    @Nullable
    public final String getPatchVersion() {
        return this.patchVersion;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.version;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.full;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.fullLength;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.fullSha1;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.patch;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.patchVersion;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l12 = this.patchLength;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str7 = this.patchSha1;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lowestAppVersion;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HybridPackageInfo(name=" + this.name + ", version=" + this.version + ", full=" + this.full + ", fullLength=" + this.fullLength + ", fullSha1=" + this.fullSha1 + ", patch=" + this.patch + ", patchVersion=" + this.patchVersion + ", patchLength=" + this.patchLength + ", patchSha1=" + this.patchSha1 + ", lowestAppVersion=" + this.lowestAppVersion + ')';
    }

    public /* synthetic */ HybridPackageInfo(String str, String str2, String str3, Long l11, String str4, String str5, String str6, Long l12, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : l12, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8);
    }
}
