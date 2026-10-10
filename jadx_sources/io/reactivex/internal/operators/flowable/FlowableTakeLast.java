package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {
    final int count;

    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final InterfaceC44417c<? super T> downstream;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger wip = new AtomicInteger();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                long jAddAndGet = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j11 = 0;
                        while (j11 != jAddAndGet) {
                            if (this.cancelled) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                interfaceC44417c.onComplete();
                                return;
                            } else {
                                interfaceC44417c.onNext(tPoll);
                                j11++;
                            }
                        }
                        if (j11 != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.requested.addAndGet(-j11);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.count == size()) {
                poll();
            }
            offer(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public TakeLastSubscriber(InterfaceC44417c<? super T> interfaceC44417c, int i11) {
            this.downstream = interfaceC44417c;
            this.count = i11;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new TakeLastSubscriber(interfaceC44417c, this.count));
    }

    public FlowableTakeLast(Flowable<T> flowable, int i11) {
        super(flowable);
        this.count = i11;
    }
}
