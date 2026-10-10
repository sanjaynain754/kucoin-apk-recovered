package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends Flowable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final MaybeSource<T> source;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final InterfaceC44417c<? super R> downstream;

        /* JADX INFO: renamed from: it */
        volatile Iterator<? extends R> f87165it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f87165it = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public void fastPath(InterfaceC44417c<? super R> interfaceC44417c, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    interfaceC44417c.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        interfaceC44417c.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    interfaceC44417c.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f87165it == null;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            try {
                Iterator<? extends R> it = this.mapper.apply(t11).iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                } else {
                    this.f87165it = it;
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f87165it;
            if (it == null) {
                return null;
            }
            R r11 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f87165it = null;
            }
            return r11;
        }

        public FlatMapIterableObserver(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
                Iterator<? extends R> it = this.f87165it;
                if (this.outputFused && it != null) {
                    interfaceC44417c.onNext(null);
                    interfaceC44417c.onComplete();
                    return;
                }
                int iAddAndGet = 1;
                while (true) {
                    if (it != null) {
                        long j11 = this.requested.get();
                        if (j11 == Long.MAX_VALUE) {
                            fastPath(interfaceC44417c, it);
                            return;
                        }
                        long j12 = 0;
                        while (j12 != j11) {
                            if (!this.cancelled) {
                                try {
                                    interfaceC44417c.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                                    if (!this.cancelled) {
                                        j12++;
                                        try {
                                            if (!it.hasNext()) {
                                                interfaceC44417c.onComplete();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            interfaceC44417c.onError(th2);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    interfaceC44417c.onError(th3);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (j12 != 0) {
                            BackpressureHelper.produced(this.requested, j12);
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                    if (it == null) {
                        it = this.f87165it;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe(new FlatMapIterableObserver(interfaceC44417c, this.mapper));
    }

    public MaybeFlatMapIterableFlowable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }
}
