package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {
    final MaybeSource<? extends T>[] sources;

    public static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        int consumerIndex;
        final AtomicInteger producerIndex = new AtomicInteger();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11, T t12) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int consumerIndex() {
            return this.consumerIndex;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11) {
            this.producerIndex.getAndIncrement();
            return super.offer(t11);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int producerIndex() {
            return this.producerIndex.get();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public void drop() {
            poll();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T t11 = (T) super.poll();
            if (t11 != null) {
                this.consumerIndex++;
            }
            return t11;
        }
    }

    public static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = -660395290758764731L;
        volatile boolean cancelled;
        long consumed;
        final InterfaceC44417c<? super T> downstream;
        boolean outputFused;
        final SimpleQueueWithConsumerIndex<Object> queue;
        final int sourceCount;
        final CompositeDisposable set = new CompositeDisposable();
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable error = new AtomicThrowable();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.set.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drainFused() {
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                Throwable th2 = this.error.get();
                if (th2 != null) {
                    simpleQueueWithConsumerIndex.clear();
                    interfaceC44417c.onError(th2);
                    return;
                }
                boolean z11 = simpleQueueWithConsumerIndex.producerIndex() == this.sourceCount;
                if (!simpleQueueWithConsumerIndex.isEmpty()) {
                    interfaceC44417c.onNext(null);
                }
                if (z11) {
                    interfaceC44417c.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            simpleQueueWithConsumerIndex.clear();
        }

        public void drainNormal() {
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex = this.queue;
            long j11 = this.consumed;
            int iAddAndGet = 1;
            do {
                long j12 = this.requested.get();
                while (j11 != j12) {
                    if (this.cancelled) {
                        simpleQueueWithConsumerIndex.clear();
                        return;
                    }
                    if (this.error.get() != null) {
                        simpleQueueWithConsumerIndex.clear();
                        interfaceC44417c.onError(this.error.terminate());
                        return;
                    } else {
                        if (simpleQueueWithConsumerIndex.consumerIndex() == this.sourceCount) {
                            interfaceC44417c.onComplete();
                            return;
                        }
                        Object objPoll = simpleQueueWithConsumerIndex.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != NotificationLite.COMPLETE) {
                            interfaceC44417c.onNext(objPoll);
                            j11++;
                        }
                    }
                }
                if (j11 == j12) {
                    if (this.error.get() != null) {
                        simpleQueueWithConsumerIndex.clear();
                        interfaceC44417c.onError(this.error.terminate());
                        return;
                    } else {
                        while (simpleQueueWithConsumerIndex.peek() == NotificationLite.COMPLETE) {
                            simpleQueueWithConsumerIndex.drop();
                        }
                        if (simpleQueueWithConsumerIndex.consumerIndex() == this.sourceCount) {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                }
                this.consumed = j11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public boolean isCancelled() {
            return this.cancelled;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.set.dispose();
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.set.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            this.queue.offer(t11);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T t11;
            do {
                t11 = (T) this.queue.poll();
            } while (t11 == NotificationLite.COMPLETE);
            return t11;
        }

        public MergeMaybeObserver(InterfaceC44417c<? super T> interfaceC44417c, int i11, SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex) {
            this.downstream = interfaceC44417c;
            this.sourceCount = i11;
            this.queue = simpleQueueWithConsumerIndex;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
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

    public static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        int consumerIndex;
        final AtomicInteger producerIndex;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11) {
            ObjectHelper.requireNonNull(t11, "value is null");
            int andIncrement = this.producerIndex.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t11);
            return true;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int consumerIndex() {
            return this.consumerIndex;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public void drop() {
            int i11 = this.consumerIndex;
            lazySet(i11, null);
            this.consumerIndex = i11 + 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.consumerIndex == producerIndex();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public T peek() {
            int i11 = this.consumerIndex;
            if (i11 == length()) {
                return null;
            }
            return get(i11);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i11 = this.consumerIndex;
            if (i11 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.producerIndex;
            do {
                T t11 = get(i11);
                if (t11 != null) {
                    this.consumerIndex = i11 + 1;
                    lazySet(i11, null);
                    return t11;
                }
            } while (atomicInteger.get() != i11);
            return null;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int producerIndex() {
            return this.producerIndex.get();
        }

        public MpscFillOnceSimpleQueue(int i11) {
            super(i11);
            this.producerIndex = new AtomicInteger();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11, T t12) {
            throw new UnsupportedOperationException();
        }
    }

    public interface SimpleQueueWithConsumerIndex<T> extends SimpleQueue<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        T poll();

        int producerIndex();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        MaybeSource[] maybeSourceArr = this.sources;
        int length = maybeSourceArr.length;
        MergeMaybeObserver mergeMaybeObserver = new MergeMaybeObserver(interfaceC44417c, length, length <= Flowable.bufferSize() ? new MpscFillOnceSimpleQueue(length) : new ClqSimpleQueue());
        interfaceC44417c.onSubscribe(mergeMaybeObserver);
        AtomicThrowable atomicThrowable = mergeMaybeObserver.error;
        for (MaybeSource maybeSource : maybeSourceArr) {
            if (mergeMaybeObserver.isCancelled() || atomicThrowable.get() != null) {
                return;
            }
            maybeSource.subscribe(mergeMaybeObserver);
        }
    }

    public MaybeMergeArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }
}
