package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Stats implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    /* JADX INFO: renamed from: of */
    public static Stats m13629of(Iterable<? extends Number> iterable) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iterable);
        return statsAccumulator.snapshot();
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
    }

    public static double meanOf(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext());
        double dDoubleValue = it.next().doubleValue();
        long j11 = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            j11++;
            dDoubleValue = (Doubles.isFinite(dDoubleValue2) && Doubles.isFinite(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j11) : StatsAccumulator.calculateNewMeanNonFinite(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public long count() {
        return this.count;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
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

    public double populationVariance() {
        Preconditions.checkState(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / count();
    }

    public double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public Stats(long j11, double d11, double d12, double d13, double d14) {
        this.count = j11;
        this.mean = d11;
        this.sumOfSquaresOfDeltas = d12;
        this.min = d13;
        this.max = d14;
    }

    public static Stats fromByteArray(byte[] bArr) {
        boolean z11;
        Preconditions.checkNotNull(bArr);
        if (bArr.length == 40) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
        boolean z11;
        Preconditions.checkNotNull(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public String toString() {
        if (count() > 0) {
            return MoreObjects.toStringHelper(this).add("count", this.count).add("mean", this.mean).add("populationStandardDeviation", populationStandardDeviation()).add("min", this.min).add("max", this.max).toString();
        }
        return MoreObjects.toStringHelper(this).add("count", this.count).toString();
    }

    public void writeTo(ByteBuffer byteBuffer) {
        boolean z11;
        Preconditions.checkNotNull(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    /* JADX INFO: renamed from: of */
    public static Stats m13630of(Iterator<? extends Number> it) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(it);
        return statsAccumulator.snapshot();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m13631of(double... dArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(dArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dCalculateNewMeanNonFinite = dArr[0];
        for (int i11 = 1; i11 < dArr.length; i11++) {
            double d11 = dArr[i11];
            dCalculateNewMeanNonFinite = (Doubles.isFinite(d11) && Doubles.isFinite(dCalculateNewMeanNonFinite)) ? dCalculateNewMeanNonFinite + ((d11 - dCalculateNewMeanNonFinite) / ((double) (i11 + 1))) : StatsAccumulator.calculateNewMeanNonFinite(dCalculateNewMeanNonFinite, d11);
        }
        return dCalculateNewMeanNonFinite;
    }

    /* JADX INFO: renamed from: of */
    public static Stats m13632of(int... iArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iArr);
        return statsAccumulator.snapshot();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m13633of(long... jArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(jArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        double dCalculateNewMeanNonFinite = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            double d11 = iArr[i11];
            dCalculateNewMeanNonFinite = (Doubles.isFinite(d11) && Doubles.isFinite(dCalculateNewMeanNonFinite)) ? dCalculateNewMeanNonFinite + ((d11 - dCalculateNewMeanNonFinite) / ((double) (i11 + 1))) : StatsAccumulator.calculateNewMeanNonFinite(dCalculateNewMeanNonFinite, d11);
        }
        return dCalculateNewMeanNonFinite;
    }

    public static double meanOf(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        double dCalculateNewMeanNonFinite = jArr[0];
        for (int i11 = 1; i11 < jArr.length; i11++) {
            double d11 = jArr[i11];
            dCalculateNewMeanNonFinite = (Doubles.isFinite(d11) && Doubles.isFinite(dCalculateNewMeanNonFinite)) ? dCalculateNewMeanNonFinite + ((d11 - dCalculateNewMeanNonFinite) / ((double) (i11 + 1))) : StatsAccumulator.calculateNewMeanNonFinite(dCalculateNewMeanNonFinite, d11);
        }
        return dCalculateNewMeanNonFinite;
    }
}
