package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Comparators {
    public static <T extends Comparable<? super T>> T max(T t11, T t12) {
        return t11.compareTo(t12) >= 0 ? t11 : t12;
    }

    public static <T extends Comparable<? super T>> T min(T t11, T t12) {
        return t11.compareTo(t12) <= 0 ? t11 : t12;
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> least(final int i11, final Comparator<? super T> comparator) {
        CollectPreconditions.checkNonnegative(i11, "k");
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.y1
            @Override // java.util.function.Supplier
            public final Object get() {
                return TopKSelector.least(i11, comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.z1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((TopKSelector) obj).offer(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.a2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((TopKSelector) obj).combine((TopKSelector) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TopKSelector) obj).topK();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> Comparator<Iterable<S>> lexicographical(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) Preconditions.checkNotNull(comparator));
    }

    @ParametricNullness
    public static <T> T max(@ParametricNullness T t11, @ParametricNullness T t12, Comparator<? super T> comparator) {
        return comparator.compare(t11, t12) >= 0 ? t11 : t12;
    }

    @ParametricNullness
    public static <T> T min(@ParametricNullness T t11, @ParametricNullness T t12, Comparator<? super T> comparator) {
        return comparator.compare(t11, t12) <= 0 ? t11 : t12;
    }

    private Comparators() {
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> greatest(int i11, Comparator<? super T> comparator) {
        return least(i11, comparator.reversed());
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }
}
