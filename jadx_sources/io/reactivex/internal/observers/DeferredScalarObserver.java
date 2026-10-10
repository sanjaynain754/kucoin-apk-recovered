package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes60.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected Disposable upstream;

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.value = null;
        error(th2);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        T t11 = this.value;
        if (t11 == null) {
            complete();
        } else {
            this.value = null;
            complete(t11);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public DeferredScalarObserver(Observer<? super R> observer) {
        super(observer);
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }
}
