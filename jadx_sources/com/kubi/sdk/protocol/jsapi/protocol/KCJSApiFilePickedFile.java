package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiFileModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFilePickedFile;", "", "path", "", "name", "mimeType", "fileExtension", "size", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFileExtension", "()Ljava/lang/String;", "getMimeType", "getName", "getPath", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFilePickedFile;", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiFilePickedFile {

    @NotNull
    private final String fileExtension;

    @NotNull
    private final String mimeType;

    @NotNull
    private final String name;

    @NotNull
    private final String path;

    @Nullable
    private final Long size;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiFilePickedFile)) {
            return false;
        }
        KCJSApiFilePickedFile kCJSApiFilePickedFile = (KCJSApiFilePickedFile) other;
        return Intrinsics.areEqual(this.path, kCJSApiFilePickedFile.path) && Intrinsics.areEqual(this.name, kCJSApiFilePickedFile.name) && Intrinsics.areEqual(this.mimeType, kCJSApiFilePickedFile.mimeType) && Intrinsics.areEqual(this.fileExtension, kCJSApiFilePickedFile.fileExtension) && Intrinsics.areEqual(this.size, kCJSApiFilePickedFile.size);
    }

    public KCJSApiFilePickedFile(@NotNull String path, @NotNull String name, @NotNull String mimeType, @NotNull String fileExtension, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        this.path = path;
        this.name = name;
        this.mimeType = mimeType;
        this.fileExtension = fileExtension;
        this.size = l11;
    }

    public static /* synthetic */ KCJSApiFilePickedFile copy$default(KCJSApiFilePickedFile kCJSApiFilePickedFile, String str, String str2, String str3, String str4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiFilePickedFile.path;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiFilePickedFile.name;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiFilePickedFile.mimeType;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiFilePickedFile.fileExtension;
        }
        if ((i11 & 16) != 0) {
            l11 = kCJSApiFilePickedFile.size;
        }
        Long l12 = l11;
        String str5 = str3;
        return kCJSApiFilePickedFile.copy(str, str2, str5, str4, l12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @NotNull
    public final KCJSApiFilePickedFile copy(@NotNull String path, @NotNull String name, @NotNull String mimeType, @NotNull String fileExtension, @Nullable Long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        return new KCJSApiFilePickedFile(path, name, mimeType, fileExtension, size);
    }

    @NotNull
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((((this.path.hashCode() * 31) + this.name.hashCode()) * 31) + this.mimeType.hashCode()) * 31) + this.fileExtension.hashCode()) * 31;
        Long l11 = this.size;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCJSApiFilePickedFile(path=" + this.path + ", name=" + this.name + ", mimeType=" + this.mimeType + ", fileExtension=" + this.fileExtension + ", size=" + this.size + ')';
    }
}
