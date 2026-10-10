package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.value = null;
        this.error = th2;
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t11) {
        this.value = t11;
    }
}
