package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;

    /* JADX INFO: renamed from: k */
    private final int f12260k;
    private T threshold;

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i11) {
        return greatest(i11, Ordering.natural());
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i11) {
        return least(i11, Ordering.natural());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopKSelector<T> combine(TopKSelector<T> topKSelector) {
        for (int i11 = 0; i11 < topKSelector.bufferSize; i11++) {
            offer(NullnessCasts.uncheckedCastNullableTToT(topKSelector.buffer[i11]));
        }
        return this;
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public static <T> TopKSelector<T> greatest(int i11, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i11);
    }

    public static <T> TopKSelector<T> least(int i11, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i11);
    }

    private int partition(int i11, int i12, int i13) {
        Object objUncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.buffer[i13]);
        T[] tArr = this.buffer;
        tArr[i13] = tArr[i12];
        int i14 = i11;
        while (i11 < i12) {
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i11]), objUncheckedCastNullableTToT) < 0) {
                swap(i14, i11);
                i14++;
            }
            i11++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i12] = tArr2[i14];
        tArr2[i14] = objUncheckedCastNullableTToT;
        return i14;
    }

    private void swap(int i11, int i12) {
        T[] tArr = this.buffer;
        T t11 = tArr[i11];
        tArr[i11] = tArr[i12];
        tArr[i12] = t11;
    }

    private void trim() {
        int i11 = (this.f12260k * 2) - 1;
        int iLog2 = IntMath.log2(i11, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (iMax < i11) {
            int iPartition = partition(iMax, i11, ((iMax + i11) + 1) >>> 1);
            int i14 = this.f12260k;
            if (iPartition <= i14) {
                if (iPartition >= i14) {
                    break;
                }
                iMax = Math.max(iPartition, iMax + 1);
                i13 = iPartition;
            } else {
                i11 = iPartition - 1;
            }
            i12++;
            if (i12 >= iLog2) {
                Arrays.sort(this.buffer, iMax, i11 + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.f12260k;
        this.threshold = (T) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i13]);
        while (true) {
            i13++;
            if (i13 >= this.f12260k) {
                return;
            }
            if (this.comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(this.buffer[i13]), (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = this.buffer[i13];
            }
        }
    }

    public void offer(@ParametricNullness T t11) {
        int i11 = this.f12260k;
        if (i11 == 0) {
            return;
        }
        int i12 = this.bufferSize;
        if (i12 == 0) {
            this.buffer[0] = t11;
            this.threshold = t11;
            this.bufferSize = 1;
            return;
        }
        if (i12 < i11) {
            T[] tArr = this.buffer;
            this.bufferSize = i12 + 1;
            tArr[i12] = t11;
            if (this.comparator.compare(t11, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = t11;
                return;
            }
            return;
        }
        if (this.comparator.compare(t11, (Object) NullnessCasts.uncheckedCastNullableTToT(this.threshold)) < 0) {
            T[] tArr2 = this.buffer;
            int i13 = this.bufferSize;
            int i14 = i13 + 1;
            this.bufferSize = i14;
            tArr2[i13] = t11;
            if (i14 == this.f12260k * 2) {
                trim();
            }
        }
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }

    public List<T> topK() {
        T[] tArr = this.buffer;
        Arrays.sort(tArr, 0, this.bufferSize, this.comparator);
        int i11 = this.bufferSize;
        int i12 = this.f12260k;
        if (i11 > i12) {
            T[] tArr2 = this.buffer;
            Arrays.fill(tArr2, i12, tArr2.length, (Object) null);
            int i13 = this.f12260k;
            this.bufferSize = i13;
            this.threshold = this.buffer[i13 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.bufferSize)));
    }

    private TopKSelector(Comparator<? super T> comparator, int i11) {
        boolean z11;
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f12260k = i11;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "k (%s) must be >= 0", i11);
        Preconditions.checkArgument(i11 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i11);
        this.buffer = (T[]) new Object[IntMath.checkedMultiply(i11, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }
}
