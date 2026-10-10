package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    @LazyInit
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.m13439of());
    private static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.m13440of(Range.all()));

    public final class AsSet extends ImmutableSortedSet<C> {
        private final DiscreteDomain<C> domain;

        @LazyInit
        private transient Integer size;

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        public AsSet(DiscreteDomain<C> discreteDomain) {
            super(Ordering.natural());
            this.domain = discreteDomain;
        }

        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> createDescendingSet() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public UnmodifiableIterator<C> descendingIterator() {
            return new AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.2
                Iterator<C> elemItr = Iterators.emptyIterator();
                final Iterator<Range<C>> rangeItr;

                {
                    this.rangeItr = ImmutableRangeSet.this.ranges.reverse().iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public C computeNext() {
                    while (!this.elemItr.hasNext()) {
                        if (!this.rangeItr.hasNext()) {
                            return (C) endOfData();
                        }
                        this.elemItr = ContiguousSet.create(this.rangeItr.next(), AsSet.this.domain).descendingIterator();
                    }
                    return this.elemItr.next();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> headSetImpl(C c11, boolean z11) {
            return subSet(Range.upTo(c11, BoundType.forBoolean(z11)));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<C> iterator() {
            return new AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.1
                Iterator<C> elemItr = Iterators.emptyIterator();
                final Iterator<Range<C>> rangeItr;

                {
                    this.rangeItr = ImmutableRangeSet.this.ranges.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public C computeNext() {
                    while (!this.elemItr.hasNext()) {
                        if (!this.rangeItr.hasNext()) {
                            return (C) endOfData();
                        }
                        this.elemItr = ContiguousSet.create(this.rangeItr.next(), AsSet.this.domain).iterator();
                    }
                    return this.elemItr.next();
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.size;
            if (numValueOf == null) {
                UnmodifiableIterator it = ImmutableRangeSet.this.ranges.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it.next(), this.domain).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.saturatedCast(size));
                this.size = numValueOf;
            }
            return numValueOf.intValue();
        }

        public ImmutableSortedSet<C> subSet(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.domain);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> subSetImpl(C c11, boolean z11, C c12, boolean z12) {
            return (z11 || z12 || Range.compareOrThrow(c11, c12) != 0) ? subSet(Range.range(c11, BoundType.forBoolean(z11), c12, BoundType.forBoolean(z12))) : ImmutableSortedSet.m13541of();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> tailSetImpl(C c11, boolean z11) {
            return subSet(Range.downTo(c11, BoundType.forBoolean(z11)));
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.ranges.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        public Object writeReplace() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.ranges, this.domain);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(Object obj) {
            if (contains(obj)) {
                Objects.requireNonNull(obj);
                Comparable comparable = (Comparable) obj;
                UnmodifiableIterator it = ImmutableRangeSet.this.ranges.iterator();
                long size = 0;
                while (it.hasNext()) {
                    Range range = (Range) it.next();
                    if (range.contains(comparable)) {
                        return Ints.saturatedCast(size + ((long) ContiguousSet.create(range, this.domain).indexOf(comparable)));
                    }
                    size += (long) ContiguousSet.create(range, this.domain).size();
                }
                throw new AssertionError("impossible");
            }
            return -1;
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        public Object readResolve() {
            return new ImmutableRangeSet(this.ranges).asSet(this.domain);
        }

        public AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.ranges = immutableList;
            this.domain = discreteDomain;
        }
    }

    public static class Builder<C extends Comparable<?>> {
        private final List<Range<C>> ranges = Lists.newArrayList();

        @CanIgnoreReturnValue
        public Builder<C> addAll(RangeSet<C> rangeSet) {
            return addAll(rangeSet.asRanges());
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public ImmutableRangeSet<C> build() {
            ImmutableList.Builder builder = new ImmutableList.Builder(this.ranges.size());
            Collections.sort(this.ranges, Range.rangeLexOrdering());
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.ranges.iterator());
            while (peekingIterator.hasNext()) {
                Range rangeSpan = (Range) peekingIterator.next();
                while (peekingIterator.hasNext()) {
                    Range<C> range = (Range) peekingIterator.peek();
                    if (!rangeSpan.isConnected(range)) {
                        break;
                    }
                    Preconditions.checkArgument(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                    rangeSpan = rangeSpan.span((Range) peekingIterator.next());
                }
                builder.add(rangeSpan);
            }
            ImmutableList immutableListBuild = builder.build();
            if (immutableListBuild.isEmpty()) {
                return ImmutableRangeSet.m13485of();
            }
            return (immutableListBuild.size() == 1 && ((Range) Iterables.getOnlyElement(immutableListBuild)).equals(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet<>(immutableListBuild);
        }

        @CanIgnoreReturnValue
        public Builder<C> combine(Builder<C> builder) {
            addAll(builder.ranges);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<C> add(Range<C> range) {
            Preconditions.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.ranges.add(range);
            return this;
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ComplementRanges() {
            boolean zHasLowerBound = ((Range) ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.positiveBoundedBelow = zHasLowerBound;
            boolean zHasUpperBound = ((Range) Iterables.getLast(ImmutableRangeSet.this.ranges)).hasUpperBound();
            this.positiveBoundedAbove = zHasUpperBound;
            int size = ImmutableRangeSet.this.ranges.size();
            size = zHasLowerBound ? size : size - 1;
            this.size = zHasUpperBound ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Range<C> get(int i11) {
            Cut<C> cutBelowAll;
            Preconditions.checkElementIndex(i11, this.size);
            if (this.positiveBoundedBelow) {
                cutBelowAll = i11 == 0 ? Cut.belowAll() : ((Range) ImmutableRangeSet.this.ranges.get(i11 - 1)).upperBound;
            } else {
                cutBelowAll = ((Range) ImmutableRangeSet.this.ranges.get(i11)).upperBound;
            }
            return Range.create(cutBelowAll, (this.positiveBoundedAbove && i11 == this.size + (-1)) ? Cut.aboveAll() : ((Range) ImmutableRangeSet.this.ranges.get(i11 + (!this.positiveBoundedBelow ? 1 : 0))).lowerBound);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        public Object readResolve() {
            if (this.ranges.isEmpty()) {
                return ImmutableRangeSet.m13485of();
            }
            return this.ranges.equals(ImmutableList.m13440of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.ranges);
        }

        public SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.ranges = immutableList;
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.ranges = immutableList;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(RangeSet<C> rangeSet) {
        Preconditions.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return m13485of();
        }
        if (rangeSet.encloses(Range.all())) {
            return all();
        }
        if (rangeSet instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) rangeSet;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) rangeSet.asRanges()));
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m13485of() {
        return EMPTY;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> Builder<C> builder() {
        return new Builder<>();
    }

    private ImmutableList<Range<C>> intersectRanges(final Range<C> range) {
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.m13439of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        final int iBinarySearch = range.hasLowerBound() ? SortedLists.binarySearch(this.ranges, new C8255f2(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        final int iBinarySearch2 = (range.hasUpperBound() ? SortedLists.binarySearch(this.ranges, new C8260g2(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : this.ranges.size()) - iBinarySearch;
        return iBinarySearch2 == 0 ? ImmutableList.m13439of() : (ImmutableList<Range<C>>) new ImmutableList<Range<C>>(this) { // from class: com.google.common.collect.ImmutableRangeSet.1
            final /* synthetic */ ImmutableRangeSet this$0;

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<C> get(int i11) {
                Preconditions.checkElementIndex(i11, iBinarySearch2);
                return (i11 == 0 || i11 == iBinarySearch2 + (-1)) ? ((Range) this.this$0.ranges.get(i11 + iBinarySearch)).intersection(range) : (Range) this.this$0.ranges.get(i11 + iBinarySearch);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iBinarySearch2;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m13486of(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return m13485of();
        }
        return range.equals(Range.all()) ? all() : new ImmutableRangeSet<>(ImmutableList.m13440of(range));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.m13487of() : new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse());
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.m13487of() : new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering());
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetAll = all();
            this.complement = immutableRangeSetAll;
            return immutableRangeSetAll;
        }
        if (this.ranges.size() == 1 && this.ranges.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSetM13485of = m13485of();
            this.complement = immutableRangeSetM13485of;
            return immutableRangeSetM13485of;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
        this.complement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, new C8260g2(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iBinarySearch != -1 && this.ranges.get(iBinarySearch).encloses(range);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, new C8260g2(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iBinarySearch < this.ranges.size() && this.ranges.get(iBinarySearch).isConnected(range) && !this.ranges.get(iBinarySearch).intersection(range).isEmpty()) {
            return true;
        }
        if (iBinarySearch <= 0) {
            return false;
        }
        int i11 = iBinarySearch - 1;
        return this.ranges.get(i11).isConnected(range) && !this.ranges.get(i11).intersection(range).isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    public boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c11) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, new C8260g2(), Cut.belowValue(c11), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch != -1) {
            Range<C> range = this.ranges.get(iBinarySearch);
            if (range.contains(c11)) {
                return range;
            }
        }
        return null;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        Cut<C> cut = this.ranges.get(0).lowerBound;
        ImmutableList<Range<C>> immutableList = this.ranges;
        return Range.create(cut, immutableList.get(immutableList.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return m13485of();
    }

    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.ranges);
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }

    @IgnoreJRERequirement
    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return CollectCollectors.toImmutableRangeSet();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.m13541of();
        }
        Range<C> rangeCanonical = span().canonical(discreteDomain);
        if (rangeCanonical.hasLowerBound()) {
            if (!rangeCanonical.hasUpperBound()) {
                try {
                    discreteDomain.maxValue();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new AsSet(discreteDomain);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(RangeSet<C> rangeSet) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(rangeSet);
        return copyOf(treeRangeSetCreate);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(RangeSet<C> rangeSet) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(rangeSet.complement());
        return copyOf(treeRangeSetCreate);
    }

    public ImmutableRangeSet<C> union(RangeSet<C> rangeSet) {
        return unionOf(Iterables.concat(asRanges(), rangeSet.asRanges()));
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new Builder().addAll(iterable).build();
    }
}
