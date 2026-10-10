package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    private SettableFuture() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean set(@ParametricNullness V v11) {
        return super.set(v11);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean setException(Throwable th2) {
        return super.setException(th2);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
