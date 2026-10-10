package com.tencent.bugly.common.reporter.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/data/FileInfo;", "", "filePath", "", "delWhenSuccess", "", "delWhenFail", "(Ljava/lang/String;ZZ)V", "getDelWhenFail", "()Z", "getDelWhenSuccess", "getFilePath", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class FileInfo {
    private final boolean delWhenFail;
    private final boolean delWhenSuccess;

    @NotNull
    private final String filePath;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfo)) {
            return false;
        }
        FileInfo fileInfo = (FileInfo) other;
        return Intrinsics.areEqual(this.filePath, fileInfo.filePath) && this.delWhenSuccess == fileInfo.delWhenSuccess && this.delWhenFail == fileInfo.delWhenFail;
    }

    public FileInfo(@NotNull String filePath, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.delWhenSuccess = z11;
        this.delWhenFail = z12;
    }

    public static /* synthetic */ FileInfo copy$default(FileInfo fileInfo, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fileInfo.filePath;
        }
        if ((i11 & 2) != 0) {
            z11 = fileInfo.delWhenSuccess;
        }
        if ((i11 & 4) != 0) {
            z12 = fileInfo.delWhenFail;
        }
        return fileInfo.copy(str, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDelWhenSuccess() {
        return this.delWhenSuccess;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDelWhenFail() {
        return this.delWhenFail;
    }

    @NotNull
    public final FileInfo copy(@NotNull String filePath, boolean delWhenSuccess, boolean delWhenFail) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new FileInfo(filePath, delWhenSuccess, delWhenFail);
    }

    public final boolean getDelWhenFail() {
        return this.delWhenFail;
    }

    public final boolean getDelWhenSuccess() {
        return this.delWhenSuccess;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.filePath.hashCode() * 31;
        boolean z11 = this.delWhenSuccess;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.delWhenFail;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "FileInfo(filePath=" + this.filePath + ", delWhenSuccess=" + this.delWhenSuccess + ", delWhenFail=" + this.delWhenFail + ')';
    }
}
