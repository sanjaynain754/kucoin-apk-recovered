package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.domain.documents.C30110D;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30842s implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C30110D f62288a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30842s) && Intrinsics.areEqual(this.f62288a, ((C30842s) obj).f62288a);
    }

    public final int hashCode() {
        return this.f62288a.hashCode();
    }

    public final String toString() {
        return "RequestPhotoPreview(photo=" + this.f62288a + ")";
    }

    public C30842s(C30110D c30110d) {
        this.f62288a = c30110d;
    }
}
