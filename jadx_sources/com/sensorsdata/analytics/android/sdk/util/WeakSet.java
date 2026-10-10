package com.sensorsdata.analytics.android.sdk.util;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes59.dex */
public class WeakSet<T> implements Set<T> {
    private static final Object PRESENT = new Object();
    private transient WeakHashMap<T, Object> map;

    public static class EmptyIterator<E> implements Iterator<E> {
        private static EmptyIterator EMPTY_ITERATOR = new EmptyIterator();

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            throw new UnsupportedOperationException("EmptyIterator should not call this method directly");
        }

        private EmptyIterator() {
        }
    }

    public static class NonEmptyIterator<E> implements Iterator<E> {
        private final Iterator<WeakReference<E>> iterator;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.iterator.next().get();
        }

        private NonEmptyIterator(Iterator<WeakReference<E>> it) {
            this.iterator = it;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException("method toArray() not supported");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("The argument t can't be null");
        }
        if (this.map == null) {
            this.map = new WeakHashMap<>();
        }
        return this.map.put(t11, PRESENT) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("method addAll not supported now");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        WeakHashMap<T, Object> weakHashMap = this.map;
        if (weakHashMap != null) {
            weakHashMap.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException("method containsAll not supported");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("method removeAll not supported now");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("method retainAll not supported now");
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        WeakHashMap<T, Object> weakHashMap = this.map;
        if (weakHashMap == null) {
            return 0;
        }
        return weakHashMap.size();
    }

    @Override // java.util.Set, java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        throw new UnsupportedOperationException("method toArray(T[] a) not supported");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (!isEmpty() && obj != null) {
            return this.map.containsKey(obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        if (isEmpty()) {
            return EmptyIterator.EMPTY_ITERATOR;
        }
        return this.map.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        if (!isEmpty() && obj != null && this.map.remove(obj) == PRESENT) {
            return true;
        }
        return false;
    }
}
