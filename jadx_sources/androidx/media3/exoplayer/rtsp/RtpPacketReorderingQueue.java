package androidx.media3.exoplayer.rtsp;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes34.dex */
final class RtpPacketReorderingQueue {

    @VisibleForTesting
    static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;

    @GuardedBy("this")
    private int lastDequeuedSequenceNumber;

    @GuardedBy("this")
    private int lastReceivedSequenceNumber;

    @GuardedBy("this")
    private final TreeSet<RtpPacketContainer> packetQueue = new TreeSet<>(new Comparator() { // from class: androidx.media3.exoplayer.rtsp.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return RtpPacketReorderingQueue.calculateSequenceNumberShift(((RtpPacketReorderingQueue.RtpPacketContainer) obj).packet.sequenceNumber, ((RtpPacketReorderingQueue.RtpPacketContainer) obj2).packet.sequenceNumber);
        }
    });

    @GuardedBy("this")
    private boolean started;

    private synchronized void addToQueue(RtpPacketContainer rtpPacketContainer) {
        this.lastReceivedSequenceNumber = rtpPacketContainer.packet.sequenceNumber;
        this.packetQueue.add(rtpPacketContainer);
    }

    public synchronized boolean offer(RtpPacket rtpPacket, long j11) {
        if (this.packetQueue.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i11 = rtpPacket.sequenceNumber;
        if (!this.started) {
            reset();
            this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i11);
            this.started = true;
            addToQueue(new RtpPacketContainer(rtpPacket, j11));
            return true;
        }
        if (Math.abs(calculateSequenceNumberShift(i11, RtpPacket.getNextSequenceNumber(this.lastReceivedSequenceNumber))) < 1000) {
            if (calculateSequenceNumberShift(i11, this.lastDequeuedSequenceNumber) <= 0) {
                return false;
            }
            addToQueue(new RtpPacketContainer(rtpPacket, j11));
            return true;
        }
        this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i11);
        this.packetQueue.clear();
        addToQueue(new RtpPacketContainer(rtpPacket, j11));
        return true;
    }

    @Nullable
    public synchronized RtpPacket poll(long j11) {
        if (this.packetQueue.isEmpty()) {
            return null;
        }
        RtpPacketContainer rtpPacketContainerFirst = this.packetQueue.first();
        int i11 = rtpPacketContainerFirst.packet.sequenceNumber;
        if (i11 != RtpPacket.getNextSequenceNumber(this.lastDequeuedSequenceNumber) && j11 < rtpPacketContainerFirst.receivedTimestampMs) {
            return null;
        }
        this.packetQueue.pollFirst();
        this.lastDequeuedSequenceNumber = i11;
        return rtpPacketContainerFirst.packet;
    }

    public synchronized void reset() {
        this.packetQueue.clear();
        this.started = false;
        this.lastDequeuedSequenceNumber = -1;
        this.lastReceivedSequenceNumber = -1;
    }

    public static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket rtpPacket, long j11) {
            this.packet = rtpPacket;
            this.receivedTimestampMs = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateSequenceNumberShift(int i11, int i12) {
        int iMin;
        int i13 = i11 - i12;
        if (Math.abs(i13) <= 1000 || (iMin = (Math.min(i11, i12) - Math.max(i11, i12)) + 65535) >= 1000) {
            return i13;
        }
        return i11 < i12 ? iMin : -iMin;
    }

    public RtpPacketReorderingQueue() {
        reset();
    }
}
