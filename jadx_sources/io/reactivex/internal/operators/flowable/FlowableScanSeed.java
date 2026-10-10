package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<R, ? super T, R> accumulator;
    final Callable<R> seedSupplier;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested;
        InterfaceC44418d upstream;
        R value;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            SimplePlainQueue<R> simplePlainQueue = this.queue;
            int i11 = this.limit;
            int i12 = this.consumed;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && (th2 = this.error) != null) {
                        simplePlainQueue.clear();
                        interfaceC44417c.onError(th2);
                        return;
                    }
                    R rPoll = simplePlainQueue.poll();
                    boolean z12 = rPoll == null;
                    if (z11 && z12) {
                        interfaceC44417c.onComplete();
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    interfaceC44417c.onNext(rPoll);
                    j12++;
                    i12++;
                    if (i12 == i11) {
                        this.upstream.request(i11);
                        i12 = 0;
                    }
                }
                if (j12 == j11 && this.done) {
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        simplePlainQueue.clear();
                        interfaceC44417c.onError(th3);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        interfaceC44417c.onComplete();
                        return;
                    }
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this.requested, j12);
                }
                this.consumed = i12;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            drain();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                R r11 = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t11), "The accumulator returned a null value");
                this.value = r11;
                this.queue.offer(r11);
                drain();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(this.prefetch - 1);
            }
        }

        public ScanSeedSubscriber(InterfaceC44417c<? super R> interfaceC44417c, BiFunction<R, ? super T, R> biFunction, R r11, int i11) {
            this.downstream = interfaceC44417c;
            this.accumulator = biFunction;
            this.value = r11;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i11);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r11);
            this.requested = new AtomicLong();
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
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(interfaceC44417c, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }
}
