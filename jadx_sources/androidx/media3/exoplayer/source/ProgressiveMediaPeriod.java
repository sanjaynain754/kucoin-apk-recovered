package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final String TAG = "ProgressiveMediaPeriod";
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;

    @Nullable
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;

    @Nullable
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private boolean pendingInitialDiscontinuity;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private final boolean suppressPrepareError;
    private TrackState trackState;
    private final Uri uri;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final Format ICY_FORMAT = new Format.Builder().setId("icy").setSampleMimeType(MimeTypes.APPLICATION_ICY).build();

    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private final ExtractorOutput extractorOutput;

        @Nullable
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = LoadEventInfo.getNewId();
        private DataSpec dataSpec = buildDataSpec(0);

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0048 */
        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void load() throws IOException {
            int i11 = 0;
            while (i11 == 0 && !this.loadCanceled) {
                long j11 = this.positionHolder.position;
                DataSpec dataSpecBuildDataSpec = buildDataSpec(j11);
                this.dataSpec = dataSpecBuildDataSpec;
                long jOpen = this.dataSource.open(dataSpecBuildDataSpec);
                if (this.loadCanceled) {
                    if (i11 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.dataSource);
                    return;
                }
                if (jOpen != -1) {
                    jOpen += j11;
                    ProgressiveMediaPeriod.this.onLengthKnown();
                }
                long j12 = jOpen;
                ProgressiveMediaPeriod.this.icyHeaders = IcyHeaders.parse(this.dataSource.getResponseHeaders());
                DataReader icyDataSource = this.dataSource;
                if (ProgressiveMediaPeriod.this.icyHeaders != null && ProgressiveMediaPeriod.this.icyHeaders.metadataInterval != -1) {
                    icyDataSource = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.this.icyHeaders.metadataInterval, this);
                    TrackOutput trackOutputIcyTrack = ProgressiveMediaPeriod.this.icyTrack();
                    this.icyTrackOutput = trackOutputIcyTrack;
                    trackOutputIcyTrack.format(ProgressiveMediaPeriod.ICY_FORMAT);
                }
                this.progressiveMediaExtractor.init(icyDataSource, this.uri, this.dataSource.getResponseHeaders(), j11, j12, this.extractorOutput);
                if (ProgressiveMediaPeriod.this.icyHeaders != null) {
                    this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                }
                if (this.pendingExtractorSeek) {
                    this.progressiveMediaExtractor.seek(j11, this.seekTimeUs);
                    this.pendingExtractorSeek = false;
                }
                while (i11 == 0 && !this.loadCanceled) {
                    try {
                        this.loadCondition.block();
                        i11 = this.progressiveMediaExtractor.read(this.positionHolder);
                        long currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                        if (currentInputPosition > ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j11) {
                            this.loadCondition.close();
                            ProgressiveMediaPeriod.this.handler.post(ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                            j11 = currentInputPosition;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                    this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                }
                DataSourceUtil.closeQuietly(this.dataSource);
            }
        }

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        private DataSpec buildDataSpec(long j11) {
            return new DataSpec.Builder().setUri(this.uri).setPosition(j11).setKey(ProgressiveMediaPeriod.this.customCacheKey).setFlags(6).setHttpRequestHeaders(ProgressiveMediaPeriod.ICY_METADATA_HEADERS).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j11, long j12) {
            this.positionHolder.position = j11;
            this.seekTimeUs = j12;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long jMax = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            int iBytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    public interface Listener {
        void onSourceInfoRefreshed(long j11, boolean z11, boolean z12);
    }

    public final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i11) {
            this.track = i11;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            return ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i11);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            return ProgressiveMediaPeriod.this.skipData(this.track, j11);
        }
    }

    public static final class TrackId {

        /* JADX INFO: renamed from: id */
        public final int f3324id;
        public final boolean isIcyTrack;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TrackId.class == obj.getClass()) {
                TrackId trackId = (TrackId) obj;
                if (this.f3324id == trackId.f3324id && this.isIcyTrack == trackId.isIcyTrack) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f3324id * 31) + (this.isIcyTrack ? 1 : 0);
        }

        public TrackId(int i11, boolean z11) {
            this.f3324id = i11;
            this.isIcyTrack = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            Format formatBuild = (Format) Assertions.checkNotNull(this.sampleQueues[i11].getUpstreamFormat());
            String str = formatBuild.sampleMimeType;
            boolean zIsAudio = MimeTypes.isAudio(str);
            boolean z11 = zIsAudio || MimeTypes.isVideo(str);
            zArr[i11] = z11;
            this.haveAudioVideoTracks = z11 | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != C2711C.TIME_UNSET && length == 1 && MimeTypes.isImage(str);
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (zIsAudio || this.sampleQueueTrackIds[i11].isIcyTrack) {
                    Metadata metadata = formatBuild.metadata;
                    formatBuild = formatBuild.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (zIsAudio && formatBuild.averageBitrate == -1 && formatBuild.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    formatBuild = formatBuild.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            Format formatCopyWithCryptoType = formatBuild.copyWithCryptoType(this.drmSessionManager.getCryptoType(formatBuild));
            trackGroupArr[i11] = new TrackGroup(Integer.toString(i11), formatCopyWithCryptoType);
            this.pendingInitialDiscontinuity = formatCopyWithCryptoType.hasPrerollSamples | this.pendingInitialDiscontinuity;
        }
        this.trackState = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        if (this.isSingleSample && this.durationUs == C2711C.TIME_UNSET) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new ForwardingSeekMap(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public long getDurationUs() {
                    return ProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap.isSeekable(), this.isLive);
        this.prepared = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void maybeThrowError(int i11) throws IOException {
        this.sampleQueues[i11].maybeThrowError();
        maybeThrowError();
    }

    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i11 = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i11];
            this.trackNotifiedDownstreamFormats = new boolean[i11];
        }
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, @Nullable String str, int i11, boolean z11, long j11, @Nullable ReleasableExecutor releasableExecutor) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i11;
        this.suppressPrepareError = z11;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j11;
        this.loadCondition = new ConditionVariable();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3410b.maybeFinishPrepare();
            }
        };
        this.onContinueLoadingRequestedRunnable = new Runnable() { // from class: androidx.media3.exoplayer.source.y
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod.m3401c(this.f3411b);
            }
        };
        this.handler = Util.createHandlerForCurrentLooper();
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.pendingResetPositionUs = C2711C.TIME_UNSET;
        this.dataType = 1;
    }

    private void assertPrepared() {
        Assertions.checkState(this.prepared);
        Assertions.checkNotNull(this.trackState);
        Assertions.checkNotNull(this.seekMap);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3401c(ProgressiveMediaPeriod progressiveMediaPeriod) {
        if (progressiveMediaPeriod.released) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(progressiveMediaPeriod.callback)).onContinueLoadingRequested(progressiveMediaPeriod);
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i11) {
        SeekMap seekMap;
        if (this.isLengthKnown || !((seekMap = this.seekMap) == null || seekMap.getDurationUs() == C2711C.TIME_UNSET)) {
            this.extractedSamplesCountAtStartOfLoad = i11;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z11) {
        long jMax = Long.MIN_VALUE;
        for (int i11 = 0; i11 < this.sampleQueues.length; i11++) {
            if (z11 || ((TrackState) Assertions.checkNotNull(this.trackState)).trackEnabledStates[i11]) {
                jMax = Math.max(jMax, this.sampleQueues[i11].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C2711C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f3409b.isLengthKnown = true;
            }
        });
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (trackId.equals(this.sampleQueueTrackIds[i11])) {
                return this.sampleQueues[i11];
            }
        }
        if (this.sampleQueuesBuilt) {
            Log.m2961w(TAG, "Extractor added new track (id=" + trackId.f3324id + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i12 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i12);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (TrackId[]) Util.castNonNullTypeArray(trackIdArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i12);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.sampleQueues = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        return sampleQueueCreateWithDrm;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j11, boolean z11) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            SampleQueue sampleQueue = this.sampleQueues[i11];
            if (sampleQueue.getReadIndex() != 0 || !z11) {
                if (!(this.isSingleSample ? sampleQueue.seekTo(sampleQueue.getFirstIndex()) : sampleQueue.seekTo(j11, false)) && (zArr[i11] || !this.haveAudioVideoTracks)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeekMap(SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new SeekMap.Unseekable(C2711C.TIME_UNSET);
        this.durationUs = seekMap.getDurationUs();
        boolean z11 = !this.isLengthKnown && seekMap.getDurationUs() == C2711C.TIME_UNSET;
        this.isLive = z11;
        this.dataType = z11 ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap.isSeekable(), this.isLive);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            Assertions.checkState(isPendingReset());
            long j11 = this.durationUs;
            if (j11 != C2711C.TIME_UNSET && this.pendingResetPositionUs > j11) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = C2711C.TIME_UNSET;
                return;
            }
            extractingLoadable.setLoadPosition(((SeekMap) Assertions.checkNotNull(this.seekMap)).getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = C2711C.TIME_UNSET;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType))), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if (this.prepared && this.enabledTrackCount == 0) {
            return false;
        }
        boolean zOpen = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.sampleQueues[i11].discardTo(j11, z11, zArr[i11]);
        }
    }

    public TrackOutput icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading() && this.loadCondition.isOpen();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j11, long j12, boolean z11) {
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z11) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j11, long j12) {
        SeekMap seekMap;
        if (this.durationUs == C2711C.TIME_UNSET && (seekMap = this.seekMap) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j13 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j13;
            this.listener.onSourceInfoRefreshed(j13, zIsSeekable, this.isLive);
        }
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j11, long j12, IOException iOException, int i11) {
        ExtractingLoadable extractingLoadable2;
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        StatsDataSource statsDataSource = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j11, j12, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(extractingLoadable.seekTimeUs), Util.usToMs(this.durationUs)), iOException, i11));
        if (retryDelayMsFor == C2711C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
            extractingLoadable2 = extractingLoadable;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            extractingLoadable2 = extractingLoadable;
            loadErrorActionCreateRetryAction = configureRetry(extractingLoadable2, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable2.seekTimeUs, this.durationUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable2.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
            return this.lastSeekPositionUs;
        }
        if (!this.notifyDiscontinuity) {
            return C2711C.TIME_UNSET;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return C2711C.TIME_UNSET;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f3412b.setSeekMap(seekMap);
            }
        });
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        return prepareTrackOutput(new TrackId(i11, false));
    }

    private void maybeNotifyDownstreamFormat(int i11) {
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (!zArr[i11]) {
            Format format = trackState.tracks.get(i11).getFormat(0);
            this.mediaSourceEventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
            zArr[i11] = true;
        }
    }

    private void maybeStartDeferredRetry(int i11) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (this.pendingDeferredRetry && zArr[i11]) {
            if (!this.sampleQueues[i11].isReady(false)) {
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (SampleQueue sampleQueue : this.sampleQueues) {
                    sampleQueue.reset();
                }
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j11);
        return seekParameters.resolveSeekPositionUs(j11, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                TrackState trackState = this.trackState;
                if (trackState.trackIsAudioVideoFlags[i11] && trackState.trackEnabledStates[i11] && !this.sampleQueues[i11].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i11].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        if (largestQueuedTimestampUs == Long.MIN_VALUE) {
            return this.lastSeekPositionUs;
        }
        return largestQueuedTimestampUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    public boolean isReady(int i11) {
        if (!suppressRead() && this.sampleQueues[i11].isReady(this.loadingFinished)) {
            return true;
        }
        return false;
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        try {
            maybeThrowError();
        } catch (IOException e11) {
            if (this.suppressPrepareError) {
                Log.m2958e(TAG, "Suppressing preparation error because suppressPrepareError=true", e11);
                this.sampleQueuesBuilt = true;
                setSeekMap(new SeekMap.Unseekable(C2711C.TIME_UNSET));
            } else {
                throw e11;
            }
        }
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    public int readData(int i11, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i11);
        int i13 = this.sampleQueues[i11].read(formatHolder, decoderInputBuffer, i12, this.loadingFinished);
        if (i13 == -3) {
            maybeStartDeferredRetry(i11);
        }
        return i13;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        boolean z11;
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j11 = 0;
        }
        int i11 = 0;
        this.notifyDiscontinuity = false;
        if (this.lastSeekPositionUs == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.lastSeekPositionUs = j11;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j11;
            return j11;
        }
        if (this.dataType == 7 || ((!this.loadingFinished && !this.loader.isLoading()) || !seekInsideBufferUs(zArr, j11, z11))) {
            this.pendingDeferredRetry = false;
            this.pendingResetPositionUs = j11;
            this.loadingFinished = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i11 < length) {
                    sampleQueueArr[i11].discardToEnd();
                    i11++;
                }
                this.loader.cancelLoading();
                return j11;
            }
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i11 < length2) {
                sampleQueueArr2[i11].reset();
                i11++;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        boolean z11;
        ExoTrackSelection exoTrackSelection;
        boolean z12;
        boolean z13;
        assertPrepared();
        TrackState trackState = this.trackState;
        TrackGroupArray trackGroupArray = trackState.tracks;
        boolean[] zArr3 = trackState.trackEnabledStates;
        int i11 = this.enabledTrackCount;
        int i12 = 0;
        for (int i13 = 0; i13 < exoTrackSelectionArr.length; i13++) {
            SampleStream sampleStream = sampleStreamArr[i13];
            if (sampleStream != null && (exoTrackSelectionArr[i13] == null || !zArr[i13])) {
                int i14 = ((SampleStreamImpl) sampleStream).track;
                Assertions.checkState(zArr3[i14]);
                this.enabledTrackCount--;
                zArr3[i14] = false;
                sampleStreamArr[i13] = null;
            }
        }
        if (!this.seenFirstTrackSelection ? !(j11 == 0 || this.isSingleSample) : i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        for (int i15 = 0; i15 < exoTrackSelectionArr.length; i15++) {
            if (sampleStreamArr[i15] == null && (exoTrackSelection = exoTrackSelectionArr[i15]) != null) {
                if (exoTrackSelection.length() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Assertions.checkState(z12);
                if (exoTrackSelection.getIndexInTrackGroup(0) == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Assertions.checkState(z13);
                int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                Assertions.checkState(!zArr3[iIndexOf]);
                this.enabledTrackCount++;
                zArr3[iIndexOf] = true;
                this.pendingInitialDiscontinuity = exoTrackSelection.getSelectedFormat().hasPrerollSamples | this.pendingInitialDiscontinuity;
                sampleStreamArr[i15] = new SampleStreamImpl(iIndexOf);
                zArr2[i15] = true;
                if (!z11) {
                    SampleQueue sampleQueue = this.sampleQueues[iIndexOf];
                    if (sampleQueue.getReadIndex() != 0 && !sampleQueue.seekTo(j11, true)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i12 < length) {
                    sampleQueueArr[i12].discardToEnd();
                    i12++;
                }
                this.loader.cancelLoading();
            } else {
                this.loadingFinished = false;
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i12 < length2) {
                    sampleQueueArr2[i12].reset();
                    i12++;
                }
            }
        } else if (z11) {
            j11 = seekToUs(j11);
            while (i12 < sampleStreamArr.length) {
                if (sampleStreamArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j11;
    }

    public int skipData(int i11, long j11) throws Throwable {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i11);
        SampleQueue sampleQueue = this.sampleQueues[i11];
        int skipCount = sampleQueue.getSkipCount(j11, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i11);
        }
        return skipCount;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
    }
}
