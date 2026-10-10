package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final InterfaceC44416b<? extends R> other;
    final CompletableSource source;

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<R>, CompletableObserver, InterfaceC44418d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC44417c<? super R> downstream;
        InterfaceC44416b<? extends R> other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            InterfaceC44416b<? extends R> interfaceC44416b = this.other;
            if (interfaceC44416b == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                interfaceC44416b.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(R r11) {
            this.downstream.onNext(r11);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this, this.requested, j11);
        }

        public AndThenPublisherSubscriber(InterfaceC44417c<? super R> interfaceC44417c, InterfaceC44416b<? extends R> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.other = interfaceC44416b;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, interfaceC44418d);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe(new AndThenPublisherSubscriber(interfaceC44417c, this.other));
    }

    public CompletableAndThenPublisher(CompletableSource completableSource, InterfaceC44416b<? extends R> interfaceC44416b) {
        this.source = completableSource;
        this.other = interfaceC44416b;
    }
}
