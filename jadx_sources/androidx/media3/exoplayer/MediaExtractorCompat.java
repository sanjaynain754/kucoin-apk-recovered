package androidx.media3.exoplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaDataSource;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDescriptorDataSource;
import androidx.media3.datasource.MediaDataSourceAdapter;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mp4.Mp4Extractor;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class MediaExtractorCompat {
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private static final String TAG = "MediaExtractorCompat";
    private final Allocator allocator;

    @Nullable
    private DataSource currentDataSource;

    @Nullable
    private Extractor currentExtractor;

    @Nullable
    private ExtractorInput currentExtractorInput;
    private final DataSource.Factory dataSourceFactory;
    private final ExtractorsFactory extractorsFactory;
    private final FormatHolder formatHolder;
    private boolean hasBeenPrepared;

    @Nullable
    private Map<String, String> httpRequestHeaders;
    private final DecoderInputBuffer noDataBuffer;
    private long offsetInCurrentFile;

    @Nullable
    private SeekPoint pendingSeek;
    private final PositionHolder positionHolder;
    private final DecoderInputBuffer sampleHolderWithBufferReplacementDirect;
    private final DecoderInputBuffer sampleHolderWithBufferReplacementDisabled;
    private final SparseArray<MediaExtractorSampleQueue> sampleQueues;

    @Nullable
    private SeekMap seekMap;
    private final Set<Integer> selectedTrackIndices;
    private final ArrayDeque<Integer> trackIndicesPerSampleInQueuedOrder;
    private final ArrayList<MediaExtractorTrack> tracks;
    private boolean tracksEnded;
    private int upstreamFormatsCount;

    public final class ExtractorOutputImpl implements ExtractorOutput {
        private ExtractorOutputImpl() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaExtractorCompat.this.tracksEnded = true;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            MediaExtractorCompat.this.seekMap = seekMap;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i11, int i12) {
            MediaExtractorSampleQueue mediaExtractorSampleQueue = (MediaExtractorSampleQueue) MediaExtractorCompat.this.sampleQueues.get(i11);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (MediaExtractorCompat.this.tracksEnded) {
                return new DiscardingTrackOutput();
            }
            MediaExtractorCompat mediaExtractorCompat = MediaExtractorCompat.this;
            MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompat.new MediaExtractorSampleQueue(mediaExtractorCompat.allocator, i11);
            MediaExtractorCompat.this.sampleQueues.put(i11, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }
    }

    public final class MediaExtractorSampleQueue extends SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public final int trackId;

        public MediaExtractorSampleQueue(Allocator allocator, int i11) {
            super(allocator, null, null);
            this.trackId = i11;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        public void setCompatibilityTrackIndex(int i11) {
            this.compatibilityTrackIndex = i11;
        }

        public void setMainTrackIndex(int i11) {
            this.mainTrackIndex = i11;
        }

        public String toString() {
            return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Integer.valueOf(this.trackId), Integer.valueOf(this.mainTrackIndex), Integer.valueOf(this.compatibilityTrackIndex));
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            if (getUpstreamFormat() == null) {
                MediaExtractorCompat.this.onSampleQueueFormatInitialized(this, format);
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
            boolean z11;
            int i14 = i11 & (-536870913);
            if (this.mainTrackIndex != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkState(z11);
            int writeIndex = getWriteIndex();
            super.sampleMetadata(j11, i14, i12, i13, cryptoData);
            if (getWriteIndex() == writeIndex + 1) {
                if (this.compatibilityTrackIndex != -1) {
                    MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.compatibilityTrackIndex));
                }
                MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.mainTrackIndex));
            }
        }
    }

    public static final class MediaExtractorTrack {

        @Nullable
        public final String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final MediaExtractorSampleQueue sampleQueue;

        private MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z11, @Nullable String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z11;
            this.compatibilityTrackMimeType = str;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public String toString() {
            return String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.sampleQueue, Boolean.valueOf(this.isCompatibilityTrack), this.compatibilityTrackMimeType);
        }

        public MediaFormat createDownstreamMediaFormat(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer) {
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, decoderInputBuffer, 2, false);
            MediaFormat mediaFormatCreateMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat((Format) Assertions.checkNotNull(formatHolder.format));
            formatHolder.clear();
            if (this.compatibilityTrackMimeType != null) {
                if (Util.SDK_INT >= 29) {
                    mediaFormatCreateMediaFormatFromFormat.removeKey("codecs-string");
                }
                mediaFormatCreateMediaFormatFromFormat.setString("mime", this.compatibilityTrackMimeType);
            }
            return mediaFormatCreateMediaFormatFromFormat;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(Context context) {
        this(new DefaultExtractorsFactory(), new DefaultDataSource.Factory(context));
    }

    public void release() {
        for (int i11 = 0; i11 < this.sampleQueues.size(); i11++) {
            this.sampleQueues.valueAt(i11).release();
        }
        this.sampleQueues.clear();
        Extractor extractor = this.currentExtractor;
        if (extractor != null) {
            extractor.release();
            this.currentExtractor = null;
        }
        this.currentExtractorInput = null;
        this.pendingSeek = null;
        DataSourceUtil.closeQuietly(this.currentDataSource);
        this.currentDataSource = null;
    }

    public void setDataSource(Uri uri, long j11) throws IOException {
        prepareDataSource(this.dataSourceFactory.createDataSource(), buildDataSpec(uri, j11));
    }

    public MediaExtractorCompat(ExtractorsFactory extractorsFactory, DataSource.Factory factory) {
        this.extractorsFactory = extractorsFactory;
        this.dataSourceFactory = factory;
        this.positionHolder = new PositionHolder();
        this.allocator = new DefaultAllocator(true, 65536);
        this.tracks = new ArrayList<>();
        this.sampleQueues = new SparseArray<>();
        this.trackIndicesPerSampleInQueuedOrder = new ArrayDeque<>();
        this.formatHolder = new FormatHolder();
        this.sampleHolderWithBufferReplacementDisabled = new DecoderInputBuffer(0);
        this.sampleHolderWithBufferReplacementDirect = new DecoderInputBuffer(2);
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.selectedTrackIndices = new HashSet();
    }

    private boolean advanceToSampleOrEndOfInput() {
        try {
            maybeResolvePendingSeek();
            boolean z11 = false;
            while (true) {
                if (this.trackIndicesPerSampleInQueuedOrder.isEmpty()) {
                    if (z11) {
                        return false;
                    }
                    try {
                        int i11 = ((Extractor) Assertions.checkNotNull(this.currentExtractor)).read((ExtractorInput) Assertions.checkNotNull(this.currentExtractorInput), this.positionHolder);
                        if (i11 == -1) {
                            z11 = true;
                        } else if (i11 == 1) {
                            this.currentExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
                        }
                    } catch (Exception | OutOfMemoryError e11) {
                        Log.m2962w(TAG, "Treating exception as the end of input.", e11);
                    }
                } else {
                    if (this.selectedTrackIndices.contains(this.trackIndicesPerSampleInQueuedOrder.peekFirst())) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (IOException e12) {
            Log.m2962w(TAG, "Treating exception as the end of input.", e12);
            return false;
        }
    }

    private DataSpec buildDataSpec(Uri uri, long j11) {
        DataSpec.Builder flags = new DataSpec.Builder().setUri(uri).setPosition(j11).setFlags(6);
        Map<String, String> map = this.httpRequestHeaders;
        if (map != null) {
            flags.setHttpRequestHeaders(map);
        }
        return flags.build();
    }

    private void maybeResolvePendingSeek() throws IOException {
        SeekPoint seekPoint = this.pendingSeek;
        if (seekPoint == null) {
            return;
        }
        SeekPoint seekPoint2 = (SeekPoint) Assertions.checkNotNull(seekPoint);
        ((Extractor) Assertions.checkNotNull(this.currentExtractor)).seek(seekPoint2.position, seekPoint2.timeUs);
        this.currentExtractorInput = reopenCurrentDataSource(seekPoint2.position);
        this.pendingSeek = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(MediaExtractorSampleQueue mediaExtractorSampleQueue, Format format) {
        boolean z11 = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        Object[] objArr = 0;
        this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, z11, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(DecoderInputBuffer decoderInputBuffer, boolean z11) {
        MediaExtractorSampleQueue mediaExtractorSampleQueue = this.tracks.get(((Integer) Assertions.checkNotNull(this.trackIndicesPerSampleInQueuedOrder.peekFirst())).intValue()).sampleQueue;
        int i11 = (z11 ? 4 : 0) | 1;
        int i12 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i11, false);
        if (i12 == -5) {
            i12 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i11, false);
        }
        this.formatHolder.clear();
        Assertions.checkState(i12 == -4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void prepareDataSource(DataSource dataSource, DataSpec dataSpec) throws IOException {
        int i11;
        Assertions.checkState(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = dataSpec.position;
        this.currentDataSource = dataSource;
        ExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.currentDataSource, 0L, dataSource.open(dataSpec));
        Extractor extractorSelectExtractor = selectExtractor(defaultExtractorInput);
        Throwable e11 = null;
        extractorSelectExtractor.init(new ExtractorOutputImpl());
        boolean z11 = true;
        while (z11) {
            try {
                i11 = extractorSelectExtractor.read(defaultExtractorInput, this.positionHolder);
            } catch (Exception | OutOfMemoryError e12) {
                e11 = e12;
                i11 = -1;
            }
            boolean z12 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (e11 != null || (z12 && i11 == -1)) {
                release();
                throw ParserException.createForMalformedContainer(e11 != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e11);
            }
            if (i11 == 1) {
                defaultExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
            }
            z11 = z12;
        }
        this.currentExtractorInput = defaultExtractorInput;
        this.currentExtractor = extractorSelectExtractor;
    }

    private ExtractorInput reopenCurrentDataSource(long j11) throws IOException {
        DataSource dataSource = (DataSource) Assertions.checkNotNull(this.currentDataSource);
        Uri uri = (Uri) Assertions.checkNotNull(dataSource.getUri());
        DataSourceUtil.closeQuietly(dataSource);
        long jOpen = dataSource.open(buildDataSpec(uri, this.offsetInCurrentFile + j11));
        if (jOpen != -1) {
            jOpen += j11;
        }
        return new DefaultExtractorInput(dataSource, j11, jOpen);
    }

    private Extractor selectExtractor(ExtractorInput extractorInput) throws IOException {
        Extractor extractor;
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors();
        int length = extractorArrCreateExtractors.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                extractor = null;
                break;
            }
            extractor = extractorArrCreateExtractors[i11];
            try {
                if (extractor.sniff(extractorInput)) {
                    extractorInput.resetPeekPosition();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                extractorInput.resetPeekPosition();
                throw th2;
            }
            extractorInput.resetPeekPosition();
            i11++;
        }
        if (extractor != null) {
            return extractor;
        }
        throw new UnrecognizedInputFormatException("None of the available extractors (" + Joiner.m13373on(", ").join(Lists.transform(ImmutableList.copyOf(extractorArrCreateExtractors), new Function() { // from class: androidx.media3.exoplayer.s2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
            }
        })) + ") could read the stream.", (Uri) Assertions.checkNotNull(((DataSource) Assertions.checkNotNull(this.currentDataSource)).getUri()), ImmutableList.m13439of());
    }

    private void skipOneSample() {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.trackIndicesPerSampleInQueuedOrder.removeFirst().intValue());
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    @VisibleForTesting(otherwise = 5)
    public Allocator getAllocator() {
        return this.allocator;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public MediaFormat getTrackFormat(int i11) {
        return this.tracks.get(i11).createDownstreamMediaFormat(this.formatHolder, this.noDataBuffer);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    public void seekTo(long j11, int i11) {
        SeekMap.SeekPoints seekPoints;
        SeekPoint seekPoint;
        if (this.seekMap == null) {
            return;
        }
        if (this.selectedTrackIndices.size() == 1) {
            Extractor extractor = this.currentExtractor;
            if (extractor instanceof Mp4Extractor) {
                seekPoints = ((Mp4Extractor) extractor).getSeekPoints(j11, this.tracks.get(this.selectedTrackIndices.iterator().next().intValue()).getIdOfBackingTrack());
            } else {
                seekPoints = this.seekMap.getSeekPoints(j11);
            }
        } else {
            seekPoints = this.seekMap.getSeekPoints(j11);
        }
        if (i11 == 0) {
            seekPoint = seekPoints.first;
        } else if (i11 == 1) {
            seekPoint = seekPoints.second;
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            seekPoint = Math.abs(j11 - seekPoints.second.timeUs) < Math.abs(j11 - seekPoints.first.timeUs) ? seekPoints.second : seekPoints.first;
        }
        this.trackIndicesPerSampleInQueuedOrder.clear();
        for (int i12 = 0; i12 < this.sampleQueues.size(); i12++) {
            this.sampleQueues.valueAt(i12).reset();
        }
        this.pendingSeek = seekPoint;
    }

    public void selectTrack(int i11) {
        this.selectedTrackIndices.add(Integer.valueOf(i11));
    }

    public void unselectTrack(int i11) {
        this.selectedTrackIndices.remove(Integer.valueOf(i11));
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    public int getSampleFlags() {
        int i11;
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        if (this.noDataBuffer.isEncrypted()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        return i11 | (this.noDataBuffer.isKeyFrame() ? 1 : 0);
    }

    public long getSampleSize() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.sampleHolderWithBufferReplacementDirect, false);
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.sampleHolderWithBufferReplacementDirect.data);
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    public long getSampleTime() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return this.noDataBuffer.timeUs;
    }

    public int getSampleTrackIndex() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        return this.trackIndicesPerSampleInQueuedOrder.peekFirst().intValue();
    }

    public int readSampleData(ByteBuffer byteBuffer, int i11) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i11);
        byteBuffer.limit(byteBuffer.capacity());
        DecoderInputBuffer decoderInputBuffer = this.sampleHolderWithBufferReplacementDisabled;
        decoderInputBuffer.data = byteBuffer;
        peekNextSelectedTrackSample(decoderInputBuffer, false);
        byteBuffer.flip();
        byteBuffer.position(i11);
        this.sampleHolderWithBufferReplacementDisabled.data = null;
        return byteBuffer.remaining();
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor.getDeclaredLength() == -1) {
            setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IOException {
        setDataSource(fileDescriptor, 0L, -1L);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j11, long j12) throws IOException {
        prepareDataSource(new FileDescriptorDataSource(fileDescriptor, j11, j12), buildDataSpec(Uri.EMPTY, 0L));
    }

    public void setDataSource(Context context, Uri uri, @Nullable Map<String, String> map) throws IOException {
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if ((scheme == null || scheme.equals("file")) && path != null) {
            setDataSource(path);
            return;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                try {
                    setDataSource(assetFileDescriptorOpenAssetFileDescriptor);
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                assetFileDescriptorOpenAssetFileDescriptor.close();
            }
            setDataSource(uri.toString(), map);
        } catch (FileNotFoundException | SecurityException unused) {
        }
    }

    public void setDataSource(String str) throws IOException {
        setDataSource(str, (Map<String, String>) null);
    }

    public void setDataSource(String str, @Nullable Map<String, String> map) throws IOException {
        this.httpRequestHeaders = map;
        prepareDataSource(this.dataSourceFactory.createDataSource(), buildDataSpec(Uri.parse(str), 0L));
    }

    @RequiresApi(23)
    public void setDataSource(MediaDataSource mediaDataSource) throws IOException {
        prepareDataSource(new MediaDataSourceAdapter(mediaDataSource, false), buildDataSpec(Uri.EMPTY, 0L));
    }
}
