package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
final class DefaultVideoSink implements VideoSink {
    private Format inputFormat = new Format.Builder().build();
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameRenderControl videoFrameRenderControl;

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void clearOutputSurfaceInfo() {
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void enableMayRenderStartOfStream() {
        this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void flush(boolean z11) {
        if (z11) {
            this.videoFrameReleaseControl.reset();
        }
        this.videoFrameRenderControl.flush();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface getInputSurface() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputFrame(long j11, boolean z11, long j12, long j13, VideoSink.VideoFrameHandler videoFrameHandler) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isEnded() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isReady(boolean z11) {
        return this.videoFrameReleaseControl.isReady(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void join(boolean z11) {
        this.videoFrameReleaseControl.join(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onInputStreamChanged(int i11, Format format) {
        int i12 = format.width;
        Format format2 = this.inputFormat;
        if (i12 != format2.width || format.height != format2.height) {
            this.videoFrameRenderControl.onOutputSizeChanged(i12, format.height);
        }
        this.inputFormat = format;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererDisabled() {
        this.videoFrameReleaseControl.onDisabled();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererEnabled(boolean z11) {
        this.videoFrameReleaseControl.onEnabled(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererStarted() {
        this.videoFrameReleaseControl.onStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererStopped() {
        this.videoFrameReleaseControl.onStopped();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void render(long j11, long j12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setChangeFrameRateStrategy(int i11) {
        this.videoFrameReleaseControl.setChangeFrameRateStrategy(i11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setListener(VideoSink.Listener listener, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPendingVideoEffects(List<Effect> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPlaybackSpeed(float f11) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setStreamTimestampInfo(long j11, long j12, long j13, long j14) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoEffects(List<Effect> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        throw new UnsupportedOperationException();
    }

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameRenderControl videoFrameRenderControl) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameRenderControl = videoFrameRenderControl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void initialize(Format format) {
    }
}
