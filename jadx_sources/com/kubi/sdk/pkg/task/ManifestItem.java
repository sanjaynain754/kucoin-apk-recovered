package com.kubi.sdk.pkg.task;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ManifestItem.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/ManifestItem;", "", "path", "", SessionDescription.ATTR_LENGTH, "", "sha1", "(Ljava/lang/String;JLjava/lang/String;)V", "getLength", "()J", "getPath", "()Ljava/lang/String;", "getSha1", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class ManifestItem {
    private final long length;

    @NotNull
    private final String path;

    @NotNull
    private final String sha1;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManifestItem)) {
            return false;
        }
        ManifestItem manifestItem = (ManifestItem) other;
        return Intrinsics.areEqual(this.path, manifestItem.path) && this.length == manifestItem.length && Intrinsics.areEqual(this.sha1, manifestItem.sha1);
    }

    public ManifestItem(@NotNull String path, long j11, @NotNull String sha1) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        this.path = path;
        this.length = j11;
        this.sha1 = sha1;
    }

    public static /* synthetic */ ManifestItem copy$default(ManifestItem manifestItem, String str, long j11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = manifestItem.path;
        }
        if ((i11 & 2) != 0) {
            j11 = manifestItem.length;
        }
        if ((i11 & 4) != 0) {
            str2 = manifestItem.sha1;
        }
        return manifestItem.copy(str, j11, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    @NotNull
    public final ManifestItem copy(@NotNull String path, long length, @NotNull String sha1) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        return new ManifestItem(path, length, sha1);
    }

    public final long getLength() {
        return this.length;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getSha1() {
        return this.sha1;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + Long.hashCode(this.length)) * 31) + this.sha1.hashCode();
    }

    @NotNull
    public String toString() {
        return "ManifestItem(path=" + this.path + ", length=" + this.length + ", sha1=" + this.sha1 + ')';
    }
}
