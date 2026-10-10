package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32240s implements InterfaceC32251x0 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f65691a;

    /* JADX INFO: renamed from: b */
    public final boolean f65692b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32240s)) {
            return false;
        }
        C32240s c32240s = (C32240s) obj;
        return Intrinsics.areEqual(this.f65691a, c32240s.f65691a) && this.f65692b == c32240s.f65692b;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f65691a;
        return Boolean.hashCode(this.f65692b) + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public final String toString() {
        return "Completed(blurredImage=" + this.f65691a + ", slowConnection=" + this.f65692b + ")";
    }

    public C32240s(Bitmap bitmap, boolean z11) {
        this.f65691a = bitmap;
        this.f65692b = z11;
    }
}
