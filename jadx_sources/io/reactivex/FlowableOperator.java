package io.reactivex;

import io.reactivex.annotations.NonNull;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public interface FlowableOperator<Downstream, Upstream> {
    @NonNull
    InterfaceC44417c<? super Upstream> apply(@NonNull InterfaceC44417c<? super Downstream> interfaceC44417c) throws Exception;
}
