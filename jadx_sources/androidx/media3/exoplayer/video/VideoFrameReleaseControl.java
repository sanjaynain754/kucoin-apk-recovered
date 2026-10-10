package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = C2711C.TIME_UNSET;
    private long lastPresentationTimeUs = C2711C.TIME_UNSET;
    private long joiningDeadlineMs = C2711C.TIME_UNSET;
    private float playbackSpeed = 1.0f;
    private Clock clock = Clock.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface FrameReleaseAction {
    }

    public static class FrameReleaseInfo {
        private long earlyUs = C2711C.TIME_UNSET;
        private long releaseTimeNs = C2711C.TIME_UNSET;

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = C2711C.TIME_UNSET;
            this.releaseTimeNs = C2711C.TIME_UNSET;
        }
    }

    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j11, long j12, boolean z11);

        boolean shouldForceReleaseFrame(long j11, long j12);

        boolean shouldIgnoreFrame(long j11, long j12, long j13, boolean z11, boolean z12) throws ExoPlaybackException;
    }

    private long calculateEarlyTimeUs(long j11, long j12, long j13) {
        long j14 = (long) ((j13 - j11) / ((double) this.playbackSpeed));
        return this.started ? j14 - (Util.msToUs(this.clock.elapsedRealtime()) - j12) : j14;
    }

    public boolean isReady(boolean z11) {
        if (z11 && this.firstFrameState == 3) {
            this.joiningDeadlineMs = C2711C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C2711C.TIME_UNSET) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C2711C.TIME_UNSET;
        return false;
    }

    public void onDisabled() {
        lowerFirstFrameState(0);
    }

    public void onProcessedStreamChange() {
        lowerFirstFrameState(2);
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = C2711C.TIME_UNSET;
        this.frameReleaseHelper.onStopped();
    }

    public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        Assertions.checkArgument(f11 > 0.0f);
        if (f11 == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f11;
        this.frameReleaseHelper.onPlaybackSpeed(f11);
    }

    private void lowerFirstFrameState(int i11) {
        this.firstFrameState = Math.min(this.firstFrameState, i11);
    }

    private boolean shouldForceRelease(long j11, long j12, long j13) {
        if (this.joiningDeadlineMs != C2711C.TIME_UNSET && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i11 = this.firstFrameState;
        if (i11 == 0) {
            return this.started;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return j11 >= j13;
        }
        if (i11 == 3) {
            return this.started && this.frameTimingEvaluator.shouldForceReleaseFrame(j12, Util.msToUs(this.clock.elapsedRealtime()) - this.lastReleaseRealtimeUs);
        }
        throw new IllegalStateException();
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public int getFrameReleaseAction(long j11, long j12, long j13, long j14, boolean z11, FrameReleaseInfo frameReleaseInfo) throws ExoPlaybackException {
        frameReleaseInfo.reset();
        if (this.initialPositionUs == C2711C.TIME_UNSET) {
            this.initialPositionUs = j12;
        }
        if (this.lastPresentationTimeUs != j11) {
            this.frameReleaseHelper.onNextFrame(j11);
            this.lastPresentationTimeUs = j11;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j12, j13, j11);
        if (shouldForceRelease(j12, frameReleaseInfo.earlyUs, j14)) {
            return 0;
        }
        if (!this.started || j12 == this.initialPositionUs) {
            return 5;
        }
        long jNanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + jNanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - jNanoTime) / 1000;
        boolean z12 = (this.joiningDeadlineMs == C2711C.TIME_UNSET || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j12, j13, z11, z12)) {
            return 4;
        }
        if (this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j13, z11)) {
            return z12 ? 3 : 2;
        }
        return frameReleaseInfo.earlyUs > MAX_EARLY_US_THRESHOLD ? 5 : 1;
    }

    public void join(boolean z11) {
        this.joiningRenderNextFrameImmediately = z11;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : C2711C.TIME_UNSET;
    }

    public void onEnabled(boolean z11) {
        this.firstFrameState = z11 ? 1 : 0;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z11 = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return z11;
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = C2711C.TIME_UNSET;
        this.initialPositionUs = C2711C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = C2711C.TIME_UNSET;
    }

    public void setChangeFrameRateStrategy(int i11) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i11);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setFrameRate(float f11) {
        this.frameReleaseHelper.onFormatChanged(f11);
    }

    public void setOutputSurface(@Nullable Surface surface) {
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j11) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j11;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }
}
