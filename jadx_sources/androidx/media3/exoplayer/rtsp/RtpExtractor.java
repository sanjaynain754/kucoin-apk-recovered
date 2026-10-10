package androidx.media3.exoplayer.rtsp;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.exoplayer.rtsp.reader.DefaultRtpPayloadReaderFactory;
import androidx.media3.exoplayer.rtsp.reader.RtpPayloadReader;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class RtpExtractor implements Extractor {
    private boolean firstPacketRead;

    @GuardedBy("lock")
    private boolean isSeekPending;
    private ExtractorOutput output;
    private final RtpPayloadReader payloadReader;
    private final int trackId;
    private final ParsableByteArray rtpPacketScratchBuffer = new ParsableByteArray(RtpPacket.MAX_SIZE);
    private final ParsableByteArray rtpPacketDataBuffer = new ParsableByteArray();
    private final Object lock = new Object();
    private final RtpPacketReorderingQueue reorderingQueue = new RtpPacketReorderingQueue();
    private volatile long firstTimestamp = C2711C.TIME_UNSET;
    private volatile int firstSequenceNumber = -1;

    @GuardedBy("lock")
    private long nextRtpTimestamp = C2711C.TIME_UNSET;

    @GuardedBy("lock")
    private long playbackStartTimeUs = C2711C.TIME_UNSET;

    private static long getCutoffTimeMs(long j11) {
        return j11 - 30;
    }

    public boolean hasReadFirstRtpPacket() {
        return this.firstPacketRead;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.payloadReader.createTracks(extractorOutput, this.trackId);
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(C2711C.TIME_UNSET));
        this.output = extractorOutput;
    }

    public void preSeek() {
        synchronized (this.lock) {
            this.isSeekPending = true;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.checkNotNull(this.output);
        int i11 = extractorInput.read(this.rtpPacketScratchBuffer.getData(), 0, RtpPacket.MAX_SIZE);
        if (i11 == -1) {
            return -1;
        }
        if (i11 == 0) {
            return 0;
        }
        this.rtpPacketScratchBuffer.setPosition(0);
        this.rtpPacketScratchBuffer.setLimit(i11);
        RtpPacket rtpPacket = RtpPacket.parse(this.rtpPacketScratchBuffer);
        if (rtpPacket == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long cutoffTimeMs = getCutoffTimeMs(jElapsedRealtime);
        this.reorderingQueue.offer(rtpPacket, jElapsedRealtime);
        RtpPacket rtpPacketPoll = this.reorderingQueue.poll(cutoffTimeMs);
        if (rtpPacketPoll == null) {
            return 0;
        }
        if (!this.firstPacketRead) {
            if (this.firstTimestamp == C2711C.TIME_UNSET) {
                this.firstTimestamp = rtpPacketPoll.timestamp;
            }
            if (this.firstSequenceNumber == -1) {
                this.firstSequenceNumber = rtpPacketPoll.sequenceNumber;
            }
            this.payloadReader.onReceivingFirstPacket(this.firstTimestamp, this.firstSequenceNumber);
            this.firstPacketRead = true;
        }
        synchronized (this.lock) {
            try {
                if (!this.isSeekPending) {
                    do {
                        this.rtpPacketDataBuffer.reset(rtpPacketPoll.payloadData);
                        this.payloadReader.consume(this.rtpPacketDataBuffer, rtpPacketPoll.timestamp, rtpPacketPoll.sequenceNumber, rtpPacketPoll.marker);
                        rtpPacketPoll = this.reorderingQueue.poll(cutoffTimeMs);
                    } while (rtpPacketPoll != null);
                } else if (this.nextRtpTimestamp != C2711C.TIME_UNSET && this.playbackStartTimeUs != C2711C.TIME_UNSET) {
                    this.reorderingQueue.reset();
                    this.payloadReader.seek(this.nextRtpTimestamp, this.playbackStartTimeUs);
                    this.isSeekPending = false;
                    this.nextRtpTimestamp = C2711C.TIME_UNSET;
                    this.playbackStartTimeUs = C2711C.TIME_UNSET;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        synchronized (this.lock) {
            try {
                if (!this.isSeekPending) {
                    this.isSeekPending = true;
                }
                this.nextRtpTimestamp = j11;
                this.playbackStartTimeUs = j12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setFirstSequenceNumber(int i11) {
        this.firstSequenceNumber = i11;
    }

    public void setFirstTimestamp(long j11) {
        this.firstTimestamp = j11;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public RtpExtractor(RtpPayloadFormat rtpPayloadFormat, int i11) {
        this.trackId = i11;
        this.payloadReader = (RtpPayloadReader) Assertions.checkNotNull(new DefaultRtpPayloadReaderFactory().createPayloadReader(rtpPayloadFormat));
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
