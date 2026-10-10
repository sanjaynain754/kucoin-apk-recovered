package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableMerge extends Completable {
    final boolean delayErrors;
    final int maxConcurrency;
    final InterfaceC44416b<? extends CompletableSource> source;

    public static final class CompletableMergeSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        private static final long serialVersionUID = -2108443387387077490L;
        final boolean delayErrors;
        final CompletableObserver downstream;
        final int maxConcurrency;
        InterfaceC44418d upstream;
        final CompositeDisposable set = new CompositeDisposable();
        final AtomicThrowable error = new AtomicThrowable();

        public final class MergeInnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 251330541679988317L;

            public MergeInnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                CompletableMergeSubscriber.this.innerComplete(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                CompletableMergeSubscriber.this.innerError(this, th2);
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

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.set.dispose();
        }

        public void innerComplete(MergeInnerObserver mergeInnerObserver) {
            this.set.delete(mergeInnerObserver);
            if (decrementAndGet() != 0) {
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1L);
                }
            } else {
                Throwable th2 = this.error.get();
                if (th2 != null) {
                    this.downstream.onError(th2);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public void innerError(MergeInnerObserver mergeInnerObserver, Throwable th2) {
            this.set.delete(mergeInnerObserver);
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
                if (!this.error.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    if (getAndSet(0) > 0) {
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    return;
                }
            }
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(this.error.terminate());
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.set.getDisposed();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.delayErrors) {
                if (!this.error.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    if (decrementAndGet() == 0) {
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    return;
                }
            }
            this.set.dispose();
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else if (getAndSet(0) > 0) {
                this.downstream.onError(this.error.terminate());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(CompletableSource completableSource) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.set.add(mergeInnerObserver);
            completableSource.subscribe(mergeInnerObserver);
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

        public CompletableMergeSubscriber(CompletableObserver completableObserver, int i11, boolean z11) {
            this.downstream = completableObserver;
            this.maxConcurrency = i11;
            this.delayErrors = z11;
            lazySet(1);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.error.get() != null) {
                    this.downstream.onError(this.error.terminate());
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new CompletableMergeSubscriber(completableObserver, this.maxConcurrency, this.delayErrors));
    }

    public CompletableMerge(InterfaceC44416b<? extends CompletableSource> interfaceC44416b, int i11, boolean z11) {
        this.source = interfaceC44416b;
        this.maxConcurrency = i11;
        this.delayErrors = z11;
    }
}
