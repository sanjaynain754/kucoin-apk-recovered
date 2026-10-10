package io.reactivex;

import io.reactivex.annotations.NonNull;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes23.dex */
public interface FlowableSubscriber<T> extends InterfaceC44417c<T> {
    @Override // sh0.InterfaceC44417c
    /* synthetic */ void onComplete();

    @Override // sh0.InterfaceC44417c
    /* synthetic */ void onError(Throwable th2);

    @Override // sh0.InterfaceC44417c
    /* synthetic */ void onNext(Object obj);

    @Override // sh0.InterfaceC44417c
    void onSubscribe(@NonNull InterfaceC44418d interfaceC44418d);
}
