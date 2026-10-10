package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.task.c, reason: from toString */
/* JADX INFO: compiled from: DeployInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/c;", "", "", "name", "deployPath", "version", "zipPath", "", "isInAsset", "patchCoverVersion", "archiveHashVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "b", "e", "d", "f", "Z", "g", "()Z", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class DeployInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String deployPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String zipPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean isInAsset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String patchCoverVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final boolean archiveHashVerified;

    public DeployInfo(@NotNull String name, @NotNull String deployPath, @NotNull String version, @NotNull String zipPath, boolean z11, @Nullable String str, boolean z12) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deployPath, "deployPath");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        this.name = name;
        this.deployPath = deployPath;
        this.version = version;
        this.zipPath = zipPath;
        this.isInAsset = z11;
        this.patchCoverVersion = str;
        this.archiveHashVerified = z12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeployInfo)) {
            return false;
        }
        DeployInfo deployInfo = (DeployInfo) other;
        return Intrinsics.areEqual(this.name, deployInfo.name) && Intrinsics.areEqual(this.deployPath, deployInfo.deployPath) && Intrinsics.areEqual(this.version, deployInfo.version) && Intrinsics.areEqual(this.zipPath, deployInfo.zipPath) && this.isInAsset == deployInfo.isInAsset && Intrinsics.areEqual(this.patchCoverVersion, deployInfo.patchCoverVersion) && this.archiveHashVerified == deployInfo.archiveHashVerified;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getArchiveHashVerified() {
        return this.archiveHashVerified;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeployPath() {
        return this.deployPath;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPatchCoverVersion() {
        return this.patchCoverVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getZipPath() {
        return this.zipPath;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsInAsset() {
        return this.isInAsset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + this.deployPath.hashCode()) * 31) + this.version.hashCode()) * 31) + this.zipPath.hashCode()) * 31;
        boolean z11 = this.isInAsset;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        String str = this.patchCoverVersion;
        int iHashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z12 = this.archiveHashVerified;
        return iHashCode2 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "DeployInfo(name=" + this.name + ", deployPath=" + this.deployPath + ", version=" + this.version + ", zipPath=" + this.zipPath + ", isInAsset=" + this.isInAsset + ", patchCoverVersion=" + this.patchCoverVersion + ", archiveHashVerified=" + this.archiveHashVerified + ')';
    }

    public /* synthetic */ DeployInfo(String str, String str2, String str3, String str4, boolean z11, String str5, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? false : z12);
    }
}
