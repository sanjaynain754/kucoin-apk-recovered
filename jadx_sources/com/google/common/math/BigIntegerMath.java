package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class BigIntegerMath {

    @VisibleForTesting
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    @VisibleForTesting
    static final BigInteger SQRT2_PRECOMPUTED_BITS = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double LN_10 = Math.log(10.0d);
    private static final double LN_2 = Math.log(2.0d);

    @GwtIncompatible
    public static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {
        static final BigIntegerToDoubleRounder INSTANCE = new BigIntegerToDoubleRounder();

        @Override // com.google.common.math.ToDoubleRounder
        public BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(BigInteger bigInteger) {
            return DoubleUtils.bigToDouble(bigInteger);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public int sign(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigInteger toX(double d11, RoundingMode roundingMode) {
            return DoubleMath.roundToBigInteger(d11, roundingMode);
        }

        private BigIntegerToDoubleRounder() {
        }
    }

    public static BigInteger listProduct(List<BigInteger> list) {
        return listProduct(list, 0, list.size());
    }

    /* JADX INFO: renamed from: com.google.common.math.BigIntegerMath$1 */
    public static /* synthetic */ class C84661 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static BigInteger binomial(int i11, int i12) {
        MathPreconditions.checkNonNegative("n", i11);
        MathPreconditions.checkNonNegative("k", i12);
        int i13 = 1;
        Preconditions.checkArgument(i12 <= i11, "k (%s) > n (%s)", i12, i11);
        if (i12 > (i11 >> 1)) {
            i12 = i11 - i12;
        }
        int[] iArr = LongMath.biggestBinomials;
        if (i12 < iArr.length && i11 <= iArr[i12]) {
            return BigInteger.valueOf(LongMath.binomial(i11, i12));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j11 = i11;
        int iLog2 = LongMath.log2(j11, RoundingMode.CEILING);
        long j12 = 1;
        while (true) {
            int i14 = iLog2;
            while (i13 < i12) {
                int i15 = i11 - i13;
                i13++;
                i14 += iLog2;
                if (i14 >= 63) {
                    bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j11)).divide(BigInteger.valueOf(j12));
                    j11 = i15;
                    j12 = i13;
                } else {
                    j11 *= (long) i15;
                    j12 *= (long) i13;
                }
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j11)).divide(BigInteger.valueOf(j12));
        }
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.CEILING));
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger factorial(int i11) {
        MathPreconditions.checkNonNegative("n", i11);
        long[] jArr = LongMath.factorials;
        if (i11 < jArr.length) {
            return BigInteger.valueOf(jArr[i11]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(IntMath.divide(IntMath.log2(i11, roundingMode) * i11, 64, roundingMode));
        int length = jArr.length;
        long j11 = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i12 = 1;
        int iLog2 = LongMath.log2(j12, roundingMode2) + 1;
        long j13 = length;
        int iLog3 = LongMath.log2(j13, roundingMode2);
        int i13 = iLog3 + 1;
        int i14 = 1 << iLog3;
        while (j13 <= i11) {
            int i15 = i12;
            long j14 = j13;
            if ((((long) i14) & j14) != 0) {
                i14 <<= 1;
                i13++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j14);
            long j15 = j14 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i13 - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(BigInteger.valueOf(j12));
                j12 = 1;
            }
            j12 *= j15;
            iLog2 = LongMath.log2(j12, RoundingMode.FLOOR) + i15;
            j13 = j14 + 1;
            i12 = i15;
        }
        if (j12 > 1) {
            arrayList.add(BigInteger.valueOf(j12));
        }
        return listProduct(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.FLOOR));
    }

    public static BigInteger listProduct(List<BigInteger> list, int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 == 0) {
            return BigInteger.ONE;
        }
        if (i13 == 1) {
            return list.get(i11);
        }
        if (i13 == 2) {
            return list.get(i11).multiply(list.get(i11 + 1));
        }
        if (i13 == 3) {
            return list.get(i11).multiply(list.get(i11 + 1)).multiply(list.get(i11 + 2));
        }
        int i14 = (i12 + i11) >>> 1;
        return listProduct(list, i11, i14).multiply(listProduct(list, i14, i12));
    }

    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
        int i11;
        int iCompareTo;
        MathPreconditions.checkPositive("x", bigInteger);
        if (fitsInLong(bigInteger)) {
            return LongMath.log10(bigInteger.longValue(), roundingMode);
        }
        int iLog2 = (int) ((((double) log2(bigInteger, RoundingMode.FLOOR)) * LN_2) / LN_10);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger bigIntegerPow = bigInteger2.pow(iLog2);
        int iCompareTo2 = bigIntegerPow.compareTo(bigInteger);
        if (iCompareTo2 > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(bigInteger);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = bigInteger2.multiply(bigIntegerPow);
            int iCompareTo3 = bigIntegerMultiply.compareTo(bigInteger);
            while (true) {
                int i12 = iCompareTo3;
                i11 = iCompareTo2;
                iCompareTo2 = i12;
                if (iCompareTo2 > 0) {
                    break;
                }
                iLog2++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                iCompareTo3 = bigIntegerMultiply2.compareTo(bigInteger);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
            }
            iCompareTo = i11;
        }
        switch (C84661.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompareTo == 0);
                return iLog2;
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(bigInteger) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
        return BigIntegerToDoubleRounder.INSTANCE.roundToDouble(bigInteger, roundingMode);
    }

    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", bigInteger);
        if (fitsInLong(bigInteger)) {
            return BigInteger.valueOf(LongMath.sqrt(bigInteger.longValue(), roundingMode));
        }
        BigInteger bigIntegerSqrtFloor = sqrtFloor(bigInteger);
        switch (C84661.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(bigIntegerSqrtFloor.pow(2).equals(bigInteger));
                return bigIntegerSqrtFloor;
            case 2:
            case 3:
                return bigIntegerSqrtFloor;
            case 4:
            case 5:
                int iIntValue = bigIntegerSqrtFloor.intValue();
                return (iIntValue * iIntValue == bigInteger.intValue() && bigIntegerSqrtFloor.pow(2).equals(bigInteger)) ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerSqrtFloor.pow(2).add(bigIntegerSqrtFloor).compareTo(bigInteger) >= 0 ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    private static BigInteger sqrtFloor(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft;
        int iLog2 = log2(bigInteger, RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = sqrtApproxWithDoubles(bigInteger);
        } else {
            int i11 = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = sqrtApproxWithDoubles(bigInteger.shiftRight(i11)).shiftLeft(i11 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(bigInteger.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }

    private BigIntegerMath() {
    }

    @GwtIncompatible
    public static boolean fitsInLong(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return true;
        }
        return false;
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        if (bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[RETURN] */
    public static int log2(BigInteger bigInteger, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", (BigInteger) Preconditions.checkNotNull(bigInteger));
        int iBitLength = bigInteger.bitLength();
        int i11 = iBitLength - 1;
        switch (C84661.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(bigInteger));
                return i11;
            case 2:
            case 3:
                return i11;
            case 4:
            case 5:
                if (!isPowerOfTwo(bigInteger)) {
                    return iBitLength;
                }
                return i11;
            case 6:
            case 7:
            case 8:
                if (i11 < 256) {
                    if (bigInteger.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - i11)) > 0) {
                        return iBitLength;
                    }
                } else if (bigInteger.pow(2).bitLength() - 1 >= (i11 * 2) + 1) {
                    return iBitLength;
                }
                return i11;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    private static BigInteger sqrtApproxWithDoubles(BigInteger bigInteger) {
        return DoubleMath.roundToBigInteger(Math.sqrt(DoubleUtils.bigToDouble(bigInteger)), RoundingMode.HALF_EVEN);
    }
}
