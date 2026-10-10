package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    final Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    public static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        Disposable timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;

        /* JADX INFO: renamed from: w */
        final Scheduler.Worker f87168w;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Collection>) observer, (Collection) obj);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th2);
            this.f87168w.dispose();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0062 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0078
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // io.reactivex.Observer
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
                r7.fastPathOrderedEmit(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L64
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L64
                java.lang.String r0 = "The buffer supplied is null"
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
                io.reactivex.Scheduler$Worker r0 = r7.f87168w
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
                io.reactivex.Observer<? super V> r0 = r1.downstream
                r0.onError(r8)
                r7.dispose()
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferExactBoundedObserver.onNext(java.lang.Object):void");
        }

        public BufferExactBoundedObserver(Observer<? super U> observer, Callable<U> callable, long j11, TimeUnit timeUnit, int i11, boolean z11, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j11;
            this.unit = timeUnit;
            this.maxSize = i11;
            this.restartTimerOnMaxSize = z11;
            this.f87168w = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(Observer<? super U> observer, U u11) {
            observer.onNext(u11);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            this.f87168w.dispose();
            synchronized (this) {
                this.buffer = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u11;
            this.f87168w.dispose();
            synchronized (this) {
                u11 = this.buffer;
                this.buffer = null;
            }
            this.queue.offer(u11);
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f87168w;
                    long j11 = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j11, j11, this.unit);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.f87168w.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u11 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u12 = this.buffer;
                    if (u12 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u11;
                        fastPathOrderedEmit(u12, false, this);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.downstream.onError(th2);
            }
        }
    }

    public static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Collection>) observer, (Collection) obj);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u11;
            synchronized (this) {
                u11 = this.buffer;
                this.buffer = null;
            }
            if (u11 != null) {
                this.queue.offer(u11);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th2);
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    U u11 = this.buffer;
                    if (u11 == null) {
                        return;
                    }
                    u11.add(t11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public BufferExactUnboundedObserver(Observer<? super U> observer, Callable<U> callable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(Observer<? super U> observer, U u11) {
            this.downstream.onNext((Object) u11);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.timer);
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
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
                    dispose();
                    EmptyDisposable.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u11;
            try {
                U u12 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        u11 = this.buffer;
                        if (u11 != null) {
                            this.buffer = u12;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u11 == null) {
                    DisposableHelper.dispose(this.timer);
                } else {
                    fastPathEmit(u11, false, this);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
                dispose();
            }
        }
    }

    public static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        final Callable<U> bufferSupplier;
        final List<U> buffers;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;

        /* JADX INFO: renamed from: w */
        final Scheduler.Worker f87169w;

        public final class RemoveFromBuffer implements Runnable {

            /* JADX INFO: renamed from: b */
            private final U f87170b;

            public RemoveFromBuffer(U u11) {
                this.f87170b = u11;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.buffers.remove(this.f87170b);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.f87170b, false, bufferSkipBoundedObserver.f87169w);
            }
        }

        public final class RemoveFromBufferEmit implements Runnable {
            private final U buffer;

            public RemoveFromBufferEmit(U u11) {
                this.buffer = u11;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.buffer, false, bufferSkipBoundedObserver.f87169w);
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(Observer observer, Object obj) {
            accept((Observer<? super Collection>) observer, (Collection) obj);
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
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
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f87169w, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.done = true;
            clear();
            this.downstream.onError(th2);
            this.f87169w.dispose();
        }

        @Override // io.reactivex.Observer
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

        public BufferSkipBoundedObserver(Observer<? super U> observer, Callable<U> callable, long j11, long j12, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j11;
            this.timeskip = j12;
            this.unit = timeUnit;
            this.f87169w = worker;
            this.buffers = new LinkedList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(Observer<? super U> observer, U u11) {
            observer.onNext(u11);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            clear();
            this.upstream.dispose();
            this.f87169w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    this.buffers.add((U) collection);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f87169w;
                    long j11 = this.timeskip;
                    worker.schedulePeriodically(this, j11, j11, this.unit);
                    this.f87169w.schedule(new RemoveFromBufferEmit(collection), this.timespan, this.unit);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.f87169w.dispose();
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
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.buffers.add((U) collection);
                        this.f87169w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
                dispose();
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe(new BufferExactUnboundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe(new BufferExactBoundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, workerCreateWorker));
        } else {
            this.source.subscribe(new BufferSkipBoundedObserver(new SerializedObserver(observer), this.bufferSupplier, this.timespan, this.timeskip, this.unit, workerCreateWorker));
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i11, boolean z11) {
        super(observableSource);
        this.timespan = j11;
        this.timeskip = j12;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i11;
        this.restartTimerOnMaxSize = z11;
    }
}
