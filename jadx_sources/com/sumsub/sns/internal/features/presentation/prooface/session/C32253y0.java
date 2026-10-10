package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32253y0 implements InterfaceC32150D0 {

    /* JADX INFO: renamed from: a */
    public final C29894i f65709a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32253y0) && Intrinsics.areEqual(this.f65709a, ((C32253y0) obj).f65709a);
    }

    public final int hashCode() {
        return this.f65709a.hashCode();
    }

    public final String toString() {
        return "Completed(result=" + this.f65709a + ")";
    }

    public C32253y0(C29894i c29894i) {
        this.f65709a = c29894i;
    }
}
