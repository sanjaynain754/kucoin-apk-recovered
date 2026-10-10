package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.u3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29651u3 {
    @NotNull
    public final InterfaceC44951d<SNSMessage$ServerMessage$Type> serializer() {
        return (InterfaceC44951d) SNSMessage$ServerMessage$Type.$cachedSerializer$delegate.getValue();
    }
}
