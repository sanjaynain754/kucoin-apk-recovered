package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31563B0;
import de.authada.library.api.Can;
import de.authada.library.api.authentication.Pin;
import de.authada.library.api.pinChanger.TPin;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31552e extends AbstractC31555h {

    /* JADX INFO: renamed from: a */
    public final TPin f64067a;

    /* JADX INFO: renamed from: b */
    public final Pin f64068b;

    /* JADX INFO: renamed from: c */
    public final Can f64069c;

    /* JADX INFO: renamed from: d */
    public final Integer f64070d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC31557j f64071e;

    /* JADX INFO: renamed from: f */
    public final Function1 f64072f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31552e)) {
            return false;
        }
        C31552e c31552e = (C31552e) obj;
        return Intrinsics.areEqual(this.f64067a, c31552e.f64067a) && Intrinsics.areEqual(this.f64068b, c31552e.f64068b) && Intrinsics.areEqual(this.f64069c, c31552e.f64069c) && Intrinsics.areEqual(this.f64070d, c31552e.f64070d) && Intrinsics.areEqual(this.f64071e, c31552e.f64071e) && Intrinsics.areEqual(this.f64072f, c31552e.f64072f);
    }

    public final int hashCode() {
        int iHashCode = (this.f64068b.hashCode() + (this.f64067a.hashCode() * 31)) * 31;
        Can can = this.f64069c;
        int iHashCode2 = (iHashCode + (can == null ? 0 : can.hashCode())) * 31;
        Integer num = this.f64070d;
        return this.f64072f.hashCode() + ((this.f64071e.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PinChange(oldPin=" + this.f64067a + ", newPin=" + this.f64068b + ", can=" + this.f64069c + ", lastPinDigit=" + this.f64070d + ", callback=" + this.f64071e + ", errorCallback=" + this.f64072f + ")";
    }

    public C31552e(TPin tPin, Pin pin, Can can, Integer num, C31563B0 c31563b0, Function1 function1) {
        this.f64067a = tPin;
        this.f64068b = pin;
        this.f64069c = can;
        this.f64070d = num;
        this.f64071e = c31563b0;
        this.f64072f = function1;
    }
}
