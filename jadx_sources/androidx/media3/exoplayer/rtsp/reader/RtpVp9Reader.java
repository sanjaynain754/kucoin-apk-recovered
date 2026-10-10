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
final class RtpVp9Reader implements RtpPayloadReader {
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int SCALABILITY_STRUCTURE_SIZE = 4;
    private static final String TAG = "RtpVp9Reader";
    private boolean gotFirstPacketOfVp9Frame;
    private boolean isKeyFrame;
    private final RtpPayloadFormat payloadFormat;
    private boolean reportedOutputFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int fragmentedSampleSizeBytes = -1;
    private long fragmentedSampleTimeUs = C2711C.TIME_UNSET;
    private long startTimeOffsetUs = 0;
    private int previousSequenceNumber = -1;
    private int width = -1;
    private int height = -1;

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
        this.gotFirstPacketOfVp9Frame = false;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        int i12;
        int i13;
        Assertions.checkStateNotNull(this.trackOutput);
        if (validateVp9Descriptor(parsableByteArray, i11)) {
            if (this.fragmentedSampleSizeBytes == -1 && this.gotFirstPacketOfVp9Frame) {
                this.isKeyFrame = (parsableByteArray.peekUnsignedByte() & 4) == 0;
            }
            if (!this.reportedOutputFormat && (i12 = this.width) != -1 && (i13 = this.height) != -1) {
                Format format = this.payloadFormat.format;
                if (i12 != format.width || i13 != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.reportedOutputFormat = true;
            }
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
            int i14 = this.fragmentedSampleSizeBytes;
            if (i14 == -1) {
                this.fragmentedSampleSizeBytes = iBytesLeft;
            } else {
                this.fragmentedSampleSizeBytes = i14 + iBytesLeft;
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

    public RtpVp9Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private boolean validateVp9Descriptor(ParsableByteArray parsableByteArray, int i11) {
        boolean z11;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 8) == 8) {
            if (this.gotFirstPacketOfVp9Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfVp9Frame = true;
        } else if (this.gotFirstPacketOfVp9Frame) {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i11 < nextSequenceNumber) {
                Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
                return false;
            }
        } else {
            Log.m2961w(TAG, "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
            return false;
        }
        if ((unsignedByte & 128) != 0 && (parsableByteArray.readUnsignedByte() & 128) != 0 && parsableByteArray.bytesLeft() < 1) {
            return false;
        }
        int i12 = unsignedByte & 16;
        if (i12 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11, "VP9 flexible mode is not supported.");
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(1);
            if (parsableByteArray.bytesLeft() < 1) {
                return false;
            }
            if (i12 == 0) {
                parsableByteArray.skipBytes(1);
            }
        }
        if ((unsignedByte & 2) != 0) {
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int i13 = (unsignedByte2 >> 5) & 7;
            if ((unsignedByte2 & 16) != 0) {
                int i14 = i13 + 1;
                if (parsableByteArray.bytesLeft() < i14 * 4) {
                    return false;
                }
                for (int i15 = 0; i15 < i14; i15++) {
                    this.width = parsableByteArray.readUnsignedShort();
                    this.height = parsableByteArray.readUnsignedShort();
                }
            }
            if ((unsignedByte2 & 8) != 0) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                if (parsableByteArray.bytesLeft() < unsignedByte3) {
                    return false;
                }
                for (int i16 = 0; i16 < unsignedByte3; i16++) {
                    int unsignedShort = (parsableByteArray.readUnsignedShort() & 12) >> 2;
                    if (parsableByteArray.bytesLeft() < unsignedShort) {
                        return false;
                    }
                    parsableByteArray.skipBytes(unsignedShort);
                }
            }
        }
        return true;
    }
}
