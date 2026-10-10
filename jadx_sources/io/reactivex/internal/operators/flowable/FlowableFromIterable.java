package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    final Iterable<? extends T> source;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;

        /* JADX INFO: renamed from: it */
        Iterator<? extends T> f87146it;
        boolean once;

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f87146it = null;
        }

        public abstract void fastPath();

        public abstract void slowPath(long j11);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f87146it;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<? extends T> it = this.f87146it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.f87146it.next(), "Iterator.next() returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i11) {
            return i11 & 1;
        }

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.f87146it = it;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public final void request(long j11) {
            if (SubscriptionHelper.validate(j11) && BackpressureHelper.add(this, j11) == 0) {
                if (j11 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j11);
                }
            }
        }
    }

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ConditionalSubscriber<? super T> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.f87146it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        conditionalSubscriber.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    conditionalSubscriber.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void slowPath(long j11) {
            Iterator<? extends T> it = this.f87146it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zTryOnNext = conditionalSubscriber.tryOnNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zTryOnNext) {
                                    j12++;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                conditionalSubscriber.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            conditionalSubscriber.onError(th3);
                            return;
                        }
                    }
                }
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }

        public IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final InterfaceC44417c<? super T> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.f87146it;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        interfaceC44417c.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC44417c.onNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            interfaceC44417c.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        interfaceC44417c.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    interfaceC44417c.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void slowPath(long j11) {
            Iterator<? extends T> it = this.f87146it;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                interfaceC44417c.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            interfaceC44417c.onNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    interfaceC44417c.onComplete();
                                    return;
                                }
                                j12++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                interfaceC44417c.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            interfaceC44417c.onError(th3);
                            return;
                        }
                    }
                }
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }

        public IteratorSubscription(InterfaceC44417c<? super T> interfaceC44417c, Iterator<? extends T> it) {
            super(it);
            this.downstream = interfaceC44417c;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        try {
            subscribe(interfaceC44417c, this.source.iterator());
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public static <T> void subscribe(InterfaceC44417c<? super T> interfaceC44417c, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(interfaceC44417c);
            } else if (interfaceC44417c instanceof ConditionalSubscriber) {
                interfaceC44417c.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) interfaceC44417c, it));
            } else {
                interfaceC44417c.onSubscribe(new IteratorSubscription(interfaceC44417c, it));
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }
}
