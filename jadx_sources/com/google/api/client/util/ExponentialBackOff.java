package com.google.api.client.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
public class ExponentialBackOff implements BackOff {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;
    private int currentIntervalMillis;
    private final int initialIntervalMillis;
    private final int maxElapsedTimeMillis;
    private final int maxIntervalMillis;
    private final double multiplier;
    private final NanoClock nanoClock;
    private final double randomizationFactor;
    long startTimeNanos;

    public static class Builder {
        int initialIntervalMillis = 500;
        double randomizationFactor = 0.5d;
        double multiplier = 1.5d;
        int maxIntervalMillis = 60000;
        int maxElapsedTimeMillis = 900000;
        NanoClock nanoClock = NanoClock.SYSTEM;

        public ExponentialBackOff build() {
            return new ExponentialBackOff(this);
        }

        public final int getInitialIntervalMillis() {
            return this.initialIntervalMillis;
        }

        public final int getMaxElapsedTimeMillis() {
            return this.maxElapsedTimeMillis;
        }

        public final int getMaxIntervalMillis() {
            return this.maxIntervalMillis;
        }

        public final double getMultiplier() {
            return this.multiplier;
        }

        public final NanoClock getNanoClock() {
            return this.nanoClock;
        }

        public final double getRandomizationFactor() {
            return this.randomizationFactor;
        }

        public Builder setInitialIntervalMillis(int i11) {
            this.initialIntervalMillis = i11;
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i11) {
            this.maxElapsedTimeMillis = i11;
            return this;
        }

        public Builder setMaxIntervalMillis(int i11) {
            this.maxIntervalMillis = i11;
            return this;
        }

        public Builder setMultiplier(double d11) {
            this.multiplier = d11;
            return this;
        }

        public Builder setRandomizationFactor(double d11) {
            this.randomizationFactor = d11;
            return this;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.nanoClock = (NanoClock) Preconditions.checkNotNull(nanoClock);
            return this;
        }
    }

    public ExponentialBackOff() {
        this(new Builder());
    }

    public static int getRandomValueFromInterval(double d11, double d12, int i11) {
        double d13 = i11;
        double d14 = d11 * d13;
        double d15 = d13 - d14;
        return (int) (d15 + (d12 * (((d13 + d14) - d15) + 1.0d)));
    }

    public ExponentialBackOff(Builder builder) {
        int i11 = builder.initialIntervalMillis;
        this.initialIntervalMillis = i11;
        double d11 = builder.randomizationFactor;
        this.randomizationFactor = d11;
        double d12 = builder.multiplier;
        this.multiplier = d12;
        int i12 = builder.maxIntervalMillis;
        this.maxIntervalMillis = i12;
        int i13 = builder.maxElapsedTimeMillis;
        this.maxElapsedTimeMillis = i13;
        this.nanoClock = builder.nanoClock;
        Preconditions.checkArgument(i11 > 0);
        Preconditions.checkArgument(0.0d <= d11 && d11 < 1.0d);
        Preconditions.checkArgument(d12 >= 1.0d);
        Preconditions.checkArgument(i12 >= i11);
        Preconditions.checkArgument(i13 > 0);
        reset();
    }

    private void incrementCurrentInterval() {
        int i11 = this.currentIntervalMillis;
        double d11 = i11;
        int i12 = this.maxIntervalMillis;
        double d12 = this.multiplier;
        if (d11 >= ((double) i12) / d12) {
            this.currentIntervalMillis = i12;
        } else {
            this.currentIntervalMillis = (int) (((double) i11) * d12);
        }
    }

    public final int getCurrentIntervalMillis() {
        return this.currentIntervalMillis;
    }

    public final long getElapsedTimeMillis() {
        return (this.nanoClock.nanoTime() - this.startTimeNanos) / 1000000;
    }

    public final int getInitialIntervalMillis() {
        return this.initialIntervalMillis;
    }

    public final int getMaxElapsedTimeMillis() {
        return this.maxElapsedTimeMillis;
    }

    public final int getMaxIntervalMillis() {
        return this.maxIntervalMillis;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public final double getRandomizationFactor() {
        return this.randomizationFactor;
    }

    @Override // com.google.api.client.util.BackOff
    public final void reset() {
        this.currentIntervalMillis = this.initialIntervalMillis;
        this.startTimeNanos = this.nanoClock.nanoTime();
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() throws IOException {
        if (getElapsedTimeMillis() > this.maxElapsedTimeMillis) {
            return -1L;
        }
        int randomValueFromInterval = getRandomValueFromInterval(this.randomizationFactor, Math.random(), this.currentIntervalMillis);
        incrementCurrentInterval();
        return randomValueFromInterval;
    }
}
