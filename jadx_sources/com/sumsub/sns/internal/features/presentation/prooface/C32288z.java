package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.RectF;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32288z extends AbstractC31985B {

    /* JADX INFO: renamed from: a */
    public final RectF f65765a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65766b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32288z)) {
            return false;
        }
        C32288z c32288z = (C32288z) obj;
        return Intrinsics.areEqual(this.f65765a, c32288z.f65765a) && Intrinsics.areEqual(this.f65766b, c32288z.f65766b);
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.AbstractC31985B
    /* JADX INFO: renamed from: a */
    public final CharSequence mo70973a() {
        return this.f65766b;
    }

    public final int hashCode() {
        int iHashCode = this.f65765a.hashCode() * 31;
        CharSequence charSequence = this.f65766b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "NotInCapturingBox(faceRectangle=" + this.f65765a + ", hint=" + ((Object) this.f65766b) + ")";
    }

    public C32288z(RectF rectF, String str) {
        this.f65765a = rectF;
        this.f65766b = str;
    }
}
