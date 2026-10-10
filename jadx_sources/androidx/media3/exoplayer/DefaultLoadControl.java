package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private final HashMap<PlayerId, PlayerLoadingState> loadingStates;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;

    public static final class Builder {

        @Nullable
        private DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }

        @CanIgnoreReturnValue
        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBackBuffer(int i11, boolean z11) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i11, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i11;
            this.retainBackBufferFromKeyframe = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBufferDurationsMs(int i11, int i12, int i13, int i14) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i13, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i11, i13, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i12, i11, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i11;
            this.maxBufferMs = i12;
            this.bufferForPlaybackMs = i13;
            this.bufferForPlaybackAfterRebufferMs = i14;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrioritizeTimeOverSizeThresholds(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetBufferBytes(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i11;
            return this;
        }
    }

    public static class PlayerLoadingState {
        public boolean isLoading;
        public int targetBufferBytes;

        private PlayerLoadingState() {
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    public int calculateTargetBufferBytes(ExoTrackSelection[] exoTrackSelectionArr) {
        int defaultBufferSize = 0;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                defaultBufferSize += getDefaultBufferSize(exoTrackSelection.getTrackGroup().type);
            }
        }
        return Math.max(13107200, defaultBufferSize);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i11, int i12, int i13, int i14, int i15, boolean z11, int i16, boolean z12) {
        assertGreaterOrEqual(i13, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i11, i13, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i12, i11, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i16, 0, "backBufferDurationMs", "0");
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i11);
        this.maxBufferUs = Util.msToUs(i12);
        this.bufferForPlaybackUs = Util.msToUs(i13);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i14);
        this.targetBufferBytesOverwrite = i15;
        this.prioritizeTimeOverSizeThresholds = z11;
        this.backBufferDurationUs = Util.msToUs(i16);
        this.retainBackBufferFromKeyframe = z12;
        this.loadingStates = new HashMap<>();
        this.threadId = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i11, int i12, String str, String str2) {
        Assertions.checkArgument(i11 >= i12, str + " cannot be less than " + str2);
    }

    private static int getDefaultBufferSize(int i11) {
        switch (i11) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void removePlayer(PlayerId playerId) {
        if (this.loadingStates.remove(playerId) != null) {
            updateAllocator();
        }
    }

    private void resetPlayerLoadingState(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(playerId));
        int i11 = this.targetBufferBytesOverwrite;
        if (i11 == -1) {
            i11 = 13107200;
        }
        playerLoadingState.targetBufferBytes = i11;
        playerLoadingState.isLoading = false;
    }

    private void updateAllocator() {
        if (this.loadingStates.isEmpty()) {
            this.allocator.reset();
        } else {
            this.allocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    @VisibleForTesting
    public int calculateTotalTargetBufferBytes() {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().targetBufferBytes;
        }
        return i11;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs(PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(LoadControl.Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(parameters.playerId));
        int iCalculateTargetBufferBytes = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = iCalculateTargetBufferBytes;
        updateAllocator();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(parameters.playerId));
        boolean z11 = true;
        boolean z12 = this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes();
        long jMin = this.minBufferUs;
        float f11 = parameters.playbackSpeed;
        if (f11 > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, f11), this.maxBufferUs);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = parameters.bufferedDurationUs;
        if (j11 < jMax) {
            if (!this.prioritizeTimeOverSizeThresholds && z12) {
                z11 = false;
            }
            playerLoadingState.isLoading = z11;
            if (!z11 && j11 < 500000) {
                Log.m2961w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.maxBufferUs || z12) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinuePreloading(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11) {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        while (it.hasNext()) {
            if (it.next().isLoading) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long jMin = parameters.rebuffering ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        long j11 = parameters.targetLiveOffsetUs;
        if (j11 != C2711C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || playoutDurationForMediaDuration >= jMin) {
            return true;
        }
        return !this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared(PlayerId playerId) {
        boolean z11;
        long id2 = Thread.currentThread().getId();
        long j11 = this.threadId;
        if (j11 != -1 && j11 != id2) {
            z11 = false;
        } else {
            z11 = true;
        }
        Assertions.checkState(z11, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id2;
        if (!this.loadingStates.containsKey(playerId)) {
            this.loadingStates.put(playerId, new PlayerLoadingState());
        }
        resetPlayerLoadingState(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased(PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped(PlayerId playerId) {
        removePlayer(playerId);
    }

    @InlineMe(replacement = "this.calculateTargetBufferBytes(trackSelectionArray)")
    @Deprecated
    public final int calculateTargetBufferBytes(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        return calculateTargetBufferBytes(exoTrackSelectionArr);
    }
}
