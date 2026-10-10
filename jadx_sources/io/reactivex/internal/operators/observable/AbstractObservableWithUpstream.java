package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* JADX INFO: loaded from: classes23.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> implements HasUpstreamObservableSource<T> {
    protected final ObservableSource<T> source;

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final ObservableSource<T> source() {
        return this.source;
    }

    public AbstractObservableWithUpstream(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
