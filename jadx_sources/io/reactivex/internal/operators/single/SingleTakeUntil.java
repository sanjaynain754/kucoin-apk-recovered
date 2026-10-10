package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {
    final InterfaceC44416b<U> other;
    final SingleSource<T> source;

    public static final class TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -622603812305745221L;
        final SingleObserver<? super T> downstream;
        final TakeUntilOtherSubscriber other = new TakeUntilOtherSubscriber(this);

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.other.dispose();
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t11) {
            this.other.dispose();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t11);
            }
        }

        public TakeUntilMainObserver(SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            this.other.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void otherError(Throwable th2) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper && (andSet = getAndSet(disposableHelper)) != disposableHelper) {
                if (andSet != null) {
                    andSet.dispose();
                }
                this.downstream.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final TakeUntilMainObserver<?> parent;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.otherError(th2);
        }

        public TakeUntilOtherSubscriber(TakeUntilMainObserver<?> takeUntilMainObserver) {
            this.parent = takeUntilMainObserver;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            InterfaceC44418d interfaceC44418d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(singleObserver);
        singleObserver.onSubscribe(takeUntilMainObserver);
        this.other.subscribe(takeUntilMainObserver.other);
        this.source.subscribe(takeUntilMainObserver);
    }

    public SingleTakeUntil(SingleSource<T> singleSource, InterfaceC44416b<U> interfaceC44416b) {
        this.source = singleSource;
        this.other = interfaceC44416b;
    }
}
