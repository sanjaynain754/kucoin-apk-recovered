package androidx.media3.extractor;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class IndexSeekMap implements SeekMap {
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public void addSeekPoint(long j11, long j12) {
        if (this.timesUs.size() == 0 && j11 > 0) {
            this.positions.add(0L);
            this.timesUs.add(0L);
        }
        this.positions.add(j12);
        this.timesUs.add(j11);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        if (this.timesUs.size() == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j11, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j11 || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i11 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i11), this.positions.get(i11)));
    }

    public long getTimeUs(long j11) {
        if (this.timesUs.size() == 0) {
            return C2711C.TIME_UNSET;
        }
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j11, true, true));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j11, long j12) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        LongArray longArray = this.timesUs;
        return j11 - longArray.get(longArray.size() - 1) < j12;
    }

    public void setDurationUs(long j11) {
        this.durationUs = j11;
    }

    public IndexSeekMap(long[] jArr, long[] jArr2, long j11) {
        boolean z11;
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i11 = length + 1;
            LongArray longArray = new LongArray(i11);
            this.positions = longArray;
            LongArray longArray2 = new LongArray(i11);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        } else {
            this.positions = new LongArray(length);
            this.timesUs = new LongArray(length);
        }
        this.positions.addAll(jArr);
        this.timesUs.addAll(jArr2);
        this.durationUs = j11;
    }
}
