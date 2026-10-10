package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkHolder;
import androidx.media3.exoplayer.source.chunk.ContainerMediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.mp4.TrackEncryptionBox;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultSsChunkSource implements SsChunkSource {
    private final ChunkExtractor[] chunkExtractors;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private int currentManifestChunkOffset;
    private final DataSource dataSource;

    @Nullable
    private IOException fatalError;
    private long lastChunkRequestRealtimeMs = C2711C.TIME_UNSET;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int streamElementIndex;
    private ExoTrackSelection trackSelection;

    public static final class Factory implements SsChunkSource.Factory {
        private final DataSource.Factory dataSourceFactory;
        private boolean parseSubtitlesDuringExtraction;
        private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        public SsChunkSource createChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i11, ExoTrackSelection exoTrackSelection, @Nullable TransferListener transferListener, @Nullable CmcdConfiguration cmcdConfiguration) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultSsChunkSource(loaderErrorThrower, ssManifest, i11, exoTrackSelection, dataSourceCreateDataSource, cmcdConfiguration, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            this.parseSubtitlesDuringExtraction = z11;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        public Format getOutputTextFormat(Format format) {
            String str;
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
                return format;
            }
            Format.Builder cueReplacementBehavior = format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format.sampleMimeType);
            if (format.codecs != null) {
                str = C33627eb.f69716f + format.codecs;
            } else {
                str = "";
            }
            sb2.append(str);
            return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        @CanIgnoreReturnValue
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            return this;
        }

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
        }
    }

    public static final class StreamElementIterator extends BaseMediaChunkIterator {
        private final SsManifest.StreamElement streamElement;
        private final int trackIndex;

        public StreamElementIterator(SsManifest.StreamElement streamElement, int i11, int i12) {
            super(i12, streamElement.chunkCount - 1);
            this.streamElement = streamElement;
            this.trackIndex = i11;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            return getChunkStartTimeUs() + this.streamElement.getChunkDurationUs((int) getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.streamElement.getStartTimeUs((int) getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            return new DataSpec(this.streamElement.buildRequestUri(this.trackIndex, (int) getCurrentIndex()));
        }
    }

    public DefaultSsChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i11, ExoTrackSelection exoTrackSelection, DataSource dataSource, @Nullable CmcdConfiguration cmcdConfiguration, SubtitleParser.Factory factory, boolean z11) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = ssManifest;
        this.streamElementIndex = i11;
        this.trackSelection = exoTrackSelection;
        this.dataSource = dataSource;
        this.cmcdConfiguration = cmcdConfiguration;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[i11];
        this.chunkExtractors = new ChunkExtractor[exoTrackSelection.length()];
        for (int i12 = 0; i12 < this.chunkExtractors.length; i12++) {
            int indexInTrackGroup = exoTrackSelection.getIndexInTrackGroup(i12);
            Format format = streamElement.formats[indexInTrackGroup];
            TrackEncryptionBox[] trackEncryptionBoxArr = format.drmInitData != null ? ((SsManifest.ProtectionElement) Assertions.checkNotNull(ssManifest.protectionElement)).trackEncryptionBoxes : null;
            int i13 = streamElement.type;
            int i14 = i13 == 2 ? 4 : 0;
            long j11 = streamElement.timescale;
            long j12 = ssManifest.durationUs;
            this.chunkExtractors[i12] = new BundledChunkExtractor(new FragmentedMp4Extractor(factory, !z11 ? 35 : 3, null, new Track(indexInTrackGroup, i13, j11, C2711C.TIME_UNSET, j12, j12, format, 0, trackEncryptionBoxArr, i14, null, null), ImmutableList.m13439of(), null), streamElement.type, format);
        }
    }

    private static MediaChunk newMediaChunk(Format format, DataSource dataSource, Uri uri, int i11, long j11, long j12, long j13, int i12, @Nullable Object obj, ChunkExtractor chunkExtractor, @Nullable CmcdData.Factory factory) {
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(uri).build();
        if (factory != null) {
            dataSpecBuild = factory.createCmcdData().addToDataSpec(dataSpecBuild);
        }
        return new ContainerMediaChunk(dataSource, dataSpecBuild, format, i12, obj, j11, j12, j13, C2711C.TIME_UNSET, i11, 1, j11, chunkExtractor);
    }

    private long resolveTimeToLiveEdgeUs(long j11) {
        SsManifest ssManifest = this.manifest;
        if (!ssManifest.isLive) {
            return C2711C.TIME_UNSET;
        }
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.streamElementIndex];
        int i11 = streamElement.chunkCount - 1;
        return (streamElement.getStartTimeUs(i11) + streamElement.getChunkDurationUs(i11)) - j11;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        SsManifest.StreamElement streamElement = this.manifest.streamElements[this.streamElementIndex];
        int chunkIndex = streamElement.getChunkIndex(j11);
        long startTimeUs = streamElement.getStartTimeUs(chunkIndex);
        return seekParameters.resolveSeekPositionUs(j11, startTimeUs, (startTimeUs >= j11 || chunkIndex >= streamElement.chunkCount + (-1)) ? startTimeUs : streamElement.getStartTimeUs(chunkIndex + 1));
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public final void getNextChunk(LoadingInfo loadingInfo, long j11, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        List<? extends MediaChunk> list2;
        int nextChunkIndex;
        CmcdData.Factory objectType;
        if (this.fatalError != null) {
            return;
        }
        SsManifest ssManifest = this.manifest;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.streamElementIndex];
        if (streamElement.chunkCount == 0) {
            chunkHolder.endOfStream = !ssManifest.isLive;
            return;
        }
        if (list.isEmpty()) {
            nextChunkIndex = streamElement.getChunkIndex(j11);
            list2 = list;
        } else {
            list2 = list;
            nextChunkIndex = (int) (list2.get(list.size() - 1).getNextChunkIndex() - ((long) this.currentManifestChunkOffset));
            if (nextChunkIndex < 0) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
        }
        if (nextChunkIndex >= streamElement.chunkCount) {
            chunkHolder.endOfStream = !this.manifest.isLive;
            return;
        }
        long j12 = loadingInfo.playbackPositionUs;
        long j13 = j11 - j12;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j12);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11;
            mediaChunkIteratorArr[i12] = new StreamElementIterator(streamElement, this.trackSelection.getIndexInTrackGroup(i11), nextChunkIndex);
            i11 = i12 + 1;
        }
        this.trackSelection.updateSelectedTrack(j12, j13, jResolveTimeToLiveEdgeUs, list2, mediaChunkIteratorArr);
        long startTimeUs = streamElement.getStartTimeUs(nextChunkIndex);
        long chunkDurationUs = startTimeUs + streamElement.getChunkDurationUs(nextChunkIndex);
        long j14 = list.isEmpty() ? j11 : -9223372036854775807L;
        int i13 = nextChunkIndex + this.currentManifestChunkOffset;
        int selectedIndex = this.trackSelection.getSelectedIndex();
        ChunkExtractor chunkExtractor = this.chunkExtractors[selectedIndex];
        int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(selectedIndex);
        Uri uriBuildRequestUri = streamElement.buildRequestUri(indexInTrackGroup, nextChunkIndex);
        if (this.cmcdConfiguration != null) {
            objectType = new CmcdData.Factory(this.cmcdConfiguration, this.trackSelection, Math.max(0L, j13), loadingInfo.playbackSpeed, CmcdData.Factory.STREAMING_FORMAT_SS, this.manifest.isLive, loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs), list.isEmpty()).setChunkDurationUs(chunkDurationUs - startTimeUs).setObjectType(CmcdData.Factory.getObjectType(this.trackSelection));
            int i14 = nextChunkIndex + 1;
            if (i14 < streamElement.chunkCount) {
                objectType.setNextObjectRequest(UriUtil.getRelativePath(uriBuildRequestUri, streamElement.buildRequestUri(indexInTrackGroup, i14)));
            }
        } else {
            objectType = null;
        }
        CmcdData.Factory factory = objectType;
        this.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
        chunkHolder.chunk = newMediaChunk(this.trackSelection.getSelectedFormat(), this.dataSource, uriBuildRequestUri, i13, startTimeUs, chunkDurationUs, j14, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), chunkExtractor, factory);
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

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z11, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.trackSelection), loadErrorInfo);
        if (!z11 || fallbackSelectionFor == null || fallbackSelectionFor.type != 2) {
            return false;
        }
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (ChunkExtractor chunkExtractor : this.chunkExtractors) {
            chunkExtractor.release();
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j11, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j11, chunk, list);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource
    public void updateManifest(SsManifest ssManifest) {
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        int i11 = this.streamElementIndex;
        SsManifest.StreamElement streamElement = streamElementArr[i11];
        int i12 = streamElement.chunkCount;
        SsManifest.StreamElement streamElement2 = ssManifest.streamElements[i11];
        if (i12 == 0 || streamElement2.chunkCount == 0) {
            this.currentManifestChunkOffset += i12;
        } else {
            int i13 = i12 - 1;
            long startTimeUs = streamElement.getStartTimeUs(i13) + streamElement.getChunkDurationUs(i13);
            long startTimeUs2 = streamElement2.getStartTimeUs(0);
            if (startTimeUs <= startTimeUs2) {
                this.currentManifestChunkOffset += i12;
            } else {
                this.currentManifestChunkOffset += streamElement.getChunkIndex(startTimeUs2);
            }
        }
        this.manifest = ssManifest;
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
    }
}
