package com.kubi.mine.lib.view;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mine.lib.view.b, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: UploadAvatarImageView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/mine/lib/view/ImageInfo;", "", "size", "", "width", "", "height", "mimeType", "", "<init>", "(JIILjava/lang/String;)V", "getSize", "()J", "getWidth", "()I", "getHeight", "getMimeType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImageInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final long size;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int width;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int height;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String mimeType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) other;
        return this.size == imageInfo.size && this.width == imageInfo.width && this.height == imageInfo.height && Intrinsics.areEqual(this.mimeType, imageInfo.mimeType);
    }

    public ImageInfo(long j11, int i11, int i12, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.size = j11;
        this.width = i11;
        this.height = i12;
        this.mimeType = mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.size) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.mimeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageInfo(size=" + this.size + ", width=" + this.width + ", height=" + this.height + ", mimeType=" + this.mimeType + ')';
    }
}
