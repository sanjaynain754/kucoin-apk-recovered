package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    final Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    public static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements InterfaceC44418d, Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        Disposable timer;
        final long timespan;
        final TimeUnit unit;
        InterfaceC44418d upstream;

        /* JADX INFO: renamed from: w */
        final Scheduler.Worker f87136w;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(InterfaceC44417c interfaceC44417c, Object obj) {
            return accept((InterfaceC44417c<? super Collection>) interfaceC44417c, (Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            synchronized (this) {
                this.buffer = null;
            }
            this.upstream.cancel();
            this.f87136w.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            U u11;
            synchronized (this) {
                u11 = this.buffer;
                this.buffer = null;
            }
            this.queue.offer(u11);
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
            }
            this.f87136w.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th2);
            this.f87136w.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0062 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0078
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r0 = r7.buffer     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto Lc
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r8 = r0
                r1 = r7
                goto L76
            Lc:
                r0.add(r8)     // Catch: java.lang.Throwable -> L73
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L73
                int r1 = r7.maxSize     // Catch: java.lang.Throwable -> L73
                if (r8 >= r1) goto L19
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                r8 = 0
                r7.buffer = r8     // Catch: java.lang.Throwable -> L73
                long r1 = r7.producerIndex     // Catch: java.lang.Throwable -> L73
                r3 = 1
                long r1 = r1 + r3
                r7.producerIndex = r1     // Catch: java.lang.Throwable -> L73
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L73
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L2d
                io.reactivex.disposables.Disposable r8 = r7.timer
                r8.dispose()
            L2d:
                r8 = 0
                r7.fastPathOrderedEmitMax(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L64
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L64
                java.lang.String r0 = "The supplied buffer is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L64
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L64
                monitor-enter(r7)
                r7.buffer = r8     // Catch: java.lang.Throwable -> L5d
                long r0 = r7.consumerIndex     // Catch: java.lang.Throwable -> L5d
                long r0 = r0 + r3
                r7.consumerIndex = r0     // Catch: java.lang.Throwable -> L5d
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L5b
                io.reactivex.Scheduler$Worker r0 = r7.f87136w
                long r2 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r4 = r2
                r1 = r7
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r1.timer = r8
                return
            L5b:
                r1 = r7
                return
            L5d:
                r0 = move-exception
                r1 = r7
            L5f:
                r8 = r0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L62
                throw r8
            L62:
                r0 = move-exception
                goto L5f
            L64:
                r0 = move-exception
                r1 = r7
                r8 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r7.cancel()
                sh0.c<? super V> r0 = r1.downstream
                r0.onError(r8)
                return
            L73:
                r0 = move-exception
                r1 = r7
            L75:
                r8 = r0
            L76:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
                throw r8
            L78:
                r0 = move-exception
                goto L75
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferExactBoundedSubscriber.onNext(java.lang.Object):void");
        }

        public BufferExactBoundedSubscriber(InterfaceC44417c<? super U> interfaceC44417c, Callable<U> callable, long j11, TimeUnit timeUnit, int i11, boolean z11, Scheduler.Worker worker) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j11;
            this.unit = timeUnit;
            this.maxSize = i11;
            this.restartTimerOnMaxSize = z11;
            this.f87136w = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(InterfaceC44417c<? super U> interfaceC44417c, U u11) {
            interfaceC44417c.onNext(u11);
            return true;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.f87136w.getDisposed();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f87136w;
                    long j11 = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j11, j11, this.unit);
                    interfaceC44418d.request(Long.MAX_VALUE);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f87136w.dispose();
                    interfaceC44418d.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u11 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u12 = this.buffer;
                    if (u12 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u11;
                        fastPathOrderedEmitMax(u12, false, this);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    public static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements InterfaceC44418d, Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        InterfaceC44418d upstream;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(InterfaceC44417c interfaceC44417c, Object obj) {
            return accept((InterfaceC44417c<? super Collection>) interfaceC44417c, (Collection) obj);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    U u11 = this.buffer;
                    if (u11 != null) {
                        u11.add(t11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public BufferExactUnboundedSubscriber(InterfaceC44417c<? super U> interfaceC44417c, Callable<U> callable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(InterfaceC44417c<? super U> interfaceC44417c, U u11) {
            this.downstream.onNext((Object) u11);
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                try {
                    U u11 = this.buffer;
                    if (u11 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u11);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        interfaceC44418d.request(Long.MAX_VALUE);
                        Scheduler scheduler = this.scheduler;
                        long j11 = this.timespan;
                        Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j11, j11, this.unit);
                        if (C1454t.m2255a(this.timer, null, disposableSchedulePeriodicallyDirect)) {
                            return;
                        }
                        disposableSchedulePeriodicallyDirect.dispose();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u11 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u12 = this.buffer;
                        if (u12 == null) {
                            return;
                        }
                        this.buffer = u11;
                        fastPathEmitMax(u12, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    public static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements InterfaceC44418d, Runnable {
        final Callable<U> bufferSupplier;
        final List<U> buffers;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        InterfaceC44418d upstream;

        /* JADX INFO: renamed from: w */
        final Scheduler.Worker f87137w;

        public final class RemoveFromBuffer implements Runnable {
            private final U buffer;

            public RemoveFromBuffer(U u11) {
                this.buffer = u11;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.fastPathOrderedEmitMax(this.buffer, false, bufferSkipBoundedSubscriber.f87137w);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(InterfaceC44417c interfaceC44417c, Object obj) {
            return accept((InterfaceC44417c<? super Collection>) interfaceC44417c, (Collection) obj);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.f87137w.dispose();
            clear();
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.buffers);
                this.buffers.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((U) ((Collection) it.next()));
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f87137w, this);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.done = true;
            this.f87137w.dispose();
            clear();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.buffers.iterator();
                    while (it.hasNext()) {
                        it.next().add(t11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public BufferSkipBoundedSubscriber(InterfaceC44417c<? super U> interfaceC44417c, Callable<U> callable, long j11, long j12, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j11;
            this.timeskip = j12;
            this.unit = timeUnit;
            this.f87137w = worker;
            this.buffers = new LinkedList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(InterfaceC44417c<? super U> interfaceC44417c, U u11) {
            interfaceC44417c.onNext(u11);
            return true;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.buffers.add((U) collection);
                    this.downstream.onSubscribe(this);
                    interfaceC44418d.request(Long.MAX_VALUE);
                    Scheduler.Worker worker = this.f87137w;
                    long j11 = this.timeskip;
                    worker.schedulePeriodically(this, j11, j11, this.unit);
                    this.f87137w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f87137w.dispose();
                    interfaceC44418d.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.buffers.add((U) collection);
                        this.f87137w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super U> interfaceC44417c) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new BufferExactUnboundedSubscriber(new SerializedSubscriber(interfaceC44417c), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe((FlowableSubscriber) new BufferExactBoundedSubscriber(new SerializedSubscriber(interfaceC44417c), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, workerCreateWorker));
        } else {
            this.source.subscribe((FlowableSubscriber) new BufferSkipBoundedSubscriber(new SerializedSubscriber(interfaceC44417c), this.bufferSupplier, this.timespan, this.timeskip, this.unit, workerCreateWorker));
        }
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i11, boolean z11) {
        super(flowable);
        this.timespan = j11;
        this.timeskip = j12;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i11;
        this.restartTimerOnMaxSize = z11;
    }
}
