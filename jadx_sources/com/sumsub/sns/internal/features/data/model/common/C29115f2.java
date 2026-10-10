package com.sumsub.sns.internal.features.data.model.common;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.f2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29115f2 {
    /* JADX INFO: renamed from: a */
    public static IdentitySide m69768a(String str) {
        for (IdentitySide identitySide : IdentitySide.values()) {
            if (Intrinsics.areEqual(identitySide.getValue(), str)) {
                return identitySide;
            }
        }
        return null;
    }

    @NotNull
    public final InterfaceC44951d<IdentitySide> serializer() {
        return (InterfaceC44951d) IdentitySide.$cachedSerializer$delegate.getValue();
    }
}
