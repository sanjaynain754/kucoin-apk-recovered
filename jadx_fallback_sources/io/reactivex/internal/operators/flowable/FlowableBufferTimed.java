package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    public static final class BufferExactBoundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements sh0.InterfaceC44418d, java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        io.reactivex.disposables.Disposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        sh0.InterfaceC44418d upstream;

        /* JADX INFO: renamed from: w */
        final io.reactivex.Scheduler.Worker f87136w;

        public BufferExactBoundedSubscriber(sh0.InterfaceC44417c<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, int r7, boolean r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.maxSize = r7
                r1.restartTimerOnMaxSize = r8
                r1.f87136w = r9
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(sh0.InterfaceC44417c r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(sh0.InterfaceC44417c<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto La
                r0 = 1
                r1.cancelled = r0
                r1.dispose()
            La:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                sh0.d r0 = r1.upstream
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.f87136w
                r0.dispose()
                return
            L10:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.f87136w
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
                r3 = this;
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.buffer     // Catch: java.lang.Throwable -> L23
                r1 = 0
                r3.buffer = r1     // Catch: java.lang.Throwable -> L23
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L1d
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                sh0.c<? super V> r1 = r3.downstream
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r1, r2, r3, r3)
            L1d:
                io.reactivex.Scheduler$Worker r0 = r3.f87136w
                r0.dispose()
                return
            L23:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                throw r0
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                sh0.c<? super V> r0 = r1.downstream
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.f87136w
                r2.dispose()
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T r8) {
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
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(sh0.InterfaceC44418d r9) {
                r8 = this;
                sh0.d r0 = r8.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r9)
                if (r0 != 0) goto L9
                return
            L9:
                r8.upstream = r9
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r8.bufferSupplier     // Catch: java.lang.Throwable -> L37
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L37
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L37
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L37
                r8.buffer = r0
                sh0.c<? super V> r0 = r8.downstream
                r0.onSubscribe(r8)
                io.reactivex.Scheduler$Worker r1 = r8.f87136w
                long r3 = r8.timespan
                java.util.concurrent.TimeUnit r7 = r8.unit
                r5 = r3
                r2 = r8
                io.reactivex.disposables.Disposable r0 = r1.schedulePeriodically(r2, r3, r5, r7)
                r2.timer = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9.request(r0)
                return
            L37:
                r0 = move-exception
                r2 = r8
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r2.f87136w
                r1.dispose()
                r9.cancel()
                sh0.c<? super V> r9 = r2.downstream
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r9)
                return
        }

        @Override // sh0.InterfaceC44418d
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r6.bufferSupplier     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2a
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2a
                monitor-enter(r6)
                U extends java.util.Collection<? super T> r1 = r6.buffer     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto L26
                long r2 = r6.producerIndex     // Catch: java.lang.Throwable -> L24
                long r4 = r6.consumerIndex     // Catch: java.lang.Throwable -> L24
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L1c
                goto L26
            L1c:
                r6.buffer = r0     // Catch: java.lang.Throwable -> L24
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L24
                r0 = 0
                r6.fastPathOrderedEmitMax(r1, r0, r6)
                return
            L24:
                r0 = move-exception
                goto L28
            L26:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L24
                return
            L28:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L24
                throw r0
            L2a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r6.cancel()
                sh0.c<? super V> r1 = r6.downstream
                r1.onError(r0)
                return
        }
    }

    public static final class BufferExactUnboundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements sh0.InterfaceC44418d, java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        sh0.InterfaceC44418d upstream;

        public BufferExactUnboundedSubscriber(sh0.InterfaceC44417c<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.timer = r2
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.scheduler = r7
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(sh0.InterfaceC44417c r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(sh0.InterfaceC44417c<? super U> r1, U r2) {
                r0 = this;
                sh0.c<? super V> r1 = r0.downstream
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                sh0.d r0 = r1.upstream
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                r0.cancel()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r4)
                U extends java.util.Collection<? super T> r0 = r4.buffer     // Catch: java.lang.Throwable -> Lc
                if (r0 != 0) goto Le
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                goto L29
            Le:
                r1 = 0
                r4.buffer = r1     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r2 = r4.queue
                r2.offer(r0)
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L28
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r4.queue
                sh0.c<? super V> r2 = r4.downstream
                r3 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r2, r3, r1, r4)
            L28:
                return
            L29:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                sh0.c<? super V> r0 = r1.downstream
                r0.onError(r2)
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                U extends java.util.Collection<? super T> r0 = r1.buffer     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto Lb
                r0.add(r2)     // Catch: java.lang.Throwable -> L9
                goto Lb
            L9:
                r2 = move-exception
                goto Ld
            Lb:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                return
            Ld:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(sh0.InterfaceC44418d r10) {
                r9 = this;
                sh0.d r0 = r9.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r10)
                if (r0 == 0) goto L44
                r9.upstream = r10
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r9.bufferSupplier     // Catch: java.lang.Throwable -> L46
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L46
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L46
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L46
                r9.buffer = r0
                sh0.c<? super V> r0 = r9.downstream
                r0.onSubscribe(r9)
                boolean r0 = r9.cancelled
                if (r0 != 0) goto L44
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10.request(r0)
                io.reactivex.Scheduler r2 = r9.scheduler
                long r4 = r9.timespan
                java.util.concurrent.TimeUnit r8 = r9.unit
                r6 = r4
                r3 = r9
                io.reactivex.disposables.Disposable r10 = r2.schedulePeriodicallyDirect(r3, r4, r6, r8)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.timer
                r1 = 0
                boolean r0 = androidx.camera.view.C1454t.m2255a(r0, r1, r10)
                if (r0 != 0) goto L54
                r10.dispose()
                return
            L44:
                r3 = r9
                goto L54
            L46:
                r0 = move-exception
                r3 = r9
                r10 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                sh0.c<? super V> r0 = r3.downstream
                io.reactivex.internal.subscriptions.EmptySubscription.error(r10, r0)
            L54:
                return
        }

        @Override // sh0.InterfaceC44418d
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L21
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L21
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L21
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L21
                monitor-enter(r2)
                U extends java.util.Collection<? super T> r1 = r2.buffer     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r0 = move-exception
                goto L1f
            L17:
                r2.buffer = r0     // Catch: java.lang.Throwable -> L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                r0 = 0
                r2.fastPathEmitMax(r1, r0, r2)
                return
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                throw r0
            L21:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.cancel()
                sh0.c<? super V> r1 = r2.downstream
                r1.onError(r0)
                return
        }
    }

    public static final class BufferSkipBoundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements sh0.InterfaceC44418d, java.lang.Runnable {
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        sh0.InterfaceC44418d upstream;

        /* JADX INFO: renamed from: w */
        final io.reactivex.Scheduler.Worker f87137w;

        public final class RemoveFromBuffer implements java.lang.Runnable {
            private final U buffer;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber this$0;

            public RemoveFromBuffer(io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber r1, U r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.buffer = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r0 = r4.this$0
                    monitor-enter(r0)
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r1 = r4.this$0     // Catch: java.lang.Throwable -> L18
                    java.util.List<U extends java.util.Collection<? super T>> r1 = r1.buffers     // Catch: java.lang.Throwable -> L18
                    U extends java.util.Collection<? super T> r2 = r4.buffer     // Catch: java.lang.Throwable -> L18
                    r1.remove(r2)     // Catch: java.lang.Throwable -> L18
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r0 = r4.this$0
                    U extends java.util.Collection<? super T> r1 = r4.buffer
                    r2 = 0
                    io.reactivex.Scheduler$Worker r3 = r0.f87137w
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.access$000(r0, r1, r2, r3)
                    return
                L18:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                    throw r1
            }
        }

        public BufferSkipBoundedSubscriber(sh0.InterfaceC44417c<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, long r6, java.util.concurrent.TimeUnit r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.timeskip = r6
                r1.unit = r8
                r1.f87137w = r9
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.buffers = r2
                return
        }

        public static /* synthetic */ void access$000(io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber r0, java.lang.Object r1, boolean r2, io.reactivex.disposables.Disposable r3) {
                r0.fastPathOrderedEmitMax(r1, r2, r3)
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(sh0.InterfaceC44417c r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r1 = r0.accept(r1, r2)
                return r1
        }

        public boolean accept(sh0.InterfaceC44417c<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                r1 = 1
                return r1
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                sh0.d r0 = r1.upstream
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.f87137w
                r0.dispose()
                r1.clear()
                return
        }

        public void clear() {
                r1 = this;
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L8
                r0.clear()     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
                r4 = this;
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
                java.util.List<U extends java.util.Collection<? super T>> r1 = r4.buffers     // Catch: java.lang.Throwable -> L38
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
                java.util.List<U extends java.util.Collection<? super T>> r1 = r4.buffers     // Catch: java.lang.Throwable -> L38
                r1.clear()     // Catch: java.lang.Throwable -> L38
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                java.util.Collection r1 = (java.util.Collection) r1
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r2 = r4.queue
                r2.offer(r1)
                goto L12
            L24:
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L37
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r4.queue
                sh0.c<? super V> r1 = r4.downstream
                r2 = 0
                io.reactivex.Scheduler$Worker r3 = r4.f87137w
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r1, r2, r3, r4)
            L37:
                return
            L38:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                throw r0
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.Scheduler$Worker r0 = r1.f87137w
                r0.dispose()
                r1.clear()
                sh0.c<? super V> r0 = r1.downstream
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L17
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L17
                r1.add(r3)     // Catch: java.lang.Throwable -> L17
                goto L7
            L17:
                r3 = move-exception
                goto L1b
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r3
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(sh0.InterfaceC44418d r11) {
                r10 = this;
                sh0.d r0 = r10.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r11)
                if (r0 != 0) goto L9
                return
            L9:
                r10.upstream = r11
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r10.bufferSupplier     // Catch: java.lang.Throwable -> L45
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L45
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L45
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L45
                java.util.List<U extends java.util.Collection<? super T>> r1 = r10.buffers
                r1.add(r0)
                sh0.c<? super V> r1 = r10.downstream
                r1.onSubscribe(r10)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11.request(r1)
                io.reactivex.Scheduler$Worker r3 = r10.f87137w
                long r5 = r10.timeskip
                java.util.concurrent.TimeUnit r9 = r10.unit
                r7 = r5
                r4 = r10
                r3.schedulePeriodically(r4, r5, r7, r9)
                io.reactivex.Scheduler$Worker r11 = r4.f87137w
                io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer r1 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer
                r1.<init>(r10, r0)
                long r2 = r4.timespan
                java.util.concurrent.TimeUnit r0 = r4.unit
                r11.schedule(r1, r2, r0)
                return
            L45:
                r0 = move-exception
                r4 = r10
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r4.f87137w
                r1.dispose()
                r11.cancel()
                sh0.c<? super V> r11 = r4.downstream
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r11)
                return
        }

        @Override // sh0.InterfaceC44418d
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                boolean r0 = r5.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L33
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L33
                java.lang.String r1 = "The supplied buffer is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L33
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L33
                monitor-enter(r5)
                boolean r1 = r5.cancelled     // Catch: java.lang.Throwable -> L1a
                if (r1 == 0) goto L1c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
                return
            L1a:
                r0 = move-exception
                goto L31
            L1c:
                java.util.List<U extends java.util.Collection<? super T>> r1 = r5.buffers     // Catch: java.lang.Throwable -> L1a
                r1.add(r0)     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
                io.reactivex.Scheduler$Worker r1 = r5.f87137w
                io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer r2 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber$RemoveFromBuffer
                r2.<init>(r5, r0)
                long r3 = r5.timespan
                java.util.concurrent.TimeUnit r0 = r5.unit
                r1.schedule(r2, r3, r0)
                return
            L31:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
                throw r0
            L33:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r5.cancel()
                sh0.c<? super V> r1 = r5.downstream
                r1.onError(r0)
                return
        }
    }

    public FlowableBufferTimed(io.reactivex.Flowable<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, java.util.concurrent.Callable<U> r8, int r9, boolean r10) {
            r0 = this;
            r0.<init>(r1)
            r0.timespan = r2
            r0.timeskip = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.bufferSupplier = r8
            r0.maxSize = r9
            r0.restartTimerOnMaxSize = r10
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(sh0.InterfaceC44417c<? super U> r11) {
            r10 = this;
            long r0 = r10.timespan
            long r2 = r10.timeskip
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L27
            int r0 = r10.maxSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L27
            io.reactivex.Flowable<T> r0 = r10.source
            io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactUnboundedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactUnboundedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r11)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r10.bufferSupplier
            long r4 = r10.timespan
            java.util.concurrent.TimeUnit r6 = r10.unit
            io.reactivex.Scheduler r7 = r10.scheduler
            r1.<init>(r2, r3, r4, r6, r7)
            r0.subscribe(r1)
            return
        L27:
            io.reactivex.Scheduler r0 = r10.scheduler
            io.reactivex.Scheduler$Worker r9 = r0.createWorker()
            long r0 = r10.timespan
            long r2 = r10.timeskip
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4f
            io.reactivex.Flowable<T> r0 = r10.source
            io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactBoundedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferExactBoundedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r11)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r10.bufferSupplier
            long r4 = r10.timespan
            java.util.concurrent.TimeUnit r6 = r10.unit
            int r7 = r10.maxSize
            boolean r8 = r10.restartTimerOnMaxSize
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            r0.subscribe(r1)
            return
        L4f:
            io.reactivex.Flowable<T> r0 = r10.source
            io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed$BufferSkipBoundedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r11)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r10.bufferSupplier
            long r4 = r10.timespan
            long r6 = r10.timeskip
            java.util.concurrent.TimeUnit r8 = r10.unit
            r1.<init>(r2, r3, r4, r6, r8, r9)
            r0.subscribe(r1)
            return
    }
}
