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
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayError;
    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;

    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final LatestCoordinator<T, R> parent;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.parent.innerNext(this.index, t11);
        }

        public CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i11) {
            this.parent = latestCoordinator;
            this.index = i11;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final CombinerObserver<T, R>[] observers;
        final SpscLinkedArrayQueue<Object[]> queue;

        public void clear(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.latest = null;
            }
            spscLinkedArrayQueue.clear();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        public void innerComplete(int i11) {
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    boolean z11 = objArr[i11] == null;
                    if (z11) {
                        this.done = true;
                    } else {
                        int i12 = this.complete + 1;
                        this.complete = i12;
                        if (i12 == objArr.length) {
                            this.done = true;
                        }
                    }
                    if (z11) {
                        cancelSources();
                    }
                    drain();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void innerNext(int i11, T t11) {
            boolean z11;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i11];
                    int i12 = this.active;
                    if (obj == null) {
                        i12++;
                        this.active = i12;
                    }
                    objArr[i11] = t11;
                    if (i12 == objArr.length) {
                        this.queue.offer((Object[]) objArr.clone());
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        drain();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
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
                clear(this.queue);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:31:0x000e }] */
        public void innerError(int i11, Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            boolean z11 = true;
            if (this.delayError) {
                synchronized (this) {
                    try {
                        Object[] objArr = this.latest;
                        if (objArr == null) {
                            return;
                        }
                        boolean z12 = objArr[i11] == null;
                        if (z12) {
                            this.done = true;
                        } else {
                            int i12 = this.complete + 1;
                            this.complete = i12;
                            if (i12 == objArr.length) {
                                this.done = true;
                            }
                        }
                        z11 = z12;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            if (z11) {
                cancelSources();
            }
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i11 = 0; i11 < length && !this.done && !this.cancelled; i11++) {
                observableSourceArr[i11].subscribe(combinerObserverArr[i11]);
            }
        }

        public LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i11, int i12, boolean z11) {
            this.downstream = observer;
            this.combiner = function;
            this.delayError = z11;
            this.latest = new Object[i11];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                combinerObserverArr[i13] = new CombinerObserver<>(this, i13);
            }
            this.observers = combinerObserverArr;
            this.queue = new SpscLinkedArrayQueue<>(i12);
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.queue;
                Observer<? super R> observer = this.downstream;
                boolean z12 = this.delayError;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (!z12 && this.errors.get() != null) {
                        cancelSources();
                        clear(spscLinkedArrayQueue);
                        observer.onError(this.errors.terminate());
                        return;
                    }
                    boolean z13 = this.done;
                    Object[] objArrPoll = spscLinkedArrayQueue.poll();
                    if (objArrPoll == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z13 && z11) {
                        clear(spscLinkedArrayQueue);
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(thTerminate);
                            return;
                        }
                    }
                    if (z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        try {
                            observer.onNext((Object) ObjectHelper.requireNonNull(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.errors.addThrowable(th2);
                            cancelSources();
                            clear(spscLinkedArrayQueue);
                            observer.onError(this.errors.terminate());
                            return;
                        }
                    }
                }
                clear(spscLinkedArrayQueue);
            }
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
        int i11 = length;
        if (i11 == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new LatestCoordinator(observer, this.combiner, i11, this.bufferSize, this.delayError).subscribe(observableSourceArr);
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i11, boolean z11) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.combiner = function;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
