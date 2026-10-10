package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (this.value == null) {
            this.error = th2;
        }
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t11) {
        if (this.value == null) {
            this.value = t11;
            this.upstream.dispose();
            countDown();
        }
    }
}
