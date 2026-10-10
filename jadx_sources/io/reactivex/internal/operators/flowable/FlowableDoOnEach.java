package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {
    final Action onAfterTerminate;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;

    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        final Action onAfterTerminate;
        final Action onComplete;
        final Consumer<? super Throwable> onError;
        final Consumer<? super T> onNext;

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.onComplete.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.onAfterTerminate.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                fail(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.onError.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.onAfterTerminate.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.onNext.accept(t11);
                this.downstream.onNext(t11);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            try {
                T tPoll = this.f87202qs.poll();
                if (tPoll == null) {
                    if (this.sourceMode == 1) {
                        this.onComplete.run();
                        this.onAfterTerminate.run();
                    }
                    return tPoll;
                }
                try {
                    this.onNext.accept(tPoll);
                    this.onAfterTerminate.run();
                    return tPoll;
                } catch (Throwable th2) {
                    try {
                        Exceptions.throwIfFatal(th2);
                        try {
                            this.onError.accept(th2);
                            throw ExceptionHelper.throwIfThrowable(th2);
                        } catch (Throwable th3) {
                            throw new CompositeException(th2, th3);
                        }
                    } catch (Throwable th4) {
                        this.onAfterTerminate.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.throwIfFatal(th5);
                try {
                    this.onError.accept(th5);
                    throw ExceptionHelper.throwIfThrowable(th5);
                } catch (Throwable th6) {
                    throw new CompositeException(th5, th6);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (this.done) {
                return false;
            }
            try {
                this.onNext.accept(t11);
                return this.downstream.tryOnNext((Object) t11);
            } catch (Throwable th2) {
                fail(th2);
                return false;
            }
        }

        public DoOnEachConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return transitiveBoundaryFusion(i11);
        }
    }

    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        final Action onAfterTerminate;
        final Action onComplete;
        final Consumer<? super Throwable> onError;
        final Consumer<? super T> onNext;

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.onComplete.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.onAfterTerminate.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                fail(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.onError.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.onAfterTerminate.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.onNext.accept(t11);
                this.downstream.onNext((Object) t11);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            try {
                T tPoll = this.f87203qs.poll();
                if (tPoll == null) {
                    if (this.sourceMode == 1) {
                        this.onComplete.run();
                        this.onAfterTerminate.run();
                    }
                    return tPoll;
                }
                try {
                    this.onNext.accept(tPoll);
                    this.onAfterTerminate.run();
                    return tPoll;
                } catch (Throwable th2) {
                    try {
                        Exceptions.throwIfFatal(th2);
                        try {
                            this.onError.accept(th2);
                            throw ExceptionHelper.throwIfThrowable(th2);
                        } catch (Throwable th3) {
                            throw new CompositeException(th2, th3);
                        }
                    } catch (Throwable th4) {
                        this.onAfterTerminate.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.throwIfFatal(th5);
                try {
                    this.onError.accept(th5);
                    throw ExceptionHelper.throwIfThrowable(th5);
                } catch (Throwable th6) {
                    throw new CompositeException(th5, th6);
                }
            }
        }

        public DoOnEachSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(interfaceC44417c);
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return transitiveBoundaryFusion(i11);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DoOnEachConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, this.onNext, this.onError, this.onComplete, this.onAfterTerminate));
        } else {
            this.source.subscribe((FlowableSubscriber) new DoOnEachSubscriber(interfaceC44417c, this.onNext, this.onError, this.onComplete, this.onAfterTerminate));
        }
    }

    public FlowableDoOnEach(Flowable<T> flowable, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(flowable);
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onAfterTerminate = action2;
    }
}
