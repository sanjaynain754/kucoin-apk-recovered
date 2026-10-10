package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                long j11 = jArr[i11];
                long j12 = jArr2[i11];
                if (j11 != j12) {
                    return UnsignedLongs.compare(j11, j12);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i11 = 2; i11 <= 36; i11++) {
                long j11 = i11;
                maxValueDivs[i11] = UnsignedLongs.divide(-1L, j11);
                maxValueMods[i11] = (int) UnsignedLongs.remainder(-1L, j11);
                maxSafeDigits[i11] = bigInteger.toString(i11).length() - 1;
            }
        }

        public static boolean overflowInParse(long j11, int i11, int i12) {
            if (j11 < 0) {
                return true;
            }
            long j12 = maxValueDivs[i12];
            if (j11 < j12) {
                return false;
            }
            return j11 > j12 || i11 > maxValueMods[i12];
        }

        private ParseOverflowDetection() {
        }
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long jFlip = flip(jArr[0]);
        for (int i11 = 1; i11 < jArr.length; i11++) {
            long jFlip2 = flip(jArr[i11]);
            if (jFlip2 > jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long jFlip = flip(jArr[0]);
        for (int i11 = 1; i11 < jArr.length; i11++) {
            long jFlip2 = flip(jArr[i11]);
            if (jFlip2 < jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static void sort(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j11) {
        return toString(j11, 10);
    }

    public static long divide(long j11, long j12) {
        if (j12 < 0) {
            return compare(j11, j12) < 0 ? 0L : 1L;
        }
        if (j11 >= 0) {
            return j11 / j12;
        }
        long j13 = ((j11 >>> 1) / j12) << 1;
        return j13 + ((long) (compare(j11 - (j13 * j12), j12) < 0 ? 0 : 1));
    }

    private static long flip(long j11) {
        return j11 ^ Long.MIN_VALUE;
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i11) {
        Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i11 < 2 || i11 > 36) {
            throw new NumberFormatException("illegal radix: " + i11);
        }
        int i12 = ParseOverflowDetection.maxSafeDigits[i11] - 1;
        long j11 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            int iDigit = Character.digit(str.charAt(i13), i11);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i13 > i12 && ParseOverflowDetection.overflowInParse(j11, iDigit, i11)) {
                throw new NumberFormatException("Too large for unsigned long: " + str);
            }
            j11 = (j11 * ((long) i11)) + ((long) iDigit);
        }
        return j11;
    }

    public static long remainder(long j11, long j12) {
        if (j12 < 0) {
            return compare(j11, j12) < 0 ? j11 : j11 - j12;
        }
        if (j11 >= 0) {
            return j11 % j12;
        }
        long j13 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
        if (compare(j13, j12) < 0) {
            j12 = 0;
        }
        return j13 - j12;
    }

    public static String toString(long j11, int i11) {
        Preconditions.checkArgument(i11 >= 2 && i11 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i11);
        if (j11 == 0) {
            return "0";
        }
        if (j11 > 0) {
            return Long.toString(j11, i11);
        }
        int i12 = 64;
        char[] cArr = new char[64];
        int i13 = i11 - 1;
        if ((i11 & i13) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i11);
            do {
                i12--;
                cArr[i12] = Character.forDigit(((int) j11) & i13, i11);
                j11 >>>= iNumberOfTrailingZeros;
            } while (j11 != 0);
        } else {
            long jDivide = (i11 & 1) == 0 ? (j11 >>> 1) / ((long) (i11 >>> 1)) : divide(j11, i11);
            long j12 = i11;
            int i14 = 63;
            cArr[63] = Character.forDigit((int) (j11 - (jDivide * j12)), i11);
            while (jDivide > 0) {
                i14--;
                cArr[i14] = Character.forDigit((int) (jDivide % j12), i11);
                jDivide /= j12;
            }
            i12 = i14;
        }
        return new String(cArr, i12, 64 - i12);
    }

    private UnsignedLongs() {
    }

    public static int compare(long j11, long j12) {
        return Longs.compare(flip(j11), flip(j12));
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedLong(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e11) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + str);
            numberFormatException.initCause(e11);
            throw numberFormatException;
        }
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 5);
        sb2.append(toString(jArr[0]));
        for (int i11 = 1; i11 < jArr.length; i11++) {
            sb2.append(str);
            sb2.append(toString(jArr[i11]));
        }
        return sb2.toString();
    }

    public static void sort(long[] jArr, int i11, int i12) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i11, i12, jArr.length);
        for (int i13 = i11; i13 < i12; i13++) {
            jArr[i13] = flip(jArr[i13]);
        }
        Arrays.sort(jArr, i11, i12);
        while (i11 < i12) {
            jArr[i11] = flip(jArr[i11]);
            i11++;
        }
    }

    public static void sortDescending(long[] jArr, int i11, int i12) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i11, i12, jArr.length);
        for (int i13 = i11; i13 < i12; i13++) {
            jArr[i13] = Long.MAX_VALUE ^ jArr[i13];
        }
        Arrays.sort(jArr, i11, i12);
        while (i11 < i12) {
            jArr[i11] = jArr[i11] ^ Long.MAX_VALUE;
            i11++;
        }
    }
}
