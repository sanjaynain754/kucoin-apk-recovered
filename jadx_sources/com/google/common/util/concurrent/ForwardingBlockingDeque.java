package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return delegate().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i11) {
        return delegate().drainTo(collection, i11);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e11, long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offer(e11, j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e11, long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offerFirst(e11, j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e11, long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offerLast(e11, j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().poll(j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().pollFirst(j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().pollLast(j11, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e11) throws InterruptedException {
        delegate().put(e11);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e11) throws InterruptedException {
        delegate().putFirst(e11);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e11) throws InterruptedException {
        delegate().putLast(e11);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return delegate().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return delegate().takeLast();
    }
}
