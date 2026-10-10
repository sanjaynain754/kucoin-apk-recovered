package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int capacityHint;
    final Callable<? extends InterfaceC44416b<B>> other;

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
            this.done = true;
            dispose();
            this.parent.innerNext(this);
        }

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        static final WindowBoundaryInnerSubscriber<Object, Object> BOUNDARY_DISPOSED = new WindowBoundaryInnerSubscriber<>(null);
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final InterfaceC44417c<? super Flowable<T>> downstream;
        long emitted;
        final Callable<? extends InterfaceC44416b<B>> other;
        InterfaceC44418d upstream;
        UnicastProcessor<T> window;
        final AtomicReference<WindowBoundaryInnerSubscriber<T, B>> boundarySubscriber = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public void disposeBoundary() {
            AtomicReference<WindowBoundaryInnerSubscriber<T, B>> atomicReference = this.boundarySubscriber;
            WindowBoundaryInnerSubscriber<Object, Object> windowBoundaryInnerSubscriber = BOUNDARY_DISPOSED;
            WindowBoundaryInnerSubscriber<T, B> andSet = atomicReference.getAndSet((WindowBoundaryInnerSubscriber<T, B>) windowBoundaryInnerSubscriber);
            if (andSet == null || andSet == windowBoundaryInnerSubscriber) {
                return;
            }
            andSet.dispose();
        }

        public void innerComplete() {
            this.upstream.cancel();
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            this.upstream.cancel();
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext(WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber) {
            C1454t.m2255a(this.boundarySubscriber, windowBoundaryInnerSubscriber, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.queue.offer(t11);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            BackpressureHelper.add(this.requested, j11);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }

        public WindowBoundaryMainSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, int i11, Callable<? extends InterfaceC44416b<B>> callable) {
            this.downstream = interfaceC44417c;
            this.capacityHint = i11;
            this.other = callable;
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
                            if (j11 != this.requested.get()) {
                                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.capacityHint, this);
                                this.window = unicastProcessorCreate;
                                this.windows.getAndIncrement();
                                try {
                                    InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null Publisher");
                                    WindowBoundaryInnerSubscriber windowBoundaryInnerSubscriber = new WindowBoundaryInnerSubscriber(this);
                                    if (C1454t.m2255a(this.boundarySubscriber, null, windowBoundaryInnerSubscriber)) {
                                        interfaceC44416b.subscribe(windowBoundaryInnerSubscriber);
                                        j11++;
                                        interfaceC44417c.onNext(unicastProcessorCreate);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    atomicThrowable.addThrowable(th2);
                                    this.done = true;
                                }
                            } else {
                                this.upstream.cancel();
                                disposeBoundary();
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

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            disposeBoundary();
            if (this.errors.addThrowable(th2)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Flowable<T>> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new WindowBoundaryMainSubscriber(interfaceC44417c, this.capacityHint, this.other));
    }

    public FlowableWindowBoundarySupplier(Flowable<T> flowable, Callable<? extends InterfaceC44416b<B>> callable, int i11) {
        super(flowable);
        this.other = callable;
        this.capacityHint = i11;
    }
}
