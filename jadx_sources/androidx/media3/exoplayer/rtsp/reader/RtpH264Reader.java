package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
final class RtpH264Reader implements RtpPayloadReader {
    private static final int FU_PAYLOAD_OFFSET = 2;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int NAL_UNIT_TYPE_IDR = 5;
    private static final int RTP_PACKET_TYPE_FU_A = 28;
    private static final int RTP_PACKET_TYPE_STAP_A = 24;
    private static final String TAG = "RtpH264Reader";
    private int bufferFlags;
    private int fragmentedSampleSizeBytes;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private final ParsableByteArray nalStartCodeArray = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    private final ParsableByteArray fuScratchBuffer = new ParsableByteArray();
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    private static int getBufferFlagsFromNalType(int i11) {
        return i11 == 5 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 2);
        this.trackOutput = trackOutputTrack;
        ((TrackOutput) Util.castNonNull(trackOutputTrack)).format(this.payloadFormat.format);
    }

    private int writeStartCode() {
        this.nalStartCodeArray.setPosition(0);
        int iBytesLeft = this.nalStartCodeArray.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(this.nalStartCodeArray, iBytesLeft);
        return iBytesLeft;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) throws ParserException {
        try {
            int i12 = parsableByteArray.getData()[0] & 31;
            Assertions.checkStateNotNull(this.trackOutput);
            if (i12 > 0 && i12 < 24) {
                processSingleNalUnitPacket(parsableByteArray);
            } else if (i12 == 24) {
                processSingleTimeAggregationPacket(parsableByteArray);
            } else {
                if (i12 != 28) {
                    throw ParserException.createForMalformedManifest(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i12)), null);
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
        } catch (IndexOutOfBoundsException e11) {
            throw ParserException.createForMalformedManifest(null, e11);
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j11, long j12) {
        this.firstReceivedTimestamp = j11;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j12;
    }

    public RtpH264Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void processFragmentationUnitPacket(ParsableByteArray parsableByteArray, int i11) {
        boolean z11;
        boolean z12 = false;
        byte b11 = parsableByteArray.getData()[0];
        byte b12 = parsableByteArray.getData()[1];
        int i12 = (b11 & 224) | (b12 & 31);
        if ((b12 & 128) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b12 & 64) > 0) {
            z12 = true;
        }
        if (z11) {
            this.fragmentedSampleSizeBytes += writeStartCode();
            parsableByteArray.getData()[1] = (byte) i12;
            this.fuScratchBuffer.reset(parsableByteArray.getData());
            this.fuScratchBuffer.setPosition(1);
        } else {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i11 != nextSequenceNumber) {
                Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
                return;
            } else {
                this.fuScratchBuffer.reset(parsableByteArray.getData());
                this.fuScratchBuffer.setPosition(2);
            }
        }
        int iBytesLeft = this.fuScratchBuffer.bytesLeft();
        this.trackOutput.sampleData(this.fuScratchBuffer, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        if (z12) {
            this.bufferFlags = getBufferFlagsFromNalType(i12 & 31);
        }
    }

    private void processSingleNalUnitPacket(ParsableByteArray parsableByteArray) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.fragmentedSampleSizeBytes += writeStartCode();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        this.bufferFlags = getBufferFlagsFromNalType(parsableByteArray.getData()[0] & 31);
    }

    private void processSingleTimeAggregationPacket(ParsableByteArray parsableByteArray) {
        parsableByteArray.readUnsignedByte();
        while (parsableByteArray.bytesLeft() > 4) {
            int unsignedShort = parsableByteArray.readUnsignedShort();
            this.fragmentedSampleSizeBytes += writeStartCode();
            this.trackOutput.sampleData(parsableByteArray, unsignedShort);
            this.fragmentedSampleSizeBytes += unsignedShort;
        }
        this.bufferFlags = 0;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j11, int i11) {
    }
}
