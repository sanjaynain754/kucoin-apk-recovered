package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.stream.Collector;
import p002a0.C0006b;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, SortedIterable<E> {
    private static final long serialVersionUID = 912559;
    final transient Comparator<? super E> comparator;

    @GwtIncompatible
    @LazyInit
    transient ImmutableSortedSet<E> descendingSet;

    public static final class Builder<E> extends ImmutableSet.Builder<E> {
        private final Comparator<? super E> comparator;

        public Builder(Comparator<? super E> comparator) {
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        @CanIgnoreReturnValue
        public Builder<E> combine(ImmutableSet.Builder<E> builder) {
            super.combine((ImmutableSet.Builder) builder);
            return this;
        }

        public Builder(Comparator<? super E> comparator, int i11) {
            super(i11, false);
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSortedSet<E> build() {
            ImmutableSortedSet<E> immutableSortedSetConstruct = ImmutableSortedSet.construct(this.comparator, this.size, this.contents);
            this.size = immutableSortedSetConstruct.size();
            this.forceCopy = true;
            return immutableSortedSetConstruct;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e11) {
            super.add((Object) e11);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new Builder(this.comparator).add(this.elements).build();
        }

        public SerializedForm(Comparator<? super E> comparator, Object[] objArr) {
            this.comparator = comparator;
            this.elements = objArr;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet copyOf(Comparable[] comparableArr) {
        return construct(Ordering.natural(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13541of() {
        return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    }

    public E ceiling(E e11) {
        return (E) Iterables.getFirst(tailSet((Object) e11, true), null);
    }

    @GwtIncompatible
    public abstract ImmutableSortedSet<E> createDescendingSet();

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public abstract UnmodifiableIterator<E> descendingIterator();

    public E floor(E e11) {
        return (E) Iterators.getNext(headSet((Object) e11, true).descendingIterator(), null);
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E e11, boolean z11);

    @GwtIncompatible
    public E higher(E e11) {
        return (E) Iterables.getFirst(tailSet((Object) e11, false), null);
    }

    public abstract int indexOf(Object obj);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @GwtIncompatible
    public E lower(E e11) {
        return (E) Iterators.getNext(headSet((Object) e11, false).descendingIterator(), null);
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E e11, boolean z11, E e12, boolean z12);

    public abstract ImmutableSortedSet<E> tailSetImpl(E e11, boolean z11);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <E> Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <E> Builder<E> builderWithExpectedSize(int i11) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator, int i11, E... eArr) {
        if (i11 == 0) {
            return emptySet(comparator);
        }
        ObjectArrays.checkElementsNotNull(eArr, i11);
        Arrays.sort(eArr, 0, i11, comparator);
        int i12 = 1;
        for (int i13 = 1; i13 < i11; i13++) {
            C0006b c0006b = (Object) eArr[i13];
            if (comparator.compare(c0006b, (Object) eArr[i12 - 1]) != 0) {
                eArr[i12] = c0006b;
                i12++;
            }
        }
        Arrays.fill(eArr, i12, i11, (Object) null);
        if (i12 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i12);
        }
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(eArr, i12), comparator);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E extends Comparable<?>> Builder<E> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m13542of(Comparable comparable) {
        return new RegularImmutableSortedSet(ImmutableList.m13440of(comparable), Ordering.natural());
    }

    public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
        return new Builder<>(comparator);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> Builder<E> reverseOrder() {
        return new Builder<>(Collections.reverseOrder());
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedSet")
    @Deprecated
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        throw new UnsupportedOperationException();
    }

    public static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetCreateDescendingSet = createDescendingSet();
        this.descendingSet = immutableSortedSetCreateDescendingSet;
        immutableSortedSetCreateDescendingSet.descendingSet = this;
        return immutableSortedSetCreateDescendingSet;
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.comparator, toArray());
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparator = SortedIterables.comparator(sortedSet);
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) sortedSet);
        if (immutableListCopyOf.isEmpty()) {
            return emptySet(comparator);
        }
        return new RegularImmutableSortedSet(immutableListCopyOf, comparator);
    }

    public static <E> RegularImmutableSortedSet<E> emptySet(Comparator<? super E> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.NATURAL_EMPTY_SET;
        }
        return new RegularImmutableSortedSet<>(ImmutableList.m13439of(), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m13543of(Comparable comparable, Comparable comparable2) {
        return construct(Ordering.natural(), 2, comparable, comparable2);
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(Comparator<? super E> comparator) {
        return CollectCollectors.toImmutableSortedSet(comparator);
    }

    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> headSet(E e11) {
        return headSet((Object) e11, false);
    }

    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> subSet(E e11, E e12) {
        return subSet((Object) e11, true, (Object) e12, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> tailSet(E e11) {
        return tailSet((Object) e11, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) Ordering.natural(), (Collection) collection);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m13544of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return construct(Ordering.natural(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> headSet(E e11, boolean z11) {
        return headSetImpl(Preconditions.checkNotNull(e11), z11);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public ImmutableSortedSet<E> subSet(E e11, boolean z11, E e12, boolean z12) {
        Preconditions.checkNotNull(e11);
        Preconditions.checkNotNull(e12);
        Preconditions.checkArgument(this.comparator.compare(e11, e12) <= 0);
        return subSetImpl(e11, z11, e12, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> tailSet(E e11, boolean z11) {
        return tailSetImpl(Preconditions.checkNotNull(e11), z11);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m13545of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return construct(Ordering.natural(), 4, comparable, comparable2, comparable3, comparable4);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m13546of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return construct(Ordering.natural(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedSet m13547of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return construct(Ordering.natural(), length, comparableArr2);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new Builder(comparator).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        if (SortedIterables.hasSameComparator(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] array = Iterables.toArray(iterable);
        return construct(comparator, array.length, array);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    @DoNotCall("Pass a parameter of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13548of(E e11) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <Z> ImmutableSortedSet<Z> copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13549of(E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13550of(E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13551of(E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13552of(E e11, E e12, E e13, E e14, E e15) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m13553of(E e11, E e12, E e13, E e14, E e15, E e16, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
