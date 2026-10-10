package androidx.media3.exoplayer.rtsp.reader;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPacket;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class RtpOpusReader implements RtpPayloadReader {
    private static final int MEDIA_CLOCK_FREQUENCY = 48000;
    private static final String TAG = "RtpOpusReader";
    private boolean foundOpusCommentHeader;
    private boolean foundOpusIDHeader;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = -1;
    private int previousSequenceNumber = -1;

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i11) {
        TrackOutput trackOutputTrack = extractorOutput.track(i11, 1);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.payloadFormat.format);
    }

    @Override // androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j11, int i11, boolean z11) {
        Assertions.checkStateNotNull(this.trackOutput);
        if (!this.foundOpusIDHeader) {
            validateOpusIdHeader(parsableByteArray);
            List<byte[]> listBuildInitializationData = OpusUtil.buildInitializationData(parsableByteArray.getData());
            Format.Builder builderBuildUpon = this.payloadFormat.format.buildUpon();
            builderBuildUpon.setInitializationData(listBuildInitializationData);
            this.trackOutput.format(builderBuildUpon.build());
            this.foundOpusIDHeader = true;
        } else if (this.foundOpusCommentHeader) {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i11 != nextSequenceNumber) {
                Log.m2961w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i11)));
            }
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
            this.trackOutput.sampleMetadata(RtpReaderUtils.toSampleTimeUs(this.startTimeOffsetUs, j11, this.firstReceivedTimestamp, 48000), 1, iBytesLeft, 0, null);
        } else {
            Assertions.checkArgument(parsableByteArray.limit() >= 8, "Comment Header has insufficient data");
            Assertions.checkArgument(parsableByteArray.readString(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.foundOpusCommentHeader = true;
        }
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

    public RtpOpusReader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static void validateOpusIdHeader(ParsableByteArray parsableByteArray) {
        boolean z11;
        int position = parsableByteArray.getPosition();
        boolean z12 = false;
        if (parsableByteArray.limit() > 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11, "ID Header has insufficient data");
        Assertions.checkArgument(parsableByteArray.readString(8).equals("OpusHead"), "ID Header missing");
        if (parsableByteArray.readUnsignedByte() == 1) {
            z12 = true;
        }
        Assertions.checkArgument(z12, "version number must always be 1");
        parsableByteArray.setPosition(position);
    }
}
