package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface VideoSink {
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        public static final Listener NO_OP = new Listener() { // from class: androidx.media3.exoplayer.video.VideoSink.Listener.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(VideoSink videoSink, VideoSinkException videoSinkException) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(VideoSink videoSink, VideoSize videoSize) {
            }
        };

        void onError(VideoSink videoSink, VideoSinkException videoSinkException);

        void onFirstFrameRendered(VideoSink videoSink);

        void onFrameDropped(VideoSink videoSink);

        void onVideoSizeChanged(VideoSink videoSink, VideoSize videoSize);
    }

    public interface VideoFrameHandler {
        void render(long j11);

        void skip();
    }

    void clearOutputSurfaceInfo();

    void enableMayRenderStartOfStream();

    void flush(boolean z11);

    Surface getInputSurface();

    boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator);

    boolean handleInputFrame(long j11, boolean z11, long j12, long j13, VideoFrameHandler videoFrameHandler) throws VideoSinkException;

    void initialize(Format format) throws VideoSinkException;

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z11);

    void join(boolean z11);

    void onInputStreamChanged(int i11, Format format);

    void onRendererDisabled();

    void onRendererEnabled(boolean z11);

    void onRendererStarted();

    void onRendererStopped();

    void release();

    void render(long j11, long j12) throws VideoSinkException;

    void setChangeFrameRateStrategy(int i11);

    void setListener(Listener listener, Executor executor);

    void setOutputSurfaceInfo(Surface surface, Size size);

    void setPendingVideoEffects(List<Effect> list);

    void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f11);

    void setStreamTimestampInfo(long j11, long j12, long j13, long j14);

    void setVideoEffects(List<Effect> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    public static final class VideoSinkException extends Exception {
        public final Format format;

        public VideoSinkException(Throwable th2, Format format) {
            super(th2);
            this.format = format;
        }
    }
}
