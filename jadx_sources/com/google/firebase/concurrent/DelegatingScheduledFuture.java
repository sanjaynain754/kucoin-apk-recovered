package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"RestrictedApi"})
class DelegatingScheduledFuture<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {
    private final ScheduledFuture<?> upstreamFuture;

    public interface Completer<T> {
        void set(T t11);

        void setException(Throwable th2);
    }

    public interface Resolver<T> {
        ScheduledFuture<?> addCompleter(Completer<T> completer);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public void afterDone() {
        this.upstreamFuture.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }

    public DelegatingScheduledFuture(Resolver<V> resolver) {
        this.upstreamFuture = resolver.addCompleter(new Completer<V>() { // from class: com.google.firebase.concurrent.DelegatingScheduledFuture.1
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void set(V v11) {
                DelegatingScheduledFuture.this.set(v11);
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void setException(Throwable th2) {
                DelegatingScheduledFuture.this.setException(th2);
            }
        });
    }
}
