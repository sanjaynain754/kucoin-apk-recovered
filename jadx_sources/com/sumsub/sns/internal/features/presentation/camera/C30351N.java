package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30351N implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final boolean f61032a;

    /* JADX INFO: renamed from: b */
    public final boolean f61033b;

    /* JADX INFO: renamed from: c */
    public final boolean f61034c;

    /* JADX INFO: renamed from: d */
    public final boolean f61035d;

    /* JADX INFO: renamed from: e */
    public final AbstractC28885f f61036e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30351N)) {
            return false;
        }
        C30351N c30351n = (C30351N) obj;
        return this.f61032a == c30351n.f61032a && this.f61033b == c30351n.f61033b && this.f61034c == c30351n.f61034c && this.f61035d == c30351n.f61035d && Intrinsics.areEqual(this.f61036e, c30351n.f61036e);
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f61035d, AbstractC27920h.m69001a(this.f61034c, AbstractC27920h.m69001a(this.f61033b, AbstractC27920h.m69001a(this.f61032a, Boolean.hashCode(true) * 31, 31), 31), 31), 31);
        AbstractC28885f abstractC28885f = this.f61036e;
        return iM69001a + (abstractC28885f == null ? 0 : abstractC28885f.hashCode());
    }

    public final String toString() {
        return "ViewState(showCamera=true, enableTakePicture=" + this.f61032a + ", showTakePicture=" + this.f61033b + ", showTakePictureProgress=" + this.f61034c + ", flash=" + this.f61035d + ", helperState=" + this.f61036e + ")";
    }

    public C30351N(boolean z11, boolean z12, boolean z13, boolean z14, AbstractC28885f abstractC28885f) {
        this.f61032a = z11;
        this.f61033b = z12;
        this.f61034c = z13;
        this.f61035d = z14;
        this.f61036e = abstractC28885f;
    }

    /* JADX INFO: renamed from: a */
    public static C30351N m70242a(C30351N c30351n, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC28885f abstractC28885f, int i11) {
        c30351n.getClass();
        if ((i11 & 2) != 0) {
            z11 = c30351n.f61032a;
        }
        boolean z15 = z11;
        if ((i11 & 4) != 0) {
            z12 = c30351n.f61033b;
        }
        boolean z16 = z12;
        if ((i11 & 8) != 0) {
            z13 = c30351n.f61034c;
        }
        boolean z17 = z13;
        if ((i11 & 16) != 0) {
            z14 = c30351n.f61035d;
        }
        boolean z18 = z14;
        if ((i11 & 32) != 0) {
            abstractC28885f = c30351n.f61036e;
        }
        return new C30351N(z15, z16, z17, z18, abstractC28885f);
    }
}
