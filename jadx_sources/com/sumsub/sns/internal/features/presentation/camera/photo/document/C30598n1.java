package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.n1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30598n1 implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Function0 f61812a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30598n1) && Intrinsics.areEqual(this.f61812a, ((C30598n1) obj).f61812a);
    }

    public final int hashCode() {
        return this.f61812a.hashCode();
    }

    public final String toString() {
        return "ShowPhotoMadeAnimation(finishCallback=" + this.f61812a + ")";
    }

    public C30598n1(Function0 function0) {
        this.f61812a = function0;
    }
}
