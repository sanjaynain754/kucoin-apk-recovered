package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;

    @Nullable
    private ClippingMediaSource.IllegalClippingException clippingError;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    long startUs;

    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public void clearSentEos() {
            this.sentEos = false;
        }

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.childStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = ClippingMediaPeriod.this.getBufferedPositionUs();
            int data = this.childStream.readData(formatHolder, decoderInputBuffer, i11);
            if (data == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                int i12 = format.encoderDelay;
                if (i12 != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    if (clippingMediaPeriod.startUs != 0) {
                        i12 = 0;
                    }
                    formatHolder.format = format.buildUpon().setEncoderDelay(i12).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            long j11 = ClippingMediaPeriod.this.endUs;
            if (j11 == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < j11) && !(data == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return data;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        long j12;
        boolean z11;
        this.sampleStreams = new ClippingSampleStream[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i11 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i11 >= sampleStreamArr.length) {
                break;
            }
            ClippingSampleStream[] clippingSampleStreamArr = this.sampleStreams;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i11];
            clippingSampleStreamArr[i11] = clippingSampleStream;
            if (clippingSampleStream != null) {
                sampleStream = clippingSampleStream.childStream;
            }
            sampleStreamArr2[i11] = sampleStream;
            i11++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j11);
        if (isPendingInitialDiscontinuity()) {
            long j13 = this.startUs;
            if (j11 == j13 && shouldKeepInitialDiscontinuity(j13, exoTrackSelectionArr)) {
                j12 = jSelectTracks;
            } else {
                j12 = C2711C.TIME_UNSET;
            }
        } else {
            j12 = C2711C.TIME_UNSET;
        }
        this.pendingInitialDiscontinuityPositionUs = j12;
        if (jSelectTracks != j11) {
            if (jSelectTracks >= this.startUs) {
                long j14 = this.endUs;
                z11 = j14 == Long.MIN_VALUE || jSelectTracks <= j14;
            }
        }
        Assertions.checkState(z11);
        for (int i12 = 0; i12 < sampleStreamArr.length; i12++) {
            SampleStream sampleStream2 = sampleStreamArr2[i12];
            if (sampleStream2 == null) {
                this.sampleStreams[i12] = null;
            } else {
                ClippingSampleStream[] clippingSampleStreamArr2 = this.sampleStreams;
                ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i12];
                if (clippingSampleStream2 == null || clippingSampleStream2.childStream != sampleStream2) {
                    clippingSampleStreamArr2[i12] = new ClippingSampleStream(sampleStream2);
                }
            }
            sampleStreamArr[i12] = this.sampleStreams[i12];
        }
        return jSelectTracks;
    }

    private SeekParameters clipSeekParameters(long j11, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j11 - this.startUs);
        long j12 = seekParameters.toleranceAfterUs;
        long j13 = this.endUs;
        long jConstrainValue2 = Util.constrainValue(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j11);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j11, ExoTrackSelection[] exoTrackSelectionArr) {
        if (j11 != 0) {
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        this.mediaPeriod.discardBuffer(j11, z11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        long j12 = this.startUs;
        if (j11 == j12) {
            return j12;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j11, clipSeekParameters(j11, seekParameters));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j11 = this.endUs;
            if (j11 == Long.MIN_VALUE || bufferedPositionUs < j11) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j11 = this.endUs;
            if (j11 == Long.MIN_VALUE || nextLoadPositionUs < j11) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.mediaPeriod.reevaluateBuffer(j11);
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    public void updateClipping(long j11, long j12) {
        this.startUs = j11;
        this.endUs = j12;
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z11, long j11, long j12) {
        long j13;
        this.mediaPeriod = mediaPeriod;
        if (z11) {
            j13 = j11;
        } else {
            j13 = C2711C.TIME_UNSET;
        }
        this.pendingInitialDiscontinuityPositionUs = j13;
        this.startUs = j11;
        this.endUs = j12;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        boolean z11;
        if (isPendingInitialDiscontinuity()) {
            long j11 = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = C2711C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            if (discontinuity != C2711C.TIME_UNSET) {
                return discontinuity;
            }
            return j11;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == C2711C.TIME_UNSET) {
            return C2711C.TIME_UNSET;
        }
        boolean z12 = false;
        if (discontinuity2 >= this.startUs) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        long j12 = this.endUs;
        if (j12 == Long.MIN_VALUE || discontinuity2 <= j12) {
            z12 = true;
        }
        Assertions.checkState(z12);
        return discontinuity2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        this.pendingInitialDiscontinuityPositionUs = C2711C.TIME_UNSET;
        boolean z11 = false;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        long jSeekToUs = this.mediaPeriod.seekToUs(j11);
        if (jSeekToUs != j11) {
            if (jSeekToUs >= this.startUs) {
                long j12 = this.endUs;
                if (j12 == Long.MIN_VALUE || jSeekToUs <= j12) {
                    z11 = true;
                }
            }
        } else {
            z11 = true;
        }
        Assertions.checkState(z11);
        return jSeekToUs;
    }
}
