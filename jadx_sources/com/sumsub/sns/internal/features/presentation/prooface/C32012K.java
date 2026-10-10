package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32012K extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final C29810M f65073a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65074b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC32009J f65075c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32012K)) {
            return false;
        }
        C32012K c32012k = (C32012K) obj;
        return Intrinsics.areEqual(this.f65073a, c32012k.f65073a) && Intrinsics.areEqual(this.f65074b, c32012k.f65074b) && Intrinsics.areEqual(this.f65075c, c32012k.f65075c);
    }

    public final int hashCode() {
        C29810M c29810m = this.f65073a;
        int iHashCode = (c29810m == null ? 0 : c29810m.hashCode()) * 31;
        CharSequence charSequence = this.f65074b;
        return this.f65075c.hashCode() + ((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        C29810M c29810m = this.f65073a;
        CharSequence charSequence = this.f65074b;
        return "SessionResult(session=" + c29810m + ", retryText=" + ((Object) charSequence) + ", content=" + this.f65075c + ")";
    }

    public C32012K(C29810M c29810m, CharSequence charSequence, InterfaceC32009J interfaceC32009J) {
        this.f65073a = c29810m;
        this.f65074b = charSequence;
        this.f65075c = interfaceC32009J;
    }
}
