package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {
    final Consumer<? super S> disposeState;
    final BiFunction<S, Emitter<T>, S> generator;
    final Callable<S> stateSupplier;

    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, InterfaceC44418d {
        private static final long serialVersionUID = 7565982551505011832L;
        volatile boolean cancelled;
        final Consumer<? super S> disposeState;
        final InterfaceC44417c<? super T> downstream;
        final BiFunction<S, ? super Emitter<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        private void dispose(S s11) {
            try {
                this.disposeState.accept(s11);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (BackpressureHelper.add(this, 1L) == 0) {
                S s11 = this.state;
                this.state = null;
                dispose(s11);
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.terminate) {
                return;
            }
            this.terminate = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th2) {
            if (this.terminate) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.terminate = true;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t11) {
            if (this.terminate) {
                return;
            }
            if (this.hasNext) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t11 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.hasNext = true;
                this.downstream.onNext(t11);
            }
        }

        public GeneratorSubscription(InterfaceC44417c<? super T> interfaceC44417c, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s11) {
            this.downstream = interfaceC44417c;
            this.generator = biFunction;
            this.disposeState = consumer;
            this.state = s11;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11) && BackpressureHelper.add(this, j11) == 0) {
                S sApply = this.state;
                BiFunction<S, ? super Emitter<T>, S> biFunction = this.generator;
                do {
                    long j12 = 0;
                    while (true) {
                        if (j12 != j11) {
                            if (this.cancelled) {
                                this.state = null;
                                dispose(sApply);
                                return;
                            }
                            this.hasNext = false;
                            try {
                                sApply = biFunction.apply(sApply, this);
                                if (this.terminate) {
                                    this.cancelled = true;
                                    this.state = null;
                                    dispose(sApply);
                                    return;
                                }
                                j12++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.cancelled = true;
                                this.state = null;
                                onError(th2);
                                dispose(sApply);
                                return;
                            }
                        } else {
                            j11 = get();
                            if (j12 == j11) {
                                break;
                            }
                        }
                    }
                    this.state = sApply;
                    j11 = addAndGet(-j12);
                } while (j11 != 0);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        try {
            interfaceC44417c.onSubscribe(new GeneratorSubscription(interfaceC44417c, this.generator, this.disposeState, this.stateSupplier.call()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.stateSupplier = callable;
        this.generator = biFunction;
        this.disposeState = consumer;
    }
}
