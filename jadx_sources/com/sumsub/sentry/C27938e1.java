package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sentry.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27938e1 {
    @NotNull
    public final InterfaceC44951d<SpanStatus> serializer() {
        return (InterfaceC44951d) SpanStatus.$cachedSerializer$delegate.getValue();
    }
}
