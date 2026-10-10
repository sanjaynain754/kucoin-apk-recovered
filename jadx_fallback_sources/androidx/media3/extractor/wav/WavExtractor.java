package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes34.dex */
@androidx.media3.common.util.UnstableApi
public final class WavExtractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = null;
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final java.lang.String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private long dataEndPosition;
    private int dataStartPosition;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.wav.WavExtractor.OutputWriter outputWriter;
    private long rf64SampleDataSize;
    private int state;
    private androidx.media3.extractor.TrackOutput trackOutput;

    public static final class ImaAdPcmOutputWriter implements androidx.media3.extractor.wav.WavExtractor.OutputWriter {
        private static final int[] INDEX_TABLE = null;
        private static final int[] STEP_TABLE = null;
        private final androidx.media3.common.util.ParsableByteArray decodedData;
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private final androidx.media3.common.Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final androidx.media3.extractor.TrackOutput trackOutput;
        private final androidx.media3.extractor.wav.WavFormat wavFormat;

        static {
                r0 = 16
                int[] r0 = new int[r0]
                r0 = {x0014: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8} // fill-array
                androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.INDEX_TABLE = r0
                r0 = 89
                int[] r0 = new int[r0]
                r0 = {x0038: FILL_ARRAY_DATA , data: [7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767} // fill-array
                androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.STEP_TABLE = r0
                return
        }

        public ImaAdPcmOutputWriter(androidx.media3.extractor.ExtractorOutput r5, androidx.media3.extractor.TrackOutput r6, androidx.media3.extractor.wav.WavFormat r7) throws androidx.media3.common.ParserException {
                r4 = this;
                r4.<init>()
                r4.extractorOutput = r5
                r4.trackOutput = r6
                r4.wavFormat = r7
                int r5 = r7.frameRateHz
                int r5 = r5 / 10
                r6 = 1
                int r5 = java.lang.Math.max(r6, r5)
                r4.targetSampleSizeFrames = r5
                androidx.media3.common.util.ParsableByteArray r0 = new androidx.media3.common.util.ParsableByteArray
                byte[] r1 = r7.extraData
                r0.<init>(r1)
                r0.readLittleEndianUnsignedShort()
                int r0 = r0.readLittleEndianUnsignedShort()
                r4.framesPerBlock = r0
                int r1 = r7.numChannels
                int r2 = r7.blockSize
                int r3 = r1 * 4
                int r2 = r2 - r3
                int r2 = r2 * 8
                int r3 = r7.bitsPerSample
                int r3 = r3 * r1
                int r2 = r2 / r3
                int r2 = r2 + r6
                if (r0 != r2) goto L86
                int r6 = androidx.media3.common.util.Util.ceilDivide(r5, r0)
                int r2 = r7.blockSize
                int r2 = r2 * r6
                byte[] r2 = new byte[r2]
                r4.inputData = r2
                androidx.media3.common.util.ParsableByteArray r2 = new androidx.media3.common.util.ParsableByteArray
                int r3 = numOutputFramesToBytes(r0, r1)
                int r6 = r6 * r3
                r2.<init>(r6)
                r4.decodedData = r2
                int r6 = r7.frameRateHz
                int r2 = r7.blockSize
                int r6 = r6 * r2
                int r6 = r6 * 8
                int r6 = r6 / r0
                androidx.media3.common.Format$Builder r0 = new androidx.media3.common.Format$Builder
                r0.<init>()
                java.lang.String r2 = "audio/raw"
                androidx.media3.common.Format$Builder r0 = r0.setSampleMimeType(r2)
                androidx.media3.common.Format$Builder r0 = r0.setAverageBitrate(r6)
                androidx.media3.common.Format$Builder r6 = r0.setPeakBitrate(r6)
                int r5 = numOutputFramesToBytes(r5, r1)
                androidx.media3.common.Format$Builder r5 = r6.setMaxInputSize(r5)
                int r6 = r7.numChannels
                androidx.media3.common.Format$Builder r5 = r5.setChannelCount(r6)
                int r6 = r7.frameRateHz
                androidx.media3.common.Format$Builder r5 = r5.setSampleRate(r6)
                r6 = 2
                androidx.media3.common.Format$Builder r5 = r5.setPcmEncoding(r6)
                androidx.media3.common.Format r5 = r5.build()
                r4.format = r5
                return
            L86:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Expected frames per block: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r6 = "; got: "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                r6 = 0
                androidx.media3.common.ParserException r5 = androidx.media3.common.ParserException.createForMalformedContainer(r5, r6)
                throw r5
        }

        private void decode(byte[] r5, int r6, androidx.media3.common.util.ParsableByteArray r7) {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                if (r1 >= r6) goto L18
                r2 = r0
            L5:
                androidx.media3.extractor.wav.WavFormat r3 = r4.wavFormat
                int r3 = r3.numChannels
                if (r2 >= r3) goto L15
                byte[] r3 = r7.getData()
                r4.decodeBlockForChannel(r5, r1, r2, r3)
                int r2 = r2 + 1
                goto L5
            L15:
                int r1 = r1 + 1
                goto L2
            L18:
                int r5 = r4.framesPerBlock
                int r5 = r5 * r6
                int r5 = r4.numOutputFramesToBytes(r5)
                r7.setPosition(r0)
                r7.setLimit(r5)
                return
        }

        private void decodeBlockForChannel(byte[] r11, int r12, int r13, byte[] r14) {
                r10 = this;
                androidx.media3.extractor.wav.WavFormat r0 = r10.wavFormat
                int r1 = r0.blockSize
                int r0 = r0.numChannels
                int r2 = r12 * r1
                int r3 = r13 * 4
                int r2 = r2 + r3
                int r3 = r0 * 4
                int r3 = r3 + r2
                int r1 = r1 / r0
                int r1 = r1 + (-4)
                int r4 = r2 + 1
                r4 = r11[r4]
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << 8
                r5 = r11[r2]
                r5 = r5 & 255(0xff, float:3.57E-43)
                r4 = r4 | r5
                short r4 = (short) r4
                int r2 = r2 + 2
                r2 = r11[r2]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r5 = 88
                int r2 = java.lang.Math.min(r2, r5)
                int[] r5 = androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.STEP_TABLE
                r5 = r5[r2]
                int r6 = r10.framesPerBlock
                int r12 = r12 * r6
                int r12 = r12 * r0
                int r12 = r12 + r13
                int r12 = r12 * 2
                r13 = r4 & 255(0xff, float:3.57E-43)
                byte r13 = (byte) r13
                r14[r12] = r13
                int r13 = r12 + 1
                int r6 = r4 >> 8
                byte r6 = (byte) r6
                r14[r13] = r6
                r13 = 0
                r6 = r13
            L44:
                int r7 = r1 * 2
                if (r6 >= r7) goto L99
                int r7 = r6 / 8
                int r8 = r6 / 2
                int r8 = r8 % 4
                int r7 = r7 * r0
                int r7 = r7 * 4
                int r7 = r7 + r3
                int r7 = r7 + r8
                r7 = r11[r7]
                r8 = r7 & 255(0xff, float:3.57E-43)
                int r9 = r6 % 2
                if (r9 != 0) goto L5e
                r7 = r7 & 15
                goto L60
            L5e:
                int r7 = r8 >> 4
            L60:
                r8 = r7 & 7
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r8 = r8 * r5
                int r5 = r8 >> 3
                r8 = r7 & 8
                if (r8 == 0) goto L6e
                int r5 = -r5
            L6e:
                int r4 = r4 + r5
                r5 = -32768(0xffffffffffff8000, float:NaN)
                r8 = 32767(0x7fff, float:4.5916E-41)
                int r4 = androidx.media3.common.util.Util.constrainValue(r4, r5, r8)
                int r5 = r0 * 2
                int r12 = r12 + r5
                r5 = r4 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                r14[r12] = r5
                int r5 = r12 + 1
                int r8 = r4 >> 8
                byte r8 = (byte) r8
                r14[r5] = r8
                int[] r5 = androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.INDEX_TABLE
                r5 = r5[r7]
                int r2 = r2 + r5
                int[] r5 = androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.STEP_TABLE
                int r7 = r5.length
                int r7 = r7 + (-1)
                int r2 = androidx.media3.common.util.Util.constrainValue(r2, r13, r7)
                r5 = r5[r2]
                int r6 = r6 + 1
                goto L44
            L99:
                return
        }

        private int numOutputBytesToFrames(int r2) {
                r1 = this;
                androidx.media3.extractor.wav.WavFormat r0 = r1.wavFormat
                int r0 = r0.numChannels
                int r0 = r0 * 2
                int r2 = r2 / r0
                return r2
        }

        private int numOutputFramesToBytes(int r2) {
                r1 = this;
                androidx.media3.extractor.wav.WavFormat r0 = r1.wavFormat
                int r0 = r0.numChannels
                int r2 = numOutputFramesToBytes(r2, r0)
                return r2
        }

        private static int numOutputFramesToBytes(int r0, int r1) {
                int r0 = r0 * 2
                int r0 = r0 * r1
                return r0
        }

        private void writeSampleMetadata(int r12) {
                r11 = this;
                long r0 = r11.startTimeUs
                long r2 = r11.outputFrameCount
                androidx.media3.extractor.wav.WavFormat r4 = r11.wavFormat
                int r4 = r4.frameRateHz
                long r6 = (long) r4
                r4 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = androidx.media3.common.util.Util.scaleLargeTimestamp(r2, r4, r6)
                long r5 = r0 + r2
                int r8 = r11.numOutputFramesToBytes(r12)
                int r0 = r11.pendingOutputBytes
                int r9 = r0 - r8
                androidx.media3.extractor.TrackOutput r4 = r11.trackOutput
                r7 = 1
                r10 = 0
                r4.sampleMetadata(r5, r7, r8, r9, r10)
                long r0 = r11.outputFrameCount
                long r2 = (long) r12
                long r0 = r0 + r2
                r11.outputFrameCount = r0
                int r12 = r11.pendingOutputBytes
                int r12 = r12 - r8
                r11.pendingOutputBytes = r12
                return
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int r9, long r10) {
                r8 = this;
                androidx.media3.extractor.ExtractorOutput r0 = r8.extractorOutput
                androidx.media3.extractor.wav.WavSeekMap r1 = new androidx.media3.extractor.wav.WavSeekMap
                androidx.media3.extractor.wav.WavFormat r2 = r8.wavFormat
                int r3 = r8.framesPerBlock
                long r4 = (long) r9
                r6 = r10
                r1.<init>(r2, r3, r4, r6)
                r0.seekMap(r1)
                androidx.media3.extractor.TrackOutput r9 = r8.trackOutput
                androidx.media3.common.Format r10 = r8.format
                r9.format(r10)
                return
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long r2) {
                r1 = this;
                r0 = 0
                r1.pendingInputBytes = r0
                r1.startTimeUs = r2
                r1.pendingOutputBytes = r0
                r2 = 0
                r1.outputFrameCount = r2
                return
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(androidx.media3.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = androidx.media3.common.util.Util.ceilDivide(r0, r1)
                androidx.media3.extractor.wav.WavFormat r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.inputData
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                androidx.media3.common.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                androidx.media3.extractor.TrackOutput r8 = r6.trackOutput
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
        }
    }

    public interface OutputWriter {
        void init(int r1, long r2) throws androidx.media3.common.ParserException;

        void reset(long r1);

        boolean sampleData(androidx.media3.extractor.ExtractorInput r1, long r2) throws java.io.IOException;
    }

    public static final class PassthroughOutputWriter implements androidx.media3.extractor.wav.WavExtractor.OutputWriter {
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private final androidx.media3.common.Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final androidx.media3.extractor.TrackOutput trackOutput;
        private final androidx.media3.extractor.wav.WavFormat wavFormat;

        public PassthroughOutputWriter(androidx.media3.extractor.ExtractorOutput r2, androidx.media3.extractor.TrackOutput r3, androidx.media3.extractor.wav.WavFormat r4, java.lang.String r5, int r6) throws androidx.media3.common.ParserException {
                r1 = this;
                r1.<init>()
                r1.extractorOutput = r2
                r1.trackOutput = r3
                r1.wavFormat = r4
                int r2 = r4.numChannels
                int r3 = r4.bitsPerSample
                int r2 = r2 * r3
                int r2 = r2 / 8
                int r3 = r4.blockSize
                if (r3 != r2) goto L4f
                int r3 = r4.frameRateHz
                int r0 = r3 * r2
                int r0 = r0 * 8
                int r3 = r3 * r2
                int r3 = r3 / 10
                int r2 = java.lang.Math.max(r2, r3)
                r1.targetSampleSizeBytes = r2
                androidx.media3.common.Format$Builder r3 = new androidx.media3.common.Format$Builder
                r3.<init>()
                androidx.media3.common.Format$Builder r3 = r3.setSampleMimeType(r5)
                androidx.media3.common.Format$Builder r3 = r3.setAverageBitrate(r0)
                androidx.media3.common.Format$Builder r3 = r3.setPeakBitrate(r0)
                androidx.media3.common.Format$Builder r2 = r3.setMaxInputSize(r2)
                int r3 = r4.numChannels
                androidx.media3.common.Format$Builder r2 = r2.setChannelCount(r3)
                int r3 = r4.frameRateHz
                androidx.media3.common.Format$Builder r2 = r2.setSampleRate(r3)
                androidx.media3.common.Format$Builder r2 = r2.setPcmEncoding(r6)
                androidx.media3.common.Format r2 = r2.build()
                r1.format = r2
                return
            L4f:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Expected block size: "
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = "; got: "
                r3.append(r2)
                int r2 = r4.blockSize
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r3 = 0
                androidx.media3.common.ParserException r2 = androidx.media3.common.ParserException.createForMalformedContainer(r2, r3)
                throw r2
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int r9, long r10) {
                r8 = this;
                androidx.media3.extractor.ExtractorOutput r0 = r8.extractorOutput
                androidx.media3.extractor.wav.WavSeekMap r1 = new androidx.media3.extractor.wav.WavSeekMap
                androidx.media3.extractor.wav.WavFormat r2 = r8.wavFormat
                r3 = 1
                long r4 = (long) r9
                r6 = r10
                r1.<init>(r2, r3, r4, r6)
                r0.seekMap(r1)
                androidx.media3.extractor.TrackOutput r9 = r8.trackOutput
                androidx.media3.common.Format r10 = r8.format
                r9.format(r10)
                return
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long r1) {
                r0 = this;
                r0.startTimeUs = r1
                r1 = 0
                r0.pendingOutputBytes = r1
                r1 = 0
                r0.outputFrameCount = r1
                return
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(androidx.media3.extractor.ExtractorInput r19, long r20) throws java.io.IOException {
                r18 = this;
                r0 = r18
                r1 = r20
            L4:
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r6 = 1
                if (r5 <= 0) goto L2d
                int r7 = r0.pendingOutputBytes
                int r8 = r0.targetSampleSizeBytes
                if (r7 >= r8) goto L2d
                int r8 = r8 - r7
                long r7 = (long) r8
                long r7 = java.lang.Math.min(r7, r1)
                int r5 = (int) r7
                androidx.media3.extractor.TrackOutput r7 = r0.trackOutput
                r8 = r19
                int r5 = r7.sampleData(r8, r5, r6)
                r6 = -1
                if (r5 != r6) goto L25
                r1 = r3
                goto L4
            L25:
                int r3 = r0.pendingOutputBytes
                int r3 = r3 + r5
                r0.pendingOutputBytes = r3
                long r3 = (long) r5
                long r1 = r1 - r3
                goto L4
            L2d:
                androidx.media3.extractor.wav.WavFormat r1 = r0.wavFormat
                int r2 = r1.blockSize
                int r3 = r0.pendingOutputBytes
                int r3 = r3 / r2
                if (r3 <= 0) goto L5e
                long r7 = r0.startTimeUs
                long r9 = r0.outputFrameCount
                int r1 = r1.frameRateHz
                long r13 = (long) r1
                r11 = 1000000(0xf4240, double:4.940656E-318)
                long r9 = androidx.media3.common.util.Util.scaleLargeTimestamp(r9, r11, r13)
                long r12 = r7 + r9
                int r15 = r3 * r2
                int r1 = r0.pendingOutputBytes
                int r16 = r1 - r15
                androidx.media3.extractor.TrackOutput r11 = r0.trackOutput
                r14 = 1
                r17 = 0
                r11.sampleMetadata(r12, r14, r15, r16, r17)
                r1 = r16
                long r7 = r0.outputFrameCount
                long r2 = (long) r3
                long r7 = r7 + r2
                r0.outputFrameCount = r7
                r0.pendingOutputBytes = r1
            L5e:
                if (r5 > 0) goto L61
                return r6
            L61:
                r1 = 0
                return r1
        }
    }

    static {
            androidx.media3.extractor.wav.a r0 = new androidx.media3.extractor.wav.a
            r0.<init>()
            androidx.media3.extractor.wav.WavExtractor.FACTORY = r0
            return
    }

    public WavExtractor() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.state = r0
            r0 = -1
            r3.rf64SampleDataSize = r0
            r2 = -1
            r3.dataStartPosition = r2
            r3.dataEndPosition = r0
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ androidx.media3.extractor.Extractor[] m3547a() {
            androidx.media3.extractor.wav.WavExtractor r0 = new androidx.media3.extractor.wav.WavExtractor
            r0.<init>()
            r1 = 1
            androidx.media3.extractor.Extractor[] r1 = new androidx.media3.extractor.Extractor[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    private void assertInitialized() {
            r1 = this;
            androidx.media3.extractor.TrackOutput r0 = r1.trackOutput
            androidx.media3.common.util.Assertions.checkStateNotNull(r0)
            androidx.media3.extractor.ExtractorOutput r0 = r1.extractorOutput
            androidx.media3.common.util.Util.castNonNull(r0)
            return
    }

    private void readFileType(androidx.media3.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            long r0 = r7.getPosition()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.media3.common.util.Assertions.checkState(r0)
            int r0 = r6.dataStartPosition
            r2 = -1
            if (r0 == r2) goto L1d
            r7.skipFully(r0)
            r7 = 4
            r6.state = r7
            return
        L1d:
            boolean r0 = androidx.media3.extractor.wav.WavHeaderReader.checkFileType(r7)
            if (r0 == 0) goto L33
            long r2 = r7.getPeekPosition()
            long r4 = r7.getPosition()
            long r2 = r2 - r4
            int r0 = (int) r2
            r7.skipFully(r0)
            r6.state = r1
            return
        L33:
            java.lang.String r7 = "Unsupported or unrecognized wav file type."
            r0 = 0
            androidx.media3.common.ParserException r7 = androidx.media3.common.ParserException.createForMalformedContainer(r7, r0)
            throw r7
    }

    private void readFormat(androidx.media3.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            androidx.media3.extractor.wav.WavFormat r3 = androidx.media3.extractor.wav.WavHeaderReader.readFormat(r7)
            int r7 = r3.formatType
            r0 = 17
            if (r7 != r0) goto L16
            androidx.media3.extractor.wav.WavExtractor$ImaAdPcmOutputWriter r7 = new androidx.media3.extractor.wav.WavExtractor$ImaAdPcmOutputWriter
            androidx.media3.extractor.ExtractorOutput r0 = r6.extractorOutput
            androidx.media3.extractor.TrackOutput r1 = r6.trackOutput
            r7.<init>(r0, r1, r3)
            r6.outputWriter = r7
            goto L4f
        L16:
            r0 = 6
            if (r7 != r0) goto L28
            androidx.media3.extractor.wav.WavExtractor$PassthroughOutputWriter r0 = new androidx.media3.extractor.wav.WavExtractor$PassthroughOutputWriter
            androidx.media3.extractor.ExtractorOutput r1 = r6.extractorOutput
            androidx.media3.extractor.TrackOutput r2 = r6.trackOutput
            java.lang.String r4 = "audio/g711-alaw"
            r5 = -1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outputWriter = r0
            goto L4f
        L28:
            r0 = 7
            if (r7 != r0) goto L3a
            androidx.media3.extractor.wav.WavExtractor$PassthroughOutputWriter r0 = new androidx.media3.extractor.wav.WavExtractor$PassthroughOutputWriter
            androidx.media3.extractor.ExtractorOutput r1 = r6.extractorOutput
            androidx.media3.extractor.TrackOutput r2 = r6.trackOutput
            java.lang.String r4 = "audio/g711-mlaw"
            r5 = -1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outputWriter = r0
            goto L4f
        L3a:
            int r0 = r3.bitsPerSample
            int r5 = androidx.media3.extractor.WavUtil.getPcmEncodingForType(r7, r0)
            if (r5 == 0) goto L53
            androidx.media3.extractor.wav.WavExtractor$PassthroughOutputWriter r0 = new androidx.media3.extractor.wav.WavExtractor$PassthroughOutputWriter
            androidx.media3.extractor.ExtractorOutput r1 = r6.extractorOutput
            androidx.media3.extractor.TrackOutput r2 = r6.trackOutput
            java.lang.String r4 = "audio/raw"
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outputWriter = r0
        L4f:
            r7 = 3
            r6.state = r7
            return
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unsupported WAV format type: "
            r7.append(r0)
            int r0 = r3.formatType
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            androidx.media3.common.ParserException r7 = androidx.media3.common.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
    }

    private void readRf64SampleDataSize(androidx.media3.extractor.ExtractorInput r3) throws java.io.IOException {
            r2 = this;
            long r0 = androidx.media3.extractor.wav.WavHeaderReader.readRf64SampleDataSize(r3)
            r2.rf64SampleDataSize = r0
            r3 = 2
            r2.state = r3
            return
    }

    private int readSampleData(androidx.media3.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            long r0 = r6.dataEndPosition
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = r1
        Lc:
            androidx.media3.common.util.Assertions.checkState(r0)
            long r2 = r6.dataEndPosition
            long r4 = r7.getPosition()
            long r2 = r2 - r4
            androidx.media3.extractor.wav.WavExtractor$OutputWriter r0 = r6.outputWriter
            java.lang.Object r0 = androidx.media3.common.util.Assertions.checkNotNull(r0)
            androidx.media3.extractor.wav.WavExtractor$OutputWriter r0 = (androidx.media3.extractor.wav.WavExtractor.OutputWriter) r0
            boolean r7 = r0.sampleData(r7, r2)
            if (r7 == 0) goto L26
            r7 = -1
            return r7
        L26:
            return r1
    }

    private void skipToSampleData(androidx.media3.extractor.ExtractorInput r9) throws java.io.IOException {
            r8 = this;
            android.util.Pair r0 = androidx.media3.extractor.wav.WavHeaderReader.skipToSampleData(r9)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r8.dataStartPosition = r1
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = r8.rf64SampleDataSize
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L28
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L28
            r0 = r2
        L28:
            int r2 = r8.dataStartPosition
            long r2 = (long) r2
            long r2 = r2 + r0
            r8.dataEndPosition = r2
            long r0 = r9.getLength()
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L5e
            long r2 = r8.dataEndPosition
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L5e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "Data exceeds input length: "
            r9.append(r2)
            long r2 = r8.dataEndPosition
            r9.append(r2)
            java.lang.String r2 = ", "
            r9.append(r2)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "WavExtractor"
            androidx.media3.common.util.Log.m2961w(r2, r9)
            r8.dataEndPosition = r0
        L5e:
            androidx.media3.extractor.wav.WavExtractor$OutputWriter r9 = r8.outputWriter
            java.lang.Object r9 = androidx.media3.common.util.Assertions.checkNotNull(r9)
            androidx.media3.extractor.wav.WavExtractor$OutputWriter r9 = (androidx.media3.extractor.wav.WavExtractor.OutputWriter) r9
            int r0 = r8.dataStartPosition
            long r1 = r8.dataEndPosition
            r9.init(r0, r1)
            r9 = 4
            r8.state = r9
            return
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput r3) {
            r2 = this;
            r2.extractorOutput = r3
            r0 = 0
            r1 = 1
            androidx.media3.extractor.TrackOutput r0 = r3.track(r0, r1)
            r2.trackOutput = r0
            r3.endTracks()
            return
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput r3, androidx.media3.extractor.PositionHolder r4) throws java.io.IOException {
            r2 = this;
            r2.assertInitialized()
            int r4 = r2.state
            r0 = 0
            if (r4 == 0) goto L2b
            r1 = 1
            if (r4 == r1) goto L27
            r1 = 2
            if (r4 == r1) goto L23
            r1 = 3
            if (r4 == r1) goto L1f
            r0 = 4
            if (r4 != r0) goto L19
            int r3 = r2.readSampleData(r3)
            return r3
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1f:
            r2.skipToSampleData(r3)
            return r0
        L23:
            r2.readFormat(r3)
            return r0
        L27:
            r2.readRf64SampleDataSize(r3)
            return r0
        L2b:
            r2.readFileType(r3)
            return r0
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
            r0 = this;
            return
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long r3, long r5) {
            r2 = this;
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L8
            r3 = 0
            goto L9
        L8:
            r3 = 4
        L9:
            r2.state = r3
            androidx.media3.extractor.wav.WavExtractor$OutputWriter r3 = r2.outputWriter
            if (r3 == 0) goto L12
            r3.reset(r5)
        L12:
            return
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = androidx.media3.extractor.wav.WavHeaderReader.checkFileType(r1)
            return r1
    }
}
