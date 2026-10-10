package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31407n extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final String f63636a;

    /* JADX INFO: renamed from: b */
    public final String f63637b;

    /* JADX INFO: renamed from: c */
    public final String f63638c;

    /* JADX INFO: renamed from: d */
    public final boolean f63639d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f63640e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31407n)) {
            return false;
        }
        C31407n c31407n = (C31407n) obj;
        return Intrinsics.areEqual(this.f63636a, c31407n.f63636a) && Intrinsics.areEqual(this.f63637b, c31407n.f63637b) && Intrinsics.areEqual(this.f63638c, c31407n.f63638c) && this.f63639d == c31407n.f63639d && Intrinsics.areEqual(this.f63640e, c31407n.f63640e);
    }

    public final int hashCode() {
        return this.f63640e.hashCode() + AbstractC27920h.m69001a(this.f63639d, (this.f63638c.hashCode() + ((this.f63637b.hashCode() + (this.f63636a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        String str = this.f63636a;
        String str2 = this.f63637b;
        String str3 = this.f63638c;
        return "ViewState(title=" + ((Object) str) + ", sectionHeader=" + ((Object) str2) + ", continueButtonText=" + ((Object) str3) + ", continueEnabled=" + this.f63639d + ", items=" + this.f63640e + ")";
    }

    public C31407n(String str, String str2, String str3, boolean z11, ArrayList arrayList) {
        this.f63636a = str;
        this.f63637b = str2;
        this.f63638c = str3;
        this.f63639d = z11;
        this.f63640e = arrayList;
    }
}
