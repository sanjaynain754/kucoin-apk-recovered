package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableZip<T, R> extends Observable<R> {
    final int bufferSize;
    final boolean delayError;
    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final Observer<? super R> downstream;
        final ZipObserver<T, R>[] observers;
        final T[] row;
        final Function<? super Object[], ? extends R> zipper;

        public void cancelSources() {
            for (ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.dispose();
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, Observer<? super R> observer, boolean z13, ZipObserver<?, ?> zipObserver) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (z13) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = zipObserver.error;
                this.cancelled = true;
                cancel();
                if (th2 != null) {
                    observer.onError(th2);
                } else {
                    observer.onComplete();
                }
                return true;
            }
            Throwable th3 = zipObserver.error;
            if (th3 != null) {
                this.cancelled = true;
                cancel();
                observer.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            this.cancelled = true;
            cancel();
            observer.onComplete();
            return true;
        }

        public void clear() {
            for (ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear();
            }
        }

        public void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            ZipObserver<T, R>[] zipObserverArr = this.observers;
            Observer<? super R> observer = this.downstream;
            T[] tArr = this.row;
            boolean z11 = this.delayError;
            int iAddAndGet = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                for (ZipObserver<T, R> zipObserver : zipObserverArr) {
                    if (tArr[i12] == null) {
                        boolean z12 = zipObserver.done;
                        T tPoll = zipObserver.queue.poll();
                        boolean z13 = tPoll == null;
                        if (checkTerminated(z12, z13, observer, z11, zipObserver)) {
                            return;
                        }
                        if (z13) {
                            i11++;
                        } else {
                            tArr[i12] = tPoll;
                        }
                    } else if (zipObserver.done && !z11 && (th2 = zipObserver.error) != null) {
                        this.cancelled = true;
                        cancel();
                        observer.onError(th2);
                        return;
                    }
                    i12++;
                }
                if (i11 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        cancel();
                        observer.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr, int i11) {
            ZipObserver<T, R>[] zipObserverArr = this.observers;
            int length = zipObserverArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                zipObserverArr[i12] = new ZipObserver<>(this, i11);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i13 = 0; i13 < length && !this.cancelled; i13++) {
                observableSourceArr[i13].subscribe(zipObserverArr[i13]);
            }
        }

        public ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i11, boolean z11) {
            this.downstream = observer;
            this.zipper = function;
            this.observers = new ZipObserver[i11];
            this.row = (T[]) new Object[i11];
            this.delayError = z11;
        }

        public void cancel() {
            clear();
            cancelSources();
        }
    }

    public static final class ZipObserver<T, R> implements Observer<T> {
        volatile boolean done;
        Throwable error;
        final ZipCoordinator<T, R> parent;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void dispose() {
            DisposableHelper.dispose(this.upstream);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.queue.offer(t11);
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public ZipObserver(ZipCoordinator<T, R> zipCoordinator, int i11) {
            this.parent = zipCoordinator;
            this.queue = new SpscLinkedArrayQueue<>(i11);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new ZipCoordinator(observer, this.zipper, length, this.delayError).subscribe(observableSourceArr, this.bufferSize);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i11, boolean z11) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
