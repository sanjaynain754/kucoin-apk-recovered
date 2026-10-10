package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWindowBoundary<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int capacityHint;
    final InterfaceC44416b<B> other;

    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, B> parent;

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.parent.innerError(th2);
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(B b11) {
            if (this.done) {
                return;
            }
            this.parent.innerNext();
        }

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final InterfaceC44417c<? super Flowable<T>> downstream;
        long emitted;
        UnicastProcessor<T> window;
        final WindowBoundaryInnerSubscriber<T, B> boundarySubscriber = new WindowBoundaryInnerSubscriber<>(this);
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundarySubscriber.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.upstream);
                }
            }
        }

        public void innerComplete() {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            SubscriptionHelper.cancel(this.upstream);
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.boundarySubscriber.dispose();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.boundarySubscriber.dispose();
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.queue.offer(t11);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this.upstream, interfaceC44418d, Long.MAX_VALUE);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            BackpressureHelper.add(this.requested, j11);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.upstream);
            }
        }

        public WindowBoundaryMainSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, int i11) {
            this.downstream = interfaceC44417c;
            this.capacityHint = i11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                InterfaceC44417c<? super Flowable<T>> interfaceC44417c = this.downstream;
                MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                long j11 = this.emitted;
                int iAddAndGet = 1;
                while (this.windows.get() != 0) {
                    UnicastProcessor<T> unicastProcessor = this.window;
                    boolean z12 = this.done;
                    if (z12 && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onError(thTerminate);
                        }
                        interfaceC44417c.onError(thTerminate);
                        return;
                    }
                    Object objPoll = mpscLinkedQueue.poll();
                    if (objPoll == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z11) {
                        Throwable thTerminate2 = atomicThrowable.terminate();
                        if (thTerminate2 == null) {
                            if (unicastProcessor != null) {
                                this.window = null;
                                unicastProcessor.onComplete();
                            }
                            interfaceC44417c.onComplete();
                            return;
                        }
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onError(thTerminate2);
                        }
                        interfaceC44417c.onError(thTerminate2);
                        return;
                    }
                    if (z11) {
                        this.emitted = j11;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (objPoll != NEXT_WINDOW) {
                        unicastProcessor.onNext((T) objPoll);
                    } else {
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.capacityHint, this);
                            this.window = unicastProcessorCreate;
                            this.windows.getAndIncrement();
                            if (j11 != this.requested.get()) {
                                j11++;
                                interfaceC44417c.onNext(unicastProcessorCreate);
                            } else {
                                SubscriptionHelper.cancel(this.upstream);
                                this.boundarySubscriber.dispose();
                                atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                this.done = true;
                            }
                        }
                    }
                }
                mpscLinkedQueue.clear();
                this.window = null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Flowable<T>> interfaceC44417c) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(interfaceC44417c, this.capacityHint);
        interfaceC44417c.onSubscribe(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.innerNext();
        this.other.subscribe(windowBoundaryMainSubscriber.boundarySubscriber);
        this.source.subscribe((FlowableSubscriber) windowBoundaryMainSubscriber);
    }

    public FlowableWindowBoundary(Flowable<T> flowable, InterfaceC44416b<B> interfaceC44416b, int i11) {
        super(flowable);
        this.other = interfaceC44416b;
        this.capacityHint = i11;
    }
}
