package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@Immutable
@GwtCompatible
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.parent = immutableDoubleArray;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i11 = this.parent.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i12 = i11 + 1;
                    if (ImmutableDoubleArray.areEqual(this.parent.array[i11], ((Double) obj2).doubleValue())) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i11) {
            return Double.valueOf(this.parent.get(i11));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i11, int i12) {
            return this.parent.subArray(i11, i12).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }
    }

    public static final class Builder {
        private double[] array;
        private int count = 0;

        @CanIgnoreReturnValue
        public Builder add(double d11) {
            ensureRoomFor(1);
            double[] dArr = this.array;
            int i11 = this.count;
            dArr[i11] = d11;
            this.count = i11 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(double[] dArr) {
            ensureRoomFor(dArr.length);
            System.arraycopy(dArr, 0, this.array, this.count, dArr.length);
            this.count += dArr.length;
            return this;
        }

        private void ensureRoomFor(int i11) {
            int i12 = this.count + i11;
            double[] dArr = this.array;
            if (i12 > dArr.length) {
                this.array = Arrays.copyOf(dArr, expandedCapacity(dArr.length, i12));
            }
        }

        private static int expandedCapacity(int i11, int i12) {
            if (i12 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i11 + (i11 >> 1) + 1;
            if (iHighestOneBit < i12) {
                iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public ImmutableDoubleArray build() {
            if (this.count == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.array, 0, this.count);
        }

        public Builder(int i11) {
            this.array = new double[i11];
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Double>) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Double> collection) {
            ensureRoomFor(collection.size());
            for (Double d11 : collection) {
                double[] dArr = this.array;
                int i11 = this.count;
                this.count = i11 + 1;
                dArr[i11] = d11.doubleValue();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
            ensureRoomFor(immutableDoubleArray.length());
            System.arraycopy(immutableDoubleArray.array, immutableDoubleArray.start, this.array, this.count, immutableDoubleArray.length());
            this.count += immutableDoubleArray.length();
            return this;
        }
    }

    public static Builder builder(int i11) {
        Preconditions.checkArgument(i11 >= 0, "Invalid initialCapacity: %s", i11);
        return new Builder(i11);
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        return dArr.length == 0 ? EMPTY : new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13636of() {
        return EMPTY;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length(); i11++) {
            if (!areEqual(get(i11), immutableDoubleArray.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13637of(double d11) {
        return new ImmutableDoubleArray(new double[]{d11});
    }

    public List<Double> asList() {
        return new AsList();
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i11 = this.start; i11 < this.end; i11++) {
            iHashCode = (iHashCode * 31) + Doubles.hashCode(this.array[i11]);
        }
        return iHashCode;
    }

    public int indexOf(double d11) {
        for (int i11 = this.start; i11 < this.end; i11++) {
            if (areEqual(this.array[i11], d11)) {
                return i11 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double d11) {
        int i11 = this.end;
        do {
            i11--;
            if (i11 < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i11], d11));
        return i11 - this.start;
    }

    public int length() {
        return this.end - this.start;
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    private ImmutableDoubleArray(double[] dArr, int i11, int i12) {
        this.array = dArr;
        this.start = i11;
        this.end = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double d11, double d12) {
        if (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d12)) {
            return true;
        }
        return false;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13638of(double d11, double d12) {
        return new ImmutableDoubleArray(new double[]{d11, d12});
    }

    public boolean contains(double d11) {
        if (indexOf(d11) >= 0) {
            return true;
        }
        return false;
    }

    public double get(int i11) {
        Preconditions.checkElementIndex(i11, length());
        return this.array[this.start + i11];
    }

    public Object readResolve() {
        if (isEmpty()) {
            return EMPTY;
        }
        return this;
    }

    public ImmutableDoubleArray subArray(int i11, int i12) {
        Preconditions.checkPositionIndexes(i11, i12, length());
        if (i11 == i12) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i13 = this.start;
        return new ImmutableDoubleArray(dArr, i11 + i13, i13 + i12);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.array[this.start]);
        int i11 = this.start;
        while (true) {
            i11++;
            if (i11 < this.end) {
                sb2.append(", ");
                sb2.append(this.array[i11]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    public ImmutableDoubleArray trimmed() {
        if (isPartialView()) {
            return new ImmutableDoubleArray(toArray());
        }
        return this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableDoubleArray(Doubles.toArray(collection));
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13639of(double d11, double d12, double d13) {
        return new ImmutableDoubleArray(new double[]{d11, d12, d13});
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Double>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13640of(double d11, double d12, double d13, double d14) {
        return new ImmutableDoubleArray(new double[]{d11, d12, d13, d14});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13641of(double d11, double d12, double d13, double d14, double d15) {
        return new ImmutableDoubleArray(new double[]{d11, d12, d13, d14, d15});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13642of(double d11, double d12, double d13, double d14, double d15, double d16) {
        return new ImmutableDoubleArray(new double[]{d11, d12, d13, d14, d15, d16});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m13643of(double d11, double... dArr) {
        Preconditions.checkArgument(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d11;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }
}
