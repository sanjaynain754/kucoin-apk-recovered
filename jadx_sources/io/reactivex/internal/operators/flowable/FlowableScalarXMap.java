package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p002a0.C0005a;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
        final T value;

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
            try {
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (!(interfaceC44416b instanceof Callable)) {
                    interfaceC44416b.subscribe(interfaceC44417c);
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC44416b).call();
                    if (objCall == null) {
                        EmptySubscription.complete(interfaceC44417c);
                    } else {
                        interfaceC44417c.onSubscribe(new ScalarSubscription(interfaceC44417c, objCall));
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, interfaceC44417c);
                }
            } catch (Throwable th3) {
                EmptySubscription.error(th3, interfaceC44417c);
            }
        }

        public ScalarXMapFlowable(T t11, Function<? super T, ? extends InterfaceC44416b<? extends R>> function) {
            this.value = t11;
            this.mapper = function;
        }
    }

    public static <T, U> Flowable<U> scalarXMap(T t11, Function<? super T, ? extends InterfaceC44416b<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t11, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(InterfaceC44416b<T> interfaceC44416b, InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function) {
        if (!(interfaceC44416b instanceof Callable)) {
            return false;
        }
        try {
            C0005a c0005a = (Object) ((Callable) interfaceC44416b).call();
            if (c0005a == null) {
                EmptySubscription.complete(interfaceC44417c);
                return true;
            }
            try {
                InterfaceC44416b interfaceC44416b2 = (InterfaceC44416b) ObjectHelper.requireNonNull(function.apply(c0005a), "The mapper returned a null Publisher");
                if (interfaceC44416b2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) interfaceC44416b2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(interfaceC44417c);
                            return true;
                        }
                        interfaceC44417c.onSubscribe(new ScalarSubscription(interfaceC44417c, objCall));
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, interfaceC44417c);
                        return true;
                    }
                } else {
                    interfaceC44416b2.subscribe(interfaceC44417c);
                }
                return true;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC44417c);
                return true;
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptySubscription.error(th4, interfaceC44417c);
            return true;
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }
}
