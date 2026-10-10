package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.C2711C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
final class RtpAmrReader implements RtpPayloadReader {
    private static final int[] AMR_NB_FRAME_TYPE_INDEX_TO_FRAME_SIZE = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] AMR_WB_FRAME_TYPE_INDEX_TO_FRAME_SIZE = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final String TAG = "RtpAmrReader";
    private final boolean isWideBand;
    private final RtpPayloadFormat payloadFormat;
    private final int sampleRate;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private int previousSequenceNumber = -1;
    private long startTimeOffsetUs = 0;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    public static int getFrameSize(int i11, boolean z11) {
        boolean z12 = (i11 >= 0 && i11 <= 8) || i11 == 15;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(z11 ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i11);
        Assertions.checkArgument(z12, sb2.toString());
        return z11 ? AMR_WB_FRAME_TYPE_INDEX_TO_FRAME_SIZE[i11] : AMR_NB_FRAME_TYPE_INDEX_TO_FRAME_SIZE[i11];
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        int nextSequenceNumber;
        Assertions.checkStateNotNull(this.trackOutput);
        int i12 = this.previousSequenceNumber;
        if (i12 != -1 && i11 != (nextSequenceNumber = RtpPacket.getNextSequenceNumber(i12))) {
            Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
        }
        parsableByteArray.skipBytes(1);
        int frameSize = getFrameSize((parsableByteArray.peekUnsignedByte() >> 3) & 15, this.isWideBand);
        int iBytesLeft = parsableByteArray.bytesLeft();
        Assertions.checkArgument(iBytesLeft == frameSize, "compound payload not supported currently");
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, this.sampleRate), 1, iBytesLeft, 0, null);
        this.previousSequenceNumber = i11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j11, int i11) {
        this.firstReceivedTimestamp = j11;
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void seek(long j11, long j12) {
        this.firstReceivedTimestamp = j11;
        this.startTimeOffsetUs = j12;
    }

    public RtpAmrReader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
        this.isWideBand = MimeTypes.AUDIO_AMR_WB.equals(Assertions.checkNotNull(rtpPayloadFormat.format.sampleMimeType));
        this.sampleRate = rtpPayloadFormat.clockRate;
    }
}
