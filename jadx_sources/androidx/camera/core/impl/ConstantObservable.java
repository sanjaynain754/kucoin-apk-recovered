package androidx.camera.core.impl;

import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final ListenableFuture<T> mValueFuture;

    public static <U> Observable<U> withValue(U u11) {
        return u11 == null ? NULL_OBSERVABLE : new ConstantObservable(u11);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, final Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.t
            @Override // java.lang.Runnable
            public final void run() {
                ConstantObservable.m1951a(this.f1692b, observer);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public ListenableFuture<T> fetchData() {
        return this.mValueFuture;
    }

    private ConstantObservable(T t11) {
        this.mValueFuture = Futures.immediateFuture(t11);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1951a(ConstantObservable constantObservable, Observable.Observer observer) {
        constantObservable.getClass();
        try {
            observer.onNewData(constantObservable.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e11) {
            observer.onError(e11);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
    }
}
