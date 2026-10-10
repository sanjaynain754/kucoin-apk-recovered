package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    public static final class WindowExactBoundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        UnicastSubject<T> window;
        final Scheduler.Worker worker;

        public static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedObserver<?> parent;

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedObserver<?> windowExactBoundedObserver = this.parent;
                if (((QueueDrainObserver) windowExactBoundedObserver).cancelled) {
                    windowExactBoundedObserver.terminated = true;
                    windowExactBoundedObserver.disposeTimer();
                } else {
                    ((QueueDrainObserver) windowExactBoundedObserver).queue.offer(this);
                }
                if (windowExactBoundedObserver.enter()) {
                    windowExactBoundedObserver.drainLoop();
                }
            }

            public ConsumerIndexHolder(long j11, WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.index = j11;
                this.parent = windowExactBoundedObserver;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            disposeTimer();
        }

        public WindowExactBoundedObserver(Observer<? super Observable<T>> observer, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, long j12, boolean z11) {
            super(observer, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
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

        public void disposeTimer() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
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
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.window;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z11 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z12 = objPoll == null;
                boolean z13 = objPoll instanceof ConsumerIndexHolder;
                if (z11 && (z12 || z13)) {
                    this.window = null;
                    mpscLinkedQueue.clear();
                    disposeTimer();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        unicastSubject.onError(th2);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z12) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z13) {
                    ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) objPoll;
                    if (this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                        unicastSubject.onComplete();
                        this.count = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j11 = this.count + 1;
                    if (j11 >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.restartTimerOnMaxSize) {
                            Disposable disposable = this.timer.get();
                            disposable.dispose();
                            Scheduler.Worker worker = this.worker;
                            ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                            long j12 = this.timespan;
                            Disposable disposableSchedulePeriodically = worker.schedulePeriodically(consumerIndexHolder2, j12, j12, this.unit);
                            if (!C1454t.m2255a(this.timer, disposable, disposableSchedulePeriodically)) {
                                disposableSchedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.count = j11;
                    }
                }
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            disposeTimer();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th2);
            disposeTimer();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                UnicastSubject<T> unicastSubject = this.window;
                unicastSubject.onNext(t11);
                long j11 = this.count + 1;
                if (j11 >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.bufferSize);
                    this.window = unicastSubjectCreate;
                    this.downstream.onNext(unicastSubjectCreate);
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        Scheduler.Worker worker = this.worker;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        long j12 = this.timespan;
                        DisposableHelper.replace(this.timer, worker.schedulePeriodically(consumerIndexHolder, j12, j12, this.unit));
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
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.bufferSize);
                this.window = unicastSubjectCreate;
                observer.onNext(unicastSubjectCreate);
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
                DisposableHelper.replace(this.timer, disposableSchedulePeriodicallyDirect);
            }
        }
    }

    public static final class WindowExactUnboundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Observer<T>, Disposable, Runnable {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        UnicastSubject<T> window;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            disposeTimer();
            this.downstream.onComplete();
        }

        public WindowExactUnboundedObserver(Observer<? super Observable<T>> observer, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11) {
            super(observer, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.timespan = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i11;
        }

        public void disposeTimer() {
            DisposableHelper.dispose(this.timer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
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
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.window;
            int iLeave = 1;
            while (true) {
                boolean z11 = this.terminated;
                boolean z12 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                if (z12 && (objPoll == null || objPoll == NEXT)) {
                    break;
                }
                if (objPoll == null) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll == NEXT) {
                    unicastSubject.onComplete();
                    if (z11) {
                        this.upstream.dispose();
                    } else {
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.window = null;
            mpscLinkedQueue.clear();
            disposeTimer();
            Throwable th2 = this.error;
            if (th2 != null) {
                unicastSubject.onError(th2);
            } else {
                unicastSubject.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            disposeTimer();
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
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
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.window = UnicastSubject.create(this.bufferSize);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.window);
                if (!this.cancelled) {
                    Scheduler scheduler = this.scheduler;
                    long j11 = this.timespan;
                    DisposableHelper.replace(this.timer, scheduler.schedulePeriodicallyDirect(this, j11, j11, this.unit));
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
                disposeTimer();
            }
            this.queue.offer((U) NEXT);
            if (enter()) {
                drainLoop();
            }
        }
    }

    public static final class WindowSkipObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        final List<UnicastSubject<T>> windows;
        final Scheduler.Worker worker;

        public final class CompletionTask implements Runnable {

            /* JADX INFO: renamed from: w */
            private final UnicastSubject<T> f87190w;

            public CompletionTask(UnicastSubject<T> unicastSubject) {
                this.f87190w = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipObserver.this.complete(this.f87190w);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            disposeWorker();
        }

        public static final class SubjectWork<T> {
            final boolean open;

            /* JADX INFO: renamed from: w */
            final UnicastSubject<T> f87191w;

            public SubjectWork(UnicastSubject<T> unicastSubject, boolean z11) {
                this.f87191w = unicastSubject;
                this.open = z11;
            }
        }

        public WindowSkipObserver(Observer<? super Observable<T>> observer, long j11, long j12, TimeUnit timeUnit, Scheduler.Worker worker, int i11) {
            super(observer, new MpscLinkedQueue());
            this.timespan = j11;
            this.timeskip = j12;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i11;
            this.windows = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void complete(UnicastSubject<T> unicastSubject) {
            this.queue.offer((U) new SubjectWork(unicastSubject, false));
            if (enter()) {
                drainLoop();
            }
        }

        public void disposeWorker() {
            this.worker.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.windows;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z11 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z12 = objPoll == null;
                boolean z13 = objPoll instanceof SubjectWork;
                if (z11 && (z12 || z13)) {
                    mpscLinkedQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    disposeWorker();
                    list.clear();
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
                        list.remove(subjectWork.f87191w);
                        subjectWork.f87191w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    } else if (!this.cancelled) {
                        UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.bufferSize);
                        list.add(unicastSubjectCreate);
                        observer.onNext(unicastSubjectCreate);
                        this.worker.schedule(new CompletionTask(unicastSubjectCreate), this.timespan, this.unit);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.upstream.dispose();
            disposeWorker();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th2);
            disposeWorker();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.bufferSize);
                this.windows.add(unicastSubjectCreate);
                this.downstream.onNext(unicastSubjectCreate);
                this.worker.schedule(new CompletionTask(unicastSubjectCreate), this.timespan, this.unit);
                Scheduler.Worker worker = this.worker;
                long j11 = this.timeskip;
                worker.schedulePeriodically(this, j11, j11, this.unit);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object subjectWork = new SubjectWork(UnicastSubject.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer((U) subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (fastEnter()) {
                Iterator<UnicastSubject<T>> it = this.windows.iterator();
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
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j11 = this.timespan;
        long j12 = this.timeskip;
        if (j11 != j12) {
            this.source.subscribe(new WindowSkipObserver(serializedObserver, j11, j12, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j13 = this.maxSize;
        if (j13 == Long.MAX_VALUE) {
            this.source.subscribe(new WindowExactUnboundedObserver(serializedObserver, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe(new WindowExactBoundedObserver(serializedObserver, j11, this.unit, this.scheduler, this.bufferSize, j13, this.restartTimerOnMaxSize));
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, long j13, int i11, boolean z11) {
        super(observableSource);
        this.timespan = j11;
        this.timeskip = j12;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j13;
        this.bufferSize = i11;
        this.restartTimerOnMaxSize = z11;
    }
}
