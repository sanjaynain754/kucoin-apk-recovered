package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes60.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, InterfaceC44416b<Object>> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, InterfaceC44416b<T>> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public InterfaceC44416b<Object> apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
