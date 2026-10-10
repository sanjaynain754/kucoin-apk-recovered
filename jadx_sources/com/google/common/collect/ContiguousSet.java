package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotCall;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final DiscreteDomain<C> domain;

    public static ContiguousSet<Integer> closed(int i11, int i12) {
        return create(Range.closed(Integer.valueOf(i11), Integer.valueOf(i12)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Integer> closedOpen(int i11, int i12) {
        return create(Range.closedOpen(Integer.valueOf(i11), Integer.valueOf(i12)), DiscreteDomain.integers());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C c11, boolean z11);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C c11, boolean z11, C c12, boolean z12);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C c11, boolean z11);

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Long> closed(long j11, long j12) {
        return create(Range.closed(Long.valueOf(j11), Long.valueOf(j12)), DiscreteDomain.longs());
    }

    public static ContiguousSet<Long> closedOpen(long j11, long j12) {
        return create(Range.closedOpen(Long.valueOf(j11), Long.valueOf(j12)), DiscreteDomain.longs());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public ImmutableSortedSet<C> createDescendingSet() {
        return new DescendingImmutableSortedSet(this);
    }

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.natural());
        this.domain = discreteDomain;
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
        Range<C> rangeIntersection;
        Preconditions.checkNotNull(range);
        Preconditions.checkNotNull(discreteDomain);
        try {
            if (!range.hasLowerBound()) {
                rangeIntersection = range.intersection(Range.atLeast(discreteDomain.minValue()));
            } else {
                rangeIntersection = range;
            }
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(Range.atMost(discreteDomain.maxValue()));
            }
            if (!rangeIntersection.isEmpty()) {
                Comparable comparableLeastValueAbove = range.lowerBound.leastValueAbove(discreteDomain);
                Objects.requireNonNull(comparableLeastValueAbove);
                Comparable comparableGreatestValueBelow = range.upperBound.greatestValueBelow(discreteDomain);
                Objects.requireNonNull(comparableGreatestValueBelow);
                if (Range.compareOrThrow(comparableLeastValueAbove, comparableGreatestValueBelow) <= 0) {
                    return new RegularContiguousSet(rangeIntersection, discreteDomain);
                }
            }
            return new EmptyContiguousSet(discreteDomain);
        } catch (NoSuchElementException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c11) {
        return headSetImpl((Comparable) Preconditions.checkNotNull(c11), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c11, C c12) {
        Preconditions.checkNotNull(c11);
        Preconditions.checkNotNull(c12);
        Preconditions.checkArgument(comparator().compare(c11, c12) <= 0);
        return subSetImpl((Comparable) c11, true, (Comparable) c12, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c11) {
        return tailSetImpl((Comparable) Preconditions.checkNotNull(c11), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> headSet(C c11, boolean z11) {
        return headSetImpl((Comparable) Preconditions.checkNotNull(c11), z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> tailSet(C c11, boolean z11) {
        return tailSetImpl((Comparable) Preconditions.checkNotNull(c11), z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> subSet(C c11, boolean z11, C c12, boolean z12) {
        Preconditions.checkNotNull(c11);
        Preconditions.checkNotNull(c12);
        Preconditions.checkArgument(comparator().compare(c11, c12) <= 0);
        return subSetImpl((Comparable) c11, z11, (Comparable) c12, z12);
    }
}
