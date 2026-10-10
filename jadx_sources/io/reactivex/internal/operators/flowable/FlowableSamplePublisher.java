package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {
    final boolean emitLast;
    final InterfaceC44416b<?> other;
    final InterfaceC44416b<T> source;

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z11 = this.done;
                    emit();
                    if (z11) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }

        public SampleMainEmitLast(InterfaceC44417c<? super T> interfaceC44417c, InterfaceC44416b<?> interfaceC44416b) {
            super(interfaceC44417c, interfaceC44416b);
            this.wip = new AtomicInteger();
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completion() {
            this.downstream.onComplete();
        }

        public SampleMainNoLast(InterfaceC44417c<? super T> interfaceC44417c, InterfaceC44416b<?> interfaceC44416b) {
            super(interfaceC44417c, interfaceC44416b);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            emit();
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -3517602651313910099L;
        final InterfaceC44417c<? super T> downstream;
        final InterfaceC44416b<?> sampler;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC44418d> other = new AtomicReference<>();

        public abstract void completion();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public abstract void run();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }

        public void complete() {
            this.upstream.cancel();
            completion();
        }

        public void error(Throwable th2) {
            this.upstream.cancel();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            completion();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SamplerSubscriber(this));
                    interfaceC44418d.request(Long.MAX_VALUE);
                }
            }
        }

        public void setOther(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this.other, interfaceC44418d, Long.MAX_VALUE);
        }

        public SamplePublisherSubscriber(InterfaceC44417c<? super T> interfaceC44417c, InterfaceC44416b<?> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.sampler = interfaceC44416b;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            lazySet(t11);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
            }
        }
    }

    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        final SamplePublisherSubscriber<T> parent;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.complete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.error(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            this.parent.run();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            this.parent.setOther(interfaceC44418d);
        }

        public SamplerSubscriber(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.parent = samplePublisherSubscriber;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC44417c);
        if (this.emitLast) {
            this.source.subscribe(new SampleMainEmitLast(serializedSubscriber, this.other));
        } else {
            this.source.subscribe(new SampleMainNoLast(serializedSubscriber, this.other));
        }
    }

    public FlowableSamplePublisher(InterfaceC44416b<T> interfaceC44416b, InterfaceC44416b<?> interfaceC44416b2, boolean z11) {
        this.source = interfaceC44416b;
        this.other = interfaceC44416b2;
        this.emitLast = z11;
    }
}
