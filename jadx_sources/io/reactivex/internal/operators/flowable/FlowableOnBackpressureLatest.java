package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC44417c<? super T> downstream;
        Throwable error;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                atomicReference.lazySet(null);
                interfaceC44417c.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            interfaceC44417c.onComplete();
            return true;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.current.lazySet(t11);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public BackpressureLatestSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }

        public void drain() {
            boolean z11;
            boolean z12;
            if (getAndIncrement() == 0) {
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int iAddAndGet = 1;
                do {
                    long j11 = 0;
                    while (true) {
                        z11 = false;
                        if (j11 == atomicLong.get()) {
                            break;
                        }
                        boolean z13 = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!checkTerminated(z13, z12, interfaceC44417c, atomicReference)) {
                            if (z12) {
                                break;
                            }
                            interfaceC44417c.onNext(andSet);
                            j11++;
                        } else {
                            return;
                        }
                    }
                    if (j11 == atomicLong.get()) {
                        boolean z14 = this.done;
                        if (atomicReference.get() == null) {
                            z11 = true;
                        }
                        if (checkTerminated(z14, z11, interfaceC44417c, atomicReference)) {
                            return;
                        }
                    }
                    if (j11 != 0) {
                        BackpressureHelper.produced(atomicLong, j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
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
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(interfaceC44417c));
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }
}
