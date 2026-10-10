package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class SortedMultisets {

    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {

        @Weak
        private final SortedMultiset<E> multiset;

        @Override // com.google.common.collect.Multisets.ElementSet
        public final SortedMultiset<E> multiset() {
            return this.multiset;
        }

        public ElementSet(SortedMultiset<E> sortedMultiset) {
            this.multiset = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return multiset().comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) SortedMultisets.getElementOrThrow(multiset().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e11) {
            return multiset().headMultiset(e11, BoundType.OPEN).elementSet();
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.elementIterator(multiset().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) SortedMultisets.getElementOrThrow(multiset().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e11, @ParametricNullness E e12) {
            return multiset().subMultiset(e11, BoundType.CLOSED, e12, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e11) {
            return multiset().tailMultiset(e11, BoundType.CLOSED).elementSet();
        }
    }

    @GwtIncompatible
    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new NavigableElementSet(multiset().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e11, boolean z11) {
            return new NavigableElementSet(multiset().headMultiset(e11, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e11, boolean z11, @ParametricNullness E e12, boolean z12) {
            return new NavigableElementSet(multiset().subMultiset(e11, BoundType.forBoolean(z11), e12, BoundType.forBoolean(z12)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e11, boolean z11) {
            return new NavigableElementSet(multiset().tailMultiset(e11, BoundType.forBoolean(z11)));
        }

        public NavigableElementSet(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e11) {
            return (E) SortedMultisets.getElementOrNull(multiset().tailMultiset(e11, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e11) {
            return (E) SortedMultisets.getElementOrNull(multiset().headMultiset(e11, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e11) {
            return (E) SortedMultisets.getElementOrNull(multiset().tailMultiset(e11, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e11) {
            return (E) SortedMultisets.getElementOrNull(multiset().headMultiset(e11, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) SortedMultisets.getElementOrNull(multiset().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) SortedMultisets.getElementOrNull(multiset().pollLastEntry());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E getElementOrNull(Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E getElementOrThrow(Multiset.Entry<E> entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }

    private SortedMultisets() {
    }
}
