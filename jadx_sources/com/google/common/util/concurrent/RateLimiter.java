package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
public abstract class RateLimiter {
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    public static abstract class SleepingStopwatch {
        public abstract long readMicros();

        public abstract void sleepMicrosUninterruptibly(long j11);

        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final Stopwatch stopwatch = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                public long readMicros() {
                    return this.stopwatch.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                public void sleepMicrosUninterruptibly(long j11) {
                    if (j11 > 0) {
                        Uninterruptibles.sleepUninterruptibly(j11, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }
    }

    public static RateLimiter create(double d11) {
        return create(d11, SleepingStopwatch.createFromSystemTimer());
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    public abstract double doGetRate();

    public abstract void doSetRate(double d11, long j11);

    public abstract long queryEarliestAvailable(long j11);

    public abstract long reserveEarliestAvailable(int i11, long j11);

    public boolean tryAcquire(long j11, TimeUnit timeUnit) {
        return tryAcquire(1, j11, timeUnit);
    }

    private static void checkPermits(int i11) {
        Preconditions.checkArgument(i11 > 0, "Requested permits (%s) must be positive", i11);
    }

    @VisibleForTesting
    public static RateLimiter create(double d11, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d11);
        return smoothBursty;
    }

    private Object mutex() {
        Object obj;
        Object obj2 = this.mutexDoNotUseDirectly;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.mutexDoNotUseDirectly;
                if (obj == null) {
                    obj = new Object();
                    this.mutexDoNotUseDirectly = obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire(int i11) {
        long jReserve = reserve(i11);
        this.stopwatch.sleepMicrosUninterruptibly(jReserve);
        return (jReserve * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public final void setRate(double d11) {
        Preconditions.checkArgument(d11 > 0.0d, "rate must be positive");
        synchronized (mutex()) {
            doSetRate(d11, this.stopwatch.readMicros());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(int i11) {
        return tryAcquire(i11, 0L, TimeUnit.MICROSECONDS);
    }

    public RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    private boolean canAcquire(long j11, long j12) {
        if (queryEarliestAvailable(j11) - j12 <= j11) {
            return true;
        }
        return false;
    }

    public final double getRate() {
        double dDoGetRate;
        synchronized (mutex()) {
            dDoGetRate = doGetRate();
        }
        return dDoGetRate;
    }

    public final long reserve(int i11) {
        long jReserveAndGetWaitLength;
        checkPermits(i11);
        synchronized (mutex()) {
            jReserveAndGetWaitLength = reserveAndGetWaitLength(i11, this.stopwatch.readMicros());
        }
        return jReserveAndGetWaitLength;
    }

    public final long reserveAndGetWaitLength(int i11, long j11) {
        return Math.max(reserveEarliestAvailable(i11, j11) - j11, 0L);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public static RateLimiter create(double d11, long j11, TimeUnit timeUnit) {
        Preconditions.checkArgument(j11 >= 0, "warmupPeriod must not be negative: %s", j11);
        return create(d11, j11, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    public boolean tryAcquire(int i11, long j11, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j11), 0L);
        checkPermits(i11);
        synchronized (mutex()) {
            try {
                long micros = this.stopwatch.readMicros();
                if (!canAcquire(micros, jMax)) {
                    return false;
                }
                this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i11, micros));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public static RateLimiter create(double d11, long j11, TimeUnit timeUnit, double d12, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j11, timeUnit, d12);
        smoothWarmingUp.setRate(d11);
        return smoothWarmingUp;
    }
}
