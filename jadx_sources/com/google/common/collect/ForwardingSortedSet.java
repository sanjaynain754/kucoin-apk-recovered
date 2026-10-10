package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract SortedSet<E> delegate();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardContains(Object obj) {
        try {
            return ForwardingSortedMap.unsafeCompare(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRemove(Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (ForwardingSortedMap.unsafeCompare(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@ParametricNullness E e11) {
        return delegate().headSet(e11);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        return delegate().last();
    }

    public SortedSet<E> standardSubSet(@ParametricNullness E e11, @ParametricNullness E e12) {
        return tailSet(e11).headSet(e12);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@ParametricNullness E e11, @ParametricNullness E e12) {
        return delegate().subSet(e11, e12);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@ParametricNullness E e11) {
        return delegate().tailSet(e11);
    }
}
