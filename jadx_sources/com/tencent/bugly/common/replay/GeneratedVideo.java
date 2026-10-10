package com.tencent.bugly.common.replay;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/GeneratedVideo;", "", "video", "Ljava/io/File;", "frameCount", "", TypedValues.TransitionType.S_DURATION, "", "(Ljava/io/File;IJ)V", "getDuration", "()J", "getFrameCount", "()I", "getVideo", "()Ljava/io/File;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class GeneratedVideo {
    private final long duration;
    private final int frameCount;

    @NotNull
    private final File video;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratedVideo)) {
            return false;
        }
        GeneratedVideo generatedVideo = (GeneratedVideo) other;
        return Intrinsics.areEqual(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public static /* synthetic */ GeneratedVideo copy$default(GeneratedVideo generatedVideo, File file, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            file = generatedVideo.video;
        }
        if ((i12 & 2) != 0) {
            i11 = generatedVideo.frameCount;
        }
        if ((i12 & 4) != 0) {
            j11 = generatedVideo.duration;
        }
        return generatedVideo.copy(file, i11, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFrameCount() {
        return this.frameCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    @NotNull
    public final File getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + ((Integer.hashCode(this.frameCount) + (this.video.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "GeneratedVideo(video=" + this.video + ", frameCount=" + this.frameCount + ", duration=" + this.duration + ')';
    }

    public GeneratedVideo(@NotNull File video, int i11, long j11) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.video = video;
        this.frameCount = i11;
        this.duration = j11;
    }

    @NotNull
    public final GeneratedVideo copy(@NotNull File video, int frameCount, long duration) {
        Intrinsics.checkNotNullParameter(video, "video");
        return new GeneratedVideo(video, frameCount, duration);
    }
}
