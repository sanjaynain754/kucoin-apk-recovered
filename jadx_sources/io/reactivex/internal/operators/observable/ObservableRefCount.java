package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableRefCount<T> extends Observable<T> {
    RefConnection connection;

    /* JADX INFO: renamed from: n */
    final int f87179n;
    final Scheduler scheduler;
    final ConnectableObservable<T> source;
    final long timeout;
    final TimeUnit unit;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final ObservableRefCount<?> parent;
        long subscriberCount;
        Disposable timer;

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        ((ResettableConnectable) this.parent.source).resetIf(disposable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }

        public RefConnection(ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final Observer<? super T> downstream;
        final ObservableRefCount<T> parent;
        Disposable upstream;

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.parent.terminated(this.connection);
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream.getDisposed();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public RefCountObserver(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = observer;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public void cancel(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    long j11 = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j11;
                    if (j11 == 0 && refConnection.connected) {
                        if (this.timeout == 0) {
                            timeout(refConnection);
                            return;
                        }
                        SequentialDisposable sequentialDisposable = new SequentialDisposable();
                        refConnection.timer = sequentialDisposable;
                        sequentialDisposable.replace(this.scheduler.scheduleDirect(refConnection, this.timeout, this.unit));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        RefConnection refConnection;
        boolean z11;
        Disposable disposable;
        synchronized (this) {
            try {
                refConnection = this.connection;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.connection = refConnection;
                }
                long j11 = refConnection.subscriberCount;
                if (j11 == 0 && (disposable = refConnection.timer) != null) {
                    disposable.dispose();
                }
                long j12 = j11 + 1;
                refConnection.subscriberCount = j12;
                if (refConnection.connected || j12 != this.f87179n) {
                    z11 = false;
                } else {
                    z11 = true;
                    refConnection.connected = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.source.subscribe(new RefCountObserver(observer, this, refConnection));
        if (z11) {
            this.source.connect(refConnection);
        }
    }

    public void terminated(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    this.connection = null;
                    Disposable disposable = refConnection.timer;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
                long j11 = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j11;
                if (j11 == 0) {
                    ConnectableObservable<T> connectableObservable = this.source;
                    if (connectableObservable instanceof Disposable) {
                        ((Disposable) connectableObservable).dispose();
                    } else if (connectableObservable instanceof ResettableConnectable) {
                        ((ResettableConnectable) connectableObservable).resetIf(refConnection.get());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void timeout(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                    this.connection = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.dispose(refConnection);
                    ConnectableObservable<T> connectableObservable = this.source;
                    if (connectableObservable instanceof Disposable) {
                        ((Disposable) connectableObservable).dispose();
                    } else if (connectableObservable instanceof ResettableConnectable) {
                        if (disposable == null) {
                            refConnection.disconnectedEarly = true;
                        } else {
                            ((ResettableConnectable) connectableObservable).resetIf(disposable);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = connectableObservable;
        this.f87179n = i11;
        this.timeout = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
