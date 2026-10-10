package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkHolder;
import androidx.media3.exoplayer.source.chunk.ContainerMediaChunk;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.SingleSampleMediaChunk;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.bugly.proguard.C33820nf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final BaseUrlExclusionList baseUrlExclusionList;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;

    @Nullable
    private IOException fatalError;
    private long lastChunkRequestRealtimeMs = C2711C.TIME_UNSET;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        public Factory(DataSource.Factory factory, int i11) {
            this(BundledChunkExtractor.FACTORY, factory, i11);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i11, int[] iArr, ExoTrackSelection exoTrackSelection, int i12, long j11, boolean z11, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i11, iArr, exoTrackSelection, i12, dataSourceCreateDataSource, j11, this.maxSegmentsPerLoad, z11, list, playerTrackEmsgHandler, playerId, cmcdConfiguration);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            this.chunkExtractorFactory.experimentalParseSubtitlesDuringExtraction(z11);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        public Format getOutputTextFormat(Format format) {
            return this.chunkExtractorFactory.getOutputTextFormat(format);
        }

        @Override // androidx.media3.exoplayer.dash.DashChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.chunkExtractorFactory.setSubtitleParserFactory(factory);
            return this;
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i11) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i11;
        }
    }

    public static final class RepresentationHolder {

        @Nullable
        final ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final BaseUrl selectedBaseUrl;

        @CheckResult
        public RepresentationHolder copyWithNewRepresentation(long j11, Representation representation) throws BehindLiveWindowException {
            long segmentNum;
            long segmentNum2;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j11, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(j11, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j11);
            if (segmentCount == 0) {
                return new RepresentationHolder(j11, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            Assertions.checkStateNotNull(index2);
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j12 = segmentCount + firstSegmentNum;
            long j13 = j12 - 1;
            long timeUs2 = index.getTimeUs(j13) + index.getDurationUs(j13, j11);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j14 = this.segmentNumShift;
            if (timeUs2 != timeUs3) {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum2 = j14 - (index2.getSegmentNum(timeUs, j11) - firstSegmentNum);
                } else {
                    segmentNum = index.getSegmentNum(timeUs3, j11) - firstSegmentNum2;
                }
                return new RepresentationHolder(j11, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
            }
            segmentNum = j12 - firstSegmentNum2;
            segmentNum2 = j14 + segmentNum;
            return new RepresentationHolder(j11, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
        }

        @CheckResult
        public RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        @CheckResult
        public RepresentationHolder copyWithNewSelectedBaseUrl(BaseUrl baseUrl) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public long getFirstAvailableSegmentNum(long j11) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getFirstAvailableSegmentNum(this.periodDurationUs, j11) + this.segmentNumShift;
        }

        public long getFirstSegmentNum() {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getSegmentCount() {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentNum(long j11) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentNum(j11, this.periodDurationUs) + this.segmentNumShift;
        }

        public long getSegmentStartTimeUs(long j11) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getTimeUs(j11 - this.segmentNumShift);
        }

        public RangedUri getSegmentUrl(long j11) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentUrl(j11 - this.segmentNumShift);
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j11, long j12) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).isExplicit() || j12 == C2711C.TIME_UNSET || getSegmentEndTimeUs(j11) <= j12;
        }

        public RepresentationHolder(long j11, Representation representation, BaseUrl baseUrl, @Nullable ChunkExtractor chunkExtractor, long j12, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j11;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j12;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        public long getLastAvailableSegmentNum(long j11) {
            return (getFirstAvailableSegmentNum(j11) + ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getAvailableSegmentCount(this.periodDurationUs, j11)) - 1;
        }

        public long getSegmentEndTimeUs(long j11) {
            return getSegmentStartTimeUs(j11) + ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getDurationUs(j11 - this.segmentNumShift, this.periodDurationUs);
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i11, int[] iArr, ExoTrackSelection exoTrackSelection, int i12, DataSource dataSource, long j11, int i13, boolean z11, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        int i14 = i12;
        this.trackType = i14;
        this.dataSource = dataSource;
        this.periodIndex = i11;
        this.elapsedRealtimeOffsetMs = j11;
        this.maxSegmentsPerLoad = i13;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = playerTrackEmsgHandler;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler2;
        this.cmcdConfiguration = cmcdConfiguration;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i11);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i15 = 0;
        while (i15 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i15));
            BaseUrl baseUrlSelectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            BaseUrl baseUrl = baseUrlSelectBaseUrl == null ? representation.baseUrls.get(0) : baseUrlSelectBaseUrl;
            ChunkExtractor chunkExtractorCreateProgressiveMediaExtractor = factory.createProgressiveMediaExtractor(i14, representation.format, z11, list, playerTrackEmsgHandler2, playerId);
            long j12 = periodDurationUs;
            int i16 = i15;
            representationHolderArr[i16] = new RepresentationHolder(j12, representation, baseUrl, chunkExtractorCreateProgressiveMediaExtractor, 0L, representation.getIndex());
            i15 = i16 + 1;
            i14 = i12;
            periodDurationUs = j12;
            playerTrackEmsgHandler2 = playerTrackEmsgHandler;
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z11, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z11) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk)) {
            IOException iOException = loadErrorInfo.exception;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                        this.missingLastSegment = true;
                        return true;
                    }
                }
            }
        }
        RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (baseUrlSelectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(baseUrlSelectBaseUrl)) {
            return true;
        }
        LoadErrorHandlingPolicy.FallbackOptions fallbackOptionsCreateFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((fallbackOptionsCreateFallbackOptions.isFallbackAvailable(2) || fallbackOptionsCreateFallbackOptions.isFallbackAvailable(1)) && (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(fallbackOptionsCreateFallbackOptions, loadErrorInfo)) != null && fallbackOptionsCreateFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            int i11 = fallbackSelectionFor.type;
            if (i11 == 2) {
                ExoTrackSelection exoTrackSelection = this.trackSelection;
                return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
            }
            if (i11 == 1) {
                this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
                return true;
            }
        }
        return false;
    }

    public static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j11, long j12, long j13) {
            super(j11, j12);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j13;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            int i11;
            checkInBounds();
            long currentIndex = getCurrentIndex();
            RangedUri segmentUrl = this.representationHolder.getSegmentUrl(currentIndex);
            if (this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            RepresentationHolder representationHolder = this.representationHolder;
            return DashUtil.buildDataSpec(representationHolder.representation, representationHolder.selectedBaseUrl.url, segmentUrl, i11, ImmutableMap.m13458of());
        }
    }

    private long getAvailableLiveDurationUs(long j11, long j12) {
        if (!this.manifest.dynamic || this.representationHolders[0].getSegmentCount() == 0) {
            return C2711C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(getNowPeriodTimeUs(j11), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j11))) - j12);
    }

    @Nullable
    private Pair<String, String> getNextObjectAndRangeRequest(long j11, RangedUri rangedUri, RepresentationHolder representationHolder) {
        long j12 = j11 + 1;
        if (j12 >= representationHolder.getSegmentCount()) {
            return null;
        }
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j12);
        String relativePath = UriUtil.getRelativePath(rangedUri.resolveUri(representationHolder.selectedBaseUrl.url), segmentUrl.resolveUri(representationHolder.selectedBaseUrl.url));
        String str = segmentUrl.start + C33820nf.f71144W;
        if (segmentUrl.length != -1) {
            str = str + (segmentUrl.start + segmentUrl.length);
        }
        return new Pair<>(relativePath, str);
    }

    private long getNowPeriodTimeUs(long j11) {
        DashManifest dashManifest = this.manifest;
        long j12 = dashManifest.availabilityStartTimeMs;
        return j12 == C2711C.TIME_UNSET ? C2711C.TIME_UNSET : j11 - Util.msToUs(j12 + dashManifest.getPeriod(this.periodIndex).startMs);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i11 : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i11).representations);
        }
        return arrayList;
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j11, long j12, long j13) {
        return mediaChunk != null ? mediaChunk.getNextChunkIndex() : Util.constrainValue(representationHolder.getSegmentNum(j11), j12, j13);
    }

    private RepresentationHolder updateSelectedBaseUrl(int i11) {
        RepresentationHolder representationHolder = this.representationHolders[i11];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (baseUrlSelectBaseUrl == null || baseUrlSelectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        RepresentationHolder representationHolderCopyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(baseUrlSelectBaseUrl);
        this.representationHolders[i11] = representationHolderCopyWithNewSelectedBaseUrl;
        return representationHolderCopyWithNewSelectedBaseUrl;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = representationHolder.getSegmentNum(j11);
                    long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                    return seekParameters.resolveSeekPositionUs(j11, segmentStartTimeUs, (segmentStartTimeUs >= j11 || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void getNextChunk(LoadingInfo loadingInfo, long j11, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        MediaChunkIterator[] mediaChunkIteratorArr;
        int i11;
        boolean z11;
        int i12;
        DefaultDashChunkSource defaultDashChunkSource;
        MediaChunk mediaChunk;
        long j12;
        DefaultDashChunkSource defaultDashChunkSource2 = this;
        if (defaultDashChunkSource2.fatalError != null) {
            return;
        }
        long j13 = loadingInfo.playbackPositionUs;
        long j14 = j11 - j13;
        long jMsToUs = Util.msToUs(defaultDashChunkSource2.manifest.availabilityStartTimeMs) + Util.msToUs(defaultDashChunkSource2.manifest.getPeriod(defaultDashChunkSource2.periodIndex).startMs) + j11;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = defaultDashChunkSource2.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs)) {
            long jMsToUs2 = Util.msToUs(Util.getNowUnixTimeMs(defaultDashChunkSource2.elapsedRealtimeOffsetMs));
            long nowPeriodTimeUs = defaultDashChunkSource2.getNowPeriodTimeUs(jMsToUs2);
            boolean z12 = true;
            MediaChunk mediaChunk2 = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = defaultDashChunkSource2.trackSelection.length();
            MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
            int i13 = 0;
            while (i13 < length) {
                RepresentationHolder representationHolder = defaultDashChunkSource2.representationHolders[i13];
                if (representationHolder.segmentIndex == null) {
                    mediaChunkIteratorArr2[i13] = MediaChunkIterator.EMPTY;
                    defaultDashChunkSource = defaultDashChunkSource2;
                    mediaChunk = mediaChunk2;
                    z11 = z12;
                    i12 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    i11 = i13;
                } else {
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(jMsToUs2);
                    boolean z13 = z12;
                    MediaChunk mediaChunk3 = mediaChunk2;
                    long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(jMsToUs2);
                    i11 = i13;
                    z11 = z13;
                    i12 = length;
                    long segmentNum = defaultDashChunkSource2.getSegmentNum(representationHolder, mediaChunk3, j11, firstAvailableSegmentNum, lastAvailableSegmentNum);
                    defaultDashChunkSource = defaultDashChunkSource2;
                    mediaChunk = mediaChunk3;
                    if (segmentNum < firstAvailableSegmentNum) {
                        mediaChunkIteratorArr[i11] = MediaChunkIterator.EMPTY;
                    } else {
                        long j15 = nowPeriodTimeUs;
                        j12 = j15;
                        mediaChunkIteratorArr[i11] = new RepresentationSegmentIterator(defaultDashChunkSource.updateSelectedBaseUrl(i11), segmentNum, lastAvailableSegmentNum, j15);
                    }
                    i13 = i11 + 1;
                    defaultDashChunkSource2 = defaultDashChunkSource;
                    length = i12;
                    mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                    z12 = z11;
                    mediaChunk2 = mediaChunk;
                    nowPeriodTimeUs = j12;
                }
                j12 = nowPeriodTimeUs;
                i13 = i11 + 1;
                defaultDashChunkSource2 = defaultDashChunkSource;
                length = i12;
                mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                z12 = z11;
                mediaChunk2 = mediaChunk;
                nowPeriodTimeUs = j12;
            }
            DefaultDashChunkSource defaultDashChunkSource3 = defaultDashChunkSource2;
            MediaChunk mediaChunk4 = mediaChunk2;
            boolean z14 = z12;
            long j16 = nowPeriodTimeUs;
            defaultDashChunkSource3.trackSelection.updateSelectedTrack(j13, j14, defaultDashChunkSource3.getAvailableLiveDurationUs(jMsToUs2, j13), list, mediaChunkIteratorArr2);
            int selectedIndex = defaultDashChunkSource3.trackSelection.getSelectedIndex();
            CmcdData.Factory factory = defaultDashChunkSource3.cmcdConfiguration == null ? null : new CmcdData.Factory(defaultDashChunkSource3.cmcdConfiguration, defaultDashChunkSource3.trackSelection, Math.max(0L, j14), loadingInfo.playbackSpeed, "d", defaultDashChunkSource3.manifest.dynamic, loadingInfo.rebufferedSince(defaultDashChunkSource3.lastChunkRequestRealtimeMs), list.isEmpty());
            defaultDashChunkSource3.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
            RepresentationHolder representationHolderUpdateSelectedBaseUrl = defaultDashChunkSource3.updateSelectedBaseUrl(selectedIndex);
            ChunkExtractor chunkExtractor = representationHolderUpdateSelectedBaseUrl.chunkExtractor;
            if (chunkExtractor != null) {
                Representation representation = representationHolderUpdateSelectedBaseUrl.representation;
                RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
                RangedUri indexUri = representationHolderUpdateSelectedBaseUrl.segmentIndex == null ? representation.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    chunkHolder.chunk = defaultDashChunkSource3.newInitializationChunk(representationHolderUpdateSelectedBaseUrl, defaultDashChunkSource3.dataSource, defaultDashChunkSource3.trackSelection.getSelectedFormat(), defaultDashChunkSource3.trackSelection.getSelectionReason(), defaultDashChunkSource3.trackSelection.getSelectionData(), initializationUri, indexUri, factory);
                    return;
                }
            }
            long j17 = representationHolderUpdateSelectedBaseUrl.periodDurationUs;
            DashManifest dashManifest = defaultDashChunkSource3.manifest;
            boolean z15 = (dashManifest.dynamic && defaultDashChunkSource3.periodIndex == dashManifest.getPeriodCount() + (-1)) ? z14 : false;
            boolean z16 = (z15 && j17 == C2711C.TIME_UNSET) ? false : z14;
            if (representationHolderUpdateSelectedBaseUrl.getSegmentCount() == 0) {
                chunkHolder.endOfStream = z16;
                return;
            }
            long firstAvailableSegmentNum2 = representationHolderUpdateSelectedBaseUrl.getFirstAvailableSegmentNum(jMsToUs2);
            long lastAvailableSegmentNum2 = representationHolderUpdateSelectedBaseUrl.getLastAvailableSegmentNum(jMsToUs2);
            if (z15) {
                long segmentEndTimeUs = representationHolderUpdateSelectedBaseUrl.getSegmentEndTimeUs(lastAvailableSegmentNum2);
                z16 &= segmentEndTimeUs + (segmentEndTimeUs - representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(lastAvailableSegmentNum2)) >= j17 ? z14 : false;
            }
            boolean z17 = z16;
            long segmentNum2 = defaultDashChunkSource3.getSegmentNum(representationHolderUpdateSelectedBaseUrl, mediaChunk4, j11, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
            if (segmentNum2 < firstAvailableSegmentNum2) {
                defaultDashChunkSource3.fatalError = new BehindLiveWindowException();
                return;
            }
            if (segmentNum2 > lastAvailableSegmentNum2 || (defaultDashChunkSource3.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                chunkHolder.endOfStream = z17;
                return;
            }
            if (z17 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(segmentNum2) >= j17) {
                chunkHolder.endOfStream = z14;
                return;
            }
            int iMin = (int) Math.min(defaultDashChunkSource3.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
            if (j17 != C2711C.TIME_UNSET) {
                while (iMin > 1 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs((((long) iMin) + segmentNum2) - 1) >= j17) {
                    iMin--;
                }
            }
            chunkHolder.chunk = defaultDashChunkSource3.newMediaChunk(representationHolderUpdateSelectedBaseUrl, defaultDashChunkSource3.dataSource, defaultDashChunkSource3.trackType, defaultDashChunkSource3.trackSelection.getSelectedFormat(), defaultDashChunkSource3.trackSelection.getSelectionReason(), defaultDashChunkSource3.trackSelection.getSelectionData(), segmentNum2, iMin, list.isEmpty() ? j11 : -9223372036854775807L, j16, factory);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j11, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j11, list);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    public Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format format, int i11, @Nullable Object obj, @Nullable RangedUri rangedUri, @Nullable RangedUri rangedUri2, @Nullable CmcdData.Factory factory) {
        Representation representation = representationHolder.representation;
        if (rangedUri != null) {
            RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(rangedUri2, representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge != null) {
                rangedUri = rangedUriAttemptMerge;
            }
        } else {
            rangedUri = (RangedUri) Assertions.checkNotNull(rangedUri2);
        }
        DataSpec dataSpecBuildDataSpec = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, rangedUri, 0, ImmutableMap.m13458of());
        if (factory != null) {
            dataSpecBuildDataSpec = factory.setObjectType("i").createCmcdData().addToDataSpec(dataSpecBuildDataSpec);
        }
        return new InitializationChunk(dataSource, dataSpecBuildDataSpec, format, i11, obj, representationHolder.chunkExtractor);
    }

    public Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i11, Format format, int i12, @Nullable Object obj, long j11, int i13, long j12, long j13, @Nullable CmcdData.Factory factory) {
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j11);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j11);
        if (representationHolder.chunkExtractor == null) {
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j11);
            DataSpec dataSpecBuildDataSpec = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j11, j13) ? 0 : 8, ImmutableMap.m13458of());
            if (factory != null) {
                factory.setChunkDurationUs(segmentEndTimeUs - segmentStartTimeUs).setObjectType(CmcdData.Factory.getObjectType(this.trackSelection));
                Pair<String, String> nextObjectAndRangeRequest = getNextObjectAndRangeRequest(j11, segmentUrl, representationHolder);
                if (nextObjectAndRangeRequest != null) {
                    factory.setNextObjectRequest((String) nextObjectAndRangeRequest.first).setNextRangeRequest((String) nextObjectAndRangeRequest.second);
                }
                dataSpecBuildDataSpec = factory.createCmcdData().addToDataSpec(dataSpecBuildDataSpec);
            }
            return new SingleSampleMediaChunk(dataSource, dataSpecBuildDataSpec, format, i12, obj, segmentStartTimeUs, segmentEndTimeUs, j11, i11, format);
        }
        int i14 = 1;
        int i15 = 1;
        while (i14 < i13) {
            RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(((long) i14) + j11), representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i15++;
            i14++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long j14 = (((long) i15) + j11) - 1;
        int i16 = i15;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j14);
        long j15 = representationHolder.periodDurationUs;
        if (j15 == C2711C.TIME_UNSET || j15 > segmentEndTimeUs2) {
            j15 = -9223372036854775807L;
        }
        DataSpec dataSpecBuildDataSpec2 = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j14, j13) ? 0 : 8, ImmutableMap.m13458of());
        if (factory != null) {
            factory.setChunkDurationUs(segmentEndTimeUs2 - segmentStartTimeUs).setObjectType(CmcdData.Factory.getObjectType(this.trackSelection));
            Pair<String, String> nextObjectAndRangeRequest2 = getNextObjectAndRangeRequest(j11, segmentUrl, representationHolder);
            if (nextObjectAndRangeRequest2 != null) {
                factory.setNextObjectRequest((String) nextObjectAndRangeRequest2.first).setNextRangeRequest((String) nextObjectAndRangeRequest2.second);
            }
            dataSpecBuildDataSpec2 = factory.createCmcdData().addToDataSpec(dataSpecBuildDataSpec2);
        }
        DataSpec dataSpec = dataSpecBuildDataSpec2;
        long j16 = -representation.presentationTimeOffsetUs;
        if (MimeTypes.isImage(format.sampleMimeType)) {
            j16 += segmentStartTimeUs;
        }
        return new ContainerMediaChunk(dataSource, dataSpec, format, i12, obj, segmentStartTimeUs, segmentEndTimeUs2, j12, j15, j11, i16, j16, representationHolder.chunkExtractor);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int iIndexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = ((ChunkExtractor) Assertions.checkStateNotNull(representationHolder.chunkExtractor)).getChunkIndex()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j11, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j11, chunk, list);
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i11) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i11;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i11);
            ArrayList<Representation> representations = getRepresentations();
            for (int i12 = 0; i12 < this.representationHolders.length; i12++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i12));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i12] = representationHolderArr[i12].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e11) {
            this.fatalError = e11;
        }
    }

    @Override // androidx.media3.exoplayer.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (exoTrackSelection.isTrackExcluded(i12, jElapsedRealtime)) {
                i11++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i11);
    }
}
