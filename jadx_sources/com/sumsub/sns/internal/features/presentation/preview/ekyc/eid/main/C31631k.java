package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.AbstractC31555h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31631k implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final AbstractC31555h f64239a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31631k) && Intrinsics.areEqual(this.f64239a, ((C31631k) obj).f64239a);
    }

    public final int hashCode() {
        return this.f64239a.hashCode();
    }

    public final String toString() {
        return "AuthadaInteractionEvent(interaction=" + this.f64239a + ")";
    }

    public C31631k(AbstractC31555h abstractC31555h) {
        this.f64239a = abstractC31555h;
    }
}
