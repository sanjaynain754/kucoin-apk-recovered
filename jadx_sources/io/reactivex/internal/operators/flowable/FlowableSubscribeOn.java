package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final InterfaceC44417c<? super T> downstream;
        final boolean nonScheduledRequests;
        InterfaceC44416b<T> source;
        final Scheduler.Worker worker;
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public static final class Request implements Runnable {

            /* JADX INFO: renamed from: n */
            final long f87160n;
            final InterfaceC44418d upstream;

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f87160n);
            }

            public Request(InterfaceC44418d interfaceC44418d, long j11) {
                this.upstream = interfaceC44418d;
                this.f87160n = j11;
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, interfaceC44418d);
                }
            }
        }

        public void requestUpstream(long j11, InterfaceC44418d interfaceC44418d) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                interfaceC44418d.request(j11);
            } else {
                this.worker.schedule(new Request(interfaceC44418d, j11));
            }
        }

        public SubscribeOnSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Scheduler.Worker worker, InterfaceC44416b<T> interfaceC44416b, boolean z11) {
            this.downstream = interfaceC44417c;
            this.worker = worker;
            this.source = interfaceC44416b;
            this.nonScheduledRequests = !z11;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                InterfaceC44418d interfaceC44418d = this.upstream.get();
                if (interfaceC44418d != null) {
                    requestUpstream(j11, interfaceC44418d);
                    return;
                }
                BackpressureHelper.add(this.requested, j11);
                InterfaceC44418d interfaceC44418d2 = this.upstream.get();
                if (interfaceC44418d2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, interfaceC44418d2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC44416b<T> interfaceC44416b = this.source;
            this.source = null;
            interfaceC44416b.subscribe(this);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(interfaceC44417c, workerCreateWorker, this.source, this.nonScheduledRequests);
        interfaceC44417c.onSubscribe(subscribeOnSubscriber);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z11) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z11;
    }
}
