package androidx.media3.exoplayer.rtsp.reader;

import android.util.Log;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class RtpPcmReader implements RtpPayloadReader {
    private static final String TAG = "RtpPcmReader";
    private final RtpPayloadFormat payloadFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C2711C.TIME_UNSET;
    private long startTimeOffsetUs = 0;
    private int previousSequenceNumber = -1;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        int nextSequenceNumber;
        Assertions.checkNotNull(this.trackOutput);
        int i12 = this.previousSequenceNumber;
        if (i12 != -1 && i11 != (nextSequenceNumber = RtpPacket.getNextSequenceNumber(i12))) {
            Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
        }
        long sampleTimeUs = RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, this.payloadFormat.clockRate);
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.trackOutput.sampleMetadata(sampleTimeUs, 1, iBytesLeft, 0, null);
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

    public RtpPcmReader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }
}
