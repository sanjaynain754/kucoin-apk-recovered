package com.sumsub.sns.internal.features.presentation.main.navigation;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31309e implements InterfaceC31310f {

    /* JADX INFO: renamed from: a */
    public final String f63449a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31309e) && Intrinsics.areEqual(this.f63449a, ((C31309e) obj).f63449a);
    }

    public final int hashCode() {
        return this.f63449a.hashCode();
    }

    public final String toString() {
        return "StepInitiated(idDocSetType=" + this.f63449a + ")";
    }

    public C31309e(String str) {
        this.f63449a = str;
    }
}
