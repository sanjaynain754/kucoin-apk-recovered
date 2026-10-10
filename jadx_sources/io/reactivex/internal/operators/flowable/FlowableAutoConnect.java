package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableAutoConnect<T> extends Flowable<T> {
    final AtomicInteger clients = new AtomicInteger();
    final Consumer<? super Disposable> connection;
    final int numberOfSubscribers;
    final ConnectableFlowable<? extends T> source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((InterfaceC44417c<? super Object>) interfaceC44417c);
        if (this.clients.incrementAndGet() == this.numberOfSubscribers) {
            this.source.connect(this.connection);
        }
    }

    public FlowableAutoConnect(ConnectableFlowable<? extends T> connectableFlowable, int i11, Consumer<? super Disposable> consumer) {
        this.source = connectableFlowable;
        this.numberOfSubscribers = i11;
        this.connection = consumer;
    }
}
