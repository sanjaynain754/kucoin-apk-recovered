package androidx.media3.common.util;

import androidx.media3.common.C2711C;
import androidx.media3.common.audio.SpeedProvider;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class SpeedProviderUtil {
    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j11) {
        long j12 = 0;
        double dMin = 0.0d;
        while (j12 < j11) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j12);
            if (nextSpeedChangeTimeUs == C2711C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (Math.min(nextSpeedChangeTimeUs, j11) - j12) / ((double) speedProvider.getSpeed(j12));
            j12 = nextSpeedChangeTimeUs;
        }
        return Math.round(dMin);
    }

    private SpeedProviderUtil() {
    }
}
