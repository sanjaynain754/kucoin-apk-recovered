package com.sumsub.sns.internal.features.domain.navigation.model;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30278c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30301z f60873a;

    /* JADX INFO: renamed from: b */
    public final C30273B f60874b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30290o f60875c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30278c)) {
            return false;
        }
        C30278c c30278c = (C30278c) obj;
        return Intrinsics.areEqual(this.f60873a, c30278c.f60873a) && Intrinsics.areEqual(this.f60874b, c30278c.f60874b);
    }

    public final int hashCode() {
        return this.f60874b.hashCode() + (this.f60873a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkNavigationStep(stepType=" + this.f60873a + ", data=" + this.f60874b + ")";
    }

    public C30278c(InterfaceC30301z interfaceC30301z, C30273B c30273b) {
        InterfaceC30290o interfaceC30290o;
        this.f60873a = interfaceC30301z;
        this.f60874b = c30273b;
        if (interfaceC30301z instanceof InterfaceC30290o) {
            interfaceC30290o = (InterfaceC30290o) interfaceC30301z;
        } else {
            interfaceC30290o = null;
        }
        this.f60875c = interfaceC30290o;
    }
}
