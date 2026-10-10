package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {
    final T initialValue;
    final ObservableSource<T> source;

    public static final class MostRecentObserver<T> extends DefaultObserver<T> {
        volatile Object value;

        public final class Iterator implements java.util.Iterator<T> {
            private Object buf;

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = MostRecentObserver.this.value;
                    }
                    if (NotificationLite.isComplete(this.buf)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.buf)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.buf));
                    }
                    T t11 = (T) NotificationLite.getValue(this.buf);
                    this.buf = null;
                    return t11;
                } catch (Throwable th2) {
                    this.buf = null;
                    throw th2;
                }
            }

            public Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = MostRecentObserver.this.value;
                this.buf = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public MostRecentObserver<T>.Iterator getIterable() {
            return new Iterator();
        }

        public MostRecentObserver(T t11) {
            this.value = NotificationLite.next(t11);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.value = NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.value = NotificationLite.error(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.value = NotificationLite.next(t11);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        MostRecentObserver mostRecentObserver = new MostRecentObserver(this.initialValue);
        this.source.subscribe(mostRecentObserver);
        return mostRecentObserver.getIterable();
    }

    public BlockingObservableMostRecent(ObservableSource<T> observableSource, T t11) {
        this.source = observableSource;
        this.initialValue = t11;
    }
}
