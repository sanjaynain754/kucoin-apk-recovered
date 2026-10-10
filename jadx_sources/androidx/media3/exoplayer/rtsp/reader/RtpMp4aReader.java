package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes34.dex */
final class RtpMp4aReader implements RtpPayloadReader {
    private static final String PARAMETER_MP4A_CONFIG = "config";
    private static final String TAG = "RtpMp4aReader";
    private long firstReceivedTimestamp;
    private int fragmentedSampleSizeBytes;
    private long fragmentedSampleTimeUs;
    private final int numberOfSubframes;
    private final RtpPayloadFormat payloadFormat;
    private int previousSequenceNumber;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 2);
        this.trackOutput = trackOutputTrack;
        ((TrackOutput) Util.castNonNull(trackOutputTrack)).format(this.payloadFormat.format);
    }

    private static int getNumOfSubframesFromMpeg4AudioConfig(ImmutableMap<String, String> immutableMap) throws ParserException {
        String str = immutableMap.get("config");
        int i11 = 0;
        i11 = 0;
        if (str != null && str.length() % 2 == 0) {
            ParsableBitArray parsableBitArray = new ParsableBitArray(Util.getBytesFromHexString(str));
            int bits = parsableBitArray.readBits(1);
            if (bits != 0) {
                throw ParserException.createForMalformedDataOfUnknownType("unsupported audio mux version: " + bits, null);
            }
            Assertions.checkArgument(parsableBitArray.readBits(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int bits2 = parsableBitArray.readBits(6);
            Assertions.checkArgument(parsableBitArray.readBits(4) == 0, "Only suppors one program.");
            Assertions.checkArgument(parsableBitArray.readBits(3) == 0, "Only suppors one layer.");
            i11 = bits2;
        }
        return i11 + 1;
    }

    private void outputSampleMetadataForFragmentedPackets() {
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleMetadata(this.fragmentedSampleTimeUs, 1, this.fragmentedSampleSizeBytes, 0, null);
        this.fragmentedSampleSizeBytes = 0;
        this.fragmentedSampleTimeUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        Assertions.checkStateNotNull(this.trackOutput);
        int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
        if (this.fragmentedSampleSizeBytes > 0 && nextSequenceNumber < i11) {
            outputSampleMetadataForFragmentedPackets();
        }
        for (int i12 = 0; i12 < this.numberOfSubframes; i12++) {
            int i13 = 0;
            while (parsableByteArray.getPosition() < parsableByteArray.limit()) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                i13 += unsignedByte;
                if (unsignedByte != 255) {
                    break;
                }
            }
            this.trackOutput.sampleData(parsableByteArray, i13);
            this.fragmentedSampleSizeBytes += i13;
        }
        this.fragmentedSampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, this.payloadFormat.clockRate);
        if (z11) {
            outputSampleMetadataForFragmentedPackets();
        }
        this.previousSequenceNumber = i11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j11, int i11) {
        Assertions.checkState(this.firstReceivedTimestamp == C2711C.TIME_UNSET);
        this.firstReceivedTimestamp = j11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j11, long j12) {
        this.firstReceivedTimestamp = j11;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j12;
    }

    public RtpMp4aReader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
        try {
            this.numberOfSubframes = getNumOfSubframesFromMpeg4AudioConfig(rtpPayloadFormat.fmtpParameters);
            this.firstReceivedTimestamp = C2711C.TIME_UNSET;
            this.previousSequenceNumber = -1;
            this.fragmentedSampleSizeBytes = 0;
            this.startTimeOffsetUs = 0L;
            this.fragmentedSampleTimeUs = C2711C.TIME_UNSET;
        } catch (ParserException e11) {
            throw new IllegalArgumentException(e11);
        }
    }
}
