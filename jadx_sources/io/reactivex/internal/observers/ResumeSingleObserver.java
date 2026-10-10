package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {
    final SingleObserver<? super T> downstream;
    final AtomicReference<Disposable> parent;

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.downstream.onError(th2);
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.parent, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t11) {
        this.downstream.onSuccess(t11);
    }

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.parent = atomicReference;
        this.downstream = singleObserver;
    }
}
