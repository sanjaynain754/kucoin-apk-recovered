package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class RtpAc3Reader implements RtpPayloadReader {
    private static final int AC3_FRAME_TYPE_COMPLETE_FRAME = 0;
    private static final int AC3_FRAME_TYPE_INITIAL_FRAGMENT_A = 1;
    private static final int AC3_FRAME_TYPE_INITIAL_FRAGMENT_B = 2;
    private static final int AC3_FRAME_TYPE_NON_INITIAL_FRAGMENT = 3;
    private static final int AC3_PAYLOAD_HEADER_SIZE = 2;
    private int numBytesPendingMetadataOutput;
    private final RtpPayloadFormat payloadFormat;
    private long sampleTimeUsOfFramePendingMetadataOutput;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private final ParsableBitArray scratchBitBuffer = new ParsableBitArray();
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    private void maybeOutputSampleMetadata() {
        if (this.numBytesPendingMetadataOutput > 0) {
            outputSampleMetadataForFragmentedPackets();
        }
    }

    private void outputSampleMetadataForFragmentedPackets() {
        ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata(this.sampleTimeUsOfFramePendingMetadataOutput, 1, this.numBytesPendingMetadataOutput, 0, null);
        this.numBytesPendingMetadataOutput = 0;
    }

    private void processMultiFramePacket(ParsableByteArray parsableByteArray, int i11, long j11) {
        this.scratchBitBuffer.reset(parsableByteArray.getData());
        this.scratchBitBuffer.skipBytes(2);
        long j12 = j11;
        for (int i12 = 0; i12 < i11; i12++) {
            Ac3Util.SyncFrameInfo ac3SyncframeInfo = Ac3Util.parseAc3SyncframeInfo(this.scratchBitBuffer);
            ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(parsableByteArray, ac3SyncframeInfo.frameSize);
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata(j12, 1, ac3SyncframeInfo.frameSize, 0, null);
            j12 += ((long) (ac3SyncframeInfo.sampleCount / ac3SyncframeInfo.sampleRate)) * 1000000;
            this.scratchBitBuffer.skipBytes(ac3SyncframeInfo.frameSize);
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j11, int i11) {
        Assertions.checkState(this.firstReceivedTimestamp == C2711C.TIME_UNSET);
        this.firstReceivedTimestamp = j11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j11, long j12) {
        this.firstReceivedTimestamp = j11;
        this.startTimeOffsetUs = j12;
    }

    public RtpAc3Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void processFragmentedPacket(ParsableByteArray parsableByteArray, boolean z11, int i11, long j11) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(parsableByteArray, iBytesLeft);
        this.numBytesPendingMetadataOutput += iBytesLeft;
        this.sampleTimeUsOfFramePendingMetadataOutput = j11;
        if (z11 && i11 == 3) {
            outputSampleMetadataForFragmentedPackets();
        }
    }

    private void processSingleFramePacket(ParsableByteArray parsableByteArray, long j11) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(parsableByteArray, iBytesLeft);
        ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata(j11, 1, iBytesLeft, 0, null);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
        int unsignedByte2 = parsableByteArray.readUnsignedByte() & 255;
        long sampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, this.payloadFormat.clockRate);
        if (unsignedByte != 0) {
            if (unsignedByte != 1 && unsignedByte != 2) {
                if (unsignedByte != 3) {
                    throw new IllegalArgumentException(String.valueOf(unsignedByte));
                }
            } else {
                maybeOutputSampleMetadata();
            }
            processFragmentedPacket(parsableByteArray, z11, unsignedByte, sampleTimeUs);
            return;
        }
        maybeOutputSampleMetadata();
        if (unsignedByte2 == 1) {
            processSingleFramePacket(parsableByteArray, sampleTimeUs);
        } else {
            processMultiFramePacket(parsableByteArray, unsignedByte2, sampleTimeUs);
        }
    }
}
