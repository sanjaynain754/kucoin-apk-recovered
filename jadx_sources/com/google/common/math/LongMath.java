package com.google.common.math;

import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import io.flutter.embedding.android.KeyboardMap;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = {1, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, InterfaceC33568bf.f69245q, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j11, long j12, long j13) {
                return (j11 * j12) % j13;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j11, long j12) {
                return (j11 * j11) % j12;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j11, long j12, long j13) {
                long j14 = j11 + j12;
                return j11 >= j13 - j12 ? j14 - j13 : j14;
            }

            private long times2ToThe32Mod(long j11, long j12) {
                int i11 = 32;
                do {
                    int iMin = Math.min(i11, Long.numberOfLeadingZeros(j11));
                    j11 = UnsignedLongs.remainder(j11 << iMin, j12);
                    i11 -= iMin;
                } while (i11 > 0);
                return j11;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j11, long j12, long j13) {
                long j14 = j11 >>> 32;
                long j15 = j12 >>> 32;
                long j16 = j11 & KeyboardMap.kValueMask;
                long j17 = j12 & KeyboardMap.kValueMask;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j14 * j15, j13) + (j14 * j17);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.remainder(jTimes2ToThe32Mod, j13);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + (j15 * j16), j13), UnsignedLongs.remainder(j16 * j17, j13), j13);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j11, long j12) {
                long j13 = j11 >>> 32;
                long j14 = j11 & KeyboardMap.kValueMask;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j13 * j13, j12);
                long jRemainder = j13 * j14 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j12);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, j12), UnsignedLongs.remainder(j14 * j14, j12), j12);
            }
        };

        public abstract long mulMod(long j11, long j12, long j13);

        public abstract long squareMod(long j11, long j12);

        /* synthetic */ MillerRabinTester(C84701 c84701) {
            this();
        }

        private long powMod(long j11, long j12, long j13) {
            long jSquareMod = j11;
            long jMulMod = 1;
            while (j12 != 0) {
                long j14 = j13;
                if ((j12 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, j14);
                }
                jSquareMod = squareMod(jSquareMod, j14);
                j12 >>= 1;
                j13 = j14;
            }
            return jMulMod;
        }

        private boolean testWitness(long j11, long j12) {
            long j13 = j12 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
            long j14 = j13 >> iNumberOfTrailingZeros;
            long j15 = j11 % j12;
            if (j15 == 0) {
                return true;
            }
            long jPowMod = powMod(j15, j14, j12);
            if (jPowMod == 1) {
                return true;
            }
            int i11 = 0;
            while (jPowMod != j13) {
                i11++;
                if (i11 == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j12);
            }
            return true;
        }

        public static boolean test(long j11, long j12) {
            MillerRabinTester millerRabinTester;
            if (j12 <= LongMath.FLOOR_SQRT_MAX_LONG) {
                millerRabinTester = SMALL;
            } else {
                millerRabinTester = LARGE;
            }
            return millerRabinTester.testWitness(j11, j12);
        }
    }

    @GwtIncompatible
    public static long checkedPow(long j11, int i11) {
        int i12 = i11;
        MathPreconditions.checkNonNegative("exponent", i12);
        long jCheckedMultiply = 1;
        if (!(j11 >= -2) || !(j11 <= 2)) {
            long j12 = j11;
            while (i12 != 0) {
                if (i12 == 1) {
                    return checkedMultiply(jCheckedMultiply, j12);
                }
                if ((i12 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j12);
                }
                i12 >>= 1;
                if (i12 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j12 && j12 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j12, i12);
                    j12 *= j12;
                }
            }
            return jCheckedMultiply;
        }
        int i13 = (int) j11;
        if (i13 == -2) {
            MathPreconditions.checkNoOverflow(i12 < 64, "checkedPow", j11, i12);
            return (i12 & 1) == 0 ? 1 << i12 : (-1) << i12;
        }
        if (i13 == -1) {
            return (i12 & 1) == 0 ? 1L : -1L;
        }
        if (i13 == 0) {
            return i12 == 0 ? 1L : 0L;
        }
        if (i13 == 1) {
            return 1L;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.checkNoOverflow(i12 < 63, "checkedPow", j11, i12);
        return 1 << i12;
    }

    public static boolean fitsInInt(long j11) {
        return ((long) ((int) j11)) == j11;
    }

    @VisibleForTesting
    public static int lessThanBranchFree(long j11, long j12) {
        return (int) ((~(~(j11 - j12))) >>> 63);
    }

    @GwtIncompatible
    public static int mod(long j11, int i11) {
        return (int) mod(j11, i11);
    }

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1 */
    public static /* synthetic */ class C84701 {
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

    public static long binomial(int i11, int i12) {
        MathPreconditions.checkNonNegative("n", i11);
        MathPreconditions.checkNonNegative("k", i12);
        Preconditions.checkArgument(i12 <= i11, "k (%s) > n (%s)", i12, i11);
        if (i12 > (i11 >> 1)) {
            i12 = i11 - i12;
        }
        long jMultiplyFraction = 1;
        if (i12 == 0) {
            return 1L;
        }
        if (i12 == 1) {
            return i11;
        }
        long[] jArr = factorials;
        if (i11 < jArr.length) {
            return jArr[i11] / (jArr[i12] * jArr[i11 - i12]);
        }
        int[] iArr = biggestBinomials;
        if (i12 >= iArr.length || i11 > iArr[i12]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i12 < iArr2.length && i11 <= iArr2[i12]) {
            int i13 = i11 - 1;
            long j11 = i11;
            for (int i14 = 2; i14 <= i12; i14++) {
                j11 = (j11 * ((long) i13)) / ((long) i14);
                i13--;
            }
            return j11;
        }
        long j12 = i11;
        int iLog2 = log2(j12, RoundingMode.CEILING);
        int i15 = i11 - 1;
        int i16 = iLog2;
        int i17 = 2;
        long j13 = j12;
        long j14 = 1;
        while (i17 <= i12) {
            i16 += iLog2;
            if (i16 < 63) {
                j13 *= (long) i15;
                j14 *= (long) i17;
            } else {
                jMultiplyFraction = multiplyFraction(jMultiplyFraction, j13, j14);
                j13 = i15;
                j14 = i17;
                i16 = iLog2;
            }
            i17++;
            i15--;
        }
        return multiplyFraction(jMultiplyFraction, j13, j14);
    }

    public static long ceilingPowerOfTwo(long j11) {
        MathPreconditions.checkPositive("x", j11);
        if (j11 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j11 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + j11 + ") is not representable as a long");
    }

    public static long checkedAdd(long j11, long j12) {
        long j13 = j11 + j12;
        MathPreconditions.checkNoOverflow(((j11 ^ j12) < 0) | ((j11 ^ j13) >= 0), "checkedAdd", j11, j12);
        return j13;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j11, long j12) {
        long j13 = j11 - j12;
        MathPreconditions.checkNoOverflow(((j11 ^ j12) >= 0) | ((j11 ^ j13) >= 0), "checkedSubtract", j11, j12);
        return j13;
    }

    @GwtIncompatible
    public static long factorial(int i11) {
        MathPreconditions.checkNonNegative("n", i11);
        long[] jArr = factorials;
        if (i11 < jArr.length) {
            return jArr[i11];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long j11) {
        MathPreconditions.checkPositive("x", j11);
        return 1 << (63 - Long.numberOfLeadingZeros(j11));
    }

    public static long gcd(long j11, long j12) {
        MathPreconditions.checkNonNegative(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, j11);
        MathPreconditions.checkNonNegative("b", j12);
        if (j11 == 0) {
            return j12;
        }
        if (j12 == 0) {
            return j11;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
        long jNumberOfTrailingZeros = j11 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j12);
        long j13 = j12 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j13) {
            long j14 = jNumberOfTrailingZeros - j13;
            long j15 = (j14 >> 63) & j14;
            long j16 = (j14 - j15) - j15;
            j13 += j15;
            jNumberOfTrailingZeros = j16 >> Long.numberOfTrailingZeros(j16);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j11) {
        return (j11 > 0) & ((j11 & (j11 - 1)) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(long j11) {
        if (j11 < 2) {
            MathPreconditions.checkNonNegative("n", j11);
            return false;
        }
        if (j11 < 66) {
            return ((722865708377213483 >> (((int) j11) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j11 % 30))) & SIEVE_30) != 0 || j11 % 7 == 0 || j11 % 11 == 0 || j11 % 13 == 0) {
            return false;
        }
        if (j11 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j11 <= jArr[0]) {
                for (int i11 = 1; i11 < jArr.length; i11++) {
                    if (!MillerRabinTester.test(jArr[i11], j11)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @GwtIncompatible
    public static int log10(long j11, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", j11);
        int iLog10Floor = log10Floor(j11);
        long j12 = powersOf10[iLog10Floor];
        switch (C84701.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j11 == j12);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(j12, j11);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], j11);
                break;
            default:
                throw new AssertionError();
        }
        return iLog10Floor + iLessThanBranchFree;
    }

    @GwtIncompatible
    public static int log10Floor(long j11) {
        byte b11 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(j11)];
        return b11 - lessThanBranchFree(j11, powersOf10[b11]);
    }

    public static int log2(long j11, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j11);
        switch (C84701.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j11));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j11 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j11);
                return (63 - iNumberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, j11);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j11);
    }

    public static long mean(long j11, long j12) {
        return (j11 & j12) + ((j11 ^ j12) >> 1);
    }

    @GwtIncompatible
    public static long mod(long j11, long j12) {
        if (j12 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j13 = j11 % j12;
        return j13 >= 0 ? j13 : j13 + j12;
    }

    public static long multiplyFraction(long j11, long j12, long j13) {
        if (j11 == 1) {
            return j12 / j13;
        }
        long jGcd = gcd(j11, j13);
        return (j11 / jGcd) * (j12 / (j13 / jGcd));
    }

    @GwtIncompatible
    public static long pow(long j11, int i11) {
        MathPreconditions.checkNonNegative("exponent", i11);
        if (-2 > j11 || j11 > 2) {
            long j12 = 1;
            while (i11 != 0) {
                if (i11 == 1) {
                    return j12 * j11;
                }
                j12 *= (i11 & 1) == 0 ? 1L : j11;
                j11 *= j11;
                i11 >>= 1;
            }
            return j12;
        }
        int i12 = (int) j11;
        if (i12 == -2) {
            if (i11 < 64) {
                return (i11 & 1) == 0 ? 1 << i11 : -(1 << i11);
            }
            return 0L;
        }
        if (i12 == -1) {
            return (i11 & 1) == 0 ? 1L : -1L;
        }
        if (i12 == 0) {
            return i11 == 0 ? 1L : 0L;
        }
        if (i12 == 1) {
            return 1L;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        if (i11 < 64) {
            return 1 << i11;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j11, RoundingMode roundingMode) {
        double dNextUp;
        long jCeil;
        double d11 = j11;
        long j12 = (long) d11;
        int iCompare = j12 == Long.MAX_VALUE ? -1 : Long.compare(j11, j12);
        int[] iArr = C84701.$SwitchMap$java$math$RoundingMode;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompare == 0);
                return d11;
            case 2:
                if (j11 >= 0) {
                    if (iCompare < 0) {
                        return DoubleUtils.nextDown(d11);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d11);
                }
                return d11;
            case 3:
                if (iCompare < 0) {
                    return DoubleUtils.nextDown(d11);
                }
                return d11;
            case 4:
                if (j11 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d11);
                    }
                } else if (iCompare < 0) {
                    return DoubleUtils.nextDown(d11);
                }
                return d11;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d11);
                }
                return d11;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d11);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dNextDown = DoubleUtils.nextDown(d11);
                    long jFloor = (long) Math.floor(dNextDown);
                    dNextUp = d11;
                    d11 = dNextDown;
                    jCeil = j12;
                    j12 = jFloor;
                }
                long j13 = j11 - j12;
                long j14 = jCeil - j11;
                if (jCeil == 9223372036854775807) {
                    j14++;
                }
                int iCompare2 = Long.compare(j13, j14);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i11 = iArr[roundingMode.ordinal()];
                        if (i11 != 6) {
                            if (i11 != 7) {
                                if (i11 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((DoubleUtils.getSignificand(d11) & 1) == 0) {
                                }
                            } else if (j11 >= 0) {
                            }
                        } else if (j11 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d11;
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long j11, long j12) {
        long j13 = j11 + j12;
        return (((j12 ^ j11) > 0L ? 1 : ((j12 ^ j11) == 0L ? 0 : -1)) < 0) | ((j11 ^ j13) >= 0) ? j13 : ((j13 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedPow(long j11, int i11) {
        MathPreconditions.checkNonNegative("exponent", i11);
        long jSaturatedMultiply = 1;
        if (!(j11 >= -2) || !(j11 <= 2)) {
            long j12 = ((j11 >>> 63) & ((long) (i11 & 1))) + Long.MAX_VALUE;
            while (i11 != 0) {
                if (i11 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j11);
                }
                if ((i11 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j11);
                }
                i11 >>= 1;
                if (i11 > 0) {
                    if ((-3037000499L > j11) || (j11 > FLOOR_SQRT_MAX_LONG)) {
                        return j12;
                    }
                    j11 *= j11;
                }
            }
            return jSaturatedMultiply;
        }
        int i12 = (int) j11;
        if (i12 == -2) {
            if (i11 >= 64) {
                return ((long) (i11 & 1)) + Long.MAX_VALUE;
            }
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i12 == -1) {
            return (i11 & 1) == 0 ? 1L : -1L;
        }
        if (i12 == 0) {
            return i11 == 0 ? 1L : 0L;
        }
        if (i12 == 1) {
            return 1L;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        if (i11 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i11;
    }

    public static long saturatedSubtract(long j11, long j12) {
        long j13 = j11 - j12;
        return (((j12 ^ j11) > 0L ? 1 : ((j12 ^ j11) == 0L ? 0 : -1)) >= 0) | ((j11 ^ j13) >= 0) ? j13 : ((j13 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j11, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j11);
        if (fitsInInt(j11)) {
            return IntMath.sqrt((int) j11, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j11);
        long j12 = jSqrt * jSqrt;
        switch (C84701.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j12 == j11);
                return jSqrt;
            case 2:
            case 3:
                return j11 < j12 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j11 > j12 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j13 = jSqrt - ((long) (j11 < j12 ? 1 : 0));
                return j13 + ((long) lessThanBranchFree((j13 * j13) + j13, j11));
            default:
                throw new AssertionError();
        }
    }

    private LongMath() {
    }

    public static long checkedMultiply(long j11, long j12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j12) + Long.numberOfLeadingZeros(~j12);
        if (iNumberOfLeadingZeros > 65) {
            return j11 * j12;
        }
        if (iNumberOfLeadingZeros >= 64) {
            z11 = true;
        } else {
            z11 = false;
        }
        MathPreconditions.checkNoOverflow(z11, "checkedMultiply", j11, j12);
        if (j11 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j12 != Long.MIN_VALUE) {
            z13 = true;
        } else {
            z13 = false;
        }
        MathPreconditions.checkNoOverflow(z12 | z13, "checkedMultiply", j11, j12);
        long j13 = j11 * j12;
        if (j11 != 0 && j13 / j11 != j12) {
            z14 = false;
        } else {
            z14 = true;
        }
        MathPreconditions.checkNoOverflow(z14, "checkedMultiply", j11, j12);
        return j13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static long divide(long j11, long j12, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        if (j14 == 0) {
            return j13;
        }
        boolean z11 = true;
        int i11 = ((int) ((j11 ^ j12) >> 63)) | 1;
        switch (C84701.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                if (j14 != 0) {
                    z11 = false;
                }
                MathPreconditions.checkRoundingUnnecessary(z11);
                return j13;
            case 2:
                return j13;
            case 3:
                if (i11 >= 0) {
                    return j13;
                }
                return j13 + ((long) i11);
            case 4:
                return j13 + ((long) i11);
            case 5:
                if (i11 <= 0) {
                    return j13;
                }
                return j13 + ((long) i11);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j14);
                long jAbs2 = jAbs - (Math.abs(j12) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j13) == 0)) {
                        return j13;
                    }
                } else if (jAbs2 <= 0) {
                    return j13;
                }
                return j13 + ((long) i11);
            default:
                throw new AssertionError();
        }
    }

    public static long saturatedMultiply(long j11, long j12) {
        boolean z11;
        boolean z12;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j12) + Long.numberOfLeadingZeros(~j12);
        if (iNumberOfLeadingZeros > 65) {
            return j11 * j12;
        }
        long j13 = ((j11 ^ j12) >>> 63) + Long.MAX_VALUE;
        boolean z13 = false;
        if (iNumberOfLeadingZeros < 64) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j12 == Long.MIN_VALUE) {
            z13 = true;
        }
        if (!(z11 | (z13 & z12))) {
            long j14 = j11 * j12;
            if (j11 == 0 || j14 / j11 == j12) {
                return j14;
            }
        }
        return j13;
    }
}
