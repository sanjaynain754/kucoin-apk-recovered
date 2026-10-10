package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    public class StandardElementSet extends Multisets.ElementSet<E> {
        public StandardElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public Multiset<E> multiset() {
            return ForwardingMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.elementIterator(multiset().entrySet().iterator());
        }
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Multiset<E> delegate();

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e11, int i11) {
        return delegate().setCount(e11, i11);
    }

    public boolean standardAdd(@ParametricNullness E e11) {
        add(e11, 1);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public int standardSetCount(@ParametricNullness E e11, int i11) {
        return Multisets.setCountImpl(this, e11, i11);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e11, int i11, int i12) {
        return delegate().setCount(e11, i11, i12);
    }

    public boolean standardSetCount(@ParametricNullness E e11, int i11, int i12) {
        return Multisets.setCountImpl(this, e11, i11, i12);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e11, int i11) {
        return delegate().add(e11, i11);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return delegate().count(obj);
    }

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i11) {
        return delegate().remove(obj, i11);
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ForwardingCollection
    public void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardContains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public int standardCount(Object obj) {
        for (Multiset.Entry<E> entry : entrySet()) {
            if (Objects.equal(entry.getElement(), obj)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    public boolean standardEquals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    public int standardHashCode() {
        return entrySet().hashCode();
    }

    public Iterator<E> standardIterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRetainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    public int standardSize() {
        return Multisets.linearTimeSizeImpl(this);
    }

    @Override // com.google.common.collect.ForwardingCollection
    public String standardToString() {
        return entrySet().toString();
    }
}
