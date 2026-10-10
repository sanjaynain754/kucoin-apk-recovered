package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
import p852kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Short.compare(sArr[i11], sArr2[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        public ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.array[this.start + i11] != shortArrayAsList.array[shortArrayAsList.start + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public ShortArrayAsList(short[] sArr, int i11, int i12) {
            this.array = sArr;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Short) && Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Short.valueOf(this.array[this.start + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                iHashCode = (iHashCode * 31) + Shorts.hashCode(this.array[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Short) || (iIndexOf = Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Short) || (iLastIndexOf = Shorts.lastIndexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i11, Short sh2) {
            Preconditions.checkElementIndex(i11, size());
            short[] sArr = this.array;
            int i12 = this.start;
            short s11 = sArr[i12 + i11];
            sArr[i12 + i11] = ((Short) Preconditions.checkNotNull(sh2)).shortValue();
            return Short.valueOf(s11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        public short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 6);
            sb2.append('[');
            sb2.append((int) this.array[this.start]);
            int i11 = this.start;
            while (true) {
                i11++;
                if (i11 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.array[i11]);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.array;
            int i13 = this.start;
            return new ShortArrayAsList(sArr, i11 + i13, i13 + i12);
        }
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final Converter<String, Short> INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Short sh2) {
            return sh2.toString();
        }

        @Override // com.google.common.base.Converter
        public Short doForward(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        private ShortConverter() {
        }
    }

    public static List<Short> asList(short... sArr) {
        return sArr.length == 0 ? Collections.EMPTY_LIST : new ShortArrayAsList(sArr);
    }

    private static int checkNoOverflow(long j11) {
        int i11 = (int) j11;
        Preconditions.checkArgument(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static short checkedCast(long j11) {
        short s11 = (short) j11;
        Preconditions.checkArgument(((long) s11) == j11, "Out of range: %s", j11);
        return s11;
    }

    public static short[] concat(short[]... sArr) {
        long length = 0;
        for (short[] sArr2 : sArr) {
            length += (long) sArr2.length;
        }
        short[] sArr3 = new short[checkNoOverflow(length)];
        int length2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, length2, sArr4.length);
            length2 += sArr4.length;
        }
        return sArr3;
    }

    public static boolean contains(short[] sArr, short s11) {
        for (short s12 : sArr) {
            if (s12 == s11) {
                return true;
            }
        }
        return false;
    }

    public static short[] ensureCapacity(short[] sArr, int i11, int i12) {
        Preconditions.checkArgument(i11 >= 0, "Invalid minLength: %s", i11);
        Preconditions.checkArgument(i12 >= 0, "Invalid padding: %s", i12);
        return sArr.length < i11 ? Arrays.copyOf(sArr, i11 + i12) : sArr;
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    public static int indexOf(short[] sArr, short s11) {
        return indexOf(sArr, s11, 0, sArr.length);
    }

    public static int lastIndexOf(short[] sArr, short s11) {
        return lastIndexOf(sArr, s11, 0, sArr.length);
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s11 = sArr[0];
        for (int i11 = 1; i11 < sArr.length; i11++) {
            short s12 = sArr[i11];
            if (s12 > s11) {
                s11 = s12;
            }
        }
        return s11;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s11 = sArr[0];
        for (int i11 = 1; i11 < sArr.length; i11++) {
            short s12 = sArr[i11];
            if (s12 < s11) {
                s11 = s12;
            }
        }
        return s11;
    }

    public static void reverse(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        reverse(sArr, 0, sArr.length);
    }

    public static void rotate(short[] sArr, int i11) {
        rotate(sArr, i11, 0, sArr.length);
    }

    public static void sortDescending(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        sortDescending(sArr, 0, sArr.length);
    }

    public static short constrainToRange(short s11, short s12, short s13) {
        Preconditions.checkArgument(s12 <= s13, "min (%s) must be less than or equal to max (%s)", (int) s12, (int) s13);
        if (s11 < s12) {
            return s12;
        }
        return s11 < s13 ? s11 : s13;
    }

    @GwtIncompatible
    public static short fromBytes(byte b11, byte b12) {
        return (short) ((b11 << 8) | (b12 & 255));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] sArr, short s11, int i11, int i12) {
        while (i11 < i12) {
            if (sArr[i11] == s11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] sArr, short s11, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (sArr[i13] == s11) {
                return i13;
            }
        }
        return -1;
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void rotate(short[] sArr, int i11, int i12, int i13) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i12, i13, sArr.length);
        if (sArr.length <= 1) {
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
        reverse(sArr, i12, i16);
        reverse(sArr, i16, i13);
        reverse(sArr, i12, i13);
    }

    public static short saturatedCast(long j11) {
        if (j11 > 32767) {
            return ShortCompanionObject.MAX_VALUE;
        }
        return j11 < -32768 ? ShortCompanionObject.MIN_VALUE : (short) j11;
    }

    public static Converter<String, Short> stringConverter() {
        return ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).shortValue();
        }
        return sArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s11) {
        return new byte[]{(byte) (s11 >> 8), (byte) s11};
    }

    private Shorts() {
    }

    @InlineMe(replacement = "Short.compare(a, b)")
    public static int compare(short s11, short s12) {
        return Short.compare(s11, s12);
    }

    public static int indexOf(short[] sArr, short[] sArr2) {
        Preconditions.checkNotNull(sArr, "array");
        Preconditions.checkNotNull(sArr2, "target");
        if (sArr2.length == 0) {
            return 0;
        }
        for (int i11 = 0; i11 < (sArr.length - sArr2.length) + 1; i11++) {
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                if (sArr[i11 + i12] != sArr2[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }

    public static String join(String str, short... sArr) {
        Preconditions.checkNotNull(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(sArr.length * 6);
        sb2.append((int) sArr[0]);
        for (int i11 = 1; i11 < sArr.length; i11++) {
            sb2.append(str);
            sb2.append((int) sArr[i11]);
        }
        return sb2.toString();
    }

    public static void reverse(short[] sArr, int i11, int i12) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i11, i12, sArr.length);
        for (int i13 = i12 - 1; i11 < i13; i13--) {
            short s11 = sArr[i11];
            sArr[i11] = sArr[i13];
            sArr[i13] = s11;
            i11++;
        }
    }

    public static void sortDescending(short[] sArr, int i11, int i12) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i11, i12, sArr.length);
        Arrays.sort(sArr, i11, i12);
        reverse(sArr, i11, i12);
    }

    public static int hashCode(short s11) {
        return s11;
    }
}
