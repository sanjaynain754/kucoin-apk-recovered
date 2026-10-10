package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
final class SubscriptionDisposable extends ReferenceDisposable<InterfaceC44418d> {
    private static final long serialVersionUID = -707001650852963139L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull InterfaceC44418d interfaceC44418d) {
        interfaceC44418d.cancel();
    }

    public SubscriptionDisposable(InterfaceC44418d interfaceC44418d) {
        super(interfaceC44418d);
    }
}
