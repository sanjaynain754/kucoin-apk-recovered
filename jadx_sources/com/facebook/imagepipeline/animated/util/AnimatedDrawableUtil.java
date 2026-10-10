package com.facebook.imagepipeline.animated.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedDrawableUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil;", "", "<init>", "()V", "", "frameDurationMs", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([I)V", "", "c", "([I)I", "frameDurationsMs", "b", "([I)[I", "Companion", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class AnimatedDrawableUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AnimatedDrawableUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/facebook/imagepipeline/animated/util/AnimatedDrawableUtil$Companion;", "", "<init>", "()V", "MIN_FRAME_DURATION_MS", "", "FRAME_DURATION_MS_FOR_MIN", "isOutsideRange", "", "startFrame", "endFrame", "frameNumber", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isOutsideRange(int startFrame, int endFrame, int frameNumber) {
            if (startFrame == -1 || endFrame == -1) {
                return true;
            }
            if (startFrame <= endFrame) {
                return frameNumber < startFrame || frameNumber > endFrame;
            }
            return frameNumber < startFrame && frameNumber > endFrame;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9111a(@NotNull int[] frameDurationMs) {
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int length = frameDurationMs.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (frameDurationMs[i11] < 11) {
                frameDurationMs[i11] = 100;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final int[] m9112b(@NotNull int[] frameDurationsMs) {
        Intrinsics.checkNotNullParameter(frameDurationsMs, "frameDurationsMs");
        int[] iArr = new int[frameDurationsMs.length];
        int length = frameDurationsMs.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = i11;
            i11 += frameDurationsMs[i12];
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final int m9113c(@NotNull int[] frameDurationMs) {
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int i11 = 0;
        for (int i12 : frameDurationMs) {
            i11 += i12;
        }
        return i11;
    }
}
