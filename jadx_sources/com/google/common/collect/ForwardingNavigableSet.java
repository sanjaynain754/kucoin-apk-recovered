package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    public class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet() {
            super(ForwardingNavigableSet.this);
        }
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract NavigableSet<E> delegate();

    public E standardCeiling(@ParametricNullness E e11) {
        return (E) Iterators.getNext(tailSet(e11, true).iterator(), null);
    }

    public E standardFloor(@ParametricNullness E e11) {
        return (E) Iterators.getNext(headSet(e11, true).descendingIterator(), null);
    }

    public SortedSet<E> standardHeadSet(@ParametricNullness E e11) {
        return headSet(e11, false);
    }

    public E standardHigher(@ParametricNullness E e11) {
        return (E) Iterators.getNext(tailSet(e11, false).iterator(), null);
    }

    public E standardLower(@ParametricNullness E e11) {
        return (E) Iterators.getNext(headSet(e11, false).descendingIterator(), null);
    }

    public NavigableSet<E> standardSubSet(@ParametricNullness E e11, boolean z11, @ParametricNullness E e12, boolean z12) {
        return tailSet(e11, z11).headSet(e12, z12);
    }

    public SortedSet<E> standardTailSet(@ParametricNullness E e11) {
        return tailSet(e11, true);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    public SortedSet<E> standardSubSet(@ParametricNullness E e11, @ParametricNullness E e12) {
        return subSet(e11, true, e12, false);
    }

    @Override // java.util.NavigableSet
    public E ceiling(@ParametricNullness E e11) {
        return delegate().ceiling(e11);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(@ParametricNullness E e11) {
        return delegate().floor(e11);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E e11, boolean z11) {
        return delegate().headSet(e11, z11);
    }

    @Override // java.util.NavigableSet
    public E higher(@ParametricNullness E e11) {
        return delegate().higher(e11);
    }

    @Override // java.util.NavigableSet
    public E lower(@ParametricNullness E e11) {
        return delegate().lower(e11);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return delegate().pollLast();
    }

    @ParametricNullness
    public E standardFirst() {
        return iterator().next();
    }

    @ParametricNullness
    public E standardLast() {
        return descendingIterator().next();
    }

    public E standardPollFirst() {
        return (E) Iterators.pollNext(iterator());
    }

    public E standardPollLast() {
        return (E) Iterators.pollNext(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E e11, boolean z11, @ParametricNullness E e12, boolean z12) {
        return delegate().subSet(e11, z11, e12, z12);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E e11, boolean z11) {
        return delegate().tailSet(e11, z11);
    }
}
