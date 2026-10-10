package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
final class RtpVp8Reader implements RtpPayloadReader {
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final String TAG = "RtpVP8Reader";
    private boolean gotFirstPacketOfVp8Frame;
    private boolean isKeyFrame;
    private boolean isOutputFormatSet;
    private final RtpPayloadFormat payloadFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int previousSequenceNumber = -1;
    private int fragmentedSampleSizeBytes = -1;
    private long fragmentedSampleTimeUs = C2711C.TIME_UNSET;
    private long startTimeOffsetUs = 0;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 2);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    private void outputSampleMetadataForFragmentedPackets() {
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.trackOutput);
        long j11 = this.fragmentedSampleTimeUs;
        boolean z11 = this.isKeyFrame;
        trackOutput.sampleMetadata(j11, z11 ? 1 : 0, this.fragmentedSampleSizeBytes, 0, null);
        this.fragmentedSampleSizeBytes = -1;
        this.fragmentedSampleTimeUs = C2711C.TIME_UNSET;
        this.gotFirstPacketOfVp8Frame = false;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        Assertions.checkStateNotNull(this.trackOutput);
        if (validateVp8Descriptor(parsableByteArray, i11)) {
            if (this.fragmentedSampleSizeBytes == -1 && this.gotFirstPacketOfVp8Frame) {
                this.isKeyFrame = (parsableByteArray.peekUnsignedByte() & 1) == 0;
            }
            if (!this.isOutputFormatSet) {
                int position = parsableByteArray.getPosition();
                parsableByteArray.setPosition(position + 6);
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort() & 16383;
                int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort() & 16383;
                parsableByteArray.setPosition(position);
                Format format = this.payloadFormat.format;
                if (littleEndianUnsignedShort != format.width || littleEndianUnsignedShort2 != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(littleEndianUnsignedShort).setHeight(littleEndianUnsignedShort2).build());
                }
                this.isOutputFormatSet = true;
            }
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
            int i12 = this.fragmentedSampleSizeBytes;
            if (i12 == -1) {
                this.fragmentedSampleSizeBytes = iBytesLeft;
            } else {
                this.fragmentedSampleSizeBytes = i12 + iBytesLeft;
            }
            this.fragmentedSampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY);
            if (z11) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.previousSequenceNumber = i11;
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
        this.fragmentedSampleSizeBytes = -1;
        this.startTimeOffsetUs = j12;
    }

    public RtpVp8Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private boolean validateVp8Descriptor(ParsableByteArray parsableByteArray, int i11) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 16) == 16 && (unsignedByte & 7) == 0) {
            if (this.gotFirstPacketOfVp8Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfVp8Frame = true;
        } else if (this.gotFirstPacketOfVp8Frame) {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i11 < nextSequenceNumber) {
                Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
                return false;
            }
        } else {
            Log.m2961w(TAG, "RTP packet is not the start of a new VP8 partition, skipping.");
            return false;
        }
        if ((unsignedByte & 128) != 0) {
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            if ((unsignedByte2 & 128) != 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(1);
            }
            if ((unsignedByte2 & 64) != 0) {
                parsableByteArray.skipBytes(1);
            }
            if ((unsignedByte2 & 32) != 0 || (unsignedByte2 & 16) != 0) {
                parsableByteArray.skipBytes(1);
            }
        }
        return true;
    }
}
