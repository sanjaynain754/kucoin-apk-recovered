package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSourceList mediaSourceList;

    @Nullable
    private MediaPeriodHolder next;
    public boolean prepareCalled;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    public final long targetPreloadBufferDurationUs;
    private TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    private TrackSelectorResult trackSelectorResult;
    public final Object uid;

    public interface Factory {
        MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j11);
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i11 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i11 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i11].getTrackType() == -2 && this.trackSelectorResult.isRendererEnabled(i11)) {
                sampleStreamArr[i11] = new EmptySampleStream();
            }
            i11++;
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i11 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i11 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i11].getTrackType() == -2) {
                sampleStreamArr[i11] = null;
            }
            i11++;
        }
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j11, boolean z11) {
        return applyTrackSelection(trackSelectorResult, j11, z11, new boolean[this.rendererCapabilities.length]);
    }

    public void handlePrepared(float f11, Timeline timeline, boolean z11) throws ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        TrackSelectorResult trackSelectorResultSelectTracks = selectTracks(f11, timeline, z11);
        MediaPeriodInfo mediaPeriodInfo = this.info;
        long jMax = mediaPeriodInfo.startPositionUs;
        long j11 = mediaPeriodInfo.durationUs;
        if (j11 != C2711C.TIME_UNSET && jMax >= j11) {
            jMax = Math.max(0L, j11 - 1);
        }
        long jApplyTrackSelection = applyTrackSelection(trackSelectorResultSelectTracks, jMax, false);
        long j12 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        this.rendererPositionOffsetUs = j12 + (mediaPeriodInfo2.startPositionUs - jApplyTrackSelection);
        this.info = mediaPeriodInfo2.copyWithStartPositionUs(jApplyTrackSelection);
    }

    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.prepareCalled = true;
        this.mediaPeriod.prepare(callback, j11);
    }

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    private static void releaseMediaPeriod(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaSourceList.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (RuntimeException e11) {
            Log.m2958e(TAG, "Period release failed.", e11);
        }
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j11, boolean z11, boolean[] zArr) {
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z11 || !trackSelectorResult.isEquivalent(this.trackSelectorResult, i11)) {
                z12 = false;
            }
            zArr2[i11] = z12;
            i11++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult;
        enableTrackSelectionsInResult();
        long jSelectTracks = this.mediaPeriod.selectTracks(trackSelectorResult.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j11);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i12 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i12 >= sampleStreamArr.length) {
                return jSelectTracks;
            }
            if (sampleStreamArr[i12] != null) {
                Assertions.checkState(trackSelectorResult.isRendererEnabled(i12));
                if (this.rendererCapabilities[i12].getTrackType() != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Assertions.checkState(trackSelectorResult.selections[i12] == null);
            }
            i12++;
        }
    }

    public boolean canBeUsedForMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo) {
        if (!MediaPeriodQueue.areDurationsCompatible(this.info.durationUs, mediaPeriodInfo.durationUs)) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        return mediaPeriodInfo2.startPositionUs == mediaPeriodInfo.startPositionUs && mediaPeriodInfo2.f2934id.equals(mediaPeriodInfo.f2934id);
    }

    public long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    @Nullable
    public MediaPeriodHolder getNext() {
        return this.next;
    }

    public long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public boolean hasLoadingError() {
        try {
            if (this.prepared) {
                for (SampleStream sampleStream : this.sampleStreams) {
                    if (sampleStream != null) {
                        sampleStream.maybeThrowError();
                    }
                }
            } else {
                this.mediaPeriod.maybeThrowPrepareError();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean isFullyBuffered() {
        if (this.prepared) {
            return !this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean isFullyPreloaded() {
        if (this.prepared) {
            return isFullyBuffered() || getBufferedPositionUs() - this.info.startPositionUs >= this.targetPreloadBufferDurationUs;
        }
        return false;
    }

    public TrackSelectorResult selectTracks(float f11, Timeline timeline, boolean z11) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.f2934id, timeline);
        for (int i11 = 0; i11 < trackSelectorResultSelectTracks.length; i11++) {
            boolean z12 = true;
            if (trackSelectorResultSelectTracks.isRendererEnabled(i11)) {
                if (trackSelectorResultSelectTracks.selections[i11] == null && this.rendererCapabilities[i11].getTrackType() != -2) {
                    z12 = false;
                }
                Assertions.checkState(z12);
            } else {
                Assertions.checkState(trackSelectorResultSelectTracks.selections[i11] == null);
            }
        }
        for (ExoTrackSelection exoTrackSelection : trackSelectorResultSelectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f11);
                exoTrackSelection.onPlayWhenReadyChanged(z11);
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public void setNext(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == this.next) {
            return;
        }
        disableTrackSelectionsInResult();
        this.next = mediaPeriodHolder;
        enableTrackSelectionsInResult();
    }

    public void setRendererOffset(long j11) {
        this.rendererPositionOffsetUs = j11;
    }

    public void updateClipping() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j11 = this.info.endPositionUs;
            if (j11 == C2711C.TIME_UNSET) {
                j11 = Long.MIN_VALUE;
            }
            ((ClippingMediaPeriod) mediaPeriod).updateClipping(0L, j11);
        }
    }

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j11, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult, long j12) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j11;
        this.trackSelector = trackSelector;
        this.mediaSourceList = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f2934id;
        this.uid = mediaPeriodId.periodUid;
        this.info = mediaPeriodInfo;
        this.targetPreloadBufferDurationUs = j12;
        this.trackGroups = TrackGroupArray.EMPTY;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        this.mediaPeriod = createMediaPeriod(mediaPeriodId, mediaSourceList, allocator, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.endPositionUs);
    }

    private static MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, MediaSourceList mediaSourceList, Allocator allocator, long j11, long j12) {
        MediaPeriod mediaPeriodCreatePeriod = mediaSourceList.createPeriod(mediaPeriodId, allocator, j11);
        if (j12 != C2711C.TIME_UNSET) {
            return new ClippingMediaPeriod(mediaPeriodCreatePeriod, true, 0L, j12);
        }
        return mediaPeriodCreatePeriod;
    }

    private void disableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            int i11 = 0;
            while (true) {
                TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
                if (i11 < trackSelectorResult.length) {
                    boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
                    ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i11];
                    if (zIsRendererEnabled && exoTrackSelection != null) {
                        exoTrackSelection.disable();
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    private void enableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            int i11 = 0;
            while (true) {
                TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
                if (i11 < trackSelectorResult.length) {
                    boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
                    ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i11];
                    if (zIsRendererEnabled && exoTrackSelection != null) {
                        exoTrackSelection.enable();
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public void continueLoading(LoadingInfo loadingInfo) {
        Assertions.checkState(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(loadingInfo);
    }

    public void reevaluateBuffer(long j11) {
        Assertions.checkState(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j11));
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.mediaSourceList, this.mediaPeriod);
    }

    public long toPeriodTime(long j11) {
        return j11 - getRendererOffset();
    }

    public long toRendererTime(long j11) {
        return j11 + getRendererOffset();
    }
}
