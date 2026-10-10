package androidx.media3.exoplayer.video;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes34.dex */
final class VideoFrameRenderControl {
    private final FrameRenderer frameRenderer;
    private long outputStreamOffsetUs;

    @Nullable
    private VideoSize pendingOutputVideoSize;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final TimedValueQueue<VideoSize> videoSizeChanges = new TimedValueQueue<>();
    private final TimedValueQueue<Long> streamOffsets = new TimedValueQueue<>();
    private final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    private VideoSize reportedVideoSize = VideoSize.UNKNOWN;
    private long lastPresentationTimeUs = C2711C.TIME_UNSET;

    public interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j11, long j12, long j13, boolean z11);
    }

    private void dropFrame() {
        Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()));
        this.frameRenderer.dropFrame();
    }

    private boolean maybeUpdateOutputStreamOffset(long j11) {
        Long lPollFloor = this.streamOffsets.pollFloor(j11);
        if (lPollFloor == null || lPollFloor.longValue() == this.outputStreamOffsetUs) {
            return false;
        }
        this.outputStreamOffsetUs = lPollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateVideoSize(long j11) {
        VideoSize videoSizePollFloor = this.videoSizeChanges.pollFloor(j11);
        if (videoSizePollFloor == null || videoSizePollFloor.equals(VideoSize.UNKNOWN) || videoSizePollFloor.equals(this.reportedVideoSize)) {
            return false;
        }
        this.reportedVideoSize = videoSizePollFloor;
        return true;
    }

    private void renderFrame(boolean z11) {
        long jLongValue = ((Long) Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()))).longValue();
        if (maybeUpdateVideoSize(jLongValue)) {
            this.frameRenderer.onVideoSizeChanged(this.reportedVideoSize);
        }
        this.frameRenderer.renderFrame(z11 ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), jLongValue, this.outputStreamOffsetUs, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.lastPresentationTimeUs = C2711C.TIME_UNSET;
        if (this.streamOffsets.size() > 0) {
            Long l11 = (Long) getLastAndClear(this.streamOffsets);
            l11.longValue();
            this.streamOffsets.add(0L, l11);
        }
        if (this.pendingOutputVideoSize != null) {
            this.videoSizeChanges.clear();
        } else if (this.videoSizeChanges.size() > 0) {
            this.pendingOutputVideoSize = (VideoSize) getLastAndClear(this.videoSizeChanges);
        }
    }

    public boolean hasReleasedFrame(long j11) {
        long j12 = this.lastPresentationTimeUs;
        return j12 != C2711C.TIME_UNSET && j12 >= j11;
    }

    public void onOutputFrameAvailableForRendering(long j11) {
        VideoSize videoSize = this.pendingOutputVideoSize;
        if (videoSize != null) {
            this.videoSizeChanges.add(j11, videoSize);
            this.pendingOutputVideoSize = null;
        }
        this.presentationTimestampsUs.add(j11);
    }

    public void onOutputSizeChanged(int i11, int i12) {
        this.pendingOutputVideoSize = new VideoSize(i11, i12);
    }

    public void onStreamOffsetChange(long j11, long j12) {
        this.streamOffsets.add(j11, Long.valueOf(j12));
    }

    public void render(long j11, long j12) throws ExoPlaybackException {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long jElement = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStreamOffset(jElement)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(jElement, j11, j12, this.outputStreamOffsetUs, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.lastPresentationTimeUs = jElement;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction != 2 && frameReleaseAction != 3 && frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new IllegalStateException(String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                this.lastPresentationTimeUs = jElement;
                dropFrame();
            }
        }
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
    }

    private static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        boolean z11;
        if (timedValueQueue.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        return (T) Assertions.checkNotNull(timedValueQueue.pollFirst());
    }
}
