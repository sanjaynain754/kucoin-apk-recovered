package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.C3359k;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.ImmutableList;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(30)
@SuppressLint({"Override"})
@UnstableApi
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final String TAG = "OConsumerAdapterV30";

    @Nullable
    private String containerMimeType;

    @Nullable
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private ExtractorOutput extractorOutput;

    @Nullable
    private ChunkIndex lastChunkIndex;
    private final ArrayList<TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;

    @Nullable
    private MediaParser.SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;

    @Nullable
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;

    @Nullable
    private TimestampAdjuster timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    public static final class DataReaderAdapter implements DataReader {

        @Nullable
        public MediaParser$InputReader input;

        private DataReaderAdapter() {
        }

        @Override // androidx.media3.common.DataReader
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            return C3374l.m3429a(Util.castNonNull(this.input)).read(bArr, i11, i12);
        }
    }

    public static final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap adaptedSeekMap;

        private static SeekPoint asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            return durationMicros != -2147483648L ? durationMicros : C2711C.TIME_UNSET;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j11) {
            Pair seekPoints = this.adaptedSeekMap.getSeekPoints(j11);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new SeekMap.SeekPoints(asExoPlayerSeekPoint(C3359k.m3415a(obj))) : new SeekMap.SeekPoints(asExoPlayerSeekPoint(C3359k.m3415a(obj)), asExoPlayerSeekPoint(C3359k.m3415a(seekPoints.second)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i11;
        }
        return 0;
    }

    private static int toTrackTypeConstant(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return MimeTypes.getTrackType(str);
        }
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public void onTrackCountFound(int i11) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public OutputConsumerAdapterV30(@Nullable Format format, int i11, boolean z11) {
        this.expectDummySeekMap = z11;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i11;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new DataReaderAdapter();
        this.extractorOutput = new NoOpExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = C2711C.TIME_UNSET;
        this.muxedCaptionFormats = ImmutableList.m13439of();
    }

    private void ensureSpaceForTrackIndex(int i11) {
        for (int size = this.trackOutputs.size(); size <= i11; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("csd-");
            int i12 = i11 + 1;
            sb2.append(i11);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(MediaFormatUtil.getArray(byteBuffer));
            i11 = i12;
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.trackOutputs.get(i11) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        ChunkIndex chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    @Nullable
    private TrackOutput.CryptoData toExoPlayerCryptoData(int i11, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        int i12;
        int i13;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i11) == cryptoInfo) {
            return (TrackOutput.CryptoData) Assertions.checkNotNull(this.lastOutputCryptoDatas.get(i11));
        }
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            i12 = Integer.parseInt((String) Util.castNonNull(matcher.group(1)));
            i13 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)));
        } catch (RuntimeException e11) {
            Log.m2958e(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e11);
            i12 = 0;
            i13 = 0;
        }
        TrackOutput.CryptoData cryptoData = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i12, i13);
        this.lastReceivedCryptoInfos.set(i11, cryptoInfo);
        this.lastOutputCryptoDatas.set(i11, cryptoData);
        return cryptoData;
    }

    @Nullable
    private static DrmInitData toExoPlayerDrmInitData(@Nullable String str, @Nullable android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i11 = 0; i11 < schemeInitDataCount; i11++) {
            android.media.DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i11);
            schemeDataArr[i11] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new DrmInitData(str, schemeDataArr);
    }

    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    @Nullable
    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    @Nullable
    public Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        Format[] formatArr = new Format[this.trackFormats.size()];
        for (int i11 = 0; i11 < this.trackFormats.size(); i11++) {
            formatArr[i11] = (Format) Assertions.checkNotNull(this.trackFormats.get(i11));
        }
        return formatArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j11) {
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j11) : SEEK_POINT_PAIR_START;
    }

    public void onSampleCompleted(int i11, long j11, int i12, int i13, int i14, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        long j12 = this.sampleTimestampUpperLimitFilterUs;
        if (j12 == C2711C.TIME_UNSET || j11 < j12) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j11 = timestampAdjuster.adjustSampleTimestamp(j11);
            }
            ((TrackOutput) Assertions.checkNotNull(this.trackOutputs.get(i11))).sampleMetadata(j11, i12, i13, i14, toExoPlayerCryptoData(i11, cryptoInfo));
        }
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == -2147483648L) {
                durationMicros = C2711C.TIME_UNSET;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.seekMap(seekMapAdapter);
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void setMuxedCaptionFormats(List<Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j11) {
        this.sampleTimestampUpperLimitFilterUs = j11;
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
    }

    private static String getMimeType(String str) {
        str.getClass();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return MimeTypes.VIDEO_MP4;
            case "android.media.mediaparser.OggParser":
                return MimeTypes.AUDIO_OGG;
            case "android.media.mediaparser.TsParser":
                return MimeTypes.VIDEO_MP2T;
            case "android.media.mediaparser.AdtsParser":
                return "audio/mp4a-latm";
            case "android.media.mediaparser.WavParser":
                return MimeTypes.AUDIO_RAW;
            case "android.media.mediaparser.PsParser":
                return MimeTypes.VIDEO_PS;
            case "android.media.mediaparser.Ac3Parser":
                return MimeTypes.AUDIO_AC3;
            case "android.media.mediaparser.AmrParser":
                return MimeTypes.AUDIO_AMR;
            case "android.media.mediaparser.FlacParser":
                return MimeTypes.AUDIO_FLAC;
            case "android.media.mediaparser.MatroskaParser":
                return MimeTypes.VIDEO_WEBM;
            case "android.media.mediaparser.Ac4Parser":
                return MimeTypes.AUDIO_AC4;
            case "android.media.mediaparser.Mp3Parser":
                return MimeTypes.AUDIO_MPEG;
            case "android.media.mediaparser.FlvParser":
                return MimeTypes.VIDEO_FLV;
            default:
                throw new IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        Format.Builder accessibilityChannel = new Format.Builder().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.containerMimeType).setPeakBitrate(mediaFormat.getInteger("bitrate", -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(MediaFormatUtil.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger("width", -1)).setHeight(mediaFormat.getInteger("height", -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString("language")).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger(MediaUtils.KEY_ROTATION, 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        for (int i11 = 0; i11 < this.muxedCaptionFormats.size(); i11++) {
            Format format = this.muxedCaptionFormats.get(i11);
            if (Util.areEqual(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setLabels(format.labels).setMetadata(format.metadata);
                break;
            }
        }
        return accessibilityChannel.build();
    }

    public void onSampleDataFound(int i11, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        ensureSpaceForTrackIndex(i11);
        this.scratchDataReaderAdapter.input = mediaParser$InputReader;
        TrackOutput trackOutputTrack = this.trackOutputs.get(i11);
        if (trackOutputTrack == null) {
            trackOutputTrack = this.extractorOutput.track(i11, -1);
            this.trackOutputs.set(i11, trackOutputTrack);
        }
        trackOutputTrack.sampleData((DataReader) this.scratchDataReaderAdapter, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onTrackDataFound(int i11, MediaParser.TrackData trackData) {
        Format formatWithManifestFormatInfo;
        String string;
        if (!maybeObtainChunkIndex(trackData.mediaFormat)) {
            ensureSpaceForTrackIndex(i11);
            TrackOutput trackOutput = this.trackOutputs.get(i11);
            if (trackOutput == null) {
                String string2 = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
                if (string2 != null) {
                    string = string2;
                } else {
                    string = trackData.mediaFormat.getString("mime");
                }
                int trackTypeConstant = toTrackTypeConstant(string);
                if (trackTypeConstant == this.primaryTrackType) {
                    this.primaryTrackIndex = i11;
                }
                TrackOutput trackOutputTrack = this.extractorOutput.track(i11, trackTypeConstant);
                this.trackOutputs.set(i11, trackOutputTrack);
                if (string2 != null) {
                    return;
                } else {
                    trackOutput = trackOutputTrack;
                }
            }
            Format exoPlayerFormat = toExoPlayerFormat(trackData);
            Format format = this.primaryTrackManifestFormat;
            if (format != null && i11 == this.primaryTrackIndex) {
                formatWithManifestFormatInfo = exoPlayerFormat.withManifestFormatInfo(format);
            } else {
                formatWithManifestFormatInfo = exoPlayerFormat;
            }
            trackOutput.format(formatWithManifestFormatInfo);
            this.trackFormats.set(i11, exoPlayerFormat);
            maybeEndTracks();
        }
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }
}
