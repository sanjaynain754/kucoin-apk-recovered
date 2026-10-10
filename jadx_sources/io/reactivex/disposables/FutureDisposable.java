package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements Disposable {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.allowInterrupt);
        }
    }

    public FutureDisposable(Future<?> future, boolean z11) {
        super(future);
        this.allowInterrupt = z11;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        Future<?> future = get();
        if (future != null && !future.isDone()) {
            return false;
        }
        return true;
    }
}
