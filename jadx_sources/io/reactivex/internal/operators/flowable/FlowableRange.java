package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRange extends Flowable<Integer> {
    final int end;
    final int start;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

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
        public final Integer poll() {
            int i11 = this.index;
            if (i11 == this.end) {
                return null;
            }
            this.index = i11 + 1;
            return Integer.valueOf(i11);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i11) {
            return i11 & 1;
        }

        public BaseRangeSubscription(int i11, int i12) {
            this.index = i11;
            this.end = i12;
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
        final ConditionalSubscriber<? super Integer> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i11 = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            for (int i12 = this.index; i12 != i11; i12++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i12));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void slowPath(long j11) {
            int i11 = this.end;
            int i12 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11 || i12 == i11) {
                        if (i12 == i11) {
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
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i12))) {
                            j12++;
                        }
                        i12++;
                    }
                }
                this.index = i12;
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }

        public RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i11, int i12) {
            super(i11, i12);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final InterfaceC44417c<? super Integer> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i11 = this.end;
            InterfaceC44417c<? super Integer> interfaceC44417c = this.downstream;
            for (int i12 = this.index; i12 != i11; i12++) {
                if (this.cancelled) {
                    return;
                }
                interfaceC44417c.onNext(Integer.valueOf(i12));
            }
            if (this.cancelled) {
                return;
            }
            interfaceC44417c.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void slowPath(long j11) {
            int i11 = this.end;
            int i12 = this.index;
            InterfaceC44417c<? super Integer> interfaceC44417c = this.downstream;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11 || i12 == i11) {
                        if (i12 == i11) {
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
                        interfaceC44417c.onNext(Integer.valueOf(i12));
                        j12++;
                        i12++;
                    }
                }
                this.index = i12;
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }

        public RangeSubscription(InterfaceC44417c<? super Integer> interfaceC44417c, int i11, int i12) {
            super(i11, i12);
            this.downstream = interfaceC44417c;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Integer> interfaceC44417c) {
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            interfaceC44417c.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) interfaceC44417c, this.start, this.end));
        } else {
            interfaceC44417c.onSubscribe(new RangeSubscription(interfaceC44417c, this.start, this.end));
        }
    }

    public FlowableRange(int i11, int i12) {
        this.start = i11;
        this.end = i11 + i12;
    }
}
