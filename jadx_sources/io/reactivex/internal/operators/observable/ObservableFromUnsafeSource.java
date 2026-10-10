package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {
    final ObservableSource<T> source;

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(observer);
    }

    public ObservableFromUnsafeSource(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
