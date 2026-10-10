package com.kubi.agora;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.agora.k, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: CaptureSpec.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/agora/CaptureSpec;", "", "width", "", "height", "densityDpi", "<init>", "(III)V", "getWidth", "()I", "getHeight", "getDensityDpi", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CaptureSpec {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int width;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int height;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int densityDpi;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureSpec)) {
            return false;
        }
        CaptureSpec captureSpec = (CaptureSpec) other;
        return this.width == captureSpec.width && this.height == captureSpec.height && this.densityDpi == captureSpec.densityDpi;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDensityDpi() {
        return this.densityDpi;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.densityDpi);
    }

    @NotNull
    public String toString() {
        return "CaptureSpec(width=" + this.width + ", height=" + this.height + ", densityDpi=" + this.densityDpi + ')';
    }

    public CaptureSpec(int i11, int i12, int i13) {
        this.width = i11;
        this.height = i12;
        this.densityDpi = i13;
    }
}
