package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class UnsignedBytes {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;
    private static final int UNSIGNED_MASK = 255;

    @VisibleForTesting
    public static class LexicographicalComparatorHolder {
        static final String UNSAFE_COMPARATOR_NAME = LexicographicalComparatorHolder.class.getName() + "$UnsafeComparator";
        static final Comparator<byte[]> BEST_COMPARATOR = getBestComparator();

        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i11 = 0; i11 < iMin; i11++) {
                    int iCompare = UnsignedBytes.compare(bArr[i11], bArr2[i11]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @VisibleForTesting
        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i11 = iMin & (-8);
                int i12 = 0;
                while (i12 < i11) {
                    Unsafe unsafe = theUnsafe;
                    int i13 = BYTE_ARRAY_BASE_OFFSET;
                    long j11 = i12;
                    long j12 = unsafe.getLong(bArr, ((long) i13) + j11);
                    long j13 = unsafe.getLong(bArr2, ((long) i13) + j11);
                    if (j12 != j13) {
                        if (BIG_ENDIAN) {
                            return Long.compare(j12 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12 ^ j13) & (-8);
                        return ((int) ((j12 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j13 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i12 += 8;
                }
                while (i12 < iMin) {
                    int iCompare = UnsignedBytes.compare(bArr[i12], bArr2[i12]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i12++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e11) {
                        throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
            }
        }

        public static Comparator<byte[]> getBestComparator() {
            try {
                Object[] enumConstants = Class.forName(UNSAFE_COMPARATOR_NAME).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.lexicographicalComparatorJavaImpl();
            }
        }
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i11 = toInt(bArr[0]);
        for (int i12 = 1; i12 < bArr.length; i12++) {
            int i13 = toInt(bArr[i12]);
            if (i13 > i11) {
                i11 = i13;
            }
        }
        return (byte) i11;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        int i11 = toInt(bArr[0]);
        for (int i12 = 1; i12 < bArr.length; i12++) {
            int i13 = toInt(bArr[i12]);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return (byte) i11;
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte saturatedCast(long j11) {
        if (j11 > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j11 < 0) {
            return (byte) 0;
        }
        return (byte) j11;
    }

    public static void sort(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static String toString(byte b11) {
        return toString(b11, 10);
    }

    @CanIgnoreReturnValue
    public static byte checkedCast(long j11) {
        Preconditions.checkArgument((j11 >> 8) == 0, "out of range: %s", j11);
        return (byte) j11;
    }

    private static byte flip(byte b11) {
        return (byte) (b11 ^ 128);
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparatorHolder.BEST_COMPARATOR;
    }

    @VisibleForTesting
    public static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    @CanIgnoreReturnValue
    public static byte parseUnsignedByte(String str, int i11) {
        int i12 = Integer.parseInt((String) Preconditions.checkNotNull(str), i11);
        if ((i12 >> 8) == 0) {
            return (byte) i12;
        }
        throw new NumberFormatException("out of range: " + i12);
    }

    public static int toInt(byte b11) {
        return b11 & 255;
    }

    public static String toString(byte b11, int i11) {
        Preconditions.checkArgument(i11 >= 2 && i11 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i11);
        return Integer.toString(toInt(b11), i11);
    }

    private UnsignedBytes() {
    }

    public static int compare(byte b11, byte b12) {
        return toInt(b11) - toInt(b12);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * (str.length() + 3));
        sb2.append(toInt(bArr[0]));
        for (int i11 = 1; i11 < bArr.length; i11++) {
            sb2.append(str);
            sb2.append(toString(bArr[i11]));
        }
        return sb2.toString();
    }

    public static void sort(byte[] bArr, int i11, int i12) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i11, i12, bArr.length);
        for (int i13 = i11; i13 < i12; i13++) {
            bArr[i13] = flip(bArr[i13]);
        }
        Arrays.sort(bArr, i11, i12);
        while (i11 < i12) {
            bArr[i11] = flip(bArr[i11]);
            i11++;
        }
    }

    public static void sortDescending(byte[] bArr, int i11, int i12) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i11, i12, bArr.length);
        for (int i13 = i11; i13 < i12; i13++) {
            bArr[i13] = (byte) (bArr[i13] ^ 127);
        }
        Arrays.sort(bArr, i11, i12);
        while (i11 < i12) {
            bArr[i11] = (byte) (bArr[i11] ^ 127);
            i11++;
        }
    }
}
