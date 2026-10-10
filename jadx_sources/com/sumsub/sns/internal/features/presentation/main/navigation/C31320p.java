package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30301z;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31320p implements InterfaceC31322r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30301z f63480a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31320p) && Intrinsics.areEqual(this.f63480a, ((C31320p) obj).f63480a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.navigation.InterfaceC31322r
    public final InterfaceC30301z getType() {
        return this.f63480a;
    }

    public final int hashCode() {
        return this.f63480a.hashCode();
    }

    public final String toString() {
        return "OptionalModuleNotFound(type=" + this.f63480a + ")";
    }

    public C31320p(InterfaceC30301z interfaceC30301z) {
        this.f63480a = interfaceC30301z;
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.navigation.InterfaceC31322r
    /* JADX INFO: renamed from: a */
    public final Exception mo70680a() {
        return AbstractC31319o.m70679a(this);
    }
}
