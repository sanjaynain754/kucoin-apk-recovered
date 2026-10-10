package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    private static double ensureInUnitRange(double d11) {
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        if (d11 <= -1.0d) {
            return -1.0d;
        }
        return d11;
    }

    private static double ensurePositive(double d11) {
        if (d11 > 0.0d) {
            return d11;
        }
        return Double.MIN_VALUE;
    }

    public long count() {
        return this.xStats.count();
    }

    public int hashCode() {
        return Objects.hashCode(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(byteBufferOrder);
        this.yStats.writeTo(byteBufferOrder);
        byteBufferOrder.putDouble(this.sumOfProductsOfDeltas);
        return byteBufferOrder.array();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }

    public PairedStats(Stats stats, Stats stats2, double d11) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d11;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        boolean z11;
        Preconditions.checkNotNull(bArr);
        if (bArr.length == 88) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(byteBufferOrder), Stats.readFrom(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public LinearTransformation leastSquaresFit() {
        boolean z11;
        boolean z12 = false;
        if (count() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return LinearTransformation.forNaN();
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (dSumOfSquaresOfDeltas > 0.0d) {
            if (this.yStats.sumOfSquaresOfDeltas() > 0.0d) {
                return LinearTransformation.mapping(this.xStats.mean(), this.yStats.mean()).withSlope(this.sumOfProductsOfDeltas / dSumOfSquaresOfDeltas);
            }
            return LinearTransformation.horizontal(this.yStats.mean());
        }
        if (this.yStats.sumOfSquaresOfDeltas() > 0.0d) {
            z12 = true;
        }
        Preconditions.checkState(z12);
        return LinearTransformation.vertical(this.xStats.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (count() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        if (dSumOfSquaresOfDeltas > 0.0d) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkState(z12);
        if (dSumOfSquaresOfDeltas2 > 0.0d) {
            z13 = true;
        }
        Preconditions.checkState(z13);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public double populationCovariance() {
        boolean z11;
        if (count() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        boolean z11;
        if (count() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public String toString() {
        if (count() > 0) {
            return MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).add("populationCovariance", populationCovariance()).toString();
        }
        return MoreObjects.toStringHelper(this).add("xStats", this.xStats).add("yStats", this.yStats).toString();
    }
}
