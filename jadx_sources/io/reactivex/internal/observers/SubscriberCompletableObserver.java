package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, InterfaceC44418d {
    final InterfaceC44417c<? super T> subscriber;
    Disposable upstream;

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.subscriber.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        this.subscriber.onError(th2);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }

    public SubscriberCompletableObserver(InterfaceC44417c<? super T> interfaceC44417c) {
        this.subscriber = interfaceC44417c;
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
    }
}
