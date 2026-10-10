package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;

    @Nullable
    private final DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final FixedFrameRateEstimator frameRateEstimator = new FixedFrameRateEstimator();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;

    @Nullable
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;

    @Nullable
    private final VSyncSampler vsyncSampler;

    public final class DisplayHelper implements DisplayManager.DisplayListener {
        private final DisplayManager displayManager;

        public DisplayHelper(DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        private Display getDefaultDisplay() {
            return this.displayManager.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            if (i11 == 0) {
                VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
            }
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
            VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }

    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 1;
        private static final VSyncSampler INSTANCE = new VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 2;
        private static final int MSG_REMOVE_OBSERVER = 3;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = C2711C.TIME_UNSET;

        private void addObserverInternal() {
            Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i11 = this.observerCount + 1;
                this.observerCount = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public static VSyncSampler getInstance() {
            return INSTANCE;
        }

        private void removeObserverInternal() {
            Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i11 = this.observerCount - 1;
                this.observerCount = i11;
                if (i11 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.sampledVsyncTimeNs = C2711C.TIME_UNSET;
                }
            }
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            this.sampledVsyncTimeNs = j11;
            ((Choreographer) Assertions.checkNotNull(this.choreographer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i11 == 2) {
                addObserverInternal();
                return true;
            }
            if (i11 != 3) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(3);
        }

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.handler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.choreographer = Choreographer.getInstance();
            } catch (RuntimeException e11) {
                Log.m2962w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e11);
            }
        }
    }

    private static boolean adjustmentAllowed(long j11, long j12) {
        return Math.abs(j11 - j12) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    @Nullable
    private DisplayHelper maybeBuildDisplayHelper(@Nullable Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new DisplayHelper(displayManager);
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (this.displayHelper != null) {
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).addObserver();
            this.displayHelper.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        DisplayHelper displayHelper = this.displayHelper;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((VSyncSampler) Assertions.checkNotNull(this.vsyncSampler)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    @RequiresApi(30)
    public static final class Api30 {
        public static void setSurfaceFrameRate(Surface surface, float f11) {
            try {
                surface.setFrameRate(f11, f11 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e11) {
                Log.m2958e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e11);
            }
        }

        private Api30() {
        }
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        Api30.setSurfaceFrameRate(surface, 0.0f);
    }

    private static long closestVsync(long j11, long j12, long j13) {
        long j14;
        long j15 = j12 + (((j11 - j12) / j13) * j13);
        if (j11 <= j15) {
            j14 = j15 - j13;
        } else {
            long j16 = j13 + j15;
            j14 = j15;
            j15 = j16;
        }
        return j15 - j11 < j11 - j14 ? j15 : j14;
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * 80) / 100;
        } else {
            Log.m2961w(TAG, "Unable to query display refresh rate");
            this.vsyncDurationNs = C2711C.TIME_UNSET;
            this.vsyncOffsetNs = C2711C.TIME_UNSET;
        }
    }

    private void updateSurfaceMediaFrameRate() {
        if (Util.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f11 = this.surfaceMediaFrameRate;
        if (frameRate == f11) {
            return;
        }
        if (frameRate != -1.0f && f11 != -1.0f) {
            if (Math.abs(frameRate - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.isSynced() || this.frameRateEstimator.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE)) {
                return;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void updateSurfacePlaybackFrameRate(boolean z11) {
        Surface surface;
        float f11;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE) {
            return;
        }
        if (this.started) {
            float f12 = this.surfaceMediaFrameRate;
            if (f12 != -1.0f) {
                f11 = f12 * this.playbackSpeed;
            } else {
                f11 = 0.0f;
            }
        } else {
            f11 = 0.0f;
        }
        if (z11 || this.surfacePlaybackFrameRate != f11) {
            this.surfacePlaybackFrameRate = f11;
            Api30.setSurfaceFrameRate(surface, f11);
        }
    }

    public long adjustReleaseTime(long j11) {
        long j12;
        if (this.lastAdjustedFrameIndex == -1 || !this.frameRateEstimator.isSynced()) {
            j12 = j11;
        } else {
            long frameDurationNs = this.lastAdjustedReleaseTimeNs + ((long) ((this.frameRateEstimator.getFrameDurationNs() * (this.frameIndex - this.lastAdjustedFrameIndex)) / this.playbackSpeed));
            if (adjustmentAllowed(j11, frameDurationNs)) {
                j12 = frameDurationNs;
            } else {
                resetAdjustment();
                j12 = j11;
            }
        }
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j12;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null && this.vsyncDurationNs != C2711C.TIME_UNSET) {
            long j13 = vSyncSampler.sampledVsyncTimeNs;
            if (j13 != C2711C.TIME_UNSET) {
                return closestVsync(j12, j13, this.vsyncDurationNs) - this.vsyncOffsetNs;
            }
        }
        return j12;
    }

    public void onFormatChanged(float f11) {
        this.formatFrameRate = f11;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j11) {
        long j12 = this.pendingLastAdjustedFrameIndex;
        if (j12 != -1) {
            this.lastAdjustedFrameIndex = j12;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j11 * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f11) {
        this.playbackSpeed = f11;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i11) {
        if (this.changeFrameRateStrategy == i11) {
            return;
        }
        this.changeFrameRateStrategy = i11;
        updateSurfacePlaybackFrameRate(true);
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        VSyncSampler vSyncSampler;
        DisplayHelper displayHelperMaybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.displayHelper = displayHelperMaybeBuildDisplayHelper;
        if (displayHelperMaybeBuildDisplayHelper != null) {
            vSyncSampler = VSyncSampler.getInstance();
        } else {
            vSyncSampler = null;
        }
        this.vsyncSampler = vSyncSampler;
        this.vsyncDurationNs = C2711C.TIME_UNSET;
        this.vsyncOffsetNs = C2711C.TIME_UNSET;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    public void onPositionReset() {
        resetAdjustment();
    }
}
