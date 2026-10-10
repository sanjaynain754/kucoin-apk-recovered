package io.reactivex.subjects;

import androidx.camera.view.C1454t;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class UnicastSubject<T> extends Subject<T> {
    final boolean delayError;
    volatile boolean disposed;
    volatile boolean done;
    final AtomicReference<Observer<? super T>> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final BasicIntQueueDisposable<T> wip;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.enableOperatorFusion = true;
            return 2;
        }

        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastSubject.this.queue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (UnicastSubject.this.disposed) {
                return;
            }
            UnicastSubject.this.disposed = true;
            UnicastSubject.this.doTerminate();
            UnicastSubject.this.downstream.lazySet(null);
            if (UnicastSubject.this.wip.getAndIncrement() == 0) {
                UnicastSubject.this.downstream.lazySet(null);
                UnicastSubject.this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return UnicastSubject.this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastSubject.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return UnicastSubject.this.queue.poll();
        }
    }

    public UnicastSubject(int i11, boolean z11) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i11, "capacityHint"));
        this.onTerminate = new AtomicReference<>();
        this.delayError = z11;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueDisposable();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create() {
        return new UnicastSubject<>(Observable.bufferSize(), true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i11) {
        return new UnicastSubject<>(i11, true);
    }

    public void doTerminate() {
        Runnable runnable = this.onTerminate.get();
        if (runnable == null || !C1454t.m2255a(this.onTerminate, runnable, null)) {
            return;
        }
        runnable.run();
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        Observer<? super T> observer = this.downstream.get();
        int iAddAndGet = 1;
        while (observer == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                observer = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(observer);
        } else {
            drainNormal(observer);
        }
    }

    public void drainFused(Observer<? super T> observer) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z11 = this.delayError;
        int iAddAndGet = 1;
        while (!this.disposed) {
            boolean z12 = this.done;
            if (!z11 && z12 && failedFast(spscLinkedArrayQueue, observer)) {
                return;
            }
            observer.onNext(null);
            if (z12) {
                errorOrComplete(observer);
                return;
            } else {
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.downstream.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    public void drainNormal(Observer<? super T> observer) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z11 = this.delayError;
        boolean z12 = true;
        int iAddAndGet = 1;
        while (!this.disposed) {
            boolean z13 = this.done;
            T tPoll = this.queue.poll();
            boolean z14 = tPoll == null;
            if (z13) {
                if (!z11 && z12) {
                    if (failedFast(spscLinkedArrayQueue, observer)) {
                        return;
                    } else {
                        z12 = false;
                    }
                }
                if (z14) {
                    errorOrComplete(observer);
                    return;
                }
            }
            if (z14) {
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                observer.onNext(tPoll);
            }
        }
        this.downstream.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    public void errorOrComplete(Observer<? super T> observer) {
        this.downstream.lazySet(null);
        Throwable th2 = this.error;
        if (th2 != null) {
            observer.onError(th2);
        } else {
            observer.onComplete();
        }
    }

    public boolean failedFast(SimpleQueue<T> simpleQueue, Observer<? super T> observer) {
        Throwable th2 = this.error;
        if (th2 == null) {
            return false;
        }
        this.downstream.lazySet(null);
        simpleQueue.clear();
        observer.onError(th2);
        return true;
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done || this.disposed) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.disposed) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.error = th2;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.disposed) {
            return;
        }
        this.queue.offer(t11);
        drain();
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.done || this.disposed) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.onSubscribe(this.wip);
        this.downstream.lazySet(observer);
        if (this.disposed) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i11, Runnable runnable) {
        return new UnicastSubject<>(i11, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i11, Runnable runnable, boolean z11) {
        return new UnicastSubject<>(i11, runnable, z11);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(boolean z11) {
        return new UnicastSubject<>(Observable.bufferSize(), z11);
    }

    public UnicastSubject(int i11, Runnable runnable) {
        this(i11, runnable, true);
    }

    public UnicastSubject(int i11, Runnable runnable, boolean z11) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i11, "capacityHint"));
        this.onTerminate = new AtomicReference<>(ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.delayError = z11;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueDisposable();
    }
}
