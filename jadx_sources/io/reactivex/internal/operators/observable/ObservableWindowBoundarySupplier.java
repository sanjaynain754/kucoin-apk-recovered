package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int capacityHint;
    final Callable<? extends ObservableSource<B>> other;

    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {
        boolean done;
        final WindowBoundaryMainObserver<T, B> parent;

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.parent.innerError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(B b11) {
            if (this.done) {
                return;
            }
            this.done = true;
            dispose();
            this.parent.innerNext(this);
        }

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }
    }

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        static final WindowBoundaryInnerObserver<Object, Object> BOUNDARY_DISPOSED = new WindowBoundaryInnerObserver<>(null);
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final Observer<? super Observable<T>> downstream;
        final Callable<? extends ObservableSource<B>> other;
        Disposable upstream;
        UnicastSubject<T> window;
        final AtomicReference<WindowBoundaryInnerObserver<T, B>> boundaryObserver = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        public void disposeBoundary() {
            AtomicReference<WindowBoundaryInnerObserver<T, B>> atomicReference = this.boundaryObserver;
            WindowBoundaryInnerObserver<Object, Object> windowBoundaryInnerObserver = BOUNDARY_DISPOSED;
            WindowBoundaryInnerObserver<T, B> andSet = atomicReference.getAndSet((WindowBoundaryInnerObserver<T, B>) windowBoundaryInnerObserver);
            if (andSet == null || andSet == windowBoundaryInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            this.upstream.dispose();
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext(WindowBoundaryInnerObserver<T, B> windowBoundaryInnerObserver) {
            C1454t.m2255a(this.boundaryObserver, windowBoundaryInnerObserver, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.stopWindows.get();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.queue.offer(t11);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        public WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, int i11, Callable<? extends ObservableSource<B>> callable) {
            this.downstream = observer;
            this.capacityHint = i11;
            this.other = callable;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                Observer<? super Observable<T>> observer = this.downstream;
                MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int iAddAndGet = 1;
                while (this.windows.get() != 0) {
                    UnicastSubject<T> unicastSubject = this.window;
                    boolean z12 = this.done;
                    if (z12 && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(thTerminate);
                        }
                        observer.onError(thTerminate);
                        return;
                    }
                    Object objPoll = mpscLinkedQueue.poll();
                    if (objPoll == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z11) {
                        Throwable thTerminate2 = atomicThrowable.terminate();
                        if (thTerminate2 == null) {
                            if (unicastSubject != null) {
                                this.window = null;
                                unicastSubject.onComplete();
                            }
                            observer.onComplete();
                            return;
                        }
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(thTerminate2);
                        }
                        observer.onError(thTerminate2);
                        return;
                    }
                    if (z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (objPoll != NEXT_WINDOW) {
                        unicastSubject.onNext((T) objPoll);
                    } else {
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.capacityHint, this);
                            this.window = unicastSubjectCreate;
                            this.windows.getAndIncrement();
                            try {
                                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null ObservableSource");
                                WindowBoundaryInnerObserver windowBoundaryInnerObserver = new WindowBoundaryInnerObserver(this);
                                if (C1454t.m2255a(this.boundaryObserver, null, windowBoundaryInnerObserver)) {
                                    observableSource.subscribe(windowBoundaryInnerObserver);
                                    observer.onNext(unicastSubjectCreate);
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                atomicThrowable.addThrowable(th2);
                                this.done = true;
                            }
                        }
                    }
                }
                mpscLinkedQueue.clear();
                this.window = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            disposeBoundary();
            if (this.errors.addThrowable(th2)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new WindowBoundaryMainObserver(observer, this.capacityHint, this.other));
    }

    public ObservableWindowBoundarySupplier(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, int i11) {
        super(observableSource);
        this.other = callable;
        this.capacityHint = i11;
    }
}
