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
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0006b;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final SwitchMapObserver<T, R> parent;
        volatile SimpleQueue<R> queue;

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.parent.innerError(this, th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r11) {
            if (this.index == this.parent.unique) {
                if (r11 != null) {
                    this.queue.offer(r11);
                }
                this.parent.drain();
            }
        }

        public SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j11, int i11) {
            this.parent = switchMapObserver;
            this.index = j11;
            this.bufferSize = i11;
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.queue = queueDisposable;
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapInnerObserver<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        volatile long unique;
        Disposable upstream;
        final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            CANCELLED = switchMapInnerObserver;
            switchMapInnerObserver.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        public void disposeInner() {
            SwitchMapInnerObserver<T, R> andSet;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.active.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver2 = CANCELLED;
            if (switchMapInnerObserver == switchMapInnerObserver2 || (andSet = this.active.getAndSet((SwitchMapInnerObserver<T, R>) switchMapInnerObserver2)) == switchMapInnerObserver2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        public void innerError(SwitchMapInnerObserver<T, R> switchMapInnerObserver, Throwable th2) {
            if (switchMapInnerObserver.index != this.unique || !this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
            }
            switchMapInnerObserver.done = true;
            drain();
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
            if (this.done || !this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j11 = this.unique + 1;
            this.unique = j11;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            if (switchMapInnerObserver2 != null) {
                switchMapInnerObserver2.cancel();
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The ObservableSource returned is null");
                SwitchMapInnerObserver switchMapInnerObserver3 = new SwitchMapInnerObserver(this, j11, this.bufferSize);
                do {
                    switchMapInnerObserver = this.active.get();
                    if (switchMapInnerObserver == CANCELLED) {
                        return;
                    }
                } while (!C1454t.m2255a(this.active, switchMapInnerObserver, switchMapInnerObserver3));
                observableSource.subscribe(switchMapInnerObserver3);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public SwitchMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i11, boolean z11) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i11;
            this.delayErrors = z11;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0010 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x00ee A[SYNTHETIC] */
        public void drain() {
            SimpleQueue<R> simpleQueue;
            C0006b c0006bPoll;
            boolean z11;
            boolean z12;
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
                boolean z13 = this.delayErrors;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (this.done) {
                        if (atomicReference.get() == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z13) {
                            if (z12) {
                                Throwable th2 = this.errors.get();
                                if (th2 != null) {
                                    observer.onError(th2);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        } else if (this.errors.get() != null) {
                            observer.onError(this.errors.terminate());
                            return;
                        } else if (z12) {
                            observer.onComplete();
                            return;
                        }
                    }
                    SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                    if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.queue) != null) {
                        if (switchMapInnerObserver.done) {
                            boolean zIsEmpty = simpleQueue.isEmpty();
                            if (z13) {
                                if (zIsEmpty) {
                                    C1454t.m2255a(atomicReference, switchMapInnerObserver, null);
                                }
                            } else if (this.errors.get() != null) {
                                observer.onError(this.errors.terminate());
                                return;
                            } else if (zIsEmpty) {
                                C1454t.m2255a(atomicReference, switchMapInnerObserver, null);
                            }
                        }
                        boolean z14 = false;
                        while (!this.cancelled) {
                            if (switchMapInnerObserver == atomicReference.get()) {
                                if (!z13 && this.errors.get() != null) {
                                    observer.onError(this.errors.terminate());
                                    return;
                                }
                                boolean z15 = switchMapInnerObserver.done;
                                try {
                                    c0006bPoll = simpleQueue.poll();
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.errors.addThrowable(th3);
                                    C1454t.m2255a(atomicReference, switchMapInnerObserver, null);
                                    if (!z13) {
                                        disposeInner();
                                        this.upstream.dispose();
                                        this.done = true;
                                    } else {
                                        switchMapInnerObserver.cancel();
                                    }
                                    z14 = true;
                                    c0006bPoll = null;
                                }
                                if (c0006bPoll == null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z15 && z11) {
                                    C1454t.m2255a(atomicReference, switchMapInnerObserver, null);
                                } else if (!z11) {
                                    observer.onNext(c0006bPoll);
                                }
                                if (z14) {
                                    continue;
                                }
                            }
                            z14 = true;
                            if (z14) {
                                continue;
                            }
                        }
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new SwitchMapObserver(observer, this.mapper, this.bufferSize, this.delayErrors));
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i11, boolean z11) {
        super(observableSource);
        this.mapper = function;
        this.bufferSize = i11;
        this.delayErrors = z11;
    }
}
