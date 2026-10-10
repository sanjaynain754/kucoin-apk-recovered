package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.domain.navigation.model.C30272A;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31307c implements InterfaceC31310f {

    /* JADX INFO: renamed from: a */
    public final C30272A f63445a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31307c) && Intrinsics.areEqual(this.f63445a, ((C31307c) obj).f63445a);
    }

    public final int hashCode() {
        return this.f63445a.hashCode();
    }

    public final String toString() {
        return "ParamsReceived(params=" + this.f63445a + ")";
    }

    public C31307c(C30272A c30272a) {
        this.f63445a = c30272a;
    }
}
