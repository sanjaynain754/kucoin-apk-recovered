package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31566D0;
import de.authada.library.api.unblock.Puk;
import de.authada.library.api.unblock.UnblockerCallback;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31553f extends AbstractC31555h {

    /* JADX INFO: renamed from: a */
    public final Puk f64073a;

    /* JADX INFO: renamed from: b */
    public final UnblockerCallback f64074b;

    /* JADX INFO: renamed from: c */
    public final Function1 f64075c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31553f)) {
            return false;
        }
        C31553f c31553f = (C31553f) obj;
        return Intrinsics.areEqual(this.f64073a, c31553f.f64073a) && Intrinsics.areEqual(this.f64074b, c31553f.f64074b) && Intrinsics.areEqual(this.f64075c, c31553f.f64075c);
    }

    public final int hashCode() {
        return this.f64075c.hashCode() + ((this.f64074b.hashCode() + (this.f64073a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PinUnblock(puk=" + this.f64073a + ", callback=" + this.f64074b + ", errorCallback=" + this.f64075c + ")";
    }

    public C31553f(Puk puk, C31566D0 c31566d0, Function1 function1) {
        this.f64073a = puk;
        this.f64074b = c31566d0;
        this.f64075c = function1;
    }
}
