package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource;
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
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {
    private static final Set<Integer> MAPPABLE_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private final Callback callback;
    private final HlsChunkSource chunkSource;

    @Nullable
    private Format downstreamTrackFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @Nullable
    private DrmInitData drmInitData;
    private final DrmSessionManager drmSessionManager;
    private TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private final Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final ArrayList<HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private Chunk loadingChunk;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final ArrayList<HlsMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;

    @Nullable
    private final Format muxedAudioFormat;
    private final Runnable onTracksEndedRunnable;
    private Set<TrackGroup> optionalTrackGroups;
    private final Map<String, DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final List<HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private Set<Integer> sampleQueueMappingDoneByType;
    private HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;

    @Nullable
    private HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final String uid;
    private Format upstreamTrackFormat;
    private final Loader loader = new Loader("Loader:HlsSampleStreamWrapper");
    private final HlsChunkSource.HlsChunkHolder nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
    private int[] sampleQueueTrackIds = new int[0];

    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    public static class EmsgUnwrappingTrackOutput implements TrackOutput {
        private byte[] buffer;
        private int bufferPosition;
        private final TrackOutput delegate;
        private final Format delegateFormat;
        private final EventMessageDecoder emsgDecoder = new EventMessageDecoder();
        private Format format;
        private static final Format ID3_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();
        private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
            ensureBufferCapacity(this.bufferPosition + i11);
            int i13 = dataReader.read(this.buffer, this.bufferPosition, i11);
            if (i13 != -1) {
                this.bufferPosition += i13;
                return i13;
            }
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }

        private void ensureBufferCapacity(int i11) {
            byte[] bArr = this.buffer;
            if (bArr.length < i11) {
                this.buffer = Arrays.copyOf(bArr, i11 + (i11 / 2));
            }
        }

        private ParsableByteArray getSampleAndTrimBuffer(int i11, int i12) {
            int i13 = this.bufferPosition - i12;
            ParsableByteArray parsableByteArray = new ParsableByteArray(Arrays.copyOfRange(this.buffer, i13 - i11, i13));
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.bufferPosition = i12;
            return parsableByteArray;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(Format format) {
            this.format = format;
            this.delegate.format(this.delegateFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
            Assertions.checkNotNull(this.format);
            ParsableByteArray sampleAndTrimBuffer = getSampleAndTrimBuffer(i12, i13);
            if (!Util.areEqual(this.format.sampleMimeType, this.delegateFormat.sampleMimeType)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.format.sampleMimeType)) {
                    Log.m2961w(HlsSampleStreamWrapper.TAG, "Ignoring sample for unsupported format: " + this.format.sampleMimeType);
                    return;
                }
                EventMessage eventMessageDecode = this.emsgDecoder.decode(sampleAndTrimBuffer);
                if (!emsgContainsExpectedWrappedFormat(eventMessageDecode)) {
                    Log.m2961w(HlsSampleStreamWrapper.TAG, String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.delegateFormat.sampleMimeType, eventMessageDecode.getWrappedMetadataFormat()));
                    return;
                }
                sampleAndTrimBuffer = new ParsableByteArray((byte[]) Assertions.checkNotNull(eventMessageDecode.getWrappedMetadataBytes()));
            }
            int iBytesLeft = sampleAndTrimBuffer.bytesLeft();
            this.delegate.sampleData(sampleAndTrimBuffer, iBytesLeft);
            this.delegate.sampleMetadata(j11, i11, iBytesLeft, 0, cryptoData);
        }

        public EmsgUnwrappingTrackOutput(TrackOutput trackOutput, int i11) {
            this.delegate = trackOutput;
            if (i11 != 1) {
                if (i11 == 3) {
                    this.delegateFormat = EMSG_FORMAT;
                } else {
                    throw new IllegalArgumentException("Unknown metadataType: " + i11);
                }
            } else {
                this.delegateFormat = ID3_FORMAT;
            }
            this.buffer = new byte[0];
            this.bufferPosition = 0;
        }

        private boolean emsgContainsExpectedWrappedFormat(EventMessage eventMessage) {
            Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null && Util.areEqual(this.delegateFormat.sampleMimeType, wrappedMetadataFormat.sampleMimeType)) {
                return true;
            }
            return false;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
            ensureBufferCapacity(this.bufferPosition + i11);
            parsableByteArray.readBytes(this.buffer, this.bufferPosition, i11);
            this.bufferPosition += i11;
        }
    }

    public static final class HlsSampleQueue extends SampleQueue {

        @Nullable
        private DrmInitData drmInitData;
        private final Map<String, DrmInitData> overridingDrmInitData;

        @Nullable
        private Metadata getAdjustedMetadata(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int length = metadata.length();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                Metadata.Entry entry = metadata.get(i12);
                if ((entry instanceof PrivFrame) && HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((PrivFrame) entry).owner)) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return metadata;
            }
            if (length == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[length - 1];
            while (i11 < length) {
                if (i11 != i12) {
                    entryArr[i11 < i12 ? i11 : i11 - 1] = metadata.get(i11);
                }
                i11++;
            }
            return new Metadata(entryArr);
        }

        private HlsSampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map<String, DrmInitData> map) {
            super(allocator, drmSessionManager, eventDispatcher);
            this.overridingDrmInitData = map;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.drmInitData;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (drmInitData2 != null && (drmInitData = this.overridingDrmInitData.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata adjustedMetadata = getAdjustedMetadata(format.metadata);
            if (drmInitData2 != format.drmInitData || adjustedMetadata != format.metadata) {
                format = format.buildUpon().setDrmInitData(drmInitData2).setMetadata(adjustedMetadata).build();
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        public void setDrmInitData(@Nullable DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            invalidateUpstreamFormatAdjustment();
        }

        public void setSourceChunk(HlsMediaChunk hlsMediaChunk) {
            sourceId(hlsMediaChunk.uid);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
            super.sampleMetadata(j11, i11, i12, i13, cryptoData);
        }
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int i11) {
        for (int i12 = i11; i12 < this.mediaChunks.size(); i12++) {
            if (this.mediaChunks.get(i12).shouldSpliceIn) {
                return false;
            }
        }
        HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i11);
        for (int i13 = 0; i13 < this.sampleQueues.length; i13++) {
            if (this.sampleQueues[i13].getReadIndex() > hlsMediaChunk.getFirstSampleIndex(i13)) {
                return false;
            }
        }
        return true;
    }

    private TrackGroupArray createTrackGroupArrayWithDrmInfo(TrackGroup[] trackGroupArr) {
        for (int i11 = 0; i11 < trackGroupArr.length; i11++) {
            TrackGroup trackGroup = trackGroupArr[i11];
            Format[] formatArr = new Format[trackGroup.length];
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                Format format = trackGroup.getFormat(i12);
                formatArr[i12] = format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format));
            }
            trackGroupArr[i11] = new TrackGroup(trackGroup.f2793id, formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    private static int getTrackTypeScore(int i11) {
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    private void setIsPrepared() {
        this.prepared = true;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    public void maybeThrowError(int i11) throws IOException {
        maybeThrowError();
        this.sampleQueues[i11].maybeThrowError();
    }

    private void assertIsPrepared() {
        Assertions.checkState(this.prepared);
        Assertions.checkNotNull(this.trackGroups);
        Assertions.checkNotNull(this.optionalTrackGroups);
    }

    private void buildTracksFromSampleStreams() {
        Format format;
        int length = this.sampleQueues.length;
        int i11 = -2;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i13 >= length) {
                break;
            }
            String str = ((Format) Assertions.checkStateNotNull(this.sampleQueues[i13].getUpstreamFormat())).sampleMimeType;
            if (!MimeTypes.isVideo(str)) {
                i14 = MimeTypes.isAudio(str) ? 1 : MimeTypes.isText(str) ? 3 : -2;
            }
            if (getTrackTypeScore(i14) > getTrackTypeScore(i11)) {
                i12 = i13;
                i11 = i14;
            } else if (i14 == i11 && i12 != -1) {
                i12 = -1;
            }
            i13++;
        }
        TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i15 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i16 = 0; i16 < length; i16++) {
            this.trackGroupToSampleQueueIndex[i16] = i16;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        int i17 = 0;
        while (i17 < length) {
            Format format2 = (Format) Assertions.checkStateNotNull(this.sampleQueues[i17].getUpstreamFormat());
            if (i17 == i12) {
                Format[] formatArr = new Format[i15];
                for (int i18 = 0; i18 < i15; i18++) {
                    Format format3 = trackGroup.getFormat(i18);
                    if (i11 == 1 && (format = this.muxedAudioFormat) != null) {
                        format3 = format3.withManifestFormatInfo(format);
                    }
                    formatArr[i18] = i15 == 1 ? format2.withManifestFormatInfo(format3) : deriveFormat(format3, format2, true);
                }
                trackGroupArr[i17] = new TrackGroup(this.uid, formatArr);
                this.primaryTrackGroupIndex = i17;
            } else {
                Format format4 = (i11 == 2 && MimeTypes.isAudio(format2.sampleMimeType)) ? this.muxedAudioFormat : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.uid);
                sb2.append(":muxed:");
                sb2.append(i17 < i12 ? i17 : i17 - 1);
                trackGroupArr[i17] = new TrackGroup(sb2.toString(), deriveFormat(format4, format2, false));
            }
            i17++;
        }
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        Assertions.checkState(this.optionalTrackGroups == null);
        this.optionalTrackGroups = Collections.EMPTY_SET;
    }

    private static DiscardingTrackOutput createDiscardingTrackOutput(int i11, int i12) {
        Log.m2961w(TAG, "Unmapped track with id " + i11 + " of type " + i12);
        return new DiscardingTrackOutput();
    }

    private SampleQueue createSampleQueue(int i11, int i12) {
        int length = this.sampleQueues.length;
        boolean z11 = true;
        if (i12 != 1 && i12 != 2) {
            z11 = false;
        }
        HlsSampleQueue hlsSampleQueue = new HlsSampleQueue(this.allocator, this.drmSessionManager, this.drmEventDispatcher, this.overridingDrmInitData);
        hlsSampleQueue.setStartTimeUs(this.lastSeekPositionUs);
        if (z11) {
            hlsSampleQueue.setDrmInitData(this.drmInitData);
        }
        hlsSampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        HlsMediaChunk hlsMediaChunk = this.sourceChunk;
        if (hlsMediaChunk != null) {
            hlsSampleQueue.setSourceChunk(hlsMediaChunk);
        }
        hlsSampleQueue.setUpstreamFormatChangeListener(this);
        int i13 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.sampleQueueTrackIds, i13);
        this.sampleQueueTrackIds = iArrCopyOf;
        iArrCopyOf[length] = i11;
        this.sampleQueues = (HlsSampleQueue[]) Util.nullSafeArrayAppend(this.sampleQueues, hlsSampleQueue);
        boolean[] zArrCopyOf = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i13);
        this.sampleQueueIsAudioVideoFlags = zArrCopyOf;
        zArrCopyOf[length] = z11;
        this.haveAudioVideoSampleQueues |= z11;
        this.sampleQueueMappingDoneByType.add(Integer.valueOf(i12));
        this.sampleQueueIndicesByType.append(i12, length);
        if (getTrackTypeScore(i12) > getTrackTypeScore(this.primarySampleQueueType)) {
            this.primarySampleQueueIndex = length;
            this.primarySampleQueueType = i12;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i13);
        return hlsSampleQueue;
    }

    private static Format deriveFormat(@Nullable Format format, Format format2, boolean z11) {
        String codecsCorrespondingToMimeType;
        String mediaMimeType;
        if (format == null) {
            return format2;
        }
        int trackType = MimeTypes.getTrackType(format2.sampleMimeType);
        if (Util.getCodecCountOfType(format.codecs, trackType) == 1) {
            codecsCorrespondingToMimeType = Util.getCodecsOfType(format.codecs, trackType);
            mediaMimeType = MimeTypes.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = MimeTypes.getCodecsCorrespondingToMimeType(format.codecs, format2.sampleMimeType);
            mediaMimeType = format2.sampleMimeType;
        }
        Format.Builder codecs = format2.buildUpon().setId(format.f2788id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setAverageBitrate(z11 ? format.averageBitrate : -1).setPeakBitrate(z11 ? format.peakBitrate : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
        }
        if (mediaMimeType != null) {
            codecs.setSampleMimeType(mediaMimeType);
        }
        int i11 = format.channelCount;
        if (i11 != -1 && trackType == 1) {
            codecs.setChannelCount(i11);
        }
        Metadata metadataCopyWithAppendedEntriesFrom = format.metadata;
        if (metadataCopyWithAppendedEntriesFrom != null) {
            Metadata metadata = format2.metadata;
            if (metadata != null) {
                metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
            }
            codecs.setMetadata(metadataCopyWithAppendedEntriesFrom);
        }
        return codecs.build();
    }

    private void discardUpstream(int i11) {
        Assertions.checkState(!this.loader.isLoading());
        while (true) {
            if (i11 >= this.mediaChunks.size()) {
                i11 = -1;
                break;
            } else if (canDiscardUpstreamMediaChunksFromIndex(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = getLastMediaChunk().endTimeUs;
        HlsMediaChunk hlsMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i11);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        } else {
            ((HlsMediaChunk) Iterables.getLast(this.mediaChunks)).invalidateExtractor();
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primarySampleQueueType, hlsMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j11);
    }

    private HlsMediaChunk discardUpstreamMediaChunksFromIndex(int i11) {
        HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i11);
        ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i11, arrayList.size());
        for (int i12 = 0; i12 < this.sampleQueues.length; i12++) {
            this.sampleQueues[i12].discardUpstreamSamples(hlsMediaChunk.getFirstSampleIndex(i12));
        }
        return hlsMediaChunk;
    }

    private boolean finishedReadingChunk(HlsMediaChunk hlsMediaChunk) {
        int i11 = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.sampleQueuesEnabledStates[i12] && this.sampleQueues[i12].peekSourceId() == i11) {
                return false;
            }
        }
        return true;
    }

    private static boolean formatsMatch(Format format, Format format2) {
        String str = format.sampleMimeType;
        String str2 = format2.sampleMimeType;
        int trackType = MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == MimeTypes.getTrackType(str2);
        }
        if (Util.areEqual(str, str2)) {
            return !(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || format.accessibilityChannel == format2.accessibilityChannel;
        }
        return false;
    }

    private HlsMediaChunk getLastMediaChunk() {
        ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    private TrackOutput getMappedTrackOutput(int i11, int i12) {
        Assertions.checkArgument(MAPPABLE_TYPES.contains(Integer.valueOf(i12)));
        int i13 = this.sampleQueueIndicesByType.get(i12, -1);
        if (i13 == -1) {
            return null;
        }
        if (this.sampleQueueMappingDoneByType.add(Integer.valueOf(i12))) {
            this.sampleQueueTrackIds[i13] = i11;
        }
        return this.sampleQueueTrackIds[i13] == i11 ? this.sampleQueues[i13] : createDiscardingTrackOutput(i11, i12);
    }

    private void initMediaChunkLoad(HlsMediaChunk hlsMediaChunk) {
        this.sourceChunk = hlsMediaChunk;
        this.upstreamTrackFormat = hlsMediaChunk.trackFormat;
        this.pendingResetPositionUs = C2711C.TIME_UNSET;
        this.mediaChunks.add(hlsMediaChunk);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            builder.add(Integer.valueOf(hlsSampleQueue.getWriteIndex()));
        }
        hlsMediaChunk.init(this, builder.build());
        for (HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
            hlsSampleQueue2.setSourceChunk(hlsMediaChunk);
            if (hlsMediaChunk.shouldSpliceIn) {
                hlsSampleQueue2.splice();
            }
        }
    }

    private static boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof HlsMediaChunk;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C2711C.TIME_UNSET;
    }

    private void mapSampleQueuesToMatchTrackGroups() {
        int i11 = this.trackGroups.length;
        int[] iArr = new int[i11];
        this.trackGroupToSampleQueueIndex = iArr;
        Arrays.fill(iArr, -1);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            while (true) {
                HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                if (i13 >= hlsSampleQueueArr.length) {
                    break;
                }
                if (formatsMatch((Format) Assertions.checkStateNotNull(hlsSampleQueueArr[i13].getUpstreamFormat()), this.trackGroups.get(i12).getFormat(0))) {
                    this.trackGroupToSampleQueueIndex[i12] = i13;
                    break;
                }
                i13++;
            }
        }
        Iterator<HlsSampleStream> it = this.hlsSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().bindSampleQueue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                if (hlsSampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            setIsPrepared();
            this.callback.onPrepared();
        }
    }

    private void resetSampleQueues() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    private boolean seekInsideBufferUs(long j11, @Nullable HlsMediaChunk hlsMediaChunk) {
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            HlsSampleQueue hlsSampleQueue = this.sampleQueues[i11];
            if (!(hlsMediaChunk != null ? hlsSampleQueue.seekTo(hlsMediaChunk.getFirstSampleIndex(i11)) : hlsSampleQueue.seekTo(j11, false)) && (this.sampleQueueIsAudioVideoFlags[i11] || !this.haveAudioVideoSampleQueues)) {
                return false;
            }
        }
        return true;
    }

    private void updateSampleStreams(SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((HlsSampleStream) sampleStream);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        List<HlsMediaChunk> list;
        long jMax;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        if (isPendingReset()) {
            list = Collections.EMPTY_LIST;
            jMax = this.pendingResetPositionUs;
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
        } else {
            list = this.readOnlyMediaChunks;
            HlsMediaChunk lastMediaChunk = getLastMediaChunk();
            jMax = lastMediaChunk.isLoadCompleted() ? lastMediaChunk.endTimeUs : Math.max(this.lastSeekPositionUs, lastMediaChunk.startTimeUs);
        }
        List<HlsMediaChunk> list2 = list;
        long j11 = jMax;
        this.nextChunkHolder.clear();
        this.chunkSource.getNextChunk(loadingInfo, j11, list2, this.prepared || !list2.isEmpty(), this.nextChunkHolder);
        HlsChunkSource.HlsChunkHolder hlsChunkHolder = this.nextChunkHolder;
        boolean z11 = hlsChunkHolder.endOfStream;
        Chunk chunk = hlsChunkHolder.chunk;
        Uri uri = hlsChunkHolder.playlistUrl;
        if (z11) {
            this.pendingResetPositionUs = C2711C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            if (uri != null) {
                this.callback.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (isMediaChunk(chunk)) {
            initMediaChunkLoad((HlsMediaChunk) chunk);
        }
        this.loadingChunk = chunk;
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
    }

    public void discardBuffer(long j11, boolean z11) {
        if (!this.sampleQueuesBuilt || isPendingReset()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.sampleQueues[i11].discardTo(j11, z11, this.sampleQueuesEnabledStates[i11]);
        }
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
        HlsMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
                lastMediaChunk = arrayList.get(arrayList.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                jMax = Math.max(jMax, hlsSampleQueue.getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.primaryTrackGroupIndex;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isVideoSampleStream() {
        return this.primarySampleQueueType == 2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j11, long j12, boolean z11) {
        this.loadingChunk = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z11) {
            return;
        }
        if (isPendingReset() || this.enabledTrackGroupCount == 0) {
            resetSampleQueues();
        }
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j11, long j12) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (this.prepared) {
            this.callback.onContinueLoadingRequested(this);
        } else {
            continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk chunk, long j11, long j12, IOException iOException, int i11) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        int i12;
        boolean zIsMediaChunk = isMediaChunk(chunk);
        if (zIsMediaChunk && !((HlsMediaChunk) chunk).isPublished() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i12 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i12 == 404)) {
            return Loader.RETRY;
        }
        long jBytesLoaded = chunk.bytesLoaded();
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j11, j12, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, Util.usToMs(chunk.startTimeUs), Util.usToMs(chunk.endTimeUs)), iOException, i11);
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo);
        boolean zMaybeExcludeTrack = (fallbackSelectionFor == null || fallbackSelectionFor.type != 2) ? false : this.chunkSource.maybeExcludeTrack(chunk, fallbackSelectionFor.exclusionDurationMs);
        if (zMaybeExcludeTrack) {
            if (zIsMediaChunk && jBytesLoaded == 0) {
                ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
                Assertions.checkState(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                } else {
                    ((HlsMediaChunk) Iterables.getLast(this.mediaChunks)).invalidateExtractor();
                }
            }
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != C2711C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean zIsRetry = loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        }
        if (zMaybeExcludeTrack) {
            if (!this.prepared) {
                continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
                return loadErrorAction;
            }
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.release();
        }
    }

    public void onNewExtractor() {
        this.sampleQueueMappingDoneByType.clear();
    }

    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z11) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!this.chunkSource.obtainsChunksForPlaylist(uri)) {
            return true;
        }
        long j11 = (z11 || (fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo)) == null || fallbackSelectionFor.type != 2) ? -9223372036854775807L : fallbackSelectionFor.exclusionDurationMs;
        return this.chunkSource.onPlaylistError(uri, j11) && j11 != C2711C.TIME_UNSET;
    }

    public void onPlaylistUpdated() {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        final HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) Iterables.getLast(this.mediaChunks);
        int chunkPublicationState = this.chunkSource.getChunkPublicationState(hlsMediaChunk);
        if (chunkPublicationState == 1) {
            hlsMediaChunk.publish();
            return;
        }
        if (chunkPublicationState == 0) {
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3232b.callback.onPlaylistRefreshRequired(hlsMediaChunk.playlistUrl);
                }
            });
        } else if (chunkPublicationState == 2 && !this.loadingFinished && this.loader.isLoading()) {
            this.loader.cancelLoading();
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            Assertions.checkNotNull(this.loadingChunk);
            if (this.chunkSource.shouldCancelLoad(j11, this.loadingChunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                return;
            }
            return;
        }
        int size = this.readOnlyMediaChunks.size();
        while (size > 0 && this.chunkSource.getChunkPublicationState(this.readOnlyMediaChunks.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.readOnlyMediaChunks.size()) {
            discardUpstream(size);
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j11, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
    }

    public void release() {
        if (this.prepared) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.preRelease();
            }
        }
        this.chunkSource.reset();
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    public boolean seekToUs(long j11, boolean z11) {
        HlsMediaChunk hlsMediaChunk;
        this.lastSeekPositionUs = j11;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j11;
            return true;
        }
        if (!this.chunkSource.hasIndependentSegments()) {
            hlsMediaChunk = null;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.mediaChunks.size()) {
                hlsMediaChunk = null;
                break;
            }
            hlsMediaChunk = this.mediaChunks.get(i11);
            if (hlsMediaChunk.startTimeUs == j11) {
                break;
            }
            i11++;
        }
        if (this.sampleQueuesBuilt && !z11 && seekInsideBufferUs(j11, hlsMediaChunk)) {
            return false;
        }
        this.pendingResetPositionUs = j11;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            if (this.sampleQueuesBuilt) {
                for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                    hlsSampleQueue.discardToEnd();
                }
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            resetSampleQueues();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    public boolean selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11, boolean z11) {
        boolean z12;
        assertIsPrepared();
        int i11 = this.enabledTrackGroupCount;
        int i12 = 0;
        for (int i13 = 0; i13 < exoTrackSelectionArr.length; i13++) {
            HlsSampleStream hlsSampleStream = (HlsSampleStream) sampleStreamArr[i13];
            if (hlsSampleStream != null && (exoTrackSelectionArr[i13] == null || !zArr[i13])) {
                this.enabledTrackGroupCount--;
                hlsSampleStream.unbindSampleQueue();
                sampleStreamArr[i13] = null;
            }
        }
        boolean z13 = z11 || (!this.seenFirstTrackSelection ? j11 == this.lastSeekPositionUs : i11 != 0);
        ExoTrackSelection trackSelection = this.chunkSource.getTrackSelection();
        boolean z14 = z13;
        ExoTrackSelection exoTrackSelection = trackSelection;
        for (int i14 = 0; i14 < exoTrackSelectionArr.length; i14++) {
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i14];
            if (exoTrackSelection2 != null) {
                int iIndexOf = this.trackGroups.indexOf(exoTrackSelection2.getTrackGroup());
                if (iIndexOf == this.primaryTrackGroupIndex) {
                    this.chunkSource.setTrackSelection(exoTrackSelection2);
                    exoTrackSelection = exoTrackSelection2;
                }
                if (sampleStreamArr[i14] == null) {
                    this.enabledTrackGroupCount++;
                    HlsSampleStream hlsSampleStream2 = new HlsSampleStream(this, iIndexOf);
                    sampleStreamArr[i14] = hlsSampleStream2;
                    zArr2[i14] = true;
                    if (this.trackGroupToSampleQueueIndex != null) {
                        hlsSampleStream2.bindSampleQueue();
                        if (!z14) {
                            HlsSampleQueue hlsSampleQueue = this.sampleQueues[this.trackGroupToSampleQueueIndex[iIndexOf]];
                            z14 = (hlsSampleQueue.getReadIndex() == 0 || hlsSampleQueue.seekTo(j11, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.enabledTrackGroupCount == 0) {
            this.chunkSource.reset();
            this.downstreamTrackFormat = null;
            this.pendingResetUpstreamFormats = true;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                if (this.sampleQueuesBuilt) {
                    HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                    int length = hlsSampleQueueArr.length;
                    while (i12 < length) {
                        hlsSampleQueueArr[i12].discardToEnd();
                        i12++;
                    }
                }
                this.loader.cancelLoading();
            } else {
                resetSampleQueues();
            }
        } else {
            if (this.mediaChunks.isEmpty() || Util.areEqual(exoTrackSelection, trackSelection)) {
                z12 = z11;
            } else {
                if (!this.seenFirstTrackSelection) {
                    long j12 = j11 < 0 ? -j11 : 0L;
                    HlsMediaChunk lastMediaChunk = getLastMediaChunk();
                    ExoTrackSelection exoTrackSelection3 = exoTrackSelection;
                    exoTrackSelection3.updateSelectedTrack(j11, j12, C2711C.TIME_UNSET, this.readOnlyMediaChunks, this.chunkSource.createMediaChunkIterators(lastMediaChunk, j11));
                    if (exoTrackSelection3.getSelectedIndexInTrackGroup() == this.chunkSource.getTrackGroup().indexOf(lastMediaChunk.trackFormat)) {
                        z12 = z11;
                    }
                }
                this.pendingResetUpstreamFormats = true;
                z12 = true;
                z14 = true;
            }
            if (z14) {
                seekToUs(j11, z12);
                while (i12 < sampleStreamArr.length) {
                    if (sampleStreamArr[i12] != null) {
                        zArr2[i12] = true;
                    }
                    i12++;
                }
            }
        }
        updateSampleStreams(sampleStreamArr);
        this.seenFirstTrackSelection = true;
        return z14;
    }

    public void setDrmInitData(@Nullable DrmInitData drmInitData) {
        if (Util.areEqual(this.drmInitData, drmInitData)) {
            return;
        }
        this.drmInitData = drmInitData;
        int i11 = 0;
        while (true) {
            HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
            if (i11 >= hlsSampleQueueArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i11]) {
                hlsSampleQueueArr[i11].setDrmInitData(drmInitData);
            }
            i11++;
        }
    }

    public void setIsPrimaryTimestampSource(boolean z11) {
        this.chunkSource.setIsPrimaryTimestampSource(z11);
    }

    public void setSampleOffsetUs(long j11) {
        if (this.sampleOffsetUs != j11) {
            this.sampleOffsetUs = j11;
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setSampleOffsetUs(j11);
            }
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        TrackOutput trackOutputCreateSampleQueue;
        if (!MAPPABLE_TYPES.contains(Integer.valueOf(i12))) {
            int i13 = 0;
            while (true) {
                TrackOutput[] trackOutputArr = this.sampleQueues;
                if (i13 >= trackOutputArr.length) {
                    trackOutputCreateSampleQueue = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i13] == i11) {
                    trackOutputCreateSampleQueue = trackOutputArr[i13];
                    break;
                }
                i13++;
            }
        } else {
            trackOutputCreateSampleQueue = getMappedTrackOutput(i11, i12);
        }
        if (trackOutputCreateSampleQueue == null) {
            if (this.tracksEnded) {
                return createDiscardingTrackOutput(i11, i12);
            }
            trackOutputCreateSampleQueue = createSampleQueue(i11, i12);
        }
        if (i12 != 5) {
            return trackOutputCreateSampleQueue;
        }
        if (this.emsgUnwrappingTrackOutput == null) {
            this.emsgUnwrappingTrackOutput = new EmsgUnwrappingTrackOutput(trackOutputCreateSampleQueue, this.metadataType);
        }
        return this.emsgUnwrappingTrackOutput;
    }

    public HlsSampleStreamWrapper(String str, int i11, Callback callback, HlsChunkSource hlsChunkSource, Map<String, DrmInitData> map, Allocator allocator, long j11, @Nullable Format format, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, int i12) {
        this.uid = str;
        this.trackType = i11;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.overridingDrmInitData = map;
        this.allocator = allocator;
        this.muxedAudioFormat = format;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.metadataType = i12;
        Set<Integer> set = MAPPABLE_TYPES;
        this.sampleQueueMappingDoneByType = new HashSet(set.size());
        this.sampleQueueIndicesByType = new SparseIntArray(set.size());
        this.sampleQueues = new HlsSampleQueue[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        ArrayList<HlsMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        this.hlsSampleStreams = new ArrayList<>();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: androidx.media3.exoplayer.hls.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f3234b.maybeFinishPrepare();
            }
        };
        this.onTracksEndedRunnable = new Runnable() { // from class: androidx.media3.exoplayer.hls.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f3235b.onTracksEnded();
            }
        };
        this.handler = Util.createHandlerForCurrentLooper();
        this.lastSeekPositionUs = j11;
        this.pendingResetPositionUs = j11;
    }

    public int bindSampleQueueToSampleStream(int i11) {
        assertIsPrepared();
        Assertions.checkNotNull(this.trackGroupToSampleQueueIndex);
        int i12 = this.trackGroupToSampleQueueIndex[i11];
        if (i12 == -1) {
            if (!this.optionalTrackGroups.contains(this.trackGroups.get(i11))) {
                return -2;
            }
            return -3;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i12]) {
            return -2;
        }
        zArr[i12] = true;
        return i12;
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

    public TrackGroupArray getTrackGroups() {
        assertIsPrepared();
        return this.trackGroups;
    }

    public boolean isReady(int i11) {
        if (!isPendingReset() && this.sampleQueues[i11].isReady(this.loadingFinished)) {
            return true;
        }
        return false;
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    public void prepareWithMultivariantPlaylistInfo(TrackGroup[] trackGroupArr, int i11, int... iArr) {
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        this.optionalTrackGroups = new HashSet();
        for (int i12 : iArr) {
            this.optionalTrackGroups.add(this.trackGroups.get(i12));
        }
        this.primaryTrackGroupIndex = i11;
        Handler handler = this.handler;
        final Callback callback = this.callback;
        Objects.requireNonNull(callback);
        handler.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.e
            @Override // java.lang.Runnable
            public final void run() {
                callback.onPrepared();
            }
        });
        setIsPrepared();
    }

    public int readData(int i11, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i12) {
        Format format;
        if (isPendingReset()) {
            return -3;
        }
        int i13 = 0;
        if (!this.mediaChunks.isEmpty()) {
            int i14 = 0;
            while (i14 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i14))) {
                i14++;
            }
            Util.removeRange(this.mediaChunks, 0, i14);
            HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(0);
            Format format2 = hlsMediaChunk.trackFormat;
            if (!format2.equals(this.downstreamTrackFormat)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(this.trackType, format2, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = format2;
        }
        if (!this.mediaChunks.isEmpty() && !this.mediaChunks.get(0).isPublished()) {
            return -3;
        }
        int i15 = this.sampleQueues[i11].read(formatHolder, decoderInputBuffer, i12, this.loadingFinished);
        if (i15 == -5) {
            Format formatWithManifestFormatInfo = (Format) Assertions.checkNotNull(formatHolder.format);
            if (i11 == this.primarySampleQueueIndex) {
                int iCheckedCast = Ints.checkedCast(this.sampleQueues[i11].peekSourceId());
                while (i13 < this.mediaChunks.size() && this.mediaChunks.get(i13).uid != iCheckedCast) {
                    i13++;
                }
                if (i13 < this.mediaChunks.size()) {
                    format = this.mediaChunks.get(i13).trackFormat;
                } else {
                    format = (Format) Assertions.checkNotNull(this.upstreamTrackFormat);
                }
                formatWithManifestFormatInfo = formatWithManifestFormatInfo.withManifestFormatInfo(format);
            }
            formatHolder.format = formatWithManifestFormatInfo;
        }
        return i15;
    }

    public int skipData(int i11, long j11) throws Throwable {
        if (isPendingReset()) {
            return 0;
        }
        HlsSampleQueue hlsSampleQueue = this.sampleQueues[i11];
        int skipCount = hlsSampleQueue.getSkipCount(j11, this.loadingFinished);
        HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) Iterables.getLast(this.mediaChunks, null);
        if (hlsMediaChunk != null && !hlsMediaChunk.isPublished()) {
            skipCount = Math.min(skipCount, hlsMediaChunk.getFirstSampleIndex(i11) - hlsSampleQueue.getReadIndex());
        }
        hlsSampleQueue.skip(skipCount);
        return skipCount;
    }

    public void unbindSampleQueue(int i11) {
        assertIsPrepared();
        Assertions.checkNotNull(this.trackGroupToSampleQueueIndex);
        int i12 = this.trackGroupToSampleQueueIndex[i11];
        Assertions.checkState(this.sampleQueuesEnabledStates[i12]);
        this.sampleQueuesEnabledStates[i12] = false;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }
}
