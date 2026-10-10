package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30301z;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31321q implements InterfaceC31322r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30301z f63481a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31321q) && Intrinsics.areEqual(this.f63481a, ((C31321q) obj).f63481a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.navigation.InterfaceC31322r
    public final InterfaceC30301z getType() {
        return this.f63481a;
    }

    public final int hashCode() {
        return this.f63481a.hashCode();
    }

    public final String toString() {
        return "UnsupportedStep(type=" + this.f63481a + ")";
    }

    public C31321q(InterfaceC30301z interfaceC30301z) {
        this.f63481a = interfaceC30301z;
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.navigation.InterfaceC31322r
    /* JADX INFO: renamed from: a */
    public final Exception mo70680a() {
        return AbstractC31319o.m70679a(this);
    }
}
