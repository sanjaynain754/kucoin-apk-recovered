package com.kubi.utils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: com.kubi.utils.s0 */
/* JADX INFO: compiled from: SimpleObserver.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27086s0<T> implements Observer<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        th2.printStackTrace();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // io.reactivex.Observer
    public void onNext(T t11) {
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }
}
