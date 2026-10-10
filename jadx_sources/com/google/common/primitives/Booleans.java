package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        public BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.array[this.start + i11] != booleanArrayAsList.array[booleanArrayAsList.start + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public BooleanArrayAsList(boolean[] zArr, int i11, int i12) {
            this.array = zArr;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Boolean.valueOf(this.array[this.start + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                iHashCode = (iHashCode * 31) + Booleans.hashCode(this.array[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Boolean) || (iIndexOf = Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Boolean) || (iLastIndexOf = Booleans.lastIndexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i11, Boolean bool) {
            Preconditions.checkElementIndex(i11, size());
            boolean[] zArr = this.array;
            int i12 = this.start;
            boolean z11 = zArr[i12 + i11];
            zArr[i12 + i11] = ((Boolean) Preconditions.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        public boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.array[this.start] ? "[true" : "[false");
            int i11 = this.start;
            while (true) {
                i11++;
                if (i11 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(this.array[i11] ? ", true" : ", false");
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.array;
            int i13 = this.start;
            return new BooleanArrayAsList(zArr, i11 + i13, i13 + i12);
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }

        BooleanComparator(int i11, String str) {
            this.trueValue = i11;
            this.toString = str;
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Boolean.compare(zArr[i11], zArr2[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr.length - zArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.EMPTY_LIST : new BooleanArrayAsList(zArr);
    }

    private static int checkNoOverflow(long j11) {
        int i11 = (int) j11;
        Preconditions.checkArgument(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static boolean[] concat(boolean[]... zArr) {
        long length = 0;
        for (boolean[] zArr2 : zArr) {
            length += (long) zArr2.length;
        }
        boolean[] zArr3 = new boolean[checkNoOverflow(length)];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z11) {
        for (boolean z12 : zArr) {
            if (z12 == z11) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... zArr) {
        int i11 = 0;
        for (boolean z11 : zArr) {
            if (z11) {
                i11++;
            }
        }
        return i11;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i11, int i12) {
        Preconditions.checkArgument(i11 >= 0, "Invalid minLength: %s", i11);
        Preconditions.checkArgument(i12 >= 0, "Invalid padding: %s", i12);
        return zArr.length < i11 ? Arrays.copyOf(zArr, i11 + i12) : zArr;
    }

    public static int indexOf(boolean[] zArr, boolean z11) {
        return indexOf(zArr, z11, 0, zArr.length);
    }

    public static int lastIndexOf(boolean[] zArr, boolean z11) {
        return lastIndexOf(zArr, z11, 0, zArr.length);
    }

    public static void reverse(boolean[] zArr) {
        Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static void rotate(boolean[] zArr, int i11) {
        rotate(zArr, i11, 0, zArr.length);
    }

    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] zArr, boolean z11, int i11, int i12) {
        while (i11 < i12) {
            if (zArr[i11] == z11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] zArr, boolean z11, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (zArr[i13] == z11) {
                return i13;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void rotate(boolean[] zArr, int i11, int i12, int i13) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i12, i13, zArr.length);
        if (zArr.length <= 1) {
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
        reverse(zArr, i12, i16);
        reverse(zArr, i16, i13);
        reverse(zArr, i12, i13);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).toBooleanArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = ((Boolean) Preconditions.checkNotNull(array[i11])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    private Booleans() {
    }

    @InlineMe(replacement = "Boolean.compare(a, b)")
    public static int compare(boolean z11, boolean z12) {
        return Boolean.compare(z11, z12);
    }

    public static int indexOf(boolean[] zArr, boolean[] zArr2) {
        Preconditions.checkNotNull(zArr, "array");
        Preconditions.checkNotNull(zArr2, "target");
        if (zArr2.length == 0) {
            return 0;
        }
        for (int i11 = 0; i11 < (zArr.length - zArr2.length) + 1; i11++) {
            for (int i12 = 0; i12 < zArr2.length; i12++) {
                if (zArr[i11 + i12] != zArr2[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }

    public static String join(String str, boolean... zArr) {
        Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i11 = 1; i11 < zArr.length; i11++) {
            sb2.append(str);
            sb2.append(zArr[i11]);
        }
        return sb2.toString();
    }

    public static void reverse(boolean[] zArr, int i11, int i12) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i11, i12, zArr.length);
        for (int i13 = i12 - 1; i11 < i13; i13--) {
            boolean z11 = zArr[i11];
            zArr[i11] = zArr[i13];
            zArr[i13] = z11;
            i11++;
        }
    }
}
