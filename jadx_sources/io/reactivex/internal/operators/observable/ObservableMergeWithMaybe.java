package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0006b;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableMergeWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {
    final MaybeSource<? extends T> other;

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        volatile boolean mainDone;
        volatile int otherState;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t11) {
                this.parent.otherSuccess(t11);
            }

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t11);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t11);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void otherComplete() {
            this.otherState = 2;
            drain();
        }

        public void otherSuccess(T t11) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t11);
                this.otherState = 2;
            } else {
                this.singleItem = t11;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void drainLoop() {
            Observer<? super T> observer = this.downstream;
            int iAddAndGet = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    observer.onError(this.error.terminate());
                    return;
                }
                int i11 = this.otherState;
                if (i11 == 1) {
                    T t11 = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    observer.onNext(t11);
                    i11 = 2;
                }
                boolean z11 = this.mainDone;
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                C0006b c0006bPoll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                boolean z12 = c0006bPoll == null;
                if (z11 && z12 && i11 == 2) {
                    this.queue = null;
                    observer.onComplete();
                    return;
                } else if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(c0006bPoll);
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        public SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
            this.queue = spscLinkedArrayQueue;
            return spscLinkedArrayQueue;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.mainDisposable, disposable);
        }

        public void otherError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
            }
        }

        public MergeWithObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.source.subscribe(mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }

    public ObservableMergeWithMaybe(Observable<T> observable, MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.other = maybeSource;
    }
}
