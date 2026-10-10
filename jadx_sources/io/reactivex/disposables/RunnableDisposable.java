package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes60.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }
}
