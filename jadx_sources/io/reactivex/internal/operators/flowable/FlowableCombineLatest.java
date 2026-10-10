package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final InterfaceC44416b<? extends T>[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends InterfaceC44416b<? extends T>> iterable;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void innerComplete(int i11) {
            int i12;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i11] != null && (i12 = this.completedSources + 1) != objArr.length) {
                        this.completedSources = i12;
                    } else {
                        this.done = true;
                        drain();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void innerValue(int i11, T t11) {
            boolean z11;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i12 = this.nonEmptySources;
                    if (objArr[i11] == null) {
                        i12++;
                        this.nonEmptySources = i12;
                    }
                    objArr[i11] = t11;
                    if (objArr.length == i12) {
                        this.queue.offer(this.subscribers[i11], objArr.clone());
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                this.subscribers[i11].requestOne();
            } else {
                drain();
            }
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.delayErrors) {
                if (!z12) {
                    return false;
                }
                cancelAll();
                Throwable thTerminate = ExceptionHelper.terminate(this.error);
                if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                    interfaceC44417c.onComplete();
                } else {
                    interfaceC44417c.onError(thTerminate);
                }
                return true;
            }
            Throwable thTerminate2 = ExceptionHelper.terminate(this.error);
            if (thTerminate2 != null && thTerminate2 != ExceptionHelper.TERMINATED) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                interfaceC44417c.onError(thTerminate2);
                return true;
            }
            if (!z12) {
                return false;
            }
            cancelAll();
            interfaceC44417c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drainAsync() {
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.done;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z12 = objPoll == null;
                    if (checkTerminated(z11, z12, interfaceC44417c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    try {
                        interfaceC44417c.onNext((Object) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) objPoll).requestOne();
                        j12++;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th2);
                        interfaceC44417c.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j12 == j11 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC44417c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void drainOutput() {
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                Throwable th2 = this.error.get();
                if (th2 != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC44417c.onError(th2);
                    return;
                }
                boolean z11 = this.done;
                boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                if (!zIsEmpty) {
                    interfaceC44417c.onNext(null);
                }
                if (z11 && zIsEmpty) {
                    interfaceC44417c.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void innerError(int i11, Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.error, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                if (this.delayErrors) {
                    innerComplete(i11);
                    return;
                }
                cancelAll();
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Object objPoll = this.queue.poll();
            if (objPoll == null) {
                return null;
            }
            R r11 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).requestOne();
            return r11;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 4) != 0) {
                return 0;
            }
            int i12 = i11 & 2;
            this.outputFused = i12 != 0;
            return i12;
        }

        public void subscribe(InterfaceC44416b<? extends T>[] interfaceC44416bArr, int i11) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i12 = 0; i12 < i11 && !this.done && !this.cancelled; i12++) {
                interfaceC44416bArr[i12].subscribe(combineLatestInnerSubscriberArr[i12]);
            }
        }

        public CombineLatestCoordinator(InterfaceC44417c<? super R> interfaceC44417c, Function<? super Object[], ? extends R> function, int i11, int i12, boolean z11) {
            this.downstream = interfaceC44417c;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                combineLatestInnerSubscriberArr[i13] = new CombineLatestInnerSubscriber<>(this, i13, i12);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i11];
            this.queue = new SpscLinkedArrayQueue<>(i12);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z11;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.parent.innerValue(this.index, t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, this.prefetch);
        }

        public void requestOne() {
            int i11 = this.produced + 1;
            if (i11 != this.limit) {
                this.produced = i11;
            } else {
                this.produced = 0;
                get().request(i11);
            }
        }

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i11, int i12) {
            this.parent = combineLatestCoordinator;
            this.index = i11;
            this.prefetch = i12;
            this.limit = i12 - (i12 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
    }

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t11});
        }
    }

    public FlowableCombineLatest(@NonNull InterfaceC44416b<? extends T>[] interfaceC44416bArr, @NonNull Function<? super Object[], ? extends R> function, int i11, boolean z11) {
        this.array = interfaceC44416bArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i11;
        this.delayErrors = z11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        int length;
        InterfaceC44416b<? extends T>[] interfaceC44416bArr = this.array;
        if (interfaceC44416bArr == null) {
            interfaceC44416bArr = new InterfaceC44416b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            InterfaceC44416b<? extends T> interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == interfaceC44416bArr.length) {
                                InterfaceC44416b<? extends T>[] interfaceC44416bArr2 = new InterfaceC44416b[(length >> 2) + length];
                                System.arraycopy(interfaceC44416bArr, 0, interfaceC44416bArr2, 0, length);
                                interfaceC44416bArr = interfaceC44416bArr2;
                            }
                            interfaceC44416bArr[length] = interfaceC44416b;
                            length++;
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            EmptySubscription.error(th2, interfaceC44417c);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        EmptySubscription.error(th3, interfaceC44417c);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                EmptySubscription.error(th4, interfaceC44417c);
                return;
            }
        } else {
            length = interfaceC44416bArr.length;
        }
        int i11 = length;
        if (i11 == 0) {
            EmptySubscription.complete(interfaceC44417c);
        } else {
            if (i11 == 1) {
                interfaceC44416bArr[0].subscribe(new FlowableMap.MapSubscriber(interfaceC44417c, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(interfaceC44417c, this.combiner, i11, this.bufferSize, this.delayErrors);
            interfaceC44417c.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(interfaceC44416bArr, i11);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends InterfaceC44416b<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i11, boolean z11) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i11;
        this.delayErrors = z11;
    }
}
