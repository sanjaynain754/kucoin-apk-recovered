package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes60.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> implements HasUpstreamPublisher<T> {
    protected final Flowable<T> source;

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final InterfaceC44416b<T> source() {
        return this.source;
    }

    public AbstractFlowableWithUpstream(Flowable<T> flowable) {
        this.source = (Flowable) ObjectHelper.requireNonNull(flowable, "source is null");
    }
}
