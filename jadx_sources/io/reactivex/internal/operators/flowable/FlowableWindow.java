package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final InterfaceC44417c<? super Flowable<T>> downstream;
        long index;
        final AtomicBoolean once;
        final long size;
        InterfaceC44418d upstream;
        UnicastProcessor<T> window;

        public WindowExactSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, long j11, int i11) {
            super(1);
            this.downstream = interfaceC44417c;
            this.size = j11;
            this.once = new AtomicBoolean();
            this.bufferSize = i11;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th2);
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = this.index;
            UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j11 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j12 = j11 + 1;
            unicastProcessorCreate.onNext(t11);
            if (j12 != this.size) {
                this.index = j12;
                return;
            }
            this.index = 0L;
            this.window = null;
            unicastProcessorCreate.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j11));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC44417c<? super Flowable<T>> downstream;
        Throwable error;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        long produced;
        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        final AtomicLong requested;
        final long size;
        final long skip;
        InterfaceC44418d upstream;
        final ArrayDeque<UnicastProcessor<T>> windows;
        final AtomicInteger wip;

        public WindowOverlapSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, long j11, long j12, int i11) {
            super(1);
            this.downstream = interfaceC44417c;
            this.size = j11;
            this.skip = j12;
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i11;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                spscLinkedArrayQueue.clear();
                interfaceC44417c.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            interfaceC44417c.onComplete();
            return true;
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super Flowable<T>> interfaceC44417c = this.downstream;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.done;
                    UnicastProcessor<T> unicastProcessorPoll = spscLinkedArrayQueue.poll();
                    boolean z12 = unicastProcessorPoll == null;
                    if (checkTerminated(z11, z12, interfaceC44417c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    interfaceC44417c.onNext(unicastProcessorPoll);
                    j12++;
                }
                if (j12 == j11 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC44417c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j12);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.windows.clear();
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            long j11 = this.index;
            if (j11 == 0 && !this.cancelled) {
                getAndIncrement();
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.windows.offer(unicastProcessorCreate);
                this.queue.offer(unicastProcessorCreate);
                drain();
            }
            long j12 = j11 + 1;
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t11);
            }
            long j13 = this.produced + 1;
            if (j13 == this.size) {
                this.produced = j13 - this.skip;
                UnicastProcessor<T> unicastProcessorPoll = this.windows.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.produced = j13;
            }
            if (j12 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j12;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j11 - 1)));
                } else {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j11));
                }
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final InterfaceC44417c<? super Flowable<T>> downstream;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        final long size;
        final long skip;
        InterfaceC44418d upstream;
        UnicastProcessor<T> window;

        public WindowSkipSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, long j11, long j12, int i11) {
            super(1);
            this.downstream = interfaceC44417c;
            this.size = j11;
            this.skip = j12;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i11;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th2);
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = this.index;
            UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j11 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j12 = j11 + 1;
            if (unicastProcessorCreate != null) {
                unicastProcessorCreate.onNext(t11);
            }
            if (j12 == this.size) {
                this.window = null;
                unicastProcessorCreate.onComplete();
            }
            if (j12 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j12;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j11), BackpressureHelper.multiplyCap(this.skip - this.size, j11 - 1)));
                } else {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j11));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Flowable<T>> interfaceC44417c) {
        long j11 = this.skip;
        long j12 = this.size;
        if (j11 == j12) {
            this.source.subscribe((FlowableSubscriber) new WindowExactSubscriber(interfaceC44417c, this.size, this.bufferSize));
        } else if (j11 > j12) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(interfaceC44417c, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowOverlapSubscriber(interfaceC44417c, this.size, this.skip, this.bufferSize));
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j11, long j12, int i11) {
        super(flowable);
        this.size = j11;
        this.skip = j12;
        this.bufferSize = i11;
    }
}
