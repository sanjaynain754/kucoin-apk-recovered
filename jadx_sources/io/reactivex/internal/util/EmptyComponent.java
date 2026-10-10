package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public enum EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, InterfaceC44418d, Disposable {
    INSTANCE;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    public static <T> Observer<T> asObserver() {
        return INSTANCE;
    }

    public static <T> InterfaceC44417c<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        interfaceC44418d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(Object obj) {
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
    }
}
