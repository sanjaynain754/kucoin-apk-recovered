package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class DoubleMath {

    @VisibleForTesting
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = Math.log(2.0d);

    @VisibleForTesting
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static double log2(double d11) {
        return Math.log(d11) / LN_2;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(dArr[0]);
        long j11 = 1;
        for (int i11 = 1; i11 < dArr.length; i11++) {
            checkFinite(dArr[i11]);
            j11++;
            dCheckFinite += (dArr[i11] - dCheckFinite) / j11;
        }
        return dCheckFinite;
    }

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1 */
    public static /* synthetic */ class C84671 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static double factorial(int i11) {
        MathPreconditions.checkNonNegative("n", i11);
        if (i11 > MAX_FACTORIAL) {
            return Double.POSITIVE_INFINITY;
        }
        double d11 = 1.0d;
        for (int i12 = (i11 & (-16)) + 1; i12 <= i11; i12++) {
            d11 *= (double) i12;
        }
        return d11 * everySixteenthFactorial[i11 >> 4];
    }

    public static boolean fuzzyEquals(double d11, double d12, double d13) {
        MathPreconditions.checkNonNegative("tolerance", d13);
        if (Math.copySign(d11 - d12, 1.0d) <= d13 || d11 == d12) {
            return true;
        }
        return Double.isNaN(d11) && Double.isNaN(d12);
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d11) {
        if (d11 > 0.0d && DoubleUtils.isFinite(d11)) {
            long significand = DoubleUtils.getSignificand(d11);
            if ((significand & (significand - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @GwtIncompatible
    public static int log2(double d11, RoundingMode roundingMode) {
        boolean zIsPowerOfTwo;
        boolean z11 = false;
        Preconditions.checkArgument(d11 > 0.0d && DoubleUtils.isFinite(d11), "x must be positive and finite");
        int exponent = Math.getExponent(d11);
        if (!DoubleUtils.isNormal(d11)) {
            return log2(d11 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C84671.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d11));
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z11 = !isPowerOfTwo(d11);
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z11 = exponent < 0;
                zIsPowerOfTwo = isPowerOfTwo(d11);
                z11 &= !zIsPowerOfTwo;
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z11 = exponent >= 0;
                zIsPowerOfTwo = isPowerOfTwo(d11);
                z11 &= !zIsPowerOfTwo;
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dScaleNormalize = DoubleUtils.scaleNormalize(d11);
                if (dScaleNormalize * dScaleNormalize > 2.0d) {
                    z11 = true;
                }
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double checkFinite(double d11) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d11));
        return d11;
    }

    public static int fuzzyCompare(double d11, double d12, double d13) {
        if (fuzzyEquals(d11, d12, d13)) {
            return 0;
        }
        if (d11 < d12) {
            return -1;
        }
        if (d11 > d12) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(d11), Double.isNaN(d12));
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d11) {
        if (DoubleUtils.isFinite(d11)) {
            if (d11 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d11)) <= Math.getExponent(d11)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @GwtIncompatible
    public static double roundIntermediate(double d11, RoundingMode roundingMode) {
        int i11;
        if (DoubleUtils.isFinite(d11)) {
            switch (C84671.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
                case 1:
                    MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d11));
                    return d11;
                case 2:
                    if (d11 < 0.0d && !isMathematicalInteger(d11)) {
                        return ((long) d11) - 1;
                    }
                    return d11;
                case 3:
                    if (d11 > 0.0d && !isMathematicalInteger(d11)) {
                        return ((long) d11) + 1;
                    }
                    return d11;
                case 4:
                    return d11;
                case 5:
                    if (!isMathematicalInteger(d11)) {
                        long j11 = (long) d11;
                        if (d11 > 0.0d) {
                            i11 = 1;
                        } else {
                            i11 = -1;
                        }
                        return j11 + ((long) i11);
                    }
                    return d11;
                case 6:
                    return Math.rint(d11);
                case 7:
                    double dRint = Math.rint(d11);
                    if (Math.abs(d11 - dRint) == 0.5d) {
                        return d11 + Math.copySign(0.5d, d11);
                    }
                    return dRint;
                case 8:
                    double dRint2 = Math.rint(d11);
                    if (Math.abs(d11 - dRint2) != 0.5d) {
                        return dRint2;
                    }
                    return d11;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d11, RoundingMode roundingMode) {
        boolean z11;
        double dRoundIntermediate = roundIntermediate(d11, roundingMode);
        boolean z12 = false;
        if (MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE) {
            z12 = true;
        }
        if (z11 & z12) {
            return BigInteger.valueOf((long) dRoundIntermediate);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(dRoundIntermediate)).shiftLeft(Math.getExponent(dRoundIntermediate) - 52);
        if (dRoundIntermediate < 0.0d) {
            return bigIntegerShiftLeft.negate();
        }
        return bigIntegerShiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d11, RoundingMode roundingMode) {
        boolean z11;
        double dRoundIntermediate = roundIntermediate(d11, roundingMode);
        boolean z12 = false;
        if (dRoundIntermediate > -2.147483649E9d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dRoundIntermediate < 2.147483648E9d) {
            z12 = true;
        }
        MathPreconditions.checkInRangeForRoundingInputs(z11 & z12, d11, roundingMode);
        return (int) dRoundIntermediate;
    }

    @GwtIncompatible
    public static long roundToLong(double d11, RoundingMode roundingMode) {
        boolean z11;
        double dRoundIntermediate = roundIntermediate(d11, roundingMode);
        boolean z12 = false;
        if (MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE) {
            z12 = true;
        }
        MathPreconditions.checkInRangeForRoundingInputs(z11 & z12, d11, roundingMode);
        return (long) dRoundIntermediate;
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j11 = 0;
        for (int i11 : iArr) {
            j11 += (long) i11;
        }
        return j11 / ((double) iArr.length);
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d11 = jArr[0];
        long j11 = 1;
        for (int i11 = 1; i11 < jArr.length; i11++) {
            j11++;
            d11 += (jArr[i11] - d11) / j11;
        }
        return d11;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(it.next().doubleValue());
        long j11 = 1;
        while (it.hasNext()) {
            j11++;
            dCheckFinite += (checkFinite(it.next().doubleValue()) - dCheckFinite) / j11;
        }
        return dCheckFinite;
    }
}
