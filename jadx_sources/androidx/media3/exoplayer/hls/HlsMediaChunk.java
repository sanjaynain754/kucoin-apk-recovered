package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UriUtil;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes34.dex */
final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;

    @Nullable
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;

    @Nullable
    private final DataSource initDataSource;

    @Nullable
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isPrimaryTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;

    @Nullable
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    private final PlayerId playerId;
    public final Uri playlistUrl;

    @Nullable
    private final HlsMediaChunkExtractor previousExtractor;
    private ImmutableList<Integer> sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z11, @Nullable DataSource dataSource2, @Nullable DataSpec dataSpec2, boolean z12, Uri uri, @Nullable List<Format> list, int i11, @Nullable Object obj, long j11, long j12, long j13, int i12, boolean z13, int i13, boolean z14, boolean z15, TimestampAdjuster timestampAdjuster, long j14, @Nullable DrmInitData drmInitData, @Nullable HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z16, PlayerId playerId) {
        super(dataSource, dataSpec, format, i11, obj, j11, j12, j13);
        this.mediaSegmentEncrypted = z11;
        this.partIndex = i12;
        this.isPublished = z13;
        this.discontinuitySequenceNumber = i13;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z12;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z15;
        this.timestampAdjuster = timestampAdjuster;
        this.timestampAdjusterInitializationTimeoutMs = j14;
        this.hasGapTag = z14;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z16;
        this.playerId = playerId;
        this.sampleQueueFirstSampleIndices = ImmutableList.m13439of();
        this.uid = uidSource.getAndIncrement();
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j11, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, @Nullable List<Format> list, int i11, @Nullable Object obj, boolean z11, TimestampAdjusterProvider timestampAdjusterProvider, long j12, @Nullable HlsMediaChunk hlsMediaChunk, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z12, PlayerId playerId, @Nullable CmcdData.Factory factory) {
        boolean z13;
        DataSource dataSourceBuildDataSource;
        DataSpec dataSpecBuild;
        boolean z14;
        Uri uri2;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        DataSpec dataSpecBuild2 = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        if (factory != null) {
            dataSpecBuild2 = factory.setChunkDurationUs(segmentBase.durationUs).createCmcdData().addToDataSpec(dataSpecBuild2);
        }
        DataSpec dataSpec = dataSpecBuild2;
        boolean z15 = bArr != null;
        DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, z15 ? getEncryptionIvArray((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z16 = bArr2 != null;
            byte[] encryptionIvArray = z16 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment.encryptionIV)) : null;
            z13 = true;
            dataSpecBuild = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url)).setPosition(segment.byteRangeOffset).setLength(segment.byteRangeLength).build();
            if (factory != null) {
                dataSpecBuild = factory.setObjectType("i").createCmcdData().addToDataSpec(dataSpecBuild);
            }
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray);
            z14 = z16;
        } else {
            z13 = true;
            dataSourceBuildDataSource = null;
            dataSpecBuild = null;
            z14 = false;
        }
        long j13 = j11 + segmentBase.relativeStartTimeUs;
        long j14 = j13 + segmentBase.durationUs;
        int i12 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            DataSpec dataSpec2 = hlsMediaChunk.initDataSpec;
            boolean z17 = (dataSpecBuild == dataSpec2 || (dataSpecBuild != null && dataSpec2 != null && dataSpecBuild.uri.equals(dataSpec2.uri) && dataSpecBuild.position == hlsMediaChunk.initDataSpec.position)) ? z13 : false;
            uri2 = uri;
            boolean z18 = (uri2.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) ? z13 : false;
            id3Decoder = hlsMediaChunk.id3Decoder;
            parsableByteArray = hlsMediaChunk.scratchId3Data;
            hlsMediaChunkExtractor = (z17 && z18 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i12) ? hlsMediaChunk.extractor : null;
        } else {
            uri2 = uri;
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpec, format, z15, dataSourceBuildDataSource, dataSpecBuild, z14, uri2, list, i11, obj, j13, j14, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i12, segmentBase.hasGapTag, z11, timestampAdjusterProvider.getAdjuster(i12), j12, segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z12, playerId);
    }

    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z11, boolean z12) throws IOException {
        DataSpec dataSpecSubrange;
        long position;
        long j11;
        boolean z13 = false;
        if (z11) {
            z13 = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange, z12);
            if (z13) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(defaultExtractorInputPrepareExtraction)) {
                try {
                    try {
                    } catch (EOFException e11) {
                        if ((this.trackFormat.roleFlags & 16384) == 0) {
                            throw e11;
                        }
                        this.extractor.onTruncatedSegmentParsed();
                        position = defaultExtractorInputPrepareExtraction.getPosition();
                        j11 = dataSpec.position;
                    }
                } catch (Throwable th2) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
                    throw th2;
                }
            }
            position = defaultExtractorInputPrepareExtraction.getPosition();
            j11 = dataSpec.position;
            this.nextLoadPosition = (int) (position - j11);
            DataSourceUtil.closeQuietly(dataSource);
        } catch (Throwable th3) {
            DataSourceUtil.closeQuietly(dataSource);
            throw th3;
        }
    }

    public static boolean shouldSpliceIn(@Nullable HlsMediaChunk hlsMediaChunk, Uri uri, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j11) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !isIndependent(segmentBaseHolder, hlsMediaPlaylist) || j11 + segmentBaseHolder.segmentBase.relativeStartTimeUs < hlsMediaChunk.endTimeUs;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    public void publish() {
        this.isPublished = true;
    }

    private static DataSource buildDataSource(DataSource dataSource, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        Assertions.checkNotNull(bArr2);
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        if (!(segmentBase instanceof HlsMediaPlaylist.Part)) {
            return hlsMediaPlaylist.hasIndependentSegments;
        }
        if (((HlsMediaPlaylist.Part) segmentBase).isIndependent) {
            return true;
        }
        return segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments;
    }

    private void loadMedia() throws IOException {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    private void maybeLoadInitData() throws IOException {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    public int getFirstSampleIndex(int i11) {
        Assertions.checkState(!this.shouldSpliceIn);
        if (i11 >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return this.sampleQueueFirstSampleIndices.get(i11).intValue();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, ImmutableList<Integer> immutableList) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = immutableList;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    private static byte[] getEncryptionIvArray(String str) {
        int length;
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            length = byteArray.length - 16;
        } else {
            length = 0;
        }
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws Throwable {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
            if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
                return C2711C.TIME_UNSET;
            }
            this.scratchId3Data.skipBytes(3);
            int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
            int i11 = synchSafeInt + 10;
            if (i11 > this.scratchId3Data.capacity()) {
                byte[] data = this.scratchId3Data.getData();
                this.scratchId3Data.reset(i11);
                System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
            }
            extractorInput.peekFully(this.scratchId3Data.getData(), 10, synchSafeInt);
            Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.getData(), synchSafeInt);
            if (metadataDecode == null) {
                return C2711C.TIME_UNSET;
            }
            int length = metadataDecode.length();
            for (int i12 = 0; i12 < length; i12++) {
                Metadata.Entry entry = metadataDecode.get(i12);
                if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                        this.scratchId3Data.setPosition(0);
                        this.scratchId3Data.setLimit(8);
                        return this.scratchId3Data.readLong() & 8589934591L;
                    }
                }
            }
            return C2711C.TIME_UNSET;
        } catch (EOFException unused) {
        }
    }

    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec, boolean z11) throws Throwable {
        HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jAdjustTsTimestamp;
        long jOpen = dataSource.open(dataSpec);
        if (z11) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e11) {
                throw new IOException(e11);
            }
        }
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
                defaultExtractorInput = defaultExtractorInput;
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                HlsSampleStreamWrapper hlsSampleStreamWrapper = this.output;
                if (jPeekId3PrivTimestamp != C2711C.TIME_UNSET) {
                    jAdjustTsTimestamp = this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp);
                } else {
                    jAdjustTsTimestamp = this.startTimeUs;
                }
                hlsSampleStreamWrapper.setSampleOffsetUs(jAdjustTsTimestamp);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }
}
