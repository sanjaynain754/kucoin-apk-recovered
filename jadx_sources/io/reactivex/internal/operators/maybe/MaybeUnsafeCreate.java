package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeUnsafeCreate<T> extends AbstractMaybeWithUpstream<T, T> {
    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(maybeObserver);
    }

    public MaybeUnsafeCreate(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }
}
