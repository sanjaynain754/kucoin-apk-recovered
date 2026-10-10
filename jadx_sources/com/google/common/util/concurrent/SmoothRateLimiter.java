package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.math.LongMath;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class SmoothRateLimiter extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    public static final class SmoothBursty extends SmoothRateLimiter {
        final double maxBurstSeconds;

        public SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d11) {
            super(sleepingStopwatch);
            this.maxBurstSeconds = d11;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d11, double d12) {
            double d13 = this.maxPermits;
            double d14 = this.maxBurstSeconds * d11;
            this.maxPermits = d14;
            if (d13 == Double.POSITIVE_INFINITY) {
                this.storedPermits = d14;
            } else {
                this.storedPermits = d13 != 0.0d ? (this.storedPermits * d14) / d13 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d11, double d12) {
            return 0L;
        }
    }

    public static final class SmoothWarmingUp extends SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        public SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j11, TimeUnit timeUnit, double d11) {
            super(sleepingStopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(j11);
            this.coldFactor = d11;
        }

        private double permitsToTime(double d11) {
            return this.stableIntervalMicros + (d11 * this.slope);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d11, double d12) {
            double d13 = this.maxPermits;
            double d14 = this.coldFactor * d12;
            long j11 = this.warmupPeriodMicros;
            double d15 = (j11 * 0.5d) / d12;
            this.thresholdPermits = d15;
            double d16 = ((j11 * 2.0d) / (d12 + d14)) + d15;
            this.maxPermits = d16;
            this.slope = (d14 - d12) / (d16 - d15);
            if (d13 == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d13 != 0.0d) {
                d16 = (this.storedPermits * d16) / d13;
            }
            this.storedPermits = d16;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d11, double d12) {
            long jPermitsToTime;
            double d13 = d11 - this.thresholdPermits;
            if (d13 > 0.0d) {
                double dMin = Math.min(d13, d12);
                jPermitsToTime = (long) (((permitsToTime(d13) + permitsToTime(d13 - dMin)) * dMin) / 2.0d);
                d12 -= dMin;
            } else {
                jPermitsToTime = 0;
            }
            return jPermitsToTime + ((long) (this.stableIntervalMicros * d12));
        }
    }

    public abstract double coolDownIntervalMicros();

    public abstract void doSetRate(double d11, double d12);

    @Override // com.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double d11, long j11) {
        resync(j11);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d11;
        this.stableIntervalMicros = micros;
        doSetRate(d11, micros);
    }

    public abstract long storedPermitsToWaitTime(double d11, double d12);

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
        return TimeUnit.SECONDS.toMicros(1L) / this.stableIntervalMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable(long j11) {
        return this.nextFreeTicketMicros;
    }

    public void resync(long j11) {
        long j12 = this.nextFreeTicketMicros;
        if (j11 > j12) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((j11 - j12) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j11;
        }
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int i11, long j11) {
        resync(j11);
        long j12 = this.nextFreeTicketMicros;
        double d11 = i11;
        double dMin = Math.min(d11, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, dMin) + ((long) ((d11 - dMin) * this.stableIntervalMicros)));
        this.storedPermits -= dMin;
        return j12;
    }
}
