package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class StatsAccumulator {
    private long count = 0;
    private double mean = 0.0d;
    private double sumOfSquaresOfDeltas = 0.0d;
    private double min = Double.NaN;
    private double max = Double.NaN;

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    private void merge(long j11, double d11, double d12, double d13, double d14) {
        long j12 = this.count;
        if (j12 == 0) {
            this.count = j11;
            this.mean = d11;
            this.sumOfSquaresOfDeltas = d12;
            this.min = d13;
            this.max = d14;
            return;
        }
        this.count = j12 + j11;
        if (Doubles.isFinite(this.mean) && Doubles.isFinite(d11)) {
            double d15 = this.mean;
            double d16 = d11 - d15;
            double d17 = j11;
            double d18 = d15 + ((d16 * d17) / this.count);
            this.mean = d18;
            this.sumOfSquaresOfDeltas += d12 + (d16 * (d11 - d18) * d17);
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d11);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d13);
        this.max = Math.max(this.max, d14);
    }

    public void add(double d11) {
        long j11 = this.count;
        if (j11 == 0) {
            this.count = 1L;
            this.mean = d11;
            this.min = d11;
            this.max = d11;
            if (Doubles.isFinite(d11)) {
                return;
            }
            this.sumOfSquaresOfDeltas = Double.NaN;
            return;
        }
        this.count = j11 + 1;
        if (Doubles.isFinite(d11) && Doubles.isFinite(this.mean)) {
            double d12 = this.mean;
            double d13 = d11 - d12;
            double d14 = d12 + (d13 / this.count);
            this.mean = d14;
            this.sumOfSquaresOfDeltas += d13 * (d11 - d14);
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d11);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d11);
        this.max = Math.max(this.max, d11);
    }

    public long count() {
        return this.count;
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count != 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / this.count;
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public Stats snapshot() {
        return new Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
    }

    public final double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public static double calculateNewMeanNonFinite(double d11, double d12) {
        if (Doubles.isFinite(d11)) {
            return d12;
        }
        if (!Doubles.isFinite(d12) && d11 != d12) {
            return Double.NaN;
        }
        return d11;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public void addAll(double... dArr) {
        for (double d11 : dArr) {
            add(d11);
        }
    }

    public void addAll(int... iArr) {
        for (int i11 : iArr) {
            add(i11);
        }
    }

    public void addAll(long... jArr) {
        for (long j11 : jArr) {
            add(j11);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
    }
}
