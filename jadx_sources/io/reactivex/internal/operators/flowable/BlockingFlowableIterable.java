package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {
    final int bufferSize;
    final Flowable<T> source;

    public static final class BlockingFlowableIterator<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final long batchSize;
        final Condition condition;
        volatile boolean done;
        Throwable error;
        final long limit;
        final Lock lock;
        long produced;
        final SpscArrayQueue<T> queue;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z11 = this.done;
                boolean zIsEmpty = this.queue.isEmpty();
                if (z11) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        throw ExceptionHelper.wrapOrThrow(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                BlockingHelper.verifyNonBlocking();
                this.lock.lock();
                while (!this.done && this.queue.isEmpty()) {
                    try {
                        try {
                            this.condition.await();
                        } catch (InterruptedException e11) {
                            run();
                            throw ExceptionHelper.wrapOrThrow(e11);
                        }
                    } catch (Throwable th3) {
                        this.lock.unlock();
                        throw th3;
                    }
                }
                this.lock.unlock();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.queue.offer(t11)) {
                signalConsumer();
            } else {
                SubscriptionHelper.cancel(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, this.batchSize);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        public BlockingFlowableIterator(int i11) {
            this.queue = new SpscArrayQueue<>(i11);
            this.batchSize = i11;
            this.limit = i11 - (i11 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
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

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tPoll = this.queue.poll();
                long j11 = this.produced + 1;
                if (j11 == this.limit) {
                    this.produced = 0L;
                    get().request(j11);
                    return tPoll;
                }
                this.produced = j11;
                return tPoll;
            }
            throw new NoSuchElementException();
        }

        @Override // java.lang.Runnable
        public void run() {
            SubscriptionHelper.cancel(this);
            signalConsumer();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingFlowableIterator blockingFlowableIterator = new BlockingFlowableIterator(this.bufferSize);
        this.source.subscribe((FlowableSubscriber) blockingFlowableIterator);
        return blockingFlowableIterator;
    }

    public BlockingFlowableIterable(Flowable<T> flowable, int i11) {
        this.source = flowable;
        this.bufferSize = i11;
    }
}
