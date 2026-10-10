package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC44416b<? extends U>> mapper;
    final int maxConcurrency;

    public static final class InnerSubscriber<T, U> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;

        /* JADX INFO: renamed from: id */
        final long f87145id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(U u11) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u11, this);
            } else {
                this.parent.drain();
            }
        }

        public void requestMore(long j11) {
            if (this.fusionMode != 1) {
                long j12 = this.produced + j11;
                if (j12 < this.limit) {
                    this.produced = j12;
                } else {
                    this.produced = 0L;
                    get().request(j12);
                }
            }
        }

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j11) {
            this.f87145id = j11;
            this.parent = mergeSubscriber;
            int i11 = mergeSubscriber.bufferSize;
            this.bufferSize = i11;
            this.limit = i11 >> 2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                    }
                }
                interfaceC44418d.request(this.bufferSize);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC44417c<? super U> downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends InterfaceC44416b<? extends U>> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        InterfaceC44418d upstream;
        static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!C1454t.m2255a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeAll();
            if (getAndIncrement() != 0 || (simplePlainQueue = this.queue) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            clearScalarQueue();
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        public void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0153  */
        /* JADX WARN: Code duplicated, block: B:114:0x0177  */
        /* JADX WARN: Code duplicated, block: B:118:0x0181  */
        /* JADX WARN: Code duplicated, block: B:120:0x0185  */
        /* JADX WARN: Code duplicated, block: B:136:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:0x018d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:0x017f A[EDGE_INSN: B:156:0x017f->B:117:0x017f BREAK  A[LOOP:3: B:65:0x00d9->B:121:0x0186], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x0186 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x013a A[EDGE_INSN: B:163:0x013a->B:94:0x013a BREAK  A[LOOP:5: B:77:0x00f9->B:85:0x010f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00db  */
        /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:82:0x0104  */
        /* JADX WARN: Code duplicated, block: B:85:0x010f A[LOOP:5: B:77:0x00f9->B:85:0x010f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:96:0x013e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:97:0x0140  */
        /* JADX WARN: Code duplicated, block: B:98:0x0149  */
        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            boolean z11;
            long j11;
            long j12;
            boolean z12;
            long j13;
            int i11;
            boolean z13;
            int i12;
            InnerSubscriber<T, U> innerSubscriber;
            U uPoll;
            SimpleQueue<U> simpleQueue;
            boolean z14;
            Object obj;
            InterfaceC44417c<? super U> interfaceC44417c = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long jAddAndGet = this.requested.get();
                boolean z15 = jAddAndGet == Long.MAX_VALUE;
                long j14 = 0;
                if (simplePlainQueue != null) {
                    j11 = 0;
                    do {
                        long j15 = 0;
                        obj = null;
                        while (true) {
                            if (jAddAndGet == 0) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            U uPoll2 = simplePlainQueue.poll();
                            if (checkTerminate()) {
                                return;
                            }
                            if (uPoll2 == null) {
                                obj = uPoll2;
                                break;
                            }
                            interfaceC44417c.onNext(uPoll2);
                            j11++;
                            j15++;
                            jAddAndGet--;
                            obj = uPoll2;
                        }
                        if (j15 != 0) {
                            jAddAndGet = z15 ? Long.MAX_VALUE : this.requested.addAndGet(-j15);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                } else {
                    z11 = true;
                    j11 = 0;
                }
                boolean z16 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (z16 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable thTerminate = this.errs.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            interfaceC44417c.onComplete();
                            return;
                        } else {
                            interfaceC44417c.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j16 = this.lastId;
                    int i13 = this.lastIndex;
                    if (length > i13) {
                        j13 = 1;
                        if (innerSubscriberArr[i13].f87145id != j16) {
                        }
                        i11 = i13;
                        z13 = false;
                        i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                innerSubscriberArr = innerSubscriberArr;
                                j12 = j14;
                                break;
                            }
                            if (checkTerminate()) {
                                return;
                            }
                            innerSubscriber = innerSubscriberArr[i11];
                            uPoll = null;
                            while (!checkTerminate()) {
                                simpleQueue = innerSubscriber.queue;
                                if (simpleQueue == null) {
                                    innerSubscriberArr = innerSubscriberArr;
                                    j12 = j14;
                                } else {
                                    j12 = j14;
                                    while (jAddAndGet != j12) {
                                        try {
                                            uPoll = simpleQueue.poll();
                                            if (uPoll == null) {
                                                break;
                                            }
                                            interfaceC44417c.onNext(uPoll);
                                            if (checkTerminate()) {
                                                return;
                                            }
                                            jAddAndGet -= j13;
                                            j14 += j13;
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            innerSubscriber.dispose();
                                            this.errs.addThrowable(th2);
                                            if (!this.delayErrors) {
                                                this.upstream.cancel();
                                            }
                                            if (checkTerminate()) {
                                                return;
                                            }
                                            removeInner(innerSubscriber);
                                            i12++;
                                            innerSubscriberArr = innerSubscriberArr;
                                            z13 = z11;
                                        }
                                    }
                                    if (j14 != j12) {
                                        if (z15) {
                                            jAddAndGet = Long.MAX_VALUE;
                                        } else {
                                            jAddAndGet = this.requested.addAndGet(-j14);
                                        }
                                        innerSubscriber.requestMore(j14);
                                    } else {
                                        innerSubscriberArr = innerSubscriberArr;
                                    }
                                    if (jAddAndGet == j12 && uPoll != null) {
                                        innerSubscriberArr = innerSubscriberArr;
                                        j14 = j12;
                                    }
                                }
                                z14 = innerSubscriber.done;
                                SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                                if (z14 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                    removeInner(innerSubscriber);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    j11 += j13;
                                    z13 = z11;
                                }
                                if (jAddAndGet == j12) {
                                    break;
                                }
                                i11++;
                                if (i11 == length) {
                                    i11 = 0;
                                }
                                i12++;
                                innerSubscriberArr = innerSubscriberArr;
                                j14 = j12;
                            }
                            return;
                        }
                        z12 = z13;
                        this.lastIndex = i11;
                        this.lastId = innerSubscriberArr[i11].f87145id;
                    } else {
                        j13 = 1;
                    }
                    if (length <= i13) {
                        i13 = 0;
                    }
                    for (int i14 = 0; i14 < length && innerSubscriberArr[i13].f87145id != j16; i14++) {
                        i13++;
                        if (i13 == length) {
                            i13 = 0;
                        }
                    }
                    this.lastIndex = i13;
                    this.lastId = innerSubscriberArr[i13].f87145id;
                    i11 = i13;
                    z13 = false;
                    i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            innerSubscriberArr = innerSubscriberArr;
                            j12 = j14;
                            break;
                        }
                        if (checkTerminate()) {
                            return;
                        }
                        innerSubscriber = innerSubscriberArr[i11];
                        uPoll = null;
                        while (!checkTerminate()) {
                            simpleQueue = innerSubscriber.queue;
                            if (simpleQueue == null) {
                                innerSubscriberArr = innerSubscriberArr;
                                j12 = j14;
                            } else {
                                j12 = j14;
                                while (jAddAndGet != j12) {
                                    uPoll = simpleQueue.poll();
                                    if (uPoll == null) {
                                        break;
                                        break;
                                    }
                                    interfaceC44417c.onNext(uPoll);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    jAddAndGet -= j13;
                                    j14 += j13;
                                }
                                if (j14 != j12) {
                                    if (z15) {
                                        jAddAndGet = this.requested.addAndGet(-j14);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    innerSubscriber.requestMore(j14);
                                } else {
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (jAddAndGet == j12) {
                                }
                            }
                            z14 = innerSubscriber.done;
                            SimpleQueue<U> simpleQueue3 = innerSubscriber.queue;
                            if (z14) {
                                removeInner(innerSubscriber);
                                if (checkTerminate()) {
                                    return;
                                }
                                j11 += j13;
                                z13 = z11;
                            }
                            if (jAddAndGet == j12) {
                                break;
                                break;
                            }
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                            i12++;
                            innerSubscriberArr = innerSubscriberArr;
                            j14 = j12;
                        }
                        return;
                    }
                    z12 = z13;
                    this.lastIndex = i11;
                    this.lastId = innerSubscriberArr[i11].f87145id;
                } else {
                    j12 = 0;
                    z12 = false;
                }
                long j17 = j11;
                if (j17 != j12 && !this.cancelled) {
                    this.upstream.request(j17);
                }
                if (!z12 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                }
            }
        }

        public SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        public SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> spscLinkedArrayQueue = this.queue;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th2) {
            if (!this.errs.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            innerSubscriber.done = true;
            if (!this.delayErrors) {
                this.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber2.dispose();
                }
            }
            drain();
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
            } else if (!this.errs.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null Publisher");
                if (!(interfaceC44416b instanceof Callable)) {
                    long j11 = this.uniqueId;
                    this.uniqueId = 1 + j11;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j11);
                    if (addInner(innerSubscriber)) {
                        interfaceC44416b.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC44416b).call();
                    if (objCall != null) {
                        tryEmitScalar(objCall);
                        return;
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                        return;
                    }
                    int i11 = this.scalarEmitted + 1;
                    this.scalarEmitted = i11;
                    int i12 = this.scalarLimit;
                    if (i11 == i12) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i12);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.errs.addThrowable(th2);
                    drain();
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.upstream.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i11 = this.maxConcurrency;
                if (i11 == Integer.MAX_VALUE) {
                    interfaceC44418d.request(Long.MAX_VALUE);
                } else {
                    interfaceC44418d.request(i11);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (innerSubscriberArr[i11] == innerSubscriber) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i11);
                    System.arraycopy(innerSubscriberArr, i11 + 1, innerSubscriberArr3, i11, (length - i11) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!C1454t.m2255a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }

        public MergeSubscriber(InterfaceC44417c<? super U> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends U>> function, boolean z11, int i11, int i12) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.delayErrors = z11;
            this.maxConcurrency = i11;
            this.bufferSize = i12;
            this.scalarLimit = Math.max(1, i11 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }

        public void tryEmit(U u11, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j11 = this.requested.get();
                SimpleQueue<U> innerQueue = innerSubscriber.queue;
                if (j11 != 0 && (innerQueue == null || innerQueue.isEmpty())) {
                    this.downstream.onNext(u11);
                    if (j11 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                } else {
                    if (innerQueue == null) {
                        innerQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!innerQueue.offer(u11)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue = innerSubscriber.queue;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u11)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u11) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j11 = this.requested.get();
                SimpleQueue<U> mainQueue = this.queue;
                if (j11 != 0 && (mainQueue == null || mainQueue.isEmpty())) {
                    this.downstream.onNext(u11);
                    if (j11 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i11 = this.scalarEmitted + 1;
                        this.scalarEmitted = i11;
                        int i12 = this.scalarLimit;
                        if (i11 == i12) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i12);
                        }
                    }
                } else {
                    if (mainQueue == null) {
                        mainQueue = getMainQueue();
                    }
                    if (!mainQueue.offer(u11)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u11)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public static <T, U> FlowableSubscriber<T> subscribe(InterfaceC44417c<? super U> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends U>> function, boolean z11, int i11, int i12) {
        return new MergeSubscriber(interfaceC44417c, function, z11, i11, i12);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super U> interfaceC44417c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC44417c, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(interfaceC44417c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC44416b<? extends U>> function, boolean z11, int i11, int i12) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z11;
        this.maxConcurrency = i11;
        this.bufferSize = i12;
    }
}
