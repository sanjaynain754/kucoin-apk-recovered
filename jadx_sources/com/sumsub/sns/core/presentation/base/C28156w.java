package com.sumsub.sns.core.presentation.base;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28156w implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f57400a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28156w) && Intrinsics.areEqual(this.f57400a, ((C28156w) obj).f57400a);
    }

    public final int hashCode() {
        return this.f57400a.hashCode();
    }

    public final String toString() {
        return "ShowToast(message=" + this.f57400a + ")";
    }

    public C28156w(String str) {
        this.f57400a = str;
    }
}
