package androidx.media3.extractor.amr;

import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class AmrExtractor implements Extractor {
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private TrackOutput currentTrackOutput;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean isSeekInProgress;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private TrackOutput realTrackOutput;
    private final byte[] scratch;
    private SeekMap seekMap;
    private long seekTimeUs;
    private final TrackOutput skippingTrackOutput;
    private long timeOffsetUs;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.amr.a
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AmrExtractor.m3518a();
        }
    };
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] frameSizeBytesByTypeWb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] amrSignatureWb = Util.getUtf8Bytes("#!AMR-WB\n");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AmrExtractor() {
        this(0);
    }

    private static int getBitrateFromFrameSize(int i11, long j11) {
        return (int) ((((long) i11) * 8000000) / j11);
    }

    private boolean isSeekTimeUsWithinRange(long j11, long j12) {
        return Math.abs(j12 - j11) < 20000;
    }

    private void maybeOutputSeekMap(long j11, int i11) {
        int i12;
        if (this.seekMap != null) {
            return;
        }
        int i13 = this.flags;
        if ((i13 & 4) != 0) {
            this.seekMap = new IndexSeekMap(new long[]{this.firstSamplePosition}, new long[]{0}, C2711C.TIME_UNSET);
        } else if ((i13 & 1) == 0 || !((i12 = this.firstSampleSize) == -1 || i12 == this.currentSampleSize)) {
            this.seekMap = new SeekMap.Unseekable(C2711C.TIME_UNSET);
        } else if (this.numSamplesWithSameSize >= 20 || i11 == -1) {
            this.seekMap = getConstantBitrateSeekMap(j11, (i13 & 2) != 0);
        }
        SeekMap seekMap = this.seekMap;
        if (seekMap != null) {
            this.extractorOutput.seekMap(seekMap);
        }
    }

    public AmrExtractor(int i11) {
        this.flags = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.scratch = new byte[1];
        this.firstSampleSize = -1;
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Extractor[] m3518a() {
        return new Extractor[]{new AmrExtractor()};
    }

    public static byte[] amrSignatureNb() {
        byte[] bArr = amrSignatureNb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static byte[] amrSignatureWb() {
        byte[] bArr = amrSignatureWb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.realTrackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    public static int frameSizeBytesByTypeNb(int i11) {
        return frameSizeBytesByTypeNb[i11];
    }

    public static int frameSizeBytesByTypeWb(int i11) {
        return frameSizeBytesByTypeWb[i11];
    }

    private SeekMap getConstantBitrateSeekMap(long j11, boolean z11) {
        return new ConstantBitrateSeekMap(j11, this.firstSamplePosition, getBitrateFromFrameSize(this.firstSampleSize, 20000L), this.firstSampleSize, z11);
    }

    private boolean isNarrowBandValidFrameType(int i11) {
        if (this.isWideBand) {
            return false;
        }
        return i11 < 12 || i11 > 14;
    }

    private boolean isValidFrameType(int i11) {
        if (i11 < 0 || i11 > 15) {
            return false;
        }
        return isWideBandValidFrameType(i11) || isNarrowBandValidFrameType(i11);
    }

    private boolean isWideBandValidFrameType(int i11) {
        if (this.isWideBand) {
            return i11 < 10 || i11 > 13;
        }
        return false;
    }

    private void maybeOutputFormat() {
        if (this.hasOutputFormat) {
            return;
        }
        this.hasOutputFormat = true;
        boolean z11 = this.isWideBand;
        this.currentTrackOutput.format(new Format.Builder().setSampleMimeType(z11 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).setMaxInputSize(z11 ? frameSizeBytesByTypeWb[8] : frameSizeBytesByTypeNb[7]).setChannelCount(1).setSampleRate(z11 ? 16000 : 8000).build());
    }

    private boolean readAmrHeader(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = amrSignatureNb;
        if (peekAmrSignature(extractorInput, bArr)) {
            this.isWideBand = false;
            extractorInput.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!peekAmrSignature(extractorInput, bArr2)) {
            return false;
        }
        this.isWideBand = true;
        extractorInput.skipFully(bArr2.length);
        return true;
    }

    private int readSample(ExtractorInput extractorInput) throws IOException {
        if (this.currentSampleBytesRemaining == 0) {
            try {
                int iPeekNextSampleSize = peekNextSampleSize(extractorInput);
                this.currentSampleSize = iPeekNextSampleSize;
                this.currentSampleBytesRemaining = iPeekNextSampleSize;
                if (this.firstSampleSize == -1) {
                    this.firstSamplePosition = extractorInput.getPosition();
                    this.firstSampleSize = this.currentSampleSize;
                }
                if (this.firstSampleSize == this.currentSampleSize) {
                    this.numSamplesWithSameSize++;
                }
                SeekMap seekMap = this.seekMap;
                if (seekMap instanceof IndexSeekMap) {
                    IndexSeekMap indexSeekMap = (IndexSeekMap) seekMap;
                    long j11 = this.timeOffsetUs + this.currentSampleTimeUs + 20000;
                    long position = extractorInput.getPosition() + ((long) this.currentSampleSize);
                    if (!indexSeekMap.isTimeUsInIndex(j11, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                        indexSeekMap.addSeekPoint(j11, position);
                    }
                    if (this.isSeekInProgress && isSeekTimeUsWithinRange(j11, this.seekTimeUs)) {
                        this.isSeekInProgress = false;
                        this.currentTrackOutput = this.realTrackOutput;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.currentSampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i11 = this.currentSampleBytesRemaining - iSampleData;
        this.currentSampleBytesRemaining = i11;
        if (i11 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(this.timeOffsetUs + this.currentSampleTimeUs, 1, this.currentSampleSize, 0, null);
        this.currentSampleTimeUs += 20000;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.realTrackOutput = trackOutputTrack;
        this.currentTrackOutput = trackOutputTrack;
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.currentSampleTimeUs = 0L;
        this.currentSampleSize = 0;
        this.currentSampleBytesRemaining = 0;
        this.seekTimeUs = j12;
        SeekMap seekMap = this.seekMap;
        if (!(seekMap instanceof IndexSeekMap)) {
            if (j11 == 0 || !(seekMap instanceof ConstantBitrateSeekMap)) {
                this.timeOffsetUs = 0L;
                return;
            } else {
                this.timeOffsetUs = ((ConstantBitrateSeekMap) seekMap).getTimeUsAtPosition(j11);
                return;
            }
        }
        long timeUs = ((IndexSeekMap) seekMap).getTimeUs(j11);
        this.timeOffsetUs = timeUs;
        if (isSeekTimeUsWithinRange(timeUs, this.seekTimeUs)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    private int getFrameSizeInBytes(int i11) throws ParserException {
        String str;
        if (!isValidFrameType(i11)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.isWideBand) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i11);
            throw ParserException.createForMalformedContainer(sb2.toString(), null);
        }
        if (this.isWideBand) {
            return frameSizeBytesByTypeWb[i11];
        }
        return frameSizeBytesByTypeNb[i11];
    }

    private static boolean peekAmrSignature(ExtractorInput extractorInput, byte[] bArr) throws IOException {
        extractorInput.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int peekNextSampleSize(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.scratch, 0, 1);
        byte b11 = this.scratch[0];
        if ((b11 & 131) <= 0) {
            return getFrameSizeInBytes((b11 >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b11), null);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        if (extractorInput.getPosition() == 0 && !readAmrHeader(extractorInput)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        maybeOutputFormat();
        int sample = readSample(extractorInput);
        maybeOutputSeekMap(extractorInput.getLength(), sample);
        if (sample == -1) {
            SeekMap seekMap = this.seekMap;
            if (seekMap instanceof IndexSeekMap) {
                ((IndexSeekMap) seekMap).setDurationUs(this.timeOffsetUs + this.currentSampleTimeUs);
                this.extractorOutput.seekMap(this.seekMap);
            }
        }
        return sample;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return readAmrHeader(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
