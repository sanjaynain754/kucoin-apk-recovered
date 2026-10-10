package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.concurrent.Callable;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableMapNotification<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Callable<? extends R> onCompleteSupplier;
    final Function<? super Throwable, ? extends R> onErrorMapper;
    final Function<? super T, ? extends R> onNextMapper;

    public static final class MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;
        final Callable<? extends R> onCompleteSupplier;
        final Function<? super Throwable, ? extends R> onErrorMapper;
        final Function<? super T, ? extends R> onNextMapper;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            try {
                complete(ObjectHelper.requireNonNull(this.onCompleteSupplier.call(), "The onComplete publisher returned is null"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            try {
                complete(ObjectHelper.requireNonNull(this.onErrorMapper.apply(th2), "The onError publisher returned is null"));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            try {
                Object objRequireNonNull = ObjectHelper.requireNonNull(this.onNextMapper.apply(t11), "The onNext publisher returned is null");
                this.produced++;
                this.downstream.onNext(objRequireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        public MapNotificationSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Callable<? extends R> callable) {
            super(interfaceC44417c);
            this.onNextMapper = function;
            this.onErrorMapper = function2;
            this.onCompleteSupplier = callable;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new MapNotificationSubscriber(interfaceC44417c, this.onNextMapper, this.onErrorMapper, this.onCompleteSupplier));
    }

    public FlowableMapNotification(Flowable<T> flowable, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Callable<? extends R> callable) {
        super(flowable);
        this.onNextMapper = function;
        this.onErrorMapper = function2;
        this.onCompleteSupplier = callable;
    }
}
