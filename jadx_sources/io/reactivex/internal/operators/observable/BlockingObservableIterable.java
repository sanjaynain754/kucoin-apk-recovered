package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {
    final int bufferSize;
    final ObservableSource<? extends T> source;

    public static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        Throwable error;
        final Lock lock;
        final SpscLinkedArrayQueue<T> queue;

        @Override // io.reactivex.Observer
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
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty()) {
                        try {
                            this.condition.await();
                        } catch (Throwable th3) {
                            this.lock.unlock();
                            throw th3;
                        }
                    }
                    this.lock.unlock();
                } catch (InterruptedException e11) {
                    DisposableHelper.dispose(this);
                    signalConsumer();
                    throw ExceptionHelper.wrapOrThrow(e11);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.queue.offer(t11);
            signalConsumer();
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

        public BlockingObservableIterator(int i11) {
            this.queue = new SpscLinkedArrayQueue<>(i11);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.bufferSize);
        this.source.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }

    public BlockingObservableIterable(ObservableSource<? extends T> observableSource, int i11) {
        this.source = observableSource;
        this.bufferSize = i11;
    }
}
