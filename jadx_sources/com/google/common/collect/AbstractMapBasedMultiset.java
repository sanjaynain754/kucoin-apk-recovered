package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    public abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        int toRemove = -1;

        @ParametricNullness
        public abstract T result(int i11);

        public Itr() {
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.firstIndex();
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        private void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            if (this.entryIndex >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (hasNext()) {
                T tResult = result(this.entryIndex);
                int i11 = this.entryIndex;
                this.toRemove = i11;
                this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndex(i11);
                return tResult;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z11;
            checkForConcurrentModification();
            if (this.toRemove != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            CollectPreconditions.checkRemove(z11);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.removeEntry(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }
    }

    public abstract ObjectCountHashMap<E> newBackingMap(int i11);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e11, int i11) {
        CollectPreconditions.checkNonnegative(i11, "count");
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int iRemove = i11 == 0 ? objectCountHashMap.remove(e11) : objectCountHashMap.put(e11, i11);
        this.size += (long) (i11 - iRemove);
        return iRemove;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e11, int i11) {
        if (i11 == 0) {
            return count(e11);
        }
        Preconditions.checkArgument(i11 > 0, "occurrences cannot be negative: %s", i11);
        int iIndexOf = this.backingMap.indexOf(e11);
        if (iIndexOf == -1) {
            this.backingMap.put(e11, i11);
            this.size += (long) i11;
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        long j11 = i11;
        long j12 = ((long) value) + j11;
        Preconditions.checkArgument(j12 <= 2147483647L, "too many occurrences: %s", j12);
        this.backingMap.setValue(iIndexOf, (int) j12);
        this.size += j11;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            public E result(int i11) {
                return AbstractMapBasedMultiset.this.backingMap.getKey(i11);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public Multiset.Entry<E> result(int i11) {
                return AbstractMapBasedMultiset.this.backingMap.getEntry(i11);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(Object obj, int i11) {
        if (i11 == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i11 > 0, "occurrences cannot be negative: %s", i11);
        int iIndexOf = this.backingMap.indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        if (value > i11) {
            this.backingMap.setValue(iIndexOf, value - i11);
        } else {
            this.backingMap.removeEntry(iIndexOf);
            i11 = value;
        }
        this.size -= (long) i11;
        return value;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    public AbstractMapBasedMultiset(int i11) {
        this.backingMap = newBackingMap(i11);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        Serialization.populateMultiset(this, objectInputStream, count);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int iFirstIndex = this.backingMap.firstIndex();
        while (iFirstIndex >= 0) {
            multiset.add(this.backingMap.getKey(iFirstIndex), this.backingMap.getValue(iFirstIndex));
            iFirstIndex = this.backingMap.nextIndex(iFirstIndex);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e11, int i11, int i12) {
        CollectPreconditions.checkNonnegative(i11, "oldCount");
        CollectPreconditions.checkNonnegative(i12, "newCount");
        int iIndexOf = this.backingMap.indexOf(e11);
        if (iIndexOf == -1) {
            if (i11 != 0) {
                return false;
            }
            if (i12 > 0) {
                this.backingMap.put(e11, i12);
                this.size += (long) i12;
            }
            return true;
        }
        if (this.backingMap.getValue(iIndexOf) != i11) {
            return false;
        }
        if (i12 == 0) {
            this.backingMap.removeEntry(iIndexOf);
            this.size -= (long) i11;
        } else {
            this.backingMap.setValue(iIndexOf, i12);
            this.size += (long) (i12 - i11);
        }
        return true;
    }
}
