package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract List<E> delegate();

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    public ListIterator<E> standardListIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i11) {
        return delegate().listIterator(i11);
    }

    public ListIterator<E> standardListIterator(int i11) {
        return Lists.listIteratorImpl(this, i11);
    }

    public void add(int i11, @ParametricNullness E e11) {
        delegate().add(i11, e11);
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i11, Collection<? extends E> collection) {
        return delegate().addAll(i11, collection);
    }

    @Override // java.util.List
    @ParametricNullness
    public E get(int i11) {
        return delegate().get(i11);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return delegate().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return delegate().lastIndexOf(obj);
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove(int i11) {
        return delegate().remove(i11);
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E set(int i11, @ParametricNullness E e11) {
        return delegate().set(i11, e11);
    }

    public boolean standardAdd(@ParametricNullness E e11) {
        add(size(), e11);
        return true;
    }

    public boolean standardAddAll(int i11, Iterable<? extends E> iterable) {
        return Lists.addAllImpl(this, i11, iterable);
    }

    public boolean standardEquals(Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    public int standardHashCode() {
        return Lists.hashCodeImpl(this);
    }

    public int standardIndexOf(Object obj) {
        return Lists.indexOfImpl(this, obj);
    }

    public Iterator<E> standardIterator() {
        return listIterator();
    }

    public int standardLastIndexOf(Object obj) {
        return Lists.lastIndexOfImpl(this, obj);
    }

    public List<E> standardSubList(int i11, int i12) {
        return Lists.subListImpl(this, i11, i12);
    }

    @Override // java.util.List
    public List<E> subList(int i11, int i12) {
        return delegate().subList(i11, i12);
    }
}
