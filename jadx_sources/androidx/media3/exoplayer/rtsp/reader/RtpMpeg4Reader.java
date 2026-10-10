package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.Bytes;

/* JADX INFO: loaded from: classes34.dex */
final class RtpMpeg4Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final int MEDIA_CLOCK_FREQUENCY = 90000;
    private static final String TAG = "RtpMpeg4Reader";
    private int bufferFlags;
    private final RtpPayloadFormat payloadFormat;
    private int sampleLength;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 2);
        this.trackOutput = trackOutputTrack;
        ((TrackOutput) Util.castNonNull(trackOutputTrack)).format(this.payloadFormat.format);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        int nextSequenceNumber;
        Assertions.checkStateNotNull(this.trackOutput);
        int i12 = this.previousSequenceNumber;
        if (i12 != -1 && i11 != (nextSequenceNumber = RtpPacket.getNextSequenceNumber(i12))) {
            Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        if (this.sampleLength == 0) {
            this.bufferFlags = getBufferFlagsFromVop(parsableByteArray);
        }
        this.sampleLength += iBytesLeft;
        if (z11) {
            if (this.firstReceivedTimestamp == C2711C.TIME_UNSET) {
                this.firstReceivedTimestamp = j11;
            }
            this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, MEDIA_CLOCK_FREQUENCY), this.bufferFlags, this.sampleLength, 0, null);
            this.sampleLength = 0;
        }
        this.previousSequenceNumber = i11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j11, long j12) {
        this.firstReceivedTimestamp = j11;
        this.startTimeOffsetUs = j12;
        this.sampleLength = 0;
    }

    public RtpMpeg4Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static int getBufferFlagsFromVop(ParsableByteArray parsableByteArray) {
        int iIndexOf = Bytes.indexOf(parsableByteArray.getData(), new byte[]{0, 0, 1, -74});
        if (iIndexOf != -1) {
            parsableByteArray.setPosition(iIndexOf + 4);
            if ((parsableByteArray.peekUnsignedByte() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j11, int i11) {
    }
}
