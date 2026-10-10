package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes60.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    /* synthetic */ void onError(Throwable th2);

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    /* synthetic */ void onNext(Object obj);

    boolean tryOnNext(T t11);
}
