package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;

    @Nullable
    private LongArray cueClusterPositions;

    @Nullable
    private LongArray cueTimesUs;
    private long cuesContentPosition;

    @Nullable
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final boolean parseSubtitlesDuringExtraction;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.b
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.m3524b();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {BuiltinOptions.TransposeConvOptions, 10, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, 32, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalAndOptions, 32, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {BuiltinOptions.FillOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.FakeQuantOptions, 32, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions};
    private static final byte[] VTT_PREFIX = {BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, 10, 10, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, 32, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalAndOptions, 32, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i11, int i12, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i11, i12, extractorInput);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i11) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i11, double d11) throws ParserException {
            MatroskaExtractor.this.floatElement(i11, d11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i11) {
            return MatroskaExtractor.this.getElementType(i11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i11, long j11) throws ParserException {
            MatroskaExtractor.this.integerElement(i11, j11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i11) {
            return MatroskaExtractor.this.isLevel1Element(i11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i11, long j11, long j12) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i11, j11, j12);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i11, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i11, str);
        }
    }

    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.m2961w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i11;
            int i12;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i13 = 0;
                int i14 = 1;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i13 += 255;
                    i14++;
                }
                int i15 = i14 + 1;
                int i16 = i13 + (i11 & 255);
                int i17 = 0;
                while (true) {
                    i12 = bArr[i15];
                    if ((i12 & 255) != 255) {
                        break;
                    }
                    i17 += 255;
                    i15++;
                }
                int i18 = i15 + 1;
                int i19 = i17 + (i12 & 255);
                if (bArr[i18] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i16];
                System.arraycopy(bArr, i18, bArr2, 0, i16);
                int i21 = i18 + i16;
                if (bArr[i21] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i22 = i21 + i19;
                if (bArr[i22] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i22];
                System.arraycopy(bArr, i22, bArr3, 0, bArr.length - i22);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z11) {
            if (MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId)) {
                return z11;
            }
            return this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:211:0x0443  */
        /* JADX WARN: Code duplicated, block: B:216:0x045d  */
        /* JADX WARN: Code duplicated, block: B:217:0x045f  */
        /* JADX WARN: Code duplicated, block: B:220:0x046c  */
        /* JADX WARN: Code duplicated, block: B:221:0x047e  */
        /* JADX WARN: Code duplicated, block: B:223:0x0484  */
        /* JADX WARN: Code duplicated, block: B:225:0x0488  */
        /* JADX WARN: Code duplicated, block: B:227:0x048d  */
        /* JADX WARN: Code duplicated, block: B:230:0x0495  */
        /* JADX WARN: Code duplicated, block: B:232:0x049a  */
        /* JADX WARN: Code duplicated, block: B:235:0x049f  */
        /* JADX WARN: Code duplicated, block: B:238:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:241:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:244:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:249:0x0506  */
        /* JADX WARN: Code duplicated, block: B:268:0x0552  */
        /* JADX WARN: Code duplicated, block: B:270:0x0578  */
        /* JADX WARN: Code duplicated, block: B:272:0x057e  */
        /* JADX WARN: Code duplicated, block: B:288:0x05a9  */
        /* JADX WARN: Code duplicated, block: B:4:0x002a  */
        public void initializeOutput(ExtractorOutput extractorOutput, int i11) throws ParserException {
            int i12;
            List<byte[]> listSingletonList;
            String str;
            int i13;
            int i14;
            List<byte[]> list;
            String str2;
            String str3;
            int i15;
            Format.Builder builder;
            int i16;
            int iIntValue;
            int i17;
            float f11;
            int i18;
            int i19;
            int i21;
            DolbyVisionConfig dolbyVisionConfig;
            String str4 = this.codecId;
            str4.getClass();
            String str5 = MimeTypes.AUDIO_RAW;
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                case "V_MPEG4/ISO/SP":
                case "V_MPEG4/ISO/ASP":
                    i12 = 0;
                    byte[] bArr = this.codecPrivate;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = MimeTypes.VIDEO_MP4V;
                    str = null;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i22 = i15 | (z11 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            i19 = this.displayWidth;
                            iIntValue = -1;
                            if (i19 == -1) {
                                i19 = this.width;
                            }
                            this.displayWidth = i19;
                            i21 = this.displayHeight;
                            if (i21 == -1) {
                                i21 = this.height;
                            }
                            this.displayHeight = i21;
                        } else {
                            iIntValue = -1;
                        }
                        i17 = this.displayWidth;
                        if (i17 != iIntValue || (i18 = this.displayHeight) == iIntValue) {
                            f11 = -1.0f;
                        } else {
                            f11 = (this.height * i17) / (this.width * i18);
                        }
                        ColorInfo colorInfoBuild = this.hasColorInfo ? new ColorInfo.Builder().setColorSpace(this.colorSpace).setColorRange(this.colorRange).setColorTransfer(this.colorTransfer).setHdrStaticInfo(getHdrStaticInfo()).setLumaBitdepth(this.bitsPerChannel).setChromaBitdepth(this.bitsPerChannel).build() : null;
                        if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 || Float.compare(this.projectionPoseYaw, 0.0f) != 0 || Float.compare(this.projectionPosePitch, 0.0f) != 0) {
                            i12 = iIntValue;
                        } else if (Float.compare(this.projectionPoseRoll, 0.0f) != 0) {
                            if (Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                i12 = 90;
                            } else if (Float.compare(this.projectionPoseRoll, -180.0f) == 0 || Float.compare(this.projectionPoseRoll, 180.0f) == 0) {
                                i12 = 180;
                            } else if (Float.compare(this.projectionPoseRoll, -90.0f) == 0) {
                                i12 = 270;
                            } else {
                                i12 = iIntValue;
                            }
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                        i16 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !"text/vtt".equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i16 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i22 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case "A_MS/ACM":
                    i12 = 0;
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding != 0) {
                            i13 = pcmEncoding;
                            listSingletonList = null;
                            str = null;
                            i14 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str = dolbyVisionConfig.codecs;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z12 = this.flagDefault;
                            if (this.flagForced) {
                                i15 = 2;
                            } else {
                                i15 = i12;
                            }
                            int i23 = i15 | (z12 ? 1 : 0);
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str3)) {
                                if (MimeTypes.isVideo(str3)) {
                                    if (this.displayUnit == 0) {
                                        i19 = this.displayWidth;
                                        iIntValue = -1;
                                        if (i19 == -1) {
                                            i19 = this.width;
                                        }
                                        this.displayWidth = i19;
                                        i21 = this.displayHeight;
                                        if (i21 == -1) {
                                            i21 = this.height;
                                        }
                                        this.displayHeight = i21;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i17 = this.displayWidth;
                                    if (i17 != iIntValue) {
                                        f11 = -1.0f;
                                    } else {
                                        f11 = -1.0f;
                                    }
                                    if (this.hasColorInfo) {
                                    }
                                    if (this.name != null) {
                                        iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                    }
                                    if (this.projectionType == 0) {
                                        i12 = iIntValue;
                                    } else {
                                        i12 = iIntValue;
                                    }
                                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                    i16 = 2;
                                } else {
                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                    }
                                    i16 = 3;
                                }
                                break;
                            } else {
                                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                                i16 = 1;
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            Format formatBuild2 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i23 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i16);
                            this.output = trackOutputTrack2;
                            trackOutputTrack2.format(formatBuild2);
                            return;
                        }
                        Log.m2961w(MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    } else {
                        Log.m2961w(MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    }
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i24 = i15 | (z13 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild3 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i24 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack3 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack3;
                    trackOutputTrack3.format(formatBuild3);
                    return;
                case "A_TRUEHD":
                    i12 = 0;
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str5 = MimeTypes.AUDIO_TRUEHD;
                    listSingletonList = null;
                    str = null;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i25 = i15 | (z14 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild4 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i25 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack4 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack4;
                    trackOutputTrack4.format(formatBuild4);
                    return;
                case "A_VORBIS":
                    i12 = 0;
                    listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_VORBIS;
                    i14 = 8192;
                    str = null;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i26 = i15 | (z15 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild5 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i26 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack5 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack5;
                    trackOutputTrack5.format(formatBuild5);
                    return;
                case "A_MPEG/L2":
                    i12 = 0;
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str = null;
                    i14 = 4096;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i27 = i15 | (z16 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild6 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i27 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack6 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack6;
                    trackOutputTrack6.format(formatBuild6);
                    return;
                case "A_MPEG/L3":
                    i12 = 0;
                    str5 = MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i14 = 4096;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i28 = i15 | (z17 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild7 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i28 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack7 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack7;
                    trackOutputTrack7.format(formatBuild7);
                    return;
                case "V_MS/VFW/FOURCC":
                    i12 = 0;
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (String) fourCcPrivate.first;
                    listSingletonList = (List) fourCcPrivate.second;
                    str = null;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i29 = i15 | (z18 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild8 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i29 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack8 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack8;
                    trackOutputTrack8.format(formatBuild8);
                    return;
                case "S_DVBSUB":
                    byte[] bArr2 = new byte[4];
                    i12 = 0;
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.m13440of(bArr2);
                    str5 = MimeTypes.APPLICATION_DVBSUBS;
                    str = null;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i210 = i15 | (z19 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild9 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i210 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack9 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack9;
                    trackOutputTrack9.format(formatBuild9);
                    return;
                case "V_MPEG4/ISO/AVC":
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str5 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i211 = i15 | (z110 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild10 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i211 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack10 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack10;
                    trackOutputTrack10.format(formatBuild10);
                    return;
                case "S_VOBSUB":
                    listSingletonList = ImmutableList.m13440of(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.APPLICATION_VOBSUB;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i212 = i15 | (z111 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild11 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i212 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack11 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack11;
                    trackOutputTrack11.format(formatBuild11);
                    return;
                case "A_DTS/LOSSLESS":
                    str5 = MimeTypes.AUDIO_DTS_HD;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z112 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i213 = i15 | (z112 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild12 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i213 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack12 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack12;
                    trackOutputTrack12.format(formatBuild12);
                    return;
                case "A_AAC":
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str5 = "audio/mp4a-latm";
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z113 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i214 = i15 | (z113 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild13 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i214 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack13 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack13;
                    trackOutputTrack13.format(formatBuild13);
                    return;
                case "A_AC3":
                    str5 = MimeTypes.AUDIO_AC3;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i215 = i15 | (z114 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild14 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i215 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack14 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack14;
                    trackOutputTrack14.format(formatBuild14);
                    return;
                case "A_DTS":
                case "A_DTS/EXPRESS":
                    str5 = MimeTypes.AUDIO_DTS;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z115 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i216 = i15 | (z115 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild15 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i216 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack15 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack15;
                    trackOutputTrack15.format(formatBuild15);
                    return;
                case "V_AV1":
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i217 = i15 | (z116 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild16 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i217 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack16 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack16;
                    trackOutputTrack16.format(formatBuild16);
                    return;
                case "V_VP8":
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i218 = i15 | (z117 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild17 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i218 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack17 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack17;
                    trackOutputTrack17.format(formatBuild17);
                    return;
                case "V_VP9":
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i219 = i15 | (z118 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild18 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i219 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack18 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack18;
                    trackOutputTrack18.format(formatBuild18);
                    return;
                case "S_HDMV/PGS":
                    str5 = MimeTypes.APPLICATION_PGS;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2110 = i15 | (z119 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild19 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2110 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack19 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack19;
                    trackOutputTrack19.format(formatBuild19);
                    return;
                case "V_THEORA":
                    str5 = MimeTypes.VIDEO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2111 = i15 | (z1110 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild110 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2111 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack110 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack110;
                    trackOutputTrack110.format(formatBuild110);
                    return;
                case "A_PCM/FLOAT/IEEE":
                    if (this.audioBitDepth == 32) {
                        listSingletonList = null;
                        str = null;
                        i12 = 0;
                        i14 = -1;
                        i13 = 4;
                    } else {
                        Log.m2961w(MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                        listSingletonList = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i12 = 0;
                        i14 = -1;
                        i13 = -1;
                    }
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1111 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2112 = i15 | (z1111 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild111 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2112 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack111 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack111;
                    trackOutputTrack111.format(formatBuild111);
                    return;
                case "A_PCM/INT/BIG":
                    int i31 = this.audioBitDepth;
                    if (i31 == 8) {
                        i13 = 3;
                    } else if (i31 == 16) {
                        i13 = 268435456;
                    } else if (i31 == 24) {
                        i13 = C2711C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                    } else {
                        if (i31 != 32) {
                            Log.m2961w(MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                            listSingletonList = null;
                            str = null;
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            i12 = 0;
                            i14 = -1;
                            i13 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str = dolbyVisionConfig.codecs;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z1112 = this.flagDefault;
                            if (this.flagForced) {
                                i15 = 2;
                            } else {
                                i15 = i12;
                            }
                            int i2113 = i15 | (z1112 ? 1 : 0);
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str3)) {
                                if (MimeTypes.isVideo(str3)) {
                                    if (this.displayUnit == 0) {
                                        i19 = this.displayWidth;
                                        iIntValue = -1;
                                        if (i19 == -1) {
                                            i19 = this.width;
                                        }
                                        this.displayWidth = i19;
                                        i21 = this.displayHeight;
                                        if (i21 == -1) {
                                            i21 = this.height;
                                        }
                                        this.displayHeight = i21;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i17 = this.displayWidth;
                                    if (i17 != iIntValue) {
                                        f11 = -1.0f;
                                    } else {
                                        f11 = -1.0f;
                                    }
                                    if (this.hasColorInfo) {
                                    }
                                    if (this.name != null) {
                                        iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                    }
                                    if (this.projectionType == 0) {
                                        i12 = iIntValue;
                                    } else {
                                        i12 = iIntValue;
                                    }
                                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                    i16 = 2;
                                } else {
                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                    }
                                    i16 = 3;
                                }
                                break;
                            } else {
                                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                                i16 = 1;
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            Format formatBuild112 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2113 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack112 = extractorOutput.track(this.number, i16);
                            this.output = trackOutputTrack112;
                            trackOutputTrack112.format(formatBuild112);
                            return;
                        }
                        i13 = C2711C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                    }
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1113 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2114 = i15 | (z1113 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild113 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2114 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack113 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack113;
                    trackOutputTrack113.format(formatBuild113);
                    return;
                case "A_PCM/INT/LIT":
                    int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding2 != 0) {
                        i13 = pcmEncoding2;
                        listSingletonList = null;
                        str = null;
                        i12 = 0;
                        i14 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                            str = dolbyVisionConfig.codecs;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z1114 = this.flagDefault;
                        if (this.flagForced) {
                            i15 = 2;
                        } else {
                            i15 = i12;
                        }
                        int i2115 = i15 | (z1114 ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                            if (MimeTypes.isVideo(str3)) {
                                if (this.displayUnit == 0) {
                                    i19 = this.displayWidth;
                                    iIntValue = -1;
                                    if (i19 == -1) {
                                        i19 = this.width;
                                    }
                                    this.displayWidth = i19;
                                    i21 = this.displayHeight;
                                    if (i21 == -1) {
                                        i21 = this.height;
                                    }
                                    this.displayHeight = i21;
                                } else {
                                    iIntValue = -1;
                                }
                                i17 = this.displayWidth;
                                if (i17 != iIntValue) {
                                    f11 = -1.0f;
                                } else {
                                    f11 = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name != null) {
                                    iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                }
                                if (this.projectionType == 0) {
                                    i12 = iIntValue;
                                } else {
                                    i12 = iIntValue;
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                i16 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i16 = 3;
                            }
                            break;
                        } else {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                            i16 = 1;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        Format formatBuild114 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2115 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack114 = extractorOutput.track(this.number, i16);
                        this.output = trackOutputTrack114;
                        trackOutputTrack114.format(formatBuild114);
                        return;
                    }
                    Log.m2961w(MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to " + MimeTypes.AUDIO_UNKNOWN);
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1115 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2116 = i15 | (z1115 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild115 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2116 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack115 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack115;
                    trackOutputTrack115.format(formatBuild115);
                    return;
                case "S_TEXT/ASS":
                    listSingletonList = ImmutableList.m13441of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str = null;
                    str5 = MimeTypes.TEXT_SSA;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1116 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2117 = i15 | (z1116 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild116 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2117 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack116 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack116;
                    trackOutputTrack116.format(formatBuild116);
                    return;
                case "V_MPEGH/ISO/HEVC":
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str5 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1117 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2118 = i15 | (z1117 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild117 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2118 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack117 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack117;
                    trackOutputTrack117.format(formatBuild117);
                    return;
                case "S_TEXT/WEBVTT":
                    listSingletonList = null;
                    str = null;
                    str5 = "text/vtt";
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1118 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i2119 = i15 | (z1118 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild118 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i2119 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack118 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack118;
                    trackOutputTrack118.format(formatBuild118);
                    return;
                case "S_TEXT/UTF8":
                    listSingletonList = null;
                    str = null;
                    str5 = MimeTypes.APPLICATION_SUBRIP;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1119 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i21110 = i15 | (z1119 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild119 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i21110 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack119 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack119;
                    trackOutputTrack119.format(formatBuild119);
                    return;
                case "V_MPEG2":
                    str5 = MimeTypes.VIDEO_MPEG2;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11110 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i21111 = i15 | (z11110 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1110 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i21111 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1110 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack1110;
                    trackOutputTrack1110.format(formatBuild1110);
                    return;
                case "A_EAC3":
                    str5 = MimeTypes.AUDIO_E_AC3;
                    listSingletonList = null;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11111 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i21112 = i15 | (z11111 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1111 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i21112 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1111 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack1111;
                    trackOutputTrack1111.format(formatBuild1111);
                    return;
                case "A_FLAC":
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    i12 = 0;
                    i14 = -1;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11112 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i21113 = i15 | (z11112 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1112 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i21113 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1112 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack1112;
                    trackOutputTrack1112.format(formatBuild1112);
                    return;
                case "A_OPUS":
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(getCodecPrivate(this.codecId));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str5 = MimeTypes.AUDIO_OPUS;
                    i14 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    str = null;
                    i12 = 0;
                    i13 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11113 = this.flagDefault;
                    if (this.flagForced) {
                        i15 = 2;
                    } else {
                        i15 = i12;
                    }
                    int i21114 = i15 | (z11113 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i19 = this.displayWidth;
                                iIntValue = -1;
                                if (i19 == -1) {
                                    i19 = this.width;
                                }
                                this.displayWidth = i19;
                                i21 = this.displayHeight;
                                if (i21 == -1) {
                                    i21 = this.height;
                                }
                                this.displayHeight = i21;
                            } else {
                                iIntValue = -1;
                            }
                            i17 = this.displayWidth;
                            if (i17 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                i12 = iIntValue;
                            } else {
                                i12 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i16 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i16 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i13);
                        i16 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1113 = builder.setId(i11).setSampleMimeType(str3).setMaxInputSize(i14).setLanguage(this.language).setSelectionFlags(i21114 == true ? 1 : 0).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1113 = extractorOutput.track(this.number, i16);
                    this.output = trackOutputTrack1113;
                    trackOutputTrack1113.format(formatBuild1113);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    private static boolean isCodecSupported(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private static void setSubtitleEndTime(String str, long j11, byte[] bArr) {
        byte[] subtitleTimecode;
        int i11;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j11, SSA_TIMECODE_FORMAT, 10000L);
                i11 = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j11, VTT_TIMECODE_FORMAT, 1000L);
                i11 = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j11, SUBRIP_TIMECODE_FORMAT, 1000L);
                i11 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i11, subtitleTimecode.length);
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i11) throws IOException {
        int length = bArr.length + i11;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i11));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i11);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void binaryElement(int i11, int i12, ExtractorInput extractorInput) throws IOException {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j11;
        int i18;
        int i19;
        int i21;
        int i22;
        ExtractorInput extractorInput2 = extractorInput;
        int i23 = 0;
        int i24 = 1;
        if (i11 != 161 && i11 != ID_SIMPLE_BLOCK) {
            if (i11 == ID_BLOCK_ADDITIONAL) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput2, i12);
                return;
            }
            if (i11 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i11), extractorInput2, i12);
                return;
            }
            if (i11 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i11);
                byte[] bArr = new byte[i12];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput2.readFully(bArr, 0, i12);
                return;
            }
            if (i11 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i12];
                extractorInput2.readFully(bArr2, 0, i12);
                getCurrentTrack(i11).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i11 == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput2.readFully(this.seekEntryIdBytes.getData(), 4 - i12, i12);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i11 == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i11);
                byte[] bArr3 = new byte[i12];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput2.readFully(bArr3, 0, i12);
                return;
            }
            if (i11 != ID_PROJECTION_PRIVATE) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i11, null);
            }
            assertInTrackEntry(i11);
            byte[] bArr4 = new byte[i12];
            this.currentTrack.projectionData = bArr4;
            extractorInput2.readFully(bArr4, 0, i12);
            return;
        }
        int i25 = 8;
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput2, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C2711C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput2.skipFully(i12 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput2, 3);
            int i26 = (this.scratch.getData()[2] & 6) >> 1;
            if (i26 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i12 - this.blockTrackNumberLength) - 3;
            } else {
                readScratch(extractorInput2, 4);
                int i27 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i27;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i27);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i26 == 2) {
                    int i28 = (i12 - this.blockTrackNumberLength) - 4;
                    int i29 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i29, i28 / i29);
                } else {
                    if (i26 == 1) {
                        int i31 = 0;
                        int i32 = 0;
                        int i33 = 4;
                        while (true) {
                            i18 = this.blockSampleCount;
                            if (i31 >= i18 - 1) {
                                break;
                            }
                            this.blockSampleSizes[i31] = 0;
                            while (true) {
                                i19 = i33 + 1;
                                readScratch(extractorInput2, i19);
                                int i34 = this.scratch.getData()[i33] & 255;
                                int[] iArr = this.blockSampleSizes;
                                i21 = iArr[i31] + i34;
                                iArr[i31] = i21;
                                if (i34 != 255) {
                                    break;
                                } else {
                                    i33 = i19;
                                }
                            }
                            i32 += i21;
                            i31++;
                            i33 = i19;
                        }
                        this.blockSampleSizes[i18 - 1] = ((i12 - this.blockTrackNumberLength) - i33) - i32;
                    } else {
                        if (i26 != 3) {
                            throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i26, null);
                        }
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 4;
                        while (true) {
                            int i38 = this.blockSampleCount;
                            i13 = i24;
                            if (i35 >= i38 - 1) {
                                i14 = i23;
                                this.blockSampleSizes[i38 - 1] = ((i12 - this.blockTrackNumberLength) - i37) - i36;
                                break;
                            }
                            this.blockSampleSizes[i35] = i23;
                            int i39 = i37 + 1;
                            readScratch(extractorInput2, i39);
                            if (this.scratch.getData()[i37] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i41 = i23;
                            while (true) {
                                if (i41 >= i25) {
                                    i15 = i23;
                                    i16 = i25;
                                    i17 = i35;
                                    j11 = 0;
                                    break;
                                }
                                i16 = i25;
                                int i42 = i13 << (7 - i41);
                                i15 = i23;
                                if ((this.scratch.getData()[i37] & i42) != 0) {
                                    i39 += i41;
                                    readScratch(extractorInput2, i39);
                                    int i43 = i37 + 1;
                                    j11 = this.scratch.getData()[i37] & 255 & (~i42);
                                    while (true) {
                                        int i44 = i43;
                                        if (i44 >= i39) {
                                            break;
                                        }
                                        i43 = i44 + 1;
                                        j11 = (j11 << i16) | ((long) (this.scratch.getData()[i44] & 255));
                                        i35 = i35;
                                    }
                                    i17 = i35;
                                    if (i17 <= 0) {
                                        break;
                                    }
                                    j11 -= (1 << ((i41 * 7) + 6)) - 1;
                                    break;
                                }
                                i41++;
                                extractorInput2 = extractorInput;
                                i23 = i15;
                                i25 = i16;
                            }
                            i37 = i39;
                            if (j11 < -2147483648L || j11 > 2147483647L) {
                                throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                            }
                            int i45 = (int) j11;
                            int[] iArr2 = this.blockSampleSizes;
                            if (i17 != 0) {
                                i45 += iArr2[i17 - 1];
                            }
                            iArr2[i17] = i45;
                            i36 += i45;
                            i35 = i17 + 1;
                            extractorInput2 = extractorInput;
                            i24 = i13;
                            i23 = i15;
                            i25 = i16;
                        }
                    }
                    this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i14] << 8) | (this.scratch.getData()[i13] & 255));
                    if (track.type != 2 || (i11 == ID_SIMPLE_BLOCK && (this.scratch.getData()[2] & 128) == 128)) {
                        i22 = i13;
                    } else {
                        i22 = i14;
                    }
                    this.blockFlags = i22;
                    this.blockState = 2;
                    this.blockSampleIndex = i14;
                }
            }
            i14 = 0;
            i13 = 1;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i14] << 8) | (this.scratch.getData()[i13] & 255));
            if (track.type != 2) {
                i22 = i13;
            } else {
                i22 = i13;
            }
            this.blockFlags = i22;
            this.blockState = 2;
            this.blockSampleIndex = i14;
        } else {
            i13 = 1;
        }
        if (i11 == ID_SIMPLE_BLOCK) {
            while (true) {
                int i46 = this.blockSampleIndex;
                if (i46 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                int iWriteSampleData = writeSampleData(extractorInput, track, this.blockSampleSizes[i46], false);
                Track track2 = track;
                commitSampleToOutput(track2, this.blockTimeUs + ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)), this.blockFlags, iWriteSampleData, 0);
                this.blockSampleIndex++;
                track = track2;
            }
        } else {
            while (true) {
                int i47 = this.blockSampleIndex;
                if (i47 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                boolean z11 = i13;
                iArr3[i47] = writeSampleData(extractorInput, track, iArr3[i47], z11);
                this.blockSampleIndex += z11 ? 1 : 0;
            }
        }
    }

    public void handleBlockAdditionalData(Track track, int i11, ExtractorInput extractorInput, int i12) throws IOException {
        if (i11 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i12);
        } else {
            this.supplementalData.reset(i12);
            extractorInput.readFully(this.supplementalData.getData(), 0, i12);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z11 = true;
        while (z11 && !this.haveOutputSample) {
            z11 = this.reader.read(extractorInput);
            if (z11 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z11) {
            return 0;
        }
        for (int i11 = 0; i11 < this.tracks.size(); i11++) {
            Track trackValueAt = this.tracks.valueAt(i11);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public MatroskaExtractor(int i11) {
        this(new DefaultEbmlReader(), i11 | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Extractor[] m3523a(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    private void assertInCues(int i11) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i11 + " must be in a Cues", null);
        }
    }

    private void assertInTrackEntry(int i11) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i11 + " must be in a TrackEntry", null);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Extractor[] m3524b() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    private SeekMap buildSeekMap(@Nullable LongArray longArray, @Nullable LongArray longArray2) {
        int i11;
        if (this.segmentContentPosition == -1 || this.durationUs == C2711C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            jArrCopyOf3[i13] = longArray.get(i13);
            jArrCopyOf[i13] = this.segmentContentPosition + longArray2.get(i13);
        }
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            int i14 = i12 + 1;
            iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
            jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
            i12 = i14;
        }
        int i15 = i11;
        while (i15 > 0 && jArrCopyOf3[i15] > this.durationUs) {
            i15--;
        }
        iArrCopyOf[i15] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i15]);
        jArrCopyOf2[i15] = this.durationUs - jArrCopyOf3[i15];
        if (i15 < i11) {
            Log.m2961w(TAG, "Discarding trailing cue points with timestamps greater than total duration");
            int i16 = i15 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void commitSampleToOutput(Track track, long j11, int i11, int i12, int i13) {
        int iLimit;
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j11, i11, i12, i13, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.m2961w(TAG, "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.blockDurationUs;
                    if (j12 == C2711C.TIME_UNSET) {
                        Log.m2961w(TAG, "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j12, this.subtitleSample.getData());
                        for (int position = this.subtitleSample.getPosition(); position < this.subtitleSample.limit(); position++) {
                            if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            }
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        iLimit = i12 + this.subtitleSample.limit();
                    }
                }
                iLimit = i12;
            } else {
                iLimit = i12;
            }
            if ((i11 & 268435456) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int iLimit2 = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, iLimit2, 2);
                    iLimit += iLimit2;
                }
            }
            track.output.sampleMetadata(j11, i11, iLimit, i13, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(@Nullable int[] iArr, int i11) {
        if (iArr == null) {
            return new int[i11];
        }
        return iArr.length >= i11 ? iArr : new int[Math.max(iArr.length * 2, i11)];
    }

    private int finishWriteSampleData() {
        int i11 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i11;
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j11) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j11;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j12 = this.seekPositionAfterBuildingCues;
            if (j12 != -1) {
                positionHolder.position = j12;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.a
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return MatroskaExtractor.m3523a(factory);
            }
        };
    }

    private void readScratch(ExtractorInput extractorInput, int i11) throws IOException {
        if (this.scratch.limit() >= i11) {
            return;
        }
        if (this.scratch.capacity() < i11) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i11));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i11 - this.scratch.limit());
        this.scratch.setLimit(i11);
    }

    private long scaleTimecodeToUs(long j11) throws ParserException {
        long j12 = this.timecodeScale;
        if (j12 != C2711C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j11, j12, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i11, boolean z11) throws IOException {
        int i12;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i11);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i11);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i11);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b11 = this.sampleSignalByte;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z12 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z12) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i13 = this.samplePartitionCount * 4;
                        this.scratch.reset(i13);
                        extractorInput.readFully(this.scratch.getData(), 0, i13);
                        this.sampleBytesRead += i13;
                        short s11 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i14 = (s11 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i14);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s11);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i12 = this.samplePartitionCount;
                            if (i15 >= i12) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i15 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i16));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i16);
                            }
                            i15++;
                            i16 = unsignedIntToInt;
                        }
                        int i17 = (i11 - this.sampleBytesRead) - i16;
                        if (i12 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i17);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i17);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i14);
                        trackOutput.sampleData(this.encryptionSubsampleData, i14, 1);
                        this.sampleBytesWritten += i14;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z11)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i11) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i11 + this.sampleStrippedBytes.limit();
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i18 = this.sampleBytesRead;
                if (i18 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit2 - i18);
                this.sampleBytesRead += iWriteToOutput;
                this.sampleBytesWritten += iWriteToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i19 = track.nalUnitLengthFieldLength;
            int i21 = 4 - i19;
            while (this.sampleBytesRead < iLimit2) {
                int i22 = this.sampleCurrentNalBytesRemaining;
                if (i22 == 0) {
                    writeToTarget(extractorInput, data, i21, i19);
                    this.sampleBytesRead += i19;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i22);
                    this.sampleBytesRead += iWriteToOutput2;
                    this.sampleBytesWritten += iWriteToOutput2;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i11) throws IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i11, false);
        }
        int iMin = Math.min(i11, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i11, int i12) throws IOException {
        int iMin = Math.min(i12, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i11 + iMin, i12 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i11, iMin);
        }
    }

    @CallSuper
    public void floatElement(int i11, double d11) throws ParserException {
        if (i11 == 181) {
            getCurrentTrack(i11).sampleRate = (int) d11;
            return;
        }
        if (i11 == ID_DURATION) {
            this.durationTimecode = (long) d11;
            return;
        }
        switch (i11) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i11).primaryRChromaticityX = (float) d11;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i11).primaryRChromaticityY = (float) d11;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i11).primaryGChromaticityX = (float) d11;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i11).primaryGChromaticityY = (float) d11;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i11).primaryBChromaticityX = (float) d11;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i11).primaryBChromaticityY = (float) d11;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i11).whitePointChromaticityX = (float) d11;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i11).whitePointChromaticityY = (float) d11;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i11).maxMasteringLuminance = (float) d11;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i11).minMasteringLuminance = (float) d11;
                break;
            default:
                switch (i11) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i11).projectionPoseYaw = (float) d11;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i11).projectionPosePitch = (float) d11;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i11).projectionPoseRoll = (float) d11;
                        break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @CallSuper
    public void integerElement(int i11, long j11) throws ParserException {
        if (i11 == ID_CONTENT_ENCODING_ORDER) {
            if (j11 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j11 + " not supported", null);
        }
        if (i11 == ID_CONTENT_ENCODING_SCOPE) {
            if (j11 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j11 + " not supported", null);
        }
        switch (i11) {
            case 131:
                getCurrentTrack(i11).type = (int) j11;
                return;
            case 136:
                getCurrentTrack(i11).flagDefault = j11 == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j11);
                return;
            case 159:
                getCurrentTrack(i11).channelCount = (int) j11;
                return;
            case ID_PIXEL_WIDTH /* 176 */:
                getCurrentTrack(i11).width = (int) j11;
                return;
            case ID_CUE_TIME /* 179 */:
                assertInCues(i11);
                this.cueTimesUs.add(scaleTimecodeToUs(j11));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i11).height = (int) j11;
                return;
            case 215:
                getCurrentTrack(i11).number = (int) j11;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j11);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j11;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i11);
                this.cueClusterPositions.add(j11);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case 251:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i11).blockAddIdType = (int) j11;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j11 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j11 + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j11 < 1 || j11 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j11 + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j11 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j11 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j11 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j11 + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j11 + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i12 = (int) j11;
                assertInTrackEntry(i11);
                if (i12 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i12 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i12 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i11).displayWidth = (int) j11;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i11).displayUnit = (int) j11;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i11).displayHeight = (int) j11;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i11).flagForced = j11 == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i11);
                Track track = this.currentTrack;
                track.hasColorInfo = true;
                track.bitsPerChannel = (int) j11;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i11).maxBlockAdditionId = (int) j11;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i11).codecDelayNs = j11;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i11).seekPreRollNs = j11;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i11).audioBitDepth = (int) j11;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j11;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i11);
                int i13 = (int) j11;
                if (i13 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i13 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i13 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i11).defaultSampleDurationNs = (int) j11;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j11;
                return;
            default:
                switch (i11) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i11);
                        int i14 = (int) j11;
                        if (i14 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i11);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j11);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i11);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j11);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i11).maxContentLuminance = (int) j11;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i11).maxFrameAverageLuminance = (int) j11;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    @CallSuper
    public void stringElement(int i11, String str) throws ParserException {
        if (i11 == 134) {
            getCurrentTrack(i11).codecId = str;
            return;
        }
        if (i11 != 17026) {
            if (i11 == ID_NAME) {
                getCurrentTrack(i11).name = str;
                return;
            } else {
                if (i11 != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i11).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    @CallSuper
    public void endMasterElement(int i11) throws ParserException {
        assertInitialized();
        if (i11 != 160) {
            if (i11 != ID_TRACK_ENTRY) {
                if (i11 != ID_SEEK) {
                    if (i11 != ID_CONTENT_ENCODING) {
                        if (i11 != ID_CONTENT_ENCODINGS) {
                            if (i11 != 357149030) {
                                if (i11 != ID_TRACKS) {
                                    if (i11 == ID_CUES) {
                                        if (!this.sentSeekMap) {
                                            this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                                            this.sentSeekMap = true;
                                        }
                                        this.cueTimesUs = null;
                                        this.cueClusterPositions = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.tracks.size() != 0) {
                                    this.extractorOutput.endTracks();
                                    return;
                                }
                                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
                            }
                            if (this.timecodeScale == C2711C.TIME_UNSET) {
                                this.timecodeScale = 1000000L;
                            }
                            long j11 = this.durationTimecode;
                            if (j11 != C2711C.TIME_UNSET) {
                                this.durationUs = scaleTimecodeToUs(j11);
                                return;
                            }
                            return;
                        }
                        assertInTrackEntry(i11);
                        Track track = this.currentTrack;
                        if (track.hasContentEncryption && track.sampleStrippedBytes != null) {
                            throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    assertInTrackEntry(i11);
                    Track track2 = this.currentTrack;
                    if (track2.hasContentEncryption) {
                        if (track2.cryptoData != null) {
                            track2.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C2711C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                            return;
                        }
                        throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i12 = this.seekEntryId;
                if (i12 != -1) {
                    long j12 = this.seekEntryPosition;
                    if (j12 != -1) {
                        if (i12 == ID_CUES) {
                            this.cuesContentPosition = j12;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
            }
            Track track3 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track3.codecId;
            if (str != null) {
                if (isCodecSupported(str)) {
                    track3.initializeOutput(this.extractorOutput, track3.number);
                    this.tracks.put(track3.number, track3);
                }
                this.currentTrack = null;
                return;
            }
            throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
        }
        if (this.blockState != 2) {
            return;
        }
        Track track4 = this.tracks.get(this.blockTrackNumber);
        track4.assertOutputInitialized();
        if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track4.codecId)) {
            this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.blockSampleCount; i14++) {
            i13 += this.blockSampleSizes[i14];
        }
        int i15 = 0;
        while (i15 < this.blockSampleCount) {
            long j13 = this.blockTimeUs + ((long) ((track4.defaultSampleDurationNs * i15) / 1000));
            int i16 = this.blockFlags;
            if (i15 == 0 && !this.blockHasReferenceBlock) {
                i16 |= 1;
            }
            int i17 = this.blockSampleSizes[i15];
            int i18 = i13 - i17;
            commitSampleToOutput(track4, j13, i16, i17, i18);
            i15++;
            i13 = i18;
        }
        this.blockState = 0;
    }

    public Track getCurrentTrack(int i11) throws ParserException {
        assertInTrackEntry(i11);
        return this.currentTrack;
    }

    @CallSuper
    public int getElementType(int i11) {
        switch (i11) {
            case 131:
            case 136:
            case 155:
            case 159:
            case ID_PIXEL_WIDTH /* 176 */:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case 215:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case 251:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case 166:
            case ID_TRACK_ENTRY /* 174 */:
            case 183:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case ID_AUDIO /* 225 */:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case 161:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case 181:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i11) throws IOException {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i11);
            return;
        }
        byte[] bArr = new byte[i11];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i11);
    }

    @CallSuper
    public boolean isLevel1Element(int i11) {
        if (i11 != 357149030 && i11 != ID_CLUSTER && i11 != ID_CUES && i11 != ID_TRACKS) {
            return false;
        }
        return true;
    }

    @CallSuper
    public void startMasterElement(int i11, long j11, long j12) throws ParserException {
        assertInitialized();
        if (i11 != 160) {
            if (i11 != ID_TRACK_ENTRY) {
                if (i11 != ID_CUE_POINT) {
                    if (i11 != ID_SEEK) {
                        if (i11 != ID_CONTENT_ENCRYPTION) {
                            if (i11 != ID_MASTERING_METADATA) {
                                if (i11 != ID_SEGMENT) {
                                    if (i11 != ID_CUES) {
                                        if (i11 == ID_CLUSTER && !this.sentSeekMap) {
                                            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                                                this.seekForCues = true;
                                                return;
                                            } else {
                                                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                                                this.sentSeekMap = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.cueTimesUs = new LongArray();
                                    this.cueClusterPositions = new LongArray();
                                    return;
                                }
                                long j13 = this.segmentContentPosition;
                                if (j13 != -1 && j13 != j11) {
                                    throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
                                }
                                this.segmentContentPosition = j11;
                                this.segmentContentSize = j12;
                                return;
                            }
                            getCurrentTrack(i11).hasColorInfo = true;
                            return;
                        }
                        getCurrentTrack(i11).hasContentEncryption = true;
                        return;
                    }
                    this.seekEntryId = -1;
                    this.seekEntryPosition = -1L;
                    return;
                }
                this.seenClusterPositionForCurrentCuePoint = false;
                return;
            }
            this.currentTrack = new Track();
            return;
        }
        this.blockHasReferenceBlock = false;
        this.blockGroupDiscardPaddingNs = 0L;
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i11) {
        this(new DefaultEbmlReader(), i11, factory);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i11, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C2711C.TIME_UNSET;
        this.durationTimecode = C2711C.TIME_UNSET;
        this.durationUs = C2711C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C2711C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.seekForCuesEnabled = (i11 & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i11 & 2) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    private static byte[] formatSubtitleTimecode(long j11, String str, long j12) {
        boolean z11;
        if (j11 != C2711C.TIME_UNSET) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (((long) i11) * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (((long) i12) * 60000000);
        int i13 = (int) (j14 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (((long) i13) * 1000000)) / j12))));
    }

    @Override // androidx.media3.extractor.Extractor
    @CallSuper
    public void seek(long j11, long j12) {
        this.clusterTimecodeUs = C2711C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i11 = 0; i11 < this.tracks.size(); i11++) {
            this.tracks.valueAt(i11).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
