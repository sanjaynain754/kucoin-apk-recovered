package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {
    private static final String TAG = "ChunkSampleStream";
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> callback;
    private boolean canReportInitialDiscontinuity;

    @Nullable
    private BaseMediaChunk canceledMediaChunk;
    private final BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final SampleQueue[] embeddedSampleQueues;
    private final Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private boolean hasInitialDiscontinuity;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;

    @Nullable
    private Chunk loadingChunk;
    boolean loadingFinished;
    private final ArrayList<BaseMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private Format primaryDownstreamTrackFormat;
    private final SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final List<BaseMediaChunk> readOnlyMediaChunks;

    @Nullable
    private ReleaseCallback<T> releaseCallback;

    public final class EmbeddedSampleStream implements SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final ChunkSampleStream<T> parent;
        private final SampleQueue sampleQueue;

        public EmbeddedSampleStream(ChunkSampleStream<T> chunkSampleStream, SampleQueue sampleQueue, int i11) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i11;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            ChunkSampleStream.this.mediaSourceEventDispatcher.downstreamFormatChanged(ChunkSampleStream.this.embeddedTrackTypes[this.index], ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, ChunkSampleStream.this.lastSeekPositionUs);
            this.notifiedDownstreamFormat = true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ChunkSampleStream.this.isPendingReset() && this.sampleQueue.isReady(ChunkSampleStream.this.loadingFinished);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            if (ChunkSampleStream.this.canceledMediaChunk != null && ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) <= this.sampleQueue.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i11, ChunkSampleStream.this.loadingFinished);
        }

        public void release() {
            Assertions.checkState(ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) throws Throwable {
            if (ChunkSampleStream.this.isPendingReset()) {
                return 0;
            }
            int skipCount = this.sampleQueue.getSkipCount(j11, ChunkSampleStream.this.loadingFinished);
            if (ChunkSampleStream.this.canceledMediaChunk != null) {
                skipCount = Math.min(skipCount, ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) - this.sampleQueue.getReadIndex());
            }
            this.sampleQueue.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }
    }

    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    private void discardDownstreamMediaChunks(int i11) {
        int iMin = Math.min(primarySampleIndexToMediaChunkIndex(i11, 0), this.nextNotifyPrimaryFormatMediaChunkIndex);
        if (iMin > 0) {
            Util.removeRange(this.mediaChunks, 0, iMin);
            this.nextNotifyPrimaryFormatMediaChunkIndex -= iMin;
        }
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int iPrimarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), this.nextNotifyPrimaryFormatMediaChunkIndex - 1);
        while (true) {
            int i11 = this.nextNotifyPrimaryFormatMediaChunkIndex;
            if (i11 > iPrimarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.nextNotifyPrimaryFormatMediaChunkIndex = i11 + 1;
            maybeNotifyPrimaryTrackFormatChanged(i11);
        }
    }

    public boolean consumeInitialDiscontinuity() {
        try {
            return this.hasInitialDiscontinuity;
        } finally {
            this.hasInitialDiscontinuity = false;
        }
    }

    public void release() {
        release(null);
    }

    public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j11, int i11) throws Throwable {
        for (int i12 = 0; i12 < this.embeddedSampleQueues.length; i12++) {
            if (this.embeddedTrackTypes[i12] == i11) {
                Assertions.checkState(!this.embeddedTracksSelected[i12]);
                this.embeddedTracksSelected[i12] = true;
                this.embeddedSampleQueues[i12].seekTo(j11, true);
                return new EmbeddedSampleStream(this, this.embeddedSampleQueues[i12], i12);
            }
        }
        throw new IllegalStateException();
    }

    private void discardUpstream(int i11) {
        Assertions.checkState(!this.loader.isLoading());
        int size = this.mediaChunks.size();
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (!haveReadFromMediaChunk(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = getLastMediaChunk().endTimeUs;
        BaseMediaChunk baseMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i11);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, baseMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j11);
    }

    private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i11) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i11);
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i11, arrayList.size());
        this.nextNotifyPrimaryFormatMediaChunkIndex = Math.max(this.nextNotifyPrimaryFormatMediaChunkIndex, this.mediaChunks.size());
        int i12 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i12 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i12];
            i12++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i12));
        }
    }

    private BaseMediaChunk getLastMediaChunk() {
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean haveReadFromMediaChunk(int i11) {
        int readIndex;
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i11);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i12 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i12 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i12].getReadIndex();
            i12++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i12));
        return true;
    }

    private boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof BaseMediaChunk;
    }

    private int primarySampleIndexToMediaChunkIndex(int i11, int i12) {
        do {
            i12++;
            if (i12 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i12).getFirstSampleIndex(0) <= i11);
        return i12 - 1;
    }

    private void resetSampleQueues() {
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        List<BaseMediaChunk> list;
        long j11;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        boolean zIsPendingReset = isPendingReset();
        if (zIsPendingReset) {
            list = Collections.EMPTY_LIST;
            j11 = this.pendingResetPositionUs;
        } else {
            list = this.readOnlyMediaChunks;
            j11 = getLastMediaChunk().endTimeUs;
        }
        this.chunkSource.getNextChunk(loadingInfo, j11, list, this.nextChunkHolder);
        ChunkHolder chunkHolder = this.nextChunkHolder;
        boolean z11 = chunkHolder.endOfStream;
        Chunk chunk = chunkHolder.chunk;
        chunkHolder.clear();
        if (z11) {
            this.pendingResetPositionUs = C2711C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.loadingChunk = chunk;
        if (isMediaChunk(chunk)) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (zIsPendingReset) {
                long j12 = baseMediaChunk.startTimeUs;
                long j13 = this.pendingResetPositionUs;
                if (j12 < j13) {
                    this.primarySampleQueue.setStartTimeUs(j13);
                    for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
                        sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
                    }
                    if (this.canReportInitialDiscontinuity) {
                        Format format = baseMediaChunk.trackFormat;
                        this.hasInitialDiscontinuity = !MimeTypes.allSamplesAreSyncSamples(format.sampleMimeType, format.codecs);
                    }
                }
                this.canReportInitialDiscontinuity = false;
                this.pendingResetPositionUs = C2711C.TIME_UNSET;
            }
            baseMediaChunk.init(this.chunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        } else if (chunk instanceof InitializationChunk) {
            ((InitializationChunk) chunk).init(this.chunkOutput);
        }
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j11, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long jMax = this.lastSeekPositionUs;
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
                lastMediaChunk = arrayList.get(arrayList.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        return Math.max(jMax, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.chunkSource;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isPendingReset() {
        return this.pendingResetPositionUs != C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.primarySampleQueue.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j11, long j12, boolean z11) {
        this.loadingChunk = null;
        this.canceledMediaChunk = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z11) {
            return;
        }
        if (isPendingReset()) {
            resetSampleQueues();
        } else if (isMediaChunk(chunk)) {
            discardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1);
            if (this.mediaChunks.isEmpty()) {
                this.pendingResetPositionUs = this.lastSeekPositionUs;
            }
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j11, long j12) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk chunk, long j11, long j12, IOException iOException, int i11) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        long jBytesLoaded = chunk.bytesLoaded();
        boolean zIsMediaChunk = isMediaChunk(chunk);
        int size = this.mediaChunks.size() - 1;
        boolean z11 = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, Util.usToMs(chunk.startTimeUs), Util.usToMs(chunk.endTimeUs)), iOException, i11);
        if (!this.chunkSource.onChunkLoadError(chunk, z11, loadErrorInfo, this.loadErrorHandlingPolicy)) {
            loadErrorActionCreateRetryAction = null;
        } else if (z11) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
            if (zIsMediaChunk) {
                Assertions.checkState(discardUpstreamMediaChunksFromIndex(size) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
        } else {
            Log.m2961w(TAG, "Ignoring attempt to cancel non-cancelable load.");
            loadErrorActionCreateRetryAction = null;
        }
        if (loadErrorActionCreateRetryAction == null) {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != C2711C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.release();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.release();
        }
        this.chunkSource.release();
        ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (!this.loader.isLoading()) {
            int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j11, this.readOnlyMediaChunks);
            if (preferredQueueSize < this.mediaChunks.size()) {
                discardUpstream(preferredQueueSize);
                return;
            }
            return;
        }
        Chunk chunk = (Chunk) Assertions.checkNotNull(this.loadingChunk);
        if (!(isMediaChunk(chunk) && haveReadFromMediaChunk(this.mediaChunks.size() - 1)) && this.chunkSource.shouldCancelLoad(j11, chunk, this.readOnlyMediaChunks)) {
            this.loader.cancelLoading();
            if (isMediaChunk(chunk)) {
                this.canceledMediaChunk = (BaseMediaChunk) chunk;
            }
        }
    }

    public void release(@Nullable ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.preRelease();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.preRelease();
        }
        this.loader.release(this);
    }

    public void seekToUs(long j11) throws Throwable {
        BaseMediaChunk baseMediaChunk;
        boolean zSeekTo;
        this.lastSeekPositionUs = j11;
        int i11 = 0;
        this.canReportInitialDiscontinuity = false;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j11;
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 < this.mediaChunks.size()) {
                baseMediaChunk = this.mediaChunks.get(i12);
                long j12 = baseMediaChunk.startTimeUs;
                if (j12 == j11 && baseMediaChunk.clippedStartTimeUs == C2711C.TIME_UNSET) {
                    break;
                } else if (j12 <= j11) {
                    i12++;
                }
            }
            baseMediaChunk = null;
            break;
        }
        if (baseMediaChunk != null) {
            zSeekTo = this.primarySampleQueue.seekTo(baseMediaChunk.getFirstSampleIndex(0));
        } else {
            zSeekTo = this.primarySampleQueue.seekTo(j11, j11 < getNextLoadPositionUs());
        }
        if (zSeekTo) {
            this.nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), 0);
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            int length = sampleQueueArr.length;
            while (i11 < length) {
                sampleQueueArr[i11].seekTo(j11, true);
                i11++;
            }
            return;
        }
        this.pendingResetPositionUs = j11;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        this.nextNotifyPrimaryFormatMediaChunkIndex = 0;
        if (!this.loader.isLoading()) {
            this.loader.clearFatalError();
            resetSampleQueues();
            return;
        }
        this.primarySampleQueue.discardToEnd();
        SampleQueue[] sampleQueueArr2 = this.embeddedSampleQueues;
        int length2 = sampleQueueArr2.length;
        while (i11 < length2) {
            sampleQueueArr2[i11].discardToEnd();
            i11++;
        }
        this.loader.cancelLoading();
    }

    public ChunkSampleStream(int i11, @Nullable int[] iArr, @Nullable Format[] formatArr, T t11, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j11, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, boolean z11, @Nullable ReleasableExecutor releasableExecutor) {
        Loader loader;
        this.primaryTrackType = i11;
        int i12 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr == null ? new Format[0] : formatArr;
        this.chunkSource = t11;
        this.callback = callback;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.canReportInitialDiscontinuity = z11;
        if (releasableExecutor != null) {
            loader = new Loader(releasableExecutor);
        } else {
            loader = new Loader(TAG);
        }
        this.loader = loader;
        this.nextChunkHolder = new ChunkHolder();
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i13 = length + 1;
        int[] iArr2 = new int[i13];
        SampleQueue[] sampleQueueArr = new SampleQueue[i13];
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(allocator, drmSessionManager, eventDispatcher);
        this.primarySampleQueue = sampleQueueCreateWithDrm;
        iArr2[0] = i11;
        sampleQueueArr[0] = sampleQueueCreateWithDrm;
        while (i12 < length) {
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(allocator);
            this.embeddedSampleQueues[i12] = sampleQueueCreateWithoutDrm;
            int i14 = i12 + 1;
            sampleQueueArr[i14] = sampleQueueCreateWithoutDrm;
            iArr2[i14] = this.embeddedTrackTypes[i12];
            i12 = i14;
        }
        this.chunkOutput = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j11;
        this.lastSeekPositionUs = j11;
    }

    public void discardBuffer(long j11, boolean z11) {
        if (isPendingReset()) {
            return;
        }
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j11, z11, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i11 = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i11 >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i11].discardTo(firstTimestampUs, z11, this.embeddedTracksSelected[i11]);
                i11++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        if (!isPendingReset() && this.primarySampleQueue.isReady(this.loadingFinished)) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (isPendingReset()) {
            return -3;
        }
        BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.primarySampleQueue.read(formatHolder, decoderInputBuffer, i11, this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j11) throws Throwable {
        if (isPendingReset()) {
            return 0;
        }
        int skipCount = this.primarySampleQueue.getSkipCount(j11, this.loadingFinished);
        BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null) {
            skipCount = Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.primarySampleQueue.getReadIndex());
        }
        this.primarySampleQueue.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i11) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i11);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.mediaSourceEventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }
}
