package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30519a0 implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Function0 f61632a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30519a0) && Intrinsics.areEqual(this.f61632a, ((C30519a0) obj).f61632a);
    }

    public final int hashCode() {
        return this.f61632a.hashCode();
    }

    public final String toString() {
        return "ShowPhotoMadeAnimation(finishCallback=" + this.f61632a + ")";
    }

    public C30519a0(Function0 function0) {
        this.f61632a = function0;
    }
}
