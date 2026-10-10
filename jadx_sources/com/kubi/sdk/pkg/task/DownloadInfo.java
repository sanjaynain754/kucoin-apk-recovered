package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.task.d, reason: from toString */
/* JADX INFO: compiled from: DownloadInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/d;", "", "", "name", "url", "deployPath", "fileName", "", SessionDescription.ATTR_LENGTH, "hash", "Lcom/kubi/sdk/pkg/task/HashType;", "hashType", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/HashType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "f", "b", "g", "c", "d", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lcom/kubi/sdk/pkg/task/HashType;", "()Lcom/kubi/sdk/pkg/task/HashType;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class DownloadInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String deployPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String fileName;

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
    @NotNull
    public final String version;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadInfo)) {
            return false;
        }
        DownloadInfo downloadInfo = (DownloadInfo) other;
        return Intrinsics.areEqual(this.name, downloadInfo.name) && Intrinsics.areEqual(this.url, downloadInfo.url) && Intrinsics.areEqual(this.deployPath, downloadInfo.deployPath) && Intrinsics.areEqual(this.fileName, downloadInfo.fileName) && Intrinsics.areEqual(this.length, downloadInfo.length) && Intrinsics.areEqual(this.hash, downloadInfo.hash) && this.hashType == downloadInfo.hashType && Intrinsics.areEqual(this.version, downloadInfo.version);
    }

    public DownloadInfo(@NotNull String name, @NotNull String url, @NotNull String deployPath, @NotNull String fileName, @Nullable Long l11, @Nullable String str, @NotNull HashType hashType, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(deployPath, "deployPath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(hashType, "hashType");
        Intrinsics.checkNotNullParameter(version, "version");
        this.name = name;
        this.url = url;
        this.deployPath = deployPath;
        this.fileName = fileName;
        this.length = l11;
        this.hash = str;
        this.hashType = hashType;
        this.version = version;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeployPath() {
        return this.deployPath;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final HashType getHashType() {
        return this.hashType;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getLength() {
        return this.length;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + this.url.hashCode()) * 31) + this.deployPath.hashCode()) * 31) + this.fileName.hashCode()) * 31;
        Long l11 = this.length;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.hash;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.hashType.hashCode()) * 31) + this.version.hashCode();
    }

    @NotNull
    public String toString() {
        return "DownloadInfo(name=" + this.name + ", url=" + this.url + ", deployPath=" + this.deployPath + ", fileName=" + this.fileName + ", length=" + this.length + ", hash=" + this.hash + ", hashType=" + this.hashType + ", version=" + this.version + ')';
    }
}
