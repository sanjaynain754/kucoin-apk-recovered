package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SNIFF_BYTES = 32768;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private static final String TAG = "Mp3Extractor";
    private long basisTimeUs;
    private TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private long endPositionOfLastSampleRead;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private final Id3Peeker id3Peeker;
    private boolean isSeekInProgress;

    @Nullable
    private Metadata metadata;
    private TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private long seekTimeUs;
    private Seeker seeker;
    private final TrackOutput skippingTrackOutput;
    private final MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp3.a
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp3Extractor.m3525a();
        }
    };
    private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.mp3.b
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i11, int i12, int i13, int i14, int i15) {
            return Mp3Extractor.m3526b(i11, i12, i13, i14, i15);
        }
    };

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput, boolean z11) throws IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, z11);
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C2711C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.seekTimeUs = j12;
        Seeker seeker = this.seeker;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).isTimeUsInIndex(j12)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return synchronize(extractorInput, true);
    }

    public Mp3Extractor(int i11) {
        this(i11, C2711C.TIME_UNSET);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Extractor[] m3525a() {
        return new Extractor[]{new Mp3Extractor()};
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.realTrackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m3526b(int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 67 && i13 == 79 && i14 == 77 && (i15 == 77 || i11 == 2)) {
            return true;
        }
        if (i12 == 77 && i13 == 76 && i14 == 76) {
            return i15 == 84 || i11 == 2;
        }
        return false;
    }

    private long computeTimeUs(long j11) {
        return this.basisTimeUs + ((j11 * 1000000) / ((long) this.synchronizedHeader.sampleRate));
    }

    private static long getId3TlenUs(@Nullable Metadata metadata) {
        if (metadata == null) {
            return C2711C.TIME_UNSET;
        }
        int length = metadata.length();
        for (int i11 = 0; i11 < length; i11++) {
            Metadata.Entry entry = metadata.get(i11);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f3519id.equals("TLEN")) {
                    return Util.msToUs(Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return C2711C.TIME_UNSET;
    }

    @Nullable
    private static MlltSeeker maybeHandleSeekMetadata(@Nullable Metadata metadata, long j11) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i11 = 0; i11 < length; i11++) {
            Metadata.Entry entry = metadata.get(i11);
            if (entry instanceof MlltFrame) {
                return MlltSeeker.create(j11, (MlltFrame) entry, getId3TlenUs(metadata));
            }
        }
        return null;
    }

    @Nullable
    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) throws IOException {
        int i11;
        int i12;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        MpegAudioUtil.Header header = this.synchronizedHeader;
        int i13 = 21;
        if ((header.version & 1) != 0) {
            if (header.channels != 1) {
                i13 = 36;
            }
        } else if (header.channels == 1) {
            i13 = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i13);
        if (seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                VbriSeeker vbriSeekerCreate = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return vbriSeekerCreate;
            }
            if (seekFrameHeader != SEEK_HEADER_XING) {
                extractorInput.resetPeekPosition();
                return null;
            }
        }
        XingFrame xingFrame = XingFrame.parse(this.synchronizedHeader, parsableByteArray);
        if (!this.gaplessInfoHolder.hasGaplessInfo() && (i11 = xingFrame.encoderDelay) != -1 && (i12 = xingFrame.encoderPadding) != -1) {
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            gaplessInfoHolder.encoderDelay = i11;
            gaplessInfoHolder.encoderPadding = i12;
        }
        long position = extractorInput.getPosition();
        if (extractorInput.getLength() != -1 && xingFrame.dataSize != -1 && extractorInput.getLength() != xingFrame.dataSize + position) {
            Log.m2959i(TAG, "Data size mismatch between stream (" + extractorInput.getLength() + ") and Xing frame (" + (xingFrame.dataSize + position) + "), using Xing value.");
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        return seekFrameHeader == SEEK_HEADER_XING ? XingSeeker.create(xingFrame, position) : getConstantBitrateSeeker(position, xingFrame, extractorInput.getLength());
    }

    private void maybeUpdateCbrDurationToLastSample() {
        Seeker seeker = this.seeker;
        if ((seeker instanceof ConstantBitrateSeeker) && seeker.isSeekable()) {
            long j11 = this.endPositionOfLastSampleRead;
            if (j11 == -1 || j11 == this.seeker.getDataEndPosition()) {
                return;
            }
            this.seeker = ((ConstantBitrateSeeker) this.seeker).copyWithNewDataEndPosition(this.endPositionOfLastSampleRead);
            ((ExtractorOutput) Assertions.checkNotNull(this.extractorOutput)).seekMap(this.seeker);
        }
    }

    private boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) throws IOException {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int readInternal(ExtractorInput extractorInput) throws Throwable {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker seekerComputeSeeker = computeSeeker(extractorInput);
            this.seeker = seekerComputeSeeker;
            this.extractorOutput.seekMap(seekerComputeSeeker);
            Format.Builder metadata = new Format.Builder().setSampleMimeType(this.synchronizedHeader.mimeType).setMaxInputSize(4096).setChannelCount(this.synchronizedHeader.channels).setSampleRate(this.synchronizedHeader.sampleRate).setEncoderDelay(this.gaplessInfoHolder.encoderDelay).setEncoderPadding(this.gaplessInfoHolder.encoderPadding).setMetadata((this.flags & 8) != 0 ? null : this.metadata);
            if (this.seeker.getAverageBitrate() != -2147483647) {
                metadata.setAverageBitrate(this.seeker.getAverageBitrate());
            }
            this.currentTrackOutput.format(metadata.build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j11 = this.firstSamplePosition;
            if (position < j11) {
                extractorInput.skipFully((int) (j11 - position));
            }
        }
        return readSample(extractorInput);
    }

    private int readSample(ExtractorInput extractorInput) throws IOException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int i11 = this.scratch.readInt();
            if (!headersMatch(i11, this.synchronizedHeaderData) || MpegAudioUtil.getFrameSize(i11) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(i11);
            if (this.basisTimeUs == C2711C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != C2711C.TIME_UNSET) {
                    this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            long position = extractorInput.getPosition();
            MpegAudioUtil.Header header = this.synchronizedHeader;
            this.endPositionOfLastSampleRead = position + ((long) header.frameSize);
            Seeker seeker = this.seeker;
            if (seeker instanceof IndexSeeker) {
                IndexSeeker indexSeeker = (IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + ((long) header.samplesPerFrame)), this.endPositionOfLastSampleRead);
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int iSampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i12 = this.sampleBytesRemaining - iSampleData;
        this.sampleBytesRemaining = i12;
        if (i12 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += (long) this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private boolean synchronize(ExtractorInput extractorInput, boolean z11) throws Throwable {
        int peekPosition;
        int i11;
        int frameSize;
        int i12 = z11 ? 32768 : 131072;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            Metadata metadataPeekId3Data = this.id3Peeker.peekId3Data(extractorInput, (this.flags & 8) == 0 ? null : REQUIRED_ID3_FRAME_PREDICATE);
            this.metadata = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) extractorInput.getPeekPosition();
            if (!z11) {
                extractorInput.skipFully(peekPosition);
            }
            i11 = 0;
        } else {
            peekPosition = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (peekEndOfStreamOrHeader(extractorInput)) {
                if (i13 > 0) {
                    break;
                }
                maybeUpdateCbrDurationToLastSample();
                throw new EOFException();
            }
            this.scratch.setPosition(0);
            int i15 = this.scratch.readInt();
            if ((i11 == 0 || headersMatch(i15, i11)) && (frameSize = MpegAudioUtil.getFrameSize(i15)) != -1) {
                i13++;
                if (i13 != 1) {
                    if (i13 == 4) {
                        break;
                    }
                } else {
                    this.synchronizedHeader.setForHeaderData(i15);
                    i11 = i15;
                }
                extractorInput.advancePeekPosition(frameSize - 4);
            } else {
                int i16 = i14 + 1;
                if (i14 == i12) {
                    if (z11) {
                        return false;
                    }
                    maybeUpdateCbrDurationToLastSample();
                    throw new EOFException();
                }
                if (z11) {
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(peekPosition + i16);
                } else {
                    extractorInput.skipFully(1);
                }
                i13 = 0;
                i14 = i16;
                i11 = 0;
            }
        }
        if (z11) {
            extractorInput.skipFully(peekPosition + i14);
        } else {
            extractorInput.resetPeekPosition();
        }
        this.synchronizedHeaderData = i11;
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.realTrackOutput = trackOutputTrack;
        this.currentTrackOutput = trackOutputTrack;
        this.extractorOutput.endTracks();
    }

    public Mp3Extractor(int i11, long j11) {
        this.flags = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.forcedFirstSampleTimestampUs = j11;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioUtil.Header();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C2711C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
        this.endPositionOfLastSampleRead = -1L;
    }

    private Seeker computeSeeker(ExtractorInput extractorInput) throws IOException {
        long id3TlenUs;
        long dataEndPosition;
        Seeker seekerMaybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        MlltSeeker mlltSeekerMaybeHandleSeekMetadata = maybeHandleSeekMetadata(this.metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new Seeker.UnseekableSeeker();
        }
        if ((this.flags & 4) != 0) {
            if (mlltSeekerMaybeHandleSeekMetadata != null) {
                id3TlenUs = mlltSeekerMaybeHandleSeekMetadata.getDurationUs();
                dataEndPosition = mlltSeekerMaybeHandleSeekMetadata.getDataEndPosition();
            } else if (seekerMaybeReadSeekFrame != null) {
                id3TlenUs = seekerMaybeReadSeekFrame.getDurationUs();
                dataEndPosition = seekerMaybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.metadata);
                dataEndPosition = -1;
            }
            seekerMaybeReadSeekFrame = new IndexSeeker(id3TlenUs, extractorInput.getPosition(), dataEndPosition);
        } else if (mlltSeekerMaybeHandleSeekMetadata != null) {
            seekerMaybeReadSeekFrame = mlltSeekerMaybeHandleSeekMetadata;
        } else if (seekerMaybeReadSeekFrame == null) {
            seekerMaybeReadSeekFrame = null;
        }
        boolean z11 = true;
        if (seekerMaybeReadSeekFrame != null && (seekerMaybeReadSeekFrame.isSeekable() || (this.flags & 1) == 0)) {
            return seekerMaybeReadSeekFrame;
        }
        if ((this.flags & 2) == 0) {
            z11 = false;
        }
        return getConstantBitrateSeeker(extractorInput, z11);
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i11) {
        if (parsableByteArray.limit() >= i11 + 4) {
            parsableByteArray.setPosition(i11);
            int i12 = parsableByteArray.readInt();
            if (i12 == SEEK_HEADER_XING || i12 == SEEK_HEADER_INFO) {
                return i12;
            }
        }
        if (parsableByteArray.limit() >= 40) {
            parsableByteArray.setPosition(36);
            if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
                return SEEK_HEADER_VBRI;
            }
            return 0;
        }
        return 0;
    }

    private static boolean headersMatch(int i11, long j11) {
        if ((i11 & MPEG_AUDIO_HEADER_MASK) == (j11 & (-128000))) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws Throwable {
        assertInitialized();
        int internal = readInternal(extractorInput);
        if (internal == -1 && (this.seeker instanceof IndexSeeker)) {
            long jComputeTimeUs = computeTimeUs(this.samplesRead);
            if (this.seeker.getDurationUs() != jComputeTimeUs) {
                ((IndexSeeker) this.seeker).setDurationUs(jComputeTimeUs);
                this.extractorOutput.seekMap(this.seeker);
            }
        }
        return internal;
    }

    @Nullable
    private Seeker getConstantBitrateSeeker(long j11, XingFrame xingFrame, long j12) {
        long j13;
        long j14;
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == C2711C.TIME_UNSET) {
            return null;
        }
        long j15 = xingFrame.dataSize;
        if (j15 != -1) {
            long j16 = j11 + j15;
            j13 = j15 - ((long) xingFrame.header.frameSize);
            j14 = j16;
        } else {
            if (j12 == -1) {
                return null;
            }
            j13 = (j12 - j11) - ((long) xingFrame.header.frameSize);
            j14 = j12;
        }
        long j17 = j13;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new ConstantBitrateSeeker(j14, j11 + ((long) xingFrame.header.frameSize), Ints.checkedCast(Util.scaleLargeValue(j17, 8000000L, jComputeDurationUs, roundingMode)), Ints.checkedCast(LongMath.divide(j17, xingFrame.frameCount, roundingMode)), false);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
