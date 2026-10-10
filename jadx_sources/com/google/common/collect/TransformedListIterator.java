package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    private ListIterator<? extends F> backingIterator() {
        return (ListIterator) this.backingIterator;
    }

    @Override // java.util.ListIterator
    public void add(@ParametricNullness T t11) {
        throw new UnsupportedOperationException();
    }

    public void set(@ParametricNullness T t11) {
        throw new UnsupportedOperationException();
    }

    public TransformedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return backingIterator().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return backingIterator().nextIndex();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final T previous() {
        return transform(backingIterator().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return backingIterator().previousIndex();
    }
}
