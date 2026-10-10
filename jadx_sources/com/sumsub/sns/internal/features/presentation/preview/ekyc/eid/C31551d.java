package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import de.authada.library.api.Can;
import de.authada.library.api.authentication.Pin;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31551d extends AbstractC31555h {

    /* JADX INFO: renamed from: a */
    public final Pin f64063a;

    /* JADX INFO: renamed from: b */
    public final Can f64064b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC31556i f64065c;

    /* JADX INFO: renamed from: d */
    public final Function1 f64066d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31551d)) {
            return false;
        }
        C31551d c31551d = (C31551d) obj;
        return Intrinsics.areEqual(this.f64063a, c31551d.f64063a) && Intrinsics.areEqual(this.f64064b, c31551d.f64064b) && Intrinsics.areEqual(this.f64065c, c31551d.f64065c) && Intrinsics.areEqual(this.f64066d, c31551d.f64066d);
    }

    public final int hashCode() {
        int iHashCode = this.f64063a.hashCode() * 31;
        Can can = this.f64064b;
        return this.f64066d.hashCode() + ((this.f64065c.hashCode() + ((iHashCode + (can == null ? 0 : can.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "PinAuthentication(pin=" + this.f64063a + ", can=" + this.f64064b + ", callback=" + this.f64065c + ", errorCallback=" + this.f64066d + ")";
    }

    public C31551d(Pin pin, Can can, InterfaceC31556i interfaceC31556i, Function1 function1) {
        this.f64063a = pin;
        this.f64064b = can;
        this.f64065c = interfaceC31556i;
        this.f64066d = function1;
    }
}
