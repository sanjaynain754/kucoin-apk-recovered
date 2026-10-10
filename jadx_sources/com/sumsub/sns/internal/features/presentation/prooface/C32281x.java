package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.RectF;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32281x extends AbstractC31985B {

    /* JADX INFO: renamed from: a */
    public final RectF f65753a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65754b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32281x)) {
            return false;
        }
        C32281x c32281x = (C32281x) obj;
        return Intrinsics.areEqual(this.f65753a, c32281x.f65753a) && Intrinsics.areEqual(this.f65754b, c32281x.f65754b);
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.AbstractC31985B
    /* JADX INFO: renamed from: a */
    public final CharSequence mo70973a() {
        return this.f65754b;
    }

    public final int hashCode() {
        int iHashCode = this.f65753a.hashCode() * 31;
        CharSequence charSequence = this.f65754b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "FaceRecognized(faceRectangle=" + this.f65753a + ", hint=" + ((Object) this.f65754b) + ")";
    }

    public C32281x(RectF rectF, String str) {
        this.f65753a = rectF;
        this.f65754b = str;
    }
}
