package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    private final Observable<T> upstream;

    public static final class SubscriberObserver<T> implements Observer<T>, InterfaceC44418d {
        final InterfaceC44417c<? super T> downstream;
        Disposable upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }

        public SubscriberObserver(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.upstream.subscribe(new SubscriberObserver(interfaceC44417c));
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.upstream = observable;
    }
}
