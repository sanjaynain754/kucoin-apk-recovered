package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableConcat extends Completable {
    final int prefetch;
    final InterfaceC44416b<? extends CompletableSource> sources;

    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        private static final long serialVersionUID = 9032184911934499404L;
        volatile boolean active;
        int consumed;
        volatile boolean done;
        final CompletableObserver downstream;
        final int limit;
        final int prefetch;
        SimpleQueue<CompletableSource> queue;
        int sourceFused;
        InterfaceC44418d upstream;
        final ConcatInnerObserver inner = new ConcatInnerObserver(this);
        final AtomicBoolean once = new AtomicBoolean();

        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -5454794857847146511L;
            final CompletableConcatSubscriber parent;

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.innerError(th2);
            }

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.parent = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.inner);
        }

        public void innerError(Throwable th2) {
            if (!this.once.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.upstream.cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(this.inner.get());
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.once.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.inner);
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(CompletableSource completableSource) {
            if (this.sourceFused != 0 || this.queue.offer(completableSource)) {
                drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                int i11 = this.prefetch;
                long j11 = i11 == Integer.MAX_VALUE ? Long.MAX_VALUE : i11;
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceFused = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceFused = iRequestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        interfaceC44418d.request(j11);
                        return;
                    }
                }
                if (this.prefetch == Integer.MAX_VALUE) {
                    this.queue = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.queue = new SpscArrayQueue(this.prefetch);
                }
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(j11);
            }
        }

        public void request() {
            if (this.sourceFused != 1) {
                int i11 = this.consumed + 1;
                if (i11 != this.limit) {
                    this.consumed = i11;
                } else {
                    this.consumed = 0;
                    this.upstream.request(i11);
                }
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver, int i11) {
            this.downstream = completableObserver;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                while (!getDisposed()) {
                    if (!this.active) {
                        boolean z12 = this.done;
                        try {
                            CompletableSource completableSourcePoll = this.queue.poll();
                            if (completableSourcePoll == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z12 && z11) {
                                if (this.once.compareAndSet(false, true)) {
                                    this.downstream.onComplete();
                                    return;
                                }
                                return;
                            } else if (!z11) {
                                this.active = true;
                                completableSourcePoll.subscribe(this.inner);
                                request();
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            innerError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.sources.subscribe(new CompletableConcatSubscriber(completableObserver, this.prefetch));
    }

    public CompletableConcat(InterfaceC44416b<? extends CompletableSource> interfaceC44416b, int i11) {
        this.sources = interfaceC44416b;
        this.prefetch = i11;
    }
}
