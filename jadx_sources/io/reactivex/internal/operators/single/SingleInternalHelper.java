package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleInternalHelper {

    public enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    public enum ToFlowable implements Function<SingleSource, InterfaceC44416b> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public InterfaceC44416b apply(SingleSource singleSource) {
            return new SingleToFlowable(singleSource);
        }
    }

    public static final class ToFlowableIterable<T> implements Iterable<Flowable<T>> {
        private final Iterable<? extends SingleSource<? extends T>> sources;

        @Override // java.lang.Iterable
        public Iterator<Flowable<T>> iterator() {
            return new ToFlowableIterator(this.sources.iterator());
        }

        public ToFlowableIterable(Iterable<? extends SingleSource<? extends T>> iterable) {
            this.sources = iterable;
        }
    }

    public static final class ToFlowableIterator<T> implements Iterator<Flowable<T>> {
        private final Iterator<? extends SingleSource<? extends T>> sit;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.sit.hasNext();
        }

        @Override // java.util.Iterator
        public Flowable<T> next() {
            return new SingleToFlowable(this.sit.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public ToFlowableIterator(Iterator<? extends SingleSource<? extends T>> it) {
            this.sit = it;
        }
    }

    public enum ToObservable implements Function<SingleSource, Observable> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Observable apply(SingleSource singleSource) {
            return new SingleToObservable(singleSource);
        }
    }

    public static <T> Callable<NoSuchElementException> emptyThrower() {
        return NoSuchElementCallable.INSTANCE;
    }

    public static <T> Iterable<? extends Flowable<T>> iterableToFlowable(Iterable<? extends SingleSource<? extends T>> iterable) {
        return new ToFlowableIterable(iterable);
    }

    public static <T> Function<SingleSource<? extends T>, InterfaceC44416b<? extends T>> toFlowable() {
        return ToFlowable.INSTANCE;
    }

    public static <T> Function<SingleSource<? extends T>, Observable<? extends T>> toObservable() {
        return ToObservable.INSTANCE;
    }

    private SingleInternalHelper() {
        throw new IllegalStateException("No instances!");
    }
}
