package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {
    final CompletableSource source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe(new SubscriberCompletableObserver(interfaceC44417c));
    }

    public CompletableToFlowable(CompletableSource completableSource) {
        this.source = completableSource;
    }
}
