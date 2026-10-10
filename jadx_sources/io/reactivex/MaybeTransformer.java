package io.reactivex;

import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes60.dex */
public interface MaybeTransformer<Upstream, Downstream> {
    @NonNull
    MaybeSource<Downstream> apply(@NonNull Maybe<Upstream> maybe);
}
