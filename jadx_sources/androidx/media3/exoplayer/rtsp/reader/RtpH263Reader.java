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
final class RtpH263Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int PICTURE_START_CODE = 128;
    private static final String TAG = "RtpH263Reader";
    private int fragmentedSampleSizeBytes;
    private long fragmentedSampleTimeUs;
    private boolean gotFirstPacketOfH263Frame;
    private int height;
    private boolean isKeyFrame;
    private boolean isOutputFormatSet;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private int width;
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int previousSequenceNumber = -1;

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
        this.fragmentedSampleSizeBytes = 0;
        this.fragmentedSampleTimeUs = C2711C.TIME_UNSET;
        this.isKeyFrame = false;
        this.gotFirstPacketOfH263Frame = false;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        Assertions.checkStateNotNull(this.trackOutput);
        int position = parsableByteArray.getPosition();
        int unsignedShort = parsableByteArray.readUnsignedShort();
        boolean z12 = (unsignedShort & 1024) > 0;
        if ((unsignedShort & 512) != 0 || (unsignedShort & 504) != 0 || (unsignedShort & 7) != 0) {
            Log.m2961w(TAG, "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z12) {
            if (this.gotFirstPacketOfH263Frame && this.fragmentedSampleSizeBytes > 0) {
                outputSampleMetadataForFragmentedPackets();
            }
            this.gotFirstPacketOfH263Frame = true;
            if ((parsableByteArray.peekUnsignedByte() & 252) < 128) {
                Log.m2961w(TAG, "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                parsableByteArray.getData()[position] = 0;
                parsableByteArray.getData()[position + 1] = 0;
                parsableByteArray.setPosition(position);
            }
        } else {
            if (!this.gotFirstPacketOfH263Frame) {
                Log.m2961w(TAG, "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i11 < nextSequenceNumber) {
                Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
                return;
            }
        }
        if (this.fragmentedSampleSizeBytes == 0) {
            parseVopHeader(parsableByteArray, this.isOutputFormatSet);
            if (!this.isOutputFormatSet && this.isKeyFrame) {
                int i12 = this.width;
                Format format = this.payloadFormat.format;
                if (i12 != format.width || this.height != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.isOutputFormatSet = true;
            }
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        this.fragmentedSampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY);
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

    public RtpH263Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void parseVopHeader(ParsableByteArray parsableByteArray, boolean z11) {
        int position = parsableByteArray.getPosition();
        boolean z12 = false;
        if (((parsableByteArray.readUnsignedInt() >> 10) & 63) == 32) {
            int iPeekUnsignedByte = parsableByteArray.peekUnsignedByte();
            int i11 = (iPeekUnsignedByte >> 1) & 1;
            if (!z11 && i11 == 0) {
                int i12 = (iPeekUnsignedByte >> 2) & 7;
                if (i12 == 1) {
                    this.width = 128;
                    this.height = 96;
                } else {
                    int i13 = i12 - 2;
                    this.width = 176 << i13;
                    this.height = 144 << i13;
                }
            }
            parsableByteArray.setPosition(position);
            if (i11 == 0) {
                z12 = true;
            }
            this.isKeyFrame = z12;
            return;
        }
        parsableByteArray.setPosition(position);
        this.isKeyFrame = false;
    }
}
