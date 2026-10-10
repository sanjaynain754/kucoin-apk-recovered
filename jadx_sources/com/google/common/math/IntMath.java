package com.google.common.math;

import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class IntMath {

    @VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    @VisibleForTesting
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD, 100000000, 1000000000};

    @VisibleForTesting
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    @VisibleForTesting
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int checkedAdd(int i11, int i12) {
        long j11 = ((long) i11) + ((long) i12);
        int i13 = (int) j11;
        MathPreconditions.checkNoOverflow(j11 == ((long) i13), "checkedAdd", i11, i12);
        return i13;
    }

    public static int checkedMultiply(int i11, int i12) {
        long j11 = ((long) i11) * ((long) i12);
        int i13 = (int) j11;
        MathPreconditions.checkNoOverflow(j11 == ((long) i13), "checkedMultiply", i11, i12);
        return i13;
    }

    public static int checkedSubtract(int i11, int i12) {
        long j11 = ((long) i11) - ((long) i12);
        int i13 = (int) j11;
        MathPreconditions.checkNoOverflow(j11 == ((long) i13), "checkedSubtract", i11, i12);
        return i13;
    }

    public static boolean isPowerOfTwo(int i11) {
        return (i11 > 0) & ((i11 & (i11 + (-1))) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(int i11) {
        return LongMath.isPrime(i11);
    }

    @VisibleForTesting
    public static int lessThanBranchFree(int i11, int i12) {
        return (~(~(i11 - i12))) >>> 31;
    }

    public static int saturatedAdd(int i11, int i12) {
        return Ints.saturatedCast(((long) i11) + ((long) i12));
    }

    public static int saturatedMultiply(int i11, int i12) {
        return Ints.saturatedCast(((long) i11) * ((long) i12));
    }

    public static int saturatedSubtract(int i11, int i12) {
        return Ints.saturatedCast(((long) i11) - ((long) i12));
    }

    private static int sqrtFloor(int i11) {
        return (int) Math.sqrt(i11);
    }

    /* JADX INFO: renamed from: com.google.common.math.IntMath$1 */
    public static /* synthetic */ class C84681 {
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

    public static int binomial(int i11, int i12) {
        MathPreconditions.checkNonNegative("n", i11);
        MathPreconditions.checkNonNegative("k", i12);
        int i13 = 0;
        Preconditions.checkArgument(i12 <= i11, "k (%s) > n (%s)", i12, i11);
        if (i12 > (i11 >> 1)) {
            i12 = i11 - i12;
        }
        int[] iArr = biggestBinomials;
        if (i12 >= iArr.length || i11 > iArr[i12]) {
            return Integer.MAX_VALUE;
        }
        if (i12 == 0) {
            return 1;
        }
        if (i12 == 1) {
            return i11;
        }
        long j11 = 1;
        while (i13 < i12) {
            long j12 = j11 * ((long) (i11 - i13));
            i13++;
            j11 = j12 / ((long) i13);
        }
        return (int) j11;
    }

    public static int ceilingPowerOfTwo(int i11) {
        MathPreconditions.checkPositive("x", i11);
        if (i11 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i11 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + i11 + ") not representable as an int");
    }

    public static int checkedPow(int i11, int i12) {
        MathPreconditions.checkNonNegative("exponent", i12);
        if (i11 == -2) {
            MathPreconditions.checkNoOverflow(i12 < 32, "checkedPow", i11, i12);
            return (i12 & 1) == 0 ? 1 << i12 : (-1) << i12;
        }
        if (i11 == -1) {
            return (i12 & 1) == 0 ? 1 : -1;
        }
        if (i11 == 0) {
            return i12 == 0 ? 1 : 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            MathPreconditions.checkNoOverflow(i12 < 31, "checkedPow", i11, i12);
            return 1 << i12;
        }
        int iCheckedMultiply = 1;
        while (i12 != 0) {
            if (i12 == 1) {
                return checkedMultiply(iCheckedMultiply, i11);
            }
            if ((i12 & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, i11);
            }
            i12 >>= 1;
            if (i12 > 0) {
                MathPreconditions.checkNoOverflow((-46340 <= i11) & (i11 <= FLOOR_SQRT_MAX_INT), "checkedPow", i11, i12);
                i11 *= i11;
            }
        }
        return iCheckedMultiply;
    }

    public static int factorial(int i11) {
        MathPreconditions.checkNonNegative("n", i11);
        int[] iArr = factorials;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i11) {
        MathPreconditions.checkPositive("x", i11);
        return Integer.highestOneBit(i11);
    }

    public static int gcd(int i11, int i12) {
        MathPreconditions.checkNonNegative(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, i11);
        MathPreconditions.checkNonNegative("b", i12);
        if (i11 == 0) {
            return i12;
        }
        if (i12 == 0) {
            return i11;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i11);
        int iNumberOfTrailingZeros2 = i11 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i12);
        int i13 = i12 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i13) {
            int i14 = iNumberOfTrailingZeros2 - i13;
            int i15 = (i14 >> 31) & i14;
            int i16 = (i14 - i15) - i15;
            i13 += i15;
            iNumberOfTrailingZeros2 = i16 >> Integer.numberOfTrailingZeros(i16);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    @GwtIncompatible
    public static int log10(int i11, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", i11);
        int iLog10Floor = log10Floor(i11);
        int i12 = powersOf10[iLog10Floor];
        switch (C84681.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i11 == i12);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(i12, i11);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], i11);
                break;
            default:
                throw new AssertionError();
        }
        return iLog10Floor + iLessThanBranchFree;
    }

    private static int log10Floor(int i11) {
        byte b11 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(i11)];
        return b11 - lessThanBranchFree(i11, powersOf10[b11]);
    }

    public static int log2(int i11, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i11);
        switch (C84681.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i11));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i11 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
                return (31 - iNumberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, i11);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    public static int mean(int i11, int i12) {
        return (i11 & i12) + ((i11 ^ i12) >> 1);
    }

    public static int mod(int i11, int i12) {
        if (i12 > 0) {
            int i13 = i11 % i12;
            return i13 >= 0 ? i13 : i13 + i12;
        }
        throw new ArithmeticException("Modulus " + i12 + " must be > 0");
    }

    @GwtIncompatible
    public static int pow(int i11, int i12) {
        MathPreconditions.checkNonNegative("exponent", i12);
        if (i11 == -2) {
            if (i12 < 32) {
                return (i12 & 1) == 0 ? 1 << i12 : -(1 << i12);
            }
            return 0;
        }
        if (i11 == -1) {
            return (i12 & 1) == 0 ? 1 : -1;
        }
        if (i11 == 0) {
            return i12 == 0 ? 1 : 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            if (i12 < 32) {
                return 1 << i12;
            }
            return 0;
        }
        int i13 = 1;
        while (i12 != 0) {
            if (i12 == 1) {
                return i11 * i13;
            }
            i13 *= (i12 & 1) == 0 ? 1 : i11;
            i11 *= i11;
            i12 >>= 1;
        }
        return i13;
    }

    public static int saturatedPow(int i11, int i12) {
        MathPreconditions.checkNonNegative("exponent", i12);
        if (i11 == -2) {
            if (i12 >= 32) {
                return (i12 & 1) + Integer.MAX_VALUE;
            }
            return (i12 & 1) == 0 ? 1 << i12 : (-1) << i12;
        }
        if (i11 == -1) {
            return (i12 & 1) == 0 ? 1 : -1;
        }
        if (i11 == 0) {
            return i12 == 0 ? 1 : 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            if (i12 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i12;
        }
        int i13 = ((i11 >>> 31) & i12 & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (i12 != 0) {
            if (i12 == 1) {
                return saturatedMultiply(iSaturatedMultiply, i11);
            }
            if ((i12 & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, i11);
            }
            i12 >>= 1;
            if (i12 > 0) {
                if ((-46340 > i11) || (i11 > FLOOR_SQRT_MAX_INT)) {
                    return i13;
                }
                i11 *= i11;
            }
        }
        return iSaturatedMultiply;
    }

    @GwtIncompatible
    public static int sqrt(int i11, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkNonNegative("x", i11);
        int iSqrtFloor = sqrtFloor(i11);
        switch (C84681.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iSqrtFloor * iSqrtFloor == i11);
                return iSqrtFloor;
            case 2:
            case 3:
                return iSqrtFloor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(iSqrtFloor * iSqrtFloor, i11);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree((iSqrtFloor * iSqrtFloor) + iSqrtFloor, i11);
                break;
            default:
                throw new AssertionError();
        }
        return iSqrtFloor + iLessThanBranchFree;
    }

    private IntMath() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int divide(int i11, int i12, RoundingMode roundingMode) {
        boolean z11;
        Preconditions.checkNotNull(roundingMode);
        if (i12 != 0) {
            int i13 = i11 / i12;
            int i14 = i11 - (i12 * i13);
            if (i14 == 0) {
                return i13;
            }
            boolean z12 = true;
            int i15 = ((i11 ^ i12) >> 31) | 1;
            switch (C84681.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
                case 1:
                    if (i14 != 0) {
                        z12 = false;
                    }
                    MathPreconditions.checkRoundingUnnecessary(z12);
                    return i13;
                case 2:
                    return i13;
                case 3:
                    if (i15 >= 0) {
                        return i13;
                    }
                    return i13 + i15;
                case 4:
                    return i13 + i15;
                case 5:
                    if (i15 <= 0) {
                        return i13;
                    }
                    return i13 + i15;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i14);
                    int iAbs2 = iAbs - (Math.abs(i12) - iAbs);
                    if (iAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((i13 & 1) == 0) {
                                z12 = false;
                            }
                            if (!(z11 & z12)) {
                                return i13;
                            }
                        }
                    } else if (iAbs2 <= 0) {
                        return i13;
                    }
                    return i13 + i15;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("/ by zero");
    }
}
