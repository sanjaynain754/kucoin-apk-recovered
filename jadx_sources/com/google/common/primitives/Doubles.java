package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.InlineMe;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Doubles extends DoublesMethodsForWeb {
    public static final int BYTES = 8;

    @GwtIncompatible
    static final Pattern FLOATING_POINT_PATTERN = fpPattern();

    @GwtCompatible
    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        public DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.array[this.start + i11] != doubleArrayAsList.array[doubleArrayAsList.start + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public DoubleArrayAsList(double[] dArr, int i11, int i12) {
            this.array = dArr;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && Doubles.indexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Double.valueOf(this.array[this.start + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                iHashCode = (iHashCode * 31) + Doubles.hashCode(this.array[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Double) || (iIndexOf = Doubles.indexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Double) || (iLastIndexOf = Doubles.lastIndexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i11, Double d11) {
            Preconditions.checkElementIndex(i11, size());
            double[] dArr = this.array;
            int i12 = this.start;
            double d12 = dArr[i12 + i11];
            dArr[i12 + i11] = ((Double) Preconditions.checkNotNull(d11)).doubleValue();
            return Double.valueOf(d12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        public double[] toDoubleArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
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
        public List<Double> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.array;
            int i13 = this.start;
            return new DoubleArrayAsList(dArr, i11 + i13, i13 + i12);
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        static final Converter<String, Double> INSTANCE = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Double d11) {
            return d11.toString();
        }

        @Override // com.google.common.base.Converter
        public Double doForward(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        private DoubleConverter() {
        }
    }

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Double.compare(dArr[i11], dArr2[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    public static List<Double> asList(double... dArr) {
        return dArr.length == 0 ? Collections.EMPTY_LIST : new DoubleArrayAsList(dArr);
    }

    private static int checkNoOverflow(long j11) {
        int i11 = (int) j11;
        Preconditions.checkArgument(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static double[] concat(double[]... dArr) {
        long length = 0;
        for (double[] dArr2 : dArr) {
            length += (long) dArr2.length;
        }
        double[] dArr3 = new double[checkNoOverflow(length)];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    public static boolean contains(double[] dArr, double d11) {
        for (double d12 : dArr) {
            if (d12 == d11) {
                return true;
            }
        }
        return false;
    }

    public static double[] ensureCapacity(double[] dArr, int i11, int i12) {
        Preconditions.checkArgument(i11 >= 0, "Invalid minLength: %s", i11);
        Preconditions.checkArgument(i12 >= 0, "Invalid padding: %s", i12);
        return dArr.length < i11 ? Arrays.copyOf(dArr, i11 + i12) : dArr;
    }

    public static int indexOf(double[] dArr, double d11) {
        return indexOf(dArr, d11, 0, dArr.length);
    }

    public static int lastIndexOf(double[] dArr, double d11) {
        return lastIndexOf(dArr, d11, 0, dArr.length);
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMax = dArr[0];
        for (int i11 = 1; i11 < dArr.length; i11++) {
            dMax = Math.max(dMax, dArr[i11]);
        }
        return dMax;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMin = dArr[0];
        for (int i11 = 1; i11 < dArr.length; i11++) {
            dMin = Math.min(dMin, dArr[i11]);
        }
        return dMin;
    }

    public static void reverse(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void rotate(double[] dArr, int i11) {
        rotate(dArr, i11, 0, dArr.length);
    }

    public static void sortDescending(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    public static double constrainToRange(double d11, double d12, double d13) {
        if (d12 <= d13) {
            return Math.min(Math.max(d11, d12), d13);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Double.valueOf(d12), Double.valueOf(d13)));
    }

    @GwtIncompatible
    private static Pattern fpPattern() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + "|" + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + ")").replace(RunnableC33958ua.f72251f, "+"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(double[] dArr, double d11, int i11, int i12) {
        while (i11 < i12) {
            if (dArr[i11] == d11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean isFinite(double d11) {
        return Double.NEGATIVE_INFINITY < d11 && d11 < Double.POSITIVE_INFINITY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(double[] dArr, double d11, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (dArr[i13] == d11) {
                return i13;
            }
        }
        return -1;
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void rotate(double[] dArr, int i11, int i12, int i13) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i12, i13, dArr.length);
        if (dArr.length <= 1) {
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
        reverse(dArr, i12, i16);
        reverse(dArr, i16, i13);
        reverse(dArr, i12, i13);
    }

    public static Converter<String, Double> stringConverter() {
        return DoubleConverter.INSTANCE;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof DoubleArrayAsList) {
            return ((DoubleArrayAsList) collection).toDoubleArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i11 = 0; i11 < length; i11++) {
            dArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).doubleValue();
        }
        return dArr;
    }

    @GwtIncompatible
    public static Double tryParse(String str) {
        if (!FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private Doubles() {
    }

    @InlineMe(replacement = "Double.compare(a, b)")
    public static int compare(double d11, double d12) {
        return Double.compare(d11, d12);
    }

    public static int hashCode(double d11) {
        return Double.valueOf(d11).hashCode();
    }

    public static int indexOf(double[] dArr, double[] dArr2) {
        Preconditions.checkNotNull(dArr, "array");
        Preconditions.checkNotNull(dArr2, "target");
        if (dArr2.length == 0) {
            return 0;
        }
        for (int i11 = 0; i11 < (dArr.length - dArr2.length) + 1; i11++) {
            for (int i12 = 0; i12 < dArr2.length; i12++) {
                if (dArr[i11 + i12] != dArr2[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }

    public static String join(String str, double... dArr) {
        Preconditions.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(dArr.length * 12);
        sb2.append(dArr[0]);
        for (int i11 = 1; i11 < dArr.length; i11++) {
            sb2.append(str);
            sb2.append(dArr[i11]);
        }
        return sb2.toString();
    }

    public static void reverse(double[] dArr, int i11, int i12) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i11, i12, dArr.length);
        for (int i13 = i12 - 1; i11 < i13; i13--) {
            double d11 = dArr[i11];
            dArr[i11] = dArr[i13];
            dArr[i13] = d11;
            i11++;
        }
    }

    public static void sortDescending(double[] dArr, int i11, int i12) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i11, i12, dArr.length);
        Arrays.sort(dArr, i11, i12);
        reverse(dArr, i11, i12);
    }
}
