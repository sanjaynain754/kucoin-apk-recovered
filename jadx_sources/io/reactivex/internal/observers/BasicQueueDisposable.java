package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BasicQueueDisposable<T> implements QueueDisposable<T> {
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t11, T t12) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
