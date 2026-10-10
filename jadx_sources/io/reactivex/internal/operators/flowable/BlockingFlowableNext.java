package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {
    final InterfaceC44416b<? extends T> source;

    public static final class NextIterator<T> implements Iterator<T> {
        private Throwable error;
        private boolean hasNext = true;
        private boolean isNextConsumed = true;
        private final InterfaceC44416b<? extends T> items;
        private T next;
        private boolean started;
        private final NextSubscriber<T> subscriber;

        private boolean moveToNext() {
            try {
                if (!this.started) {
                    this.started = true;
                    this.subscriber.setWaiting();
                    Flowable.fromPublisher(this.items).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) this.subscriber);
                }
                Notification<T> notificationTakeNext = this.subscriber.takeNext();
                if (notificationTakeNext.isOnNext()) {
                    this.isNextConsumed = false;
                    this.next = notificationTakeNext.getValue();
                    return true;
                }
                this.hasNext = false;
                if (notificationTakeNext.isOnComplete()) {
                    return false;
                }
                if (!notificationTakeNext.isOnError()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable error = notificationTakeNext.getError();
                this.error = error;
                throw ExceptionHelper.wrapOrThrow(error);
            } catch (InterruptedException e11) {
                this.subscriber.dispose();
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

        public NextIterator(InterfaceC44416b<? extends T> interfaceC44416b, NextSubscriber<T> nextSubscriber) {
            this.items = interfaceC44416b;
            this.subscriber = nextSubscriber;
        }
    }

    public static final class NextSubscriber<T> extends DisposableSubscriber<Notification<T>> {
        private final BlockingQueue<Notification<T>> buf = new ArrayBlockingQueue(1);
        final AtomicInteger waiting = new AtomicInteger();

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
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

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        public Notification<T> takeNext() throws InterruptedException {
            setWaiting();
            BlockingHelper.verifyNonBlocking();
            return this.buf.take();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new NextIterator(this.source, new NextSubscriber());
    }

    public BlockingFlowableNext(InterfaceC44416b<? extends T> interfaceC44416b) {
        this.source = interfaceC44416b;
    }
}
