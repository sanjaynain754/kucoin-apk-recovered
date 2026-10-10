package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31642p0 implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f64249a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31642p0) && Intrinsics.areEqual(this.f64249a, ((C31642p0) obj).f64249a);
    }

    public final int hashCode() {
        return this.f64249a.hashCode();
    }

    public final String toString() {
        return "SuccessEvent(resultToken=" + this.f64249a + ")";
    }
}
