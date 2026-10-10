package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;

/* JADX INFO: loaded from: classes60.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {
    final K key;

    @Nullable
    public K getKey() {
        return this.key;
    }

    public GroupedFlowable(@Nullable K k11) {
        this.key = k11;
    }
}
