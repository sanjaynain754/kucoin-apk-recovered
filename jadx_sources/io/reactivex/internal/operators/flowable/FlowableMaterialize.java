package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        public void onDrop(Notification<T> notification) {
            if (notification.isOnError()) {
                RxJavaPlugins.onError(notification.getError());
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.produced++;
            this.downstream.onNext(Notification.createOnNext(t11));
        }

        public MaterializeSubscriber(InterfaceC44417c<? super Notification<T>> interfaceC44417c) {
            super(interfaceC44417c);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            complete(Notification.createOnComplete());
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            complete(Notification.createOnError(th2));
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Notification<T>> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new MaterializeSubscriber(interfaceC44417c));
    }

    public FlowableMaterialize(Flowable<T> flowable) {
        super(flowable);
    }
}
