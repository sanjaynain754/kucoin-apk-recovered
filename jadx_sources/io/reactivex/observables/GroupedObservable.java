package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

/* JADX INFO: loaded from: classes60.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {
    final K key;

    @Nullable
    public K getKey() {
        return this.key;
    }

    public GroupedObservable(@Nullable K k11) {
        this.key = k11;
    }
}
