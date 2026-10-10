package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableFromIterable<T> extends Observable<T> {
    final Iterable<? extends T> source;

    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {
        boolean checkNext;
        volatile boolean disposed;
        boolean done;
        final Observer<? super T> downstream;
        boolean fusionMode;

        /* JADX INFO: renamed from: it */
        final Iterator<? extends T> f87177it;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.done = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.done;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            if (this.done) {
                return null;
            }
            if (!this.checkNext) {
                this.checkNext = true;
            } else if (!this.f87177it.hasNext()) {
                this.done = true;
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.f87177it.next(), "The iterator returned a null value");
        }

        public FromIterableDisposable(Observer<? super T> observer, Iterator<? extends T> it) {
            this.downstream = observer;
            this.f87177it = it;
        }

        public void run() {
            while (!getDisposed()) {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.f87177it.next(), "The iterator returned a null value"));
                    if (!getDisposed()) {
                        try {
                            if (!this.f87177it.hasNext()) {
                                if (!getDisposed()) {
                                    this.downstream.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.downstream.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.downstream.onError(th3);
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<? extends T> it = this.source.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it);
                observer.onSubscribe(fromIterableDisposable);
                if (fromIterableDisposable.fusionMode) {
                    return;
                }
                fromIterableDisposable.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }
}
