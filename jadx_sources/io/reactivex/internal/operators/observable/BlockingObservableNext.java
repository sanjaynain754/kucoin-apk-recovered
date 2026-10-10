package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {
    final ObservableSource<T> source;

    public static final class NextIterator<T> implements Iterator<T> {
        private Throwable error;
        private boolean hasNext = true;
        private boolean isNextConsumed = true;
        private final ObservableSource<T> items;
        private T next;
        private final NextObserver<T> observer;
        private boolean started;

        private boolean moveToNext() {
            if (!this.started) {
                this.started = true;
                this.observer.setWaiting();
                new ObservableMaterialize(this.items).subscribe(this.observer);
            }
            try {
                Notification<T> notificationTakeNext = this.observer.takeNext();
                if (notificationTakeNext.isOnNext()) {
                    this.isNextConsumed = false;
                    this.next = notificationTakeNext.getValue();
                    return true;
                }
                this.hasNext = false;
                if (notificationTakeNext.isOnComplete()) {
                    return false;
                }
                Throwable error = notificationTakeNext.getError();
                this.error = error;
                throw ExceptionHelper.wrapOrThrow(error);
            } catch (InterruptedException e11) {
                this.observer.dispose();
                this.error = e11;
                throw ExceptionHelper.wrapOrThrow(e11);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.error;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (this.hasNext) {
                return !this.isNextConsumed || moveToNext();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.error;
            if (th2 != null) {
                throw ExceptionHelper.wrapOrThrow(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.isNextConsumed = true;
            return this.next;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }

        public NextIterator(ObservableSource<T> observableSource, NextObserver<T> nextObserver) {
            this.items = observableSource;
            this.observer = nextObserver;
        }
    }

    public static final class NextObserver<T> extends DisposableObserver<Notification<T>> {
        private final BlockingQueue<Notification<T>> buf = new ArrayBlockingQueue(1);
        final AtomicInteger waiting = new AtomicInteger();

        @Override // io.reactivex.Observer
        public void onNext(Notification<T> notification) {
            if (this.waiting.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.buf.offer(notification)) {
                    Notification<T> notificationPoll = this.buf.poll();
                    if (notificationPoll != null && !notificationPoll.isOnNext()) {
                        notification = notificationPoll;
                    }
                }
            }
        }

        public void setWaiting() {
            this.waiting.set(1);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        public Notification<T> takeNext() throws InterruptedException {
            setWaiting();
            BlockingHelper.verifyNonBlocking();
            return this.buf.take();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new NextIterator(this.source, new NextObserver());
    }

    public BlockingObservableNext(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
