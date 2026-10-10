package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    public abstract T computeNext(T t11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t11 = this.nextOrNull;
        if (t11 == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(t11);
        return t11;
    }

    public AbstractSequentialIterator(T t11) {
        this.nextOrNull = t11;
    }
}
