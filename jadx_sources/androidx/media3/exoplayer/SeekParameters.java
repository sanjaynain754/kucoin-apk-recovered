package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC;
    public static final SeekParameters DEFAULT;
    public static final SeekParameters EXACT;
    public static final SeekParameters NEXT_SYNC;
    public static final SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs) {
                return true;
            }
        }
        return false;
    }

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long resolveSeekPositionUs(long j11, long j12, long j13) {
        long j14 = this.toleranceBeforeUs;
        if (j14 == 0 && this.toleranceAfterUs == 0) {
            return j11;
        }
        long jSubtractWithOverflowDefault = Util.subtractWithOverflowDefault(j11, j14, Long.MIN_VALUE);
        long jAddWithOverflowDefault = Util.addWithOverflowDefault(j11, this.toleranceAfterUs, Long.MAX_VALUE);
        boolean z11 = false;
        boolean z12 = jSubtractWithOverflowDefault <= j12 && j12 <= jAddWithOverflowDefault;
        if (jSubtractWithOverflowDefault <= j13 && j13 <= jAddWithOverflowDefault) {
            z11 = true;
        }
        if (z12 && z11) {
            if (Math.abs(j12 - j11) <= Math.abs(j13 - j11)) {
                return j12;
            }
            return j13;
        }
        if (!z12) {
            if (z11) {
                return j13;
            }
            return jSubtractWithOverflowDefault;
        }
        return j12;
    }

    public SeekParameters(long j11, long j12) {
        boolean z11;
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        Assertions.checkArgument(j12 >= 0);
        this.toleranceBeforeUs = j11;
        this.toleranceAfterUs = j12;
    }
}
