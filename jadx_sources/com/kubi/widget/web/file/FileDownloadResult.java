package com.kubi.widget.web.file;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.file.k, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FileBridgeResult.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileDownloadResult;", "", "file", "Ljava/io/File;", "metadata", "Lcom/kubi/widget/web/file/FileMetadata;", "responseContentType", "", "<init>", "(Ljava/io/File;Lcom/kubi/widget/web/file/FileMetadata;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getMetadata", "()Lcom/kubi/widget/web/file/FileMetadata;", "getResponseContentType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FileDownloadResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final FileMetadata metadata;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String responseContentType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileDownloadResult)) {
            return false;
        }
        FileDownloadResult fileDownloadResult = (FileDownloadResult) other;
        return Intrinsics.areEqual(this.file, fileDownloadResult.file) && Intrinsics.areEqual(this.metadata, fileDownloadResult.metadata) && Intrinsics.areEqual(this.responseContentType, fileDownloadResult.responseContentType);
    }

    public FileDownloadResult(@NotNull File file, @NotNull FileMetadata metadata, @Nullable String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.file = file;
        this.metadata = metadata;
        this.responseContentType = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FileMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getResponseContentType() {
        return this.responseContentType;
    }

    public int hashCode() {
        int iHashCode = ((this.file.hashCode() * 31) + this.metadata.hashCode()) * 31;
        String str = this.responseContentType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FileDownloadResult(file=" + this.file + ", metadata=" + this.metadata + ", responseContentType=" + this.responseContentType + ')';
    }
}
