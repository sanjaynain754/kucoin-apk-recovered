package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31698w implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f64327a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31698w) && Intrinsics.areEqual(this.f64327a, ((C31698w) obj).f64327a);
    }

    public final int hashCode() {
        String str = this.f64327a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "RepeatPinError(text=" + this.f64327a + ")";
    }

    public C31698w(String str) {
        this.f64327a = str;
    }
}
