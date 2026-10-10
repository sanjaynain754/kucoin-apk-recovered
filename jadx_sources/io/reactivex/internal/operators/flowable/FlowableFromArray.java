package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    final T[] array;

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super T> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            for (int i11 = this.index; i11 != length; i11++) {
                if (this.cancelled) {
                    return;
                }
                T t11 = tArr[i11];
                if (t11 == null) {
                    conditionalSubscriber.onError(new NullPointerException("The element at index " + i11 + " is null"));
                    return;
                }
                conditionalSubscriber.tryOnNext(t11);
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void slowPath(long j11) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i11 = this.index;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11 || i11 == length) {
                        if (i11 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j11 = get();
                            if (j12 == j11) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t11 = tArr[i11];
                        if (t11 == null) {
                            conditionalSubscriber.onError(new NullPointerException("The element at index " + i11 + " is null"));
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(t11)) {
                            j12++;
                        }
                        i11++;
                    }
                }
                this.index = i11;
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }

        public ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final InterfaceC44417c<? super T> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            for (int i11 = this.index; i11 != length; i11++) {
                if (this.cancelled) {
                    return;
                }
                T t11 = tArr[i11];
                if (t11 == null) {
                    interfaceC44417c.onError(new NullPointerException("The element at index " + i11 + " is null"));
                    return;
                }
                interfaceC44417c.onNext(t11);
            }
            if (this.cancelled) {
                return;
            }
            interfaceC44417c.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void slowPath(long j11) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i11 = this.index;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11 || i11 == length) {
                        if (i11 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            interfaceC44417c.onComplete();
                            return;
                        } else {
                            j11 = get();
                            if (j12 == j11) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t11 = tArr[i11];
                        if (t11 == null) {
                            interfaceC44417c.onError(new NullPointerException("The element at index " + i11 + " is null"));
                            return;
                        }
                        interfaceC44417c.onNext(t11);
                        j12++;
                        i11++;
                    }
                }
                this.index = i11;
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }

        public ArraySubscription(InterfaceC44417c<? super T> interfaceC44417c, T[] tArr) {
            super(tArr);
            this.downstream = interfaceC44417c;
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public final void cancel() {
            this.cancelled = true;
        }

        public abstract void fastPath();

        public abstract void slowPath(long j11);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i11 = this.index;
            T[] tArr = this.array;
            if (i11 == tArr.length) {
                return null;
            }
            this.index = i11 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i11], "array element is null");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i11) {
            return i11 & 1;
        }

        public BaseArraySubscription(T[] tArr) {
            this.array = tArr;
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

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            interfaceC44417c.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) interfaceC44417c, this.array));
        } else {
            interfaceC44417c.onSubscribe(new ArraySubscription(interfaceC44417c, this.array));
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }
}
