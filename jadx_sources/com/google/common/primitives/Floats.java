package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
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
@GwtCompatible(emulated = true)
public final class Floats extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    @GwtCompatible
    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        public FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.array[this.start + i11] != floatArrayAsList.array[floatArrayAsList.start + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public FloatArrayAsList(float[] fArr, int i11, int i12) {
            this.array = fArr;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Float.valueOf(this.array[this.start + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                iHashCode = (iHashCode * 31) + Floats.hashCode(this.array[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Float) || (iIndexOf = Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Float) || (iLastIndexOf = Floats.lastIndexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i11, Float f11) {
            Preconditions.checkElementIndex(i11, size());
            float[] fArr = this.array;
            int i12 = this.start;
            float f12 = fArr[i12 + i11];
            fArr[i12 + i11] = ((Float) Preconditions.checkNotNull(f11)).floatValue();
            return Float.valueOf(f12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        public float[] toFloatArray() {
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
        public List<Float> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.array;
            int i13 = this.start;
            return new FloatArrayAsList(fArr, i11 + i13, i13 + i12);
        }
    }

    public static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final Converter<String, Float> INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Float f11) {
            return f11.toString();
        }

        @Override // com.google.common.base.Converter
        public Float doForward(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }

        private FloatConverter() {
        }
    }

    public enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i11 = 0; i11 < iMin; i11++) {
                int iCompare = Float.compare(fArr[i11], fArr2[i11]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    public static List<Float> asList(float... fArr) {
        return fArr.length == 0 ? Collections.EMPTY_LIST : new FloatArrayAsList(fArr);
    }

    private static int checkNoOverflow(long j11) {
        int i11 = (int) j11;
        Preconditions.checkArgument(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static float[] concat(float[]... fArr) {
        long length = 0;
        for (float[] fArr2 : fArr) {
            length += (long) fArr2.length;
        }
        float[] fArr3 = new float[checkNoOverflow(length)];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        return fArr3;
    }

    public static boolean contains(float[] fArr, float f11) {
        for (float f12 : fArr) {
            if (f12 == f11) {
                return true;
            }
        }
        return false;
    }

    public static float[] ensureCapacity(float[] fArr, int i11, int i12) {
        Preconditions.checkArgument(i11 >= 0, "Invalid minLength: %s", i11);
        Preconditions.checkArgument(i12 >= 0, "Invalid padding: %s", i12);
        return fArr.length < i11 ? Arrays.copyOf(fArr, i11 + i12) : fArr;
    }

    public static int indexOf(float[] fArr, float f11) {
        return indexOf(fArr, f11, 0, fArr.length);
    }

    public static int lastIndexOf(float[] fArr, float f11) {
        return lastIndexOf(fArr, f11, 0, fArr.length);
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float fMax = fArr[0];
        for (int i11 = 1; i11 < fArr.length; i11++) {
            fMax = Math.max(fMax, fArr[i11]);
        }
        return fMax;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float fMin = fArr[0];
        for (int i11 = 1; i11 < fArr.length; i11++) {
            fMin = Math.min(fMin, fArr[i11]);
        }
        return fMin;
    }

    public static void reverse(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void rotate(float[] fArr, int i11) {
        rotate(fArr, i11, 0, fArr.length);
    }

    public static void sortDescending(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    public static float constrainToRange(float f11, float f12, float f13) {
        if (f12 <= f13) {
            return Math.min(Math.max(f11, f12), f13);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(f12), Float.valueOf(f13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] fArr, float f11, int i11, int i12) {
        while (i11 < i12) {
            if (fArr[i11] == f11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean isFinite(float f11) {
        return Float.NEGATIVE_INFINITY < f11 && f11 < Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] fArr, float f11, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (fArr[i13] == f11) {
                return i13;
            }
        }
        return -1;
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void rotate(float[] fArr, int i11, int i12, int i13) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i12, i13, fArr.length);
        if (fArr.length <= 1) {
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
        reverse(fArr, i12, i16);
        reverse(fArr, i16, i13);
        reverse(fArr, i12, i13);
    }

    public static Converter<String, Float> stringConverter() {
        return FloatConverter.INSTANCE;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).toFloatArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).floatValue();
        }
        return fArr;
    }

    @GwtIncompatible
    public static Float tryParse(String str) {
        if (!Doubles.FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private Floats() {
    }

    @InlineMe(replacement = "Float.compare(a, b)")
    public static int compare(float f11, float f12) {
        return Float.compare(f11, f12);
    }

    public static int hashCode(float f11) {
        return Float.valueOf(f11).hashCode();
    }

    public static int indexOf(float[] fArr, float[] fArr2) {
        Preconditions.checkNotNull(fArr, "array");
        Preconditions.checkNotNull(fArr2, "target");
        if (fArr2.length == 0) {
            return 0;
        }
        for (int i11 = 0; i11 < (fArr.length - fArr2.length) + 1; i11++) {
            for (int i12 = 0; i12 < fArr2.length; i12++) {
                if (fArr[i11 + i12] != fArr2[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }

    public static String join(String str, float... fArr) {
        Preconditions.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(fArr.length * 12);
        sb2.append(fArr[0]);
        for (int i11 = 1; i11 < fArr.length; i11++) {
            sb2.append(str);
            sb2.append(fArr[i11]);
        }
        return sb2.toString();
    }

    public static void reverse(float[] fArr, int i11, int i12) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i11, i12, fArr.length);
        for (int i13 = i12 - 1; i11 < i13; i13--) {
            float f11 = fArr[i11];
            fArr[i11] = fArr[i13];
            fArr[i13] = f11;
            i11++;
        }
    }

    public static void sortDescending(float[] fArr, int i11, int i12) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i11, i12, fArr.length);
        Arrays.sort(fArr, i11, i12);
        reverse(fArr, i11, i12);
    }
}
