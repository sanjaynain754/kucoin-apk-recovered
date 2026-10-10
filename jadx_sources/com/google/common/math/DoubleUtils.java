package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;

    @VisibleForTesting
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    public static double nextDown(double d11) {
        return -Math.nextUp(-d11);
    }

    private DoubleUtils() {
    }

    public static double bigToDouble(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i11 = iBitLength - 1;
        if (i11 < 63) {
            return bigInteger.longValue();
        }
        if (i11 > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i12 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i12).longValue();
        long j11 = jLongValue >> 1;
        long j12 = SIGNIFICAND_MASK & j11;
        if ((jLongValue & 1) != 0 && ((j11 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i12)) {
            j12++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j12) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    public static double ensureNonNegative(double d11) {
        Preconditions.checkArgument(!Double.isNaN(d11));
        return Math.max(d11, 0.0d);
    }

    public static long getSignificand(double d11) {
        Preconditions.checkArgument(isFinite(d11), "not a normal value");
        int exponent = Math.getExponent(d11);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d11) & SIGNIFICAND_MASK;
        if (exponent == -1023) {
            return jDoubleToRawLongBits << 1;
        }
        return jDoubleToRawLongBits | IMPLICIT_BIT;
    }

    public static boolean isFinite(double d11) {
        if (Math.getExponent(d11) <= 1023) {
            return true;
        }
        return false;
    }

    public static boolean isNormal(double d11) {
        if (Math.getExponent(d11) >= -1022) {
            return true;
        }
        return false;
    }

    public static double scaleNormalize(double d11) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d11) & SIGNIFICAND_MASK) | ONE_BITS);
    }
}
