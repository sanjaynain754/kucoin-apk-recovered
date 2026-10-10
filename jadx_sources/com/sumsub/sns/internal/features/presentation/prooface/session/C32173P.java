package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32173P implements InterfaceC32175Q {

    /* JADX INFO: renamed from: a */
    public final C32205d1 f65517a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32173P) && Intrinsics.areEqual(this.f65517a, ((C32173P) obj).f65517a);
    }

    public final int hashCode() {
        return this.f65517a.hashCode();
    }

    public final String toString() {
        return "Success(params=" + this.f65517a + ")";
    }

    public C32173P(C32205d1 c32205d1) {
        this.f65517a = c32205d1;
    }
}
