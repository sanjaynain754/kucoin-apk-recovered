package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.metadata.id3.MlltFrame;

/* JADX INFO: loaded from: classes34.dex */
final class MlltSeeker implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private static Pair<Long, Long> linearlyInterpolate(long j11, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, j11, true, true);
        long j12 = jArr[iBinarySearchFloor];
        long j13 = jArr2[iBinarySearchFloor];
        int i11 = iBinarySearchFloor + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        long j14 = jArr[i11];
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((j14 == j12 ? 0.0d : (j11 - j12) / (j14 - j12)) * (jArr2[i11] - j13))) + j13));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static MlltSeeker create(long j11, MlltFrame mlltFrame, long j12) {
        int length = mlltFrame.bytesDeviations.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i13]);
            j13 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i13]);
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new MlltSeeker(jArr, jArr2, j12);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        Pair<Long, Long> pairLinearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j11, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) pairLinearlyInterpolate.first).longValue()), ((Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        return Util.msToUs(((Long) linearlyInterpolate(j11, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    private MlltSeeker(long[] jArr, long[] jArr2, long j11) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j11 == C2711C.TIME_UNSET ? Util.msToUs(jArr2[jArr2.length - 1]) : j11;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return C2711C.RATE_UNSET_INT;
    }
}
