package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import androidx.media3.common.C2711C;
import com.tencent.rmonitor.p145fd.FdLeakMonitor;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy("this")
    private long firstSampleTimestampUs;

    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy("this")
    private long timestampOffsetUs;

    public synchronized long adjustSampleTimestamp(long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return C2711C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == MODE_SHARED) {
                    jLongValue = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j11;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j11;
            return j11 + this.timestampOffsetUs;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestamp(long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return C2711C.TIME_UNSET;
        }
        try {
            long j12 = this.lastUnadjustedTimestampUs;
            if (j12 != C2711C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j12);
                long j13 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j14 = ((j13 - 1) * MAX_PTS_PLUS_ONE) + j11;
                j11 += j13 * MAX_PTS_PLUS_ONE;
                if (Math.abs(j14 - jUsToNonWrappedPts) < Math.abs(j11 - jUsToNonWrappedPts)) {
                    j11 = j14;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return C2711C.TIME_UNSET;
        }
        try {
            long j12 = this.lastUnadjustedTimestampUs;
            if (j12 != C2711C.TIME_UNSET) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j12);
                long j13 = jUsToNonWrappedPts / MAX_PTS_PLUS_ONE;
                long j14 = (j13 * MAX_PTS_PLUS_ONE) + j11;
                j11 += (j13 + 1) * MAX_PTS_PLUS_ONE;
                if (j14 >= jUsToNonWrappedPts) {
                    j11 = j14;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j11;
        j11 = this.firstSampleTimestampUs;
        if (j11 == Long.MAX_VALUE || j11 == MODE_SHARED) {
            j11 = C2711C.TIME_UNSET;
        }
        return j11;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j11;
        try {
            j11 = this.lastUnadjustedTimestampUs;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != C2711C.TIME_UNSET ? j11 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C2711C.TIME_UNSET;
    }

    public synchronized void reset(long j11) {
        this.firstSampleTimestampUs = j11;
        this.timestampOffsetUs = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C2711C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z11, long j11, long j12) throws InterruptedException, TimeoutException {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z11) {
                this.nextSampleTimestampUs.set(Long.valueOf(j11));
            } else {
                long jElapsedRealtime = 0;
                long j13 = j12;
                while (!isInitialized()) {
                    if (j12 == 0) {
                        wait();
                    } else {
                        Assertions.checkState(j13 > 0);
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        wait(j13);
                        jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j12 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j12 + " milliseconds");
                        }
                        j13 = j12 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public TimestampAdjuster(long j11) {
        reset(j11);
    }

    public static long ptsToUs(long j11) {
        return Util.scaleLargeTimestamp(j11, 1000000L, FdLeakMonitor.f75245i);
    }

    public static long usToNonWrappedPts(long j11) {
        return Util.scaleLargeTimestamp(j11, FdLeakMonitor.f75245i, 1000000L);
    }

    public static long usToWrappedPts(long j11) {
        return usToNonWrappedPts(j11) % MAX_PTS_PLUS_ONE;
    }
}
