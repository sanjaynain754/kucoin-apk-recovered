package io.reactivex.internal.fuseable;

import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public interface QueueSubscription<T> extends QueueFuseable<T>, InterfaceC44418d {
    @Override // sh0.InterfaceC44418d
    /* synthetic */ void cancel();

    @Override // sh0.InterfaceC44418d
    /* synthetic */ void request(long j11);
}
