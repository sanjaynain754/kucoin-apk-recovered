package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Collections2 {

    public static class FilteredCollection<E> extends AbstractCollection<E> {
        final Predicate<? super E> predicate;
        final Collection<E> unfiltered;

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@ParametricNullness E e11) {
            Preconditions.checkArgument(this.predicate.apply(e11));
            return this.unfiltered.add(e11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Iterables.removeIf(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (Collections2.safeContains(this.unfiltered, obj)) {
                return this.predicate.apply(obj);
            }
            return false;
        }

        public FilteredCollection<E> createCombined(Predicate<? super E> predicate) {
            return new FilteredCollection<>(this.unfiltered, Predicates.and(this.predicate, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Iterables.any(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.unfiltered.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.unfiltered.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.unfiltered.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (this.predicate.apply(it.next())) {
                    i11++;
                }
            }
            return i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }

        public FilteredCollection(Collection<E> collection, Predicate<? super E> predicate) {
            this.unfiltered = collection;
            this.predicate = predicate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument(this.predicate.apply(it.next()));
            }
            return this.unfiltered.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Collections2.containsAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (contains(obj) && this.unfiltered.remove(obj)) {
                return true;
            }
            return false;
        }
    }

    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {
        final Comparator<? super E> comparator;
        final ImmutableList<E> inputList;
        final int size;

        private static <E> int calculateSize(List<E> list, Comparator<? super E> comparator) {
            int i11 = 1;
            int iSaturatedMultiply = 1;
            int i12 = 1;
            while (i11 < list.size()) {
                if (comparator.compare(list.get(i11 - 1), list.get(i11)) < 0) {
                    iSaturatedMultiply = IntMath.saturatedMultiply(iSaturatedMultiply, IntMath.binomial(i11, i12));
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i12 = 0;
                }
                i11++;
                i12++;
            }
            return IntMath.saturatedMultiply(iSaturatedMultiply, IntMath.binomial(i11, i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.isPermutation(this.inputList, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new OrderedPermutationIterator(this.inputList, this.comparator);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.size;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.inputList + ")";
        }

        public OrderedPermutationCollection(Iterable<E> iterable, Comparator<? super E> comparator) {
            ImmutableList<E> immutableListSortedCopyOf = ImmutableList.sortedCopyOf(comparator, iterable);
            this.inputList = immutableListSortedCopyOf;
            this.comparator = comparator;
            this.size = calculateSize(immutableListSortedCopyOf, comparator);
        }
    }

    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {
        final Comparator<? super E> comparator;
        List<E> nextPermutation;

        @Override // com.google.common.collect.AbstractIterator
        public List<E> computeNext() {
            List<E> list = this.nextPermutation;
            if (list == null) {
                return endOfData();
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
            calculateNextPermutation();
            return immutableListCopyOf;
        }

        public int findNextJ() {
            Objects.requireNonNull(this.nextPermutation);
            for (int size = this.nextPermutation.size() - 2; size >= 0; size--) {
                if (this.comparator.compare(this.nextPermutation.get(size), this.nextPermutation.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        public int findNextL(int i11) {
            Objects.requireNonNull(this.nextPermutation);
            E e11 = this.nextPermutation.get(i11);
            for (int size = this.nextPermutation.size() - 1; size > i11; size--) {
                if (this.comparator.compare(e11, this.nextPermutation.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }

        public OrderedPermutationIterator(List<E> list, Comparator<? super E> comparator) {
            this.nextPermutation = Lists.newArrayList(list);
            this.comparator = comparator;
        }

        public void calculateNextPermutation() {
            int iFindNextJ = findNextJ();
            if (iFindNextJ == -1) {
                this.nextPermutation = null;
                return;
            }
            Objects.requireNonNull(this.nextPermutation);
            Collections.swap(this.nextPermutation, iFindNextJ, findNextL(iFindNextJ));
            Collections.reverse(this.nextPermutation.subList(iFindNextJ + 1, this.nextPermutation.size()));
        }
    }

    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {
        final ImmutableList<E> inputList;

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.isPermutation(this.inputList, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new PermutationIterator(this.inputList);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return IntMath.factorial(this.inputList.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.inputList + ")";
        }

        public PermutationCollection(ImmutableList<E> immutableList) {
            this.inputList = immutableList;
        }
    }

    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: c */
        final int[] f12253c;

        /* JADX INFO: renamed from: j */
        int f12254j;
        final List<E> list;

        /* JADX INFO: renamed from: o */
        final int[] f12255o;

        public void calculateNextPermutation() {
            int size = this.list.size() - 1;
            this.f12254j = size;
            if (size == -1) {
                return;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f12253c;
                int i12 = this.f12254j;
                int i13 = iArr[i12];
                int i14 = this.f12255o[i12] + i13;
                if (i14 < 0) {
                    switchDirection();
                } else if (i14 != i12 + 1) {
                    Collections.swap(this.list, (i12 - i13) + i11, (i12 - i14) + i11);
                    this.f12253c[this.f12254j] = i14;
                    return;
                } else {
                    if (i12 == 0) {
                        return;
                    }
                    i11++;
                    switchDirection();
                }
            }
        }

        @Override // com.google.common.collect.AbstractIterator
        public List<E> computeNext() {
            if (this.f12254j <= 0) {
                return endOfData();
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.list);
            calculateNextPermutation();
            return immutableListCopyOf;
        }

        public void switchDirection() {
            int[] iArr = this.f12255o;
            int i11 = this.f12254j;
            iArr[i11] = -iArr[i11];
            this.f12254j = i11 - 1;
        }

        public PermutationIterator(List<E> list) {
            this.list = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f12253c = iArr;
            int[] iArr2 = new int[size];
            this.f12255o = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f12254j = Integer.MAX_VALUE;
        }
    }

    public static class TransformedCollection<F, T> extends AbstractCollection<T> {
        final Collection<F> fromCollection;
        final Function<? super F, ? extends T> function;

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.fromCollection.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.fromCollection.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.transform(this.fromCollection.iterator(), this.function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.fromCollection.size();
        }

        public TransformedCollection(Collection<F> collection, Function<? super F, ? extends T> function) {
            this.fromCollection = (Collection) Preconditions.checkNotNull(collection);
            this.function = (Function) Preconditions.checkNotNull(function);
        }
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, Ordering.natural());
    }

    private static <E> ObjectCountHashMap<E> counts(Collection<E> collection) {
        ObjectCountHashMap<E> objectCountHashMap = new ObjectCountHashMap<>();
        for (E e11 : collection) {
            objectCountHashMap.put(e11, objectCountHashMap.get(e11) + 1);
        }
        return objectCountHashMap;
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        return collection instanceof FilteredCollection ? ((FilteredCollection) collection).createCombined(predicate) : new FilteredCollection((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    public static StringBuilder newStringBuilderForCollection(int i11) {
        CollectPreconditions.checkNonnegative(i11, "size");
        return new StringBuilder((int) Math.min(((long) i11) * 8, 1073741824L));
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new OrderedPermutationCollection(iterable, comparator);
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new PermutationCollection(ImmutableList.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new TransformedCollection(collection, function);
    }

    private Collections2() {
    }

    public static boolean containsAllImpl(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPermutation(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ObjectCountHashMap objectCountHashMapCounts = counts(list);
        ObjectCountHashMap objectCountHashMapCounts2 = counts(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (objectCountHashMapCounts.getValue(i11) != objectCountHashMapCounts2.get(objectCountHashMapCounts.getKey(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean safeContains(Collection<?> collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean safeRemove(Collection<?> collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String toStringImpl(Collection<?> collection) {
        StringBuilder sbNewStringBuilderForCollection = newStringBuilderForCollection(collection.size());
        sbNewStringBuilderForCollection.append('[');
        boolean z11 = true;
        for (Object obj : collection) {
            if (!z11) {
                sbNewStringBuilderForCollection.append(", ");
            }
            if (obj == collection) {
                sbNewStringBuilderForCollection.append("(this Collection)");
            } else {
                sbNewStringBuilderForCollection.append(obj);
            }
            z11 = false;
        }
        sbNewStringBuilderForCollection.append(']');
        return sbNewStringBuilderForCollection.toString();
    }
}
