package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean delayErrors;
    final Function<? super T, ? extends CompletableSource> mapper;
    final int maxConcurrency;

    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final InterfaceC44417c<? super T> downstream;
        final Function<? super T, ? extends CompletableSource> mapper;
        final int maxConcurrency;
        InterfaceC44418d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final CompositeDisposable set = new CompositeDisposable();

        public final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerConsumer() {
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapCompletableMainSubscriber.this.innerComplete(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                FlatMapCompletableMainSubscriber.this.innerError(this, th2);
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: isDisposed */
            public boolean getDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return null;
        }

        public void innerComplete(FlatMapCompletableMainSubscriber<T>.InnerConsumer innerConsumer) {
            this.set.delete(innerConsumer);
            onComplete();
        }

        public void innerError(FlatMapCompletableMainSubscriber<T>.InnerConsumer innerConsumer, Throwable th2) {
            this.set.delete(innerConsumer);
            onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.downstream.onError(this.errors.terminate());
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (this.cancelled || !this.set.add(innerConsumer)) {
                    return;
                }
                completableSource.subscribe(innerConsumer);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                int i11 = this.maxConcurrency;
                if (i11 == Integer.MAX_VALUE) {
                    interfaceC44418d.request(Long.MAX_VALUE);
                } else {
                    interfaceC44418d.request(i11);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return i11 & 2;
        }

        public FlatMapCompletableMainSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super T, ? extends CompletableSource> function, boolean z11, int i11) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.delayErrors = z11;
            this.maxConcurrency = i11;
            lazySet(1);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate != null) {
                    this.downstream.onError(thTerminate);
                    return;
                } else {
                    this.downstream.onComplete();
                    return;
                }
            }
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new FlatMapCompletableMainSubscriber(interfaceC44417c, this.mapper, this.delayErrors, this.maxConcurrency));
    }

    public FlowableFlatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z11, int i11) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z11;
        this.maxConcurrency = i11;
    }
}
