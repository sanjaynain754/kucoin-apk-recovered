package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
final class RtpH265Reader implements RtpPayloadReader {
    private static final int FU_PAYLOAD_OFFSET = 3;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int NAL_IDR_N_LP = 20;
    private static final int NAL_IDR_W_RADL = 19;
    private static final int RTP_PACKET_TYPE_AP = 48;
    private static final int RTP_PACKET_TYPE_FU = 49;
    private static final String TAG = "RtpH265Reader";
    private int bufferFlags;
    private int fragmentedSampleSizeBytes;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private final ParsableByteArray fuScratchBuffer = new ParsableByteArray();
    private final ParsableByteArray nalStartCodeArray = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 2);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    private static int getBufferFlagsFromNalType(int i11) {
        return (i11 == 19 || i11 == 20) ? 1 : 0;
    }

    private int writeStartCode() {
        this.nalStartCodeArray.setPosition(0);
        int iBytesLeft = this.nalStartCodeArray.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(this.nalStartCodeArray, iBytesLeft);
        return iBytesLeft;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) throws ParserException {
        if (parsableByteArray.getData().length == 0) {
            throw ParserException.createForMalformedManifest("Empty RTP data packet.", null);
        }
        int i12 = (parsableByteArray.getData()[0] >> 1) & 63;
        Assertions.checkStateNotNull(this.trackOutput);
        if (i12 >= 0 && i12 < 48) {
            processSingleNalUnitPacket(parsableByteArray);
        } else {
            if (i12 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i12 != 49) {
                throw ParserException.createForMalformedManifest(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i12)), null);
            }
            processFragmentationUnitPacket(parsableByteArray, i11);
        }
        if (z11) {
            if (this.firstReceivedTimestamp == C2711C.TIME_UNSET) {
                this.firstReceivedTimestamp = j11;
            }
            this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY), this.bufferFlags, this.fragmentedSampleSizeBytes, 0, null);
            this.fragmentedSampleSizeBytes = 0;
        }
        this.previousSequenceNumber = i11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j11, long j12) {
        this.firstReceivedTimestamp = j11;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j12;
    }

    public RtpH265Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void processFragmentationUnitPacket(ParsableByteArray parsableByteArray, int i11) throws ParserException {
        boolean z11;
        if (parsableByteArray.getData().length >= 3) {
            int i12 = parsableByteArray.getData()[1] & 7;
            byte b11 = parsableByteArray.getData()[2];
            int i13 = b11 & 63;
            boolean z12 = false;
            if ((b11 & 128) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((b11 & 64) > 0) {
                z12 = true;
            }
            if (z11) {
                this.fragmentedSampleSizeBytes += writeStartCode();
                parsableByteArray.getData()[1] = (byte) ((i13 << 1) & 127);
                parsableByteArray.getData()[2] = (byte) i12;
                this.fuScratchBuffer.reset(parsableByteArray.getData());
                this.fuScratchBuffer.setPosition(1);
            } else {
                int i14 = (this.previousSequenceNumber + 1) % 65535;
                if (i11 != i14) {
                    Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i14), Integer.valueOf(i11)));
                    return;
                } else {
                    this.fuScratchBuffer.reset(parsableByteArray.getData());
                    this.fuScratchBuffer.setPosition(3);
                }
            }
            int iBytesLeft = this.fuScratchBuffer.bytesLeft();
            this.trackOutput.sampleData(this.fuScratchBuffer, iBytesLeft);
            this.fragmentedSampleSizeBytes += iBytesLeft;
            if (z12) {
                this.bufferFlags = getBufferFlagsFromNalType(i13);
                return;
            }
            return;
        }
        throw ParserException.createForMalformedManifest("Malformed FU header.", null);
    }

    private void processSingleNalUnitPacket(ParsableByteArray parsableByteArray) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.fragmentedSampleSizeBytes += writeStartCode();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        this.bufferFlags = getBufferFlagsFromNalType((parsableByteArray.getData()[0] >> 1) & 63);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j11, int i11) {
    }
}
