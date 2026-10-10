package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.core.analytics.Control;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32520f {

    /* JADX INFO: renamed from: a */
    public final Control f66343a;

    /* JADX INFO: renamed from: b */
    public final AbstractC32484N f66344b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32520f)) {
            return false;
        }
        C32520f c32520f = (C32520f) obj;
        return this.f66343a == c32520f.f66343a && Intrinsics.areEqual(this.f66344b, c32520f.f66344b);
    }

    public final int hashCode() {
        Control control = this.f66343a;
        return this.f66344b.hashCode() + ((control == null ? 0 : control.hashCode()) * 31);
    }

    public final String toString() {
        return "SNSSumsubIdClickAction(control=" + this.f66343a + ", intent=" + this.f66344b + ")";
    }

    public C32520f(Control control, AbstractC32484N abstractC32484N) {
        this.f66343a = control;
        this.f66344b = abstractC32484N;
    }
}
