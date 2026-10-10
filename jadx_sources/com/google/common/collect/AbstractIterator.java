package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {
    private T next;
    private State state = State.NOT_READY;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T computeNext();

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @CanIgnoreReturnValue
    public final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.state != State.FAILED);
        int iOrdinal = this.state.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return tryToComputeNext();
        }
        return false;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.state = State.NOT_READY;
            T t11 = (T) NullnessCasts.uncheckedCastNullableTToT(this.next);
            this.next = null;
            return t11;
        }
        throw new NoSuchElementException();
    }

    @ParametricNullness
    public final T peek() {
        if (hasNext()) {
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.next);
        }
        throw new NoSuchElementException();
    }
}
