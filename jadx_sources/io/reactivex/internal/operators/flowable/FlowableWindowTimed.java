package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    public static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements InterfaceC44418d {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        InterfaceC44418d upstream;
        UnicastProcessor<T> window;
        final Scheduler.Worker worker;

        public static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedSubscriber<?> parent;

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (((QueueDrainSubscriber) windowExactBoundedSubscriber).cancelled) {
                    windowExactBoundedSubscriber.terminated = true;
                    windowExactBoundedSubscriber.dispose();
                } else {
                    ((QueueDrainSubscriber) windowExactBoundedSubscriber).queue.offer(this);
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }

            public ConsumerIndexHolder(long j11, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j11;
                this.parent = windowExactBoundedSubscriber;
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        public WindowExactBoundedSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, long j12, boolean z11) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i11;
            this.maxSize = j12;
            this.restartTimerOnMaxSize = z11;
            if (z11) {
                this.worker = scheduler.createWorker();
            } else {
                this.worker = null;
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z11 = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z12 = objPoll == null;
                boolean z13 = objPoll instanceof ConsumerIndexHolder;
                if (z11 && (z12 || z13)) {
                    this.window = null;
                    simpleQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        unicastProcessor.onError(th2);
                    } else {
                        unicastProcessor.onComplete();
                    }
                    dispose();
                    return;
                }
                if (z12) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else {
                    int i11 = iLeave;
                    if (z13) {
                        ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) objPoll;
                        if (this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                            unicastProcessor.onComplete();
                            this.count = 0L;
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long jRequested = requested();
                            if (jRequested == 0) {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                interfaceC44417c.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                dispose();
                                return;
                            }
                            interfaceC44417c.onNext(unicastProcessor);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(objPoll));
                        long j11 = this.count + 1;
                        if (j11 >= this.maxSize) {
                            this.producerIndex++;
                            this.count = 0L;
                            unicastProcessor.onComplete();
                            long jRequested2 = requested();
                            if (jRequested2 == 0) {
                                this.window = null;
                                this.upstream.cancel();
                                this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                dispose();
                                return;
                            }
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            this.downstream.onNext(unicastProcessor);
                            if (jRequested2 != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            if (this.restartTimerOnMaxSize) {
                                this.timer.get().dispose();
                                Scheduler.Worker worker = this.worker;
                                ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                                long j12 = this.timespan;
                                this.timer.replace(worker.schedulePeriodically(consumerIndexHolder2, j12, j12, this.unit));
                            }
                        } else {
                            this.count = j11;
                        }
                    }
                    iLeave = i11;
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor<T> unicastProcessor = this.window;
                unicastProcessor.onNext(t11);
                long j11 = this.count + 1;
                if (j11 >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastProcessor.onComplete();
                    long jRequested = requested();
                    if (jRequested == 0) {
                        this.window = null;
                        this.upstream.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                    UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                    this.window = unicastProcessorCreate;
                    this.downstream.onNext(unicastProcessorCreate);
                    if (jRequested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        Scheduler.Worker worker = this.worker;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        long j12 = this.timespan;
                        this.timer.replace(worker.schedulePeriodically(consumerIndexHolder, j12, j12, this.unit));
                    }
                } else {
                    this.count = j11;
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
                interfaceC44417c.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                this.window = unicastProcessorCreate;
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    interfaceC44418d.cancel();
                    interfaceC44417c.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                interfaceC44417c.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                if (this.restartTimerOnMaxSize) {
                    Scheduler.Worker worker = this.worker;
                    long j11 = this.timespan;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j11, j11, this.unit);
                } else {
                    Scheduler scheduler = this.scheduler;
                    long j12 = this.timespan;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j12, j12, this.unit);
                }
                if (this.timer.replace(disposableSchedulePeriodicallyDirect)) {
                    interfaceC44418d.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    public static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        InterfaceC44418d upstream;
        UnicastProcessor<T> window;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        public WindowExactUnboundedSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i11;
        }

        public void dispose() {
            DisposableHelper.dispose(this.timer);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int iLeave = 1;
            while (true) {
                boolean z11 = this.terminated;
                boolean z12 = this.done;
                Object objPoll = simpleQueue.poll();
                if (z12 && (objPoll == null || objPoll == NEXT)) {
                    break;
                }
                if (objPoll == null) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll == NEXT) {
                    unicastProcessor.onComplete();
                    if (z11) {
                        this.upstream.cancel();
                    } else {
                        unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                        this.window = unicastProcessor;
                        long jRequested = requested();
                        if (jRequested == 0) {
                            this.window = null;
                            this.queue.clear();
                            this.upstream.cancel();
                            dispose();
                            interfaceC44417c.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                            return;
                        }
                        interfaceC44417c.onNext(unicastProcessor);
                        if (jRequested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                    }
                } else {
                    unicastProcessor.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.window = null;
            simpleQueue.clear();
            dispose();
            Throwable th2 = this.error;
            if (th2 != null) {
                unicastProcessor.onError(th2);
            } else {
                unicastProcessor.onComplete();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                this.window.onNext(t11);
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.window = UnicastProcessor.create(this.bufferSize);
                InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
                interfaceC44417c.onSubscribe(this);
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    interfaceC44418d.cancel();
                    interfaceC44417c.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                interfaceC44417c.onNext(this.window);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (!this.cancelled) {
                    SequentialDisposable sequentialDisposable = this.timer;
                    Scheduler scheduler = this.scheduler;
                    long j11 = this.timespan;
                    if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j11, j11, this.unit))) {
                        interfaceC44418d.request(Long.MAX_VALUE);
                    }
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
                dispose();
            }
            this.queue.offer((U) NEXT);
            if (enter()) {
                drainLoop();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    public static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements InterfaceC44418d, Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        InterfaceC44418d upstream;
        final List<UnicastProcessor<T>> windows;
        final Scheduler.Worker worker;

        public final class Completion implements Runnable {
            private final UnicastProcessor<T> processor;

            public Completion(UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipSubscriber.this.complete(this.processor);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        public static final class SubjectWork<T> {
            final boolean open;

            /* JADX INFO: renamed from: w */
            final UnicastProcessor<T> f87164w;

            public SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z11) {
                this.f87164w = unicastProcessor;
                this.open = z11;
            }
        }

        public WindowSkipSubscriber(InterfaceC44417c<? super Flowable<T>> interfaceC44417c, long j11, long j12, TimeUnit timeUnit, Scheduler.Worker worker, int i11) {
            super(interfaceC44417c, new MpscLinkedQueue());
            this.timespan = j11;
            this.timeskip = j12;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i11;
            this.windows = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void complete(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer((U) new SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        public void dispose() {
            this.worker.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
            List<UnicastProcessor<T>> list = this.windows;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z11 = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z12 = objPoll == null;
                boolean z13 = objPoll instanceof SubjectWork;
                if (z11 && (z12 || z13)) {
                    simpleQueue.clear();
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
                    dispose();
                    return;
                }
                if (z12) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z13) {
                    SubjectWork subjectWork = (SubjectWork) objPoll;
                    if (!subjectWork.open) {
                        list.remove(subjectWork.f87164w);
                        subjectWork.f87164w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    } else if (!this.cancelled) {
                        long jRequested = requested();
                        if (jRequested != 0) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                            list.add(unicastProcessorCreate);
                            interfaceC44417c.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            this.worker.schedule(new Completion(unicastProcessorCreate), this.timespan, this.unit);
                        } else {
                            interfaceC44417c.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.upstream.cancel();
            dispose();
            simpleQueue.clear();
            list.clear();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th2);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    long jRequested = requested();
                    if (jRequested == 0) {
                        interfaceC44418d.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                        return;
                    }
                    UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                    this.windows.add(unicastProcessorCreate);
                    this.downstream.onNext(unicastProcessorCreate);
                    if (jRequested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    this.worker.schedule(new Completion(unicastProcessorCreate), this.timespan, this.unit);
                    Scheduler.Worker worker = this.worker;
                    long j11 = this.timeskip;
                    worker.schedulePeriodically(this, j11, j11, this.unit);
                    interfaceC44418d.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object subjectWork = new SubjectWork(UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer((U) subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t11);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t11);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            requested(j11);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Flowable<T>> interfaceC44417c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC44417c);
        long j11 = this.timespan;
        long j12 = this.timeskip;
        if (j11 != j12) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(serializedSubscriber, j11, j12, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j13 = this.maxSize;
        if (j13 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new WindowExactUnboundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowExactBoundedSubscriber(serializedSubscriber, j11, this.unit, this.scheduler, this.bufferSize, j13, this.restartTimerOnMaxSize));
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, long j13, int i11, boolean z11) {
        super(flowable);
        this.timespan = j11;
        this.timeskip = j12;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j13;
        this.bufferSize = i11;
        this.restartTimerOnMaxSize = z11;
    }
}
