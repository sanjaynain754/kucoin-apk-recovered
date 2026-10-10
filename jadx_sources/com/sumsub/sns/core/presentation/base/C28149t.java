package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.presentation.result.C32363c;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28149t implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C32363c f57388a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28149t) && Intrinsics.areEqual(this.f57388a, ((C28149t) obj).f57388a);
    }

    public final int hashCode() {
        return this.f57388a.hashCode();
    }

    public final String toString() {
        return "ShowFinishResultEvent(result=" + this.f57388a + ")";
    }

    public C28149t(C32363c c32363c) {
        this.f57388a = c32363c;
    }
}
