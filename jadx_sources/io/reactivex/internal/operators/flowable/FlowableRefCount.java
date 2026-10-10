package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    RefConnection connection;

    /* JADX INFO: renamed from: n */
    final int f87149n;
    final Scheduler scheduler;
    final ConnectableFlowable<T> source;
    final long timeout;
    final TimeUnit unit;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
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

        public RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final InterfaceC44417c<? super T> downstream;
        final FlowableRefCount<T> parent;
        InterfaceC44418d upstream;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.parent.terminated(this.connection);
                this.downstream.onError(th2);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        public RefCountSubscriber(InterfaceC44417c<? super T> interfaceC44417c, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = interfaceC44417c;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, TimeUnit.NANOSECONDS, null);
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

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
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
                if (refConnection.connected || j12 != this.f87149n) {
                    z11 = false;
                } else {
                    z11 = true;
                    refConnection.connected = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.source.subscribe((FlowableSubscriber) new RefCountSubscriber(interfaceC44417c, this, refConnection));
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
                    ConnectableFlowable<T> connectableFlowable = this.source;
                    if (connectableFlowable instanceof Disposable) {
                        ((Disposable) connectableFlowable).dispose();
                    } else if (connectableFlowable instanceof ResettableConnectable) {
                        ((ResettableConnectable) connectableFlowable).resetIf(refConnection.get());
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
                    ConnectableFlowable<T> connectableFlowable = this.source;
                    if (connectableFlowable instanceof Disposable) {
                        ((Disposable) connectableFlowable).dispose();
                    } else if (connectableFlowable instanceof ResettableConnectable) {
                        if (disposable == null) {
                            refConnection.disconnectedEarly = true;
                        } else {
                            ((ResettableConnectable) connectableFlowable).resetIf(disposable);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i11, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = connectableFlowable;
        this.f87149n = i11;
        this.timeout = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
