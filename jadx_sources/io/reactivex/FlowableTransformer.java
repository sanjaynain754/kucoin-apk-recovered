package io.reactivex;

import io.reactivex.annotations.NonNull;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes23.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    InterfaceC44416b<Downstream> apply(@NonNull Flowable<Upstream> flowable);
}
