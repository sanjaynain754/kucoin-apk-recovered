package com.kubi.widget.web.file;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.file.s, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FileBridgeResult.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m90084d2 = {"Lcom/kubi/widget/web/file/LocalPickedFile;", "", "path", "", "name", "mimeType", "extension", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getPath", "()Ljava/lang/String;", "getName", "getMimeType", "getExtension", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/widget/web/file/LocalPickedFile;", "equals", "", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LocalPickedFile {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String mimeType;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String extension;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Long size;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalPickedFile)) {
            return false;
        }
        LocalPickedFile localPickedFile = (LocalPickedFile) other;
        return Intrinsics.areEqual(this.path, localPickedFile.path) && Intrinsics.areEqual(this.name, localPickedFile.name) && Intrinsics.areEqual(this.mimeType, localPickedFile.mimeType) && Intrinsics.areEqual(this.extension, localPickedFile.extension) && Intrinsics.areEqual(this.size, localPickedFile.size);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((((this.path.hashCode() * 31) + this.name.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + this.extension.hashCode()) * 31;
        Long l11 = this.size;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "LocalPickedFile(path=" + this.path + ", name=" + this.name + ", mimeType=" + this.mimeType + ", extension=" + this.extension + ", size=" + this.size + ')';
    }

    public LocalPickedFile(@NotNull String path, @NotNull String name, @NotNull String mimeType, @NotNull String extension, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.path = path;
        this.name = name;
        this.mimeType = mimeType;
        this.extension = extension;
        this.size = l11;
    }
}
