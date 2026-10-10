package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    public AbstractIndexedListIterator(int i11) {
        this(i11, 0);
    }

    @ParametricNullness
    public abstract E get(int i11);

    public AbstractIndexedListIterator(int i11, int i12) {
        Preconditions.checkPositionIndex(i12, i11);
        this.size = i11;
        this.position = i12;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.position < this.size;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.position - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
        if (hasNext()) {
            int i11 = this.position;
            this.position = i11 + 1;
            return get(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
        if (hasPrevious()) {
            int i11 = this.position - 1;
            this.position = i11;
            return get(i11);
        }
        throw new NoSuchElementException();
    }
}
