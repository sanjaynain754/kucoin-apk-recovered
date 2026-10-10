package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes23.dex */
public interface Observer<T> {
    void onComplete();

    void onError(@NonNull Throwable th2);

    void onNext(@NonNull T t11);

    void onSubscribe(@NonNull Disposable disposable);
}
