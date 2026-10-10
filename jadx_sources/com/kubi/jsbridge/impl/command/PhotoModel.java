package com.kubi.jsbridge.impl.command;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.command.b, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PhotoModel.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/command/PhotoModel;", "", "uri", "", "width", "", "height", "size", "", "type", TypedValues.TransitionType.S_DURATION, "", "<init>", "(Ljava/lang/String;IIDLjava/lang/String;J)V", "getUri", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getSize", "()D", "getType", "getDuration", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PhotoModel {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String uri;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int width;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int height;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final double size;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final long duration;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoModel)) {
            return false;
        }
        PhotoModel photoModel = (PhotoModel) other;
        return Intrinsics.areEqual(this.uri, photoModel.uri) && this.width == photoModel.width && this.height == photoModel.height && Double.compare(this.size, photoModel.size) == 0 && Intrinsics.areEqual(this.type, photoModel.type) && this.duration == photoModel.duration;
    }

    public PhotoModel(@NotNull String uri, int i11, int i12, double d11, @NotNull String type, long j11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uri = uri;
        this.width = i11;
        this.height = i12;
        this.size = d11;
        this.type = type;
        this.duration = j11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((this.uri.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Double.hashCode(this.size)) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.duration);
    }

    @NotNull
    public String toString() {
        return "PhotoModel(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", type=" + this.type + ", duration=" + this.duration + ')';
    }
}
