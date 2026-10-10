package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < 10; i11++) {
                bArr[i11 + 48] = (byte) i11;
            }
            for (int i12 = 0; i12 < 26; i12++) {
                byte b11 = (byte) (i12 + 10);
                bArr[i12 + 65] = b11;
                bArr[i12 + 97] = b11;
            }
            asciiDigits = bArr;
        }

        public static int digit(char c11) {
            if (c11 < 128) {
                return asciiDigits[c11];
            }
            return -1;
        }

        private AsciiDigits() {
        }
    }

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Long.compare(jArr[i11], jArr2[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        public LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.array[this.start + i11] != longArrayAsList.array[longArrayAsList.start + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public LongArrayAsList(long[] jArr, int i11, int i12) {
            this.array = jArr;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Long.valueOf(this.array[this.start + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Long) || (iIndexOf = Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Long) || (iLastIndexOf = Longs.lastIndexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i11, Long l11) {
            Preconditions.checkElementIndex(i11, size());
            long[] jArr = this.array;
            int i12 = this.start;
            long j11 = jArr[i12 + i11];
            jArr[i12 + i11] = ((Long) Preconditions.checkNotNull(l11)).longValue();
            return Long.valueOf(j11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append('[');
            sb2.append(this.array[this.start]);
            int i11 = this.start;
            while (true) {
                i11++;
                if (i11 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.array[i11]);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.array;
            int i13 = this.start;
            return new LongArrayAsList(jArr, i11 + i13, i13 + i12);
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final Converter<String, Long> INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Long l11) {
            return l11.toString();
        }

        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        private LongConverter() {
        }
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.EMPTY_LIST : new LongArrayAsList(jArr);
    }

    private static int checkNoOverflow(long j11) {
        int i11 = (int) j11;
        Preconditions.checkArgument(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static long[] concat(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        long[] jArr3 = new long[checkNoOverflow(length)];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static boolean contains(long[] jArr, long j11) {
        for (long j12 : jArr) {
            if (j12 == j11) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] jArr, int i11, int i12) {
        Preconditions.checkArgument(i11 >= 0, "Invalid minLength: %s", i11);
        Preconditions.checkArgument(i12 >= 0, "Invalid padding: %s", i12);
        return jArr.length < i11 ? Arrays.copyOf(jArr, i11 + i12) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18) {
        return ((((long) b12) & 255) << 48) | ((((long) b11) & 255) << 56) | ((((long) b13) & 255) << 40) | ((((long) b14) & 255) << 32) | ((((long) b15) & 255) << 24) | ((((long) b16) & 255) << 16) | ((((long) b17) & 255) << 8) | (((long) b18) & 255);
    }

    public static int indexOf(long[] jArr, long j11) {
        return indexOf(jArr, j11, 0, jArr.length);
    }

    public static int lastIndexOf(long[] jArr, long j11) {
        return lastIndexOf(jArr, j11, 0, jArr.length);
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j11 = jArr[0];
        for (int i11 = 1; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 > j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j11 = jArr[0];
        for (int i11 = 1; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public static void reverse(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void rotate(long[] jArr, int i11) {
        rotate(jArr, i11, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    public static long constrainToRange(long j11, long j12, long j13) {
        Preconditions.checkArgument(j12 <= j13, "min (%s) must be less than or equal to max (%s)", j12, j13);
        return Math.min(Math.max(j11, j12), j13);
    }

    public static int hashCode(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] jArr, long j11, int i11, int i12) {
        while (i11 < i12) {
            if (jArr[i11] == j11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] jArr, long j11, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (jArr[i13] == j11) {
                return i13;
            }
        }
        return -1;
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void rotate(long[] jArr, int i11, int i12, int i13) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i12, i13, jArr.length);
        if (jArr.length <= 1) {
            return;
        }
        int i14 = i13 - i12;
        int i15 = (-i11) % i14;
        if (i15 < 0) {
            i15 += i14;
        }
        int i16 = i15 + i12;
        if (i16 == i12) {
            return;
        }
        reverse(jArr, i12, i16);
        reverse(jArr, i16, i13);
        reverse(jArr, i12, i13);
    }

    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            jArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j11) {
        byte[] bArr = new byte[8];
        for (int i11 = 7; i11 >= 0; i11--) {
            bArr[i11] = (byte) (255 & j11);
            j11 >>= 8;
        }
        return bArr;
    }

    public static Long tryParse(String str, int i11) {
        if (((String) Preconditions.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i11 < 2 || i11 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i11);
        }
        int i12 = str.charAt(0) == '-' ? 1 : 0;
        if (i12 == str.length()) {
            return null;
        }
        int i13 = i12 + 1;
        int iDigit = AsciiDigits.digit(str.charAt(i12));
        if (iDigit < 0 || iDigit >= i11) {
            return null;
        }
        long j11 = -iDigit;
        long j12 = i11;
        long j13 = Long.MIN_VALUE / j12;
        while (i13 < str.length()) {
            int i14 = i13 + 1;
            int iDigit2 = AsciiDigits.digit(str.charAt(i13));
            if (iDigit2 < 0 || iDigit2 >= i11 || j11 < j13) {
                return null;
            }
            long j14 = j11 * j12;
            long j15 = iDigit2;
            if (j14 < j15 - Long.MIN_VALUE) {
                return null;
            }
            j11 = j14 - j15;
            i13 = i14;
        }
        if (i12 != 0) {
            return Long.valueOf(j11);
        }
        if (j11 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j11);
    }

    private Longs() {
    }

    @InlineMe(replacement = "Long.compare(a, b)")
    public static int compare(long j11, long j12) {
        return Long.compare(j11, j12);
    }

    public static int indexOf(long[] jArr, long[] jArr2) {
        Preconditions.checkNotNull(jArr, "array");
        Preconditions.checkNotNull(jArr2, "target");
        if (jArr2.length == 0) {
            return 0;
        }
        for (int i11 = 0; i11 < (jArr.length - jArr2.length) + 1; i11++) {
            for (int i12 = 0; i12 < jArr2.length; i12++) {
                if (jArr[i11 + i12] != jArr2[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 10);
        sb2.append(jArr[0]);
        for (int i11 = 1; i11 < jArr.length; i11++) {
            sb2.append(str);
            sb2.append(jArr[i11]);
        }
        return sb2.toString();
    }

    public static void reverse(long[] jArr, int i11, int i12) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i11, i12, jArr.length);
        for (int i13 = i12 - 1; i11 < i13; i13--) {
            long j11 = jArr[i11];
            jArr[i11] = jArr[i13];
            jArr[i13] = j11;
            i11++;
        }
    }

    public static void sortDescending(long[] jArr, int i11, int i12) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i11, i12, jArr.length);
        Arrays.sort(jArr, i11, i12);
        reverse(jArr, i11, i12);
    }
}
