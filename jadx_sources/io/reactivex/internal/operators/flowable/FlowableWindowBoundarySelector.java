package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final Function<? super B, ? extends InterfaceC44416b<V>> close;
    final InterfaceC44416b<B> open;

    public static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, ?, V> parent;

        /* JADX INFO: renamed from: w */
        final UnicastProcessor<T> f87161w;

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.parent.error(th2);
            }
        }

        public OperatorWindowBoundaryCloseSubscriber(WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, UnicastProcessor<T> unicastProcessor) {
            this.parent = windowBoundaryMainSubscriber;
            this.f87161w = unicastProcessor;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(V v11) {
            cancel();
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {
        final WindowBoundaryMainSubscriber<T, B, ?> parent;

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.error(th2);
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(B b11) {
            this.parent.open(b11);
        }

        public OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements InterfaceC44418d {
        final AtomicReference<Disposable> boundary;
        final int bufferSize;
        final Function<? super B, ? extends InterfaceC44416b<V>> close;
        final InterfaceC44416b<B> open;
        final CompositeDisposable resources;
        final AtomicBoolean stopWindows;
        InterfaceC44418d upstream;
        final AtomicLong windows;

        /* JADX INFO: renamed from: ws */
        final List<UnicastProcessor<T>> f87162ws;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, Object obj) {
            return false;
        }

        public WindowBoundaryMainSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, InterfaceC44416b<B> interfaceC44416b, Function<? super B, ? extends InterfaceC44416b<V>> function, int i11) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.boundary = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.windows = atomicLong;
            this.stopWindows = new AtomicBoolean();
            this.open = interfaceC44416b;
            this.close = function;
            this.bufferSize = i11;
            this.resources = new CompositeDisposable();
            this.f87162ws = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.boundary);
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void close(OperatorWindowBoundaryCloseSubscriber<T, V> operatorWindowBoundaryCloseSubscriber) {
            this.resources.delete(operatorWindowBoundaryCloseSubscriber);
            this.queue.offer((U) new WindowOperation(operatorWindowBoundaryCloseSubscriber.f87161w, null));
            if (enter()) {
                drainLoop();
            }
        }

        public void dispose() {
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
            List<UnicastProcessor<T>> list = this.f87162ws;
            int iLeave = 1;
            while (true) {
                boolean z11 = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z12 = objPoll == null;
                if (z11 && z12) {
                    dispose();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z12) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) objPoll;
                    UnicastProcessor<T> unicastProcessor = windowOperation.f87163w;
                    if (unicastProcessor != null) {
                        if (list.remove(unicastProcessor)) {
                            windowOperation.f87163w.onComplete();
                            if (this.windows.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.stopWindows.get()) {
                        UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                        long jRequested = requested();
                        if (jRequested != 0) {
                            list.add(unicastProcessorCreate);
                            interfaceC44417c.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The publisher supplied is null");
                                OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new OperatorWindowBoundaryCloseSubscriber(this, unicastProcessorCreate);
                                if (this.resources.add(operatorWindowBoundaryCloseSubscriber)) {
                                    this.windows.getAndIncrement();
                                    interfaceC44416b.subscribe(operatorWindowBoundaryCloseSubscriber);
                                }
                            } catch (Throwable th3) {
                                cancel();
                                interfaceC44417c.onError(th3);
                            }
                        } else {
                            cancel();
                            interfaceC44417c.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void error(Throwable th2) {
            this.upstream.cancel();
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it = this.f87162ws.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t11);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t11));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                if (this.stopWindows.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                if (C1454t.m2255a(this.boundary, null, operatorWindowBoundaryOpenSubscriber)) {
                    interfaceC44418d.request(Long.MAX_VALUE);
                    this.open.subscribe(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void open(B b11) {
            this.queue.offer((U) new WindowOperation(null, b11));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    public static final class WindowOperation<T, B> {
        final B open;

        /* JADX INFO: renamed from: w */
        final UnicastProcessor<T> f87163w;

        public WindowOperation(UnicastProcessor<T> unicastProcessor, B b11) {
            this.f87163w = unicastProcessor;
            this.open = b11;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Flowable<T>> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new WindowBoundaryMainSubscriber(new SerializedSubscriber(interfaceC44417c), this.open, this.close, this.bufferSize));
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, InterfaceC44416b<B> interfaceC44416b, Function<? super B, ? extends InterfaceC44416b<V>> function, int i11) {
        super(flowable);
        this.open = interfaceC44416b;
        this.close = function;
        this.bufferSize = i11;
    }
}
