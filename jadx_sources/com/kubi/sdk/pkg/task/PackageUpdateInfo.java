package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.task.e, reason: from toString */
/* JADX INFO: compiled from: PackageUpdateInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b$\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/e;", "", "", "deployPath", "name", "version", "url", "", SessionDescription.ATTR_LENGTH, "hash", "Lcom/kubi/sdk/pkg/task/HashType;", "hashType", "patchCoverVersion", "", "allowMissingManifest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/HashType;Ljava/lang/String;Z)V", "Lcom/kubi/sdk/pkg/task/d;", "d", "()Lcom/kubi/sdk/pkg/task/d;", "downloadFilePath", "Lcom/kubi/sdk/pkg/task/c;", "c", "(Ljava/lang/String;)Lcom/kubi/sdk/pkg/task/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getDeployPath", "b", "getUrl", "e", "Ljava/lang/Long;", "getLength", "()Ljava/lang/Long;", "f", "getHash", "g", "Lcom/kubi/sdk/pkg/task/HashType;", "getHashType", "()Lcom/kubi/sdk/pkg/task/HashType;", CmcdData.Factory.STREAMING_FORMAT_HLS, "getPatchCoverVersion", "i", "Z", "getAllowMissingManifest", "()Z", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class PackageUpdateInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String deployPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Long length;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String hash;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final HashType hashType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final String patchCoverVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final boolean allowMissingManifest;

    public PackageUpdateInfo(@NotNull String deployPath, @NotNull String name, @NotNull String version, @NotNull String url, @Nullable Long l11, @Nullable String str, @NotNull HashType hashType, @Nullable String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(deployPath, "deployPath");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(hashType, "hashType");
        this.deployPath = deployPath;
        this.name = name;
        this.version = version;
        this.url = url;
        this.length = l11;
        this.hash = str;
        this.hashType = hashType;
        this.patchCoverVersion = str2;
        this.allowMissingManifest = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageUpdateInfo)) {
            return false;
        }
        PackageUpdateInfo packageUpdateInfo = (PackageUpdateInfo) other;
        return Intrinsics.areEqual(this.deployPath, packageUpdateInfo.deployPath) && Intrinsics.areEqual(this.name, packageUpdateInfo.name) && Intrinsics.areEqual(this.version, packageUpdateInfo.version) && Intrinsics.areEqual(this.url, packageUpdateInfo.url) && Intrinsics.areEqual(this.length, packageUpdateInfo.length) && Intrinsics.areEqual(this.hash, packageUpdateInfo.hash) && this.hashType == packageUpdateInfo.hashType && Intrinsics.areEqual(this.patchCoverVersion, packageUpdateInfo.patchCoverVersion) && this.allowMissingManifest == packageUpdateInfo.allowMissingManifest;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DeployInfo m57836c(@NotNull String downloadFilePath) {
        String str;
        Intrinsics.checkNotNullParameter(downloadFilePath, "downloadFilePath");
        return new DeployInfo(this.name, this.deployPath, this.version, downloadFilePath, false, this.patchCoverVersion, (!this.allowMissingManifest || (str = this.hash) == null || str.length() == 0) ? false : true);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final DownloadInfo m57837d() {
        return new DownloadInfo(this.name, this.url, this.deployPath, this.patchCoverVersion != null ? "patch.zip" : "package.zip", this.length, this.hash, this.hashType, this.version);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    public int hashCode() {
        int iHashCode = ((((((this.deployPath.hashCode() * 31) + this.name.hashCode()) * 31) + this.version.hashCode()) * 31) + this.url.hashCode()) * 31;
        Long l11 = this.length;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.hash;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.hashType.hashCode()) * 31;
        String str2 = this.patchCoverVersion;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z11 = this.allowMissingManifest;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode4 + r11;
    }

    @NotNull
    public String toString() {
        return "PackageUpdateInfo(deployPath=" + this.deployPath + ", name=" + this.name + ", version=" + this.version + ", url=" + this.url + ", length=" + this.length + ", hash=" + this.hash + ", hashType=" + this.hashType + ", patchCoverVersion=" + this.patchCoverVersion + ", allowMissingManifest=" + this.allowMissingManifest + ')';
    }

    public /* synthetic */ PackageUpdateInfo(String str, String str2, String str3, String str4, Long l11, String str5, HashType hashType, String str6, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? HashType.Sha1 : hashType, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? false : z11);
    }
}
