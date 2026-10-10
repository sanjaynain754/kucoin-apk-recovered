package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.observers.SerializedObserver;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableSerialized<T> extends AbstractObservableWithUpstream<T, T> {
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new SerializedObserver(observer));
    }

    public ObservableSerialized(Observable<T> observable) {
        super(observable);
    }
}
