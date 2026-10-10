package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true)
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final int SPLITERATOR_CHARACTERISTICS = 1296;
    private static final long serialVersionUID = 912559;

    public static abstract class ArrayBasedBuilder<E> extends Builder<E> {
        Object[] contents;
        boolean forceCopy;
        int size;

        public final void addAll(Object[] objArr, int i11) {
            ObjectArrays.checkElementsNotNull(objArr, i11);
            ensureRoomFor(i11);
            System.arraycopy(objArr, 0, this.contents, this.size, i11);
            this.size += i11;
        }

        private void ensureRoomFor(int i11) {
            Object[] objArr = this.contents;
            int iExpandedCapacity = Builder.expandedCapacity(objArr.length, this.size + i11);
            if (iExpandedCapacity > objArr.length || this.forceCopy) {
                this.contents = Arrays.copyOf(this.contents, iExpandedCapacity);
                this.forceCopy = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public ArrayBasedBuilder<E> add(E e11) {
            Preconditions.checkNotNull(e11);
            ensureRoomFor(1);
            Object[] objArr = this.contents;
            int i11 = this.size;
            this.size = i11 + 1;
            objArr[i11] = e11;
            return this;
        }

        public ArrayBasedBuilder(int i11) {
            CollectPreconditions.checkNonnegative(i11, "initialCapacity");
            this.contents = new Object[i11];
            this.size = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            addAll(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                ensureRoomFor(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.size = ((ImmutableCollection) collection).copyIntoArray(this.contents, this.size);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }
    }

    @DoNotMock
    public static abstract class Builder<E> {
        static final int DEFAULT_INITIAL_CAPACITY = 4;

        @CanIgnoreReturnValue
        public abstract Builder<E> add(E e11);

        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            for (E e11 : eArr) {
                add(e11);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public abstract ImmutableCollection<E> build();

        public static int expandedCapacity(int i11, int i12) {
            if (i12 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i12 <= i11) {
                return i11;
            }
            int iHighestOneBit = i11 + (i11 >> 1) + 1;
            if (iHighestOneBit < i12) {
                iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public Object[] internalArray() {
        return null;
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @IgnoreJRERequirement
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, SPLITERATOR_CHARACTERISTICS);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) Platform.copy(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    public ImmutableList<E> asList() {
        if (isEmpty()) {
            return ImmutableList.m13439of();
        }
        return ImmutableList.asImmutableList(toArray());
    }

    @CanIgnoreReturnValue
    public int copyIntoArray(Object[] objArr, int i11) {
        UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return i11;
    }
}
