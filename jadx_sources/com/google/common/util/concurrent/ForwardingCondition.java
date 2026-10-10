package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
abstract class ForwardingCondition implements Condition {
    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        delegate().await();
    }

    public abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j11, TimeUnit timeUnit) throws InterruptedException {
        return delegate().await(j11, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j11) throws InterruptedException {
        return delegate().awaitNanos(j11);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return delegate().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        delegate().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        delegate().signalAll();
    }
}
