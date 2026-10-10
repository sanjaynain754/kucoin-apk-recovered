package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRangeLong extends Flowable<Long> {
    final long end;
    final long start;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public final void cancel() {
            this.cancelled = true;
        }

        public abstract void fastPath();

        public abstract void slowPath(long j11);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Long poll() {
            long j11 = this.index;
            if (j11 == this.end) {
                return null;
            }
            this.index = 1 + j11;
            return Long.valueOf(j11);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i11) {
            return i11 & 1;
        }

        public BaseRangeSubscription(long j11, long j12) {
            this.index = j11;
            this.end = j12;
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

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Long> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void fastPath() {
            long j11 = this.end;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            for (long j12 = this.index; j12 != j11; j12++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Long.valueOf(j12));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void slowPath(long j11) {
            long j12 = this.end;
            long j13 = this.index;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            do {
                long j14 = 0;
                while (true) {
                    if (j14 == j11 || j13 == j12) {
                        if (j13 == j12) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j11 = get();
                            if (j14 == j11) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(Long.valueOf(j13))) {
                            j14++;
                        }
                        j13++;
                    }
                }
                this.index = j13;
                j11 = addAndGet(-j14);
            } while (j11 != 0);
        }

        public RangeConditionalSubscription(ConditionalSubscriber<? super Long> conditionalSubscriber, long j11, long j12) {
            super(j11, j12);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final InterfaceC44417c<? super Long> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void fastPath() {
            long j11 = this.end;
            InterfaceC44417c<? super Long> interfaceC44417c = this.downstream;
            for (long j12 = this.index; j12 != j11; j12++) {
                if (this.cancelled) {
                    return;
                }
                interfaceC44417c.onNext(Long.valueOf(j12));
            }
            if (this.cancelled) {
                return;
            }
            interfaceC44417c.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void slowPath(long j11) {
            long j12 = this.end;
            long j13 = this.index;
            InterfaceC44417c<? super Long> interfaceC44417c = this.downstream;
            do {
                long j14 = 0;
                while (true) {
                    if (j14 == j11 || j13 == j12) {
                        if (j13 == j12) {
                            if (this.cancelled) {
                                return;
                            }
                            interfaceC44417c.onComplete();
                            return;
                        } else {
                            j11 = get();
                            if (j14 == j11) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        interfaceC44417c.onNext(Long.valueOf(j13));
                        j14++;
                        j13++;
                    }
                }
                this.index = j13;
                j11 = addAndGet(-j14);
            } while (j11 != 0);
        }

        public RangeSubscription(InterfaceC44417c<? super Long> interfaceC44417c, long j11, long j12) {
            super(j11, j12);
            this.downstream = interfaceC44417c;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Long> interfaceC44417c) {
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            interfaceC44417c.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) interfaceC44417c, this.start, this.end));
        } else {
            interfaceC44417c.onSubscribe(new RangeSubscription(interfaceC44417c, this.start, this.end));
        }
    }

    public FlowableRangeLong(long j11, long j12) {
        this.start = j11;
        this.end = j11 + j12;
    }
}
