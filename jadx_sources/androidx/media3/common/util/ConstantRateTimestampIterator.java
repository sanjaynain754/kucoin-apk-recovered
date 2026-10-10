package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.media3.common.C2711C;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(@IntRange(from = 1) long j11, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        this(0L, j11, f11);
    }

    public ConstantRateTimestampIterator(@IntRange(from = 0) long j11, @IntRange(from = 1) long j12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        boolean z11 = false;
        Assertions.checkArgument(j12 > 0);
        Assertions.checkArgument(f11 > 0.0f);
        if (0 <= j11 && j11 < j12) {
            z11 = true;
        }
        Assertions.checkArgument(z11);
        this.startPositionUs = j11;
        this.endPositionUs = j12;
        this.frameRate = f11;
        this.totalNumberOfFramesToAdd = Math.round(((j12 - j11) / 1000000.0f) * f11);
        this.framesDurationUs = 1000000.0f / f11;
    }

    private long getTimestampUsAfter(int i11) {
        long jRound = this.startPositionUs + Math.round(this.framesDurationUs * ((double) i11));
        Assertions.checkState(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i11 = this.totalNumberOfFramesToAdd;
        return i11 == 0 ? C2711C.TIME_UNSET : getTimestampUsAfter(i11 - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        int i11 = this.framesAdded;
        this.framesAdded = i11 + 1;
        return getTimestampUsAfter(i11);
    }
}
