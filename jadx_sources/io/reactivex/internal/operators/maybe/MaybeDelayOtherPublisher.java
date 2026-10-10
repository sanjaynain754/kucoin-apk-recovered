package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {
    final InterfaceC44416b<U> other;

    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {
        final OtherSubscriber<T> other;
        final InterfaceC44416b<U> otherSource;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.other.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            subscribeNext();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.error = th2;
            subscribeNext();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.other.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.value = t11;
            subscribeNext();
        }

        public void subscribeNext() {
            this.otherSource.subscribe(this.other);
        }

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver, InterfaceC44416b<U> interfaceC44416b) {
            this.other = new OtherSubscriber<>(maybeObserver);
            this.otherSource = interfaceC44416b;
        }
    }

    public static final class OtherSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        final MaybeObserver<? super T> downstream;
        Throwable error;
        T value;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            Throwable th2 = this.error;
            if (th2 != null) {
                this.downstream.onError(th2);
                return;
            }
            T t11 = this.value;
            if (t11 != null) {
                this.downstream.onSuccess(t11);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            Throwable th3 = this.error;
            if (th3 == null) {
                this.downstream.onError(th2);
            } else {
                this.downstream.onError(new CompositeException(th3, th2));
            }
        }

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            InterfaceC44418d interfaceC44418d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                interfaceC44418d.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new DelayMaybeObserver(maybeObserver, this.other));
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, InterfaceC44416b<U> interfaceC44416b) {
        super(maybeSource);
        this.other = interfaceC44416b;
    }
}
