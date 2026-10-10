package androidx.media3.common;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface VideoGraph {
    VideoFrameProcessor getProcessor(int i11);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws VideoFrameProcessingException;

    void registerInput(@IntRange(from = 0) int i11) throws VideoFrameProcessingException;

    void release();

    void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);

    @UnstableApi
    public interface Listener {
        default void onEnded(long j11) {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j11) {
        }

        default void onOutputSizeChanged(int i11, int i12) {
        }
    }
}
