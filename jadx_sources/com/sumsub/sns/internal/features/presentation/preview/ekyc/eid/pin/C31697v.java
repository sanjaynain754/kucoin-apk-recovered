package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31697v implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C31688m f64326a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31697v) && Intrinsics.areEqual(this.f64326a, ((C31697v) obj).f64326a);
    }

    public final int hashCode() {
        return this.f64326a.hashCode();
    }

    public final String toString() {
        return "PinSuccessEvent(result=" + this.f64326a + ")";
    }

    public C31697v(C31688m c31688m) {
        this.f64326a = c31688m;
    }
}
