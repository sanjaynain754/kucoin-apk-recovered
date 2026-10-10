package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.s1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30627s1 implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final boolean f61877a;

    /* JADX INFO: renamed from: b */
    public final C30622r1 f61878b;

    public C30627s1() {
        this.f61877a = false;
        this.f61878b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30627s1)) {
            return false;
        }
        C30627s1 c30627s1 = (C30627s1) obj;
        return this.f61877a == c30627s1.f61877a && Intrinsics.areEqual(this.f61878b, c30627s1.f61878b);
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f61877a, Boolean.hashCode(true) * 31, 31);
        C30622r1 c30622r1 = this.f61878b;
        return iM69001a + (c30622r1 == null ? 0 : c30622r1.hashCode());
    }

    public final String toString() {
        return "ViewState(showCamera=true, showTakePictureProgress=" + this.f61877a + ", upload=" + this.f61878b + ")";
    }

    /* JADX INFO: renamed from: a */
    public static C30627s1 m70414a(C30627s1 c30627s1, boolean z11, C30622r1 c30622r1, int i11) {
        c30627s1.getClass();
        if ((i11 & 2) != 0) {
            z11 = c30627s1.f61877a;
        }
        if ((i11 & 4) != 0) {
            c30622r1 = c30627s1.f61878b;
        }
        return new C30627s1(z11, c30622r1);
    }

    public C30627s1(boolean z11, C30622r1 c30622r1) {
        this.f61877a = z11;
        this.f61878b = c30622r1;
    }
}
