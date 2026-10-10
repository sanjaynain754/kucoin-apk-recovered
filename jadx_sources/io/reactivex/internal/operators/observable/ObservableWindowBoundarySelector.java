package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int bufferSize;
    final Function<? super B, ? extends ObservableSource<V>> close;
    final ObservableSource<B> open;

    public static final class OperatorWindowBoundaryCloseObserver<T, V> extends DisposableObserver<V> {
        boolean done;
        final WindowBoundaryMainObserver<T, ?, V> parent;

        /* JADX INFO: renamed from: w */
        final UnicastSubject<T> f87187w;

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.parent.error(th2);
            }
        }

        public OperatorWindowBoundaryCloseObserver(WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver, UnicastSubject<T> unicastSubject) {
            this.parent = windowBoundaryMainObserver;
            this.f87187w = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public void onNext(V v11) {
            dispose();
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenObserver<T, B> extends DisposableObserver<B> {
        final WindowBoundaryMainObserver<T, B, ?> parent;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.parent.error(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(B b11) {
            this.parent.open(b11);
        }

        public OperatorWindowBoundaryOpenObserver(WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }
    }

    public static final class WindowBoundaryMainObserver<T, B, V> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        final AtomicReference<Disposable> boundary;
        final int bufferSize;
        final Function<? super B, ? extends ObservableSource<V>> close;
        final ObservableSource<B> open;
        final CompositeDisposable resources;
        final AtomicBoolean stopWindows;
        Disposable upstream;
        final AtomicLong windows;

        /* JADX INFO: renamed from: ws */
        final List<UnicastSubject<T>> f87188ws;

        public WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, ObservableSource<B> observableSource, Function<? super B, ? extends ObservableSource<V>> function, int i11) {
            super(observer, new MpscLinkedQueue());
            this.boundary = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.windows = atomicLong;
            this.stopWindows = new AtomicBoolean();
            this.open = observableSource;
            this.close = function;
            this.bufferSize = i11;
            this.resources = new CompositeDisposable();
            this.f87188ws = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void close(OperatorWindowBoundaryCloseObserver<T, V> operatorWindowBoundaryCloseObserver) {
            this.resources.delete(operatorWindowBoundaryCloseObserver);
            this.queue.offer((U) new WindowOperation(operatorWindowBoundaryCloseObserver.f87187w, null));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.boundary);
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        public void disposeBoundary() {
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.f87188ws;
            int iLeave = 1;
            while (true) {
                boolean z11 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z12 = objPoll == null;
                if (z11 && z12) {
                    disposeBoundary();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z12) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) objPoll;
                    UnicastSubject<T> unicastSubject = windowOperation.f87189w;
                    if (unicastSubject != null) {
                        if (list.remove(unicastSubject)) {
                            windowOperation.f87189w.onComplete();
                            if (this.windows.decrementAndGet() == 0) {
                                disposeBoundary();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.stopWindows.get()) {
                        UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.bufferSize);
                        list.add(unicastSubjectCreate);
                        observer.onNext(unicastSubjectCreate);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The ObservableSource supplied is null");
                            OperatorWindowBoundaryCloseObserver operatorWindowBoundaryCloseObserver = new OperatorWindowBoundaryCloseObserver(this, unicastSubjectCreate);
                            if (this.resources.add(operatorWindowBoundaryCloseObserver)) {
                                this.windows.getAndIncrement();
                                observableSource.subscribe(operatorWindowBoundaryCloseObserver);
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.stopWindows.set(true);
                            observer.onError(th3);
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void error(Throwable th2) {
            this.upstream.dispose();
            this.resources.dispose();
            onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.stopWindows.get();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.stopWindows.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenObserver operatorWindowBoundaryOpenObserver = new OperatorWindowBoundaryOpenObserver(this);
                if (C1454t.m2255a(this.boundary, null, operatorWindowBoundaryOpenObserver)) {
                    this.open.subscribe(operatorWindowBoundaryOpenObserver);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void open(B b11) {
            this.queue.offer((U) new WindowOperation(null, b11));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (fastEnter()) {
                Iterator<UnicastSubject<T>> it = this.f87188ws.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t11);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t11));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public void accept(Observer<? super Observable<T>> observer, Object obj) {
        }
    }

    public static final class WindowOperation<T, B> {
        final B open;

        /* JADX INFO: renamed from: w */
        final UnicastSubject<T> f87189w;

        public WindowOperation(UnicastSubject<T> unicastSubject, B b11) {
            this.f87189w = unicastSubject;
            this.open = b11;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new WindowBoundaryMainObserver(new SerializedObserver(observer), this.open, this.close, this.bufferSize));
    }

    public ObservableWindowBoundarySelector(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i11) {
        super(observableSource);
        this.open = observableSource2;
        this.close = function;
        this.bufferSize = i11;
    }
}
