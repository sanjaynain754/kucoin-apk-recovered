package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
    final int maxConcurrency;

    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;

        /* JADX INFO: renamed from: id */
        final long f87176id;
        final MergeObserver<T, U> parent;
        volatile SimpleQueue<U> queue;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.parent.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (!mergeObserver.delayErrors) {
                mergeObserver.disposeAll();
            }
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(U u11) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u11, this);
            } else {
                this.parent.drain();
            }
        }

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j11) {
            this.f87176id = j11;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueDisposable;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile SimplePlainQueue<U> queue;
        Queue<ObservableSource<? extends U>> sources;
        long uniqueId;
        Disposable upstream;
        int wip;
        static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        public boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    SimplePlainQueue<U> spscLinkedArrayQueue = this.queue;
                    if (spscLinkedArrayQueue == null) {
                        spscLinkedArrayQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = spscLinkedArrayQueue;
                    }
                    if (!spscLinkedArrayQueue.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.errors.addThrowable(th2);
                drain();
                return true;
            }
        }

        public boolean addInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!C1454t.m2255a(this.observers, innerObserverArr, innerObserverArr2));
            return true;
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th2 = this.errors.get();
            if (this.delayErrors || th2 == null) {
                return false;
            }
            disposeAll();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Throwable thTerminate;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!disposeAll() || (thTerminate = this.errors.terminate()) == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        public boolean disposeAll() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:120:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[PHI: r4
          0x00f8: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:71:0x00d7, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            int size;
            boolean z11;
            Observer<? super U> observer = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                if (simplePlainQueue != null) {
                    while (!checkTerminate()) {
                        U uPoll = simplePlainQueue.poll();
                        if (uPoll != null) {
                            observer.onNext(uPoll);
                        }
                    }
                    return;
                }
                boolean z12 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                int i11 = 0;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.sources.size();
                    }
                } else {
                    size = 0;
                }
                if (z12 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j11 = this.lastId;
                    int i12 = this.lastIndex;
                    if (length <= i12 || innerObserverArr[i12].f87176id != j11) {
                        if (length <= i12) {
                            i12 = 0;
                        }
                        for (int i13 = 0; i13 < length && innerObserverArr[i12].f87176id != j11; i13++) {
                            i12++;
                            if (i12 == length) {
                                i12 = 0;
                            }
                        }
                        this.lastIndex = i12;
                        this.lastId = innerObserverArr[i12].f87176id;
                    }
                    int i14 = 0;
                    for (int i15 = 0; i15 < length; i15++) {
                        if (checkTerminate()) {
                            return;
                        }
                        InnerObserver<T, U> innerObserver = innerObserverArr[i12];
                        SimpleQueue<U> simpleQueue = innerObserver.queue;
                        if (simpleQueue != null) {
                            do {
                                try {
                                    U uPoll2 = simpleQueue.poll();
                                    if (uPoll2 == null) {
                                        z11 = innerObserver.done;
                                        SimpleQueue<U> simpleQueue2 = innerObserver.queue;
                                        if (z11 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                            removeInner(innerObserver);
                                            if (checkTerminate()) {
                                                return;
                                            } else {
                                                i14++;
                                            }
                                        }
                                        i12++;
                                        if (i12 == length) {
                                            i12 = 0;
                                        }
                                    } else {
                                        observer.onNext(uPoll2);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    innerObserver.dispose();
                                    this.errors.addThrowable(th2);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    removeInner(innerObserver);
                                    i14++;
                                    i12++;
                                    if (i12 == length) {
                                    }
                                }
                            } while (!checkTerminate());
                            return;
                        }
                        z11 = innerObserver.done;
                        SimpleQueue<U> simpleQueue3 = innerObserver.queue;
                        if (z11) {
                            removeInner(innerObserver);
                            if (checkTerminate()) {
                                return;
                            } else {
                                i14++;
                            }
                        }
                        i12++;
                        if (i12 == length) {
                            i12 = 0;
                        }
                    }
                    this.lastIndex = i12;
                    this.lastId = innerObserverArr[i12].f87176id;
                    i11 = i14;
                }
                if (i11 == 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    while (true) {
                        int i16 = i11 - 1;
                        if (i11 != 0) {
                            synchronized (this) {
                                try {
                                    ObservableSource<? extends U> observableSourcePoll = this.sources.poll();
                                    if (observableSourcePoll == null) {
                                        this.wip--;
                                    } else {
                                        subscribeInner(observableSourcePoll);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            i11 = i16;
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i11 = this.wip;
                            if (i11 == this.maxConcurrency) {
                                this.sources.offer(observableSource);
                                return;
                            }
                            this.wip = i11 + 1;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                subscribeInner(observableSource);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.upstream.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (innerObserverArr[i11] == innerObserver) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i11);
                    System.arraycopy(innerObserverArr, i11 + 1, innerObserverArr3, i11, (length - i11) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!C1454t.m2255a(this.observers, innerObserverArr, innerObserverArr2));
        }

        public void subscribeInner(ObservableSource<? extends U> observableSource) {
            boolean z11;
            while (observableSource instanceof Callable) {
                if (!tryEmitScalar((Callable) observableSource) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        observableSource = this.sources.poll();
                        if (observableSource == null) {
                            z11 = true;
                            this.wip--;
                        } else {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z11) {
                    drain();
                    return;
                }
            }
            long j11 = this.uniqueId;
            this.uniqueId = 1 + j11;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j11);
            if (addInner(innerObserver)) {
                observableSource.subscribe(innerObserver);
            }
        }

        public MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z11, int i11, int i12) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z11;
            this.maxConcurrency = i11;
            this.bufferSize = i12;
            if (i11 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i11);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void tryEmit(U u11, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u11);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = innerObserver.queue;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(this.bufferSize);
                    innerObserver.queue = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(u11);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new MergeObserver(observer, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z11, int i11, int i12) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z11;
        this.maxConcurrency = i11;
        this.bufferSize = i12;
    }
}
