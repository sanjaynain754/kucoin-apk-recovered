package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: loaded from: classes34.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;

    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j11, int i11, long j12, int i12) {
        this(j11, i11, j12, i12, -1L, null);
    }

    private XingSeeker(long j11, int i11, long j12, int i12, long j13, @Nullable long[] jArr) {
        this.dataStartPosition = j11;
        this.xingFrameSize = i11;
        this.durationUs = j12;
        this.bitrate = i12;
        this.dataSize = j13;
        this.tableOfContents = jArr;
        this.dataEndPosition = j13 != -1 ? j11 + j13 : -1L;
    }

    private long getTimeUsForTableIndex(int i11) {
        return (this.durationUs * ((long) i11)) / 100;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        long j12 = j11 - this.dataStartPosition;
        if (!isSeekable() || j12 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d11 = (j12 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d11, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j13 = jArr[iBinarySearchFloor];
        int i11 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i11);
        long j14 = iBinarySearchFloor == 99 ? 256L : jArr[i11];
        return timeUsForTableIndex + Math.round((j13 == j14 ? 0.0d : (d11 - j13) / (j14 - j13)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    @Nullable
    public static XingSeeker create(XingFrame xingFrame, long j11) {
        long[] jArr;
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == C2711C.TIME_UNSET) {
            return null;
        }
        long j12 = xingFrame.dataSize;
        if (j12 != -1 && (jArr = xingFrame.tableOfContents) != null) {
            MpegAudioUtil.Header header = xingFrame.header;
            return new XingSeeker(j11, header.frameSize, jComputeDurationUs, header.bitrate, j12, jArr);
        }
        MpegAudioUtil.Header header2 = xingFrame.header;
        return new XingSeeker(j11, header2.frameSize, jComputeDurationUs, header2.bitrate);
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        double d11;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j11, 0L, this.durationUs);
        double d12 = (jConstrainValue * 100.0d) / this.durationUs;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d13 = 256.0d;
            } else {
                int i11 = (int) d12;
                long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
                double d14 = jArr[i11];
                if (i11 == 99) {
                    d11 = 256.0d;
                } else {
                    d11 = jArr[i11 + 1];
                }
                d13 = d14 + ((d12 - ((double) i11)) * (d11 - d14));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d13 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }
}
