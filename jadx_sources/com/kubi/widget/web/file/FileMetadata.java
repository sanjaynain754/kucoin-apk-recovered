package com.kubi.widget.web.file;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.widget.web.file.n, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FileTypeResolver.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileMetadata;", "", "fileName", "", "extension", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getExtension", "getMimeType", "isImage", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FileMetadata {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String extension;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String mimeType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileMetadata)) {
            return false;
        }
        FileMetadata fileMetadata = (FileMetadata) other;
        return Intrinsics.areEqual(this.fileName, fileMetadata.fileName) && Intrinsics.areEqual(this.extension, fileMetadata.extension) && Intrinsics.areEqual(this.mimeType, fileMetadata.mimeType);
    }

    public FileMetadata(@NotNull String fileName, @NotNull String extension, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.fileName = fileName;
        this.extension = extension;
        this.mimeType = mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67209d() {
        return StringsKt.startsWith$default(this.mimeType, "image/", false, 2, (Object) null);
    }

    public int hashCode() {
        return (((this.fileName.hashCode() * 31) + this.extension.hashCode()) * 31) + this.mimeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "FileMetadata(fileName=" + this.fileName + ", extension=" + this.extension + ", mimeType=" + this.mimeType + ')';
    }
}
